package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;

public class OptionGroupTest {
    private OptionGroup group;
    private Option optA;
    private Option optB;
    private Option optC;

    @Before
    public void setUp() {
        group = new OptionGroup();
        optA = new Option("a", "option A", false, "Description A");
        optB = new Option("b", "option B", false, "Description B");
        optC = new Option("c", "option C", false, "Description C");
    }

    @Test
    public void testAddOptionAndGetOptions() {
        group.addOption(optA);
        group.addOption(optB);
        Collection options = group.getOptions();
        assertEquals(2, options.size());
        assertTrue(options.contains(optA));
        assertTrue(options.contains(optB));
    }

    @Test
    public void testGetNames() {
        group.addOption(optA);
        group.addOption(optB);
        Collection names = group.getNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
    }

    @Test
    public void testSetSelectedWithNullFirst() throws Exception {
        group.setSelected(null);
        assertNull(group.getSelected());
    }

    @Test
    public void testSetSelectedWithValidOption() throws Exception {
        group.setSelected(optA);
        assertEquals("a", group.getSelected());
    }

    @Test
    public void testSetSelectedWithSameOption() throws Exception {
        group.setSelected(optA);
        group.setSelected(optA);
        assertEquals("a", group.getSelected());
    }

    @Test(expected = AlreadySelectedException.class)
    public void testSetSelectedWithDifferentOptionThrows() throws Exception {
        group.setSelected(optA);
        group.setSelected(optB);
    }

    @Test
    public void testSetSelectedNullAfterSelection() throws Exception {
        group.setSelected(optA);
        group.setSelected(null);
        assertNull(group.getSelected());
    }

    @Test
    public void testSetRequiredAndIsRequired() {
        assertFalse(group.isRequired());
        group.setRequired(true);
        assertTrue(group.isRequired());
        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    @Test
    public void testToStringWithShortOpts() {
        group.addOption(optA);
        group.addOption(optB);
        String result = group.toString();
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("Description A"));
        assertTrue(result.contains("-b"));
        assertTrue(result.contains(", "));
    }

    @Test
    public void testToStringWithLongOptOnly() {
        Option longOpt = new Option(null, "long-option", false, "Long Desc");
        group.addOption(longOpt);
        String result = group.toString();
        assertTrue(result.contains("--long-option"));
        assertTrue(result.contains("Long Desc"));
    }

    @Test
    public void testToStringEmptyGroup() {
        String result = group.toString();
        assertEquals("[]", result);
    }

    @Test
    public void testToStringWithEmptyDescription() {
        Option opt = new Option("x", "desc", false, null);
        group.addOption(opt);
        String result = group.toString();
        assertTrue(result.contains("-x"));
        assertTrue(result.contains("null"));
    }

    @Test
    public void testAddMultipleOptionsAndClear() {
        group.addOption(optA);
        group.addOption(optB);
        group.addOption(optC);
        assertEquals(3, group.getOptions().size());
        assertTrue(group.getNames().contains("a"));
        assertTrue(group.getNames().contains("b"));
        assertTrue(group.getNames().contains("c"));
    }
}