package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Test;

public class CoreOperationRelationalExpressionTest {

    // ---- Helper concrete Expression that simply returns a fixed value ----
    private static class ValueExpression extends Expression {
        private final Object value;

        ValueExpression(Object value) {
            this.value = value;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }
    }

    // ---- Concrete subclasses of CoreOperationRelationalExpression ----
    private static class GreaterOp extends CoreOperationRelationalExpression {
        GreaterOp(Expression[] args) {
            super(args);
        }

        protected boolean evaluateCompare(int compare) {
            return compare > 0;
        }
    }

    private static class LessOp extends CoreOperationRelationalExpression {
        LessOp(Expression[] args) {
            super(args);
        }

        protected boolean evaluateCompare(int compare) {
            return compare < 0;
        }
    }

    private static class EqualOp extends CoreOperationRelationalExpression {
        EqualOp(Expression[] args) {
            super(args);
        }

        protected boolean evaluateCompare(int compare) {
            return compare == 0;
        }
    }

    private static class ThrowingOp extends CoreOperationRelationalExpression {
        ThrowingOp(Expression[] args) {
            super(args);
        }

        protected boolean evaluateCompare(int compare) {
            throw new RuntimeException("boom");
        }
    }

    // ---- Helper methods ----
    private static Expression[] args(Object left, Object right) {
        return new Expression[] { new ValueExpression(left), new ValueExpression(right) };
    }

    private static Iterator<Double> iteratorOf(double... vals) {
        List<Double> list = new ArrayList<Double>();
        for (double v : vals) {
            list.add(Double.valueOf(v));
        }
        return list.iterator();
    }

    private static Collection<Double> collectionOf(double... vals) {
        List<Double> list = new ArrayList<Double>();
        for (double v : vals) {
            list.add(Double.valueOf(v));
        }
        return list;
    }

    // ---- Tests for precedence / symmetry ----

    @Test
    public void testGetPrecedence() {
        GreaterOp op = new GreaterOp(args(Double.valueOf(1), Double.valueOf(1)));
        assertEquals(3, op.getPrecedence());
    }

    @Test
    public void testIsSymmetric() {
        GreaterOp op = new GreaterOp(args(Double.valueOf(1), Double.valueOf(1)));
        assertFalse(op.isSymmetric());
    }

    // ---- Basic numeric comparisons ----

    @Test
    public void testGreaterTrueNumeric() {
        GreaterOp op = new GreaterOp(args(Double.valueOf(5.0), Double.valueOf(3.0)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testGreaterFalseNumeric() {
        GreaterOp op = new GreaterOp(args(Double.valueOf(3.0), Double.valueOf(5.0)));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testGreaterEqualNumericIsFalse() {
        GreaterOp op = new GreaterOp(args(Double.valueOf(3.0), Double.valueOf(3.0)));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLessTrueNumeric() {
        LessOp op = new LessOp(args(Double.valueOf(2.0), Double.valueOf(10.0)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testLessFalseNumeric() {
        LessOp op = new LessOp(args(Double.valueOf(10.0), Double.valueOf(2.0)));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testEqualOperatorTrue() {
        EqualOp op = new EqualOp(args(Double.valueOf(7.0), Double.valueOf(7.0)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testEqualOperatorFalse() {
        EqualOp op = new EqualOp(args(Double.valueOf(7.0), Double.valueOf(8.0)));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    // ---- String / Boolean numeric conversion ----

    @Test
    public void testStringNumericValues() {
        GreaterOp op = new GreaterOp(args("10", "5"));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testStringNumericValuesFalse() {
        GreaterOp op = new GreaterOp(args("5", "10"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testBooleanValuesTrueGreaterFalse() {
        GreaterOp op = new GreaterOp(args(Boolean.TRUE, Boolean.FALSE));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testBooleanValuesFalseNotGreaterTrue() {
        GreaterOp op = new GreaterOp(args(Boolean.FALSE, Boolean.TRUE));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    // ---- Boundary values ----

    @Test
    public void testBoundaryExtremeValuesGreaterTrue() {
        GreaterOp op = new GreaterOp(args(Double.valueOf(Double.MAX_VALUE), Double.valueOf(Double.MIN_VALUE)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testBoundaryZeroEqual() {
        EqualOp op = new EqualOp(args(Double.valueOf(0.0), Double.valueOf(0.0)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testBoundaryNegativeNumbers() {
        LessOp op = new LessOp(args(Double.valueOf(-10.0), Double.valueOf(-1.0)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    // ---- Collection reduced to iterator ----

    @Test
    public void testCollectionReducedToIteratorContainsMatchTrue() {
        Collection<Double> leftCollection = collectionOf(1.0, 5.0, 2.0);
        GreaterOp op = new GreaterOp(args(leftCollection, Double.valueOf(3.0)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testCollectionReducedToIteratorContainsMatchFalse() {
        Collection<Double> leftCollection = collectionOf(1.0, 2.0);
        GreaterOp op = new GreaterOp(args(leftCollection, Double.valueOf(30.0)));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    // ---- Left iterator containsMatch branch ----

    @Test
    public void testLeftIteratorContainsMatchTrue() {
        Iterator<Double> leftIterator = iteratorOf(1.0, 5.0, 2.0);
        GreaterOp op = new GreaterOp(args(leftIterator, Double.valueOf(3.0)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testLeftIteratorContainsMatchFalse() {
        Iterator<Double> leftIterator = iteratorOf(1.0, 2.0, 2.5);
        GreaterOp op = new GreaterOp(args(leftIterator, Double.valueOf(30.0)));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    // ---- Right iterator containsMatch branch ----

    @Test
    public void testRightIteratorContainsMatchTrue() {
        Iterator<Double> rightIterator = iteratorOf(1.0, 2.0, 8.0);
        GreaterOp op = new GreaterOp(args(Double.valueOf(3.0), rightIterator));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testRightIteratorContainsMatchFalse() {
        Iterator<Double> rightIterator = iteratorOf(100.0, 200.0);
        GreaterOp op = new GreaterOp(args(Double.valueOf(3.0), rightIterator));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    // ---- Both iterators findMatch branch ----

    @Test
    public void testBothIteratorsFindMatchTrue() {
        Iterator<Double> leftIterator = iteratorOf(5.0, 6.0);
        Iterator<Double> rightIterator = iteratorOf(1.0, 2.0);
        GreaterOp op = new GreaterOp(args(leftIterator, rightIterator));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testBothIteratorsFindMatchFalse() {
        Iterator<Double> leftIterator = iteratorOf(1.0, 2.0);
        Iterator<Double> rightIterator = iteratorOf(5.0, 6.0);
        GreaterOp op = new GreaterOp(args(leftIterator, rightIterator));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testBothIteratorsManyRoundsNoMatch() {
        Iterator<Double> leftIterator = iteratorOf(1.0, 2.0, 3.0, 4.0, 5.0);
        Iterator<Double> rightIterator = iteratorOf(10.0, 20.0, 30.0, 40.0, 50.0);
        GreaterOp op = new GreaterOp(args(leftIterator, rightIterator));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testBothIteratorsManyRoundsMatchAtEnd() {
        Iterator<Double> leftIterator = iteratorOf(1.0, 2.0, 3.0, 4.0, 100.0);
        Iterator<Double> rightIterator = iteratorOf(10.0, 20.0, 30.0, 40.0, 50.0);
        GreaterOp op = new GreaterOp(args(leftIterator, rightIterator));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    // ---- Empty iterator (0 rounds loop) ----

    @Test
    public void testEmptyLeftIteratorNoMatch() {
        Iterator<Double> emptyIterator = iteratorOf();
        GreaterOp op = new GreaterOp(args(emptyIterator, Double.valueOf(5.0)));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testEmptyRightIteratorNoMatch() {
        Iterator<Double> emptyIterator = iteratorOf();
        GreaterOp op = new GreaterOp(args(Double.valueOf(5.0), emptyIterator));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testBothEmptyIteratorsNoMatch() {
        Iterator<Double> emptyLeft = iteratorOf();
        Iterator<Double> emptyRight = iteratorOf();
        GreaterOp op = new GreaterOp(args(emptyLeft, emptyRight));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLeftEmptyRightNonEmptyIterators() {
        Iterator<Double> emptyLeft = iteratorOf();
        Iterator<Double> rightIterator = iteratorOf(1.0, 2.0, 3.0);
        GreaterOp op = new GreaterOp(args(emptyLeft, rightIterator));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    // ---- Exception path ----

    @Test
    public void testExceptionPropagationFromEvaluateCompare() {
        ThrowingOp op = new ThrowingOp(args(Double.valueOf(1.0), Double.valueOf(2.0)));
        try {
            op.computeValue(null);
            fail("Expected RuntimeException to be thrown");
        }
        catch (RuntimeException ex) {
            assertEquals("boom", ex.getMessage());
        }
    }

    @Test
    public void testMissingArgsThrowsArrayIndexOutOfBounds() {
        GreaterOp op = new GreaterOp(new Expression[0]);
        try {
            op.computeValue(null);
            fail("Expected ArrayIndexOutOfBoundsException to be thrown");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            assertTrue(true);
        }
    }

    // ---- Null context tolerance (context unused by ValueExpression) ----

    @Test
    public void testNullContextDoesNotAffectResult() {
        GreaterOp op = new GreaterOp(args(Double.valueOf(9.0), Double.valueOf(1.0)));
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    // ---- Mixed numeric types (Integer vs Double) ----

    @Test
    public void testMixedNumericTypesInteger() {
        GreaterOp op = new GreaterOp(args(Integer.valueOf(10), Double.valueOf(5.5)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testMixedNumericTypesIntegerFalse() {
        GreaterOp op = new GreaterOp(args(Integer.valueOf(2), Double.valueOf(5.5)));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }
}