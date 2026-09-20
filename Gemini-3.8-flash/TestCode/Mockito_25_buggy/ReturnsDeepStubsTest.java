package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import org.mockito.invocation.InvocationOnMock;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;

public class ReturnsDeepStubsTest {

    private interface SampleService {
        int getPrimitiveInt();
        boolean getPrimitiveBoolean();
        String getStringValue();
        void doVoidAction();
    }

    private static class TestableReturnsDeepStubs extends ReturnsDeepStubs {
        private static final long serialVersionUID = 1L;

        protected GenericMetadataSupport actualParameterizedType(Object mock) {
            return GenericMetadataSupport.inferFrom(mock.getClass());
        }
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

        public <T> T getArgumentAt(int index, Class<T> clazz) {
            return clazz.cast(this.arguments[index]);
        }
    }

    private static class SampleServiceImpl implements SampleService {
        public int getPrimitiveInt() {
            return 42;
        }

        public boolean getPrimitiveBoolean() {
            return true;
        }

        public String getStringValue() {
            return "Sample";
        }

        public void doVoidAction() {
        }
    }

    @Test
    public void answer_givenPrimitiveIntReturnType_shouldReturnZero() throws Throwable {
        // Arrange
        TestableReturnsDeepStubs stubber = new TestableReturnsDeepStubs();
        SampleService mock = new SampleServiceImpl();
        Method method = SampleService.class.getMethod("getPrimitiveInt", new Class[0]);
        DummyInvocation invocation = new DummyInvocation(mock, method, new Object[0]);

        // Act
        Object result = stubber.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void answer_givenPrimitiveBooleanReturnType_shouldReturnFalse() throws Throwable {
        // Arrange
        TestableReturnsDeepStubs stubber = new TestableReturnsDeepStubs();
        SampleService mock = new SampleServiceImpl();
        Method method = SampleService.class.getMethod("getPrimitiveBoolean", new Class[0]);
        DummyInvocation invocation = new DummyInvocation(mock, method, new Object[0]);

        // Act
        Object result = stubber.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void answer_givenStringReturnType_shouldReturnEmptyString() throws Throwable {
        // Arrange
        TestableReturnsDeepStubs stubber = new TestableReturnsDeepStubs();
        SampleService mock = new SampleServiceImpl();
        Method method = SampleService.class.getMethod("getStringValue", new Class[0]);
        DummyInvocation invocation = new DummyInvocation(mock, method, new Object[0]);

        // Act
        Object result = stubber.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals("", result);
    }

    @Test
    public void answer_givenVoidReturnType_shouldReturnNull() throws Throwable {
        // Arrange
        TestableReturnsDeepStubs stubber = new TestableReturnsDeepStubs();
        SampleService mock = new SampleServiceImpl();
        Method method = SampleService.class.getMethod("doVoidAction", new Class[0]);
        DummyInvocation invocation = new DummyInvocation(mock, method, new Object[0]);

        // Act
        Object result = stubber.answer(invocation);

        // Assert
        Assert.assertNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void answer_givenNullInvocation_shouldThrowNullPointerException() throws Throwable {
        // Arrange
        ReturnsDeepStubs stubber = new ReturnsDeepStubs();

        // Act
        stubber.answer(null);
    }

    @Test
    public void actualParameterizedType_givenNonMockObject_shouldThrowException() {
        // Arrange
        ReturnsDeepStubs stubber = new ReturnsDeepStubs();
        Object nonMock = new Object();

        // Act & Assert
        try {
            stubber.actualParameterizedType(nonMock);
            Assert.fail("Expected exception when invoking actualParameterizedType on non-mock object");
        } catch (RuntimeException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void actualParameterizedType_givenNullMock_shouldThrowException() {
        // Arrange
        ReturnsDeepStubs stubber = new ReturnsDeepStubs();

        // Act & Assert
        try {
            stubber.actualParameterizedType(null);
            Assert.fail("Expected exception when invoking actualParameterizedType with null");
        } catch (RuntimeException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void serialization_givenReturnsDeepStubsInstance_shouldSuccessfullySerializeAndDeserialize() throws Exception {
        // Arrange
        ReturnsDeepStubs original = new ReturnsDeepStubs();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);

        // Act
        out.writeObject(original);
        out.flush();
        out.close();

        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream in = new ObjectInputStream(byteIn);
        Object deserialized = in.readObject();
        in.close();

        // Assert
        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof ReturnsDeepStubs);
    }
}