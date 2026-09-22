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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class WriteableCommandLineImplTest {

    private WriteableCommandLineImpl commandLine;
    private Option rootOption;
    private Option testOption;
    private Option argumentOption;
    private Option propertyOption;
    private List<String> arguments;

    @Before
    public void setUp() throws Exception {
        // Create root option with prefix "-"
        rootOption = new Option() {
            public Set getPrefixes() {
                return new HashSet<String>(Arrays.asList("-", "--"));
            }
            public Set getTriggers() {
                return new HashSet<String>(Arrays.asList("-root"));
            }
            public String getPreferredName() {
                return "-root";
            }
            public boolean canProcess(String arg) { return false; }
            public void process(WriteableCommandLine cmdLine) {}
            public List<String> getPrefixesAsList() { return null; }
            public String getShortName() { return null; }
            public String getLongName() { return null; }
            public String getDescription() { return null; }
            public boolean isRequired() { return false; }
            public void validate(WriteableCommandLine cmdLine) {}
            public void help(StringBuffer buffer) {}
            public void help(StringBuffer buffer, int indent) {}
            public void process(WriteableCommandLine cmdLine, List args) {}
            public int getMinimum() { return 0; }
            public int getMaximum() { return 0; }
            public List getDefaultValues() { return null; }
            public Set getTriggers0() { return null; }
            public Argument getArgument() { return null; }
            public Option findOption(String trigger) { return null; }
            public Option findOption(char trigger) { return null; }
            public void defaults(WriteableCommandLine cmdLine) {}
        };
        arguments = new ArrayList<String>(Arrays.asList("-arg1", "value1", "value2"));
        commandLine = new WriteableCommandLineImpl(rootOption, arguments);

        // Create test option
        testOption = new Option() {
            public Set getPrefixes() {
                return new HashSet<String>(Arrays.asList("-"));
            }
            public Set getTriggers() {
                return new HashSet<String>(Arrays.asList("-test", "-t"));
            }
            public String getPreferredName() {
                return "-test";
            }
            public boolean canProcess(String arg) { return false; }
            public void process(WriteableCommandLine cmdLine) {}
            public List<String> getPrefixesAsList() { return null; }
            public String getShortName() { return null; }
            public String getLongName() { return null; }
            public String getDescription() { return null; }
            public boolean isRequired() { return false; }
            public void validate(WriteableCommandLine cmdLine) {}
            public void help(StringBuffer buffer) {}
            public void help(StringBuffer buffer, int indent) {}
            public void process(WriteableCommandLine cmdLine, List args) {}
            public int getMinimum() { return 0; }
            public int getMaximum() { return 0; }
            public List getDefaultValues() { return null; }
            public Set getTriggers0() { return null; }
            public Argument getArgument() { return null; }
            public Option findOption(String trigger) { return null; }
            public Option findOption(char trigger) { return null; }
            public void defaults(WriteableCommandLine cmdLine) {}
        };

        // Create argument option
        argumentOption = new Argument() {
            public String getPreferredName() { return "arg"; }
            public Set getTriggers() { return new HashSet<String>(Arrays.asList("arg")); }
            public Set getPrefixes() { return new HashSet<String>(); }
            public void process(WriteableCommandLine cmdLine) {}
            public void validate(WriteableCommandLine cmdLine) {}
            public void help(StringBuffer buffer) {}
            public void help(StringBuffer buffer, int indent) {}
            public void process(WriteableCommandLine cmdLine, List args) {}
            public int getMinimum() { return 0; }
            public int getMaximum() { return 0; }
            public List getDefaultValues() { return null; }
            public Set getTriggers0() { return null; }
            public Argument getArgument() { return null; }
            public Option findOption(String trigger) { return null; }
            public Option findOption(char trigger) { return null; }
            public void defaults(WriteableCommandLine cmdLine) {}
            public String getDescription() { return null; }
            public boolean isRequired() { return false; }
            public String getShortName() { return null; }
            public String getLongName() { return null; }
            public int getConsistentArgumentCount() { return 0; }
            public boolean canProcess(String arg) { return false; }
            public boolean canProcess(WriteableCommandLine cmdLine, String arg) { return false; }
            public void processValues(WriteableCommandLine cmdLine, List values) {}
            public void validate(WriteableCommandLine cmdLine, List values) {}
            public boolean isValidOption(Option option, WriteableCommandLine cmdLine) { return false; }
            public boolean isOption(WriteableCommandLine cmdLine, String arg) { return false; }
            public boolean isOption(String arg) { return false; }
            public void process(WriteableCommandLine cmdLine, String arg) {}
            public Set getTriggers(Set prefixes) { return null; }
            public boolean canProcess(String[] args) { return false; }
            public void process(String[] args) {}
        };

        // Create property option
        propertyOption = new Option() {
            public Set getPrefixes() {
                return new HashSet<String>(Arrays.asList("-"));
            }
            public Set getTriggers() {
                return new HashSet<String>(Arrays.asList("-prop"));
            }
            public String getPreferredName() {
                return "-prop";
            }
            public boolean canProcess(String arg) { return false; }
            public void process(WriteableCommandLine cmdLine) {}
            public List<String> getPrefixesAsList() { return null; }
            public String getShortName() { return null; }
            public String getLongName() { return null; }
            public String getDescription() { return null; }
            public boolean isRequired() { return false; }
            public void validate(WriteableCommandLine cmdLine) {}
            public void help(StringBuffer buffer) {}
            public void help(StringBuffer buffer, int indent) {}
            public void process(WriteableCommandLine cmdLine, List args) {}
            public int getMinimum() { return 0; }
            public int getMaximum() { return 0; }
            public List getDefaultValues() { return null; }
            public Set getTriggers0() { return null; }
            public Argument getArgument() { return null; }
            public Option findOption(String trigger) { return null; }
            public Option findOption(char trigger) { return null; }
            public void defaults(WriteableCommandLine cmdLine) {}
        };
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals(arguments, commandLine.getNormalised());
        assertNotNull(commandLine.getOptions());
        assertTrue(commandLine.getOptions().isEmpty());
        assertNotNull(commandLine.getOptionTriggers());
        assertTrue(commandLine.getOptionTriggers().isEmpty());
        assertFalse(commandLine.hasOption(testOption));
        assertNull(commandLine.getOption("-nonexistent"));
        assertNull(commandLine.getOption(null));
    }

    @Test
    public void testAddOptionAndGetOption() {
        commandLine.addOption(testOption);
        assertTrue(commandLine.hasOption(testOption));
        assertSame(testOption, commandLine.getOption("-test"));
        assertSame(testOption, commandLine.getOption("-t"));
        assertNull(commandLine.getOption("-other"));
    }

    @Test
    public void testAddValueAndGetValues() {
        commandLine.addValue(testOption, "value1");
        commandLine.addValue(testOption, "value2");
        List values = commandLine.getValues(testOption, null);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));

        // Test with no values
        List noValues = commandLine.getValues(testOption, null);
        assertEquals(2, noValues.size());

        // Test with default values
        List defaultValue = Arrays.asList("default1", "default2");
        commandLine.setDefaultValues(testOption, defaultValue);
        List result = commandLine.getValues(testOption, null);
        assertEquals(2, result.size());
    }

    @Test
    public void testAddValueWithArgumentOption() {
        // Argument option should be added to options list
        commandLine.addValue(argumentOption, "value");
        assertTrue(commandLine.hasOption(argumentOption));
        List values = commandLine.getValues(argumentOption, null);
        assertEquals(1, values.size());
        assertEquals("value", values.get(0));
    }

    @Test
    public void testGetUndefaultedValues() {
        // No values added
        List noValues = commandLine.getUndefaultedValues(testOption);
        assertTrue(noValues.isEmpty());

        // Add values
        commandLine.addValue(testOption, "v1");
        commandLine.addValue(testOption, "v2");
        List values = commandLine.getUndefaultedValues(testOption);
        assertEquals(2, values.size());
        assertEquals("v1", values.get(0));
        assertEquals("v2", values.get(1));
    }

    @Test
    public void testAddSwitchAndGetSwitch() {
        commandLine.addSwitch(testOption, true);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(testOption, Boolean.FALSE));

        // Test duplicate add
        try {
            commandLine.addSwitch(testOption, false);
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testGetSwitchWithDefaults() {
        // No switch set, use default provided
        assertEquals(Boolean.TRUE, commandLine.getSwitch(testOption, Boolean.TRUE));
        assertEquals(Boolean.FALSE, commandLine.getSwitch(testOption, Boolean.FALSE));

        // No switch set, use default from option
        commandLine.setDefaultSwitch(testOption, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(testOption, Boolean.FALSE));

        // Switch set directly
        commandLine.addSwitch(testOption, false);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(testOption, Boolean.TRUE));
    }

    @Test
    public void testSetDefaultSwitchNull() {
        commandLine.setDefaultSwitch(testOption, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(testOption, Boolean.FALSE));

        commandLine.setDefaultSwitch(testOption, null);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(testOption, Boolean.FALSE));
    }

    @Test
    public void testAddPropertyAndGetProperty() {
        commandLine.addProperty(testOption, "key1", "value1");
        commandLine.addProperty(testOption, "key2", "value2");

        assertEquals("value1", commandLine.getProperty(testOption, "key1", "default"));
        assertEquals("value2", commandLine.getProperty(testOption, "key2", "default"));
        assertEquals("default", commandLine.getProperty(testOption, "nonexistent", "default"));
    }

    @Test
    public void testGetPropertyWithNoProperties() {
        assertEquals("default", commandLine.getProperty(testOption, "key", "default"));
    }

    @Test
    public void testGetPropertyWithPropertyOption() {
        commandLine.addProperty("key", "value");
        assertEquals("value", commandLine.getProperty("key"));
    }

    @Test
    public void testGetProperties() {
        commandLine.addProperty(testOption, "k1", "v1");
        commandLine.addProperty(testOption, "k2", "v2");

        Set keys = commandLine.getProperties(testOption);
        assertEquals(2, keys.size());
        assertTrue(keys.contains("k1"));
        assertTrue(keys.contains("k2"));
    }

    @Test
    public void testGetPropertiesEmpty() {
        Set keys = commandLine.getProperties(testOption);
        assertNotNull(keys);
        assertTrue(keys.isEmpty());
    }

    @Test
    public void testGetPropertiesDefaultOption() {
        commandLine.addProperty(new PropertyOption(), "key", "value");
        Set keys = commandLine.getProperties();
        assertEquals(1, keys.size());
        assertTrue(keys.contains("key"));
    }

    @Test
    public void testLooksLikeOption() {
        assertTrue(commandLine.looksLikeOption("-test"));
        assertTrue(commandLine.looksLikeOption("--test"));
        assertFalse(commandLine.looksLikeOption("test"));
        assertFalse(commandLine.looksLikeOption(""));
        assertFalse(commandLine.looksLikeOption("-"));
    }

    @Test
    public void testGetOptionsUnmodifiable() {
        commandLine.addOption(testOption);
        List options = commandLine.getOptions();
        assertEquals(1, options.size());
        try {
            options.add(argumentOption);
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetOptionTriggersUnmodifiable() {
        commandLine.addOption(testOption);
        Set triggers = commandLine.getOptionTriggers();
        assertEquals(2, triggers.size());
        try {
            triggers.add("new");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSetDefaultValues() {
        List defaults = Arrays.asList("d1", "d2");
        commandLine.setDefaultValues(testOption, defaults);
        assertEquals(defaults, commandLine.getValues(testOption, null));

        // Test null defaults
        commandLine.setDefaultValues(testOption, null);
        assertTrue(commandLine.getValues(testOption, null).isEmpty());
    }

    @Test
    public void testGetValuesWithDefaultValues() {
        List defaults = Arrays.asList("d1", "d2", "d3");
        commandLine.setDefaultValues(testOption, defaults);
        commandLine.addValue(testOption, "v1");

        List result = commandLine.getValues(testOption, null);
        assertEquals(3, result.size());
        assertEquals("v1", result.get(0));
        assertEquals("d2", result.get(1));
        assertEquals("d3", result.get(2));
    }

    @Test
    public void testGetValuesEmptyList() {
        List result = commandLine.getValues(testOption, null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetValuesWithNullDefault() {
        commandLine.addValue(testOption, "v1");
        List result = commandLine.getValues(testOption, null);
        assertEquals(1, result.size());
        assertEquals("v1", result.get(0));
    }

    @Test
    public void testToStringWithQuotes() {
        arguments = new ArrayList<String>(Arrays.asList("arg1", "with space", "arg3"));
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(rootOption, arguments);
        String result = cmd.toString();
        assertEquals("arg1 \"with space\" arg3", result);
    }

    @Test
    public void testToStringWithoutSpaces() {
        arguments = new ArrayList<String>(Arrays.asList("arg1", "arg2"));
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(rootOption, arguments);
        String result = cmd.toString();
        assertEquals("arg1 arg2", result);
    }

    @Test
    public void testToStringEmpty() {
        arguments = new ArrayList<String>();
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(rootOption, arguments);
        String result = cmd.toString();
        assertEquals("", result);
    }
}