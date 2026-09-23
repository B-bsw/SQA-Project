package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class CoreOperationRelationalExpressionTest {

    private static class TestableCoreOperationRelationalExpression extends CoreOperationRelationalExpression {
        TestableCoreOperationRelationalExpression(Expression[] args) {
            super(args);
        }

        @Override
        public Object computeValue(Object context) {
            return null;
        }

        @Override
        protected boolean isSymmetric() {
            return super.isSymmetric();
        }
    }

    private TestableCoreOperationRelationalExpression expression;

    @Before
    public void setUp() {
        expression = new TestableCoreOperationRelationalExpression(new Expression[0]);
    }

    @After
    public void tearDown() {
        expression = null;
    }

    @Test
    public void testGetPrecedence() {
        Assert.assertEquals(3, expression.getPrecedence());
    }

    @Test
    public void testIsSymmetric() {
        Assert.assertFalse(expression.isSymmetric());
    }

    @Test
    public void testGetPrecedenceWithNullArgs() {
        TestableCoreOperationRelationalExpression expr = new TestableCoreOperationRelationalExpression(null);
        Assert.assertEquals(3, expr.getPrecedence());
    }

    @Test
    public void testIsSymmetricWithNullArgs() {
        TestableCoreOperationRelationalExpression expr = new TestableCoreOperationRelationalExpression(null);
        Assert.assertFalse(expr.isSymmetric());
    }

    @Test
    public void testConstructorWithValidArgs() {
        Expression[] args = new Expression[]{new org.apache.commons.jxpath.ri.compiler.Expression() {
            @Override
            public Object computeValue(Object context) {
                return null;
            }
        }};
        TestableCoreOperationRelationalExpression expr = new TestableCoreOperationRelationalExpression(args);
        Assert.assertNotNull(expr);
    }

    @Test
    public void testConstructorWithNullArgs() {
        TestableCoreOperationRelationalExpression expr = new TestableCoreOperationRelationalExpression(null);
        Assert.assertNotNull(expr);
    }

    @Test
    public void testConstructorWithEmptyArgs() {
        TestableCoreOperationRelationalExpression expr = new TestableCoreOperationRelationalExpression(new Expression[0]);
        Assert.assertNotNull(expr);
    }

    @Test
    public void testGetPrecedenceStable() {
        Assert.assertEquals(3, expression.getPrecedence());
        Assert.assertEquals(3, expression.getPrecedence());
    }

    @Test
    public void testIsSymmetricStable() {
        Assert.assertFalse(expression.isSymmetric());
        Assert.assertFalse(expression.isSymmetric());
    }
}