package org.mockito.internal.stubbing.answers;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CallsRealMethodsTest {

    @Test
    public void testAnswer() throws Throwable {
        // Mock the InvocationOnMock
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Object expectedResult = new Object();
        when(invocation.callRealMethod()).thenReturn(expectedResult);

        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object result = callsRealMethods.answer(invocation);

        assertEquals(expectedResult, result);
        verify(invocation).callRealMethod();
    }

    @Test
    public void testAnswerWithThrownException() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Throwable exception = new RuntimeException("test exception");
        when(invocation.callRealMethod()).thenThrow(exception);

        CallsRealMethods callsRealMethods = new CallsRealMethods();
        try {
            callsRealMethods.answer(invocation);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            assertEquals("test exception", e.getMessage());
        }
        verify(invocation).callRealMethod();
    }

    @Test
    public void testAnswerWithNullInvocation() throws Throwable {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        try {
            callsRealMethods.answer(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testAnswerWithCheckedException() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Throwable checkedException = new Exception("checked exception");
        when(invocation.callRealMethod()).thenThrow(checkedException);

        CallsRealMethods callsRealMethods = new CallsRealMethods();
        try {
            callsRealMethods.answer(invocation);
            fail("Expected Exception to be thrown");
        } catch (Exception e) {
            assertEquals("checked exception", e.getMessage());
        }
        verify(invocation).callRealMethod();
    }
}