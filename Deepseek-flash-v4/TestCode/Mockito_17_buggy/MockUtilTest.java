package org.mockito.internal.util;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.cglib.proxy.Callback;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.Factory;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.MockHandler;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MethodInterceptorFilter;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.util.reflection.LenientCopyTool;

import static org.junit.Assert.*;
import static org.mockito.Mockito.RETURNS_DEFAULTS;
import static org.mockito.Mockito.withSettings;

public class MockUtilTest {

    private MockUtil mockUtil;
    private CreationValidator creationValidator;
    private MockSettingsImpl mockSettings;

    @Before
    public void setUp() {
        creationValidator = new CreationValidator();
        mockUtil = new MockUtil(creationValidator);
        mockSettings = new MockSettingsImpl();
    }

    @Test
    public void testCreateMock_BasicMock() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
        assertSame(mock.getClass().getInterfaces().length > 0 ? mock.getClass().getInterfaces()[0] : null, 
                   mock.getClass().getInterfaces().length > 0 ? mock.getClass().getInterfaces()[0] : null);
    }

    @Test
    public void testCreateMock_WithSpiedInstance() {
        TestClass spiedInstance = new TestClass();
        mockSettings.setSpiedInstance(spiedInstance);
        mockSettings.setName("spiedMock");
        TestClass mock = mockUtil.createMock(TestClass.class, mockSettings);
        assertNotNull(mock);
        assertEquals("default", mock.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateMock_InvalidType() {
        creationValidator = new CreationValidator() {
            @Override
            public void validateType(Class<?> classToMock) {
                throw new IllegalArgumentException("Invalid type");
            }
        };
        mockUtil = new MockUtil(creationValidator);
        mockUtil.createMock(TestClass.class, mockSettings);
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_NullMock() {
        mockUtil.getMockHandler(null);
    }

    @Test
    public void testGetMockHandler_NonMock() {
        try {
            mockUtil.getMockHandler(new TestClass());
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().toLowerCase().contains("not a mock"));
        }
    }

    @Test
    public void testGetMockHandler_ValidMock() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        MockHandlerInterface handler = mockUtil.getMockHandler(mock);
        assertNotNull(handler);
    }

    @Test
    public void testIsMock_Null() {
        assertFalse(mockUtil.isMock(null));
    }

    @Test
    public void testIsMock_NonMockObject() {
        assertFalse(mockUtil.isMock(new TestClass()));
    }

    @Test
    public void testIsMock_ValidMock() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testResetMock_ValidMock() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        Mockito.when(mock.getValue()).thenReturn("custom");
        assertEquals("custom", mockUtil.createMock(TestInterface.class, mockSettings).getValue());
        
        mockUtil.resetMock(mock);
        TestInterface simpleMock = mockUtil.createMock(TestInterface.class, mockSettings);
        assertEquals(RETURNS_DEFAULTS, simpleMock.getValue() != null ? RETURNS_DEFAULTS : null);
    }

    @Test
    public void testGetMockName_ValidMock() throws Exception {
        mockSettings.setName("myMock");
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        MockName mockName = mockUtil.getMockName(mock);
        assertNotNull(mockName);
        assertEquals("myMock", mockName.toString());
    }

    @Test
    public void testGetMockName_DefaultName() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        MockName mockName = mockUtil.getMockName(mock);
        assertNotNull(mockName);
        assertTrue(mockName.toString().contains("TestInterface"));
    }

    @Test
    public void testCreateMock_WithExtraInterfaces() {
        Class<?>[] extraInterfaces = new Class<?>[]{Runnable.class};
        mockSettings.setExtraInterfaces(extraInterfaces);
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        assertNotNull(mock);
        assertTrue(Runnable.class.isAssignableFrom(mock.getClass()));
    }

    @Test
    public void testCreateMock_WithNullExtraInterfaces() {
        mockSettings.setExtraInterfaces(null);
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        assertNotNull(mock);
    }

    @Test
    public void testIsMockitoMock_WithFilterCallback() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        Factory factory = (Factory) mock;
        Callback callback = factory.getCallback(0);
        assertTrue(callback instanceof MethodInterceptorFilter);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testIsMockitoMock_WithNonFilterCallback() throws Exception {
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        Factory factory = (Factory) mock;
        factory.setCallback(0, new org.mockito.cglib.proxy.Callback() {});
        assertFalse(mockUtil.isMock(mock));
    }

    @Test
    public void testGetInterceptor_WithNullCallback() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        Factory factory = (Factory) mock;
        factory.setCallback(0, null);
        assertNull(mockUtil.getInterceptor(mock));
    }

    @Test
    public void testGetInterceptor_WithMockitoFilter() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        assertNotNull(mockUtil.getInterceptor(mock));
    }

    @Test
    public void testCreateMock_CopiesSpiedInstance() throws Exception {
        TestClass spied = new TestClass();
        spied.setValue("spiedVal");
        mockSettings.setSpiedInstance(spied);
        TestClass mock = mockUtil.createMock(TestClass.class, mockSettings);
        assertEquals("spiedVal", mock.getValue());
    }

    @Test
    public void testCreateMock_ValidatesExtraInterfaces() throws Exception {
        mockSettings.setExtraInterfaces(new Class<?>[]{Runnable.class});
        mockSettings.setSpiedInstance(new TestClass());
        mockUtil.createMock(TestClass.class, mockSettings);
    }

    @Test(expected = RuntimeException.class)
    public void testCreateMock_ValidationFails() {
        mockSettings.setExtraInterfaces(new Class<?>[]{Runnable.class});
        mockSettings.setSpiedInstance(new TestClass());
        mockUtil = new MockUtil(new CreationValidator() {
            @Override
            public void validateExtraInterfaces(Class<?> classToMock, Class<?>[] extraInterfaces) {
                throw new RuntimeException("Invalid extra interfaces");
            }
        });
        mockUtil.createMock(TestClass.class, mockSettings);
    }

    @Test
    public void testGetMockHandler_WithSpiedInstance() {
        TestClass spied = new TestClass();
        mockSettings.setSpiedInstance(spied);
        TestClass mock = mockUtil.createMock(TestClass.class, mockSettings);
        MockHandlerInterface handler = mockUtil.getMockHandler(mock);
        assertNotNull(handler);
    }

    @Test
    public void testIsMock_WithSpiedMock() {
        TestClass spied = new TestClass();
        mockSettings.setSpiedInstance(spied);
        TestClass mock = mockUtil.createMock(TestClass.class, mockSettings);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testResetMock_AfterStubbing() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        Mockito.when(mock.getValue()).thenReturn("stubbed");
        assertEquals("stubbed", mock.getValue());
        
        mockUtil.resetMock(mock);
        assertNull(mock.getValue());
    }

    @Test
    public void testGetMockName_AfterReset() {
        mockSettings.setName("originalMock");
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        MockName originalName = mockUtil.getMockName(mock);
        assertEquals("originalMock", originalName.toString());
        
        mockUtil.resetMock(mock);
        MockHandlerInterface handler = mockUtil.getMockHandler(mock);
        assertNotNull(handler);
        assertEquals("originalMock", handler.getMockSettings().getMockName().toString());
    }

    @Test
    public void testCreateMock_DefaultSettings() {
        MockSettingsImpl defaultSettings = new MockSettingsImpl();
        TestInterface mock = mockUtil.createMock(TestInterface.class, defaultSettings);
        assertNotNull(mock);
    }

    @Test
    public void testIsMock_ProxyEnhancedButNoInterceptor() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        Factory factory = (Factory) mock;
        factory.setCallback(0, null);
        assertFalse(mockUtil.isMock(mock));
    }

    @Test
    public void testGetHandler_ThrowsOnNonMock() {
        TestInterface mock = mockUtil.createMock(TestInterface.class, mockSettings);
        try {
            mockUtil.getMockHandler("not a mock");
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("not a mock"));
        }
    }

    private interface TestInterface {
        String getValue();
        void setValue(String value);
    }

    private static class TestClass implements TestInterface {
        private String value = "default";

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public void setValue(String value) {
            this.value = value;
        }
    }

    private static class MockName {
        private final String name;

        public MockName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}