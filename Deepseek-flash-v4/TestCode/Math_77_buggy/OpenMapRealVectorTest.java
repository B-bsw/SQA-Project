package org.apache.commons.math.linear;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OpenMapRealVectorTest {
    private OpenMapRealVector zero3;
    private OpenMapRealVector v1;
    private OpenMapRealVector v2;
    private double[] arr1 = {1, 2, 3};
    private double[] arr2 = {4, 5, 6};

    @Before
    public void setUp() {
        zero3 = new OpenMapRealVector(3);
        v1 = new OpenMapRealVector(arr1);
        v2 = new OpenMapRealVector(arr2);
    }

    @Test
    public void testDefaultConstructor() {
        OpenMapRealVector v = new OpenMapRealVector();
        assertEquals(0, v.getDimension());
    }

    @Test
    public void testConstructorDimension() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        assertEquals(5, v.getDimension());
    }

    @Test
    public void testConstructorDoubleArray() {
        double[] data = {1.0, 0.0, 3.0};
        OpenMapRealVector v = new OpenMapRealVector(data);
        assertEquals(3, v.getDimension());
        assertEquals(0.0, v.getEntry(1), 0.0);
        assertEquals(1.0, v.getEntry(0), 0.0);
    }

    @Test
    public void testIsDefaultValue() {
        OpenMapRealVector v = new OpenMapRealVector(1, 1e-6);
        assertTrue(v.isDefaultValue(0.0));
        assertTrue(v.isDefaultValue(1e-7));
        assertFalse(v.isDefaultValue(1e-5));
    }

    @Test
    public void testGetSetEntry() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(1, 5.0);
        assertEquals(5.0, v.getEntry(1), 0.0);
        v.setEntry(1, 0.0);
        assertEquals(0.0, v.getEntry(1), 0.0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntryOutOfBounds() {
        v1.getEntry(3);
    }

    @Test
    public void testAddVectors() {
        OpenMapRealVector sum = v1.add(v2);
        double[] expected = {5, 7, 9};
        for (int i = 0; i < 3; i++) {
            assertEquals(expected[i], sum.getEntry(i), 0.0);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDimensionMismatch() {
        OpenMapRealVector v3 = new OpenMapRealVector(2);
        v1.add(v3);
    }

    @Test
    public void testSubtract() {
        OpenMapRealVector diff = v2.subtract(v1);
        double[] expected = {3, 3, 3};
        for (int i = 0; i < 3; i++) {
            assertEquals(expected[i], diff.getEntry(i), 0.0);
        }
    }

    @Test
    public void testDotProduct() {
        double dot = v1.dotProduct(v2);
        assertEquals(1*4+2*5+3*6, dot, 0.0);
    }

    @Test
    public void testEbeMultiply() {
        OpenMapRealVector res = v1.ebeMultiply(v2);
        double[] expected = {4, 10, 18};
        for (int i = 0; i < 3; i++) {
            assertEquals(expected[i], res.getEntry(i), 0.0);
        }
    }

    @Test
    public void testEbeDivide() {
        OpenMapRealVector res = v1.ebeDivide(v2);
        double[] expected = {0.25, 0.4, 0.5};
        for (int i = 0; i < 3; i++) {
            assertEquals(expected[i], res.getEntry(i), 0.0);
        }
    }

    @Test
    public void testGetSubVector() {
        OpenMapRealVector sub = v1.getSubVector(1, 2);
        assertEquals(2, sub.getDimension());
        assertEquals(2.0, sub.getEntry(0), 0.0);
        assertEquals(3.0, sub.getEntry(1), 0.0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubVectorOutOfBounds() {
        v1.getSubVector(1, 3);
    }

    @Test
    public void testGetData() {
        assertArrayEquals(arr1, v1.getData(), 0.0);
    }

    @Test
    public void testGetDimension() {
        assertEquals(3, v1.getDimension());
    }

    @Test
    public void testCopy() {
        OpenMapRealVector copy = v1.copy();
        assertNotSame(v1, copy);
        assertEquals(v1.getDimension(), copy.getDimension());
        for (int i = 0; i < 3; i++) {
            assertEquals(v1.getEntry(i), copy.getEntry(i), 0.0);
        }
    }

    @Test
    public void testAppendDouble() {
        OpenMapRealVector res = v1.append(4.0);
        assertEquals(4, res.getDimension());
        assertEquals(4.0, res.getEntry(3), 0.0);
    }

    @Test
    public void testAppendArray() {
        double[] toAppend = {4,5};
        OpenMapRealVector res = v1.append(toAppend);
        assertEquals(5, res.getDimension());
        assertEquals(4.0, res.getEntry(3), 0.0);
        assertEquals(5.0, res.getEntry(4), 0.0);
    }

    @Test
    public void testMapAddToSelf() {
        OpenMapRealVector v = v1.copy();
        v.mapAddToSelf(10);
        assertEquals(11.0, v.getEntry(0), 0.0);
        assertEquals(12.0, v.getEntry(1), 0.0);
    }

    @Test
    public void testSetAll() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.set(7.0);
        for (int i = 0; i < 3; i++) {
            assertEquals(7.0, v.getEntry(i), 0.0);
        }
    }

    @Test
    public void testUnitize() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3,4});
        v.unitize();
        assertEquals(1.0, v.getNorm(), 1e-12);
        assertEquals(0.6, v.getEntry(0), 1e-12);
        assertEquals(0.8, v.getEntry(1), 1e-12);
    }

    @Test(expected = ArithmeticException.class)
    public void testUnitizeZeroNorm() {
        zero3.unitize();
    }

    @Test
    public void testIsInfinite() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, Double.POSITIVE_INFINITY});
        assertTrue(v.isInfinite());
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1, Double.NaN});
        assertFalse(v2.isInfinite());
    }

    @Test
    public void testIsNaN() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, Double.NaN});
        assertTrue(v.isNaN());
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1,2});
        assertFalse(v2.isNaN());
    }

    @Test
    public void testEqualsAndHashCode() {
        OpenMapRealVector v1copy = new OpenMapRealVector(v1);
        assertTrue(v1.equals(v1copy));
        assertEquals(v1.hashCode(), v1copy.hashCode());
        OpenMapRealVector different = new OpenMapRealVector(new double[]{1,2,4});
        assertFalse(v1.equals(different));
    }

    @Test
    public void testGetDistance() {
        double dist = v1.getDistance(v2);
        double expected = Math.sqrt((1-4)*(1-4)+(2-5)*(2-5)+(3-6)*(3-6));
        assertEquals(expected, dist, 1e-12);
    }

    @Test
    public void testGetL1Distance() {
        double dist = v1.getL1Distance(v2);
        double expected = Math.abs(1-4)+Math.abs(2-5)+Math.abs(3-6);
        assertEquals(expected, dist, 1e-12);
    }

    @Test
    public void testGetLInfDistance() {
        double dist = v1.getLInfDistance(v2);
        double expected = Math.max(Math.abs(1-4), Math.max(Math.abs(2-5), Math.abs(3-6)));
        assertEquals(expected, dist, 1e-12);
    }

    @Test
    public void testGetSparcity() {
        assertEquals(1.0, v1.getSparcity(), 0.0);
        assertEquals(0.0, zero3.getSparcity(), 0.0);
    }

    @Test
    public void testSparseIterator() {
        java.util.Iterator<Entry> it = v1.sparseIterator();
        int count = 0;
        while (it.hasNext()) {
            Entry e = it.next();
            assertEquals(arr1[e.getIndex()], e.getValue(), 0.0);
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testOuterProduct() {
        double[] v = {1,2};
        OpenMapRealVector x = new OpenMapRealVector(new double[]{3,4});
        RealMatrix m = x.outerProduct(v);
        assertEquals(2, m.getRowDimension());
        assertEquals(2, m.getColumnDimension());
        assertEquals(3*1, m.getEntry(0,0), 0.0);
        assertEquals(3*2, m.getEntry(0,1), 0.0);
        assertEquals(4*1, m.getEntry(1,0), 0.0);
        assertEquals(4*2, m.getEntry(1,1), 0.0);
    }

    @Test
    public void testProjection() {
        OpenMapRealVector u = new OpenMapRealVector(new double[]{1,0});
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3,4});
        RealVector proj = u.projection(v);
        assertEquals(3.0, proj.getEntry(0), 0.0);
        assertEquals(0.0, proj.getEntry(1), 0.0);
    }

    @Test
    public void testAddWithDefaultZeros() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, 0, 3});
        OpenMapRealVector w = new OpenMapRealVector(new double[]{0, 2, 0});
        OpenMapRealVector sum = v.add(w);
        assertEquals(1.0, sum.getEntry(0), 0.0);
        assertEquals(2.0, sum.getEntry(1), 0.0);
        assertEquals(3.0, sum.getEntry(2), 0.0);
    }

    @Test
    public void testDotProductWithZero() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, 2, 0});
        OpenMapRealVector w = new OpenMapRealVector(new double[]{0, 0, 3});
        assertEquals(0.0, v.dotProduct(w), 0.0);
    }

    @Test
    public void testIsDefaultValueBoundary() {
        OpenMapRealVector v = new OpenMapRealVector(1, 1e-6);
        assertTrue(v.isDefaultValue(1e-6));
        assertTrue(v.isDefaultValue(-1e-6));
        assertFalse(v.isDefaultValue(1e-5));
        assertFalse(v.isDefaultValue(-1e-5));
    }

    @Test
    public void testSetSubVector() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.set(0.0);
        double[] sub = {7, 8};
        v.setSubVector(2, sub);
        assertEquals(0.0, v.getEntry(1), 0.0);
        assertEquals(7.0, v.getEntry(2), 0.0);
        assertEquals(8.0, v.getEntry(3), 0.0);
        assertEquals(0.0, v.getEntry(4), 0.0);
    }

    @Test
    public void testGetNorm() {
        double norm = v1.getNorm();
        double expected = Math.sqrt(1*1+2*2+3*3);
        assertEquals(expected, norm, 1e-12);
    }
}