package org.jfree.chart.plot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CategoryPlotTest {

    private CategoryPlot plot;
    private DefaultCategoryDataset dataset;

    @Before
    public void setUp() {
        this.dataset = new DefaultCategoryDataset();
        this.plot = new CategoryPlot(this.dataset, new CategoryAxis("Category"),
                new NumberAxis("Value"), new LineAndShapeRenderer());
    }

    @After
    public void tearDown() {
        this.plot = null;
        this.dataset = null;
    }

    @Test
    public void testConstructorWithNullDataset() {
        CategoryPlot p = new CategoryPlot(null, new CategoryAxis(), new NumberAxis(),
                new BarRenderer());
        assertNull(p.getDataset());
        assertNotNull(p.getDomainAxis());
        assertNotNull(p.getRangeAxis());
        assertNotNull(p.getRenderer());
    }

    @Test
    public void testConstructorWithNullRenderer() {
        CategoryPlot p = new CategoryPlot(new DefaultCategoryDataset(), new CategoryAxis(),
                new NumberAxis(), null);
        assertNotNull(p.getDataset());
        assertNotNull(p.getRenderer());
    }

    @Test
    public void testGetPlotType() {
        assertEquals("Category Plot", this.plot.getPlotType());
    }

    @Test
    public void testGetOrientation() {
        assertEquals(PlotOrientation.VERTICAL, this.plot.getOrientation());
        this.plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, this.plot.getOrientation());
    }

    @Test
    public void testSetOrientationNull() {
        try {
            this.plot.setOrientation(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'orientation' argument.", e.getMessage());
        }
    }

    @Test
    public void testSetOrientation() {
        this.plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, this.plot.getOrientation());
        PlotChangeListener listener = new PlotChangeListener() {
            @Override
            public void plotChanged(PlotChangeEvent event) {
                // ignore
            }
        };
        this.plot.addChangeListener(listener);
        this.plot.setOrientation(PlotOrientation.VERTICAL);
        assertEquals(PlotOrientation.VERTICAL, this.plot.getOrientation());
    }

    @Test
    public void testGetAxisOffsetAndSet() {
        assertEquals(RectangleInsets.DEFAULT_INSETS, this.plot.getAxisOffset());
        RectangleInsets newOffset = new RectangleInsets(10, 10, 10, 10);
        this.plot.setAxisOffset(newOffset);
        assertEquals(newOffset, this.plot.getAxisOffset());
    }

    @Test
    public void testSetAxisOffsetNull() {
        try {
            this.plot.setAxisOffset(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'offset' argument.", e.getMessage());
        }
    }

    @Test
    public void testGetDomainAxis() {
        assertNotNull(this.plot.getDomainAxis());
        assertEquals(this.plot.getDomainAxis(0), this.plot.getDomainAxis());
    }

    @Test
    public void testGetDomainAxisWithIndex() {
        CategoryAxis axis1 = new CategoryAxis("AXIS_1");
        CategoryAxis axis2 = new CategoryAxis("AXIS_2");
        CategoryPlot p = new CategoryPlot(this.dataset, axis1, new NumberAxis(), new BarRenderer());
        p.setDomainAxis(1, axis2);
        assertEquals(axis1, p.getDomainAxis(0));
        assertEquals(axis2, p.getDomainAxis(1));
    }

    @Test
    public void testGetDomainAxisCount() {
        assertEquals(1, this.plot.getDomainAxisCount());
    }

    @Test
    public void testSetDomainAxisReplacesExisting() {
        CategoryAxis axis = new CategoryAxis("NEW_AXIS");
        this.plot.setDomainAxis(axis);
        assertEquals(axis, this.plot.getDomainAxis());
    }

    @Test
    public void testSetDomainAxisNullDoesNotAdd() {
        CategoryAxis original = this.plot.getDomainAxis();
        this.plot.setDomainAxis(null);
        assertEquals(original, this.plot.getDomainAxis());
    }

    @Test
    public void testGetRangeAxis() {
        assertNotNull(this.plot.getRangeAxis());
        assertEquals(this.plot.getRangeAxis(0), this.plot.getRangeAxis());
    }

    @Test
    public void testGetRangeAxisCount() {
        assertEquals(1, this.plot.getRangeAxisCount());
    }

    @Test
    public void testSetRangeAxisReplacesExisting() {
        ValueAxis axis = new NumberAxis("NEW_RANGE_AXIS");
        this.plot.setRangeAxis(axis);
        assertEquals(axis, this.plot.getRangeAxis());
    }

    @Test
    public void testGetDataset() {
        assertEquals(this.dataset, this.plot.getDataset());
    }

    @Test
    public void testGetRenderer() {
        assertNotNull(this.plot.getRenderer());
    }

    @Test
    public void testGetDatasetRenderingOrder() {
        assertEquals(DatasetRenderingOrder.REVERSE, this.plot.getDatasetRenderingOrder());
        this.plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD, this.plot.getDatasetRenderingOrder());
    }

    @Test
    public void testSetDatasetRenderingOrderNull() {
        try {
            this.plot.setDatasetRenderingOrder(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'order' argument.", e.getMessage());
        }
    }

    @Test
    public void testGetColumnRenderingOrder() {
        assertEquals(SortOrder.ASCENDING, this.plot.getColumnRenderingOrder());
        this.plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, this.plot.getColumnRenderingOrder());
    }

    @Test
    public void testGetRowRenderingOrder() {
        assertEquals(SortOrder.ASCENDING, this.plot.getRowRenderingOrder());
        this.plot.setRowRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, this.plot.getRowRenderingOrder());
    }

    @Test
    public void testIsDomainGridlinesVisibleAndSet() {
        assertFalse(this.plot.isDomainGridlinesVisible());
        this.plot.setDomainGridlinesVisible(true);
        assertTrue(this.plot.isDomainGridlinesVisible());
    }

    @Test
    public void testGetDomainGridlineStrokeAndSet() {
        Stroke stroke = new BasicStroke(2.0f);
        this.plot.setDomainGridlineStroke(stroke);
        assertEquals(stroke, this.plot.getDomainGridlineStroke());
    }

    @Test
    public void testGetDomainGridlinePaintAndSet() {
        Color color = Color.RED;
        this.plot.setDomainGridlinePaint(color);
        assertEquals(color, this.plot.getDomainGridlinePaint());
    }

    @Test
    public void testIsRangeGridlinesVisibleAndSet() {
        assertTrue(this.plot.isRangeGridlinesVisible());
        this.plot.setRangeGridlinesVisible(false);
        assertFalse(this.plot.isRangeGridlinesVisible());
    }

    @Test
    public void testGetRangeGridlineStrokeAndSet() {
        Stroke stroke = new BasicStroke(3.0f);
        this.plot.setRangeGridlineStroke(stroke);
        assertEquals(stroke, this.plot.getRangeGridlineStroke());
    }

    @Test
    public void testGetRangeGridlinePaintAndSet() {
        Color color = Color.BLUE;
        this.plot.setRangeGridlinePaint(color);
        assertEquals(color, this.plot.getRangeGridlinePaint());
    }

    @Test
    public void testIsRangeCrosshairVisibleAndSet() {
        assertFalse(this.plot.isRangeCrosshairVisible());
        this.plot.setRangeCrosshairVisible(true);
        assertTrue(this.plot.isRangeCrosshairVisible());
    }

    @Test
    public void testGetRangeCrosshairValueAndSet() {
        assertEquals(0.0, this.plot.getRangeCrosshairValue(), 0.0001);
        this.plot.setRangeCrosshairValue(5.0);
        assertEquals(5.0, this.plot.getRangeCrosshairValue(), 0.0001);
    }

    @Test
    public void testGetRangeCrosshairStrokeAndSet() {
        Stroke stroke = new BasicStroke(4.0f);
        this.plot.setRangeCrosshairStroke(stroke);
        assertEquals(stroke, this.plot.getRangeCrosshairStroke());
    }

    @Test
    public void testGetRangeCrosshairPaintAndSet() {
        Color color = Color.GREEN;
        this.plot.setRangeCrosshairPaint(color);
        assertEquals(color, this.plot.getRangeCrosshairPaint());
    }

    @Test
    public void testGetWeightAndSet() {
        assertEquals(0, this.plot.getWeight());
        this.plot.setWeight(3);
        assertEquals(3, this.plot.getWeight());
    }

    @Test
    public void testGetFixedDomainAxisSpaceAndSet() {
        assertNull(this.plot.getFixedDomainAxisSpace());
        AxisSpace space = new AxisSpace();
        this.plot.setFixedDomainAxisSpace(space);
        assertEquals(space, this.plot.getFixedDomainAxisSpace());
    }

    @Test
    public void testGetFixedRangeAxisSpaceAndSet() {
        assertNull(this.plot.getFixedRangeAxisSpace());
        AxisSpace space = new AxisSpace();
        this.plot.setFixedRangeAxisSpace(space);
        assertEquals(space, this.plot.getFixedRangeAxisSpace());
    }

    @Test
    public void testGetAnnotationsEmptyList() {
        assertNotNull(this.plot.getAnnotations());
        assertEquals(0, this.plot.getAnnotations().size());
    }

    @Test
    public void testAddAnnotation() {
        CategoryAnnotation annotation = new org.jfree.chart.annotations.CategoryTextAnnotation(
                "X", "Cat", 1.0);
        this.plot.addAnnotation(annotation);
        assertEquals(1, this.plot.getAnnotations().size());
        assertTrue(this.plot.getAnnotations().contains(annotation));
    }

    @Test
    public void testAddAnnotationNull() {
        try {
            this.plot.addAnnotation(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'annotation' argument.", e.getMessage());
        }
    }

    @Test
    public void testRemoveAnnotation() {
        CategoryAnnotation annotation = new org.jfree.chart.annotations.CategoryTextAnnotation(
                "X", "Cat", 1.0);
        this.plot.addAnnotation(annotation);
        assertTrue(this.plot.removeAnnotation(annotation));
        assertFalse(this.plot.removeAnnotation(annotation));
    }

    @Test
    public void testClearAnnotations() {
        this.plot.addAnnotation(new org.jfree.chart.annotations.CategoryTextAnnotation(
                "X", "Cat", 1.0));
        this.plot.addAnnotation(new org.jfree.chart.annotations.CategoryTextAnnotation(
                "Y", "Cat", 2.0));
        this.plot.clearAnnotations();
        assertEquals(0, this.plot.getAnnotations().size());
    }

    @Test
    public void testIsRangeZoomableReturnsTrue() {
        assertTrue(this.plot.isRangeZoomable());
    }

    @Test
    public void testIsDomainZoomableReturnsFalse() {
        assertFalse(this.plot.isDomainZoomable());
    }

    @Test
    public void testGetCategoriesEmpty() {
        this.dataset.addValue(1.0, "row", "col");
        assertEquals(1, this.plot.getCategories().size());
    }

    @Test
    public void testGetCategoriesNoDuplicates() {
        this.dataset.addValue(1.0, "row", "col1");
        this.dataset.addValue(2.0, "row", "col1");
        assertEquals(1, this.plot.getCategories().size());
        assertEquals("col1", this.plot.getCategories().get(0));
    }

    @Test
    public void testGetCategoriesWithNullDataset() {
        CategoryPlot p = new CategoryPlot(null, new CategoryAxis(), new NumberAxis(),
                new BarRenderer());
        assertEquals(0, p.getCategories().size());
    }

    @Test
    public void testGetLegendItemsNoDataset() {
        CategoryPlot p = new CategoryPlot(null, new CategoryAxis(), new NumberAxis(),
                null);
        assertEquals(0, p.getLegendItems().getItemCount());
    }

    @Test
    public void testEquals() {
        CategoryPlot plot1 = new CategoryPlot();
        CategoryPlot plot2 = new CategoryPlot();
        assertTrue(plot1.equals(plot2));
        plot1.setOrientation(PlotOrientation.HORIZONTAL);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEqualsDifferentOrientation() {
        DefaultCategoryDataset d1 = new DefaultCategoryDataset();
        d1.addValue(1.0, "r", "c");
        DefaultCategoryDataset d2 = new DefaultCategoryDataset();
        d2.addValue(1.0, "r", "c");

        CategoryPlot p1 = new CategoryPlot(d1, new CategoryAxis(), new NumberAxis(),
                new BarRenderer());
        CategoryPlot p2 = new CategoryPlot(d2, new CategoryAxis(), new NumberAxis(),
                new BarRenderer());
        assertTrue(p1.equals(p2));
        p1.setOrientation(PlotOrientation.HORIZONTAL);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentDomainAxis() {
        CategoryPlot p1 = new CategoryPlot(this.dataset, new CategoryAxis("A"),
                new NumberAxis(), new BarRenderer());
        CategoryPlot p2 = new CategoryPlot(this.dataset, new CategoryAxis("B"),
                new NumberAxis(), new BarRenderer());
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentRangeAxis() {
        CategoryPlot p1 = new CategoryPlot(this.dataset, new CategoryAxis(),
                new NumberAxis("A"), new BarRenderer());
        CategoryPlot p2 = new CategoryPlot(this.dataset, new CategoryAxis(),
                new NumberAxis("B"), new BarRenderer());
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentRenderer() {
        CategoryPlot p1 = new CategoryPlot(this.dataset, new CategoryAxis(),
                new NumberAxis(), new BarRenderer());
        CategoryPlot p2 = new CategoryPlot(this.dataset, new CategoryAxis(),
                new NumberAxis(), new LineAndShapeRenderer());
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentDrawSharedDomainAxis() {
        CategoryPlot p1 = new CategoryPlot(this.dataset, new CategoryAxis(),
                new NumberAxis(), new BarRenderer());
        CategoryPlot p2 = new CategoryPlot(this.dataset, new CategoryAxis(),
                new NumberAxis(), new BarRenderer());
        p1.setDrawSharedDomainAxis(true);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentWeight() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        p1.setWeight(1);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentGridlinesVisible() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        p1.setRangeGridlinesVisible(false);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentRangeCrosshairValue() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        p1.setRangeCrosshairValue(1.0);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentRangeCrosshairVisible() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        p1.setRangeCrosshairVisible(true);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentAnchorValue() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        p1.setAnchorValue(1.0);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentRowRenderingOrder() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        p1.setRowRenderingOrder(SortOrder.DESCENDING);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentColumnRenderingOrder() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        p1.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentRenderingOrder() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        p1.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testHashCode() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testClearDomainMarkers() {
        this.plot.addDomainMarker(new CategoryMarker(1.0), Layer.FOREGROUND);
        this.plot.clearDomainMarkers();
        assertEquals(0, this.plot.getDomainMarkers(Layer.FOREGROUND).size());
    }

    @Test
    public void testAddDomainMarker() {
        CategoryMarker marker = new CategoryMarker(1.0);
        this.plot.addDomainMarker(marker, Layer.FOREGROUND);
        assertTrue(this.plot.getDomainMarkers(Layer.FOREGROUND).contains(marker));
    }

    @Test
    public void testAddDomainMarkerNullMarker() {
        try {
            this.plot.addDomainMarker(null, Layer.FOREGROUND);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'marker' not permitted.", e.getMessage());
        }
    }

    @Test
    public void testAddDomainMarkerNullLayer() {
        try {
            this.plot.addDomainMarker(new CategoryMarker(1.0), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'layer' not permitted.", e.getMessage());
        }
    }

    @Test
    public void testClearRangeMarkers() {
        ValueMarker marker = new ValueMarker(1.0);
        this.plot.addRangeMarker(marker, Layer.FOREGROUND);
        this.plot.clearRangeMarkers();
        assertEquals(0, this.plot.getRangeMarkers(Layer.FOREGROUND).size());
    }

    @Test
    public void testGetRangeMarkers() {
        assertNull(this.plot.getRangeMarkers(0, Layer.FOREGROUND));
    }

    @Test
    public void testGetDomainMarkers() {
        assertNull(this.plot.getDomainMarkers(0, Layer.FOREGROUND));
    }

    @Test
    public void testGetDomainMarkersAfterAdd() {
        CategoryMarker marker = new CategoryMarker(1.0);
        this.plot.addDomainMarker(marker, Layer.FOREGROUND);
        assertNotNull(this.plot.getDomainMarkers(0, Layer.FOREGROUND));
    }

    @Test
    public void testSetDrawSharedDomainAxis() {
        assertFalse(this.plot.getDrawSharedDomainAxis());
        this.plot.setDrawSharedDomainAxis(true);
        assertTrue(this.plot.getDrawSharedDomainAxis());
    }

    @Test
    public void testGetDrawSharedDomainAxis() {
        assertFalse(this.plot.getDrawSharedDomainAxis());
        this.plot.setDrawSharedDomainAxis(true);
        assertTrue(this.plot.getDrawSharedDomainAxis());
    }

    @Test
    public void testToString() {
        assertNotNull(this.plot.toString());
    }

    @Test
    public void testGetRangeAxisLocation() {
        assertEquals(AxisLocation.getOpposite(this.plot.getRangeAxisLocation(0)),
                this.plot.getRangeAxisLocation());
    }

    @Test
    public void testGetRangeAxisEdge() {
        assertEquals(RectangleEdge.LEFT, this.plot.getRangeAxisEdge());
    }

    @Test
    public void testGetDomainAxisLocation() {
        assertEquals(AxisLocation.getOpposite(this.plot.getDomainAxisLocation(0)),
                this.plot.getDomainAxisLocation());
    }

    @Test
    public void testGetDomainAxisEdge() {
        assertEquals(RectangleEdge.BOTTOM, this.plot.getDomainAxisEdge());
    }

    @Test
    public void testSetFixedRangeAxisSpace() {
        AxisSpace space = new AxisSpace();
        this.plot.setFixedRangeAxisSpace(space);
        assertEquals(space, this.plot.getFixedRangeAxisSpace());
    }

    @Test
    public void testSetFixedDomainAxisSpace() {
        AxisSpace space = new AxisSpace();
        this.plot.setFixedDomainAxisSpace(space);
        assertEquals(space, this.plot.getFixedDomainAxisSpace());
    }
}