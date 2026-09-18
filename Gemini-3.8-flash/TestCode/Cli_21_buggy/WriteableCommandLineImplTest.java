package org.apache.commons.cli2.commandline;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.option.PropertyOption;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriteableCommandLineImplTest {

    private Set defaultPrefixes;
    private List defaultArgs;
    private Option rootOption;
    private WriteableCommandLineImpl commandLine;

    @Before
    public void setUp() {
        defaultPrefixes = new HashSet();
        defaultPrefixes.add("-");
        defaultPrefixes.add("--");
        defaultArgs = new ArrayList();
        rootOption = createMockOption("root", Collections.EMPTY_SET, defaultPrefixes, null);
        commandLine = new WriteableCommandLineImpl(rootOption, defaultArgs);
    }

    private Option createMockOption(final String preferredName,
                                    final Set triggers,
                                    final Set prefixes,
                                    final Option parent) {
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                if ("getPreferredName".equals(name)) {
                    return preferredName;
                } else if ("getTriggers".equals(name)) {
                    return triggers == null ? Collections.EMPTY_SET : triggers;
                } else if ("getPrefixes".equals(name)) {
                    return prefixes == null ? Collections.EMPTY_SET : prefixes;
                } else if ("getParent".equals(name)) {
                    return parent;
                } else if ("equals".equals(name)) {
                    return Boolean.valueOf(proxy == args[0]);
                } else if ("hashCode".equals(name)) {
                    return Integer.valueOf(System.identityHashCode(proxy));
                } else if ("toString".equals(name)) {
                    return "MockOption[" + preferredName + "]";
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

    private Argument createMockArgument(final String preferredName,
                                        final Set triggers,
                                        final Set prefixes,
                                        final Option parent) {
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                if ("getPreferredName".equals(name)) {
                    return preferredName;
                } else if ("getTriggers".equals(name)) {
                    return triggers == null ? Collections.EMPTY_SET : triggers;
                } else if ("getPrefixes".equals(name)) {
                    return prefixes == null ? Collections.EMPTY_SET : prefixes;
                } else if ("getParent".equals(name)) {
                    return parent;
                } else if ("equals".equals(name)) {
                    return Boolean.valueOf(proxy == args[0]);
                } else if ("hashCode".equals(name)) {
                    return Integer.valueOf(System.identityHashCode(proxy));
                } else if ("toString".equals(name)) {
                    return "MockArgument[" + preferredName + "]";
                }
                return null;
            }
        };
        return (Argument) Proxy.newProxyInstance(
            Argument.class.getClassLoader(),
            new Class[] { Argument.class },
            handler
        );
    }

    @Test
    public void addOption_givenOptionWithTriggersAndParents_shouldAddOptionAndParentsAndRegisterTriggers() {
        // Arrange
        Option grandParent = createMockOption("grandParent", Collections.EMPTY_SET, null, null);
        Option parent = createMockOption("parent", Collections.EMPTY_SET, null, grandParent);
        Set triggers = new HashSet();
        triggers.add("-c");
        triggers.add("--child");
        Option child = createMockOption("child", triggers, null, parent);

        // Act
        commandLine.addOption(child);

        // Assert
        Assert.assertTrue(commandLine.hasOption(child));
        Assert.assertTrue(commandLine.hasOption(parent));
        Assert.assertTrue(commandLine.hasOption(grandParent));
        Assert.assertSame(child, commandLine.getOption("child"));
        Assert.assertSame(child, commandLine.getOption("-c"));
        Assert.assertSame(child, commandLine.getOption("--child"));
    }

    @Test
    public void addOption_givenParentAlreadyInOptions_shouldNotDuplicateParent() {
        // Arrange
        Option parent = createMockOption("parent", Collections.EMPTY_SET, null, null);
        Option child1 = createMockOption("child1", Collections.EMPTY_SET, null, parent);
        Option child2 = createMockOption("child2", Collections.EMPTY_SET, null, parent);

        // Act
        commandLine.addOption(child1);
        commandLine.addOption(child2);

        // Assert
        int parentCount = 0;
        List options = commandLine.getOptions();
        for (Iterator it = options.iterator(); it.hasNext();) {
            if (parent.equals(it.next())) {
                parentCount++;
            }
        }
        Assert.assertEquals(1, parentCount);
    }

    @Test
    public void addValue_givenArgumentOption_shouldAddOptionAndValue() {
        // Arrange
        Argument argument = createMockArgument("arg", Collections.EMPTY_SET, null, null);

        // Act
        commandLine.addValue(argument, "val1");

        // Assert
        Assert.assertTrue(commandLine.hasOption(argument));
        List values = commandLine.getUndefaultedValues(argument);
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("val1", values.get(0));
    }

    @Test
    public void addValue_givenNonArgumentOption_shouldAddValueWithoutAddingOption() {
        // Arrange
        Option nonArg = createMockOption("opt", Collections.EMPTY_SET, null, null);

        // Act
        commandLine.addValue(nonArg, "val1");

        // Assert
        Assert.assertFalse(commandLine.hasOption(nonArg));
        List values = commandLine.getUndefaultedValues(nonArg);
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("val1", values.get(0));
    }

    @Test
    public void addValue_givenMultipleValues_shouldAppendValuesInOrder() {
        // Arrange
        Option option = createMockOption("opt", Collections.EMPTY_SET, null, null);

        // Act
        commandLine.addValue(option, "first");
        commandLine.addValue(option, "second");

        // Assert
        List values = commandLine.getUndefaultedValues(option);
        Assert.assertEquals(2, values.size());
        Assert.assertEquals("first", values.get(0));
        Assert.assertEquals("second", values.get(1));
    }

    @Test
    public void addSwitch_givenNewSwitchTrue_shouldStoreTrueAndAddOption() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);

        // Act
        commandLine.addSwitch(opt, true);

        // Assert
        Assert.assertTrue(commandLine.hasOption(opt));
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));
    }

    @Test
    public void addSwitch_givenNewSwitchFalse_shouldStoreFalseAndAddOption() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);

        // Act
        commandLine.addSwitch(opt, false);

        // Assert
        Assert.assertTrue(commandLine.hasOption(opt));
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, null));
    }

    @Test(expected = IllegalStateException.class)
    public void addSwitch_givenExistingSwitch_shouldThrowIllegalStateException() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        commandLine.addSwitch(opt, true);

        // Act
        commandLine.addSwitch(opt, false);
    }

    @Test
    public void hasOption_givenOptionNotAdded_shouldReturnFalse() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);

        // Act & Assert
        Assert.assertFalse(commandLine.hasOption(opt));
    }

    @Test
    public void getOption_givenUnknownTrigger_shouldReturnNull() {
        // Act & Assert
        Assert.assertNull(commandLine.getOption("unknown"));
    }

    @Test
    public void getValues_givenNoValuesAndNoDefaults_shouldReturnEmptyList() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);

        // Act
        List values = commandLine.getValues(opt, null);

        // Assert
        Assert.assertNotNull(values);
        Assert.assertTrue(values.isEmpty());
        Assert.assertSame(Collections.EMPTY_LIST, values);
    }

    @Test
    public void getValues_givenCommandLineValuesAndNullDefaults_shouldReturnCommandLineValues() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        commandLine.addValue(opt, "v1");

        // Act
        List values = commandLine.getValues(opt, null);

        // Assert
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("v1", values.get(0));
    }

    @Test
    public void getValues_givenNoCommandLineValuesAndParamDefaults_shouldReturnParamDefaults() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        List defaults = new ArrayList();
        defaults.add("d1");
        defaults.add("d2");

        // Act
        List values = commandLine.getValues(opt, defaults);

        // Assert
        Assert.assertEquals(2, values.size());
        Assert.assertEquals("d1", values.get(0));
        Assert.assertEquals("d2", values.get(1));
    }

    @Test
    public void getValues_givenNoCommandLineValuesAndConfiguredDefaults_shouldReturnConfiguredDefaults() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        List configuredDefaults = new ArrayList();
        configuredDefaults.add("cfg1");
        commandLine.setDefaultValues(opt, configuredDefaults);

        // Act
        List values = commandLine.getValues(opt, null);

        // Assert
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("cfg1", values.get(0));
    }

    @Test
    public void getValues_givenParamDefaultsLargerThanCommandLineValues_shouldAugmentValues() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        commandLine.addValue(opt, "v1");

        List defaults = new ArrayList();
        defaults.add("d1");
        defaults.add("d2");
        defaults.add("d3");

        // Act
        List values = commandLine.getValues(opt, defaults);

        // Assert
        Assert.assertEquals(3, values.size());
        Assert.assertEquals("v1", values.get(0));
        Assert.assertEquals("d2", values.get(1));
        Assert.assertEquals("d3", values.get(2));
    }

    @Test
    public void getValues_givenParamDefaultsSmallerThanCommandLineValues_shouldReturnCommandLineValues() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        commandLine.addValue(opt, "v1");
        commandLine.addValue(opt, "v2");

        List defaults = new ArrayList();
        defaults.add("d1");

        // Act
        List values = commandLine.getValues(opt, defaults);

        // Assert
        Assert.assertEquals(2, values.size());
        Assert.assertEquals("v1", values.get(0));
        Assert.assertEquals("v2", values.get(1));
    }

    @Test
    public void getUndefaultedValues_givenNoValues_shouldReturnEmptyList() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);

        // Act
        List values = commandLine.getUndefaultedValues(opt);

        // Assert
        Assert.assertNotNull(values);
        Assert.assertSame(Collections.EMPTY_LIST, values);
    }

    @Test
    public void getUndefaultedValues_givenValuesPresent_shouldReturnValuesWithoutDefaults() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        commandLine.addValue(opt, "actual");
        List defaults = new ArrayList();
        defaults.add("default");
        commandLine.setDefaultValues(opt, defaults);

        // Act
        List values = commandLine.getUndefaultedValues(opt);

        // Assert
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("actual", values.get(0));
    }

    @Test
    public void getSwitch_givenSwitchPresent_shouldReturnSwitchValueIgnoringDefaults() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        commandLine.addSwitch(opt, true);
        commandLine.setDefaultSwitch(opt, Boolean.FALSE);

        // Act
        Boolean result = commandLine.getSwitch(opt, Boolean.FALSE);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void getSwitch_givenSwitchAbsentAndParamDefaultProvided_shouldReturnParamDefault() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        commandLine.setDefaultSwitch(opt, Boolean.FALSE);

        // Act
        Boolean result = commandLine.getSwitch(opt, Boolean.TRUE);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void getSwitch_givenSwitchAbsentAndConfiguredDefaultProvided_shouldReturnConfiguredDefault() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);

        // Act
        Boolean result = commandLine.getSwitch(opt, null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void getSwitch_givenSwitchAbsentAndNoDefaults_shouldReturnNull() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);

        // Act
        Boolean result = commandLine.getSwitch(opt, null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void addProperty_givenOptionAndProperties_shouldSetAndRetrieveProperty() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);

        // Act
        commandLine.addProperty(opt, "db.user", "admin");
        commandLine.addProperty(opt, "db.pass", "secret");

        // Assert
        Assert.assertEquals("admin", commandLine.getProperty(opt, "db.user", null));
        Assert.assertEquals("secret", commandLine.getProperty(opt, "db.pass", null));
        Set properties = commandLine.getProperties(opt);
        Assert.assertEquals(2, properties.size());
        Assert.assertTrue(properties.contains("db.user"));
        Assert.assertTrue(properties.contains("db.pass"));
    }

    @Test
    public void getProperty_givenNonExistentProperty_shouldReturnDefaultValue() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        commandLine.addProperty(opt, "existing", "val");

        // Act
        String result = commandLine.getProperty(opt, "missing", "fallback");

        // Assert
        Assert.assertEquals("fallback", result);
    }

    @Test
    public void getProperty_givenNoPropertiesAddedForOption_shouldReturnDefaultValue() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);

        // Act
        String result = commandLine.getProperty(opt, "anything", "defaultVal");

        // Assert
        Assert.assertEquals("defaultVal", result);
    }

    @Test
    public void getProperties_givenNoPropertiesForOption_shouldReturnEmptySet() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);

        // Act
        Set props = commandLine.getProperties(opt);

        // Assert
        Assert.assertNotNull(props);
        Assert.assertSame(Collections.EMPTY_SET, props);
    }

    @Test
    public void addProperty_givenConvenienceMethods_shouldStoreAndRetrieveUsingPropertyOption() {
        // Act
        commandLine.addProperty("key1", "value1");

        // Assert
        Assert.assertEquals("value1", commandLine.getProperty("key1"));
        Set keys = commandLine.getProperties();
        Assert.assertTrue(keys.contains("key1"));
    }

    @Test
    public void looksLikeOption_givenTriggerMatchingPrefix_shouldReturnTrue() {
        // Arrange & Act & Assert
        Assert.assertTrue(commandLine.looksLikeOption("-f"));
        Assert.assertTrue(commandLine.looksLikeOption("--file"));
    }

    @Test
    public void looksLikeOption_givenTriggerNotMatchingPrefix_shouldReturnFalse() {
        // Arrange & Act & Assert
        Assert.assertFalse(commandLine.looksLikeOption("regularArg"));
        Assert.assertFalse(commandLine.looksLikeOption(""));
    }

    @Test
    public void looksLikeOption_givenEmptyPrefixes_shouldReturnFalse() {
        // Arrange
        Option emptyPrefixRoot = createMockOption("root", Collections.EMPTY_SET, Collections.EMPTY_SET, null);
        WriteableCommandLineImpl cli = new WriteableCommandLineImpl(emptyPrefixRoot, Collections.EMPTY_LIST);

        // Act & Assert
        Assert.assertFalse(cli.looksLikeOption("-f"));
    }

    @Test
    public void toString_givenEmptyArguments_shouldReturnEmptyString() {
        // Arrange
        WriteableCommandLineImpl cli = new WriteableCommandLineImpl(rootOption, Collections.EMPTY_LIST);

        // Act
        String output = cli.toString();

        // Assert
        Assert.assertEquals("", output);
    }

    @Test
    public void toString_givenArgumentsWithAndWithoutSpaces_shouldQuoteSpaceArgumentsCorrectly() {
        // Arrange
        List args = new ArrayList();
        args.add("-a");
        args.add("hello world");
        args.add("--verbose");
        args.add("single");
        WriteableCommandLineImpl cli = new WriteableCommandLineImpl(rootOption, args);

        // Act
        String output = cli.toString();

        // Assert
        Assert.assertEquals("-a \"hello world\" --verbose single", output);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getOptions_givenReturnedList_shouldBeUnmodifiable() {
        // Act
        commandLine.getOptions().add(createMockOption("opt", Collections.EMPTY_SET, null, null));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getOptionTriggers_givenReturnedSet_shouldBeUnmodifiable() {
        // Act
        commandLine.getOptionTriggers().add("trigger");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getNormalised_givenReturnedList_shouldBeUnmodifiable() {
        // Act
        commandLine.getNormalised().add("newArg");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getProperties_givenReturnedSet_shouldBeUnmodifiable() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        commandLine.addProperty(opt, "k", "v");

        // Act
        commandLine.getProperties(opt).add("newKey");
    }

    @Test
    public void setDefaultValues_givenNullDefaults_shouldRemoveConfiguredDefaults() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        List defaults = new ArrayList();
        defaults.add("def");
        commandLine.setDefaultValues(opt, defaults);

        // Act
        commandLine.setDefaultValues(opt, null);
        List result = commandLine.getValues(opt, null);

        // Assert
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void setDefaultSwitch_givenNullDefaultSwitch_shouldRemoveConfiguredDefaultSwitch() {
        // Arrange
        Option opt = createMockOption("opt", Collections.EMPTY_SET, null, null);
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);

        // Act
        commandLine.setDefaultSwitch(opt, null);
        Boolean result = commandLine.getSwitch(opt, null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void getNormalised_givenInitialArguments_shouldReturnUnderlyingArguments() {
        // Arrange
        List args = new ArrayList();
        args.add("arg1");
        args.add("arg2");
        WriteableCommandLineImpl cli = new WriteableCommandLineImpl(rootOption, args);

        // Act
        List retrieved = cli.getNormalised();

        // Assert
        Assert.assertEquals(2, retrieved.size());
        Assert.assertEquals("arg1", retrieved.get(0));
        Assert.assertEquals("arg2", retrieved.get(1));
    }
}