package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;

import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import org.junit.Before;
import org.junit.Test;

public class CategoryPlotTest {

    private DefaultCategoryDataset dataset;
    private CategoryAxis domainAxis;
    private NumberAxis rangeAxis;
    private LineAndShapeRenderer renderer;

    @Before
    public void setUp() {
        dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Series1", "Category1");
        dataset.addValue(2.0, "Series1", "Category2");
        dataset.addValue(3.0, "Series1", "Category3");
        domainAxis = new CategoryAxis("Domain");
        rangeAxis = new NumberAxis("Range");
        renderer = new LineAndShapeRenderer();
    }

    private CategoryPlot createFullPlot() {
        return new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor() {
        CategoryPlot plot = new CategoryPlot();
        assertNull(plot.getDataset());
        assertNull(plot.getDomainAxis());
        assertNull(plot.getRenderer());
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
    }

    @Test
    public void testFullConstructor() {
        CategoryPlot plot = createFullPlot();
        assertSame(dataset, plot.getDataset());
        assertSame(domainAxis, plot.getDomainAxis());
        assertSame(rangeAxis, plot.getRangeAxis());
        assertSame(renderer, plot.getRenderer());
    }

    @Test
    public void testGetPlotType() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals("Category_Plot", plot.getPlotType());
    }

    // ---------- Orientation ----------

    @Test
    public void testOrientation() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(null);
    }

    // ---------- Axis offset ----------

    @Test
    public void testAxisOffset() {
        CategoryPlot plot = new CategoryPlot();
        RectangleInsets insets = new RectangleInsets(1.0, 2.0, 3.0, 4.0);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffsetNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setAxisOffset(null);
    }

    // ---------- Domain axis ----------

    @Test
    public void testDomainAxisGetSet() {
        CategoryPlot plot = createFullPlot();
        CategoryAxis newAxis = new CategoryAxis("New");
        plot.setDomainAxis(newAxis);
        assertSame(newAxis, plot.getDomainAxis());
        assertSame(newAxis, plot.getDomainAxis(0));
    }

    @Test
    public void testDomainAxisOutOfRangeReturnsNull() {
        CategoryPlot plot = createFullPlot();
        assertNull(plot.getDomainAxis(5));
    }

    @Test
    public void testSetDomainAxisMultipleIndex() {
        CategoryPlot plot = createFullPlot();
        CategoryAxis axis2 = new CategoryAxis("Axis2");
        plot.setDomainAxis(2, axis2);
        assertSame(axis2, plot.getDomainAxis(2));
        assertEquals(3, plot.getDomainAxisCount());
    }

    @Test
    public void testSetDomainAxes() {
        CategoryPlot plot = createFullPlot();
        CategoryAxis a1 = new CategoryAxis("A1");
        CategoryAxis a2 = new CategoryAxis("A2");
        plot.setDomainAxes(new CategoryAxis[] {a1, a2});
        assertSame(a1, plot.getDomainAxis(0));
        assertSame(a2, plot.getDomainAxis(1));
    }

    @Test
    public void testGetDomainAxisIndex() {
        CategoryPlot plot = createFullPlot();
        assertEquals(0, plot.getDomainAxisIndex(domainAxis));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisIndexNull() {
        CategoryPlot plot = createFullPlot();
        plot.getDomainAxisIndex(null);
    }

    @Test
    public void testClearDomainAxes() {
        CategoryPlot plot = createFullPlot();
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testConfigureDomainAxes() {
        CategoryPlot plot = createFullPlot();
        plot.configureDomainAxes();
        // no exception thrown
        assertNotNull(plot.getDomainAxis());
    }

    // ---------- Domain axis location ----------

    @Test
    public void testDomainAxisLocation() {
        CategoryPlot plot = createFullPlot();
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocationNullIndex0() {
        CategoryPlot plot = createFullPlot();
        plot.setDomainAxisLocation(0, null);
    }

    @Test
    public void testSetDomainAxisLocationNullIndexNonZero() {
        CategoryPlot plot = createFullPlot();
        plot.setDomainAxisLocation(1, null);
        AxisLocation result = plot.getDomainAxisLocation(1);
        assertNotNull(result);
        assertEquals(AxisLocation.getOpposite(plot.getDomainAxisLocation(0)),
                result);
    }

    @Test
    public void testGetDomainAxisEdge() {
        CategoryPlot plot = createFullPlot();
        RectangleEdge edge = plot.getDomainAxisEdge();
        assertNotNull(edge);
    }

    // ---------- Range axis ----------

    @Test
    public void testRangeAxisGetSet() {
        CategoryPlot plot = createFullPlot();
        NumberAxis newAxis = new NumberAxis("New Range");
        plot.setRangeAxis(newAxis);
        assertSame(newAxis, plot.getRangeAxis());
        assertSame(newAxis, plot.getRangeAxis(0));
    }

    @Test
    public void testRangeAxisOutOfRangeReturnsNull() {
        CategoryPlot plot = createFullPlot();
        assertNull(plot.getRangeAxis(5));
    }

    @Test
    public void testSetRangeAxisMultipleIndex() {
        CategoryPlot plot = createFullPlot();
        NumberAxis axis2 = new NumberAxis("Axis2");
        plot.setRangeAxis(2, axis2);
        assertSame(axis2, plot.getRangeAxis(2));
        assertEquals(3, plot.getRangeAxisCount());
    }

    @Test
    public void testSetRangeAxes() {
        CategoryPlot plot = createFullPlot();
        NumberAxis a1 = new NumberAxis("A1");
        NumberAxis a2 = new NumberAxis("A2");
        plot.setRangeAxes(new ValueAxis[] {a1, a2});
        assertSame(a1, plot.getRangeAxis(0));
        assertSame(a2, plot.getRangeAxis(1));
    }

    @Test
    public void testGetRangeAxisIndex() {
        CategoryPlot plot = createFullPlot();
        assertEquals(0, plot.getRangeAxisIndex(rangeAxis));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisIndexNull() {
        CategoryPlot plot = createFullPlot();
        plot.getRangeAxisIndex(null);
    }

    @Test
    public void testClearRangeAxes() {
        CategoryPlot plot = createFullPlot();
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testConfigureRangeAxes() {
        CategoryPlot plot = createFullPlot();
        plot.configureRangeAxes();
        assertNotNull(plot.getRangeAxis());
    }

    // ---------- Range axis location ----------

    @Test
    public void testRangeAxisLocation() {
        CategoryPlot plot = createFullPlot();
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getRangeAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocationNullIndex0() {
        CategoryPlot plot = createFullPlot();
        plot.setRangeAxisLocation(0, null);
    }

    @Test
    public void testGetRangeAxisEdge() {
        CategoryPlot plot = createFullPlot();
        RectangleEdge edge = plot.getRangeAxisEdge();
        assertNotNull(edge);
    }

    // ---------- Dataset ----------

    @Test
    public void testDatasetGetSet() {
        CategoryPlot plot = createFullPlot();
        DefaultCategoryDataset newDs = new DefaultCategoryDataset();
        newDs.addValue(5.0, "S", "C");
        plot.setDataset(newDs);
        assertSame(newDs, plot.getDataset());
    }

    @Test
    public void testDatasetCount() {
        CategoryPlot plot = createFullPlot();
        assertEquals(1, plot.getDatasetCount());
        plot.setDataset(1, new DefaultCategoryDataset());
        assertEquals(2, plot.getDatasetCount());
    }

    @Test
    public void testGetDatasetOutOfRange() {
        CategoryPlot plot = createFullPlot();
        assertNull(plot.getDataset(10));
    }

    // ---------- Dataset to axis mapping ----------

    @Test
    public void testMapDatasetToDomainAxis() {
        CategoryPlot plot = createFullPlot();
        CategoryAxis axis2 = new CategoryAxis("Axis2");
        plot.setDomainAxis(1, axis2);
        plot.mapDatasetToDomainAxis(0, 1);
        assertSame(axis2, plot.getDomainAxisForDataset(0));
    }

    @Test
    public void testMapDatasetToRangeAxis() {
        CategoryPlot plot = createFullPlot();
        NumberAxis axis2 = new NumberAxis("Axis2");
        plot.setRangeAxis(1, axis2);
        plot.mapDatasetToRangeAxis(0, 1);
        assertSame(axis2, plot.getRangeAxisForDataset(0));
    }

    @Test
    public void testGetDomainAxisForDatasetDefault() {
        CategoryPlot plot = createFullPlot();
        assertSame(domainAxis, plot.getDomainAxisForDataset(0));
    }

    @Test
    public void testGetRangeAxisForDatasetDefault() {
        CategoryPlot plot = createFullPlot();
        assertSame(rangeAxis, plot.getRangeAxisForDataset(0));
    }

    // ---------- Renderer ----------

    @Test
    public void testRendererGetSet() {
        CategoryPlot plot = createFullPlot();
        LineAndShapeRenderer newRenderer = new LineAndShapeRenderer();
        plot.setRenderer(newRenderer);
        assertSame(newRenderer, plot.getRenderer());
    }

    @Test
    public void testGetRendererOutOfRange() {
        CategoryPlot plot = createFullPlot();
        assertNull(plot.getRenderer(10));
    }

    @Test
    public void testSetRenderers() {
        CategoryPlot plot = createFullPlot();
        LineAndShapeRenderer r1 = new LineAndShapeRenderer();
        LineAndShapeRenderer r2 = new LineAndShapeRenderer();
        plot.setRenderers(new CategoryItemRenderer[] {r1, r2});
        assertSame(r1, plot.getRenderer(0));
        assertSame(r2, plot.getRenderer(1));
    }

    @Test
    public void testGetRendererForDataset() {
        CategoryPlot plot = createFullPlot();
        CategoryItemRenderer result = plot.getRendererForDataset(dataset);
        assertSame(renderer, result);
    }

    @Test
    public void testGetRendererForDatasetNotFound() {
        CategoryPlot plot = createFullPlot();
        CategoryDataset other = new DefaultCategoryDataset();
        assertNull(plot.getRendererForDataset(other));
    }

    @Test
    public void testGetIndexOf() {
        CategoryPlot plot = createFullPlot();
        assertEquals(0, plot.getIndexOf(renderer));
        assertEquals(-1, plot.getIndexOf(new LineAndShapeRenderer()));
    }

    // ---------- Rendering orders ----------

    @Test
    public void testDatasetRenderingOrder() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD,
                plot.getDatasetRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDatasetRenderingOrderNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDatasetRenderingOrder(null);
    }

    @Test
    public void testColumnRenderingOrder() {
        CategoryPlot plot = new CategoryPlot();
        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getColumnRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetColumnRenderingOrderNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setColumnRenderingOrder(null);
    }

    @Test
    public void testRowRenderingOrder() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getRowRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRowRenderingOrderNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRowRenderingOrder(null);
    }

    // ---------- Gridlines ----------

    @Test
    public void testDomainGridlinesVisible() {
        CategoryPlot plot = new CategoryPlot();
        assertFalse(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testDomainGridlinePosition() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePosition(CategoryAnchor.START);
        assertEquals(CategoryAnchor.START, plot.getDomainGridlinePosition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePositionNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePosition(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStrokeNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaintNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePaint(null);
    }

    @Test
    public void testRangeGridlinesVisible() {
        CategoryPlot plot = new CategoryPlot();
        assertTrue(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStrokeNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaintNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeGridlinePaint(null);
    }

    // ---------- Legend ----------

    @Test
    public void testFixedLegendItems() {
        CategoryPlot plot = createFullPlot();
        LegendItemCollection items = new LegendItemCollection();
        plot.setFixedLegendItems(items);
        assertSame(items, plot.getFixedLegendItems());
        assertSame(items, plot.getLegendItems());
    }

    @Test
    public void testGetLegendItemsComputed() {
        CategoryPlot plot = createFullPlot();
        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        assertEquals(1, items.getItemCount());
    }

    // ---------- handleClick / zoom ----------

    @Test
    public void testHandleClick() {
        CategoryPlot plot = createFullPlot();
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        info.setDataArea(dataArea);
        plot.handleClick(50, 50, info);
        // Should complete without exception, and update anchor
        assertEquals(plot.getRangeCrosshairValue(), plot.getAnchorValue(),
                0.0001);
    }

    @Test
    public void testHandleClickOutsideDataArea() {
        CategoryPlot plot = createFullPlot();
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        info.setDataArea(dataArea);
        double before = plot.getAnchorValue();
        plot.handleClick(500, 500, info);
        assertEquals(before, plot.getAnchorValue(), 0.0001);
    }

    @Test
    public void testZoomPositive() {
        CategoryPlot plot = createFullPlot();
        plot.getRangeAxis().setRange(0.0, 10.0);
        plot.setAnchorValue(5.0);
        plot.zoom(0.5);
        Range r = plot.getRangeAxis().getRange();
        assertEquals(2.5, r.getLowerBound(), 0.5);
        assertEquals(7.5, r.getUpperBound(), 0.5);
    }

    @Test
    public void testZoomNegativeSetsAutoRange() {
        CategoryPlot plot = createFullPlot();
        plot.getRangeAxis().setAutoRange(false);
        plot.zoom(-1.0);
        assertTrue(plot.getRangeAxis().isAutoRange());
    }

    // ---------- Renderer/Dataset change listeners ----------

    @Test
    public void testDatasetChanged() {
        CategoryPlot plot = createFullPlot();
        final boolean[] fired = {false};
        plot.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                fired[0] = true;
            }
        });
        dataset.addValue(9.0, "Series1", "Category4");
        assertTrue(fired[0]);
    }

    @Test
    public void testRendererChangedNoParent() {
        CategoryPlot plot = createFullPlot();
        final boolean[] fired = {false};
        plot.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                fired[0] = true;
            }
        });
        renderer.setSeriesPaint(0, Color.RED);
        assertTrue(fired[0]);
    }

    // ---------- Domain markers ----------

    @Test
    public void testAddGetRemoveDomainMarker() {
        CategoryPlot plot = createFullPlot();
        CategoryMarker marker = new CategoryMarker("Category1");
        plot.addDomainMarker(marker);
        Collection markers = plot.getDomainMarkers(Layer.FOREGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
        boolean removed = plot.removeDomainMarker(marker);
        assertTrue(removed);
    }

    @Test
    public void testAddDomainMarkerBackgroundLayer() {
        CategoryPlot plot = createFullPlot();
        CategoryMarker marker = new CategoryMarker("Category1");
        plot.addDomainMarker(marker, Layer.BACKGROUND);
        Collection markers = plot.getDomainMarkers(Layer.BACKGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarkerNullMarker() {
        CategoryPlot plot = createFullPlot();
        plot.addDomainMarker(0, null, Layer.FOREGROUND);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarkerNullLayer() {
        CategoryPlot plot = createFullPlot();
        CategoryMarker marker = new CategoryMarker("Category1");
        plot.addDomainMarker(0, marker, null);
    }

    @Test
    public void testClearDomainMarkers() {
        CategoryPlot plot = createFullPlot();
        CategoryMarker marker = new CategoryMarker("Category1");
        plot.addDomainMarker(marker);
        plot.clearDomainMarkers();
        Collection markers = plot.getDomainMarkers(Layer.FOREGROUND);
        assertNull(markers);
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveDomainMarkerNoneAdded() {
        CategoryPlot plot = createFullPlot();
        CategoryMarker marker = new CategoryMarker("Category1");
        plot.removeDomainMarker(marker);
    }

    // ---------- Range markers ----------

    @Test
    public void testAddGetRemoveRangeMarker() {
        CategoryPlot plot = createFullPlot();
        ValueMarker marker = new ValueMarker(5.0);
        plot.addRangeMarker(marker);
        Collection markers = plot.getRangeMarkers(Layer.FOREGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
        boolean removed = plot.removeRangeMarker(marker);
        assertTrue(removed);
    }

    @Test
    public void testAddRangeMarkerBackgroundLayer() {
        CategoryPlot plot = createFullPlot();
        ValueMarker marker = new ValueMarker(5.0);
        plot.addRangeMarker(marker, Layer.BACKGROUND);
        Collection markers = plot.getRangeMarkers(Layer.BACKGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
        boolean removed = plot.removeRangeMarker(marker, Layer.BACKGROUND);
        assertTrue(removed);
    }

    @Test
    public void testClearRangeMarkers() {
        CategoryPlot plot = createFullPlot();
        ValueMarker marker = new ValueMarker(5.0);
        plot.addRangeMarker(marker);
        plot.clearRangeMarkers();
        Collection markers = plot.getRangeMarkers(Layer.FOREGROUND);
        assertNull(markers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRangeMarkerNull() {
        CategoryPlot plot = createFullPlot();
        plot.removeRangeMarker(null);
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveRangeMarkerNoneAdded() {
        CategoryPlot plot = createFullPlot();
        ValueMarker marker = new ValueMarker(5.0);
        plot.removeRangeMarker(marker);
    }

    // ---------- Range crosshair ----------

    @Test
    public void testRangeCrosshairVisible() {
        CategoryPlot plot = new CategoryPlot();
        assertFalse(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());
    }

    @Test
    public void testRangeCrosshairLockedOnData() {
        CategoryPlot plot = new CategoryPlot();
        assertTrue(plot.isRangeCrosshairLockedOnData());
        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());
    }

    @Test
    public void testRangeCrosshairValue() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairValue(42.0);
        assertEquals(42.0, plot.getRangeCrosshairValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStrokeNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaintNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairPaint(null);
    }

    // ---------- Annotations ----------

    @Test
    public void testAddGetRemoveAnnotation() {
        CategoryPlot plot = createFullPlot();
        CategoryTextAnnotation annotation = new CategoryTextAnnotation(
                "Test", "Category1", 2.0);
        plot.addAnnotation(annotation);
        List annotations = plot.getAnnotations();
        assertEquals(1, annotations.size());
        boolean removed = plot.removeAnnotation(annotation);
        assertTrue(removed);
        assertEquals(0, plot.getAnnotations().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotationNull() {
        CategoryPlot plot = createFullPlot();
        plot.addAnnotation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAnnotationNull() {
        CategoryPlot plot = createFullPlot();
        plot.removeAnnotation(null);
    }

    @Test
    public void testClearAnnotations() {
        CategoryPlot plot = createFullPlot();
        CategoryAnnotation annotation = new CategoryTextAnnotation(
                "Test", "Category1", 2.0);
        plot.addAnnotation(annotation);
        plot.clearAnnotations();
        assertEquals(0, plot.getAnnotations().size());
    }

    // ---------- draw / render ----------

    @Test
    public void testDrawNormal() {
        CategoryPlot plot = createFullPlot();
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        plot.draw(g2, area, null, null, info);
        assertNotNull(info.getDataArea());
        g2.dispose();
    }

    @Test
    public void testDrawAreaTooSmall() {
        CategoryPlot plot = createFullPlot();
        BufferedImage img = new BufferedImage(10, 10,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 0, 0);
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        plot.draw(g2, area, null, null, info);
        assertNull(info.getDataArea());
        g2.dispose();
    }

    @Test
    public void testRenderWithData() {
        CategoryPlot plot = createFullPlot();
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 200);
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        boolean found = plot.render(g2, dataArea, 0, info);
        assertTrue(found);
        g2.dispose();
    }

    @Test
    public void testRenderWithEmptyDataset() {
        CategoryPlot plot = createFullPlot();
        plot.setDataset(new DefaultCategoryDataset());
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 200);
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        boolean found = plot.render(g2, dataArea, 0, info);
        assertFalse(found);
        g2.dispose();
    }

    // ---------- getDataRange ----------

    @Test
    public void testGetDataRange() {
        CategoryPlot plot = createFullPlot();
        Range range = plot.getDataRange(rangeAxis);
        assertNotNull(range);
        assertEquals(1.0, range.getLowerBound(), 0.0001);
        assertEquals(3.0, range.getUpperBound(), 0.0001);
    }

    @Test
    public void testGetDataRangeUnknownAxis() {
        CategoryPlot plot = createFullPlot();
        NumberAxis other = new NumberAxis("Other");
        Range range = plot.getDataRange(other);
        assertNull(range);
    }

    // ---------- weight ----------

    @Test
    public void testWeight() {
        CategoryPlot plot = new CategoryPlot();
        plot.setWeight(7);
        assertEquals(7, plot.getWeight());
    }

    // ---------- fixed axis spaces ----------

    @Test
    public void testFixedDomainAxisSpace() {
        CategoryPlot plot = new CategoryPlot();
        AxisSpace space = new AxisSpace();
        space.setLeft(10.0);
        plot.setFixedDomainAxisSpace(space);
        assertSame(space, plot.getFixedDomainAxisSpace());
    }

    @Test
    public void testFixedRangeAxisSpace() {
        CategoryPlot plot = new CategoryPlot();
        AxisSpace space = new AxisSpace();
        space.setLeft(20.0);
        plot.setFixedRangeAxisSpace(space);
        assertSame(space, plot.getFixedRangeAxisSpace());
    }

    // ---------- categories ----------

    @Test
    public void testGetCategories() {
        CategoryPlot plot = createFullPlot();
        List categories = plot.getCategories();
        assertNotNull(categories);
        assertEquals(3, categories.size());
    }

    @Test
    public void testGetCategoriesNullDataset() {
        CategoryPlot plot = new CategoryPlot();
        assertNull(plot.getCategories());
    }

    @Test
    public void testGetCategoriesForAxis() {
        CategoryPlot plot = createFullPlot();
        List categories = plot.getCategoriesForAxis(domainAxis);
        assertNotNull(categories);
        assertEquals(3, categories.size());
    }

    // ---------- drawSharedDomainAxis ----------

    @Test
    public void testDrawSharedDomainAxis() {
        CategoryPlot plot = new CategoryPlot();
        assertFalse(plot.getDrawSharedDomainAxis());
        plot.setDrawSharedDomainAxis(true);
        assertTrue(plot.getDrawSharedDomainAxis());
    }

    // ---------- zoomable ----------

    @Test
    public void testZoomable() {
        CategoryPlot plot = new CategoryPlot();
        assertFalse(plot.isDomainZoomable());
        assertTrue(plot.isRangeZoomable());
    }

    @Test
    public void testZoomDomainAxesNoOp() {
        CategoryPlot plot = createFullPlot();
        plot.zoomDomainAxes(0.5, null, null);
        plot.zoomDomainAxes(0.2, 0.8, null, null);
        plot.zoomDomainAxes(0.5, null, null, true);
        // no exceptions expected
        assertNotNull(plot.getDomainAxis());
    }

    @Test
    public void testZoomRangeAxes() {
        CategoryPlot plot = createFullPlot();
        plot.getRangeAxis().setRange(0.0, 10.0);
        plot.zoomRangeAxes(0.5, (PlotRenderingInfo) null, (Point2D) null);
        Range r = plot.getRangeAxis().getRange();
        assertNotNull(r);
    }

    @Test
    public void testZoomRangeAxesWithPercent() {
        CategoryPlot plot = createFullPlot();
        plot.getRangeAxis().setRange(0.0, 10.0);
        plot.zoomRangeAxes(0.2, 0.8, null, null);
        Range r = plot.getRangeAxis().getRange();
        assertNotNull(r);
    }

    @Test
    public void testZoomRangeAxesWithAnchor() {
        CategoryPlot plot = createFullPlot();
        plot.getRangeAxis().setRange(0.0, 10.0);
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        info.setDataArea(new Rectangle2D.Double(0, 0, 100, 100));
        plot.zoomRangeAxes(0.5, info, new Point2D.Double(50, 50), true);
        Range r = plot.getRangeAxis().getRange();
        assertNotNull(r);
    }

    // ---------- anchor value ----------

    @Test
    public void testAnchorValue() {
        CategoryPlot plot = new CategoryPlot();
        plot.setAnchorValue(3.5);
        assertEquals(3.5, plot.getAnchorValue(), 0.0001);
    }

    // ---------- equals / clone ----------

    @Test
    public void testEqualsSameInstance() {
        CategoryPlot plot = createFullPlot();
        assertTrue(plot.equals(plot));
    }

    @Test
    public void testEqualsDifferentType() {
        CategoryPlot plot = createFullPlot();
        assertFalse(plot.equals("Not a plot"));
    }

    @Test
    public void testEqualsDefaultPlots() {
        CategoryPlot plot1 = new CategoryPlot();
        CategoryPlot plot2 = new CategoryPlot();
        assertTrue(plot1.equals(plot2));
    }

    @Test
    public void testEqualsDifferentWeight() {
        CategoryPlot plot1 = new CategoryPlot();
        CategoryPlot plot2 = new CategoryPlot();
        plot2.setWeight(99);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEqualsDifferentOrientation() {
        CategoryPlot plot1 = new CategoryPlot();
        CategoryPlot plot2 = new CategoryPlot();
        plot2.setOrientation(PlotOrientation.HORIZONTAL);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testCloneIndependence() throws CloneNotSupportedException {
        CategoryPlot plot = createFullPlot();
        CategoryPlot clone = (CategoryPlot) plot.clone();
        assertNotSame(plot, clone);
        assertTrue(plot.equals(clone));
        clone.setWeight(123);
        assertFalse(plot.equals(clone));
    }

    @Test
    public void testCloneAxesAreIndependent() throws CloneNotSupportedException {
        CategoryPlot plot = createFullPlot();
        CategoryPlot clone = (CategoryPlot) plot.clone();
        assertNotSame(plot.getDomainAxis(), clone.getDomainAxis());
        assertNotSame(plot.getRangeAxis(), clone.getRangeAxis());
    }

    // ---------- serialization ----------

    @Test
    public void testSerialization() throws Exception {
        CategoryPlot plot = createFullPlot();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(plot);
        oos.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        CategoryPlot restored = (CategoryPlot) ois.readObject();
        ois.close();

        assertNotNull(restored);
        assertEquals(plot.getOrientation(), restored.getOrientation());
        assertEquals(plot.getWeight(), restored.getWeight());
        assertTrue(plot.equals(restored));
    }
}