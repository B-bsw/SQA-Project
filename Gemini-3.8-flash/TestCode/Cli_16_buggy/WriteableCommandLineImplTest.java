package org.apache.commons.cli2.commandline;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.option.PropertyOption;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriteableCommandLineImplTest {

    private Option rootOption;
    private List arguments;
    private WriteableCommandLineImpl commandLine;

    private static class OptionInvocationHandler implements InvocationHandler {
        private final String preferredName;
        private final Set triggers;
        private final Set prefixes;

        public OptionInvocationHandler(String preferredName, Set triggers, Set prefixes) {
            this.preferredName = preferredName;
            this.triggers = triggers != null ? triggers : Collections.EMPTY_SET;
            this.prefixes = prefixes != null ? prefixes : Collections.EMPTY_SET;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            String name = method.getName();
            if ("getPreferredName".equals(name)) {
                return preferredName;
            } else if ("getTriggers".equals(name)) {
                return triggers;
            } else if ("getPrefixes".equals(name)) {
                return prefixes;
            } else if ("equals".equals(name)) {
                return Boolean.valueOf(proxy == args[0]);
            } else if ("hashCode".equals(name)) {
                return Integer.valueOf(System.identityHashCode(proxy));
            } else if ("toString".equals(name)) {
                return "OptionProxy[" + preferredName + "]";
            }
            return null;
        }
    }

    private Option createOption(final String preferredName, final Set triggers, final Set prefixes) {
        return (Option) Proxy.newProxyInstance(
            Option.class.getClassLoader(),
            new Class[] { Option.class },
            new OptionInvocationHandler(preferredName, triggers, prefixes)
        );
    }

    private Argument createArgument(final String preferredName, final Set triggers, final Set prefixes) {
        return (Argument) Proxy.newProxyInstance(
            Argument.class.getClassLoader(),
            new Class[] { Argument.class },
            new OptionInvocationHandler(preferredName, triggers, prefixes)
        );
    }

    @Before
    public void setUp() {
        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");
        rootOption = createOption("root", Collections.EMPTY_SET, prefixes);
        arguments = new ArrayList();
        commandLine = new WriteableCommandLineImpl(rootOption, arguments);
    }

    @Test
    public void constructor_givenValidParameters_shouldInitializePrefixesAndArguments() {
        // Arrange
        Set prefixes = new HashSet();
        prefixes.add("-");
        List args = new ArrayList();
        args.add("testArg");
        Option root = createOption("root", Collections.EMPTY_SET, prefixes);

        // Act
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(root, args);

        // Assert
        Assert.assertEquals(1, cmd.getNormalised().size());
        Assert.assertEquals("testArg", cmd.getNormalised().get(0));
        Assert.assertTrue(cmd.looksLikeOption("-opt"));
        Assert.assertFalse(cmd.looksLikeOption("opt"));
    }

    @Test
    public void addOption_givenOptionWithTriggers_shouldRegisterNameAndAllTriggers() {
        // Arrange
        Set triggers = new HashSet();
        triggers.add("-f");
        triggers.add("--file");
        Option opt = createOption("-f", triggers, Collections.EMPTY_SET);

        // Act
        commandLine.addOption(opt);

        // Assert
        Assert.assertTrue(commandLine.hasOption(opt));
        Assert.assertSame(opt, commandLine.getOption("-f"));
        Assert.assertSame(opt, commandLine.getOption("--file"));
        Assert.assertEquals(1, commandLine.getOptions().size());
        Assert.assertTrue(commandLine.getOptionTriggers().contains("-f"));
        Assert.assertTrue(commandLine.getOptionTriggers().contains("--file"));
    }

    @Test
    public void addValue_givenStandardOption_shouldNotAutomaticallyAddOptionToOptionsList() {
        // Arrange
        Option opt = createOption("-v", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // Act
        commandLine.addValue(opt, "val1");

        // Assert
        Assert.assertFalse(commandLine.hasOption(opt));
        List values = commandLine.getUndefaultedValues(opt);
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("val1", values.get(0));
    }

    @Test
    public void addValue_givenArgumentInstance_shouldAutomaticallyAddOptionToOptionsList() {
        // Arrange
        Argument arg = createArgument("arg", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // Act
        commandLine.addValue(arg, "argVal");

        // Assert
        Assert.assertTrue(commandLine.hasOption(arg));
        List values = commandLine.getUndefaultedValues(arg);
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("argVal", values.get(0));
    }

    @Test
    public void addValue_givenMultipleValues_shouldMaintainInsertionOrder() {
        // Arrange
        Option opt = createOption("-list", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // Act
        commandLine.addValue(opt, "first");
        commandLine.addValue(opt, "second");

        // Assert
        List values = commandLine.getUndefaultedValues(opt);
        Assert.assertEquals(2, values.size());
        Assert.assertEquals("first", values.get(0));
        Assert.assertEquals("second", values.get(1));
    }

    @Test
    public void addSwitch_givenNewSwitchOption_shouldAddOptionAndRecordState() {
        // Arrange
        Option optTrue = createOption("-t", Collections.EMPTY_SET, Collections.EMPTY_SET);
        Option optFalse = createOption("-f", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // Act
        commandLine.addSwitch(optTrue, true);
        commandLine.addSwitch(optFalse, false);

        // Assert
        Assert.assertTrue(commandLine.hasOption(optTrue));
        Assert.assertTrue(commandLine.hasOption(optFalse));
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(optTrue, null));
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(optFalse, null));
    }

    @Test(expected = IllegalStateException.class)
    public void addSwitch_givenDuplicateSwitchOption_shouldThrowIllegalStateException() {
        // Arrange
        Option opt = createOption("-s", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addSwitch(opt, true);

        // Act
        commandLine.addSwitch(opt, false);
    }

    @Test
    public void hasOption_givenUnregisteredOption_shouldReturnFalse() {
        // Arrange
        Option opt = createOption("-x", Collections.EMPTY_SET, Collections.EMPTY_SET);

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
        Option opt = createOption("-opt", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // Act
        List result = commandLine.getValues(opt, null);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void getValues_givenNoValuesAndMethodDefaultValues_shouldReturnMethodDefaultValues() {
        // Arrange
        Option opt = createOption("-opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        List defaults = new ArrayList();
        defaults.add("def1");
        defaults.add("def2");

        // Act
        List result = commandLine.getValues(opt, defaults);

        // Assert
        Assert.assertEquals(defaults, result);
    }

    @Test
    public void getValues_givenNoValuesAndConfiguredDefaultValues_shouldReturnConfiguredDefaultValues() {
        // Arrange
        Option opt = createOption("-opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        List configuredDefaults = new ArrayList();
        configuredDefaults.add("confDef1");
        commandLine.setDefaultValues(opt, configuredDefaults);

        // Act
        List resultWithNull = commandLine.getValues(opt, null);
        List resultWithEmpty = commandLine.getValues(opt, new ArrayList());

        // Assert
        Assert.assertEquals(configuredDefaults, resultWithNull);
        Assert.assertEquals(configuredDefaults, resultWithEmpty);
    }

    @Test
    public void getValues_givenExistingValuesAndFewerDefaults_shouldReturnExistingValuesUnchanged() {
        // Arrange
        Option opt = createOption("-opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addValue(opt, "val1");
        commandLine.addValue(opt, "val2");

        List defaults = new ArrayList();
        defaults.add("def1");

        // Act
        List result = commandLine.getValues(opt, defaults);

        // Assert
        Assert.assertEquals(2, result.size());
        Assert.assertEquals("val1", result.get(0));
        Assert.assertEquals("val2", result.get(1));
    }

    @Test
    public void getValues_givenExistingValuesAndMoreDefaults_shouldAugmentListWithMissingDefaults() {
        // Arrange
        Option opt = createOption("-opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addValue(opt, "val1");

        List defaults = new ArrayList();
        defaults.add("def1");
        defaults.add("def2");
        defaults.add("def3");

        // Act
        List result = commandLine.getValues(opt, defaults);

        // Assert
        Assert.assertEquals(3, result.size());
        Assert.assertEquals("val1", result.get(0));
        Assert.assertEquals("def2", result.get(1));
        Assert.assertEquals("def3", result.get(2));
    }

    @Test
    public void getUndefaultedValues_givenNoValues_shouldReturnEmptyList() {
        // Arrange
        Option opt = createOption("-opt", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // Act
        List result = commandLine.getUndefaultedValues(opt);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void getSwitch_givenCommandLineSwitch_shouldReturnRecordedSwitch() {
        // Arrange
        Option opt = createOption("-s", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addSwitch(opt, true);
        commandLine.setDefaultSwitch(opt, Boolean.FALSE);

        // Act
        Boolean result = commandLine.getSwitch(opt, Boolean.FALSE);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void getSwitch_givenNoRecordedSwitchAndProvidedDefault_shouldReturnProvidedDefault() {
        // Arrange
        Option opt = createOption("-s", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultSwitch(opt, Boolean.FALSE);

        // Act
        Boolean result = commandLine.getSwitch(opt, Boolean.TRUE);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void getSwitch_givenNoRecordedSwitchAndNullMethodDefault_shouldReturnConfiguredDefaultSwitch() {
        // Arrange
        Option opt = createOption("-s", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);

        // Act
        Boolean result = commandLine.getSwitch(opt, null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void getSwitch_givenNoRecordedSwitchAndNoDefaults_shouldReturnNull() {
        // Arrange
        Option opt = createOption("-s", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // Act
        Boolean result = commandLine.getSwitch(opt, null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void setDefaultValues_givenNull_shouldRemoveExistingDefaults() {
        // Arrange
        Option opt = createOption("-opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
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
    public void setDefaultSwitch_givenNull_shouldRemoveExistingDefaultSwitch() {
        // Arrange
        Option opt = createOption("-s", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);

        // Act
        commandLine.setDefaultSwitch(opt, null);
        Boolean result = commandLine.getSwitch(opt, null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void propertyOperations_givenSpecificOption_shouldAddAndRetrieveCorrectly() {
        // Arrange
        Option opt = createOption("-D", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // Act
        commandLine.addProperty(opt, "env", "production");
        commandLine.addProperty(opt, "port", "8080");

        // Assert
        Assert.assertEquals("production", commandLine.getProperty(opt, "env", "default"));
        Assert.assertEquals("8080", commandLine.getProperty(opt, "port", "default"));
        Assert.assertEquals("default", commandLine.getProperty(opt, "nonExisting", "default"));
        Set propNames = commandLine.getProperties(opt);
        Assert.assertEquals(2, propNames.size());
        Assert.assertTrue(propNames.contains("env"));
        Assert.assertTrue(propNames.contains("port"));
    }

    @Test
    public void getProperty_givenUnregisteredOption_shouldReturnDefaultValue() {
        // Arrange
        Option opt = createOption("-D", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // Act
        String result = commandLine.getProperty(opt, "key", "defaultValue");

        // Assert
        Assert.assertEquals("defaultValue", result);
        Assert.assertTrue(commandLine.getProperties(opt).isEmpty());
    }

    @Test
    public void defaultPropertyOperations_givenPropertyOptionDelegation_shouldStoreAndRetrieveCorrectly() {
        // Act
        commandLine.addProperty("timeout", "30");

        // Assert
        Assert.assertEquals("30", commandLine.getProperty("timeout"));
        Set props = commandLine.getProperties();
        Assert.assertTrue(props.contains("timeout"));
    }

    @Test
    public void looksLikeOption_givenPrefixMatching_shouldReturnTrueOnlyWhenPrefixMatches() {
        // Prefix in setUp: "-" and "--"
        Assert.assertTrue(commandLine.looksLikeOption("-file"));
        Assert.assertTrue(commandLine.looksLikeOption("--help"));
        Assert.assertFalse(commandLine.looksLikeOption("plus+"));
        Assert.assertFalse(commandLine.looksLikeOption("help"));
    }

    @Test
    public void toString_givenEmptyArguments_shouldReturnEmptyString() {
        // Arrange
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(rootOption, new ArrayList());

        // Act
        String result = cmd.toString();

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void toString_givenSingleArgumentWithoutSpaces_shouldReturnArgumentAsIs() {
        // Arrange
        List args = new ArrayList();
        args.add("--verbose");
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(rootOption, args);

        // Act
        String result = cmd.toString();

        // Assert
        Assert.assertEquals("--verbose", result);
    }

    @Test
    public void toString_givenArgumentsWithAndWithoutSpaces_shouldQuoteArgumentsWithSpaces() {
        // Arrange
        List args = new ArrayList();
        args.add("app");
        args.add("--name");
        args.add("My Application Name");
        args.add("--all");
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(rootOption, args);

        // Act
        String result = cmd.toString();

        // Assert
        Assert.assertEquals("app --name \"My Application Name\" --all", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getOptions_whenMutated_shouldThrowUnsupportedOperationException() {
        // Arrange
        Option opt = createOption("-o", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addOption(opt);

        // Act
        commandLine.getOptions().add(createOption("-another", Collections.EMPTY_SET, Collections.EMPTY_SET));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getOptionTriggers_whenMutated_shouldThrowUnsupportedOperationException() {
        // Arrange
        Option opt = createOption("-o", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addOption(opt);

        // Act
        commandLine.getOptionTriggers().add("-fail");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getProperties_whenMutated_shouldThrowUnsupportedOperationException() {
        // Arrange
        Option opt = createOption("-D", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addProperty(opt, "key", "value");

        // Act
        commandLine.getProperties(opt).remove("key");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getNormalised_whenMutated_shouldThrowUnsupportedOperationException() {
        // Act
        commandLine.getNormalised().add("newArg");
    }
}