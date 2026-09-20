package org.mockito.internal.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.cglib.proxy.Callback;
import org.mockito.cglib.proxy.Factory;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MockSettingsImpl;

import java.io.Serializable;

public class MockUtilTest {

    private MockUtil mockUtil;

    public interface TestInterface {
        void execute();
    }

    public interface AnotherTestInterface {
        void anotherExecute();
    }

    public static class TestClass {
        private String value = "initial";

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    private static class DummyCallback implements Callback {
    }

    private static class DummyFactory implements Factory {
        private Callback callback;

        public DummyFactory(Callback callback) {
            this.callback = callback;
        }

        public Callback getCallback(int index) {
            if (index == 0) {
                return this.callback;
            }
            return null;
        }

        public void setCallback(int index, Callback callback) {
            if (index == 0) {
                this.callback = callback;
            }
        }

        public Object newInstance(Callback callback) {
            return null;
        }

        public Object newInstance(Callback[] callbacks) {
            return null;
        }

        public Object newInstance(Class[] types, Object[] args, Callback[] callbacks) {
            return null;
        }

        public void setCallbacks(Callback[] callbacks) {
            if (callbacks != null && callbacks.length > 0) {
                this.callback = callbacks[0];
            }
        }

        public Callback[] getCallbacks() {
            return new Callback[] { this.callback };
        }
    }

    private static class RecordingCreationValidator extends MockCreationValidator {
        private boolean validateTypeCalled = false;
        private boolean validateExtraInterfacesCalled = false;
        private boolean validateMockedTypeCalled = false;

        public void validateType(Class classToMock) {
            super.validateType(classToMock);
            this.validateTypeCalled = true;
        }

        public void validateExtraInterfaces(Class classToMock, Class[] extraInterfaces) {
            super.validateExtraInterfaces(classToMock, extraInterfaces);
            this.validateExtraInterfacesCalled = true;
        }

        public void validateMockedType(Class classToMock, Object spiedInstance) {
            super.validateMockedType(classToMock, spiedInstance);
            this.validateMockedTypeCalled = true;
        }
    }

    @Before
    public void setUp() {
        mockUtil = new MockUtil();
    }

    @Test
    public void constructor_givenDefaultConstructor_shouldInstantiateSuccessfully() {
        MockUtil util = new MockUtil();
        Assert.assertNotNull(util);
    }

    @Test
    public void constructor_givenCustomValidator_shouldUseCustomValidatorDuringCreation() {
        RecordingCreationValidator customValidator = new RecordingCreationValidator();
        MockUtil utilWithValidator = new MockUtil(customValidator);
        MockSettingsImpl settings = new MockSettingsImpl();

        TestInterface mock = utilWithValidator.createMock(TestInterface.class, settings);

        Assert.assertNotNull(mock);
        Assert.assertTrue(customValidator.validateTypeCalled);
        Assert.assertTrue(customValidator.validateExtraInterfacesCalled);
        Assert.assertTrue(customValidator.validateMockedTypeCalled);
    }

    @Test
    public void isMock_givenNull_shouldReturnFalse() {
        boolean result = mockUtil.isMock(null);
        Assert.assertFalse(result);
    }

    @Test
    public void isMock_givenOrdinaryObject_shouldReturnFalse() {
        boolean result = mockUtil.isMock(new Object());
        Assert.assertFalse(result);
    }

    @Test
    public void isMock_givenFactoryWithNullCallback_shouldReturnFalse() {
        DummyFactory factory = new DummyFactory(null);
        boolean result = mockUtil.isMock(factory);
        Assert.assertFalse(result);
    }

    @Test
    public void isMock_givenFactoryWithNonMethodInterceptorCallback_shouldReturnFalse() {
        DummyFactory factory = new DummyFactory(new DummyCallback());
        boolean result = mockUtil.isMock(factory);
        Assert.assertFalse(result);
    }

    @Test
    public void isMock_givenValidMock_shouldReturnTrue() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, new MockSettingsImpl());
        boolean result = mockUtil.isMock(mock);
        Assert.assertTrue(result);
    }

    @Test
    public void getMockHandler_givenNull_shouldThrowNotAMockException() {
        try {
            mockUtil.getMockHandler(null);
            Assert.fail("Expected NotAMockException to be thrown");
        } catch (NotAMockException e) {
            Assert.assertEquals("Argument should be a mock, but is null!", e.getMessage());
        }
    }

    @Test
    public void getMockHandler_givenOrdinaryObject_shouldThrowNotAMockException() {
        String nonMock = "Regular String";
        try {
            mockUtil.getMockHandler(nonMock);
            Assert.fail("Expected NotAMockException to be thrown");
        } catch (NotAMockException e) {
            Assert.assertEquals("Argument should be a mock, but is: " + nonMock.getClass(), e.getMessage());
        }
    }

    @Test
    public void getMockHandler_givenFactoryWithNullCallback_shouldThrowNotAMockException() {
        DummyFactory factory = new DummyFactory(null);
        try {
            mockUtil.getMockHandler(factory);
            Assert.fail("Expected NotAMockException to be thrown");
        } catch (NotAMockException e) {
            Assert.assertEquals("Argument should be a mock, but is: " + factory.getClass(), e.getMessage());
        }
    }

    @Test
    public void getMockHandler_givenFactoryWithNonMethodInterceptorCallback_shouldThrowNotAMockException() {
        DummyFactory factory = new DummyFactory(new DummyCallback());
        try {
            mockUtil.getMockHandler(factory);
            Assert.fail("Expected NotAMockException to be thrown");
        } catch (NotAMockException e) {
            Assert.assertEquals("Argument should be a mock, but is: " + factory.getClass(), e.getMessage());
        }
    }

    @Test
    public void getMockHandler_givenValidMock_shouldReturnHandler() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, new MockSettingsImpl());
        MockHandlerInterface<TestInterface> handler = mockUtil.getMockHandler(mock);

        Assert.assertNotNull(handler);
        Assert.assertNotNull(handler.getMockSettings());
    }

    @Test
    public void getMockName_givenNull_shouldThrowNotAMockException() {
        try {
            mockUtil.getMockName(null);
            Assert.fail("Expected NotAMockException to be thrown");
        } catch (NotAMockException e) {
            Assert.assertEquals("Argument should be a mock, but is null!", e.getMessage());
        }
    }

    @Test
    public void getMockName_givenOrdinaryObject_shouldThrowNotAMockException() {
        try {
            mockUtil.getMockName(new Object());
            Assert.fail("Expected NotAMockException to be thrown");
        } catch (NotAMockException e) {
            Assert.assertTrue(e.getMessage().startsWith("Argument should be a mock, but is:"));
        }
    }

    @Test
    public void getMockName_givenValidMock_shouldReturnMockName() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, new MockSettingsImpl());
        MockName mockName = mockUtil.getMockName(mock);

        Assert.assertNotNull(mockName);
        Assert.assertNotNull(mockName.toString());
        Assert.assertTrue(mockName.toString().length() > 0);
    }

    @Test
    public void resetMock_givenNull_shouldThrowNotAMockException() {
        try {
            mockUtil.resetMock(null);
            Assert.fail("Expected NotAMockException to be thrown");
        } catch (NotAMockException e) {
            Assert.assertEquals("Argument should be a mock, but is null!", e.getMessage());
        }
    }

    @Test
    public void resetMock_givenOrdinaryObject_shouldThrowNotAMockException() {
        try {
            mockUtil.resetMock(new Object());
            Assert.fail("Expected NotAMockException to be thrown");
        } catch (NotAMockException e) {
            Assert.assertTrue(e.getMessage().startsWith("Argument should be a mock, but is:"));
        }
    }

    @Test
    public void resetMock_givenValidMock_shouldReplaceHandlerInstance() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, new MockSettingsImpl());
        MockHandlerInterface<TestInterface> handlerBefore = mockUtil.getMockHandler(mock);

        mockUtil.resetMock(mock);

        MockHandlerInterface<TestInterface> handlerAfter = mockUtil.getMockHandler(mock);
        Assert.assertNotNull(handlerAfter);
        Assert.assertNotSame(handlerBefore, handlerAfter);
    }

    @Test
    public void createMock_givenInterfaceAndDefaultSettings_shouldCreateMock() {
        MockSettingsImpl settings = new MockSettingsImpl();
        TestInterface mock = mockUtil.createMock(TestInterface.class, settings);

        Assert.assertNotNull(mock);
        Assert.assertTrue(mock instanceof TestInterface);
        Assert.assertTrue(mock instanceof Factory);
        Assert.assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void createMock_givenClassAndDefaultSettings_shouldCreateMock() {
        MockSettingsImpl settings = new MockSettingsImpl();
        TestClass mock = mockUtil.createMock(TestClass.class, settings);

        Assert.assertNotNull(mock);
        Assert.assertTrue(mock instanceof TestClass);
        Assert.assertTrue(mock instanceof Factory);
        Assert.assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void createMock_givenSerializableTrueAndNoExtraInterfaces_shouldImplementSerializable() {
        MockSettingsImpl settings = (MockSettingsImpl) Mockito.withSettings().serializable();
        TestInterface mock = mockUtil.createMock(TestInterface.class, settings);

        Assert.assertNotNull(mock);
        Assert.assertTrue(mock instanceof Serializable);
        Assert.assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void createMock_givenSerializableTrueAndExtraInterfaces_shouldImplementSerializableAndExtraInterface() {
        MockSettingsImpl settings = (MockSettings