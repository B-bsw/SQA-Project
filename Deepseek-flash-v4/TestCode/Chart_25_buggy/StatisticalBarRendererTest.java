package org.jfree.chart.renderer.category;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.RendererState;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.statistics.StatisticalCategoryDataset;

public class StatisticalBarRendererTest {

    private StatisticalBarRenderer renderer;

    @Before
    public void setUp() {
        renderer = new StatisticalBarRenderer();
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(Color.gray, renderer.getErrorIndicatorPaint());
        assertNotNull(renderer.getErrorIndicatorStroke());
        assertEquals(new BasicStroke(0.5f), renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testGetSetErrorIndicatorPaint() {
        Paint paint = Color.RED;
        renderer.setErrorIndicatorPaint(paint);
        assertEquals(paint, renderer.getErrorIndicatorPaint());
        renderer.setErrorIndicatorPaint(null);
        assertNull(renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testGetSetErrorIndicatorStroke() {
        Stroke stroke = new BasicStroke(2.0f);
        renderer.setErrorIndicatorStroke(stroke);
        assertEquals(stroke, renderer.getErrorIndicatorStroke());
        renderer.setErrorIndicatorStroke(null);
        assertNull(renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testDrawItemWithNonStatisticalDataset() {
        Graphics2D g2 = new java.awt.image.BufferedImage(100, 100, java.awt.image.BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState();
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 100, 100);
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domainAxis = new CategoryAxis("X");
        ValueAxis rangeAxis = new org.jfree.chart.axis.NumberAxis("Y");
        CategoryDataset dataset = new org.jfree.data.category.DefaultCategoryDataset();
        try {
            renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Requires StatisticalCategoryDataset.", e.getMessage());
        }
    }

    @Test
    public void testEquals() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = new StatisticalBarRenderer();
        assertEquals(r1, r2);
        r1.setErrorIndicatorPaint(Color.BLUE);
        assertNotEquals(r1, r2);
        r2.setErrorIndicatorPaint(Color.BLUE);
        assertEquals(r1, r2);
        r1.setErrorIndicatorStroke(new BasicStroke(1.0f));
        assertNotEquals(r1, r2);
        r2.setErrorIndicatorStroke(new BasicStroke(1.0f));
        assertEquals(r1, r2);
        assertNotEquals(r1, null);
        assertNotEquals(r1, new Object());
        assertEquals(r1, r1);
    }

    @Test
    public void testDrawItemVerticalWithValidData() {
        Graphics2D g2 = new java.awt.image.BufferedImage(200, 200, java.awt.image.BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState();
        Rectangle2D dataArea = new Rectangle2D.Double(20, 20, 150, 150);
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = new CategoryAxis("X");
        ValueAxis rangeAxis = new org.jfree.chart.axis.NumberAxis("Y");
        DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset();
        dataset.add(10.0, 2.0, "Series1", "Category1");
        renderer.setItemMargin(0.1);
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        // No exception means success
    }

    @Test
    public void testDrawItemHorizontalWithValidData() {
        Graphics2D g2 = new java.awt.image.BufferedImage(200, 200, java.awt.image.BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState();
        Rectangle2D dataArea = new Rectangle2D.Double(20, 20, 150, 150);
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        CategoryAxis domainAxis = new CategoryAxis("X");
        ValueAxis rangeAxis = new org.jfree.chart.axis.NumberAxis("Y");
        DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset();
        dataset.add(10.0, 2.0, "Series1", "Category1");
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        // No exception means success
    }

    @Test
    public void testDrawItemWithMultipleSeries() {
        Graphics2D g2 = new java.awt.image.BufferedImage(200, 200, java.awt.image.BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState();
        Rectangle2D dataArea = new Rectangle2D.Double(20, 20, 150, 150);
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = new CategoryAxis("X");
        ValueAxis rangeAxis = new org.jfree.chart.axis.NumberAxis("Y");
        DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset();
        dataset.add(10.0, 2.0, "Series1", "Category1");
        dataset.add(12.0, 3.0, "Series2", "Category1");
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 1, 0, 0);
        // No exception means success
    }

    @Test
    public void testDrawItemWithNullErrorIndicator() {
        Graphics2D g2 = new java.awt.image.BufferedImage(200, 200, java.awt.image.BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState();
        Rectangle2D dataArea = new Rectangle2D.Double(20, 20, 150, 150);
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = new CategoryAxis("X");
        ValueAxis rangeAxis = new org.jfree.chart.axis.NumberAxis("Y");
        DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset();
        dataset.add(10.0, 2.0, "Series1", "Category1");
        renderer.setErrorIndicatorPaint(null);
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        // No exception means success
    }

    @Test
    public void testDrawItemWithNullMeanValue() {
        Graphics2D g2 = new java.awt.image.BufferedImage(200, 200, java.awt.image.BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState();
        Rectangle2D dataArea = new Rectangle2D.Double(20, 20, 150, 150);
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = new CategoryAxis("X");
        ValueAxis rangeAxis = new org.jfree.chart.axis.NumberAxis("Y");
        DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset();
        dataset.add(null, 2.0, "Series1", "Category1");
        try {
            renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testDrawItemWithClipping() {
        Graphics2D g2 = new java.awt.image.BufferedImage(200, 200, java.awt.image.BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState();
        Rectangle2D dataArea = new Rectangle2D.Double(20, 20, 150, 150);
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = new CategoryAxis("X");
        org.jfree.chart.axis.NumberAxis rangeAxis = new org.jfree.chart.axis.NumberAxis("Y");
        rangeAxis.setRange(-5.0, 5.0);
        DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset();
        dataset.add(10.0, 2.0, "Series1", "Category1");
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        // No exception means success
    }

    @Test
    public void testSerialization() throws Exception {
        renderer.setErrorIndicatorPaint(Color.RED);
        renderer.setErrorIndicatorStroke(new BasicStroke(2.0f));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(renderer);
        oos.flush();
        oos.close();
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        StatisticalBarRenderer deserialized = (StatisticalBarRenderer) ois.readObject();
        ois.close();
        assertEquals(renderer, deserialized);
    }
}