package org.mockito.internal.creation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockSettings;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.Serializable;
import java.util.List;

public class MockSettingsImplTest {

    private MockSettingsImpl mockSettings;

    @Before
    public void setUp() {
        mockSettings = new MockSettingsImpl();
    }

    @Test
    public void defaultState_shouldHaveNullFieldsAndReturnFalseForSerializable() {
        // Arrange & Act & Assert
        Assert.assertNull("Mock name should be null by default", mockSettings.getMockName());
        Assert.assertNull("Extra interfaces should be null by default", mockSettings.getExtraInterfaces());
        Assert.assertNull("Spied instance should be null by default", mockSettings.getSpiedInstance());
        Assert.assertNull("Default answer should be null by default", mockSettings.getDefaultAnswer());
        Assert.assertFalse("isSerializable should be false by default", mockSettings.isSerializable());
    }

    @Test
    public void serializable_shouldConfigureSerializableInterface() {
        // Arrange & Act
        MockSettings result = mockSettings.serializable();

        // Assert
        Assert.assertSame("serializable() should return this instance for chaining", mockSettings, result);
        Assert.assertTrue("isSerializable() should return true after calling serializable()", mockSettings.isSerializable());
        Assert.assertNotNull("Extra interfaces array should not be null", mockSettings.getExtraInterfaces());
        Assert.assertEquals("Extra interfaces should contain exactly one element", 1, mockSettings.getExtraInterfaces().length);
        Assert.assertEquals("Extra interface should be Serializable", Serializable.class, mockSettings.getExtraInterfaces()[0]);
    }

    @Test
    public void extraInterfaces_givenNullArray_shouldThrowException() {
        // Arrange
        Class<?>[] nullInterfaces = null;

        // Act & Assert
        try {
            mockSettings.extraInterfaces(nullInterfaces);
            Assert.fail("Expected exception when passing null array to extraInterfaces()");
        } catch (RuntimeException expected) {
            // Expected reporter exception
        }
    }

    @Test
    public void extraInterfaces_givenEmptyArray_shouldThrowException() {
        // Arrange
        Class<?>[] emptyInterfaces = new Class<?>[0];

        // Act & Assert
        try {
            mockSettings.extraInterfaces(emptyInterfaces);
            Assert.fail("Expected exception when passing empty array to extraInterfaces()");
        } catch (RuntimeException expected) {
            // Expected reporter exception
        }
    }

    @Test
    public void extraInterfaces_givenArrayContainingNullElement_shouldThrowException() {
        // Arrange
        Class<?>[] interfacesWithNull = new Class<?>[] { Comparable.class, null };

        // Act & Assert
        try {
            mockSettings.extraInterfaces(interfacesWithNull);
            Assert.fail("Expected exception when passing array containing null to extraInterfaces()");
        } catch (RuntimeException expected) {
            // Expected reporter exception
        }
    }

    @Test
    public void extraInterfaces_givenNonInterfaceClass_shouldThrowException() {
        // Arrange
        Class<?>[] nonInterface = new Class<?>[] { String.class };

        // Act & Assert
        try {
            mockSettings.extraInterfaces(nonInterface);
            Assert.fail("Expected exception when passing non-interface class to extraInterfaces()");
        } catch (RuntimeException expected) {
            // Expected reporter exception
        }
    }

    @Test
    public void extraInterfaces_givenValidInterfaces_shouldStoreInterfaces() {
        // Arrange
        Class<?>[] validInterfaces = new Class<?>[] { Comparable.class, Runnable.class };

        // Act
        MockSettings result = mockSettings.extraInterfaces(validInterfaces);

        // Assert
        Assert.assertSame("extraInterfaces() should return this instance for chaining", mockSettings, result);
        Assert.assertArrayEquals("Stored extra interfaces should match input array", validInterfaces, mockSettings.getExtraInterfaces());
        Assert.assertFalse("isSerializable() should remain false when Serializable is not among interfaces", mockSettings.isSerializable());
    }

    @Test
    public void extraInterfaces_givenValidInterfacesIncludingSerializable_shouldReportSerializable() {
        // Arrange
        Class<?>[] validInterfaces = new Class<?>[] { Runnable.class, Serializable.class };

        // Act
        mockSettings.extraInterfaces(validInterfaces);

        // Assert
        Assert.assertTrue("isSerializable() should return true when Serializable is present in extraInterfaces", mockSettings.isSerializable());
    }

    @Test
    public void name_givenValidName_shouldStoreAndReturnInstance() {
        // Arrange
        String mockNameString = "myCustomMock";

        // Act
        MockSettings result = mockSettings.name(mockNameString);

        // Assert
        Assert.assertSame("name() should return this instance for chaining", mockSettings, result);
    }

    @Test
    public void spiedInstance_givenValidInstance_shouldStoreAndRetrieve() {
        // Arrange
        Object instance = new Object();

        // Act
        MockSettings result = mockSettings.spiedInstance(instance);

        // Assert
        Assert.assertSame("spiedInstance() should return this instance for chaining", mockSettings, result);
        Assert.assertSame("getSpiedInstance() should return the configured instance", instance, mockSettings.getSpiedInstance());
    }

    @Test
    public void defaultAnswer_givenAnswer_shouldStoreAndRetrieve() {
        // Arrange
        Answer<Object> customAnswer = new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "configured";
            }
        };

        // Act
        MockSettings result = mockSettings.defaultAnswer(customAnswer);

        // Assert
        Assert.assertSame("defaultAnswer() should return this instance for chaining", mockSettings, result);
        Assert.assertSame("getDefaultAnswer() should return the configured answer", customAnswer, mockSettings.getDefaultAnswer());
    }

    @Test
    public void initiateMockName_givenCustomNameConfigured_shouldInitializeMockNameWithName() {
        // Arrange
        mockSettings.name("customMockName");

        // Act
        mockSettings.initiateMockName(List.class);

        // Assert
        Assert.assertNotNull("MockName should be initialized", mockSettings.getMockName());
        Assert.assertEquals("MockName toString should match configured name", "customMockName", mockSettings.getMockName().toString());
    }

    @Test
    public void initiateMockName_givenNoNameConfigured_shouldInitializeDefaultMockName() {
        // Arrange & Act
        mockSettings.initiateMockName(List.class);

        // Assert
        Assert.assertNotNull("MockName should be initialized with default name based on class", mockSettings.getMockName());
        Assert.assertTrue("Default mock name should contain class simple name", mockSettings.getMockName().toString().contains("list"));
    }
}