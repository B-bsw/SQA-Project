package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GroupImplTest {
    private GroupImpl group;
    private GroupImpl groupNoArgs;
    private GroupImpl groupRequired;
    private final WriteableCommandLine commandLine = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(null, null, null);

    @Before
    public void setUp() {
        final Argument arg1 = new org.apache.commons.cli2.option.ArgumentImpl("arg1", "arg1", 0, 1, 1, null);
        final Argument arg2 = new org.apache.commons.cli2.option.ArgumentImpl("arg2", "arg2", 0, 1, 1, null);
        final Option opt1 = new org.apache.commons.cli2.option.OptionImpl("opt1", "opt1", false, false) {
            public boolean canProcess(WriteableCommandLine commandLine, String arg) { return "opt1".equals(arg); }
            public Set getPrefixes() { return new HashSet<String>(Arrays.asList("-")); }
            public Set getTriggers() { return new HashSet<String>(Arrays.asList("opt1")); }
            public void process(WriteableCommandLine commandLine, ListIterator arguments) { }
            public String getPreferredName() { return "opt1"; }
            public String getDescription() { return "opt1"; }
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) { }
            public List helpLines(int depth, Set helpSettings, Comparator comp) { return new ArrayList(); }
            public void validate(WriteableCommandLine commandLine) { }
            public void defaults(WriteableCommandLine commandLine) { }
            public boolean isRequired() { return false; }
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp, String separator) { }
        };
        final Option opt2 = new org.apache.commons.cli2.option.OptionImpl("opt2", "opt2", false, false) {
            public boolean canProcess(WriteableCommandLine commandLine, String arg) { return "opt2".equals(arg); }
            public Set getPrefixes() { return new HashSet<String>(Arrays.asList("--")); }
            public Set getTriggers() { return new HashSet<String>(Arrays.asList("opt2")); }
            public void process(WriteableCommandLine commandLine, ListIterator arguments) { }
            public String getPreferredName() { return "opt2"; }
            public String getDescription() { return "opt2"; }
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) { }
            public List helpLines(int depth, Set helpSettings, Comparator comp) { return new ArrayList(); }
            public void validate(WriteableCommandLine commandLine) { }
            public void defaults(WriteableCommandLine commandLine) { }
            public boolean isRequired() { return false; }
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp, String separator) { }
        };
        final List options = new ArrayList();
        options.add(arg1);
        options.add(opt1);
        options.add(arg2);
        options.add(opt2);
        group = new GroupImpl(options, "group", "group desc", 0, 2);
        groupNoArgs = new GroupImpl(new ArrayList(), "none", "no args", 0, 0);
        final List requiredOptions = new ArrayList();
        requiredOptions.add(opt1);
        groupRequired = new GroupImpl(requiredOptions, "req", "required", 1, 1);
    }

    @After
    public void tearDown() {
        group = null;
        groupNoArgs = null;
        groupRequired = null;
    }

    @Test
    public void testConstructor() {
        assertEquals("group", group.getPreferredName());
        assertEquals("group desc", group.getDescription());
        assertEquals(0, group.getMinimum());
        assertEquals(2, group.getMaximum());
        assertEquals(2, group.getOptions().size());
        assertEquals(2, group.getAnonymous().size());
        assertNotNull(group.getPrefixes());
        assertNotNull(group.getTriggers());
        assertEquals(2, group.getTriggers().size());
        assertTrue(group.getPrefixes().contains("-"));
        assertTrue(group.getPrefixes().contains("--"));
    }

    @Test
    public void testConstructorNullDescription() {
        final GroupImpl g = new GroupImpl(new ArrayList(), "name", null, 0, 1);
        assertNull(g.getDescription());
    }

    @Test
    public void testGetOptionsUnmodifiable() {
        try {
            group.getOptions().add(new Object());
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetAnonymousUnmodifiable() {
        try {
            group.getAnonymous().add(null);
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testCanProcessNull() {
        assertFalse(group.canProcess(commandLine, null));
    }

    @Test
    public void testCanProcessExisting() {
        assertTrue(group.canProcess(commandLine, "opt1"));
        assertTrue(group.canProcess(commandLine, "opt2"));
    }

    @Test
    public void testCanProcessAnonymous() {
        org.apache.commons.cli2.commandline.WriteableCommandLineImpl cmd = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(null, null, null) {
            public boolean looksLikeOption(String arg) { return false; }
        };
        assertTrue(group.canProcess(cmd, "anything"));
    }

    @Test
    public void testCanProcessAnonymousWithLookLikeOption() {
        groupNoArgs.canProcess(commandLine, "opt1");
    }

    @Test
    public void testGetPrefixesEmpty() {
        assertTrue(groupNoArgs.getPrefixes().isEmpty());
    }

    @Test
    public void testFindOption() {
        assertNotNull(group.findOption("opt1"));
        assertNull(group.findOption("nonexistent"));
    }

    @Test
    public void testIsRequired() {
        assertFalse(group.isRequired());
        assertTrue(groupRequired.isRequired());
    }

    @Test
    public void testValidateTooMany() {
        final List list = new ArrayList();
        final Option opt = new org.apache.commons.cli2.option.OptionImpl("opt", "opt", false, false) {
            public boolean canProcess(WriteableCommandLine commandLine, String arg) { return true; }
            public Set getPrefixes() { return new HashSet<String>(Arrays.asList("-")); }
            public Set getTriggers() { return new HashSet<String>(Arrays.asList("opt")); }
            public void process(WriteableCommandLine commandLine, ListIterator arguments) { }
            public String getPreferredName() { return "opt"; }
            public String getDescription() { return "opt"; }
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) { }
            public List helpLines(int depth, Set helpSettings, Comparator comp) { return new ArrayList(); }
            public void validate(WriteableCommandLine commandLine) { }
            public void defaults(WriteableCommandLine commandLine) { }
            public boolean isRequired() { return false; }
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp, String separator) { }
        };
        final GroupImpl maxGroup = new GroupImpl(Arrays.asList(opt), "max", "max", 0, 1);
        final WriteableCommandLine cmd = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(null, null, null) {
            public boolean hasOption(Option option) { return true; }
        };
        try {
            maxGroup.validate(cmd);
            fail("Expected OptionException");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testValidateTooFew() {
        final GroupImpl minGroup = new GroupImpl(new ArrayList(), "min", "min", 2, 3);
        final WriteableCommandLine cmd = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(null, null, null) {
            public boolean hasOption(Option option) { return false; }
        };
        try {
            minGroup.validate(cmd);
            fail("Expected OptionException");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testValidateSuccess() throws OptionException {
        final Option opt = new org.apache.commons.cli2.option.OptionImpl("opt", "opt", false, false) {
            public boolean canProcess(WriteableCommandLine commandLine, String arg) { return true; }
            public Set getPrefixes() { return new HashSet<String>(Arrays.asList("-")); }
            public Set getTriggers() { return new HashSet<String>(Arrays.asList("opt")); }
            public void process(WriteableCommandLine commandLine, ListIterator arguments) { }
            public String getPreferredName() { return "opt"; }
            public String getDescription() { return "opt"; }
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) { }
            public List helpLines(int depth, Set helpSettings, Comparator comp) { return new ArrayList(); }
            public void validate(WriteableCommandLine commandLine) { }
            public void defaults(WriteableCommandLine commandLine) { }
            public boolean isRequired() { return false; }
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp, String separator) { }
        };
        final GroupImpl validGroup = new GroupImpl(Arrays.asList(opt), "valid", "valid", 0, 1);
        final WriteableCommandLine cmd = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(null, null, null) {
            public boolean hasOption(Option option) { return true; }
        };
        validGroup.validate(cmd);
    }

    @Test
    public void testProcessValidOption() throws OptionException {
        final StringBuilder sb = new StringBuilder();
        final Option opt = new org.apache.commons.cli2.option.OptionImpl("opt", "opt", false, false) {
            public boolean canProcess(WriteableCommandLine commandLine, String arg) { return "opt".equals(arg); }
            public Set getPrefixes() { return new HashSet<String>(Arrays.asList("-")); }
            public Set getTriggers() { return new HashSet<String>(Arrays.asList("opt")); }
            public void process(WriteableCommandLine commandLine, ListIterator arguments) { sb.append("processed"); }
            public String getPreferredName() { return "opt"; }
            public String getDescription() { return "opt"; }
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) { }
            public List helpLines(int depth, Set helpSettings, Comparator comp) { return new ArrayList(); }
            public void validate(WriteableCommandLine commandLine) { }
            public void defaults(WriteableCommandLine commandLine) { }
            public boolean isRequired() { return false; }
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp, String separator) { }
        };
        final GroupImpl g = new GroupImpl(Arrays.asList(opt), "g", "g", 0, 1);
        final List list = new ArrayList();
        list.add("opt");
        final java.util.ListIterator it = list.listIterator();
        g.process(commandLine, it);
        assertEquals("processed", sb.toString());
        assertFalse(it.hasNext());
    }

    @Test
    public void testProcessAnonymousArgument() throws OptionException {
        final Argument arg = new org.apache.commons.cli2.option.ArgumentImpl("arg", "arg", 0, 1, 1, null) {
            public boolean canProcess(WriteableCommandLine commandLine, String arg) { return true; }
            public void process(WriteableCommandLine commandLine, ListIterator arguments) { }
        };
        final GroupImpl g = new GroupImpl(Arrays.asList(arg), "g", "g", 0, 1);
        final List list = new ArrayList();
        list.add("value");
        final java.util.ListIterator it = list.listIterator();
        g.process(commandLine, it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testProcessNoOptionFoundAndNoArguments() {
        final GroupImpl g = new GroupImpl(new ArrayList(), "g", "g", 0, 1);
        final List list = new ArrayList();
        list.add("value");
        final java.util.ListIterator it = list.listIterator();
        g.process(commandLine, it);
    }

    @Test
    public void testProcessDuplicate() throws OptionException {
        final StringBuilder sb = new StringBuilder();
        final Option opt = new org.apache.commons.cli2.option.OptionImpl("opt", "opt", false, false) {
            public boolean canProcess(WriteableCommandLine commandLine, String arg) { return true; }
            public Set getPrefixes() { return new HashSet<String>(Arrays.asList("-")); }
            public Set getTriggers() { return new HashSet<String>(Arrays.asList("opt")); }
            public void process(WriteableCommandLine commandLine, ListIterator arguments) { 
                sb.append("p");
                if (arguments.hasPrevious() && "opt".equals(arguments.previous())) {
                    arguments.next();
                }
            }
            public String getPreferredName() { return "opt"; }
            public String getDescription() { return "opt"; }
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) { }
            public List helpLines(int depth, Set helpSettings, Comparator comp) { return new ArrayList(); }
            public void validate(WriteableCommandLine commandLine) { }
            public void defaults(WriteableCommandLine commandLine) { }
            public boolean isRequired() { return false; }
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp, String separator) { }
        };
        final GroupImpl g = new GroupImpl(Arrays.asList(opt), "g", "g", 0, 1);
        final List list = new ArrayList();
        list.add("opt");
        list.add("opt");
        final java.util.ListIterator it = list.listIterator();
        g.process(commandLine, it);
    }

    @Test
    public void testAppendUsageOptional() {
        final StringBuffer buffer = new StringBuffer();
        final Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        settings.add(DisplaySetting.DISPLAY_GROUP_OUTER);
        group.appendUsage(buffer, settings, null);
        assertTrue(buffer.length() > 0);
    }

    @Test
    public void testAppendUsageRequired() {
        final StringBuffer buffer = new StringBuffer();
        final Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        groupRequired.appendUsage(buffer, settings, null);
        assertTrue(buffer.length() > 0);
    }

    @Test
    public void testHelpLines() {
        final Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        final List lines = group.helpLines(0, settings, null);
        assertNotNull(lines);
    }

    @Test
    public void testHelpLinesWithComparator() {
        final Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        final List lines = group.helpLines(0, settings, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option)o1).getPreferredName().compareTo(((Option)o2).getPreferredName());
            }
        });
        assertNotNull(lines);
    }

    @Test
    public void testReverseStringComparator() {
        final Comparator comp = ReverseStringComparator.getInstance();
        assertEquals(0, comp.compare("a", "a"));
        assertTrue(comp.compare("a", "b") > 0);
        assertTrue(comp.compare("b", "a") < 0);
        assertSame(comp, ReverseStringComparator.getInstance());
    }
}