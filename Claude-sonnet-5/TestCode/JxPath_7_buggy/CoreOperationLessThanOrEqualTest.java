package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CoreOperationLessThanOrEqualTest {

    @Test
    public void testConstructorAndGetSymbol() {
        Constant arg1 = new Constant(1.0);
        Constant arg2 = new Constant(2.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        assertNotNull(op);
        assertEquals("<=", op.getSymbol());
    }

    @Test
    public void testComputeValueLessThan() {
        Constant arg1 = new Constant(1.0);
        Constant arg2 = new Constant(2.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueEqual() {
        Constant arg1 = new Constant(2.0);
        Constant arg2 = new Constant(2.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueGreaterThan() {
        Constant arg1 = new Constant(3.0);
        Constant arg2 = new Constant(2.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValueNegativeNumbers() {
        Constant arg1 = new Constant(-5.0);
        Constant arg2 = new Constant(-3.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueNegativeEqual() {
        Constant arg1 = new Constant(-5.0);
        Constant arg2 = new Constant(-5.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueBoundaryMaxValue() {
        Constant arg1 = new Constant(Double.MAX_VALUE);
        Constant arg2 = new Constant(Double.MAX_VALUE);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueBoundaryMinValue() {
        Constant arg1 = new Constant(Double.MIN_VALUE);
        Constant arg2 = new Constant(0.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValueWithStringNumbers() {
        Constant arg1 = new Constant("2");
        Constant arg2 = new Constant("3");
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueWithStringNumbersEqual() {
        Constant arg1 = new Constant("5");
        Constant arg2 = new Constant("5");
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueWithZero() {
        Constant arg1 = new Constant(0.0);
        Constant arg2 = new Constant(0.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValueWithNullArg1() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(null, new Constant(2.0));
        op.computeValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValueWithNullArg2() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(new Constant(2.0), null);
        op.computeValue(null);
    }

    @Test
    public void testComputeValueWithNaN() {
        Constant arg1 = new Constant(Double.NaN);
        Constant arg2 = new Constant(1.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValueWithInfinity() {
        Constant arg1 = new Constant(Double.NEGATIVE_INFINITY);
        Constant arg2 = new Constant(Double.POSITIVE_INFINITY);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueExceptionForNonNumericString() {
        Constant arg1 = new Constant("abc");
        Constant arg2 = new Constant(1.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        try {
            Object result = op.computeValue(null);
            assertEquals(Boolean.FALSE, result);
        } catch (Exception e) {
            assertNotNull(e);
        }
    }
}