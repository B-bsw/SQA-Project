package org.apache.commons.cli2;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class WriteableCommandLineTest {
    private WriteableCommandLine cmd;
    private TestOption optionA;
    private TestOption optionB;
    private TestOption switchOption;

    @Before
    public void setUp() {
        cmd = new TestWriteableCommandLine();
        optionA = new TestOption("a", "optionA");
        optionB = new TestOption("b", "optionB");
        switchOption = new TestOption("s", "switchOption");
    }

    @Test
    public void testAddOptionAndGetUndefaultedValues() {
        cmd.addOption(optionA);
        cmd.addValue(optionA, "value1");
        cmd.addValue(optionA, "value2");
        
        assertEquals(Arrays.asList("value1", "value2"), cmd.getUndefaultedValues(optionA));
        assertTrue(cmd.getUndefaultedValues(optionB).isEmpty());
    }

    @Test
    public void testGetUndefaultedValues_NoValues() {
        List<String> values = cmd.getUndefaultedValues(optionA);
        assertNotNull(values);
        assertTrue(values.isEmpty());
    }

    @Test
    public void testSetDefaultValuesAndGetUndefaultedValues() {
        cmd.setDefaultValues(optionA, Arrays.asList("default1", "default2"));
        cmd.addValue(optionA, "actual1");
        
        List undefaulted = cmd.getUndefaultedValues(optionA);
        assertEquals(Arrays.asList("actual1"), undefaulted);
    }

    @Test
    public void testAddSwitch_FirstTime() {
        cmd.addSwitch(switchOption, true);
        cmd.addSwitch(switchOption, false);
        // Should not throw
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_DuplicateThrows() {
        cmd.addSwitch(switchOption, true);
        cmd.addSwitch(switchOption, true);
    }

    @Test
    public void testSetDefaultSwitch() {
        cmd.setDefaultSwitch(switchOption, true);
        cmd.addSwitch(switchOption, false);
        // No exception expected
    }

    @Test
    public void testAddProperty_WithOption() {
        cmd.addProperty(optionA, "key1", "value1");
        cmd.addProperty(optionA, "key1", "value2");
        cmd.addProperty(optionA, "key2", "value3");
        
        // Verify using a custom method to check properties
        assertEquals("value2", ((TestWriteableCommandLine) cmd).getProperty(optionA, "key1"));
        assertEquals("value3", ((TestWriteableCommandLine) cmd).getProperty(optionA, "key2"));
    }

    @Test
    public void testAddProperty_General() {
        cmd.addProperty("generalKey", "generalValue");
        assertEquals("generalValue", ((TestWriteableCommandLine) cmd).getProperty("generalKey"));
    }

    @Test
    public void testAddProperty_ReplaceExistingValue() {
        cmd.addProperty(optionA, "key", "oldValue");
        cmd.addProperty(optionA, "key", "newValue");
        assertEquals("newValue", ((TestWriteableCommandLine) cmd).getProperty(optionA, "key"));
    }

    @Test
    public void testLooksLikeOption_ReturnsTrue() {
        assertTrue(cmd.looksLikeOption("-a"));
        assertTrue(cmd.looksLikeOption("--option"));
        assertTrue(cmd.looksLikeOption("-abc"));
    }

    @Test
    public void testLooksLikeOption_ReturnsFalse() {
        assertFalse(cmd.looksLikeOption("value"));
        assertFalse(cmd.looksLikeOption(""));
        assertFalse(cmd.looksLikeOption(null));
        assertFalse(cmd.looksLikeOption("123"));
        assertFalse(cmd.looksLikeOption("-"));
    }

    @Test
    public void testLooksLikeOption_BoundaryValues() {
        assertFalse(cmd.looksLikeOption("-"));
        assertTrue(cmd.looksLikeOption("--"));
        assertTrue(cmd.looksLikeOption("-x"));
        assertFalse(cmd.looksLikeOption("x-"));
    }

    @Test
    public void testGetUndefaultedValues_NullOption() {
        try {
            cmd.getUndefaultedValues(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAddValue_NullValue() {
        cmd.addValue(optionA, null);
        List values = cmd.getUndefaultedValues(optionA);
        assertEquals(1, values.size());
        assertNull(values.get(0));
    }

    @Test
    public void testAddValue_NullOption() {
        try {
            cmd.addValue(null, "value");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetDefaultValues_NullList() {
        cmd.setDefaultValues(optionA, null);
        // Should not throw, treat as empty list
        List values = cmd.getUndefaultedValues(optionA);
        assertNotNull(values);
        assertTrue(values.isEmpty());
    }

    @Test
    public void testAddSwitch_NullOption() {
        try {
            cmd.addSwitch(null, true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetDefaultSwitch_NullOption() {
        try {
            cmd.setDefaultSwitch(null, true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAddProperty_NullOptionWithProperty() {
        try {
            cmd.addProperty(null, "key", "value");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAddProperty_NullProperty() {
        try {
            cmd.addProperty(optionA, null, "value");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testLoop_NoIterations() {
        // Test with empty list
        List<String> values = cmd.getUndefaultedValues(optionA);
        for (String value : values) {
            fail("Should not iterate");
        }
    }

    @Test
    public void testLoop_SingleIteration() {
        cmd.addValue(optionA, "single");
        List<String> values = cmd.getUndefaultedValues(optionA);
        assertEquals(1, values.size());
        assertEquals("single", values.get(0));
    }

    @Test
    public void testLoop_MultipleIterations() {
        cmd.addValue(optionA, "first");
        cmd.addValue(optionA, "second");
        cmd.addValue(optionA, "third");
        List<String> values = cmd.getUndefaultedValues(optionA);
        assertEquals(3, values.size());
        assertEquals("first", values.get(0));
        assertEquals("second", values.get(1));
        assertEquals("third", values.get(2));
    }

    // Test implementation classes
    private static class TestOption implements Option {
        private final String trigger;
        private final String description;

        TestOption(String trigger, String description) {
            this.trigger = trigger;
            this.description = description;
        }

        @Override
        public String getPreferredName() {
            return trigger;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return "TestOption(" + trigger + ")";
        }
    }

    private static class TestWriteableCommandLine implements WriteableCommandLine {
        private final List<Option> options = new ArrayList<Option>();
        private final java.util.Map<Option, List<Object>> values = new java.util.HashMap<Option, List<Object>>();
        private final java.util.Map<Option, List<Object>> defaultValues = new java.util.HashMap<Option, List<Object>>();
        private final java.util.Set<Option> switches = new java.util.HashSet<Option>();
        private final java.util.Map<Option, Boolean> switchValues = new java.util.HashMap<Option, Boolean>();
        private final java.util.Map<Option, java.util.Map<String, String>> propertiesByOption = new java.util.HashMap<Option, java.util.Map<String, String>>();
        private final java.util.Map<String, String> generalProperties = new java.util.HashMap<String, String>();

        @Override
        public void addOption(Option option) {
            options.add(option);
        }

        @Override
        public void addValue(Option option, Object value) {
            if (option == null) {
                throw new IllegalArgumentException("Option cannot be null");
            }
            List<Object> optionValues = values.get(option);
            if (optionValues == null) {
                optionValues = new ArrayList<Object>();
                values.put(option, optionValues);
            }
            optionValues.add(value);
        }

        @Override
        public List getUndefaultedValues(Option option) {
            if (option == null) {
                throw new IllegalArgumentException("Option cannot be null");
            }
            List<Object> optionValues = values.get(option);
            return optionValues != null ? optionValues : new ArrayList<Object>();
        }

        @Override
        public void setDefaultValues(Option option, List defaultValues) {
            if (option == null) {
                throw new IllegalArgumentException("Option cannot be null");
            }
            if (defaultValues == null) {
                this.defaultValues.put(option, new ArrayList<Object>());
            } else {
                this.defaultValues.put(option, defaultValues);
            }
        }

        @Override
        public void addSwitch(Option option, boolean value) throws IllegalStateException {
            if (option == null) {
                throw new IllegalArgumentException("Option cannot be null");
            }
            if (!switches.add(option)) {
                throw new IllegalStateException("Switch already added for option: " + option);
            }
            switchValues.put(option, value);
        }

        @Override
        public void setDefaultSwitch(Option option, Boolean defaultSwitch) {
            if (option == null) {
                throw new IllegalArgumentException("Option cannot be null");
            }
            switchValues.put(option, defaultSwitch);
        }

        @Override
        public void addProperty(Option option, String property, String value) {
            if (option == null) {
                throw new IllegalArgumentException("Option cannot be null");
            }
            if (property == null) {
                throw new IllegalArgumentException("Property cannot be null");
            }
            java.util.Map<String, String> props = propertiesByOption.get(option);
            if (props == null) {
                props = new java.util.HashMap<String, String>();
                propertiesByOption.put(option, props);
            }
            props.put(property, value);
        }

        @Override
        public void addProperty(String property, String value) {
            generalProperties.put(property, value);
        }

        @Override
        public boolean looksLikeOption(String argument) {
            return argument != null && argument.length() > 1 && argument.startsWith("-");
        }

        public String getProperty(Option option, String key) {
            java.util.Map<String, String> props = propertiesByOption.get(option);
            if (props != null) {
                return props.get(key);
            }
            return null;
        }

        public String getProperty(String key) {
            return generalProperties.get(key);
        }

        // Additional methods from CommandLine interface (if any, but not required for tests)
        @Override
        public java.util.List getValues(Option option) {
            return null;
        }

        @Override
        public boolean hasOption(Option option) {
            return options.contains(option);
        }

        @Override
        public boolean hasOption(String trigger) {
            for (Option option : options) {
                if (option.getPreferredName().equals(trigger)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public Option getOption(String trigger) {
            for (Option option : options) {
                if (option.getPreferredName().equals(trigger)) {
                    return option;
                }
            }
            return null;
        }
    }
}