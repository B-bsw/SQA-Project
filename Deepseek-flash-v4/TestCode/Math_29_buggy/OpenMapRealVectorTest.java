package org.apache.commons.math3.linear;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotPositiveException;

public class OpenMapRealVectorTest {
    
    private static final double EPS = 1e-10;
    private static final double DEFAULT_TOL = 1.0e-12;
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testConstructors() {
        OpenMapRealVector v1 = new OpenMapRealVector();
        assertEquals(0, v1.getDimension());
        assertEquals(0.0, v1.getNorm(), 0.0);
        
        OpenMapRealVector v2 = new OpenMapRealVector(5);
        assertEquals(5, v2.getDimension());
        assertEquals(0.0, v2.getEntry(0), 0.0);
        
        OpenMapRealVector v3 = new OpenMapRealVector(5, 1e-8);
        assertEquals(5, v3.getDimension());
        
        double[] values = {1.0, 2.0, 0.0, 4.0};
        OpenMapRealVector v4 = new OpenMapRealVector(values);
        assertEquals(4, v4.getDimension());
        assertEquals(1.0, v4.getEntry(0), 0.0);
        assertEquals(4.0, v4.getEntry(3), 0.0);
        
        OpenMapRealVector v5 = new OpenMapRealVector(v4);
        assertEquals(4, v5.getDimension());
        assertEquals(2.0, v5.getEntry(1), 0.0);
        
        OpenMapRealVector v6 = new OpenMapRealVector(v5, 2);
        assertEquals(6, v6.getDimension());
        assertEquals(2.0, v6.getEntry(1), 0.0);
        
        Double[] dblValues = {1.0, 2.0, 0.0, 4.0};
        OpenMapRealVector v7 = new OpenMapRealVector(dblValues);
        assertEquals(4, v7.getDimension());
        assertEquals(1.0, v7.getEntry(0), 0.0);
    }
    
    @Test
    public void testAdd() {
        double[] d1 = {1.0, 2.0, 3.0, 4.0};
        double[] d2 = {5.0, 6.0, 7.0, 8.0};
        OpenMapRealVector v1 = new OpenMapRealVector(d1);
        OpenMapRealVector v2 = new OpenMapRealVector(d2);
        
        OpenMapRealVector result = v1.add(v2);
        assertEquals(6.0, result.getEntry(0), 0.0);
        assertEquals(8.0, result.getEntry(1), 0.0);
        assertEquals(10.0, result.getEntry(2), 0.0);
        assertEquals(12.0, result.getEntry(3), 0.0);
        
        OpenMapRealVector zero = new OpenMapRealVector(4);
        OpenMapRealVector result2 = v1.add(zero);
        assertEquals(1.0, result2.getEntry(0), 0.0);
        assertEquals(2.0, result2.getEntry(1), 0.0);
    }
    
    @Test
    public void testAddDifferentSizes() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        OpenMapRealVector v2 = new OpenMapRealVector(4);
        try {
            v1.add(v2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testAppend() {
        double[] d1 = {1.0, 2.0};
        OpenMapRealVector v1 = new OpenMapRealVector(d1);
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{3.0, 4.0});
        
        OpenMapRealVector result = v1.append(v2);
        assertEquals(4, result.getDimension());
        assertEquals(1.0, result.getEntry(0), 0.0);
        assertEquals(2.0, result.getEntry(1), 0.0);
        assertEquals(3.0, result.getEntry(2), 0.0);
        assertEquals(4.0, result.getEntry(3), 0.0);
        
        OpenMapRealVector result2 = v1.append(5.0);
        assertEquals(3, result2.getDimension());
        assertEquals(5.0, result2.getEntry(2), 0.0);
    }
    
    @Test
    public void testCopy() {
        double[] d = {1.0, 0.0, 3.0, 0.0};
        OpenMapRealVector v = new OpenMapRealVector(d);
        OpenMapRealVector copy = v.copy();
        assertEquals(v.getDimension(), copy.getDimension());
        for (int i = 0; i < v.getDimension(); i++) {
            assertEquals(v.getEntry(i), copy.getEntry(i), 0.0);
        }
        assertNotSame(v, copy);
    }
    
    @Test
    public void testDotProduct() {
        double[] d1 = {1.0, 2.0, 3.0};
        double[] d2 = {4.0, 5.0, 6.0};
        OpenMapRealVector v1 = new OpenMapRealVector(d1);
        OpenMapRealVector v2 = new OpenMapRealVector(d2);
        
        assertEquals(32.0, v1.dotProduct(v2), EPS);
        
        OpenMapRealVector v3 = new OpenMapRealVector(3);
        assertEquals(0.0, v1.dotProduct(v3), EPS);
    }
    
    @Test
    public void testDotProductDifferentSizes() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        OpenMapRealVector v2 = new OpenMapRealVector(4);
        try {
            v1.dotProduct(v2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testEbeDivide() {
        double[] d1 = {2.0, 4.0, 6.0, 8.0};
        double[] d2 = {1.0, 2.0, 3.0, 4.0};
        OpenMapRealVector v1 = new OpenMapRealVector(d1);
        OpenMapRealVector v2 = new OpenMapRealVector(d2);
        
        OpenMapRealVector result = v1.ebeDivide(v2);
        assertEquals(2.0, result.getEntry(0), EPS);
        assertEquals(2.0, result.getEntry(1), EPS);
        assertEquals(2.0, result.getEntry(2), EPS);
        assertEquals(2.0, result.getEntry(3), EPS);
    }
    
    @Test
    public void testEbeMultiply() {
        double[] d1 = {2.0, 4.0, 6.0, 8.0};
        double[] d2 = {1.0, 2.0, 3.0, 4.0};
        OpenMapRealVector v1 = new OpenMapRealVector(d1);
        OpenMapRealVector v2 = new OpenMapRealVector(d2);
        
        OpenMapRealVector result = v1.ebeMultiply(v2);
        assertEquals(2.0, result.getEntry(0), EPS);
        assertEquals(8.0, result.getEntry(1), EPS);
        assertEquals(18.0, result.getEntry(2), EPS);
        assertEquals(32.0, result.getEntry(3), EPS);
    }
    
    @Test
    public void testGetSubVector() {
        double[] d = {1.0, 2.0, 3.0, 4.0, 5.0};
        OpenMapRealVector v = new OpenMapRealVector(d);
        
        OpenMapRealVector sub = v.getSubVector(1, 3);
        assertEquals(3, sub.getDimension());
        assertEquals(2.0, sub.getEntry(0), 0.0);
        assertEquals(3.0, sub.getEntry(1), 0.0);
        assertEquals(4.0, sub.getEntry(2), 0.0);
    }
    
    @Test
    public void testGetSubVectorNegativeN() {
        double[] d = {1.0, 2.0, 3.0};
        OpenMapRealVector v = new OpenMapRealVector(d);
        try {
            v.getSubVector(0, -1);
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }
    }
    
    @Test
    public void testGetSubVectorOutOfBounds() {
        double[] d = {1.0, 2.0, 3.0};
        OpenMapRealVector v = new OpenMapRealVector(d);
        try {
            v.getSubVector(1, 3);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }
    
    @Test
    public void testGetDistance() {
        double[] d1 = {1.0, 2.0, 3.0};
        double[] d2 = {4.0, 5.0, 6.0};
        OpenMapRealVector v1 = new OpenMapRealVector(d1);
        OpenMapRealVector v2 = new OpenMapRealVector(d2);
        
        double expected = Math.sqrt(27.0);
        assertEquals(expected, v1.getDistance(v2), EPS);
    }
    
    @Test
    public void testGetEntry() {
        double[] d = {1.0, 0.0, 3.0};
        OpenMapRealVector v = new OpenMapRealVector(d);
        assertEquals(1.0, v.getEntry(0), 0.0);
        assertEquals(0.0, v.getEntry(1), 0.0);
        assertEquals(3.0, v.getEntry(2), 0.0);
    }
    
    @Test
    public void testGetEntryOutOfBounds() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        try {
            v.getEntry(3);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }
    
    @Test
    public void testGetL1Distance() {
        double[] d1 = {1.0, 2.0, 3.0};
        double[] d2 = {4.0, 5.0, 6.0};
        OpenMapRealVector v1 = new OpenMapRealVector(d1);
        OpenMapRealVector v2 = new OpenMapRealVector(d2);
        
        assertEquals(9.0, v1.getL1Distance(v2), EPS);
    }
    
    @Test
    public void testGetLInfDistance() {
        double[] d1 = {1.0, 2.0, 3.0};
        double[] d2 = {4.0, 5.0, 6.0};
        OpenMapRealVector v1 = new OpenMapRealVector(d1);
        OpenMapRealVector v2 = new OpenMapRealVector(d2);
        
        assertEquals(3.0, v1.getLInfDistance(v2), EPS);
    }
    
    @Test
    public void testGetSparsity() {
        double[] d = {1.0, 0.0, 0.0, 4.0, 0.0};
        OpenMapRealVector v = new OpenMapRealVector(d);
        assertEquals(2.0/5.0, v.getSparsity(), EPS);
    }
    
    @Test
    public void testIsInfinite() {
        double[] normal = {1.0, 2.0, 3.0};
        OpenMapRealVector v1 = new OpenMapRealVector(normal);
        assertFalse(v1.isInfinite());
        
        double[] inf = {1.0, Double.POSITIVE_INFINITY, 3.0};
        OpenMapRealVector v2 = new OpenMapRealVector(inf);
        assertTrue(v2.isInfinite());
        
        double[] nan = {1.0, Double.NaN, 3.0};
        OpenMapRealVector v3 = new OpenMapRealVector(nan);
        assertFalse(v3.isInfinite());
    }
    
    @Test
    public void testIsNaN() {
        double[] normal = {1.0, 2.0, 3.0};
        OpenMapRealVector v1 = new OpenMapRealVector(normal);
        assertFalse(v1.isNaN());
        
        double[] nan = {1.0, Double.NaN, 3.0};
        OpenMapRealVector v2 = new OpenMapRealVector(nan);
        assertTrue(v2.isNaN());
    }
    
    @Test
    public void testMapAdd() {
        double[] d = {1.0, 2.0, 3.0};
        OpenMapRealVector v = new OpenMapRealVector(d);
        OpenMapRealVector result = v.mapAdd(2.0);
        assertEquals(3.0, result.getEntry(0), 0.0);
        assertEquals(4.0, result.getEntry(1), 0.0);
        assertEquals(5.0, result.getEntry(2), 0.0);
        assertEquals(1.0, v.getEntry(0), 0.0);
    }
    
    @Test
    public void testMapAddToSelf() {
        double[] d = {1.0, 2.0, 3.0};
        OpenMapRealVector v = new OpenMapRealVector(d);
        v.mapAddToSelf(2.0);
        assertEquals(3.0, v.getEntry(0), 0.0);
        assertEquals(4.0, v.getEntry(1), 0.0);
        assertEquals(5.0, v.getEntry(2), 0.0);
    }
    
    @Test
    public void testSetEntry() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.setEntry(2, 5.0);
        assertEquals(5.0, v.getEntry(2), 0.0);
        v.setEntry(2, 0.0);
        assertEquals(0.0, v.getEntry(2), 0.0);
    }
    
    @Test
    public void testSetSubVector() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        double[] sub = {1.0, 2.0, 3.0};
        OpenMapRealVector subVec = new OpenMapRealVector(sub);
        v.setSubVector(1, subVec);
        assertEquals(1.0, v.getEntry(1), 0.0);
        assertEquals(2.0, v.getEntry(2), 0.0);
        assertEquals(3.0, v.getEntry(3), 0.0);
    }
    
    @Test
    public void testSubtract() {
        double[] d1 = {5.0, 4.0, 3.0, 2.0};
        double[] d2 = {1.0, 2.0, 3.0, 4.0};
        OpenMapRealVector v1 = new OpenMapRealVector(d1);
        OpenMapRealVector v2 = new OpenMapRealVector(d2);
        
        OpenMapRealVector result = v1.subtract(v2);
        assertEquals(4.0, result.getEntry(0), 0.0);
        assertEquals(2.0, result.getEntry(1), 0.0);
        assertEquals(0.0, result.getEntry(2), 0.0);
        assertEquals(-2.0, result.getEntry(3), 0.0);
    }
    
    @Test
    public void testUnitVector() {
        double[] d = {3.0, 0.0, 4.0};
        OpenMapRealVector v = new OpenMapRealVector(d);
        OpenMapRealVector unit = v.unitVector();
        assertEquals(0.6, unit.getEntry(0), EPS);
        assertEquals(0.0, unit.getEntry(1), EPS);
        assertEquals(0.8, unit.getEntry(2), EPS);
        assertEquals(1.0, unit.getNorm(), EPS);
    }
    
    @Test
    public void testUnitVectorZeroNorm() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        try {
            v.unitVector();
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testUnitize() {
        double[] d = {3.0, 0.0, 4.0};
        OpenMapRealVector v = new OpenMapRealVector(d);
        v.unitize();
        assertEquals(0.6, v.getEntry(0), EPS);
        assertEquals(0.0, v.getEntry(1), EPS);
        assertEquals(0.8, v.getEntry(2), EPS);
    }
    
    @Test
    public void testUnitizeZeroNorm() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        try {
            v.unitize();
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testEquals() {
        double[] d1 = {1.0, 2.0, 3.0};
        double[] d2 = {1.0, 2.0, 3.0};
        OpenMapRealVector v1 = new OpenMapRealVector(d1);
        OpenMapRealVector v2 = new OpenMapRealVector(d2);
        OpenMapRealVector v3 = new OpenMapRealVector(d1);
        
        assertTrue(v1.equals(v2));
        assertTrue(v1.equals(v1));
        assertFalse(v1.equals(null));
        assertFalse(v1.equals(new Object()));
        
        OpenMapRealVector v4 = new OpenMapRealVector(new double[]{1.0, 2.0, 4.0});
        assertFalse(v1.equals(v4));
        
        OpenMapRealVector v5 = new OpenMapRealVector(3);
        OpenMapRealVector v6 = new OpenMapRealVector(4);
        assertFalse(v5.equals(v6));
    }
    
    @Test
    public void testHashCode() {
        double[] d1 = {1.0, 2.0, 3.0};
        double[] d2 = {1.0, 2.0, 3.0};
        OpenMapRealVector v1 = new OpenMapRealVector(d1);
        OpenMapRealVector v2 = new OpenMapRealVector(d2);
        
        assertEquals(v1.hashCode(), v2.hashCode());
    }
    
    @Test
    public void testSparseIterator() {
        double[] d = {1.0, 0.0, 3.0, 0.0, 5.0};
        OpenMapRealVector v = new OpenMapRealVector(d);
        java.util.Iterator<RealVector.Entry> iter = v.sparseIterator();
        
        int count = 0;
        while (iter.hasNext()) {
            RealVector.Entry entry = iter.next();
            assertTrue(entry.getIndex() == 0 || entry.getIndex() == 2 || entry.getIndex() == 4);
            count++;
        }
        assertEquals(3, count);
        
        try {
            iter.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
    
    @Test
    public void testToArray() {
        double[] d = {1.0, 0.0, 3.0, 0.0, 5.0};
        OpenMapRealVector v = new OpenMapRealVector(d);
        double[] result = v.toArray();
        assertArrayEquals(d, result, 0.0);
    }
    
    @Test
    public void testGetDimension() {
        OpenMapRealVector v = new OpenMapRealVector(10);
        assertEquals(10, v.getDimension());
    }
    
    @Test
    public void testMapMultiply() {
        double[] d = {1.0, 2.0, 3.0};
        OpenMapRealVector v = new OpenMapRealVector(d);
        RealVector result = v.mapMultiply(2.0);
        assertEquals(2.0, result.getEntry(0), 0.0);
        assertEquals(4.0, result.getEntry(1), 0.0);
        assertEquals(6.0, result.getEntry(2), 0.0);
    }
    
    @Test
    public void testProjection() {
        double[] d1 = {1.0, 2.0, 3.0};
        double[] d2 = {1.0, 1.0, 1.0};
        OpenMapRealVector v1 = new OpenMapRealVector(d1);
        OpenMapRealVector v2 = new OpenMapRealVector(d2);
        
        RealVector proj = v1.projection(v2);
        assertEquals(2.0, proj.getEntry(0), EPS);
        assertEquals(2.0, proj.getEntry(1), EPS);
        assertEquals(2.0, proj.getEntry(2), EPS);
    }
}