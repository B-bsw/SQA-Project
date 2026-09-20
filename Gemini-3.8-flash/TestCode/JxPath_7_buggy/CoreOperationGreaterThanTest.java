package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Assert;
import org.junit.Test;

public class CoreOperationGreaterThanTest {

    private static class MockExpression extends Expression {
        private final Object value;
        private final RuntimeException exceptionToThrow;

        public MockExpression(Object value) {
            this.value = value;
            this.exceptionToThrow = null;
        }

        public MockExpression(RuntimeException exceptionToThrow) {
            this.value = null;
            this.exceptionToThrow = exceptionToThrow;
        }

        public boolean isContextDependent() {
            return false;
        }

        public Object compute(EvalContext context) {
            return computeValue(context);
        }

        public Object computeValue(EvalContext context) {
            if (exceptionToThrow != null) {
                throw exceptionToThrow;
            }
            return value;
        }
    }

    @Test
    public void getSymbol_whenCalled_shouldReturnGreaterThanSymbol() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(1.0));
        Expression arg2 = new MockExpression(new Double(2.0));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        String symbol = operation.getSymbol();

        // Assert
        Assert.assertEquals(">", symbol);
    }

    @Test
    public void computeValue_givenLeftGreaterThanRight_shouldReturnTrue() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(5.0));
        Expression arg2 = new MockExpression(new Double(2.0));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenLeftLessThanRight_shouldReturnFalse() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(1.0));
        Expression arg2 = new MockExpression(new Double(3.0));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenLeftEqualsRight_shouldReturnFalse() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(4.0));
        Expression arg2 = new MockExpression(new Double(4.0));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenNegativeNumbersLeftGreaterThanRight_shouldReturnTrue() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(-1.5));
        Expression arg2 = new MockExpression(new Double(-3.5));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenNegativeNumbersLeftLessThanRight_shouldReturnFalse() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(-10.0));
        Expression arg2 = new MockExpression(new Double(-2.0));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenPositiveInfinityAndFiniteNumber_shouldReturnTrue() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(Double.POSITIVE_INFINITY));
        Expression arg2 = new MockExpression(new Double(Double.MAX_VALUE));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenFiniteNumberAndPositiveInfinity_shouldReturnFalse() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(Double.MAX_VALUE));
        Expression arg2 = new MockExpression(new Double(Double.POSITIVE_INFINITY));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenNegativeInfinityAndFiniteNumber_shouldReturnFalse() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(Double.NEGATIVE_INFINITY));
        Expression arg2 = new MockExpression(new Double(-Double.MAX_VALUE));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenFiniteNumberAndNegativeInfinity_shouldReturnTrue() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(-Double.MAX_VALUE));
        Expression arg2 = new MockExpression(new Double(Double.NEGATIVE_INFINITY));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenLeftIsNaN_shouldReturnFalse() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(Double.NaN));
        Expression arg2 = new MockExpression(new Double(0.0));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenRightIsNaN_shouldReturnFalse() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(0.0));
        Expression arg2 = new MockExpression(new Double(Double.NaN));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenBothAreNaN_shouldReturnFalse() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(Double.NaN));
        Expression arg2 = new MockExpression(new Double(Double.NaN));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenZeroAndNegativeZero_shouldReturnFalse() {
        // Arrange
        Expression arg1 = new MockExpression(new Double(0.0));
        Expression arg2 = new MockExpression(new Double(-0.0));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenNumericStrings_shouldConvertAndEvaluateCorrectly() {
        // Arrange
        Expression arg1 = new MockExpression("100.5");
        Expression arg2 = new MockExpression("20.3");
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenBooleanOperands_shouldConvertAndEvaluateCorrectly() {
        // Arrange: In InfoSetUtil, Boolean.TRUE is 1.0, Boolean.FALSE is 0.0
        Expression arg1 = new MockExpression(Boolean.TRUE);
        Expression arg2 = new MockExpression(Boolean.FALSE);
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenNullLeftOperand_shouldHandleWithoutError() {
        // Arrange: InfoSetUtil maps null to NaN or 0.0, NaN > 1.0 is false
        Expression arg1 = new MockExpression(null);
        Expression arg2 = new MockExpression(new Double(1.0));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenNullRightOperand_shouldHandleWithoutError() {
        // Arrange: InfoSetUtil maps null to NaN or 0.0, 1.0 > NaN is false
        Expression arg1 = new MockExpression(new Double(1.0));
        Expression arg2 = new MockExpression(null);
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_whenLeftExpressionThrowsException_shouldPropagateException() {
        // Arrange
        RuntimeException expectedException = new RuntimeException("Left expression failed");
        Expression arg1 = new MockExpression(expectedException);
        Expression arg2 = new MockExpression(new Double(1.0));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act & Assert
        try {
            operation.computeValue(null);
            Assert.fail("Expected RuntimeException was not thrown");
        } catch (RuntimeException e) {
            Assert.assertSame(expectedException, e);
        }
    }

    @Test
    public void computeValue_whenRightExpressionThrowsException_shouldPropagateException() {
        // Arrange
        RuntimeException expectedException = new RuntimeException("Right expression failed");
        Expression arg1 = new MockExpression(new Double(1.0));
        Expression arg2 = new MockExpression(expectedException);
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        // Act & Assert
        try {
            operation.computeValue(null);
            Assert.fail("Expected RuntimeException was not thrown");
        } catch (RuntimeException e) {
            Assert.assertSame(expectedException, e);
        }
    }
}