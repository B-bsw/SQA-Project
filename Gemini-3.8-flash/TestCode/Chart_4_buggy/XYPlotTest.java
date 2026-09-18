package org.jfree.chart.plot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.XYAnnotation;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.Assert;
import org.junit.Test;

public class XYPlotTest implements PlotChangeListener {

    private PlotChangeEvent lastEvent;

    public void plotChanged(PlotChangeEvent event) {
        this.lastEvent = event;
    }

    @Test
    public void constructor_default_shouldInitializeProperly() {
        XYPlot plot = new XYPlot();
        Assert.assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        Assert.assertEquals(1, plot.getWeight());
        Assert.assertEquals(new RectangleInsets(4.0, 4.0, 4.0, 4.0), plot.getAxisOffset());
        Assert.assertNull(plot.getDomainAxis());
        Assert.assertNull(plot.getRangeAxis());
        Assert.assertNull(plot.getDataset());
        Assert.assertNull(plot.getRenderer());
        Assert.assertTrue(plot.isDomainGridlinesVisible());
        Assert.assertTrue(plot.isRangeGridlinesVisible());
        Assert.assertFalse(plot.isDomainMinorGridlinesVisible());
        Assert.assertFalse(plot.isRangeMinorGridlinesVisible());
        Assert.assertFalse(plot.isDomainZeroBaselineVisible());
        Assert.assertFalse(plot.isRangeZeroBaselineVisible());
        Assert.assertFalse(plot.isDomainCrosshairVisible());
        Assert.assertFalse(plot.isRangeCrosshairVisible());
        Assert.assertTrue(plot.isDomainCrosshairLockedOnData());
        Assert.assertTrue(plot.isRangeCrosshairLockedOnData());
        Assert.assertEquals(0.0, plot.getDomainCrosshairValue(), 0.0001);
        Assert.assertEquals(0.0, plot.getRangeCrosshairValue(), 0.0001);
        Assert.assertEquals(DatasetRenderingOrder.REVERSE, plot.getDatasetRenderingOrder());
        Assert.assertEquals(SeriesRenderingOrder.REVERSE, plot.getSeriesRenderingOrder());
        Assert.assertFalse(plot.canSelectByPoint());
        Assert.assertTrue(plot.canSelectByRegion());
        Assert.assertTrue(plot.isDomainZoomable());
        Assert.assertTrue(plot.isRangeZoomable());
        Assert.assertEquals(0, plot.getSeriesCount());
    }

    @Test
    public void constructor_withParameters_shouldBindComponents() {
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        StandardXYItemRenderer renderer = new StandardXYItemRenderer();
        XYSeries series = new XYSeries("S1");
        series.add(1.0, 2.0);
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);

        Assert.assertSame(xAxis, plot.getDomainAxis());
        Assert.assertSame(yAxis, plot.getRangeAxis());
        Assert.assertSame(renderer, plot.getRenderer());
        Assert.assertSame(dataset, plot.getDataset());
        Assert.assertSame(plot, xAxis.getPlot());
        Assert.assertSame(plot, yAxis.getPlot());
        Assert.assertSame(plot, renderer.getPlot());
        Assert.assertEquals(1, plot.getSeriesCount());
        Assert.assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation());
        Assert.assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getRangeAxisLocation());
    }

    @Test
    public void getPlotType_shouldReturnValidString() {
        XYPlot plot = new XYPlot();
        Assert.assertNotNull(plot.getPlotType());
    }

    @Test
    public void setOrientation_validValue_shouldUpdateAndNotify() {
        XYPlot plot = new XYPlot();
        plot.addChangeListener(this);
        this.lastEvent = null;

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
        Assert.assertNotNull(this.lastEvent);

        this.lastEvent = null;
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertNull(this.lastEvent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setOrientation_nullArgument_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(null);
    }

    @Test
    public void setAxisOffset_validValue_shouldUpdateAndNotify() {
        XYPlot plot = new XYPlot();
        plot.addChangeListener(this);
        this.lastEvent = null;

        RectangleInsets insets = new RectangleInsets(2.0, 2.0, 2.0, 2.0);
        plot.setAxisOffset(insets);
        Assert.assertEquals(insets, plot.getAxisOffset());
        Assert.assertNotNull(this.lastEvent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setAxisOffset_nullArgument_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.setAxisOffset(null);
    }

    @Test
    public void setWeight_validValue_shouldUpdateAndNotify() {
        XYPlot plot = new XYPlot();
        plot.addChangeListener(this);
        this.lastEvent = null;

        plot.setWeight(3);
        Assert.assertEquals(3, plot.getWeight());
        Assert.assertNotNull(this.lastEvent);
    }

    @Test
    public void domainAxis_operations_shouldWorkCorrectly() {
        XYPlot plot = new XYPlot();
        NumberAxis axis1 = new NumberAxis("Axis 1");
        NumberAxis axis2 = new NumberAxis("Axis 2");

        plot.setDomainAxis(axis1);
        Assert.assertSame(axis1, plot.getDomainAxis());
        Assert.assertSame(axis1, plot.getDomainAxis(0));
        Assert.assertEquals(1, plot.getDomainAxisCount());

        plot.setDomainAxis(1, axis2);
        Assert.assertSame(axis2, plot.getDomainAxis(1));
        Assert.assertEquals(2, plot.getDomainAxisCount());
        Assert.assertEquals(0, plot.getDomainAxisIndex(axis1));
        Assert.assertEquals(1, plot.getDomainAxisIndex(axis2));

        NumberAxis[] axes = new NumberAxis[] { new NumberAxis("A"), new NumberAxis("B") };
        plot.setDomainAxes(axes);
        Assert.assertSame(axes[0], plot.getDomainAxis(0));
        Assert.assertSame(axes[1], plot.getDomainAxis(1));

        plot.clearDomainAxes();
        Assert.assertEquals(0, plot.getDomainAxisCount());
        Assert.assertNull(plot.getDomainAxis(0));
    }

    @Test
    public void domainAxis_fallbackToParent_shouldReturnParentAxis() {
        XYPlot parent = new XYPlot();
        NumberAxis parentAxis = new NumberAxis("ParentDomain");
        parent.setDomainAxis(0, parentAxis);

        XYPlot child = new XYPlot();
        child.setParent(parent);

        Assert.assertSame(parentAxis, child.getDomainAxis(0));
        Assert.assertEquals(0, child.getDomainAxisIndex(parentAxis));
    }

    @Test
    public void domainAxisLocations_andEdges_shouldBeCalculatedCorrectly() {
        XYPlot plot = new XYPlot();
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        Assert.assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
        Assert.assertEquals(RectangleEdge.TOP, plot.getDomainAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(RectangleEdge.RIGHT, plot.getDomainAxisEdge());

        plot.setDomainAxisLocation(1, AxisLocation.BOTTOM_OR_RIGHT);
        Assert.assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getDomainAxisLocation(1));
        Assert.assertEquals(RectangleEdge.RIGHT, plot.getDomainAxisEdge(1));

        Assert.assertNotNull(plot.getDomainAxisLocation(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainAxisLocation_indexZeroNull_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.setDomainAxisLocation(0, null);
    }

    @Test
    public void rangeAxis_operations_shouldWorkCorrectly() {
        XYPlot plot = new XYPlot();
        NumberAxis axis1 = new NumberAxis("Range 1");
        NumberAxis axis2 = new NumberAxis("Range 2");

        plot.setRangeAxis(axis1);
        Assert.assertSame(axis1, plot.getRangeAxis());
        Assert.assertSame(axis1, plot.getRangeAxis(0));
        Assert.assertEquals(1, plot.getRangeAxisCount());

        plot.setRangeAxis(1, axis2);
        Assert.assertSame(axis2, plot.getRangeAxis(1));
        Assert.assertEquals(2, plot.getRangeAxisCount());
        Assert.assertEquals(0, plot.getRangeAxisIndex(axis1));
        Assert.assertEquals(1, plot.getRangeAxisIndex(axis2));

        NumberAxis[] axes = new NumberAxis[] { new NumberAxis("RA"), new NumberAxis("RB") };
        plot.setRangeAxes(axes);
        Assert.assertSame(axes[0], plot.getRangeAxis(0));
        Assert.assertSame(axes[1], plot.getRangeAxis(1));

        plot.clearRangeAxes();
        Assert.assertEquals(0, plot.getRangeAxisCount());
        Assert.assertNull(plot.getRangeAxis(0));
    }

    @Test
    public void rangeAxis_fallbackToParent_shouldReturnParentAxis() {
        XYPlot parent = new XYPlot();
        NumberAxis parentAxis = new NumberAxis("ParentRange");
        parent.setRangeAxis(0, parentAxis);

        XYPlot child = new XYPlot();
        child.setParent(parent);

        Assert.assertSame(parentAxis, child.getRangeAxis(0));
        Assert.assertEquals(0, child.getRangeAxisIndex(parentAxis));
    }

    @Test
    public void rangeAxisLocations_andEdges_shouldBeCalculatedCorrectly() {
        XYPlot plot = new XYPlot();
        plot.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT);
        Assert.assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getRangeAxisLocation());
        Assert.assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(RectangleEdge.TOP, plot.getRangeAxisEdge());

        plot.setRangeAxisLocation(1, AxisLocation.BOTTOM_OR_LEFT);
        Assert.assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getRangeAxisLocation(1));
        Assert.assertEquals(RectangleEdge.BOTTOM, plot.getRangeAxisEdge(1));

        Assert.assertNotNull(plot.getRangeAxisLocation(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeAxisLocation_indexZeroNull_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.setRangeAxisLocation(0, null);
    }

    @Test
    public void dataset_operations_shouldWorkCorrectly() {
        XYPlot plot = new XYPlot();
        XYSeriesCollection ds1 = new XYSeriesCollection();
        XYSeriesCollection ds2 = new XYSeriesCollection();

        plot.setDataset(ds1);
        Assert.assertSame(ds1, plot.getDataset());
        Assert.assertSame(ds1, plot.getDataset(0));
        Assert.assertEquals(1, plot.getDatasetCount());
        Assert.assertEquals(0, plot.indexOf(ds1));

        plot.setDataset(1, ds2);
        Assert.assertSame(ds2, plot.getDataset(1));
        Assert.assertEquals(2, plot.getDatasetCount());
        Assert.assertEquals(1, plot.indexOf(ds2));

        Assert.assertEquals(-1, plot.indexOf(new XYSeriesCollection()));
        Assert.assertNull(plot.getDataset(99));
    }

    @Test
    public void datasetToAxesMapping_validIndices_shouldMapCorrectly() {
        XYPlot plot = new XYPlot();
        NumberAxis dAxis0 = new NumberAxis("D0");
        NumberAxis dAxis1 = new NumberAxis("D1");
        NumberAxis rAxis0 = new NumberAxis("R0");
        NumberAxis rAxis1 = new NumberAxis("R1");

        plot.setDomainAxis(0, dAxis0);
        plot.setDomainAxis(1, dAxis1);
        plot.setRangeAxis(0, rAxis0);
        plot.setRangeAxis(1, rAxis1);

        plot.setDataset(0, new XYSeriesCollection());
        plot.setDataset(1, new XYSeriesCollection());

        plot.mapDatasetToDomainAxis(1, 1);
        plot.mapDatasetToRangeAxis(1, 1);

        Assert.assertSame(dAxis1, plot.getDomainAxisForDataset(1));
        Assert.assertSame(rAxis1, plot.getRangeAxisForDataset(1));

        List dIndices = new ArrayList();
        dIndices.add(new Integer(0));
        plot.mapDatasetToDomainAxes(1, dIndices);
        Assert.assertSame(dAxis0, plot.getDomainAxisForDataset(1));

        List rIndices = new ArrayList();
        rIndices.add(new Integer(0));
        plot.mapDatasetToRangeAxes(1, rIndices);
        Assert.assertSame(rAxis0, plot.getRangeAxisForDataset(1));

        plot.mapDatasetToDomainAxes(1, null);
        plot.mapDatasetToRangeAxes(1, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mapDatasetToDomainAxes_negativeIndex_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.mapDatasetToDomainAxis(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mapDatasetToDomainAxes_emptyList_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.mapDatasetToDomainAxes(0, new ArrayList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void mapDatasetToDomainAxes_nonInteger_shouldThrowException() {
        XYPlot plot = new XYPlot();
        List list = new ArrayList();
        list.add("invalid");
        plot.mapDatasetToDomainAxes(0, list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mapDatasetToDomainAxes_duplicates_shouldThrowException() {
        XYPlot plot = new XYPlot();
        List list = new ArrayList();
        list.add(new Integer(0));
        list.add(new Integer(0));
        plot.mapDatasetToDomainAxes(0, list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mapDatasetToRangeAxes_negativeIndex_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.mapDatasetToRangeAxis(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mapDatasetToRangeAxes_emptyList_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.mapDatasetToRangeAxes(0, new ArrayList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getDomainAxisForDataset_outOfBoundsNegative_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.getDomainAxisForDataset(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getDomainAxisForDataset_outOfBoundsTooLarge_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.getDomainAxisForDataset(10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getRangeAxisForDataset_outOfBoundsNegative_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.getRangeAxisForDataset(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getRangeAxisForDataset_outOfBoundsTooLarge_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.getRangeAxisForDataset(10);
    }

    @Test
    public void renderer_operations_shouldWorkCorrectly() {
        XYPlot plot = new XYPlot();
        XYItemRenderer r0 = new StandardXYItemRenderer();
        XYItemRenderer r1 = new StandardXYItemRenderer();

        plot.setRenderer(r0);
        Assert.assertSame(r0, plot.getRenderer());
        Assert.assertSame(r0, plot.getRenderer(0));
        Assert.assertEquals(1, plot.getRendererCount());
        Assert.assertEquals(0, plot.getIndexOf(r0));

        plot.setRenderer(1, r1);
        Assert.assertSame(r1, plot.getRenderer(1));
        Assert.assertEquals(2, plot.getRendererCount());
        Assert.assertEquals(1, plot.getIndexOf(r1));

        XYSeriesCollection ds0 = new XYSeriesCollection();
        plot.setDataset(0, ds0);
        Assert.assertSame(r0, plot.getRendererForDataset(ds0));

        XYItemRenderer[] renderers = new XYItemRenderer[] { new StandardXYItemRenderer(), new StandardXYItemRenderer() };
        plot.setRenderers(renderers);
        Assert.assertSame(renderers[0], plot.getRenderer(0));
        Assert.assertSame(renderers[1], plot.getRenderer(1));
    }

    @Test
    public void datasetRenderingOrder_validValues_shouldUpdate() {
        XYPlot plot = new XYPlot();
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        Assert.assertEquals(DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDatasetRenderingOrder_null_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.setDatasetRenderingOrder(null);
    }

    @Test
    public void seriesRenderingOrder_validValues_shouldUpdate() {
        XYPlot plot = new XYPlot();
        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        Assert.assertEquals(SeriesRenderingOrder.FORWARD, plot.getSeriesRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setSeriesRenderingOrder_null_shouldThrowException() {
        XYPlot plot = new XYPlot();
        plot.setSeriesRenderingOrder(null);
    }

    @Test
    public void gridlinesAndBaselines_gettersAndSetters_shouldWorkCorrectly() {
        XYPlot plot = new XYPlot();

        plot.setDomainGridlinesVisible(false);
        Assert.assertFalse(plot.isDomainGridlinesVisible());

        Stroke stroke1 = new BasicStroke(1.2f);
        plot.setDomainGridlineStroke(stroke1);
        Assert.assertEquals(stroke1, plot.getDomainGridlineStroke());

        plot.setDomainGridlinePaint(Color.RED);
        Assert.assertEquals(Color.RED, plot.getDomainGridlinePaint());

        plot.setDomainMinorGridlinesVisible(true);
        Assert.assertTrue(plot.isDomainMinorGridlinesVisible());

        plot.setDomainMinorGridlineStroke(stroke1);
        Assert.assertEquals(stroke1, plot.getDomainMinorGridlineStroke());

        plot.setDomainMinorGridlinePaint(Color.GREEN);
        Assert.assertEquals(Color.GREEN, plot.getDomainMinorGridlinePaint());

        plot.setRangeGridlinesVisible(false);
        Assert.assertFalse(plot.isRangeGridlinesVisible());

        plot.setRangeGridlineStroke(stroke1);
        Assert.assertEquals(stroke1, plot.getRangeGridlineStroke());

        plot.setRangeGridlinePaint(Color.BLUE);
        Assert.assertEquals(Color.BLUE, plot.getRangeGridlinePaint());

        plot.setRangeMinorGridlinesVisible(true);
        Assert.assertTrue(plot.isRangeMinorGridlinesVisible());

        plot.setRangeMinorGridlineStroke(stroke1);
        Assert.assertEquals(stroke1, plot.getRangeMinorGridlineStroke());

        plot.setRangeMinorGridlinePaint(Color.YELLOW);
        Assert.assertEquals(Color.YELLOW, plot.getRangeMinorGridlinePaint());

        plot.setDomainZeroBaselineVisible(true);
        Assert.assertTrue(plot.isDomainZeroBaselineVisible());

        plot.setDomainZeroBaselineStroke(stroke1);
        Assert.assertEquals(stroke1, plot.getDomainZeroBaselineStroke());

        plot.setDomainZeroBaselinePaint(Color.CYAN);
        Assert.assertEquals(Color.CYAN, plot.getDomainZeroBaselinePaint());

        plot.setRangeZeroBaselineVisible(true);
        Assert.assertTrue(plot.isRangeZeroBaselineVisible());

        plot.setRangeZeroBaselineStroke(stroke1);
        Assert.assertEquals(stroke1, plot.getRangeZeroBaselineStroke());

        plot.setRangeZeroBaselinePaint(Color.MAGENTA);
        Assert.assertEquals(Color.MAGENTA, plot.getRangeZeroBaselinePaint());

        plot.setDomainTickBandPaint(Color.LIGHT_GRAY);
        Assert.assertEquals(Color.LIGHT_GRAY, plot.getDomainTickBandPaint());

        plot.setRangeTickBandPaint(Color.DARK_GRAY);
        Assert.assertEquals(Color.DARK_GRAY, plot.getRangeTickBandPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainGridlineStroke_null_shouldThrowException() {
        new XYPlot().setDomainGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainGridlinePaint_null_shouldThrowException() {
        new XYPlot().setDomainGridlinePaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainMinorGridlineStroke_null_shouldThrowException() {
        new XYPlot().setDomainMinorGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainMinorGridlinePaint_null_shouldThrowException() {
        new XYPlot().setDomainMinorGridlinePaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeGridlineStroke_null_shouldThrowException() {
        new XYPlot().setRangeGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeGridlinePaint_null_shouldThrowException() {
        new XYPlot().setRangeGridlinePaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeMinorGridlineStroke_null_shouldThrowException() {
        new XYPlot().setRangeMinorGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeMinorGridlinePaint_null_shouldThrowException() {
        new XYPlot().setRangeMinorGridlinePaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainZeroBaselineStroke_null_shouldThrowException() {
        new XYPlot().setDomainZeroBaselineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainZeroBaselinePaint_null_shouldThrowException() {
        new XYPlot().setDomainZeroBaselinePaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeZeroBaselineStroke_null_shouldThrowException() {
        new XYPlot().setRangeZeroBaselineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeZeroBaselinePaint_null_shouldThrowException() {
        new XYPlot().setRangeZeroBaselinePaint(null);
    }

    @Test
    public void crosshairs_gettersAndSetters_shouldWorkCorrectly() {
        XYPlot plot = new XYPlot();

        plot.setDomainCrosshairVisible(true);
        Assert.assertTrue(plot.isDomainCrosshairVisible());

        plot.setDomainCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isDomainCrosshairLockedOnData());

        plot.setDomainCrosshairValue(42.5);
        Assert.assertEquals(42.5, plot.getDomainCrosshairValue(), 0.0001);

        Stroke stroke = new BasicStroke(2.0f);
        plot.setDomainCrosshairStroke(stroke);
        Assert.assertEquals(stroke, plot.getDomainCrosshairStroke());

        plot.setDomainCrosshairPaint(Color.ORANGE);
        Assert.assertEquals(Color.ORANGE, plot.getDomainCrosshairPaint());

        plot.setRangeCrosshairVisible(true);
        Assert.assertTrue(plot.isRangeCrosshairVisible());

        plot.setRangeCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isRangeCrosshairLockedOnData());

        plot.setRangeCrosshairValue(84.5);
        Assert.assertEquals(84.5, plot.getRangeCrosshairValue(), 0.0001);

        plot.setRangeCrosshairStroke(stroke);
        Assert.assertEquals(stroke, plot.getRangeCrosshairStroke());

        plot.setRangeCrosshairPaint(Color.PINK);
        Assert.assertEquals(Color.PINK, plot.getRangeCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainCrosshairStroke_null_shouldThrowException() {
        new XYPlot().setDomainCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainCrosshairPaint_null_shouldThrowException() {
        new XYPlot().setDomainCrosshairPaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeCrosshairStroke_null_shouldThrowException() {
        new XYPlot().setRangeCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeCrosshairPaint_null_shouldThrowException() {
        new XYPlot().setRangeCrosshairPaint(null);
    }

    @Test
    public void quadrant_propertiesAndMethods_shouldWorkCorrectly() {
        XYPlot plot = new XYPlot();
        Point2D origin = new Point2D.Double(1.0, 2.0);
        plot.setQuadrantOrigin(origin);
        Assert.assertEquals(origin, plot.getQuadrantOrigin());

        plot.setQuadrantPaint(0, Color.RED);
        plot.setQuadrantPaint(1, Color.GREEN);
        plot.setQuadrantPaint(2, Color.BLUE);
        plot.setQuadrantPaint(3, Color.YELLOW);

        Assert.assertEquals(Color.RED, plot.getQuadrantPaint(0));
        Assert.assertEquals(Color.GREEN, plot.getQuadrantPaint(1));
        Assert.assertEquals(Color.BLUE, plot.getQuadrantPaint(2));
        Assert.assertEquals(Color.YELLOW, plot.getQuadrantPaint(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setQuadrantOrigin_null_shouldThrowException() {
        new XYPlot().setQuadrantOrigin(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getQuadrantPaint_negativeIndex_shouldThrowException() {
        new XYPlot().getQuadrantPaint(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getQuadrantPaint_tooLargeIndex_shouldThrowException() {
        new XYPlot().getQuadrantPaint(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setQuadrantPaint_negativeIndex_shouldThrowException() {
        new XYPlot().setQuadrantPaint(-1, Color.RED);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setQuadrantPaint_tooLargeIndex_shouldThrowException() {
        new XYPlot().setQuadrantPaint(4, Color.RED);
    }

    @Test
    public void domainMarkers_addRemoveClear_shouldBehaveProperly() {
        XYPlot plot = new XYPlot();
        ValueMarker marker1 = new ValueMarker(10.0);
        ValueMarker marker2 = new ValueMarker(20.0);

        plot.addDomainMarker(marker1);
        plot.addDomainMarker(marker2, Layer.BACKGROUND);

        Collection fgMarkers = plot.getDomainMarkers(Layer.FOREGROUND);
        Assert.assertNotNull(fgMarkers);
        Assert.assertTrue(fgMarkers.contains(marker1));

        Collection bgMarkers = plot.getDomainMarkers(Layer.BACKGROUND);
        Assert.assertNotNull(bgMarkers);
        Assert.assertTrue(bgMarkers.contains(marker2));

        Assert.assertTrue(plot.removeDomainMarker(marker1));
        Assert.assertFalse(plot.removeDomainMarker(marker1));
        Assert.assertTrue(plot.removeDomainMarker(marker2, Layer.BACKGROUND));

        plot.addDomainMarker(1, marker1, Layer.FOREGROUND);
        Assert.assertNotNull(plot.getDomainMarkers(1, Layer.FOREGROUND));
        plot.clearDomainMarkers(1);
        Assert.assertEquals(0, plot.getDomainMarkers(1, Layer.FOREGROUND).size());

        plot.addDomainMarker(marker1);
        plot.clearDomainMarkers();
        Assert.assertNull(plot.getDomainMarkers(Layer.FOREGROUND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addDomainMarker_nullMarker_shouldThrowException() {
        new XYPlot().addDomainMarker(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addDomainMarker_nullLayer_shouldThrowException() {
        new XYPlot().addDomainMarker(new ValueMarker(1.0), null);
    }

    @Test
    public void rangeMarkers_addRemoveClear_shouldBehaveProperly() {
        XYPlot plot = new XYPlot();
        ValueMarker marker1 = new ValueMarker(15.0);
        ValueMarker marker2 = new ValueMarker(25.0);

        plot.addRangeMarker(marker1);
        plot.addRangeMarker(marker2, Layer.BACKGROUND);

        Collection fgMarkers = plot.getRangeMarkers(Layer.FOREGROUND);
        Assert.assertNotNull(fgMarkers);
        Assert.assertTrue(fgMarkers.contains(marker1));

        Collection bgMarkers = plot.getRangeMarkers(Layer.BACKGROUND);
        Assert.assertNotNull(bgMarkers);
        Assert.assertTrue(bgMarkers.contains(marker2));

        Assert.assertTrue(plot.removeRangeMarker(marker1));
        Assert.assertFalse(plot.removeRangeMarker(marker1));
        Assert.assertTrue(plot.removeRangeMarker(marker2, Layer.BACKGROUND));

        plot.addRangeMarker(1, marker1, Layer.FOREGROUND);
        Assert.assertNotNull(plot.getRangeMarkers(1, Layer.FOREGROUND));
        plot.clearRangeMarkers(1);
        Assert.assertEquals(0, plot.getRangeMarkers(1, Layer.FOREGROUND).size());

        plot.addRangeMarker(marker1);
        plot.clearRangeMarkers();
        Assert.assertNull(plot.getRangeMarkers(Layer.FOREGROUND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeRangeMarker_nullMarker_shouldThrowException() {
        new XYPlot().removeRangeMarker(null);
    }

    @Test
    public void annotations_operations_shouldAddRemoveAndClear() {
        XYPlot plot = new XYPlot();
        XYTextAnnotation a1 = new XYTextAnnotation("Text 1", 1.0, 2.0);
        XYTextAnnotation a2 = new XYTextAnnotation("Text 2", 3.0, 4.0);

        plot.addAnnotation(a1);
        plot.addAnnotation(a2, false);

        List list = plot.getAnnotations();
        Assert.assertEquals(2, list.size());
        Assert.assertTrue(list.contains(a1));
        Assert.assertTrue(list.contains(a2));

        Assert.assertTrue(plot.removeAnnotation(a1));
        Assert.assertFalse(plot.removeAnnotation(a1));
        Assert.assertEquals(1, plot.getAnnotations().size());

        plot.clearAnnotations();
        Assert.assertEquals(0, plot.getAnnotations().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addAnnotation_nullAnnotation_shouldThrowException() {
        new XYPlot().addAnnotation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeAnnotation_nullAnnotation_shouldThrowException() {
        new XYPlot().removeAnnotation(null);
    }

    @Test
    public void fixedAxisSpace_gettersAndSetters_shouldWorkCorrectly() {
        XYPlot plot = new XYPlot();
        AxisSpace spaceD = new AxisSpace();
        spaceD.setTop(10.0);
        plot.setFixedDomainAxisSpace(spaceD);
        Assert.assertSame(spaceD, plot.getFixedDomainAxisSpace());

        AxisSpace spaceR = new AxisSpace();
        spaceR.setLeft(20.0);
        plot.setFixedRangeAxisSpace(spaceR);
        Assert.assertSame(spaceR, plot.getFixedRangeAxisSpace());
    }

    @Test
    public void panningAndZooming_flagsAndMethods_shouldExecuteWithoutException() {
        NumberAxis xAxis = new NumberAxis("X");
        xAxis.setRange(0.0, 10.0);
        NumberAxis yAxis = new NumberAxis("Y");
        yAxis.setRange(0.0, 10.0);
        XYPlot plot = new XYPlot(null, xAxis, yAxis, null);

        plot.setDomainPannable(true);
        plot.setRangePannable(true);
        Assert.assertTrue(plot.isDomainPannable());
        Assert.assertTrue(plot.isRangePannable());

        plot.panDomainAxes(0.1, null, new Point2D.Double(5.0, 5.0));
        plot.panRangeAxes(0.1, null, new Point2D.Double(5.0, 5.0));

        plot.zoomDomainAxes(0.5, null, new Point2D.Double(0.0, 0.0));
        plot.zoomDomainAxes(0.1, 0.9, null, new Point2D.Double(0.0, 0.0));

        plot.zoomRangeAxes(0.5, null, new Point2D.Double(0.0, 0.0));
        plot.zoomRangeAxes(0.1, 0.9, null, new Point2D.Double(0.0, 0.0));
    }

    @Test
    public void fixedLegendItems_getterAndSetter_shouldWorkCorrectly() {
        XYPlot plot = new XYPlot();
        Assert.assertNotNull(plot.getLegendItems());

        LegendItemCollection lic = new LegendItemCollection();
        plot.setFixedLegendItems(lic);
        Assert.assertSame(lic, plot.getFixedLegendItems());
        Assert.assertSame(lic, plot.getLegendItems());
    }

    @Test
    public void getDataRange_withVariousConditions_shouldCalculateBounds() {
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYSeries series = new XYSeries("S");
        series.add(1.0, 10.0);
        series.add(5.0, 20.0);
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        StandardXYItemRenderer renderer = new StandardXYItemRenderer();

        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);

        Range xRange = plot.getDataRange(xAxis);
        Assert.assertNotNull(xRange);
        Assert.assertEquals(1.0, xRange.getLowerBound(), 0.0001);
        Assert.assertEquals(5.0, xRange.getUpperBound(), 0.0001);

        Range yRange = plot.getDataRange(yAxis);
        Assert.assertNotNull(yRange);
        Assert.assertEquals(10.0, yRange.getLowerBound(), 0.0001);
        Assert.assertEquals(20.0, yRange.getUpperBound(), 0.0001);

        NumberAxis unknownAxis = new NumberAxis("Unknown");
        Assert.assertNull(plot.getDataRange(unknownAxis));
    }

    @Test
    public void datasetChanged_andRendererChanged_shouldHandleEvents() {
        XYPlot plot = new XYPlot();
        plot.setDomainAxis(new NumberAxis("X"));
        plot.setRangeAxis(new NumberAxis("Y"));

        plot.datasetChanged(new DatasetChangeEvent(this, null));
        plot.rendererChanged(new RendererChangeEvent(new StandardXYItemRenderer(), true));
    }

    @Test
    public void draw_verticalAndHorizontal_shouldExecuteAllDrawingBranches() {
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);

        NumberAxis xAxis = new NumberAxis("X");
        xAxis.setRange(0.0, 10.0);
        NumberAxis yAxis = new NumberAxis("Y");
        yAxis.setRange(0.0, 10.0);
        StandardXYItemRenderer renderer = new StandardXYItemRenderer();
        XYSeries series = new XYSeries("Series");
        series.add(2.0, 3.0);
        series.add(5.0, 7.0);
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        plot.setDomainMinorGridlinesVisible(true);
        plot.setRangeMinorGridlinesVisible(true);
        plot.setDomainZeroBaselineVisible(true);
        plot.setRangeZeroBaselineVisible(true);
        plot.setDomainCrosshairVisible(true);
        plot.setRangeCrosshairVisible(true);
        plot.setDomainCrosshairLockedOnData(false);
        plot.setRangeCrosshairLockedOnData(false);
        plot.setDomainTickBandPaint(new Color(240, 240, 240));
        plot.setRangeTickBandPaint(new Color(245, 245, 245));
        plot.setQuadrantPaint(0, new Color(255, 200, 200, 100));
        plot.setQuadrantPaint(1, new Color(200, 255, 200, 100));
        plot.setQuadrantPaint(2, new Color(200, 200, 255, 100));
        plot.setQuadrantPaint(3, new Color(255, 255, 200, 100));
        plot.addDomainMarker(new ValueMarker(4.0));
        plot.addDomainMarker(new ValueMarker(2.0), Layer.BACKGROUND);
        plot.addRangeMarker(new ValueMarker(6.0));
        plot.addRangeMarker(new ValueMarker(3.0), Layer.BACKGROUND);
        plot.addAnnotation(new XYTextAnnotation("Note", 3.0, 4.0));

        plot.draw(g2, area, new Point2D.Double(150, 150), null, null);

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        plot.draw(g2, area, new Point2D.Double(150, 150), null, null);

        // Degenerate drawing area
        plot.draw(g2, new Rectangle2D.Double(0, 0, 5, 5), null, null, null);

        g2.dispose();
    }

    @Test
    public void drawLinesAndBaselines_directHelperInvocations() {
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(10, 10, 180, 180);

        NumberAxis xAxis = new NumberAxis("X");
        xAxis.setRange(0.0, 10.0);
        NumberAxis yAxis = new NumberAxis("Y");
        yAxis.setRange(0.0, 10.0);
        XYPlot plot = new XYPlot(null, xAxis, yAxis, new StandardXYItemRenderer());

        plot.drawHorizontalLine(g2, area, 5.0, new BasicStroke(1.0f), Color.BLACK);
        plot.drawVerticalLine(g2, area, 5.0, new BasicStroke(1.0f), Color.BLACK);
        plot.drawDomainCrosshair(g2, area, PlotOrientation.VERTICAL, 5.0, xAxis, new BasicStroke(1.0f), Color.RED);
        plot.drawDomainCrosshair(g2, area, PlotOrientation.HORIZONTAL, 5.0, xAxis, new BasicStroke(1.0f), Color.RED);
        plot.drawRangeCrosshair(g2, area, PlotOrientation.VERTICAL, 5.0, yAxis, new BasicStroke(1.0f), Color.BLUE);
        plot.drawRangeCrosshair(g2, area, PlotOrientation.HORIZONTAL, 5.0, yAxis, new BasicStroke(1.0f), Color.BLUE);

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.drawHorizontalLine(g2, area, 5.0, new BasicStroke(1.0f), Color.BLACK);
        plot.drawVerticalLine(g2, area, 5.0, new BasicStroke(1.0f), Color.BLACK);

        g2.dispose();
    }

    @Test
    public void selectAndClearSelection_shouldHandleSelections() {
        XYPlot plot = new XYPlot();
        plot.clearSelection();
        plot.select(10.0, 10.0, new Rectangle2D.Double(0, 0, 100, 100), null);
    }

    @Test
    public void equals_comprehensiveComparison_shouldDistinguishModifications() {
        XYPlot p1 = new XYPlot();
        XYPlot p2 = new XYPlot();
        Assert.assertTrue(p1.equals(p1));
        Assert.assertFalse(p1.equals(null));
        Assert.assertFalse(p1.equals("NotAnXYPlot"));
        Assert.assertTrue(p1.equals(p2));

        p1.setWeight(2);
        Assert.assertFalse(p1.equals(p2));
        p2.setWeight(2);
        Assert.assertTrue(p1.equals(p2));

        p1.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertFalse(p1.equals(p2));
        p2.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertTrue(p1.equals(p2));

        p1.setDomainAxis(new NumberAxis("X"));
        Assert.assertFalse(p1.equals(p2));
        p2.setDomainAxis(new NumberAxis("X"));
        Assert.assertTrue(p1.equals(p2));

        p1.setRangeAxis(new NumberAxis("Y"));
        Assert.assertFalse(p1.equals(p2));
        p2.setRangeAxis(new NumberAxis("Y"));
        Assert.assertTrue(p1.equals(p2));

        p1.setDomainCrosshairVisible(true);
        Assert.assertFalse(p1.equals(p2));
        p2.setDomainCrosshairVisible(true);
        Assert.assertTrue(p1.equals(p2));

        p1.setDomainCrosshairValue(12.3);
        Assert.assertFalse(p1.equals(p2));
        p2.setDomainCrosshairValue(12.3);
        Assert.assertTrue(p1.equals(p2));

        p1.setRangeCrosshairVisible(true);
        Assert.assertFalse(p1.equals(p2));
        p2.setRangeCrosshairVisible(true);
        Assert.assertTrue(p1.equals(p2));

        p1.setRangeCrosshairValue(45.6);
        Assert.assertFalse(p1.equals(p2));
        p2.setRangeCrosshairValue(45.6);
        Assert.assertTrue(p1.equals(p2));

        p1.setDomainGridlinesVisible(false);
        Assert.assertFalse(p1.equals(p2));
        p2.setDomainGridlinesVisible(false);
        Assert.assertTrue(p1.equals(p2));

        p1.setRangeGridlinesVisible(false);
        Assert.assertFalse(p1.equals(p2));
        p2.setRangeGridlinesVisible(false);
        Assert.assertTrue(p1.equals(p2));

        p1.setQuadrantPaint(0, Color.RED);
        Assert.assertFalse(p1.equals(p2));
        p2.setQuadrantPaint(0, Color.RED);
        Assert.assertTrue(p1.equals(p2));
    }

    @Test
    public void clone_shouldCreateIndependentDeepCopy() throws Exception {
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        StandardXYItemRenderer renderer = new StandardXYItemRenderer();
        XYSeries series = new XYSeries("Series");
        series.add(1.0, 2.0);
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        plot.addDomainMarker(new ValueMarker(5.0));
        plot.addRangeMarker(new ValueMarker(10.0));
        plot.addAnnotation(new XYTextAnnotation("CloneAnnotation", 1.0, 2.0));
        plot.setFixedDomainAxisSpace(new AxisSpace());
        plot.setFixedRangeAxisSpace(new AxisSpace());
        plot.setFixedLegendItems(new LegendItemCollection());

        XYPlot clone = (XYPlot) plot.clone();

        Assert.assertNotSame(plot, clone);
        Assert.assertEquals(plot, clone);

        Assert.assertNotSame(plot.getDomainAxis(), clone.getDomainAxis());
        Assert.assertNotSame(plot.getRangeAxis(), clone.getRangeAxis());
        Assert.assertSame(clone, clone.getDomainAxis().getPlot());
        Assert.assertSame(clone, clone.getRangeAxis().getPlot());
    }

    @Test
    public void serialization_shouldRestoreStateCorrectly() throws Exception {
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        StandardXYItemRenderer renderer = new StandardXYItemRenderer();
        XYSeries series = new XYSeries("Series");
        series.add(1.0, 2.0);
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        XYPlot plot1 = new XYPlot(dataset, xAxis, yAxis, renderer);
        plot1.setQuadrantPaint(0, Color.RED);
        plot1.setQuadrantPaint(1, Color.BLUE);
        plot1.setDomainTickBandPaint(Color.LIGHT_GRAY);
        plot1.setRangeTickBandPaint(Color.DARK_GRAY);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(plot1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        XYPlot plot2 = (XYPlot) in.readObject();
        in.close();

        Assert.assertEquals(plot1, plot2);
        Assert.assertNotSame(plot1, plot2);
    }
}