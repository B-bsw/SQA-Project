package org.apache.commons.jxpath.ri.compiler;

import org.junit.Assert;
import org.junit.Test;

public class CoreOperationLessThanTest {

    @Test
    public void getSymbol_shouldReturnLessThanSymbol() {
        // Arrange
        Constant left = new Constant(new Integer(1));
        Constant right = new Constant(new Integer(2));
        CoreOperationLessThan operation = new CoreOperationLessThan(left, right);

        // Act
        String symbol = operation.getSymbol();

        // Assert
        Assert.assertEquals("<", symbol);
    }

    @Test
    public void constructor_givenTwoExpressions_shouldInitializeArgsArrayCorrectly() {
        // Arrange
        Constant left = new Constant(new Integer(5));
        Constant right = new Constant(new Integer(10));

        // Act
        CoreOperationLessThan operation = new CoreOperationLessThan(left, right);

        // Assert
        Assert.assertNotNull(operation.getArguments());
        Assert.assertEquals(2, operation.getArguments().length);
        Assert.assertSame(left, operation.getArguments()[0]);
        Assert.assertSame(right, operation.getArguments()[1]);
    }

    @Test
    public void computeValue_givenLeftLessThanRight_shouldReturnTrue() {
        // Arrange
        Constant left = new Constant(new Integer(1));
        Constant right = new Constant(new Integer(2));
        CoreOperationLessThan operation = new CoreOperationLessThan(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenLeftGreaterThanRight_shouldReturnFalse() {
        // Arrange
        Constant left = new Constant(new Integer(5));
        Constant right = new Constant(new Integer(3));
        CoreOperationLessThan operation = new CoreOperationLessThan(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenLeftEqualToRight_shouldReturnFalse() {
        // Arrange
        Constant left = new Constant(new Integer(7));
        Constant right = new Constant(new Integer(7));
        CoreOperationLessThan operation = new CoreOperationLessThan(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenNegativeNumbers_shouldEvaluateCorrectly() {
        // Arrange
        Constant left = new Constant(new Integer(-10));
        Constant right = new Constant(new Integer(-5));
        CoreOperationLessThan operationTrue = new CoreOperationLessThan(left, right);
        CoreOperationLessThan operationFalse = new CoreOperationLessThan(right, left);

        // Act
        Object resultTrue = operationTrue.computeValue(null);
        Object resultFalse = operationFalse.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, resultTrue);
        Assert.assertEquals(Boolean.FALSE, resultFalse);
    }

    @Test
    public void computeValue_givenDoublePrecisionFloatingPoint_shouldEvaluateCorrectly() {
        // Arrange
        Constant left = new Constant(new Double(1.0000001));
        Constant right = new Constant(new Double(1.0000002));
        CoreOperationLessThan operation = new CoreOperationLessThan(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenBoundaryDoubleValues_shouldEvaluateCorrectly() {
        // Arrange
        Constant minVal = new Constant(new Double(Double.MIN_VALUE));
        Constant zero = new Constant(new Double(0.0));
        Constant maxVal = new Constant(new Double(Double.MAX_VALUE));
        Constant posInf = new Constant(new Double(Double.POSITIVE_INFINITY));
        Constant negInf = new Constant(new Double(Double.NEGATIVE_INFINITY));

        CoreOperationLessThan opZeroVsMin = new CoreOperationLessThan(zero, minVal);
        CoreOperationLessThan opMaxVsInf = new CoreOperationLessThan(maxVal, posInf);
        CoreOperationLessThan opNegInfVsMin = new CoreOperationLessThan(negInf, minVal);

        // Act & Assert
        Assert.assertEquals(Boolean.TRUE, opZeroVsMin.computeValue(null));
        Assert.assertEquals(Boolean.TRUE, opMaxVsInf.computeValue(null));
        Assert.assertEquals(Boolean.TRUE, opNegInfVsMin.computeValue(null));
    }

    @Test
    public void computeValue_givenNaNOperand_shouldReturnFalse() {
        // Arrange
        Constant nan = new Constant(new Double(Double.NaN));
        Constant number = new Constant(new Double(10.0));
        CoreOperationLessThan opLeftNan = new CoreOperationLessThan(nan, number);
        CoreOperationLessThan opRightNan = new CoreOperationLessThan(number, nan);
        CoreOperationLessThan opBothNan = new CoreOperationLessThan(nan, nan);

        // Act & Assert
        Assert.assertEquals(Boolean.FALSE, opLeftNan.computeValue(null));
        Assert.assertEquals(Boolean.FALSE, opRightNan.computeValue(null));
        Assert.assertEquals(Boolean.FALSE, opBothNan.computeValue(null));
    }

    @Test
    public void computeValue_givenStringNumericOperands_shouldParseAndEvaluate() {
        // Arrange
        Constant left = new Constant("15.5");
        Constant right = new Constant("20.0");
        CoreOperationLessThan operation = new CoreOperationLessThan(left, right);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenInvalidStringNumericOperand_shouldEvaluateAsNaNAndReturnFalse() {
        // Arrange
        Constant invalidString = new Constant("not-a-number");
        Constant validNumber = new Constant(new Integer(100));
        CoreOperationLessThan operation = new CoreOperationLessThan(invalidString, validNumber);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenBooleanOperands_shouldEvaluateAsZeroAndOne() {
        // Arrange
        Constant boolFalse = new Constant(new Double(0.0));
        Constant boolTrue = new Constant(new Double(1.0));
        CoreOperationLessThan operation = new CoreOperationLessThan(boolFalse, boolTrue);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test(expected = NullPointerException.class)
    public void computeValue_givenFirstOperandNull_shouldThrowNullPointerException() {
        // Arrange
        Constant right = new Constant(new Integer(10));
        CoreOperationLessThan operation = new CoreOperationLessThan(null, right);

        // Act
        operation.computeValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void computeValue_givenSecondOperandNull_shouldThrowNullPointerException() {
        // Arrange
        Constant left = new Constant(new Integer(10));
        CoreOperationLessThan operation = new CoreOperationLessThan(left, null);

        // Act
        operation.computeValue(null);
    }
}