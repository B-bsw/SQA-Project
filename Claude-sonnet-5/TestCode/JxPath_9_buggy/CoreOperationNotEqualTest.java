package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoreOperationNotEqualTest {

    @Test
    public void testGetSymbol() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(new Constant("a"), new Constant("a"));
        assertEquals("!=", op.getSymbol());
    }

    @Test
    public void testComputeValue_EqualNumbers_ReturnsFalse() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(new Constant(5), new Constant(5));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_DifferentNumbers_ReturnsTrue() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(new Constant(5), new Constant(6));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_EqualStrings_ReturnsFalse() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(new Constant("abc"), new Constant("abc"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_DifferentStrings_ReturnsTrue() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(new Constant("abc"), new Constant("xyz"));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_EmptyStrings_ReturnsFalse() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(new Constant(""), new Constant(""));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_BoundaryZero_ReturnsFalse() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(new Constant(0), new Constant(0));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_NegativeVsPositive_ReturnsTrue() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(new Constant(-5), new Constant(5));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_LargeBoundaryNumbers_ReturnsFalse() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(new Constant(Double.MAX_VALUE), new Constant(Double.MAX_VALUE));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_MinBoundaryNumbers_ReturnsTrue() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(new Constant(Double.MIN_VALUE), new Constant(0));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_NullFirstArgument_ThrowsException() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(null, new Constant(5));
        op.computeValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_NullSecondArgument_ThrowsException() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(new Constant(5), null);
        op.computeValue(null);
    }
}