package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import org.junit.Test;

public class XYPlotTest {

    private XYPlot createSamplePlot() {
        XYSeries series = new XYSeries("S1");
        series.add(1.0, 1.0);
        series.add(2.0, 4.0);
        series.add(3.0, 9.0);
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        NumberAxis domainAxis = new NumberAxis("X");
        NumberAxis rangeAxis = new NumberAxis("Y");
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        return new XYPlot(dataset, domainAxis, rangeAxis, renderer);
    }

    // -----------------------------------------------------------------
    // Constructors / basic
    // -----------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        XYPlot plot = new XYPlot();
        assertNull(plot.getDataset());
        assertNull(plot.getDomainAxis());
        assertNull(plot.getRangeAxis());
        assertNull(plot.getRenderer());
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
    }

    @Test
    public void testConstructorWithArgs() {
        XYPlot plot = createSamplePlot();
        assertNotNull(plot.getDataset());
        assertNotNull(plot.getDomainAxis());
        assertNotNull(plot.getRangeAxis());
        assertNotNull(plot.getRenderer());
    }

    @Test
    public void testGetPlotType() {
        XYPlot plot = new XYPlot();
        assertNotNull(plot.getPlotType());
    }

    // -----------------------------------------------------------------
    // Orientation
    // -----------------------------------------------------------------

    @Test
    public void testOrientation() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOrientationNullThrows() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(null);
    }

    // -----------------------------------------------------------------
    // Axis offset
    // -----------------------------------------------------------------

    @Test
    public void testAxisOffset() {
        XYPlot plot = new XYPlot();
        RectangleInsets insets = new RectangleInsets(1, 2, 3, 4);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAxisOffsetNullThrows() {
        XYPlot plot = new XYPlot();
        plot.setAxisOffset(null);
    }

    // -----------------------------------------------------------------
    // Domain axis
    // -----------------------------------------------------------------

    @Test
    public void testDomainAxisGetSet() {
        XYPlot plot = new XYPlot();
        NumberAxis axis = new NumberAxis("domain");
        plot.setDomainAxis(axis);
        assertEquals(axis, plot.getDomainAxis());
    }

    @Test
    public void testDomainAxisIndexed() {
        XYPlot plot = new XYPlot();
        NumberAxis axis0 = new NumberAxis("a0");
        NumberAxis axis1 = new NumberAxis("a1");
        plot.setDomainAxis(0, axis0);
        plot.setDomainAxis(1, axis1);
        assertEquals(axis0, plot.getDomainAxis(0));
        assertEquals(axis1, plot.getDomainAxis(1));
        assertEquals(2, plot.getDomainAxisCount());
    }

    @Test
    public void testSetDomainAxes() {
        XYPlot plot = new XYPlot();
        NumberAxis a0 = new NumberAxis("a0");
        NumberAxis a1 = new NumberAxis("a1");
        plot.setDomainAxes(new ValueAxis[] {a0, a1});
        assertEquals(a0, plot.getDomainAxis(0));
        assertEquals(a1, plot.getDomainAxis(1));
    }

    @Test
    public void testDomainAxisLocation() {
        XYPlot plot = new XYPlot();
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_LEFT);
        assertEquals(AxisLocation.TOP_OR_LEFT, plot.getDomainAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDomainAxisLocationNullIndexZeroThrows() {
        XYPlot plot = new XYPlot();
        plot.setDomainAxisLocation(0, null, true);
    }

    @Test
    public void testDomainAxisLocationIndexedNonZeroNullAllowed() {
        XYPlot plot = new XYPlot();
        plot.setDomainAxisLocation(1, null, true);
        // fallback to opposite of index 0 location
        assertNotNull(plot.getDomainAxisLocation(1));
    }

    @Test
    public void testDomainAxisEdge() {
        XYPlot plot = new XYPlot();
        RectangleEdge edge = plot.getDomainAxisEdge();
        assertNotNull(edge);
    }

    @Test
    public void testDomainAxisCount() {
        XYPlot plot = new XYPlot();
        assertEquals(1, plot.getDomainAxisCount());
    }

    @Test
    public void testClearDomainAxes() {
        XYPlot plot = createSamplePlot();
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testConfigureDomainAxes() {
        XYPlot plot = createSamplePlot();
        plot.configureDomainAxes();
        assertNotNull(plot.getDomainAxis());
    }

    // -----------------------------------------------------------------
    // Range axis
    // -----------------------------------------------------------------

    @Test
    public void testRangeAxisGetSet() {
        XYPlot plot = new XYPlot();
        NumberAxis axis = new NumberAxis("range");
        plot.setRangeAxis(axis);
        assertEquals(axis, plot.getRangeAxis());
    }

    @Test
    public void testRangeAxisIndexed() {
        XYPlot plot = new XYPlot();
        NumberAxis axis0 = new NumberAxis("r0");
        NumberAxis axis1 = new NumberAxis("r1");
        plot.setRangeAxis(0, axis0);
        plot.setRangeAxis(1, axis1);
        assertEquals(axis0, plot.getRangeAxis(0));
        assertEquals(axis1, plot.getRangeAxis(1));
        assertEquals(2, plot.getRangeAxisCount());
    }

    @Test
    public void testSetRangeAxes() {
        XYPlot plot = new XYPlot();
        NumberAxis a0 = new NumberAxis("r0");
        NumberAxis a1 = new NumberAxis("r1");
        plot.setRangeAxes(new ValueAxis[] {a0, a1});
        assertEquals(a0, plot.getRangeAxis(0));
        assertEquals(a1, plot.getRangeAxis(1));
    }

    @Test
    public void testRangeAxisLocation() {
        XYPlot plot = new XYPlot();
        plot.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getRangeAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRangeAxisLocationNullIndexZeroThrows() {
        XYPlot plot = new XYPlot();
        plot.setRangeAxisLocation(0, null, true);
    }

    @Test
    public void testRangeAxisEdge() {
        XYPlot plot = new XYPlot();
        assertNotNull(plot.getRangeAxisEdge());
    }

    @Test
    public void testRangeAxisCount() {
        XYPlot plot = new XYPlot();
        assertEquals(1, plot.getRangeAxisCount());
    }

    @Test
    public void testClearRangeAxes() {
        XYPlot plot = createSamplePlot();
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testConfigureRangeAxes() {
        XYPlot plot = createSamplePlot();
        plot.configureRangeAxes();
        assertNotNull(plot.getRangeAxis());
    }

    // -----------------------------------------------------------------
    // Dataset
    // -----------------------------------------------------------------

    @Test
    public void testDatasetGetSet() {
        XYPlot plot = new XYPlot();
        XYSeriesCollection ds = new XYSeriesCollection();
        plot.setDataset(ds);
        assertEquals(ds, plot.getDataset());
    }

    @Test
    public void testDatasetCount() {
        XYPlot plot = createSamplePlot();
        assertEquals(1, plot.getDatasetCount());
    }

    @Test
    public void testIndexOf() {
        XYPlot plot = createSamplePlot();
        XYDataset ds = plot.getDataset(0);
        assertEquals(0, plot.indexOf(ds));
        assertEquals(-1, plot.indexOf(new XYSeriesCollection()));
    }

    // -----------------------------------------------------------------
    // Dataset to axes mapping
    // -----------------------------------------------------------------

    @Test
    public void testMapDatasetToDomainAxis() {
        XYPlot plot = createSamplePlot();
        plot.setDomainAxis(1, new NumberAxis("extra"));
        plot.mapDatasetToDomainAxis(0, 1);
        assertEquals(plot.getDomainAxis(1), plot.getDomainAxisForDataset(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToDomainAxesNegativeIndexThrows() {
        XYPlot plot = createSamplePlot();
        List indices = new ArrayList();
        indices.add(new Integer(0));
        plot.mapDatasetToDomainAxes(-1, indices);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToDomainAxesEmptyListThrows() {
        XYPlot plot = createSamplePlot();
        plot.mapDatasetToDomainAxes(0, new ArrayList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToDomainAxesNonIntegerThrows() {
        XYPlot plot = createSamplePlot();
        List indices = new ArrayList();
        indices.add("not an integer");
        plot.mapDatasetToDomainAxes(0, indices);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToDomainAxesDuplicateThrows() {
        XYPlot plot = createSamplePlot();
        List indices = new ArrayList();
        indices.add(new Integer(0));
        indices.add(new Integer(0));
        plot.mapDatasetToDomainAxes(0, indices);
    }

    @Test
    public void testMapDatasetToRangeAxis() {
        XYPlot plot = createSamplePlot();
        plot.setRangeAxis(1, new NumberAxis("extra"));
        plot.mapDatasetToRangeAxis(0, 1);
        assertEquals(plot.getRangeAxis(1), plot.getRangeAxisForDataset(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToRangeAxesNegativeIndexThrows() {
        XYPlot plot = createSamplePlot();
        List indices = new ArrayList();
        indices.add(new Integer(0));
        plot.mapDatasetToRangeAxes(-1, indices);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToRangeAxesEmptyListThrows() {
        XYPlot plot = createSamplePlot();
        plot.mapDatasetToRangeAxes(0, new ArrayList());
    }

    // -----------------------------------------------------------------
    // Renderer
    // -----------------------------------------------------------------

    @Test
    public void testRendererGetSet() {
        XYPlot plot = new XYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(renderer);
        assertEquals(renderer, plot.getRenderer());
    }

    @Test
    public void testRendererIndexed() {
        XYPlot plot = new XYPlot();
        XYLineAndShapeRenderer r0 = new XYLineAndShapeRenderer();
        XYLineAndShapeRenderer r1 = new XYLineAndShapeRenderer();
        plot.setRenderer(0, r0);
        plot.setRenderer(1, r1);
        assertEquals(r0, plot.getRenderer(0));
        assertEquals(r1, plot.getRenderer(1));
        assertEquals(2, plot.getRendererCount());
    }

    @Test
    public void testSetRenderers() {
        XYPlot plot = new XYPlot();
        XYLineAndShapeRenderer r0 = new XYLineAndShapeRenderer();
        XYLineAndShapeRenderer r1 = new XYLineAndShapeRenderer();
        plot.setRenderers(new XYItemRenderer[] {r0, r1});
        assertEquals(r0, plot.getRenderer(0));
        assertEquals(r1, plot.getRenderer(1));
    }

    @Test
    public void testDatasetRenderingOrder() {
        XYPlot plot = new XYPlot();
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD,
                plot.getDatasetRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDatasetRenderingOrderNullThrows() {
        XYPlot plot = new XYPlot();
        plot.setDatasetRenderingOrder(null);
    }

    @Test
    public void testSeriesRenderingOrder() {
        XYPlot plot = new XYPlot();
        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        assertEquals(SeriesRenderingOrder.FORWARD,
                plot.getSeriesRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSeriesRenderingOrderNullThrows() {
        XYPlot plot = new XYPlot();
        plot.setSeriesRenderingOrder(null);
    }

    @Test
    public void testGetIndexOf() {
        XYPlot plot = createSamplePlot();
        XYItemRenderer r = plot.getRenderer();
        assertEquals(0, plot.getIndexOf(r));
        assertEquals(-1, plot.getIndexOf(new XYLineAndShapeRenderer()));
    }

    @Test
    public void testGetRendererForDataset() {
        XYPlot plot = createSamplePlot();
        XYDataset ds = plot.getDataset(0);
        assertEquals(plot.getRenderer(0), plot.getRendererForDataset(ds));
        assertNull(plot.getRendererForDataset(new XYSeriesCollection()));
    }

    // -----------------------------------------------------------------
    // Weight
    // -----------------------------------------------------------------

    @Test
    public void testWeight() {
        XYPlot plot = new XYPlot();
        plot.setWeight(5);
        assertEquals(5, plot.getWeight());
    }

    // -----------------------------------------------------------------
    // Gridlines
    // -----------------------------------------------------------------

    @Test
    public void testDomainGridlinesVisible() {
        XYPlot plot = new XYPlot();
        plot.setDomainGridlinesVisible(false);
        assertFalse(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testDomainGridlineStroke() {
        XYPlot plot = new XYPlot();
        Stroke s = new BasicStroke(2.0f);
        plot.setDomainGridlineStroke(s);
        assertEquals(s, plot.getDomainGridlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDomainGridlineStrokeNullThrows() {
        XYPlot plot = new XYPlot();
        plot.setDomainGridlineStroke(null);
    }

    @Test
    public void testDomainGridlinePaint() {
        XYPlot plot = new XYPlot();
        plot.setDomainGridlinePaint(Color.RED);
        assertEquals(Color.RED, plot.getDomainGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDomainGridlinePaintNullThrows() {
        XYPlot plot = new XYPlot();
        plot.setDomainGridlinePaint(null);
    }

    @Test
    public void testDomainMinorGridlinesVisible() {
        XYPlot plot = new XYPlot();
        plot.setDomainMinorGridlinesVisible(true);
        assertTrue(plot.isDomainMinorGridlinesVisible());
    }

    @Test
    public void testDomainMinorGridlineStroke() {
        XYPlot plot = new XYPlot();
        Stroke s = new BasicStroke(3.0f);
        plot.setDomainMinorGridlineStroke(s);
        assertEquals(s, plot.getDomainMinorGridlineStroke());
    }

    @Test
    public void testDomainMinorGridlinePaint() {
        XYPlot plot = new XYPlot();
        plot.setDomainMinorGridlinePaint(Color.BLUE);
        assertEquals(Color.BLUE, plot.getDomainMinorGridlinePaint());
    }

    @Test
    public void testRangeGridlinesVisible() {
        XYPlot plot = new XYPlot();
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
    }

    @Test
    public void testRangeGridlineStroke() {
        XYPlot plot = new XYPlot();
        Stroke s = new BasicStroke(1.5f);
        plot.setRangeGridlineStroke(s);
        assertEquals(s, plot.getRangeGridlineStroke());
    }

    @Test
    public void testRangeGridlinePaint() {
        XYPlot plot = new XYPlot();
        plot.setRangeGridlinePaint(Color.GREEN);
        assertEquals(Color.GREEN, plot.getRangeGridlinePaint());
    }

    @Test
    public void testRangeMinorGridlinesVisible() {
        XYPlot plot = new XYPlot();
        plot.setRangeMinorGridlinesVisible(true);
        assertTrue(plot.isRangeMinorGridlinesVisible());
    }

    @Test
    public void testRangeMinorGridlineStroke() {
        XYPlot plot = new XYPlot();
        Stroke s = new BasicStroke(2.5f);
        plot.setRangeMinorGridlineStroke(s);
        assertEquals(s, plot.getRangeMinorGridlineStroke());
    }

    @Test
    public void testRangeMinorGridlinePaint() {
        XYPlot plot = new XYPlot();
        plot.setRangeMinorGridlinePaint(Color.YELLOW);
        assertEquals(Color.YELLOW, plot.getRangeMinorGridlinePaint());
    }

    // -----------------------------------------------------------------
    // Zero baseline
    // -----------------------------------------------------------------

    @Test
    public void testDomainZeroBaselineVisible() {
        XYPlot plot = new XYPlot();
        plot.setDomainZeroBaselineVisible(true);
        assertTrue(plot.isDomainZeroBaselineVisible());
    }

    @Test
    public void testDomainZeroBaselineStroke() {
        XYPlot plot = new XYPlot();
        Stroke s = new BasicStroke(1.0f);
        plot.setDomainZeroBaselineStroke(s);
        assertEquals(s, plot.getDomainZeroBaselineStroke());
    }

    @Test
    public void testDomainZeroBaselinePaint() {
        XYPlot plot = new XYPlot();
        plot.setDomainZeroBaselinePaint(Color.MAGENTA);
        assertEquals(Color.MAGENTA, plot.getDomainZeroBaselinePaint());
    }

    @Test
    public void testRangeZeroBaselineVisible() {
        XYPlot plot = new XYPlot();
        plot.setRangeZeroBaselineVisible(true);
        assertTrue(plot.isRangeZeroBaselineVisible());
    }

    @Test
    public void testRangeZeroBaselineStroke() {
        XYPlot plot = new XYPlot();
        Stroke s = new BasicStroke(1.0f);
        plot.setRangeZeroBaselineStroke(s);
        assertEquals(s, plot.getRangeZeroBaselineStroke());
    }

    @Test
    public void testRangeZeroBaselinePaint() {
        XYPlot plot = new XYPlot();
        plot.setRangeZeroBaselinePaint(Color.CYAN);
        assertEquals(Color.CYAN, plot.getRangeZeroBaselinePaint());
    }

    // -----------------------------------------------------------------
    // Tick band paint
    // -----------------------------------------------------------------

    @Test
    public void testDomainTickBandPaint() {
        XYPlot plot = new XYPlot();
        plot.setDomainTickBandPaint(Color.GRAY);
        assertEquals(Color.GRAY, plot.getDomainTickBandPaint());
    }

    @Test
    public void testRangeTickBandPaint() {
        XYPlot plot = new XYPlot();
        plot.setRangeTickBandPaint(Color.ORANGE);
        assertEquals(Color.ORANGE, plot.getRangeTickBandPaint());
    }

    // -----------------------------------------------------------------
    // Quadrant
    // -----------------------------------------------------------------

    @Test
    public void testQuadrantOrigin() {
        XYPlot plot = new XYPlot();
        Point2D p = new Point2D.Double(1.0, 2.0);
        plot.setQuadrantOrigin(p);
        assertEquals(p, plot.getQuadrantOrigin());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuadrantOriginNullThrows() {
        XYPlot plot = new XYPlot();
        plot.setQuadrantOrigin(null);
    }

    @Test
    public void testQuadrantPaint() {
        XYPlot plot = new XYPlot();
        plot.setQuadrantPaint(0, Color.RED);
        plot.setQuadrantPaint(3, Color.BLUE);
        assertEquals(Color.RED, plot.getQuadrantPaint(0));
        assertEquals(Color.BLUE, plot.getQuadrantPaint(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuadrantPaintIndexTooLowThrows() {
        XYPlot plot = new XYPlot();
        plot.getQuadrantPaint(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuadrantPaintIndexTooHighThrows() {
        XYPlot plot = new XYPlot();
        plot.setQuadrantPaint(4, Color.RED);
    }

    // -----------------------------------------------------------------
    // Markers
    // -----------------------------------------------------------------

    @Test
    public void testAddDomainMarker() {
        XYPlot plot = createSamplePlot();
        ValueMarker marker = new ValueMarker(2.0);
        plot.addDomainMarker(marker);
        Collection markers = plot.getDomainMarkers(Layer.FOREGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
    }

    @Test
    public void testAddDomainMarkerBackground() {
        XYPlot plot = createSamplePlot();
        ValueMarker marker = new ValueMarker(2.0);
        plot.addDomainMarker(marker, Layer.BACKGROUND);
        Collection markers = plot.getDomainMarkers(Layer.BACKGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
    }

    @Test
    public void testClearDomainMarkers() {
        XYPlot plot = createSamplePlot();
        ValueMarker marker = new ValueMarker(2.0);
        plot.addDomainMarker(marker);
        plot.clearDomainMarkers();
        Collection markers = plot.getDomainMarkers(Layer.FOREGROUND);
        assertTrue(markers == null || markers.isEmpty());
    }

    @Test
    public void testClearDomainMarkersIndexed() {
        XYPlot plot = createSamplePlot();
        ValueMarker marker = new ValueMarker(2.0);
        plot.addDomainMarker(0, marker, Layer.FOREGROUND);
        plot.clearDomainMarkers(0);
        Collection markers = plot.getDomainMarkers(0, Layer.FOREGROUND);
        assertTrue(markers == null || markers.isEmpty());
    }

    @Test
    public void testRemoveDomainMarker() {
        XYPlot plot = createSamplePlot();
        ValueMarker marker = new ValueMarker(2.0);
        plot.addDomainMarker(marker);
        boolean removed = plot.removeDomainMarker(marker);
        assertTrue(removed);
        boolean removedAgain = plot.removeDomainMarker(marker);
        assertFalse(removedAgain);
    }

    @Test
    public void testAddRangeMarker() {
        XYPlot plot = createSamplePlot();
        ValueMarker marker = new ValueMarker(3.0);
        plot.addRangeMarker(marker);
        Collection markers = plot.getRangeMarkers(Layer.FOREGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
    }

    @Test
    public void testClearRangeMarkers() {
        XYPlot plot = createSamplePlot();
        ValueMarker marker = new ValueMarker(3.0);
        plot.addRangeMarker(marker);
        plot.clearRangeMarkers();
        Collection markers = plot.getRangeMarkers(Layer.FOREGROUND);
        assertTrue(markers == null || markers.isEmpty());
    }

    @Test
    public void testRemoveRangeMarker() {
        XYPlot plot = createSamplePlot();
        ValueMarker marker = new ValueMarker(3.0);
        plot.addRangeMarker(marker);
        boolean removed = plot.removeRangeMarker(marker);
        assertTrue(removed);
        boolean removedAgain = plot.removeRangeMarker(marker);
        assertFalse(removedAgain);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRangeMarkerNullThrows() {
        XYPlot plot = createSamplePlot();
        plot.removeRangeMarker(null, Layer.FOREGROUND);
    }

    // -----------------------------------------------------------------
    // Annotations
    // -----------------------------------------------------------------

    @Test
    public void testAddAnnotationAndGet() {
        XYPlot plot = createSamplePlot();
        org.jfree.chart.annotations.XYTextAnnotation ann =
                new org.jfree.chart.annotations.XYTextAnnotation("test", 1.0, 1.0);
        plot.addAnnotation(ann);
        assertEquals(1, plot.getAnnotations().size());
        assertTrue(plot.getAnnotations().contains(ann));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotationNullThrows() {
        XYPlot plot = createSamplePlot();
        plot.addAnnotation(null);
    }

    @Test
    public void testRemoveAnnotation() {
        XYPlot plot = createSamplePlot();
        org.jfree.chart.annotations.XYTextAnnotation ann =
                new org.jfree.chart.annotations.XYTextAnnotation("test", 1.0, 1.0);
        plot.addAnnotation(ann);
        boolean removed = plot.removeAnnotation(ann);
        assertTrue(removed);
        assertEquals(0, plot.getAnnotations().size());
    }

    @Test
    public void testClearAnnotations() {
        XYPlot plot = createSamplePlot();
        org.jfree.chart.annotations.XYTextAnnotation ann =
                new org.jfree.chart.annotations.XYTextAnnotation("test", 1.0, 1.0);
        plot.addAnnotation(ann);
        plot.clearAnnotations();
        assertEquals(0, plot.getAnnotations().size());
    }

    // -----------------------------------------------------------------
    // draw / drawBackground
    // -----------------------------------------------------------------

    @Test
    public void testDraw() {
        XYPlot plot = createSamplePlot();
        BufferedImage img = new BufferedImage(400, 300,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        PlotRenderingInfo info = new PlotRenderingInfo(
                new ChartRenderingInfo());
        plot.draw(g2, area, null, null, info);
        assertNotNull(info.getDataArea());
        assertTrue(info.getDataArea().getWidth() > 0);
    }

    @Test
    public void testDrawAreaTooSmall() {
        XYPlot plot = createSamplePlot();
        BufferedImage img = new BufferedImage(10, 10,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 0, 0);
        PlotRenderingInfo info = new PlotRenderingInfo(
                new ChartRenderingInfo());
        plot.draw(g2, area, null, null, info);
        // draw returns early; dataArea should not be set on info
        assertNull(info.getDataArea());
    }

    @Test
    public void testDrawBackground() {
        XYPlot plot = createSamplePlot();
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.drawBackground(g2, area);
        // no exception thrown - graphics operations executed
        assertNotNull(g2);
    }

    // -----------------------------------------------------------------
    // handleClick
    // -----------------------------------------------------------------

    @Test
    public void testHandleClick() {
        XYPlot plot = createSamplePlot();
        PlotRenderingInfo info = new PlotRenderingInfo(
                new ChartRenderingInfo());
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 200);
        info.setDataArea(dataArea);
        plot.handleClick(100, 100, info);
        assertFalse(Double.isNaN(plot.getDomainCrosshairValue()));
        assertFalse(Double.isNaN(plot.getRangeCrosshairValue()));
    }

    @Test
    public void testHandleClickOutsideArea() {
        XYPlot plot = createSamplePlot();
        PlotRenderingInfo info = new PlotRenderingInfo(
                new ChartRenderingInfo());
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 200);
        info.setDataArea(dataArea);
        double before = plot.getDomainCrosshairValue();
        plot.handleClick(1000, 1000, info);
        assertEquals(before, plot.getDomainCrosshairValue(), 0.0001);
    }

    // -----------------------------------------------------------------
    // Axis for dataset
    // -----------------------------------------------------------------

    @Test
    public void testGetDomainAxisForDataset() {
        XYPlot plot = createSamplePlot();
        ValueAxis axis = plot.getDomainAxisForDataset(0);
        assertEquals(plot.getDomainAxis(), axis);
    }

    @Test
    public void testGetRangeAxisForDataset() {
        XYPlot plot = createSamplePlot();
        ValueAxis axis = plot.getRangeAxisForDataset(0);
        assertEquals(plot.getRangeAxis(), axis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisForDatasetOutOfBoundsThrows() {
        XYPlot plot = createSamplePlot();
        plot.getDomainAxisForDataset(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisForDatasetOutOfBoundsThrows() {
        XYPlot plot = createSamplePlot();
        plot.getRangeAxisForDataset(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisForDatasetNegativeThrows() {
        XYPlot plot = createSamplePlot();
        plot.getDomainAxisForDataset(-1);
    }

    // -----------------------------------------------------------------
    // Axis index lookup
    // -----------------------------------------------------------------

    @Test
    public void testGetDomainAxisIndex() {
        XYPlot plot = createSamplePlot();
        ValueAxis axis = plot.getDomainAxis();
        assertEquals(0, plot.getDomainAxisIndex(axis));
        assertEquals(-1, plot.getDomainAxisIndex(new NumberAxis("other")));
    }

    @Test
    public void testGetRangeAxisIndex() {
        XYPlot plot = createSamplePlot();
        ValueAxis axis = plot.getRangeAxis();
        assertEquals(0, plot.getRangeAxisIndex(axis));
        assertEquals(-1, plot.getRangeAxisIndex(new NumberAxis("other")));
    }

    // -----------------------------------------------------------------
    // getDataRange
    // -----------------------------------------------------------------

    @Test
    public void testGetDataRangeDomain() {
        XYPlot plot = createSamplePlot();
        ValueAxis axis = plot.getDomainAxis();
        Range range = plot.getDataRange(axis);
        assertNotNull(range);
        assertEquals(1.0, range.getLowerBound(), 0.0001);
        assertEquals(3.0, range.getUpperBound(), 0.0001);
    }

    @Test
    public void testGetDataRangeRange() {
        XYPlot plot = createSamplePlot();
        ValueAxis axis = plot.getRangeAxis();
        Range range = plot.getDataRange(axis);
        assertNotNull(range);
        assertEquals(1.0, range.getLowerBound(), 0.0001);
        assertEquals(9.0, range.getUpperBound(), 0.0001);
    }

    @Test
    public void testGetDataRangeUnmappedAxis() {
        XYPlot plot = createSamplePlot();
        NumberAxis other = new NumberAxis("other");
        Range range = plot.getDataRange(other);
        assertNull(range);
    }

    // -----------------------------------------------------------------
    // datasetChanged / rendererChanged
    // -----------------------------------------------------------------

    @Test
    public void testDatasetChangedNotifiesListener() {
        XYPlot plot = createSamplePlot();
        final boolean[] notified = {false};
        plot.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                notified[0] = true;
            }
        });
        plot.datasetChanged(new DatasetChangeEvent(plot, plot.getDataset()));
        assertTrue(notified[0]);
    }

    @Test
    public void testRendererChangedNotifiesListener() {
        XYPlot plot = createSamplePlot();
        final boolean[] notified = {false};
        plot.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                notified[0] = true;
            }
        });
        plot.rendererChanged(new RendererChangeEvent(plot.getRenderer()));
        assertTrue(notified[0]);
    }

    // -----------------------------------------------------------------
    // Crosshair
    // -----------------------------------------------------------------

    @Test
    public void testDomainCrosshairVisible() {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairVisible(true);
        assertTrue(plot.isDomainCrosshairVisible());
    }

    @Test
    public void testDomainCrosshairLockedOnData() {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairLockedOnData(false);
        assertFalse(plot.isDomainCrosshairLockedOnData());
    }

    @Test
    public void testDomainCrosshairValue() {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairValue(5.5);
        assertEquals(5.5, plot.getDomainCrosshairValue(), 0.0001);
    }

    @Test
    public void testDomainCrosshairStroke() {
        XYPlot plot = new XYPlot();
        Stroke s = new BasicStroke(1.0f);
        plot.setDomainCrosshairStroke(s);
        assertEquals(s, plot.getDomainCrosshairStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDomainCrosshairStrokeNullThrows() {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairStroke(null);
    }

    @Test
    public void testDomainCrosshairPaint() {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairPaint(Color.PINK);
        assertEquals(Color.PINK, plot.getDomainCrosshairPaint());
    }

    @Test
    public void testRangeCrosshairVisible() {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());
    }

    @Test
    public void testRangeCrosshairLockedOnData() {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());
    }

    @Test
    public void testRangeCrosshairValue() {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairValue(7.2);
        assertEquals(7.2, plot.getRangeCrosshairValue(), 0.0001);
    }

    @Test
    public void testRangeCrosshairStroke() {
        XYPlot plot = new XYPlot();
        Stroke s = new BasicStroke(1.0f);
        plot.setRangeCrosshairStroke(s);
        assertEquals(s, plot.getRangeCrosshairStroke());
    }

    @Test
    public void testRangeCrosshairPaint() {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairPaint(Color.PINK);
        assertEquals(Color.PINK, plot.getRangeCrosshairPaint());
    }

    // -----------------------------------------------------------------
    // Fixed axis space
    // -----------------------------------------------------------------

    @Test
    public void testFixedDomainAxisSpace() {
        XYPlot plot = new XYPlot();
        AxisSpace space = new AxisSpace();
        space.setLeft(10.0);
        plot.setFixedDomainAxisSpace(space);
        assertEquals(space, plot.getFixedDomainAxisSpace());
    }

    @Test
    public void testFixedRangeAxisSpace() {
        XYPlot plot = new XYPlot();
        AxisSpace space = new AxisSpace();
        space.setTop(5.0);
        plot.setFixedRangeAxisSpace(space);
        assertEquals(space, plot.getFixedRangeAxisSpace());
    }

    // -----------------------------------------------------------------
    // Pannable
    // -----------------------------------------------------------------

    @Test
    public void testDomainPannable() {
        XYPlot plot = new XYPlot();
        plot.setDomainPannable(true);
        assertTrue(plot.isDomainPannable());
    }

    @Test
    public void testRangePannable() {
        XYPlot plot = new XYPlot();
        plot.setRangePannable(true);
        assertTrue(plot.isRangePannable());
    }

    @Test
    public void testPanDomainAxesWhenNotPannable() {
        XYPlot plot = createSamplePlot();
        plot.setDomainPannable(false);
        double lowerBefore = plot.getDomainAxis().getLowerBound();
        plot.panDomainAxes(0.5, null, null);
        assertEquals(lowerBefore, plot.getDomainAxis().getLowerBound(),
                0.0001);
    }

    @Test
    public void testPanDomainAxesWhenPannable() {
        XYPlot plot = createSamplePlot();
        plot.setDomainPannable(true);
        double lowerBefore = plot.getDomainAxis().getLowerBound();
        plot.panDomainAxes(0.5, null, null);
        double lowerAfter = plot.getDomainAxis().getLowerBound();
        assertNotEquals(lowerBefore, lowerAfter, 0.0001);
    }

    @Test
    public void testPanRangeAxesWhenPannable() {
        XYPlot plot = createSamplePlot();
        plot.setRangePannable(true);
        double lowerBefore = plot.getRangeAxis().getLowerBound();
        plot.panRangeAxes(0.5, null, null);
        double lowerAfter = plot.getRangeAxis().getLowerBound();
        assertNotEquals(lowerBefore, lowerAfter, 0.0001);
    }

    // -----------------------------------------------------------------
    // Zoom
    // -----------------------------------------------------------------

    @Test
    public void testZoomDomainAxesFactor() {
        XYPlot plot = createSamplePlot();
        double rangeBefore = plot.getDomainAxis().getRange().getLength();
        plot.zoomDomainAxes(0.5, null, null);
        double rangeAfter = plot.getDomainAxis().getRange().getLength();
        assertTrue(rangeAfter < rangeBefore);
    }

    @Test
    public void testZoomDomainAxesPercent() {
        XYPlot plot = createSamplePlot();
        plot.zoomDomainAxes(0.25, 0.75, null, null);
        assertNotNull(plot.getDomainAxis().getRange());
    }

    @Test
    public void testZoomRangeAxesFactor() {
        XYPlot plot = createSamplePlot();
        double rangeBefore = plot.getRangeAxis().getRange().getLength();
        plot.zoomRangeAxes(0.5, null, null);
        double rangeAfter = plot.getRangeAxis().getRange().getLength();
        assertTrue(rangeAfter < rangeBefore);
    }

    @Test
    public void testZoomRangeAxesPercent() {
        XYPlot plot = createSamplePlot();
        plot.zoomRangeAxes(0.25, 0.75, null, null);
        assertNotNull(plot.getRangeAxis().getRange());
    }

    @Test
    public void testIsDomainZoomable() {
        XYPlot plot = new XYPlot();
        assertTrue(plot.isDomainZoomable());
    }

    @Test
    public void testIsRangeZoomable() {
        XYPlot plot = new XYPlot();
        assertTrue(plot.isRangeZoomable());
    }

    // -----------------------------------------------------------------
    // Series count
    // -----------------------------------------------------------------

    @Test
    public void testGetSeriesCount() {
        XYPlot plot = createSamplePlot();
        assertEquals(1, plot.getSeriesCount());
    }

    @Test
    public void testGetSeriesCountNoDataset() {
        XYPlot plot = new XYPlot();
        assertEquals(0, plot.getSeriesCount());
    }

    // -----------------------------------------------------------------
    // Legend items
    // -----------------------------------------------------------------

    @Test
    public void testFixedLegendItems() {
        XYPlot plot = createSamplePlot();
        LegendItemCollection items = new LegendItemCollection();
        plot.setFixedLegendItems(items);
        assertEquals(items, plot.getFixedLegendItems());
        assertEquals(items, plot.getLegendItems());
    }

    @Test
    public void testGetLegendItems() {
        XYPlot plot = createSamplePlot();
        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
    }

    // -----------------------------------------------------------------
    // equals / clone
    // -----------------------------------------------------------------

    @Test
    public void testEqualsSameInstance() {
        XYPlot plot = createSamplePlot();
        assertTrue(plot.equals(plot));
    }

    @Test
    public void testEqualsDifferentType() {
        XYPlot plot = createSamplePlot();
        assertFalse(plot.equals("not a plot"));
    }

    @Test
    public void testEqualsDifferentWeight() {
        XYPlot plot1 = createSamplePlot();
        XYPlot plot2 = createSamplePlot();
        plot2.setWeight(99);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testCloneNotSameReference() throws Exception {
        XYPlot plot = createSamplePlot();
        XYPlot clone = (XYPlot) plot.clone();
        assertNotSame(plot, clone);
        assertEquals(plot.getOrientation(), clone.getOrientation());
        assertNotNull(clone.getDataset());
        assertNotSame(plot.getDomainAxis(), clone.getDomainAxis());
    }

    // -----------------------------------------------------------------
    // Selection
    // -----------------------------------------------------------------

    @Test
    public void testCanSelectByPoint() {
        XYPlot plot = new XYPlot();
        assertFalse(plot.canSelectByPoint());
    }

    @Test
    public void testCanSelectByRegion() {
        XYPlot plot = new XYPlot();
        assertTrue(plot.canSelectByRegion());
    }

    @Test
    public void testSelectPointNoException() {
        XYPlot plot = createSamplePlot();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        plot.select(1.0, 1.0, dataArea, null);
        // no-op method, just verify no exception raised
        assertNotNull(plot);
    }

    @Test
    public void testClearSelectionNoException() {
        XYPlot plot = createSamplePlot();
        plot.clearSelection();
        assertNotNull(plot);
    }

    // -----------------------------------------------------------------
    // Markers getters (empty)
    // -----------------------------------------------------------------

    @Test
    public void testGetDomainMarkersEmpty() {
        XYPlot plot = new XYPlot();
        assertNull(plot.getDomainMarkers(Layer.FOREGROUND));
    }

    @Test
    public void testGetRangeMarkersEmpty() {
        XYPlot plot = new XYPlot();
        assertNull(plot.getRangeMarkers(Layer.FOREGROUND));
    }
}