package org.apache.commons.cli2.commandline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.option.PropertyOption;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class WriteableCommandLineImplTest {

    private Option rootOption;
    private WriteableCommandLineImpl commandLine;
    private List arguments;

    private Option createOption(String shortName) {
        return new DefaultOptionBuilder().withShortName(shortName).create();
    }

    private Option createOptionWithLong(String shortName, String longName) {
        return new DefaultOptionBuilder().withShortName(shortName).withLongName(longName).create();
    }

    private Argument createArgument(String name) {
        return new ArgumentBuilder().withName(name).create();
    }

    @Before
    public void setUp() {
        rootOption = createOption("r");
        arguments = new ArrayList();
        arguments.add("-a");
        arguments.add("plainarg");
        commandLine = new WriteableCommandLineImpl(rootOption, arguments);
    }

    @Test
    public void testConstructorSetsPrefixesAndNormalised() {
        assertEquals(arguments, commandLine.getNormalised());
        assertTrue(commandLine.looksLikeOption("-a"));
    }

    @Test
    public void testAddOptionSingleTrigger() {
        Option opt = createOption("a");
        commandLine.addOption(opt);

        assertTrue(commandLine.hasOption(opt));
        assertEquals(opt, commandLine.getOption(opt.getPreferredName()));
        assertTrue(commandLine.getOptions().contains(opt));
    }

    @Test
    public void testAddOptionMultipleTriggersLoop() {
        Option multi = createOptionWithLong("m", "multi");
        commandLine.addOption(multi);

        assertTrue(commandLine.hasOption(multi));

        for (Iterator it = multi.getTriggers().iterator(); it.hasNext();) {
            String trig = (String) it.next();
            assertEquals(multi, commandLine.getOption(trig));
        }

        Set triggers = commandLine.getOptionTriggers();
        assertTrue(triggers.contains(multi.getPreferredName()));
    }

    @Test
    public void testHasOptionFalseForUnknownOption() {
        Option opt = createOption("z");
        assertFalse(commandLine.hasOption(opt));
    }

    @Test
    public void testGetOptionReturnsNullForUnknownTrigger() {
        assertNull(commandLine.getOption("-doesnotexist"));
    }

    @Test
    public void testAddValueWithArgumentAddsOption() {
        Argument arg = createArgument("file");
        commandLine.addValue(arg, "value1");

        assertTrue(commandLine.hasOption(arg));
        List values = commandLine.getUndefaultedValues(arg);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    @Test
    public void testAddValueWithNonArgumentDoesNotAddOption() {
        Option opt = createOption("v");
        commandLine.addValue(opt, "hello");

        assertFalse(commandLine.hasOption(opt));
        List values = commandLine.getUndefaultedValues(opt);
        assertEquals(Arrays.asList("hello"), values);
    }

    @Test
    public void testAddValueMultipleTimesAccumulates() {
        Argument arg = createArgument("multi");
        commandLine.addValue(arg, "v1");
        commandLine.addValue(arg, "v2");
        commandLine.addValue(arg, "v3");

        List values = commandLine.getUndefaultedValues(arg);
        assertEquals(3, values.size());
        assertEquals("v1", values.get(0));
        assertEquals("v2", values.get(1));
        assertEquals("v3", values.get(2));
    }

    @Test
    public void testAddValueWithNullOptionKey() {
        commandLine.addValue(null, "nullKeyValue");
        List values = commandLine.getUndefaultedValues(null);
        assertEquals(Arrays.asList("nullKeyValue"), values);
    }

    @Test
    public void testGetUndefaultedValuesEmptyWhenNoValues() {
        Option opt = createOption("empty");
        List values = commandLine.getUndefaultedValues(opt);
        assertTrue(values.isEmpty());
    }

    @Test
    public void testAddSwitchNormal() {
        Option opt = createOption("s");
        commandLine.addSwitch(opt, true);

        assertTrue(commandLine.hasOption(opt));
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));
    }

    @Test
    public void testAddSwitchFalseValue() {
        Option opt = createOption("f");
        commandLine.addSwitch(opt, false);

        assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchAlreadySetThrowsException() {
        Option opt = createOption("dup");
        commandLine.addSwitch(opt, true);
        commandLine.addSwitch(opt, false);
    }

    @Test
    public void testGetSwitchAllBranches() {
        Option optWithSwitch = createOption("sw1");
        commandLine.addSwitch(optWithSwitch, true);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(optWithSwitch, Boolean.FALSE));

        Option optWithParamDefault = createOption("sw2");
        assertEquals(Boolean.FALSE, commandLine.getSwitch(optWithParamDefault, Boolean.FALSE));

        Option optWithOptionDefault = createOption("sw3");
        commandLine.setDefaultSwitch(optWithOptionDefault, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(optWithOptionDefault, null));

        Option optNoDefaultsAtAll = createOption("sw4");
        assertNull(commandLine.getSwitch(optNoDefaultsAtAll, null));
    }

    @Test
    public void testSetDefaultSwitchRemoval() {
        Option opt = createOption("rem");
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));

        commandLine.setDefaultSwitch(opt, null);
        assertNull(commandLine.getSwitch(opt, null));
    }

    @Test
    public void testGetValuesAllBranches() {
        // branch 1: values present in command line
        Argument arg1 = createArgument("gv1");
        commandLine.addValue(arg1, "x");
        List result1 = commandLine.getValues(arg1, null);
        assertEquals(Arrays.asList("x"), result1);

        // branch 2: no command line values, but defaultValues parameter given
        Argument arg2 = createArgument("gv2");
        List paramDefaults = Arrays.asList("d1", "d2");
        List result2 = commandLine.getValues(arg2, paramDefaults);
        assertEquals(paramDefaults, result2);

        // branch 3: no command line values, no param defaults,
        // but option-level defaults set
        Argument arg3 = createArgument("gv3");
        List optDefaults = Arrays.asList("od1");
        commandLine.setDefaultValues(arg3, optDefaults);
        List result3 = commandLine.getValues(arg3, null);
        assertEquals(optDefaults, result3);

        // branch 4: nothing available at all -> empty list
        Argument arg4 = createArgument("gv4");
        List result4 = commandLine.getValues(arg4, null);
        assertEquals(Collections.EMPTY_LIST, result4);
    }

    @Test
    public void testGetValuesWithEmptyParamDefaultsFallsThroughToOptionDefaults() {
        Argument arg = createArgument("gv5");
        commandLine.setDefaultValues(arg, Arrays.asList("fallback"));

        List result = commandLine.getValues(arg, new ArrayList());
        assertEquals(Arrays.asList("fallback"), result);
    }

    @Test
    public void testSetDefaultValuesRemoval() {
        Argument arg = createArgument("gv6");
        commandLine.setDefaultValues(arg, Arrays.asList("temp"));
        assertEquals(Arrays.asList("temp"), commandLine.getValues(arg, null));

        commandLine.setDefaultValues(arg, null);
        assertEquals(Collections.EMPTY_LIST, commandLine.getValues(arg, null));
    }

    @Test
    public void testGetPropertyStringAndAddPropertyString() {
        commandLine.addProperty("key1", "value1");
        assertEquals("value1", commandLine.getProperty("key1"));
        assertNull(commandLine.getProperty("nonexistentKey"));
    }

    @Test
    public void testAddPropertyAndGetPropertyWithOptionAndDefault() {
        Option propOption = new PropertyOption();
        commandLine.addProperty(propOption, "k", "v");

        assertEquals("v", commandLine.getProperty(propOption, "k", "defaultValue"));
        assertEquals("defaultValue", commandLine.getProperty(propOption, "missing", "defaultValue"));
    }

    @Test
    public void testGetPropertyWithUnknownOptionReturnsDefault() {
        Option someOption = createOption("unknownProp");
        assertEquals("myDefault", commandLine.getProperty(someOption, "anyKey", "myDefault"));
    }

    @Test
    public void testGetPropertiesForOptionWithValues() {
        Option propOption = new PropertyOption();
        commandLine.addProperty(propOption, "k1", "v1");
        commandLine.addProperty(propOption, "k2", "v2");

        Set props = commandLine.getProperties(propOption);
        assertEquals(2, props.size());
        assertTrue(props.contains("k1"));
        assertTrue(props.contains("k2"));
    }

    @Test
    public void testGetPropertiesForOptionWithoutValuesReturnsEmptySet() {
        Option someOption = createOption("noProps");
        Set props = commandLine.getProperties(someOption);
        assertTrue(props.isEmpty());
    }

    @Test
    public void testGetPropertiesNoArg() {
        commandLine.addProperty("propKey", "propVal");
        Set props = commandLine.getProperties();
        assertTrue(props.contains("propKey"));
    }

    @Test
    public void testLooksLikeOptionTrueAndFalse() {
        assertTrue(commandLine.looksLikeOption("-something"));
        assertFalse(commandLine.looksLikeOption("something"));
    }

    @Test
    public void testToStringWithSpacesAndPlainArgs() {
        List norm = new ArrayList();
        norm.add("plain");
        norm.add("has space");
        WriteableCommandLineImpl cli = new WriteableCommandLineImpl(rootOption, norm);

        assertEquals("plain \"has space\"", cli.toString());
    }

    @Test
    public void testToStringEmptyNormalised() {
        List norm = new ArrayList();
        WriteableCommandLineImpl cli = new WriteableCommandLineImpl(rootOption, norm);

        assertEquals("", cli.toString());
    }

    @Test
    public void testToStringSingleArgNoTrailingSpace() {
        List norm = new ArrayList();
        norm.add("onlyone");
        WriteableCommandLineImpl cli = new WriteableCommandLineImpl(rootOption, norm);

        assertEquals("onlyone", cli.toString());
    }

    @Test
    public void testGetOptionsUnmodifiable() {
        Option opt = createOption("optlist");
        commandLine.addOption(opt);

        List opts = commandLine.getOptions();
        assertTrue(opts.contains(opt));

        try {
            opts.add(createOption("shouldfail"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetOptionTriggersUnmodifiable() {
        Option opt = createOption("trigunmod");
        commandLine.addOption(opt);

        Set triggers = commandLine.getOptionTriggers();
        assertTrue(triggers.contains(opt.getPreferredName()));

        try {
            triggers.add("newTrigger");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetNormalisedUnmodifiable() {
        List norm = commandLine.getNormalised();
        assertEquals(arguments, norm);

        try {
            norm.add("extra");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
}