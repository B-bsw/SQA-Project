package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

public class ParserTest {
    private Parser parser;
    private Options options;
    private CommandLine cmd;

    @Before
    public void setUp() {
        parser = new Parser() {
            @Override
            protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
                return arguments;
            }
        };
        options = new Options();
        cmd = new CommandLine();
    }

    @After
    public void tearDown() {
        parser = null;
        options = null;
        cmd = null;
    }

    @Test
    public void testParseNullArguments() throws ParseException {
        CommandLine result = parser.parse(options, null);
        assertNotNull(result);
        assertEquals(0, result.getArgs().length);
        assertEquals(0, result.getOptions().length);
    }

    @Test
    public void testParseEmptyArguments() throws ParseException {
        String[] args = new String[0];
        CommandLine result = parser.parse(options, args);
        assertNotNull(result);
        assertEquals(0, result.getArgs().length);
    }

    @Test
    public void testParseSingleArgument() throws ParseException {
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value"};
        CommandLine result = parser.parse(options, args);
        assertNotNull(result);
        assertEquals("value", result.getOptionValue("a"));
        assertEquals(0, result.getArgs().length);
    }

    @Test
    public void testParseWithStopAtNonOption() throws ParseException {
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value", "nonOption", "other"};
        CommandLine result = parser.parse(options, args, true);
        assertNotNull(result);
        assertEquals("value", result.getOptionValue("a"));
        assertEquals(2, result.getArgs().length);
        assertEquals("nonOption", result.getArgs()[0]);
        assertEquals("other", result.getArgs()[1]);
    }

    @Test
    public void testParseWithoutStopAtNonOption() {
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value", "nonOption"};
        try {
            parser.parse(options, args);
            fail("Expected ParseException");
        } catch (ParseException e) {
            // Expected
        }
    }

    @Test
    public void testParseDoubleDash() throws ParseException {
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value", "--", "arg1", "arg2"};
        CommandLine result = parser.parse(options, args);
        assertNotNull(result);
        assertEquals("value", result.getOptionValue("a"));
        assertEquals(2, result.getArgs().length);
        assertEquals("arg1", result.getArgs()[0]);
        assertEquals("arg2", result.getArgs()[1]);
    }

    @Test
    public void testParseSingleDash() throws ParseException {
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-", "arg1"};
        CommandLine result = parser.parse(options, args);
        assertNotNull(result);
        assertEquals(1, result.getArgs().length);
        assertEquals("arg1", result.getArgs()[0]);
    }

    @Test
    public void testParseSingleDashWithStopAtNonOption() throws ParseException {
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-", "arg1"};
        CommandLine result = parser.parse(options, args, true);
        assertNotNull(result);
        assertEquals(1, result.getArgs().length);
        assertEquals("arg1", result.getArgs()[0]);
    }

    @Test
    public void testParseUnknownOption() {
        String[] args = {"-unknown"};
        try {
            parser.parse(options, args);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e instanceof UnrecognizedOptionException);
            assertEquals("Unrecognized option: -unknown", e.getMessage());
        }
    }

    @Test
    public void testParseWithProperties() throws ParseException {
        options.addOption("a", "alpha", true, "Alpha option");
        Properties props = new Properties();
        props.setProperty("a", "propValue");
        String[] args = new String[0];
        CommandLine result = parser.parse(options, args, props);
        assertNotNull(result);
        assertEquals("propValue", result.getOptionValue("a"));
    }

    @Test
    public void testProcessPropertiesWithYesValue() throws ParseException {
        options.addOption("flag", false, "Flag option");
        Properties props = new Properties();
        props.setProperty("flag", "yes");
        String[] args = new String[0];
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processProperties(props);
        assertTrue(parser.cmd.hasOption("flag"));
    }

    @Test
    public void testProcessPropertiesWithTrueValue() throws ParseException {
        options.addOption("flag", false, "Flag option");
        Properties props = new Properties();
        props.setProperty("flag", "true");
        String[] args = new String[0];
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processProperties(props);
        assertTrue(parser.cmd.hasOption("flag"));
    }

    @Test
    public void testProcessPropertiesWithOneValue() throws ParseException {
        options.addOption("flag", false, "Flag option");
        Properties props = new Properties();
        props.setProperty("flag", "1");
        String[] args = new String[0];
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processProperties(props);
        assertTrue(parser.cmd.hasOption("flag"));
    }

    @Test
    public void testProcessPropertiesWithNonYesValue() throws ParseException {
        options.addOption("flag", false, "Flag option");
        Properties props = new Properties();
        props.setProperty("flag", "no");
        String[] args = new String[0];
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processProperties(props);
        assertFalse(parser.cmd.hasOption("flag"));
    }

    @Test
    public void testProcessPropertiesNull() {
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processProperties(null);
        // Should not throw
    }

    @Test
    public void testCheckRequiredOptionsWithMissing() {
        options.addOption("a", "alpha", true, "Alpha option");
        Option opt = new Option("b", "beta", true, "Beta option");
        opt.setRequired(true);
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.getRequiredOptions().add("b");
        try {
            parser.checkRequiredOptions();
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testCheckRequiredOptionsWithNoneMissing() throws MissingOptionException {
        options.addOption("a", "alpha", true, "Alpha option");
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.checkRequiredOptions();
        // Should not throw
    }

    @Test
    public void testProcessArgsWithValue() throws ParseException {
        Option opt = new Option("a", "alpha", true, "Alpha option");
        options.addOption(opt);
        String[] args = {"value", "-b"};
        List list = new ArrayList();
        for (String s : args) {
            list.add(s);
        }
        ListIterator iter = list.listIterator();
        parser.setOptions(options);
        parser.processArgs(opt, iter);
        assertEquals(1, opt.getValues().length);
        assertEquals("value", opt.getValue());
    }

    @Test
    public void testProcessArgsWithQuotedValue() throws ParseException {
        Option opt = new Option("a", "alpha", true, "Alpha option");
        options.addOption(opt);
        String[] args = {"\"quoted\"", "-b"};
        List list = new ArrayList();
        for (String s : args) {
            list.add(s);
        }
        ListIterator iter = list.listIterator();
        parser.setOptions(options);
        parser.processArgs(opt, iter);
        assertEquals(1, opt.getValues().length);
        assertEquals("quoted", opt.getValue());
    }

    @Test
    public void testProcessArgsWithMissingValue() {
        Option opt = new Option("a", "alpha", true, "Alpha option");
        options.addOption(opt);
        String[] args = {"-b"};
        List list = new ArrayList();
        for (String s : args) {
            list.add(s);
        }
        ListIterator iter = list.listIterator();
        parser.setOptions(options);
        try {
            parser.processArgs(opt, iter);
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testProcessOptionWithRequiredOption() throws ParseException {
        Option opt = new Option("a", "alpha", true, "Alpha option");
        opt.setRequired(true);
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.getRequiredOptions().add("a");
        List list = new ArrayList();
        ListIterator iter = list.listIterator();
        parser.processOption("-a", iter);
        assertTrue(parser.cmd.hasOption("a"));
        assertFalse(parser.getRequiredOptions().contains("a"));
    }

    @Test
    public void testProcessOptionWithOptionalArg() throws ParseException {
        Option opt = new Option("a", "alpha", true, "Alpha option");
        opt.setOptionalArg(true);
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        List list = new ArrayList();
        ListIterator iter = list.listIterator();
        parser.processOption("-a", iter);
        assertTrue(parser.cmd.hasOption("a"));
    }

    @Test
    public void testProcessOptionWithGroup() throws ParseException {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option opt1 = new Option("a", "alpha", false, "Alpha option");
        Option opt2 = new Option("b", "beta", false, "Beta option");
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.getRequiredOptions().add(group);
        List list = new ArrayList();
        ListIterator iter = list.listIterator();
        parser.processOption("-a", iter);
        assertTrue(parser.cmd.hasOption("a"));
        assertNull(group.getSelected());
    }
}