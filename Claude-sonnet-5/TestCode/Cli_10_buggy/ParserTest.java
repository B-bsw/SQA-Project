package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

import static org.junit.Assert.*;

public class ParserTest
{
    private static class TestParser extends Parser
    {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption)
        {
            return arguments;
        }
    }

    private TestParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new TestParser();
        options = new Options();
    }

    // ---------- parse(Options, String[]) ----------

    @Test
    public void testParseSimple() throws Exception
    {
        options.addOption("a", false, "option a");
        CommandLine cmd = parser.parse(options, new String[] {"-a"});
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParseNullArguments() throws Exception
    {
        options.addOption("a", false, "option a");
        CommandLine cmd = parser.parse(options, null);
        assertFalse(cmd.hasOption("a"));
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParseEmptyArguments() throws Exception
    {
        CommandLine cmd = parser.parse(options, new String[0]);
        assertEquals(0, cmd.getArgs().length);
    }

    // ---------- parse(Options, String[], Properties) ----------

    @Test
    public void testParseWithProperties() throws Exception
    {
        options.addOption("a", false, "option a");
        Properties props = new Properties();
        props.setProperty("a", "true");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("a"));
    }

    // ---------- parse(Options, String[], boolean) ----------

    @Test
    public void testParseStopAtNonOption() throws Exception
    {
        options.addOption("a", false, "option a");
        CommandLine cmd = parser.parse(options, new String[] {"-a", "arg1", "-b"}, true);
        assertTrue(cmd.hasOption("a"));
        List args = cmd.getArgList();
        assertEquals(2, args.size());
        assertEquals("arg1", args.get(0));
        assertEquals("-b", args.get(1));
    }

    // ---------- Double dash handling ----------

    @Test
    public void testDoubleDashNoRemaining() throws Exception
    {
        CommandLine cmd = parser.parse(options, new String[] {"--"});
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testDoubleDashWithRemaining() throws Exception
    {
        CommandLine cmd = parser.parse(options, new String[] {"--", "foo", "bar"});
        List args = cmd.getArgList();
        assertEquals(2, args.size());
        assertEquals("foo", args.get(0));
        assertEquals("bar", args.get(1));
    }

    @Test
    public void testDoubleDashInsideRemainingNotDuplicated() throws Exception
    {
        CommandLine cmd = parser.parse(options, new String[] {"--", "foo", "--", "bar"});
        List args = cmd.getArgList();
        assertEquals(2, args.size());
        assertEquals("foo", args.get(0));
        assertEquals("bar", args.get(1));
    }

    // ---------- Single dash handling ----------

    @Test
    public void testSingleDashArg() throws Exception
    {
        CommandLine cmd = parser.parse(options, new String[] {"-"});
        List args = cmd.getArgList();
        assertEquals(1, args.size());
        assertEquals("-", args.get(0));
    }

    @Test
    public void testSingleDashStopAtNonOption() throws Exception
    {
        CommandLine cmd = parser.parse(options, new String[] {"-", "foo"}, true);
        List args = cmd.getArgList();
        assertEquals(1, args.size());
        assertEquals("foo", args.get(0));
    }

    // ---------- Option/unrecognized handling ----------

    @Test
    public void testUnrecognizedOptionStopAtNonOption() throws Exception
    {
        CommandLine cmd = parser.parse(options, new String[] {"-x", "foo"}, true);
        List args = cmd.getArgList();
        assertEquals(2, args.size());
        assertEquals("-x", args.get(0));
        assertEquals("foo", args.get(1));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnrecognizedOptionThrows() throws Exception
    {
        parser.parse(options, new String[] {"-x"});
    }

    // ---------- Normal argument handling ----------

    @Test
    public void testNormalArgumentsMultiple() throws Exception
    {
        CommandLine cmd = parser.parse(options, new String[] {"foo", "bar"});
        List args = cmd.getArgList();
        assertEquals(2, args.size());
        assertEquals("foo", args.get(0));
        assertEquals("bar", args.get(1));
    }

    @Test
    public void testArgumentStopAtNonOption() throws Exception
    {
        options.addOption("a", false, "opt a");
        CommandLine cmd = parser.parse(options, new String[] {"foo", "-a"}, true);
        List args = cmd.getArgList();
        assertEquals(2, args.size());
        assertEquals("foo", args.get(0));
        assertEquals("-a", args.get(1));
        assertFalse(cmd.hasOption("a"));
    }

    // ---------- Option with argument value via full parse ----------

    @Test
    public void testParseOptionWithArg() throws Exception
    {
        options.addOption("f", true, "file");
        CommandLine cmd = parser.parse(options, new String[] {"-f", "test.txt"});
        assertEquals("test.txt", cmd.getOptionValue("f"));
    }

    // ---------- processProperties ----------

    @Test
    public void testProcessPropertiesNull() throws Exception
    {
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processProperties(null);
        assertEquals(0, parser.cmd.getOptions().length);
    }

    @Test
    public void testProcessPropertiesHasArg() throws Exception
    {
        options.addOption("f", true, "file option");
        Properties props = new Properties();
        props.setProperty("f", "test.txt");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("f"));
        assertEquals("test.txt", cmd.getOptionValue("f"));
    }

    @Test
    public void testProcessPropertiesAlreadyHasOption() throws Exception
    {
        options.addOption("f", true, "file option");
        Properties props = new Properties();
        props.setProperty("f", "ignored.txt");
        CommandLine cmd = parser.parse(options, new String[] {"-f", "cmdline.txt"}, props);
        assertEquals("cmdline.txt", cmd.getOptionValue("f"));
    }

    @Test
    public void testProcessPropertiesNoArgFalseValue() throws Exception
    {
        options.addOption("a", false, "opt a");
        Properties props = new Properties();
        props.setProperty("a", "false");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testProcessPropertiesNoArgTrueValue() throws Exception
    {
        options.addOption("a", false, "opt a");
        Properties props = new Properties();
        props.setProperty("a", "true");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testProcessPropertiesNoArgYesValue() throws Exception
    {
        options.addOption("a", false, "opt a");
        Properties props = new Properties();
        props.setProperty("a", "yes");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testProcessPropertiesNoArgOneValue() throws Exception
    {
        options.addOption("a", false, "opt a");
        Properties props = new Properties();
        props.setProperty("a", "1");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("a"));
    }

    // ---------- checkRequiredOptions ----------

    @Test
    public void testCheckRequiredOptionsNone() throws Exception
    {
        parser.setOptions(options);
        parser.checkRequiredOptions();
        // no exception thrown - success
    }

    @Test
    public void testCheckRequiredOptionsOneMissing() throws Exception
    {
        Option req = new Option("r", "required opt");
        req.setRequired(true);
        options.addOption(req);
        parser.setOptions(options);
        try
        {
            parser.checkRequiredOptions();
            fail("Expected MissingOptionException");
        }
        catch (MissingOptionException e)
        {
            assertTrue(e.getMessage().startsWith("Missing required option:"));
        }
    }

    @Test
    public void testCheckRequiredOptionsMultipleMissing() throws Exception
    {
        Option req1 = new Option("r", "required opt1");
        req1.setRequired(true);
        Option req2 = new Option("s", "required opt2");
        req2.setRequired(true);
        options.addOption(req1);
        options.addOption(req2);
        parser.setOptions(options);
        try
        {
            parser.checkRequiredOptions();
            fail("Expected MissingOptionException");
        }
        catch (MissingOptionException e)
        {
            assertTrue(e.getMessage().startsWith("Missing required options:"));
        }
    }

    @Test(expected = MissingOptionException.class)
    public void testParseMissingRequiredOption() throws Exception
    {
        Option req = new Option("r", "required opt");
        req.setRequired(true);
        options.addOption(req);
        parser.parse(options, new String[0]);
    }

    // ---------- processArgs ----------

    @Test
    public void testProcessArgsMissingArgument() throws Exception
    {
        Option opt = new Option("f", true, "file");
        options.addOption(opt);
        parser.setOptions(options);

        List tokens = Arrays.asList(new String[] {});
        ListIterator iter = tokens.listIterator();

        try
        {
            parser.processArgs(opt, iter);
            fail("Expected MissingArgumentException");
        }
        catch (MissingArgumentException e)
        {
            // expected
        }
    }

    @Test
    public void testProcessArgsSingleValue() throws Exception
    {
        Option opt = new Option("f", true, "file");
        options.addOption(opt);
        parser.setOptions(options);

        List tokens = Arrays.asList(new String[] {"test.txt"});
        ListIterator iter = tokens.listIterator();

        parser.processArgs(opt, iter);
        assertEquals("test.txt", opt.getValue());
    }

    @Test
    public void testProcessArgsStripsQuotes() throws Exception
    {
        Option opt = new Option("f", true, "file");
        options.addOption(opt);
        parser.setOptions(options);

        List tokens = Arrays.asList(new String[] {"\"quoted.txt\""});
        ListIterator iter = tokens.listIterator();

        parser.processArgs(opt, iter);
        assertEquals("quoted.txt", opt.getValue());
    }

    @Test
    public void testProcessArgsStopsAtOption() throws Exception
    {
        Option a = new Option("a", false, "opt a");
        options.addOption(a);
        Option f = new Option("f", true, "file");
        options.addOption(f);
        parser.setOptions(options);

        List tokens = Arrays.asList(new String[] {"-a"});
        ListIterator iter = tokens.listIterator();

        try
        {
            parser.processArgs(f, iter);
            fail("Expected MissingArgumentException");
        }
        catch (MissingArgumentException e)
        {
            // expected
        }
        assertTrue(iter.hasNext());
        assertEquals("-a", iter.next());
    }

    @Test
    public void testProcessArgsMultipleTokensOnlyOneAllowed() throws Exception
    {
        Option opt = new Option("f", true, "file");
        options.addOption(opt);
        parser.setOptions(options);

        List tokens = Arrays.asList(new String[] {"file1.txt", "file2.txt"});
        ListIterator iter = tokens.listIterator();

        parser.processArgs(opt, iter);
        assertEquals("file1.txt", opt.getValue());
        assertTrue(iter.hasNext());
        assertEquals("file2.txt", iter.next());
    }

    @Test
    public void testProcessArgsOptionalArgNoException() throws Exception
    {
        Option opt = OptionBuilder.hasOptionalArg().create("o");
        options.addOption(opt);
        parser.setOptions(options);

        List tokens = Arrays.asList(new String[] {});
        ListIterator iter = tokens.listIterator();

        parser.processArgs(opt, iter);
        assertNull(opt.getValues());
    }

    // ---------- processOption ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOptionUnrecognized() throws Exception
    {
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        List tokens = Arrays.asList(new String[] {});
        parser.processOption("-x", tokens.listIterator());
    }

    @Test
    public void testProcessOptionRequired() throws Exception
    {
        Option req = new Option("r", "required");
        req.setRequired(true);
        options.addOption(req);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        assertEquals(1, parser.getRequiredOptions().size());

        List tokens = Arrays.asList(new String[] {});
        parser.processOption("-r", tokens.listIterator());

        assertEquals(0, parser.getRequiredOptions().size());
        assertTrue(parser.cmd.hasOption("r"));
    }

    @Test
    public void testProcessOptionInRequiredGroup() throws Exception
    {
        Option a = new Option("a", "opt a");
        Option b = new Option("b", "opt b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        group.setRequired(true);
        options.addOptionGroup(group);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        assertEquals(1, parser.getRequiredOptions().size());

        List tokens = Arrays.asList(new String[] {});
        parser.processOption("-a", tokens.listIterator());

        assertEquals("a", group.getSelected());
        assertEquals(0, parser.getRequiredOptions().size());
        assertTrue(parser.cmd.hasOption("a"));
    }

    @Test
    public void testProcessOptionWithArg() throws Exception
    {
        Option opt = new Option("f", true, "file");
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        List tokens = Arrays.asList(new String[] {"test.txt"});
        parser.processOption("-f", tokens.listIterator());

        assertTrue(parser.cmd.hasOption("f"));
        assertEquals("test.txt", parser.cmd.getOptionValue("f"));
    }

    // ---------- setOptions / getOptions / getRequiredOptions ----------

    @Test
    public void testSetAndGetOptions()
    {
        options.addOption("a", false, "opt a");
        parser.setOptions(options);
        assertSame(options, parser.getOptions());
        assertNotNull(parser.getRequiredOptions());
        assertEquals(0, parser.getRequiredOptions().size());
    }
}