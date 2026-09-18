package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CoreOperationGreaterThanOrEqualTest {

    @Test
    public void testComputeValue_GreaterThan_ReturnsTrue() {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Constant(5.0), new Constant(3.0));
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_LessThan_ReturnsFalse() {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Constant(2.0), new Constant(5.0));
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_Equal_ReturnsTrue() {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Constant(4.0), new Constant(4.0));
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_BoundaryZero_ReturnsTrue() {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Constant(0.0), new Constant(0.0));
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_NegativeNumbers_ReturnsFalse() {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Constant(-5.0), new Constant(-3.0));
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_NegativeNumbers_ReturnsTrue() {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Constant(-3.0), new Constant(-5.0));
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_BoundaryMaxValue() {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Constant(Double.MAX_VALUE), new Constant(Double.MAX_VALUE));
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_BoundaryMinValue() {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Constant(Double.MIN_VALUE), new Constant(0.0));
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_BooleanArguments_TrueGreaterOrEqualFalse() {
        // true -> 1.0, false -> 0.0; 1.0 >= 0.0 -> true
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Constant(true), new Constant(false));
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_BooleanArguments_FalseNotGreaterOrEqualTrue() {
        // false -> 0.0, true -> 1.0; 0.0 >= 1.0 -> false
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Constant(false), new Constant(true));
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testGetSymbol_ReturnsCorrectSymbol() {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Constant(1.0), new Constant(2.0));
        assertEquals(">=", op.getSymbol());
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_NullFirstArgument_ThrowsException() {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                null, new Constant(5.0));
        op.computeValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_NullSecondArgument_ThrowsException() {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Constant(5.0), null);
        op.computeValue(null);
    }

    @Test
    public void testComputeValue_MultipleComparisons_Loop() {
        double[][] testData = {
            {10.0, 5.0, 1.0},   // greater -> true
            {5.0, 5.0, 1.0},    // equal -> true
            {3.0, 10.0, 0.0},   // less -> false
            {-1.0, -1.0, 1.0},  // equal negative -> true
            {100.5, 100.4, 1.0} // greater decimal -> true
        };
        for (double[] data : testData) {
            CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                    new Constant(data[0]), new Constant(data[1]));
            Object result = op.computeValue(null);
            boolean expected = data[2] == 1.0;
            assertEquals(expected, ((Boolean) result).booleanValue());
        }
    }

    @Test
    public void testComputeValue_ResultIsBooleanInstance() {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Constant(1.0), new Constant(1.0));
        Object result = op.computeValue(null);
        assertNotNull(result);
        assertTrue(result instanceof Boolean);
    }

    @Test
    public void testConstructor_StoresArgumentsCorrectly() {
        Constant arg1 = new Constant(7.0);
        Constant arg2 = new Constant(3.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }
}