package org.apache.commons.jxpath.ri.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Test;

public class CoreOperationRelationalExpressionTest {

    private static class TestableRelationalExpression extends CoreOperationRelationalExpression {
        private int lastCompare = Integer.MIN_VALUE;
        private boolean evaluateCompareResult = true;
        private boolean useComparisonLogic = false;

        public TestableRelationalExpression(Expression[] args) {
            super(args);
        }

        public TestableRelationalExpression(Expression left, Expression right) {
            super(new Expression[] { left, right });
        }

        public void setEvaluateCompareResult(boolean result) {
            this.evaluateCompareResult = result;
            this.useComparisonLogic = false;
        }

        public void setUseComparisonLogic(boolean useComparisonLogic) {
            this.useComparisonLogic = useComparisonLogic;
        }

        public int getLastCompare() {
            return this.lastCompare;
        }

        protected boolean evaluateCompare(int compare) {
            this.lastCompare = compare;
            if (this.useComparisonLogic) {
                return compare < 0;
            }
            return this.evaluateCompareResult;
        }
    }

    private static class MockExpression extends Expression {
        private Object value;

        public MockExpression(Object value) {
            this.value = value;
        }

        public Object compute(EvalContext context) {
            return this.value;
        }

        public Object computeValue(EvalContext context) {
            return this.value;
        }

        public boolean isContextDependent() {
            return false;
        }
    }

    private static class MockInitialContext extends InitialContext {
        private boolean resetCalled = false;

        public MockInitialContext() {
            super(null);
        }

        public void reset() {
            this.resetCalled = true;
        }

        public boolean isResetCalled() {
            return this.resetCalled;
        }

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            return null;
        }

        public NodePointer getSingleNodePointer() {
            return null;
        }
    }

    private static class MockSelfContext extends SelfContext {
        private NodePointer pointer;

        public MockSelfContext(NodePointer pointer) {
            super(null, null);
            this.pointer = pointer;
        }

        public NodePointer getSingleNodePointer() {
            return this.pointer;
        }
    }

    @Test
    public void getPrecedence_whenCalled_shouldReturnRelationalExprPrecedence() {
        // Arrange
        Expression left = new MockExpression(new Double(1.0));
        Expression right = new MockExpression(new Double(2.0));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        int precedence = expr.getPrecedence();

        // Assert
        Assert.assertEquals(CoreOperation.RELATIONAL_EXPR_PRECEDENCE, precedence);
    }

    @Test
    public void isSymmetric_whenCalled_shouldReturnFalse() {
        // Arrange
        Expression left = new MockExpression(new Double(1.0));
        Expression right = new MockExpression(new Double(2.0));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        boolean symmetric = expr.isSymmetric();

        // Assert
        Assert.assertFalse(symmetric);
    }

    @Test
    public void computeValue_whenOperandsAreEqual_shouldEvaluateCompareZeroAndReturnTrue() {
        // Arrange
        Expression left = new MockExpression(new Double(5.0));
        Expression right = new MockExpression(new Double(5.0));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setEvaluateCompareResult(true);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(0, expr.getLastCompare());
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_whenLeftIsLessThanRight_shouldEvaluateCompareNegativeOne() {
        // Arrange
        Expression left = new MockExpression(new Double(3.0));
        Expression right = new MockExpression(new Double(7.0));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setEvaluateCompareResult(true);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(-1, expr.getLastCompare());
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_whenLeftIsGreaterThanRight_shouldEvaluateComparePositiveOne() {
        // Arrange
        Expression left = new MockExpression(new Double(9.0));
        Expression right = new MockExpression(new Double(4.0));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setEvaluateCompareResult(true);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(1, expr.getLastCompare());
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_whenEvaluateCompareReturnsFalse_shouldReturnBooleanFalse() {
        // Arrange
        Expression left = new MockExpression(new Double(1.0));
        Expression right = new MockExpression(new Double(2.0));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setEvaluateCompareResult(false);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenLeftIsNaN_shouldReturnBooleanFalseWithoutEvaluatingCompare() {
        // Arrange
        Expression left = new MockExpression("non-numeric-left");
        Expression right = new MockExpression(new Double(5.0));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
        Assert.assertEquals(Integer.MIN_VALUE, expr.getLastCompare());
    }

    @Test
    public void computeValue_whenRightIsNaN_shouldReturnBooleanFalseWithoutEvaluatingCompare() {
        // Arrange
        Expression left = new MockExpression(new Double(5.0));
        Expression right = new MockExpression("non-numeric-right");
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
        Assert.assertEquals(Integer.MIN_VALUE, expr.getLastCompare());
    }

    @Test
    public void computeValue_whenBothAreNaN_shouldReturnBooleanFalse() {
        // Arrange
        Expression left = new MockExpression(new Double(Double.NaN));
        Expression right = new MockExpression(new Double(Double.NaN));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
        Assert.assertEquals(Integer.MIN_VALUE, expr.getLastCompare());
    }

    @Test
    public void computeValue_whenLeftIsInitialContext_shouldResetContextAndProcess() {
        // Arrange
        MockInitialContext leftContext = new MockInitialContext();
        Expression left = new MockExpression(leftContext);
        Expression right = new MockExpression(new Double(10.0));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertTrue(leftContext.isResetCalled());
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenRightIsInitialContext_shouldResetContextAndProcess() {
        // Arrange
        MockInitialContext rightContext = new MockInitialContext();
        Expression left = new MockExpression(new Double(10.0));
        Expression right = new MockExpression(rightContext);
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertTrue(rightContext.isResetCalled());
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenBothAreInitialContext_shouldResetBothContexts() {
        // Arrange
        MockInitialContext leftContext = new MockInitialContext();
        MockInitialContext rightContext = new MockInitialContext();
        Expression left = new MockExpression(leftContext);
        Expression right = new MockExpression(rightContext);
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertTrue(leftContext.isResetCalled());
        Assert.assertTrue(rightContext.isResetCalled());
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenLeftIsSelfContext_shouldUnwrapSingleNodePointer() {
        // Arrange
        MockSelfContext selfContext = new MockSelfContext(null);
        Expression left = new MockExpression(selfContext);
        Expression right = new MockExpression(new Double(10.0));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenRightIsSelfContext_shouldUnwrapSingleNodePointer() {
        // Arrange
        MockSelfContext selfContext = new MockSelfContext(null);
        Expression left = new MockExpression(new Double(10.0));
        Expression right = new MockExpression(selfContext);
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenLeftIsCollectionWithMatchingElement_shouldReturnBooleanTrue() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add(new Double(10.0));
        leftList.add(new Double(2.0));
        Expression left = new MockExpression(leftList);
        Expression right = new MockExpression(new Double(5.0));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setUseComparisonLogic(true);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_whenLeftIsCollectionWithNoMatchingElement_shouldReturnBooleanFalse() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add(new Double(10.0));
        leftList.add(new Double(20.0));
        Expression left = new MockExpression(leftList);
        Expression right = new MockExpression(new Double(5.0));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setUseComparisonLogic(true);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenRightIsCollectionWithMatchingElement_shouldReturnBooleanTrue() {
        // Arrange
        List rightList = new ArrayList();
        rightList.add(new Double(10.0));
        rightList.add(new Double(2.0));
        Expression left = new MockExpression(new Double(5.0));
        Expression right = new MockExpression(rightList);
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setUseComparisonLogic(true);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_whenRightIsCollectionWithNoMatchingElement_shouldReturnBooleanFalse() {
        // Arrange
        List rightList = new ArrayList();
        rightList.add(new Double(10.0));
        rightList.add(new Double(20.0));
        Expression left = new MockExpression(new Double(5.0));
        Expression right = new MockExpression(rightList);
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setUseComparisonLogic(true);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenLeftCollectionIsEmpty_shouldReturnBooleanFalse() {
        // Arrange
        List emptyList = Collections.EMPTY_LIST;
        Expression left = new MockExpression(emptyList);
        Expression right = new MockExpression(new Double(5.0));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenRightCollectionIsEmpty_shouldReturnBooleanFalse() {
        // Arrange
        List emptyList = Collections.EMPTY_LIST;
        Expression left = new MockExpression(new Double(5.0));
        Expression right = new MockExpression(emptyList);
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenBothAreCollectionsAndHaveMatch_shouldReturnBooleanTrue() {
        // Arrange
        List leftList = Arrays.asList(new Object[] { new Double(10.0), new Double(2.0) });
        List rightList = Arrays.asList(new Object[] { new Double(1.0), new Double(3.0) });
        Expression left = new MockExpression(leftList);
        Expression right = new MockExpression(rightList);
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setUseComparisonLogic(true);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_whenBothAreCollectionsAndHaveNoMatch_shouldReturnBooleanFalse() {
        // Arrange
        List leftList = Arrays.asList(new Object[] { new Double(10.0), new Double(20.0) });
        List rightList = Arrays.asList(new Object[] { new Double(1.0), new Double(2.0) });
        Expression left = new MockExpression(leftList);
        Expression right = new MockExpression(rightList);
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setUseComparisonLogic(true);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenBothAreEmptyCollections_shouldReturnBooleanFalse() {
        // Arrange
        Expression left = new MockExpression(Collections.EMPTY_LIST);
        Expression right = new MockExpression(Collections.EMPTY_LIST);
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenLeftIsEmptyCollectionAndRightHasElements_shouldReturnBooleanFalse() {
        // Arrange
        List rightList = Arrays.asList(new Object[] { new Double(1.0) });
        Expression left = new MockExpression(Collections.EMPTY_LIST);
        Expression right = new MockExpression(rightList);
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenLeftHasElementsAndRightIsEmptyCollection_shouldReturnBooleanFalse() {
        // Arrange
        List leftList = Arrays.asList(new Object[] { new Double(1.0) });
        Expression left = new MockExpression(leftList);
        Expression right = new MockExpression(Collections.EMPTY_LIST);
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenLeftIsDirectIterator_shouldIterateCorrectly() {
        // Arrange
        List list = Arrays.asList(new Object[] { new Double(1.0), new Double(5.0) });
        Expression left = new MockExpression(list.iterator());
        Expression right = new MockExpression(new Double(4.0));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setUseComparisonLogic(true);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_whenRightIsDirectIterator_shouldIterateCorrectly() {
        // Arrange
        List list = Arrays.asList(new Object[] { new Double(10.0), new Double(2.0) });
        Expression left = new MockExpression(new Double(5.0));
        Expression right = new MockExpression(list.iterator());
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setUseComparisonLogic(true);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_whenGivenStringNumbers_shouldConvertAndCompare() {
        // Arrange
        Expression left = new MockExpression("100.5");
        Expression right = new MockExpression("200.5");
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setUseComparisonLogic(true);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(-1, expr.getLastCompare());
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_whenGivenInfinities_shouldCompareCorrectly() {
        // Arrange
        Expression left = new MockExpression(new Double(Double.NEGATIVE_INFINITY));
        Expression right = new MockExpression(new Double(Double.POSITIVE_INFINITY));
        TestableRelationalExpression expr = new TestableRelationalExpression(left, right);
        expr.setUseComparisonLogic(true);

        // Act
        Object result = expr.computeValue(null);

        // Assert
        Assert.assertEquals(-1, expr.getLastCompare());
        Assert.assertEquals(Boolean.TRUE, result);
    }
}