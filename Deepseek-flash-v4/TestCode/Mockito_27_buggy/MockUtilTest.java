package org.mockito.internal.util;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.mockito.cglib.proxy.Callback;
import org.mockito.cglib.proxy.Factory;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.InvocationNotifierHandler;
import org.mockito.internal.MockHandler;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MethodInterceptorFilter;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.creation.jmock.ClassImposterizer;
import org.mockito.Mockito;
import java.io.Serializable;
import java.lang.reflect.Method;

public class MockUtilTest {

    private MockUtil mockUtil;
    private MockCreationValidator validator;

    @Before
    public void setUp() {
        validator = new MockCreationValidator();
        mockUtil = new MockUtil(validator);
    }

    @After
    public void tearDown() {
        mockUtil = null;
    }

    @Test
    public void testCreateMockBasic() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(Runnable.class);
        Runnable mock = mockUtil.createMock(Runnable.class, settings);
        Assert.assertNotNull("Mock should not be null", mock);
        Assert.assertTrue("Should be a mock", mockUtil.isMock(mock));
    }

    @Test(expected = NotAMockException.class)
    public void testCreateMockNullClass() {
        mockUtil.createMock(null, new MockSettingsImpl());
    }

    @Test
    public void testCreateMockWithExtraInterfaces() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(Runnable.class);
        settings.extraInterfaces(Serializable.class);
        Runnable mock = mockUtil.createMock(Runnable.class, settings);
        Assert.assertTrue("Mock should implement Serializable", mock instanceof Serializable);
    }

    @Test
    public void testCreateMockSerializableSetting() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(Runnable.class);
        settings.serializable();
        Runnable mock = mockUtil.createMock(Runnable.class, settings);
        Assert.assertNotNull(mock);
        Assert.assertTrue(mock instanceof Serializable);
    }

    @Test
    public void testCreateMockWithSpiedInstance() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(ArrayList.class);
        ArrayList<String> spied = new ArrayList<String>();
        spied.add("initial");
        settings.spiedInstance(spied);
        ArrayList<String> mock = mockUtil.createMock(ArrayList.class, settings);
        Assert.assertNotNull(mock);
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandlerNull() {
        mockUtil.getMockHandler(null);
    }

    @Test
    public void testGetMockHandlerForMock() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(Runnable.class);
        Runnable mock = mockUtil.createMock(Runnable.class, settings);
        MockHandlerInterface handler = mockUtil.getMockHandler(mock);
        Assert.assertNotNull("Handler should not be null", handler);
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandlerForNonMock() {
        mockUtil.getMockHandler(new Object());
    }

    @Test
    public void testIsMockWithNull() {
        Assert.assertFalse("Null is not a mock", mockUtil.isMock(null));
    }

    @Test
    public void testIsMockWithNonMock() {
        Assert.assertFalse("Plain object is not a mock", mockUtil.isMock(new Object()));
    }

    @Test
    public void testIsMockWithMock() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(Runnable.class);
        Runnable mock = mockUtil.createMock(Runnable.class, settings);
        Assert.assertTrue("Should be recognized as mock", mockUtil.isMock(mock));
    }

    @Test
    public void testResetMock() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(Runnable.class);
        Runnable mock = mockUtil.createMock(Runnable.class, settings);
        mockUtil.resetMock(mock);
        Assert.assertTrue("After reset should still be a mock", mockUtil.isMock(mock));
    }

    @Test
    public void testCreateMockWithNullExtraInterfaces() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(Runnable.class);
        settings.extraInterfaces((Class<?>[]) null);
        Runnable mock = mockUtil.createMock(Runnable.class, settings);
        Assert.assertNotNull(mock);
    }

    @Test
    public void testCreateMockZeroInterfaces() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(Runnable.class);
        settings.extraInterfaces();
        Runnable mock = mockUtil.createMock(Runnable.class, settings);
        Assert.assertNotNull(mock);
    }

    @Test
    public void testGetMockNameForMock() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(Runnable.class);
        settings.initiateMockName(Runnable.class);
        Runnable mock = mockUtil.createMock(Runnable.class, settings);
        MockName name = mockUtil.getMockName(mock);
        Assert.assertNotNull("Mock name should not be null", name);
    }

    @Test
    public void testBoundaryNullSettings() {
        try {
            mockUtil.createMock(Runnable.class, null);
            Assert.fail("Expected exception for null settings");
        } catch (Exception e) {
        }
    }

    @Test
    public void testLoopOneIteration() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(Runnable.class);
        Runnable mock1 = mockUtil.createMock(Runnable.class, settings);
        Runnable mock2 = mockUtil.createMock(Runnable.class, settings);
        Assert.assertNotSame("Different mocks should not be same", mock1, mock2);
    }

    @Test
    public void testLoopMultipleIterations() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(Runnable.class);
        for (int i = 0; i < 5; i++) {
            Runnable mock = mockUtil.createMock(Runnable.class, settings);
            Assert.assertNotNull("Iteration " + i + " should produce mock", mock);
            Assert.assertTrue("Iteration " + i + " should be mock", mockUtil.isMock(mock));
        }
    }

    @Test
    public void testBranchIfElse() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(Runnable.class);
        Runnable mock = mockUtil.createMock(Runnable.class, settings);
        Assert.assertFalse(mockUtil.isMock(new Object()));
        Assert.assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testGetInterceptorNonFactory() {
        Assert.assertNull(mockUtil.getInterceptor(new Object()));
    }

    @Test
    public void testGetInterceptorFactory() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(Runnable.class);
        Runnable mock = mockUtil.createMock(Runnable.class, settings);
        MethodInterceptorFilter filter = mockUtil.getInterceptor(mock);
        Assert.assertNotNull("Interceptor should not be null", filter);
    }

    @Test
    public void testGetInterceptorWithWrongCallback() {
        Factory factory = new FactoryStub();
        Assert.assertNull(mockUtil.getInterceptor(factory));
    }

    @Test
    public void testCreateMockWithAnonymousClass() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
            }
        };
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.setTypeToMock(runnable.getClass());
        Runnable mock = mockUtil.createMock(runnable.getClass(), settings);
        Assert.assertNotNull(mock);
        Assert.assertTrue(mockUtil.isMock(mock));
    }

    private static class FactoryStub implements Factory {
        public Callback[] getCallbacks() { return null; }

        public void setCallbacks(Callback[] callbacks) {}

        public void setCallback(int index, Callback callback) {}

        public Callback getCallback(int index) { return null; }

        public Object newInstance(Callback callback) { return null; }

        public Object newInstance(Callback[] callbacks) { return null; }

        public Object newInstance(Class[] types, Object[] args, Callback callback) { return null; }

        public Object newInstance(Class[] types, Object[] args, Callback[] callbacks) { return null; }

        public Object newInstance(Class[] types, Object[] args, Callback callbacks, Class[] constructorTypes, Object[] constructorArgs) { return null; }

        public Object newInstance(Class[] types, Object[] args, Callback[] callbacks, Class[] constructorTypes, Object[] constructorArgs) { return null; }

        public Object newInstance(Class[] types, Object[] args, Callback callbacks, Class[] constructorTypes, Object[] constructorArgs, Class[] intf) { return null; }
    }
}