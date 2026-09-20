package org.mockito.internal.stubbing.answers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

public class CallsRealMethodsTest {

    private InvocationOnMock createInvocationProxy(final Object returnValue, final Throwable throwableToThrow) {
        return (InvocationOnMock) Proxy.newProxyInstance(
            InvocationOnMock.class.getClassLoader(),
            new Class[] { InvocationOnMock.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if ("callRealMethod".equals(method.getName())) {
                        if (throwableToThrow != null) {
                            throw throwableToThrow;
                        }
                        return returnValue;
                    }
                    return null;
                }
            }
        );
    }

    @Test
    public void answer_givenValidInvocationReturningValue_shouldReturnRealMethodResult() throws Throwable {
        // Arrange
        CallsRealMethods answer = new CallsRealMethods();
        String expectedResult = "realMethodExecuted";
        InvocationOnMock invocation = createInvocationProxy(expectedResult, null);

        // Act
        Object actualResult = answer.answer(invocation);

        // Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void answer_givenValidInvocationReturningNull_shouldReturnNull() throws Throwable {
        // Arrange
        CallsRealMethods answer = new CallsRealMethods();
        InvocationOnMock invocation = createInvocationProxy(null, null);

        // Act
        Object actualResult = answer.answer(invocation);

        // Assert
        Assert.assertNull(actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void answer_givenNullInvocation_shouldThrowNullPointerException() throws Throwable {
        // Arrange
        CallsRealMethods answer = new CallsRealMethods();

        // Act
        answer.answer(null);
    }

    @Test
    public void answer_givenInvocationThrowingCheckedException_shouldPropagateException() {
        // Arrange
        CallsRealMethods answer = new CallsRealMethods();
        IOException expectedException = new IOException("Disk read error");
        InvocationOnMock invocation = createInvocationProxy(null, expectedException);

        // Act & Assert
        try {
            answer.answer(invocation);
            Assert.fail("Expected IOException was not thrown");
        } catch (Throwable t) {
            Assert.assertSame(expectedException, t);
        }
    }

    @Test
    public void answer_givenInvocationThrowingRuntimeException_shouldPropagateRuntimeException() {
        // Arrange
        CallsRealMethods answer = new CallsRealMethods();
        IllegalStateException expectedException = new IllegalStateException("Invalid state");
        InvocationOnMock invocation = createInvocationProxy(null, expectedException);

        // Act & Assert
        try {
            answer.answer(invocation);
            Assert.fail("Expected IllegalStateException was not thrown");
        } catch (Throwable t) {
            Assert.assertSame(expectedException, t);
        }
    }

    @Test
    public void answer_givenInvocationThrowingError_shouldPropagateError() {
        // Arrange
        CallsRealMethods answer = new CallsRealMethods();
        OutOfMemoryError expectedError = new OutOfMemoryError("Fake OOM");
        InvocationOnMock invocation = createInvocationProxy(null, expectedError);

        // Act & Assert
        try {
            answer.answer(invocation);
            Assert.fail("Expected OutOfMemoryError was not thrown");
        } catch (Throwable t) {
            Assert.assertSame(expectedError, t);
        }
    }

    @Test
    public void serialization_givenCallsRealMethodsInstance_shouldSerializeAndDeserializeSuccessfully() throws Exception {
        // Arrange
        CallsRealMethods original = new CallsRealMethods();
        ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteOutputStream);

        // Act
        objectOutputStream.writeObject(original);
        objectOutputStream.flush();
        objectOutputStream.close();

        ByteArrayInputStream byteInputStream = new ByteArrayInputStream(byteOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteInputStream);
        Object deserialized = objectInputStream.readObject();
        objectInputStream.close();

        // Assert
        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof CallsRealMethods);

        // Verify deserialized instance behaves properly
        CallsRealMethods deserializedAnswer = (CallsRealMethods) deserialized;
        InvocationOnMock invocation = createInvocationProxy("deserializedSuccess", null);
        Object result = deserializedAnswer.answer(invocation);
        Assert.assertEquals("deserializedSuccess", result);
    }
}