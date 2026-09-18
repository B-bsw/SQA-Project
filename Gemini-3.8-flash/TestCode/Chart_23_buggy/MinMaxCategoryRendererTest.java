package org.jfree.chart.renderer.category;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.Icon;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinMaxCategoryRendererTest {

    private MinMaxCategoryRenderer renderer;

    private static class TestRendererChangeListener implements RendererChangeListener {
        private int eventCount = 0;

        public void rendererChanged(RendererChangeEvent event) {
            this.eventCount++;
        }

        public int getEventCount() {
            return this.eventCount;
        }
    }

    private static class CustomTestIcon implements Icon {
        private int width;
        private int height;

        public CustomTestIcon(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public void paintIcon(Component c, Graphics g, int x, int y) {
            g.drawRect(x, y, this.width, this.height);
        }

        public int getIconWidth() {
            return this.width;
        }

        public int getIconHeight() {
            return this.height;
        }
    }

    @Before
    public void setUp() {
        this.renderer = new MinMaxCategoryRenderer();
    }

    @Test
    public void constructor_default_shouldInitializeDefaultValues() {
        Assert.assertFalse(this.renderer.isDrawLines());
        Assert.assertEquals(Color.black, this.renderer.getGroupPaint());
        Assert.assertEquals(new BasicStroke(1.0f), this.renderer.getGroupStroke());
        Assert.assertNotNull(this.renderer.getMinIcon());
        Assert.assertNotNull(this.renderer.getMaxIcon());
        Assert.assertNotNull(this.renderer.getObjectIcon());
    }

    @Test
    public void setDrawLines_givenDifferentValue_shouldUpdateFlagAndNotifyListeners() {
        TestRendererChangeListener listener = new TestRendererChangeListener();
        this.renderer.addChangeListener(listener);

        this.renderer.setDrawLines(true);

        Assert.assertTrue(this.renderer.isDrawLines());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setDrawLines_givenSameValue_shouldNotNotifyListeners() {
        TestRendererChangeListener listener = new TestRendererChangeListener();
        this.renderer.addChangeListener(listener);

        this.renderer.setDrawLines(false);

        Assert.assertFalse(this.renderer.isDrawLines());
        Assert.assertEquals(0, listener.getEventCount());
    }

    @Test
    public void setGroupPaint_givenValidPaint_shouldUpdatePaintAndNotifyListeners() {
        TestRendererChangeListener listener = new TestRendererChangeListener();
        this.renderer.addChangeListener(listener);

        Paint newPaint = Color.red;
        this.renderer.setGroupPaint(newPaint);

        Assert.assertEquals(newPaint, this.renderer.getGroupPaint());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGroupPaint_givenNullPaint_shouldThrowIllegalArgumentException() {
        this.renderer.setGroupPaint(null);
    }

    @Test
    public void setGroupStroke_givenValidStroke_shouldUpdateStrokeAndNotifyListeners() {
        TestRendererChangeListener listener = new TestRendererChangeListener();
        this.renderer.addChangeListener(listener);

        Stroke newStroke = new BasicStroke(2.5f);
        this.renderer.setGroupStroke(newStroke);

        Assert.assertEquals(newStroke, this.renderer.getGroupStroke());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGroupStroke_givenNullStroke_shouldThrowIllegalArgumentException() {
        this.renderer.setGroupStroke(null);
    }

    @Test
    public void setObjectIcon_givenValidIcon_shouldUpdateIconAndNotifyListeners() {
        TestRendererChangeListener listener = new TestRendererChangeListener();
        this.renderer.addChangeListener(listener);

        Icon customIcon = new CustomTestIcon(12, 12);
        this.renderer.setObjectIcon(customIcon);

        Assert.assertSame(customIcon, this.renderer.getObjectIcon());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setObjectIcon_givenNullIcon_shouldThrowIllegalArgumentException() {
        this.renderer.setObjectIcon(null);
    }

    @Test
    public void setMaxIcon_givenValidIcon_shouldUpdateIconAndNotifyListeners() {
        TestRendererChangeListener listener = new TestRendererChangeListener();
        this.renderer.addChangeListener(listener);

        Icon customIcon = new CustomTestIcon(14, 14);
        this.renderer.setMaxIcon(customIcon);

        Assert.assertSame(customIcon, this.renderer.getMaxIcon());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setMaxIcon_givenNullIcon_shouldThrowIllegalArgumentException() {
        this.renderer.setMaxIcon(null);
    }

    @Test
    public void setMinIcon_givenValidIcon_shouldUpdateIconAndNotifyListeners() {
        TestRendererChangeListener listener = new TestRendererChangeListener();
        this.renderer.addChangeListener(listener);

        Icon customIcon = new CustomTestIcon(16, 16);
        this.renderer.setMinIcon(customIcon);

        Assert.assertSame(customIcon, this.renderer.getMinIcon());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setMinIcon_givenNullIcon_shouldThrowIllegalArgumentException() {
        this.renderer.setMinIcon(null);
    }

    @Test
    public void defaultIcons_whenPainted_shouldExecuteWithoutException() {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();

        Icon minIcon = this.renderer.getMinIcon();
        Icon maxIcon = this.renderer.getMaxIcon();
        Icon objectIcon = this.renderer.getObjectIcon();

        Assert.assertTrue(minIcon.getIconWidth() >= 0);
        Assert.assertTrue(minIcon.getIconHeight() >= 0);
        Assert.assertTrue(maxIcon.getIconWidth() >= 0);
        Assert.assertTrue(maxIcon.getIconHeight() >= 0);
        Assert.assertTrue(objectIcon.getIconWidth() >= 0);
        Assert.assertTrue(objectIcon.getIconHeight() >= 0);

        minIcon.paintIcon(null, g2, 10, 10);
        maxIcon.paintIcon(null, g2, 20, 20);
        objectIcon.paintIcon(null, g2, 30, 30);

        g2.dispose();
    }

    @Test
    public void serialization_givenConfiguredRenderer_shouldRestoreStateCorrectly() throws Exception {
        this.renderer.setDrawLines(true);
        this.renderer.setGroupPaint(Color.blue);
        this.renderer.setGroupStroke(new BasicStroke(3.0f));

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(this.renderer);
        out.close();

        ByteArrayInputStream inBuffer = new ByteArrayInputStream(buffer.toByteArray());
        ObjectInputStream in = new ObjectInputStream(inBuffer);
        MinMaxCategoryRenderer restored = (MinMaxCategoryRenderer) in.readObject();
        in.close();

        Assert.assertEquals(this.renderer.isDrawLines(), restored.isDrawLines());
        Assert.assertEquals(this.renderer.getGroupPaint(), restored.getGroupPaint());
        Assert.assertEquals(this.renderer.getGroupStroke(), restored.getGroupStroke());
        Assert.assertNotNull(restored.getMinIcon());
        Assert.assertNotNull(restored.getMaxIcon());
        Assert.assertNotNull(restored.getObjectIcon());

        BufferedImage image = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        restored.getMinIcon().paintIcon(null, g2, 5, 5);
        restored.getMaxIcon().paintIcon(null, g2, 5, 5);
        restored.getObjectIcon().paintIcon(null, g2, 5, 5);
        g2.dispose();
    }

    @Test
    public void drawItem_givenNullValue_shouldNotDrawAndNotThrow() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(null, "Row1", "Col1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, this.renderer);

        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0.0, 0.0, 200.0, 200.0);
        CategoryItemRendererState state = new CategoryItemRendererState(new PlotRenderingInfo(new ChartRenderingInfo()));

        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);

        g2.dispose();
    }

    @Test
    public void drawItem_verticalOrientationSingleColumnMultiRow_shouldDrawMinMaxAndLines() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(new Double(10.0), "Row0", "Col0");
        dataset.addValue(new Double(5.0), "Row1", "Col0");
        dataset.addValue(new Double(20.0), "Row2", "Col0");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, this.renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);

        BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(10.0, 10.0, 280.0, 280.0);

        ChartRenderingInfo chartInfo = new ChartRenderingInfo();
        PlotRenderingInfo plotInfo = new PlotRenderingInfo(chartInfo);
        CategoryItemRendererState state = new CategoryItemRendererState(plotInfo);

        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 1, 0, 0);
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 2, 0, 0);

        Assert.assertNotNull(state.getEntityCollection());
        Assert.assertTrue(state.getEntityCollection().getEntityCount() > 0);

        g2.dispose();
    }

    @Test
    public void drawItem_horizontalOrientationSingleColumnMultiRow_shouldDrawMinMaxAndLines() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(new Double(10.0), "Row0", "Col0");
        dataset.addValue(new Double(5.0), "Row1", "Col0");
        dataset.addValue(new Double(20.0), "Row2", "Col0");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, this.renderer);
        plot.setOrientation(PlotOrientation.HORIZONTAL);

        BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(10.0, 10.0, 280.0, 280.0);

        ChartRenderingInfo chartInfo = new ChartRenderingInfo();
        PlotRenderingInfo plotInfo = new PlotRenderingInfo(chartInfo);
        CategoryItemRendererState state = new CategoryItemRendererState(plotInfo);

        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 1, 0, 0);
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 2, 0, 0);

        Assert.assertNotNull(state.getEntityCollection());
        Assert.assertTrue(state.getEntityCollection().getEntityCount() > 0);

        g2.dispose();
    }

    @Test
    public void drawItem_plotLinesTrueVertical_shouldDrawConnectingLines() {
        this.renderer.setDrawLines(true);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(new Double(10.0), "Row0", "Col0");
        dataset.addValue(new Double(15.0), "Row0", "Col1");
        dataset.addValue(new Double(20.0), "Row1", "Col0");
        dataset.addValue(new Double(25.0), "Row1", "Col1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, this.renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);

        BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(10.0, 10.0, 280.0, 280.0);
        CategoryItemRendererState state = new CategoryItemRendererState(new PlotRenderingInfo(new ChartRenderingInfo()));

        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 1, 0, 0);

        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 1, 0);
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 1, 1, 0);

        g2.dispose();
    }

    @Test
    public void drawItem_plotLinesTrueHorizontal_shouldDrawConnectingLines() {
        this.renderer.setDrawLines(true);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(new Double(10.0), "Row0", "Col0");
        dataset.addValue(new Double(15.0), "Row0", "Col1");
        dataset.addValue(new Double(20.0), "Row1", "Col0");
        dataset.addValue(new Double(25.0), "Row1", "Col1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, this.renderer);
        plot.setOrientation(PlotOrientation.HORIZONTAL);

        BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(10.0, 10.0, 280.0, 280.0);
        CategoryItemRendererState state = new CategoryItemRendererState(new PlotRenderingInfo(new ChartRenderingInfo()));

        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 1, 0, 0);

        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 1, 0);
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 1, 1, 0);

        g2.dispose();
    }

    @Test
    public void drawItem_plotLinesTrueWithPreviousValueNull_shouldNotDrawConnectingLine() {
        this.renderer.setDrawLines(true);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(null, "Row0", "Col0");
        dataset.addValue(new Double(15.0), "Row0", "Col1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, this.renderer);

        BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(10.0, 10.0, 280.0, 280.0);
        CategoryItemRendererState state = new CategoryItemRendererState(new PlotRenderingInfo(new ChartRenderingInfo()));

        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 1, 0);

        g2.dispose();
    }

    @Test
    public void drawItem_withNullEntityCollection_shouldNotThrowNullPointerException() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(new Double(10.0), "Row0", "Col0");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, this.renderer);

        BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(10.0, 10.0, 280.0, 280.0);

        CategoryItemRendererState state = new CategoryItemRendererState(null);

        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);

        g2.dispose();
    }
}