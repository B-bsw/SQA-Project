package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * JUnit test suite for {@link CoreOperationLessThan}.
 */
public class CoreOperationLessThanTest {

    // ---------- Normal cases ----------

    @Test
    public void testComputeValue_LeftLessThanRight_ReturnsTrue() {
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant(1), new Constant(2));
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_LeftGreaterThanRight_ReturnsFalse() {
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant(3), new Constant(2));
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_NegativeNumbers_LeftLessThanRight_ReturnsTrue() {
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant(-5), new Constant(-1));
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_StringNumbers_ParsedCorrectly_ReturnsTrue() {
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant("2"), new Constant("3"));
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_BooleanValues_TrueLessThanFalse_ReturnsFalse() {
        // true -> 1, false -> 0 ; 1 < 0 is false
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant(true), new Constant(false));
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_BooleanValues_FalseLessThanTrue_ReturnsTrue() {
        // false -> 0, true -> 1 ; 0 < 1 is true
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant(false), new Constant(true));
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    // ---------- Boundary cases ----------

    @Test
    public void testComputeValue_EqualValues_ReturnsFalse() {
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant(5), new Constant(5));
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_ZeroValues_ReturnsFalse() {
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant(0), new Constant(0));
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    // ---------- Null / empty input cases ----------

    @Test
    public void testComputeValue_NullLeftValue_ResultIsFalse() {
        // null is converted to NaN by InfoSetUtil.doubleValue, so NaN < 1 is false
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant((String) null), new Constant(1));
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_NullRightValue_ResultIsFalse() {
        // 1 < NaN is false
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant(1), new Constant((String) null));
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_BothValuesNull_ResultIsFalse() {
        // NaN < NaN is false
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant((String) null), new Constant((String) null));
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_NonNumericStringLeft_ResultIsFalse() {
        // "abc" cannot be parsed as a number -> NaN; NaN < 1 is false
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant("abc"), new Constant(1));
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_NonNumericStringRight_ResultIsFalse() {
        // 1 < NaN is false
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant(1), new Constant("xyz"));
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    // ---------- Exception path cases ----------

    @Test(expected = NullPointerException.class)
    public void testComputeValue_NullLeftExpression_ThrowsNullPointerException() {
        CoreOperationLessThan op = new CoreOperationLessThan(null, new Constant(1));
        op.computeValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_NullRightExpression_ThrowsNullPointerException() {
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant(1), null);
        op.computeValue(null);
    }

    // ---------- getSymbol() ----------

    @Test
    public void testGetSymbol_ReturnsLessThanSign() {
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant(1), new Constant(2));
        String symbol = op.getSymbol();
        assertNotNull(symbol);
        assertEquals("<", symbol);
    }

    // ---------- Additional coverage: multiple invocations (loop-like usage) ----------

    @Test
    public void testComputeValue_MultipleInvocations_ConsistentResults() {
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant(1), new Constant(10));
        for (int i = 0; i < 5; i++) {
            Object result = op.computeValue(null);
            assertTrue((Boolean) result);
        }
    }

    @Test
    public void testComputeValue_MultipleInvocations_FalseCaseConsistent() {
        CoreOperationLessThan op = new CoreOperationLessThan(new Constant(10), new Constant(1));
        for (int i = 0; i < 3; i++) {
            Object result = op.computeValue(null);
            assertFalse((Boolean) result);
        }
    }
}