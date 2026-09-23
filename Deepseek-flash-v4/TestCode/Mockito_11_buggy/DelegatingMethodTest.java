package org.mockito.internal.creation;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DelegatingMethodTest {
    
    private Method normalMethod;
    private Method varArgsMethod;
    private Method abstractMethod;
    private Method finalMethod;
    private DelegatingMethod delegatingMethod;
    
    @Before
    public void setUp() throws Exception {
        normalMethod = TestClass.class.getMethod("normalMethod", String.class, int.class);
        varArgsMethod = TestClass.class.getMethod("varArgsMethod", String[].class);
        abstractMethod = TestClass.class.getMethod("abstractMethod");
        finalMethod = TestClass.class.getMethod("finalMethod");
        delegatingMethod = new DelegatingMethod(normalMethod);
    }
    
    @After
    public void tearDown() {
        normalMethod = null;
        varArgsMethod = null;
        abstractMethod = null;
        finalMethod = null;
        delegatingMethod = null;
    }
    
    @Test
    public void testConstructorWithNonNullMethod() {
        assertNotNull("Constructor should accept non-null method", new DelegatingMethod(normalMethod));
    }
    
    @Test(expected = AssertionError.class)
    public void testConstructorWithNullMethod() {
        new DelegatingMethod(null);
    }
    
    @Test
    public void testGetExceptionTypesWithNoExceptions() {
        Method method = null;
        try {
            method = TestClass.class.getMethod("noExceptionMethod");
        } catch (Exception e) {
            fail("Should not throw exception");
        }
        DelegatingMethod dm = new DelegatingMethod(method);
        assertNotNull("Exception types should not be null", dm.getExceptionTypes());
        assertEquals("Should have 0 exception types", 0, dm.getExceptionTypes().length);
    }
    
    @Test
    public void testGetExceptionTypesWithExceptions() throws Exception {
        Method method = TestClass.class.getMethod("exceptionMethod");
        DelegatingMethod dm = new DelegatingMethod(method);
        Class<?>[] exceptionTypes = dm.getExceptionTypes();
        assertNotNull("Exception types should not be null", exceptionTypes);
        assertEquals("Should have 1 exception type", 1, exceptionTypes.length);
        assertEquals("Should be IllegalArgumentException", IllegalArgumentException.class, exceptionTypes[0]);
    }
    
    @Test
    public void testGetJavaMethod() {
        Method returned = delegatingMethod.getJavaMethod();
        assertNotNull("Java method should not be null", returned);
        assertSame("Should return the same method object", normalMethod, returned);
        assertEquals("Should return the correct method name", "normalMethod", returned.getName());
    }
    
    @Test
    public void testGetName() {
        assertEquals("Should return method name", "normalMethod", delegatingMethod.getName());
        
        DelegatingMethod dm = new DelegatingMethod(varArgsMethod);
        assertEquals("Should return varargs method name", "varArgsMethod", dm.getName());
    }
    
    @Test
    public void testGetParameterTypes() {
        Class<?>[] paramTypes = delegatingMethod.getParameterTypes();
        assertNotNull("Parameter types should not be null", paramTypes);
        assertEquals("Should have 2 parameters", 2, paramTypes.length);
        assertEquals("First parameter should be String", String.class, paramTypes[0]);
        assertEquals("Second parameter should be int", int.class, paramTypes[1]);
    }
    
    @Test
    public void testGetParameterTypesForNoParamMethod() throws Exception {
        Method method = TestClass.class.getMethod("noParamMethod");
        DelegatingMethod dm = new DelegatingMethod(method);
        Class<?>[] paramTypes = dm.getParameterTypes();
        assertNotNull("Parameter types should not be null", paramTypes);
        assertEquals("Should have 0 parameters", 0, paramTypes.length);
    }
    
    @Test
    public void testGetReturnType() {
        assertEquals("Should return String return type", String.class, delegatingMethod.getReturnType());
        
        try {
            Method method = TestClass.class.getMethod("noParamMethod");
            DelegatingMethod dm = new DelegatingMethod(method);
            assertEquals("Should return void return type", void.class, dm.getReturnType());
        } catch (Exception e) {
            fail("Should not throw exception");
        }
    }
    
    @Test
    public void testIsVarArgsForVarArgsMethod() {
        DelegatingMethod dm = new DelegatingMethod(varArgsMethod);
        assertTrue("Should be varargs method", dm.isVarArgs());
    }
    
    @Test
    public void testIsVarArgsForRegularMethod() {
        assertFalse("Should not be varargs method", delegatingMethod.isVarArgs());
    }
    
    @Test
    public void testIsAbstractForAbstractMethod() {
        DelegatingMethod dm = new DelegatingMethod(abstractMethod);
        assertTrue("Should be abstract method", dm.isAbstract());
    }
    
    @Test
    public void testIsAbstractForConcreteMethod() {
        assertFalse("Should not be abstract method", delegatingMethod.isAbstract());
    }
    
    @Test
    public void testIsAbstractForFinalMethod() {
        DelegatingMethod dm = new DelegatingMethod(finalMethod);
        assertFalse("Final method should not be abstract", dm.isAbstract());
    }
    
    @Test
    public void testEqualsWithSameDelegatingMethod() {
        assertTrue("Should equal itself", delegatingMethod.equals(delegatingMethod));
        DelegatingMethod sameMethod = new DelegatingMethod(normalMethod);
        assertTrue("Should equal DelegatingMethod with same underlying Method", delegatingMethod.equals(sameMethod));
    }
    
    @Test
    public void testEqualsWithDifferentDelegatingMethod() {
        try {
            Method differentMethod = TestClass.class.getMethod("noParamMethod");
            DelegatingMethod different = new DelegatingMethod(differentMethod);
            assertFalse("Should not equal different DelegatingMethod", delegatingMethod.equals(different));
        } catch (Exception e) {
            fail("Should not throw exception");
        }
    }
    
    @Test
    public void testEqualsWithMethodObject() {
        assertTrue("Should equal the underlying Method object", delegatingMethod.equals(normalMethod));
    }
    
    @Test
    public void testEqualsWithNull() {
        assertFalse("Should not equal null", delegatingMethod.equals(null));
    }
    
    @Test
    public void testEqualsWithNonMethodObject() {
        assertFalse("Should not equal non-Method object", delegatingMethod.equals("some string"));
    }
    
    @Test
    public void testHashCode() {
        assertEquals("HashCode should always return 1", 1, delegatingMethod.hashCode());
    }
    
    @Test
    public void testMethodWithPrimeNumbers() throws Exception {
        Method primeMethod = TestClass.class.getMethod("primeNumberMethod", int.class);
        DelegatingMethod dm = new DelegatingMethod(primeMethod);
        assertEquals("Should return correct method name", "primeNumberMethod", dm.getName());
        assertEquals("Should return correct parameter count", 1, dm.getParameterTypes().length);
        assertEquals("Should return correct parameter type", int.class, dm.getParameterTypes()[0]);
        assertEquals("Should return correct return type", boolean.class, dm.getReturnType());
    }
    
    @SuppressWarnings("unused")
    private static abstract class TestClass {
        
        public String normalMethod(String str, int num) {
            return str + num;
        }
        
        public void varArgsMethod(String... strings) {
        }
        
        public abstract void abstractMethod();
        
        public final void finalMethod() {
        }
        
        public void noExceptionMethod() {
        }
        
        public void exceptionMethod() throws IllegalArgumentException {
            throw new IllegalArgumentException("Expected exception");
        }
        
        public void noParamMethod() {
        }
        
        public boolean primeNumberMethod(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}