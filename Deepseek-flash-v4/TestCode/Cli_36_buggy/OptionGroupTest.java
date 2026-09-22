package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

public class OptionGroupTest {

    private OptionGroup group;
    private Option optA;
    private Option optB;
    private Option optC;

    @Before
    public void setUp() {
        group = new OptionGroup();
        optA = new Option("a", "alpha", false, "Alpha option");
        optB = new Option("b", "beta", false, "Beta option");
        optC = new Option("c", "gamma", false, "Gamma option");
    }

    @Test
    public void testAddOptionAndGetOptions() {
        group.addOption(optA);
        group.addOption(optB);

        Collection<Option> options = group.getOptions();
        assertEquals(2, options.size());
        assertTrue(options.contains(optA));
        assertTrue(options.contains(optB));
    }

    @Test
    public void testAddOptionAndGetNames() {
        group.addOption(optA);
        group.addOption(optB);

        Collection<String> names = group.getNames();
        assertEquals(2, names.size());
        HashSet<String> expected = new HashSet<String>();
        expected.add("a");
        expected.add("b");
        assertEquals(expected, new HashSet<String>(names));
    }

    @Test
    public void testGetNamesWhenEmpty() {
        assertTrue(group.getNames().isEmpty());
        assertTrue(group.getOptions().isEmpty());
    }

    @Test
    public void testSetSelectedFirstTime() throws Exception {
        group.addOption(optA);
        group.addOption(optB);

        group.setSelected(optA);
        assertEquals("a", group.getSelected());
    }

    @Test
    public void testSetSelectedSameOption() throws Exception {
        group.addOption(optA);
        group.setSelected(optA);
        group.setSelected(optA);
        assertEquals("a", group.getSelected());
    }

    @Test
    public void testSetSelectedConflict() {
        group.addOption(optA);
        group.addOption(optB);
        group.setSelected(optA);

        try {
            group.setSelected(optB);
            fail("Expected AlreadySelectedException");
        } catch (AlreadySelectedException e) {
            assertEquals(optB, e.getOption());
            assertSame(group, e.getOptionGroup());
        }
    }

    @Test
    public void testSetSelectedNullResets() throws Exception {
        group.addOption(optA);
        group.setSelected(optA);
        assertEquals("a", group.getSelected());

        group.setSelected((Option) null);
        assertNull(group.getSelected());
    }

    @Test
    public void testSetSelectedNullNoPreviousSelection() {
        group.addOption(optA);
        group.setSelected((Option) null);
        assertNull(group.getSelected());
    }

    @Test
    public void testSetRequiredAndIsRequired() {
        assertFalse(group.isRequired());
        group.setRequired(true);
        assertTrue(group.isRequired());
    }

    @Test
    public void testToStringWithShortOptions() {
        group.addOption(optA);
        group.addOption(optB);

        String str = group.toString();
        assertTrue(str.startsWith("["));
        assertTrue(str.endsWith("]"));
        assertTrue(str.contains("-a Alpha option"));
        assertTrue(str.contains("-b Beta option"));
    }

    @Test
    public void testToStringWithLongOnlyOption() {
        Option longOpt = new Option(null, "gamma", false, "Gamma only");
        group.addOption(optA);
        group.addOption(longOpt);

        String str = group.toString();
        assertTrue(str.contains("--gamma Gamma only"));
        assertTrue(str.contains("-a Alpha option"));
    }

    @Test
    public void testToStringWithNoDescription() {
        Option noDesc = new Option("x", false, null);
        group.addOption(noDesc);
        String str = group.toString();
        assertTrue(str.contains("-x"));
        assertFalse(str.contains("-x "));
    }

    @Test
    public void testToStringSingleOptionNoComma() {
        group.addOption(optA);
        String str = group.toString();
        assertTrue(str.startsWith("["));
        assertTrue(str.endsWith("]"));
        assertEquals("-a Alpha option", str.substring(1, str.length() - 1));
    }
}