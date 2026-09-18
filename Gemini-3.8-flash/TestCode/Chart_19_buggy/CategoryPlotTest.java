package org.jfree.chart.plot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SortOrder;
import org.junit.Assert;
import org.junit.Test;

public class CategoryPlotTest {

    private static class TestPlotChangeListener implements PlotChangeListener {
        private int eventCount = 0;

        public void plotChanged(PlotChangeEvent event) {
            this.eventCount++;
        }

        public int getEventCount() {
            return this.eventCount;
        }

        public void reset() {
            this.eventCount = 0;
        }
    }

    @Test
    public void constructor_givenDefaultConstructor_shouldInitializeDefaults() {
        CategoryPlot plot = new CategoryPlot();
        Assert.assertNotNull(plot.getPlotType());
        Assert.assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        Assert.assertNull(plot.getDomainAxis());
        Assert.assertNull(plot.getRangeAxis());
        Assert.assertNull(plot.getDataset());
        Assert.assertNull(plot.getRenderer());
        Assert.assertEquals(new RectangleInsets(4.0, 4.0, 4.0, 4.0), plot.getAxisOffset());
        Assert.assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation());
        Assert.assertEquals(AxisLocation.TOP_OR_LEFT, plot.getRangeAxisLocation());
        Assert.assertFalse(plot.isDomainGridlinesVisible());
        Assert.assertTrue(plot.isRangeGridlinesVisible());
        Assert.assertEquals(CategoryAnchor.MIDDLE, plot.getDomainGridlinePosition());
        Assert.assertEquals(CategoryPlot.DEFAULT_GRIDLINE_STROKE, plot.getDomainGridlineStroke());
        Assert.assertEquals(CategoryPlot.DEFAULT_GRIDLINE_PAINT, plot.getDomainGridlinePaint());
        Assert.assertEquals(CategoryPlot.DEFAULT_GRIDLINE_STROKE, plot.getRangeGridlineStroke());
        Assert.assertEquals(CategoryPlot.DEFAULT_GRIDLINE_PAINT, plot.getRangeGridlinePaint());
        Assert.assertFalse(plot.isRangeCrosshairVisible());
        Assert.assertTrue(plot.isRangeCrosshairLockedOnData());
        Assert.assertEquals(0.0, plot.getRangeCrosshairValue(), 0.0001);
        Assert.assertEquals(0.0, plot.getAnchorValue(), 0.0001);
        Assert.assertEquals(DatasetRenderingOrder.REVERSE, plot.getDatasetRenderingOrder());
        Assert.assertEquals(SortOrder.ASCENDING, plot.getColumnRenderingOrder());
        Assert.assertEquals(SortOrder.ASCENDING, plot.getRowRenderingOrder());
        Assert.assertNotNull(plot.getAnnotations());
        Assert.assertEquals(0, plot.getAnnotations().size());
        Assert.assertFalse(plot.getDrawSharedDomainAxis());
        Assert.assertFalse(plot.isDomainZoomable());
        Assert.assertTrue(plot.isRangeZoomable());
    }

    @Test
    public void setOrientation_givenValidOrientation_shouldUpdateOrientationAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setOrientation_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(null);
    }

    @Test
    public void setAxisOffset_givenValidOffset_shouldUpdateOffsetAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        RectangleInsets newOffset = new RectangleInsets(2.0, 2.0, 2.0, 2.0);
        plot.setAxisOffset(newOffset);
        Assert.assertEquals(newOffset, plot.getAxisOffset());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setAxisOffset_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setAxisOffset(null);
    }

    @Test
    public void setDomainAxisLocation_givenIndex0AndValidLocation_shouldUpdateLocation() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        Assert.assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainAxisLocation_givenIndex0AndNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(0, null);
    }

    @Test
    public void getDomainAxisLocation_givenUnsetHigherIndex_shouldReturnOppositeOfIndex0() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(0, AxisLocation.BOTTOM_OR_LEFT);
        AxisLocation loc = plot.getDomainAxisLocation(1);
        Assert.assertEquals(AxisLocation.getOpposite(AxisLocation.BOTTOM_OR_LEFT), loc);
    }

    @Test
    public void setRangeAxisLocation_givenIndex0AndValidLocation_shouldUpdateLocation() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        Assert.assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getRangeAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeAxisLocation_givenIndex0AndNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(0, null);
    }

    @Test
    public void getRangeAxisLocation_givenUnsetHigherIndex_shouldReturnOppositeOfIndex0() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(0, AxisLocation.TOP_OR_LEFT);
        AxisLocation loc = plot.getRangeAxisLocation(1);
        Assert.assertEquals(AxisLocation.getOpposite(AxisLocation.TOP_OR_LEFT), loc);
    }

    @Test
    public void getDomainAxis_givenNullAndParentPlot_shouldLookupParent() {
        CategoryPlot parent = new CategoryPlot();
        CategoryPlot child = new CategoryPlot();
        child.setParent(parent);
        Assert.assertNull(child.getDomainAxis(0));
    }

    @Test
    public void getRangeAxis_givenNullAndParentPlot_shouldLookupParent() {
        CategoryPlot parent = new CategoryPlot();
        CategoryPlot child = new CategoryPlot();
        child.setParent(parent);
        Assert.assertNull(child.getRangeAxis(0));
    }

    @Test
    public void clearDomainAxes_givenPlot_shouldClearListAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.clearDomainAxes();
        Assert.assertEquals(0, plot.getDomainAxisCount());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test
    public void clearRangeAxes_givenPlot_shouldClearListAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.clearRangeAxes();
        Assert.assertEquals(0, plot.getRangeAxisCount());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test
    public void mapDatasetToDomainAxis_givenIndexAndAxisIndex_shouldUpdateMapping() {
        CategoryPlot plot = new CategoryPlot();
        plot.mapDatasetToDomainAxis(1, 2);
        Assert.assertNull(plot.getDomainAxisForDataset(1));
    }

    @Test
    public void mapDatasetToRangeAxis_givenIndexAndAxisIndex_shouldUpdateMapping() {
        CategoryPlot plot = new CategoryPlot();
        plot.mapDatasetToRangeAxis(1, 2);
        Assert.assertNull(plot.getRangeAxisForDataset(1));
    }

    @Test
    public void setDatasetRenderingOrder_givenValidOrder_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        Assert.assertEquals(DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDatasetRenderingOrder_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDatasetRenderingOrder(null);
    }

    @Test
    public void setColumnRenderingOrder_givenValidOrder_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        Assert.assertEquals(SortOrder.DESCENDING, plot.getColumnRenderingOrder());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setColumnRenderingOrder_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setColumnRenderingOrder(null);
    }

    @Test
    public void setRowRenderingOrder_givenValidOrder_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        Assert.assertEquals(SortOrder.DESCENDING, plot.getRowRenderingOrder());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRowRenderingOrder_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRowRenderingOrder(null);
    }

    @Test
    public void setDomainGridlinesVisible_givenDifferentValue_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setDomainGridlinesVisible(true);
        Assert.assertTrue(plot.isDomainGridlinesVisible());
        Assert.assertEquals(1, listener.getEventCount());

        plot.setDomainGridlinesVisible(true);
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setDomainGridlinePosition_givenValidPosition_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setDomainGridlinePosition(CategoryAnchor.START);
        Assert.assertEquals(CategoryAnchor.START, plot.getDomainGridlinePosition());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainGridlinePosition_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePosition(null);
    }

    @Test
    public void setDomainGridlineStroke_givenValidStroke_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        Stroke stroke = new BasicStroke(2.0f);
        plot.setDomainGridlineStroke(stroke);
        Assert.assertEquals(stroke, plot.getDomainGridlineStroke());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainGridlineStroke_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlineStroke(null);
    }

    @Test
    public void setDomainGridlinePaint_givenValidPaint_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setDomainGridlinePaint(Color.RED);
        Assert.assertEquals(Color.RED, plot.getDomainGridlinePaint());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainGridlinePaint_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePaint(null);
    }

    @Test
    public void setRangeGridlinesVisible_givenDifferentValue_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setRangeGridlinesVisible(false);
        Assert.assertFalse(plot.isRangeGridlinesVisible());
        Assert.assertEquals(1, listener.getEventCount());

        plot.setRangeGridlinesVisible(false);
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setRangeGridlineStroke_givenValidStroke_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        Stroke stroke = new BasicStroke(3.0f);
        plot.setRangeGridlineStroke(stroke);
        Assert.assertEquals(stroke, plot.getRangeGridlineStroke());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeGridlineStroke_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeGridlineStroke(null);
    }

    @Test
    public void setRangeGridlinePaint_givenValidPaint_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setRangeGridlinePaint(Color.YELLOW);
        Assert.assertEquals(Color.YELLOW, plot.getRangeGridlinePaint());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeGridlinePaint_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeGridlinePaint(null);
    }

    @Test
    public void fixedLegendItems_givenItems_shouldUpdateAndReturn() {
        CategoryPlot plot = new CategoryPlot();
        Assert.assertNotNull(plot.getLegendItems());

        LegendItemCollection collection = new LegendItemCollection();
        plot.setFixedLegendItems(collection);
        Assert.assertSame(collection, plot.getFixedLegendItems());
        Assert.assertSame(collection, plot.getLegendItems());

        plot.setFixedLegendItems(null);
        Assert.assertNull(plot.getFixedLegendItems());
    }

    @Test
    public void domainMarkers_givenForegroundAndBackgroundMarkers_shouldManageCorrectly() {
        CategoryPlot plot = new CategoryPlot();
        CategoryMarker marker1 = new CategoryMarker("Category1");
        CategoryMarker marker2 = new CategoryMarker("Category2");

        plot.addDomainMarker(marker1, Layer.FOREGROUND);
        plot.addDomainMarker(marker2, Layer.BACKGROUND);

        Collection fgMarkers = plot.getDomainMarkers(0, Layer.FOREGROUND);
        Assert.assertNotNull(fgMarkers);
        Assert.assertEquals(1, fgMarkers.size());
        Assert.assertTrue(fgMarkers.contains(marker1));

        Collection bgMarkers = plot.getDomainMarkers(0, Layer.BACKGROUND);
        Assert.assertNotNull(bgMarkers);
        Assert.assertEquals(1, bgMarkers.size());
        Assert.assertTrue(bgMarkers.contains(marker2));

        plot.clearDomainMarkers(0);
        Assert.assertEquals(0, plot.getDomainMarkers(0, Layer.FOREGROUND).size());
        Assert.assertEquals(0, plot.getDomainMarkers(0, Layer.BACKGROUND).size());

        plot.addDomainMarker(marker1);
        Assert.assertEquals(1, plot.getDomainMarkers(Layer.FOREGROUND).size());
        plot.clearDomainMarkers();
        Assert.assertNull(plot.getDomainMarkers(0, Layer.FOREGROUND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addDomainMarker_givenNullMarker_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.addDomainMarker(null, Layer.FOREGROUND);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addDomainMarker_givenNullLayer_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        CategoryMarker marker = new CategoryMarker("Cat");
        plot.addDomainMarker(marker, null);
    }

    @Test
    public void rangeMarkers_givenForegroundAndBackgroundMarkers_shouldManageCorrectly() {
        CategoryPlot plot = new CategoryPlot();
        ValueMarker marker1 = new ValueMarker(10.0);
        ValueMarker marker2 = new ValueMarker(20.0);

        plot.addRangeMarker(marker1, Layer.FOREGROUND);
        plot.addRangeMarker(marker2, Layer.BACKGROUND);

        Collection fgMarkers = plot.getRangeMarkers(0, Layer.FOREGROUND);
        Assert.assertNotNull(fgMarkers);
        Assert.assertEquals(1, fgMarkers.size());
        Assert.assertTrue(fgMarkers.contains(marker1));

        Collection bgMarkers = plot.getRangeMarkers(0, Layer.BACKGROUND);
        Assert.assertNotNull(bgMarkers);
        Assert.assertTrue(bgMarkers.contains(marker2));

        plot.clearRangeMarkers(0);
        Assert.assertEquals(0, plot.getRangeMarkers(0, Layer.FOREGROUND).size());
        Assert.assertEquals(0, plot.getRangeMarkers(0, Layer.BACKGROUND).size());

        plot.addRangeMarker(marker1);
        Assert.assertEquals(1, plot.getRangeMarkers(Layer.FOREGROUND).size());
        plot.clearRangeMarkers();
        Assert.assertNull(plot.getRangeMarkers(0, Layer.FOREGROUND));
    }

    @Test
    public void rangeCrosshair_givenValues_shouldGetAndSetProperties() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setRangeCrosshairVisible(true);
        Assert.assertTrue(plot.isRangeCrosshairVisible());

        plot.setRangeCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isRangeCrosshairLockedOnData());

        plot.setRangeCrosshairValue(25.5);
        Assert.assertEquals(25.5, plot.getRangeCrosshairValue(), 0.0001);

        plot.setRangeCrosshairValue(30.0, false);
        Assert.assertEquals(30.0, plot.getRangeCrosshairValue(), 0.0001);

        Stroke stroke = new BasicStroke(1.5f);
        plot.setRangeCrosshairStroke(stroke);
        Assert.assertEquals(stroke, plot.getRangeCrosshairStroke());

        plot.setRangeCrosshairPaint(Color.GREEN);
        Assert.assertEquals(Color.GREEN, plot.getRangeCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeCrosshairStroke_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeCrosshairPaint_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairPaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addAnnotation_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.addAnnotation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeAnnotation_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.removeAnnotation(null);
    }

    @Test
    public void clearAnnotations_givenPlot_shouldClearListAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.clearAnnotations();
        Assert.assertEquals(0, plot.getAnnotations().size());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test
    public void weight_givenValue_shouldUpdateWeight() {
        CategoryPlot plot = new CategoryPlot();
        plot.setWeight(5);
        Assert.assertEquals(5, plot.getWeight());
    }

    @Test
    public void fixedAxisSpace_givenValues_shouldGetAndSetSpaces() {
        CategoryPlot plot = new CategoryPlot();
        AxisSpace dSpace = new AxisSpace();
        dSpace.setTop(10.0);
        plot.setFixedDomainAxisSpace(dSpace);
        Assert.assertSame(dSpace, plot.getFixedDomainAxisSpace());

        AxisSpace rSpace = new AxisSpace();
        rSpace.setLeft(15.0);
        plot.setFixedRangeAxisSpace(rSpace);
        Assert.assertSame(rSpace, plot.getFixedRangeAxisSpace());
    }

    @Test
    public void getCategories_givenNullDataset_shouldReturnNull() {
        CategoryPlot plot = new CategoryPlot();
        Assert.assertNull(plot.getCategories());
    }

    @Test
    public void drawSharedDomainAxis_givenValue_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setDrawSharedDomainAxis(true);
        Assert.assertTrue(plot.getDrawSharedDomainAxis());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test
    public void anchorValue_givenValue_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setAnchorValue(12.34);
        Assert.assertEquals(12.34, plot.getAnchorValue(), 0.0001);
        Assert.assertTrue(listener.getEventCount() > 0);

        listener.reset();
        plot.setAnchorValue(56.78, false);
        Assert.assertEquals(56.78, plot.getAnchorValue(), 0.0001);
        Assert.assertEquals(0, listener.getEventCount());
    }

    @Test
    public void zoomDomainAxes_givenMethods_shouldNotThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.zoomDomainAxes(0.5, null, new Point2D.Double(0, 0));
        plot.zoomDomainAxes(0.1, 0.9, null, new Point2D.Double(0, 0));
        plot.zoomDomainAxes(0.5, null, new Point2D.Double(0, 0), true);
    }

    @Test
    public void getDomainAxisEdge_givenVerticalAndHorizontalOrientation_shouldResolve() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setDomainAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        Assert.assertEquals(RectangleEdge.BOTTOM, plot.getDomainAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(RectangleEdge.LEFT, plot.getDomainAxisEdge());
    }

    @Test
    public void getRangeAxisEdge_givenVerticalAndHorizontalOrientation_shouldResolve() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setRangeAxisLocation(AxisLocation.TOP_OR_LEFT);
        Assert.assertEquals(RectangleEdge.LEFT, plot.getRangeAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(RectangleEdge.TOP, plot.getRangeAxisEdge());
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        CategoryPlot plot = new CategoryPlot();
        Assert.assertTrue(plot.equals(plot));
    }

    @Test
    public void equals_givenNullOrDifferentType_shouldReturnFalse() {
        CategoryPlot plot = new CategoryPlot();
        Assert.assertFalse(plot.equals(null));
        Assert.assertFalse(plot.equals("Not a CategoryPlot"));
    }

    @Test
    public void equals_givenIdenticalPlots_shouldReturnTrue() {
        CategoryPlot plot1 = new CategoryPlot();
        CategoryPlot plot2 = new CategoryPlot();
        Assert.assertTrue(plot1.equals(plot2));
        Assert.assertTrue(plot2.equals(plot1));
    }

    @Test
    public void equals_givenDifferentOrientation_shouldReturnFalse() {
        CategoryPlot plot1 = new CategoryPlot();
        CategoryPlot plot2 = new CategoryPlot();
        plot2.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertFalse(plot1.equals(plot2));
    }

    @Test
    public void equals_givenDifferentAxisOffset_shouldReturnFalse() {
        CategoryPlot plot1 = new CategoryPlot();
        CategoryPlot plot2 = new CategoryPlot();
        plot2.