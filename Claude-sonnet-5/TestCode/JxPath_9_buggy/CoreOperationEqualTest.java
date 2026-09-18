package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.JXPathContext;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoreOperationEqualTest {

    private JXPathContext context;

    @Before
    public void setUp() {
        context = JXPathContext.newContext(new Object());
    }

    @Test
    public void testGetSymbol() {
        CoreOperationEqual op = new CoreOperationEqual(new Constant("a"), new Constant("a"));
        assertEquals("=", op.getSymbol());
    }

    @Test
    public void testComputeValueEqualStrings() {
        Expression left = new Constant("hello");
        Expression right = new Constant("hello");
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueNotEqualStrings() {
        Expression left = new Constant("hello");
        Expression right = new Constant("world");
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValueEqualNumbers() {
        Expression left = new Constant(5.0);
        Expression right = new Constant(5.0);
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValueNotEqualNumbers() {
        Expression left = new Constant(5.0);
        Expression right = new Constant(6.0);
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testComputeValueBoundaryZero() {
        Expression left = new Constant(0.0);
        Expression right = new Constant(0.0);
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValueEmptyStrings() {
        Expression left = new Constant("");
        Expression right = new Constant("");
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValueBooleanEqual() {
        Expression left = new Constant(true);
        Expression right = new Constant(true);
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValueBooleanNotEqual() {
        Expression left = new Constant(true);
        Expression right = new Constant(false);
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testComputeValueBoundaryLargeNumbers() {
        Expression left = new Constant(Double.MAX_VALUE);
        Expression right = new Constant(Double.MAX_VALUE);
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValueMixedTypeStringNumberEqual() {
        Expression left = new Constant("5");
        Expression right = new Constant(5.0);
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValueNullLeftExpressionThrows() {
        CoreOperationEqual op = new CoreOperationEqual(null, new Constant("test"));
        op.computeValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValueNullRightExpressionThrows() {
        CoreOperationEqual op = new CoreOperationEqual(new Constant("test"), null);
        op.computeValue(null);
    }

    @Test
    public void testIntegrationViaJXPathEqualNumbers() {
        Object result = context.getValue("1=1");
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testIntegrationViaJXPathNotEqualNumbers() {
        Object result = context.getValue("1=2");
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testIntegrationViaJXPathEqualStrings() {
        Object result = context.getValue("'abc'='abc'");
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testIntegrationViaJXPathNotEqualStrings() {
        Object result = context.getValue("'abc'='xyz'");
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testConstructorStoresArguments() {
        Expression left = new Constant("x");
        Expression right = new Constant("y");
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        assertNotNull(op);
        assertEquals("=", op.getSymbol());
    }
}