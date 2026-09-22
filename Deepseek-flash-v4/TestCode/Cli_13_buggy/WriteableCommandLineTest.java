package org.apache.commons.cli2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class WriteableCommandLineTest {

    private WriteableCommandLine cmd;
    private Option option;
    private Option switchOption;
    private WriteableCommandLine cmdWithMock;
    private WriteableCommandLine cmdWithSpy;

    @Before
    public void setUp() {
        cmd = Mockito.mock(WriteableCommandLine.class);
        option = Mockito.mock(Option.class);
        switchOption = Mockito.mock(Option.class);
        cmdWithSpy = Mockito.spy(WriteableCommandLine.class);
    }

    @Test
    public void testAddOptionNormal() {
        cmd.addOption(option);
        Mockito.verify(cmd).addOption(option);
    }

    @Test
    public void testAddOptionNull() {
        cmd.addOption(null);
        Mockito.verify(cmd).addOption(null);
    }

    @Test
    public void testAddValueNormal() {
        Object value = new Object();
        cmd.addValue(option, value);
        Mockito.verify(cmd).addValue(option, value);
    }

    @Test
    public void testAddValueNullOption() {
        Object value = new Object();
        cmd.addValue(null, value);
        Mockito.verify(cmd).addValue(null, value);
    }

    @Test
    public void testAddValueNullValue() {
        cmd.addValue(option, null);
        Mockito.verify(cmd).addValue(option, null);
    }

    @Test
    public void testSetDefaultValuesNormal() {
        List<Object> defaults = new ArrayList<>();
        defaults.add("a");
        defaults.add("b");
        cmd.setDefaultValues(option, defaults);
        Mockito.verify(cmd).setDefaultValues(option, defaults);
    }

    @Test
    public void testSetDefaultValuesEmptyList() {
        List<Object> defaults = new ArrayList<>();
        cmd.setDefaultValues(option, defaults);
        Mockito.verify(cmd).setDefaultValues(option, defaults);
    }

    @Test
    public void testSetDefaultValuesNullList() {
        cmd.setDefaultValues(option, null);
        Mockito.verify(cmd).setDefaultValues(option, null);
    }

    @Test
    public void testAddSwitchTrue() throws IllegalStateException {
        cmd.addSwitch(switchOption, true);
        Mockito.verify(cmd).addSwitch(switchOption, true);
    }

    @Test
    public void testAddSwitchFalse() throws IllegalStateException {
        cmd.addSwitch(switchOption, false);
        Mockito.verify(cmd).addSwitch(switchOption, false);
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchDuplicateThrows() throws IllegalStateException {
        Mockito.doThrow(new IllegalStateException()).when(cmd).addSwitch(switchOption, true);
        cmd.addSwitch(switchOption, true);
        fail("Should throw IllegalStateException");
    }

    @Test
    public void testAddSwitchWithNullOption() throws IllegalStateException {
        cmd.addSwitch(null, true);
        Mockito.verify(cmd).addSwitch(null, true);
    }

    @Test
    public void testSetDefaultSwitchTrue() {
        cmd.setDefaultSwitch(switchOption, Boolean.TRUE);
        Mockito.verify(cmd).setDefaultSwitch(switchOption, Boolean.TRUE);
    }

    @Test
    public void testSetDefaultSwitchFalse() {
        cmd.setDefaultSwitch(switchOption, Boolean.FALSE);
        Mockito.verify(cmd).setDefaultSwitch(switchOption, Boolean.FALSE);
    }

    @Test
    public void testSetDefaultSwitchNullValue() {
        cmd.setDefaultSwitch(switchOption, null);
        Mockito.verify(cmd).setDefaultSwitch(switchOption, null);
    }

    @Test
    public void testAddPropertyNormal() {
        cmd.addProperty("key", "value");
        Mockito.verify(cmd).addProperty("key", "value");
    }

    @Test
    public void testAddPropertyReplaceExisting() {
        cmd.addProperty("key", "value1");
        cmd.addProperty("key", "value2");
        Mockito.verify(cmd).addProperty("key", "value1");
        Mockito.verify(cmd).addProperty("key", "value2");
    }

    @Test
    public void testAddPropertyNullKey() {
        cmd.addProperty(null, "value");
        Mockito.verify(cmd).addProperty(null, "value");
    }

    @Test
    public void testAddPropertyNullValue() {
        cmd.addProperty("key", null);
        Mockito.verify(cmd).addProperty("key", null);
    }

    @Test
    public void testLooksLikeOptionNormal() {
        Mockito.when(cmd.looksLikeOption("-arg")).thenReturn(true);
        Mockito.when(cmd.looksLikeOption("arg")).thenReturn(false);
        assertTrue(cmd.looksLikeOption("-arg"));
        assertFalse(cmd.looksLikeOption("arg"));
        Mockito.verify(cmd, Mockito.times(2)).looksLikeOption(Mockito.anyString());
    }

    @Test
    public void testLooksLikeOptionNull() {
        Mockito.when(cmd.looksLikeOption(null)).thenReturn(false);
        assertFalse(cmd.looksLikeOption(null));
        Mockito.verify(cmd).looksLikeOption(null);
    }

    @Test
    public void testLooksLikeOptionBoundaryDash() {
        Mockito.when(cmd.looksLikeOption("-")).thenReturn(true);
        assertTrue(cmd.looksLikeOption("-"));
    }

    @Test
    public void testLooksLikeOptionBoundaryDoubleDash() {
        Mockito.when(cmd.looksLikeOption("--")).thenReturn(true);
        assertTrue(cmd.looksLikeOption("--"));
    }

    @Test
    public void testLooksLikeOptionEmptyString() {
        Mockito.when(cmd.looksLikeOption("")).thenReturn(false);
        assertFalse(cmd.looksLikeOption(""));
    }

    @Test
    public void testAddValueMultipleTimes() {
        Object value1 = new Object();
        Object value2 = new Object();
        cmd.addValue(option, value1);
        cmd.addValue(option, value2);
        Mockito.verify(cmd, Mockito.times(2)).addValue(Mockito.eq(option), Mockito.any());
        Mockito.verify(cmd).addValue(option, value1);
        Mockito.verify(cmd).addValue(option, value2);
    }

    @Test
    public void testDefaultValuesWithMultipleOptions() {
        Option opt2 = Mockito.mock(Option.class);
        List<Object> defaults1 = new ArrayList<>(Collections.singletonList("x"));
        List<Object> defaults2 = new ArrayList<>(Collections.singletonList("y"));
        cmd.setDefaultValues(option, defaults1);
        cmd.setDefaultValues(opt2, defaults2);
        Mockito.verify(cmd).setDefaultValues(option, defaults1);
        Mockito.verify(cmd).setDefaultValues(opt2, defaults2);
    }

    @Test
    public void testAddSwitchMultipleTimesWithDifferentValues() throws IllegalStateException {
        cmd.addSwitch(switchOption, true);
        cmd.addSwitch(switchOption, false);
        Mockito.verify(cmd).addSwitch(switchOption, true);
        Mockito.verify(cmd).addSwitch(switchOption, false);
        Mockito.verify(cmd, Mockito.times(2)).addSwitch(Mockito.eq(switchOption), Mockito.anyBoolean());
    }

    @Test
    public void testSetDefaultSwitchMultiple() {
        Option opt1 = Mockito.mock(Option.class);
        Option opt2 = Mockito.mock(Option.class);
        cmd.setDefaultSwitch(opt1, Boolean.TRUE);
        cmd.setDefaultSwitch(opt2, Boolean.FALSE);
        Mockito.verify(cmd).setDefaultSwitch(opt1, Boolean.TRUE);
        Mockito.verify(cmd).setDefaultSwitch(opt2, Boolean.FALSE);
    }

    @Test
    public void testAddPropertyMultipleProperties() {
        cmd.addProperty("prop1", "val1");
        cmd.addProperty("prop2", "val2");
        Mockito.verify(cmd).addProperty("prop1", "val1");
        Mockito.verify(cmd).addProperty("prop2", "val2");
    }

    @Test
    public void testLooksLikeOptionWithSpecialChars() {
        Mockito.when(cmd.looksLikeOption("-")).thenReturn(true);
        Mockito.when(cmd.looksLikeOption("--")).thenReturn(true);
        Mockito.when(cmd.looksLikeOption("-x")).thenReturn(true);
        Mockito.when(cmd.looksLikeOption("--x")).thenReturn(true);
        assertTrue(cmd.looksLikeOption("-"));
        assertTrue(cmd.looksLikeOption("--"));
        assertTrue(cmd.looksLikeOption("-x"));
        assertTrue(cmd.looksLikeOption("--x"));
    }
}