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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriteableCommandLineImplTest {

    private Set rootPrefixes;
    private List rootArgs;
    private Option rootOption;
    private WriteableCommandLineImpl commandLine;

    private static class OptionInvocationHandler implements InvocationHandler {
        private final String preferredName;
        private final Set triggers;
        private final Set prefixes;

        public OptionInvocationHandler(final String preferredName,
                                       final Set triggers,
                                       final Set prefixes) {
            this.preferredName = preferredName;
            this.triggers = triggers != null ? triggers : Collections.EMPTY_SET;
            this.prefixes = prefixes != null ? prefixes : Collections.EMPTY_SET;
        }

        public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
            final String methodName = method.getName();
            if ("getPreferredName".equals(methodName)) {
                return preferredName;
            } else if ("getTriggers".equals(methodName)) {
                return triggers;
            } else if ("getPrefixes".equals(methodName)) {
                return prefixes;
            } else if ("toString".equals(methodName)) {
                return preferredName != null ? preferredName : "MockOption";
            } else if ("equals".equals(methodName)) {
                return Boolean.valueOf(proxy == args[0]);
            } else if ("hashCode".equals(methodName)) {
                return Integer.valueOf(System.identityHashCode(proxy));
            }
            return null;
        }
    }

    private Option createMockOption(final String preferredName,
                                    final Set triggers,
                                    final Set prefixes) {
        return (Option) Proxy.newProxyInstance(
                Option.class.getClassLoader(),
                new Class[] { Option.class },
                new OptionInvocationHandler(preferredName, triggers, prefixes)
        );
    }

    private Argument createMockArgument(final String preferredName,
                                        final Set triggers,
                                        final Set prefixes) {
        return (Argument) Proxy.newProxyInstance(
                Argument.class.getClassLoader(),
                new Class[] { Argument.class },
                new OptionInvocationHandler(preferredName, triggers, prefixes)
        );
    }

    @Before
    public void setUp() {
        rootPrefixes = new HashSet();
        rootPrefixes.add("-");
        rootPrefixes.add("--");

        rootArgs = new ArrayList();
        rootOption = createMockOption("root", Collections.EMPTY_SET, rootPrefixes);
        commandLine = new WriteableCommandLineImpl(rootOption, rootArgs);
    }

    @Test
    public void constructor_givenRootOptionAndArguments_shouldInitializeProperly() {
        final List args = new ArrayList();
        args.add("arg1");
        final WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, args);

        Assert.assertNotNull(cl.getNormalised());
        Assert.assertEquals(1, cl.getNormalised().size());
        Assert.assertEquals("arg1", cl.getNormalised().get(0));
        Assert.assertTrue(cl.looksLikeOption("-opt"));
        Assert.assertFalse(cl.looksLikeOption("opt"));
    }

    @Test
    public void addOption_givenOptionWithTriggers_shouldIndexByPreferredNameAndTriggers() {
        final Set triggers = new HashSet();
        triggers.add("-t");
        triggers.add("--test");
        final Option opt = createMockOption("--test", triggers, null);

        commandLine.addOption(opt);

        Assert.assertTrue(commandLine.hasOption(opt));
        Assert.assertSame(opt, commandLine.getOption("--test"));
        Assert.assertSame(opt, commandLine.getOption("-t"));

        final List options = commandLine.getOptions();
        Assert.assertEquals(1, options.size());
        Assert.assertSame(opt, options.get(0));

        final Set retrievedTriggers = commandLine.getOptionTriggers();
        Assert.assertTrue(retrievedTriggers.contains("--test"));
        Assert.assertTrue(retrievedTriggers.contains("-t"));
    }

    @Test
    public void addOption_givenNonTriggerOption_shouldIndexByPreferredNameOnly() {
        final Option opt = createMockOption("optOnly", Collections.EMPTY_SET, null);

        commandLine.addOption(opt);

        Assert.assertTrue(commandLine.hasOption(opt));
        Assert.assertSame(opt, commandLine.getOption("optOnly"));
        Assert.assertNull(commandLine.getOption("other"));
    }

    @Test
    public void hasOption_givenUnaddedOption_shouldReturnFalse() {
        final Option opt = createMockOption("--unadded", Collections.EMPTY_SET, null);
        Assert.assertFalse(commandLine.hasOption(opt));
    }

    @Test
    public void addValue_givenNormalOption_shouldAppendValueWithoutAddingOption() {
        final Option opt = createMockOption("-v", Collections.EMPTY_SET, null);

        commandLine.addValue(opt, "val1");
        commandLine.addValue(opt, "val2");

        Assert.assertFalse(commandLine.hasOption(opt));

        final List values = commandLine.getValues(opt, null);
        Assert.assertNotNull(values);
        Assert.assertEquals(2, values.size());
        Assert.assertEquals("val1", values.get(0));
        Assert.assertEquals("val2", values.get(1));
    }

    @Test
    public void addValue_givenArgumentOption_shouldAddOptionAndAppendValue() {
        final Argument arg = createMockArgument("arg", Collections.EMPTY_SET, null);

        commandLine.addValue(arg, "data");

        Assert.assertTrue(commandLine.hasOption(arg));

        final List values = commandLine.getValues(arg, null);
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("data", values.get(0));
    }

    @Test
    public void getValues_givenExplicitValuesPresent_shouldReturnExplicitValues() {
        final Option opt = createMockOption("-o", Collections.EMPTY_SET, null);
        commandLine.addValue(opt, "v1");

        final List methodDefaults = new ArrayList();
        methodDefaults.add("default1");

        final List optionDefaults = new ArrayList();
        optionDefaults.add("default2");
        commandLine.setDefaultValues(opt, optionDefaults);

        final List actual = commandLine.getValues(opt, methodDefaults);
        Assert.assertEquals(1, actual.size());
        Assert.assertEquals("v1", actual.get(0));
    }

    @Test
    public void getValues_givenNoValuesButMethodDefaultsPresent_shouldReturnMethodDefaults() {
        final Option opt = createMockOption("-o", Collections.EMPTY_SET, null);

        final List methodDefaults = new ArrayList();
        methodDefaults.add("default1");

        final List optionDefaults = new ArrayList();
        optionDefaults.add("default2");
        commandLine.setDefaultValues(opt, optionDefaults);

        final List actual = commandLine.getValues(opt, methodDefaults);
        Assert.assertSame(methodDefaults, actual);
    }

    @Test
    public void getValues_givenEmptyMethodDefaultsAndOptionDefaultsPresent_shouldFallbackToOptionDefaults() {
        final Option opt = createMockOption("-o", Collections.EMPTY_SET, null);

        final List emptyMethodDefaults = new ArrayList();

        final List optionDefaults = new ArrayList();
        optionDefaults.add("optDefault");
        commandLine.setDefaultValues(opt, optionDefaults);

        final List actual = commandLine.getValues(opt, emptyMethodDefaults);
        Assert.assertSame(optionDefaults, actual);
    }

    @Test
    public void getValues_givenNoValuesNoMethodDefaultsAndOptionDefaultsPresent_shouldReturnOptionDefaults() {
        final Option opt = createMockOption("-o", Collections.EMPTY_SET, null);

        final List optionDefaults = new ArrayList();
        optionDefaults.add("optDefault");
        commandLine.setDefaultValues(opt, optionDefaults);

        final List actual = commandLine.getValues(opt, null);
        Assert.assertSame(optionDefaults, actual);
    }

    @Test
    public void getValues_givenAllNullOrEmpty_shouldReturnEmptyList() {
        final Option opt = createMockOption("-o", Collections.EMPTY_SET, null);

        final List actual = commandLine.getValues(opt, null);
        Assert.assertSame(Collections.EMPTY_LIST, actual);
    }

    @Test
    public void getValues_givenEmptyOptionDefaults_shouldReturnEmptyList() {
        final Option opt = createMockOption("-o", Collections.EMPTY_SET, null);
        commandLine.setDefaultValues(opt, new ArrayList());

        final List actual = commandLine.getValues(opt, Collections.EMPTY_LIST);
        Assert.assertSame(Collections.EMPTY_LIST, actual);
    }

    @Test
    public void setDefaultValues_givenNullDefaults_shouldRemoveFromDefaults() {
        final Option opt = createMockOption("-o", Collections.EMPTY_SET, null);
        final List defaults = new ArrayList();
        defaults.add("def");
        commandLine.setDefaultValues(opt, defaults);

        commandLine.setDefaultValues(opt, null);

        final List result = commandLine.getValues(opt, null);
        Assert.assertSame(Collections.EMPTY_LIST, result);
    }

    @Test
    public void addSwitch_givenNewSwitchTrue_shouldAddOptionAndRecordTrue() {
        final Option opt = createMockOption("-s", Collections.EMPTY_SET, null);

        commandLine.addSwitch(opt, true);

        Assert.assertTrue(commandLine.hasOption(opt));
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));
    }

    @Test
    public void addSwitch_givenNewSwitchFalse_shouldAddOptionAndRecordFalse() {
        final Option opt = createMockOption("-s", Collections.EMPTY_SET, null);

        commandLine.addSwitch(opt, false);

        Assert.assertTrue(commandLine.hasOption(opt));
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, null));
    }

    @Test(expected = IllegalStateException.class)
    public void addSwitch_givenAlreadySetSwitch_shouldThrowIllegalStateException() {
        final Option opt = createMockOption("-s", Collections.EMPTY_SET, null);

        commandLine.addSwitch(opt, true);
        commandLine.addSwitch(opt, false);
    }

    @Test
    public void getSwitch_givenCommandLineSwitchSet_shouldReturnCommandLineSwitch() {
        final Option opt = createMockOption("-s", Collections.EMPTY_SET, null);
        commandLine.addSwitch(opt, true);
        commandLine.setDefaultSwitch(opt, Boolean.FALSE);

        final Boolean actual = commandLine.getSwitch(opt, Boolean.FALSE);
        Assert.assertEquals(Boolean.TRUE, actual);
    }

    @Test
    public void getSwitch_givenNoSwitchSetButMethodDefaultGiven_shouldReturnMethodDefault() {
        final Option opt = createMockOption("-s", Collections.EMPTY_SET, null);
        commandLine.setDefaultSwitch(opt, Boolean.FALSE);

        final Boolean actual = commandLine.getSwitch(opt, Boolean.TRUE);
        Assert.assertEquals(Boolean.TRUE, actual);
    }

    @Test
    public void getSwitch_givenNoSwitchSetNoMethodDefault_shouldReturnDefaultSwitch() {
        final Option opt = createMockOption("-s", Collections.EMPTY_SET, null);
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);

        final Boolean actual = commandLine.getSwitch(opt, null);
        Assert.assertEquals(Boolean.TRUE, actual);
    }

    @Test
    public void getSwitch_givenNoSwitchSetNoDefaults_shouldReturnNull() {
        final Option opt = createMockOption("-s", Collections.EMPTY_SET, null);

        final Boolean actual = commandLine.getSwitch(opt, null);
        Assert.assertNull(actual);
    }

    @Test
    public void setDefaultSwitch_givenNullDefault_shouldRemoveFromDefaults() {
        final Option opt = createMockOption("-s", Collections.EMPTY_SET, null);
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        commandLine.setDefaultSwitch(opt, null);

        final Boolean actual = commandLine.getSwitch(opt, null);
        Assert.assertNull(actual);
    }

    @Test
    public void addProperty_givenPropertyAndValue_shouldStoreAndRetrieveProperty() {
        commandLine.addProperty("key1", "val1");
        commandLine.addProperty("key2", "val2");

        Assert.assertEquals("val1", commandLine.getProperty("key1", null));
        Assert.assertEquals("val2", commandLine.getProperty("key2", "default"));

        final Set props = commandLine.getProperties();
        Assert.assertEquals(2, props.size());
        Assert.assertTrue(props.contains("key1"));
        Assert.assertTrue(props.contains("key2"));
    }

    @Test
    public void getProperty_givenNonExistentProperty_shouldReturnDefaultValue() {
        final String actual = commandLine.getProperty("missing", "defaultValue");
        Assert.assertEquals("defaultValue", actual);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getProperties_givenReturnedSet_shouldBeUnmodifiable() {
        commandLine.addProperty("prop", "val");
        final Set props = commandLine.getProperties();
        props.add("newProp");
    }

    @Test
    public void looksLikeOption_givenPrefixMatchingTrigger_shouldReturnTrue() {
        Assert.assertTrue(commandLine.looksLikeOption("-a"));
        Assert.assertTrue(commandLine.looksLikeOption("--option"));
    }

    @Test
    public void looksLikeOption_givenNonPrefixMatchingTrigger_shouldReturnFalse() {
        Assert.assertFalse(commandLine.looksLikeOption("option"));
        Assert.assertFalse(commandLine.looksLikeOption("/help"));
    }

    @Test
    public void looksLikeOption_givenEmptyPrefixes_shouldReturnFalse() {
        final Option emptyPrefixOption = createMockOption("root", Collections.EMPTY_SET, Collections.EMPTY_SET);
        final WriteableCommandLineImpl cl = new WriteableCommandLineImpl(emptyPrefixOption, Collections.EMPTY_LIST);

        Assert.assertFalse(cl.looksLikeOption("-a"));
    }

    @Test
    public void toString_givenArgumentsWithAndWithoutSpaces_shouldFormatCorrectly() {
        final List args = new ArrayList();
        args.add("--file");
        args.add("my document.txt");
        args.add("-v");
        final WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, args);

        final String result = cl.toString();
        Assert.assertEquals("--file \"my document.txt\" -v", result);
    }

    @Test
    public void toString_givenEmptyArguments_shouldReturnEmptyString() {
        final WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, Collections.EMPTY_LIST);
        Assert.assertEquals("", cl.toString());
    }

    @Test
    public void toString_givenSingleArgumentWithoutSpaces_shouldNotQuote() {
        final List args = new ArrayList();
        args.add("simple");
        final WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, args);

        Assert.assertEquals("simple", cl.toString());
    }

    @Test
    public void toString_givenSingleArgumentWithSpaces_shouldQuote() {
        final List args = new ArrayList();
        args.add("multiple words arg");
        final WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, args);

        Assert.assertEquals("\"multiple words arg\"", cl.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getOptions_givenReturnedList_shouldBeUnmodifiable() {
        final Option opt = createMockOption("-o", Collections.EMPTY_SET, null);
        commandLine.addOption(opt);

        final List options = commandLine.getOptions();
        options.add(opt);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getOptionTriggers_givenReturnedSet_shouldBeUnmodifiable() {
        final Option opt = createMockOption("-o", Collections.EMPTY_SET, null);
        commandLine.addOption(opt);

        final Set triggers = commandLine.getOptionTriggers();
        triggers.add("dummy");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getNormalised_givenReturnedList_shouldBeUnmodifiable() {
        final List normalised = commandLine.getNormalised();
        normalised.add("dummy");
    }
}