package org.apache.commons.cli2.commandline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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

        public int getId() {
            return 0;
        }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            throw new UnsupportedOperationException();
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public void process(WriteableCommandLine commandLine, ListIterator arguments) throws OptionException {
            throw new UnsupportedOperationException();
        }

        public Set getTriggers() {
            return triggers;
        }

        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) {
            throw new UnsupportedOperationException();
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            throw new UnsupportedOperationException();
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
            throw new UnsupportedOperationException();
        }

        public void validate(WriteableCommandLine commandLine) throws OptionException {
            throw new UnsupportedOperationException();
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            throw new UnsupportedOperationException();
        }

        public void defaults(WriteableCommandLine commandLine) {
            throw new UnsupportedOperationException();
        }

        public boolean isRequired() {
            throw new UnsupportedOperationException();
        }
    }

    private static class StubArgument extends StubOption implements Argument {
        StubArgument(String preferredName, Set triggers, Set prefixes) {
            super(preferredName, triggers, prefixes);
        }

        public String getConsumeRemaining() {
            throw new UnsupportedOperationException();
        }

        public List getDefaultValues() {
            throw new UnsupportedOperationException();
        }

        public String getInitialSeparator() {
            throw new UnsupportedOperationException();
        }

        public String getSubsequentSeparator() {
            throw new UnsupportedOperationException();
        }

        public int getMinimum() {
            throw new UnsupportedOperationException();
        }

        public int getMaximum() {
            throw new UnsupportedOperationException();
        }

        public boolean isGreedy() {
            throw new UnsupportedOperationException();
        }

        public Object getValue(WriteableCommandLine commandLine) throws OptionException {
            throw new UnsupportedOperationException();
        }

        public Object getValue(WriteableCommandLine commandLine, Object defaultValue) throws OptionException {
            throw new UnsupportedOperationException();
        }

        public List getValues(WriteableCommandLine commandLine, List defaultValues) {
            throw new UnsupportedOperationException();
        }

        public void validate(WriteableCommandLine commandLine, Option option) throws OptionException {
            throw new UnsupportedOperationException();
        }
    }

    private Option rootOption;
    private WriteableCommandLineImpl commandLine;

    @Before
    public void setUp() {
        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");
        rootOption = new StubOption("root", Collections.EMPTY_SET, prefixes);
        List args = new ArrayList();
        args.add("a");
        args.add("b");
        commandLine = new WriteableCommandLineImpl(rootOption, args);
    }

    @Test
    public void testConstructorAndNormalised() {
        List normalised = commandLine.getNormalised();
        assertEquals(2, normalised.size());
        assertEquals("a", normalised.get(0));
        assertEquals("b", normalised.get(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testNormalisedUnmodifiable() {
        List normalised = commandLine.getNormalised();
        normalised.add("c");
    }

    @Test
    public void testAddOptionAndHasOption() {
        Set triggers = new HashSet();
        triggers.add("optionA");
        triggers.add("-a");
        Option optionA = new StubOption("optionA", triggers, Collections.EMPTY_SET);

        commandLine.addOption(optionA);

        assertTrue(commandLine.hasOption(optionA));
        assertEquals(optionA, commandLine.getOption("optionA"));
        assertEquals(optionA, commandLine.getOption("-a"));

        List opts = commandLine.getOptions();
        assertEquals(1, opts.size());
        assertTrue(opts.contains(optionA));
    }

    @Test
    public void testHasOptionFalseForUnknown() {
        Option optionA = new StubOption("optionA", Collections.EMPTY_SET, Collections.EMPTY_SET);
        assertFalse(commandLine.hasOption(optionA));
    }

    @Test
    public void testGetOptionUnknownTriggerReturnsNull() {
        assertNull(commandLine.getOption("unknown"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptionsUnmodifiable() {
        List opts = commandLine.getOptions();
        opts.add(new StubOption("x", Collections.EMPTY_SET, Collections.EMPTY_SET));
    }

    @Test
    public void testGetOptionTriggers() {
        Set triggers = new HashSet();
        triggers.add("optA");
        triggers.add("-a");
        Option optionA = new StubOption("optA", triggers, Collections.EMPTY_SET);
        commandLine.addOption(optionA);

        Set optionTriggers = commandLine.getOptionTriggers();
        assertTrue(optionTriggers.contains("optA"));
        assertTrue(optionTriggers.contains("-a"));
    }

    @Test
    public void testAddValueWithArgumentAutoAddsOption() {
        Argument argOption = new StubArgument("argA", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.addValue(argOption, "value1");
        commandLine.addValue(argOption, "value2");

        assertTrue(commandLine.hasOption(argOption));

        List values = commandLine.getValues(argOption, null);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }

    @Test
    public void testAddValueWithNonArgumentDoesNotAutoAddOption() {
        Option optionB = new StubOption("optionB", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.addValue(optionB, "x");

        assertFalse(commandLine.hasOption(optionB));

        List values = commandLine.getValues(optionB, null);
        assertEquals(1, values.size());
        assertEquals("x", values.get(0));
    }

    @Test
    public void testAddSwitchNormal() {
        Option optionC = new StubOption("optionC", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.addSwitch(optionC, true);

        assertTrue(commandLine.hasOption(optionC));
        assertEquals(Boolean.TRUE, commandLine.getSwitch(optionC, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchTwiceThrowsException() {
        Option optionC = new StubOption("optionC", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.addSwitch(optionC, true);
        commandLine.addSwitch(optionC, false);
    }

    @Test
    public void testGetValuesEmptyWhenNoValuesNoDefaults() {
        Option optionD = new StubOption("optionD", Collections.EMPTY_SET, Collections.EMPTY_SET);
        List result = commandLine.getValues(optionD, null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetValuesUsesMethodDefaultWhenNoValues() {
        Option optionD = new StubOption("optionD", Collections.EMPTY_SET, Collections.EMPTY_SET);
        List defaults = Arrays.asList(new String[]{"d1"});
        List result = commandLine.getValues(optionD, defaults);
        assertEquals(defaults, result);
    }

    @Test
    public void testGetValuesUsesOptionDefaultWhenNoValuesAndNoMethodDefault() {
        Option optionD = new StubOption("optionD", Collections.EMPTY_SET, Collections.EMPTY_SET);
        List optionDefaults = Arrays.asList(new String[]{"def"});
        commandLine.setDefaultValues(optionD, optionDefaults);

        List result = commandLine.getValues(optionD, null);
        assertEquals(optionDefaults, result);

        List result2 = commandLine.getValues(optionD, Collections.EMPTY_LIST);
        assertEquals(optionDefaults, result2);
    }

    @Test
    public void testGetValuesIgnoresDefaultsWhenValuesPresent() {
        Option optionD = new StubOption("optionD", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addValue(optionD, "v1");

        List result = commandLine.getValues(optionD, Arrays.asList(new String[]{"ignored"}));
        assertEquals(1, result.size());
        assertEquals("v1", result.get(0));
    }

    @Test
    public void testSetDefaultValuesNullRemoves() {
        Option optionD = new StubOption("optionD", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultValues(optionD, Arrays.asList(new String[]{"def"}));
        commandLine.setDefaultValues(optionD, null);

        List result = commandLine.getValues(optionD, null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetSwitchNullWhenNothingSet() {
        Option optionE = new StubOption("optionE", Collections.EMPTY_SET, Collections.EMPTY_SET);
        Boolean result = commandLine.getSwitch(optionE, null);
        assertNull(result);
    }

    @Test
    public void testGetSwitchUsesMethodDefault() {
        Option optionE = new StubOption("optionE", Collections.EMPTY_SET, Collections.EMPTY_SET);
        Boolean result = commandLine.getSwitch(optionE, Boolean.TRUE);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGetSwitchUsesOptionDefaultWhenNoMethodDefault() {
        Option optionE = new StubOption("optionE", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultSwitch(optionE, Boolean.TRUE);

        Boolean result = commandLine.getSwitch(optionE, null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGetSwitchIgnoresDefaultsWhenSet() {
        Option optionE = new StubOption("optionE", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addSwitch(optionE, false);
        commandLine.setDefaultSwitch(optionE, Boolean.TRUE);

        Boolean result = commandLine.getSwitch(optionE, Boolean.TRUE);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testSetDefaultSwitchNullRemoves() {
        Option optionE = new StubOption("optionE", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultSwitch(optionE, Boolean.TRUE);
        commandLine.setDefaultSwitch(optionE, null);

        Boolean result = commandLine.getSwitch(optionE, null);
        assertNull(result);
    }

    @Test
    public void testAddAndGetProperty() {
        commandLine.addProperty("key1", "value1");
        assertEquals("value1", commandLine.getProperty("key1", "default"));
    }

    @Test
    public void testGetPropertyDefaultWhenMissing() {
        assertEquals("default", commandLine.getProperty("missing", "default"));
    }

    @Test
    public void testGetPropertiesEmptyInitially() {
        Set props = commandLine.getProperties();
        assertTrue(props.isEmpty());
    }

    @Test
    public void testGetPropertiesContainsAdded() {
        commandLine.addProperty("k1", "v1");
        commandLine.addProperty("k2", "v2");

        Set props = commandLine.getProperties();
        assertEquals(2, props.size());
        assertTrue(props.contains("k1"));
        assertTrue(props.contains("k2"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetPropertiesUnmodifiable() {
        Set props = commandLine.getProperties();
        props.add("newkey");
    }

    @Test
    public void testLooksLikeOptionTrueForMatchingPrefix() {
        assertTrue(commandLine.looksLikeOption("-a"));
        assertTrue(commandLine.looksLikeOption("--long"));
    }

    @Test
    public void testLooksLikeOptionFalseForNonMatching() {
        assertFalse(commandLine.looksLikeOption("abc"));
    }

    @Test
    public void testLooksLikeOptionFalseWhenNoPrefixes() {
        Option rootNoPrefix = new StubOption("root2", Collections.EMPTY_SET, Collections.EMPTY_SET);
        List args = new ArrayList();
        WriteableCommandLineImpl cl2 = new WriteableCommandLineImpl(rootNoPrefix, args);
        assertFalse(cl2.looksLikeOption("-a"));
    }

    @Test
    public void testToStringNoSpaces() {
        List args = new ArrayList();
        args.add("a");
        args.add("b");
        WriteableCommandLineImpl cl2 = new WriteableCommandLineImpl(rootOption, args);
        assertEquals("a b", cl2.toString());
    }

    @Test
    public void testToStringWithSpaces() {
        List args = new ArrayList();
        args.add("hello world");
        args.add("b");
        WriteableCommandLineImpl cl2 = new WriteableCommandLineImpl(rootOption, args);
        assertEquals("\"hello world\" b", cl2.toString());
    }

    @Test
    public void testToStringEmpty() {
        List args = new ArrayList();
        WriteableCommandLineImpl cl2 = new WriteableCommandLineImpl(rootOption, args);
        assertEquals("", cl2.toString());
    }

    @Test
    public void testToStringSingleElement() {
        List args = new ArrayList();
        args.add("single");
        WriteableCommandLineImpl cl2 = new WriteableCommandLineImpl(rootOption, args);
        assertEquals("single", cl2.toString());
    }
}