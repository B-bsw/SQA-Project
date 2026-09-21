package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockito.invocation.InvocationOnMock;

public class ReturnsSmartNullsTest {

    private ReturnsSmartNulls returnsSmartNulls;

    interface Foo {
        Bar returnsBar();
        String returnsString();
        int returnsInt();
        List<String> returnsList();
        void voidMethod();
        FinalClass returnsFinalClass();
    }

    interface Bar {
        void doSomething();
    }

    static final class FinalClass {
    }

    interface FooWithArgs {
        Bar returnsBarWithArgs(String s, int i);
    }

    @Before
    public void setUp() {
        returnsSmartNulls = new ReturnsSmartNulls();
    }

    @Test
    public void shouldImplementSerializable() {
        assertTrue(returnsSmartNulls instanceof java.io.Serializable);
    }

    @Test
    public void shouldReturnZeroForIntReturnType() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.getMethod()).thenReturn(Foo.class.getMethod("returnsInt"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnEmptyListForListReturnType() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.getMethod()).thenReturn(Foo.class.getMethod("returnsList"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof List);
        assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void shouldReturnNullForVoidReturnType() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.getMethod()).thenReturn(Foo.class.getMethod("voidMethod"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertNull(result);
    }

    @Test
    public void shouldReturnNullForFinalClassReturnTypeThatCannotBeImposterised() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.getMethod()).thenReturn(Foo.class.getMethod("returnsFinalClass"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertNull(result);
    }

    @Test
    public void shouldReturnSmartNullProxyForInterfaceReturnType() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.getMethod()).thenReturn(Foo.class.getMethod("returnsBar"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof Bar);
    }

    @Test
    public void smartNullToStringShouldContainMethodNameAndSmartNullText() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method method = Foo.class.getMethod("returnsBar");
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Bar bar = (Bar) returnsSmartNulls.answer(invocation);
        String toStringResult = bar.toString();

        assertTrue(toStringResult.contains("returnsBar"));
        assertTrue(toStringResult.contains("SmartNull"));
    }

    @Test
    public void smartNullToStringShouldContainFormattedArguments() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method method = FooWithArgs.class.getMethod("returnsBarWithArgs", String.class, int.class);
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(new Object[]{"hello", 5});

        Bar bar = (Bar) returnsSmartNulls.answer(invocation);
        String toStringResult = bar.toString();

        assertTrue(toStringResult.contains("returnsBarWithArgs"));
        assertTrue(toStringResult.contains("hello"));
        assertTrue(toStringResult.cont