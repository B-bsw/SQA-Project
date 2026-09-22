package org.apache.commons.cli2.commandline;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.junit.Before;
import org.junit.Test;

public class WriteableCommandLineImplTest {

    private WriteableCommandLineImpl cmd;
    private Option option;
    private Argument argument;
    private List<String> arguments;

    @Before
    public void setUp() {
        arguments = new ArrayList<String>(Arrays.asList("arg1", "arg2", "with space"));
        option = new TestOption("test", "t", "test option", false, false);
        argument = new TestOption("arg", "a", "argument option", true, false);
        cmd = new WriteableCommandLineImpl(option, arguments);
    }

    @Test
    public void testConstructorWithEmptyArguments() {
        List<String> empty = new ArrayList<String>();
        WriteableCommandLineImpl c = new WriteableCommandLineImpl(option, empty);
        assertNotNull(c);
        assertEquals(0, c.getNormalised().size());
    }

    @Test
    public void testConstructorWithNullPrefixes() {
        try {
            new WriteableCommandLineImpl(option, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testAddOptionAndGetOption() {
        cmd.addOption(option);
        assertSame(option, cmd.getOption("test"));
        assertSame(option, cmd.getOption("t"));
        assertNull(cmd.getOption("nonexistent"));
        assertFalse(cmd.hasOption(new TestOption("other", "o", "other", false, false)));
    }

    @Test
    public void testAddValueAndGetValues() {
        cmd.addValue(option, "value1");
        cmd.addValue(option, "value2");
        
        List values = cmd.getValues(option, null);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }

    @Test
    public void testGetValuesWithMultipleSources() {
        // No values set, should return defaultValues passed in
        List defaults = Arrays.asList("d1", "d2");
        List result = cmd.getValues(option, defaults);
        assertEquals(defaults, result);

        // Test with option defaults
        cmd.setDefaultValues(option, Arrays.asList("optionDefault"));
        result = cmd.getValues(option, defaults);
        assertEquals(Arrays.asList("optionDefault"), result);

        // Test empty lists
        cmd.addValue(option, "value");
        result = cmd.getValues(option, defaults);
        assertEquals(1, result.size());
    }

    @Test
    public void testGetValuesWithNullDefaults() {
        cmd.setDefaultValues(option, null);
        List result = cmd.getValues(option, null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAddSwitchAndGetSwitch() {
        cmd.addSwitch(option, true);
        assertEquals(Boolean.TRUE, cmd.getSwitch(option, Boolean.FALSE));
        
        cmd.addSwitch(argument, false);
        assertEquals(Boolean.FALSE, cmd.getSwitch(argument, Boolean.TRUE));
    }

    @Test
    public void testAddSwitchAlreadySet() {
        cmd.addSwitch(option, true);
        try {
            cmd.addSwitch(option, true);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testGetSwitchDefaults() {
        // Test method default
        assertEquals(Boolean.TRUE, cmd.getSwitch(option, Boolean.TRUE));
        
        // Test option default
        cmd.setDefaultSwitch(option, Boolean.FALSE);
        assertEquals(Boolean.FALSE, cmd.getSwitch(option, Boolean.TRUE));
        
        // Test null default switch
        cmd.setDefaultSwitch(option, null);
        assertNull(cmd.getSwitch(option, null));
    }

    @Test
    public void testGetSwitchClearingDefault() {
        cmd.setDefaultSwitch(option, Boolean.TRUE);
        cmd.setDefaultSwitch(option, null);
        assertEquals(Boolean.FALSE, cmd.getSwitch(option, Boolean.FALSE));
    }

    @Test
    public void testHasOption() {
        assertFalse(cmd.hasOption(option));
        cmd.addOption(option);
        assertTrue(cmd.hasOption(option));
    }

    @Test
    public void testAddPropertyAndGetProperty() {
        cmd.addProperty("key", "value");
        assertEquals("value", cmd.getProperty("key", "default"));
        assertEquals("default", cmd.getProperty("nonexistent", "default"));
    }

    @Test
    public void testGetProperties() {
        cmd.addProperty("key1", "value1");
        cmd.addProperty("key2", "value2");
        Set props = cmd.getProperties();
        assertTrue(props.contains("key1"));
        assertTrue(props.contains("key2"));
    }

    @Test
    public void testLooksLikeOption() {
        Option opt1 = new TestOption("--long", "l", "long", false, false);
        Option opt2 = new TestOption("-s", "s", "short", false, false);
        List optionsList = new ArrayList<String>(Arrays.asList("--long", "l", "-s", "s"));
        
        WriteableCommandLineImpl c = new WriteableCommandLineImpl(opt1, optionsList);
        assertTrue(c.looksLikeOption("--longValue"));
        assertTrue(c.looksLikeOption("--anything"));
        assertFalse(c.looksLikeOption("anything"));
        
        WriteableCommandLineImpl c2 = new WriteableCommandLineImpl(opt2, optionsList);
        assertTrue(c2.looksLikeOption("-s"));
        assertFalse(c2.looksLikeOption("notAnOption"));
    }

    @Test
    public void testLookLikeOptionWithMultiplePrefixes() {
        Option multi = new TestOption("--long", "l", "test", false, false);
        multi.getPrefixes().clear();
        multi.getPrefixes().add("--");
        multi.getPrefixes().add("-");
        WriteableCommandLineImpl c = new WriteableCommandLineImpl(multi, arguments);
        
        assertTrue(c.looksLikeOption("--anything"));
        assertTrue(c.looksLikeOption("-anything"));
        assertFalse(c.looksLikeOption("anything"));
    }

    @Test
    public void testToString() {
        WriteableCommandLineImpl c = new WriteableCommandLineImpl(option, arguments);
        String result = c.toString();
        assertEquals("arg1 arg2 \"with space\"", result);

        WriteableCommandLineImpl c2 = new WriteableCommandLineImpl(option, new ArrayList<String>());
        assertEquals("", c2.toString());
    }

    @Test
    public void testToStringMultipleArguments() {
        List tmp = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        WriteableCommandLineImpl c = new WriteableCommandLineImpl(option, tmp);
        assertEquals("a b c", c.toString());
    }

    @Test
    public void testToStringWithQuotedArguments() {
        List tmp = new ArrayList<String>(Arrays.asList("a b", "c", "d e f"));
        WriteableCommandLineImpl c = new WriteableCommandLineImpl(option, tmp);
        assertEquals("\"a b\" c \"d e f\"", c.toString());
    }

    @Test
    public void testGetOptions() {
        cmd.addOption(option);
        cmd.addOption(argument);
        List opts = cmd.getOptions();
        assertEquals(2, opts.size());
        assertTrue(opts.contains(option));
        assertTrue(opts.contains(argument));
    }

    @Test
    public void testGetOptionsUnmodifiable() {
        cmd.addOption(option);
        try {
            cmd.getOptions().add(new TestOption("x", "x", "x", false, false));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetOptionTriggers() {
        cmd.addOption(option);
        cmd.addOption(argument);
        Set triggers = cmd.getOptionTriggers();
        assertTrue(triggers.contains("test"));
        assertTrue(triggers.contains("t"));
        assertTrue(triggers.contains("arg"));
        assertTrue(triggers.contains("a"));
    }

    @Test
    public void testGetOptionTriggersUnmodifiable() {
        cmd.addOption(option);
        try {
            cmd.getOptionTriggers().clear();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSetDefaultValuesNullRemoves() {
        cmd.setDefaultValues(option, Arrays.asList("v1"));
        cmd.setDefaultValues(option, null);
        List values = (List) cmd.defaultValues.get(option);
        assertNull(values);
    }

    @Test
    public void testSetDefaultSwitchNullRemoves() {
        cmd.setDefaultSwitch(option, Boolean.TRUE);
        cmd.setDefaultSwitch(option, null);
        assertNull(cmd.defaultSwitches.get(option));
    }

    @Test
    public void testGetNormalised() {
        WriteableCommandLineImpl c = new WriteableCommandLineImpl(option, arguments);
        List norm = c.getNormalised();
        assertEquals(arguments.size(), norm.size());
        
        // Ensure unmodifiable
        try {
            norm.add("x");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAddValueWithArgumentType() {
        Option argOption = new TestOption("arg", "a", "argument", true, false);
        cmd.addValue(argOption, "value");
        assertTrue(cmd.hasOption(argOption));
        assertEquals(1, cmd.getValues(argOption, null).size());
        assertEquals("value", cmd.getValues(argOption, null).get(0));
    }

    @Test
    public void testAddSwitchWithOptionType() {
        cmd.addSwitch(option, true);
        assertTrue(cmd.hasOption(option));
        assertEquals(Boolean.TRUE, cmd.getSwitch(option, Boolean.FALSE));
    }

    @Test
    public void testGetValuesWithNullDefaultList() {
        cmd.addValue(option, "value");
        List result = cmd.getValues(option, null);
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    @Test
    public void testGetSwitchWithCommandLineFirst() {
        cmd.addSwitch(option, true);
        cmd.setDefaultSwitch(option, Boolean.FALSE);
        assertEquals(Boolean.TRUE, cmd.getSwitch(option, Boolean.TRUE));
    }

    private static class TestOption implements Option, Argument {
        private String preferredName;
        private String trigger;
        private String description;
        private boolean isArgument;
        private boolean required;
        private List<String> prefixes;

        public TestOption(String preferredName, String trigger, String description, 
                         boolean isArgument, boolean required) {
            this.preferredName = preferredName;
            this.trigger = trigger;
            this.description = description;
            this.isArgument = isArgument;
            this.required = required;
            this.prefixes = new ArrayList<String>(
                Arrays.asList("--", "-", "/")
            );
        }

        @Override
        public String getPreferredName() {
            return preferredName;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public boolean isRequired() {
            return required;
        }

        @Override
        public boolean canRestrictArgument() {
            return false;
        }

        @Override
        public boolean canProcess(final WriteableCommandLine commandLine, final String argument2) {
            return true;
        }

        @Override
        public boolean isArgument() {
            return isArgument;
        }

        @Override
        public boolean isOption() {
            return !isArgument;
        }

        @Override
        public java.util.List getTriggers() {
            return Arrays.asList(new String[]{trigger});
        }

        @Override
        public java.util.Set getPrefixes() {
            return new java.util.HashSet<String>(prefixes);
        }

        @Override
        public boolean canProcess(final WriteableCommandLine commandLine, final java.util.List arguments2) {
            return true;
        }

        @Override
        public int getPrefixesMsgsCount() {
            return 0;
        }

        @Override
        public void process(final WriteableCommandLine commandLine, final java.util.List arguments2) {
        }

        @Override
        public void defaults(final WriteableCommandLine commandLine) {
        }

        @Override
        public boolean isOption(final String trigger2) {
            return trigger2 != null && trigger2.equals(trigger);
        }

        @Override
        public java.util.Set getTriggersSet() {
            return new java.util.HashSet<String>(Arrays.asList(new String[]{trigger}));
        }
    }
}