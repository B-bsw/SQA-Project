package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

public class ReturnsSmartNullsTest {

    private ReturnsSmartNulls returnsSmartNulls;

    @Before
    public void setUp() {
        returnsSmartNulls = new ReturnsSmartNulls();
    }

    public interface Foo {
        String bar();
    }

    public static final class FinalClass {
        @Override
        public String toString() {
            return "final";
        }
    }

    public static class RealClass {
        public int intMethod() {
            return 0;
        }

        public boolean booleanMethod() {
            return false;
        }

        public List<String> listMethod() {
            return null;
        }

        public Map<String, String> mapMethod() {
            return null;
        }

        public Foo fooMethod() {
            return null;
        }

        public FinalClass finalMethod() {
            return null;
        }

        public String stringMethod() {
            return null;
        }

        public void voidMethod() {
        }
    }

    private InvocationOnMock invocationFor(Method method) {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.getMethod()).thenReturn(method);
        return invocation;
    }

    @Test
    public void shouldReturnPrimitiveDefaultForIntReturnType() throws Throwable {
        Method method = RealClass.class.getMethod("intMethod");
        InvocationOnMock invocation = invocationFor(method);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertEquals(0, ((Integer) result).intValue());
    }

    @Test
    public void shouldReturnPrimitiveDefaultForBooleanReturnType() throws Throwable {
        Method method = RealClass.class.getMethod("booleanMethod");
        InvocationOnMock invocation = invocationFor(method);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertFalse(((Boolean) result).booleanValue());
    }

    @Test
    public void shouldReturnEmptyListForListReturnType() throws Throwable {
        Method method = RealClass.class.getMethod("listMethod");
        InvocationOnMock invocation = invocationFor(method);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof List);
        assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyMapForMapReturnType() throws Throwable {
        Method method = RealClass.class.getMethod("mapMethod");
        InvocationOnMock invocation = invocationFor(method);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof Map);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyStringForStringReturnType() throws Throwable {
        Method method = RealClass.class.getMethod("stringMethod");
        InvocationOnMock invocation = invocationFor(method);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertEquals("", result);
    }

    @Test
    public void shouldReturnNullForVoidReturnType() throws Throwable {
        Method method = RealClass.class.getMethod("voidMethod");
        InvocationOnMock invocation = invocationFor(method);

        Object result = returnsSmartNulls.answer(invocation);

        assertNull(result);
    }

    @Test
    public void shouldReturnNullForFinalUnmockableReturnType() throws Throwable {
        Method method = RealClass.class.getMethod("finalMethod");
        InvocationOnMock invocation = invocationFor(method);

        Object result = returnsSmartNulls.answer(invocation);

        assertNull(result);
    }

    @Test
    public void shouldReturnSmartNullForMockableReturnType() throws Throwable {
        Method method = RealClass.class.getMethod("fooMethod");
        InvocationOnMock invocation = invocationFor(method);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof Foo);
    }

    @Test
    public void shouldReturnCustomToStringMessageForSmartNull() throws Throwable {
        Method method = RealClass.class.getMethod("fooMethod");
        InvocationOnMock invocation = invocationFor(method);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        String toStringResult = result.toString();
        assertEquals("SmartNull returned by unstubbed fooMethod() method on mock", toStringResult);
    }

    @Test
    public void shouldThrowExceptionWhenCallingMethodOnSmartNull() throws Throwable {
        Method method = RealClass.class.getMethod("fooMethod");
        InvocationOnMock invocation = invocationFor(method);

        Foo smartNull = (Foo) returnsSmartNulls.answer(invocation);
        assertNotNull(smartNull);

        try {
            smartNull.bar();
            fail("Expected an exception when calling unstubbed method on SmartNull");
        } catch (RuntimeException e) {
            assertEquals("SmartNullPointerException", e.getClass().getSimpleName());
        }
    }

    @Test
    public void shouldThrowExceptionOnlyForNonToStringMethods() throws Throwable {
        Method method = RealClass.class.getMethod("fooMethod");
        InvocationOnMock invocation = invocationFor(method);

        Foo smartNull = (Foo) returnsSmartNulls.answer(invocation);
        assertNotNull(smartNull);

        // toString should not throw
        String result = smartNull.toString();
        assertNotNull(result);
        assertTrue(result.contains("SmartNull returned by unstubbed"));

        // bar() should throw since it's not toString
        try {
            smartNull.bar();
            fail("Expected an exception when calling unstubbed non-toString method on SmartNull");
        } catch (RuntimeException e) {
            assertEquals("SmartNullPointerException", e.getClass().getSimpleName());
        }
    }

    @Test
    public void shouldCreateDifferentSmartNullsForDifferentInvocations() throws Throwable {
        Method method = RealClass.class.getMethod("fooMethod");
        InvocationOnMock invocation1 = invocationFor(method);
        InvocationOnMock invocation2 = invocationFor(method);

        Object result1 = returnsSmartNulls.answer(invocation1);
        Object result2 = returnsSmartNulls.answer(invocation2);

        assertNotNull(result1);
        assertNotNull(result2);
        assertFalse(result1 == result2);
    }
}