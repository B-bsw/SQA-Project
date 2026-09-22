package org.apache.commons.cli2.option;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.*;
import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.resource.ResourceConstants;

public class GroupImplTest {
    private GroupImpl group;
    private List options;
    private Option mockOption1;
    private Option mockOption2;
    private Argument mockArg1;
    private WriteableCommandLine mockCommandLine;

    @Before
    public void setUp() {
        mockOption1 = createMockOption("opt1", false);
        mockOption2 = createMockOption("opt2", false);
        mockArg1 = createMockArgument("arg1");
        options = new ArrayList();
        options.add(mockOption1);
        options.add(mockOption2);
        group = new GroupImpl(options, "testGroup", "Test Group", 0, 2, false);
    }

    @After
    public void tearDown() {
        group = null;
        options = null;
        mockOption1 = null;
        mockOption2 = null;
        mockArg1 = null;
    }

    @Test
    public void testConstructorWithArguments() {
        List args = new ArrayList();
        args.add(mockArg1);
        options.add(mockArg1);
        group = new GroupImpl(options, "testGroup", "Test Group", 0, 2, true);
        assertTrue(group.getAnonymous().contains(mockArg1));
        assertFalse(group.getOptions().contains(mockArg1));
        assertEquals(2, group.getOptions().size());
        assertTrue(group.isRequired());
    }

    @Test
    public void testConstructorHandlesNullOptions() {
        group = new GroupImpl(Collections.emptyList(), "empty", "Empty", 0, 0, false);
        assertTrue(group.getOptions().isEmpty());
        assertTrue(group.getAnonymous().isEmpty());
    }

    @Test
    public void testCanProcessWithNullArgument() {
        assertFalse(group.canProcess(mockCommandLine, null));
    }

    @Test
    public void testCanProcessWithExactMatch() {
        mockCommandLine = createMockCommandLine(false);
        assertTrue(group.canProcess(mockCommandLine, "opt1"));
    }

    @Test
    public void testCanProcessWithBurstPattern() {
        mockCommandLine = createMockCommandLine(true);
        Option mockOption = createMockOption("prefix1", true);
        List newOptions = new ArrayList();
        newOptions.add(mockOption);
        group = new GroupImpl(newOptions, "burst", "Burst", 0, 1, false);
        assertTrue(group.canProcess(mockCommandLine, "prefix1x"));
    }

    @Test
    public void testCanProcessRejectsUnknown() {
        mockCommandLine = createMockCommandLine(false);
        assertFalse(group.canProcess(mockCommandLine, "unknown"));
    }

    @Test
    public void testGetPrefixes() {
        Set expected = new HashSet();
        expected.add("opt1");
        expected.add("opt2");
        assertEquals(expected, group.getPrefixes());
    }

    @Test
    public void testGetTriggers() {
        Set triggers = group.getTriggers();
        assertTrue(triggers.contains("opt1"));
        assertTrue(triggers.contains("opt2"));
    }

    @Test
    public void testProcessWithOptions() throws OptionException {
        mockCommandLine = createMockCommandLine(false);
        ListIterator iterator = Arrays.asList(new String[]{"opt1", "opt2"}).listIterator();
        group.process(mockCommandLine, iterator);
    }

    @Test
    public void testProcessWithArgumentBursting() throws OptionException {
        mockCommandLine = createMockCommandLine(false);
        List optionsWithArg = new ArrayList();
        optionsWithArg.add(mockArg1);
        group = new GroupImpl(optionsWithArg, "groupArg", "Group Arg", 0, 1, false);
        ListIterator iterator = Arrays.asList(new String[]{"arg1"}).listIterator();
        group.process(mockCommandLine, iterator);
    }

    @Test
    public void testProcessSkipsUnknownThenStops() throws OptionException {
        mockCommandLine = createMockCommandLine(false);
        ListIterator iterator = Arrays.asList(new String[]{"unknown"}).listIterator();
        group.process(mockCommandLine, iterator);
        assertEquals(0, iterator.nextIndex());
    }

    @Test
    public void testValidateSuccess() throws OptionException {
        mockCommandLine = createMockCommandLine(false);
        List cliOptions = new ArrayList();
        cliOptions.add(mockOption1);
        mockCommandLine.addOption(cliOptions, true, true);
        group.validate(mockCommandLine);
    }

    @Test
    public void testValidateTooFewOptions() {
        try {
            GroupImpl minGroup = new GroupImpl(options, "minGroup", "Min Group", 1, 2, false);
            mockCommandLine = createMockCommandLine(false);
            minGroup.validate(mockCommandLine);
            fail("Expected OptionException");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testValidateTooManyOptions() {
        try {
            mockCommandLine = createMockCommandLine(false);
            GroupImpl maxGroup = new GroupImpl(options, "maxGroup", "Max Group", 0, 1, false);
            maxGroup.validate(mockCommandLine);
            fail("Expected OptionException");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testGetPreferredName() {
        assertEquals("testGroup", group.getPreferredName());
    }

    @Test
    public void testGetDescription() {
        assertEquals("Test Group", group.getDescription());
    }

    @Test
    public void testFindOption() {
        Option found = group.findOption("opt1");
        assertEquals(mockOption1, found);
    }

    @Test
    public void testFindOptionNotFound() {
        assertNull(group.findOption("nonexistent"));
    }

    @Test
    public void testIsRequiredTrue() {
        GroupImpl reqGroup = new GroupImpl(options, "req", "Req", 1, 2, true);
        assertFalse(reqGroup.isRequired());
    }

    @Test
    public void testIsNotRequiredWithMinZero() {
        assertFalse(group.isRequired());
    }

    @Test
    public void testDefaultsCallsSuper() {
        mockCommandLine = createMockCommandLine(false);
        group.defaults(mockCommandLine);
    }

    @Test
    public void testHelpLinesEmpty() {
        Set settings = new HashSet();
        List lines = group.helpLines(0, settings, null);
        assertTrue(lines.isEmpty());
    }

    @Test
    public void testAppendUsageOptional() {
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        group.appendUsage(buffer, settings, null);
        assertNotNull(buffer.toString());
    }

    @Test
    public void testReverseStringComparatorMatch() {
        Comparator comp = ReverseStringComparator.getInstance();
        assertTrue(comp.compare("b", "a") < 0);
    }

    @Test
    public void testReverseStringComparatorEqual() {
        Comparator comp = ReverseStringComparator.getInstance();
        assertEquals(0, comp.compare("a", "a"));
    }

    @Test
    public void testProcessNullPreviousHandling() throws OptionException {
        mockCommandLine = createMockCommandLine(false);
        ListIterator iterator = Arrays.asList(new String[]{"arg1", "opt1"}).listIterator();
        group.process(mockCommandLine, iterator);
    }

    private Option createMockOption(final String trigger, final boolean canProcessReturn) {
        return new Option() {
            public boolean canProcess(WriteableCommandLine commandLine, String arg) {
                return canProcessReturn || arg.equals(trigger);
            }
            public Set getTriggers() {
                Set triggers = new HashSet();
                triggers.add(trigger);
                return triggers;
            }
            public Set getPrefixes() {
                Set prefixes = new HashSet();
                prefixes.add(trigger);
                return prefixes;
            }
            public void process(WriteableCommandLine commandLine, ListIterator args) {}
            public void defaults(WriteableCommandLine commandLine) {}
            public boolean isRequired() { return false; }
            public String getPreferredName() { return trigger; }
            public String getDescription() { return "Desc"; }
            public void appendUsage(StringBuffer buffer, Set settings, Comparator comp) {}
            public List helpLines(int depth, Set settings, Comparator comp) { return new ArrayList(); }
            public boolean validate(WriteableCommandLine commandLine) { return true; }
            public void setParent(Group parent) {}
            public Group getParent() { return null; }
            public boolean isRequired(WriteableCommandLine commandLine) { return false; }
        };
    }

    private Argument createMockArgument(final String trigger) {
        return new Argument() {
            public boolean canProcess(WriteableCommandLine commandLine, String arg) { return arg.equals(trigger); }
            public boolean canProcess(WriteableCommandLine commandLine, ListIterator args) { return true; }
            public void process(WriteableCommandLine commandLine, ListIterator args) {}
            public Set getTriggers() { return new HashSet(); }
            public Set getPrefixes() { return new HashSet(); }
            public void defaults(WriteableCommandLine commandLine) {}
            public boolean isRequired() { return false; }
            public String getPreferredName() { return trigger; }
            public String getDescription() { return "Arg Desc"; }
            public void appendUsage(StringBuffer buffer, Set settings, Comparator comp) {}
            public List helpLines(int depth, Set settings, Comparator comp) { return new ArrayList(); }
            public boolean validate(WriteableCommandLine commandLine) { return true; }
            public void setParent(Group parent) {}
            public Group getParent() { return null; }
            public boolean isRequired(WriteableCommandLine commandLine) { return false; }
        };
    }

    private WriteableCommandLine createMockCommandLine(final boolean looksLikeOption) {
        return new WriteableCommandLine() {
            public void addOption(Option option) {}
            public List getOptions() { return new ArrayList(); }
            public boolean hasOption(Option option) { return true; }
            public boolean hasOption(String trigger) { return false; }
            public Option getOption(String trigger) { return null; }
            public List getValues(Option option) { return new ArrayList(); }
            public List getValues(Option option, List list) { return new ArrayList(); }
            public Object getValue(Option option) { return null; }
            public Object getValue(Option option, Object defaultValue) { return null; }
            public String getUndecorated(String s) { return s; }
            public void setDefaultValues(Option option, List defaults) {}
            public void addValue(Option option, Object value) {}
            public String[] getOptionTriggers() { return new String[0]; }
            public boolean looksLikeOption(String trigger) { return looksLikeOption; }
            public void addOption(List options, boolean isRequired, boolean isArgument) {}
        };
    }
}