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
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.Range;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetChangeEvent;
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
    public void constructor_givenDefault_shouldInitializeDefaults() {
        CategoryPlot plot = new CategoryPlot();

        Assert.assertEquals("Category Plot", plot.getPlotType());
        Assert.assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        Assert.assertEquals(new RectangleInsets(4.0, 4.0, 4.0, 4.0), plot.getAxisOffset());
        Assert.assertNull(plot.getDataset());
        Assert.assertNull(plot.getDomainAxis());
        Assert.assertNull(plot.getRangeAxis());
        Assert.assertNull(plot.getRenderer());
        Assert.assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation());
        Assert.assertEquals(AxisLocation.TOP_OR_LEFT, plot.getRangeAxisLocation());
        Assert.assertEquals(DatasetRenderingOrder.REVERSE, plot.getDatasetRenderingOrder());
        Assert.assertEquals(SortOrder.ASCENDING, plot.getColumnRenderingOrder());
        Assert.assertEquals(SortOrder.ASCENDING, plot.getRowRenderingOrder());
        Assert.assertFalse(plot.isDomainGridlinesVisible());
        Assert.assertEquals(CategoryAnchor.MIDDLE, plot.getDomainGridlinePosition());
        Assert.assertTrue(plot.isRangeGridlinesVisible());
        Assert.assertEquals(0.0, plot.getAnchorValue(), 0.0001);
        Assert.assertFalse(plot.isRangeCrosshairVisible());
        Assert.assertEquals(0.0, plot.getRangeCrosshairValue(), 0.0001);
        Assert.assertTrue(plot.isRangeCrosshairLockedOnData());
        Assert.assertFalse(plot.getDrawSharedDomainAxis());
        Assert.assertFalse(plot.isDomainZoomable());
        Assert.assertTrue(plot.isRangeZoomable());
        Assert.assertNotNull(plot.getAnnotations());
        Assert.assertTrue(plot.getAnnotations().isEmpty());
    }

    @Test
    public void constructor_givenExplicitArguments_shouldSetPropertiesAndListeners() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        BarRenderer renderer = new BarRenderer();

        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);

        Assert.assertSame(dataset, plot.getDataset());
        Assert.assertSame(domainAxis, plot.getDomainAxis());
        Assert.assertSame(rangeAxis, plot.getRangeAxis());
        Assert.assertSame(renderer, plot.getRenderer());
        Assert.assertSame(plot, domainAxis.getPlot());
        Assert.assertSame(plot, rangeAxis.getPlot());
        Assert.assertSame(plot, renderer.getPlot());
    }

    @Test
    public void setOrientation_givenValidOrientation_shouldUpdateAndNotify() {
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
    public void setAxisOffset_givenValidOffset_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);
        RectangleInsets insets = new RectangleInsets(5.0, 5.0, 5.0, 5.0);

        plot.setAxisOffset(insets);

        Assert.assertEquals(insets, plot.getAxisOffset());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setAxisOffset_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setAxisOffset(null);
    }

    @Test
    public void setDomainAxis_givenMultipleAxes_shouldManageListAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis0 = new CategoryAxis("Axis 0");
        CategoryAxis axis1 = new CategoryAxis("Axis 1");

        plot.setDomainAxis(0, axis0);
        plot.setDomainAxis(1, axis1);

        Assert.assertSame(axis0, plot.getDomainAxis(0));
        Assert.assertSame(axis1, plot.getDomainAxis(1));
        Assert.assertEquals(2, plot.getDomainAxisCount());
        Assert.assertEquals(0, plot.getDomainAxisIndex(axis0));
        Assert.assertEquals(1, plot.getDomainAxisIndex(axis1));

        plot.clearDomainAxes();
        Assert.assertEquals(0, plot.getDomainAxisCount());
        Assert.assertNull(plot.getDomainAxis(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getDomainAxisIndex_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.getDomainAxisIndex(null);
    }

    @Test
    public void setDomainAxes_givenArray_shouldSetAll() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis[] axes = new CategoryAxis[] {
            new CategoryAxis("A1"),
            new CategoryAxis("A2")
        };

        plot.setDomainAxes(axes);

        Assert.assertEquals(2, plot.getDomainAxisCount());
        Assert.assertSame(axes[0], plot.getDomainAxis(0));
        Assert.assertSame(axes[1], plot.getDomainAxis(1));
    }

    @Test
    public void getDomainAxis_givenParentPlot_shouldInheritFromParent() {
        CategoryPlot parent = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis("ParentDomain");
        parent.setDomainAxis(axis);

        CategoryPlot child = new CategoryPlot();
        child.setParent(parent);

        Assert.assertSame(axis, child.getDomainAxis(0));
    }

    @Test
    public void setDomainAxisLocation_givenValidLocation_shouldUpdateEdge() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);

        Assert.assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation(0));
        Assert.assertEquals(RectangleEdge.TOP, plot.getDomainAxisEdge(0));

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(RectangleEdge.RIGHT, plot.getDomainAxisEdge(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainAxisLocation_givenNullIndex0_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(0, null);
    }

    @Test
    public void setRangeAxis_givenMultipleAxes_shouldManageListAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        NumberAxis axis0 = new NumberAxis("Range 0");
        NumberAxis axis1 = new NumberAxis("Range 1");

        plot.setRangeAxis(0, axis0);
        plot.setRangeAxis(1, axis1);

        Assert.assertSame(axis0, plot.getRangeAxis(0));
        Assert.assertSame(axis1, plot.getRangeAxis(1));
        Assert.assertEquals(2, plot.getRangeAxisCount());
        Assert.assertEquals(0, plot.getRangeAxisIndex(axis0));
        Assert.assertEquals(1, plot.getRangeAxisIndex(axis1));

        plot.clearRangeAxes();
        Assert.assertEquals(0, plot.getRangeAxisCount());
        Assert.assertNull(plot.getRangeAxis(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getRangeAxisIndex_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.getRangeAxisIndex(null);
    }

    @Test
    public void getRangeAxis_givenParentPlot_shouldInheritFromParent() {
        CategoryPlot parent = new CategoryPlot();
        NumberAxis axis = new NumberAxis("ParentRange");
        parent.setRangeAxis(axis);

        CategoryPlot child = new CategoryPlot();
        child.setParent(parent);

        Assert.assertSame(axis, child.getRangeAxis(0));
        Assert.assertEquals(0, child.getRangeAxisIndex(axis));
    }

    @Test
    public void setRangeAxes_givenArray_shouldSetAll() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis[] axes = new ValueAxis[] {
            new NumberAxis("R1"),
            new NumberAxis("R2")
        };

        plot.setRangeAxes(axes);

        Assert.assertEquals(2, plot.getRangeAxisCount());
        Assert.assertSame(axes[0], plot.getRangeAxis(0));
        Assert.assertSame(axes[1], plot.getRangeAxis(1));
    }

    @Test
    public void setRangeAxisLocation_givenValidLocation_shouldUpdateEdge() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);

        Assert.assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getRangeAxisLocation(0));
        Assert.assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge(0));

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(RectangleEdge.BOTTOM, plot.getRangeAxisEdge(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeAxisLocation_givenNullIndex0_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(0, null);
    }

    @Test
    public void datasetMapping_givenMultipleDatasetsAndAxes_shouldMapCorrectly() {
        CategoryPlot plot = new CategoryPlot();
        DefaultCategoryDataset ds0 = new DefaultCategoryDataset();
        DefaultCategoryDataset ds1 = new DefaultCategoryDataset();
        CategoryAxis da0 = new CategoryAxis("DA0");
        CategoryAxis da1 = new CategoryAxis("DA1");
        NumberAxis ra0 = new NumberAxis("RA0");
        NumberAxis ra1 = new NumberAxis("RA1");

        plot.setDataset(0, ds0);
        plot.setDataset(1, ds1);
        plot.setDomainAxis(0, da0);
        plot.setDomainAxis(1, da1);
        plot.setRangeAxis(0, ra0);
        plot.setRangeAxis(1, ra1);

        plot.mapDatasetToDomainAxis(1, 1);
        plot.mapDatasetToRangeAxis(1, 1);

        Assert.assertEquals(2, plot.getDatasetCount());
        Assert.assertSame(da0, plot.getDomainAxisForDataset(0));
        Assert.assertSame(da1, plot.getDomainAxisForDataset(1));
        Assert.assertSame(ra0, plot.getRangeAxisForDataset(0));
        Assert.assertSame(ra1, plot.getRangeAxisForDataset(1));
    }

    @Test
    public void renderers_givenMultipleRenderers_shouldManageCorrectly() {
        CategoryPlot plot = new CategoryPlot();
        BarRenderer r0 = new BarRenderer();
        LineAndShapeRenderer r1 = new LineAndShapeRenderer();
        DefaultCategoryDataset ds0 = new DefaultCategoryDataset();
        DefaultCategoryDataset ds1 = new DefaultCategoryDataset();

        plot.setDataset(0, ds0);
        plot.setDataset(1, ds1);
        plot.setRenderer(0, r0);
        plot.setRenderer(1, r1);

        Assert.assertSame(r0, plot.getRenderer(0));
        Assert.assertSame(r1, plot.getRenderer(1));
        Assert.assertSame(r0, plot.getRendererForDataset(ds0));
        Assert.assertSame(r1, plot.getRendererForDataset(ds1));
        Assert.assertEquals(0, plot.getIndexOf(r0));
        Assert.assertEquals(1, plot.getIndexOf(r1));

        CategoryItemRenderer[] renderers = new CategoryItemRenderer[] { r1, r0 };
        plot.setRenderers(renderers);
        Assert.assertSame(r1, plot.getRenderer(0));
        Assert.assertSame(r0, plot.getRenderer(1));
    }

    @Test
    public void setDatasetRenderingOrder_givenValidAndNull_shouldWorkAsExpected() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        Assert.assertEquals(DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());
        Assert.assertTrue(listener.getEventCount() > 0);

        try {
            plot.setDatasetRenderingOrder(null);
            Assert.fail("Null order should throw IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // Success
        }
    }

    @Test
    public void setColumnAndRowRenderingOrder_givenValidAndNull_shouldWorkAsExpected() {
        CategoryPlot plot = new CategoryPlot();

        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        Assert.assertEquals(SortOrder.DESCENDING, plot.getColumnRenderingOrder());

        try {
            plot.setColumnRenderingOrder(null);
            Assert.fail("Null column order should throw IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // Success
        }

        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        Assert.assertEquals(SortOrder.DESCENDING, plot.getRowRenderingOrder());

        try {
            plot.setRowRenderingOrder(null);
            Assert.fail("Null row order should throw IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // Success
        }
    }

    @Test
    public void domainGridlines_givenValidProperties_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setDomainGridlinesVisible(true);
        Assert.assertTrue(plot.isDomainGridlinesVisible());

        plot.setDomainGridlinePosition(CategoryAnchor.START);
        Assert.assertEquals(CategoryAnchor.START, plot.getDomainGridlinePosition());

        BasicStroke stroke = new BasicStroke(1.5f);
        plot.setDomainGridlineStroke(stroke);
        Assert.assertSame(stroke, plot.getDomainGridlineStroke());

        Color paint = Color.RED;
        plot.setDomainGridlinePaint(paint);
        Assert.assertSame(paint, plot.getDomainGridlinePaint());

        Assert.assertTrue(listener.getEventCount() >= 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainGridlinePosition_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePosition(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainGridlineStroke_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainGridlinePaint_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePaint(null);
    }

    @Test
    public void rangeGridlines_givenValidProperties_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setRangeGridlinesVisible(false);
        Assert.assertFalse(plot.isRangeGridlinesVisible());

        BasicStroke stroke = new BasicStroke(2.0f);
        plot.setRangeGridlineStroke(stroke);
        Assert.assertSame(stroke, plot.getRangeGridlineStroke());

        Color paint = Color.GREEN;
        plot.setRangeGridlinePaint(paint);
        Assert.assertSame(paint, plot.getRangeGridlinePaint());

        Assert.assertTrue(listener.getEventCount() >= 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeGridlineStroke_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeGridlinePaint_givenNull_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeGridlinePaint(null);
    }

    @Test
    public void rangeCrosshair_givenValidProperties_shouldUpdateAndNotify() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setRangeCrosshairVisible(true);
        Assert.assertTrue(plot.isRangeCrosshairVisible());

        plot.setRangeCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isRangeCrosshairLockedOnData());

        plot.setRangeCrosshairValue(25.5);
        Assert.assertEquals(25.5, plot.getRangeCrosshairValue(), 0.0001);

        BasicStroke stroke = new BasicStroke(1.2f);
        plot.setRangeCrosshairStroke(stroke);
        Assert.assertSame(stroke, plot.getRangeCrosshairStroke());

        Color paint = Color.MAGENTA;
        plot.setRangeCrosshairPaint(paint);
        Assert.assertSame(paint, plot.getRangeCrosshairPaint());

        Assert.assertTrue(listener.getEventCount() >= 4);
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

    @Test
    public void domainMarkers_givenAddAndRemove_shouldManageCorrectly() {
        CategoryPlot plot = new CategoryPlot();
        CategoryMarker marker1 = new CategoryMarker("Cat1");
        CategoryMarker marker2 = new CategoryMarker("Cat2");

        plot.addDomainMarker(marker1, Layer.FOREGROUND);
        plot.addDomainMarker(marker2, Layer.BACKGROUND);

        Collection fgMarkers = plot.getDomainMarkers(Layer.FOREGROUND);
        Collection bgMarkers = plot.getDomainMarkers(Layer.BACKGROUND);

        Assert.assertNotNull(fgMarkers);
        Assert.assertEquals(1, fgMarkers.size());
        Assert.assertTrue(fgMarkers.contains(marker1));

        Assert.assertNotNull(bgMarkers);
        Assert.assertEquals(1, bgMarkers.size());
        Assert.assertTrue(bgMarkers.contains(marker2));

        boolean removed = plot.removeDomainMarker(marker1, Layer.FOREGROUND);
        Assert.assertTrue(removed);
        Assert.assertEquals(0, plot.getDomainMarkers(Layer.FOREGROUND).size());

        plot.clearDomainMarkers();
        Collection bgMarkersAfterClear = plot.getDomainMarkers(Layer.BACKGROUND);
        Assert.assertTrue(bgMarkersAfterClear == null || bgMarkersAfterClear.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addDomainMarker_givenNullMarker_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.addDomainMarker(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addDomainMarker_givenNullLayer_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.addDomainMarker(new CategoryMarker("Cat"), null);
    }

    @Test
    public void rangeMarkers_givenAddAndRemove_shouldManageCorrectly() {
        CategoryPlot plot = new CategoryPlot();
        ValueMarker marker1 = new ValueMarker(10.0);
        ValueMarker marker2 = new ValueMarker(20.0);

        plot.addRangeMarker(marker1, Layer.FOREGROUND);
        plot.addRangeMarker(marker2, Layer.BACKGROUND);

        Collection fgMarkers = plot.getRangeMarkers(Layer.FOREGROUND);
        Assert.assertNotNull(fgMarkers);
        Assert.assertTrue(fgMarkers.contains(marker1));

        boolean removed = plot.removeRangeMarker(marker1, Layer.FOREGROUND);
        Assert.assertTrue(removed);
        Assert.assertFalse(plot.getRangeMarkers(Layer.FOREGROUND).contains(marker1));

        plot.clearRangeMarkers(0);
        Collection bgMarkers = plot.getRangeMarkers(0, Layer.BACKGROUND);
        Assert.assertTrue(bgMarkers == null || bgMarkers.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeRangeMarker_givenNullMarker_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        plot.removeRangeMarker(null);
    }

    @Test
    public void annotations_givenAddAndRemove_shouldManageCorrectly() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAnnotation annotation = new CategoryAnnotation() {
            public void draw(java.awt.Graphics2D g2, CategoryPlot p, Rectangle2D dataArea,
                    CategoryAxis domainAxis, ValueAxis rangeAxis, int index,
                    org.jfree.chart.plot.PlotRenderingInfo info) {
            }
        };

        plot.addAnnotation(annotation);
        List list = plot.getAnnotations();
        Assert.assertEquals(1, list.size());
        Assert.assertSame(annotation, list.get(0));

        boolean removed = plot.removeAnnotation(annotation);
        Assert.assertTrue(removed);
        Assert.assertTrue(plot.getAnnotations().isEmpty());

        plot.addAnnotation(annotation);
        plot.clearAnnotations();
        Assert.assertTrue(plot.getAnnotations().isEmpty());
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
    public void legendItems_givenFixedAndDefault_shouldReturnAppropriateItems() {
        CategoryPlot plot = new CategoryPlot();
        Assert.assertNotNull(plot.getLegendItems());
        Assert.assertEquals(0, plot.getLegendItems().getItemCount());

        LegendItemCollection fixed = new LegendItemCollection();
        plot.setFixedLegendItems(fixed);
        Assert.assertSame(fixed, plot.getFixedLegendItems());
        Assert.assertSame(fixed, plot.getLegendItems());
    }

    @Test
    public void weightAndAnchorAndSpaces_givenValues_shouldGetAndSet() {
        CategoryPlot plot = new CategoryPlot();

        plot.setWeight(3);
        Assert.assertEquals(3, plot.getWeight());

        plot.setAnchorValue(12.34);
        Assert.assertEquals(12.34, plot.getAnchorValue(), 0.0001);

        plot.setDrawSharedDomainAxis(true);
        Assert.assertTrue(plot.getDrawSharedDomainAxis());

        AxisSpace domainSpace = new AxisSpace();
        domainSpace.setLeft(15.0);
        plot.setFixedDomainAxisSpace(domainSpace);
        Assert.assertSame(domainSpace, plot.getFixedDomainAxisSpace());

        AxisSpace rangeSpace = new AxisSpace();
        rangeSpace.setTop(20.0);
        plot.setFixedRangeAxisSpace(rangeSpace);
        Assert.assertSame(rangeSpace, plot.getFixedRangeAxisSpace());
    }

    @Test
    public void categories_givenDataset_shouldReturnCategoryKeys() {
        CategoryPlot plot = new CategoryPlot();
        Assert.assertNull(plot.getCategories());

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");
        CategoryAxis axis = new CategoryAxis("Domain");

        plot.setDataset(dataset);
        plot.setDomainAxis(axis);

        List categories = plot.getCategories();
        Assert.assertNotNull(categories);
        Assert.assertEquals(2, categories.size());
        Assert.assertEquals("C1", categories.get(0));
        Assert.assertEquals("C2", categories.get(1));

        List axisCategories = plot.getCategoriesForAxis(axis);
        Assert.assertNotNull(axisCategories);
        Assert.assertEquals(2, axisCategories.size());
    }

    @Test
    public void zoom_givenPercent_shouldAdjustRangeAxis() {
        NumberAxis axis = new NumberAxis("Range");
        axis.setRange(0.0, 100.0);
        CategoryPlot plot = new CategoryPlot(null, null, axis, null);
        plot.setAnchorValue(50.0);

        plot.zoom(0.5);
        Range range = axis.getRange();
        Assert.assertEquals(25.0, range.getLowerBound(), 0.0001);
        Assert.assertEquals(75.0, range.getUpperBound(), 0.0001);

        plot.zoom(0.0);
        Assert.assertTrue(axis.isAutoRange());
    }

    @Test
    public void zoomDomainAndRangeAxes_givenFactors_shouldExecuteWithoutException() {
        NumberAxis rangeAxis = new NumberAxis("Range");
        rangeAxis.setRange(0.0, 100.0);
        CategoryPlot plot = new CategoryPlot(null, null, rangeAxis, null);

        plot.zoomDomainAxes(0.5, null, new Point2D.Double(0.0, 0.0));
        plot.zoomDomainAxes(0.1, 0.9, null, new Point2D.Double(0.0, 0.0));

        plot.zoomRangeAxes(0.5, null, new Point2D.Double(0.0, 0.0));
        Assert.assertEquals(50.0, rangeAxis.getRange().getLength(), 0.0001);

        plot.zoomRangeAxes(0.2, 0.8, null, new Point2D.Double(0.0, 0.0));
        Assert.assertTrue(rangeAxis.getRange().getLength() > 0.0);
    }

    @Test
    public void datasetChanged_givenEvent_shouldConfigureAxesAndNotify() {
        NumberAxis axis = new NumberAxis("Range");
        CategoryPlot plot = new CategoryPlot(null, null, axis, null);
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.datasetChanged(new DatasetChangeEvent(this, null));

        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test
    public void rendererChanged_givenEvent_shouldConfigureRangeAxesAndNotify() {
        NumberAxis axis = new NumberAxis("Range");
        CategoryPlot plot = new CategoryPlot(null, null, axis, null);
        TestPlotChangeListener listener = new TestPlotChangeListener();
        plot.addChangeListener(listener);

        plot.rendererChanged(new RendererChangeEvent(new BarRenderer()));

        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test
    public void getDataRange_givenMappedDataset_shouldReturnCombinedRange() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "R1", "C1");
        dataset.addValue(15.0, "R1", "C2");
        NumberAxis axis = new NumberAxis("Range");
        BarRenderer renderer = new BarRenderer();

        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("Domain"), axis, renderer);

        Range range = plot.getDataRange(axis);
        Assert.assertNotNull(range);
        Assert.assertTrue(range.getLowerBound() <= 5.0);
        Assert.assertTrue(range.getUpperBound() >= 15.0);
    }

    @Test
    public void equals_givenSameAndDifferentAttributes_shouldReflectEquality() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();

        Assert.assertTrue(p1.equals(p1));
        Assert.assertFalse(p1.equals(null));
        Assert.assertFalse(p1.equals("A String"));
        Assert.assertTrue(p1.equals(p2));
        Assert.assertTrue(p2.equals(p1));

        p1.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertFalse(p1.equals(p2));
        p2.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertTrue(p1.equals(p2));

        p1.setRangeCrosshairValue(100.0);
        Assert.assertFalse(p1.equals(p2));
        p2.setRangeCrosshairValue(100.0);
        Assert.assertTrue(p1.equals(p2));

        p1.setWeight(10);
        Assert.assertFalse(p1.equals(p2));
        p2.setWeight(10);
        Assert.assertTrue(p1.equals(p2));

        p1.setAnchorValue(5.5);
        Assert.assertFalse(p1.equals(p2));
        p2.setAnchorValue(5.5);
        Assert.assertTrue(p1.equals(p2));
    }

    @Test
    public void clone_givenConfiguredPlot_shouldReturnIndependentClone() throws Exception {
        CategoryPlot plot = new CategoryPlot(
            new DefaultCategoryDataset(),
            new CategoryAxis("Domain"),
            new NumberAxis("Range"),
            new BarRenderer()
        );

        CategoryPlot clone = (CategoryPlot) plot.clone();

        Assert.assertNotSame(plot, clone);
        Assert.assertSame(clone.getClass(), plot.getClass());
        Assert.assertEquals(plot, clone);

        clone.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertFalse(plot.getOrientation().equals(clone.getOrientation()));
    }

    @Test
    public void serialization_givenPlot_shouldSerializeAndDeserialize() throws Exception {
        CategoryPlot plot = new CategoryPlot(
            new DefaultCategoryDataset(),
            new CategoryAxis("Domain"),
            new NumberAxis("Range"),
            new BarRenderer()
        );
        plot.setRangeCrosshairVisible(true);
        plot.setRangeCrosshairValue(42.0);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(plot);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        CategoryPlot deserialized = (CategoryPlot) in.readObject();
        in.close();

        Assert.assertNotNull(deserialized);
        Assert.assertEquals(plot.getOrientation(), deserialized.getOrientation());
        Assert.assertEquals(plot.isRangeCrosshairVisible(), deserialized.isRangeCrosshairVisible());
        Assert.assertEquals(plot.getRangeCrosshairValue(), deserialized.getRangeCrosshairValue(), 0.0001);
    }
}