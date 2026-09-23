package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.internal.creation.jmock.ClassImposterizer;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.util.ObjectMethodsGuru;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;
import org.mockito.exceptions.Reporter;

import java.io.Serializable;

public class ReturnsSmartNullsTest {
    private ReturnsSmartNulls returnsSmartNulls;

    @Before
    public void setUp() {
        returnsSmartNulls = new ReturnsSmartNulls();
    }

    @After
    public void tearDown() {
        returnsSmartNulls = null;
    }

    @Test
    public void testAnswerWithNonPrimitiveReturnType() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method m = SomeClass.class.getMethod("someMethod");
        Mockito.when(invocation.getMethod()).thenReturn(m);
        Mockito.when(invocation.getMethod().getReturnType()).thenReturn(String.class);
        
        // Since this is a mock, delegate returns null, and type is mockable
        Object result = returnsSmartNulls.answer(invocation);
        assertNotNull(result);
        // It should be a smart null, not null
        assertTrue(result instanceof SomeClass);
    }

    @Test
    public void testAnswerWithPrimitiveReturnType() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method m = SomeClass.class.getMethod("getInt");
        Mockito.when(invocation.getMethod()).thenReturn(m);
        Mockito.when(invocation.getMethod().getReturnType()).thenReturn(int.class);
        
        Object result = returnsSmartNulls.answer(invocation);
        // For primitive types, delegate returns default value (0), not null, so we get Int
        assertEquals(0, result);
    }

    @Test
    public void testAnswerWithFinalClass() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method m = SomeClass.class.getMethod("finalClassMethod");
        Mockito.when(invocation.getMethod()).thenReturn(m);
        Mockito.when(invocation.getMethod().getReturnType()).thenReturn(FinalClass.class);
        
        Object result = returnsSmartNulls.answer(invocation);
        // Final class cannot be mocked, so null is returned
        assertNull(result);
    }

    @Test
    public void testAnswerWhenDelegateReturnsNonNull() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method m = SomeClass.class.getMethod("someMethod");
        Mockito.when(invocation.getMethod()).thenReturn(m);
        Mockito.when(invocation.getMethod().getReturnType()).thenReturn(String.class);
        
        // Override delegate behavior via reflection for testing
        final Object[] delegateResult = new Object[1];
        delegateResult[0] = "hello";
        
        // Use reflection to force delegate to return non-null
        Answer<Object> originalDelegate = new Answer<Object>() {
            public Object answer(InvocationOnMock inv) {
                return "hello";
            }
        };
        
        // Create a custom ReturnsSmartNulls with overridden delegate
        ReturnsSmartNulls custom = new ReturnsSmartNulls() {
            private final Answer<Object> delegate = originalDelegate;
        };
        
        Object result = custom.answer(invocation);
        assertEquals("hello", result);
    }

    @Test(expected = RuntimeException.class)
    public void testAnswerWithThrowingInterceptor() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method m = SomeClass.class.getMethod("someMethod");
        Mockito.when(invocation.getMethod()).thenReturn(m);
        Mockito.when(invocation.getMethod().getReturnType()).thenReturn(NonFinalClass.class);
        
        // Force to return null from delegate, and then interceptor throws
        final Object[] result = new Object[1];
        result[0] = null;
        
        ReturnsSmartNulls custom = new ReturnsSmartNulls() {
            private final Answer<Object> delegate = new Answer<Object>() {
                public Object answer(InvocationOnMock inv) {
                    return null;
                }
            };
        };
        
        Object smartNull = custom.answer(invocation);
        // Now invoke method on smart null, should throw
        Method interceptorMethod = smartNull.getClass().getMethod("someMethod");
        // Use calling interceptor directly
        ThrowingInterceptorTest helper = new ThrowingInterceptorTest();
        helper.testInterceptorThrows();
        fail("Expected RuntimeException");
    }

    @Test
    public void testSupportForDumbNullsForObjectType() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method m = SomeClass.class.getMethod("someMethod");
        Mockito.when(invocation.getMethod()).thenReturn(m);
        Mockito.when(invocation.getMethod().getReturnType()).thenReturn(Object.class);
        
        Object result = returnsSmartNulls.answer(invocation);
        // Object type can be mocked
        assertTrue(result instanceof SomeClass);
    }

    @Test
    public void testReturnNullForPrimitiveWrapper() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method m = SomeClass.class.getMethod("getInteger");
        Mockito.when(invocation.getMethod()).thenReturn(m);
        Mockito.when(invocation.getMethod().getReturnType()).thenReturn(Integer.class);
        
        Object result = returnsSmartNulls.answer(invocation);
        // Integer is not mockable (final wrapper) so null returned
        assertNull(result);
    }

    @Test
    public void testReturnNullForVoidMethod() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Method m = SomeClass.class.getMethod("voidMethod");
        Mockito.when(invocation.getMethod()).thenReturn(m);
        Mockito.when(invocation.getMethod().getReturnType()).thenReturn(void.class);
        
        Object result = returnsSmartNulls.answer(invocation);
        assertNull(result);
    }

    // Helper classes
    interface SomeClass {
        String someMethod();
        int getInt();
        Integer getInteger();
        void voidMethod();
        FinalClass finalClassMethod();
        NonFinalClass nonFinalMethod();
    }

    static class FinalClass {
    }

    static class NonFinalClass {
        public String someMethod() {
            return "called";
        }
    }

    // Test interceptor behavior
    private class ThrowingInterceptorTest {
        public void testInterceptorThrows() throws Throwable {
            InvocationOnMock invocation = mock(InvocationOnMock.class);
            Method m = SomeClass.class.getMethod("someMethod");
            Mockito.when(invocation.getMethod()).thenReturn(m);
            
            ReturnsSmartNulls outer = new ReturnsSmartNulls();
            // Access private inner class via reflection for testing
            Class<?> innerClass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls$ThrowingInterceptor");
            java.lang.reflect.Constructor<?> ctor = innerClass.getDeclaredConstructor(ReturnsSmartNulls.class, InvocationOnMock.class);
            ctor.setAccessible(true);
            Object interceptor = ctor.newInstance(outer, invocation);
            
            Method interceptMethod = innerClass.getMethod("intercept", Object.class, Method.class, Object[].class, MethodProxy.class);
            
            try {
                interceptMethod.invoke(interceptor, new Object(), m, new Object[0], null);
                fail("Expected RuntimeException");
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }
}