package org.mockito.internal.util;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.cglib.proxy.Callback;
import org.mockito.cglib.proxy.Factory;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MockSettingsImpl;

public class MockUtilTest {

    private MockUtil mockUtil;

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
    public void constructor_givenCustomCreationValidator_shouldInstantiateSuccessfully() {
        CreationValidator validator = new CreationValidator();
        MockUtil util = new MockUtil(validator);
        Assert.assertNotNull(util);
    }

    @Test
    public void isMock_givenNull_shouldReturnFalse() {
        // Arrange
        Object target = null;

        // Act
        boolean result = mockUtil.isMock(target);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isMock_givenStandardNonMockObject_shouldReturnFalse() {
        // Arrange
        Object target = new Object();

        // Act
        boolean result = mockUtil.isMock(target);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isMock_givenCreatedMock_shouldReturnTrue() {
        // Arrange
        MockSettingsImpl settings = new MockSettingsImpl();
        List mockList = (List) mockUtil.createMock(List.class, settings);

        // Act
        boolean result = mockUtil.isMock(mockList);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void getMockHandler_givenNull_shouldThrowNotAMockException() {
        // Arrange
        Object target = null;

        // Act & Assert
        try {
            mockUtil.getMockHandler(target);
            Assert.fail("Expected NotAMockException for null input");
        } catch (NotAMockException e) {
            Assert.assertEquals("Argument should be a mock, but is null!", e.getMessage());
        }
    }

    @Test
    public void getMockHandler_givenNonMockObject_shouldThrowNotAMockException() {
        // Arrange
        String nonMock = "test-string";

        // Act & Assert
        try {
            mockUtil.getMockHandler(nonMock);
            Assert.fail("Expected NotAMockException for non-mock input");
        } catch (NotAMockException e) {
            Assert.assertTrue(e.getMessage().indexOf("Argument should be a mock, but is: " + nonMock.getClass()) != -1);
        }
    }

    @Test
    public void getMockHandler_givenValidMock_shouldReturnNonNullHandler() {
        // Arrange
        MockSettingsImpl settings = new MockSettingsImpl();
        List mockList = (List) mockUtil.createMock(List.class, settings);

        // Act
        MockHandlerInterface handler = mockUtil.getMockHandler(mockList);

        // Assert
        Assert.assertNotNull(handler);
        Assert.assertSame(settings, handler.getMockSettings());
    }

    @Test
    public void createMock_givenInterfaceClass_shouldReturnMockInstance() {
        // Arrange
        MockSettingsImpl settings = new MockSettingsImpl();

        // Act
        List mockList = (List) mockUtil.createMock(List.class, settings);

        // Assert
        Assert.assertNotNull(mockList);
        Assert.assertTrue(mockUtil.isMock(mockList));
    }

    @Test
    public void createMock_givenConcreteClass_shouldReturnMockInstance() {
        // Arrange
        MockSettingsImpl settings = new MockSettingsImpl();

        // Act
        ArrayList mockList = (ArrayList) mockUtil.createMock(ArrayList.class, settings);

        // Assert
        Assert.assertNotNull(mockList);
        Assert.assertTrue(mockUtil.isMock(mockList));
    }

    @Test
    public void createMock_givenExtraInterfaces_shouldImplementExtraInterface() {
        // Arrange
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(new Class<?>[] { Comparable.class });

        // Act
        List mockList = (List) mockUtil.createMock(List.class, settings);

        // Assert
        Assert.assertNotNull(mockList);
        Assert.assertTrue(mockList instanceof Comparable);
    }

    @Test
    public void createMock_givenSpiedInstance_shouldCopyStateAndReturnMock() {
        // Arrange
        MockSettingsImpl settings = new MockSettingsImpl();
        ArrayList original = new ArrayList();
        original.add("item1");
        original.add("item2");
        settings.spiedInstance(original);

        // Act
        ArrayList spiedMock = (ArrayList) mockUtil.createMock(ArrayList.class, settings);

        // Assert
        Assert.assertNotNull(spiedMock);
        Assert.assertTrue(mockUtil.isMock(spiedMock));
        Assert.assertEquals(2, spiedMock.size());
        Assert.assertEquals("item1", spiedMock.get(0));
    }

    @Test
    public void createMock_givenCustomValidator_shouldInvokeValidationPipeline() {
        // Arrange
        final boolean[] validated = new boolean[3];
        CreationValidator customValidator = new CreationValidator() {
            public void validateType(Class classToMock) {
                validated[0] = true;
                super.validateType(classToMock);
            }

            public void validateExtraInterfaces(Class classToMock, Class<?>[] extraInterfaces) {
                validated[1] = true;
                super.validateExtraInterfaces(classToMock, extraInterfaces);
            }

            public void validateMockedType(Class classToMock, Object spiedInstance) {
                validated[2] = true;
                super.validateMockedType(classToMock, spiedInstance);
            }
        };

        MockUtil customUtil = new MockUtil(customValidator);
        MockSettingsImpl settings = new MockSettingsImpl();

        // Act
        List mock = (List) customUtil.createMock(List.class, settings);

        // Assert
        Assert.assertNotNull(mock);
        Assert.assertTrue(validated[0]);
        Assert.assertTrue(validated[1]);
        Assert.assertTrue(validated[2]);
    }

    @Test
    public void resetMock_givenExistingMock_shouldResetHandlerSuccessfully() {
        // Arrange
        MockSettingsImpl settings = new MockSettingsImpl();
        List mockList = (List) mockUtil.createMock(List.class, settings);
        MockHandlerInterface handlerBefore = mockUtil.getMockHandler(mockList);

        // Act
        mockUtil.resetMock(mockList);
        MockHandlerInterface handlerAfter = mockUtil.getMockHandler(mockList);

        // Assert
        Assert.assertNotNull(handlerAfter);
        Assert.assertNotSame(handlerBefore, handlerAfter);
        Assert.assertTrue(mockUtil.isMock(mockList));
    }

    @Test
    public void getMockName_givenDefaultMock_shouldReturnDefaultMockName() {
        // Arrange
        MockSettingsImpl settings = new MockSettingsImpl();
        List mockList = (List) mockUtil.createMock(List.class, settings);

        // Act
        MockName mockName = mockUtil.getMockName(mockList);

        // Assert
        Assert.assertNotNull(mockName);
        Assert.assertNotNull(mockName.toString());
        Assert.assertTrue(mockName.toString().length() > 0);
    }

    @Test
    public void getMockName_givenCustomMockName_shouldReturnConfiguredMockName() {
        // Arrange
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name("customListMock");
        List mockList = (List) mockUtil.createMock(List.class, settings);

        // Act
        MockName mockName = mockUtil.getMockName(mockList);

        // Assert
        Assert.assertNotNull(mockName);
        Assert.assertEquals("customListMock", mockName.toString());
    }

    @Test
    public void getMockName_givenNull_shouldThrowNotAMockException() {
        // Arrange
        Object target = null;

        // Act & Assert
        try {
            mockUtil.getMockName(target);
            Assert.fail("Expected NotAMockException when getMockName receives null");
        } catch (NotAMockException e) {
            Assert.assertEquals("Argument should be a mock, but is null!", e.getMessage());
        }
    }

    @Test
    public void isMock_givenFactoryInstanceWithoutInterceptor_shouldReturnFalse() {
        // Arrange
        Factory dummyFactory = new Factory() {
            public Object newInstance(Callback callback) {
                return null;
            }

            public Object newInstance(Callback[] callbacks) {
                return null;
            }

            public Object newInstance(Class[] types, Object[] args, Callback[] callbacks) {
                return null;
            }

            public Callback getCallback(int index) {
                return null;
            }

            public void setCallback(int index, Callback callback) {
            }

            public void setCallbacks(Callback[] callbacks) {
            }

            public Callback[] getCallbacks() {
                return new Callback[0];
            }
        };

        // Act
        boolean result = mockUtil.isMock(dummyFactory);

        // Assert
        Assert.assertFalse(result);
    }
}