package org.mockito.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.stubbing.InvocationContainer;
import org.mockito.internal.verification.MockAwareVerificationMode;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.verification.VerificationMode;

public class MockHandlerTest {

    private MockSettingsImpl mockSettings;
    private MockHandler<Object> mockHandler;
    private Object dummyMock;

    @Before
    public void setUp() {
        mockSettings = new MockSettingsImpl();
        mockHandler = new MockHandler<Object>(mockSettings);
        dummyMock = new Object();
    }

    private Invocation createDummyInvocation(final Object mock) throws Exception {
        Constructor<?>[] constructors = Invocation.class.getConstructors();
        if (constructors.length == 0) {
            constructors = Invocation.class.getDeclaredConstructors();
        }

        final Method dummyMethod = Object.class.getMethod("toString", new Class[0]);

        for (int i = 0; i < constructors.length; i++) {
            Constructor<?> constructor = constructors[i];
            constructor.setAccessible(true);
            Class<?>[] paramTypes = constructor.getParameterTypes();
            Object[] args = new Object[paramTypes.length];

            for (int j = 0; j < paramTypes.length; j++) {
                Class<?> pt = paramTypes[j];
                if (pt.equals(Object.class)) {
                    args[j] = (j == 0) ? mock : new Object();
                } else if (pt.equals(Method.class)) {
                    args[j] = dummyMethod;
                } else if (pt.equals(Object[].class)) {
                    args[j] = new Object[0];
                } else if (pt.equals(int.class) || pt.equals(Integer.TYPE)) {
                    args[j] = Integer.valueOf(1);
                } else if (pt.isInterface()) {
                    args[j] = Proxy.newProxyInstance(
                        pt.getClassLoader(),
                        new Class<?>[] { pt },
                        new InvocationHandler() {
                            public Object invoke(Object proxy, Method method, Object[] mArgs) throws Throwable {
                                String name = method.getName();
                                if ("getName".equals(name)) {
                                    return "toString";
                                }
                                if ("getJavaMethod".equals(name)) {
                                    return dummyMethod;
                                }
                                if ("getParameterTypes".equals(name)) {
                                    return new Class[0];
                                }
                                if ("getReturnType".equals(name)) {
                                    return String.class;
                                }
                                if ("getExceptionTypes".equals(name)) {
                                    return new Class[0];
                                }
                                if ("isVarArgs".equals(name)) {
                                    return Boolean.FALSE;
                                }
                                if ("invoke".equals(name)) {
                                    return null;
                                }
                                if ("isAbstract".equals(name)) {
                                    return Boolean.FALSE;
                                }
                                return null;
                            }
                        }
                    );
                } else {
                    args[j] = null;
                }
            }

            try {
                return (Invocation) constructor.newInstance(args);
            } catch (Exception ignored) {
            }
        }
        throw new IllegalStateException("Unable to instantiate Invocation for test");
    }

    private VerificationMode createDummyVerificationMode(final boolean[] verifyFlag) {
        return (VerificationMode) Proxy.newProxyInstance(
            VerificationMode.class.getClassLoader(),
            new Class<?>[] { VerificationMode.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if ("verify".equals(method.getName())) {
                        if (verifyFlag != null && verifyFlag.length > 0) {
                            verifyFlag[0] = true;
                        }
                    }
                    return null;
                }
            }
        );
    }

    @Test
    public void defaultConstructor_givenNoArguments_shouldInitializeWithDefaultSettings() {
        MockHandler<Object> handler = new MockHandler<Object>();

        Assert.assertNotNull(handler.getMockSettings());
        Assert.assertNotNull(handler.getInvocationContainer());
        Assert.assertNotNull(handler.matchersBinder);
        Assert.assertNotNull(handler.mockingProgress);
    }

    @Test
    public void constructor_givenMockSettings_shouldStoreSettings() {
        MockSettingsImpl customSettings = new MockSettingsImpl();
        MockHandler<Object> handler = new MockHandler<Object>(customSettings);

        Assert.assertSame(customSettings, handler.getMockSettings());
        Assert.assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void constructor_givenOldMockHandler_shouldCopyMockSettings() {
        final MockSettingsImpl customSettings = new MockSettingsImpl();
        MockHandlerInterface<Object> oldHandler = new MockHandlerInterface<Object>() {
            public MockSettingsImpl getMockSettings() {
                return customSettings;
            }
            public InvocationContainer getInvocationContainer() {
                return null;
            }
        };

        MockHandler<Object> handler = new MockHandler<Object>(oldHandler);

        Assert.assertSame(customSettings, handler.getMockSettings());
    }

    @Test
    public void getInvocationContainer_givenInitializedHandler_shouldReturnInvocationContainer() {
        InvocationContainer container = mockHandler.getInvocationContainer();

        Assert.assertNotNull(container);
        Assert.assertSame(mockHandler.invocationContainerImpl, container);
    }

    @Test
    public void voidMethodStubbable_givenMockInstance_shouldReturnVoidMethodStubbable() {
        Object mock = new Object();

        VoidMethodStubbable<Object> stubbable = mockHandler.voidMethodStubbable(mock);

        Assert.assertNotNull(stubbable);
    }

    @Test
    public void handle_givenAnswersForStubbing_shouldSetMethodForStubbingAndReturnNull() throws Throwable {
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "stubbed";
            }
        });
        mockHandler.setAnswersForStubbing(answers);
        Invocation invocation = createDummyInvocation(dummyMock);

        Object result = mockHandler.handle(invocation);

        Assert.assertNull(result);
        Assert.assertFalse(mockHandler.invocationContainerImpl.hasAnswersForStubbing());
    }

    @Test
    public void handle_givenMatchingMockAwareVerificationMode_shouldVerifyAndReturnNull() throws Throwable {
        final boolean[] verified = new boolean[] { false };
        VerificationMode delegateMode = createDummyVerificationMode(verified);
        MockAwareVerificationMode mockAwareMode = new MockAwareVerificationMode(dummyMock, delegateMode);
        mockHandler.mockingProgress.verificationStarted(mockAwareMode);
        Invocation invocation = createDummyInvocation(dummyMock);

        Object result = mockHandler.handle(invocation);

        Assert.assertNull(result);
        Assert.assertTrue(verified[0]);
    }

    @Test
    public void handle_givenMockAwareVerificationModeWithDifferentMock_shouldNotVerifyAndProceed() throws Throwable {
        final boolean[] verified = new boolean[] { false };
        Object differentMock = new Object();
        VerificationMode delegateMode = createDummyVerificationMode(verified);
        MockAwareVerificationMode mockAwareMode = new MockAwareVerificationMode(differentMock, delegateMode);
        mockHandler.mockingProgress.verificationStarted(mockAwareMode);
        Invocation invocation = createDummyInvocation(dummyMock);

        Object result = mockHandler.handle(invocation);

        Assert.assertFalse(verified[0]);
        Assert.assertEquals("", result);
    }

    @Test
    public void handle_givenNonMockAwareVerificationMode_shouldNotVerifyAndProceed() throws Throwable {
        final boolean[] verified = new boolean[] { false };
        VerificationMode standardMode = createDummyVerificationMode(verified);
        mockHandler.mockingProgress.verificationStarted(standardMode);
        Invocation invocation = createDummyInvocation(dummyMock);

        Object result = mockHandler.handle(invocation);

        Assert.assertFalse(verified[0]);
        Assert.assertEquals("", result);
    }

    @Test
    public void handle_givenStubbedInvocationAnswer_shouldReturnStubbedAnswer() throws Throwable {
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "custom_return_value";
            }
        });
        mockHandler.setAnswersForStubbing(answers);
        Invocation invocation1 = createDummyInvocation(dummyMock);
        mockHandler.handle(invocation1);

        Invocation invocation2 = createDummyInvocation(dummyMock);
        Object result = mockHandler.handle(invocation2);

        Assert.assertEquals("custom_return_value", result);
    }

    @Test
    public void handle_givenUnstubbedInvocation_shouldReturnDefaultAnswer() throws Throwable {
        Invocation invocation = createDummyInvocation(dummyMock);

        Object result = mockHandler.handle(invocation);

        Assert.assertEquals("", result);
    }

    @Test
    public void handle_givenCustomDefaultAnswer_shouldReturnCustomDefault() throws Throwable {
        mockSettings.defaultAnswer(new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "default_from_settings";
            }
        });
        Invocation invocation = createDummyInvocation(dummyMock);

        Object result = mockHandler.handle(invocation);

        Assert.assertEquals("default_from_settings", result);
    }

    @Test
    public void handle_givenNullInvocation_shouldThrowNullPointerException() {
        try {
            mockHandler.handle(null);
            Assert.fail("Expected NullPointerException when invocation is null");
        } catch (NullPointerException expected) {
            Assert.assertNotNull(expected);
        } catch (Throwable unexpected) {
            Assert.fail("Expected NullPointerException but got " + unexpected.getClass().getName());
        }
    }
}