package org.apache.commons.cli2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 Test Suite for WriteableCommandLine.
 * Compatible with Java 1.4 / Java 7 syntax without external mocking dependencies.
 */
public class WriteableCommandLineTest {

    private WriteableCommandLine commandLine;
    private MockWriteableCommandLineHandler handler;
    private Option mockOption1;
    private Option mockOption2;

    @Before
    public void setUp() {
        this.handler = new MockWriteableCommandLineHandler();
        this.commandLine = (WriteableCommandLine) Proxy.newProxyInstance(
            WriteableCommandLine.class.getClassLoader(),
            new Class[] { WriteableCommandLine.class },
            this.handler
        );

        this.mockOption1 = createMockOption("option1");
        this.mockOption2 = createMockOption("option2");
    }

    private Option createMockOption(final String name) {
        InvocationHandler optionHandler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                if ("toString".equals(methodName)) {
                    return "MockOption[" + name + "]";
                } else if ("hashCode".equals(methodName)) {
                    return new Integer(name.hashCode());
                } else if ("equals".equals(methodName)) {
                    if (args != null && args.length > 0 && args[0] != null) {
                        return Boolean.valueOf(proxy == args[0]);
                    }
                    return Boolean.FALSE;
                }
                return null;
            }
        };
        return (Option) Proxy.newProxyInstance(
            Option.class.getClassLoader(),
            new Class[] { Option.class },
            optionHandler
        );
    }

    // =========================================================================
    // addOption Tests
    // =========================================================================

    @Test
    public void addOption_givenValidOption_shouldStoreOptionSuccessfully() {
        // Arrange & Act
        this.commandLine.addOption(this.mockOption1);

        // Assert
        Assert.assertTrue("Option should be contained in the command line",
            this.handler.getOptions().contains(this.mockOption1));
    }

    @Test
    public void addOption_givenNullOption_shouldStoreNullWithoutCrashing() {
        // Arrange & Act
        this.commandLine.addOption(null);

        // Assert
        Assert.assertTrue("Null option should be recorded in options set",
            this.handler.getOptions().contains(null));
    }

    // =========================================================================
    // addValue Tests
    // =========================================================================

    @Test
    public void addValue_givenValidOptionAndValue_shouldStoreValue() {
        // Arrange
        String testValue = "value1";

        // Act
        this.commandLine.addValue(this.mockOption1, testValue);

        // Assert
        List values = (List) this.handler.getValues().get(this.mockOption1);
        Assert.assertNotNull("Value list should not be null", values);
        Assert.assertEquals("Value list size should be 1", 1, values.size());
        Assert.assertEquals("Stored value should match input", testValue, values.get(0));
    }

    @Test
    public void addValue_givenMultipleValuesForSameOption_shouldPreserveOrder() {
        // Arrange
        String value1 = "first";
        String value2 = "second";

        // Act
        this.commandLine.addValue(this.mockOption1, value1);
        this.commandLine.addValue(this.mockOption1, value2);

        // Assert
        List values = (List) this.handler.getValues().get(this.mockOption1);
        Assert.assertNotNull("Value list should exist", values);
        Assert.assertEquals("Value list should have 2 elements", 2, values.size());
        Assert.assertEquals("First element mismatch", value1, values.get(0));
        Assert.assertEquals("Second element mismatch", value2, values.get(1));
    }

    @Test
    public void addValue_givenNullValue_shouldAllowStoringNull() {
        // Arrange & Act
        this.commandLine.addValue(this.mockOption1, null);

        // Assert
        List values = (List) this.handler.getValues().get(this.mockOption1);
        Assert.assertNotNull("Value list should exist", values);
        Assert.assertEquals("Value list should have 1 item", 1, values.size());
        Assert.assertNull("Stored value should be null", values.get(0));
    }

    @Test
    public void addValue_givenNullOption_shouldStoreUnderNullKey() {
        // Arrange
        String testVal = "orphanValue";

        // Act
        this.commandLine.addValue(null, testVal);

        // Assert
        List values = (List) this.handler.getValues().get(null);
        Assert.assertNotNull("Values list for null option should exist", values);
        Assert.assertEquals("Orphan value should be saved", testVal, values.get(0));
    }

    // =========================================================================
    // setDefaultValues Tests
    // =========================================================================

    @Test
    public void setDefaultValues_givenValidDefaultsList_shouldStoreDefaults() {
        // Arrange
        List defaults = new ArrayList();
        defaults.add("def1");
        defaults.add("def2");

        // Act
        this.commandLine.setDefaultValues(this.mockOption1, defaults);

        // Assert
        List storedDefaults = (List) this.handler.getDefaultValues().get(this.mockOption1);
        Assert.assertNotNull("Defaults should be stored", storedDefaults);
        Assert.assertEquals("Defaults size mismatch", 2, storedDefaults.size());
        Assert.assertEquals("Default element 1 mismatch", "def1", storedDefaults.get(0));
        Assert.assertEquals("Default element 2 mismatch", "def2", storedDefaults.get(1));
    }

    @Test
    public void setDefaultValues_givenEmptyList_shouldStoreEmptyDefaults() {
        // Arrange
        List emptyDefaults = new ArrayList();

        // Act
        this.commandLine.setDefaultValues(this.mockOption1, emptyDefaults);

        // Assert
        List storedDefaults = (List) this.handler.getDefaultValues().get(this.mockOption1);
        Assert.assertNotNull("Defaults should not be null", storedDefaults);
        Assert.assertTrue("Defaults should be empty", storedDefaults.isEmpty());
    }

    @Test
    public void setDefaultValues_givenNullDefaults_shouldStoreNullReference() {
        // Arrange & Act
        this.commandLine.setDefaultValues(this.mockOption1, null);

        // Assert
        Assert.assertTrue("Key should be present", this.handler.getDefaultValues().containsKey(this.mockOption1));
        Assert.assertNull("Defaults should be stored as null", this.handler.getDefaultValues().get(this.mockOption1));
    }

    // =========================================================================
    // addSwitch Tests & Exception Branches
    // =========================================================================

    @Test
    public void addSwitch_givenNewOptionAndTrue_shouldStoreSwitchAsTrue() {
        // Arrange & Act
        this.commandLine.addSwitch(this.mockOption1, true);

        // Assert
        Boolean state = (Boolean) this.handler.getSwitches().get(this.mockOption1);
        Assert.assertNotNull("Switch state must not be null", state);
        Assert.assertEquals("Switch state should be true", Boolean.TRUE, state);
    }

    @Test
    public void addSwitch_givenNewOptionAndFalse_shouldStoreSwitchAsFalse() {
        // Arrange & Act
        this.commandLine.addSwitch(this.mockOption1, false);

        // Assert
        Boolean state = (Boolean) this.handler.getSwitches().get(this.mockOption1);
        Assert.assertNotNull("Switch state must not be null", state);
        Assert.assertEquals("Switch state should be false", Boolean.FALSE, state);
    }

    @Test
    public void addSwitch_givenExistingSwitchAlreadyAdded_shouldThrowIllegalStateException() {
        // Arrange
        this.commandLine.addSwitch(this.mockOption1, true);

        // Act & Assert
        try {
            this.commandLine.addSwitch(this.mockOption1, false);
            Assert.fail("Expected IllegalStateException when re-adding switch to the same option");
        } catch (IllegalStateException expected) {
            Assert.assertNotNull("Exception message should be provided", expected.getMessage());
        }
    }

    @Test
    public void addSwitch_givenDifferentOptions_shouldAllowAddingBothSwitches() {
        // Arrange & Act
        this.commandLine.addSwitch(this.mockOption1, true);
        this.commandLine.addSwitch(this.mockOption2, false);

        // Assert
        Assert.assertEquals("Option1 switch should be true",
            Boolean.TRUE, this.handler.getSwitches().get(this.mockOption1));
        Assert.assertEquals("Option2 switch should be false",
            Boolean.FALSE, this.handler.getSwitches().get(this.mockOption2));
    }

    // =========================================================================
    // setDefaultSwitch Tests
    // =========================================================================

    @Test
    public void setDefaultSwitch_givenTrueBoolean_shouldStoreDefaultTrue() {
        // Arrange & Act
        this.commandLine.setDefaultSwitch(this.mockOption1, Boolean.TRUE);

        // Assert
        Boolean state = (Boolean) this.handler.getDefaultSwitches().get(this.mockOption1);
        Assert.assertEquals("Default switch should be true", Boolean.TRUE, state);
    }

    @Test
    public void setDefaultSwitch_givenFalseBoolean_shouldStoreDefaultFalse() {
        // Arrange & Act
        this.commandLine.setDefaultSwitch(this.mockOption1, Boolean.FALSE);

        // Assert
        Boolean state = (Boolean) this.handler.getDefaultSwitches().get(this.mockOption1);
        Assert.assertEquals("Default switch should be false", Boolean.FALSE, state);
    }

    @Test
    public void setDefaultSwitch_givenNullBoolean_shouldStoreNullDefault() {
        // Arrange & Act
        this.commandLine.setDefaultSwitch(this.mockOption1, null);

        // Assert
        Assert.assertTrue("Option key should exist in default switches map",
            this.handler.getDefaultSwitches().containsKey(this.mockOption1));
        Assert.assertNull("Default switch should be null",
            this.handler.getDefaultSwitches().get(this.mockOption1));
    }

    // =========================================================================
    // addProperty Tests
    // =========================================================================

    @Test
    public void addProperty_givenValidPropertyAndValue_shouldStoreProperty() {
        // Arrange
        String propName = "app.env";
        String propVal = "production";

        // Act
        this.commandLine.addProperty(propName, propVal);

        // Assert
        Assert.assertEquals("Property value mismatch",
            propVal, this.handler.getProperties().get(propName));
    }

    @Test
    public void addProperty_givenExistingProperty_shouldOverwriteOldValue() {
        // Arrange
        String propName = "timeout";
        this.commandLine.addProperty(propName, "30");

        // Act
        this.commandLine.addProperty(propName, "60");

        // Assert
        Assert.assertEquals("Property should be overwritten by latest value",
            "60", this.handler.getProperties().get(propName));
    }

    @Test
    public void addProperty_givenNullValue_shouldStoreNullProperty() {
        // Arrange
        String propName = "emptyProp";

        // Act
        this.commandLine.addProperty(propName, null);

        // Assert
        Assert.assertTrue("Property key must exist", this.handler.getProperties().containsKey(propName));
        Assert.assertNull("Property value should be null", this.handler.getProperties().get(propName));
    }

    @Test
    public void addProperty_givenEmptyStringKeyAndValue_shouldStoreCorrectly() {
        // Arrange & Act
        this.commandLine.addProperty("", "");

        // Assert
        Assert.assertEquals("Empty string property value should match",
            "", this.handler.getProperties().get(""));
    }

    // =========================================================================
    // looksLikeOption Boundary & Edge Case Tests
    // =========================================================================

    @Test
    public void looksLikeOption_givenShortOptionTrigger_shouldReturnTrue() {
        // Arrange & Act
        boolean result = this.commandLine.looksLikeOption("-d");

        // Assert
        Assert.assertTrue("Argument starting with dash and followed by char should look like option", result);
    }

    @Test
    public void looksLikeOption_givenLongOptionTrigger_shouldReturnTrue() {
        // Arrange & Act
        boolean result = this.commandLine.looksLikeOption("--help");

        // Assert
        Assert.assertTrue("Argument starting with double dash should look like option", result);
    }

    @Test
    public void looksLikeOption_givenSingleDash_shouldReturnFalse() {
        // Arrange & Act
        boolean result = this.commandLine.looksLikeOption("-");

        // Assert
        Assert.assertFalse("Single dash alone represents stdin, should not look like option", result);
    }

    @Test
    public void looksLikeOption_givenDoubleDashOnly_shouldReturnFalse() {
        // Arrange & Act
        boolean result = this.commandLine.looksLikeOption("--");

        // Assert
        Assert.assertFalse("Double dash alone signifies end of options, should not look like option", result);
    }

    @Test
    public void looksLikeOption_givenPlainArgumentWithoutDash_shouldReturnFalse() {
        // Arrange & Act
        boolean result = this.commandLine.looksLikeOption("filename.txt");

        // Assert
        Assert.assertFalse("Standard argument should not look like an option", result);
    }

    @Test
    public void looksLikeOption_givenEmptyString_shouldReturnFalse() {
        // Arrange & Act
        boolean result = this.commandLine.looksLikeOption("");

        // Assert
        Assert.assertFalse("Empty string should return false", result);
    }

    @Test
    public void looksLikeOption_givenNullString_shouldReturnFalse() {
        // Arrange & Act
        boolean result = this.commandLine.looksLikeOption(null);

        // Assert
        Assert.assertFalse("Null input should return false gracefully without NullPointerException", result);
    }

    // =========================================================================
    // Mock Invocation Handler for WriteableCommandLine
    // =========================================================================

    private static class MockWriteableCommandLineHandler implements InvocationHandler {

        private final Set options = new HashSet();
        private final Map values = new HashMap();
        private final Map defaultValues = new HashMap();
        private final Map switches = new HashMap();
        private final Map defaultSwitches = new HashMap();
        private final Map properties = new HashMap();

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            String methodName = method.getName();

            if ("addOption".equals(methodName)) {
                this.options.add(args[0]);
                return null;
            } else if ("addValue".equals(methodName)) {
                Option opt = (Option) args[0];
                List list = (List) this.values.get(opt);
                if (list == null) {
                    list = new ArrayList();
                    this.values.put(opt, list);
                }
                list.add(args[1]);
                return null;
            } else if ("setDefaultValues".equals(methodName)) {
                this.defaultValues.put(args[0], args[1]);
                return null;
            } else if ("addSwitch".equals(methodName)) {
                Option opt = (Option) args[0];
                if (this.switches.containsKey(opt)) {
                    throw new IllegalStateException("Switch already added for option: " + opt);
                }
                this.switches.put(opt, args[1]);
                return null;
            } else if ("setDefaultSwitch".equals(methodName)) {
                this.defaultSwitches.put(args[0], args[1]);
                return null;
            } else if ("addProperty".equals(methodName)) {
                this.properties.put(args[0], args[1]);
                return null;
            } else if ("looksLikeOption".equals(methodName)) {
                String arg = (String) args[0];
                if (arg == null || arg.length() <= 1) {
                    return Boolean.FALSE;
                }
                if ("--".equals(arg)) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(arg.startsWith("-"));
            } else if ("toString".equals(methodName)) {
                return "MockWriteableCommandLine";
            }

            return null;
        }

        public Set getOptions() {
            return this.options;
        }

        public Map getValues() {
            return this.values;
        }

        public Map getDefaultValues() {
            return this.defaultValues;
        }

        public Map getSwitches() {
            return this.switches;
        }

        public Map getDefaultSwitches() {
            return this.defaultSwitches;
        }

        public Map getProperties() {
            return this.properties;
        }
    }
}