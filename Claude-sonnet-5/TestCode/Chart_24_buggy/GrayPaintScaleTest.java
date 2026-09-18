package org.jfree.chart.renderer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.Color;
import java.awt.Paint;

import org.junit.Test;

public class GrayPaintScaleTest {

    @Test
    public void testDefaultConstructor() {
        GrayPaintScale scale = new GrayPaintScale();
        assertEquals(0.0, scale.getLowerBound(), 0.0000001);
        assertEquals(1.0, scale.getUpperBound(), 0.0000001);
    }

    @Test
    public void testConstructorWithValidBounds() {
        GrayPaintScale scale = new GrayPaintScale(-10.0, 10.0);
        assertEquals(-10.0, scale.getLowerBound(), 0.0000001);
        assertEquals(10.0, scale.getUpperBound(), 0.0000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithEqualBoundsThrows() {
        new GrayPaintScale(5.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithLowerGreaterThanUpperThrows() {
        new GrayPaintScale(10.0, 5.0);
    }

    @Test
    public void testGetLowerBound() {
        GrayPaintScale scale = new GrayPaintScale(2.0, 8.0);
        assertEquals(2.0, scale.getLowerBound(), 0.0000001);
    }

    @Test
    public void testGetUpperBound() {
        GrayPaintScale scale = new GrayPaintScale(2.0, 8.0);
        assertEquals(8.0, scale.getUpperBound(), 0.0000001);
    }

    @Test
    public void testGetPaintAtLowerBound() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Paint paint = scale.getPaint(0.0);
        assertNotNull(paint);
        assertTrue(paint instanceof Color);
        Color c = (Color) paint;
        assertEquals(0, c.getRed());
        assertEquals(0, c.getGreen());
        assertEquals(0, c.getBlue());
    }

    @Test
    public void testGetPaintAtUpperBound() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Paint paint = scale.getPaint(1.0);
        assertNotNull(paint);
        Color c = (Color) paint;
        assertEquals(255, c.getRed());
        assertEquals(255, c.getGreen());
        assertEquals(255, c.getBlue());
    }

    @Test
    public void testGetPaintAtMidValue() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Paint paint = scale.getPaint(0.5);
        assertNotNull(paint);
        Color c = (Color) paint;
        int expected = (int) (0.5 * 255.0);
        assertEquals(expected, c.getRed());
        assertEquals(expected, c.getGreen());
        assertEquals(expected, c.getBlue());
    }

    @Test
    public void testGetPaintBelowLowerBound() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Paint paint = scale.getPaint(-0.5);
        assertNotNull(paint);
        assertTrue(paint instanceof Color);
    }

    @Test
    public void testGetPaintAboveUpperBound() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Paint paint = scale.getPaint(1.5);
        assertNotNull(paint);
        assertTrue(paint instanceof Color);
    }

    @Test
    public void testGetPaintWithCustomRange() {
        GrayPaintScale scale = new GrayPaintScale(10.0, 20.0);
        Paint paint = scale.getPaint(15.0);
        assertNotNull(paint);
        Color c = (Color) paint;
        int expected = (int) ((15.0 - 10.0) / (20.0 - 10.0) * 255.0);
        assertEquals(expected, c.getRed());
    }

    @Test
    public void testEqualsSameInstance() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        assertTrue(scale.equals(scale));
    }

    @Test
    public void testEqualsNull() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        assertFalse(scale.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        assertFalse(scale.equals("not a GrayPaintScale"));
    }

    @Test
    public void testEqualsDifferentLowerBound() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.5, 1.0);
        assertFalse(scale1.equals(scale2));
    }

    @Test
    public void testEqualsDifferentUpperBound() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.0, 2.0);
        assertFalse(scale1.equals(scale2));
    }

    @Test
    public void testEqualsSameValues() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.0, 1.0);
        assertTrue(scale1.equals(scale2));
        assertTrue(scale2.equals(scale1));
    }

    @Test
    public void testEqualsDefaultInstances() {
        GrayPaintScale scale1 = new GrayPaintScale();
        GrayPaintScale scale2 = new GrayPaintScale();
        assertTrue(scale1.equals(scale2));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = (GrayPaintScale) scale1.clone();
        assertNotSame(scale1, scale2);
        assertEquals(scale1.getLowerBound(), scale2.getLowerBound(), 0.0000001);
        assertEquals(scale1.getUpperBound(), scale2.getUpperBound(), 0.0000001);
        assertTrue(scale1.equals(scale2));
    }

    @Test
    public void testCloneIsPublicCloneable() {
        GrayPaintScale scale = new GrayPaintScale();
        assertTrue(scale instanceof org.jfree.chart.util.PublicCloneable);
    }

    @Test
    public void testIsSerializable() {
        GrayPaintScale scale = new GrayPaintScale();
        assertTrue(scale instanceof java.io.Serializable);
    }
}