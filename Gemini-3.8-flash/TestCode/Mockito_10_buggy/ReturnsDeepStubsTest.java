package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.MockSettings;
import org.mockito.Mockito;
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ReturnsDeepStubsTest {

    interface SampleService {
        int getPrimitiveInt();
        boolean getPrimitiveBoolean();
        double getPrimitiveDouble();
        void getVoid();
        String getString();
    }

    interface ExtraInterface {}

    interface GenericContainer<T extends SampleService & ExtraInterface> {
        T getMultipleBound();
        SampleService getSingleBound();
    }

    private static class TestableReturnsDeepStubs extends ReturnsDeepStubs {
        private static final long serialVersionUID = 1L;
        private final GenericMetadataSupport returnTypeMetadata;

        public TestableReturnsDeepStubs(GenericMetadataSupport returnTypeMetadata) {
            this.returnTypeMetadata = returnTypeMetadata;
        }

        @Override
        protected GenericMetadataSupport actualParameterizedType(Object mock) {
            return returnTypeMetadata;
        }
    }

    private InvocationOnMock createInvocation(final Object mock, final Method method, final Object[] args) {
        return (InvocationOnMock) Proxy.newProxyInstance(
                InvocationOnMock.class.getClassLoader(),
                new Class[] { InvocationOnMock.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method m, Object[] methodArgs) throws Throwable {
                        if ("getMock".equals(m.getName())) {
                            return mock;
                        }
                        if ("getMethod".equals(m.getName())) {
                            return method;
                        }
                        if ("getArguments".equals(m.getName())) {
                            return args != null ? args : new Object[0];
                        }
                        if ("callRealMethod".equals(m.getName())) {
                            return null;
                        }
                        if ("toString".equals(m.getName())) {
                            return "InvocationOnMockProxy";
                        }
                        return null;
                    }
                }
        );
    }

    @Test
    public void answer_givenPrimitiveIntReturnType_shouldReturnDefaultZero() throws Throwable {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleService.class);
        ReturnsDeepStubs answer = new TestableReturnsDeepStubs(metadata);
        Method method = SampleService.class.getMethod("getPrimitiveInt", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method, new Object[0]);

        // Act
        Object result = answer.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void answer_givenPrimitiveBooleanReturnType_shouldReturnDefaultFalse() throws Throwable {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleService.class);
        ReturnsDeepStubs answer = new TestableReturnsDeepStubs(metadata);
        Method method = SampleService.class.getMethod("getPrimitiveBoolean", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method, new Object[0]);

        // Act
        Object result = answer.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void answer_givenPrimitiveDoubleReturnType_shouldReturnDefaultZeroDouble() throws Throwable {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleService.class);
        ReturnsDeepStubs answer = new TestableReturnsDeepStubs(metadata);
        Method method = SampleService.class.getMethod("getPrimitiveDouble", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method, new Object[0]);

        // Act
        Object result = answer.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Double.valueOf(0.0), result);
    }

    @Test
    public void answer_givenVoidReturnType_shouldReturnNull() throws Throwable {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleService.class);
        ReturnsDeepStubs answer = new TestableReturnsDeepStubs(metadata);
        Method method = SampleService.class.getMethod("getVoid", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method, new Object[0]);

        // Act
        Object result = answer.answer(invocation);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void answer_givenStringReturnType_shouldReturnEmptyString() throws Throwable {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleService.class);
        ReturnsDeepStubs answer = new TestableReturnsDeepStubs(metadata);
        Method method = SampleService.class.getMethod("getString", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method, new Object[0]);

        // Act
        Object result = answer.answer(invocation);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test(expected = NullPointerException.class)
    public void answer_givenNullInvocation_shouldThrowNullPointerException() throws Throwable {
        // Arrange
        ReturnsDeepStubs answer = new ReturnsDeepStubs();

        // Act
        answer.answer(null);
    }

    @Test
    public void actualParameterizedType_givenNonMockObject_shouldThrowException() {
        // Arrange
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Object nonMock = new Object();

        // Act & Assert
        try {
            answer.actualParameterizedType(nonMock);
            Assert.fail("Expected RuntimeException when inspecting a non-mock object");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void serializable_givenReturnsDeepStubsInstance_shouldSerializeAndDeserializeSuccessfully() throws Exception {
        // Arrange
        ReturnsDeepStubs original = new ReturnsDeepStubs();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(original);
        oos.flush();
        oos.close();

        // Act
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object deserialized = ois.readObject();
        ois.close();

        // Assert
        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof ReturnsDeepStubs);
    }

    @Test
    public void withSettingsUsing_givenMetadataWithoutExtraInterfaces_shouldReturnMockSettings() throws Exception {
        // Arrange
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericContainer.class)
                .resolveGenericReturnType(GenericContainer.class.getMethod("getSingleBound", new Class[0]));
        Method withSettingsUsingMethod = ReturnsDeepStubs.class.getDeclaredMethod("withSettingsUsing", new Class[] { GenericMetadataSupport.class });
        withSettingsUsingMethod.setAccessible(true);

        // Act
        MockSettings settings = (MockSettings) withSettingsUsingMethod.invoke(answer, new Object[] { metadata });

        // Assert
        Assert.assertNotNull(settings);
    }

    @Test
    public void withSettingsUsing_givenMetadataWithExtraInterfaces_shouldReturnMockSettings() throws Exception {
        // Arrange
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericContainer.class)
                .resolveGenericReturnType(GenericContainer.class.getMethod("getMultipleBound", new Class[0]));
        Method withSettingsUsingMethod = ReturnsDeepStubs.class.getDeclaredMethod("withSettingsUsing", new Class[] { GenericMetadataSupport.class });
        withSettingsUsingMethod.setAccessible(true);

        // Act
        MockSettings settings = (MockSettings) withSettingsUsingMethod.invoke(answer, new Object[] { metadata });

        // Assert
        Assert.assertNotNull(settings);
    }

    @Test
    public void returnsDeepStubsAnswerUsing_givenValidMetadata_shouldReturnSerializationFallbackInstance() throws Exception {
        // Arrange
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleService.class);
        Method returnsDeepStubsAnswerUsingMethod = ReturnsDeepStubs.class.getDeclaredMethod("returnsDeepStubsAnswerUsing", new Class[] { GenericMetadataSupport.class });
        returnsDeepStubsAnswerUsingMethod.setAccessible(true);

        // Act
        Object fallbackAnswer = returnsDeepStubsAnswerUsingMethod.invoke(answer, new Object[] { metadata });

        // Assert
        Assert.assertNotNull(fallbackAnswer);
        Assert.assertTrue(fallbackAnswer instanceof ReturnsDeepStubs);
    }

    @Test
    public void returnsDeepStubsSerializationFallback_givenSerialization_shouldReplaceWithDeepStubsConstant() throws Exception {
        // Arrange
        Class fallbackClass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback");
        Constructor constructor = fallbackClass.getDeclaredConstructor(new Class[] { GenericMetadataSupport.class });
        constructor.setAccessible(true);

        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleService.class);
        Object fallbackInstance = constructor.newInstance(new Object[] { metadata });

        // Act: Serialize and Deserialize
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(fallbackInstance);
        oos.flush();
        oos.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object deserialized = ois.readObject();
        ois.close();

        // Assert: writeReplace replaces instance with Mockito.RETURNS_DEEP_STUBS
        Assert.assertSame(Mockito.RETURNS_DEEP_STUBS, deserialized);
    }

    @Test
    public void returnsDeepStubsSerializationFallback_actualParameterizedType_shouldReturnConfiguredMetadata() throws Exception {
        // Arrange
        Class fallbackClass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback");
        Constructor constructor = fallbackClass.getDeclaredConstructor(new Class[] { GenericMetadataSupport.class });
        constructor.setAccessible(true);

        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleService.class);
        ReturnsDeepStubs fallbackInstance = (ReturnsDeepStubs) constructor.newInstance(new Object[] { metadata });

        // Act
        GenericMetadataSupport actual = fallbackInstance.actualParameterizedType(new Object());

        // Assert
        Assert.assertSame(metadata, actual);
    }

    @Test
    public void deeplyStubbedAnswer_givenMockObject_shouldAlwaysReturnMock() throws Throwable {
        // Arrange
        Class deeplyStubbedAnswerClass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$DeeplyStubbedAnswer");
        Constructor constructor = deeplyStubbedAnswerClass.getDeclaredConstructor(new Class[] { Object.class });
        constructor.setAccessible(true);

        Object stubbedMock = new Object();
        Answer answerInstance = (Answer) constructor.newInstance(new Object[] { stubbedMock });

        Method method = SampleService.class.getMethod("getString", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method, new Object[0]);

        // Act
        Object result = answerInstance.answer(invocation);

        // Assert
        Assert.assertSame(stubbedMock, result);
    }

    @Test
    public void deeplyStubbedAnswer_givenSerialization_shouldPreserveStubbedMock() throws Exception {
        // Arrange
        Class deeplyStubbedAnswerClass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$DeeplyStubbedAnswer");
        Constructor constructor = deeplyStubbedAnswerClass.getDeclaredConstructor(new Class[] { Object.class });
        constructor.setAccessible(true);

        String stubbedMock = "SerializableMockObject";
        Object answerInstance = constructor.newInstance(new Object[] { stubbedMock });

        // Act
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(answerInstance);
        oos.flush();
        oos.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Answer deserializedAnswer = (Answer) ois.readObject();
        ois.close();

        // Assert
        try {
            Object result = deserializedAnswer.answer(null);
            Assert.assertEquals(stubbedMock, result);
        } catch (Throwable t) {
            Assert.fail("Unexpected exception during answer execution: " + t.getMessage());
        }
    }
}