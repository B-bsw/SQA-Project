package org.apache.commons.jxpath.ri.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.junit.Assert;
import org.junit.Test;

public class CoreOperationRelationalExpressionTest {

    private static class MockExpression extends Expression {
        private Object value;

        public MockExpression(Object value) {
            this.value = value;
        }

        public Object compute(EvalContext context) {
            return value;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }

        public boolean isContextDependent() {
            return false;
        }
    }

    private static class GreaterThanOperation extends CoreOperationRelationalExpression {
        public GreaterThanOperation(Expression left, Expression right) {
            super(new Expression[] { left, right });
        }

        public GreaterThanOperation(Expression[] args) {
            super(args);
        }

        protected boolean evaluateCompare(int compare) {
            return compare > 0;
        }
    }

    private static class EqualOperation extends CoreOperationRelationalExpression {
        public EqualOperation(Expression left, Expression right) {
            super(new Expression[] { left, right });
        }

        protected boolean evaluateCompare(int compare) {
            return compare == 0;
        }
    }

    private static class LessThanOperation extends CoreOperationRelationalExpression {
        public LessThanOperation(Expression left, Expression right) {
            super(new Expression[] { left, right });
        }

        protected boolean evaluateCompare(int compare) {
            return compare < 0;
        }
    }

    private static class TestInitialContext extends InitialContext {
        private boolean resetCalled;

        public TestInitialContext() {
            super(null);
            this.resetCalled = false;
        }

        public void reset() {
            this.resetCalled = true;
        }

        public boolean isResetCalled() {
            return this.resetCalled;
        }
    }

    private static class TestSelfContext extends SelfContext {
        public TestSelfContext() {
            super(null, null);
        }

        public Pointer getSingleNodePointer() {
            return null;
        }
    }

    @Test
    public void getPrecedence_shouldReturnThree() {
        // Arrange
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(new Double(1.0)),
            new MockExpression(new Double(2.0))
        );

        // Act
        int precedence = op.getPrecedence();

        // Assert
        Assert.assertEquals(3, precedence);
    }

    @Test
    public void isSymmetric_shouldReturnFalse() {
        // Arrange
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(new Double(1.0)),
            new MockExpression(new Double(2.0))
        );

        // Act
        boolean symmetric = op.isSymmetric();

        // Assert
        Assert.assertFalse(symmetric);
    }

    @Test
    public void computeValue_givenLeftGreaterThanRight_shouldReturnTrueForGreaterThan() {
        // Arrange
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(new Double(5.0)),
            new MockExpression(new Double(3.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenLeftLessThanRight_shouldReturnFalseForGreaterThan() {
        // Arrange
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(new Double(2.0)),
            new MockExpression(new Double(4.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenLeftEqualsRight_shouldReturnFalseForGreaterThan() {
        // Arrange
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(new Double(3.0)),
            new MockExpression(new Double(3.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenLeftEqualsRight_shouldReturnTrueForEqual() {
        // Arrange
        EqualOperation op = new EqualOperation(
            new MockExpression(new Double(7.0)),
            new MockExpression(new Double(7.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenLeftNotEqualsRight_shouldReturnFalseForEqual() {
        // Arrange
        EqualOperation op = new EqualOperation(
            new MockExpression(new Double(7.0)),
            new MockExpression(new Double(8.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenLeftLessThanRight_shouldReturnTrueForLessThan() {
        // Arrange
        LessThanOperation op = new LessThanOperation(
            new MockExpression(new Double(1.0)),
            new MockExpression(new Double(2.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenLeftGreaterThanRight_shouldReturnFalseForLessThan() {
        // Arrange
        LessThanOperation op = new LessThanOperation(
            new MockExpression(new Double(5.0)),
            new MockExpression(new Double(2.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenLeftEqualsRight_shouldReturnFalseForLessThan() {
        // Arrange
        LessThanOperation op = new LessThanOperation(
            new MockExpression(new Double(4.0)),
            new MockExpression(new Double(4.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenNaNLeftOperand_shouldFallbackToCompareOne() {
        // Arrange
        // NaN == 5 is false, NaN < 5 is false -> evaluateCompare(1)
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression("invalid-number"),
            new MockExpression(new Double(5.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenNaNRightOperand_shouldFallbackToCompareOne() {
        // Arrange
        // 5 == NaN is false, 5 < NaN is false -> evaluateCompare(1)
        LessThanOperation op = new LessThanOperation(
            new MockExpression(new Double(5.0)),
            new MockExpression("invalid-number")
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenInitialContextOnLeft_shouldResetInitialContext() {
        // Arrange
        TestInitialContext leftContext = new TestInitialContext();
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(leftContext),
            new MockExpression(new Double(1.0))
        );

        // Act
        op.computeValue(null);

        // Assert
        Assert.assertTrue(leftContext.isResetCalled());
    }

    @Test
    public void computeValue_givenInitialContextOnRight_shouldResetInitialContext() {
        // Arrange
        TestInitialContext rightContext = new TestInitialContext();
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(new Double(1.0)),
            new MockExpression(rightContext)
        );

        // Act
        op.computeValue(null);

        // Assert
        Assert.assertTrue(rightContext.isResetCalled());
    }

    @Test
    public void computeValue_givenInitialContextOnBothSides_shouldResetBothContexts() {
        // Arrange
        TestInitialContext leftContext = new TestInitialContext();
        TestInitialContext rightContext = new TestInitialContext();
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(leftContext),
            new MockExpression(rightContext)
        );

        // Act
        op.computeValue(null);

        // Assert
        Assert.assertTrue(leftContext.isResetCalled());
        Assert.assertTrue(rightContext.isResetCalled());
    }

    @Test
    public void computeValue_givenSelfContextOnLeft_shouldReduceToSingleNodePointer() {
        // Arrange
        TestSelfContext selfContext = new TestSelfContext();
        EqualOperation op = new EqualOperation(
            new MockExpression(selfContext),
            new MockExpression(new Double(0.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenSelfContextOnRight_shouldReduceToSingleNodePointer() {
        // Arrange
        TestSelfContext selfContext = new TestSelfContext();
        EqualOperation op = new EqualOperation(
            new MockExpression(new Double(0.0)),
            new MockExpression(selfContext)
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenLeftIsCollectionWithMatchingElement_shouldReturnTrue() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add(new Double(1.0));
        leftList.add(new Double(10.0));
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(leftList),
            new MockExpression(new Double(5.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenLeftIsCollectionWithNoMatchingElement_shouldReturnFalse() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add(new Double(1.0));
        leftList.add(new Double(2.0));
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(leftList),
            new MockExpression(new Double(5.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenLeftIsEmptyCollection_shouldReturnFalse() {
        // Arrange
        List leftList = new ArrayList();
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(leftList),
            new MockExpression(new Double(5.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenRightIsCollectionWithMatchingElement_shouldReturnTrue() {
        // Arrange
        List rightList = new ArrayList();
        rightList.add(new Double(3.0));
        rightList.add(new Double(8.0));
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(new Double(5.0)),
            new MockExpression(rightList)
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        // compute(8.0, 5.0) -> 8.0 > 5.0 is true
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenRightIsCollectionWithNoMatchingElement_shouldReturnFalse() {
        // Arrange
        List rightList = new ArrayList();
        rightList.add(new Double(5.0));
        rightList.add(new Double(6.0));
        LessThanOperation op = new LessThanOperation(
            new MockExpression(new Double(2.0)),
            new MockExpression(rightList)
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        // compute(5.0, 2.0) -> 5.0 < 2.0 is false, compute(6.0, 2.0) -> 6.0 < 2.0 is false
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenRightIsEmptyCollection_shouldReturnFalse() {
        // Arrange
        List rightList = new ArrayList();
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(new Double(5.0)),
            new MockExpression(rightList)
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenBothAreCollectionsWithMatch_shouldReturnTrue() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add(new Double(10.0));
        leftList.add(new Double(2.0));

        List rightList = new ArrayList();
        rightList.add(new Double(5.0));
        rightList.add(new Double(20.0));

        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(leftList),
            new MockExpression(rightList)
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        // left has 10.0, right has 5.0 -> 10.0 > 5.0 is true
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenBothAreCollectionsWithNoMatch_shouldReturnFalse() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add(new Double(1.0));
        leftList.add(new Double(2.0));

        List rightList = new ArrayList();
        rightList.add(new Double(10.0));
        rightList.add(new Double(20.0));

        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(leftList),
            new MockExpression(rightList)
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenBothAreEmptyCollections_shouldReturnFalse() {
        // Arrange
        List leftList = new ArrayList();
        List rightList = new ArrayList();
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(leftList),
            new MockExpression(rightList)
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenLeftIsIteratorAndRightIsScalar_shouldComputeProperly() {
        // Arrange
        List list = new ArrayList();
        list.add(new Double(10.0));
        Iterator it = list.iterator();

        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(it),
            new MockExpression(new Double(5.0))
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenRightIsIteratorAndLeftIsScalar_shouldComputeProperly() {
        // Arrange
        List list = new ArrayList();
        list.add(new Double(10.0));
        Iterator it = list.iterator();

        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(new Double(5.0)),
            new MockExpression(it)
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        // compute(10.0, 5.0) -> 10.0 > 5.0 is true
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenBothAreIterators_shouldFindMatch() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add(new Double(7.0));
        List rightList = new ArrayList();
        rightList.add(new Double(7.0));

        EqualOperation op = new EqualOperation(
            new MockExpression(leftList.iterator()),
            new MockExpression(rightList.iterator())
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenStringsRepresentingNumbers_shouldCompareNumerically() {
        // Arrange
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression("100.5"),
            new MockExpression("20.1")
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenBooleans_shouldConvertAndCompare() {
        // Arrange
        // Boolean.TRUE converts to 1.0, Boolean.FALSE converts to 0.0
        GreaterThanOperation op = new GreaterThanOperation(
            new MockExpression(Boolean.TRUE),
            new MockExpression(Boolean.FALSE)
        );

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test(expected = NullPointerException.class)
    public void computeValue_givenNullArgsArray_shouldThrowNullPointerException() {
        // Arrange
        GreaterThanOperation op = new GreaterThanOperation((Expression[]) null);

        // Act
        op.computeValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void computeValue_givenNullElementInArgsArray_shouldThrowNullPointerException() {
        // Arrange
        GreaterThanOperation op = new GreaterThanOperation(new Expression[] {
            null,
            new MockExpression(new Double(1.0))
        });

        // Act
        op.computeValue(null);
    }
}