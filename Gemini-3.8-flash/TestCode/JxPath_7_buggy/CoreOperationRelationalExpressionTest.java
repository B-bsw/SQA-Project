package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Test;

public class CoreOperationRelationalExpressionTest {

    private static class ConcreteRelationalExpression extends CoreOperationRelationalExpression {

        public ConcreteRelationalExpression(Expression[] args) {
            super(args);
        }

        public Object computeValue(EvalContext context) {
            return Boolean.TRUE;
        }

        public String getSymbol() {
            return ">";
        }

        public int testGetPrecedence() {
            return super.getPrecedence();
        }

        public boolean testIsSymmetric() {
            return super.isSymmetric();
        }
    }

    private static class DummyExpression extends Expression {
        public boolean isContextDependent() {
            return false;
        }

        public Object computeValue(EvalContext context) {
            return null;
        }

        public Object compute(EvalContext context) {
            return null;
        }
    }

    @Test
    public void getPrecedence_givenDefaultInstance_shouldReturnThree() {
        // Arrange
        Expression[] args = new Expression[0];
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(args);

        // Act
        int precedence = expr.testGetPrecedence();

        // Assert
        assertEquals(3, precedence);
    }

    @Test
    public void isSymmetric_givenDefaultInstance_shouldReturnFalse() {
        // Arrange
        Expression[] args = new Expression[0];
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(args);

        // Act
        boolean symmetric = expr.testIsSymmetric();

        // Assert
        assertFalse(symmetric);
    }

    @Test
    public void constructor_givenNullArgs_shouldInstantiateSuccessfully() {
        // Arrange & Act
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(null);

        // Assert
        assertNotNull(expr);
        assertEquals(3, expr.testGetPrecedence());
        assertFalse(expr.testIsSymmetric());
    }

    @Test
    public void constructor_givenEmptyArgs_shouldInstantiateSuccessfully() {
        // Arrange
        Expression[] args = new Expression[0];

        // Act
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(args);

        // Assert
        assertNotNull(expr);
        assertEquals(3, expr.testGetPrecedence());
        assertFalse(expr.testIsSymmetric());
    }

    @Test
    public void constructor_givenValidArgs_shouldInstantiateSuccessfully() {
        // Arrange
        Expression arg1 = new DummyExpression();
        Expression arg2 = new DummyExpression();
        Expression[] args = new Expression[] { arg1, arg2 };

        // Act
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(args);

        // Assert
        assertNotNull(expr);
        assertNotNull(expr.getArguments());
        assertEquals(2, expr.getArguments().length);
        assertSame(arg1, expr.getArguments()[0]);
        assertSame(arg2, expr.getArguments()[1]);
        assertEquals(3, expr.testGetPrecedence());
        assertFalse(expr.testIsSymmetric());
    }
}