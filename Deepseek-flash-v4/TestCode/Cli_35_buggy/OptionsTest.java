package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class OptionsTest {

    private Options options;

    @Before
    public void setUp() {
        options = new Options();
    }

    @Test
    public void testAddOptionWithShortNameOnly() {
        options.addOption("a", "option a");

        assertTrue(options.hasOption("a"));
        assertFalse(options.hasOption("b"));
        assertEquals("[ Options: [ short {a=[Option a]  ] [ long {} ]", options.toString());
    }

    @Test
    public void testAddOptionWithLongName() {
        options.addOption("a", "alpha", true, "option a");

        assertTrue(options.hasOption("-a"));
        assertTrue(options.hasOption("--alpha"));
        assertTrue(options.hasOption("alpha"));
        assertTrue(options.hasOption("a"));
        assertFalse(options.hasOption("b"));
    }

    @Test
    public void testAddOptionGroupRequired() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("a", "alpha", false, "opt a"));
        group.addOption(new Option("b", "beta", false, "opt b"));

        options.addOptionGroup(group);

        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("b"));
        assertNotNull(options.getOptionGroup(options.getOption("a")));
        assertEquals(group, options.getOptionGroup(options.getOption("a")));
        assertFalse(options.getOption("a").isRequired());
        assertEquals(1, options.getRequiredOptions().size());
    }

    @Test
    public void testAddOptionGroupNotRequired() {
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        group.addOption(new Option("x", "xray", false, "opt x"));
        group.addOption(new Option("y", "yankee", false, "opt y"));

        options.addOptionGroup(group);

        assertTrue(options.hasOption("x"));
        assertTrue(options.hasOption("y"));
        assertNotNull(options.getOptionGroup(options.getOption("x")));
        assertNotNull(options.getOptionGroup(options.getOption("y")));
        assertEquals(0, options.getRequiredOptions().size());
    }

    @Test
    public void testAddOptionRequired() {
        Option opt = new Option("r", "required", true, "required option");
        opt.setRequired(true);
        options.addOption(opt);

        assertTrue(options.hasOption("r"));
        assertTrue(options.hasOption("--required"));
        assertEquals(1, options.getRequiredOptions().size());
    }

    @Test
    public void testAddDuplicateRequiredOption() {
        Option opt1 = new Option("d", "dup", true, "dup option");
        opt1.setRequired(true);
        options.addOption(opt1);

        Option opt2 = new Option("d", "dup", false, "dup option 2");
        options.addOption(opt2);

        assertTrue(options.hasOption("d"));
        assertEquals(1, options.getRequiredOptions().size());
        assertTrue(options.getRequiredOptions().contains("d"));
    }

    @Test
    public void testGetOptionsReadOnly() {
        options.addOption("a", "alpha", false, "opt a");
        Collection<Option> opts = options.getOptions();

        assertEquals(1, opts.size());
        try {
            opts.add(new Option("x", "xray", false, "opt x"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testHelpOptions() {
        options.addOption("a", "alpha", false, "opt a");
        options.addOption("b", "beta", false, "opt b");

        List<Option> helpOpts = options.helpOptions();
        assertEquals(2, helpOpts.size());
        assertEquals("a", helpOpts.get(0).getOpt());
        assertEquals("b", helpOpts.get(1).getOpt());
    }

    @Test
    public void testGetRequiredOptionsReadOnly() {
        options.addOption("r", "required", true, "req");
        options.getOption("r").setRequired(true);

        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        try {
            required.add("x");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetOptionNull() {
        assertNull(options.getOption(null));
    }

    @Test
    public void testGetOptionEmptyString() {
        assertNull(options.getOption(""));
    }

    @Test
    public void testGetOptionWithHyphens() {
        options.addOption("a", "alpha", false, "opt a");
        assertEquals("a", options.getOption("-a").getOpt());
        assertEquals("a", options.getOption("--alpha").getOpt());
    }

    @Test
    public void testGetOptionWithTripleHyphens() {
        options.addOption("a", "alpha", false, "opt a");
        Option opt = options.getOption("---a");
        assertNull(opt);
    }

    @Test
    public void testHasOptionWithNull() {
        assertFalse(options.hasOption(null));
    }

    @Test
    public void testHasOptionWithEmptyString() {
        assertFalse(options.hasOption(""));
    }

    @Test
    public void testHasLongOption() {
        options.addOption("a", "alpha", false, "opt a");
        assertTrue(options.hasLongOption("--alpha"));
        assertTrue(options.hasLongOption("-alpha"));
        assertFalse(options.hasLongOption("alpha2"));
        assertFalse(options.hasLongOption("a"));
    }

    @Test
    public void testHasShortOption() {
        options.addOption("a", "alpha", false, "opt a");
        assertTrue(options.hasShortOption("-a"));
        assertTrue(options.hasShortOption("--a"));
        assertFalse(options.hasShortOption("alpha"));
        assertFalse(options.hasShortOption("b"));
    }

    @Test
    public void testGetMatchingOptionsExactMatch() {
        options.addOption("a", "alpha", false, "opt a");
        options.addOption("b", "beta", false, "opt b");

        List<String> matches = options.getMatchingOptions("alpha");
        assertEquals(1, matches.size());
        assertEquals("alpha", matches.get(0));
    }

    @Test
    public void testGetMatchingOptionsPrefixMatch() {
        options.addOption("a", "alpha", false, "opt a");
        options.addOption("b", "alphabeta", false, "opt b");

        List<String> matches = options.getMatchingOptions("alp");
        assertEquals(2, matches.size());
        assertTrue(matches.contains("alpha"));
        assertTrue(matches.contains("alphabeta"));
    }

    @Test
    public void testGetMatchingOptionsNoMatch() {
        options.addOption("a", "alpha", false, "opt a");
        List<String> matches = options.getMatchingOptions("xyz");
        assertEquals(0, matches.size());
    }

    @Test
    public void testGetMatchingOptionsEmptyPrefix() {
        options.addOption("a", "alpha", false, "opt a");
        List<String> matches = options.getMatchingOptions("");
        assertEquals(1, matches.size());
        assertEquals("alpha", matches.get(0));
    }

    @Test
    public void testGetMatchingOptionsWithHyphens() {
        options.addOption("a", "alpha", false, "opt a");
        List<String> matches = options.getMatchingOptions("--alpha");
        assertEquals(1, matches.size());
        assertEquals("alpha", matches.get(0));
    }

    @Test
    public void testToString() {
        options.addOption("a", "alpha", false, "opt a");
        String result = options.toString();
        assertTrue(result.contains("[ Options: [ short {a=[Option a]"));
        assertTrue(result.contains("[ long {alpha=[Option alpha]"));
    }

    @Test
    public void testGetOptionGroupsEmpty() {
        Collection<OptionGroup> groups = options.getOptionGroups();
        assertNotNull(groups);
        assertEquals(0, groups.size());
    }

    @Test
    public void testGetOptionGroupReturnsNullForNonGroupedOption() {
        options.addOption("a", "alpha", false, "opt a");
        Option opt = options.getOption("a");
        assertNull(options.getOptionGroup(opt));
    }

    @Test
    public void testAddOptionWithNoDescription() {
        options.addOption("n", "none", false, null);
        assertTrue(options.hasOption("n"));
        assertTrue(options.hasOption("--none"));
    }

    @Test
    public void testAddOptionWithNullOptInGroup() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option(null, "nullopt", false, "null opt"));
        group.addOption(new Option("c", "charlie", false, "opt c"));

        options.addOptionGroup(group);

        assertTrue(options.hasOption("c"));
        assertTrue(options.hasOption("--nullopt"));
        assertFalse(options.hasOption(null));
    }
}