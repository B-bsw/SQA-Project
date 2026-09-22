package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import java.util.List;
import java.util.Arrays;
import static org.junit.Assert.*;

public class CommandLineTest {

    private CommandLine cmd;

    @Before
    public void setUp() {
        cmd = new CommandLine();
    }

    @After
    public void tearDown() {
        cmd = null;
    }

    @Test
    public void testHasOption_FalseWhenNoOptions() {
        assertFalse(cmd.hasOption("nonexistent"));
        assertFalse(cmd.hasOption('x'));
    }

    @Test
    public void testHasOption_TrueAfterAddOption() {
        Option opt = new Option("v", "version", false, "version option");
        cmd.addOption(opt);
        assertTrue(cmd.hasOption("v"));
        assertTrue(cmd.hasOption('v'));
    }

    @Test
    public void testHasOption_WithLongOptionAlias() {
        Option opt = new Option("v", "version", false, "version option");
        cmd.addOption(opt);
        assertTrue(cmd.hasOption("version"));
    }

    @Test
    public void testGetOptionValue_NullWhenNotSet() {
        assertNull(cmd.getOptionValue("x"));
        assertNull(cmd.getOptionValue('x'));
        assertNull(cmd.getOptionObject("x"));
        assertNull(cmd.getOptionObject('x'));
        assertNull(cmd.getOptionValues("x"));
        assertNull(cmd.getOptionValues('x'));
    }

    @Test
    public void testGetOptionValue_WithDefaultValue() {
        assertEquals("default", cmd.getOptionValue("x", "default"));
        assertEquals("default", cmd.getOptionValue('x', "default"));
    }

    @Test
    public void testGetOptionValues_WithShortOption() {
        Option opt = new Option("f", "file", true, "file option");
        opt.setValues(new String[]{"a.txt", "b.txt"});
        cmd.addOption(opt);
        String[] result = cmd.getOptionValues("f");
        assertNotNull(result);
        assertArrayEquals(new String[]{"a.txt", "b.txt"}, result);
        assertArrayEquals(result, cmd.getOptionValues('f'));
    }

    @Test
    public void testGetOptionValues_WithLongOptionAlias() {
        Option opt = new Option("f", "file", true, "file option");
        opt.setValues(new String[]{"single.txt"});
        cmd.addOption(opt);
        String[] result = cmd.getOptionValues("file");
        assertNotNull(result);
        assertArrayEquals(new String[]{"single.txt"}, result);
    }

    @Test
    public void testGetOptionValue_SingleValueFromMultiple() {
        Option opt = new Option("o", "output", true, "output file");
        opt.setValues(new String[]{"actual.txt"});
        cmd.addOption(opt);
        assertEquals("actual.txt", cmd.getOptionValue("o"));
        assertEquals("actual.txt", cmd.getOptionValue('o'));
    }

    @Test
    public void testGetOptionValue_WithDefaultValueWhenSet() {
        Option opt = new Option("p", "port", true, "port number");
        opt.setValues(new String[]{"8080"});
        cmd.addOption(opt);
        assertEquals("8080", cmd.getOptionValue("p", "9999"));
        assertEquals("8080", cmd.getOptionValue('p', "9999"));
    }

    @Test
    public void testGetOptionObject_WithType() {
        Option opt = new Option("n", "num", true, "number");
        opt.setType(Integer.class);
        opt.setValues(new String[]{"42"});
        cmd.addOption(opt);
        Object result = cmd.getOptionObject("n");
        assertNotNull(result);
        assertEquals(42, result);
        assertEquals(42, cmd.getOptionObject('n'));
    }

    @Test
    public void testGetOptionObject_WithNoOption() {
        assertNull(cmd.getOptionObject("missing"));
        assertNull(cmd.getOptionObject('m'));
    }

    @Test
    public void testGetArgs_EmptyInitial() {
        assertArrayEquals(new String[0], cmd.getArgs());
        assertTrue(cmd.getArgList().isEmpty());
    }

    @Test
    public void testGetArgs_AfterAddArg() {
        cmd.addArg("file1");
        cmd.addArg("file2");
        assertEquals(2, cmd.getArgs().length);
        assertEquals("file1", cmd.getArgs()[0]);
        assertEquals("file2", cmd.getArgs()[1]);
        assertTrue(cmd.getArgs().getClass().isArray());
    }

    @Test
    public void testGetArgList_ReturnsMutableList() {
        cmd.addArg("arg1");
        List list = cmd.getArgList();
        assertEquals(1, list.size());
        list.add("arg2");
        assertEquals(2, list.size());
    }

    @Test
    public void testIterator_Empty() {
        assertFalse(cmd.iterator().hasNext());
    }

    @Test
    public void testIterator_WithOptions() {
        Option opt1 = new Option("a", "alpha", false, "first");
        Option opt2 = new Option("b", "beta", false, "second");
        cmd.addOption(opt1);
        cmd.addOption(opt2);
        int count = 0;
        java.util.Iterator iter = cmd.iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            assertTrue(o instanceof Option);
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testGetOptions_Empty() {
        assertEquals(0, cmd.getOptions().length);
    }

    @Test
    public void testGetOptions_WithMultipleOptions() {
        Option opt1 = new Option("a", "alpha", false, "first");
        Option opt2 = new Option("b", "beta", false, "second");
        cmd.addOption(opt1);
        cmd.addOption(opt2);
        assertEquals(2, cmd.getOptions().length);
        assertSame(opt1, cmd.getOptions()[0]);
        assertSame(opt2, cmd.getOptions()[1]);
    }

    @Test
    public void testAddOption_WithNullLongOptAndKey() {
        Option opt = new Option("x", null, false, "no long");
        cmd.addOption(opt);
        assertTrue(cmd.hasOption("x"));
    }

    @Test
    public void testAddOption_WithNullKeyButLongOptNotNull() {
        Option opt = new Option(null, "longname", false, "long only");
        cmd.addOption(opt);
        assertTrue(cmd.hasOption("longname"));
    }

    @Test
    public void testOptionWithCharacterParameter() {
        Option opt = new Option("c", "config", false, "config file");
        cmd.addOption(opt);
        assertTrue(cmd.hasOption('c'));
        assertNotNull(cmd.getOptionValues('c'));
    }

    @Test
    public void testNullOptionName() {
        assertFalse(cmd.hasOption(null));
        assertNull(cmd.getOptionValue(null));
        assertNull(cmd.getOptionObject(null));
        assertNull(cmd.getOptionValues(null));
    }

    @Test
    public void testNullLongOptionName() {
        Option opt = new Option("s", "string", true, "string val");
        cmd.addOption(opt);
        assertTrue(cmd.hasOption("s"));
        assertTrue(cmd.hasOption("string"));
        assertNull(cmd.getOptionValue("nonexistent"));
    }

    @Test
    public void testHashCodeMapDuplicateOption() {
        Option opt1 = new Option("d", "duplicate", false, "dup");
        Option opt2 = new Option("d", "different", false, "diff");
        cmd.addOption(opt1);
        cmd.addOption(opt2);
        assertEquals(1, cmd.getOptions().length);
        assertSame(opt2, cmd.getOptions()[0]);
    }

    @Test
    public void testGetOptionValueAfterAddingMultipleOptions() {
        Option opt1 = new Option("h", "help", false, "help");
        cmd.addOption(opt1);
        cmd.addOption(new Option("v", "verbose", false, "verbose"));
        assertEquals("value1", cmd.getOptionValue("h", "default1"));
    }

    @Test
    public void testEdgeCaseVeryShortOptionName() {
        Option opt = new Option("a", "a", false, "single char both");
        cmd.addOption(opt);
        assertTrue(cmd.hasOption("a"));
        assertEquals(1, cmd.getOptions().length);
    }

    @Test
    public void testEdgeCaseLongOptionNameEmptyString() {
        Option opt = new Option("", "empty", false, "empty short");
        cmd.addOption(opt);
        assertTrue(cmd.hasOption(""));
        assertEquals(1, cmd.getOptions().length);
    }
}