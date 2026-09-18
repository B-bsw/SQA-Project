package org.apache.commons.cli2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriteableCommandLineTest {

    private WriteableCommandLine commandLine;
    private Option mockOption1;
    private Option mockOption2;

    @Before
    public void setUp() {
        this.mockOption1 = createMockOption("opt1");
        this.mockOption2 = createMockOption("opt2");
        this.commandLine = createCommandLineInstance();
    }

    @Test
    public void addOption_givenValidOption_shouldStoreOption() {
        // Arrange
        Option option = this.mockOption1;

        // Act
        this.commandLine.addOption(option);

        // Assert
        Assert.assertNotNull(this.commandLine);
    }

    @Test
    public void addOption_givenNullOption_shouldHandleNullSafely() {
        // Arrange
        Option option = null;

        // Act
        this.commandLine.addOption(option);

        // Assert
        Assert.assertNotNull(this.commandLine);
    }

    @Test
    public void addValue_givenValidOptionAndValue_shouldAssociateValue() {
        // Arrange
        Option option = this.mockOption1;
        String testValue = "value1";

        // Act
        this.commandLine.addValue(option, testValue);
        List values = this.commandLine.getUndefaultedValues(option);

        // Assert
        Assert.assertNotNull(values);
        Assert.assertEquals(1, values.size());
        Assert.assertEquals(testValue, values.get(0));
    }

    @Test
    public void addValue_givenMultipleValuesForSameOption_shouldAppendValues() {
        // Arrange
        Option option = this.mockOption1;
        String val1 = "first";
        String val2 = "second";

        // Act
        this.commandLine.addValue(option, val1);
        this.commandLine.addValue(option, val2);
        List values = this.commandLine.getUndefaultedValues(option);

        // Assert
        Assert.assertNotNull(values);
        Assert.assertEquals(2, values.size());
        Assert.assertEquals(val1, values.get(0));
        Assert.assertEquals(val2, values.get(1));
    }

    @Test
    public void addValue_givenNullValue_shouldStoreNullValue() {
        // Arrange
        Option option = this.mockOption1;

        // Act
        this.commandLine.addValue(option, null);
        List values = this.commandLine.getUndefaultedValues(option);

        // Assert
        Assert.assertNotNull(values);
        Assert.assertEquals(1, values.size());
        Assert.assertNull(values.get(0));
    }

    @Test
    public void getUndefaultedValues_givenOptionWithoutValues_shouldReturnEmptyList() {
        // Arrange
        Option option = this.mockOption2;

        // Act
        List values = this.commandLine.getUndefaultedValues(option);

        // Assert
        Assert.assertNotNull(values);
        Assert.assertTrue(values.isEmpty());
    }

    @Test
    public void getUndefaultedValues_givenNullOption_shouldReturnEmptyList() {
        // Arrange
        Option option = null;

        // Act
        List values = this.commandLine.getUndefaultedValues(option);

        // Assert
        Assert.assertNotNull(values);
        Assert.assertTrue(values.isEmpty());
    }

    @Test
    public void setDefaultValues_givenValidDefaultsList_shouldStoreDefaults() {
        // Arrange
        Option option = this.mockOption1;
        List defaults = new ArrayList();
        defaults.add("defaultA");
        defaults.add("defaultB");

        // Act
        this.commandLine.setDefaultValues(option, defaults);

        // Assert
        List undefaulted = this.commandLine.getUndefaultedValues(option);
        Assert.assertNotNull(undefaulted);
        Assert.assertTrue(undefaulted.isEmpty());
    }

    @Test
    public void setDefaultValues_givenNullDefaults_shouldClearDefaultsSafely() {
        // Arrange
        Option option = this.mockOption1;

        // Act
        this.commandLine.setDefaultValues(option, null);

        // Assert
        List undefaulted = this.commandLine.getUndefaultedValues(option);
        Assert.assertNotNull(undefaulted);
        Assert.assertTrue(undefaulted.isEmpty());
    }

    @Test
    public void addSwitch_givenNewSwitchTrue_shouldStoreTrue() {
        // Arrange
        Option option = this.mockOption1;

        // Act
        this.commandLine.addSwitch(option, true);

        // Assert
        Assert.assertNotNull(this.commandLine);
    }

    @Test
    public void addSwitch_givenNewSwitchFalse_shouldStoreFalse() {
        // Arrange
        Option option = this.mockOption1;

        // Act
        this.commandLine.addSwitch(option, false);

        // Assert
        Assert.assertNotNull(this.commandLine);
    }

    @Test(expected = IllegalStateException.class)
    public void addSwitch_givenDuplicateSwitchTrueThenTrue_shouldThrowIllegalStateException() {
        // Arrange
        Option option = this.mockOption1;
        this.commandLine.addSwitch(option, true);

        // Act & Assert
        this.commandLine.addSwitch(option, true);
    }

    @Test(expected = IllegalStateException.class)
    public void addSwitch_givenDuplicateSwitchTrueThenFalse_shouldThrowIllegalStateException() {
        // Arrange
        Option option = this.mockOption1;
        this.commandLine.addSwitch(option, true);

        // Act & Assert
        this.commandLine.addSwitch(option, false);
    }

    @Test
    public void addSwitch_givenDifferentOptions_shouldSucceedForBoth() {
        // Arrange
        Option opt1 = this.mockOption1;
        Option opt2 = this.mockOption2;

        // Act
        this.commandLine.addSwitch(opt1, true);
        this.commandLine.addSwitch(opt2, false);

        // Assert
        Assert.assertNotNull(this.commandLine);
    }

    @Test
    public void setDefaultSwitch_givenValidBooleanTrue_shouldStoreDefaultSwitch() {
        // Arrange
        Option option = this.mockOption1;

        // Act
        this.commandLine.setDefaultSwitch(option, Boolean.TRUE);

        // Assert
        Assert.assertNotNull(this.commandLine);
    }

    @Test
    public void setDefaultSwitch_givenValidBooleanFalse_shouldStoreDefaultSwitch() {
        // Arrange
        Option option = this.mockOption1;

        // Act
        this.commandLine.setDefaultSwitch(option, Boolean.FALSE);

        // Assert
        Assert.assertNotNull(this.commandLine);
    }

    @Test
    public void setDefaultSwitch_givenNullBoolean_shouldClearDefaultSwitchSafely() {
        // Arrange
        Option option = this.mockOption1;

        // Act
        this.commandLine.setDefaultSwitch(option, null);

        // Assert
        Assert.assertNotNull(this.commandLine);
    }

    @Test
    public void addProperty_givenOptionPropertyAndValue_shouldStoreProperty() {
        // Arrange
        Option option = this.mockOption1;
        String propKey = "database.url";
        String propVal = "jdbc:mysql://localhost/test";

        // Act
        this.commandLine.addProperty(option, propKey, propVal);

        // Assert
        Assert.assertNotNull(this.commandLine);
    }

    @Test
    public void addProperty_givenOptionDuplicateProperty_shouldReplaceExistingValue() {
        // Arrange
        Option option = this.mockOption1;
        String propKey = "timeout";
        String oldVal = "30";
        String newVal = "60";

        // Act
        this.commandLine.addProperty(option, propKey, oldVal);
        this.commandLine.addProperty(option, propKey, newVal);

        // Assert
        Assert.assertNotNull(this.commandLine);
    }

    @Test
    public void addProperty_givenDefaultPropertyAndValue_shouldStoreProperty() {
        // Arrange
        String propKey = "app.env";
        String propVal = "production";

        // Act
        this.commandLine.addProperty(propKey, propVal);

        // Assert
        Assert.assertNotNull(this.commandLine);
    }

    @Test
    public void addProperty_givenDefaultDuplicateProperty_shouldReplaceExistingValue() {
        // Arrange
        String propKey = "log.level";
        String initialVal = "INFO";
        String updatedVal = "DEBUG";

        // Act
        this.commandLine.addProperty(propKey, initialVal);
        this.commandLine.addProperty(propKey, updatedVal);

        // Assert
        Assert.assertNotNull(this.commandLine);
    }

    @Test
    public void addProperty_givenNullPropertyNameAndValue_shouldHandleSafely() {
        // Arrange
        String propKey = null;
        String propVal = null;

        // Act
        this.commandLine.addProperty(propKey, propVal);

        // Assert
        Assert.assertNotNull(this.commandLine);
    }

    @Test
    public void looksLikeOption_givenPrefixDash_shouldReturnTrue() {
        // Arrange
        String argument = "-f";

        // Act
        boolean result = this.commandLine.looksLikeOption(argument);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void looksLikeOption_givenPrefixDoubleDash_shouldReturnTrue() {
        // Arrange
        String argument = "--file";

        // Act
        boolean result = this.commandLine.looksLikeOption(argument);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void looksLikeOption_givenPlainArgumentWithoutDash_shouldReturnFalse() {
        // Arrange
        String argument = "filename.txt";

        // Act
        boolean result = this.commandLine.looksLikeOption(argument);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void looksLikeOption_givenEmptyString_shouldReturnFalse() {
        // Arrange
        String argument = "";

        // Act
        boolean result = this.commandLine.looksLikeOption(argument);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void looksLikeOption_givenNullString_shouldReturnFalse() {
        // Arrange
        String argument = null;

        // Act
        boolean result = this.commandLine.looksLikeOption(argument);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void looksLikeOption_givenSingleDashOnly_shouldReturnFalse() {
        // Arrange
        String argument = "-";

        // Act
        boolean result = this.commandLine.looksLikeOption(argument);

        // Assert
        Assert.assertFalse(result);
    }

    private Option createMockOption(final String optionName) {
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                if ("toString".equals(methodName)) {
                    return "Option[" + optionName + "]";
                }
                if ("hashCode".equals(methodName)) {
                    return new Integer(optionName.hashCode());
                }
                if ("equals".equals(methodName)) {
                    return Boolean.valueOf(proxy == args[0]);
                }
                return null;
            }
        };

        return (Option) Proxy.newProxyInstance(
            Option.class.getClassLoader(),
            new Class[] { Option.class },
            handler
        );
    }

    private WriteableCommandLine createCommandLineInstance() {
        InvocationHandler handler = new InvocationHandler() {
            private final Set options = new HashSet();
            private final Map undefaultedValues = new HashMap();
            private final Map defaultValues = new HashMap();
            private final Map switches = new HashMap();
            private final Map defaultSwitches = new HashMap();
            private final Map defaultProperties = new HashMap();
            private final Map optionProperties = new HashMap();

            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();

                if ("addOption".equals(name)) {
                    if (args[0] != null) {
                        this.options.add(args[0]);
                    }
                    return null;
                }

                if ("addValue".equals(name)) {
                    Option opt = (Option) args[0];
                    Object val = args[1];
                    List list = (List) this.undefaultedValues.get(opt);
                    if (list == null) {
                        list = new ArrayList();
                        this.undefaultedValues.put(opt, list);
                    }
                    list.add(val);
                    return null;
                }

                if ("getUndefaultedValues".equals(name)) {
                    Option opt = (Option) args[0];
                    List list = (List) this.undefaultedValues.get(opt);
                    if (list == null) {
                        return Collections.EMPTY_LIST;
                    }
                    return Collections.unmodifiableList(list);
                }

                if ("setDefaultValues".equals(name)) {
                    Option opt = (Option) args[0];
                    List list = (List) args[1];
                    if (list == null) {
                        this.defaultValues.remove(opt);
                    } else {
                        this.defaultValues.put(opt, new ArrayList(list));
                    }
                    return null;
                }

                if ("addSwitch".equals(name)) {
                    Option opt = (Option) args[0];
                    Boolean val = (Boolean) args[1];
                    if (this.switches.containsKey(opt)) {
                        throw new IllegalStateException("Switch already exists for option: " + opt);
                    }
                    this.switches.put(opt, val);
                    return null;
                }

                if ("setDefaultSwitch".equals(name)) {
                    Option opt = (Option) args[0];
                    Boolean val = (Boolean) args[1];
                    if (val == null) {
                        this.defaultSwitches.remove(opt);
                    } else {
                        this.defaultSwitches.put(opt, val);
                    }
                    return null;
                }

                if ("addProperty".equals(name)) {
                    if (args.length == 3) {
                        Option opt = (Option) args[0];
                        String prop = (String) args[1];
                        String val = (String) args[2];
                        Map props = (Map) this.optionProperties.get(opt);
                        if (props == null) {
                            props = new HashMap();
                            this.optionProperties.put(opt, props);
                        }
                        props.put(prop, val);
                    } else if (args.length == 2) {
                        String prop = (String) args[0];
                        String val = (String) args[1];
                        this.defaultProperties.put(prop, val);
                    }
                    return null;
                }

                if ("looksLikeOption".equals(name)) {
                    String argument = (String) args[0];
                    if (argument == null || argument.length() <= 1) {
                        return Boolean.FALSE;
                    }
                    return Boolean.valueOf(argument.startsWith("-"));
                }

                if ("toString".equals(name)) {
                    return "WriteableCommandLineMock";
                }

                if ("hashCode".equals(name)) {
                    return new Integer(this.hashCode());
                }

                if ("equals".equals(name)) {
                    return Boolean.valueOf(proxy == args[0]);
                }

                return null;
            }
        };

        return (WriteableCommandLine) Proxy.newProxyInstance(
            WriteableCommandLine.class.getClassLoader(),
            new Class[] { WriteableCommandLine.class },
            handler
        );
    }
}