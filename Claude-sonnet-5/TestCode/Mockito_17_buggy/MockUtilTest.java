package org.mockito.internal.util;

import static org.junit.Assert.*;
import static org.mockito.Mockito.withSettings;

import java.util.ArrayList;
import java.util.Queue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MockSettingsImpl;

@SuppressWarnings("unchecked")
public class MockUtilTest {

    private MockUtil mockUtil;

    @Before
    public void setUp() {
        mockUtil = new MockUtil();
    }

    @Test
    public void shouldCreateMockOfConcreteClass() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        ArrayList<String> mock = mockUtil.createMock(ArrayList.class, settings);
        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void shouldCreateMockWithExtraInterfaces() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings().extraInterfaces(Queue.class);
        ArrayList<String> mock = mockUtil.createMock(ArrayList.class, settings);
        assertTrue(mock instanceof Queue);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void shouldCreateMockWithSpiedInstance() {
        ArrayList<String> spied = new ArrayList<String>();
        spied.add("hello");
        MockSettingsImpl settings = (MockSettingsImpl) withSettings().spiedInstance(spied);
        ArrayList<String> mock = mockUtil.createMock(ArrayList.class, settings);
        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowExceptionWhenMockingFinalClass() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        mockUtil.createMock(String.class, settings);
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowWhenExtraInterfaceIsNotAnInterface() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings().extraInterfaces(ArrayList.class);
        mockUtil.createMock(ArrayList.class, settings);
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowWhenSpiedInstanceTypeMismatch() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings().spiedInstance("not an ArrayList");
        mockUtil.createMock(ArrayList.class, settings);
    }

    @Test(expected = NotAMockException.class)
    public void shouldThrowNotAMockExceptionWhenGettingHandlerOfNull() {
        mockUtil.getMockHandler(null);
    }

    @Test(expected = NotAMockException.class)
    public void shouldThrowNotAMockExceptionWhenGettingHandlerOfNonMock() {
        mockUtil.getMockHandler(new Object());
    }

    @Test
    public void shouldReturnHandlerForValidMock() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        ArrayList<String> mock = mockUtil.createMock(ArrayList.class, settings);
        MockHandlerInterface<ArrayList<String>> handler = mockUtil.getMockHandler(mock);
        assertNotNull(handler);
    }

    @Test
    public void shouldReturnFalseForNullMock() {
        assertFalse(mockUtil.isMock(null));
    }

    @Test
    public void shouldReturnFalseForNonMockObject() {
        assertFalse(mockUtil.isMock(new Object()));
    }

    @Test
    public void shouldReturnFalseForPlainStringObject() {
        assertFalse(mockUtil.isMock("plain string"));
    }

    @Test
    public void shouldReturnTrueForValidMock() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        ArrayList<String> mock = mockUtil.createMock(ArrayList.class, settings);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void shouldResetMockSuccessfully() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        ArrayList<String> mock = mockUtil.createMock(ArrayList.class, settings);
        mock.add("test");
        mockUtil.resetMock(mock);
        assertTrue(mockUtil.isMock(mock));

        MockHandlerInterface<ArrayList<String>> handlerAfterReset = mockUtil.getMockHandler(mock);
        assertNotNull(handlerAfterReset);
    }

    @Test(expected = NotAMockException.class)
    public void shouldThrowWhenResettingNonMock() {
        mockUtil.resetMock(new ArrayList<String>());
    }

    @Test
    public void shouldGetMockNameForNamedMock() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings().name("myMock");
        ArrayList<String> mock = mockUtil.createMock(ArrayList.class, settings);
        MockName mockName = mockUtil.getMockName(mock);
        assertNotNull(mockName);
        assertEquals("myMock", mockName.toString());
    }

    @Test
    public void shouldGetDefaultMockNameWhenNotExplicitlyNamed() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        ArrayList<String> mock = mockUtil.createMock(ArrayList.class, settings);
        MockName mockName = mockUtil.getMockName(mock);
        assertNotNull(mockName);
        assertNotNull(mockName.toString());
    }

    @Test(expected = NotAMockException.class)
    public void shouldThrowWhenGettingMockNameOfNonMock() {
        mockUtil.getMockName(new Object());
    }

    @Test(expected = NotAMockException.class)
    public void shouldThrowWhenGettingMockNameOfNull() {
        mockUtil.getMockName(null);
    }

    @Test
    public void shouldCreateMultipleIndependentMocks() {
        MockSettingsImpl settings1 = (MockSettingsImpl) withSettings();
        MockSettingsImpl settings2 = (MockSettingsImpl) withSettings();
        ArrayList<String> mock1 = mockUtil.createMock(ArrayList.class, settings1);
        ArrayList<String> mock2 = mockUtil.createMock(ArrayList.class, settings2);
        assertNotSame(mock1, mock2);
        assertTrue(mockUtil.isMock(mock1));
        assertTrue(mockUtil.isMock(mock2));
    }
}