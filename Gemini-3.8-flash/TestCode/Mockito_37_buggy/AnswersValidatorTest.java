package org.mockito.internal.stubbing.answers;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.invocation.Invocation;
import org.mockito.stubbing.Answer;
import org.mockito.invocation.InvocationOnMock;

public class AnswersValidatorTest {

    private AnswersValidator validator;

    public interface TestTarget {
        void voidMethod();
        void voidMethodWithThrows() throws IOException;
        String stringMethod();
        String stringMethodWithThrows() throws IOException;
        int intMethod();
        boolean booleanMethod();
    }

    @Before
    public void setUp() {
        validator = new AnswersValidator();
    }

    @Test
    public void validate_givenCustomAnswer_shouldDoNothing() throws Exception {
        // Arrange
        Invocation invocation = createInvocation("stringMethod", new Class<?>[0], new Object[0]);
        Answer<String> customAnswer = new Answer<String>() {
            public String answer(InvocationOnMock invocation) {
                return "custom";
            }
        };

        // Act & Assert (Should not throw)
        validator.validate(customAnswer, invocation);
    }

    @Test
    public void validate_givenDoesNothingOnVoidMethod_shouldPass() throws Exception {
        // Arrange
        Invocation invocation = createInvocation("voidMethod", new Class<?>[0], new Object[0]);
        DoesNothing doesNothing = new DoesNothing();

        // Act & Assert
        validator.validate(doesNothing, invocation);
    }

    @Test
    public void validate_givenDoesNothingOnNonVoidMethod_shouldThrowMockitoException() throws Exception {
        // Arrange
        Invocation invocation = createInvocation("stringMethod", new Class<?>[0], new Object[0]);
        DoesNothing doesNothing = new DoesNothing();

        // Act & Assert
        try {
            validator.validate(doesNothing, invocation);
            Assert.fail("Expected MockitoException when setting DoesNothing on non-void method");
        } catch (MockitoException ex) {
            Assert.assertTrue(ex.getMessage().contains("Only void methods can doNothing()"));
        }
    }

    @Test
    public void validate_givenReturnsOnVoidMethod_shouldThrowMockitoException() throws Exception {
        // Arrange
        Invocation invocation = createInvocation("voidMethod", new Class<?>[0], new Object[0]);
        Returns returns = new Returns("something");

        // Act & Assert
        try {
            validator.validate(returns, invocation);
            Assert.fail("Expected MockitoException when stubbing void method with a return value");
        } catch (MockitoException ex) {
            Assert.assertTrue(ex.getMessage().contains("Cannot stub void method with a return value"));
        }
    }

    @Test
    public void validate_givenReturnsNullOnPrimitiveMethod_shouldThrowMockitoException() throws Exception {
        // Arrange
        Invocation invocation = createInvocation("intMethod", new Class<?>[0], new Object[0]);
        Returns returns = new Returns(null);

        // Act & Assert
        try {
            validator.validate(returns, invocation);
            Assert.fail("Expected MockitoException when returning null for primitive return type");
        } catch (MockitoException ex) {
            Assert.assertTrue(ex.getMessage().contains("wrong type"));
        }
    }

    @Test
    public void validate_givenReturnsNullOnObjectMethod_shouldPass() throws Exception {
        // Arrange
        Invocation invocation = createInvocation("stringMethod", new Class<?>[0], new Object[0]);
        Returns returns = new Returns(null);

        // Act & Assert
        validator.validate(returns, invocation);
    }

    @Test
    public void validate_givenReturnsCompatibleType_shouldPass() throws Exception {
        // Arrange
        Invocation invocation = createInvocation("stringMethod", new Class<?>[0], new Object[0]);
        Returns returns = new Returns("validString");

        // Act & Assert
        validator.validate(returns, invocation);
    }

    @Test
    public void validate_givenReturnsIncompatibleType_shouldThrowMockitoException() throws Exception {
        // Arrange
        Invocation invocation = createInvocation("stringMethod", new Class<?>[0], new Object[0]);
        Returns returns = new Returns(Integer.valueOf(42));

        // Act & Assert
        try {
            validator.validate(returns, invocation);
            Assert.fail("Expected MockitoException when returning incompatible type");
        } catch (MockitoException ex) {
            Assert.assertTrue(ex.getMessage().contains("cannot be returned by"));
        }
    }

    @Test
    public void validate_givenThrowsExceptionWithNullThrowable_shouldThrowMockitoException() throws Exception {
        // Arrange
        Invocation invocation = createInvocation("stringMethod", new Class<?>[0], new Object[0]);
        ThrowsException throwsException = new ThrowsException(null);

        // Act & Assert
        try {
            validator.validate(throwsException, invocation);
            Assert.fail("Expected MockitoException when stubbing with null Throwable");
        } catch (MockitoException ex) {
            Assert.assertTrue(ex.getMessage().contains("Cannot stub with null throwable"));
        }
    }

    @Test
    public void validate_givenThrowsRuntimeException_shouldPass() throws Exception {
        // Arrange
        Invocation invocation = createInvocation("stringMethod", new Class<?>[0], new Object[0]);
        ThrowsException throwsException = new ThrowsException(new IllegalArgumentException("runtime"));

        // Act & Assert
        validator.validate(throwsException, invocation);
    }

    @Test
    public void validate_givenThrowsError_shouldPass() throws Exception {
        // Arrange
        Invocation invocation = createInvocation("stringMethod", new Class<?>[0], new Object[0]);
        ThrowsException throwsException = new ThrowsException(new AssertionError("error"));

        // Act & Assert
        validator.validate(throwsException, invocation);
    }

    @Test
    public void validate_givenThrowsDeclaredCheckedException_shouldPass() throws Exception {
        // Arrange
        Invocation invocation = createInvocation("stringMethodWithThrows", new Class<?>[0], new Object[0]);
        ThrowsException throwsException = new ThrowsException(new IOException("checked"));

        // Act & Assert
        validator.validate(throwsException, invocation);
    }

    @Test
    public void validate_givenThrowsUndeclaredCheckedException_shouldThrowMockitoException() throws Exception {
        // Arrange
        Invocation invocation = createInvocation("stringMethod", new Class<?>[0], new Object[0]);
        ThrowsException throwsException = new ThrowsException(new IOException("checked not declared"));

        // Act & Assert
        try {
            validator.validate(throwsException, invocation);
            Assert.fail("Expected MockitoException when throwing undeclared checked exception");
        } catch (MockitoException ex) {
            Assert.assertTrue(ex.getMessage().contains("Checked exception is invalid for this method"));
        }
    }

    // Helper to dynamically create an Invocation test instance
    private static Invocation createInvocation(String methodName, Class<?>[] paramTypes, Object[] args) throws Exception {
        Method method = TestTarget.class.getMethod(methodName, paramTypes);
        Object mock = "testMockTarget";

        for (Constructor<?> constructor : Invocation.class.getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] parameterValues = new Object[parameterTypes.length];
            boolean compatible = true;

            for (int j = 0; j < parameterTypes.length; j++) {
                Class<?> paramType = parameterTypes[j];
                if (paramType.isAssignableFrom(mock.getClass())) {
                    parameterValues[j] = mock;
                } else if (paramType.getName().endsWith("MockitoMethod")) {
                    parameterValues[j] = createMockitoMethodProxy(method, paramType);
                } else if (paramType.isArray() && paramType.getComponentType() == Object.class) {
                    parameterValues[j] = (args != null) ? args : new Object[0];
                } else if (paramType == int.class || paramType == Integer.class) {
                    parameterValues[j] = Integer.valueOf(1);
                } else if (paramType.getName().endsWith("RealMethod")) {
                    parameterValues[j] = createRealMethodProxy(paramType);
                } else {
                    parameterValues[j] = null;
                }
            }

            if (compatible) {
                try {
                    return (Invocation) constructor.newInstance(parameterValues);
                } catch (Exception ignored) {
                }
            }
        }
        throw new IllegalStateException("Failed to construct Invocation test double.");
    }

    private static Object createMockitoMethodProxy(final Method method, Class<?> mockitoMethodInterface) {
        return Proxy.newProxyInstance(
                mockitoMethodInterface.getClassLoader(),
                new Class<?>[] { mockitoMethodInterface },
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

    private static Object createRealMethodProxy(Class<?> realMethodInterface) {
        return Proxy.newProxyInstance(
                realMethodInterface.getClassLoader(),
                new Class<?>[] { realMethodInterface },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method invokedMethod, Object[] args) throws Throwable {
                        return null;
                    }
                }
        );
    }
}
