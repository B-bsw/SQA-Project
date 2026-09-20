package org.mockito.internal.stubbing.defaultanswers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockito.invocation.InvocationOnMock;

public class ReturnsSmartNullsTest {

    private ReturnsSmartNulls returnsSmartNulls;

    public static final class FinalClass {
    }

    public static class NonFinalClass {
        public void execute() {
        }
    }

    public interface TestInterface {
        int primitiveMethod();
        String stringMethod();
        List collectionMethod();
        FinalClass finalClassMethod();
        NonFinalClass nonFinalClassMethod();
        NonFinalClass methodWithArgs(String text, int number);
    }

    private static class DummyInvocation implements InvocationOnMock {
        private final Object mock;
        private final Method method;
        private final Object[] arguments;

        public DummyInvocation(Object mock, Method method, Object[] arguments) {
            this.mock = mock;
            this.method = method;
            this.arguments = arguments != null ? arguments : new Object[0];
        }

        public Object getMock() {
            return this.mock;
        }

        public Method getMethod() {
            return this.method;
        }

        public Object[] getArguments() {
            return this.arguments;
        }

        public Object callRealMethod() throws Throwable {
            return null;
        }
    }

    @Before
    public void setUp() {
        returnsSmartNulls = new ReturnsSmartNulls();
    }

    @Test
    public void answer_givenPrimitiveReturnType_shouldReturnDefaultPrimitiveValue() throws Throwable {
        // Arrange
        Method method = TestInterface.class.getMethod("primitiveMethod", new Class[0]);
        InvocationOnMock invocation = new DummyInvocation(this, method, new Object[0]);

        // Act
        Object result = returnsSmartNulls.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void answer_givenStringReturnType_shouldReturnEmptyStringFromDelegate() throws Throwable {
        // Arrange
        Method method = TestInterface.class.getMethod("stringMethod", new Class[0]);
        InvocationOnMock invocation = new DummyInvocation(this, method, new Object[0]);

        // Act
        Object result = returnsSmartNulls.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals("", result);
    }

    @Test
    public void answer_givenCollectionReturnType_shouldReturnEmptyCollectionFromDelegate() throws Throwable {
        // Arrange
        Method method = TestInterface.class.getMethod("collectionMethod", new Class[0]);
        InvocationOnMock invocation = new DummyInvocation(this, method, new Object[0]);

        // Act
        Object result = returnsSmartNulls.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Collections.EMPTY_LIST, result);
    }

    @Test
    public void answer_givenFinalClassReturnType_shouldReturnNull() throws Throwable {
        // Arrange
        Method method = TestInterface.class.getMethod("finalClassMethod", new Class[0]);
        InvocationOnMock invocation = new DummyInvocation(this, method, new Object[0]);

        // Act
        Object result = returnsSmartNulls.answer(invocation);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void answer_givenImposterisableType_shouldReturnNonNullProxy() throws Throwable {
        // Arrange
        Method method = TestInterface.class.getMethod("nonFinalClassMethod", new Class[0]);
        InvocationOnMock invocation = new DummyInvocation(this, method, new Object[0]);

        // Act
        Object result = returnsSmartNulls.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof NonFinalClass);
    }

    @Test
    public void intercept_givenToStringInvocationOnNoArgSmartNull_shouldReturnFormattedString() throws Throwable {
        // Arrange
        Method method = TestInterface.class.getMethod("nonFinalClassMethod", new Class[0]);
        InvocationOnMock invocation = new DummyInvocation(this, method, new Object[0]);
        NonFinalClass smartNull = (NonFinalClass) returnsSmartNulls.answer(invocation);

        // Act
        String stringRepresentation = smartNull.toString();

        // Assert
        Assert.assertEquals("SmartNull returned by unstubbed nonFinalClassMethod() method on mock", stringRepresentation);
    }

    @Test
    public void intercept_givenToStringInvocationOnSmartNullWithArguments_shouldIncludeFormattedArgs() throws Throwable {
        // Arrange
        Method method = TestInterface.class.getMethod("methodWithArgs", new Class[] { String.class, int.class });
        Object[] args = new Object[] { "sampleText", Integer.valueOf(42) };
        InvocationOnMock invocation = new DummyInvocation(this, method, args);
        NonFinalClass smartNull = (NonFinalClass) returnsSmartNulls.answer(invocation);

        // Act
        String stringRepresentation = smartNull.toString();

        // Assert
        Assert.assertEquals("SmartNull returned by unstubbed methodWithArgs(sampleText, 42) method on mock", stringRepresentation);
    }

    @Test
    public void intercept_givenMethodCallOnSmartNull_shouldThrowSmartNullPointerException() throws Throwable {
        // Arrange
        Method method = TestInterface.class.getMethod("nonFinalClassMethod", new Class[0]);
        InvocationOnMock invocation = new DummyInvocation(this, method, new Object[0]);
        NonFinalClass smartNull = (NonFinalClass) returnsSmartNulls.answer(invocation);

        // Act & Assert
        try {
            smartNull.execute();
            Assert.fail("Expected SmartNullPointerException to be thrown");
        } catch (SmartNullPointerException expected) {
            Assert.assertNotNull(expected.getMessage());
        } catch (RuntimeException otherException) {
            Assert.assertTrue(otherException.getClass().getName().indexOf("SmartNullPointerException") != -1);
        }
    }

    @Test
    public void returnsSmartNulls_shouldBeSerializable() throws Exception {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        // Act
        oos.writeObject(returnsSmartNulls);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Object deserialized = ois.readObject();
        ois.close();

        // Assert
        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof ReturnsSmartNulls);
    }
}