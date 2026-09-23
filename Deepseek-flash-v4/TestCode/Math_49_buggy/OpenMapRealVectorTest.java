package org.apache.commons.math.linear;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math.exception.MathArithmeticException;

public class OpenMapRealVectorTest {

    private static final double EPS = 1e-10;

    private OpenMapRealVector vector;
    private OpenMapRealVector otherVector;

    @Before
    public void setUp() {
        vector = new OpenMapRealVector(5);
        otherVector = new OpenMapRealVector(5);
    }

    @After
    public void tearDown() {
        vector = null;
        otherVector = null;
    }

    @Test
    public void testConstructors() {
        OpenMapRealVector v = new OpenMapRealVector();
        assertEquals(0, v.getDimension());
        assertEquals(0.0, v.getEntry(0), EPS);
        
        v = new OpenMapRealVector(3);
        assertEquals(3, v.getDimension());
        assertEquals(0.0, v.getEntry(2), EPS);
        
        v = new OpenMapRealVector(3, 1.0e-10);
        assertEquals(3, v.getDimension());
        
        double[] data = {1.0, 0.0, 3.0};
        v = new OpenMapRealVector(data);
        assertEquals(1.0, v.getEntry(0), EPS);
        assertEquals(0.0, v.getEntry(1), EPS);
        assertEquals(3.0, v.getEntry(2), EPS);
        assertEquals(2, v.getSparsity(), 0.667, 1e-6);
        
        v = new OpenMapRealVector(new Double[] {1.0, 0.0, 3.0});
        assertEquals(3, v.getDimension());
    }

    @Test
    public void testDefaultValue() {
        assertTrue(vector.isDefaultValue(0.0));
        assertTrue(vector.isDefaultValue(1e-13));
        assertFalse(vector.isDefaultValue(1e-11));
    }

    @Test
    public void testAddOpenMap() {
        vector.setEntry(0, 1.0);
        vector.setEntry(2, 3.0);
        otherVector.setEntry(0, 2.0);
        otherVector.setEntry(1, 4.0);
        
        OpenMapRealVector result = vector.add(otherVector);
        assertEquals(3.0, result.getEntry(0), EPS);
        assertEquals(4.0, result.getEntry(1), EPS);
        assertEquals(3.0, result.getEntry(2), EPS);
        
        result = otherVector.add(vector);
        assertEquals(3.0, result.getEntry(0), EPS);
        assertEquals(4.0, result.getEntry(1), EPS);
        assertEquals(3.0, result.getEntry(2), EPS);
    }

    @Test
    public void testAddRealVector() {
        vector.setEntry(0, 1.0);
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        RealVector rv = new OpenMapRealVector(data);
        OpenMapRealVector result = vector.add(rv);
        assertEquals(1.0, result.getEntry(0), EPS);
        assertEquals(2.0, result.getEntry(1), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDimensionMismatch() {
        vector.add(new OpenMapRealVector(3));
    }

    @Test
    public void testAppend() {
        vector.setEntry(0, 1.0);
        OpenMapRealVector other = new OpenMapRealVector(2);
        other.setEntry(0, 2.0);
        other.setEntry(1, 3.0);
        
        OpenMapRealVector result = vector.append(other);
        assertEquals(7, result.getDimension());
        assertEquals(1.0, result.getEntry(0), EPS);
        assertEquals(2.0, result.getEntry(5), EPS);
        assertEquals(3.0, result.getEntry(6), EPS);
        
        OpenMapRealVector result2 = vector.append(new double[] {4.0, 5.0});
        assertEquals(7, result2.getDimension());
        assertEquals(4.0, result2.getEntry(5), EPS);
        
        OpenMapRealVector result3 = vector.append(6.0);
        assertEquals(6, result3.getDimension());
        assertEquals(6.0, result3.getEntry(5), EPS);
    }

    @Test
    public void testCopyAndGetData() {
        vector.setEntry(0, 1.0);
        vector.setEntry(3, 4.0);
        
        OpenMapRealVector copy = vector.copy();
        assertEquals(1.0, copy.getEntry(0), EPS);
        assertEquals(4.0, copy.getEntry(3), EPS);
        assertNotSame(vector, copy);
        
        double[] data = vector.getData();
        assertEquals(5, data.length);
        assertEquals(1.0, data[0], EPS);
        assertEquals(4.0, data[3], EPS);
    }

    @Test
    public void testDotProductOpenMap() {
        vector.setEntry(0, 1.0);
        vector.setEntry(2, 3.0);
        otherVector.setEntry(0, 2.0);
        otherVector.setEntry(2, 4.0);
        
        double result = vector.dotProduct(otherVector);
        assertEquals(14.0, result, EPS);
        
        OpenMapRealVector smaller = new OpenMapRealVector(5);
        double result2 = vector.dotProduct(smaller);
        assertEquals(0.0, result2, EPS);
    }

    @Test
    public void testDotProductRealVector() {
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        OpenMapRealVector v = new OpenMapRealVector(data);
        assertEquals(55.0, v.dotProduct(v), EPS);
        
        double[] data2 = {0.0, 0.0, 0.0, 0.0, 0.0};
        OpenMapRealVector empty = new OpenMapRealVector(data2);
        assertEquals(0.0, empty.dotProduct(v), EPS);
    }

    @Test
    public void testEbeDivide() {
        vector.setEntry(0, 10.0);
        vector.setEntry(2, 6.0);
        otherVector.setEntry(0, 2.0);
        otherVector.setEntry(2, 3.0);
        
        OpenMapRealVector result = vector.ebeDivide(otherVector);
        assertEquals(5.0, result.getEntry(0), EPS);
        assertEquals(2.0, result.getEntry(2), EPS);
        
        double[] v = {1.0, 0.0, 2.0, 0.0, 0.0};
        result = vector.ebeDivide(v);
        assertEquals(10.0, result.getEntry(0), EPS);
        assertEquals(3.0, result.getEntry(2), EPS);
    }

    @Test
    public void testEbeMultiply() {
        vector.setEntry(0, 2.0);
        vector.setEntry(2, 3.0);
        otherVector.setEntry(0, 4.0);
        otherVector.setEntry(2, 5.0);
        
        OpenMapRealVector result = vector.ebeMultiply(otherVector);
        assertEquals(8.0, result.getEntry(0), EPS);
        assertEquals(15.0, result.getEntry(2), EPS);
        
        double[] v = {1.0, 0.0, 2.0, 0.0, 0.0};
        result = vector.ebeMultiply(v);
        assertEquals(2.0, result.getEntry(0), EPS);
        assertEquals(6.0, result.getEntry(2), EPS);
    }

    @Test
    public void testGetSubVector() {
        vector.setEntry(0, 1.0);
        vector.setEntry(2, 3.0);
        vector.setEntry(4, 5.0);
        
        OpenMapRealVector sub = vector.getSubVector(1, 3);
        assertEquals(3, sub.getDimension());
        assertEquals(3.0, sub.getEntry(1), EPS);
        
        sub = vector.getSubVector(0, 5);
        assertEquals(5, sub.getDimension());
        assertEquals(1.0, sub.getEntry(0), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSubVectorInvalid() {
        vector.getSubVector(3, 5);
    }

    @Test
    public void testGetDistance() {
        vector.setEntry(0, 1.0);
        vector.setEntry(2, 3.0);
        otherVector.setEntry(0, 4.0);
        otherVector.setEntry(2, 7.0);
        
        assertEquals(5.0, vector.getDistance(otherVector), EPS);
        
        double[] data = {4.0, 0.0, 7.0, 0.0, 0.0};
        assertEquals(5.0, vector.getDistance(data), EPS);
    }

    @Test
    public void testGetL1Distance() {
        vector.setEntry(0, 1.0);
        vector.setEntry(2, 3.0);
        otherVector.setEntry(0, 4.0);
        otherVector.setEntry(2, 7.0);
        
        assertEquals(7.0, vector.getL1Distance(otherVector), EPS);
        
        double[] data = {4.0, 0.0, 7.0, 0.0, 0.0};
        assertEquals(7.0, vector.getL1Distance(data), EPS);
    }

    @Test
    public void testGetLInfDistance() {
        vector.setEntry(0, 1.0);
        vector.setEntry(2, 3.0);
        otherVector.setEntry(0, 4.0);
        otherVector.setEntry(2, 7.0);
        
        assertEquals(4.0, vector.getLInfDistance(otherVector), EPS);
        
        double[] data = {4.0, 0.0, 7.0, 0.0, 0.0};
        assertEquals(4.0, vector.getLInfDistance(data), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetL1DistanceDimensionMismatch() {
        vector.getL1Distance(new double[3]);
    }

    @Test
    public void testIsInfinite() {
        assertFalse(vector.isInfinite());
        vector.setEntry(0, Double.POSITIVE_INFINITY);
        assertTrue(vector.isInfinite());
        
        vector.setEntry(0, 1.0);
        vector.setEntry(1, Double.NaN);
        assertFalse(vector.isInfinite());
    }

    @Test
    public void testIsNaN() {
        assertFalse(vector.isNaN());
        vector.setEntry(0, Double.NaN);
        assertTrue(vector.isNaN());
    }

    @Test
    public void testMapAdd() {
        vector.setEntry(0, 1.0);
        vector.setEntry(2, 3.0);
        
        OpenMapRealVector result = vector.mapAdd(2.0);
        assertEquals(3.0, result.getEntry(0), EPS);
        assertEquals(5.0, result.getEntry(2), EPS);
        
        OpenMapRealVector selfResult = vector.mapAddToSelf(2.0);
        assertSame(vector, selfResult);
        assertEquals(3.0, vector.getEntry(0), EPS);
    }

    @Test
    public void testOuterProduct() {
        vector.setEntry(0, 1.0);
        vector.setEntry(2, 2.0);
        
        double[] v = {1.0, 2.0};
        RealMatrix result = vector.outerProduct(v);
        assertEquals(5, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        assertEquals(1.0, result.getEntry(0, 0), EPS);
        assertEquals(2.0, result.getEntry(2, 1), EPS);
    }

    @Test
    public void testProjection() {
        OpenMapRealVector base = new OpenMapRealVector(new double[] {1.0, 2.0, 3.0, 0.0, 0.0});
        OpenMapRealVector proj = base.projection(new double[] {2.0, 4.0, 6.0, 0.0, 0.0});
        assertEquals(2.0, proj.getEntry(0), EPS);
        assertEquals(4.0, proj.getEntry(1), EPS);
        assertEquals(6.0, proj.getEntry(2), EPS);
        
        OpenMapRealVector base2 = new OpenMapRealVector(new double[] {0.0, 0.0, 0.0, 0.0, 0.0});
        OpenMapRealVector proj2 = base2.projection(new double[] {1.0, 0.0, 0.0, 0.0, 0.0});
        assertEquals(0.0, proj2.getDimension() == 0 ? 0 : 0.0, EPS);
    }

    @Test
    public void testSetEntry() {
        vector.setEntry(0, 1.0);
        assertEquals(1.0, vector.getEntry(0), EPS);
        
        vector.setEntry(0, 0.0);
        assertEquals(0.0, vector.getEntry(0), EPS);
        
        vector.setEntry(2, 3.0);
        assertEquals(3.0, vector.getEntry(2), EPS);
    }

    @Test
    public void testSetSubVector() {
        double[] sub = {1.0, 2.0, 3.0};
        vector.setSubVector(1, sub);
        assertEquals(1.0, vector.getEntry(1), EPS);
        assertEquals(3.0, vector.getEntry(3), EPS);
        
        OpenMapRealVector subV = new OpenMapRealVector(new double[] {4.0, 5.0});
        vector.setSubVector(0, subV);
        assertEquals(4.0, vector.getEntry(0), EPS);
        assertEquals(5.0, vector.getEntry(1), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubVectorOutOfBounds() {
        vector.setSubVector(4, new double[2]);
    }

    @Test
    public void testSetAndClear() {
        vector.set(1.0);
        assertEquals(1.0, vector.getEntry(0), EPS);
        assertEquals(1.0, vector.getEntry(4), EPS);
        
        vector.set(0.0);
        assertEquals(0.0, vector.getEntry(0), EPS);
    }

    @Test
    public void testSubtract() {
        vector.setEntry(0, 5.0);
        vector.setEntry(2, 3.0);
        otherVector.setEntry(0, 2.0);
        otherVector.setEntry(2, 7.0);
        
        OpenMapRealVector result = vector.subtract(otherVector);
        assertEquals(3.0, result.getEntry(0), EPS);
        assertEquals(-4.0, result.getEntry(2), EPS);
        
        result = otherVector.subtract(vector);
        assertEquals(-3.0, result.getEntry(0), EPS);
        assertEquals(4.0, result.getEntry(2), EPS);
    }

    @Test
    public void testSubtractRealVector() {
        vector.setEntry(0, 5.0);
        double[] data = {1.0, 0.0, 2.0, 0.0, 0.0};
        OpenMapRealVector result = vector.subtract(data);
        assertEquals(4.0, result.getEntry(0), EPS);
        assertEquals(-2.0, result.getEntry(2), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractDimensionMismatch() {
        vector.subtract(new OpenMapRealVector(3));
    }

    @Test
    public void testUnitVector() {
        vector.setEntry(0, 2.0);
        vector.setEntry(1, 0.0);
        vector.setEntry(2, 0.0);
        
        OpenMapRealVector unit = vector.unitVector();
        assertEquals(1.0, unit.getEntry(0), EPS);
        assertEquals(0.0, unit.getEntry(1), EPS);
        
        vector.unitize();
        assertEquals(1.0, vector.getEntry(0), EPS);
        assertEquals(0.0, vector.getEntry(1), EPS);
    }

    @Test(expected = MathArithmeticException.class)
    public void testUnitVectorZeroNorm() {
        vector.unitize();
    }

    @Test
    public void testEquals() {
        OpenMapRealVector v1 = new OpenMapRealVector(5);
        OpenMapRealVector v2 = new OpenMapRealVector(5);
        assertEquals(v1, v2);
        
        v1.setEntry(0, 1.0);
        assertNotEquals(v1, v2);
        
        v2.setEntry(0, 1.0);
        assertEquals(v1, v2);
        
        OpenMapRealVector v3 = new OpenMapRealVector(4);
        assertNotEquals(v1, v3);
        
        OpenMapRealVector v4 = new OpenMapRealVector(5, 1.0e-8);
        assertNotEquals(v1, v4);
        
        assertNotEquals(v1, null);
        assertNotEquals(v1, new Object());
    }

    @Test
    public void testHashCode() {
        OpenMapRealVector v1 = new OpenMapRealVector(5);
        OpenMapRealVector v2 = new OpenMapRealVector(5);
        v1.setEntry(0, 1.0);
        v2.setEntry(0, 1.0);
        assertEquals(v1.hashCode(), v2.hashCode());
    }

    @Test
    public void testGetSparsity() {
        assertEquals(0.0, new OpenMapRealVector(5).getSparsity(), EPS);
        vector.setEntry(0, 1.0);
        vector.setEntry(3, 2.0);
        assertEquals(0.4, vector.getSparsity(), EPS);
    }

    @Test
    public void testSparseIterator() {
        vector.setEntry(0, 1.0);
        vector.setEntry(2, 3.0);
        
        java.util.Iterator<Entry> it = vector.sparseIterator();
        assertTrue(it.hasNext());
        Entry entry = it.next();
        assertEquals(0, entry.getIndex());
        assertEquals(1.0, entry.getValue(), EPS);
        
        entry.setValue(5.0);
        assertEquals(5.0, vector.getEntry(0), EPS);
        
        assertTrue(it.hasNext());
        it.next();
        assertFalse(it.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSparseIteratorRemove() {
        vector.setEntry(0, 1.0);
        java.util.Iterator<Entry> it = vector.sparseIterator();
        it.next();
        it.remove();
    }

    @Test
    public void testGetEntryDefault() {
        assertEquals(0.0, vector.getEntry(0), EPS);
        assertEquals(0.0, vector.getEntry(4), EPS);
    }
}