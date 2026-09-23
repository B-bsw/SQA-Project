package org.mockito.internal;

import org.junit.Before;
import org.junit.Test;
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
import org.mockito.internal.verification.MockAwareVerificationMode;
import org.mockito.internal.verification.VerificationDataImpl;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.verification.VerificationMode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class MockHandlerTest {

    private MockSettingsImpl mockSettings;
    private MockHandler<Object> mockHandler;

    @Before
    public void setUp() {
        mockSettings = new MockSettingsImpl();
        mockHandler = new MockHandler<Object>(mockSettings);
    }

    @Test
    public void testConstructorWithMockSettings() {
        MockSettingsImpl newSettings = new MockSettingsImpl();
        MockHandler<Object> newHandler = new MockHandler<Object>(newSettings);
        assertNotNull(newHandler);
        assertSame(newSettings, newHandler.getMockSettings());
        assertNotNull(newHandler.getInvocationContainer());
        assertNotNull(newHandler.matchersBinder);
        assertNotNull(newHandler.mockingProgress);
    }

    @Test
    public void testDefaultConstructor() {
        MockHandler<Object> defaultHandler = new MockHandler<Object>();
        assertNotNull(defaultHandler);
        assertNull(defaultHandler.getMockSettings());
    }

    @Test
    public void testCopyConstructor() {
        MockHandler<Object> original = new MockHandler<Object>(mockSettings);
        MockHandler<Object> copy = new MockHandler<Object>(original);
        assertNotNull(copy);
        assertEquals(mockSettings, copy.getMockSettings());
    }

    @Test
    public void testHandleWithAnswersForStubbing() throws Throwable {
        Invocation invocation = new InvocationBuilder().createInvocation();
        mockHandler.setAnswersForStubbing(Collections.<Answer>singletonList(new SimpleAnswer("stubbed")));
        Object result = mockHandler.handle(invocation);
        assertNull(result);
        assertTrue(invocationContainerHasAnswersForStubbing());
    }

    @Test
    public void testHandleWithNullVerificationMode() throws Throwable {
        Invocation invocation = new InvocationBuilder().createInvocation();
        Object result = mockHandler.handle(invocation);
        assertNotNull(result);
        assertTrue(mockHandler.getInvocationContainer() instanceof InvocationContainerImpl);
    }

    @Test
    public void testHandleWithVerificationModeNotMatchingMock() throws Throwable {
        Invocation invocation = new InvocationBuilder().createInvocation();
        MockAwareVerificationMode verificationMode = new MockAwareVerificationMode(
            new Object(), mock(VerificationMode.class));
        mockHandler.mockingProgress.verificationStarted(verificationMode);
        Object result = mockHandler.handle(invocation);
        assertNotNull(result);
    }

    @Test
    public void testHandleWithVerificationModeMatchingMock() throws Throwable {
        Object mock = new Object();
        Invocation invocation = new InvocationBuilder().withMock(mock).createInvocation();
        VerificationMode verificationModeMock = mock(VerificationMode.class);
        MockAwareVerificationMode verificationMode = new MockAwareVerificationMode(mock, verificationModeMock);
        mockHandler.mockingProgress.verificationStarted(verificationMode);
        Object result = mockHandler.handle(invocation);
        assertNull(result);
    }

    @Test
    public void testHandleWithStubbedInvocation() throws Throwable {
        StubbedInvocationMatcher stubbed = new StubbedInvocationMatcher(
            new InvocationMatcher(new InvocationBuilder().createInvocation(), Collections.emptyList()),
            new SimpleAnswer("result"));
        ((InvocationContainerImpl) mockHandler.getInvocationContainer()).addAnswer(stubbed);
        Invocation invocation = new InvocationBuilder().createInvocation();
        Object result = mockHandler.handle(invocation);
        assertEquals("result", result);
    }

    @Test
    public void testHandleWithNoStubUsesDefaultAnswer() throws Throwable {
        mockSettings.setDefaultAnswer(new SimpleAnswer("default"));
        Invocation invocation = new InvocationBuilder().createInvocation();
        Object result = mockHandler.handle(invocation);
        assertEquals("default", result);
    }

    @Test
    public void testHandleWithDefaultAnswerNull() throws Throwable {
        mockSettings.setDefaultAnswer(new SimpleAnswer(null));
        Invocation invocation = new InvocationBuilder().createInvocation();
        Object result = mockHandler.handle(invocation);
        assertNull(result);
    }

    @Test
    public void testHandleWithDefaultAnswerWhenNull() throws Throwable {
        mockSettings.setDefaultAnswer(new SimpleAnswer("whenNull"));
        Invocation invocation = new InvocationBuilder().createInvocation();
        Object result = mockHandler.handle(invocation);
        assertEquals("whenNull", result);
        assertFalse(invocationContainerHasAnswersForStubbing());
    }

    @Test
    public void testVoidMethodStubbable() {
        Object mock = new Object();
        VoidMethodStubbable<Object> stubbable = mockHandler.voidMethodStubbable(mock);
        assertNotNull(stubbable);
        assertTrue(stubbable instanceof VoidMethodStubbableImpl);
    }

    @Test
    public void testSetAnswersForStubbing() {
        List<Answer> answers = Arrays.<Answer>asList(new SimpleAnswer("a"), new SimpleAnswer("b"));
        mockHandler.setAnswersForStubbing(answers);
        InvocationContainerImpl container = (InvocationContainerImpl) mockHandler.getInvocationContainer();
        assertTrue(container.hasAnswersForStubbing());
    }

    @Test
    public void testGetMockSettings() {
        assertSame(mockSettings, mockHandler.getMockSettings());
    }

    @Test
    public void testGetInvocationContainer() {
        InvocationContainer container = mockHandler.getInvocationContainer();
        assertNotNull(container);
        assertTrue(container instanceof InvocationContainerImpl);
    }

    @Test
    public void testHandleWithEmptyInvocationContainer() throws Throwable {
        Invocation invocation = new InvocationBuilder().createInvocation();
        mockHandler.handle(invocation);
        assertNotNull(mockHandler.getInvocationContainer());
    }

    @Test
    public void testHandleWithMultipleStubbedInvocations() throws Throwable {
        InvocationMatcher matcher1 = new InvocationMatcher(new InvocationBuilder().withMethodName("method1").createInvocation(), Collections.emptyList());
        InvocationMatcher matcher2 = new InvocationMatcher(new InvocationBuilder().withMethodName("method2").createInvocation(), Collections.emptyList());
        ((InvocationContainerImpl) mockHandler.getInvocationContainer()).addAnswer(new StubbedInvocationMatcher(matcher1, new SimpleAnswer("first")));
        ((InvocationContainerImpl) mockHandler.getInvocationContainer()).addAnswer(new StubbedInvocationMatcher(matcher2, new SimpleAnswer("second")));

        Invocation invocation = new InvocationBuilder().withMethodName("method1").createInvocation();
        assertEquals("first", mockHandler.handle(invocation));
    }

    @Test
    public void testHandleWithVerificationModeMatchingMockAndDataVerification() throws Throwable {
        Object mock = new Object();
        Invocation invocation = new InvocationBuilder().withMock(mock).createInvocation();
        VerificationMode verificationModeMock = mock(VerificationMode.class);
        MockAwareVerificationMode verificationMode = new MockAwareVerificationMode(mock, verificationModeMock);
        mockHandler.mockingProgress.verificationStarted(verificationMode);
        mockHandler.handle(invocation);
        // verify that verification mode is used - no exception thrown
    }

    @Test
    public void testHandleWithNullMockSettings() throws Throwable {
        MockHandler<Object> nullSettingsHandler = new MockHandler<Object>(null);
        Invocation invocation = new InvocationBuilder().createInvocation();
        Object result = nullSettingsHandler.handle(invocation);
        assertNotNull(result);
    }

    private boolean invocationContainerHasAnswersForStubbing() {
        return ((InvocationContainerImpl) mockHandler.getInvocationContainer()).hasAnswersForStubbing();
    }

    private static class InvocationBuilder {
        private Object mock = new Object();
        private String methodName = "method";

        public InvocationBuilder withMock(Object mock) {
            this.mock = mock;
            return this;
        }

        public InvocationBuilder withMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }

        public Invocation createInvocation() {
            try {
                return new Invocation(mock, getClass().getMethod(methodName), new Object[0], 0, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static class SimpleAnswer implements Answer<Object> {
        private final Object value;

        public SimpleAnswer(Object value) {
            this.value = value;
        }

        @Override
        public Object answer(org.mockito.invocation.InvocationOnMock invocation) {
            return value;
        }
    }

    private VerificationMode mock(Class<VerificationMode> type) {
        return new VerificationMode() {
            @Override
            public void verify(VerificationDataImpl data) {
            }
        };
    }
}