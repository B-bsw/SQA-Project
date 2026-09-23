package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.model.NodePointer;

import java.util.Collections;

public class CoreOperationLessThanTest {

    private CoreOperationLessThan op;

    @Before
    public void setUp() {
        // No initialization needed for basic tests
    }

    @After
    public void tearDown() {
        op = null;
    }

    @Test
    public void testComputeValueNormalLessThan() {
        Expression left = new Constant("5");
        Expression right = new Constant("10");
        op = new CoreOperationLessThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueNormalGreaterThan() {
        Expression left = new Constant("10");
        Expression right = new Constant("5");
        op = new CoreOperationLessThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValueEqualValues() {
        Expression left = new Constant("7");
        Expression right = new Constant("7");
        op = new CoreOperationLessThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValueNegativeNumbers() {
        Expression left = new Constant("-3");
        Expression right = new Constant("2");
        op = new CoreOperationLessThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueDecimalNumbers() {
        Expression left = new Constant("1.5");
        Expression right = new Constant("1.6");
        op = new CoreOperationLessThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueWithContext() {
        Expression left = new Constant("4");
        Expression right = new Constant("4.0001");
        op = new CoreOperationLessThan(left, right);
        EvalContext context = new MockEvalContext();
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueWithNodeExpressions() {
        Expression left = new MockNodeExpression("3");
        Expression right = new MockNodeExpression("9");
        op = new CoreOperationLessThan(left, right);
        EvalContext context = new MockEvalContext();
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueWithNullArgs() {
        Expression left = new Constant(null);
        Expression right = new Constant("5");
        op = new CoreOperationLessThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result); // Double.valueOf(null) -> 0.0 < 5.0
    }

    @Test
    public void testComputeValueWithBothNull() {
        Expression left = new Constant(null);
        Expression right = new Constant(null);
        op = new CoreOperationLessThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result); // 0.0 < 0.0 is false
    }

    @Test
    public void testComputeValueStringNumbers() {
        Expression left = new Constant("12");
        Expression right = new Constant("13");
        op = new CoreOperationLessThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueBooleanValues() {
        Expression left = new Constant("true");
        Expression right = new Constant("false");
        op = new CoreOperationLessThan(left, right);
        Object result = op.computeValue(null);
        // InfoSetUtil.doubleValue("true") -> NaN, doubleValue("false") -> NaN
        // NaN < NaN is false
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testGetSymbol() {
        op = new CoreOperationLessThan(new Constant("1"), new Constant("2"));
        assertEquals("<", op.getSymbol());
    }

    @Test
    public void testComputeValueWithPointerArgs() {
        Expression left = new MockPointerExpression(2.5);
        Expression right = new MockPointerExpression(3.5);
        op = new CoreOperationLessThan(left, right);
        EvalContext context = new MockEvalContext();
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueWithStringPointer() {
        Expression left = new MockPointerExpression("10");
        Expression right = new MockConstantPointer("20");
        op = new CoreOperationLessThan(left, right);
        EvalContext context = new MockEvalContext();
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    // Mock classes
    private static class Constant extends Expression {
        private final Object value;

        public Constant(Object value) {
            this.value = value;
        }

        @Override
        public Object computeValue(EvalContext context) {
            return value;
        }

        @Override
        public String toString() {
            return "Constant(" + value + ")";
        }
    }

    private static class MockNodeExpression extends Expression {
        private final String nodeName;

        public MockNodeExpression(String name) {
            this.nodeName = name;
        }

        @Override
        public Object computeValue(EvalContext context) {
            return nodeName;
        }

        @Override
        public String toString() {
            return "Node(" + nodeName + ")";
        }
    }

    private static class MockPointerExpression extends Expression {
        private final double value;

        public MockPointerExpression(double v) {
            this.value = v;
        }

        public MockPointerExpression(String s) {
            this.value = Double.parseDouble(s);
        }

        @Override
        public Object computeValue(EvalContext context) {
            return value;
        }
    }

    private static class MockConstantPointer extends Expression {
        private final String value;

        public MockConstantPointer(String s) {
            this.value = s;
        }
        // Return pointer wrapper
        @Override
        public Object computeValue(EvalContext context) {
            return new MockPointer(value);
        }
    }

    private static class MockEvalContext extends EvalContext {
        public MockEvalContext() {
            super(null);
        }

        @Override
        public Object getValue() {
            return null;
        }

        @Override
        public int getCurrentPosition() {
            return 0;
        }

        @Override
        public boolean nextNode() {
            return false;
        }

        @Override
        public boolean nextSet() {
            return false;
        }

        @Override
        public Pointer getContextNodePointer() {
            return null;
        }

        @Override
        public Pointer getContextNodeIterator() {
            return null;
        }

        @Override
        public void reset() {
        }

        @Override
        public void setPosition(int position) {
        }
    }

    private static class MockPointer implements Pointer {
        private final Object value;

        public MockPointer(Object v) {
            this.value = v;
        }

        @Override
        public Object getValue() {
            return value;
        }

        @Override
        public void setValue(Object value) {
        }

        @Override
        public Object getNode() {
            return null;
        }

        @Override
        public Pointer clone() {
            return this;
        }

        @Override
        public Pointer asPath() {
            return this;
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }

    @Test
    public void testComputeValueWithInfinitySequence() {
        // Test multiple operations to cover loop in computeValue
        Expression left = new Constant("1");
        Expression right = new Constant("2");
        op = new CoreOperationLessThan(left, right);
        for (int i = 0; i < 3; i++) {
            Object result = op.computeValue(null);
            assertEquals(Boolean.TRUE, result);
        }
    }
}