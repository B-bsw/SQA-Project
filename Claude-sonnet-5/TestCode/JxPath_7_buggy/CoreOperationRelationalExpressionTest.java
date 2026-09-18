package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Test;

public class CoreOperationRelationalExpressionTest {

    /**
     * Simple concrete Expression implementation used as a leaf node
     * for building test expression trees.
     */
    static class DummyExpression extends Expression {
        private final Object value;
        private final boolean contextDependent;

        DummyExpression(Object value) {
            this(value, false);
        }

        DummyExpression(Object value, boolean contextDependent) {
            this.value = value;
            this.contextDependent = contextDependent;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }

        public boolean isContextDependent() {
            return contextDependent;
        }

        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * Minimal concrete subclass of the class under test.
     */
    static class TestRelationalExpression extends CoreOperationRelationalExpression {
        TestRelationalExpression(Expression[] args) {
            super(args);
        }

        public Object computeValue(EvalContext context) {
            return Boolean.TRUE;
        }

        protected String getSymbol() {
            return "TEST_OP";
        }
    }

    /**
     * Configurable CoreOperation used to test precedence/parenthesization
     * behavior in the inherited toString() method.
     */
    static class ConfigurablePrecedenceOperation extends CoreOperation {
        private final int precedence;
        private final boolean symmetric;

        ConfigurablePrecedenceOperation(Expression[] args, int precedence, boolean symmetric) {
            super(args);
            this.precedence = precedence;
            this.symmetric = symmetric;
        }

        public Object computeValue(EvalContext context) {
            return null;
        }

        protected String getSymbol() {
            return "OP";
        }

        protected int getPrecedence() {
            return precedence;
        }

        protected boolean isSymmetric() {
            return symmetric;
        }
    }

    // ---------------------------------------------------------------
    // getPrecedence() / isSymmetric() basic contract
    // ---------------------------------------------------------------

    @Test
    public void testGetPrecedenceReturnsThree() {
        Expression[] args = new Expression[] {
                new DummyExpression("a"), new DummyExpression("b")
        };
        TestRelationalExpression expr = new TestRelationalExpression(args);
        assertEquals(3, invokeGetPrecedence(expr));
    }

    @Test
    public void testIsSymmetricReturnsFalse() {
        Expression[] args = new Expression[] {
                new DummyExpression("a"), new DummyExpression("b")
        };
        TestRelationalExpression expr = new TestRelationalExpression(args);
        assertFalse(invokeIsSymmetric(expr));
    }

    // ---------------------------------------------------------------
    // constructor / getArguments() - normal, boundary, null
    // ---------------------------------------------------------------

    @Test
    public void testConstructorStoresArgumentsNormalCase() {
        Expression a = new DummyExpression("1");
        Expression b = new DummyExpression("2");
        Expression[] args = new Expression[] { a, b };
        TestRelationalExpression expr = new TestRelationalExpression(args);
        assertNotNull(expr.getArguments());
        assertEquals(2, expr.getArguments().length);
        assertEquals(a, expr.getArguments()[0]);
        assertEquals(b, expr.getArguments()[1]);
    }

    @Test
    public void testConstructorWithEmptyArgsArray() {
        Expression[] args = new Expression[0];
        TestRelationalExpression expr = new TestRelationalExpression(args);
        assertNotNull(expr.getArguments());
        assertEquals(0, expr.getArguments().length);
        // toString on empty args should produce empty string, no exception
        assertEquals("", expr.toString());
    }

    @Test
    public void testConstructorWithNullArgsThrowsOnUsage() {
        TestRelationalExpression expr = new TestRelationalExpression(null);
        try {
            expr.toString();
            fail("Expected NullPointerException when args array is null");
        }
        catch (NullPointerException e) {
            // expected exception path
            assertTrue(true);
        }
    }

    // ---------------------------------------------------------------
    // toString() behavior - single arg branch (parenthesization logic)
    // ---------------------------------------------------------------

    @Test
    public void testToStringSingleArgWithLowerPrecedenceGetsParenthesized() {
        Expression inner = new ConfigurablePrecedenceOperation(
                new Expression[] { new DummyExpression("x") }, 2, false);
        Expression[] args = new Expression[] { inner };
        TestRelationalExpression expr = new TestRelationalExpression(args);
        String result = expr.toString();
        assertTrue("Expected parentheses around lower-precedence operand: " + result,
                result.indexOf('(') >= 0 && result.indexOf(')') >= 0);
    }

    @Test
    public void testToStringSingleArgWithHigherPrecedenceNotParenthesized() {
        Expression inner = new ConfigurablePrecedenceOperation(
                new Expression[] { new DummyExpression("x") }, 5, false);
        Expression[] args = new Expression[] { inner };
        TestRelationalExpression expr = new TestRelationalExpression(args);
        String result = expr.toString();
        assertTrue("Did not expect parentheses around higher-precedence operand: " + result,
                result.indexOf('(') < 0 && result.indexOf(')') < 0);
    }

    // ---------------------------------------------------------------
    // toString() behavior - multi arg branch (isSymmetric() always false here)
    // ---------------------------------------------------------------

    @Test
    public void testToStringMultipleArgsUsesSymbolAndDoesNotParenthesizeDueToAsymmetry() {
        Expression inner1 = new ConfigurablePrecedenceOperation(
                new Expression[] { new DummyExpression("a") }, 1, true);
        Expression inner2 = new ConfigurablePrecedenceOperation(
                new Expression[] { new DummyExpression("b") }, 1, true);
        Expression[] args = new Expression[] { inner1, inner2 };
        TestRelationalExpression expr = new TestRelationalExpression(args);
        String result = expr.toString();
        // symbol should appear
        assertTrue(result.indexOf("TEST_OP") >= 0);
        // since isSymmetric() of the outer relational expression is always false,
        // parenthesize is never true for the multi-arg branch
        assertTrue("Did not expect parentheses: " + result,
                result.indexOf('(') < 0 && result.indexOf(')') < 0);
    }

    @Test
    public void testToStringMultipleArgsThreeElements() {
        Expression a = new DummyExpression("a");
        Expression b = new DummyExpression("b");
        Expression c = new DummyExpression("c");
        Expression[] args = new Expression[] { a, b, c };
        TestRelationalExpression expr = new TestRelationalExpression(args);
        String result = expr.toString();
        assertTrue(result.indexOf("a") >= 0);
        assertTrue(result.indexOf("b") >= 0);
        assertTrue(result.indexOf("c") >= 0);
        // symbol should appear twice for 3 args (between each pair)
        int firstIdx = result.indexOf("TEST_OP");
        int secondIdx = result.indexOf("TEST_OP", firstIdx + 1);
        assertTrue(firstIdx >= 0);
        assertTrue(secondIdx >= 0);
    }

    // ---------------------------------------------------------------
    // isContextDependent() - loop coverage: 0, 1, multiple rounds
    // ---------------------------------------------------------------

    @Test
    public void testIsContextDependentWithZeroArguments() {
        Expression[] args = new Expression[0];
        TestRelationalExpression expr = new TestRelationalExpression(args);
        assertFalse(expr.isContextDependent());
    }

    @Test
    public void testIsContextDependentWithSingleDependentArgument() {
        Expression[] args = new Expression[] { new DummyExpression("a", true) };
        TestRelationalExpression expr = new TestRelationalExpression(args);
        assertTrue(expr.isContextDependent());
    }

    @Test
    public void testIsContextDependentWithSingleNonDependentArgument() {
        Expression[] args = new Expression[] { new DummyExpression("a", false) };
        TestRelationalExpression expr = new TestRelationalExpression(args);
        assertFalse(expr.isContextDependent());
    }

    @Test
    public void testIsContextDependentWithMultipleArgumentsAllFalse() {
        Expression[] args = new Expression[] {
                new DummyExpression("a", false),
                new DummyExpression("b", false),
                new DummyExpression("c", false)
        };
        TestRelationalExpression expr = new TestRelationalExpression(args);
        assertFalse(expr.isContextDependent());
    }

    @Test
    public void testIsContextDependentWithMultipleArgumentsShortCircuitTrue() {
        Expression[] args = new Expression[] {
                new DummyExpression("a", false),
                new DummyExpression("b", true),
                new DummyExpression("c", false)
        };
        TestRelationalExpression expr = new TestRelationalExpression(args);
        assertTrue(expr.isContextDependent());
    }

    // ---------------------------------------------------------------
    // computeValue() / compute() sanity check
    // ---------------------------------------------------------------

    @Test
    public void testComputeValueReturnsExpectedResult() {
        Expression[] args = new Expression[] {
                new DummyExpression("1"), new DummyExpression("2")
        };
        TestRelationalExpression expr = new TestRelationalExpression(args);
        Object result = expr.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    // ---------------------------------------------------------------
    // helper methods to access protected members from same package
    // ---------------------------------------------------------------

    private int invokeGetPrecedence(CoreOperationRelationalExpression expr) {
        return callGetPrecedence(expr);
    }

    private boolean invokeIsSymmetric(CoreOperationRelationalExpression expr) {
        return callIsSymmetric(expr);
    }

    private int callGetPrecedence(CoreOperationRelationalExpression expr) {
        // protected method accessible within the same package
        return getPrecedenceViaSamePackage(expr);
    }

    private boolean callIsSymmetric(CoreOperationRelationalExpression expr) {
        return isSymmetricViaSamePackage(expr);
    }

    private int getPrecedenceViaSamePackage(CoreOperationRelationalExpression expr) {
        return ((AccessibleRelationalExpression) expr).exposeGetPrecedence();
    }

    private boolean isSymmetricViaSamePackage(CoreOperationRelationalExpression expr) {
        return ((AccessibleRelationalExpression) expr).exposeIsSymmetric();
    }

    /**
     * Helper interface implemented by a wrapper subclass to expose protected
     * members for assertion purposes.
     */
    interface AccessibleRelationalExpression {
        int exposeGetPrecedence();
        boolean exposeIsSymmetric();
    }

    static {
        // no-op static block retained for potential future initialization
    }

    // Redefine TestRelationalExpression to also implement the accessor interface
    static class AccessibleTestRelationalExpression extends CoreOperationRelationalExpression
            implements AccessibleRelationalExpression {
        AccessibleTestRelationalExpression(Expression[] args) {
            super(args);
        }

        public Object computeValue(EvalContext context) {
            return Boolean.TRUE;
        }

        protected String getSymbol() {
            return "TEST_OP";
        }

        public int exposeGetPrecedence() {
            return getPrecedence();
        }

        public boolean exposeIsSymmetric() {
            return isSymmetric();
        }
    }
}