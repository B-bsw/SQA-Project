package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Collection;

public class OptionsTest {
    private Options options;

    @Before
    public void setUp() {
        options = new Options();
    }

    @Test
    public void testAddOptionStringDescription() {
        Options result = options.addOption("a", "description a");
        assertSame(options, result);
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("-a"));
        assertTrue(options.hasOption("--a"));
        assertEquals("description a", options.getOption("a").getDescription());
    }

    @Test
    public void testAddOptionStringBooleanDescription() {
        options.addOption("b", true, "boolean option");
        assertTrue(options.hasOption("b"));
        assertTrue(options.getOption("b").hasArg());
        assertFalse(options.getOption("b").hasLongOpt());
    }

    @Test
    public void testAddOptionFull() {
        options.addOption("c", "long-c", true, "full option");
        assertTrue(options.hasOption("c"));
        assertTrue(options.hasOption("long-c"));
        assertTrue(options.hasLongOption("long-c"));
        assertTrue(options.hasShortOption("c"));
        assertFalse(options.hasLongOption("c"));
    }

    @Test
    public void testAddOptionInstanceRequired() {
        Option opt = new Option("d", "long-d", false, "required option");
        opt.setRequired(true);
        options.addOption(opt);
        assertTrue(options.getOption("d").isRequired());
        assertTrue(options.getRequiredOptions().contains("d"));
    }

    @Test
    public void testAddOptionGroup() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("x", "long-x", false, "x option"));
        group.addOption(new Option("y", "long-y", false, "y option"));
        
        options.addOptionGroup(group);
        
        assertTrue(options.hasOption("x"));
        assertTrue(options.hasOption("y"));
        assertTrue(options.hasOption("long-x"));
        assertTrue(options.hasLongOption("long-y"));
        assertNotNull(options.getOptionGroup(options.getOption("x")));
        assertEquals(group, options.getOptionGroup(options.getOption("y")));
        assertTrue(options.getRequiredOptions().contains(group));
        assertFalse(options.getOption("x").isRequired());
    }

    @Test
    public void testGetOptionGroupReturnsNullForUngroupedOption() {
        options.addOption("z", "ungrouped");
        assertNull(options.getOptionGroup(options.getOption("z")));
    }

    @Test
    public void testHasOptionWithNull() {
        // Should not throw NPE (Util.stripLeadingHyphens should handle)
        // Note: Util.stripLeadingHyphens likely throws for null, but the contract may not specify
        // We don't test null input since it would throw before our code
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasOptionWithNullExpectException() {
        options.hasOption(null);
    }

    @Test
    public void testGetMatchingOptionsExactMatch() {
        options.addOption("abc", "abcd", false, "exact match");
        List<String> match = options.getMatchingOptions("abcd");
        assertEquals(1, match.size());
        assertEquals("abcd", match.get(0));
    }

    @Test
    public void testGetMatchingOptionsPartialMatchMultiple() {
        options.addOption("abc", "abcd", false, "first");
        options.addOption("abce", "abce", false, "second");
        options.addOption("abcf", "abcf", false, "third");
        
        List<String> matches = options.getMatchingOptions("abc");
        assertEquals(3, matches.size());
        assertTrue(matches.contains("abcd"));
        assertTrue(matches.contains("abce"));
        assertTrue(matches.contains("abcf"));
    }

    @Test
    public void testGetMatchingOptionsNoMatch() {
        options.addOption("abc", "abcd", false, "desc");
        List<String> matches = options.getMatchingOptions("xyz");
        assertEquals(0, matches.size());
    }

    @Test
    public void testGetMatchingOptionsEmptyString() {
        options.addOption("abc", "abcd", false, "desc");
        List<String> matches = options.getMatchingOptions("");
        assertEquals(0, matches.size());
    }

    @Test
    public void testGetOptionsReturnsUnmodifiableCollection() {
        options.addOption("a", "desc");
        Collection<Option> opts = options.getOptions();
        assertNotNull(opts);
        assertEquals(1, opts.size());
        try {
            opts.clear();
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testToString() {
        options.addOption("a", "test option");
        String result = options.toString();
        assertTrue(result.startsWith("[ Options: [ short"));
        assertNotNull(result);
    }

    @Test
    public void testAddOptionReplacingRequired() {
        Option opt1 = new Option("r", "req", false, "first");
        opt1.setRequired(true);
        options.addOption(opt1);
        
        Option opt2 = new Option("r", "req", false, "second");
        opt2.setRequired(false);
        options.addOption(opt2);
        
        assertTrue(options.hasOption("r"));
        assertEquals("second", options.getOption("r").getDescription());
        assertFalse(options.getOption("r").isRequired());
        // Required list should not contain "r" twice
        assertEquals(0, options.getRequiredOptions().size());
    }

    @Test
    public void testHelpOptions() {
        options.addOption("opt1", "long1", false, "one");
        options.addOption("opt2", "long2", false, "two");
        List<Option> helpList = options.helpOptions();
        assertEquals(2, helpList.size());
        assertTrue(helpList.contains(options.getOption("opt1")));
        assertTrue(helpList.contains(options.getOption("opt2")));
    }
}