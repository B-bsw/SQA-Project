package org.mockito.internal.stubbing.answers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

public class CallsRealMethodsTest {

    @Test
    public void shouldReturnValueFromRealMethodCall() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.callRealMethod()).thenReturn("realValue");

        CallsRealMethods answer = new CallsRealMethods();
        Object result = answer.answer(invocation);

        assertEquals("realValue", result);
    }

    @Test
    public void shouldReturnNullWhenRealMethodReturnsNull() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.callRealMethod()).thenReturn(null);

        CallsRealMethods answer = new CallsRealMethods();
        Object result = answer.answer(invocation);

        assertNull(result);
    }

    @Test
    public void shouldReturnIntegerBoundaryValue() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.callRealMethod()).thenReturn(Integer.MAX_VALUE);

        CallsRealMethods answer = new CallsRealMethods();
        Object result = answer.answer(invocation);

        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void shouldReturnEmptyStringWhenRealMethodReturnsEmptyString() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.callRealMethod()).thenReturn("");

        CallsRealMethods answer = new CallsRealMethods();
        Object result = answer.answer(invocation);

        assertEquals("", result);
    }

    @Test
    public void shouldPropagateExceptionThrownByRealMethod() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        RuntimeException expectedException = new RuntimeException("boom");
        when(invocation.callRealMethod()).thenThrow(expectedException);

        CallsRealMethods answer = new CallsRealMethods();

        try {
            answer.answer(invocation);
            fail("Expected exception to be propagated");
        } catch (RuntimeException e) {
            assertEquals("boom", e.getMessage());
            assertEquals(expectedException, e);
        }
    }

    @Test
    public void shouldPropagateThrowableThrownByRealMethod() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Throwable expectedThrowable = new Throwable("throwableBoom");
        when(invocation.callRealMethod()).thenThrow(expectedThrowable);

        CallsRealMethods answer = new CallsRealMethods();

        try {
            answer.answer(invocation);
            fail("Expected throwable to be propagated");
        } catch (Throwable t) {
            assertEquals("throwableBoom", t.getMessage());
            assertEquals(expectedThrowable, t);
        }
    }

    @Test
    public void answerImplementsAnswerInterface() {
        CallsRealMethods answer = new CallsRealMethods();
        assertEquals(true, answer instanceof org.mockito.stubbing.Answer);
    }

    @Test
    public void answerImplementsSerializable() {
        CallsRealMethods answer = new CallsRealMethods();
        assertEquals(true, answer instanceof java.io.Serializable);
    }
}