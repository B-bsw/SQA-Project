package org.mockito.internal.stubbing.defaultanswers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

public class ReturnsSmartNullsTest {

    private ReturnsSmartNulls returnsSmartNulls;

    public interface TestInterface {
        void voidMethod();
        String stringMethod();
    }

    public static class TestClass {
        public void nonFinalMethod() {
        }
    }

    public static final class TestFinalClass {
        public void someMethod() {
        }
    }

    public interface SampleService {
        String getString();
        List getList();
        TestInterface getInterface();
        TestClass getClassType();
        TestFinalClass getFinalClass();
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
    public void answer_givenMethodHandledByDelegate_shouldReturnDelegateDefaultValue() throws Throwable {
        // Arrange
        Method method = SampleService.class.getMethod("getString", new Class[0]);
        DummyInvocation invocation = new DummyInvocation(this, method, new Object[0]);

        // Act
        Object result = returnsSmartNulls.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals("", result);
    }

    @Test
    public void answer_givenMethodReturningListHandledByDelegate_shouldReturnEmptyList() throws Throwable {
        // Arrange
        Method method = SampleService.class.getMethod("getList", new Class[0]);
        DummyInvocation invocation = new DummyInvocation(this, method, new Object[0]);

        // Act
        Object result = returnsSmartNulls.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof List);
        Assert.assertTrue(((List) result).isEmpty());
    }

    @Test
    public void answer_givenUnmockableFinalClassReturnType_shouldReturnNull() throws Throwable {
        // Arrange
        Method method = SampleService.class.getMethod("getFinalClass", new Class[0]);
        DummyInvocation invocation = new DummyInvocation(this, method, new Object[0]);

        // Act
        Object result = returnsSmartNulls.answer(invocation);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void answer_givenInterfaceReturnType_shouldReturnSmartNullProxy() throws Throwable {
        // Arrange
        Method method = SampleService.class.getMethod("getInterface", new Class[0]);
        DummyInvocation invocation = new DummyInvocation(this, method, new Object[0]);

        // Act
        Object result = returnsSmartNulls.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof TestInterface);
    }

    @Test
    public void answer_givenClassReturnType_shouldReturnSmartNullProxy() throws Throwable {
        // Arrange
        Method method = SampleService.class.getMethod("getClassType", new Class[0]);
        DummyInvocation invocation = new DummyInvocation(this, method, new Object[0]);

        // Act
        Object result = returnsSmartNulls.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof TestClass);
    }

    @Test
    public void smartNullProxy_whenToStringInvoked_shouldReturnFormattedMessage() throws Throwable {
        // Arrange
        Method method = SampleService.class.getMethod("getInterface", new Class[0]);
        DummyInvocation invocation = new DummyInvocation(this, method, new Object[0]);
        TestInterface proxy = (TestInterface) returnsSmartNulls.answer(invocation);

        // Act
        String str = proxy.toString();

        // Assert
        Assert.assertNotNull(str);
        Assert.assertEquals("SmartNull returned by unstubbed getInterface() method on mock", str);
    }

    @Test
    public void smartNullProxy_whenNonToStringMethodInvoked_shouldThrowSmartNullPointerException() throws Throwable {
        // Arrange
        Method method = SampleService.class.getMethod("getInterface", new Class[0]);
        DummyInvocation invocation = new DummyInvocation(this, method, new Object[0]);
        TestInterface proxy = (TestInterface) returnsSmartNulls.answer(invocation);

        // Act & Assert
        try {
            proxy.voidMethod();
            Assert.fail("Expected exception was not thrown on unconfigured SmartNull method invocation");
        } catch (RuntimeException ex) {
            Assert.assertTrue("Exception should indicate SmartNullPointerException",
                    ex.getClass().getName().contains("SmartNullPointerException"));
        }
    }

    @Test
    public void smartNullProxy_whenClassMethodInvoked_shouldThrowSmartNullPointerException() throws Throwable {
        // Arrange
        Method method = SampleService.class.getMethod("getClassType", new Class[0]);
        DummyInvocation invocation = new DummyInvocation(this, method, new Object[0]);
        TestClass proxy = (TestClass) returnsSmartNulls.answer(invocation);

        // Act & Assert
        try {
            proxy.nonFinalMethod();
            Assert.fail("Expected exception was not thrown on unconfigured SmartNull method invocation");
        } catch (RuntimeException ex) {
            Assert.assertTrue("Exception should indicate SmartNullPointerException",
                    ex.getClass().getName().contains("SmartNullPointerException"));
        }
    }

    @Test
    public void returnsSmartNulls_shouldBeSerializable() throws Exception {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        // Act
        oos.writeObject(returnsSmartNulls);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        // Assert
        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof ReturnsSmartNulls);
    }
}