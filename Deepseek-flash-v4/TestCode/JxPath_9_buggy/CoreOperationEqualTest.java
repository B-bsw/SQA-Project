package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CoreOperationEqualTest {

    @Test
    public void testComputeValue_ReturnsTrue_WhenEqual() {
        Expression arg1 = Mockito.mock(Expression.class);
        Expression arg2 = Mockito.mock(Expression.class);
        EvalContext context = Mockito.mock(EvalContext.class);
        
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);
        
        // Mock the equal method to return true
        CoreOperationCompare spiedOperation = Mockito.spy(operation);
        Mockito.doReturn(true).when(spiedOperation).equal(any(EvalContext.class), any(Expression.class), any(Expression.class));
        
        Object result = spiedOperation.computeValue(context);
        
        assertEquals(Boolean.TRUE, result);
        verify(spiedOperation).equal(context, arg1, arg2);
    }

    @Test
    public void testComputeValue_ReturnsFalse_WhenNotEqual() {
        Expression arg1 = Mockito.mock(Expression.class);
        Expression arg2 = Mockito.mock(Expression.class);
        EvalContext context = Mockito.mock(EvalContext.class);
        
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);
        
        // Mock the equal method to return false
        CoreOperationCompare spiedOperation = Mockito.spy(operation);
        Mockito.doReturn(false).when(spiedOperation).equal(any(EvalContext.class), any(Expression.class), any(Expression.class));
        
        Object result = spiedOperation.computeValue(context);
        
        assertEquals(Boolean.FALSE, result);
        verify(spiedOperation).equal(context, arg1, arg2);
    }

    @Test
    public void testGetSymbol_ReturnsEqualsOperator() {
        Expression arg1 = Mockito.mock(Expression.class);
        Expression arg2 = Mockito.mock(Expression.class);
        
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);
        
        assertEquals("=", operation.getSymbol());
    }

    @Test
    public void testComputeValue_WithNullArguments() {
        EvalContext context = Mockito.mock(EvalContext.class);
        
        CoreOperationEqual operation = new CoreOperationEqual(null, null);
        
        // Mock equal to return true for null arguments
        CoreOperationCompare spiedOperation = Mockito.spy(operation);
        Mockito.doReturn(true).when(spiedOperation).equal(any(EvalContext.class), isNull(), isNull());
        
        Object result = spiedOperation.computeValue(context);
        
        assertEquals(Boolean.TRUE, result);
        verify(spiedOperation).equal(context, null, null);
    }

    @Test
    public void testComputeValue_WithNullContext() {
        Expression arg1 = Mockito.mock(Expression.class);
        Expression arg2 = Mockito.mock(Expression.class);
        
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);
        
        // Mock equal to throw NullPointerException when context is null
        CoreOperationCompare spiedOperation = Mockito.spy(operation);
        Mockito.doThrow(new NullPointerException()).when(spiedOperation).equal(isNull(), any(Expression.class), any(Expression.class));
        
        try {
            spiedOperation.computeValue(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }
}