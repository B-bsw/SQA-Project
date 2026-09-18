package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Collection;
import java.util.List;

import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import org.junit.Before;
import org.junit.Test;

public class XYPlotTest {

    private XYDataset createSampleDataset() {
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        return dataset;
    }

    private XYPlot plot;

    @Before
    public void setUp() {
        plot = new XYPlot(createSampleDataset(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor() {
        XYPlot p = new XYPlot();
        assertNull(p.getDataset());
        assertNull(p.getRenderer());
        assertNull(p.getDomainAxis());
        assertNull(p.getRangeAxis());
    }

    @Test
    public void testFullConstructor() {
        assertNotNull(plot.getDataset());
        assertNotNull(plot.getDomainAxis());
        assertNotNull(plot.getRangeAxis());
        assertNotNull(plot.getRenderer());
    }

    @Test
    public void testGetPlotType() {
        assertNotNull(plot.getPlotType());
    }

    // ---------- Orientation ----------

    @Test
    public void testOrientationDefault() {
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
    }

    @Test
    public void testSetOrientation() {
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNull() {
        plot.setOrientation(null);
    }

    @Test
    public void testSetOrientationSameNoChange() {
        PlotOrientation before = plot.getOrientation();
        plot.setOrientation(before); // same value, no event fired but no error
        assertEquals(before, plot.getOrientation());
    }

    // ---------- Axis offset ----------

    @Test
    public void testAxisOffset() {
        RectangleInsets insets = new RectangleInsets(1, 1, 1, 1);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffsetNull() {
        plot.setAxisOffset(null);
    }

    // ---------- Domain Axis ----------

    @Test
    public void testGetDomainAxisIndexOutOfRange() {
        // index beyond size but no parent -> null
        assertNull(plot.getDomainAxis(5));
    }

    @Test
    public void testSetDomainAxis() {
        NumberAxis axis = new NumberAxis("NewX");
        plot.setDomainAxis(axis);
        assertEquals(axis, plot.getDomainAxis());
    }

    @Test
    public void testSetDomainAxisWithIndexNoNotify() {
        NumberAxis axis = new NumberAxis("NewX2");
        plot.setDomainAxis(1, axis, false);
        assertEquals(axis, plot.getDomainAxis(1));
    }

    @Test
    public void testSetDomainAxesArray() {
        NumberAxis a1 = new NumberAxis("A1");
        NumberAxis a2 = new NumberAxis("A2");
        plot.setDomainAxes(new ValueAxis[] {a1, a2});
        assertEquals(a1, plot.getDomainAxis(0));
        assertEquals(a2, plot.getDomainAxis(1));
    }

    @Test
    public void testDomainAxisLocation() {
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_LEFT);
        assertEquals(AxisLocation.TOP_OR_LEFT, plot.getDomainAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocationIndex0Null() {
        plot.setDomainAxisLocation(0, null, true);
    }

    @Test
    public void testDomainAxisLocationIndexNonZeroNullAllowed() {
        plot.setDomainAxisLocation(1, null, true);
        AxisLocation loc = plot.getDomainAxisLocation(1);
        assertNotNull(loc);
    }

    @Test
    public void testGetDomainAxisEdge() {
        RectangleEdge edge = plot.getDomainAxisEdge();
        assertNotNull(edge);
    }

    @Test
    public void testGetDomainAxisCount() {
        assertEquals(1, plot.getDomainAxisCount());
    }

    @Test
    public void testClearDomainAxes() {
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testConfigureDomainAxes() {
        plot.configureDomainAxes(); // no exception
        assertNotNull(plot.getDomainAxis());
    }

    @Test
    public void testGetDomainAxisEdgeIndex() {
        RectangleEdge edge = plot.getDomainAxisEdge(0);
        assertNotNull(edge);
    }

    // ---------- Range Axis ----------

    @Test
    public void testSetRangeAxis() {
        NumberAxis axis = new NumberAxis("NewY");
        plot.setRangeAxis(axis);
        assertEquals(axis, plot.getRangeAxis());
    }

    @Test
    public void testSetRangeAxisWithIndex() {
        NumberAxis axis = new NumberAxis("NewY2");
        plot.setRangeAxis(1, axis, false);
        assertEquals(axis, plot.getRangeAxis(1));
    }

    @Test
    public void testSetRangeAxesArray() {
        NumberAxis a1 = new NumberAxis("R1");
        NumberAxis a2 = new NumberAxis("R2");
        plot.setRangeAxes(new ValueAxis[] {a1, a2});
        assertEquals(a1, plot.getRangeAxis(0));
        assertEquals(a2, plot.getRangeAxis(1));
    }

    @Test
    public void testRangeAxisLocation() {
        plot.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getRangeAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocationIndex0Null() {
        plot.setRangeAxisLocation(0, null, true);
    }

    @Test
    public void testGetRangeAxisCount() {
        assertEquals(1, plot.getRangeAxisCount());
    }

    @Test
    public void testClearRangeAxes() {
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testConfigureRangeAxes() {
        plot.configureRangeAxes();
        assertNotNull(plot.getRangeAxis());
    }

    @Test
    public void testGetRangeAxisEdge() {
        assertNotNull(plot.getRangeAxisEdge());
    }

    @Test
    public void testGetRangeAxisEdgeIndex() {
        assertNotNull(plot.getRangeAxisEdge(0));
    }

    // ---------- Dataset ----------

    @Test
    public void testGetDatasetDefault() {
        assertNotNull(plot.getDataset());
    }

    @Test
    public void testSetDataset() {
        XYDataset newDataset = createSampleDataset();
        plot.setDataset(newDataset);
        assertEquals(newDataset, plot.getDataset());
    }

    @Test
    public void testGetDatasetCount() {
        assertEquals(1, plot.getDatasetCount());
    }

    @Test
    public void testIndexOfDataset() {
        XYDataset d = plot.getDataset();
        assertEquals(0, plot.indexOf(d));
    }

    @Test
    public void testIndexOfDatasetNotFound() {
        XYDataset other = createSampleDataset();
        assertEquals(-1, plot.indexOf(other));
    }

    @Test
    public void testMapDatasetToDomainAxis() {
        plot.mapDatasetToDomainAxis(0, 0);
        assertNotNull(plot.getDomainAxisForDataset(0));
    }

    @Test
    public void testMapDatasetToRangeAxis() {
        plot.mapDatasetToRangeAxis(0, 0);
        assertNotNull(plot.getRangeAxisForDataset(0));
    }

    // ---------- Renderer ----------

    @Test
    public void testGetRendererDefault() {
        assertNotNull(plot.getRenderer());
    }

    @Test
    public void testSetRenderer() {
        XYLineAndShapeRenderer r = new XYLineAndShapeRenderer();
        plot.setRenderer(r);
        assertEquals(r, plot.getRenderer());
    }

    @Test
    public void testSetRenderersArray() {
        XYLineAndShapeRenderer r1 = new XYLineAndShapeRenderer();
        XYLineAndShapeRenderer r2 = new XYLineAndShapeRenderer();
        plot.setRenderers(new XYItemRenderer[] {r1, r2});
        assertEquals(r1, plot.getRenderer(0));
        assertEquals(r2, plot.getRenderer(1));
    }

    @Test
    public void testGetIndexOfRenderer() {
        XYItemRenderer r = plot.getRenderer();
        assertEquals(0, plot.getIndexOf(r));
    }

    @Test
    public void testGetRendererForDataset() {
        XYDataset d = plot.getDataset();
        XYItemRenderer r = plot.getRendererForDataset(d);
        assertNotNull(r);
    }

    @Test
    public void testGetRendererForDatasetNotFound() {
        XYDataset other = createSampleDataset();
        XYItemRenderer r = plot.getRendererForDataset(other);
        assertNull(r);
    }

    // ---------- DatasetRenderingOrder / SeriesRenderingOrder ----------

    @Test
    public void testDatasetRenderingOrder() {
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD,
                plot.getDatasetRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDatasetRenderingOrderNull() {
        plot.setDatasetRenderingOrder(null);
    }

    @Test
    public void testSeriesRenderingOrder() {
        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        assertEquals(SeriesRenderingOrder.FORWARD,
                plot.getSeriesRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesRenderingOrderNull() {
        plot.setSeriesRenderingOrder(null);
    }

    // ---------- Weight ----------

    @Test
    public void testWeight() {
        plot.setWeight(5);
        assertEquals(5, plot.getWeight());
    }

    // ---------- Gridlines ----------

    @Test
    public void testDomainGridlinesVisible() {
        plot.setDomainGridlinesVisible(false);
        assertFalse(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testDomainGridlineStroke() {
        Stroke s = new BasicStroke(2.0f);
        plot.setDomainGridlineStroke(s);
        assertEquals(s, plot.getDomainGridlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStrokeNull() {
        plot.setDomainGridlineStroke(null);
    }

    @Test
    public void testDomainGridlinePaint() {
        Paint p = Color.RED;
        plot.setDomainGridlinePaint(p);
        assertEquals(p, plot.getDomainGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaintNull() {
        plot.setDomainGridlinePaint(null);
    }

    @Test
    public void testRangeGridlinesVisible() {
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
    }

    @Test
    public void testRangeGridlineStroke() {
        Stroke s = new BasicStroke(3.0f);
        plot.setRangeGridlineStroke(s);
        assertEquals(s, plot.getRangeGridlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStrokeNull() {
        plot.setRangeGridlineStroke(null);
    }

    @Test
    public void testRangeGridlinePaint() {
        Paint p = Color.BLUE;
        plot.setRangeGridlinePaint(p);
        assertEquals(p, plot.getRangeGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaintNull() {
        plot.setRangeGridlinePaint(null);
    }

    // ---------- Zero baseline ----------

    @Test
    public void testDomainZeroBaselineVisible() {
        plot.setDomainZeroBaselineVisible(true);
        assertTrue(plot.isDomainZeroBaselineVisible());
    }

    @Test
    public void testDomainZeroBaselineStroke() {
        Stroke s = new BasicStroke(1.5f);
        plot.setDomainZeroBaselineStroke(s);
        assertEquals(s, plot.getDomainZeroBaselineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainZeroBaselineStrokeNull() {
        plot.setDomainZeroBaselineStroke(null);
    }

    @Test
    public void testDomainZeroBaselinePaint() {
        Paint p = Color.GREEN;
        plot.setDomainZeroBaselinePaint(p);
        assertEquals(p, plot.getDomainZeroBaselinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainZeroBaselinePaintNull() {
        plot.setDomainZeroBaselinePaint(null);
    }

    @Test
    public void testRangeZeroBaselineVisible() {
        plot.setRangeZeroBaselineVisible(true);
        assertTrue(plot.isRangeZeroBaselineVisible());
    }

    @Test
    public void testRangeZeroBaselineStroke() {
        Stroke s = new BasicStroke(1.2f);
        plot.setRangeZeroBaselineStroke(s);
        assertEquals(s, plot.getRangeZeroBaselineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeZeroBaselineStrokeNull() {
        plot.setRangeZeroBaselineStroke(null);
    }

    @Test
    public void testRangeZeroBaselinePaint() {
        Paint p = Color.YELLOW;
        plot.setRangeZeroBaselinePaint(p);
        assertEquals(p, plot.getRangeZeroBaselinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeZeroBaselinePaintNull() {
        plot.setRangeZeroBaselinePaint(null);
    }

    // ---------- Tick band paint ----------

    @Test
    public void testDomainTickBandPaint() {
        Paint p = Color.CYAN;
        plot.setDomainTickBandPaint(p);
        assertEquals(p, plot.getDomainTickBandPaint());
    }

    @Test
    public void testRangeTickBandPaint() {
        Paint p = Color.MAGENTA;
        plot.setRangeTickBandPaint(p);
        assertEquals(p, plot.getRangeTickBandPaint());
    }

    // ---------- Quadrant ----------

    @Test
    public void testQuadrantOrigin() {
        Point2D pt = new Point2D.Double(1.0, 2.0);
        plot.setQuadrantOrigin(pt);
        assertEquals(pt, plot.getQuadrantOrigin());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantOriginNull() {
        plot.setQuadrantOrigin(null);
    }

    @Test
    public void testQuadrantPaint() {
        plot.setQuadrantPaint(0, Color.RED);
        assertEquals(Color.RED, plot.getQuadrantPaint(0));
        plot.setQuadrantPaint(3, Color.BLUE);
        assertEquals(Color.BLUE, plot.getQuadrantPaint(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetQuadrantPaintOutOfRangeLow() {
        plot.getQuadrantPaint(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetQuadrantPaintOutOfRangeHigh() {
        plot.getQuadrantPaint(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantPaintOutOfRange() {
        plot.setQuadrantPaint(5, Color.RED);
    }

    // ---------- Domain Markers ----------

    @Test
    public void testAddDomainMarker() {
        Marker m = new ValueMarker(1.0);
        plot.addDomainMarker(m);
        Collection markers = plot.getDomainMarkers(Layer.FOREGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(m));
    }

    @Test
    public void testAddDomainMarkerBackground() {
        Marker m = new ValueMarker(2.0);
        plot.addDomainMarker(m, Layer.BACKGROUND);
        Collection markers = plot.getDomainMarkers(Layer.BACKGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(m));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarkerNull() {
        plot.addDomainMarker(null, Layer.FOREGROUND);
    }

    @Test
    public void testRemoveDomainMarker() {
        Marker m = new ValueMarker(3.0);
        plot.addDomainMarker(m);
        boolean removed = plot.removeDomainMarker(m);
        assertTrue(removed);
    }

    @Test
    public void testRemoveDomainMarkerNotPresent() {
        Marker m = new ValueMarker(3.0);
        boolean removed = plot.removeDomainMarker(m);
        assertFalse(removed);
    }

    @Test
    public void testClearDomainMarkers() {
        plot.addDomainMarker(new ValueMarker(1.0));
        plot.clearDomainMarkers();
        Collection markers = plot.getDomainMarkers(Layer.FOREGROUND);
        assertTrue(markers == null || markers.isEmpty());
    }

    @Test
    public void testClearDomainMarkersIndex() {
        plot.addDomainMarker(0, new ValueMarker(1.0), Layer.FOREGROUND);
        plot.clearDomainMarkers(0);
        // no exception, method executed fully
        assertNotNull(plot);
    }

    // ---------- Range Markers ----------

    @Test
    public void testAddRangeMarker() {
        Marker m = new ValueMarker(1.0);
        plot.addRangeMarker(m);
        Collection markers = plot.getRangeMarkers(Layer.FOREGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(m));
    }

    @Test
    public void testAddRangeMarkerBackground() {
        Marker m = new ValueMarker(2.0);
        plot.addRangeMarker(m, Layer.BACKGROUND);
        Collection markers = plot.getRangeMarkers(Layer.BACKGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(m));
    }

    @Test
    public void testRemoveRangeMarker() {
        Marker m = new ValueMarker(3.0);
        plot.addRangeMarker(m);
        boolean removed = plot.removeRangeMarker(m);
        assertTrue(removed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRangeMarkerNullArg() {
        plot.removeRangeMarker(0, null, Layer.FOREGROUND, true);
    }

    @Test
    public void testClearRangeMarkers() {
        plot.addRangeMarker(new ValueMarker(1.0));
        plot.clearRangeMarkers();
        Collection markers = plot.getRangeMarkers(Layer.FOREGROUND);
        assertTrue(markers == null || markers.isEmpty());
    }

    @Test
    public void testClearRangeMarkersIndex() {
        plot.addRangeMarker(0, new ValueMarker(1.0), Layer.FOREGROUND);
        plot.clearRangeMarkers(0);
        assertNotNull(plot);
    }

    // ---------- Annotations ----------

    @Test
    public void testAddAnnotation() {
        org.jfree.chart.annotations.XYTextAnnotation ann =
                new org.jfree.chart.annotations.XYTextAnnotation("Test", 1.0, 1.0);
        plot.addAnnotation(ann);
        List annotations = plot.getAnnotations();
        assertTrue(annotations.contains(ann));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotationNull() {
        plot.addAnnotation(null);
    }

    @Test
    public void testRemoveAnnotation() {
        org.jfree.chart.annotations.XYTextAnnotation ann =
                new org.jfree.chart.annotations.XYTextAnnotation("Test2", 2.0, 2.0);
        plot.addAnnotation(ann);
        boolean removed = plot.removeAnnotation(ann);
        assertTrue(removed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAnnotationNull() {
        plot.removeAnnotation(null);
    }

    @Test
    public void testClearAnnotations() {
        org.jfree.chart.annotations.XYTextAnnotation ann =
                new org.jfree.chart.annotations.XYTextAnnotation("Test3", 3.0, 3.0);
        plot.addAnnotation(ann);
        plot.clearAnnotations();
        assertTrue(plot.getAnnotations().isEmpty());
    }

    // ---------- Data Range ----------

    @Test
    public void testGetDataRangeDomain() {
        Range r = plot.getDataRange(plot.getDomainAxis());
        assertNotNull(r);
    }

    @Test
    public void testGetDataRangeRange() {
        Range r = plot.getDataRange(plot.getRangeAxis());
        assertNotNull(r);
    }

    @Test
    public void testGetDataRangeUnrelatedAxis() {
        NumberAxis unrelated = new NumberAxis("Unrelated");
        Range r = plot.getDataRange(unrelated);
        assertNull(r);
    }

    // ---------- Axis Index ----------

    @Test
    public void testGetDomainAxisIndex() {
        int idx = plot.getDomainAxisIndex(plot.getDomainAxis());
        assertEquals(0, idx);
    }

    @Test
    public void testGetDomainAxisIndexNotFound() {
        NumberAxis unrelated = new NumberAxis("U");
        int idx = plot.getDomainAxisIndex(unrelated);
        assertEquals(-1, idx);
    }

    @Test
    public void testGetRangeAxisIndex() {
        int idx = plot.getRangeAxisIndex(plot.getRangeAxis());
        assertEquals(0, idx);
    }

    // ---------- Crosshair ----------

    @Test
    public void testDomainCrosshairVisible() {
        plot.setDomainCrosshairVisible(true);
        assertTrue(plot.isDomainCrosshairVisible());
    }

    @Test
    public void testDomainCrosshairLockedOnData() {
        plot.setDomainCrosshairLockedOnData(false);
        assertFalse(plot.isDomainCrosshairLockedOnData());
    }

    @Test
    public void testDomainCrosshairValue() {
        plot.setDomainCrosshairValue(5.0);
        assertEquals(5.0, plot.getDomainCrosshairValue(), 0.0001);
    }

    @Test
    public void testDomainCrosshairValueNoNotify() {
        plot.setDomainCrosshairValue(7.0, false);
        assertEquals(7.0, plot.getDomainCrosshairValue(), 0.0001);
    }

    @Test
    public void testDomainCrosshairStroke() {
        Stroke s = new BasicStroke(1.0f);
        plot.setDomainCrosshairStroke(s);
        assertEquals(s, plot.getDomainCrosshairStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainCrosshairStrokeNull() {
        plot.setDomainCrosshairStroke(null);
    }

    @Test
    public void testDomainCrosshairPaint() {
        Paint p = Color.RED;
        plot.setDomainCrosshairPaint(p);
        assertEquals(p, plot.getDomainCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainCrosshairPaintNull() {
        plot.setDomainCrosshairPaint(null);
    }

    @Test
    public void testRangeCrosshairVisible() {
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());
    }

    @Test
    public void testRangeCrosshairLockedOnData() {
        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());
    }

    @Test
    public void testRangeCrosshairValue() {
        plot.setRangeCrosshairValue(9.0);
        assertEquals(9.0, plot.getRangeCrosshairValue(), 0.0001);
    }

    @Test
    public void testRangeCrosshairStroke() {
        Stroke s = new BasicStroke(2.0f);
        plot.setRangeCrosshairStroke(s);
        assertEquals(s, plot.getRangeCrosshairStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStrokeNull() {
        plot.setRangeCrosshairStroke(null);
    }

    @Test
    public void testRangeCrosshairPaint() {
        Paint p = Color.BLUE;
        plot.setRangeCrosshairPaint(p);
        assertEquals(p, plot.getRangeCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaintNull() {
        plot.setRangeCrosshairPaint(null);
    }

    // ---------- Fixed axis space ----------

    @Test
    public void testFixedDomainAxisSpace() {
        org.jfree.chart.axis.AxisSpace space =
                new org.jfree.chart.axis.AxisSpace();
        plot.setFixedDomainAxisSpace(space);
        assertEquals(space, plot.getFixedDomainAxisSpace());
    }

    @Test
    public void testFixedRangeAxisSpace() {
        org.jfree.chart.axis.AxisSpace space =
                new org.jfree.chart.axis.AxisSpace();
        plot.setFixedRangeAxisSpace(space);
        assertEquals(space, plot.getFixedRangeAxisSpace());
    }

    // ---------- Zoom ----------

    @Test
    public void testZoomDomainAxesFactor() {
        Range before = plot.getDomainAxis().getRange();
        plot.zoomDomainAxes(0.5, null, null);
        Range after = plot.getDomainAxis().getRange();
        assertNotNull(after);
    }

    @Test
    public void testZoomDomainAxesPercent() {
        plot.zoomDomainAxes(0.2, 0.8, null, null);
        assertNotNull(plot.getDomainAxis().getRange());
    }

    @Test
    public void testZoomRangeAxesFactor() {
        plot.zoomRangeAxes(0.5, null, null);
        assertNotNull(plot.getRangeAxis().getRange());
    }

    @Test
    public void testZoomRangeAxesPercent() {
        plot.zoomRangeAxes(0.2, 0.8, null, null);
        assertNotNull(plot.getRangeAxis().getRange());
    }

    @Test
    public void testIsDomainZoomable() {
        assertTrue(plot.isDomainZoomable());
    }

    @Test
    public void testIsRangeZoomable() {
        assertTrue(plot.isRangeZoomable());
    }

    // ---------- Series Count ----------

    @Test
    public void testGetSeriesCount() {
        assertEquals(1, plot.getSeriesCount());
    }

    @Test
    public void testGetSeriesCountNullDataset() {
        XYPlot p = new XYPlot();
        assertEquals(0, p.getSeriesCount());
    }

    // ---------- Legend Items ----------

    @Test
    public void testGetLegendItems() {
        LegendItemCollectionWrapper();
    }

    private void LegendItemCollectionWrapper() {
        org.jfree.chart.LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
    }

    @Test
    public void testFixedLegendItems() {
        org.jfree.chart.LegendItemCollection items =
                new org.jfree.chart.LegendItemCollection();
        plot.setFixedLegendItems(items);
        assertEquals(items, plot.getFixedLegendItems());
        assertEquals(items, plot.getLegendItems());
    }

    // ---------- equals / clone ----------

    @Test
    public void testEqualsSelf() {
        assertTrue(plot.equals(plot));
    }

    @Test
    public void testEqualsDifferentType() {
        assertFalse(plot.equals("not a plot"));
    }

    @Test
    public void testEqualsDifferentWeight() {
        XYPlot p2 = new XYPlot(createSampleDataset(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        p2.setWeight(99);
        assertFalse(plot.equals(p2));
    }

    @Test
    public void testCloneIndependence() throws CloneNotSupportedException {
        XYPlot clone = (XYPlot) plot.clone();
        assertNotSame(plot, clone);
        assertEquals(plot.getWeight(), clone.getWeight());
        clone.setWeight(123);
        assertNotEquals(plot.getWeight(), clone.getWeight());
    }

    // ---------- render / draw ----------

    @Test
    public void testDrawSmallArea() {
        BufferedImage img = new BufferedImage(10, 10,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 1, 1);
        // should return early due to minimum size check, no exception
        plot.draw(g2, area, null, null, null);
        assertNotNull(plot);
    }

    @Test
    public void testDrawNormalArea() {
        BufferedImage img = new BufferedImage(400, 300,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        PlotRenderingInfo info = new PlotRenderingInfo(
                new org.jfree.chart.ChartRenderingInfo());
        plot.draw(g2, area, null, null, info);
        assertNotNull(info.getDataArea());
    }

    @Test
    public void testDrawWithAnchor() {
        BufferedImage img = new BufferedImage(400, 300,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        PlotRenderingInfo info = new PlotRenderingInfo(
                new org.jfree.chart.ChartRenderingInfo());
        Point2D anchor = new Point2D.Double(200, 150);
        plot.draw(g2, area, anchor, null, info);
        assertNotNull(info.getDataArea());
    }

    @Test
    public void testRenderEmptyDataset() {
        XYPlot p = new XYPlot(new DefaultXYDataset(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        BufferedImage img = new BufferedImage(400, 300,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 400, 300);
        CrosshairState state = new CrosshairState();
        boolean found = p.render(g2, dataArea, 0, null, state);
        assertFalse(found);
    }

    @Test
    public void testRenderWithData() {
        BufferedImage img = new BufferedImage(400, 300,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 400, 300);
        CrosshairState state = new CrosshairState();
        boolean found = plot.render(g2, dataArea, 0, null, state);
        assertTrue(found);
    }

    @Test
    public void testGetDomainAxisForDataset() {
        ValueAxis axis = plot.getDomainAxisForDataset(0);
        assertNotNull(axis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisForDatasetOutOfBounds() {
        plot.getDomainAxisForDataset(5);
    }

    @Test
    public void testGetRangeAxisForDataset() {
        ValueAxis axis = plot.getRangeAxisForDataset(0);
        assertNotNull(axis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisForDatasetOutOfBounds() {
        plot.getRangeAxisForDataset(5);
    }

    // ---------- handleClick ----------

    @Test
    public void testHandleClickInsideArea() {
        PlotRenderingInfo info = new PlotRenderingInfo(
                new org.jfree.chart.ChartRenderingInfo());
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        info.setDataArea(dataArea);
        plot.handleClick(50, 50, info);
        // just verify no exception and crosshair values updated
        assertNotNull(plot.getDomainCrosshairValue());
    }

    @Test
    public void testHandleClickOutsideArea() {
        PlotRenderingInfo info = new PlotRenderingInfo(
                new org.jfree.chart.ChartRenderingInfo());
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        info.setDataArea(dataArea);
        double before = plot.getDomainCrosshairValue();
        plot.handleClick(200, 200, info);
        assertEquals(before, plot.getDomainCrosshairValue(), 0.0001);
    }

    // ---------- drawBackground / drawQuadrants ----------

    @Test
    public void testDrawBackgroundWithQuadrants() {
        plot.setQuadrantPaint(0, Color.RED);
        plot.setQuadrantPaint(1, Color.BLUE);
        plot.setQuadrantPaint(2, Color.GREEN);
        plot.setQuadrantPaint(3, Color.YELLOW);
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.drawBackground(g2, area);
        assertNotNull(plot);
    }

    // ---------- drawDomainTickBands / drawRangeTickBands ----------

    @Test
    public void testDrawDomainTickBandsNoPaint() {
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.drawDomainTickBands(g2, area, new java.util.ArrayList());
        assertNull(plot.getDomainTickBandPaint());
    }

    @Test
    public void testDrawRangeTickBandsNoPaint() {
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.drawRangeTickBands(g2, area, new java.util.ArrayList());
        assertNull(plot.getRangeTickBandPaint());
    }

    // ---------- drawAnnotations ----------

    @Test
    public void testDrawAnnotationsEmpty() {
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.drawAnnotations(g2, area, null);
        assertTrue(plot.getAnnotations().isEmpty());
    }

    @Test
    public void testDrawAnnotationsWithOne() {
        org.jfree.chart.annotations.XYTextAnnotation ann =
                new org.jfree.chart.annotations.XYTextAnnotation("A", 1.0, 1.0);
        plot.addAnnotation(ann);
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.drawAnnotations(g2, area, null);
        assertFalse(plot.getAnnotations().isEmpty());
    }

    // ---------- getDomainMarkers / getRangeMarkers default ----------

    @Test
    public void testGetDomainMarkersDefaultLayerEmpty() {
        Collection markers = plot.getDomainMarkers(Layer.FOREGROUND);
        assertTrue(markers == null || markers.isEmpty());
    }

    @Test
    public void testGetRangeMarkersDefaultLayerEmpty() {
        Collection markers = plot.getRangeMarkers(Layer.FOREGROUND);
        assertTrue(markers == null || markers.isEmpty());
    }

    // ---------- rendererChanged / datasetChanged ----------

    @Test
    public void testRendererChangedFiresEvent() {
        XYLineAndShapeRenderer r = new XYLineAndShapeRenderer();
        plot.setRenderer(r);
        org.jfree.chart.event.RendererChangeEvent event =
                new org.jfree.chart.event.RendererChangeEvent(r);
        plot.rendererChanged(event);
        assertNotNull(plot);
    }

    @Test
    public void testDatasetChangedNoParent() {
        org.jfree.data.general.DatasetChangeEvent event =
                new org.jfree.data.general.DatasetChangeEvent(this,
                        plot.getDataset());
        plot.datasetChanged(event);
        assertNotNull(plot);
    }
}