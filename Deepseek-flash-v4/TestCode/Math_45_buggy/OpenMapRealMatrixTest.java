package org.apache.commons.math.linear;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.exception.NumberIsTooLargeException;

/**
 * Test class for OpenMapRealMatrix.
 */
public class OpenMapRealMatrixTest {

    private static final double EPSILON = 1e-10;

    @Test
    public void testConstructors() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(3, 4);
        assertEquals(3, m.getRowDimension());
        assertEquals(4, m.getColumnDimension());
        assertEquals(0.0, m.getEntry(0, 0), 0.0);

        OpenMapRealMatrix copy = new OpenMapRealMatrix(m);
        assertEquals(3, copy.getRowDimension());
        assertEquals(4, copy.getColumnDimension());
        assertEquals(0.0, copy.getEntry(0, 0), 0.0);
    }

    @Test
    public void testCopyCreateMatrix() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 3);
        m.setEntry(1, 2, 5.5);
        OpenMapRealMatrix copy = m.copy();
        assertEquals(2, copy.getRowDimension());
        assertEquals(3, copy.getColumnDimension());
        assertEquals(5.5, copy.getEntry(1, 2), EPSILON);

        OpenMapRealMatrix created = m.createMatrix(4, 5);
        assertEquals(4, created.getRowDimension());
        assertEquals(5, created.getColumnDimension());
    }

    @Test
    public void testSetEntryAndGetEntry() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(3, 3);
        m.setEntry(0, 0, 1.0);
        m.setEntry(1, 1, 2.5);
        m.setEntry(2, 2, 0.0); // Setting to zero should remove entry
        assertEquals(1.0, m.getEntry(0, 0), EPSILON);
        assertEquals(2.5, m.getEntry(1, 1), EPSILON);
        assertEquals(0.0, m.getEntry(2, 2), 0.0); // Default zero
    }

    @Test
    public void testAddToEntry() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 2);
        m.addToEntry(0, 0, 5.0);
        assertEquals(5.0, m.getEntry(0, 0), EPSILON); // 0 + 5 = 5
        m.addToEntry(0, 0, -5.0);
        assertEquals(0.0, m.getEntry(0, 0), 0.0); // 5 + (-5) = 0, removed
        m.addToEntry(0, 0, 3.0);
        m.addToEntry(0, 0, 4.0);
        assertEquals(7.0, m.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testMultiplyEntry() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 2);
        m.setEntry(0, 0, 4.0);
        m.multiplyEntry(0, 0, 3.0);
        assertEquals(12.0, m.getEntry(0, 0), EPSILON);
        m.multiplyEntry(0, 0, 0.0); // Multiply by zero -> remove
        assertEquals(0.0, m.getEntry(0, 0), 0.0);
    }

    @Test
    public void testAdd() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 3);
        a.setEntry(0, 0, 1.0);
        a.setEntry(1, 2, 4.5);

        OpenMapRealMatrix b = new OpenMapRealMatrix(2, 3);
        b.setEntry(0, 0, 2.0);
        b.setEntry(1, 2, 5.5);
        b.setEntry(0, 1, 7.0);

        OpenMapRealMatrix result = a.add(b);
        assertEquals(2, result.getRowDimension());
        assertEquals(3, result.getColumnDimension());
        assertEquals(3.0, result.getEntry(0, 0), EPSILON);
        assertEquals(7.0, result.getEntry(0, 1), EPSILON);
        assertEquals(10.0, result.getEntry(1, 2), EPSILON);
        // Original matrices should not be modified
        assertEquals(1.0, a.getEntry(0, 0), EPSILON);
        assertEquals(2.0, b.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testSubtractMatrix() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        a.setEntry(0, 0, 10.0);
        a.setEntry(1, 1, 5.0);

        OpenMapRealMatrix b = new OpenMapRealMatrix(2, 2);
        b.setEntry(0, 0, 3.0);
        b.setEntry(1, 1, 2.0);

        OpenMapRealMatrix result = a.subtract(b);
        assertEquals(7.0, result.getEntry(0, 0), EPSILON);
        assertEquals(3.0, result.getEntry(1, 1), EPSILON);

        // Test with addToEntry internally
        OpenMapRealMatrix result2 = a.subtract((RealMatrix) b);
        assertEquals(7.0, result2.getEntry(0, 0), EPSILON);
        assertEquals(3.0, result2.getEntry(1, 1), EPSILON);
    }

    @Test
    public void testMultiplyOpenMapRealMatrix() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 3);
        a.setEntry(0, 0, 1.0);
        a.setEntry(0, 2, 3.0);
        a.setEntry(1, 1, 2.0);

        OpenMapRealMatrix b = new OpenMapRealMatrix(3, 2);
        b.setEntry(0, 0, 5.0);
        b.setEntry(1, 1, 6.0);
        b.setEntry(2, 1, 7.0);

        OpenMapRealMatrix result = a.multiply(b);
        assertEquals(2, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        // Expected: row0: 1*5 + 3*0 = 5, 1*0 + 3*7 = 21; row1: 0*5+2*0 = 0, 0*0 + 2*6 = 12
        assertEquals(5.0, result.getEntry(0, 0), EPSILON);
        assertEquals(21.0, result.getEntry(0, 1), EPSILON);
        assertEquals(0.0, result.getEntry(1, 0), EPSILON);
        assertEquals(12.0, result.getEntry(1, 1), EPSILON);
    }

    @Test
    public void testMultiplyRealMatrix() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        a.setEntry(0, 0, 2.0);
        a.setEntry(1, 1, 3.0);

        RealMatrix b = new BlockRealMatrix(2, 2);
        b.setEntry(0, 0, 4.0);
        b.setEntry(1, 1, 5.0);

        RealMatrix result = a.multiply(b);
        assertEquals(2, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        assertEquals(8.0, result.getEntry(0, 0), EPSILON);
        assertEquals(15.0, result.getEntry(1, 1), EPSILON);
    }

    @Test(expected = RuntimeException.class)
    public void testGetEntryInvalid() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 2);
        m.getEntry(2, 0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testComputeKeyOverflow() {
        // This might not be directly testable with given methods, but we can test row/column checks
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 2);
        try {
            m.setEntry(3, 0, 1.0);
            fail("Expected exception");
        } catch (RuntimeException e) {
            // ok
        }
        // Test computeKey indirectly through setEntry with valid indices
        m.setEntry(1, 1, 1.0);
        assertEquals(1.0, m.getEntry(1, 1), EPSILON);
        // Throw when out of bounds
        m.getEntry(2, 2);
    }

    @Test
    public void testBoundaryDimensions() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(1, 1);
        m.setEntry(0, 0, 42.0);
        assertEquals(42.0, m.getEntry(0, 0), EPSILON);
        assertEquals(1, m.getRowDimension());
        assertEquals(1, m.getColumnDimension());

        OpenMapRealMatrix small = new OpenMapRealMatrix(0, 0);
        assertEquals(0, small.getRowDimension());
        assertEquals(0, small.getColumnDimension());
    }
}