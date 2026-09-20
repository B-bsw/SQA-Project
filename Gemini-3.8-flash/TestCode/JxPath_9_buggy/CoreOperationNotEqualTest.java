package org.apache.commons.jxpath.ri.compiler;

import org.junit.Assert;
import org.junit.Test;

public class CoreOperationNotEqualTest {

    @Test
    public void getSymbol_shouldReturnNotEqualSymbol() {
        // Arrange
        Constant arg1 = new Constant("a");
        Constant arg2 = new Constant("b");
        CoreOperationNotEqual operation = new CoreOperationNotEqual(arg1, arg2);

        // Act
        String symbol = operation.getSymbol();

        // Assert
        Assert.assertEquals("!=", symbol);
    }

    @Test
    public void computeValue_givenEqualStrings_shouldReturnBooleanFalse() {
        // Arrange
        Constant arg1 = new Constant("testValue");
        Constant arg2 = new Constant("testValue");
        CoreOperationNotEqual operation = new CoreOperationNotEqual(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenDifferentStrings_shouldReturnBooleanTrue() {
        // Arrange
        Constant arg1 = new Constant("alpha");
        Constant arg2 = new Constant("beta");
        CoreOperationNotEqual operation = new CoreOperationNotEqual(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenEqualNumbers_shouldReturnBooleanFalse() {
        // Arrange
        Constant arg1 = new Constant(new Integer(42));
        Constant arg2 = new Constant(new Double(42.0));
        CoreOperationNotEqual operation = new CoreOperationNotEqual(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenDifferentNumbers_shouldReturnBooleanTrue() {
        // Arrange
        Constant arg1 = new Constant(new Integer(42));
        Constant arg2 = new Constant(new Integer(99));
        CoreOperationNotEqual operation = new CoreOperationNotEqual(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenEmptyStrings_shouldReturnBooleanFalse() {
        // Arrange
        Constant arg1 = new Constant("");
        Constant arg2 = new Constant("");
        CoreOperationNotEqual operation = new CoreOperationNotEqual(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenEmptyAndNonEmptyStrings_shouldReturnBooleanTrue() {
        // Arrange
        Constant arg1 = new Constant("");
        Constant arg2 = new Constant("nonEmpty");
        CoreOperationNotEqual operation = new CoreOperationNotEqual(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenEquivalentNumberAndString_shouldReturnBooleanFalse() {
        // Arrange
        Constant arg1 = new Constant(new Double(10.0));
        Constant arg2 = new Constant("10");
        CoreOperationNotEqual operation = new CoreOperationNotEqual(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenNonEquivalentNumberAndString_shouldReturnBooleanTrue() {
        // Arrange
        Constant arg1 = new Constant(new Double(10.0));
        Constant arg2 = new Constant("20");
        CoreOperationNotEqual operation = new CoreOperationNotEqual(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test(expected = NullPointerException.class)
    public void computeValue_givenNullFirstArgument_shouldThrowNullPointerException() {
        // Arrange
        CoreOperationNotEqual operation = new CoreOperationNotEqual(null, new Constant("valid"));

        // Act
        operation.computeValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void computeValue_givenNullSecondArgument_shouldThrowNullPointerException() {
        // Arrange
        CoreOperationNotEqual operation = new CoreOperationNotEqual(new Constant("valid"), null);

        // Act
        operation.computeValue(null);
    }
}