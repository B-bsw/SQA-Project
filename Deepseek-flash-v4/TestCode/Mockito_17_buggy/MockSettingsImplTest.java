package org.mockito.internal.creation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockSettings;
import org.mockito.exceptions.Reporter;
import org.mockito.internal.util.MockName;
import org.mockito.stubbing.Answer;

import java.io.Serializable;

import static org.junit.Assert.*;

public class MockSettingsImplTest {

    private MockSettingsImpl settings;

    @Before
    public void setUp() {
        settings = new MockSettingsImpl();
    }

    @After
    public void tearDown() {
        settings = null;
    }

    @Test
    public void testSerializable() {
        MockSettings result = settings.serializable();
        assertSame(settings, result);
        assertTrue(settings.isSerializable());
        assertNotNull(settings.getExtraInterfaces());
        assertEquals(1, settings.getExtraInterfaces().length);
        assertEquals(Serializable.class, settings.getExtraInterfaces()[0]);
    }

    @Test
    public void testExtraInterfacesNullThrowsException() {
        try {
            settings.extraInterfaces((Class<?>[]) null);
            fail("Expected Reporter exception for null extra interfaces");
        } catch (Exception e) {
            // Reporter methods throw runtime exceptions (likely Reporter.ReporterException)
            assertTrue(true);
        }
    }

    @Test
    public void testExtraInterfacesEmptyThrowsException() {
        try {
            settings.extraInterfaces();
            fail("Expected Reporter exception for empty extra interfaces");
        } catch (Exception e) {
            // Reporter throws runtime exception
            assertTrue(true);
        }
    }

    @Test
    public void testExtraInterfacesWithNullElementThrowsException() {
        try {
            settings.extraInterfaces((Class<?>) null);
            fail("Expected Reporter exception for null element");
        } catch (Exception e) {
            // Reporter throws runtime exception for null interface
            assertTrue(true);
        }
    }

    @Test
    public void testExtraInterfacesWithNonInterfaceThrowsException() {
        try {
            settings.extraInterfaces(String.class);
            fail("Expected Reporter exception for non-interface");
        } catch (Exception e) {
            // Reporter throws runtime exception for non-interface
            assertTrue(true);
        }
    }

    @Test
    public void testExtraInterfacesValid() {
        MockSettings result = settings.extraInterfaces(Runnable.class);
        assertSame(settings, result);
        assertNotNull(settings.getExtraInterfaces());
        assertEquals(1, settings.getExtraInterfaces().length);
        assertEquals(Runnable.class, settings.getExtraInterfaces()[0]);
    }

    @Test
    public void testGetMockNameInitialNull() {
        assertNull(settings.getMockName());
    }

    @Test
    public void testGetExtraInterfacesInitiallyNull() {
        assertNull(settings.getExtraInterfaces());
    }

    @Test
    public void testGetSpiedInstanceInitiallyNull() {
        assertNull(settings.getSpiedInstance());
    }

    @Test
    public void testName() {
        MockSettings result = settings.name("myMock");
        assertSame(settings, result);
        // Verify name is set by checking mock name after initiate
        settings.initiateMockName(String.class);
        MockName mockName = settings.getMockName();
        assertNotNull(mockName);
        assertEquals("myMock", mockName.toString());
    }

    @Test
    public void testSpiedInstance() {
        Object instance = new Object();
        MockSettings result = settings.spiedInstance(instance);
        assertSame(settings, result);
        assertSame(instance, settings.getSpiedInstance());
    }

    @Test
    public void testDefaultAnswer() {
        Answer<Object> answer = new Answer<Object>() {
            public Object answer(org.mockito.invocation.InvocationOnMock invocation) {
                return null;
            }
        };
        MockSettings result = settings.defaultAnswer(answer);
        assertSame(settings, result);
        assertSame(answer, settings.getDefaultAnswer());
    }

    @Test
    public void testGetDefaultAnswerInitiallyNull() {
        assertNull(settings.getDefaultAnswer());
    }

    @Test
    public void testIsSerializableInitiallyFalse() {
        assertFalse(settings.isSerializable());
    }

    @Test
    public void testIsSerializableWithSerializableInterface() {
        settings.extraInterfaces(Serializable.class);
        assertTrue(settings.isSerializable());
    }

    @Test
    public void testIsSerializableWithNonSerializableInterface() {
        settings.extraInterfaces(Runnable.class);
        assertFalse(settings.isSerializable());
    }

    @Test
    public void testInitiateMockNameWithProvidedName() {
        settings.name("customName");
        settings.initiateMockName(String.class);
        MockName mockName = settings.getMockName();
        assertNotNull(mockName);
        assertEquals("customName", mockName.toString());
    }

    @Test
    public void testInitiateMockNameWithoutProvidedName() {
        settings.initiateMockName(String.class);
        MockName mockName = settings.getMockName();
        assertNotNull(mockName);
        assertNotEquals("", mockName.toString());
        assertTrue(mockName.toString().contains("String"));
    }

    @Test
    public void testExtraInterfacesOverwritesPrevious() {
        settings.extraInterfaces(Runnable.class);
        settings.extraInterfaces(Serializable.class);
        assertNotNull(settings.getExtraInterfaces());
        assertEquals(1, settings.getExtraInterfaces().length);
        assertEquals(Serializable.class, settings.getExtraInterfaces()[0]);
    }

    @Test
    public void testSerializableSetsExtraInterfacesToJustSerializable() {
        settings.extraInterfaces(Runnable.class);
        settings.serializable();
        assertNotNull(settings.getExtraInterfaces());
        assertEquals(1, settings.getExtraInterfaces().length);
        assertEquals(Serializable.class, settings.getExtraInterfaces()[0]);
    }
}