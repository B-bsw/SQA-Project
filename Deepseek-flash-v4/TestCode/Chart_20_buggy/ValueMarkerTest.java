package org.jfree.chart.plot;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.awt.Color;
import java.awt.BasicStroke;

public class ValueMarkerTest {

    private ValueMarker marker;
    private static final double EPSILON = 0.0000001;

    @Before
    public void setUp() {
        marker = new ValueMarker(10.5);
    }

    @After
    public void tearDown() {
        marker = null;
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals("Value should be 10.5", 10.5, marker.getValue(), EPSILON);
        assertNotNull("Paint should not be null", marker.getPaint());
        assertNotNull("Stroke should not be null", marker.getStroke());
    }

    @Test
    public void testConstructorWithPaintStroke() {
        Paint paint = Color.RED;
        Stroke stroke = new BasicStroke(2.0f);
        ValueMarker m = new ValueMarker(5.0, paint, stroke);
        assertEquals("Value should be 5.0", 5.0, m.getValue(), EPSILON);
        assertEquals("Paint mismatch", paint, m.getPaint());
        assertEquals("Stroke mismatch", stroke, m.getStroke());
    }

    @Test
    public void testFullConstructor() {
        Paint paint = Color.BLUE;
        Paint outlinePaint = Color.GREEN;
        Stroke stroke = new BasicStroke(1.5f);
        Stroke outlineStroke = new BasicStroke(0.5f);
        float alpha = 0.75f;
        ValueMarker m = new ValueMarker(7.0, paint, stroke, outlinePaint, outlineStroke, alpha);
        assertEquals("Value should be 7.0", 7.0, m.getValue(), EPSILON);
        assertEquals("Paint mismatch", paint, m.getPaint());
        assertEquals("Outline paint mismatch", outlinePaint, m.getOutlinePaint());
        assertEquals("Alpha mismatch", alpha, m.getAlpha(), EPSILON);
    }

    @Test
    public void testSetValueNormalCase() {
        marker.setValue(20.0);
        assertEquals("Value should be updated to 20.0", 20.0, marker.getValue(), EPSILON);
    }

    @Test
    public void testSetValueNegativeValue() {
        marker.setValue(-3.5);
        assertEquals("Value should be updated to -3.5", -3.5, marker.getValue(), EPSILON);
    }

    @Test
    public void testSetValueExtremeValue() {
        marker.setValue(Double.MAX_VALUE);
        assertEquals("Value should be Double.MAX_VALUE", Double.MAX_VALUE, marker.getValue(), 0.0);
        marker.setValue(Double.MIN_VALUE);
        assertEquals("Value should be Double.MIN_VALUE", Double.MIN_VALUE, marker.getValue(), 0.0);
    }

    @Test
    public void testGetValueInitial() {
        assertEquals("Initial value should be 10.5", 10.5, marker.getValue(), EPSILON);
    }

    @Test
    public void testEqualsSameObject() {
        assertEquals("Object should be equal to itself", marker, marker);
    }

    @Test
    public void testEqualsNull() {
        assertFalse("Should not be equal to null", marker.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Object obj = new Object();
        assertFalse("Should not be equal to different class", marker.equals(obj));
    }

    @Test
    public void testEqualsWithEqualValue() {
        ValueMarker other = new ValueMarker(10.5);
        assertEquals("Markers with same value should be equal", marker, other);
    }

    @Test
    public void testEqualsWithDifferentValue() {
        ValueMarker other = new ValueMarker(99.5);
        assertFalse("Markers with different values should not be equal", marker.equals(other));
    }

    @Test
    public void testEqualsWithNullInSuperFields() {
        ValueMarker other = new ValueMarker(10.5);
        assertTrue("Markers with same value and null super fields should be equal", marker.equals(other));
    }

    @Test
    public void testEqualsWithNonValueMarkerInstance() {
        assertFalse("Should not be equal to non-ValueMarker", marker.equals(new Marker()));
    }

    @Test
    public void testSetValueTwice() {
        marker.setValue(1.0);
        marker.setValue(2.0);
        assertEquals("Value should be updated to 2.0", 2.0, marker.getValue(), EPSILON);
    }

    @Test
    public void testEqualsWithDifferentSuperState() {
        ValueMarker other = new ValueMarker(10.5, Color.RED, new BasicStroke(1.0f));
        assertFalse("Markers with different super states should not be equal", marker.equals(other));
    }
}