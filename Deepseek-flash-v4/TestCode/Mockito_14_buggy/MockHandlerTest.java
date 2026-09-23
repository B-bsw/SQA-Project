package org.mockito.internal;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.invocation.MatchersBinder;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.InvocationContainer;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.stubbing.OngoingStubbingImpl;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.internal.stubbing.VoidMethodStubbableImpl;
import org.mockito.internal.verification.VerificationDataImpl;
import org.mockito.stubbing.Answer;
import org.mockito.verification.VerificationMode;
import java.util.List;
import java.util.Arrays;

public class MockHandlerTest {
    private MockHandler<Object> mockHandler;
    private MockSettingsImpl mockSettings;

    @Before
    public void setUp() {
        mockSettings = new MockSettingsImpl();
        mockHandler = new MockHandler<Object>(mockSettings);
    }

    @Test
    public void testConstructorWithSettings() {
        assertNotNull(mockHandler);
        assertNotNull(mockHandler.getMockSettings());
        assertSame(mockSettings, mockHandler.getMockSettings());
        assertNotNull(mockHandler.getInvocationContainer());
    }

    @Test
    public void testDefaultConstructor() {
        MockHandler<Object> handler = new MockHandler<Object>();
        assertNotNull(handler);
        assertNotNull(handler.getMockSettings());
        assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void testConstructorWithOldMockHandler() {
        MockHandlerInterface<Object> oldHandler = new MockHandler<Object>();
        MockHandler<Object> handler = new MockHandler<Object>(oldHandler);
        assertNotNull(handler);
        assertNotNull(handler.getMockSettings());
    }

    @Test
    public void testHandleWithAnswersForStubbing() throws Throwable {
        InvocationContainerImpl container = mockHandler.invocationContainerImpl;
        Answer<Void> answer = new Answer<Void>() {
            public Void answer(org.mockito.invocation.InvocationOnMock invocation) {
                return null;
            }
        };
        mockHandler.setAnswersForStubbing(Arrays.<Answer>asList(answer));
        Invocation invocation = Mockito.mock(Invocation.class);
        Object result = mockHandler.handle(invocation);
        assertNull(result);
    }

    @Test
    public void testHandleWithVerificationMode() throws Throwable {
        Invocation invocation = Mockito.mock(Invocation.class);
        InvocationMatcher matcher = new InvocationMatcher(invocation);
        verificationMode = mock(VerificationMode.class);
        mockingProgress = mock(MockingProgress.class);
        mockHandler.mockingProgress = mockingProgress;
        when(mockingProgress.pullVerificationMode()).thenReturn(verificationMode);
        when(mockingProgress.getArgumentMatcherStorage()).thenReturn(new ArgumentMatcherStorage());
        doNothing().when(verificationMode).verify(any(VerificationDataImpl.class));
        Object result = mockHandler.handle(invocation);
        assertNull(result);
    }

    @Test
    public void testHandleWithStubbedInvocation() throws Throwable {
        Invocation invocation = Mockito.mock(Invocation.class);
        StubbedInvocationMatcher stubbedInvocation = mock(StubbedInvocationMatcher.class);
        InvocationContainerImpl container = mock(InvocationContainerImpl.class);
        mockHandler.invocationContainerImpl = container;
        when(container.findAnswerFor(any(Invocation.class))).thenReturn(stubbedInvocation);
        when(stubbedInvocation.answer(invocation)).thenReturn("stubbedResult");
        Object result = mockHandler.handle(invocation);
        assertEquals("stubbedResult", result);
    }

    @Test
    public void testHandleWithDefaultAnswer() throws Throwable {
        Invocation invocation = Mockito.mock(Invocation.class);
        InvocationContainerImpl container = mock(InvocationContainerImpl.class);
        mockHandler.invocationContainerImpl = container;
        when(container.findAnswerFor(any(Invocation.class))).thenReturn(null);
        Object result = mockHandler.handle(invocation);
        assertNull(result);
        verify(container).resetInvocationForPotentialStubbing(any(InvocationMatcher.class));
    }

    @Test
    public void testVoidMethodStubbable() {
        Object mock = new Object();
        VoidMethodStubbable<Object> stubbable = mockHandler.voidMethodStubbable(mock);
        assertNotNull(stubbable);
        assertTrue(stubbable instanceof VoidMethodStubbableImpl);
    }

    @Test
    public void testGetMockSettings() {
        assertNotNull(mockHandler.getMockSettings());
        assertSame(mockSettings, mockHandler.getMockSettings());
    }

    @Test
    public void testSetAnswersForStubbing() {
        Answer<Void> answer = new Answer<Void>() {
            public Void answer(org.mockito.invocation.InvocationOnMock invocation) {
                return null;
            }
        };
        mockHandler.setAnswersForStubbing(Arrays.<Answer>asList(answer));
    }

    @Test
    public void testGetInvocationContainer() {
        InvocationContainer container = mockHandler.getInvocationContainer();
        assertNotNull(container);
        assertSame(mockHandler.invocationContainerImpl, container);
    }

    @Test
    public void testHandleWithVerificationModeAndNoInvocations() throws Throwable {
        Invocation invocation = Mockito.mock(Invocation.class);
        VerificationMode verificationMode = mock(VerificationMode.class);
        MockingProgress mockingProgress = mock(MockingProgress.class);
        mockHandler.mockingProgress = mockingProgress;
        when(mockingProgress.pullVerificationMode()).thenReturn(verificationMode);
        when(mockingProgress.getArgumentMatcherStorage()).thenReturn(new ArgumentMatcherStorage());
        doNothing().when(verificationMode).verify(any(VerificationDataImpl.class));
        Object result = mockHandler.handle(invocation);
        assertNull(result);
    }

    @Test(expected = RuntimeException.class)
    public void testHandleWithVerificationFailure() throws Throwable {
        Invocation invocation = Mockito.mock(Invocation.class);
        VerificationMode verificationMode = mock(VerificationMode.class);
        MockingProgress mockingProgress = mock(MockingProgress.class);
        mockHandler.mockingProgress = mockingProgress;
        when(mockingProgress.pullVerificationMode()).thenReturn(verificationMode);
        when(mockingProgress.getArgumentMatcherStorage()).thenReturn(new ArgumentMatcherStorage());
        doThrow(new RuntimeException("verification failed")).when(verificationMode).verify(any(VerificationDataImpl.class));
        mockHandler.handle(invocation);
    }

    @Test
    public void testHandleWithNoVerificationAndNoStubbing() throws Throwable {
        Invocation invocation = Mockito.mock(Invocation.class);
        MockingProgress mockingProgress = mock(MockingProgress.class);
        mockHandler.mockingProgress = mockingProgress;
        when(mockingProgress.pullVerificationMode()).thenReturn(null);
        when(mockingProgress.getArgumentMatcherStorage()).thenReturn(new ArgumentMatcherStorage());
        InvocationContainerImpl container = mock(InvocationContainerImpl.class);
        mockHandler.invocationContainerImpl = container;
        when(container.findAnswerFor(any(Invocation.class))).thenReturn(null);
        Object result = mockHandler.handle(invocation);
        assertNull(result);
    }

    @Test
    public void testHandleWithStubbedInvocationCapturesArguments() throws Throwable {
        Invocation invocation = Mockito.mock(Invocation.class);
        StubbedInvocationMatcher stubbedInvocation = mock(StubbedInvocationMatcher.class);
        InvocationContainerImpl container = mock(InvocationContainerImpl.class);
        mockHandler.invocationContainerImpl = container;
        when(container.findAnswerFor(any(Invocation.class))).thenReturn(stubbedInvocation);
        when(stubbedInvocation.answer(invocation)).thenReturn("result");
        Object result = mockHandler.handle(invocation);
        assertEquals("result", result);
        verify(stubbedInvocation).captureArgumentsFrom(invocation);
    }

    @Test
    public void testHandleWithResetInvocationForPotentialStubbing() throws Throwable {
        Invocation invocation = Mockito.mock(Invocation.class);
        InvocationContainerImpl container = mock(InvocationContainerImpl.class);
        mockHandler.invocationContainerImpl = container;
        when(container.findAnswerFor(any(Invocation.class))).thenReturn(null);
        mockHandler.handle(invocation);
        verify(container).resetInvocationForPotentialStubbing(any(InvocationMatcher.class));
    }
}