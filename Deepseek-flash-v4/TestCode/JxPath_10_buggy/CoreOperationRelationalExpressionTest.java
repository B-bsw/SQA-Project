package org.apache.commons.jxpath.ri.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoreOperationRelationalExpressionTest {

    private static class TestRelationalExpression extends CoreOperationRelationalExpression {
        private final int comparisonResult;

        public TestRelationalExpression(int comparisonResult, Expression... args) {
            super(args);
            this.comparisonResult = comparisonResult;
        }

        public TestRelationalExpression(int comparisonResult, Expression left, Expression right) {
            super(new Expression[]{left, right});
            this.comparisonResult = comparisonResult;
        }

        @Override
        protected boolean evaluateCompare(int compare) {
            return compare == comparisonResult;
        }

        @Override
        public String getSymbol() {
            return "testRel";
        }
    }

    private static class ConstantExpression extends Expression {
        private final Object value;

        public ConstantExpression(Object value) {
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

    private static class MockEvalContext implements EvalContext {
        private final Object value;
        private final boolean isCollection;

        public MockEvalContext(Object value, boolean isCollection) {
            this.value = value;
            this.isCollection = isCollection;
        }

        @Override
        public Pointer getSingleNodePointer() {
            return null;
        }

        @Override
        public boolean nextNode() {
            return false;
        }

        @Override
        public Object getValue() {
            return value;
        }

        @Override
        public boolean isCollection() {
            return isCollection;
        }

        @Override
        public Iterator getCurrentNodeIterator() {
            return null;
        }

        @Override
        public Object getCurrentNodePointer() {
            return null;
        }

        @Override
        public void reset() {
        }
    }

    private static class MockInitialContext extends InitialContext {
        private boolean resetCalled = false;

        public MockInitialContext() {
            super(null, null);
        }

        @Override
        public void reset() {
            resetCalled = true;
        }

        public boolean isResetCalled() {
            return resetCalled;
        }
    }

    private static class MockSelfContext extends SelfContext {
        private final Object value;

        public MockSelfContext(Object value) {
            super(null, null);
            this.value = value;
        }

        @Override
        public Object getSingleNodePointer() {
            if (value instanceof NodePointer) {
                return value;
            }
            return new MockNodePointer(value);
        }
    }

    private static class MockNodePointer extends NodePointer {
        private final Object value;

        public MockNodePointer(Object value) {
            super(null);
            this.value = value;
        }

        @Override
        public Object getValue() {
            return value;
        }

        @Override
        public Object getNode() {
            return value;
        }

        @Override
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }

        @Override
        public boolean isLeaf() {
            return true;
        }

        @Override
        public boolean isActual() {
            return false;
        }

        @Override
        public boolean isCollection() {
            return false;
        }

        @Override
        public int getLength() {
            return 0;
        }
    }

    private EvalContext context;

    @Before
    public void setUp() {
        context = new MockEvalContext(null, false);
    }

    @After
    public void tearDown() {
        context = null;
    }

    @Test
    public void testComputeValueTrue() {
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(5), new ConstantExpression(5));
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeValueFalse() {
        TestRelationalExpression expr = new TestRelationalExpression(1,
                new ConstantExpression(5), new ConstantExpression(5));
        assertEquals(Boolean.FALSE, expr.computeValue(context));
    }

    @Test
    public void testGetPrecedence() {
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(1), new ConstantExpression(2));
        assertEquals(3, expr.getPrecedence());
    }

    @Test
    public void testIsSymmetric() {
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(1), new ConstantExpression(2));
        assertFalse(expr.isSymmetric());
    }

    @Test
    public void testComputeWithInitialContextLeft() {
        MockInitialContext left = new MockInitialContext();
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(left), new ConstantExpression(1));
        assertEquals(Boolean.FALSE, expr.computeValue(context));
        assertTrue(left.isResetCalled());
    }

    @Test
    public void testComputeWithInitialContextRight() {
        MockInitialContext right = new MockInitialContext();
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(1), new ConstantExpression(right));
        assertEquals(Boolean.FALSE, expr.computeValue(context));
        assertTrue(right.isResetCalled());
    }

    @Test
    public void testComputeWithNaNLeft() {
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(Double.NaN), new ConstantExpression(5));
        assertEquals(Boolean.FALSE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithNaNRight() {
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(5), new ConstantExpression(Double.NaN));
        assertEquals(Boolean.FALSE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithIteratorLeft() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(list.iterator()), new ConstantExpression(3));
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithIteratorRight() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(2), new ConstantExpression(list.iterator()));
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithBothIterators() {
        List<Integer> left = Arrays.asList(1, 2, 3);
        List<Integer> right = Arrays.asList(3, 4, 5);
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(left.iterator()), new ConstantExpression(right.iterator()));
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithBothIteratorsNoMatch() {
        List<Integer> left = Arrays.asList(1, 2, 3);
        List<Integer> right = Arrays.asList(4, 5, 6);
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(left.iterator()), new ConstantExpression(right.iterator()));
        assertEquals(Boolean.FALSE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithEmptyIterators() {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(left.iterator()), new ConstantExpression(right.iterator()));
        assertEquals(Boolean.FALSE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithCollection() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(list), new ConstantExpression(20));
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithSelfContext() {
        MockSelfContext left = new MockSelfContext(5);
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(left), new ConstantExpression(5));
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithBothEqualIntegers() {
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(5), new ConstantExpression(5));
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithLeftLessThanRight() {
        TestRelationalExpression expr = new TestRelationalExpression(-1,
                new ConstantExpression(3), new ConstantExpression(5));
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithLeftGreaterThanRight() {
        TestRelationalExpression expr = new TestRelationalExpression(1,
                new ConstantExpression(7), new ConstantExpression(5));
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithStringNumbers() {
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression("5"), new ConstantExpression(5));
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithNonComparableMixedTypes() {
        TestRelationalExpression expr = new TestRelationalExpression(1,
                new ConstantExpression("abc"), new ConstantExpression(5));
        // DoubleValue of "abc" is NaN, return false
        assertEquals(Boolean.FALSE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithNullLeft() {
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(null), new ConstantExpression(5));
        // DoubleValue(null) = 0.0, might be true depending on compare
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithNullRight() {
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(5), new ConstantExpression(null));
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithBooleanTrue() {
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(Boolean.TRUE), new ConstantExpression(1));
        // DoubleValue(Boolean.TRUE) = 1.0
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithBooleanFalse() {
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(Boolean.FALSE), new ConstantExpression(0));
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithEmptyCollection() {
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(new ArrayList<Object>()), new ConstantExpression(1));
        assertEquals(Boolean.FALSE, expr.computeValue(context));
    }

    @Test
    public void testReduceWithSelfContext() {
        // Direct test via compute with SelfContext wrapping different values
        MockSelfContext sc = new MockSelfContext("hello");
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(sc), new ConstantExpression(0));
        // DoubleValue("hello") is NaN, so false
        assertEquals(Boolean.FALSE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithIteratorContainingNaN() {
        List<Double> list = new ArrayList<>();
        list.add(Double.NaN);
        list.add(1.0);
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(list.iterator()), new ConstantExpression(1.0));
        assertEquals(Boolean.TRUE, expr.computeValue(context));
    }

    @Test
    public void testComputeWithIteratorAllNaN() {
        List<Double> list = new ArrayList<>();
        list.add(Double.NaN);
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(list.iterator()), new ConstantExpression(1.0));
        assertEquals(Boolean.FALSE, expr.computeValue(context));
    }

    @Test
    public void testFindMatchWithLeftEmpty() {
        List<Integer> right = Arrays.asList(1, 2, 3);
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(new ArrayList<Integer>().iterator()), new ConstantExpression(right.iterator()));
        assertEquals(Boolean.FALSE, expr.computeValue(context));
    }

    @Test
    public void testFindMatchWithRightEmpty() {
        List<Integer> left = Arrays.asList(1, 2, 3);
        TestRelationalExpression expr = new TestRelationalExpression(0,
                new ConstantExpression(left.iterator()), new ConstantExpression(new ArrayList<Integer>().iterator()));
        assertEquals(Boolean.FALSE, expr.computeValue(context));
    }
}