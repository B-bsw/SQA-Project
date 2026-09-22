package org.jfree.chart.plot;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.SeriesRenderingOrder;
import org.jfree.chart.util.Layer;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Point2D;

public class XYPlotTest {

    private XYPlot plot;

    @Before
    public void setUp() {
        plot = new XYPlot();
    }

    @After
    public void tearDown() {
        plot = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNull() {
        plot.setOrientation(null);
    }

    @Test
    public void testSetOrientationValid() {
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test
    public void testSetAxisOffsetNull() {
        plot.setAxisOffset(null);
        // Verify no exception and default offset not null
        Assert.assertNotNull(plot.getAxisOffset());
    }

    @Test
    public void testGetPlotType() {
        Assert.assertNotNull(plot.getPlotType());
        Assert.assertEquals("XY Plot", plot.getPlotType());
    }

    @Test
    public void testGetDomainAxisDefault() {
        Assert.assertNull(plot.getDomainAxis());
    }

    @Test
    public void testSetDomainAxisValid() {
        ValueAxis axis = new NumberAxis("X");
        plot.setDomainAxis(axis);
        Assert.assertSame(axis, plot.getDomainAxis());
    }

    @Test
    public void testSetRangeAxisValid() {
        ValueAxis axis = new NumberAxis("Y");
        plot.setRangeAxis(axis);
        Assert.assertSame(axis, plot.getRangeAxis());
    }

    @Test
    public void testGetDatasetDefault() {
        Assert.assertNull(plot.getDataset());
    }

    @Test
    public void testSetDatasetValid() {
        XYSeries series = new XYSeries("Test");
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        plot.setDataset(dataset);
        Assert.assertSame(dataset, plot.getDataset());
    }

    @Test
    public void testSetDatasetNull() {
        plot.setDataset((XYDataset) null);
        Assert.assertNull(plot.getDataset());
    }

    @Test
    public void testGetRendererDefault() {
        Assert.assertNull(plot.getRenderer());
    }

    @Test
    public void testSetRendererValid() {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(renderer);
        Assert.assertSame(renderer, plot.getRenderer());
    }

    @Test
    public void testSetRendererNull() {
        plot.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) null);
        Assert.assertNull(plot.getRenderer());
    }

    @Test
    public void testGetDatasetCount() {
        Assert.assertEquals(0, plot.getDatasetCount());
    }

    @Test
    public void testGetRendererCount() {
        Assert.assertEquals(0, plot.getRendererCount());
    }

    @Test
    public void testGetWeightDefault() {
        Assert.assertEquals(0, plot.getWeight());
    }

    @Test
    public void testSetWeight() {
        plot.setWeight(5);
        Assert.assertEquals(5, plot.getWeight());
    }

    @Test
    public void testIsDomainGridlinesVisibleDefault() {
        Assert.assertTrue(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testSetDomainGridlinesVisible() {
        plot.setDomainGridlinesVisible(false);
        Assert.assertFalse(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testIsRangeGridlinesVisibleDefault() {
        Assert.assertTrue(plot.isRangeGridlinesVisible());
    }

    @Test
    public void testSetRangeGridlinesVisible() {
        plot.setRangeGridlinesVisible(false);
        Assert.assertFalse(plot.isRangeGridlinesVisible());
    }

    @Test
    public void testGetDomainGridlineStrokeNotNull() {
        Assert.assertNotNull(plot.getDomainGridlineStroke());
    }

    @Test
    public void testGetDomainGridlinePaintNotNull() {
        Assert.assertNotNull(plot.getDomainGridlinePaint());
    }

    @Test
    public void testGetRangeGridlinePaintNotNull() {
        Assert.assertNotNull(plot.getRangeGridlinePaint());
    }

    @Test
    public void testGetRangeGridlineStrokeNotNull() {
        Assert.assertNotNull(plot.getRangeGridlineStroke());
    }

    @Test
    public void testIsDomainMinorGridlinesVisibleDefault() {
        Assert.assertFalse(plot.isDomainMinorGridlinesVisible());
    }

    @Test
    public void testSetDomainMinorGridlinesVisible() {
        plot.setDomainMinorGridlinesVisible(true);
        Assert.assertTrue(plot.isDomainMinorGridlinesVisible());
    }

    @Test
    public void testIsRangeMinorGridlinesVisibleDefault() {
        Assert.assertFalse(plot.isRangeMinorGridlinesVisible());
    }

    @Test
    public void testSetRangeMinorGridlinesVisible() {
        plot.setRangeMinorGridlinesVisible(true);
        Assert.assertTrue(plot.isRangeMinorGridlinesVisible());
    }

    @Test
    public void testIsDomainZeroBaselineVisibleDefault() {
        Assert.assertFalse(plot.isDomainZeroBaselineVisible());
    }

    @Test
    public void testIsRangeZeroBaselineVisibleDefault() {
        Assert.assertFalse(plot.isRangeZeroBaselineVisible());
    }

    @Test
    public void testSetDomainCrosshairValue() {
        plot.setDomainCrosshairValue(10.5);
        Assert.assertEquals(10.5, plot.getDomainCrosshairValue(), 0.0001);
    }

    @Test
    public void testSetDomainCrosshairValueNotify() {
        plot.setDomainCrosshairValue(10.5, true);
        Assert.assertEquals(10.5, plot.getDomainCrosshairValue(), 0.0001);
    }

    @Test
    public void testSetRangeCrosshairValue() {
        plot.setRangeCrosshairValue(20.5);
        Assert.assertEquals(20.5, plot.getRangeCrosshairValue(), 0.0001);
    }

    @Test
    public void testSetRangeCrosshairValueNotify() {
        plot.setRangeCrosshairValue(20.5, true);
        Assert.assertEquals(20.5, plot.getRangeCrosshairValue(), 0.0001);
    }

    @Test
    public void testGetDomainCrosshairStrokeNotNull() {
        Assert.assertNotNull(plot.getDomainCrosshairStroke());
    }

    @Test
    public void testGetDomainCrosshairPaintNotNull() {
        Assert.assertNotNull(plot.getDomainCrosshairPaint());
    }

    @Test
    public void testGetRangeCrosshairStrokeNotNull() {
        Assert.assertNotNull(plot.getRangeCrosshairStroke());
    }

    @Test
    public void testGetRangeCrosshairPaintNotNull() {
        Assert.assertNotNull(plot.getRangeCrosshairPaint());
    }

    @Test
    public void testSetDomainCrosshairVisible() {
        plot.setDomainCrosshairVisible(true);
        Assert.assertTrue(plot.isDomainCrosshairVisible());
    }

    @Test
    public void testSetRangeCrosshairVisible() {
        plot.setRangeCrosshairVisible(true);
        Assert.assertTrue(plot.isRangeCrosshairVisible());
    }

    @Test
    public void testIsDomainCrosshairLockedOnDataDefault() {
        Assert.assertTrue(plot.isDomainCrosshairLockedOnData());
    }

    @Test
    public void testIsRangeCrosshairLockedOnDataDefault() {
        Assert.assertTrue(plot.isRangeCrosshairLockedOnData());
    }

    @Test
    public void testIsDomainPannableDefault() {
        Assert.assertFalse(plot.isDomainPannable());
    }

    @Test
    public void testSetDomainPannable() {
        plot.setDomainPannable(true);
        Assert.assertTrue(plot.isDomainPannable());
    }

    @Test
    public void testIsRangePannableDefault() {
        Assert.assertFalse(plot.isRangePannable());
    }

    @Test
    public void testSetRangePannable() {
        plot.setRangePannable(true);
        Assert.assertTrue(plot.isRangePannable());
    }

    @Test
    public void testGetFixedLegendItemsDefault() {
        Assert.assertNull(plot.getFixedLegendItems());
    }

    @Test
    public void testSetFixedLegendItems() {
        org.jfree.chart.LegendItemCollection items = new org.jfree.chart.LegendItemCollection();
        items.add(new org.jfree.chart.LegendItem("Test"));
        plot.setFixedLegendItems(items);
        Assert.assertSame(items, plot.getFixedLegendItems());
    }

    @Test
    public void testGetQuadrantPaintInvalidIndex() {
        try {
            plot.getQuadrantPaint(4);
            Assert.fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetQuadrantPaintInvalidIndex() {
        try {
            plot.setQuadrantPaint(4, Color.RED);
            Assert.fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetQuadrantPaintValid() {
        plot.setQuadrantPaint(0, Color.RED);
        Assert.assertEquals(Color.RED, plot.getQuadrantPaint(0));
    }

    @Test
    public void testSetQuadrantOriginNull() {
        plot.setQuadrantOrigin(null);
        Assert.assertNotNull(plot.getQuadrantOrigin());
    }

    @Test
    public void testSetQuadrantOrigin() {
        Point2D origin = new Point2D.Double(100, 200);
        plot.setQuadrantOrigin(origin);
        Assert.assertEquals(origin, plot.getQuadrantOrigin());
    }

    @Test
    public void testAddAnnotationNull() {
        plot.addAnnotation(null);
        // No exception should be thrown
    }

    @Test
    public void testRemoveAnnotationNull() {
        plot.removeAnnotation(null);
        // No exception should be thrown
    }

    @Test
    public void testGetAnnotations() {
        Assert.assertNotNull(plot.getAnnotations());
        Assert.assertEquals(0, plot.getAnnotations().size());
    }

    @Test
    public void testSetDomainAxisLocationNull() {
        plot.setDomainAxisLocation(null);
        Assert.assertNotNull(plot.getDomainAxisLocation());
    }

    @Test
    public void testSetRangeAxisLocationNull() {
        plot.setRangeAxisLocation(null);
        Assert.assertNotNull(plot.getRangeAxisLocation());
    }

    @Test
    public void testSetDatasetRenderingOrderNull() {
        plot.setDatasetRenderingOrder(null);
        Assert.assertNotNull(plot.getDatasetRenderingOrder());
    }

    @Test
    public void testSetDatasetRenderingOrderValid() {
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.REVERSE);
        Assert.assertEquals(DatasetRenderingOrder.REVERSE, plot.getDatasetRenderingOrder());
    }

    @Test
    public void testSetSeriesRenderingOrderNull() {
        plot.setSeriesRenderingOrder(null);
        Assert.assertNotNull(plot.getSeriesRenderingOrder());
    }

    @Test
    public void testSetSeriesRenderingOrderValid() {
        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        Assert.assertEquals(SeriesRenderingOrder.FORWARD, plot.getSeriesRenderingOrder());
    }

    @Test
    public void testGetBackgroundDomainMarkerCount() {
        Assert.assertEquals(0, plot.getBackgroundDomainMarkerCount());
    }

    @Test
    public void testGetBackgroundRangeMarkerCount() {
        Assert.assertEquals(0, plot.getBackgroundRangeMarkerCount());
    }

    @Test
    public void testIsDomainCrosshairLockedOnDataSet() {
        plot.setDomainCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isDomainCrosshairLockedOnData());
    }

    @Test
    public void testIsRangeCrosshairLockedOnDataSet() {
        plot.setRangeCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isRangeCrosshairLockedOnData());
    }

    @Test
    public void testGetDomainAxisForDataset() {
        Assert.assertNull(plot.getDomainAxisForDataset(0));
    }

    @Test
    public void testGetRangeAxisForDataset() {
        Assert.assertNull(plot.getRangeAxisForDataset(0));
    }

    @Test
    public void testGetDomainAxisIndex() {
        ValueAxis axis = new NumberAxis("X");
        plot.setDomainAxis(axis);
        Assert.assertEquals(0, plot.getDomainAxisIndex(axis));
    }

    @Test
    public void testGetRangeAxisIndex() {
        ValueAxis axis = new NumberAxis("Y");
        plot.setRangeAxis(axis);
        Assert.assertEquals(0, plot.getRangeAxisIndex(axis));
    }

    @Test
    public void testGetDomainAxisCount() {
        Assert.assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testGetRangeAxisCount() {
        Assert.assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testGetRendererIndex() {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(renderer);
        Assert.assertEquals(0, plot.getRendererIndex(renderer));
    }

    @Test
    public void testGetRendererIndexNotFound() {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        Assert.assertEquals(-1, plot.getRendererIndex(renderer));
    }

    @Test
    public void testGetDomainMinorGridlineStrokeNotNull() {
        Assert.assertNotNull(plot.getDomainMinorGridlineStroke());
    }

    @Test
    public void testGetDomainMinorGridlinePaintNotNull() {
        Assert.assertNotNull(plot.getDomainMinorGridlinePaint());
    }

    @Test
    public void testGetRangeMinorGridlineStrokeNotNull() {
        Assert.assertNotNull(plot.getRangeMinorGridlineStroke());
    }

    @Test
    public void testGetRangeMinorGridlinePaintNotNull() {
        Assert.assertNotNull(plot.getRangeMinorGridlinePaint());
    }

    @Test
    public void testGetDomainZeroBaselineStrokeNotNull() {
        Assert.assertNotNull(plot.getDomainZeroBaselineStroke());
    }

    @Test
    public void testGetDomainZeroBaselinePaintNotNull() {
        Assert.assertNotNull(plot.getDomainZeroBaselinePaint());
    }

    @Test
    public void testGetRangeZeroBaselineStrokeNotNull() {
        Assert.assertNotNull(plot.getRangeZeroBaselineStroke());
    }

    @Test
    public void testGetRangeZeroBaselinePaintNotNull() {
        Assert.assertNotNull(plot.getRangeZeroBaselinePaint());
    }
}