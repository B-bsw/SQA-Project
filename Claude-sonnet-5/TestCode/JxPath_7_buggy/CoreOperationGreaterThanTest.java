package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoreOperationGreaterThanTest {

    @Test
    public void testGreaterThanTrue() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Constant(5), new Constant(3));
        assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testGreaterThanFalseWhenLeftSmaller() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Constant(3), new Constant(5));
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testEqualValuesReturnsFalse() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Constant(5), new Constant(5));
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testNegativeNumbers() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Constant(-1), new Constant(-5));
        assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testZeroBoundary() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Constant(0), new Constant(0));
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testEmptyStringOperand() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Constant(""), new Constant(0));
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testNonNumericStringOperand() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Constant("abc"), new Constant(5));
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testLargeNumbers() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Constant(1000000), new Constant(999999));
        assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testGetSymbol() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Constant(1), new Constant(2));
        assertEquals(">", expr.getSymbol());
    }

    @Test
    public void testStringNumericComparison() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Constant("10"), new Constant("5"));
        assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testStringNumericComparisonFalse() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Constant("5"), new Constant("10"));
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }
}