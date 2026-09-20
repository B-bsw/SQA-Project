package org.mockito.internal.creation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.Serializable;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockSettings;
import org.mockito.internal.util.MockName;
import org.mockito.stubbing.Answer;
import org.mockito.invocation.InvocationOnMock;

public class MockSettingsImplTest {

    private MockSettingsImpl mockSettings;

    @Before
    public void setUp() {
        mockSettings = new MockSettingsImpl();
    }

    // ---------- serializable() ----------

    @Test
    public void testSerializableAddsSerializableInterface() {
        MockSettings result = mockSettings.serializable();

        assertSame(mockSettings, result);
        Class<?>[] interfaces = mockSettings.getExtraInterfaces();
        assertNotNull(interfaces);
        assertEquals(1, interfaces.length);
        assertEquals(Serializable.class, interfaces[0]);
        assertTrue(mockSettings.isSerializable());
    }

    // ---------- extraInterfaces() normal case ----------

    @Test
    public void testExtraInterfacesNormalCaseSingleInterface() {
        MockSettings result = mockSettings.extraInterfaces(List.class);

        assertSame(mockSettings, result);
        Class<?>[] interfaces = mockSettings.getExtraInterfaces();
        assertArrayEquals(new Class<?>[]{List.class}, interfaces);
    }

    @Test
    public void testExtraInterfacesNormalCaseMultipleInterfaces() {
        mockSettings.extraInterfaces(List.class, Serializable.class);

        Class<?>[] interfaces = mockSettings.getExtraInterfaces();
        assertEquals(2, interfaces.length);
        assertEquals(List.class, interfaces[0]);
        assertEquals(Serializable.class, interfaces[1]);
        assertTrue(mockSettings.isSerializable());
    }

    // ---------- extraInterfaces() boundary / null / empty ----------

    @Test(expected = RuntimeException.class)
    public void testExtraInterfacesNullArrayThrowsException() {
        mockSettings.extraInterfaces((Class<?>[]) null);
    }

    @Test(expected = RuntimeException.class)
    public void testExtraInterfacesEmptyArrayThrowsException() {
        mockSettings.extraInterfaces();
    }

    @Test(expected = RuntimeException.class)
    public void testExtraInterfacesWithNullElementThrowsException() {
        mockSettings.extraInterfaces(new Class<?>[]{null});
    }

    @Test(expected = RuntimeException.class)
    public void testExtraInterf