package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PosixParserTest
{

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new PosixParser();
        options = new Options();
    }

    // ---------------------------------------------------------------
    // flatten() tests - long options
    // ---------------------------------------------------------------

    @Test
    public void testFlattenLongOptionNoValue()
    {
        options.addOption("f", "foo", false, "foo description");
        String[] args = {"--foo"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"--foo"}, result);
    }

    @Test
    public void testFlattenLongOptionWithEquals()
    {
        options.addOption("f", "foo", true, "foo description");
        String[] args = {"--foo=bar"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"--foo", "bar"}, result);
    }

    @Test
    public void testFlattenDoubleDashToken()
    {
        String[] args = {"--"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"--"}, result);
    }

    // ---------------------------------------------------------------
    // flatten() tests - single hyphen
    // ---------------------------------------------------------------

    @Test
    public void testFlattenSingleHyphen()
    {
        String[] args = {"-"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-"}, result);
    }

    // ---------------------------------------------------------------
    // flatten() tests - short option, length 2
    // ---------------------------------------------------------------

    @Test
    public void testFlattenShortValidOption()
    {
        options.addOption("a", false, "a option");
        String[] args = {"-a"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-a"}, result);
    }

    @Test
    public void testFlattenShortInvalidOptionNoStop()
    {
        String[] args = {"-x"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-x"}, result);
    }

    @Test
    public void testFlattenShortInvalidOptionStopAtNonOptionNoExtra()
    {
        String[] args = {"-x"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] {"-x"}, result);
    }

    @Test
    public void testFlattenShortInvalidOptionStopAtNonOption()
    {
        String[] args = {"-x", "extra1", "extra2"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] {"-x", "extra1", "extra2"}, result);
    }

    // ---------------------------------------------------------------
    // flatten() tests - burstToken()
    // ---------------------------------------------------------------

    @Test
    public void testFlattenBurstMultipleOptions()
    {
        options.addOption("a", false, "a option");
        options.addOption("b", false, "b option");
        String[] args = {"-ab"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-a", "-b"}, result);
    }

    @Test
    public void testFlattenBurstOptionWithArgValue()
    {
        options.addOption("a", true, "a option with arg");
        String[] args = {"-abc"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-a", "bc"}, result);
    }

    @Test
    public void testFlattenBurstInvalidCharNoStop()
    {
        String[] args = {"-xyz"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-xyz"}, result);
    }

    @Test
    public void testFlattenBurstInvalidCharStop()
    {
        String[] args = {"-xyz"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] {"--", "xyz"}, result);
    }

    @Test
    public void testFlattenBurstPartialValidThenInvalid()
    {
        options.addOption("a", false, "a option");
        String[] args = {"-axy"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] {"-a", "--", "xy"}, result);
    }

    // ---------------------------------------------------------------
    // flatten() tests - process()
    // ---------------------------------------------------------------

    @Test
    public void testFlattenProcessWithCurrentOptionHasArg()
    {
        options.addOption("a", true, "a option with arg");
        String[] args = {"-a", "value1"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] {"-a", "value1"}, result);
    }

    @Test
    public void testFlattenProcessNoCurrentOption()
    {
        String[] args = {"bar", "baz", "qux"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] {"--", "bar", "baz", "qux"}, result);
    }

    // ---------------------------------------------------------------
    // flatten() tests - non option tokens
    // ---------------------------------------------------------------

    @Test
    public void testFlattenNonOptionNoStop()
    {
        String[] args = {"bar"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"bar"}, result);
    }

    // ---------------------------------------------------------------
    // flatten() tests - boundary / empty / null
    // ---------------------------------------------------------------

    @Test
    public void testFlattenEmptyArguments()
    {
        String[] args = {};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {}, result);
    }

    @Test(expected = NullPointerException.class)
    public void testFlattenNullArguments()
    {
        parser.flatten(options, null, false);
    }

    // ---------------------------------------------------------------
    // public API tests (inherited parse() methods from Parser)
    // ---------------------------------------------------------------

    @Test
    public void testParseLongOption() throws ParseException
    {
        options.addOption("f", "foo", false, "description");
        CommandLine cmd = parser.parse(options, new String[] {"--foo"});
        assertTrue(cmd.hasOption("f"));
        assertTrue(cmd.hasOption("foo"));
    }

    @Test
    public void testParseOptionWithArgumentValue() throws ParseException
    {
        options.addOption("a", true, "desc");
        CommandLine cmd = parser.parse(options, new String[] {"-a", "value1"});
        assertEquals("value1", cmd.getOptionValue("a"));
    }

    @Test(expected = MissingArgumentException.class)
    public void testParseMissingArgumentThrowsException() throws ParseException
    {
        options.addOption("a", true, "desc");
        parser.parse(options, new String[] {"-a"});
    }

    @Test(expected = MissingOptionException.class)
    public void testParseMissingRequiredOptionThrowsException() throws ParseException
    {
        Option opt = new Option("r", "required option");
        opt.setRequired(true);
        options.addOption(opt);
        parser.parse(options, new String[] {});
    }

    @Test
    public void testParseExtraArguments() throws ParseException
    {
        options.addOption("a", false, "desc");
        CommandLine cmd = parser.parse(options, new String[] {"-a", "extra"});
        assertTrue(cmd.hasOption("a"));
        assertArrayEquals(new String[] {"extra"}, cmd.getArgs());
    }

    @Test
    public void testParseWithStopAtNonOptionTrue() throws ParseException
    {
        options.addOption("a", false, "desc");
        CommandLine cmd = parser.parse(options, new String[] {"-a", "nonopt", "more"}, true);
        assertTrue(cmd.hasOption("a"));
        assertArrayEquals(new String[] {"nonopt", "more"}, cmd.getArgs());
    }
}