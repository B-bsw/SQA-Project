package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.InternalMockHandler;
import org.mockito.internal.MockitoCore;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.creation.settings.CreationSettings;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.invocation.MockHandlerImpl;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.reflection.GenericMaster;
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.invocation.MockHandler;
import org.mockito.mock.MockCreationSettings;
import org.mockito.stubbing.Answer;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReturnsDeepStubsTest {

    private ReturnsDeepStubs returnsDeepStubs;
    private MockitoCore mockitoCore;
    private MockUtil mockUtil;
    private GenericMetadataSupport genericMetadataSupport;
    private InvocationOnMock invocation;
    private Method testMethod;
    private Object mockInstance;
    private CreationSettings mockSettings;
    private MockHandlerImpl mockHandler;
    private InvocationContainerImpl invocationContainer;

    @Before
    public void setUp() throws Exception {
        mockitoCore = mock(MockitoCore.class);
        mockUtil = new MockUtil();
        returnsDeepStubs = new ReturnsDeepStubs();
        testMethod = TestInterface.class.getMethod("getValue");
        
        // Setup mocks
        mockInstance = mock(TestInterface.class);
        when(mockitoCore.mock(any(Class.class), any(MockSettingsImpl.class))).thenReturn(mockInstance);
        
        mockHandler = new MockHandlerImpl(mock(TestInterface.class));
        mockHandler = spy(mockHandler);
        
        invocationContainer = new InvocationContainerImpl(mockHandler);
        
        // Setup invocation mock
        invocation = mock(InvocationOnMock.class);
        when(invocation.getMock()).thenReturn(mockInstance);
        when(invocation.getMethod()).thenReturn(testMethod);
        
        genericMetadataSupport = GenericMetadataSupport.inferFrom(TestInterface.class);
    }

    @Test
    public void testAnswerWithMockableReturnType() throws Throwable {
        // Setup
        GenericMetadataSupport metadata = mock(GenericMetadataSupport.class);
        when(metadata.rawType()).thenReturn((Class) String.class);
        when(invocation.getMethod()).thenReturn(testMethod);
        when(invocation.getMock()).thenReturn(mockInstance);
        
        // Mock internal state
        MockUtil mockUtilMock = mock(MockUtil.class);
        when(mockUtilMock.getMockHandler(mockInstance)).thenReturn(mockHandler);
        when(mockHandler.getMockSettings()).thenReturn(mockSettings);
        when(mockSettings.getTypeToMock()).thenReturn((Class) TestInterface.class);
        
        // Need to override actualParameterizedType to return our metadata
        ReturnsDeepStubs spyStubs = spy(returnsDeepStubs);
        doReturn(metadata).when(spyStubs).actualParameterizedType(any(Object.class));
        
        // Execute
        Object result = spyStubs.answer(invocation);
        
        // Verify interaction with container
        verify(mockHandler).getInvocationContainer();
    }

    @Test
    public void testAnswerWithUnmockableReturnType() throws Throwable {
        // Setup
        GenericMetadataSupport metadata = mock(GenericMetadataSupport.class);
        when(metadata.rawType()).thenReturn((Class) Integer.TYPE);
        
        InvocationOnMock invocationMock = mock(InvocationOnMock.class);
        when(invocationMock.getMock()).thenReturn(mockInstance);
        when(invocationMock.getMethod()).thenReturn(testMethod);
        
        MockUtil mockUtil = new MockUtil();
        when(invocationMock.getMock()).thenReturn(mockInstance);
        
        ReturnsDeepStubs spyStubs = spy(returnsDeepStubs);
        doReturn(metadata).when(spyStubs).actualParameterizedType(any(Object.class));
        
        // Execute
        Object result = spyStubs.answer(invocationMock);
        
        // Verify returns empty value for primitive
        assertEquals(0, result);
    }

    @Test
    public void testDeepStubWithExistingStubbedInvocation() throws Throwable {
        // Setup
        GenericMetadataSupport metadata = mock(GenericMetadataSupport.class);
        when(metadata.rawType()).thenReturn((Class) String.class);
        
        // Create a stubbed invocation matcher
        StubbedInvocationMatcher stubbedMatcher = mock(StubbedInvocationMatcher.class);
        InvocationContainerImpl container = mock(InvocationContainerImpl.class);
        when(container.getStubbedInvocations()).thenReturn(java.util.Collections.singletonList(stubbedMatcher));
        when(container.getInvocationForStubbing()).thenReturn(mock(InvocationMatcher.class));
        
        MockHandler mockHandler = mock(MockHandler.class);
        when(mockHandler.getInvocationContainer()).thenReturn(container);
        
        MockUtil mockUtil = mock(MockUtil.class);
        when(mockUtil.getMockHandler(mockInstance)).thenReturn((InternalMockHandler) mockHandler);
        
        ReturnsDeepStubs spyStubs = spy(returnsDeepStubs);
        doReturn(metadata).when(spyStubs).actualParameterizedType(any(Object.class));
        doReturn(true).when(stubbedMatcher).matches(any(InvocationMatcher.class));
        doReturn("existingValue").when(stubbedMatcher).answer(any(InvocationOnMock.class));
        
        // Execute
        Object result = spyStubs.answer(invocation);
        
        // Verify
        assertEquals("existingValue", result);
    }

    @Test
    public void testDeepStubWithNoExistingStub() throws Throwable {
        // Setup
        GenericMetadataSupport metadata = mock(GenericMetadataSupport.class);
        when(metadata.rawType()).thenReturn((Class) String.class);
        
        InvocationContainerImpl container = mock(InvocationContainerImpl.class);
        when(container.getStubbedInvocations()).thenReturn(java.util.Collections.emptyList());
        when(container.getInvocationForStubbing()).thenReturn(mock(InvocationMatcher.class));
        
        MockHandler mockHandler = mock(MockHandler.class);
        when(mockHandler.getInvocationContainer()).thenReturn(container);
        
        MockUtil mockUtil = mock(MockUtil.class);
        when(mockUtil.getMockHandler(mockInstance)).thenReturn((InternalMockHandler) mockHandler);
        
        ReturnsDeepStubs spyStubs = spy(returnsDeepStubs);
        doReturn(metadata).when(spyStubs).actualParameterizedType(any(Object.class));
        
        Object newMock = mock(Object.class);
        MockUtil mockUtilSpy = spy(mockUtil);
        
        // Execute
        Object result = spyStubs.answer(invocation);
        
        // Verify new mock was created and recorded
        verify(container, times(1)).addAnswer(any(DeeplyStubbedAnswer.class), eq(false));
        assertNotNull(result);
    }

    @Test
    public void testNewDeepStubMock() throws Throwable {
        GenericMetadataSupport metadata = mock(GenericMetadataSupport.class);
        when(metadata.rawType()).thenReturn((Class) String.class);
        when(metadata.hasRawExtraInterfaces()).thenReturn(false);
        
        Object mockResult = mock(Object.class);
        when(mockitoCore.mock(any(Class.class), any(MockSettingsImpl.class))).thenReturn(mockResult);
        
        ReturnsDeepStubs spyStubs = spy(returnsDeepStubs);
        doReturn(mockitoCore).when(spyStubs).mockitoCore();
        
        // Use reflection to call private method
        Method method = ReturnsDeepStubs.class.getDeclaredMethod("newDeepStubMock", GenericMetadataSupport.class);
        method.setAccessible(true);
        Object result = method.invoke(spyStubs, metadata);
        
        assertNotNull(result);
        assertEquals(mockResult, result);
    }

    @Test
    public void testActualParameterizedType() throws Exception {
        Object mock = mock(TestInterface.class);
        MockingProgress progress = new ThreadSafeMockingProgress();
        
        MockCreationSettings settings = new MockSettingsImpl().serializable();
        
        MockUtil mockUtil = new MockUtil();
        
        // We need to set up the mock handler properly
        Method method = MockUtil.class.getDeclaredMethod("createMock", MockCreationSettings.class);
        method.setAccessible(true);
        
        ReturnsDeepStubs stubs = new ReturnsDeepStubs();
        GenericMetadataSupport metadata = stubs.actualParameterizedType(mock);
        
        assertNotNull(metadata);
        assertEquals(TestInterface.class, metadata.rawType());
    }

    @Test
    public void testWithSerializationFallback() throws Throwable {
        GenericMetadataSupport metadata = mock(GenericMetadataSupport.class);
        when(metadata.rawType()).thenReturn((Class) String.class);
        when(metadata.hasRawExtraInterfaces()).thenReturn(true);
        
        Class[] extraInterfaces = {java.io.Serializable.class};
        when(metadata.rawExtraInterfaces()).thenReturn(extraInterfaces);
        
        MockSettingsImpl mockSettings = new MockSettingsImpl();
        when(mockitoCore.mock(any(Class.class), any(MockSettingsImpl.class))).thenReturn(mock(String.class));
        
        ReturnsDeepStubs spyStubs = spy(returnsDeepStubs);
        doReturn(mockitoCore).when(spyStubs).mockitoCore();
        
        // Test private method via reflection
        Method method = ReturnsDeepStubs.class.getDeclaredMethod("withSettingsUsing", GenericMetadataSupport.class);
        method.setAccessible(true);
        Object result = method.invoke(spyStubs, metadata);
        
        assertNotNull(result);
    }

    @Test
    public void testSerializableNestedMock() throws Throwable {
        GenericMetadataSupport metadata = mock(GenericMetadataSupport.class);
        when(metadata.rawType()).thenReturn((Class) String.class);
        when(metadata.hasRawExtraInterfaces()).thenReturn(false);
        
        // Test ReturnsDeepStubsSerializationFallback
        Method method = ReturnsDeepStubs.class.getDeclaredMethod("returnsDeepStubsAnswerUsing", GenericMetadataSupport.class);
        method.setAccessible(true);
        Object result = method.invoke(returnsDeepStubs, metadata);
        
        assertNotNull(result);
        assertTrue(result instanceof ReturnsDeepStubsSerializationFallback);
        
        ReturnsDeepStubsSerializationFallback fallback = (ReturnsDeepStubsSerializationFallback) result;
        assertNotNull(fallback.returnTypeGenericMetadata);
    }

    @Test
    public void testDeeplyStubbedAnswer() throws Throwable {
        Object mock = mock(Object.class);
        DeeplyStubbedAnswer answer = new DeeplyStubbedAnswer(mock);
        
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        Object result = answer.answer(invocation);
        
        assertSame(mock, result);
    }

    @Test
    public void testLazyHolder() {
        assertNotNull(ReturnsDeepStubs.LazyHolder.MOCKITO_CORE);
        assertNotNull(ReturnsDeepStubs.LazyHolder.DELEGATE);
    }

    @Test
    public void testAnswerWithNullReturnType() throws Throwable {
        GenericMetadataSupport metadata = mock(GenericMetadataSupport.class);
        when(metadata.rawType()).thenReturn((Class) Void.TYPE);
        
        ReturnsDeepStubs spyStubs = spy(returnsDeepStubs);
        doReturn(metadata).when(spyStubs).actualParameterizedType(any(Object.class));
        
        Object result = spyStubs.answer(invocation);
        assertNull(result);
    }

    private interface TestInterface {
        String getValue();
    }

    private class TestInvocation implements InvocationOnMock {
        private final Object mock;
        private final Method method;

        public TestInvocation(Object mock, Method method) {
            this.mock = mock;
            this.method = method;
        }

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
            return new Object[0];
        }

        @Override
        public <T> T getArgument(int index) {
            return null;
        }

        @Override
        public Object callRealMethod() throws Throwable {
            return null;
        }
    }
}