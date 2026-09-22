package org.jfree.chart.renderer;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.awt.Color;
import java.awt.Paint;

public class GrayPaintScaleTest {

    private GrayPaintScale scale;

    @Before
    public void setUp() {
        scale = new GrayPaintScale();
    }

    @After
    public void tearDown() {
        scale = null;
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(0.0, scale.getLowerBound(), 0.0);
        assertEquals(1.0, scale.getUpperBound(), 0.0);
    }

    @Test
    public void testParameterizedConstructor() {
        GrayPaintScale custom = new GrayPaintScale(-5.0, 5.0);
        assertEquals(-5.0, custom.getLowerBound(), 0.0);
        assertEquals(5.0, custom.getUpperBound(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorLowerBoundEqualsUpperBound() {
        new GrayPaintScale(5.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorLowerBoundGreaterThanUpperBound() {
        new GrayPaintScale(10.0, 5.0);
    }

    @Test
    public void testGetPaintLowerBound() {
        Paint paint = scale.getPaint(0.0);
        assertEquals(Color.BLACK, paint);
    }

    @Test
    public void testGetPaintUpperBound() {
        Paint paint = scale.getPaint(1.0);
        assertEquals(Color.WHITE, paint);
    }

    @Test
    public void testGetPaintMidpoint() {
        Paint paint = scale.getPaint(0.5);
        assertEquals(new Color(128, 128, 128), paint);
    }

    @Test
    public void testGetPaintValueBelowLowerBound() {
        Paint paint = scale.getPaint(-10.0);
        assertEquals(Color.BLACK, paint);  // clamps to lower bound
    }

    @Test
    public void testGetPaintValueAboveUpperBound() {
        Paint paint = scale.getPaint(10.0);
        assertEquals(Color.WHITE, paint);  // clamps to upper bound
    }

    @Test
    public void testGetPaintPrecision() {
        Paint paint = scale.getPaint(0.5 + 0.001);
        assertNotNull(paint);
        assertEquals(128, ((Color) paint).getRed());
        assertEquals(128, ((Color) paint).getGreen());
        assertEquals(128, ((Color) paint).getBlue());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(scale.equals(scale));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(scale.equals(null));
    }

    @Test
    public void testEqualsDifferentType() {
        assertFalse(scale.equals("not a scale"));
    }

    @Test
    public void testEqualsDifferentLowerBound() {
        GrayPaintScale other = new GrayPaintScale(1.0, 2.0);
        assertFalse(scale.equals(other));
    }

    @Test
    public void testEqualsDifferentUpperBound() {
        GrayPaintScale other = new GrayPaintScale(0.0, 2.0);
        assertFalse(scale.equals(other));
    }

    @Test
    public void testEqualsSameValues() {
        GrayPaintScale same = new GrayPaintScale(0.0, 1.0);
        assertTrue(scale.equals(same));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        GrayPaintScale cloned = (GrayPaintScale) scale.clone();
        assertNotNull(cloned);
        assertTrue(cloned instanceof GrayPaintScale);
        assertEquals(scale.getLowerBound(), cloned.getLowerBound(), 0.0);
        assertEquals(scale.getUpperBound(), cloned.getUpperBound(), 0.0);
        assertNotSame(scale, cloned);
    }

    @Test
    public void testEqualsAfterClone() throws CloneNotSupportedException {
        GrayPaintScale cloned = (GrayPaintScale) scale.clone();
        assertTrue(scale.equals(cloned));
    }
}