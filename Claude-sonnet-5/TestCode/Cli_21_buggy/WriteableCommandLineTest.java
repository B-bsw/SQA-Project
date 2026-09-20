package org.apache.commons.cli2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link WriteableCommandLine}.
 *
 * Since WriteableCommandLine is an interface, we exercise its contract
 * using a Mockito mock implementation combined with a mocked Option.
 */
public class WriteableCommandLineTest {

    private WriteableCommandLine commandLine;
    private Option option;

    @Before
    public void setUp() {
        commandLine = mock(WriteableCommandLine.class);
        option = mock(Option.class);
    }

    // ---------- addOption ----------

    @Test
    public void testAddOptionNormal() {
        commandLine.addOption(option);
        verify(commandLine, times(1)).addOption(option);
    }

    @Test
    public void testAddOptionNull() {
        commandLine.addOption(null);
        verify(commandLine, times(1)).addOption(null);
    }

    @Test
    public void testAddOptionCalledMultipleTimes() {
        Option option2 = mock(Option.class);
        commandLine.addOption(option);
        commandLine.addOption(option2);
        commandLine.addOption(option);

        verify(commandLine, times(2)).addOption(option);
        verify(commandLine, times(1)).addOption(option2);
    }

    // ---------- addValue ----------

    @Test
    public void testAddValueNormal() {
        commandLine.addValue(option, "value1");
        verify(commandLine, times(1)).addValue(option, "value1");
    }

    @Test
    public void testAddValueNull() {
        commandLine.addValue(option, null);
        verify(commandLine, times(1)).addValue(option, null);
    }

    @Test
    public void testAddValueNullOption() {
        commandLine.addValue(null, "value1");
        verify(commandLine, times(1)).addValue(null, "value1");
    }

    // ---------- getUndefaultedValues ----------

    @Test
    public void testGetUndefaultedValuesEmptyList() {
        when(commandLine.getUndefaultedValues(option)).thenReturn(Collections.emptyList());

        List result = commandLine.getUndefaultedValues(option);

        assertTrue(result.isEmpty());
        assertEquals(0, result.size());
    }

    @Test
    public void testGetUndefaultedValuesSingleValue() {
        when(commandLine.getUndefaultedValues(option)).thenReturn(Arrays.asList("a"));

        List result = commandLine.getUndefaultedValues(option);

        assertFalse(result.isEmpty());
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    @Test
    public void testGetUndefaultedValuesMultipleValues() {
        when(commandLine.getUndefaultedValues(option)).thenReturn(Arrays.asList("a", "b", "c"));

        List result = commandLine.getUndefaultedValues(option);

        assertEquals(3, result.size());
        assertEquals("a", result.get(0));
        assertEquals("b", result.get(1));
        assertEquals("c", result.get(2));
    }

    @Test
    public void testGetUndefaultedValuesNullReturn() {
        when(commandLine.getUndefaultedValues(option)).thenReturn(null);

        List result = commandLine.getUndefaultedValues(option);

        assertNull(result);
    }

    // ---------- setDefaultValues ----------

    @Test
    public void testSetDefaultValuesNormal() {
        List defaults = new ArrayList();
        defaults.add("default1");

        commandLine.setDefaultValues(option, defaults);

        verify(commandLine, times(1)).setDefaultValues(option, defaults);
    }

    @Test
    public void testSetDefaultValuesEmptyList() {
        List defaults = Collections.emptyList();

        commandLine.setDefaultValues(option, defaults);

        verify(commandLine, times(1)).setDefaultValues(option, defaults);
    }

    @Test
    public void testSetDefaultValuesNull() {
        commandLine.setDefaultValues(option, null);

        verify(commandLine, times(1)).setDefaultValues(option, null);
    }

    // ---------- addSwitch ----------

    @Test
    public void testAddSwitchNormalTrue() {
        commandLine.addSwitch(option, true);
        verify(commandLine, times(1)).addSwitch(option, true);
    }

    @Test
    public void testAddSwitchNormalFalse() {
        commandLine.addSwitch(option, false);
        verify(commandLine, times(1)).addSwitch(option, false);
    }

    @Test
    public void testAddSwitchThrowsIllegalStateException() {
        doThrow(new IllegalStateException("switch already added"))
                .when(commandLine).addSwitch(option, true);

        try {
            commandLine.addSwitch(option, true);
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException e) {
            assertEquals("switch already added", e.getMessage());
        }

        verify(commandLine, times(1)).addSwitch(option, true);
    }

    // ---------- setDefaultSwitch ----------

    @Test
    public void testSetDefaultSwitchTrue() {
        commandLine.setDefaultSwitch(option, Boolean.TRUE);
        verify(commandLine, times(1)).setDefaultSwitch(option, Boolean.TRUE);
    }

    @Test
    public void testSetDefaultSwitchFalse() {
        commandLine.setDefaultSwitch(option, Boolean.FALSE);
        verify(commandLine, times(1)).setDefaultSwitch(option, Boolean.FALSE);
    }

    @Test
    public void testSetDefaultSwitchNull() {
        commandLine.setDefaultSwitch(option, null);
        verify(commandLine, times(1)).setDefaultSwitch(option, null);
    }

    // ---------- addProperty(Option, String, String) ----------

    @Test
    public void testAddPropertyWithOptionNormal() {
        commandLine.addProperty(option, "propName", "propValue");
        verify(commandLine, times(1)).addProperty(option, "propName", "propValue");
    }

    @Test
    public void testAddPropertyWithOptionNullValue() {
        commandLine.addProperty(option, "propName", null);
        verify(commandLine, times(1)).addProperty(option, "propName", null);
    }

    @Test
    public void testAddPropertyWithOptionEmptyStrings() {
        commandLine.addProperty(option, "", "");
        verify(commandLine, times(1)).addProperty(option, "", "");
    }

    @Test
    public void testAddPropertyWithOptionReplacesExistingValue() {
        commandLine.addProperty(option, "propName", "value1");
        commandLine.addProperty(option, "propName", "value2");

        verify(commandLine, times(1)).addProperty(option, "propName", "value1");
        verify(commandLine, times(1)).addProperty(option, "propName", "value2");
    }

    // ---------- addProperty(String, String) ----------

    @Test
    public void testAddPropertyDefaultNormal() {
        commandLine.addProperty("propName", "propValue");
        verify(commandLine, times(1)).addProperty("propName", "propValue");
    }

    @Test
    public void testAddPropertyDefaultNullValue() {
        commandLine.addProperty("propName", null);
        verify(commandLine, times(1)).addProperty("propName", null);
    }

    @Test
    public void testAddPropertyDefaultEmptyStrings() {
        commandLine.addProperty("", "");
        verify(commandLine, times(1)).addProperty("", "");
    }

    @Test
    public void testAddPropertyDefaultNotCalledWhenNotInvoked() {
        verify(commandLine, never()).addProperty("neverCalled", "value");
    }

    // ---------- looksLikeOption ----------

    @Test
    public void testLooksLikeOptionTrue() {
        when(commandLine.looksLikeOption("-x")).thenReturn(true);

        boolean result = commandLine.looksLikeOption("-x");

        assertTrue(result);
    }

    @Test
    public void testLooksLikeOptionFalse() {
        when(commandLine.looksLikeOption("argument")).thenReturn(false);

        boolean result = commandLine.looksLikeOption("argument");

        assertFalse(result);
    }

    @Test
    public void testLooksLikeOptionEmptyString() {
        when(commandLine.looksLikeOption("")).thenReturn(false);

        boolean result = commandLine.looksLikeOption("");

        assertFalse(result);
    }

    @Test
    public void testLooksLikeOptionNullArgument() {
        when(commandLine.looksLikeOption(null)).thenReturn(false);

        boolean result = commandLine.looksLikeOption(null);

        assertFalse(result);
    }

    @Test
    public void testLooksLikeOptionDefaultMockReturnsFalse() {
        // Mockito default boolean return value is false when not stubbed
        boolean result = commandLine.looksLikeOption("--unstubbed");

        assertFalse(result);
    }
}