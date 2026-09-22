package org.apache.commons.cli2.option;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.junit.Before;
import org.junit.Test;

public class GroupImplTest {
    private GroupImpl group;
    private List<Option> options;
    private WriteableCommandLine commandLine;
    private ListIterator<String> arguments;

    @Before
    public void setUp() {
        options = new ArrayList<Option>();
        options.add(new ArgumentImpl());
        group = new GroupImpl(options, "testGroup", "group description", 0, 2);
        commandLine = new WriteableCommandLineImpl();
        arguments = new ArrayList<String>().listIterator();
    }

    @Test
    public void testConstructorWithNullOptions() {
        try {
            new GroupImpl(null, "name", "desc", 0, 1);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testCanProcessWithNullArgument() {
        assertFalse(group.canProcess(commandLine, null));
    }

    @Test
    public void testCanProcessWithEmptyString() {
        assertFalse(group.canProcess(commandLine, ""));
    }

    @Test
    public void testCanProcessWithValidOption() {
        Option option = new OptionImpl();
        options.add(option);
        GroupImpl g = new GroupImpl(options, "name", "desc", 0, 1);
        assertTrue(g.canProcess(commandLine, "trigger"));
    }

    @Test
    public void testCanProcessWithAnonymousArgument() {
        List<Option> opts = new ArrayList<Option>();
        opts.add(new ArgumentImpl());
        GroupImpl g = new GroupImpl(opts, "name", "desc", 0, 1);
        assertFalse(g.canProcess(commandLine, "-x"));
    }

    @Test
    public void testGetPrefixes() {
        Set<String> prefixes = group.getPrefixes();
        assertNotNull(prefixes);
    }

    @Test
    public void testGetTriggers() {
        Set<String> triggers = group.getTriggers();
        assertNotNull(triggers);
    }

    @Test
    public void testGetOptions() {
        assertEquals(options, group.getOptions());
    }

    @Test
    public void testGetAnonymous() {
        assertNotNull(group.getAnonymous());
    }

    @Test
    public void testFindOptionWithNull() {
        assertNull(group.findOption(null));
    }

    @Test
    public void testFindOptionWithNonExistent() {
        assertNull(group.findOption("nonexistent"));
    }

    @Test
    public void testFindOptionWithValidTrigger() {
        Option option = new OptionImpl();
        List<Option> opts = new ArrayList<Option>();
        opts.add(option);
        GroupImpl g = new GroupImpl(opts, "name", "desc", 0, 1);
        assertNotNull(g.findOption("trigger"));
    }

    @Test
    public void testGetMinimum() {
        assertEquals(0, group.getMinimum());
    }

    @Test
    public void testGetMaximum() {
        assertEquals(2, group.getMaximum());
    }

    @Test
    public void testIsRequiredWithMinimumZero() {
        assertFalse(group.isRequired());
    }

    @Test
    public void testIsRequiredWithPositiveMinimum() {
        GroupImpl g = new GroupImpl(options, "name", "desc", 1, 2);
        assertTrue(g.isRequired());
    }

    @Test
    public void testProcessWithNoArguments() throws Exception {
        group.process(commandLine, arguments);
    }

    @Test
    public void testProcessWithSingleValidArgument() throws Exception {
        arguments = new ArrayList<String>().listIterator();
        arguments.add("test");
        group.process(commandLine, arguments);
    }

    @Test
    public void testValidateWithEnoughOptions() throws Exception {
        GroupImpl g = new GroupImpl(options, "name", "desc", 0, 1);
        g.validate(commandLine);
    }

    @Test
    public void testValidateWithTooFewOptions() {
        GroupImpl g = new GroupImpl(options, "name", "desc", 1, 1);
        try {
            g.validate(commandLine);
            fail("Expected OptionException");
        } catch (OptionException e) {
        }
    }

    @Test
    public void testValidateWithTooManyOptions() {
        Option option = new OptionImpl();
        List<Option> opts = new ArrayList<Option>();
        opts.add(option);
        GroupImpl g = new GroupImpl(opts, "name", "desc", 0, 0);
        commandLine.addOption(option);
        try {
            g.validate(commandLine);
            fail("Expected OptionException");
        } catch (OptionException e) {
        }
    }

    @Test
    public void testGetPreferredName() {
        assertEquals("testGroup", group.getPreferredName());
    }

    @Test
    public void testGetDescription() {
        assertEquals("group description", group.getDescription());
    }

    @Test
    public void testAppendUsageBasic() {
        StringBuffer buffer = new StringBuffer();
        Set set = new HashSet();
        set.add(DisplaySetting.DISPLAY_GROUP_NAME);
        group.appendUsage(buffer, set, null);
        assertTrue(buffer.length() > 0);
    }

    @Test
    public void testAppendUsageWithNoSettings() {
        StringBuffer buffer = new StringBuffer();
        Set set = DisplaySetting.NONE;
        group.appendUsage(buffer, set, null);
    }

    @Test
    public void testHelpLines() {
        Set set = DisplaySetting.NONE;
        List lines = group.helpLines(0, set, null);
        assertNotNull(lines);
        assertEquals(0, lines.size());
    }

    @Test
    public void testHelpLinesWithName() {
        Set set = new HashSet();
        set.add(DisplaySetting.DISPLAY_GROUP_NAME);
        List lines = group.helpLines(0, set, null);
        assertNotNull(lines);
        assertEquals(1, lines.size());
    }

    @Test
    public void testHelpLinesWithExpanded() {
        Set set = new HashSet();
        set.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        List lines = group.helpLines(0, set, null);
        assertNotNull(lines);
    }

    @Test
    public void testReverseStringComparator() {
        Comparator comp = ReverseStringComparator.getInstance();
        assertSame(ReverseStringComparator.getInstance(), comp);
        assertTrue(comp.compare("a", "b") > 0);
        assertEquals(0, comp.compare("a", "a"));
        assertTrue(comp.compare("b", "a") < 0);
    }

    @Test
    public void testDefaults() {
        group.defaults(commandLine);
    }

    @Test
    public void testNullNameAndDescription() {
        List<Option> opts = new ArrayList<Option>();
        GroupImpl g = new GroupImpl(opts, null, null, 0, 1);
        assertNull(g.getPreferredName());
        assertNull(g.getDescription());
    }

    private class ArgumentImpl extends OptionImpl {
        public ArgumentImpl() {
            super(0, false);
        }

        @Override
        public boolean canProcess(WriteableCommandLine commandLine, String arg) {
            return true;
        }

        @Override
        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            return new ArrayList();
        }

        @Override
        public void process(WriteableCommandLine commandLine, ListIterator arguments) {
        }

        @Override
        public void defaults(WriteableCommandLine commandLine) {
        }

        @Override
        public Set getPrefixes() {
            Set set = new HashSet();
            set.add("-");
            return set;
        }

        @Override
        public Set getTriggers() {
            Set set = new HashSet();
            set.add("arg");
            return set;
        }

        @Override
        public String getPreferredName() {
            return "arg";
        }

        @Override
        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
        }
    }

    private class OptionImpl implements Option {
        public boolean canProcess(WriteableCommandLine commandLine, String arg) {
            return arg != null && arg.equals("trigger");
        }

        public Set getPrefixes() {
            Set set = new HashSet();
            set.add("-");
            return set;
        }

        public Set getTriggers() {
            Set set = new HashSet();
            set.add("trigger");
            return set;
        }

        public void process(WriteableCommandLine commandLine, ListIterator arguments) {
        }

        public void validate(WriteableCommandLine commandLine) {
        }

        public void defaults(WriteableCommandLine commandLine) {
        }

        public String getPreferredName() {
            return "trigger";
        }

        public String getDescription() {
            return "option";
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            return new ArrayList();
        }

        public boolean isRequired() {
            return false;
        }
    }

    private class WriteableCommandLineImpl implements WriteableCommandLine {
        private List options = new ArrayList();

        public void addOption(Option option) {
            options.add(option);
        }

        public boolean hasOption(Option option) {
            return options.contains(option);
        }

        public boolean hasOption(String trigger) {
            return options.contains(trigger);
        }

        public boolean looksLikeOption(String arg) {
            return arg != null && arg.startsWith("-");
        }

        public void addValue(Option option, Object value) {
        }

        public Object getValue(String option) {
            return null;
        }

        public Set getOptions() {
            return new HashSet();
        }
    }
}