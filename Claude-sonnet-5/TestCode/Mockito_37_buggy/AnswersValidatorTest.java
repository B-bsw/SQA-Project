package org.mockito.internal.stubbing.answers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.invocation.Invocation;
import org.mockito.stubbing.Answer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AnswersValidatorTest {

    private AnswersValidator validator;
    private Invocation invocation;

    @Before
    public void setUp() {
        validator = new AnswersValidator();
        invocation = mock(Invocation.class);
    }

    // ---------- ThrowsException tests ----------

    @Test(expected = MockitoException.class)
    public void shouldThrowWhenThrowableIsNull() {
        ThrowsException answer = mock(ThrowsException.class);
        when(answer.getThrowable()).thenReturn(null);

        validator.validate(answer, invocation);
    }

    @Test
    public void shouldPassWhenThrowableIsRuntimeException() {
        ThrowsException answer = mock(ThrowsException.class);
        when(answer.getThrowable()).thenReturn(new RuntimeException("boom"));

        // should not throw
        validator.validate(answer, invocation);
    }

    @Test
    public void shouldPassWhenThrowableIsError() {
        ThrowsException answer = mock(ThrowsException.class);
        when(answer.getThrowable()).thenReturn(new Error("boom"));

        // should not throw
        validator.validate(answer, invocation);
    }

    @Test
    public void shouldPassWhenCheckedExceptionIsValid() {
        ThrowsException answer = mock(ThrowsException.class);
        Exception checked = new Exception("checked");
        when(answer.getThrowable()).thenReturn(checked);
        when(invocation.isValidException(checked)).thenReturn(true);

        // should not throw
        validator.validate(answer, invocation);

        verify(invocation).isValidException(checked);
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowWhenCheckedExceptionIsInvalid() {
        ThrowsException answer = mock(ThrowsException.class);
        Exception checked = new Exception("checked");
        when(answer.getThrowable()).thenReturn(checked);
        when(invocation.isValidException(checked)).thenReturn(false);

        validator.validate(answer, invocation);
    }

    // ---------- Returns tests ----------

    @Test(expected = MockitoException.class)
    public void shouldThrowWhenStubbingVoidMethodWithReturnValue() {
        Returns answer = mock(Returns.class);
        when(invocation.isVoid()).thenReturn(true);
        when(answer.returnsNull()).thenReturn(false);
        when(invocation.isValidReturnType(any(Class.class))).thenReturn(true);

        validator.validate(answer, invocation);
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowWhenReturningNullForPrimitiveReturnType() {
        Returns answer = mock(Returns.class);
        when(invocation.isVoid()).thenReturn(false);
        when(answer.returnsNull()).