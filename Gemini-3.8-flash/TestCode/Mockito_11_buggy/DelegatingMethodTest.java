package org.mockito.internal.creation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;

public class DelegatingMethodTest {

    private interface SampleInterface {
        void abstractMethod();
        String varArgsMethod(int count, String... items);
        int throwsExceptionsMethod() throws IOException, SQLException;
        void noExceptionMethod();
    }

    private static class SampleClass implements SampleInterface {
        public void abstractMethod() {
        }

        public String varArgsMethod(int count, String... items) {
            return "";
        }

        public int throwsExceptionsMethod() throws IOException, SQLException {
            return 0;
        }

        public void noExceptionMethod() {
        }

        public void concreteMethod() {
        }
    }

    private Method concreteMethod;
    private Method abstractMethod;
    private Method varArgsMethod;
    private Method throwsExceptionsMethod;
    private Method noExceptionMethod;

    @Before
    public void setUp() throws Exception {
        concreteMethod = SampleClass.class.getMethod("concreteMethod", new Class[0]);
        abstractMethod = SampleInterface.class.getMethod("abstractMethod", new Class[0]);
        varArgsMethod = SampleInterface.class.getMethod("varArgsMethod", new Class[]{int.class, String[].class});
        throwsExceptionsMethod = SampleInterface.class.getMethod("throwsExceptionsMethod", new Class[0]);
        noExceptionMethod = SampleInterface.class.getMethod("noExceptionMethod", new Class[0]);
    }

    @Test
    public void constructor_givenValidMethod_shouldInstantiateProperly() {
        // Arrange
        Method targetMethod = concreteMethod;

        // Act
        DelegatingMethod delegatingMethod = new DelegatingMethod(targetMethod);

        // Assert
        Assert.assertNotNull(delegatingMethod);
        Assert.assertSame(targetMethod, delegatingMethod.getJavaMethod());
    }

    @Test
    public void getJavaMethod_givenDelegatingMethod_shouldReturnExactUnderlyingMethod() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(concreteMethod);

        // Act
        Method result = delegatingMethod.getJavaMethod();

        // Assert
        Assert.assertSame(concreteMethod, result);
    }

    @Test
    public void getName_givenMethod_shouldReturnCorrectMethodName() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(concreteMethod);

        // Act
        String methodName = delegatingMethod.getName();

        // Assert
        Assert.assertEquals("concreteMethod", methodName);
    }

    @Test
    public void getReturnType_givenVoidMethod_shouldReturnVoidClass() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(concreteMethod);

        // Act
        Class returnType = delegatingMethod.getReturnType();

        // Assert
        Assert.assertEquals(void.class, returnType);
    }

    @Test
    public void getReturnType_givenNonVoidMethod_shouldReturnPrimitiveIntClass() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(throwsExceptionsMethod);

        // Act
        Class returnType = delegatingMethod.getReturnType();

        // Assert
        Assert.assertEquals(int.class, returnType);
    }

    @Test
    public void getParameterTypes_givenMethodWithNoParameters_shouldReturnEmptyArray() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(concreteMethod);

        // Act
        Class[] paramTypes = delegatingMethod.getParameterTypes();

        // Assert
        Assert.assertNotNull(paramTypes);
        Assert.assertEquals(0, paramTypes.length);
    }

    @Test
    public void getParameterTypes_givenMethodWithParameters_shouldReturnMatchingParameterTypes() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(varArgsMethod);

        // Act
        Class[] paramTypes = delegatingMethod.getParameterTypes();

        // Assert
        Assert.assertNotNull(paramTypes);
        Assert.assertEquals(2, paramTypes.length);
        Assert.assertEquals(int.class, paramTypes[0]);
        Assert.assertEquals(String[].class, paramTypes[1]);
    }

    @Test
    public void getExceptionTypes_givenMethodThrowingMultipleExceptions_shouldReturnDeclaredExceptions() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(throwsExceptionsMethod);

        // Act
        Class[] exceptions = delegatingMethod.getExceptionTypes();

        // Assert
        Assert.assertNotNull(exceptions);
        Assert.assertEquals(2, exceptions.length);
        Assert.assertEquals(IOException.class, exceptions[0]);
        Assert.assertEquals(SQLException.class, exceptions[1]);
    }

    @Test
    public void getExceptionTypes_givenMethodThrowingNoExceptions_shouldReturnEmptyArray() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(noExceptionMethod);

        // Act
        Class[] exceptions = delegatingMethod.getExceptionTypes();

        // Assert
        Assert.assertNotNull(exceptions);
        Assert.assertEquals(0, exceptions.length);
    }

    @Test
    public void isVarArgs_givenVarArgsMethod_shouldReturnTrue() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(varArgsMethod);

        // Act
        boolean isVarArgs = delegatingMethod.isVarArgs();

        // Assert
        Assert.assertTrue(isVarArgs);
    }

    @Test
    public void isVarArgs_givenNonVarArgsMethod_shouldReturnFalse() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(concreteMethod);

        // Act
        boolean isVarArgs = delegatingMethod.isVarArgs();

        // Assert
        Assert.assertFalse(isVarArgs);
    }

    @Test
    public void isAbstract_givenInterfaceAbstractMethod_shouldReturnTrue() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(abstractMethod);

        // Act
        boolean isAbstract = delegatingMethod.isAbstract();

        // Assert
        Assert.assertTrue(isAbstract);
    }

    @Test
    public void isAbstract_givenConcreteClassMethod_shouldReturnFalse() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(concreteMethod);

        // Act
        boolean isAbstract = delegatingMethod.isAbstract();

        // Assert
        Assert.assertFalse(isAbstract);
    }

    @Test
    public void equals_givenSameUnderlyingMethod_shouldReturnTrue() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(concreteMethod);

        // Act
        boolean result = delegatingMethod.equals(concreteMethod);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equals_givenDifferentMethod_shouldReturnFalse() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(concreteMethod);

        // Act
        boolean result = delegatingMethod.equals(abstractMethod);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equals_givenNull_shouldReturnFalse() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(concreteMethod);

        // Act
        boolean result = delegatingMethod.equals(null);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equals_givenIncompatibleTypeObject_shouldReturnFalse() {
        // Arrange
        DelegatingMethod delegatingMethod = new DelegatingMethod(concreteMethod);

        // Act
        boolean result = delegatingMethod.equals("someStringObject");

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equals_givenAnotherDelegatingMethodInstance_shouldFollowMethodEqualsSemantics() {
        // Arrange
        DelegatingMethod delegatingMethod1 = new DelegatingMethod(concreteMethod);
        DelegatingMethod delegatingMethod2 = new DelegatingMethod(concreteMethod);

        // Act
        boolean result = delegatingMethod1.equals(delegatingMethod2);

        // Assert
        // In java.lang.reflect.Method.equals(Object obj), obj must be an instance of Method.
        // Therefore, method.equals(delegatingMethod2) evaluates to false.
        Assert.assertFalse(result);
    }

    @Test
    public void hashCode_givenAnyInstance_shouldReturnOne() {
        // Arrange
        DelegatingMethod delegatingMethod1 = new DelegatingMethod(concreteMethod);
        DelegatingMethod delegatingMethod2 = new DelegatingMethod(abstractMethod);

        // Act
        int hash1 = delegatingMethod1.hashCode();
        int hash2 = delegatingMethod2.hashCode();

        // Assert
        Assert.assertEquals(1, hash1);
        Assert.assertEquals(1, hash2);
    }
}