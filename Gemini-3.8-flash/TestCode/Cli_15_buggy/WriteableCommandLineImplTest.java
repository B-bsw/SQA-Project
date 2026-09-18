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

    private Set rootPrefixes;
    private Option rootOption;
    private List arguments;
    private WriteableCommandLineImpl commandLine;

    @Before
    public void setUp() {
        rootPrefixes = new HashSet();
        rootPrefixes.add("-");
        rootPrefixes.add("--");
        rootOption = createMockOption("root", Collections.EMPTY_SET, rootPrefixes);
        arguments = new ArrayList();
        commandLine = new WriteableCommandLineImpl(rootOption, arguments);
    }

    private Option createMockOption(final String preferredName, final Set triggers, final Set prefixes) {
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                if ("getPreferredName".equals(name)) {
                    return preferredName;
                }
                if ("getTriggers".equals(name)) {
                    return triggers == null ? Collections.EMPTY_SET : triggers;
                }
                if ("getPrefixes".equals(name)) {
                    return prefixes == null ? Collections.EMPTY_SET : prefixes;
                }
                if ("hashCode".equals(name)) {
                    return new Integer(System.identityHashCode(proxy));
                }
                if ("equals".equals(name)) {
                    return Boolean.valueOf(proxy == args[0]);
                }
                if ("toString".equals(name)) {
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

    private Argument createMockArgument(final String preferredName, final Set triggers) {
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                if ("getPreferredName".equals(name)) {
                    return preferredName;
                }
                if ("getTriggers".equals(name)) {
                    return triggers == null ? Collections.EMPTY_SET : triggers;
                }
                if ("getPrefixes".equals(name)) {
                    return Collections.EMPTY_SET;
                }
                if ("hashCode".equals(name)) {
                    return new Integer(System.identityHashCode(proxy));
                }
                if ("equals".equals(name)) {
                    return Boolean.valueOf(proxy == args[0]);
                }
                if ("toString".equals(name)) {
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
    public void addOption_givenOptionWithTriggers_shouldIndexPreferredNameAndTriggers() {
        Set triggers = new HashSet();
        triggers.add("-f");
        triggers.add("--file");
        Option fileOption = createMockOption("--file", triggers, Collections.EMPTY_SET);

        commandLine.addOption(fileOption);

        Assert.assertTrue(commandLine.hasOption(fileOption));
        Assert.assertSame(fileOption, commandLine.getOption("--file"));
        Assert.assertSame(fileOption, commandLine.getOption("-f"));
        Assert.assertNull(commandLine.getOption("-unknown"));

        List optionsList = commandLine.getOptions();
        Assert.assertEquals(1, optionsList.size());
        Assert.assertSame(fileOption, optionsList.get(0));

        Set triggersSet = commandLine.getOptionTriggers();
        Assert.assertTrue(triggersSet.contains("--file"));
        Assert.assertTrue(triggersSet.contains("-f"));
    }

    @Test
    public void addValue_givenArgumentOption_shouldAddOptionAndStoreValues() {
        Set triggers = new HashSet();
        triggers.add("target");
        Argument targetArg = createMockArgument("target", triggers);

        commandLine.addValue(targetArg, "file1.txt");
        commandLine.addValue(targetArg, "file2.txt");

        Assert.assertTrue(commandLine.hasOption(targetArg));
        Assert.assertSame(targetArg, commandLine.getOption("target"));

        List values = commandLine.getValues(targetArg, null);
        Assert.assertEquals(2, values.size());
        Assert.assertEquals("file1.txt", values.get(0));
        Assert.assertEquals("file2.txt", values.get(1));

        List undefaulted = commandLine.getUndefaultedValues(targetArg);
        Assert.assertEquals(2, undefaulted.size());
        Assert.assertEquals("file1.txt", undefaulted.get(0));
        Assert.assertEquals("file2.txt", undefaulted.get(1));
    }

    @Test
    public void addValue_givenRegularOption_shouldStoreValueWithoutAddingToOptionsList() {
        Option opt = createMockOption("--val", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.addValue(opt, "customValue");

        Assert.assertFalse(commandLine.hasOption(opt));
        List values = commandLine.getValues(opt, null);
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("customValue", values.get(0));
    }

    @Test
    public void addSwitch_givenTrueAndFalseValues_shouldStoreCorrectBoolean() {
        Option optTrue = createMockOption("--debug", Collections.EMPTY_SET, Collections.EMPTY_SET);
        Option optFalse = createMockOption("--quiet", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.addSwitch(optTrue, true);
        commandLine.addSwitch(optFalse, false);

        Assert.assertTrue(commandLine.hasOption(optTrue));
        Assert.assertTrue(commandLine.hasOption(optFalse));
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(optTrue, null));
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(optFalse, null));
    }

    @Test(expected = IllegalStateException.class)
    public void addSwitch_givenAlreadyAddedSwitch_shouldThrowIllegalStateException() {
        Option opt = createMockOption("--verbose", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.addSwitch(opt, true);
        commandLine.addSwitch(opt, false);
    }

    @Test
    public void hasOption_givenUnaddedOption_shouldReturnFalse() {
        Option opt = createMockOption("--unadded", Collections.EMPTY_SET, Collections.EMPTY_SET);
        Assert.assertFalse(commandLine.hasOption(opt));
    }

    @Test
    public void getOption_givenUnregisteredTrigger_shouldReturnNull() {
        Assert.assertNull(commandLine.getOption("--nonexistent"));
    }

    @Test
    public void getValues_givenCommandLineValues_shouldReturnCommandLineValues() {
        Option opt = createMockOption("-v", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addValue(opt, "val1");

        List defaultParam = new ArrayList();
        defaultParam.add("defParam");

        List defaultsOnOption = new ArrayList();
        defaultsOnOption.add("defOption");
        commandLine.setDefaultValues(opt, defaultsOnOption);

        List result = commandLine.getValues(opt, defaultParam);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("val1", result.get(0));
    }

    @Test
    public void getValues_givenNoCommandLineValuesAndProvidedDefaultList_shouldReturnProvidedDefaultList() {
        Option opt = createMockOption("-v", Collections.EMPTY_SET, Collections.EMPTY_SET);

        List defaultParam = new ArrayList();
        defaultParam.add("defParam");

        List defaultsOnOption = new ArrayList();
        defaultsOnOption.add("defOption");
        commandLine.setDefaultValues(opt, defaultsOnOption);

        List result = commandLine.getValues(opt, defaultParam);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("defParam", result.get(0));
    }

    @Test
    public void getValues_givenNoCommandLineValuesAndEmptyProvidedDefaultList_shouldFallbackToOptionDefaults() {
        Option opt = createMockOption("-v", Collections.EMPTY_SET, Collections.EMPTY_SET);

        List defaultParam = new ArrayList();

        List defaultsOnOption = new ArrayList();
        defaultsOnOption.add("defOption");
        commandLine.setDefaultValues(opt, defaultsOnOption);

        List result = commandLine.getValues(opt, defaultParam);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("defOption", result.get(0));
    }

    @Test
    public void getValues_givenNoCommandLineValuesAndNullDefaultList_shouldFallbackToOptionDefaults() {
        Option opt = createMockOption("-v", Collections.EMPTY_SET, Collections.EMPTY_SET);

        List defaultsOnOption = new ArrayList();
        defaultsOnOption.add("defOption");
        commandLine.setDefaultValues(opt, defaultsOnOption);

        List result = commandLine.getValues(opt, null);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("defOption", result.get(0));
    }

    @Test
    public void getValues_givenNoValuesAtAll_shouldReturnEmptyList() {
        Option opt = createMockOption("-v", Collections.EMPTY_SET, Collections.EMPTY_SET);

        List result = commandLine.getValues(opt, null);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
        Assert.assertSame(Collections.EMPTY_LIST, result);
    }

    @Test
    public void getUndefaultedValues_givenNoValues_shouldReturnEmptyList() {
        Option opt = createMockOption("-v", Collections.EMPTY_SET, Collections.EMPTY_SET);

        List defaultsOnOption = new ArrayList();
        defaultsOnOption.add("defOption");
        commandLine.setDefaultValues(opt, defaultsOnOption);

        List result = commandLine.getUndefaultedValues(opt);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
        Assert.assertSame(Collections.EMPTY_LIST, result);
    }

    @Test
    public void getSwitch_givenNoSwitchOnCommandLine_shouldFallbackToMethodDefaultThenOptionDefault() {
        Option opt = createMockOption("-s", Collections.EMPTY_SET, Collections.EMPTY_SET);

        Assert.assertNull(commandLine.getSwitch(opt, null));
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, Boolean.TRUE));
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, Boolean.FALSE));

        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, Boolean.FALSE));
    }

    @Test
    public void setDefaultValues_givenNull_shouldRemoveExistingDefaults() {
        Option opt = createMockOption("-v", Collections.EMPTY_SET, Collections.EMPTY_SET);

        List defaults = new ArrayList();
        defaults.add("def1");
        commandLine.setDefaultValues(opt, defaults);
        Assert.assertEquals(1, commandLine.getValues(opt, null).size());

        commandLine.setDefaultValues(opt, null);
        Assert.assertTrue(commandLine.getValues(opt, null).isEmpty());
    }

    @Test
    public void setDefaultSwitch_givenNull_shouldRemoveExistingDefaultSwitch() {
        Option opt = createMockOption("-s", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));

        commandLine.setDefaultSwitch(opt, null);
        Assert.assertNull(commandLine.getSwitch(opt, null));
    }

    @Test
    public void addProperty_givenOptionAndProperties_shouldStoreAndRetrieveCorrectly() {
        Option opt = createMockOption("-D", Collections.EMPTY_SET, Collections.EMPTY_SET);

        Assert.assertEquals("defaultVal", commandLine.getProperty(opt, "k1", "defaultVal"));
        Assert.assertTrue(commandLine.getProperties(opt).isEmpty());

        commandLine.addProperty(opt, "k1", "v1");
        commandLine.addProperty(opt, "k2", "v2");

        Assert.assertEquals("v1", commandLine.getProperty(opt, "k1", "defaultVal"));
        Assert.assertEquals("v2", commandLine.getProperty(opt, "k2", "defaultVal"));
        Assert.assertEquals("defaultVal", commandLine.getProperty(opt, "k3", "defaultVal"));

        Set keys = commandLine.getProperties(opt);
        Assert.assertEquals(2, keys.size());
        Assert.assertTrue(keys.contains("k1"));
        Assert.assertTrue(keys.contains("k2"));
    }

    @Test
    public void addProperty_givenDefaultPropertyOption_shouldStoreAndRetrieveUsingConvenienceMethods() {
        commandLine.addProperty("sysKey", "sysValue");

        Assert.assertEquals("sysValue", commandLine.getProperty("sysKey"));
        Set props = commandLine.getProperties();
        Assert.assertTrue(props.contains("sysKey"));
    }

    @Test
    public void looksLikeOption_givenPrefixMatching_shouldReturnTrueOtherwiseFalse() {
        Assert.assertTrue(commandLine.looksLikeOption("-help"));
        Assert.assertTrue(commandLine.looksLikeOption("--help"));
        Assert.assertFalse(commandLine.looksLikeOption("help"));
        Assert.assertFalse(commandLine.looksLikeOption(""));

        Option noPrefixOption = createMockOption("noPrefix", Collections.EMPTY_SET, Collections.EMPTY_SET);
        WriteableCommandLineImpl emptyPrefixesCmd = new WriteableCommandLineImpl(noPrefixOption, new ArrayList());
        Assert.assertFalse(emptyPrefixesCmd.looksLikeOption("-help"));
    }

    @Test
    public void toString_givenEmptyArguments_shouldReturnEmptyString() {
        Assert.assertEquals("", commandLine.toString());
    }

    @Test
    public void toString_givenArgumentsWithAndWithoutSpaces_shouldQuoteArgumentsWithSpaces() {
        arguments.add("--file");
        arguments.add("my document.txt");
        arguments.add("-v");
        arguments.add("normal");

        String result = commandLine.toString();
        Assert.assertEquals("--file \"my document.txt\" -v normal", result);
    }

    @Test
    public void toString_givenSingleArgumentWithoutSpaces_shouldReturnUnquoted() {
        arguments.add("simple");
        Assert.assertEquals("simple", commandLine.toString());
    }

    @Test
    public void toString_givenSingleArgumentWithSpaces_shouldReturnQuoted() {
        arguments.add("has space");
        Assert.assertEquals("\"has space\"", commandLine.toString());
    }

    @Test
    public void getNormalised_givenArguments_shouldReturnUnmodifiableList() {
        arguments.add("arg1");
        List normalised = commandLine.getNormalised();
        Assert.assertEquals(1, normalised.size());
        Assert.assertEquals("arg1", normalised.get(0));

        try {
            normalised.add("arg2");
            Assert.fail("getNormalised() should return unmodifiable list");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void getOptions_givenOptions_shouldReturnUnmodifiableList() {
        Option opt = createMockOption("-o", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addOption(opt);

        List options = commandLine.getOptions();
        try {
            options.add(opt);
            Assert.fail("getOptions() should return unmodifiable list");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void getOptionTriggers_givenTriggers_shouldReturnUnmodifiableSet() {
        Set triggers = new HashSet();
        triggers.add("-t");
        Option opt = createMockOption("-t", triggers, Collections.EMPTY_SET);
        commandLine.addOption(opt);

        Set triggersSet = commandLine.getOptionTriggers();
        try {
            triggersSet.add("-another");
            Assert.fail("getOptionTriggers() should return unmodifiable set");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void getProperties_givenOption_shouldReturnUnmodifiableSet() {
        Option opt = createMockOption("-D", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addProperty(opt, "key", "val");

        Set props = commandLine.getProperties(opt);
        try {
            props.add("newKey");
            Assert.fail("getProperties(Option) should return unmodifiable set");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }
}