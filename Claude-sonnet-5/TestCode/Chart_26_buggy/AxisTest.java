package org.jfree.chart.axis;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;

import org.junit.Before;
import org.junit.Test;

public class AxisTest {

    private static class TestAxis extends Axis {
        int configureCount = 0;

        TestAxis(String label) {
            super(label);
        }

        public void configure() {
            configureCount++;
        }

        public AxisSpace reserveSpace(Graphics2D g2, Plot plot,
                Rectangle2D plotArea, RectangleEdge edge, AxisSpace space) {
            return space;
        }

        public AxisState draw(Graphics2D g2, double cursor,
                Rectangle2D plotArea, Rectangle2D dataArea,
                RectangleEdge edge, PlotRenderingInfo plotState) {
            return new AxisState(cursor);
        }

        public List refreshTicks(Graphics2D g2, AxisState state,
                Rectangle2D dataArea, RectangleEdge edge) {
            return new java.util.ArrayList();
        }

        public Rectangle2D publicGetLabelEnclosure(Graphics2D g2,
                RectangleEdge edge) {
            return getLabelEnclosure(g2, edge);
        }

        public AxisState publicDrawLabel(String label, Graphics2D g2,
                Rectangle2D plotArea, Rectangle2D dataArea,
                RectangleEdge edge, AxisState state,
                PlotRenderingInfo plotState) {
            return drawLabel(label, g2, plotArea, dataArea, edge, state,
                    plotState);
        }

        public void publicDrawAxisLine(Graphics2D g2, double cursor,
                Rectangle2D dataArea, RectangleEdge edge) {
            drawAxisLine(g2, cursor, dataArea, edge);
        }

        public void publicNotifyListeners(AxisChangeEvent event) {
            notifyListeners(event);
        }
    }

    private static class RecordingListener implements AxisChangeListener {
        int count = 0;
        AxisChangeEvent lastEvent = null;

        public void axisChanged(AxisChangeEvent event) {
            count++;
            lastEvent = event;
        }
    }

    private TestAxis axis;
    private Graphics2D g2;

    @Before
    public void setUp() {
        axis = new TestAxis("TestLabel");
        BufferedImage image = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        g2 = image.createGraphics();
    }

    // ---------- Constructor / default values ----------

    @Test
    public void testConstructorDefaults() {
        assertEquals("TestLabel", axis.getLabel());
        assertTrue(axis.isVisible());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_FONT, axis.getLabelFont());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_PAINT, axis.getLabelPaint());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_INSETS, axis.getLabelInsets());
        assertEquals(0.0, axis.getLabelAngle(), 0.0000001);
        assertNull(axis.getLabelToolTip());
        assertNull(axis.getLabelURL());
        assertTrue(axis.isAxisLineVisible());
        assertEquals(Axis.DEFAULT_AXIS_LINE_PAINT, axis.getAxisLinePaint());
        assertEquals(Axis.DEFAULT_AXIS_LINE_STROKE, axis.getAxisLineStroke());
        assertTrue(axis.isTickLabelsVisible());
        assertEquals(Axis.DEFAULT_TICK_LABEL_FONT, axis.getTickLabelFont());
        assertEquals(Axis.DEFAULT_TICK_LABEL_PAINT, axis.getTickLabelPaint());
        assertEquals(Axis.DEFAULT_TICK_LABEL_INSETS,
                axis.getTickLabelInsets());
        assertTrue(axis.isTickMarksVisible());
        assertEquals(Axis.DEFAULT_TICK_MARK_INSIDE_LENGTH,
                axis.getTickMarkInsideLength(), 0.0000001);
        assertEquals(Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH,
                axis.getTickMarkOutsideLength(), 0.0000001);
        assertEquals(Axis.DEFAULT_TICK_MARK_STROKE, axis.getTickMarkStroke());
        assertEquals(Axis.DEFAULT_TICK_MARK_PAINT, axis.getTickMarkPaint());
        assertNull(axis.getPlot());
        assertEquals(0.0, axis.getFixedDimension(), 0.0000001);
    }

    @Test
    public void testConstructorWithNullLabel() {
        TestAxis a = new TestAxis(null);
        assertNull(a.getLabel());
    }

    // ---------- visible ----------

    @Test
    public void testSetVisibleChanges() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setVisible(false);
        assertFalse(axis.isVisible());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetVisibleSameValueNoNotification() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setVisible(true); // same as default
        assertEquals(0, l.count);
    }

    // ---------- label ----------

    @Test
    public void testSetLabelDifferentValue() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setLabel("NewLabel");
        assertEquals("NewLabel", axis.getLabel());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetLabelSameValueNoNotification() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setLabel("TestLabel");
        assertEquals(0, l.count);
    }

    @Test
    public void testSetLabelExistingNullToNonNull() {
        TestAxis a = new TestAxis(null);
        RecordingListener l = new RecordingListener();
        a.addChangeListener(l);
        a.setLabel("Hello");
        assertEquals("Hello", a.getLabel());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetLabelExistingNullToNullNoNotification() {
        TestAxis a = new TestAxis(null);
        RecordingListener l = new RecordingListener();
        a.addChangeListener(l);
        a.setLabel(null);
        assertNull(a.getLabel());
        assertEquals(0, l.count);
    }

    // ---------- labelFont ----------

    @Test
    public void testSetLabelFontNullThrows() {
        try {
            axis.setLabelFont(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetLabelFontDifferent() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        Font f = new Font("Serif", Font.BOLD, 20);
        axis.setLabelFont(f);
        assertEquals(f, axis.getLabelFont());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetLabelFontSameNoNotification() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setLabelFont(Axis.DEFAULT_AXIS_LABEL_FONT);
        assertEquals(0, l.count);
    }

    // ---------- labelPaint ----------

    @Test
    public void testSetLabelPaintNullThrows() {
        try {
            axis.setLabelPaint(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetLabelPaintChanges() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setLabelPaint(Color.red);
        assertEquals(Color.red, axis.getLabelPaint());
        assertEquals(1, l.count);
    }

    // ---------- labelInsets ----------

    @Test
    public void testSetLabelInsetsNullThrows() {
        try {
            axis.setLabelInsets(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetLabelInsetsDifferent() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        RectangleInsets insets = new RectangleInsets(1, 1, 1, 1);
        axis.setLabelInsets(insets);
        assertEquals(insets, axis.getLabelInsets());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetLabelInsetsSameNoNotification() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setLabelInsets(Axis.DEFAULT_AXIS_LABEL_INSETS);
        assertEquals(0, l.count);
    }

    // ---------- labelAngle ----------

    @Test
    public void testSetLabelAngle() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setLabelAngle(1.5);
        assertEquals(1.5, axis.getLabelAngle(), 0.0000001);
        assertEquals(1, l.count);
    }

    @Test
    public void testSetLabelAngleBoundaryZero() {
        axis.setLabelAngle(0.0);
        assertEquals(0.0, axis.getLabelAngle(), 0.0000001);
    }

    // ---------- labelToolTip ----------

    @Test
    public void testSetLabelToolTip() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setLabelToolTip("tip");
        assertEquals("tip", axis.getLabelToolTip());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetLabelToolTipNull() {
        axis.setLabelToolTip(null);
        assertNull(axis.getLabelToolTip());
    }

    // ---------- labelURL ----------

    @Test
    public void testSetLabelURL() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setLabelURL("http://example.com");
        assertEquals("http://example.com", axis.getLabelURL());
        assertEquals(1, l.count);
    }

    // ---------- axisLineVisible ----------

    @Test
    public void testSetAxisLineVisible() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setAxisLineVisible(false);
        assertFalse(axis.isAxisLineVisible());
        assertEquals(1, l.count);
    }

    // ---------- axisLinePaint ----------

    @Test
    public void testSetAxisLinePaintNullThrows() {
        try {
            axis.setAxisLinePaint(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetAxisLinePaintChanges() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setAxisLinePaint(Color.blue);
        assertEquals(Color.blue, axis.getAxisLinePaint());
        assertEquals(1, l.count);
    }

    // ---------- axisLineStroke ----------

    @Test
    public void testSetAxisLineStrokeNullThrows() {
        try {
            axis.setAxisLineStroke(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetAxisLineStrokeChanges() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        Stroke s = new BasicStroke(2.0f);
        axis.setAxisLineStroke(s);
        assertEquals(s, axis.getAxisLineStroke());
        assertEquals(1, l.count);
    }

    // ---------- tickLabelsVisible ----------

    @Test
    public void testSetTickLabelsVisibleChanges() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setTickLabelsVisible(false);
        assertFalse(axis.isTickLabelsVisible());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetTickLabelsVisibleSameNoNotification() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setTickLabelsVisible(true);
        assertEquals(0, l.count);
    }

    // ---------- tickLabelFont ----------

    @Test
    public void testSetTickLabelFontNullThrows() {
        try {
            axis.setTickLabelFont(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetTickLabelFontDifferent() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        Font f = new Font("Serif", Font.ITALIC, 14);
        axis.setTickLabelFont(f);
        assertEquals(f, axis.getTickLabelFont());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetTickLabelFontSameNoNotification() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setTickLabelFont(Axis.DEFAULT_TICK_LABEL_FONT);
        assertEquals(0, l.count);
    }

    // ---------- tickLabelPaint ----------

    @Test
    public void testSetTickLabelPaintNullThrows() {
        try {
            axis.setTickLabelPaint(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetTickLabelPaintChanges() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setTickLabelPaint(Color.green);
        assertEquals(Color.green, axis.getTickLabelPaint());
        assertEquals(1, l.count);
    }

    // ---------- tickLabelInsets ----------

    @Test
    public void testSetTickLabelInsetsNullThrows() {
        try {
            axis.setTickLabelInsets(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetTickLabelInsetsDifferent() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        RectangleInsets insets = new RectangleInsets(5, 5, 5, 5);
        axis.setTickLabelInsets(insets);
        assertEquals(insets, axis.getTickLabelInsets());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetTickLabelInsetsSameNoNotification() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setTickLabelInsets(Axis.DEFAULT_TICK_LABEL_INSETS);
        assertEquals(0, l.count);
    }

    // ---------- tickMarksVisible ----------

    @Test
    public void testSetTickMarksVisibleChanges() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setTickMarksVisible(false);
        assertFalse(axis.isTickMarksVisible());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetTickMarksVisibleSameNoNotification() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setTickMarksVisible(true);
        assertEquals(0, l.count);
    }

    // ---------- tickMarkInsideLength / outside length ----------

    @Test
    public void testSetTickMarkInsideLength() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setTickMarkInsideLength(5.5f);
        assertEquals(5.5f, axis.getTickMarkInsideLength(), 0.0000001);
        assertEquals(1, l.count);
    }

    @Test
    public void testSetTickMarkOutsideLength() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setTickMarkOutsideLength(7.5f);
        assertEquals(7.5f, axis.getTickMarkOutsideLength(), 0.0000001);
        assertEquals(1, l.count);
    }

    // ---------- tickMarkStroke ----------

    @Test
    public void testSetTickMarkStrokeNullThrows() {
        try {
            axis.setTickMarkStroke(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetTickMarkStrokeDifferent() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        Stroke s = new BasicStroke(3.0f);
        axis.setTickMarkStroke(s);
        assertEquals(s, axis.getTickMarkStroke());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetTickMarkStrokeSameNoNotification() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setTickMarkStroke(Axis.DEFAULT_TICK_MARK_STROKE);
        assertEquals(0, l.count);
    }

    // ---------- tickMarkPaint ----------

    @Test
    public void testSetTickMarkPaintNullThrows() {
        try {
            axis.setTickMarkPaint(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetTickMarkPaintChanges() {
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        axis.setTickMarkPaint(Color.yellow);
        assertEquals(Color.yellow, axis.getTickMarkPaint());
        assertEquals(1, l.count);
    }

    // ---------- plot ----------

    @Test
    public void testSetPlotCallsConfigure() {
        assertEquals(0, axis.configureCount);
        axis.setPlot(null);
        assertEquals(1, axis.configureCount);
        assertNull(axis.getPlot());
    }

    // ---------- fixedDimension ----------

    @Test
    public void testSetFixedDimension() {
        axis.setFixedDimension(42.0);
        assertEquals(42.0, axis.getFixedDimension(), 0.0000001);
    }

    @Test
    public void testSetFixedDimensionBoundaryZero() {
        axis.setFixedDimension(0.0);
        assertEquals(0.0, axis.getFixedDimension(), 0.0000001);
    }

    // ---------- listeners ----------

    @Test
    public void testAddRemoveChangeListenerAndHasListener() {
        RecordingListener l = new RecordingListener();
        assertFalse(axis.hasListener(l));
        axis.addChangeListener(l);
        assertTrue(axis.hasListener(l));
        axis.removeChangeListener(l);
        assertFalse(axis.hasListener(l));
    }

    @Test
    public void testNotifyListenersMultiple() {
        RecordingListener l1 = new RecordingListener();
        RecordingListener l2 = new RecordingListener();
        axis.addChangeListener(l1);
        axis.addChangeListener(l2);
        AxisChangeEvent evt = new AxisChangeEvent(axis);
        axis.publicNotifyListeners(evt);
        assertEquals(1, l1.count);
        assertEquals(1, l2.count);
        assertSame(evt, l1.lastEvent);
    }

    @Test
    public void testNotifyListenersNoListeners() {
        // no listener added, zero iterations of loop
        AxisChangeEvent evt = new AxisChangeEvent(axis);
        axis.publicNotifyListeners(evt);
        // no exception expected
        assertTrue(true);
    }

    // ---------- getLabelEnclosure ----------

    @Test
    public void testGetLabelEnclosureWithNullLabel() {
        TestAxis a = new TestAxis(null);
        Rectangle2D rect = a.publicGetLabelEnclosure(g2, RectangleEdge.BOTTOM);
        assertNotNull(rect);
        assertEquals(0.0, rect.getWidth(), 0.0000001);
        assertEquals(0.0, rect.getHeight(), 0.0000001);
    }

    @Test
    public void testGetLabelEnclosureWithEmptyLabel() {
        TestAxis a = new TestAxis("");
        Rectangle2D rect = a.publicGetLabelEnclosure(g2, RectangleEdge.BOTTOM);
        assertNotNull(rect);
        assertEquals(0.0, rect.getWidth(), 0.0000001);
    }

    @Test
    public void testGetLabelEnclosureWithLabelBottom() {
        Rectangle2D rect = axis.publicGetLabelEnclosure(g2,
                RectangleEdge.BOTTOM);
        assertNotNull(rect);
        assertTrue(rect.getWidth() > 0);
    }

    @Test
    public void testGetLabelEnclosureWithLabelLeft() {
        Rectangle2D rect = axis.publicGetLabelEnclosure(g2,
                RectangleEdge.LEFT);
        assertNotNull(rect);
        assertTrue(rect.getHeight() > 0 || rect.getWidth() > 0);
    }

    @Test
    public void testGetLabelEnclosureWithLabelRight() {
        Rectangle2D rect = axis.publicGetLabelEnclosure(g2,
                RectangleEdge.RIGHT);
        assertNotNull(rect);
    }

    @Test
    public void testGetLabelEnclosureWithLabelTop() {
        Rectangle2D rect = axis.publicGetLabelEnclosure(g2,
                RectangleEdge.TOP);
        assertNotNull(rect);
    }

    // ---------- drawLabel ----------

    @Test
    public void testDrawLabelNullStateThrows() {
        try {
            axis.publicDrawLabel("hello", g2, new Rectangle2D.Double(0, 0,
                    100, 100), new Rectangle2D.Double(0, 0, 100, 100),
                    RectangleEdge.BOTTOM, null, null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDrawLabelEmptyLabelReturnsStateUnchanged() {
        AxisState state = new AxisState(50.0);
        AxisState result = axis.publicDrawLabel("", g2,
                new Rectangle2D.Double(0, 0, 100, 100),
                new Rectangle2D.Double(0, 0, 100, 100),
                RectangleEdge.BOTTOM, state, null);
        assertSame(state, result);
        assertEquals(50.0, result.getCursor(), 0.0000001);
    }

    @Test
    public void testDrawLabelNullLabelReturnsStateUnchanged() {
        AxisState state = new AxisState(50.0);
        AxisState result = axis.publicDrawLabel(null, g2,
                new Rectangle2D.Double(0, 0, 100, 100),
                new Rectangle2D.Double(0, 0, 100, 100),
                RectangleEdge.BOTTOM, state, null);
        assertSame(state, result);
    }

    @Test
    public void testDrawLabelTopEdge() {
        AxisState state = new AxisState(50.0);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        AxisState result = axis.publicDrawLabel("Label", g2, dataArea,
                dataArea, RectangleEdge.TOP, state, null);
        assertNotNull(result);
        assertTrue(result.getCursor() < 50.0);
    }

    @Test
    public void testDrawLabelBottomEdge() {
        AxisState state = new AxisState(50.0);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        AxisState result = axis.publicDrawLabel("Label", g2, dataArea,
                dataArea, RectangleEdge.BOTTOM, state, null);
        assertNotNull(result);
        assertTrue(result.getCursor() > 50.0);
    }

    @Test
    public void testDrawLabelLeftEdge() {
        AxisState state = new AxisState(50.0);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        AxisState result = axis.publicDrawLabel("Label", g2, dataArea,
                dataArea, RectangleEdge.LEFT, state, null);
        assertNotNull(result);
        assertTrue(result.getCursor() < 50.0);
    }

    @Test
    public void testDrawLabelRightEdge() {
        AxisState state = new AxisState(50.0);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        AxisState result = axis.publicDrawLabel("Label", g2, dataArea,
                dataArea, RectangleEdge.RIGHT, state, null);
        assertNotNull(result);
        assertTrue(result.getCursor() > 50.0);
    }

    // ---------- drawAxisLine ----------

    @Test
    public void testDrawAxisLineTop() {
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        axis.publicDrawAxisLine(g2, 10.0, dataArea, RectangleEdge.TOP);
        // no exception means success
        assertTrue(true);
    }

    @Test
    public void testDrawAxisLineBottom() {
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        axis.publicDrawAxisLine(g2, 10.0, dataArea, RectangleEdge.BOTTOM);
        assertTrue(true);
    }

    @Test
    public void testDrawAxisLineLeft() {
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        axis.publicDrawAxisLine(g2, 10.0, dataArea, RectangleEdge.LEFT);
        assertTrue(true);
    }

    @Test
    public void testDrawAxisLineRight() {
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        axis.publicDrawAxisLine(g2, 10.0, dataArea, RectangleEdge.RIGHT);
        assertTrue(true);
    }

    // ---------- clone ----------

    @Test
    public void testCloneIndependence() throws CloneNotSupportedException {
        axis.setPlot(null);
        RecordingListener l = new RecordingListener();
        axis.addChangeListener(l);
        TestAxis clone = (TestAxis) axis.clone();
        assertNotSame(axis, clone);
        assertEquals(axis.getLabel(), clone.getLabel());
        assertNull(clone.getPlot());
        assertFalse(clone.hasListener(l));
        // modifying clone should not affect original
        clone.setLabel("ClonedLabel");
        assertFalse(axis.getLabel().equals(clone.getLabel()));
    }

    // ---------- equals ----------

    @Test
    public void testEqualsSameInstance() {
        assertTrue(axis.equals(axis));
    }

    @Test
    public void testEqualsNotAxisInstance() {
        assertFalse(axis.equals("not an axis"));
    }

    @Test
    public void testEqualsIdenticalAxes() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        assertTrue(a1.equals(a2));
        assertTrue(a2.equals(a1));
    }

    @Test
    public void testEqualsDifferentVisible() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setVisible(false);
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentLabel() {
        TestAxis a1 = new TestAxis("Label1");
        TestAxis a2 = new TestAxis("Label2");
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentLabelFont() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setLabelFont(new Font("Serif", Font.BOLD, 20));
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentLabelPaint() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setLabelPaint(Color.red);
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentLabelInsets() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setLabelInsets(new RectangleInsets(9, 9, 9, 9));
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentLabelAngle() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setLabelAngle(1.234);
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentLabelToolTip() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setLabelToolTip("tip");
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentLabelURL() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setLabelURL("http://x.com");
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentAxisLineVisible() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setAxisLineVisible(false);
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentAxisLineStroke() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setAxisLineStroke(new BasicStroke(5.0f));
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentAxisLinePaint() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setAxisLinePaint(Color.magenta);
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentTickLabelsVisible() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setTickLabelsVisible(false);
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentTickLabelFont() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setTickLabelFont(new Font("Serif", Font.ITALIC, 8));
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentTickLabelPaint() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setTickLabelPaint(Color.cyan);
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentTickLabelInsets() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setTickLabelInsets(new RectangleInsets(10, 10, 10, 10));
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentTickMarksVisible() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setTickMarksVisible(false);
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentTickMarkInsideLength() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setTickMarkInsideLength(99.0f);
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentTickMarkOutsideLength() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setTickMarkOutsideLength(99.0f);
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentTickMarkPaint() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setTickMarkPaint(Color.orange);
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentTickMarkStroke() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setTickMarkStroke(new BasicStroke(9.0f));
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentFixedDimension() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        a2.setFixedDimension(123.0);
        assertFalse(a1.equals(a2));
    }

    // ---------- serialization ----------

    @Test
    public void testSerialization() throws Exception {
        axis.setLabelPaint(Color.red);
        axis.setTickLabelPaint(Color.blue);
        axis.setAxisLineStroke(new BasicStroke(3.0f));
        axis.setAxisLinePaint(Color.green);
        axis.setTickMarkStroke(new BasicStroke(4.0f));
        axis.setTickMarkPaint(Color.yellow);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(axis);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(
                baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        TestAxis result = (TestAxis) ois.readObject();
        ois.close();

        assertEquals(axis.getLabel(), result.getLabel());
        assertEquals(axis.getLabelPaint(), result.getLabelPaint());
        assertEquals(axis.getTickLabelPaint(), result.getTickLabelPaint());
        assertEquals(axis.getAxisLineStroke(), result.getAxisLineStroke());
        assertEquals(axis.getAxisLinePaint(), result.getAxisLinePaint());
        assertEquals(axis.getTickMarkStroke(), result.getTickMarkStroke());
        assertEquals(axis.getTickMarkPaint(), result.getTickMarkPaint());
    }
}