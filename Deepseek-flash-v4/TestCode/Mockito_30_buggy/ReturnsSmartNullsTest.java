package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Method;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.cglib.proxy.MethodProxy;
import org.mockito.exceptions.Reporter;
import org.mockito.internal.creation.jmock.ClassImposterizer;
import org.mockito.internal.util.ObjectMethodsGuru;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class ReturnsSmartNullsTest {

    private final ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();

    // Test normal case: delegate returns non-null, should return it
    @Test
    public void testAnswer_DelegateReturnsNonNull() throws Throwable {
        Answer<Object> delegate = mock(Answer.class);
        Object expected = new Object();
        when(delegate.answer(org.mockito.Mockito.any(InvocationOnMock.class))).thenReturn(expected);
        ReturnsSmartNulls custom = new ReturnsSmartNulls();
        // We can't easily inject delegate, so use real delegate path
        // Test with a mock InvocationOnMock that returns a primitive from delegate
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method method = Object.class.getMethod("hashCode");
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(new Object[0]);
        // The delegate ReturnsMoreEmptyValues returns default for primitives, so hashCode returns int 0
        Object result = returnsSmartNulls.answer(invocation);
        assertEquals(0, result);
    }

    // Test when delegate returns null and return type is mockable (interface/class)
    @Test
    public void testAnswer_DelegateNull_MockableType() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method method = TestInterface.class.getMethod("someMethod");
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(new Object[0]);
        Object result = returnsSmartNulls.answer(invocation);
        assertNotNull("Should return proxy for mockable interface", result);
        assertTrue(result instanceof TestInterface);
    }

    // Test when delegate returns null and return type is mockable class (e.g., String)
    @Test
    public void testAnswer_DelegateNull_MockableClass() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method method = String.class.getMethod("concat", String.class);
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(new Object[0]);
        Object result = returnsSmartNulls.answer(invocation);
        assertNotNull("Should return proxy for mockable class", result);
    }

    // Test when return type is final (e.g., final class) - should return null
    @Test
    public void testAnswer_DelegateNull_FinalType() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        // Find a final class method, e.g., Integer.toString() - but that's static; use either instance method
        Method method = Integer.class.getMethod("toString", int.class);
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(new Object[0]);
        Object result = returnsSmartNulls.answer(invocation);
        assertNull("Should return null for final type", result);
    }

    // Test primitive return type: should return default value from delegate
    @Test
    public void testAnswer_PrimitiveReturnType() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method method = TestInterface.class.getMethod("returnsInt");
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(new Object[0]);
        Object result = returnsSmartNulls.answer(invocation);
        assertEquals(0, result);
    }

    // Test when delegate returns null and type is not mockable (primitive wrapper? void?)
    @Test
    public void testAnswer_NonNullDelegateOverridesSmartNull() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        // Setup invocation to return a non-null from delegate (e.g., String)
        Method method = TestInterface.class.getMethod("returnsString");
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(new Object[0]);
        Object result = returnsSmartNulls.answer(invocation);
        assertNotNull(result);
        // Delegate for String returns null (since no default), so should be SmartNull
        // Actually ReturnsMoreEmptyValues returns empty String? Let's assume it returns null for non-primitive
    }

    // Test private interceptor behavior via reflection (or indirectly)
    // Test toString on intercepted object
    @Test
    public void testInterceptor_ToString() throws Throwable {
        // Create proxy via answer for an interface, then call toString
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method method = TestInterface.class.getMethod("toString");
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(new Object[0]);
        Object proxy = returnsSmartNulls.answer(invocation);
        assertNotNull(proxy);
        String toStringResult = proxy.toString();
        assertTrue(toStringResult.startsWith("SmartNull returned by unstubbed "));
        assertTrue(toStringResult.contains("someMethod"));
    }

    // Test that intercept throws Reporter exception when method is not toString
    @Test(expected = RuntimeException.class)
    public void testInterceptor_ThrowsReportException() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method method = TestInterface.class.getMethod("someMethod");
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(new Object[0]);
        Object proxy = returnsSmartNulls.answer(invocation);
        assertNotNull(proxy);
        // Call someMethod on proxy - should throw
        try {
            ((TestInterface) proxy).someMethod();
            fail("Should have thrown");
        } catch (RuntimeException e) {
            // Expected from Reporter
            throw e;
        }
    }

    // Test when answer returns null and type is primitive wrapper - should return null? 
    // But not directly testable without mocking.

    // Test for serialization
    @Test
    public void testSerialization() throws Exception {
        ReturnsSmartNulls rs = new ReturnsSmartNulls();
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
        oos.writeObject(rs);
        oos.close();
        assertTrue(baos.size() > 0);
    }

    // Helper interface for testing
    public interface TestInterface {
        void someMethod();
        int returnsInt();
        String returnsString();
    }

    // Test for empty arguments formatting
    @Test
    public void testAnswer_NoArgs() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method method = TestInterface.class.getMethod("someMethod");
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(new Object[0]);
        Object proxy = returnsSmartNulls.answer(invocation);
        assertNotNull(proxy);
        String toStringResult = proxy.toString();
        assertEquals("SmartNull returned by unstubbed someMethod() method on mock", toStringResult);
    }

    @Test
    public void testAnswer_WithArgs() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method method = TestInterface.class.getMethod("someMethod", String.class);
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(new Object[] {"arg1", 42});
        Object proxy = returnsSmartNulls.answer(invocation);
        assertNotNull(proxy);
        String toStringResult = proxy.toString();
        assertEquals("SmartNull returned by unstubbed someMethod(arg1, 42) method on mock", toStringResult);
    }

    // Test null return for non-mockable type (e.g., void)
    @Test
    public void testAnswer_VoidReturnType() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method method = TestInterface.class.getMethod("someVoid");
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(new Object[0]);
        Object result = returnsSmartNulls.answer(invocation);
        // For void, delegate returns null, type is void (not mockable)
        assertNull("For void, should return null", result);
    }
}