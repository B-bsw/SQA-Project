package org.mockito.internal.invocation;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.reporting.PrintSettings;

public class InvocationTest {

    public interface TestInterface {
        void voidMethod();
        String stringMethod(String arg);
        int primitiveMethod();
        void throwsMethod() throws IOException;
        void varargMethod(String prefix, String... rest);
    }

    private Method voidMethod;
    private Method stringMethod;
    private Method primitiveMethod;
    private Method throwsMethod;
    private Method varargMethod;

    private Object mockObject;

    @Before
    public void setUp() throws Exception {
        mockObject = "mockInstance";

        voidMethod = TestInterface.class.getMethod("voidMethod", new Class<?>[0]);
        stringMethod = TestInterface.class.getMethod("stringMethod", new Class<?>[] { String.class });
        primitiveMethod = TestInterface.class.getMethod("primitiveMethod", new Class<?>[0]);
        throwsMethod = TestInterface.class.getMethod("throwsMethod", new Class<?>[0]);
        varargMethod = TestInterface.class.getMethod("varargMethod", new Class<?>[] { String.class, String[].class });
    }

    @Test
    public void constructor_givenNormalMethod_shouldInitializeFields() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(stringMethod);
        RealMethod realMethod = createRealMethod("realResult");
        Object[] args = new Object[] { "param1" };

        // Act
        Invocation invocation = new Invocation(mockObject, mockitoMethod, args, 1, realMethod);

        // Assert
        Assert.assertSame(mockObject, invocation.getMock());
        Assert.assertSame(mockitoMethod, invocation.getMethod());
        Assert.assertEquals(1, invocation.getArguments().length);
        Assert.assertEquals("param1", invocation.getArguments()[0]);
        Assert.assertArrayEquals(args, invocation.getRawArguments());
        Assert.assertEquals(Integer.valueOf(1), invocation.getSequenceNumber());
        Assert.assertFalse(invocation.isVerified());
        Assert.assertFalse(invocation.isVerifiedInOrder());
    }

    @Test
    public void constructor_givenVarArgs_shouldExpandVarArgs() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(varargMethod);
        RealMethod realMethod = createRealMethod(null);
        Object[] args = new Object[] { "first", new String[] { "second", "third" } };

        // Act
        Invocation invocation = new Invocation(mockObject, mockitoMethod, args, 1, realMethod);

        // Assert
        Object[] expanded = invocation.getArguments();
        Assert.assertEquals(3, expanded.length);
        Assert.assertEquals("first", expanded[0]);
        Assert.assertEquals("second", expanded[1]);
        Assert.assertEquals("third", expanded[2]);
        Assert.assertEquals(2, invocation.getRawArguments().length);
    }

    @Test
    public void markVerified_shouldChangeVerifiedStatusToTrue() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(voidMethod);
        Invocation invocation = new Invocation(mockObject, mockitoMethod, new Object[0], 1, createRealMethod(null));

        // Act
        invocation.markVerified();

        // Assert
        Assert.assertTrue(invocation.isVerified());
        Assert.assertFalse(invocation.isVerifiedInOrder());
    }

    @Test
    public void markVerifiedInOrder_shouldChangeBothVerifiedAndVerifiedInOrder() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(voidMethod);
        Invocation invocation = new Invocation(mockObject, mockitoMethod, new Object[0], 1, createRealMethod(null));

        // Act
        invocation.markVerifiedInOrder();

        // Assert
        Assert.assertTrue(invocation.isVerified());
        Assert.assertTrue(invocation.isVerifiedInOrder());
    }

    @Test
    public void equals_givenSameAttributes_shouldReturnTrue() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(stringMethod);
        RealMethod realMethod = createRealMethod(null);
        Invocation inv1 = new Invocation(mockObject, mockitoMethod, new Object[] { "a" }, 1, realMethod);
        Invocation inv2 = new Invocation(mockObject, mockitoMethod, new Object[] { "a" }, 2, realMethod);

        // Act & Assert
        Assert.assertTrue(inv1.equals(inv2));
    }

    @Test
    public void equals_givenDifferentMockOrArgs_shouldReturnFalse() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(stringMethod);
        RealMethod realMethod = createRealMethod(null);
        Invocation inv1 = new Invocation(mockObject, mockitoMethod, new Object[] { "a" }, 1, realMethod);
        Invocation invDiffMock = new Invocation("otherMock", mockitoMethod, new Object[] { "a" }, 1, realMethod);
        Invocation invDiffArgs = new Invocation(mockObject, mockitoMethod, new Object[] { "b" }, 1, realMethod);

        // Act & Assert
        Assert.assertFalse(inv1.equals(invDiffMock));
        Assert.assertFalse(inv1.equals(invDiffArgs));
        Assert.assertFalse(inv1.equals(null));
        Assert.assertFalse(inv1.equals("notAnInvocation"));
    }

    @Test(expected = RuntimeException.class)
    public void hashCode_shouldThrowRuntimeException() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(voidMethod);
        Invocation invocation = new Invocation(mockObject, mockitoMethod, new Object[0], 1, createRealMethod(null));

        // Act
        invocation.hashCode();
    }

    @Test
    public void isVoid_givenVoidMethod_shouldReturnTrue() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(voidMethod);
        Invocation invocation = new Invocation(mockObject, mockitoMethod, new Object[0], 1, createRealMethod(null));

        // Act & Assert
        Assert.assertTrue(invocation.isVoid());
    }

    @Test
    public void isVoid_givenNonVoidMethod_shouldReturnFalse() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(stringMethod);
        Invocation invocation = new Invocation(mockObject, mockitoMethod, new Object[] { "arg" }, 1, createRealMethod(null));

        // Act & Assert
        Assert.assertFalse(invocation.isVoid());
    }

    @Test
    public void returnsPrimitive_givenPrimitiveMethod_shouldReturnTrue() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(primitiveMethod);
        Invocation invocation = new Invocation(mockObject, mockitoMethod, new Object[0], 1, createRealMethod(null));

        // Act & Assert
        Assert.assertTrue(invocation.returnsPrimitive());
    }

    @Test
    public void returnsPrimitive_givenObjectMethod_shouldReturnFalse() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(stringMethod);
        Invocation invocation = new Invocation(mockObject, mockitoMethod, new Object[] { "arg" }, 1, createRealMethod(null));

        // Act & Assert
        Assert.assertFalse(invocation.returnsPrimitive());
    }

    @Test
    public void isValidReturnType_givenCompatibleType_shouldReturnTrue() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(stringMethod);
        Invocation invocation = new Invocation(mockObject, mockitoMethod, new Object[] { "arg" }, 1, createRealMethod(null));

        // Act & Assert
        Assert.assertTrue(invocation.isValidReturnType(String.class));
    }

    @Test
    public void isValidReturnType_givenIncompatibleType_shouldReturnFalse() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(stringMethod);
        Invocation invocation = new Invocation(mockObject, mockitoMethod, new Object[] { "arg" }, 1, createRealMethod(null));

        // Act & Assert
        Assert.assertFalse(invocation.isValidReturnType(Integer.class));
    }

    @Test
    public void isValidException_givenDeclaredCheckedException_shouldReturnTrue() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(throwsMethod);
        Invocation invocation = new Invocation(mockObject, mockitoMethod, new Object[0], 1, createRealMethod(null));

        // Act & Assert
        Assert.assertTrue(invocation.isValidException(new IOException("test")));
    }

    @Test
    public void isValidException_givenUndeclaredCheckedException_shouldReturnFalse() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(voidMethod);
        Invocation invocation = new Invocation(mockObject, mockitoMethod, new Object[0], 1, createRealMethod(null));

        // Act & Assert
        Assert.assertFalse(invocation.isValidException(new Exception("undeclared")));
    }

    @Test
    public void callRealMethod_shouldInvokeRealMethod() throws Throwable {
        // Arrange
        final boolean[] invoked = new boolean[] { false };
        RealMethod realMethod = new RealMethod() {
            public Object invoke(Object target, Object[] args) throws Throwable {
                invoked[0] = true;
                return "executed";
            }
        };
        MockitoMethod mockitoMethod = createMockitoMethod(stringMethod);
        Invocation invocation = new Invocation(mockObject, mockitoMethod, new Object[] { "arg" }, 1, realMethod);

        // Act
        Object result = invocation.callRealMethod();

        // Assert
        Assert.assertTrue(invoked[0]);
        Assert.assertEquals("executed", result);
    }

    @Test
    public void toString_shouldReturnDescriptiveString() {
        // Arrange
        MockitoMethod mockitoMethod = createMockitoMethod(stringMethod);
        Invocation invocation = new Invocation(mockObject, mockitoMethod, new Object[] { "hello" }, 1, createRealMethod(null));

        // Act
        String result = invocation.toString();
        String resultWithSettings = invocation.toString(new PrintSettings());

        // Assert
        Assert.assertNotNull(result);
        Assert.assertNotNull(resultWithSettings);
    }

    private static MockitoMethod createMockitoMethod(final Method method) {
        return (MockitoMethod) Proxy.newProxyInstance(
                MockitoMethod.class.getClassLoader(),
                new Class<?>[] { MockitoMethod.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method invokedMethod, Object[] args) throws Throwable {
                        String name = invokedMethod.getName();
                        if ("getMethod".equals(name)) {
                            return method;
                        } else if ("getName".equals(name)) {
                            return method.getName();
                        } else if ("getReturnType".equals(name)) {
                            return method.getReturnType();
                        } else if ("getParameterTypes".equals(name)) {
                            return method.getParameterTypes();
                        } else if ("getExceptionTypes".equals(name)) {
                            return method.getExceptionTypes();
                        } else if ("isVarArgs".equals(name)) {
                            return Boolean.valueOf(method.isVarArgs());
                        } else if ("equals".equals(name)) {
                            return Boolean.valueOf(proxy == args[0]);
                        } else if ("hashCode".equals(name)) {
                            return Integer.valueOf(System.identityHashCode(proxy));
                        }
                        return null;
                    }
                }
        );
    }

    private static RealMethod createRealMethod(final Object returnVal) {
        return new RealMethod() {
            public Object invoke(Object target, Object[] args) throws Throwable {
                return returnVal;
            }
        };
    }
}
