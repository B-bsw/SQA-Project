package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;

import org.jfree.chart.event.MarkerChangeEvent;
import org.jfree.chart.event.MarkerChangeListener;
import org.junit.Before;
import org.junit.Test;

public class ValueMarkerTest {

    private ValueMarker marker;

    @Before
    public void setUp() {
        marker = new ValueMarker(10.0);
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructorSingleValue() {
        ValueMarker m = new ValueMarker(5.0);
        assertEquals(5.0, m.getValue(), 0.0000001);
    }

    @Test
    public void testConstructorSingleValueNegative() {
        ValueMarker m = new ValueMarker(-100.0);
        assertEquals(-100.0, m.getValue(), 0.0000001);
    }

    @Test
    public void testConstructorSingleValueZero() {
        ValueMarker m = new ValueMarker(0.0);
        assertEquals(0.0, m.getValue(), 0.0000001);
    }

    @Test
    public void testConstructorWithPaintAndStroke() {
        Paint paint = Color.RED;
        Stroke stroke = new BasicStroke(2.0f);
        ValueMarker m = new ValueMarker(15.0, paint, stroke);
        assertEquals(15.0, m.getValue(), 0.0000001);
        assertEquals(paint, m.getPaint());
        assertEquals(stroke, m.getStroke());
        assertEquals(paint, m.getOutlinePaint());
        assertEquals(stroke, m.getOutlineStroke());
        assertEquals(1.0f, m.getAlpha(), 0.0000001f);
    }

    @Test
    public void testConstructorFullArgs() {
        Paint paint = Color.BLUE;
        Stroke stroke = new BasicStroke(1.0f);
        Paint outlinePaint = Color.GREEN;
        Stroke outlineStroke = new BasicStroke(3.0f);
        float alpha = 0.5f;
        ValueMarker m = new ValueMarker(20.0, paint, stroke, outlinePaint,
                outlineStroke, alpha);
        assertEquals(20.0, m.getValue(), 0.0000001);
        assertEquals(paint, m.getPaint());
        assertEquals(stroke, m.getStroke());
        assertEquals(outlinePaint, m.getOutlinePaint());
        assertEquals(outlineStroke, m.getOutlineStroke());
        assertEquals(alpha, m.getAlpha(), 0.0000001f);
    }

    @Test
    public void testConstructorFullArgsBoundaryAlphaZero() {
        Paint paint = Color.BLACK;
        Stroke stroke = new BasicStroke(1.0f);
        ValueMarker m = new ValueMarker(0.0, paint, stroke, paint, stroke,
                0.0f);
        assertEquals(0.0f, m.getAlpha(), 0.0000001f);
    }

    @Test
    public void testConstructorFullArgsBoundaryAlphaOne() {
        Paint paint = Color.BLACK;
        Stroke stroke = new BasicStroke(1.0f);
        ValueMarker m = new ValueMarker(0.0, paint, stroke, paint, stroke,
                1.0f);
        assertEquals(1.0f, m.getAlpha(), 0.0000001f);
    }

    // ---------- getValue() Tests ----------

    @Test
    public void testGetValue() {
        assertEquals(10.0, marker.getValue(), 0.0000001);
    }

    // ---------- setValue() Tests ----------

    @Test
    public void testSetValueUpdatesValue() {
        marker.setValue(99.5);
        assertEquals(99.5, marker.getValue(), 0.0000001);
    }

    @Test
    public void testSetValueNotifiesListeners() {
        final boolean[] notified = {false};
        final MarkerChangeEvent[] receivedEvent = {null};

        MarkerChangeListener listener = new MarkerChangeListener() {
            public void markerChanged(MarkerChangeEvent event) {
                notified[0] = true;
                receivedEvent[0] = event;
            }
        };

        marker.addChangeListener(listener);
        marker.setValue(50.0);

        assertTrue(notified[0]);
        assertNotNull(receivedEvent[0]);
        assertEquals(marker, receivedEvent[0].getMarker());
        assertEquals(50.0, marker.getValue(), 0.0000001);
    }

    @Test
    public void testSetValueWithoutListenerDoesNotThrow() {
        marker.setValue(123.456);
        assertEquals(123.456, marker.getValue(), 0.0000001);
    }

    @Test
    public void testSetValueMultipleListeners() {
        final int[] callCount = {0};

        MarkerChangeListener listener1 = new MarkerChangeListener() {
            public void markerChanged(MarkerChangeEvent event) {
                callCount[0]++;
            }
        };
        MarkerChangeListener listener2 = new MarkerChangeListener() {
            public void markerChanged(MarkerChangeEvent event) {
                callCount[0]++;
            }
        };

        marker.addChangeListener(listener1);
        marker.addChangeListener(listener2);
        marker.setValue(77.0);

        assertEquals(2, callCount[0]);
    }

    @Test
    public void testSetValueBoundaryNegative() {
        marker.setValue(-1000.0);
        assertEquals(-1000.0, marker.getValue(), 0.0000001);
    }

    @Test
    public void testSetValueBoundaryZero() {
        marker.setValue(0.0);
        assertEquals(0.0, marker.getValue(), 0.0000001);
    }

    // ---------- equals() Tests ----------

    @Test
    public void testEqualsSameInstance() {
        assertTrue(marker.equals(marker));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(marker.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(marker.equals("Not a ValueMarker"));
    }

    @Test
    public void testEqualsDifferentValue() {
        ValueMarker other = new ValueMarker(20.0);
        assertFalse(marker.equals(other));
    }

    @Test
    public void testEqualsSameValueSameAttributes() {
        ValueMarker m1 = new ValueMarker(30.0);
        ValueMarker m2 = new ValueMarker(30.0);
        assertTrue(m1.equals(m2));
        assertTrue(m2.equals(m1));
    }

    @Test
    public void testEqualsDifferentPaint() {
        Stroke stroke = new BasicStroke(1.0f);
        ValueMarker m1 = new ValueMarker(30.0, Color.RED, stroke);
        ValueMarker m2 = new ValueMarker(30.0, Color.BLUE, stroke);
        assertFalse(m1.equals(m2));
    }

    @Test
    public void testEqualsSuperFalseCase() {
        // Different alpha causes super.equals to return false
        ValueMarker m1 = new ValueMarker(30.0, Color.RED,
                new BasicStroke(1.0f), Color.RED, new BasicStroke(1.0f),
                0.5f);
        ValueMarker m2 = new ValueMarker(30.0, Color.RED,
                new BasicStroke(1.0f), Color.RED, new BasicStroke(1.0f),
                0.9f);
        assertFalse(m1.equals(m2));
    }

    @Test
    public void testEqualsBoundaryZeroValue() {
        ValueMarker m1 = new ValueMarker(0.0);
        ValueMarker m2 = new ValueMarker(0.0);
        assertTrue(m1.equals(m2));
    }

    @Test
    public void testEqualsBoundaryNegativeValue() {
        ValueMarker m1 = new ValueMarker(-50.0);
        ValueMarker m2 = new ValueMarker(-50.0);
        assertTrue(m1.equals(m2));
    }
}