package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test suite for {@link CoreOperationGreaterThanOrEqual}.
 * Designed for legacy enterprise environments with Java 1.4 / Java 7 compatibility.
 */
public class CoreOperationGreaterThanOrEqualTest {

    // =========================================================================
    // Constructor & Metadata Tests
    // =========================================================================

    @Test
    public void getSymbol_whenCalled_shouldReturnGreaterThanOrEqualSymbol() {
        // Arrange
        Constant left = new Constant(new Double(1.0));
        Constant right = new Constant(new Double(1.0));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        String symbol = operation.getSymbol();

        // Assert
        Assert.assertEquals(">=", symbol);
    }

    @Test
    public void constructor_givenExpressions_shouldInitializeArgsCorrectly() {
        // Arrange
        Constant left = new Constant(new Double(10.0));
        Constant right = new Constant(new Double(20.0));

        // Act
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Assert
        Assert.assertNotNull(operation.args);
        Assert.assertEquals(2, operation.args.length);
        Assert.assertSame(left, operation.args[0]);
        Assert.assertSame(right, operation.args[1]);
    }

    // =========================================================================
    // Happy Path Tests (Standard Numeric Comparisons)
    // =========================================================================

    @Test
    public void computeValue_givenLeftGreaterThanRight_shouldReturnTrue() {
        // Arrange
        Constant left = new Constant(new Double(10.5));
        Constant right = new Constant(new Double(5.2));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenLeftEqualToRight_shouldReturnTrue() {
        // Arrange
        Constant left = new Constant(new Double(42.0));
        Constant right = new Constant(new Double(42.0));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenLeftLessThanRight_shouldReturnFalse() {
        // Arrange
        Constant left = new Constant(new Double(3.14));
        Constant right = new Constant(new Double(9.81));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenIntegerNumbers_shouldCompareCorrectly() {
        // Arrange
        Constant left = new Constant(new Integer(100));
        Constant right = new Constant(new Integer(99));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    // =========================================================================
    // Boundary & Edge Cases
    // =========================================================================

    @Test
    public void computeValue_givenNegativeNumbersLeftGreater_shouldReturnTrue() {
        // Arrange (-1.0 >= -5.0 is true)
        Constant left = new Constant(new Double(-1.0));
        Constant right = new Constant(new Double(-5.0));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenNegativeNumbersLeftLesser_shouldReturnFalse() {
        // Arrange (-10.0 >= -2.0 is false)
        Constant left = new Constant(new Double(-10.0));
        Constant right = new Constant(new Double(-2.0));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenPositiveZeroAndNegativeZero_shouldReturnTrue() {
        // Arrange (0.0 >= -0.0 is true in IEEE 754)
        Constant left = new Constant(new Double(0.0));
        Constant right = new Constant(new Double(-0.0));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenDoubleMaxAndMinValues_shouldReturnTrue() {
        // Arrange (Double.MAX_VALUE >= Double.MIN_VALUE is true)
        Constant left = new Constant(new Double(Double.MAX_VALUE));
        Constant right = new Constant(new Double(Double.MIN_VALUE));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenPositiveInfinityAndMaxValue_shouldReturnTrue() {
        // Arrange (Infinity >= Double.MAX_VALUE is true)
        Constant left = new Constant(new Double(Double.POSITIVE_INFINITY));
        Constant right = new Constant(new Double(Double.MAX_VALUE));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenBothNegativeInfinity_shouldReturnTrue() {
        // Arrange (-Infinity >= -Infinity is true)
        Constant left = new Constant(new Double(Double.NEGATIVE_INFINITY));
        Constant right = new Constant(new Double(Double.NEGATIVE_INFINITY));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenLeftIsNaN_shouldReturnFalse() {
        // Arrange (NaN >= 1.0 is false)
        Constant left = new Constant(new Double(Double.NaN));
        Constant right = new Constant(new Double(1.0));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenRightIsNaN_shouldReturnFalse() {
        // Arrange (1.0 >= NaN is false)
        Constant left = new Constant(new Double(1.0));
        Constant right = new Constant(new Double(Double.NaN));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenBothAreNaN_shouldReturnFalse() {
        // Arrange (NaN >= NaN is false)
        Constant left = new Constant(new Double(Double.NaN));
        Constant right = new Constant(new Double(Double.NaN));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    // =========================================================================
    // Type Coercion Tests (Via InfoSetUtil)
    // =========================================================================

    @Test
    public void computeValue_givenStringNumericValuesLeftGreater_shouldReturnTrue() {
        // Arrange ("100.5" >= "20.1" -> 100.5 >= 20.1)
        Constant left = new Constant("100.5");
        Constant right = new Constant("20.1");
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenStringNumericValuesEqual_shouldReturnTrue() {
        // Arrange ("50" >= "50" -> 50.0 >= 50.0)
        Constant left = new Constant("50");
        Constant right = new Constant("50");
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenStringNumericValuesLeftLesser_shouldReturnFalse() {
        // Arrange ("10" >= "20" -> 10.0 >= 20.0)
        Constant left = new Constant("10");
        Constant right = new Constant("20");
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenNonNumericString_shouldTreatAsNaNAndReturnFalse() {
        // Arrange ("abc" converts to NaN in InfoSetUtil; NaN >= NaN is false)
        Constant left = new Constant("abc");
        Constant right = new Constant("abc");
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenEmptyString_shouldTreatAsNaNAndReturnFalse() {
        // Arrange ("" converts to NaN in InfoSetUtil; NaN >= 0 is false)
        Constant left = new Constant("");
        Constant right = new Constant(new Double(0.0));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    // =========================================================================
    // Error & Exception Branches
    // =========================================================================

    @Test
    public void computeValue_givenNullLeftExpression_shouldThrowNullPointerException() {
        // Arrange
        Constant right = new Constant(new Double(1.0));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(null, right);

        // Act & Assert
        try {
            operation.computeValue(null);
            Assert.fail("Expected NullPointerException when args[0] is null");
        } catch (NullPointerException e) {
            // Success: expected exception
        }
    }

    @Test
    public void computeValue_givenNullRightExpression_shouldThrowNullPointerException() {
        // Arrange
        Constant left = new Constant(new Double(1.0));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(left, null);

        // Act & Assert
        try {
            operation.computeValue(null);
            Assert.fail("Expected NullPointerException when args[1] is null");
        } catch (NullPointerException e) {
            // Success: expected exception
        }
    }

    @Test
    public void computeValue_givenCustomExpressionThrowingException_shouldPropagateException() {
        // Arrange
        final RuntimeException expectedException = new RuntimeException("Evaluation failure");
        Expression throwingExpression = new Expression() {
            public Object compute(EvalContext context) {
                throw expectedException;
            }

            public Object computeValue(EvalContext context) {
                throw expectedException;
            }
        };
        Constant right = new Constant(new Double(5.0));
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(throwingExpression, right);

        // Act & Assert
        try {
            operation.computeValue(null);
            Assert.fail("Expected RuntimeException from child expression evaluation");
        } catch (RuntimeException e) {
            Assert.assertSame(expectedException, e);
        }
    }
}