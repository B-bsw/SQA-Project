package org.jfree.chart.plot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.XYAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.general.DatasetChangeEvent;

import org.junit.Assert;
import org.junit.Test;

public class XYPlotTest {

    private static class TestPlotListener implements PlotChangeListener {
        private int eventCount = 0;

        public void plotChanged(PlotChangeEvent event) {
            this.eventCount++;
        }

        public int getEventCount() {
            return this.eventCount;
        }
    }

    private static class TestAnnotation implements XYAnnotation, PublicCloneable, Serializable {
        private static final long serialVersionUID = 1L;
        private String name;

        public TestAnnotation(String name) {
            this.name = name;
        }

        public void draw(Graphics2D g2, XYPlot plot, Rectangle2D dataArea,
                         ValueAxis domainAxis, ValueAxis rangeAxis,
                         int rendererIndex, PlotRenderingInfo info) {
        }

        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TestAnnotation)) {
                return false;
            }
            TestAnnotation other = (TestAnnotation) obj;
            return this.name.equals(other.name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }
    }

    @Test
    public void constructor_default_shouldInitializeDefaultValues() {
        XYPlot plot = new XYPlot();

        Assert.assertEquals("XY Plot", plot.getPlotType());
        Assert.assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        Assert.assertEquals(1, plot.getWeight());
        Assert.assertEquals(new RectangleInsets(4.0, 4.0, 4.0, 4.0), plot.getAxisOffset());
        Assert.assertTrue(plot.isDomainGridlinesVisible());
        Assert.assertTrue(plot.isRangeGridlinesVisible());
        Assert.assertFalse(plot.isDomainZeroBaselineVisible());
        Assert.assertFalse(plot.isRangeZeroBaselineVisible());
        Assert.assertFalse(plot.isDomainCrosshairVisible());
        Assert.assertFalse(plot.isRangeCrosshairVisible());
        Assert.assertTrue(plot.isDomainCrosshairLockedOnData());
        Assert.assertTrue(plot.isRangeCrosshairLockedOnData());
        Assert.assertEquals(DatasetRenderingOrder.REVERSE, plot.getDatasetRenderingOrder());
        Assert.assertEquals(SeriesRenderingOrder.REVERSE, plot.getSeriesRenderingOrder());
        Assert.assertTrue(plot.isDomainZoomable());
        Assert.assertTrue(plot.isRangeZoomable());
        Assert.assertEquals(0, plot.getSeriesCount());
        Assert.assertNull(plot.getFixedDomainAxisSpace());
        Assert.assertNull(plot.getFixedRangeAxisSpace());
        Assert.assertEquals(new Point2D.Double(0.0, 0.0), plot.getQuadrantOrigin());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setOrientation_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(null);
    }

    @Test
    public void setOrientation_givenValidOrientation_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
        Assert.assertEquals(1, listener.getEventCount());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setAxisOffset_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setAxisOffset(null);
    }

    @Test
    public void setAxisOffset_givenValidOffset_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        RectangleInsets offset = new RectangleInsets(5.0, 5.0, 5.0, 5.0);
        plot.setAxisOffset(offset);

        Assert.assertEquals(offset, plot.getAxisOffset());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setDomainAxis_givenValidAxis_shouldSetAndConfigure() {
        XYPlot plot = new XYPlot();
        NumberAxis axis = new NumberAxis("Domain");
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainAxis(axis);

        Assert.assertSame(axis, plot.getDomainAxis());
        Assert.assertSame(axis, plot.getDomainAxis(0));
        Assert.assertSame(plot, axis.getPlot());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test
    public void setDomainAxis_givenNullNotifyFalse_shouldNotFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainAxis(0, null, false);

        Assert.assertNull(plot.getDomainAxis(0));
        Assert.assertEquals(0, listener.getEventCount());
    }

    @Test
    public void setDomainAxes_givenArray_shouldSetAllAxes() {
        XYPlot plot = new XYPlot();
        NumberAxis axis1 = new NumberAxis("X1");
        NumberAxis axis2 = new NumberAxis("X2");

        plot.setDomainAxes(new ValueAxis[] {axis1, axis2});

        Assert.assertSame(axis1, plot.getDomainAxis(0));
        Assert.assertSame(axis2, plot.getDomainAxis(1));
        Assert.assertEquals(2, plot.getDomainAxisCount());
    }

    @Test
    public void clearDomainAxes_whenInvoked_shouldClearAllAxes() {
        XYPlot plot = new XYPlot();
        NumberAxis axis = new NumberAxis("X");
        plot.setDomainAxis(0, axis);

        plot.clearDomainAxes();

        Assert.assertEquals(0, plot.getDomainAxisCount());
        Assert.assertNull(plot.getDomainAxis(0));
    }

    @Test
    public void getDomainAxis_givenChildWithNullAxis_shouldFallbackToParent() {
        XYPlot parent = new XYPlot();
        NumberAxis parentAxis = new NumberAxis("ParentDomain");
        parent.setDomainAxis(0, parentAxis);

        XYPlot child = new XYPlot();
        child.setParent(parent);
        child.setDomainAxis(0, null);

        Assert.assertSame(parentAxis, child.getDomainAxis(0));
        Assert.assertEquals(0, child.getDomainAxisIndex(parentAxis));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainAxisLocation_givenIndex0Null_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setDomainAxisLocation(0, null);
    }

    @Test
    public void setDomainAxisLocation_givenValidLocation_shouldUpdateAndResolveEdge() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT, true);

        Assert.assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
        Assert.assertEquals(RectangleEdge.TOP, plot.getDomainAxisEdge());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test
    public void getDomainAxisLocation_givenIndexBeyondList_shouldReturnOpposite() {
        XYPlot plot = new XYPlot();
        plot.setDomainAxisLocation(0, AxisLocation.BOTTOM_OR_LEFT);

        AxisLocation location1 = plot.getDomainAxisLocation(1);
        Assert.assertEquals(AxisLocation.TOP_OR_RIGHT, location1);
    }

    @Test
    public void setRangeAxis_givenValidAxis_shouldSetAndConfigure() {
        XYPlot plot = new XYPlot();
        NumberAxis axis = new NumberAxis("Range");
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeAxis(axis);

        Assert.assertSame(axis, plot.getRangeAxis());
        Assert.assertSame(axis, plot.getRangeAxis(0));
        Assert.assertSame(plot, axis.getPlot());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test
    public void setRangeAxis_givenNullNotifyFalse_shouldNotFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeAxis(0, null, false);

        Assert.assertNull(plot.getRangeAxis(0));
        Assert.assertEquals(0, listener.getEventCount());
    }

    @Test
    public void setRangeAxes_givenArray_shouldSetAllAxes() {
        XYPlot plot = new XYPlot();
        NumberAxis axis1 = new NumberAxis("Y1");
        NumberAxis axis2 = new NumberAxis("Y2");

        plot.setRangeAxes(new ValueAxis[] {axis1, axis2});

        Assert.assertSame(axis1, plot.getRangeAxis(0));
        Assert.assertSame(axis2, plot.getRangeAxis(1));
        Assert.assertEquals(2, plot.getRangeAxisCount());
    }

    @Test
    public void clearRangeAxes_whenInvoked_shouldClearAllAxes() {
        XYPlot plot = new XYPlot();
        NumberAxis axis = new NumberAxis("Y");
        plot.setRangeAxis(0, axis);

        plot.clearRangeAxes();

        Assert.assertEquals(0, plot.getRangeAxisCount());
        Assert.assertNull(plot.getRangeAxis(0));
    }

    @Test
    public void getRangeAxis_givenChildWithNullAxis_shouldFallbackToParent() {
        XYPlot parent = new XYPlot();
        NumberAxis parentAxis = new NumberAxis("ParentRange");
        parent.setRangeAxis(0, parentAxis);

        XYPlot child = new XYPlot();
        child.setParent(parent);
        child.setRangeAxis(0, null);

        Assert.assertSame(parentAxis, child.getRangeAxis(0));
        Assert.assertEquals(0, child.getRangeAxisIndex(parentAxis));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeAxisLocation_givenIndex0Null_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setRangeAxisLocation(0, null);
    }

    @Test
    public void setRangeAxisLocation_givenValidLocation_shouldUpdateAndResolveEdge() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT, true);

        Assert.assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getRangeAxisLocation());
        Assert.assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge());
        Assert.assertTrue(listener.getEventCount() > 0);
    }

    @Test
    public void getRangeAxisLocation_givenIndexBeyondList_shouldReturnOpposite() {
        XYPlot plot = new XYPlot();
        plot.setRangeAxisLocation(0, AxisLocation.BOTTOM_OR_LEFT);

        AxisLocation location1 = plot.getRangeAxisLocation(1);
        Assert.assertEquals(AxisLocation.TOP_OR_RIGHT, location1);
    }

    @Test
    public void setWeight_givenNewWeight_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setWeight(3);

        Assert.assertEquals(3, plot.getWeight());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDatasetRenderingOrder_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setDatasetRenderingOrder(null);
    }

    @Test
    public void setDatasetRenderingOrder_givenValidOrder_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);

        Assert.assertEquals(DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setSeriesRenderingOrder_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setSeriesRenderingOrder(null);
    }

    @Test
    public void setSeriesRenderingOrder_givenValidOrder_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);

        Assert.assertEquals(SeriesRenderingOrder.FORWARD, plot.getSeriesRenderingOrder());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getDomainAxisForDataset_givenNegativeIndex_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.getDomainAxisForDataset(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getDomainAxisForDataset_givenOutOfBoundsIndex_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.getDomainAxisForDataset(plot.getDatasetCount());
    }

    @Test
    public void getDomainAxisForDataset_givenValidDatasetIndex_shouldReturnMappedAxis() {
        XYPlot plot = new XYPlot();
        NumberAxis axis0 = new NumberAxis("Domain0");
        NumberAxis axis1 = new NumberAxis("Domain1");
        plot.setDomainAxis(0, axis0);
        plot.setDomainAxis(1, axis1);

        plot.mapDatasetToDomainAxis(0, 1);

        Assert.assertSame(axis1, plot.getDomainAxisForDataset(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getRangeAxisForDataset_givenNegativeIndex_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.getRangeAxisForDataset(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getRangeAxisForDataset_givenOutOfBoundsIndex_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.getRangeAxisForDataset(plot.getDatasetCount());
    }

    @Test
    public void getRangeAxisForDataset_givenValidDatasetIndex_shouldReturnMappedAxis() {
        XYPlot plot = new XYPlot();
        NumberAxis axis0 = new NumberAxis("Range0");
        NumberAxis axis1 = new NumberAxis("Range1");
        plot.setRangeAxis(0, axis0);
        plot.setRangeAxis(1, axis1);

        plot.mapDatasetToRangeAxis(0, 1);

        Assert.assertSame(axis1, plot.getRangeAxisForDataset(0));
    }

    @Test
    public void setDomainGridlinesVisible_givenChange_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainGridlinesVisible(false);
        Assert.assertFalse(plot.isDomainGridlinesVisible());
        Assert.assertEquals(1, listener.getEventCount());

        plot.setDomainGridlinesVisible(false);
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainGridlineStroke_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setDomainGridlineStroke(null);
    }

    @Test
    public void setDomainGridlineStroke_givenValidStroke_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        BasicStroke stroke = new BasicStroke(1.5f);
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainGridlineStroke(stroke);

        Assert.assertEquals(stroke, plot.getDomainGridlineStroke());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainGridlinePaint_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setDomainGridlinePaint(null);
    }

    @Test
    public void setDomainGridlinePaint_givenValidPaint_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainGridlinePaint(Color.red);

        Assert.assertEquals(Color.red, plot.getDomainGridlinePaint());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setRangeGridlinesVisible_givenChange_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeGridlinesVisible(false);
        Assert.assertFalse(plot.isRangeGridlinesVisible());
        Assert.assertEquals(1, listener.getEventCount());

        plot.setRangeGridlinesVisible(false);
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeGridlineStroke_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setRangeGridlineStroke(null);
    }

    @Test
    public void setRangeGridlineStroke_givenValidStroke_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        BasicStroke stroke = new BasicStroke(2.0f);
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeGridlineStroke(stroke);

        Assert.assertEquals(stroke, plot.getRangeGridlineStroke());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeGridlinePaint_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setRangeGridlinePaint(null);
    }

    @Test
    public void setRangeGridlinePaint_givenValidPaint_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeGridlinePaint(Color.green);

        Assert.assertEquals(Color.green, plot.getRangeGridlinePaint());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setDomainZeroBaselineVisible_givenChange_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainZeroBaselineVisible(true);
        Assert.assertTrue(plot.isDomainZeroBaselineVisible());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainZeroBaselineStroke_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setDomainZeroBaselineStroke(null);
    }

    @Test
    public void setDomainZeroBaselineStroke_givenValidStroke_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        BasicStroke stroke = new BasicStroke(2.5f);
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainZeroBaselineStroke(stroke);

        Assert.assertEquals(stroke, plot.getDomainZeroBaselineStroke());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainZeroBaselinePaint_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setDomainZeroBaselinePaint(null);
    }

    @Test
    public void setDomainZeroBaselinePaint_givenValidPaint_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainZeroBaselinePaint(Color.yellow);

        Assert.assertEquals(Color.yellow, plot.getDomainZeroBaselinePaint());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setRangeZeroBaselineVisible_givenChange_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeZeroBaselineVisible(true);
        Assert.assertTrue(plot.isRangeZeroBaselineVisible());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeZeroBaselineStroke_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setRangeZeroBaselineStroke(null);
    }

    @Test
    public void setRangeZeroBaselineStroke_givenValidStroke_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        BasicStroke stroke = new BasicStroke(1.2f);
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeZeroBaselineStroke(stroke);

        Assert.assertEquals(stroke, plot.getRangeZeroBaselineStroke());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeZeroBaselinePaint_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setRangeZeroBaselinePaint(null);
    }

    @Test
    public void setRangeZeroBaselinePaint_givenValidPaint_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeZeroBaselinePaint(Color.magenta);

        Assert.assertEquals(Color.magenta, plot.getRangeZeroBaselinePaint());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setDomainCrosshairVisible_givenChange_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainCrosshairVisible(true);
        Assert.assertTrue(plot.isDomainCrosshairVisible());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setDomainCrosshairLockedOnData_givenChange_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isDomainCrosshairLockedOnData());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setDomainCrosshairValue_givenValue_shouldUpdate() {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairVisible(true);
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainCrosshairValue(12.5);

        Assert.assertEquals(12.5, plot.getDomainCrosshairValue(), 0.0001);
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainCrosshairStroke_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairStroke(null);
    }

    @Test
    public void setDomainCrosshairStroke_givenValidStroke_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        BasicStroke stroke = new BasicStroke(3.0f);
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainCrosshairStroke(stroke);

        Assert.assertEquals(stroke, plot.getDomainCrosshairStroke());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDomainCrosshairPaint_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairPaint(null);
    }

    @Test
    public void setDomainCrosshairPaint_givenValidPaint_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainCrosshairPaint(Color.cyan);

        Assert.assertEquals(Color.cyan, plot.getDomainCrosshairPaint());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setRangeCrosshairVisible_givenChange_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeCrosshairVisible(true);
        Assert.assertTrue(plot.isRangeCrosshairVisible());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setRangeCrosshairLockedOnData_givenChange_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isRangeCrosshairLockedOnData());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setRangeCrosshairValue_givenValue_shouldUpdate() {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairVisible(true);
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeCrosshairValue(25.5);

        Assert.assertEquals(25.5, plot.getRangeCrosshairValue(), 0.0001);
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeCrosshairStroke_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairStroke(null);
    }

    @Test
    public void setRangeCrosshairStroke_givenValidStroke_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        BasicStroke stroke = new BasicStroke(3.5f);
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeCrosshairStroke(stroke);

        Assert.assertEquals(stroke, plot.getRangeCrosshairStroke());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRangeCrosshairPaint_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairPaint(null);
    }

    @Test
    public void setRangeCrosshairPaint_givenValidPaint_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeCrosshairPaint(Color.orange);

        Assert.assertEquals(Color.orange, plot.getRangeCrosshairPaint());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setTickBandPaints_givenPaints_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainTickBandPaint(Color.lightGray);
        plot.setRangeTickBandPaint(Color.darkGray);

        Assert.assertEquals(Color.lightGray, plot.getDomainTickBandPaint());
        Assert.assertEquals(Color.darkGray, plot.getRangeTickBandPaint());
        Assert.assertEquals(2, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setQuadrantOrigin_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setQuadrantOrigin(null);
    }

    @Test
    public void setQuadrantOrigin_givenValidPoint_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        Point2D origin = new Point2D.Double(5.0, 10.0);
        plot.setQuadrantOrigin(origin);

        Assert.assertEquals(origin, plot.getQuadrantOrigin());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getQuadrantPaint_givenNegativeIndex_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.getQuadrantPaint(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getQuadrantPaint_givenIndexAboveThree_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.getQuadrantPaint(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setQuadrantPaint_givenNegativeIndex_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setQuadrantPaint(-1, Color.red);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setQuadrantPaint_givenIndexAboveThree_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.setQuadrantPaint(4, Color.red);
    }

    @Test
    public void setQuadrantPaint_givenValidIndex_shouldStorePaintAndFireEvent() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setQuadrantPaint(0, Color.red);
        plot.setQuadrantPaint(1, Color.green);
        plot.setQuadrantPaint(2, Color.blue);
        plot.setQuadrantPaint(3, Color.yellow);

        Assert.assertEquals(Color.red, plot.getQuadrantPaint(0));
        Assert.assertEquals(Color.green, plot.getQuadrantPaint(1));
        Assert.assertEquals(Color.blue, plot.getQuadrantPaint(2));
        Assert.assertEquals(Color.yellow, plot.getQuadrantPaint(3));
        Assert.assertEquals(4, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addDomainMarker_givenNullMarker_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.addDomainMarker(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addDomainMarker_givenNullLayer_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        ValueMarker marker = new ValueMarker(1.0);
        plot.addDomainMarker(marker, null);
    }

    @Test
    public void addAndRemoveDomainMarker_givenValidMarker_shouldManageCollection() {
        XYPlot plot = new XYPlot();
        ValueMarker marker1 = new ValueMarker(1.0);
        ValueMarker marker2 = new ValueMarker(2.0);

        plot.addDomainMarker(marker1, Layer.FOREGROUND);
        plot.addDomainMarker(0, marker2, Layer.BACKGROUND);

        Collection fgMarkers = plot.getDomainMarkers(Layer.FOREGROUND);
        Collection bgMarkers = plot.getDomainMarkers(0, Layer.BACKGROUND);

        Assert.assertTrue(fgMarkers.contains(marker1));
        Assert.assertTrue(bgMarkers.contains(marker2));

        boolean removed = plot.removeDomainMarker(marker1, Layer.FOREGROUND);
        Assert.assertTrue(removed);

        boolean removedAgain = plot.removeDomainMarker(marker1, Layer.FOREGROUND);
        Assert.assertFalse(removedAgain);

        plot.clearDomainMarkers();
        Assert.assertNull(plot.getDomainMarkers(Layer.BACKGROUND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeRangeMarker_givenNullMarker_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.removeRangeMarker(0, null, Layer.FOREGROUND, true);
    }

    @Test
    public void addAndRemoveRangeMarker_givenValidMarker_shouldManageCollection() {
        XYPlot plot = new XYPlot();
        ValueMarker marker1 = new ValueMarker(10.0);
        ValueMarker marker2 = new ValueMarker(20.0);

        plot.addRangeMarker(marker1);
        plot.addRangeMarker(0, marker2, Layer.BACKGROUND);

        Collection fgMarkers = plot.getRangeMarkers(Layer.FOREGROUND);
        Collection bgMarkers = plot.getRangeMarkers(0, Layer.BACKGROUND);

        Assert.assertTrue(fgMarkers.contains(marker1));
        Assert.assertTrue(bgMarkers.contains(marker2));

        boolean removed = plot.removeRangeMarker(marker1);
        Assert.assertTrue(removed);

        boolean removedAgain = plot.removeRangeMarker(marker1);
        Assert.assertFalse(removedAgain);

        plot.clearRangeMarkers(0);
        Collection remainingBg = plot.getRangeMarkers(0, Layer.BACKGROUND);
        Assert.assertTrue(remainingBg == null || remainingBg.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addAnnotation_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.addAnnotation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeAnnotation_givenNull_shouldThrowIllegalArgumentException() {
        XYPlot plot = new XYPlot();
        plot.removeAnnotation(null);
    }

    @Test
    public void addAndRemoveAnnotation_givenValidAnnotation_shouldManageList() {
        XYPlot plot = new XYPlot();
        TestAnnotation annotation = new TestAnnotation("A1");
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.addAnnotation(annotation);
        Assert.assertEquals(1, plot.getAnnotations().size());
        Assert.assertEquals(1, listener.getEventCount());

        boolean removed = plot.removeAnnotation(annotation);
        Assert.assertTrue(removed);
        Assert.assertEquals(0, plot.getAnnotations().size());
        Assert.assertEquals(2, listener.getEventCount());

        plot.addAnnotation(annotation, false);
        Assert.assertEquals(1, plot.getAnnotations().size());
        Assert.assertEquals(2, listener.getEventCount());

        plot.clearAnnotations();
        Assert.assertEquals(0, plot.getAnnotations().size());
        Assert.assertEquals(3, listener.getEventCount());
    }

    @Test
    public void setFixedDomainAxisSpace_givenSpace_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        AxisSpace space = new AxisSpace();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setFixedDomainAxisSpace(space);

        Assert.assertSame(space, plot.getFixedDomainAxisSpace());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setFixedRangeAxisSpace_givenSpace_shouldUpdateAndFireEvent() {
        XYPlot plot = new XYPlot();
        AxisSpace space = new AxisSpace();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setFixedRangeAxisSpace(space);

        Assert.assertSame(space, plot.getFixedRangeAxisSpace());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void setFixedLegendItems_givenItems_shouldUpdateAndReturnFixedItems() {
        XYPlot plot = new XYPlot();
        LegendItemCollection items = new LegendItemCollection();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setFixedLegendItems(items);

        Assert.assertSame(items, plot.getFixedLegendItems());
        Assert.assertSame(items, plot.getLegendItems());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void zoomDomainAxes_givenFactor_shouldResizeDomainAxis() {
        XYPlot plot = new XYPlot();
        NumberAxis axis = new NumberAxis("X");
        axis.setRange(0.0, 100.0);
        plot.setDomainAxis(axis);

        plot.zoomDomainAxes(0.5, null, new Point2D.Double(0.0, 0.0), false);

        Assert.assertEquals(25.0, axis.getLowerBound(), 0.001);
        Assert.assertEquals(75.0, axis.getUpperBound(), 0.001);
    }

    @Test
    public void zoomDomainAxes_givenPercentages_shouldZoomRange() {
        XYPlot plot = new XYPlot();
        NumberAxis axis = new NumberAxis("X");
        axis.setRange(0.0, 100.0);
        plot.setDomainAxis(axis);

        plot.zoomDomainAxes(0.2, 0.8, null, null);

        Assert.assertEquals(20.0, axis.getLowerBound(), 0.001);
        Assert.assertEquals(80.0, axis.getUpperBound(), 0.001);
    }

    @Test
    public void zoomRangeAxes_givenFactor_shouldResizeRangeAxis() {
        XYPlot plot = new XYPlot();
        NumberAxis axis = new NumberAxis("Y");
        axis.setRange(0.0, 100.0);
        plot.setRangeAxis(axis);

        plot.zoomRangeAxes(0.5, null, new Point2D.Double(0.0, 0.0), false);

        Assert.assertEquals(25.0, axis.getLowerBound(), 0.001);
        Assert.assertEquals(75.0, axis.getUpperBound(), 0.001);
    }

    @Test
    public void zoomRangeAxes_givenPercentages_shouldZoomRange() {
        XYPlot plot = new XYPlot();
        NumberAxis axis = new NumberAxis("Y");
        axis.setRange(0.0, 100.0);
        plot.setRangeAxis(axis);

        plot.zoomRangeAxes(0.1, 0.9, null, null);

        Assert.assertEquals(10.0, axis.getLowerBound(), 0.001);
        Assert.assertEquals(90.0, axis.getUpperBound(), 0.001);
    }

    @Test
    public void datasetAndRendererEvents_whenFired_shouldPropagateChange() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.datasetChanged(new DatasetChangeEvent(new Object(), null));
        plot.rendererChanged(new RendererChangeEvent(new Object()));

        Assert.assertTrue(listener.getEventCount() >= 2);
    }

    @Test
    public void equals_givenVariousScenarios_shouldCheckAllFields() {
        XYPlot plot1 = new XYPlot();
        XYPlot plot2 = new XYPlot();

        Assert.assertTrue(plot1.equals(plot1));
        Assert.assertFalse(plot1.equals(null));
        Assert.assertFalse(plot1.equals("Not a Plot"));
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setWeight(5);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setWeight(5);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setDomainGridlinesVisible(false);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setDomainGridlinesVisible(false);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setRangeGridlinesVisible(false);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setRangeGridlinesVisible(false);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setDomainZeroBaselineVisible(true);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setDomainZeroBaselineVisible(true);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setRangeZeroBaselineVisible(true);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setRangeZeroBaselineVisible(true);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setDomainCrosshairVisible(true);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setDomainCrosshairVisible(true);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setDomainCrosshairValue(9.9);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setDomainCrosshairValue(9.9);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setDomainCrosshairLockedOnData(false);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setDomainCrosshairLockedOnData(false);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setRangeCrosshairVisible(true);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setRangeCrosshairVisible(true);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setRangeCrosshairValue(8.8);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setRangeCrosshairValue(8.8);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setRangeCrosshairLockedOnData(false);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setRangeCrosshairLockedOnData(false);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setQuadrantPaint(0, Color.black);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setQuadrantPaint(0, Color.black);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setQuadrantOrigin(new Point2D.Double(1.0, 1.0));
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setQuadrantOrigin(new Point2D.Double(1.0, 1.0));
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setDomainTickBandPaint(Color.blue);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setDomainTickBandPaint(Color.blue);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setRangeTickBandPaint(Color.cyan);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setRangeTickBandPaint(Color.cyan);
        Assert.assertTrue(plot1.equals(plot2));
    }

    @Test
    public void clone_givenConfiguredPlot_shouldCreateIndependentEqualCopy() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainAxis(new NumberAxis("X"));
        plot.setRangeAxis(new NumberAxis("Y"));
        plot.addAnnotation(new TestAnnotation("Annotation1"));
        plot.setQuadrantPaint(0, Color.red);
        plot.setFixedDomainAxisSpace(new AxisSpace());
        plot.setFixedRangeAxisSpace(new AxisSpace());

        XYPlot clone = (XYPlot) plot.clone();

        Assert.assertNotSame(plot, clone);
        Assert.assertEquals(plot, clone);
        Assert.assertNotSame(plot.getDomainAxis(), clone.getDomainAxis());
        Assert.assertNotSame(plot.getRangeAxis(), clone.getRangeAxis());
        Assert.assertSame(clone, clone.getDomainAxis().getPlot());
        Assert.assertSame(clone, clone.getRangeAxis().getPlot());
    }

    @Test
    public void serialization_givenPopulatedPlot_shouldSerializeAndDeserializeAccurately() throws Exception {
        XYPlot original = new XYPlot();
        original.setDomainAxis(new NumberAxis("Domain"));
        original.setRangeAxis(new NumberAxis("Range"));
        original.setDomainTickBandPaint(Color.yellow);
        original.setRangeTickBandPaint(Color.pink);
        original.setQuadrantPaint(0, Color.gray);
        original.setQuadrantOrigin(new Point2D.Double(2.0, 3.0));
        original.setDomainZeroBaselineVisible(true);
        original.setRangeZeroBaselineVisible(true);
        original.setDomainCrosshairVisible(true);
        original.setRangeCrosshairVisible(true);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.close();

        ByteArrayInputStream inBuffer = new ByteArrayInputStream(buffer.toByteArray());
        ObjectInputStream in = new ObjectInputStream(inBuffer);
        XYPlot deserialized = (XYPlot) in.readObject();
        in.close();

        Assert.assertEquals(original, deserialized);
        Assert.assertNotSame(original, deserialized);
    }
}