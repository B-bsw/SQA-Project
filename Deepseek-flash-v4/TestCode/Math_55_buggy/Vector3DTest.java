package org.apache.commons.math.geometry;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math.exception.MathArithmeticException;

public class Vector3DTest {

    private static final double EPS = 1e-10;
    private Vector3D v1;
    private Vector3D v2;

    @Before
    public void setUp() {
        v1 = new Vector3D(1, 2, 3);
        v2 = new Vector3D(-4, 5, 0);
    }

    @After
    public void tearDown() {
        v1 = null;
        v2 = null;
    }

    @Test
    public void testConstants() {
        assertEquals(0, Vector3D.ZERO.getX(), EPS);
        assertEquals(0, Vector3D.ZERO.getY(), EPS);
        assertEquals(0, Vector3D.ZERO.getZ(), EPS);
        assertEquals(1, Vector3D.PLUS_I.getX(), EPS);
        assertEquals(1, Vector3D.PLUS_J.getY(), EPS);
        assertEquals(1, Vector3D.PLUS_K.getZ(), EPS);
        assertTrue(Vector3D.NaN.isNaN());
        assertTrue(Double.isInfinite(Vector3D.POSITIVE_INFINITY.getX()));
        assertTrue(Double.isInfinite(Vector3D.NEGATIVE_INFINITY.getY()));
        assertFalse(Vector3D.NaN.isInfinite());
    }

    @Test
    public void testDefaults() {
        Vector3D v = new Vector3D(1, 2);
        assertEquals(1, v.getX(), EPS);
        assertEquals(2, v.getY(), EPS);
        assertEquals(0, v.getZ(), EPS);
    }

    @Test
    public void testGetters() {
        Vector3D v = new Vector3D(1.5, -2.5, 3.5);
        assertEquals(1.5, v.getX(), EPS);
        assertEquals(-2.5, v.getY(), EPS);
        assertEquals(3.5, v.getZ(), EPS);
    }

    @Test
    public void testNormFunctions() {
        Vector3D v = new Vector3D(1, 2, 2);
        assertEquals(5, v.getNorm1(), EPS);
        assertEquals(3, v.getNorm(), EPS);
        assertEquals(9, v.getNormSq(), EPS);
        assertEquals(2, v.getNormInf(), EPS);

        Vector3D zero = Vector3D.ZERO;
        assertEquals(0, zero.getNorm1(), EPS);
        assertEquals(0, zero.getNorm(), EPS);
        assertEquals(0, zero.getNormSq(), EPS);
        assertEquals(0, zero.getNormInf(), EPS);
    }

    @Test
    public void testAngles() {
        Vector3D v = new Vector3D(1, 0, 0);
        assertEquals(0, v.getAlpha(), EPS);
        assertEquals(0, v.getDelta(), EPS);

        Vector3D v2 = new Vector3D(0, 1, 1);
        assertEquals(Math.PI / 2, v2.getAlpha(), EPS);
        assertEquals(Math.PI / 4, v2.getDelta(), EPS);

        Vector3D v3 = new Vector3D(-1, 0, 0);
        assertEquals(Math.PI, v3.getAlpha(), EPS);
    }

    @Test
    public void testAddSubtract() {
        Vector3D sum = v1.add(v2);
        assertEquals(-3, sum.getX(), EPS);
        assertEquals(7, sum.getY(), EPS);
        assertEquals(3, sum.getZ(), EPS);

        Vector3D diff = v1.subtract(v2);
        assertEquals(5, diff.getX(), EPS);
        assertEquals(-3, diff.getY(), EPS);
        assertEquals(3, diff.getZ(), EPS);

        Vector3D sum2 = v1.add(2, v2);
        assertEquals(-7, sum2.getX(), EPS);
        assertEquals(12, sum2.getY(), EPS);
        assertEquals(3, sum2.getZ(), EPS);

        Vector3D diff2 = v1.subtract(2, v2);
        assertEquals(9, diff2.getX(), EPS);
        assertEquals(-8, diff2.getY(), EPS);
        assertEquals(3, diff2.getZ(), EPS);
    }

    @Test
    public void testNegate() {
        Vector3D neg = v1.negate();
        assertEquals(-1, neg.getX(), EPS);
        assertEquals(-2, neg.getY(), EPS);
        assertEquals(-3, neg.getZ(), EPS);
    }

    @Test
    public void testScalarMultiply() {
        Vector3D scaled = v1.scalarMultiply(2);
        assertEquals(2, scaled.getX(), EPS);
        assertEquals(4, scaled.getY(), EPS);
        assertEquals(6, scaled.getZ(), EPS);
    }

    @Test
    public void testIsNaN() {
        assertFalse(v1.isNaN());
        assertTrue(new Vector3D(Double.NaN, 0, 0).isNaN());
        assertTrue(new Vector3D(0, Double.NaN, 1).isNaN());
        assertTrue(new Vector3D(0, 0, Double.NaN).isNaN());
        assertTrue(new Vector3D(Double.NaN, Double.NaN, Double.NaN).isNaN());
    }

    @Test
    public void testIsInfinite() {
        assertFalse(v1.isInfinite());
        assertTrue(new Vector3D(Double.POSITIVE_INFINITY, 0, 0).isInfinite());
        assertTrue(new Vector3D(0, Double.NEGATIVE_INFINITY, 1).isInfinite());
        assertTrue(new Vector3D(0, 0, Double.POSITIVE_INFINITY).isInfinite());
        assertTrue(new Vector3D(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY).isInfinite());
        assertFalse(new Vector3D(Double.NaN, 0, Double.POSITIVE_INFINITY).isInfinite());
    }

    @Test
    public void testEquals() {
        assertTrue(v1.equals(new Vector3D(1, 2, 3)));
        assertTrue(v1.equals(v1));
        assertFalse(v1.equals(null));
        assertFalse(v1.equals(new Vector3D(1, 2, 4)));
        assertFalse(v1.equals(new Object()));

        Vector3D nan1 = new Vector3D(Double.NaN, 1, 2);
        Vector3D nan2 = new Vector3D(1, Double.NaN, 2);
        assertTrue(nan1.equals(nan2));
        assertFalse(v1.equals(nan1));
        assertTrue(Vector3D.NaN.equals(nan1));
    }

    @Test
    public void testHashCode() {
        assertEquals(8, new Vector3D(Double.NaN, 0, 0).hashCode());
        assertEquals(8, new Vector3D(0, Double.NaN, 0).hashCode());
        assertEquals(8, Vector3D.NaN.hashCode());
        assertEquals(v1.hashCode(), new Vector3D(1, 2, 3).hashCode());
        assertEquals(Vector3D.PLUS_I.hashCode(), new Vector3D(1, 0, 0).hashCode());
    }

    @Test
    public void testDotProduct() {
        assertEquals(1 * -4 + 2 * 5 + 3 * 0, Vector3D.dotProduct(v1, v2), EPS);
        assertEquals(1 * 1 + 0 * 0 + 0 * 0, Vector3D.dotProduct(Vector3D.PLUS_I, Vector3D.PLUS_I), EPS);
        assertEquals(0, Vector3D.dotProduct(Vector3D.PLUS_I, Vector3D.PLUS_J), EPS);
        assertEquals(0, Vector3D.dotProduct(Vector3D.PLUS_J, Vector3D.PLUS_K), EPS);
    }

    @Test
    public void testCrossProduct() {
        Vector3D cross = Vector3D.crossProduct(Vector3D.PLUS_I, Vector3D.PLUS_J);
        assertEquals(0, cross.getX(), EPS);
        assertEquals(0, cross.getY(), EPS);
        assertEquals(1, cross.getZ(), EPS);

        Vector3D cross2 = Vector3D.crossProduct(Vector3D.PLUS_J, Vector3D.PLUS_I);
        assertEquals(0, cross2.getX(), EPS);
        assertEquals(0, cross2.getY(), EPS);
        assertEquals(-1, cross2.getZ(), EPS);

        Vector3D cross3 = Vector3D.crossProduct(v1, v2);
        assertEquals(2 * 0 - 3 * 5, cross3.getX(), EPS);
        assertEquals(3 * (-4) - 1 * 0, cross3.getY(), EPS);
        assertEquals(1 * 5 - 2 * (-4), cross3.getZ(), EPS);
    }

    @Test
    public void testDistanceFunctions() {
        assertEquals(1 + 3 + 3, Vector3D.distance1(v1, v2), EPS);
        assertEquals(0, Vector3D.distance1(v1, v1), EPS);
        assertEquals(Math.sqrt(1 + 9 + 9), Vector3D.distance(v1, v2), EPS);
        assertEquals(0, Vector3D.distance(v1, v1), EPS);
        assertEquals(9, Vector3D.distanceSq(v1, v2), EPS);
        assertEquals(0, Vector3D.distanceSq(v1, v1), EPS);
        assertEquals(3, Vector3D.distanceInf(v1, v2), EPS);
        assertEquals(0, Vector3D.distanceInf(v1, v1), EPS);
    }

    @Test
    public void testNormalize() {
        Vector3D norm = new Vector3D(0, 3, 4).normalize();
        assertEquals(0, norm.getX(), EPS);
        assertEquals(0.6, norm.getY(), EPS);
        assertEquals(0.8, norm.getZ(), EPS);
        assertEquals(0, Vector3D.MINUS_K.normalize().getZ(), EPS);
        assertEquals(-1, Vector3D.MINUS_K.normalize().getZ(), EPS);

        try {
            Vector3D.ZERO.normalize();
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testOrthogonal() {
        assertEquals(v1, v1.orthogonal().subtract(v1).getNormSq(), EPS);
        Vector3D u = Vector3D.PLUS_I.orthogonal();
        assertEquals(0, Vector3D.dotProduct(Vector3D.PLUS_I, u), EPS);
        assertEquals(1, u.getNorm(), EPS);
        assertEquals(0, v1.orthogonal().getNorm() - 1, EPS);

        try {
            Vector3D.ZERO.orthogonal();
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testAngle() {
        assertEquals(0, Vector3D.angle(Vector3D.PLUS_I, Vector3D.PLUS_I), EPS);
        assertEquals(Math.PI / 2, Vector3D.angle(Vector3D.PLUS_I, Vector3D.PLUS_J), EPS);
        assertEquals(Math.PI, Vector3D.angle(Vector3D.PLUS_I, Vector3D.MINUS_I), EPS);
        assertEquals(Math.PI / 4, Vector3D.angle(new Vector3D(1, 1, 0), Vector3D.PLUS_I), EPS);

        try {
            Vector3D.angle(Vector3D.ZERO, Vector3D.PLUS_I);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // Expected
        }

        try {
            Vector3D.angle(Vector3D.PLUS_I, Vector3D.ZERO);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testToString() {
        assertNotNull(v1.toString());
        assertTrue(v1.toString().contains("1"));
        assertTrue(v1.toString().contains("2"));
        assertTrue(v1.toString().contains("3"));
    }

    @Test
    public void testImmutability() {
        Vector3D orig = new Vector3D(1, 2, 3);
        orig.add(v2);
        orig.subtract(v2);
        orig.scalarMultiply(2);
        orig.negate();
        assertEquals(1, orig.getX(), EPS);
        assertEquals(2, orig.getY(), EPS);
        assertEquals(3, orig.getZ(), EPS);
    }
}