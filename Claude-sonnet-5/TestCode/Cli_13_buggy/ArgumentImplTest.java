package org.apache.commons.cli2.option;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.validation.InvalidArgumentException;
import org.apache.commons.cli2.validation.Validator;

public class ArgumentImplTest {

    /**
     * Minimal stub implementation of WriteableCommandLine used to test
     * ArgumentImpl in isolation with full control over "looksLikeOption"
     * behaviour and stored values.
     */
    private static class StubCommandLine implements WriteableCommandLine {
        final Map valuesMap = new HashMap();
        final Map defaultValuesMap = new HashMap();
        final Set looksLikeOptionSet = new HashSet();

        public void setLooksLikeOption(String trigger, boolean value) {
            if (value) {
                looksLikeOptionSet.add(trigger);
            } else {
                looksLikeOptionSet.remove(trigger);
            }
        }

        public boolean looksLikeOption(String trigger) {
            return looksLikeOptionSet.contains(trigger);
        }

        public void addValue(Option option, Object value) {
            List list = (List) valuesMap.get(option);
            if (list == null) {
                list = new ArrayList();
                valuesMap.put(option, list);
            }
            list.add(value);
        }

        public void addOption(Option option) {
        }

        public void addSwitch(Option option, boolean value) {
        }

        public void addProperty(Option option, String property, String value) {
        }

        public void setDefaultValues(Option option, List defaultValues) {
            defaultValuesMap.put(option, defaultValues);
        }

        public List getUndefaultedValues(Option option) {
            List list = (List) valuesMap.get(option);
            return list == null ? Collections.EMPTY_LIST : list;
        }

        public void addPreference(Option option) {
        }

        public boolean hasOption(String trigger) {
            return false;
        }

        public boolean hasOption(Option option) {
            return false;
        }

        public Option getOption(String trigger) {
            return null;
        }

        public List getValues(String trigger) {
            return Collections.EMPTY_LIST;
        }

        public List getValues(String trigger, List defaultValues) {
            return defaultValues;
        }

        public List getValues(Option option) {
            List list = (List) valuesMap.get(option);
            if (list == null || list.isEmpty()) {
                Object def = defaultValuesMap.get(option);
                if (def != null) {
                    return (List) def;
                }
                return Collections.EMPTY_LIST;
            }
            return list;
        }

        public List getValues(Option option, List defaultValues) {
            List list = (List) valuesMap.get(option);
            if (list == null || list.isEmpty()) {
                return defaultValues;
            }
            return list;
        }

        public Boolean getSwitch(String trigger) {
            return null;
        }

        public Boolean getSwitch(String trigger, Boolean defaultValue) {
            return defaultValue;
        }

        public Boolean getSwitch(Option option) {
            return null;
        }

        public Boolean getSwitch(Option option, Boolean defaultValue) {
            return defaultValue;
        }

        public Object getValue(String trigger) {
            return null;
        }

        public Object getValue(String trigger, Object defaultValue) {
            return defaultValue;
        }

        public Object getValue(Option option) {
            return null;
        }

        public Object getValue(Option option, Object defaultValue) {
            return defaultValue;
        }

        public Set getOptions() {
            return Collections.EMPTY_SET;
        }

        public List getOptionTriggers() {
            return Collections.EMPTY_LIST;
        }

        public String getProperty(String property) {
            return null;
        }

        public String getProperty(String property, String defaultValue) {
            return defaultValue;
        }

        public Set getProperties() {
            return Collections.EMPTY_SET;
        }
    }

    private StubCommandLine commandLine;

    @Before
    public void setUp() {
        commandLine = new StubCommandLine();
    }

    private ArgumentImpl createSimpleArgument() {
        return new ArgumentImpl("arg", "desc", 0, 1, '\0', '\0', null, "--", null, 1);
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_normal() {
        List defaults = new ArrayList();
        defaults.add("default1");
        ArgumentImpl arg = new ArgumentImpl("myarg", "description", 1, 3,
            '=', ',', null, "--", defaults, 1);

        assertEquals("myarg", arg.getPreferredName());
        assertEquals("description", arg.getDescription());
        assertEquals(1, arg.getMinimum());
        assertEquals(3, arg.getMaximum());
        assertEquals('=', arg.getInitialSeparator());
        assertEquals(',', arg.getSubsequentSeparator());
        assertEquals("--", arg.getConsumeRemaining());
        assertEquals(defaults, arg.getDefaultValues());
        assertNull(arg.getValidator());
    }

    @Test
    public void testConstructor_nullName_defaultsToArg() {
        ArgumentImpl arg = new ArgumentImpl(null, "desc", 0, 1,
            '\0', '\0', null, "--", null, 1);
        assertEquals("arg", arg.getPreferredName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_minGreaterThanMax_throws() {
        new ArgumentImpl("arg", "desc", 5, 2, '\0', '\0', null, "--", null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_tooFewDefaults_throws() {
        List defaults = new ArrayList();
        defaults.add("only1");
        new ArgumentImpl("arg", "desc", 2, 5, '\0', '\0', null, "--", defaults, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_tooManyDefaults_throws() {
        List defaults = new ArrayList();
        defaults.add("v1");
        defaults.add("v2");
        defaults.add("v3");
        new ArgumentImpl("arg", "desc", 0, 2, '\0', '\0', null, "--", defaults, 1);
    }

    @Test
    public void testConstructor_emptyDefaults_noException() {
        List defaults = new ArrayList();
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 5, '\0', '\0', null, "--", defaults, 1);
        assertNotNull(arg);
    }

    @Test
    public void testConstructor_minEqualsMax_noException() {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 2, 2, '\0', '\0', null, "--", null, 1);
        assertEquals(2, arg.getMinimum());
        assertEquals(2, arg.getMaximum());
    }

    @Test
    public void testConstructor_defaultsExactlyMinimum_noException() {
        List defaults = new ArrayList();
        defaults.add("d1");
        defaults.add("d2");
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 2, 5, '\0', '\0', null, "--", defaults, 1);
        assertEquals(defaults, arg.getDefaultValues());
    }

    @Test
    public void testConstructor_defaultsExactlyMaximum_noException() {
        List defaults = new ArrayList();
        defaults.add("d1");
        defaults.add("d2");
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 2, '\0', '\0', null, "--", defaults, 1);
        assertEquals(defaults, arg.getDefaultValues());
    }

    // ---------- getPrefixes / getTriggers ----------

    @Test
    public void testGetPrefixes_empty() {
        ArgumentImpl arg = createSimpleArgument();
        assertTrue(arg.getPrefixes().isEmpty());
    }

    @Test
    public void testGetTriggers_empty() {
        ArgumentImpl arg = createSimpleArgument();
        assertTrue(arg.getTriggers().isEmpty());
    }

    // ---------- canProcess ----------

    @Test
    public void testCanProcess_alwaysTrue() {
        ArgumentImpl arg = createSimpleArgument();
        assertTrue(arg.canProcess(commandLine, "anything"));
        assertTrue(arg.canProcess(commandLine, null));
    }

    // ---------- stripBoundaryQuotes ----------

    @Test
    public void testStripBoundaryQuotes_withQuotes() {
        ArgumentImpl arg = createSimpleArgument();
        assertEquals("value", arg.stripBoundaryQuotes("\"value\""));
    }

    @Test
    public void testStripBoundaryQuotes_noQuotes() {
        ArgumentImpl arg = createSimpleArgument();
        assertEquals("value", arg.stripBoundaryQuotes("value"));
    }

    @Test
    public void testStripBoundaryQuotes_onlyStartQuote() {
        ArgumentImpl arg = createSimpleArgument();
        assertEquals("\"value", arg.stripBoundaryQuotes("\"value"));
    }

    @Test
    public void testStripBoundaryQuotes_onlyEndQuote() {
        ArgumentImpl arg = createSimpleArgument();
        assertEquals("value\"", arg.stripBoundaryQuotes("value\""));
    }

    // ---------- processValues ----------

    @Test
    public void testProcessValues_emptyArguments_zeroLoop() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', '\0', null, "--", null, 1);
        List args = new ArrayList();
        ListIterator it = args.listIterator();
        arg.processValues(commandLine, it, arg);
        assertTrue(commandLine.getValues(arg).isEmpty());
    }

    @Test
    public void testProcessValues_singleValue() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', '\0', null, "--", null, 1);
        List args = new ArrayList();
        args.add("value1");
        ListIterator it = args.listIterator();
        arg.processValues(commandLine, it, arg);
        List values = commandLine.getValues(arg);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    @Test
    public void testProcessValues_multipleValues_loop() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', '\0', null, "--", null, 1);
        List args = new ArrayList();
        args.add("value1");
        args.add("value2");
        args.add("value3");
        ListIterator it = args.listIterator();
        arg.processValues(commandLine, it, arg);
        List values = commandLine.getValues(arg);
        assertEquals(3, values.size());
    }

    @Test
    public void testProcessValues_maxReached_stopsLoop() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 2, '\0', '\0', null, "--", null, 1);
        List args = new ArrayList();
        args.add("value1");
        args.add("value2");
        args.add("value3");
        ListIterator it = args.listIterator();
        arg.processValues(commandLine, it, arg);
        List values = commandLine.getValues(arg);
        assertEquals(2, values.size());
        assertTrue(it.hasNext());
    }

    @Test
    public void testProcessValues_consumeRemaining() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', '\0', null, "--", null, 1);
        List args = new ArrayList();
        args.add("--");
        args.add("value1");
        args.add("value2");
        ListIterator it = args.listIterator();
        arg.processValues(commandLine, it, arg);
        List values = commandLine.getValues(arg);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }

    @Test
    public void testProcessValues_looksLikeOption_breaksLoop() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', '\0', null, "--", null, 1);
        List args = new ArrayList();
        args.add("-x");
        commandLine.setLooksLikeOption("-x", true);
        ListIterator it = args.listIterator();
        arg.processValues(commandLine, it, arg);
        List values = commandLine.getValues(arg);
        assertTrue(values.isEmpty());
        assertTrue(it.hasNext());
        assertEquals("-x", it.next());
    }

    @Test
    public void testProcessValues_subsequentSplit() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', ',', null, "--", null, 1);
        List args = new ArrayList();
        args.add("a,b,c");
        ListIterator it = args.listIterator();
        arg.processValues(commandLine, it, arg);
        List values = commandLine.getValues(arg);
        assertEquals(3, values.size());
        assertEquals("a", values.get(0));
        assertEquals("b", values.get(1));
        assertEquals("c", values.get(2));
    }

    @Test(expected = OptionException.class)
    public void testProcessValues_subsequentSplit_exceedsMax_throws() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 2, '\0', ',', null, "--", null, 1);
        List args = new ArrayList();
        args.add("a,b,c");
        ListIterator it = args.listIterator();
        arg.processValues(commandLine, it, arg);
    }

    @Test
    public void testProcessValues_withQuotedValue() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', '\0', null, "--", null, 1);
        List args = new ArrayList();
        args.add("\"quoted value\"");
        ListIterator it = args.listIterator();
        arg.processValues(commandLine, it, arg);
        List values = commandLine.getValues(arg);
        assertEquals(1, values.size());
        assertEquals("quoted value", values.get(0));
    }

    // ---------- process ----------

    @Test
    public void testProcess_delegatesToProcessValues() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', '\0', null, "--", null, 1);
        List args = new ArrayList();
        args.add("value1");
        ListIterator it = args.listIterator();
        arg.process(commandLine, it);
        List values = commandLine.getValues(arg);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    // ---------- validate ----------

    @Test
    public void testValidate_normal_passes() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 3, '\0', '\0', null, "--", null, 1);
        commandLine.addValue(arg, "value1");
        arg.validate(commandLine);
        assertEquals(1, commandLine.getValues(arg).size());
    }

    @Test(expected = OptionException.class)
    public void testValidate_tooFewValues_throws() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 2, 5, '\0', '\0', null, "--", null, 1);
        commandLine.addValue(arg, "value1");
        arg.validate(commandLine);
    }

    @Test(expected = OptionException.class)
    public void testValidate_tooManyValues_throws() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 1, '\0', '\0', null, "--", null, 1);
        commandLine.addValue(arg, "value1");
        commandLine.addValue(arg, "value2");
        arg.validate(commandLine);
    }

    @Test
    public void testValidate_withValidator_passes() throws OptionException {
        Validator validator = new Validator() {
            public void validate(List values) throws InvalidArgumentException {
                // always ok
            }
        };
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', '\0', validator, "--", null, 1);
        commandLine.addValue(arg, "value1");
        arg.validate(commandLine);
        assertSame(validator, arg.getValidator());
    }

    @Test(expected = OptionException.class)
    public void testValidate_withValidator_throwsInvalidArgument() throws OptionException {
        Validator validator = new Validator() {
            public void validate(List values) throws InvalidArgumentException {
                throw new InvalidArgumentException("invalid");
            }
        };
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', '\0', validator, "--", null, 1);
        commandLine.addValue(arg, "value1");
        arg.validate(commandLine);
    }

    @Test
    public void testValidate_withOptionParam() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', '\0', null, "--", null, 1);
        commandLine.addValue(arg, "value1");
        arg.validate(commandLine, arg);
    }

    // ---------- appendUsage ----------

    @Test
    public void testAppendUsage_basic() {
        ArgumentImpl arg = new ArgumentImpl("myarg", "desc", 1, 1, '\0', '\0', null, "--", null, 1);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        arg.appendUsage(buffer, settings, null);
        assertEquals("myarg", buffer.toString());
    }

    @Test
    public void testAppendUsage_optional() {
        ArgumentImpl arg = new ArgumentImpl("myarg", "desc", 0, 1, '\0', '\0', null, "--", null, 1);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        arg.appendUsage(buffer, settings, null);
        assertEquals("[myarg]", buffer.toString());
    }

    @Test
    public void testAppendUsage_numbered() {
        ArgumentImpl arg = new ArgumentImpl("myarg", "desc", 2, 2, '\0', '\0', null, "--", null, 1);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_ARGUMENT_NUMBERED);
        arg.appendUsage(buffer, settings, null);
        assertEquals("myarg1 myarg2", buffer.toString());
    }

    @Test
    public void testAppendUsage_bracketed() {
        ArgumentImpl arg = new ArgumentImpl("myarg", "desc", 1, 1, '\0', '\0', null, "--", null, 1);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_ARGUMENT_BRACKETED);
        arg.appendUsage(buffer, settings, null);
        assertEquals("<myarg>", buffer.toString());
    }

    @Test
    public void testAppendUsage_infiniteMax() {
        ArgumentImpl arg = new ArgumentImpl("myarg", "desc", 0, Integer.MAX_VALUE, '\0', '\0', null, "--", null, 1);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        arg.appendUsage(buffer, settings, null);
        assertTrue(buffer.toString().indexOf("...") >= 0);
    }

    // ---------- getDescription ----------

    @Test
    public void testGetDescription() {
        ArgumentImpl arg = new ArgumentImpl("arg", "my description", 0, 1, '\0', '\0', null, "--", null, 1);
        assertEquals("my description", arg.getDescription());
    }

    // ---------- helpLines ----------

    @Test
    public void testHelpLines_singleLine() {
        ArgumentImpl arg = createSimpleArgument();
        List lines = arg.helpLines(0, new HashSet(), null);
        assertEquals(1, lines.size());
    }

    // ---------- isRequired ----------

    @Test
    public void testIsRequired_true() {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 2, '\0', '\0', null, "--", null, 1);
        assertTrue(arg.isRequired());
    }

    @Test
    public void testIsRequired_false() {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 2, '\0', '\0', null, "--", null, 1);
        assertFalse(arg.isRequired());
    }

    // ---------- getMaximum / getMinimum ----------

    @Test
    public void testGetMaximum_infinite() {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, Integer.MAX_VALUE, '\0', '\0', null, "--", null, 1);
        assertEquals(Integer.MAX_VALUE, arg.getMaximum());
    }

    @Test
    public void testGetMinimum_zero() {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', '\0', null, "--", null, 1);
        assertEquals(0, arg.getMinimum());
    }

    // ---------- defaults / defaultValues ----------

    @Test
    public void testDefaults_setsDefaultValues() {
        List defaults = new ArrayList();
        defaults.add("d1");
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 2, '\0', '\0', null, "--", defaults, 1);
        arg.defaults(commandLine);
        assertEquals(defaults, commandLine.defaultValuesMap.get(arg));
    }

    @Test
    public void testDefaultValues_directCall() {
        List defaults = new ArrayList();
        defaults.add("d1");
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 2, '\0', '\0', null, "--", defaults, 1);
        arg.defaultValues(commandLine, arg);
        assertEquals(defaults, commandLine.defaultValuesMap.get(arg));
    }

    @Test
    public void testGetDefaultValues_nullWhenNoneProvided() {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 2, '\0', '\0', null, "--", null, 1);
        assertNull(arg.getDefaultValues());
    }
}