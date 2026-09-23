package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Before;
import org.junit.Test;

public class CoreOperationRelationalExpressionTest {

    private static class TestRelationalExpression extends CoreOperationRelationalExpression {
        private final boolean result;

        public TestRelationalExpression(boolean result, Expression[] args) {
            super(args);
            this.result = result;
        }

        @Override
        protected boolean evaluateCompare(int compare) {
            return result;
        }
    }

    private static class TestExpression implements Expression {
        private final Object value;

        public TestExpression(Object value) {
            this.value = value;
        }

        @Override
        public Object compute(EvalContext context) {
            return value;
        }

        @Override
        public Object computeValue(EvalContext context) {
            return value;
        }

        @Override
        public boolean isContextDependent() {
            return false;
        }
    }

    private static class TestEvalContext implements EvalContext {
        private final Object value;

        public TestEvalContext(Object value) {
            this.value = value;
        }

        @Override
        public Object getSingleNodePointer() {
            return null;
        }

        @Override
        public Object getCurrentNodePointer() {
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
        public boolean jump(int position) {
            return false;
        }

        @Override
        public Object getValue() {
            return value;
        }

        @Override
        public int getPosition() {
            return 0;
        }

        @Override
        public int getCurrentPosition() {
            return 0;
        }

        @Override
        public boolean setPosition(int position) {
            return false;
        }

        @Override
        public boolean isNode() {
            return false;
        }

        @Override
        public boolean isCollection() {
            return false;
        }

        @Override
        public Iterator createIterator() {
            return null;
        }

        @Override
        public boolean isContext() {
            return true;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    private Expression[] createArgs(Object left, Object right) {
        return new Expression[] { new TestExpression(left), new TestExpression(right) };
    }

    @Test
    public void testComputeValueWithPrimitives() {
        CoreOperationRelationalExpression expr = new TestRelationalExpression(true, createArgs(10, 20));
        assertEquals(Boolean.TRUE, expr.computeValue(new TestEvalContext(null)));

        expr = new TestRelationalExpression(false, createArgs("a", "b"));
        assertEquals(Boolean.FALSE, expr.computeValue(new TestEvalContext(null)));
    }

    @Test
    public void testComputeValueWithNullValues() {
        CoreOperationRelationalExpression expr = new TestRelationalExpression(true, createArgs(null, null));
        assertEquals(Boolean.TRUE, expr.computeValue(new TestEvalContext(null)));
    }

    @Test
    public void testComputeValueWithIterators() {
        List<String> leftList = Arrays.asList("a", "b", "c");
        List<String> rightList = Arrays.asList("x", "b", "y");
        Iterator leftIt = leftList.iterator();
        Iterator rightIt = rightList.iterator();
        CoreOperationRelationalExpression expr = new TestRelationalExpression(true, createArgs(leftIt, rightIt));
        assertEquals(Boolean.TRUE, expr.computeValue(new TestEvalContext(null)));

        leftIt = leftList.iterator();
        rightIt = new ArrayList<String>().iterator();
        expr = new TestRelationalExpression(true, createArgs(leftIt, rightIt));
        assertEquals(Boolean.FALSE, expr.computeValue(new TestEvalContext(null)));
    }

    @Test
    public void testComputeValueWithIteratorAndValue() {
        List<String> leftList = Arrays.asList("a", "b");
        Iterator leftIt = leftList.iterator();
        CoreOperationRelationalExpression expr = new TestRelationalExpression(true, createArgs(leftIt, "b"));
        assertEquals(Boolean.TRUE, expr.computeValue(new TestEvalContext(null)));
    }

    @Test
    public void testComputeValueWithInitialContext() {
        InitialContext leftContext = new InitialContext(new TestEvalContext("value"));
        CoreOperationRelationalExpression expr = new TestRelationalExpression(true, createArgs(leftContext, "value"));
        assertEquals(Boolean.TRUE, expr.computeValue(new TestEvalContext(null)));
    }

    @Test
    public void testGetPrecedence() {
        CoreOperationRelationalExpression expr = new TestRelationalExpression(true, createArgs(1, 2));
        assertEquals(3, expr.getPrecedence());
    }

    @Test
    public void testIsSymmetric() {
        CoreOperationRelationalExpression expr = new TestRelationalExpression(true, createArgs(1, 2));
        assertFalse(expr.isSymmetric());
    }

    @Test
    public void testComputeValueWithCollections() {
        Collection<String> leftCollection = new HashSet<String>(Arrays.asList("a", "b"));
        Collection<String> rightCollection = new HashSet<String>(Arrays.asList("b", "c"));
        CoreOperationRelationalExpression expr = new TestRelationalExpression(true, createArgs(leftCollection, rightCollection));
        assertEquals(Boolean.TRUE, expr.computeValue(new TestEvalContext(null)));
    }

    @Test
    public void testComputeValueWithDoubleValues() {
        CoreOperationRelationalExpression expr = new TestRelationalExpression(true, createArgs(1.5, 2.5));
        assertEquals(Boolean.TRUE, expr.computeValue(new TestEvalContext(null)));

        expr = new TestRelationalExpression(false, createArgs(1, 2));
        assertEquals(Boolean.FALSE, expr.computeValue(new TestEvalContext(null)));
    }

    @Test
    public void testComputeValueWithIteratorAndInitialContext() {
        InitialContext leftContext = new InitialContext(new TestEvalContext("a"));
        List<String> rightList = new ArrayList<String>(Arrays.asList("a", "b"));
        CoreOperationRelationalExpression expr = new TestRelationalExpression(true, createArgs(leftContext, rightList.iterator()));
        assertEquals(Boolean.TRUE, expr.computeValue(new TestEvalContext(null)));
    }

    @Test
    public void testComputeValueWithNoMatchInIterators() {
        List<String> leftList = Arrays.asList("x", "y");
        List<String> rightList = Arrays.asList("a", "b");
        CoreOperationRelationalExpression expr = new TestRelationalExpression(false, createArgs(leftList.iterator(), rightList.iterator()));
        assertEquals(Boolean.FALSE, expr.computeValue(new TestEvalContext(null)));
    }

    @Test
    public void testComputeValueWithSelfContext() {
        SelfContext selfContext = new SelfContext(new TestEvalContext("test")); // Assuming SelfContext can be constructed similarly
        CoreOperationRelationalExpression expr = new TestRelationalExpression(true, createArgs(selfContext, "test"));
        assertEquals(Boolean.TRUE, expr.computeValue(new TestEvalContext(null)));
    }
}