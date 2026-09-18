package org.apache.commons.cli2.commandline;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;

public class WriteableCommandLineImplTest {

    private static class StubOption implements Option {
        private final String preferredName;
        private final Set triggers;
        private final Set prefixes;

        StubOption(String preferredName, Set triggers, Set prefixes) {
            this.preferredName = preferredName;
            this.triggers = triggers;
            this.prefixes = prefixes;
        }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            return false;
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public void process(WriteableCommandLine commandLine, ListIterator arguments) throws OptionException {
        }

        public Set getTriggers() {
            return triggers;
        }

        public void validate(WriteableCommandLine commandLine) throws OptionException {
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            return null;
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            return null;
        }

        public int getId() {
            return 0;
        }

        public boolean isRequired() {
            return false;
        }

        public void defaults(WriteableCommandLine commandLine) {
        }

        public List findOption(String trigger) {
            return null;
        }
    }

    private static class StubArgument extends StubOption implements Argument {
        StubArgument(String preferredName, Set triggers, Set prefixes) {
            super(preferredName, triggers, prefixes);
        }

        public String getInitialSeparator() {
            return null;
        }

        public String getSubsequentSeparator() {
            return null;
        }

        public List getValues() {
            return null;
        }

        public Object getConsumeRemaining() {
            return null;
        }

        public boolean isGreedy() {
            return false;
        }

        public int getMinimum() {
            return 0;
        }

        public int getMaximum() {
            return 0;
        }

        public void validate(WriteableCommandLine commandLine, Option option) throws OptionException {
        }
    }

    private Option rootOption;

    @Before
    public void setUp() {
        Set prefixes = new LinkedHashSet();
        prefixes.add("-");
        prefixes.add("--");
        rootOption = new StubOption("root", new HashSet(), prefixes);
    }

    private WriteableCommandLineImpl newCommandLine(List args) {
        return new WriteableCommandLineImpl(rootOption, args);
    }

    private WriteableCommandLineImpl newCommandLine() {
        return newCommandLine(new ArrayList());
    }

    private Set setOf(String[] items) {
        Set s = new LinkedHashSet();
        for (int i = 0; i < items.length; i++) {
            s.add(items[i]);
        }
        return s;
    }

    // ---------- Constructor / basic ----------

    @Test
    public void testConstructor_normalisedAndPrefixes() {
        List args = Arrays.asList(new String[] { "a", "b" });
        WriteableCommandLineImpl cl = newCommandLine(args);
        assertEquals(args, cl.getNormalised());
        assertTrue(cl.looksLikeOption("-x"));
        assertTrue(cl.looksLikeOption("--x"));
        assertFalse(cl.looksLikeOption("x"));
    }

    // ---------- addOption / hasOption / getOption ----------

    @Test
    public void testAddOption_addsToOptionsAndTriggers() {
        WriteableCommandLineImpl cl = newCommandLine();
        Set triggers = setOf(new String[] { "-v", "--verbose" });
        Option opt = new StubOption("--verbose", triggers, new HashSet());
        cl.addOption(opt);

        assertTrue(cl.hasOption(opt));
        assertSame(opt, cl.getOption("--verbose"));
        assertSame(opt, cl.getOption("-v"));
        assertNull(cl.getOption("unknown"));
        assertEquals(1, cl.getOptions().size());
    }

    @Test
    public void testAddOption_multipleOptions() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt1 = new StubOption("--a", setOf(new String[] { "-a" }), new HashSet());
        Option opt2 = new StubOption("--b", setOf(new String[] { "-b" }), new HashSet());
        cl.addOption(opt1);
        cl.addOption(opt2);
        assertEquals(2, cl.getOptions().size());
        assertTrue(cl.hasOption(opt1));
        assertTrue(cl.hasOption(opt2));
    }

    @Test
    public void testHasOption_falseWhenNotAdded() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("--x", new HashSet(), new HashSet());
        assertFalse(cl.hasOption(opt));
    }

    @Test
    public void testGetOptions_unmodifiable() {
        WriteableCommandLineImpl cl = newCommandLine();
        List opts = cl.getOptions();
        try {
            opts.add(new StubOption("x", new HashSet(), new HashSet()));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetOptionTriggers_unmodifiable() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("--x", setOf(new String[] { "-x" }), new HashSet());
        cl.addOption(opt);
        Set triggers = cl.getOptionTriggers();
        assertTrue(triggers.contains("--x"));
        assertTrue(triggers.contains("-x"));
        try {
            triggers.add("new");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- addValue / getValues / getUndefaultedValues ----------

    @Test
    public void testAddValue_withArgumentOption_addsOption() {
        WriteableCommandLineImpl cl = newCommandLine();
        Argument arg = new StubArgument("arg", new HashSet(), new HashSet());
        cl.addValue(arg, "value1");
        assertTrue(cl.hasOption(arg));
        List values = cl.getUndefaultedValues(arg);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    @Test
    public void testAddValue_withNonArgumentOption_doesNotAddOption() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.addValue(opt, "value1");
        assertFalse(cl.hasOption(opt));
        List values = cl.getUndefaultedValues(opt);
        assertEquals(1, values.size());
    }

    @Test
    public void testAddValue_multipleValues() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.addValue(opt, "v1");
        cl.addValue(opt, "v2");
        cl.addValue(opt, "v3");
        List values = cl.getUndefaultedValues(opt);
        assertEquals(Arrays.asList(new String[] { "v1", "v2", "v3" }), values);
    }

    @Test
    public void testAddValue_nullValue() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.addValue(opt, null);
        List values = cl.getUndefaultedValues(opt);
        assertEquals(1, values.size());
        assertNull(values.get(0));
    }

    @Test
    public void testGetUndefaultedValues_noValues_returnsEmptyList() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        List values = cl.getUndefaultedValues(opt);
        assertNotNull(values);
        assertTrue(values.isEmpty());
    }

    @Test
    public void testGetValues_noValuesNoDefaults_returnsEmptyList() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        List values = cl.getValues(opt, null);
        assertNotNull(values);
        assertTrue(values.isEmpty());
    }

    @Test
    public void testGetValues_withValuesOnly() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.addValue(opt, "v1");
        List values = cl.getValues(opt, null);
        assertEquals(Arrays.asList(new String[] { "v1" }), values);
    }

    @Test
    public void testGetValues_withParamDefaultValues_whenNoCommandLineValues() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        List defaults = Arrays.asList(new String[] { "d1", "d2" });
        List values = cl.getValues(opt, defaults);
        assertEquals(defaults, values);
    }

    @Test
    public void testGetValues_withStoredDefaultValues_whenParamNullOrEmpty() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        List storedDefaults = Arrays.asList(new String[] { "sd1", "sd2" });
        cl.setDefaultValues(opt, storedDefaults);

        List valuesWithNullParam = cl.getValues(opt, null);
        assertEquals(storedDefaults, valuesWithNullParam);

        List valuesWithEmptyParam = cl.getValues(opt, new ArrayList());
        assertEquals(storedDefaults, valuesWithEmptyParam);
    }

    @Test
    public void testGetValues_defaultsLargerThanValueList_augments() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.addValue(opt, "v1");
        List defaults = Arrays.asList(new String[] { "d1", "d2", "d3" });
        List values = cl.getValues(opt, defaults);
        assertEquals(Arrays.asList(new String[] { "v1", "d2", "d3" }), values);
    }

    @Test
    public void testGetValues_defaultsSmallerOrEqual_noAugmentation() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.addValue(opt, "v1");
        cl.addValue(opt, "v2");
        List defaults = Arrays.asList(new String[] { "d1" });
        List values = cl.getValues(opt, defaults);
        assertEquals(Arrays.asList(new String[] { "v1", "v2" }), values);
    }

    @Test
    public void testSetDefaultValues_removeWithNull() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.setDefaultValues(opt, Arrays.asList(new String[] { "d1" }));
        cl.setDefaultValues(opt, null);
        List values = cl.getValues(opt, null);
        assertTrue(values.isEmpty());
    }

    // ---------- addSwitch / getSwitch ----------

    @Test
    public void testAddSwitch_andGetSwitch() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.addSwitch(opt, true);
        assertTrue(cl.hasOption(opt));
        assertEquals(Boolean.TRUE, cl.getSwitch(opt, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_setTwice_throws() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.addSwitch(opt, true);
        cl.addSwitch(opt, false);
    }

    @Test
    public void testGetSwitch_usesParamDefaultWhenNotSet() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        assertEquals(Boolean.FALSE, cl.getSwitch(opt, Boolean.FALSE));
    }

    @Test
    public void testGetSwitch_usesOptionDefaultSwitchWhenParamNull() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, cl.getSwitch(opt, null));
    }

    @Test
    public void testGetSwitch_allNull_returnsNull() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        assertNull(cl.getSwitch(opt, null));
    }

    @Test
    public void testSetDefaultSwitch_removeWithNull() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.setDefaultSwitch(opt, Boolean.TRUE);
        cl.setDefaultSwitch(opt, null);
        assertNull(cl.getSwitch(opt, null));
    }

    // ---------- Property tests (Option-based, deterministic) ----------

    @Test
    public void testAddAndGetProperty_withOption() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.addProperty(opt, "key1", "value1");
        assertEquals("value1", cl.getProperty(opt, "key1", "default"));
    }

    @Test
    public void testGetProperty_missingProperty_returnsDefault() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.addProperty(opt, "key1", "value1");
        assertEquals("default", cl.getProperty(opt, "missing", "default"));
    }

    @Test
    public void testGetProperty_optionNeverAdded_returnsDefault() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        assertEquals("default", cl.getProperty(opt, "key1", "default"));
    }

    @Test
    public void testAddProperty_multiplePropertiesSameOption() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.addProperty(opt, "key1", "value1");
        cl.addProperty(opt, "key2", "value2");
        Set props = cl.getProperties(opt);
        assertEquals(2, props.size());
        assertTrue(props.contains("key1"));
        assertTrue(props.contains("key2"));
    }

    @Test
    public void testGetProperties_optionNeverAdded_returnsEmptySet() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        Set props = cl.getProperties(opt);
        assertNotNull(props);
        assertTrue(props.isEmpty());
    }

    @Test
    public void testGetProperties_unmodifiable() {
        WriteableCommandLineImpl cl = newCommandLine();
        Option opt = new StubOption("opt", new HashSet(), new HashSet());
        cl.addProperty(opt, "key1", "value1");
        Set props = cl.getProperties(opt);
        try {
            props.add("newKey");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- Property tests (String-based PropertyOption overloads) ----------

    @Test
    public void testAddAndGetProperty_stringOverloads_doNotThrow() {
        WriteableCommandLineImpl cl = newCommandLine();
        cl.addProperty("foo", "bar");
        Set properties = cl.getProperties();
        assertNotNull(properties);
        String value = cl.getProperty("foo");
        assertTrue(value == null || value.equals("bar"));
    }

    // ---------- looksLikeOption ----------

    @Test
    public void testLooksLikeOption_variants() {
        WriteableCommandLineImpl cl = newCommandLine();
        assertTrue(cl.looksLikeOption("-a"));
        assertTrue(cl.looksLikeOption("--a"));
        assertFalse(cl.looksLikeOption("a"));
        assertFalse(cl.looksLikeOption(""));
    }

    @Test
    public void testLooksLikeOption_noPrefixes() {
        Option noPrefixRoot = new StubOption("root", new HashSet(), new HashSet());
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(noPrefixRoot, new ArrayList());
        assertFalse(cl.looksLikeOption("-a"));
    }

    // ---------- toString ----------

    @Test
    public void testToString_emptyArguments() {
        WriteableCommandLineImpl cl = newCommandLine(new ArrayList());
        assertEquals("", cl.toString());
    }

    @Test
    public void testToString_singleArgumentNoSpace() {
        WriteableCommandLineImpl cl = newCommandLine(Arrays.asList(new String[] { "hello" }));
        assertEquals("hello", cl.toString());
    }

    @Test
    public void testToString_argumentWithSpace() {
        WriteableCommandLineImpl cl = newCommandLine(Arrays.asList(new String[] { "hello world" }));
        assertEquals("\"hello world\"", cl.toString());
    }

    @Test
    public void testToString_multipleArguments() {
        WriteableCommandLineImpl cl = newCommandLine(Arrays.asList(new String[] { "--verbose", "foo bar", "baz" }));
        assertEquals("--verbose \"foo bar\" baz", cl.toString());
    }

    // ---------- getNormalised ----------

    @Test
    public void testGetNormalised_unmodifiable() {
        List args = new ArrayList();
        args.add("a");
        WriteableCommandLineImpl cl = newCommandLine(args);
        List normalised = cl.getNormalised();
        assertEquals(args, normalised);
        try {
            normalised.add("b");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
}