package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.junit.Before;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class CoreOperationGreaterThanOrEqualTest {

    private EvalContext context;
    private JXPathContext jxpathContext;

    @Before
    public void setUp() {
        jxpathContext = JXPathContext.newContext(new Object());
        context = new TestEvalContext(jxpathContext);
    }

    // Test: computeValue with two double values, true case
    @Test
    public void testComputeValueDoubleGreaterThanOrEqualTrue() {
        Expression left = new ConstantExpression(5.0);
        Expression right = new ConstantExpression(3.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    // Test: computeValue with two double values, false case
    @Test
    public void testComputeValueDoubleGreaterThanOrEqualFalse() {
        Expression left = new ConstantExpression(3.0);
        Expression right = new ConstantExpression(5.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(Boolean.FALSE, op.computeValue(context));
    }

    // Test: boundary equal values
    @Test
    public void testComputeValueEqual() {
        Expression left = new ConstantExpression(5.0);
        Expression right = new ConstantExpression(5.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    // Test: null value handling - use null constant
    @Test
    public void testComputeValueNull() {
        Expression left = new ConstantExpression(null);
        Expression right = new ConstantExpression(0.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    // Test: string representation of numbers
    @Test
    public void testComputeValueStringNumbers() {
        Expression left = new ConstantExpression("10.5");
        Expression right = new ConstantExpression("10.5");
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    // Test: getSymbol method
    @Test
    public void testGetSymbol() {
        Expression left = new ConstantExpression(1.0);
        Expression right = new ConstantExpression(2.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(">=", op.getSymbol());
    }

    // Test: computation with expression that returns non-double (e.g., boolean)
    @Test
    public void testComputeValueBooleanInputs() {
        Expression left = new ConstantExpression(Boolean.TRUE); // true evaluates to 1.0
        Expression right = new ConstantExpression(1.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(context));
        
        Expression left2 = new ConstantExpression(Boolean.FALSE); // false evaluates to 0.0
        Expression right2 = new ConstantExpression(1.0);
        CoreOperationGreaterThanOrEqual op2 = new CoreOperationGreaterThanOrEqual(left2, right2);
        assertEquals(Boolean.FALSE, op2.computeValue(context));
    }

    // Test: with NaN (not a number)
    @Test
    public void testComputeValueNaN() {
        Expression left = new ConstantExpression(Double.NaN);
        Expression right = new ConstantExpression(5.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(Boolean.FALSE, op.computeValue(context));
    }

    // Test: with Infinity
    @Test
    public void testComputeValueInfinity() {
        Expression left = new ConstantExpression(Double.POSITIVE_INFINITY);
        Expression right = new ConstantExpression(5.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(context));
        
        Expression left2 = new ConstantExpression(Double.NEGATIVE_INFINITY);
        Expression right2 = new ConstantExpression(5.0);
        CoreOperationGreaterThanOrEqual op2 = new CoreOperationGreaterThanOrEqual(left2, right2);
        assertEquals(Boolean.FALSE, op2.computeValue(context));
    }

    // Test: constructor with two arguments (already tested via above, but check args)
    @Test
    public void testConstructorAndArguments() {
        Expression left = new ConstantExpression(1.0);
        Expression right = new ConstantExpression(2.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(2, op.getArguments().length);
        assertSame(left, op.getArguments()[0]);
        assertSame(right, op.getArguments()[1]);
    }

    // Test edge: extremely large numbers
    @Test
    public void testComputeValueHugeNumbers() {
        Expression left = new ConstantExpression(1e308);
        Expression right = new ConstantExpression(1e308);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    // Test edge: negative numbers
    @Test
    public void testComputeValueNegativeNumbers() {
        Expression left = new ConstantExpression(-5.0);
        Expression right = new ConstantExpression(-10.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    // Test: computeValue with zero
    @Test
    public void testComputeValueZero() {
        Expression left = new ConstantExpression(0.0);
        Expression right = new ConstantExpression(0.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    // Test: computeValue with negative zero
    @Test
    public void testComputeValueNegativeZero() {
        Expression left = new ConstantExpression(-0.0);
        Expression right = new ConstantExpression(0.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    // Helper classes
    private static class ConstantExpression extends Expression {
        private final Object value;

        public ConstantExpression(Object value) {
            this.value = value;
        }

        @Override
        public Object computeValue(EvalContext context) {
            return value;
        }
    }

    private static class TestEvalContext extends EvalContext {
        public TestEvalContext(JXPathContext context) {
            super(context);
        }

        @Override
        public Pointer getSingleNodePointer() {
            return null;
        }

        @Override
        public Object getValue() {
            return null;
        }

        @Override
        public Pointer getPointer() {
            return null;
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
        public boolean setValue(Object value) {
            return false;
        }

        @Override
        public int getCurrentPosition() {
            return 0;
        }

        @Override
        public boolean setPosition(int position) {
            return false;
        }
    }
}