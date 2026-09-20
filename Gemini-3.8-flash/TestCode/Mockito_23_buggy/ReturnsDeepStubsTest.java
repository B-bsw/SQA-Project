package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.MockSettings;
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import org.mockito.invocation.InvocationOnMock;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ReturnsDeepStubsTest {

    private interface SampleTypes {
        String getString();
        int getInt();
        boolean getBoolean();
        double getDouble();
        void getVoid();
    }

    private interface GenericParent<T> {
        T getValue();
    }

    private interface ConcreteChild extends GenericParent<String> {
    }

    private interface MultiBoundInterface<T extends Number & Comparable<T>> {
        T getBound();
    }

    private InvocationOnMock createInvocation(final Object mock, final Method method, final Object[] args) {
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method m, Object[] methodArgs) throws Throwable {
                String name = m.getName();
                if ("getMock".equals(name)) {
                    return mock;
                } else if ("getMethod".equals(name)) {
                    return method;
                } else if ("getArguments".equals(name)) {
                    return args != null ? args : new Object[0];
                } else if ("callRealMethod".equals(name)) {
                    return null;
                } else if ("toString".equals(name)) {
                    return "InvocationOnMockProxy[" + method.getName() + "]";
                }
                return null;
            }
        };
        return (InvocationOnMock) Proxy.newProxyInstance(
                InvocationOnMock.class.getClassLoader(),
                new Class[] { InvocationOnMock.class },
                handler
        );
    }

    @Test
    public void answer_givenNullInvocation_shouldThrowNullPointerException() throws Throwable {
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs();
        try {
            deepStubs.answer(null);
            Assert.fail("Expected NullPointerException when invocation is null");
        } catch (NullPointerException expected) {
            Assert.assertNotNull(expected);
        }
    }

    @Test
    public void answer_givenMethodReturningFinalClassString_shouldReturnEmptyString() throws Throwable {
        final GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleTypes.class);
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs() {
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return metadata;
            }
        };

        Method method = SampleTypes.class.getMethod("getString", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method, new Object[0]);

        Object result = deepStubs.answer(invocation);

        Assert.assertNotNull("Result should not be null for String return type", result);
        Assert.assertEquals("", result);
    }

    @Test
    public void answer_givenMethodReturningPrimitiveInt_shouldReturnZero() throws Throwable {
        final GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleTypes.class);
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs() {
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return metadata;
            }
        };

        Method method = SampleTypes.class.getMethod("getInt", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method, new Object[0]);

        Object result = deepStubs.answer(invocation);

        Assert.assertNotNull("Result should not be null for primitive int", result);
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void answer_givenMethodReturningPrimitiveBoolean_shouldReturnFalse() throws Throwable {
        final GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleTypes.class);
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs() {
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return metadata;
            }
        };

        Method method = SampleTypes.class.getMethod("getBoolean", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method, new Object[0]);

        Object result = deepStubs.answer(invocation);

        Assert.assertNotNull("Result should not be null for primitive boolean", result);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void answer_givenMethodReturningPrimitiveDouble_shouldReturnZero() throws Throwable {
        final GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleTypes.class);
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs() {
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return metadata;
            }
        };

        Method method = SampleTypes.class.getMethod("getDouble", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method, new Object[0]);

        Object result = deepStubs.answer(invocation);

        Assert.assertNotNull("Result should not be null for primitive double", result);
        Assert.assertEquals(Double.valueOf(0.0), result);
    }

    @Test
    public void answer_givenMethodReturningVoid_shouldReturnNull() throws Throwable {
        final GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleTypes.class);
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs() {
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return metadata;
            }
        };

        Method method = SampleTypes.class.getMethod("getVoid", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method, new Object[0]);

        Object result = deepStubs.answer(invocation);

        Assert.assertNull("Result must be null for void return type", result);
    }

    @Test
    public void answer_givenGenericMethodResolvingToNonMockableType_shouldReturnEmptyValue() throws Throwable {
        final GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteChild.class);
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs() {
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return metadata;
            }
        };

        Method method = GenericParent.class.getMethod("getValue", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method, new Object[0]);

        Object result = deepStubs.answer(invocation);

        Assert.assertNotNull("Resolved generic string should return empty string", result);
        Assert.assertEquals("", result);
    }

    @Test
    public void actualParameterizedType_givenNonMockObject_shouldThrowException() {
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs();
        try {
            deepStubs.actualParameterizedType(new Object());
            Assert.fail("Expected exception when target is not a Mockito mock");
        } catch (Exception expected) {
            Assert.assertNotNull(expected);
        }
    }

    @Test
    public void actualParameterizedType_givenNullObject_shouldThrowException() {
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs();
        try {
            deepStubs.actualParameterizedType(null);
            Assert.fail("Expected exception when target is null");
        } catch (Exception expected) {
            Assert.assertNotNull(expected);
        }
    }

    @Test
    public void withSettingsUsing_givenNoExtraInterfaces_shouldConfigureMockSettings() throws Exception {
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleTypes.class);

        Method method = ReturnsDeepStubs.class.getDeclaredMethod("withSettingsUsing", new Class[] { GenericMetadataSupport.class });
        method.setAccessible(true);
        MockSettings settings = (MockSettings) method.invoke(deepStubs, new Object[] { metadata });

        Assert.assertNotNull("MockSettings should be successfully created", settings);
    }

    @Test
    public void withSettingsUsing_givenExtraInterfaces_shouldConfigureMockSettingsWithInterfaces() throws Exception {
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs();
        Method targetMethod = MultiBoundInterface.class.getMethod("getBound", new Class[0]);
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(MultiBoundInterface.class).resolveGenericReturnType(targetMethod);

        Assert.assertTrue("Should have extra interfaces for multi-bounded type", metadata.rawExtraInterfaces().length > 0);

        Method method = ReturnsDeepStubs.class.getDeclaredMethod("withSettingsUsing", new Class[] { GenericMetadataSupport.class });
        method.setAccessible(true);
        MockSettings settings = (MockSettings) method.invoke(deepStubs, new Object[] { metadata });

        Assert.assertNotNull("MockSettings should be created with extra interfaces", settings);
    }

    @Test
    public void returnsDeepStubsAnswerUsing_givenMetadata_shouldReturnAnswerProvidingSameMetadata() throws Exception {
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SampleTypes.class);

        Method method = ReturnsDeepStubs.class.getDeclaredMethod("returnsDeepStubsAnswerUsing", new Class[] { GenericMetadataSupport.class });
        method.setAccessible(true);
        ReturnsDeepStubs childAnswer = (ReturnsDeepStubs) method.invoke(deepStubs, new Object[] { metadata });

        Assert.assertNotNull("Created answer delegate should not be null", childAnswer);
        Assert.assertSame("actualParameterizedType should return the passed metadata instance",
                metadata, childAnswer.actualParameterizedType(new Object()));
    }

    @Test
    public void serializable_givenReturnsDeepStubsInstance_shouldSerializeAndDeserializeCorrectly() throws Exception {
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(deepStubs);
        oos.flush();
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        Assert.assertNotNull("Deserialized object should not be null", deserialized);
        Assert.assertTrue("Deserialized object must be an instance of ReturnsDeepStubs",
                deserialized instanceof ReturnsDeepStubs);
    }
}