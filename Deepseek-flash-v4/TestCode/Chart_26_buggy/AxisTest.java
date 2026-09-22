package org.jfree.chart.axis;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.util.List;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;

public class AxisTest {

    private TestAxis axis;

    @Before
    public void setUp() {
        axis = new TestAxis("Test Axis");
    }

    @Test
    public void testConstructor() {
        assertEquals("Test Axis", axis.getLabel());
        assertTrue(axis.isVisible());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_FONT, axis.getLabelFont());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_PAINT, axis.getLabelPaint());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_INSETS, axis.getLabelInsets());
        assertTrue(axis.isAxisLineVisible());
        assertEquals(Axis.DEFAULT_AXIS_LINE_PAINT, axis.getAxisLinePaint());
        assertEquals(Axis.DEFAULT_AXIS_LINE_STROKE, axis.getAxisLineStroke());
        assertTrue(axis.isTickLabelsVisible());
        assertEquals(Axis.DEFAULT_TICK_LABEL_FONT, axis.getTickLabelFont());
        assertEquals(Axis.DEFAULT_TICK_LABEL_PAINT, axis.getTickLabelPaint());
        assertEquals(Axis.DEFAULT_TICK_LABEL_INSETS, axis.getTickLabelInsets());
        assertTrue(axis.isTickMarksVisible());
        assertEquals(Axis.DEFAULT_TICK_MARK_STROKE, axis.getTickMarkStroke());
        assertEquals(Axis.DEFAULT_TICK_MARK_PAINT, axis.getTickMarkPaint());
        assertEquals(Axis.DEFAULT_TICK_MARK_INSIDE_LENGTH, axis.getTickMarkInsideLength(), 0.0);
        assertEquals(Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH, axis.getTickMarkOutsideLength(), 0.0);
        assertEquals(0.0, axis.getFixedDimension(), 0.0);
        assertNull(axis.getPlot());
    }

    @Test
    public void testSetVisible() {
        axis.setVisible(false);
        assertFalse(axis.isVisible());
        axis.setVisible(true);
        assertTrue(axis.isVisible());
    }

    @Test
    public void testSetLabel() {
        axis.setLabel("New Label");
        assertEquals("New Label", axis.getLabel());
        axis.setLabel(null);
        assertNull(axis.getLabel());
        axis.setLabel("Another");
        assertEquals("Another", axis.getLabel());
    }

    @Test
    public void testSetLabelFontNull() {
        try {
            axis.setLabelFont(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetLabelFont() {
        Font font = new Font("Serif", Font.BOLD, 14);
        axis.setLabelFont(font);
        assertEquals(font, axis.getLabelFont());
    }

    @Test
    public void testSetLabelPaintNull() {
        try {
            axis.setLabelPaint(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetLabelPaint() {
        axis.setLabelPaint(Color.RED);
        assertEquals(Color.RED, axis.getLabelPaint());
    }

    @Test
    public void testSetLabelInsetsNull() {
        try {
            axis.setLabelInsets(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetLabelInsets() {
        RectangleInsets insets = new RectangleInsets(2.0, 2.0, 2.0, 2.0);
        axis.setLabelInsets(insets);
        assertEquals(insets, axis.getLabelInsets());
    }

    @Test
    public void testSetLabelAngle() {
        axis.setLabelAngle(Math.PI / 2);
        assertEquals(Math.PI / 2, axis.getLabelAngle(), 0.0001);
    }

    @Test
    public void testSetLabelToolTip() {
        axis.setLabelToolTip("Tooltip");
        assertEquals("Tooltip", axis.getLabelToolTip());
    }

    @Test
    public void testSetLabelURL() {
        axis.setLabelURL("http://example.com");
        assertEquals("http://example.com", axis.getLabelURL());
    }

    @Test
    public void testSetAxisLineVisible() {
        axis.setAxisLineVisible(false);
        assertFalse(axis.isAxisLineVisible());
        axis.setAxisLineVisible(true);
        assertTrue(axis.isAxisLineVisible());
    }

    @Test
    public void testSetAxisLineStrokeNull() {
        try {
            axis.setAxisLineStroke(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetAxisLineStroke() {
        Stroke stroke = new BasicStroke(2.0f);
        axis.setAxisLineStroke(stroke);
        assertEquals(stroke, axis.getAxisLineStroke());
    }

    @Test
    public void testSetTickLabelsVisible() {
        axis.setTickLabelsVisible(false);
        assertFalse(axis.isTickLabelsVisible());
        axis.setTickLabelsVisible(true);
        assertTrue(axis.isTickLabelsVisible());
    }

    @Test
    public void testSetTickLabelFont() {
        Font font = new Font("Monospaced", Font.ITALIC, 11);
        axis.setTickLabelFont(font);
        assertEquals(font, axis.getTickLabelFont());
    }

    @Test
    public void testSetTickLabelPaint() {
        axis.setTickLabelPaint(Color.BLUE);
        assertEquals(Color.BLUE, axis.getTickLabelPaint());
    }

    @Test
    public void testSetTickLabelInsets() {
        RectangleInsets insets = new RectangleInsets(1.0, 1.0, 1.0, 1.0);
        axis.setTickLabelInsets(insets);
        assertEquals(insets, axis.getTickLabelInsets());
    }

    @Test
    public void testSetTickMarksVisible() {
        axis.setTickMarksVisible(false);
        assertFalse(axis.isTickMarksVisible());
        axis.setTickMarksVisible(true);
        assertTrue(axis.isTickMarksVisible());
    }

    @Test
    public void testSetTickMarkInsideLength() {
        axis.setTickMarkInsideLength(5.0f);
        assertEquals(5.0f, axis.getTickMarkInsideLength(), 0.0);
    }

    @Test
    public void testSetTickMarkOutsideLength() {
        axis.setTickMarkOutsideLength(6.0f);
        assertEquals(6.0f, axis.getTickMarkOutsideLength(), 0.0);
    }

    @Test
    public void testSetTickMarkStroke() {
        Stroke stroke = new BasicStroke(3.0f);
        axis.setTickMarkStroke(stroke);
        assertEquals(stroke, axis.getTickMarkStroke());
    }

    @Test
    public void testSetTickMarkPaint() {
        axis.setTickMarkPaint(Color.GREEN);
        assertEquals(Color.GREEN, axis.getTickMarkPaint());
    }

    @Test
    public void testSetPlot() {
        TestPlot plot = new TestPlot();
        axis.setPlot(plot);
        assertEquals(plot, axis.getPlot());
        assertEquals(1, plot.configureCount);
    }

    @Test
    public void testSetFixedDimension() {
        axis.setFixedDimension(10.0);
        assertEquals(10.0, axis.getFixedDimension(), 0.0);
    }

    @Test
    public void testAddRemoveChangeListener() {
        TestAxisChangeListener listener = new TestAxisChangeListener();
        axis.addChangeListener(listener);
        assertTrue(axis.hasListener(listener));
        axis.removeChangeListener(listener);
        assertFalse(axis.hasListener(listener));
    }

    @Test
    public void testNotifyListeners() {
        TestAxisChangeListener listener = new TestAxisChangeListener();
        axis.addChangeListener(listener);
        axis.setVisible(false);
        assertEquals(1, listener.eventCount);
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(axis.equals(axis));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(axis.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(axis.equals("String"));
    }

    @Test
    public void testEqualsDifferentLabel() {
        TestAxis axis2 = new TestAxis("Other");
        assertFalse(axis.equals(axis2));
    }

    @Test
    public void testEqualsEqual() {
        TestAxis axis2 = new TestAxis("Test Axis");
        assertTrue(axis.equals(axis2));
    }

    @Test
    public void testClone() {
        try {
            TestAxis cloned = (TestAxis) axis.clone();
            assertNotSame(axis, cloned);
            assertEquals(axis, cloned);
        } catch (CloneNotSupportedException e) {
            fail("Clone not supported");
        }
    }

    private static class TestAxis extends Axis {
        private static final long serialVersionUID = 1L;

        public TestAxis(String label) {
            super(label);
        }

        @Override
        public void configure() {
        }

        @Override
        public AxisSpace reserveSpace(Graphics2D g2, Plot plot, Rectangle2D plotArea,
                RectangleEdge edge, AxisSpace space) {
            return null;
        }

        @Override
        public AxisState draw(Graphics2D g2, double cursor, Rectangle2D dataArea,
                PlotRenderingInfo plotState) {
            return null;
        }

        @Override
        public List refreshTicks(Graphics2D g2, AxisState state, RectangleEdge edge) {
            return null;
        }
    }

    private static class TestPlot extends Plot {
        private static final long serialVersionUID = 1L;
        public int configureCount = 0;

        @Override
        public void configure() {
            configureCount++;
        }

        @Override
        public String getPlotType() {
            return "Test Plot";
        }

        @Override
        public void draw(Graphics2D g2, Rectangle2D area, Point anchor,
                PlotState parentState, PlotRenderingInfo info) {
        }
    }

    private static class TestAxisChangeListener implements AxisChangeListener {
        public int eventCount = 0;

        @Override
        public void axisChanged(AxisChangeEvent event) {
            eventCount++;
        }
    }
}