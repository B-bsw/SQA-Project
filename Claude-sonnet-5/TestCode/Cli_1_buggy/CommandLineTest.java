package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * JUnit test suite for {@link CommandLine}.
 */
public class CommandLineTest
{
    private CommandLine commandLine;

    @Before
    public void setUp()
    {
        commandLine = new CommandLine();
    }

    // ---------------------------------------------------------------
    // hasOption(String) / hasOption(char)
    // ---------------------------------------------------------------

    @Test
    public void testHasOptionString_Present()
    {
        Option opt = new Option("a", null, false, "alpha option");
        commandLine.addOption(opt);

        assertTrue(commandLine.hasOption("a"));
    }

    @Test
    public void testHasOptionString_Absent()
    {
        assertFalse(commandLine.hasOption("z"));
    }

    @Test
    public void testHasOptionString_EmptyString()
    {
        assertFalse(commandLine.hasOption(""));
    }

    @Test
    public void testHasOptionString_NullInput_ReturnsFalse()
    {
        assertFalse(commandLine.hasOption((String) null));
    }

    @Test
    public void testHasOptionChar_Present()
    {
        Option opt = new Option("b", null, false, "bravo option");
        commandLine.addOption(opt);

        assertTrue(commandLine.hasOption('b'));
    }

    @Test
    public void testHasOptionChar_Absent()
    {
        assertFalse(commandLine.hasOption('x'));
    }

    // ---------------------------------------------------------------
    // getOptionValue(String) / getOptionValue(char)
    // ---------------------------------------------------------------

    @Test
    public void testGetOptionValueString_SingleValue()
    {
        Option opt = new Option("s", null, true, "single value option");
        opt.addValueForProcessing("hello");
        commandLine.addOption(opt);

        assertEquals("hello", commandLine.getOptionValue("s"));
    }

    @Test
    public void testGetOptionValueString_MultipleValues_ReturnsFirst()
    {
        Option opt = new Option("m", null, true, "multi value option");
        opt.setArgs(2);
        opt.addValueForProcessing("val1");
        opt.addValueForProcessing("val2");
        commandLine.addOption(opt);

        assertEquals("val1", commandLine.getOptionValue("m"));
    }

    @Test
    public void testGetOptionValueString_NoValuePresent_ReturnsNull()
    {
        Option opt = new Option("n", null, true, "no value provided");
        commandLine.addOption(opt);

        assertNull(commandLine.getOptionValue("n"));
    }

    @Test
    public void testGetOptionValueString_OptionNotPresent_ReturnsNull()
    {
        assertNull(commandLine.getOptionValue("nope"));
    }

    @Test
    public void testGetOptionValueChar()
    {
        Option opt = new Option("c", null, true, "char option");
        opt.addValueForProcessing("cvalue");
        commandLine.addOption(opt);

        assertEquals("cvalue", commandLine.getOptionValue('c'));
    }

    // ---------------------------------------------------------------
    // getOptionValues(String) / getOptionValues(char)
    // ---------------------------------------------------------------

    @Test
    public void testGetOptionValuesString_NotPresent_ReturnsNull()
    {
        assertNull(commandLine.getOptionValues("missing"));
    }

    @Test
    public void testGetOptionValuesString_MultipleValues()
    {
        Option opt = new Option("m", null, true, "multi value option");
        opt.setArgs(3);
        opt.addValueForProcessing("v1");
        opt.addValueForProcessing("v2");
        opt.addValueForProcessing("v3");
        commandLine.addOption(opt);

        assertArrayEquals(new String[] { "v1", "v2", "v3" }, commandLine.getOptionValues("m"));
    }

    @Test
    public void testGetOptionValuesString_StripLeadingHyphens_Short()
    {
        Option opt = new Option("a", null, true, "alpha option");
        opt.addValueForProcessing("alphaValue");
        commandLine.addOption(opt);

        assertArrayEquals(new String[] { "alphaValue" }, commandLine.getOptionValues("-a"));
    }

    @Test
    public void testGetOptionValuesString_StripLeadingHyphens_Long_ViaNamesMap()
    {
        Option opt = new Option("v", "verbose", true, "verbose option");
        opt.addValueForProcessing("verboseValue");
        commandLine.addOption(opt);

        assertArrayEquals(new String[] { "verboseValue" }, commandLine.getOptionValues("--verbose"));
    }

    @Test
    public void testGetOptionValuesString_NullInput_NoExceptionReturnsNull()
    {
        assertNull(commandLine.getOptionValues((String) null));
    }

    @Test
    public void testGetOptionValuesChar()
    {
        Option opt = new Option("d", null, true, "delta option");
        opt.setArgs(2);
        opt.addValueForProcessing("d1");
        opt.addValueForProcessing("d2");
        commandLine.addOption(opt);

        assertArrayEquals(new String[] { "d1", "d2" }, commandLine.getOptionValues('d'));
    }

    // ---------------------------------------------------------------
    // getOptionValue(String, String) / getOptionValue(char, String)
    // ---------------------------------------------------------------

    @Test
    public void testGetOptionValueWithDefault_PresentReturnsActual()
    {
        Option opt = new Option("e", null, true, "echo option");
        opt.addValueForProcessing("echoed");
        commandLine.addOption(opt);

        assertEquals("echoed", commandLine.getOptionValue("e", "default"));
    }

    @Test
    public void testGetOptionValueWithDefault_AbsentReturnsDefault()
    {
        assertEquals("default", commandLine.getOptionValue("nope", "default"));
    }

    @Test
    public void testGetOptionValueCharWithDefault()
    {
        assertEquals("defaultChar", commandLine.getOptionValue('q', "defaultChar"));

        Option opt = new Option("q", null, true, "q option");
        opt.addValueForProcessing("qvalue");
        commandLine.addOption(opt);

        assertEquals("qvalue", commandLine.getOptionValue('q', "defaultChar"));
    }

    // ---------------------------------------------------------------
    // getOptionObject(String) / getOptionObject(char)
    // ---------------------------------------------------------------

    @Test
    public void testGetOptionObjectString_NotPresent_ReturnsNull()
    {
        assertNull(commandLine.getOptionObject("nope"));
    }

    @Test
    public void testGetOptionObjectString_PresentNoValue_ReturnsNull()
    {
        Option opt = new Option("o", null, true, "obj option no value");
        commandLine.addOption(opt);

        assertNull(commandLine.getOptionObject("o"));
    }

    @Test
    public void testGetOptionObjectString_PresentWithValue_TypeUnset()
    {
        Option opt = new Option("s", null, true, "obj option with value");
        opt.addValueForProcessing("hello");
        commandLine.addOption(opt);

        Object result = commandLine.getOptionObject("s");
        assertTrue("Expected null or original string value when type unset",
                result == null || result.equals("hello"));
    }

    @Test
    public void testGetOptionObjectChar()
    {
        Option opt = new Option("t", null, true, "obj char option");
        opt.addValueForProcessing("tvalue");
        commandLine.addOption(opt);

        Object result = commandLine.getOptionObject('t');
        assertTrue("Expected null or original string value when type unset",
                result == null || result.equals("tvalue"));

        assertNull(commandLine.getOptionObject('z'));
    }

    // ---------------------------------------------------------------
    // getArgs() / getArgList()
    // ---------------------------------------------------------------

    @Test
    public void testGetArgs_EmptyInitially()
    {
        String[] args = commandLine.getArgs();
        assertNotNull(args);
        assertEquals(0, args.length);
    }

    @Test
    public void testGetArgs_SingleArg()
    {
        commandLine.addArg("one");

        String[] args = commandLine.getArgs();
        assertEquals(1, args.length);
        assertEquals("one", args[0]);
    }

    @Test
    public void testGetArgs_MultipleArgs()
    {
        commandLine.addArg("one");
        commandLine.addArg("two");
        commandLine.addArg("three");

        String[] args = commandLine.getArgs();
        assertEquals(3, args.length);
        assertArrayEquals(new String[] { "one", "two", "three" }, args);
    }

    @Test
    public void testGetArgList_ReflectsAddArg_AndIsMutable()
    {
        commandLine.addArg("alpha");
        List argList = commandLine.getArgList();

        assertEquals(1, argList.size());
        assertEquals("alpha", argList.get(0));

        // verify the returned list is the live backing list (side effect)
        argList.add("beta");
        String[] args = commandLine.getArgs();
        assertEquals(2, args.length);
        assertEquals("beta", args[1]);
    }

    @Test
    public void testGetArgList_EmptyInitially()
    {
        List argList = commandLine.getArgList();
        assertNotNull(argList);
        assertTrue(argList.isEmpty());
    }

    // ---------------------------------------------------------------
    // addOption(Option) / getOptions() / iterator()
    // ---------------------------------------------------------------

    @Test
    public void testAddOption_ShortOnly()
    {
        Option opt = new Option("a", null, false, "alpha option");
        commandLine.addOption(opt);

        assertTrue(commandLine.hasOption("a"));
        Option[] options = commandLine.getOptions();
        assertEquals(1, options.length);
    }

    @Test
    public void testAddOption_ShortAndLong_NamesMapPopulated()
    {
        Option opt = new Option("v", "verbose", true, "verbose option");
        opt.addValueForProcessing("verboseVal");
        commandLine.addOption(opt);

        // accessible via short key
        assertEquals("verboseVal", commandLine.getOptionValue("v"));
        // accessible via long key through the internal names map
        assertEquals("verboseVal", commandLine.getOptionValue("verbose"));
    }

    @Test
    public void testAddOption_MultipleDistinctOptions()
    {
        Option opt1 = new Option("a", null, false, "alpha");
        Option opt2 = new Option("b", null, false, "beta");
        Option opt3 = new Option("c", null, false, "gamma");

        commandLine.addOption(opt1);
        commandLine.addOption(opt2);
        commandLine.addOption(opt3);

        assertTrue(commandLine.hasOption("a"));
        assertTrue(commandLine.hasOption("b"));
        assertTrue(commandLine.hasOption("c"));

        Option[] options = commandLine.getOptions();
        assertEquals(3, options.length);
    }

    @Test
    public void testIterator_EmptyThrowsOnNext()
    {
        Iterator iterator = commandLine.iterator();
        assertNotNull(iterator);
        assertFalse(iterator.hasNext());

        try
        {
            iterator.next();
            fail("Expected NoSuchElementException on empty iterator");
        }
        catch (NoSuchElementException e)
        {
            // expected
        }
    }

    @Test
    public void testIterator_ReturnsAllAddedOptionsByHashcode()
    {
        Option opt1 = new Option("a", null, false, "alpha");
        Option opt2 = new Option("b", null, false, "beta");

        commandLine.addOption(opt1);
        commandLine.addOption(opt2);

        Iterator iterator = commandLine.iterator();
        int count = 0;
        boolean foundOpt1 = false;
        boolean foundOpt2 = false;
        while (iterator.hasNext())
        {
            Object o = iterator.next();
            if (o == opt1)
            {
                foundOpt1 = true;
            }
            if (o == opt2)
            {
                foundOpt2 = true;
            }
            count++;
        }

        assertEquals(2, count);
        assertTrue(foundOpt1);
        assertTrue(foundOpt2);
    }

    @Test
    public void testGetOptions_EmptyArray()
    {
        Option[] options = commandLine.getOptions();
        assertNotNull(options);
        assertEquals(0, options.length);
    }

    @Test
    public void testGetOptions_ArrayContainsAddedOptions()
    {
        Option opt1 = new Option("a", null, false, "alpha");
        Option opt2 = new Option("b", null, false, "beta");

        commandLine.addOption(opt1);
        commandLine.addOption(opt2);

        Option[] options = commandLine.getOptions();
        assertEquals(2, options.length);

        boolean foundOpt1 = false;
        boolean foundOpt2 = false;
        for (int i = 0; i < options.length; i++)
        {
            if (options[i] == opt1)
            {
                foundOpt1 = true;
            }
            if (options[i] == opt2)
            {
                foundOpt2 = true;
            }
        }
        assertTrue(foundOpt1);
        assertTrue(foundOpt2);
    }
}