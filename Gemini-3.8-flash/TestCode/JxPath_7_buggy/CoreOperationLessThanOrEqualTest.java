package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Assert;
import org.junit.Test;

public class CoreOperationLessThanOrEqualTest {

    private static class StubExpression extends Expression {
        private final Object evaluatedValue;

        public StubExpression(Object evaluatedValue) {
            this.evaluatedValue = evaluatedValue;
        }

        public Object compute(EvalContext context) {
            return this.evaluatedValue;
        }

        public Object computeValue(EvalContext context) {
            return this.evaluatedValue;
        }

        public boolean isContextDependent() {
            return false;
        }
    }

    @Test
    public void getSymbol_always_shouldReturnSymbolLessThanOrEqual() {
        // Arrange
        Expression left = new StubExpression(new Double(0.0));
        Expression right = new StubExpression(new Double(0.0));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        String symbol = operation.getSymbol();

        // Assert
        Assert.assertEquals("<=", symbol);
    }

    @Test
    public void computeValue_givenLeftLessThanRight_shouldReturnTrue() {
        // Arrange
        Expression left = new StubExpression(new Double(1.5));
        Expression right = new StubExpression(new Double(2.5));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenLeftEqualsRight_shouldReturnTrue() {
        // Arrange
        Expression left = new StubExpression(new Double(10.0));
        Expression right = new StubExpression(new Double(10.0));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenLeftGreaterThanRight_shouldReturnFalse() {
        // Arrange
        Expression left = new StubExpression(new Double(5.1));
        Expression right = new StubExpression(new Double(5.0));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenNegativeNumbersLeftLessThanRight_shouldReturnTrue() {
        // Arrange
        Expression left = new StubExpression(new Double(-10.0));
        Expression right = new StubExpression(new Double(-5.0));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenNegativeNumbersLeftGreaterThanRight_shouldReturnFalse() {
        // Arrange
        Expression left = new StubExpression(new Double(-1.0));
        Expression right = new StubExpression(new Double(-2.0));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenBothNegativeZeroAndPositiveZero_shouldReturnTrue() {
        // Arrange
        Expression left = new StubExpression(new Double(-0.0));
        Expression right = new StubExpression(new Double(0.0));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenLeftIsNaN_shouldReturnFalse() {
        // Arrange
        Expression left = new StubExpression(new Double(Double.NaN));
        Expression right = new StubExpression(new Double(1.0));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenRightIsNaN_shouldReturnFalse() {
        // Arrange
        Expression left = new StubExpression(new Double(1.0));
        Expression right = new StubExpression(new Double(Double.NaN));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenBothAreNaN_shouldReturnFalse() {
        // Arrange
        Expression left = new StubExpression(new Double(Double.NaN));
        Expression right = new StubExpression(new Double(Double.NaN));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenNegativeInfinityAndPositiveInfinity_shouldReturnTrue() {
        // Arrange
        Expression left = new StubExpression(new Double(Double.NEGATIVE_INFINITY));
        Expression right = new StubExpression(new Double(Double.POSITIVE_INFINITY));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenPositiveInfinityAndNegativeInfinity_shouldReturnFalse() {
        // Arrange
        Expression left = new StubExpression(new Double(Double.POSITIVE_INFINITY));
        Expression right = new StubExpression(new Double(Double.NEGATIVE_INFINITY));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenBothPositiveInfinity_shouldReturnTrue() {
        // Arrange
        Expression left = new StubExpression(new Double(Double.POSITIVE_INFINITY));
        Expression right = new StubExpression(new Double(Double.POSITIVE_INFINITY));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenNumericStringsLeftLessThanRight_shouldReturnTrue() {
        // Arrange
        Expression left = new StubExpression("10.5");
        Expression right = new StubExpression("20.1");
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenNumericStringsLeftGreaterThanRight_shouldReturnFalse() {
        // Arrange
        Expression left = new StubExpression("99.9");
        Expression right = new StubExpression("12.3");
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenBooleansFalseAndTrue_shouldReturnTrue() {
        // Arrange
        Expression left = new StubExpression(Boolean.FALSE);
        Expression right = new StubExpression(Boolean.TRUE);
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenBooleansTrueAndFalse_shouldReturnFalse() {
        // Arrange
        Expression left = new StubExpression(Boolean.TRUE);
        Expression right = new StubExpression(Boolean.FALSE);
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenNullLeftExpression_shouldThrowNullPointerException() {
        // Arrange
        Expression right = new StubExpression(new Double(1.0));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(null, right);

        // Act & Assert
        try {
            operation.computeValue(null);
            Assert.fail("Expected NullPointerException when left expression is null");
        } catch (NullPointerException ex) {
            Assert.assertNotNull(ex);
        }
    }

    @Test
    public void computeValue_givenNullRightExpression_shouldThrowNullPointerException() {
        // Arrange
        Expression left = new StubExpression(new Double(1.0));
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(left, null);

        // Act & Assert
        try {
            operation.computeValue(null);
            Assert.fail("Expected NullPointerException when right expression is null");
        } catch (NullPointerException ex) {
            Assert.assertNotNull(ex);
        }
    }
}