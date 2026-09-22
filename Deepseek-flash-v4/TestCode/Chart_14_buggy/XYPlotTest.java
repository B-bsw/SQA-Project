package org.jfree.chart.plot;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.RectangleEdge;
import java.awt.BasicStroke;
import java.awt.Paint;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.List;

public class XYPlotTest {

    private XYPlot plot;
    private XYSeriesCollection dataset;
    private XYSeries series1;
    private XYSeries series2;

    @Before
    public void setUp() {
        series1 = new XYSeries("S1");
        series1.add(1.0, 10.0);
        series1.add(2.0, 20.0);
        series2 = new XYSeries("S2");
        series2.add(1.0, 30.0);
        series2.add(2.0, 40.0);
        dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        plot = new XYPlot();
        plot.setDataset(dataset);
        plot.setRenderer(new XYLineAndShapeRenderer());
    }

    @After
    public void tearDown() {
        plot = null;
        dataset = null;
    }

    @Test
    public void testDefaultConstructor() {
        XYPlot p = new XYPlot();
        Assert.assertNotNull(p);
        Assert.assertEquals(0, p.getDatasetCount());
        Assert.assertEquals(0, p.getRendererCount());
        Assert.assertEquals(1, p.getDomainAxisCount());
        Assert.assertEquals(1, p.getRangeAxisCount());
        Assert.assertNull(p.getDomainAxis(0));
        Assert.assertNull(p.getRangeAxis(0));
        Assert.assertEquals("XY_Plot", p.getPlotType());
        Assert.assertEquals(PlotOrientation.VERTICAL, p.getOrientation());
    }

    @Test
    public void testConstructorWithNullArguments() {
        XYPlot p = new XYPlot(null, null, null, null);
        Assert.assertNotNull(p);
        Assert.assertEquals(0, p.getDatasetCount());
        Assert.assertEquals(0, p.getRendererCount());
    }

    @Test
    public void testConstructorWithAllArguments() {
        ValueAxis domainAxis = new NumberAxis("X");
        ValueAxis rangeAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new XYLineAndShapeRenderer();
        XYPlot p = new XYPlot(dataset, domainAxis, rangeAxis, renderer);
        Assert.assertNotNull(p);
        Assert.assertEquals(1, p.getDatasetCount());
        Assert.assertEquals(1, p.getRendererCount());
        Assert.assertSame(dataset, p.getDataset(0));
        Assert.assertSame(domainAxis, p.getDomainAxis());
        Assert.assertSame(rangeAxis, p.getRangeAxis());
        Assert.assertSame(renderer, p.getRenderer());
    }

    @Test
    public void testSetOrientation() {
        Assert.assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
        plot.setOrientation(null);
        Assert.assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test
    public void testSetAxisOffset() {
        Assert.assertNotNull(plot.getAxisOffset());
        RectangleInsets insets = new RectangleInsets(1, 2, 3, 4);
        plot.setAxisOffset(insets);
        Assert.assertSame(insets, plot.getAxisOffset());
        plot.setAxisOffset(null);
        Assert.assertSame(insets, plot.getAxisOffset());
    }

    @Test
    public void testSetDataset() {
        Assert.assertEquals(1, plot.getDatasetCount());
        XYSeriesCollection ds = new XYSeriesCollection();
        ds.addSeries(series1);
        plot.setDataset(ds);
        Assert.assertEquals(1, plot.getDatasetCount());
        Assert.assertSame(ds, plot.getDataset(0));

        plot.setDataset(1, new XYSeriesCollection());
        Assert.assertEquals(2, plot.getDatasetCount());
        Assert.assertNotNull(plot.getDataset(1));

        plot.setDataset(0, null);
        Assert.assertNull(plot.getDataset(0));
        Assert.assertNotNull(plot.getDataset(1));
    }

    @Test
    public void testSetRenderer() {
        XYItemRenderer r1 = new XYLineAndShapeRenderer();
        plot.setRenderer(r1);
        Assert.assertSame(r1, plot.getRenderer());

        XYItemRenderer r2 = new XYLineAndShapeRenderer();
        plot.setRenderer(1, r2);
        Assert.assertSame(r2, plot.getRenderer(1));
        Assert.assertEquals(2, plot.getRendererCount());

        plot.setRenderer(0, null);
        Assert.assertNull(plot.getRenderer(0));
    }

    @Test
    public void testGetDatasetCount() {
        Assert.assertEquals(1, plot.getDatasetCount());
        plot.setDataset(1, new XYSeriesCollection());
        Assert.assertEquals(2, plot.getDatasetCount());
        plot.setDataset(0, null);
        Assert.assertEquals(2, plot.getDatasetCount());
    }

    @Test
    public void testGetRendererCount() {
        Assert.assertEquals(1, plot.getRendererCount());
        plot.setRenderer(1, new XYLineAndShapeRenderer());
        Assert.assertEquals(2, plot.getRendererCount());
        plot.setRenderer(0, null);
        Assert.assertEquals(2, plot.getRendererCount());
    }

    @Test
    public void testGetDomainAxis() {
        Assert.assertNull(plot.getDomainAxis());
        ValueAxis axis = new NumberAxis("X");
        plot.setDomainAxis(axis);
        Assert.assertSame(axis, plot.getDomainAxis());
    }

    @Test
    public void testSetDomainAxis() {
        ValueAxis axis1 = new NumberAxis("X1");
        plot.setDomainAxis(axis1);
        Assert.assertSame(axis1, plot.getDomainAxis());
        Assert.assertEquals(1, plot.getDomainAxisCount());

        ValueAxis axis2 = new NumberAxis("X2");
        plot.setDomainAxis(1, axis2);
        Assert.assertSame(axis2, plot.getDomainAxis(1));
        Assert.assertEquals(2, plot.getDomainAxisCount());

        plot.setDomainAxis(0, null);
        Assert.assertNull(plot.getDomainAxis(0));
        Assert.assertNotNull(plot.getDomainAxis(1));
    }

    @Test
    public void testSetRangeAxis() {
        ValueAxis axis = new NumberAxis("Y");
        plot.setRangeAxis(axis);
        Assert.assertSame(axis, plot.getRangeAxis());
        Assert.assertEquals(1, plot.getRangeAxisCount());
    }

    @Test
    public void testSetDomainAxisLocation() {
        Assert.assertNotNull(plot.getDomainAxisLocation());
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        Assert.assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
        plot.setDomainAxisLocation(null);
        Assert.assertNotSame(null, plot.getDomainAxisLocation());
    }

    @Test
    public void testSetRangeAxisLocation() {
        Assert.assertNotNull(plot.getRangeAxisLocation());
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        Assert.assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getRangeAxisLocation());
        plot.setRangeAxisLocation(null);
        Assert.assertNotSame(null, plot.getRangeAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantPaintInvalidIndex() {
        plot.setQuadrantPaint(5, Color.RED);
    }

    @Test
    public void testSetQuadrantPaint() {
        plot.setQuadrantPaint(0, Color.RED);
        Assert.assertEquals(Color.RED, plot.getQuadrantPaint(0));
        plot.setQuadrantPaint(3, Color.BLUE);
        Assert.assertEquals(Color.BLUE, plot.getQuadrantPaint(3));
        plot.setQuadrantPaint(0, null);
        Assert.assertNull(plot.getQuadrantPaint(0));
    }

    @Test
    public void testGetLegendItems() {
        List<?> items = plot.getLegendItems();
        Assert.assertNotNull(items);
        Assert.assertEquals(2, items.size());
        Assert.assertNotNull(items.get(0));
        Assert.assertNotNull(items.get(1));
    }

    @Test
    public void testGetLegendItemsWithNullRenderer() {
        plot.setRenderer(0, null);
        List<?> items = plot.getLegendItems();
        Assert.assertNotNull(items);
        Assert.assertEquals(0, items.size());
    }

    @Test
    public void testAddAnnotation() {
        Assert.assertEquals(0, plot.getAnnotations().size());
        plot.addAnnotation(new org.jfree.chart.annotations.XYTextAnnotation("A"));
        Assert.assertEquals(1, plot.getAnnotations().size());
        plot.addAnnotation(null);
        Assert.assertEquals(1, plot.getAnnotations().size());
    }

    @Test
    public void testRemoveAnnotation() {
        org.jfree.chart.annotations.XYTextAnnotation a =
                new org.jfree.chart.annotations.XYTextAnnotation("A");
        plot.addAnnotation(a);
        Assert.assertTrue(plot.removeAnnotation(a));
        Assert.assertEquals(0, plot.getAnnotations().size());
        Assert.assertFalse(plot.removeAnnotation(a));
        Assert.assertFalse(plot.removeAnnotation(null));
    }

    @Test
    public void testIsDomainGridlinesVisible() {
        Assert.assertFalse(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(true);
        Assert.assertTrue(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(false);
        Assert.assertFalse(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testSetDomainGridlineStroke() {
        BasicStroke stroke = new BasicStroke(2.0f);
        plot.setDomainGridlineStroke(stroke);
        Assert.assertSame(stroke, plot.getDomainGridlineStroke());
        plot.setDomainGridlineStroke(null);
        Assert.assertNotSame(null, plot.getDomainGridlineStroke());
    }

    @Test
    public void testSetDomainGridlinePaint() {
        plot.setDomainGridlinePaint(Color.RED);
        Assert.assertEquals(Color.RED, plot.getDomainGridlinePaint());
        plot.setDomainGridlinePaint(null);
        Assert.assertNotSame(null, plot.getDomainGridlinePaint());
    }

    @Test
    public void testIsRangeGridlinesVisible() {
        Assert.assertFalse(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(true);
        Assert.assertTrue(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(false);
        Assert.assertFalse(plot.isRangeGridlinesVisible());
    }

    @Test
    public void testSetRangeGridlineStroke() {
        BasicStroke stroke = new BasicStroke(2.0f);
        plot.setRangeGridlineStroke(stroke);
        Assert.assertSame(stroke, plot.getRangeGridlineStroke());
        plot.setRangeGridlineStroke(null);
        Assert.assertNotSame(null, plot.getRangeGridlineStroke());
    }

    @Test
    public void testSetRangeGridlinePaint() {
        plot.setRangeGridlinePaint(Color.RED);
        Assert.assertEquals(Color.RED, plot.getRangeGridlinePaint());
        plot.setRangeGridlinePaint(null);
        Assert.assertNotSame(null, plot.getRangeGridlinePaint());
    }

    @Test
    public void testDomainCrosshair() {
        Assert.assertFalse(plot.isDomainCrosshairVisible());
        plot.setDomainCrosshairVisible(true);
        Assert.assertTrue(plot.isDomainCrosshairVisible());
        plot.setDomainCrosshairVisible(false);
        Assert.assertFalse(plot.isDomainCrosshairVisible());
        Assert.assertFalse(plot.isDomainCrosshairLockedOnData());
        plot.setDomainCrosshairLockedOnData(true);
        Assert.assertTrue(plot.isDomainCrosshairLockedOnData());
        plot.setDomainCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isDomainCrosshairLockedOnData());
        Assert.assertEquals(0.0, plot.getDomainCrosshairValue(), 0.0);
        plot.setDomainCrosshairValue(10.5);
        Assert.assertEquals(10.5, plot.getDomainCrosshairValue(), 0.0);
        plot.setDomainCrosshairValue(20.5, false);
        Assert.assertEquals(20.5, plot.getDomainCrosshairValue(), 0.0);
        Assert.assertNotNull(plot.getDomainCrosshairStroke());
        Assert.assertNotNull(plot.getDomainCrosshairPaint());
        Assert.assertNotNull(plot.getDomainCrosshairPaint());
    }

    @Test
    public void testRangeCrosshair() {
        Assert.assertFalse(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairVisible(true);
        Assert.assertTrue(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairVisible(false);
        Assert.assertFalse(plot.isRangeCrosshairVisible());
        Assert.assertFalse(plot.isRangeCrosshairLockedOnData());
        plot.setRangeCrosshairLockedOnData(true);
        Assert.assertTrue(plot.isRangeCrosshairLockedOnData());
        plot.setRangeCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isRangeCrosshairLockedOnData());
        Assert.assertEquals(0.0, plot.getRangeCrosshairValue(), 0.0);
        plot.setRangeCrosshairValue(10.5);
        Assert.assertEquals(10.5, plot.getRangeCrosshairValue(), 0.0);
        plot.setRangeCrosshairValue(20.5, false);
        Assert.assertEquals(20.5, plot.getRangeCrosshairValue(), 0.0);
        Assert.assertNotNull(plot.getRangeCrosshairStroke());
        Assert.assertNotNull(plot.getRangeCrosshairPaint());
        Assert.assertNotNull(plot.getRangeCrosshairPaint());
    }

    @Test
    public void testFixedAxisSpace() {
        Assert.assertNull(plot.getFixedDomainAxisSpace());
        org.jfree.chart.axis.AxisSpace space = new org.jfree.chart.axis.AxisSpace();
        plot.setFixedDomainAxisSpace(space);
        Assert.assertSame(space, plot.getFixedDomainAxisSpace());
        plot.setFixedDomainAxisSpace(null);
        Assert.assertNull(plot.getFixedDomainAxisSpace());

        Assert.assertNull(plot.getFixedRangeAxisSpace());
        org.jfree.chart.axis.AxisSpace rspace = new org.jfree.chart.axis.AxisSpace();
        plot.setFixedRangeAxisSpace(rspace);
        Assert.assertSame(rspace, plot.getFixedRangeAxisSpace());
        plot.setFixedRangeAxisSpace(null);
        Assert.assertNull(plot.getFixedRangeAxisSpace());
    }

    @Test
    public void testQuadrantOrigin() {
        Assert.assertNotNull(plot.getQuadrantOrigin());
        plot.setQuadrantOrigin(new Point2D.Double(2.0, 3.0));
        Assert.assertEquals(new Point2D.Double(2.0, 3.0), plot.getQuadrantOrigin());
        plot.setQuadrantOrigin(null);
        Assert.assertNotNull(plot.getQuadrantOrigin());
    }

    @Test
    public void testEquals() {
        Assert.assertFalse(plot.equals(null));
        Assert.assertTrue(plot.equals(plot));
        XYPlot p2 = new XYPlot();
        p2.setDataset(dataset);
        p2.setRenderer(new XYLineAndShapeRenderer());
        Assert.assertFalse(plot.equals(p2));
        XYPlot p3 = new XYPlot(dataset, new NumberAxis("X"), new NumberAxis("Y"),
                new XYLineAndShapeRenderer());
        Assert.assertFalse(plot.equals(p3));
    }

    @Test
    public void testClone() {
        try {
            XYPlot p2 = (XYPlot) plot.clone();
            Assert.assertNotSame(plot, p2);
            Assert.assertEquals(plot.getDatasetCount(), p2.getDatasetCount());
            Assert.assertEquals(plot.getRendererCount(), p2.getRendererCount());
        } catch (CloneNotSupportedException e) {
            Assert.fail("CloneNotSupportedException: " + e.getMessage());
        }
    }

    @Test
    public void testSetDomainCrosshairPaint() {
        plot.setDomainCrosshairPaint(Color.RED);
        Assert.assertEquals(Color.RED, plot.getDomainCrosshairPaint());
        plot.setDomainCrosshairPaint(null);
        Assert.assertNotNull(plot.getDomainCrosshairPaint());
    }

    @Test
    public void testSetRangeCrosshairPaint() {
        plot.setRangeCrosshairPaint(Color.RED);
        Assert.assertEquals(Color.RED, plot.getRangeCrosshairPaint());
        plot.setRangeCrosshairPaint(null);
        Assert.assertNotNull(plot.getRangeCrosshairPaint());
    }

    @Test
    public void testGetRangeAxisEdge() {
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        Assert.assertEquals(RectangleEdge.LEFT, plot.getRangeAxisEdge());
        plot.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT);
        Assert.assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge());
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        Assert.assertEquals(RectangleEdge.BOTTOM, plot.getRangeAxisEdge());
    }
}