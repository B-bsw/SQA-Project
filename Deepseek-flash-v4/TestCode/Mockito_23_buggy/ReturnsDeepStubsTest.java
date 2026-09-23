package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.mockito.Mockito;
import org.mockito.internal.InternalMockHandler;
import org.mockito.internal.creation.settings.CreationSettings;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.invocation.InvocationImpl;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.invocation.MockHandler;
import org.mockito.mock.MockCreationSettings;
import org.mockito.stubbing.Answer;

import java.lang.reflect.Method;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReturnsDeepStubsTest {

    private ReturnsDeepStubs returnsDeepStubs;
    private InvocationContainerImpl mockContainer;
    private InternalMockHandler<Object> mockHandler;
    private Object mock;
    private CreationSettings mockSettings;

    @Before
    public void setUp() {
        returnsDeepStubs = new ReturnsDeepStubs();
        mock = Mockito.mock(TestInterface.class);
        mockHandler = new MockUtil().getMockHandler(mock);
        mockContainer = new InvocationContainerImpl(mockHandler);
        mockSettings = (CreationSettings) mockHandler.getMockSettings();
    }

    @After
    public void tearDown() {
        mockContainer = null;
        mockHandler = null;
        mock = null;
        mockSettings = null;
    }

    @Test
    public void testAnswer_returnsDefaultForNonMockableType() throws Throwable {
        // Setup: Non-mockable type (final class or primitive)
        ReturnsDeepStubs spy = new ReturnsDeepStubs() {
            @Override
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return GenericMetadataSupport.inferFrom(String.class);
            }
        };
        InvocationOnMock invocation = createInvocation("toString", String.class);
        Object result = spy.answer(invocation);
        assertNull(result);
    }

    @Test
    public void testAnswer_mockableType_returnsDeepMock() throws Throwable {
        // Setup: Mockable interface
        final GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(TestInterface.class);
        ReturnsDeepStubs spy = new ReturnsDeepStubs() {
            @Override
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return metadata;
            }
        };
        InvocationOnMock invocation = createInvocation("testMethod", TestInterface.class);
        Object result = spy.answer(invocation);
        assertNotNull(result);
        assertTrue(result instanceof TestInterface);
    }

    @Test
    public void testAnswer_withStubbedInvocation_returnsStubbedValue() throws Throwable {
        // Setup: Prepare stubbed invocation
        TestInterface stubbedResult = Mockito.mock(TestInterface.class);
        InvocationOnMock stubbedInvocation = createInvocation("testMethod", TestInterface.class);
        InvocationMatcher stubMatcher = new InvocationMatcher(stubbedInvocation);
        StubbedInvocationMatcher stub = new StubbedInvocationMatcher(stubMatcher, new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return stubbedResult;
            }
        });
        mockContainer.addAnswer(stub, true);
        mockContainer.setAnswersForStubbing(Collections.singletonList(stub), null);

        // Exercise
        Object result = returnsDeepStubs.answer(stubbedInvocation);

        // Verify
        assertSame(stubbedResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnswer_withNullInvocation_throwsException() throws Throwable {
        returnsDeepStubs.answer(null);
    }

    @Test
    public void testAnswer_withGenericReturnType_createsDeepMock() throws Throwable {
        // Setup: Generic interface
        ReturnsDeepStubs spy = new ReturnsDeepStubs() {
            @Override
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return GenericMetadataSupport.inferFrom(GenericTestInterface.class);
            }
        };
        InvocationOnMock invocation = createInvocation("getValue", GenericTestInterface.class);
        
        // Exercise
        Object result = spy.answer(invocation);
        
        // Verify
        assertNotNull(result);
        assertTrue(result instanceof GenericTestInterface);
    }

    @Test
    public void testAnswer_withPrimitiveReturnType_returnsDefaultValue() throws Throwable {
        // Setup: Primitive return type
        ReturnsDeepStubs spy = new ReturnsDeepStubs() {
            @Override
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return GenericMetadataSupport.inferFrom(TestInterface.class);
            }
        };
        InvocationOnMock invocation = createInvocation("getPrimitiveInt", int.class);
        
        // Exercise
        Object result = spy.answer(invocation);
        
        // Verify
        assertEquals(0, result);
    }

    @Test
    public void testActualParameterizedType_usesMockSettings() {
        // Setup: Create mock with custom settings
        TestInterface customMock = Mockito.mock(TestInterface.class, Mockito.withSettings()
                .defaultAnswer(Mockito.RETURNS_DEEP_STUBS)
                .extraInterfaces(Serializable.class));

        // Exercise
        GenericMetadataSupport result = returnsDeepStubs.actualParameterizedType(customMock);

        // Verify
        assertNotNull(result);
        assertEquals(TestInterface.class, result.rawType());
    }

    @Test
    public void testActualParameterizedType_withExtraInterfaces_keepsThem() {
        TestInterface customMock = Mockito.mock(TestInterface.class, Mockito.withSettings()
                .defaultAnswer(Mockito.RETURNS_DEEP_STUBS)
                .extraInterfaces(Runnable.class));

        GenericMetadataSupport result = returnsDeepStubs.actualParameterizedType(customMock);
        
        assertNotNull(result);
        assertArrayEquals(new Class<?>[]{Runnable.class}, result.rawExtraInterfaces());
    }

    @Test
    public void testAnswer_withMultipleCalls_createsDistinctMocks() throws Throwable {
        // Setup
        final GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(TestInterface.class);
        ReturnsDeepStubs spy = new ReturnsDeepStubs() {
            @Override
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return metadata;
            }
        };
        InvocationOnMock invocation = createInvocation("testMethod", TestInterface.class);
        
        // Exercise
        Object first = spy.answer(invocation);
        Object second = spy.answer(invocation);
        
        // Verify
        assertNotNull(first);
        assertNotNull(second);
        assertNotSame(first, second);
    }

    @Test
    public void testAnswer_withStubAndAdditionallyDeepStub() throws Throwable {
        // Setup: First stub returns specific mock, then additional deep stub for different method
        TestInterface stubbedMock = Mockito.mock(TestInterface.class);
        InvocationOnMock stubInvocation = createInvocation("stubbedMethod", TestInterface.class);
        InvocationMatcher stubMatcher = new InvocationMatcher(stubInvocation);
        StubbedInvocationMatcher stub = new StubbedInvocationMatcher(stubMatcher, new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return stubbedMock;
            }
        });
        mockContainer.addAnswer(stub, true);
        mockContainer.setAnswersForStubbing(Collections.singletonList(stub), null);

        ReturnsDeepStubs spy = new ReturnsDeepStubs() {
            @Override
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return GenericMetadataSupport.inferFrom(TestInterface.class);
            }
        };
        
        // Exercise
        Object stubResult = spy.answer(stubInvocation);
        
        // Verify
        assertSame(stubbedMock, stubResult);
    }

    @Test
    public void testWithSettingsUsing_withExtraInterfaces() {
        // Setup
        final GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(TestInterface.class);
        returnsDeepStubs = new ReturnsDeepStubs() {
            @Override
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return metadata;
            }
        };

        // Exercise - via reflection to access private method
        CreateDeepStubMockTask task = new CreateDeepStubMockTask(returnsDeepStubs, metadata);
        Object result = task.call();
        
        // Verify
        assertNotNull(result);
        assertTrue(result instanceof TestInterface);
    }

    // Inner class to access private method via reflection (for testing)
    private static class CreateDeepStubMockTask {
        private final ReturnsDeepStubs target;
        private final GenericMetadataSupport metadata;

        CreateDeepStubMockTask(ReturnsDeepStubs target, GenericMetadataSupport metadata) {
            this.target = target;
            this.metadata = metadata;
        }

        Object call() {
            try {
                java.lang.reflect.Method method = ReturnsDeepStubs.class.getDeclaredMethod("createNewDeepStubMock", GenericMetadataSupport.class);
                method.setAccessible(true);
                return method.invoke(target, metadata);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Test helper: create InvocationOnMock from method
    private InvocationOnMock createInvocation(String methodName, Class<?> returnType) {
        try {
            Method method = TestInterface.class.getMethod(methodName);
            return new InvocationImpl(mock, method, new Object[0], 0, null, mockContainer, new Answer<Object>() {
                @Override
                public Object answer(InvocationOnMock invocation) {
                    return null;
                }
            });
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    // Test interface
    interface TestInterface {
        TestInterface testMethod();
        int getPrimitiveInt();
        String getString();
    }

    // Generic interface for testing generic return types
    interface GenericTestInterface<T> {
        T getValue();
        GenericTestInterface<T> next();
    }
}