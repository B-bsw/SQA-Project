package org.apache.commons.cli2.commandline;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.WriteableCommandLine;

public class WriteableCommandLineImplTest {

    private WriteableCommandLineImpl commandLine;
    private TestOption rootOption;
    private TestOption childOption;
    private TestOption parentOption;
    private TestArgument argument;

    private static class TestOption implements Option {
        private final String preferredName;
        private final Set triggers = new HashSet();
        private final List arguments = new ArrayList();
        private Option parent;

        public TestOption(String preferredName) {
            this.preferredName = preferredName;
            this.triggers.add(preferredName);
        }

        @Override
        public String getPreferredName() {
            return preferredName;
        }

        @Override
        public Set getTriggers() {
            return triggers;
        }

        @Override
        public Option getParent() {
            return parent;
        }

        public void setParent(Option parent) {
            this.parent = parent;
        }

        @Override
        public List getPrefixes() {
            return Arrays.asList("-", "--");
        }
    }

    private static class TestArgument implements Argument {
        @Override
        public String getPreferredName() {
            return "arg";
        }

        @Override
        public Set getTriggers() {
            return Collections.singleton("arg");
        }

        @Override
        public Option getParent() {
            return null;
        }

        @Override
        public List getPrefixes() {
            return Collections.emptyList();
        }
    }

    @Before
    public void setUp() {
        rootOption = new TestOption("root");
        childOption = new TestOption("child");
        parentOption = new TestOption("parent");
        argument = new TestArgument();
        
        // Set up parent-child relationship
        childOption.setParent(rootOption);
        
        commandLine = new WriteableCommandLineImpl(rootOption, new ArrayList(Arrays.asList("arg1", "-option", "val")));
    }

    @After
    public void tearDown() {
        commandLine = null;
        rootOption = null;
        childOption = null;
        parentOption = null;
        argument = null;
    }

    @Test
    public void testAddOption() {
        commandLine.addOption(childOption);
        assertTrue(commandLine.hasOption(childOption));
        assertEquals(childOption, commandLine.getOption("-child"));
        assertEquals(childOption, commandLine.getOption("child"));
        
        // Test parent option automatically added
        commandLine.addOption(childOption);
        assertTrue(commandLine.hasOption(childOption));
    }

    @Test
    public void testAddValue() {
        // Non-argument option
        commandLine.addValue(rootOption, "value1");
        List values = commandLine.getValues(rootOption, null);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));

        // Argument type
        commandLine.addValue(argument, "argValue");
        values = commandLine.getValues(argument, null);
        assertEquals(1, values.size());
        assertEquals("argValue", values.get(0));
    }

    @Test
    public void testAddSwitch() {
        commandLine.addSwitch(rootOption, true);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(rootOption, Boolean.FALSE));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchDuplicate() {
        commandLine.addSwitch(rootOption, true);
        commandLine.addSwitch(rootOption, false);
    }

    @Test
    public void testHasOption() {
        assertFalse(commandLine.hasOption(childOption));
        commandLine.addOption(childOption);
        assertTrue(commandLine.hasOption(childOption));
    }

    @Test
    public void testGetOption() {
        assertNull(commandLine.getOption("nonexistent"));
        commandLine.addOption(childOption);
        assertEquals(childOption, commandLine.getOption("-child"));
        assertEquals(childOption, commandLine.getOption("child"));
    }

    @Test
    public void testGetValuesWithDefaults() {
        // Test with defaults
        List defaults = Arrays.asList("default1", "default2");
        commandLine.setDefaultValues(rootOption, defaults);
        
        commandLine.addValue(rootOption, "value1");
        List values = commandLine.getValues(rootOption, null);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));

        // Test with null values should return defaults
        List nullValues = commandLine.getValues(null, null);
        assertEquals(0, nullValues.size());

        // Test with more defaults
        commandLine.addValue(rootOption, "value1");
        defaults = Arrays.asList("default1", "default2", "default3");
        commandLine.setDefaultValues(rootOption, defaults);
        values = commandLine.getValues(rootOption, null);
        assertEquals(3, values.size());

        // Test with method defaults
        List methodDefaults = Arrays.asList("method1");
        values = commandLine.getValues(rootOption, methodDefaults);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    @Test
    public void testGetUndefaultedValues() {
        // No values set
        List empty = commandLine.getUndefaultedValues(rootOption);
        assertEquals(0, empty.size());

        // Add value
        commandLine.addValue(rootOption, "value1");
        List values = commandLine.getUndefaultedValues(rootOption);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    @Test
    public void testGetSwitch() {
        // Not set returns default
        assertEquals(Boolean.TRUE, commandLine.getSwitch(rootOption, Boolean.TRUE));
        assertNull(commandLine.getSwitch(rootOption, null));

        // Set switch
        commandLine.addSwitch(rootOption, true);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(rootOption, Boolean.FALSE));

        // Test with default switch
        commandLine.setDefaultSwitch(rootOption, Boolean.FALSE);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(childOption, null));
    }

    @Test
    public void testAddGetProperty() {
        // Default property
        assertEquals("default", commandLine.getProperty("nonexistent.prop"));
        
        // Add property
        commandLine.addProperty("myProp", "value1");
        assertEquals("value1", commandLine.getProperty("myProp"));

        // Add property for specific option
        commandLine.addProperty(rootOption, "optProp", "optValue");
        assertEquals("optValue", commandLine.getProperty(rootOption, "optProp", "default"));
        assertEquals("default", commandLine.getProperty(rootOption, "missing", "default"));
    }

    @Test
    public void testGetProperties() {
        // Empty properties
        assertEquals(0, commandLine.getProperties().size());
        assertEquals(0, commandLine.getProperties(rootOption).size());

        // Add properties
        commandLine.addProperty("prop1", "value1");
        commandLine.addProperty("prop2", "value2");
        
        Set properties = commandLine.getProperties();
        assertEquals(2, properties.size());
        assertTrue(properties.contains("prop1"));
        assertTrue(properties.contains("prop2"));

        commandLine.addProperty(rootOption, "optProp", "optValue");
        Set optProperties = commandLine.getProperties(rootOption);
        assertEquals(1, optProperties.size());
        assertTrue(optProperties.contains("optProp"));
    }

    @Test
    public void testLooksLikeOption() {
        assertTrue(commandLine.looksLikeOption("-option"));
        assertTrue(commandLine.looksLikeOption("--dualfix"));
        // Prefixes from TestOption are "-" and "--", so no prefix means not option
        assertFalse(commandLine.looksLikeOption("plain"));
        assertFalse(commandLine.looksLikeOption(""));
    }

    @Test
    public void testToString() {
        WriteableCommandLineImpl wc = new WriteableCommandLineImpl(rootOption, 
            Arrays.asList("normal", "has space", "noSpace"));
        assertEquals("\"normal\" \"has space\" noSpace", wc.toString());
        
        // Test with single empty string
        WriteableCommandLineImpl wc2 = new WriteableCommandLineImpl(rootOption, 
            Arrays.asList(""));
        assertEquals("", wc2.toString());
    }

    @Test
    public void testGetOptionsReturnsUnmodifiableList() {
        commandLine.addOption(childOption);
        List options = commandLine.getOptions();
        assertEquals(1, options.size());
        assertSame(childOption, options.get(0));
        
        try {
            options.add(new TestOption("new"));
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected exception
        }
    }

    @Test
    public void testGetOptionTriggersReturnsUnmodifiableSet() {
        commandLine.addOption(childOption);
        Set triggers = commandLine.getOptionTriggers();
        assertTrue(triggers.contains("-child"));
        
        try {
            triggers.add("newTrigger");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected exception
        }
    }

    @Test
    public void testSetDefaultValues() {
        List defaults = Arrays.asList("val1", "val2");
        commandLine.setDefaultValues(rootOption, defaults);
        
        // Test with no command line values
        List result = commandLine.getValues(rootOption, null);
        assertEquals(2, result.size());
        
        // Test with null removes defaults
        commandLine.setDefaultValues(rootOption, null);
        result = commandLine.getValues(rootOption, null);
        assertEquals(0, result.size());
    }

    @Test
    public void testSetDefaultSwitch() {
        commandLine.setDefaultSwitch(rootOption, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(rootOption, Boolean.FALSE));
        
        commandLine.setDefaultSwitch(rootOption, null);
        assertNull(commandLine.getSwitch(rootOption, null));
    }

    @Test
    public void testGetNormalised() {
        WriteableCommandLineImpl wc = new WriteableCommandLineImpl(rootOption, 
            Arrays.asList("arg1", "arg2"));
        List normalised = wc.getNormalised();
        assertEquals(2, normalised.size());
        
        try {
            normalised.add("new");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected exception
        }
    }
}