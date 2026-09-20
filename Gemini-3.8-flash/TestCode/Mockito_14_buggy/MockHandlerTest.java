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
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.verification.VerificationMode;

public class MockHandlerTest {

    private MockHandler<DummyService> mockHandler;
    private MockSettingsImpl mockSettings;
    private DummyService dummyService;
    private Invocation dummyInvocation;

    public static class DummyService {
        public String execute() {
            return "original";
        }

        public String echo(String input) {
            return input;
        }
    }

    @Before
    public void setUp() throws Exception {
        this.mockSettings = new MockSettingsImpl();
        this.mockHandler = new MockHandler<DummyService>(mockSettings);
        this.dummyService = new DummyService();
        this.dummyInvocation = createTestInvocation(dummyService, "execute", new Class<?>[0], new Object[0]);
    }

    @Test
    public void constructor_default_shouldInitializeNonNullFields() {
        // Arrange & Act
        MockHandler<Object> handler = new MockHandler<Object>();

        // Assert
        Assert.assertNotNull(handler.getMockSettings());
        Assert.assertNotNull(handler.getInvocationContainer());
        Assert.assertNotNull(handler.mockingProgress);
        Assert.assertNotNull(handler.matchersBinder);
    }

    @Test
    public void constructor_withMockSettings_shouldStoreSettings() {
        // Arrange
        MockSettingsImpl customSettings = new MockSettingsImpl();

        // Act
        MockHandler<Object> handler = new MockHandler<Object>(customSettings);

        // Assert
        Assert.assertSame(customSettings, handler.getMockSettings());
        Assert.assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void constructor_withOldMockHandler_shouldCopyMockSettings() {
        // Arrange
        final MockSettingsImpl customSettings = new MockSettingsImpl();
        MockHandlerInterface<DummyService> oldHandler = new MockHandlerInterface<DummyService>() {
            public MockSettingsImpl getMockSettings() {
                return customSettings;
            }

            public InvocationContainer getInvocationContainer() {
                return null;
            }
        };

        // Act
        MockHandler<DummyService> handler = new MockHandler<DummyService>(oldHandler);

        // Assert
        Assert.assertSame(customSettings, handler.getMockSettings());
        Assert.assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void getMockSettings_givenConstructedHandler_shouldReturnSameSettingsInstance() {
        // Arrange & Act
        MockSettingsImpl retrievedSettings = mockHandler.getMockSettings();

        // Assert
        Assert.assertSame(mockSettings, retrievedSettings);
    }

    @Test
    public void getInvocationContainer_givenConstructedHandler_shouldReturnNonNullContainer() {
        // Arrange & Act
        InvocationContainer container = mockHandler.getInvocationContainer();

        // Assert
        Assert.assertNotNull(container);
        Assert.assertSame(mockHandler.invocationContainerImpl, container);
    }

    @Test
    public void voidMethodStubbable_givenMockInstance_shouldReturnNonNullVoidMethodStubbable() {
        // Arrange
        DummyService serviceMock = new DummyService();

        // Act
        VoidMethodStubbable<DummyService> stubbable = mockHandler.voidMethodStubbable(serviceMock);

        // Assert
        Assert.assertNotNull(stubbable);
    }

    @Test
    public void handle_whenHasAnswersForStubbing_shouldBindMatcherAndReturnNull() throws Throwable {
        // Arrange
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(new Answer<String>() {
            public String answer(InvocationOnMock invocation) {
                return "stubbed";
            }
        });
        mockHandler.setAnswersForStubbing(answers);

        // Act
        Object result = mockHandler.handle(dummyInvocation);

        // Assert
        Assert.assertNull(result);
        Assert.assertFalse(mockHandler.invocationContainerImpl.hasAnswersForStubbing());
    }

    @Test
    public void handle_whenVerificationModeActive_shouldInvokeVerifyAndReturnNull() throws Throwable {
        // Arrange
        final boolean[] verifyInvoked = new boolean[] { false };
        final VerificationData[] passedData = new VerificationData[1];

        VerificationMode verificationMode = new VerificationMode() {
            public void verify(VerificationData data) {
                verifyInvoked[0] = true;
                passedData[0] = data;
            }
        };

        mockHandler.mockingProgress.verificationStarted(verificationMode);

        // Act
        Object result = mockHandler.handle(dummyInvocation);

        // Assert
        Assert.assertNull(result);
        Assert.assertTrue(verifyInvoked[0]);
        Assert.assertNotNull(passedData[0]);
        Assert.assertNull(mockHandler.mockingProgress.pullVerificationMode());
    }

    @Test
    public void handle_whenVerificationModeThrowsException_shouldPropagateException() throws Throwable {
        // Arrange
        final RuntimeException expectedException = new RuntimeException("Verification assertion failed");
        VerificationMode verificationMode = new VerificationMode() {
            public void verify(VerificationData data) {
                throw expectedException;
            }
        };

        mockHandler.mockingProgress.verificationStarted(verificationMode);

        // Act & Assert
        try {
            mockHandler.handle(dummyInvocation);
            Assert.fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException actualException) {
            Assert.assertSame(expectedException, actualException);
        }
    }

    @Test
    public void handle_whenInvocationIsStubbed_shouldReturnStubbedAnswer() throws Throwable {
        // Arrange
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(new Answer<String>() {
            public String answer(InvocationOnMock invocation) {
                return "stubbed_value";
            }
        });
        mockHandler.setAnswersForStubbing(answers);
        mockHandler.handle(dummyInvocation);

        // Act
        Object result = mockHandler.handle(dummyInvocation);

        // Assert
        Assert.assertEquals("stubbed_value", result);
    }

    @Test
    public void handle_whenStubbedAnswerThrowsThrowable_shouldPropagateThrowable() throws Throwable {
        // Arrange
        final Exception expectedException = new IllegalStateException("Stubbed exception");
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) throws Throwable {
                throw expectedException;
            }
        });
        mockHandler.setAnswersForStubbing(answers);
        mockHandler.handle(dummyInvocation);

        // Act & Assert
        try {
            mockHandler.handle(dummyInvocation);
            Assert.fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException actualException) {
            Assert.assertSame(expectedException, actualException);
        }
    }

    @Test
    public void handle_whenConsecutiveAnswersProvided_shouldReturnAnswersInOrder() throws Throwable {
        // Arrange
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(new Answer<String>() {
            public String answer(InvocationOnMock invocation) {
                return "first";
            }
        });
        answers.add(new Answer<String>() {
            public String answer(InvocationOnMock invocation) {
                return "second";
            }
        });
        mockHandler.setAnswersForStubbing(answers);
        mockHandler.handle(dummyInvocation);

        // Act
        Object firstResult = mockHandler.handle(dummyInvocation);
        Object secondResult = mockHandler.handle(dummyInvocation);

        // Assert
        Assert.assertEquals("first", firstResult);
        Assert.assertEquals("second", secondResult);
    }

    @Test
    public void handle_whenInvocationNotStubbed_shouldReturnDefaultAnswer() throws Throwable {
        // Arrange
        MockSettingsImpl customSettings = new MockSettingsImpl();
        customSettings.defaultAnswer(new Answer<String>() {
            public String answer(InvocationOnMock invocation) {
                return "default_value";
            }
        });
        MockHandler<DummyService> handler = new MockHandler<DummyService>(customSettings);

        // Act
        Object result = handler.handle(dummyInvocation);

        // Assert
        Assert.assertEquals("default_value", result);
    }

    @Test
    public void handle_whenDefaultAnswerThrowsThrowable_shouldPropagateThrowable() throws Throwable {
        // Arrange
        final RuntimeException expectedException = new RuntimeException("Default answer failure");
        MockSettingsImpl customSettings = new MockSettingsImpl();
        customSettings.defaultAnswer(new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) {
                throw expectedException;
            }
        });
        MockHandler<DummyService> handler = new MockHandler<DummyService>(customSettings);

        // Act & Assert
        try {
            handler.handle(dummyInvocation);
            Assert.fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException actualException) {
            Assert.assertSame(expectedException, actualException);
        }
    }

    @Test
    public void handle_whenStubbedWithArguments_shouldCaptureArguments() throws Throwable {
        // Arrange
        Invocation invocationWithArg = createTestInvocation(
                dummyService,
                "echo",
                new Class<?>[] { String.class },
                new Object[] { "test_argument" }
        );

        List<Answer> answers = new ArrayList<Answer>();
        answers.add(new Answer<String>() {
            public String answer(InvocationOnMock invocation) {
                return (String) invocation.getArguments()[0];
            }
        });

        mockHandler.setAnswersForStubbing(answers);
        mockHandler.handle(invocationWithArg);

        // Act
        Object result = mockHandler.handle(invocationWithArg);

        // Assert
        Assert.assertEquals("test_argument", result);
    }

    @Test
    public void handle_whenUnstubbedCallFollows_shouldResetInvocationForPotentialStubbing() throws Throwable {
        // Arrange & Act
        Object firstCall = mockHandler.handle(dummyInvocation);

        // Assert
        Assert.assertNull(firstCall);
        StubbedInvocationMatcher answer = mockHandler.invocationContainerImpl.findAnswerFor(dummyInvocation);
        Assert.assertNull(answer);
    }

    private static Invocation createTestInvocation(Object mock, String methodName, Class<?>[] paramTypes, Object[] args) throws Exception {
        Method method = mock.getClass().getMethod(methodName, paramTypes);
        Constructor<?>[] constructors = Invocation.class.getDeclaredConstructors();

        for (int i = 0; i < constructors.length; i++) {
            Constructor<?> constructor = constructors[i];
            constructor.setAccessible(true);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] parameterValues = new Object[parameterTypes.length];
            boolean compatible = true;

            for (int j = 0; j < parameterTypes.length; j++) {
                Class<?> paramType = parameterTypes[j];
                if (paramType.isAssignableFrom(mock.getClass())) {
                    parameterValues[j] = mock;
                } else if (paramType.isAssignableFrom(method.getClass())) {
                    parameterValues[j] = method;
                } else if (paramType.getName().endsWith("MockitoMethod")) {
                    parameterValues[j] = createMockitoMethodProxy(method, paramType);
                } else if (paramType.isArray() && paramType.getComponentType() == Object.class) {
                    parameterValues[j] = (args != null) ? args : new Object[0];
                } else if (paramType == int.class || paramType == Integer.class) {
                    parameterValues[j] = Integer.valueOf(1);
                } else if (paramType.getName().endsWith("RealMethod")) {
                    parameterValues[j] = createRealMethodProxy(paramType);
                } else {
                    parameterValues[j] = null;
                }
            }

            if (compatible) {
                try {
                    return (Invocation) constructor.newInstance(parameterValues);
                } catch (Exception ignored) {
                }
            }
        }
        throw new IllegalStateException("Failed to construct Invocation test double.");
    }

    private static Object createMockitoMethodProxy(final Method method, Class<?> mockitoMethodInterface) {
        return Proxy.newProxyInstance(
                mockitoMethodInterface.getClassLoader(),
                new Class<?>[] { mockitoMethodInterface },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method invokedMethod, Object[] args) throws Throwable {
                        String name = invokedMethod.getName();
                        if ("getMethod".equals(name)) {
                            return method;
                        } else if ("getName".equals(name)) {
                            return method.getName();
                        } else if ("getReturnType".equals(name)) {
                            return method.getReturnType();
                        } else if ("getParameterTypes".equals(name)) {
                            return method.getParameterTypes();
                        } else if ("getExceptionTypes".equals(name)) {
                            return method.getExceptionTypes();
                        } else if ("isVarArgs".equals(name)) {
                            return Boolean.valueOf(method.isVarArgs());
                        } else if ("equals".equals(name)) {
                            return Boolean.valueOf(proxy == args[0]);
                        } else if ("hashCode".equals(name)) {
                            return Integer.valueOf(System.identityHashCode(proxy));
                        }
                        return null;
                    }
                }
        );
    }

    private static Object createRealMethodProxy(Class<?> realMethodInterface) {
        return Proxy.newProxyInstance(
                realMethodInterface.getClassLoader(),
                new Class<?>[] { realMethodInterface },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method invokedMethod, Object[] args) throws Throwable {
                        return null;
                    }
                }
        );
    }
}