package org.jfree.chart.renderer.category;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.statistics.StatisticalCategoryDataset;
import org.junit.Assert;
import org.junit.Test;

public class StatisticalBarRendererTest {

    private static class TestRendererChangeListener implements RendererChangeListener {
        private int eventCount = 0;
        private RendererChangeEvent lastEvent = null;

        public void rendererChanged(RendererChangeEvent event) {
            this.eventCount++;
            this.lastEvent = event;
        }

        public int getEventCount() {
            return this.eventCount;
        }

        public RendererChangeEvent getLastEvent() {
            return this.lastEvent;
        }
    }

    @Test
    public void testConstructor_defaultValues_shouldInitializeDefaults() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();

        Assert.assertEquals(Color.gray, renderer.getErrorIndicatorPaint());
        Stroke stroke = renderer.getErrorIndicatorStroke();
        Assert.assertTrue(stroke instanceof BasicStroke);
        BasicStroke bs = (BasicStroke) stroke;
        Assert.assertEquals(0.5f, bs.getLineWidth(), 0.001f);
    }

    @Test
    public void testSetErrorIndicatorPaint_givenNewPaint_shouldUpdateAndNotifyListener() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        Paint newPaint = Color.red;
        renderer.setErrorIndicatorPaint(newPaint);

        Assert.assertEquals(newPaint, renderer.getErrorIndicatorPaint());
        Assert.assertEquals(1, listener.getEventCount());
        Assert.assertSame(renderer, listener.getLastEvent().getRenderer());

        renderer.setErrorIndicatorPaint(null);
        Assert.assertNull(renderer.getErrorIndicatorPaint());
        Assert.assertEquals(2, listener.getEventCount());
    }

    @Test
    public void testSetErrorIndicatorStroke_givenNewStroke_shouldUpdateAndNotifyListener() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        Stroke newStroke = new BasicStroke(2.0f);
        renderer.setErrorIndicatorStroke(newStroke);

        Assert.assertEquals(newStroke, renderer.getErrorIndicatorStroke());
        Assert.assertEquals(1, listener.getEventCount());
        Assert.assertSame(renderer, listener.getLastEvent().getRenderer());

        renderer.setErrorIndicatorStroke(null);
        Assert.assertNull(renderer.getErrorIndicatorStroke());
        Assert.assertEquals(2, listener.getEventCount());
    }

    @Test
    public void testEquals_givenVariousObjects_shouldFollowEqualityContract() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = new StatisticalBarRenderer();

        Assert.assertTrue(r1.equals(r1));
        Assert.assertFalse(r1.equals(null));
        Assert.assertFalse(r1.equals("Not a StatisticalBarRenderer"));
        Assert.assertTrue(r1.equals(r2));
        Assert.assertTrue(r2.equals(r1));

        r1.setErrorIndicatorPaint(Color.blue);
        Assert.assertFalse(r1.equals(r2));
        r2.setErrorIndicatorPaint(Color.blue);
        Assert.assertTrue(r1.equals(r2));

        r1.setErrorIndicatorPaint(null);
        Assert.assertFalse(r1.equals(r2));
        r2.setErrorIndicatorPaint(null);
        Assert.assertTrue(r1.equals(r2));

        r1.setItemMargin(0.15);
        Assert.assertFalse(r1.equals(r2));
    }

    @Test
    public void testClone_givenInstance_shouldCreateIndependentClone() throws CloneNotSupportedException {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        r1.setErrorIndicatorPaint(Color.yellow);
        r1.setErrorIndicatorStroke(new BasicStroke(1.5f));

        StatisticalBarRenderer r2 = (StatisticalBarRenderer) r1.clone();

        Assert.assertNotSame(r1, r2);
        Assert.assertSame(r1.getClass(), r2.getClass());
        Assert.assertTrue(r1.equals(r2));

        r2.setErrorIndicatorPaint(Color.magenta);
        Assert.assertFalse(r1.equals(r2));
    }

    @Test
    public void testSerialization_roundTrip_shouldPreserveState() throws Exception {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        r1.setErrorIndicatorPaint(Color.cyan);
        r1.setErrorIndicatorStroke(new BasicStroke(2.5f));

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(r1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        StatisticalBarRenderer r2 = (StatisticalBarRenderer) in.readObject();
        in.close();

        Assert.assertTrue(r1.equals(r2));
        Assert.assertEquals(r1.getErrorIndicatorPaint(), r2.getErrorIndicatorPaint());
        Stroke s1 = r1.getErrorIndicatorStroke();
        Stroke s2 = r2.getErrorIndicatorStroke();
        Assert.assertTrue(s1 instanceof BasicStroke);
        Assert.assertTrue(s2 instanceof BasicStroke);
        Assert.assertEquals(((BasicStroke) s1).getLineWidth(), ((BasicStroke) s2).getLineWidth(), 0.001f);
    }

    @Test
    public void testDrawItem_invalidDatasetType_shouldThrowIllegalArgumentException() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage image = new BufferedImage(300, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState(null);
        Rectangle2D dataArea = new Rectangle2D.Double(0.0, 0.0, 300.0, 200.0);
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domainAxis = new CategoryAxis("Category");
        ValueAxis rangeAxis = new NumberAxis("Value");

        CategoryDataset invalidDataset = (CategoryDataset) Proxy.newProxyInstance(
                CategoryDataset.class.getClassLoader(),
                new Class[] { CategoryDataset.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        return null;
                    }
                }
        );

        try {
            renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, invalidDataset, 0, 0, 0);
            Assert.fail("Should have thrown IllegalArgumentException when dataset is not StatisticalCategoryDataset");
        }
        catch (IllegalArgumentException ex) {
            Assert.assertEquals("Requires StatisticalCategoryDataset.", ex.getMessage());
        }
        finally {
            g2.dispose();
        }
    }

    @Test
    public void testDrawItem_verticalOrientationSingleSeries_shouldRenderCorrectly() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setDrawBarOutline(true);

        DefaultStatisticalCategoryDataset dataset = new Default