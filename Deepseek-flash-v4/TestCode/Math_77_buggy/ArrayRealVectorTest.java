package org.apache.commons.math.linear;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ArrayRealVectorTest {

    private static final double EPS = 1e-12;
    private ArrayRealVector v1;
    private ArrayRealVector v2;

    @Before
    public void setUp() {
        v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        v2 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
    }

    // --- Constructor tests ---
    @Test
    public void testDefaultConstructor() {
        ArrayRealVector v = new ArrayRealVector();
        assertEquals(0, v.getDimension());
    }

    @Test
    public void testConstructorWithSize() {
        ArrayRealVector v = new ArrayRealVector(5);
        assertEquals(5, v.getDimension());
        for (int i = 0; i < 5; i++) {
            assertEquals(0.0, v.getEntry(i), EPS);
        }
    }

    @Test
    public void testConstructorWithSizeAndPreset() {
        ArrayRealVector v = new ArrayRealVector(4, 3.14);
        assertEquals(4, v.getDimension());
        for (int i = 0; i < 4; i++) {
            assertEquals(3.14, v.getEntry(i), EPS);
        }
    }

    @Test
    public void testConstructorFromDoubleArray() {
        double[] d = {1.0, 2.0, 3.0};
        ArrayRealVector v = new ArrayRealVector(d);
        assertArrayEquals(d, v.getData(), EPS);
        // Ensure data is cloned
        d[0] = 999;
        assertEquals(1.0, v.getEntry(0), EPS);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullAndCopyTrue() {
        new ArrayRealVector(null, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEmptyArray() {
        new ArrayRealVector(new double[0], false);
    }

    @Test
    public void testConstructorDoubleArrayNoCopy() {
        double[] d = {1.0, 2.0};
        ArrayRealVector v = new ArrayRealVector(d, false);
        assertSame(d, v.getDataRef());
    }

    @Test
    public void testConstructorDoubleArrayWithPosSize() {
        double[] d = {0.0, 1.0, 2.0, 3.0, 4.0};
        ArrayRealVector v = new ArrayRealVector(d, 1, 3);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0}, v.getData(), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDoubleArrayPosSizeOutOfBounds() {
        double[] d = {1.0, 2.0};
        new ArrayRealVector(d, 1, 2);
    }

    @Test
    public void testConstructorFromDoubleObjectArray() {
        Double[] d = {1.0, 2.0, 3.0};
        ArrayRealVector v = new ArrayRealVector(d);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0}, v.getData(), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorFromDoubleObjectArrayPosSizeOutOfBounds() {
        Double[] d = {1.0, 2.0};
        new ArrayRealVector(d, 1, 2);
    }

    @Test
    public void testConstructorFromRealVector() {
        RealVector rv = new ArrayRealVector(new double[]{7.0, 8.0});
        ArrayRealVector v = new ArrayRealVector(rv);
        assertEquals(2, v.getDimension());
        assertEquals(7.0, v.getEntry(0), EPS);
    }

    @Test
    public void testConstructorFromArrayRealVectorDeep() {
        ArrayRealVector src = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v = new ArrayRealVector(src, true);
        src.data[0] = 999;
        assertEquals(1.0, v.getEntry(0), EPS);
    }

    @Test
    public void testConstructorFromArrayRealVectorShallow() {
        ArrayRealVector src = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v = new ArrayRealVector(src, false);
        src.data[0] = 999;
        assertEquals(999.0, v.getEntry(0), EPS);
    }

    @Test
    public void testConstructorConcatenateTwoArrayRealVectors() {
        ArrayRealVector v = new ArrayRealVector(v1, v2);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0}, v.getData(), EPS);
    }

    @Test
    public void testConstructorConcatenateArrayRealVectorAndRealVector() {
        RealVector rv = new ArrayRealVector(new double[]{10.0});
        ArrayRealVector v = new ArrayRealVector(v1, rv);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 10.0}, v.getData(), EPS);
    }

    @Test
    public void testConstructorConcatenateRealVectorAndArrayRealVector() {
        RealVector rv = new ArrayRealVector(new double[]{10.0});
        ArrayRealVector v = new ArrayRealVector(rv, v1);
        assertArrayEquals(new double[]{10.0, 1.0, 2.0, 3.0}, v.getData(), EPS);
    }

    // --- copy ---
    @Test
    public void testCopy() {
        ArrayRealVector copy = (ArrayRealVector) v1.copy();
        assertNotSame(v1, copy);
        assertArrayEquals(v1.getData(), copy.getData(), EPS);
    }

    // --- add ---
    @Test
    public void testAddSameType() {
        ArrayRealVector result = v1.add(v2);
        assertArrayEquals(new double[]{5.0, 7.0, 9.0}, result.getData(), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDimensionMismatch() {
        ArrayRealVector small = new ArrayRealVector(new double[]{1.0});
        v1.add(small);
    }

    @Test
    public void testAddDoubleArray() {
        double[] arr = {4.0, 5.0, 6.0};
        RealVector result = v1.add(arr);
        assertArrayEquals(new double[]{5.0, 7.0, 9.0}, result.getData(), EPS);
    }

    @Test
    public void testAddRealVectorNonArray() {
        RealVector rv = new ArrayRealVector(new double[]{0.5, 1.5, 2.5});
        RealVector result = v1.add(rv);
        assertArrayEquals(new double[]{1.5, 3.5, 5.5}, result.getData(), EPS);
    }

    // --- subtract ---
    @Test
    public void testSubtractSameType() {
        ArrayRealVector result = v1.subtract(v2);
        assertArrayEquals(new double[]{-3.0, -3.0, -3.0}, result.getData(), EPS);
    }

    @Test
    public void testSubtractDoubleArray() {
        double[] arr = {4.0, 5.0, 6.0};
        RealVector result = v1.subtract(arr);
        assertEquals(-3.0, result.getEntry(0), EPS);
    }

    // --- mapToSelf operations ---
    @Test
    public void testMapAddToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        v.mapAddToSelf(5.0);
        assertArrayEquals(new double[]{6.0, 7.0, 8.0}, v.getData(), EPS);
    }

    @Test
    public void testMapSubtractToSelf() {
        v1.mapSubtractToSelf(1.0);
        assertArrayEquals(new double[]{0.0, 1.0, 2.0}, v1.getData(), EPS);
    }

    @Test
    public void testMapMultiplyToSelf() {
        v1.mapMultiplyToSelf(2.0);
        assertArrayEquals(new double[]{2.0, 4.0, 6.0}, v1.getData(), EPS);
    }

    @Test
    public void testMapDivideToSelf() {
        v1.mapDivideToSelf(2.0);
        assertArrayEquals(new double[]{0.5, 1.0, 1.5}, v1.getData(), EPS);
    }

    @Test
    public void testMapPowToSelf() {
        v1.mapPowToSelf(2.0);
        assertArrayEquals(new double[]{1.0, 4.0, 9.0}, v1.getData(), EPS);
    }

    @Test
    public void testMapExpToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapExpToSelf();
        assertEquals(1.0, v.getEntry(0), EPS);
        assertEquals(Math.E, v.getEntry(1), EPS);
    }

    // --- ebeMultiply ---
    @Test
    public void testEbeMultiplySameType() {
        ArrayRealVector result = v1.ebeMultiply(v2);
        assertArrayEquals(new double[]{4.0, 10.0, 18.0}, result.getData(), EPS);
    }

    @Test
    public void testEbeMultiplyDoubleArray() {
        double[] arr = {2.0, 3.0, 4.0};
        RealVector result = v1.ebeMultiply(arr);
        assertArrayEquals(new double[]{2.0, 6.0, 12.0}, result.getData(), EPS);
    }

    // --- ebeDivide ---
    @Test
    public void testEbeDivideSameType() {
        ArrayRealVector result = v1.ebeDivide(v2);
        assertEquals(1.0 / 4.0, result.getEntry(0), EPS);
    }

    // --- dotProduct ---
    @Test
    public void testDotProductSameType() {
        double dot = v1.dotProduct(v2);
        assertEquals(32.0, dot, EPS);
    }

    @Test
    public void testDotProductDoubleArray() {
        double dot = v1.dotProduct(new double[]{4.0, 5.0, 6.0});
        assertEquals(32.0, dot, EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDotProductDimensionMismatch() {
        v1.dotProduct(new double[]{1.0, 2.0});
    }

    // --- norms ---
    @Test
    public void testGetNorm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{3.0, 4.0});
        assertEquals(5.0, v.getNorm(), EPS);
    }

    @Test
    public void testGetL1Norm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, -2.0, 3.0});
        assertEquals(6.0, v.getL1Norm(), EPS);
    }

    @Test
    public void testGetLInfNorm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{-5.0, 3.0});
        assertEquals(5.0, v.getLInfNorm(), EPS);
    }

    // --- distances ---
    @Test
    public void testGetDistance() {
        double d = v1.getDistance(v2);
        double expected = Math.sqrt(Math.pow(3,2)+Math.pow(3,2)+Math.pow(3,2));
        assertEquals(expected, d, EPS);
    }

    @Test
    public void testGetL1Distance() {
        double d = v1.getL1Distance(v2);
        assertEquals(9.0, d, EPS);
    }

    @Test
    public void testGetLInfDistance() {
        double d = v1.getLInfDistance(v2);
        assertEquals(3.0, d, EPS);
    }

    // --- unitVector/unitize ---
    @Test
    public void testUnitVector() {
        ArrayRealVector v = new ArrayRealVector(new double[]{3.0, 4.0});
        RealVector unit = v.unitVector();
        assertEquals(3.0/5.0, unit.getEntry(0), EPS);
        assertEquals(4.0/5.0, unit.getEntry(1), EPS);
    }

    @Test(expected = ArithmeticException.class)
    public void testUnitVectorZeroNorm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 0.0});
        v.unitVector();
    }

    @Test(expected = ArithmeticException.class)
    public void testUnitizeZeroNorm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 0.0});
        v.unitize();
    }

    // --- projection ---
    @Test
    public void testProjection() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 0.0});
        RealVector proj = v1.projection(v);
        assertEquals(1.0, proj.getEntry(0), EPS);
        assertEquals(0.0, proj.getEntry(1), EPS);
    }

    // --- getEntry and index checks ---
    @Test(expected = MatrixIndexException.class)
    public void testGetEntryOutOfBounds() {
        v1.getEntry(5);
    }

    // --- setEntry ---
    @Test
    public void testSetEntry() {
        v1.setEntry(1, 99.0);
        assertEquals(99.0, v1.getEntry(1), EPS);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetEntryOutOfBounds() {
        v1.setEntry(10, 1.0);
    }

    // --- subvector ---
    @Test
    public void testGetSubVector() {
        RealVector sub = v1.getSubVector(1, 2);
        assertArrayEquals(new double[]{2.0, 3.0}, sub.getData(), EPS);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubVectorOutOfBounds() {
        v1.getSubVector(1, 3);
    }

    // --- setSubVector ---
    @Test
    public void testSetSubVectorDoubleArray() {
        v1.setSubVector(1, new double[]{9.0, 8.0});
        assertArrayEquals(new double[]{1.0, 9.0, 8.0}, v1.getData(), EPS);
    }

    // --- set (all to value) ---
    @Test
    public void testSetAll() {
        v1.set(5.0);
        for (int i = 0; i < 3; i++) {
            assertEquals(5.0, v1.getEntry(i), EPS);
        }
    }

    // --- toArray ---
    @Test
    public void testToArray() {
        double[] arr = v1.toArray();
        assertArrayEquals(new double[]{1.0, 2.0, 3.0}, arr, EPS);
        arr[0] = 999;
        assertEquals(1.0, v1.getEntry(0), EPS);
    }

    // --- equals ---
    @Test
    public void testEqualsSelf() {
        assertTrue(v1.equals(v1));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(v1.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(v1.equals("string"));
    }

    @Test
    public void testEqualsDifferentDimension() {
        ArrayRealVector small = new ArrayRealVector(new double[]{1.0});
        assertFalse(v1.equals(small));
    }

    @Test
    public void testEqualsIdentical() {
        ArrayRealVector copy = new ArrayRealVector(v1.getData());
        assertTrue(v1.equals(copy));
    }

    @Test
    public void testEqualsDifferentValues() {
        ArrayRealVector diff = new ArrayRealVector(new double[]{1.0, 2.0, 4.0});
        assertFalse(v1.equals(diff));
    }

    @Test
    public void testEqualsBothNaN() {
        ArrayRealVector a = new ArrayRealVector(new double[]{Double.NaN, 1.0});
        ArrayRealVector b = new ArrayRealVector(new double[]{Double.NaN, 1.0});
        assertTrue(a.equals(b));
    }

    // --- isNaN / isInfinite ---
    @Test
    public void testIsNaNFalse() {
        assertFalse(v1.isNaN());
    }

    @Test
    public void testIsNaNTrue() {
        ArrayRealVector v = new ArrayRealVector(new double[]{Double.NaN, 1.0});
        assertTrue(v.isNaN());
    }

    @Test
    public void testIsInfiniteFalse() {
        assertFalse(v1.isInfinite());
    }

    @Test
    public void testIsInfiniteTrue() {
        ArrayRealVector v = new ArrayRealVector(new double[]{Double.POSITIVE_INFINITY, 1.0});
        assertTrue(v.isInfinite());
    }

    @Test
    public void testIsInfiniteNaN() {
        ArrayRealVector v = new ArrayRealVector(new double[]{Double.NaN, Double.POSITIVE_INFINITY});
        assertFalse(v.isInfinite());
    }

    // --- hashCode ---
    @Test
    public void testHashCodeNaN() {
        ArrayRealVector v = new ArrayRealVector(new double[]{Double.NaN});
        assertEquals(9, v.hashCode());
    }
}