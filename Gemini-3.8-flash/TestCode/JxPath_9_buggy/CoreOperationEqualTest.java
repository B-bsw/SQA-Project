package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Assert;
import org.junit.Test;

public class CoreOperationEqualTest {

    private static class MockEqualOperation extends CoreOperationEqual {
        private boolean mockResult;
        private boolean shouldThrow;

        public MockEqualOperation(Expression arg1, Expression arg2, boolean mockResult) {
            super(arg1, arg2);
            this.mockResult = mockResult;
            this.shouldThrow = false;
        }

        public MockEqualOperation(Expression arg1, Expression arg2, boolean mockResult, boolean shouldThrow) {
            super(arg1, arg2);
            this.mockResult = mockResult;
            this.shouldThrow = shouldThrow;
        }

        protected boolean equal(EvalContext context, Expression left, Expression right) {
            if (shouldThrow) {
                throw new RuntimeException("Simulated error in equal method");
            }
            return mockResult;
        }
    }

    @Test
    public void getSymbol_givenNormalOperation_shouldReturnEqualSymbol() {
        // Arrange
        Constant arg1 = new Constant("test1");
        Constant arg2 = new Constant("test2");
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        // Act
        String symbol = operation.getSymbol();

        // Assert
        Assert.assertEquals("=", symbol);
    }

    @Test
    public void getSymbol_givenNullArguments_shouldReturnEqualSymbol() {
        // Arrange
        CoreOperationEqual operation = new CoreOperationEqual(null, null);

        // Act
        String symbol = operation.getSymbol();

        // Assert
        Assert.assertEquals("=", symbol);
    }

    @Test
    public void computeValue_whenEqualReturnsTrue_shouldReturnBooleanTrue() {
        // Arrange
        Constant arg1 = new Constant("same");
        Constant arg2 = new Constant("same");
        MockEqualOperation operation = new MockEqualOperation(arg1, arg2, true);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof Boolean);
        Assert.assertSame(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_whenEqualReturnsFalse_shouldReturnBooleanFalse() {
        // Arrange
        Constant arg1 = new Constant("left");
        Constant arg2 = new Constant("right");
        MockEqualOperation operation = new MockEqualOperation(arg1, arg2, false);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof Boolean);
        Assert.assertSame(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenIdenticalStringConstants_shouldReturnBooleanTrue() {
        // Arrange
        Constant arg1 = new Constant("value");
        Constant arg2 = new Constant("value");
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenDifferentStringConstants_shouldReturnBooleanFalse() {
        // Arrange
        Constant arg1 = new Constant("valueA");
        Constant arg2 = new Constant("valueB");
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenEqualIntegerAndDoubleConstants_shouldReturnBooleanTrue() {
        // Arrange
        Constant arg1 = new Constant(new Integer(100));
        Constant arg2 = new Constant(new Double(100.0));
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_givenDifferentNumericConstants_shouldReturnBooleanFalse() {
        // Arrange
        Constant arg1 = new Constant(new Integer(10));
        Constant arg2 = new Constant(new Integer(20));
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void computeValue_givenEmptyStringConstants_shouldReturnBooleanTrue() {
        // Arrange
        Constant arg1 = new Constant("");
        Constant arg2 = new Constant("");
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void computeValue_whenEqualThrowsException_shouldPropagateException() {
        // Arrange
        Constant arg1 = new Constant("val");
        Constant arg2 = new Constant("val");
        MockEqualOperation operation = new MockEqualOperation(arg1, arg2, false, true);

        // Act & Assert
        try {
            operation.computeValue(null);
            Assert.fail("Expected RuntimeException was not thrown");
        } catch (RuntimeException e) {
            Assert.assertEquals("Simulated error in equal method", e.getMessage());
        }
    }
}