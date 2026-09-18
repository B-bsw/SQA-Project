package org.mockito.internal.creation;

import org.junit.Test;
import org.junit.Before;

import java.lang.reflect.Method;
import java.io.IOException;

import static org.junit.Assert.*;

public class DelegatingMethodTest {

    public interface SampleInterface {
        void abstractMethod();
    }

    public static class SampleClass {
        public void simpleMethod() {
        }

        public void methodWithException() throws IOException {
        }

        public void varArgsMethod(String... args) {
        }

        public int methodWithParams(int a, String b) {
            return a;
        }

        public String returnTypeMethod() {
            return "hello";
        }
    }

    private Method simpleMethod;
    private Method methodWithException;
    private Method varArgsMethod;
    private Method methodWithParams;
    private Method returnTypeMethod;
    private Method abstractMethod;

    @Before
    public void setUp() throws Exception {
        simpleMethod = SampleClass.class.getMethod("simpleMethod");
        methodWithException = SampleClass.class.getMethod("methodWithException");
        varArgsMethod = SampleClass.class.getMethod("varArgsMethod", String[].class);
        methodWithParams = SampleClass.class.getMethod("methodWithParams", int.class, String.class);
        returnTypeMethod = SampleClass.class.getMethod("returnTypeMethod");
        abstractMethod = SampleInterface.class.getMethod("abstractMethod");
    }

    @Test
    public void shouldConstructWithValidMethod() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertNotNull(delegatingMethod);
        assertEquals(simpleMethod, delegatingMethod.getJavaMethod());
    }

    @Test
    public void shouldGetExceptionTypesWhenNoneDeclared() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        Class<?>[] exceptionTypes = delegatingMethod.getExceptionTypes();
        assertNotNull(exceptionTypes);
        assertEquals(0, exceptionTypes.length);
    }

    @Test
    public void shouldGetExceptionTypesWhenOneDeclared() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(methodWithException);
        Class<?>[] exceptionTypes = delegatingMethod.getExceptionTypes();
        assertNotNull(exceptionTypes);
        assertEquals(1, exceptionTypes.length);
        assertEquals(IOException.class, exceptionTypes[0]);
    }

    @Test
    public void shouldGetJavaMethod() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(methodWithParams);
        assertSame(methodWithParams, delegatingMethod.getJavaMethod());
    }

    @Test
    public void shouldGetName() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertEquals("simpleMethod", delegatingMethod.getName());
    }

    @Test
    public void shouldGetParameterTypesWhenNoneDeclared() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        Class<?>[] paramTypes = delegatingMethod.getParameterTypes();
        assertNotNull(paramTypes);
        assertEquals(0, paramTypes.length);
    }

    @Test
    public void shouldGetParameterTypesWhenMultipleDeclared() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(methodWithParams);
        Class<?>[] paramTypes = delegatingMethod.getParameterTypes();
        assertNotNull(paramTypes);
        assertEquals(2, paramTypes.length);
        assertEquals(int.class, paramTypes[0]);
        assertEquals(String.class, paramTypes[1]);
    }

    @Test
    public void shouldGetReturnTypeVoid() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertEquals(void.class, delegatingMethod.getReturnType());
    }

    @Test
    public void shouldGetReturnTypeNonVoid() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(returnTypeMethod);
        assertEquals(String.class, delegatingMethod.getReturnType());
    }

    @Test
    public void shouldReturnTrueForVarArgsMethod() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(varArgsMethod);
        assertTrue(delegatingMethod.isVarArgs());
    }

    @Test
    public void shouldReturnFalseForNonVarArgsMethod() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertFalse(delegatingMethod.isVarArgs());
    }

    @Test
    public void shouldReturnTrueForAbstractMethod() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(abstractMethod);
        assertTrue(delegatingMethod.isAbstract());
    }

    @Test
    public void shouldReturnFalseForNonAbstractMethod() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertFalse(delegatingMethod.isAbstract());
    }

    @Test
    public void shouldBeEqualWhenSameUnderlyingMethod() {
        DelegatingMethod delegatingMethod1 = new DelegatingMethod(simpleMethod);
        DelegatingMethod delegatingMethod2 = new DelegatingMethod(simpleMethod);
        assertTrue(delegatingMethod1.equals(delegatingMethod2));
    }

    @Test
    public void shouldNotBeEqualWhenDifferentUnderlyingMethod() {
        DelegatingMethod delegatingMethod1 = new DelegatingMethod(simpleMethod);
        DelegatingMethod delegatingMethod2 = new DelegatingMethod(methodWithParams);
        assertFalse(delegatingMethod1.equals(delegatingMethod2));
    }

    @Test
    public void shouldBeEqualToPlainMethodObject() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertTrue(delegatingMethod.equals(simpleMethod));
    }

    @Test
    public void shouldNotBeEqualToNull() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertFalse(delegatingMethod.equals(null));
    }

    @Test
    public void shouldNotBeEqualToUnrelatedObject() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertFalse(delegatingMethod.equals("someString"));
    }

    @Test
    public void shouldHaveConstantHashCode() {
        DelegatingMethod delegatingMethod1 = new DelegatingMethod(simpleMethod);
        DelegatingMethod delegatingMethod2 = new DelegatingMethod(methodWithParams);
        assertEquals(1, delegatingMethod1.hashCode());
        assertEquals(1, delegatingMethod2.hashCode());
        assertEquals(delegatingMethod1.hashCode(), delegatingMethod2.hashCode());
    }
}