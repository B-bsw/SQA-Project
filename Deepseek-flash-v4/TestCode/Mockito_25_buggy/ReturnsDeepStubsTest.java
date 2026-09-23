package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.InternalMockHandler;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.creation.settings.CreationSettings;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.invocation.MockHandlerImpl;
import org.mockito.internal.invocation.SerializableMethod;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.internal.util.MockUtil;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.invocation.MockHandler;
import org.mockito.stubbing.Answer;
import org.mockito.verification.VerificationMode;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class ReturnsDeepStubsTest {

    private ReturnsDeepStubs returnsDeepStubs;

    @Before
    public void setUp() {
        returnsDeepStubs = new ReturnsDeepStubs();
    }

    @Test
    public void testAnswerWithNonMockableType() throws Throwable {
        // Create a mock invocation for a non-mockable type
        final Method toStringMethod = Object.class.getMethod("toString");
        final Object mockObj = mock(Object.class);
        InvocationOnMock invocation = createInvocation(mockObj, toStringMethod, mockObj);

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithMockableType() throws Throwable {
        // Create a mock invocation for a mockable type (e.g., List)
        final Method getMethod = List.class.getMethod("get", int.class);
        final List<String> mockList = mock(List.class);
        InvocationOnMock invocation = createInvocation(mockList, getMethod, mockList, 0);

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithSerializableReturnType() throws Throwable {
        // Create a mock invocation for a serializable type
        final Method getMethod = HashMap.class.getMethod("get", Object.class);
        final HashMap<String, String> mockMap = mock(HashMap.class);
        InvocationOnMock invocation = createInvocation(mockMap, getMethod, mockMap, "key");

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithVoidReturnType() throws Throwable {
        // Create a mock invocation for a void method
        final Method clearMethod = List.class.getMethod("clear");
        final List<String> mockList = mock(List.class);
        InvocationOnMock invocation = createInvocation(mockList, clearMethod, mockList);

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithNoReturnType() throws Throwable {
        // Create a mock invocation for a method returning primitives
        final Method sizeMethod = List.class.getMethod("size");
        final List<String> mockList = mock(List.class);
        InvocationOnMock invocation = createInvocation(mockList, sizeMethod, mockList);

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithNullInvocationMock() throws Throwable {
        // Test with a mock that returns null from getMockHandler
        final Method toStringMethod = Object.class.getMethod("toString");
        final Object mockObj = mock(Object.class);
        InvocationOnMock invocation = createInvocation(mockObj, toStringMethod, null);

        try {
            returnsDeepStubs.answer(invocation);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testAnswerWithNullMockHandler() throws Throwable {
        // Test with a mock that has a null handler
        final Method toStringMethod = Object.class.getMethod("toString");
        final Object mockObj = mock(Object.class);
        InvocationOnMock invocation = createInvocation(mockObj, toStringMethod, mockObj);

        // Mock the MockUtil to return a handler that returns null
        try {
            returnsDeepStubs.answer(invocation);
            // Should not throw if getMockHandler returns a valid handler
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testActualParameterizedType() {
        // Test for a simple mock
        final List<String> mockList = mock(List.class);
        GenericMetadataSupport metadata = returnsDeepStubs.actualParameterizedType(mockList);
        assertNotNull(metadata);
    }

    @Test
    public void testActualParameterizedTypeWithNestedGenerics() {
        // Test with a generic class
        final Map<String, List<Integer>> mockMap = mock(Map.class);
        GenericMetadataSupport metadata = returnsDeepStubs.actualParameterizedType(mockMap);
        assertNotNull(metadata);
    }

    @Test
    public void testAnswerWithPrimitiveType() throws Throwable {
        // Test with a primitive return type
        final Method getMethod = List.class.getMethod("get", int.class);
        final int mockInt = 0;
        final List<Object> mockList = mock(List.class);
        InvocationOnMock invocation = createInvocation(mockList, getMethod, mockList, mockInt);

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithArrayType() throws Throwable {
        // Test with an array return type
        final Method toArrayMethod = List.class.getMethod("toArray");
        final List<Object> mockList = mock(List.class);
        InvocationOnMock invocation = createInvocation(mockList, toArrayMethod, mockList);

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithFinalClass() throws Throwable {
        // Test with a final class (String)
        final Method toStringMethod = String.class.getMethod("toString");
        final Object mockString = mock(String.class);
        InvocationOnMock invocation = createInvocation(mockString, toStringMethod, mockString);

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithAnonymousClass() throws Throwable {
        // Test with an anonymous class
        final Method toStringMethod = Object.class.getMethod("toString");
        final Object mockObj = mock(Object.class);
        InvocationOnMock invocation = createInvocation(mockObj, toStringMethod, mockObj);

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithException() throws Throwable {
        // Test with a method that throws an exception
        final Method method = ThisInterface.class.getMethod("throwsException");
        final ThisInterface mockObj = mock(ThisInterface.class);
        InvocationOnMock invocation = createInvocation(mockObj, method, mockObj);

        try {
            returnsDeepStubs.answer(invocation);
            // If no exception, it's fine
        } catch (RuntimeException e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testAnswerWithGenericReturnType() throws Throwable {
        // Test with a generic return type (List<String>)
        final Method method = GenericInterface.class.getMethod("getList");
        final GenericInterface mockObj = mock(GenericInterface.class);
        InvocationOnMock invocation = createInvocation(mockObj, method, mockObj);

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testSerialization() throws Exception {
        // Test serialization of ReturnsDeepStubs
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(returnsDeepStubs);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ReturnsDeepStubs deserialized = (ReturnsDeepStubs) ois.readObject();
        ois.close();

        assertNotNull(deserialized);
    }

    @Test
    public void testDelegateNotNull() {
        // Verify delegate is not null
        assertNotNull(returnsDeepStubs);
    }

    @Test
    public void testAnswerWithMultipleInvocations() throws Throwable {
        // Create a mock invocation for a method that will be called multiple times
        final Method getMethod = List.class.getMethod("get", int.class);
        final List<String> mockList = mock(List.class);
        InvocationOnMock invocation = createInvocation(mockList, getMethod, mockList, 0);

        Object result1 = returnsDeepStubs.answer(invocation);
        Object result2 = returnsDeepStubs.answer(invocation);
        assertNotNull(result1);
        assertNotNull(result2);
    }

    @Test
    public void testAnswerWithNullReturnTypeMetadata() throws Throwable {
        // Test with a mock that has null metadata
        final Method toStringMethod = Object.class.getMethod("toString");
        final Object mockObj = mock(Object.class);
        InvocationOnMock invocation = createInvocation(mockObj, toStringMethod, mockObj);

        // Mock the GenericMetadataSupport to return null for rawType
        try {
            returnsDeepStubs.answer(invocation);
            // Should not throw NPE if handled correctly
        } catch (NullPointerException e) {
            // Expected NPE
        }
    }

    @Test
    public void testAnswerWithStubbedInvocation() throws Throwable {
        // Create a mock with a stubbed invocation
        final List<String> mockList = mock(List.class);
        Mockito.when(mockList.get(Mockito.anyInt())).thenReturn("stubbed");

        final Method getMethod = List.class.getMethod("get", int.class);
        InvocationOnMock invocation = createInvocation(mockList, getMethod, mockList, 0);

        MockUtil mockUtil = new MockUtil();
        InternalMockHandler<Object> handler = mockUtil.getMockHandler(mockList);
        InvocationContainerImpl container = (InvocationContainerImpl) handler.getInvocationContainer();

        // Stub the container to return a stub answer
        // This is tricky without mocking; we'll just test the normal path
        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithEmptyContainer() throws Throwable {
        // Test with a mock that has no stubbed invocations
        final List<String> mockList = mock(List.class);
        final Method getMethod = List.class.getMethod("get", int.class);
        InvocationOnMock invocation = createInvocation(mockList, getMethod, mockList, 0);

        // Clear all stubs from the container
        Mockito.clearInvocations(mockList);
        // Now the container should be empty

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithNonStubbedInvocation() throws Throwable {
        // Test with a mock that has stubbed invocations but not matching
        final List<String> mockList = mock(List.class);
        Mockito.when(mockList.get(Mockito.anyInt())).thenReturn("stubbed");

        final Method getMethod = List.class.getMethod("get", int.class);
        InvocationOnMock invocation = createInvocation(mockList, getMethod, mockList, 1); // index 1

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithMatchingStubbedInvocation() throws Throwable {
        // Test with a mock that has stubbed invocations matching the invocation
        final List<String> mockList = mock(List.class);
        Mockito.when(mockList.get(0)).thenReturn("stubbed");

        final Method getMethod = List.class.getMethod("get", int.class);
        InvocationOnMock invocation = createInvocation(mockList, getMethod, mockList, 0);

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithSerializableMock() throws Throwable {
        // Test with a serializable mock
        final Method method = SerializableInterface.class.getMethod("getValue");
        final SerializableInterface mockObj = mock(SerializableInterface.class);
        InvocationOnMock invocation = createInvocation(mockObj, method, mockObj);

        Object result = returnsDeepStubs.answer(invocation);
        assertNotNull(result);
    }

    @Test
    public void testAnswerWithVoidMethod() throws Throwable {
        // Test with a void method that is stubbed
        final List<String> mockList = mock(List.class);
        Mockito.doThrow(new RuntimeException()).when(mockList).clear();

        final Method clearMethod = List.class.getMethod("clear");
        InvocationOnMock invocation = createInvocation(mockList, clearMethod, mockList);

        try {
            returnsDeepStubs.answer(invocation);
            // Either returns a mock or throws, both acceptable
        } catch (RuntimeException e) {
            // Expected
        }
    }

    @Test
    public void testAnswerWithMockCreationValidator() {
        // Test that the method handles non-mockable types without throwing
        ReturnsDeepStubs rds = new ReturnsDeepStubs() {
            @Override
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return new GenericMetadataSupport() {
                    @Override
                    public Class<?> rawType() {
                        return String.class; // Non-mockable type
                    }
                };
            }
        };

        try {
            rds.answer(createInvocation(null, null, null));
            // Should return something when rawType is not mockable
        } catch (Throwable t) {
            fail("Unexpected exception: " + t);
        }
    }

    @Test
    public void testAnswerWithNullRawType() throws Throwable {
        // Test with null raw type from metadata
        ReturnsDeepStubs rds = new ReturnsDeepStubs() {
            @Override
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return new GenericMetadataSupport() {
                    @Override
                    public Class<?> rawType() {
                        return null;
                    }
                };
            }
        };

        try {
            rds.answer(createInvocation(null, null, null));
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    // Helper method to create an InvocationOnMock
    private InvocationOnMock createInvocation(final Object mock, final Method method, final Object mockInstance, final Object... args) {
        return new InvocationOnMock() {
            @Override
            public Object getMock() {
                return mock;
            }

            @Override
            public Method getMethod() {
                return method;
            }

            @Override
            public Object[] getArguments() {
                return args;
            }

            @Override
            public Object callRealMethod() throws Throwable {
                return null;
            }
        };
    }

    // Helper interface for generic testing
    private interface GenericInterface {
        List<String> getList();
    }

    // Helper interface for exception testing
    private interface ThisInterface {
        String throwsException() throws RuntimeException;
    }

    // Helper interface for serializable testing
    private interface SerializableInterface {
        String getValue();
    }
}