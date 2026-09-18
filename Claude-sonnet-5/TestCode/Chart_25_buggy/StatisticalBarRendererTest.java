package org.jfree.chart.renderer.category;

import static org.junit.Assert.*;

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

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.statistics.StatisticalCategoryDataset;
import org.junit.Before;
import org.junit.Test;

public class StatisticalBarRendererTest {

    private StatisticalBarRenderer renderer;

    @Before
    public void setUp() {
        renderer = new StatisticalBarRenderer();
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(Color.gray, renderer.getErrorIndicatorPaint());
        assertEquals(new BasicStroke(0.5f), renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testGetSetErrorIndicatorPaint() {
        renderer.setErrorIndicatorPaint(Color.red);
        assertEquals(Color.red, renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testGetSetErrorIndicatorStroke() {
        Stroke stroke = new BasicStroke(2.0f);
        renderer.setErrorIndicatorStroke(stroke);
        assertEquals(stroke, renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testSetErrorIndicatorPaintNull() {
        renderer.setErrorIndicatorPaint(null);
        assertNull(renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testSetErrorIndicatorStrokeNull() {
        renderer.setErrorIndicatorStroke(null);
        assertNull(renderer.getErrorIndicatorStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDrawItemWithNonStatisticalDataset() {
        CategoryDataset dataset = new DefaultCategoryDataset();
        BufferedImage img = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = new CategoryAxis("Category");
        ValueAxis rangeAxis = new NumberAxis("Value");
        CategoryItemRendererState state = new CategoryItemRendererState(null);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
    }

    private DefaultStatisticalCategoryDataset createStatDataset() {
        DefaultStatisticalCategoryDataset dataset
                = new DefaultStatisticalCategoryDataset();
        dataset.add(10.0, 2.0, "Series1", "Category1");
        dataset.add(20.0, 3.0, "Series1", "Category2");
        dataset.add(-5.0, 1.0, "Series2", "Category1");
        dataset.add(15.0, 2.5, "Series2", "Category2");
        return dataset;
    }

    private CategoryPlot createPlot(PlotOrientation orientation) {
        DefaultStatisticalCategoryDataset dataset = createStatDataset();
        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                renderer);
        plot.setOrientation(orientation);
        return plot;
    }

    @Test
    public void testDrawItemVerticalOrientation() {
        StatisticalCategoryDataset dataset = createStatDataset();
        BufferedImage img = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = plot.getDomainAxis();
        ValueAxis rangeAxis = plot.getRangeAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea,
                plot, 0, null);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        // no exception means success; verify basic state
        assertNotNull(state);
    }

    @Test
    public void testDrawItemHorizontalOrientation() {
        StatisticalCategoryDataset dataset = createStatDataset();
        BufferedImage img = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.HORIZONTAL);
        CategoryAxis domainAxis = plot.getDomainAxis();
        ValueAxis rangeAxis = plot.getRangeAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea,
                plot, 0, null);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        assertNotNull(state);
    }

    @Test
    public void testDrawVerticalItemMultipleSeries() {
        StatisticalCategoryDataset dataset = createStatDataset();
        BufferedImage img = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = plot.getDomainAxis();
        ValueAxis rangeAxis = plot.getRangeAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea,
                plot, 0, null);

        // row=1 triggers seriesCount > 1 branch
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 1, 1, 0);
        assertNotNull(state);
    }

    @Test
    public void testDrawHorizontalItemMultipleSeries() {
        StatisticalCategoryDataset dataset = createStatDataset();
        BufferedImage img = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.HORIZONTAL);
        CategoryAxis domainAxis = plot.getDomainAxis();
        ValueAxis rangeAxis = plot.getRangeAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea,
                plot, 0, null);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 1, 1, 0);
        assertNotNull(state);
    }

    @Test
    public void testDrawVerticalItemUpperClipNegative() {
        StatisticalCategoryDataset dataset = createStatDataset();
        BufferedImage img = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = plot.getDomainAxis();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setRange(-30.0, -1.0);
        renderer.setIncludeBaseInRange(false);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea,
                plot, 0, null);

        // Series2, Category1 has value -5.0, uclip should be <= 0
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 1, 0, 0);
        assertNotNull(state);
    }

    @Test
    public void testDrawVerticalItemValueAboveUpperClipReturnsEarly() {
        StatisticalCategoryDataset dataset = createStatDataset();
        BufferedImage img = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = plot.getDomainAxis();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setRange(-30.0, -1.0);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea,
                plot, 0, null);

        // Series1, Category1 value=10.0, uclip negative and value>=uclip -> return
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        assertNotNull(state);
    }

    @Test
    public void testDrawVerticalItemLowerClipPositive() {
        StatisticalCategoryDataset dataset = createStatDataset();
        BufferedImage img = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = plot.getDomainAxis();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setRange(1.0, 30.0);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea,
                plot, 0, null);

        // Series1 Category1 value=10.0 lclip positive, value>lclip, base=lclip
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        assertNotNull(state);
    }

    @Test
    public void testDrawVerticalItemLowerClipPositiveValueBelowReturnsEarly() {
        StatisticalCategoryDataset dataset = createStatDataset();
        BufferedImage img = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = plot.getDomainAxis();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setRange(1.0, 30.0);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea,
                plot, 0, null);

        // Series2 Category1 value=-5.0, lclip=1.0 positive, value<=lclip -> return
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 1, 0, 0);
        assertNotNull(state);
    }

    @Test
    public void testDrawVerticalItemValueAboveUpperClipPositive() {
        StatisticalCategoryDataset dataset = createStatDataset();
        BufferedImage img = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = plot.getDomainAxis();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setRange(1.0, 15.0);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea,
                plot, 0, null);

        // Series1 Category2 value=20.0, lclip=1.0>0, value>=uclip(15.0) -> clip to uclip
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 1, 0);
        assertNotNull(state);
    }

    @Test
    public void testDrawHorizontalItemLowerClipPositive() {
        StatisticalCategoryDataset dataset = createStatDataset();
        BufferedImage img = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.HORIZONTAL);
        CategoryAxis domainAxis = plot.getDomainAxis();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setRange(1.0, 30.0);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea,
                plot, 0, null);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        assertNotNull(state);
    }

    @Test
    public void testDrawItemWithBarOutlineEnabled() {
        StatisticalCategoryDataset dataset = createStatDataset();
        BufferedImage img = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = plot.getDomainAxis();
        ValueAxis rangeAxis = plot.getRangeAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 400, 300);

        renderer.setDrawBarOutline(true);
        renderer.setItemMargin(0.2);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea,
                plot, 0, null);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        assertNotNull(state);
    }

    @Test
    public void testDrawItemWithNullErrorIndicatorStrokeAndPaint() {
        renderer.setErrorIndicatorStroke(null);
        renderer.setErrorIndicatorPaint(null);

        StatisticalCategoryDataset dataset = createStatDataset();
        BufferedImage img = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = plot.getDomainAxis();
        ValueAxis rangeAxis = plot.getRangeAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea,
                plot, 0, null);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        assertNotNull(state);
    }

    @Test
    public void testEqualsSameInstance() {
        assertTrue(renderer.equals(renderer));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(renderer.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(renderer.equals("not a renderer"));
    }

    @Test
    public void testEqualsEqualObjects() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = new StatisticalBarRenderer();
        assertTrue(r1.equals(r2));
        assertTrue(r2.equals(r1));
    }

    @Test
    public void testEqualsDifferentErrorIndicatorPaint() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = new StatisticalBarRenderer();
        r2.setErrorIndicatorPaint(Color.blue);
        assertFalse(r1.equals(r2));
    }

    @Test
    public void testEqualsSuperNotEqual() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = new StatisticalBarRenderer();
        r2.setItemMargin(0.5);
        assertFalse(r1.equals(r2));
    }

    @Test
    public void testSerialization() throws Exception {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        r1.setErrorIndicatorPaint(Color.red);
        r1.setErrorIndicatorStroke(new BasicStroke(3.0f));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(r1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(
                new ByteArrayInputStream(baos.toByteArray()));
        StatisticalBarRenderer r2 = (StatisticalBarRenderer) ois.readObject();
        ois.close();

        assertEquals(r1.getErrorIndicatorPaint(), r2.getErrorIndicatorPaint());
        assertEquals(r1.getErrorIndicatorStroke(), r2.getErrorIndicatorStroke());
        assertEquals(r1, r2);
    }

    @Test
    public void testDrawVerticalItemBarWidthSmallNoOutline() {
        // ensures branch where barWidth <= 3 skipping outline drawing
        StatisticalCategoryDataset dataset = createStatDataset();
        BufferedImage img = new BufferedImage(5, 5, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        CategoryPlot plot = createPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = plot.getDomainAxis();
        ValueAxis rangeAxis = plot.getRangeAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 5, 5);

        renderer.setDrawBarOutline(true);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea,
                plot, 0, null);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        assertNotNull(state);
    }
}