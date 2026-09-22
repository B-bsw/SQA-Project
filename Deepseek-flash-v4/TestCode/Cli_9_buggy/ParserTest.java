package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

import static org.junit.Assert.*;

public class ParserTest {

    private Parser parser;
    private Options options;
    private CommandLine cmd;

    @Before
    public void setUp() {
        parser = createParser();
        options = new Options();
        cmd = new CommandLine();
    }

    private Parser createParser() {
        return new Parser() {
            @Override
            protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
                return arguments == null ? new String[0] : arguments;
            }
        };
    }

    @Test
    public void testParseNullArgumentsWithNoOptions() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha option");
        parser.setOptions(options);
        
        CommandLine result = parser.parse(options, null);
        
        assertNotNull(result);
        assertTrue(result.getOptions().length == 0);
    }

    @Test
    public void testParseEmptyArguments() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha option");
        
        CommandLine result = parser.parse(options, new String[0]);
        
        assertNotNull(result);
        assertTrue(result.getOptions().length == 0);
    }

    @Test
    public void testParseSimpleOption() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha option");
        
        CommandLine result = parser.parse(options, new String[]{"-a"});
        
        assertNotNull(result);
        assertEquals(1, result.getOptions().length);
        assertEquals("a", result.getOptions()[0].getOpt());
    }

    @Test
    public void testParseOptionWithValue() throws ParseException {
        options.addOption("o", "output", true, "Output file");
        
        CommandLine result = parser.parse(options, new String[]{"-o", "file.txt"});
        
        assertNotNull(result);
        assertEquals("file.txt", result.getOptionValue("o"));
    }

    @Test
    public void testParseDoubleDashStopsOptions() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha");
        
        CommandLine result = parser.parse(options, new String[]{"--", "-a"});
        
        assertNotNull(result);
        assertEquals(1, result.getArgs().length);
        assertEquals("-a", result.getArgs()[0]);
    }

    @Test
    public void testParseSingleDashAsArgument() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha");
        
        CommandLine result = parser.parse(options, new String[]{"-"});
        
        assertNotNull(result);
        assertEquals(1, result.getArgs().length);
        assertEquals("-", result.getArgs()[0]);
    }

    @Test
    public void testParseUnknownOption() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha");
        
        CommandLine result = parser.parse(options, new String[]{"-x"});
        
        assertNotNull(result);
        assertEquals(1, result.getOptions().length);
        assertEquals("x", result.getOptions()[0].getOpt());
    }

    @Test(expected = MissingOptionException.class)
    public void testMissingRequiredOption() throws ParseException {
        options.addOption(Option.builder("r").required().build());
        
        parser.parse(options, new String[0]);
    }

    @Test
    public void testProcessPropertiesWithNull() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha");
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        
        parser.processProperties(null);
        
        assertEquals(0, parser.cmd.getOptions().length);
    }

    @Test
    public void testProcessPropertiesWithPropertyOption() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha");
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        
        Properties props = new Properties();
        props.setProperty("a", "true");
        parser.processProperties(props);
        
        assertEquals(1, parser.cmd.getOptions().length);
    }

    @Test
    public void testProcessPropertiesFalseValue() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha");
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        
        Properties props = new Properties();
        props.setProperty("a", "false");
        parser.processProperties(props);
        
        assertEquals(0, parser.cmd.getOptions().length);
    }

    @Test
    public void testCheckRequiredOptionsWithMissingOption() {
        options.addOption(Option.builder("r").required().build());
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.requiredOptions = new ArrayList(Arrays.asList("r"));
        
        try {
            parser.checkRequiredOptions();
            fail("Should throw MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().contains("Missing required option"));
        }
    }

    @Test
    public void testProcessArgsWithSingleValue() throws ParseException {
        Option opt = Option.builder("o").hasArg().build();
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        
        List tokenList = Arrays.asList(new String[]{"value1"});
        ListIterator iter = tokenList.listIterator();
        
        parser.processArgs(opt, iter);
        
        assertEquals(1, opt.getValues().length);
        assertEquals("value1", opt.getValues()[0]);
    }

    @Test
    public void testProcessArgsWithMultipleValues() throws ParseException {
        Option opt = Option.builder("o").hasArgs().build();
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        
        List tokenList = Arrays.asList(new String[]{"v1", "v2"});
        ListIterator iter = tokenList.listIterator();
        
        parser.processArgs(opt, iter);
        
        assertEquals(2, opt.getValues().length);
    }

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgsMissingRequiredArgument() throws ParseException {
        Option opt = Option.builder("o").hasArg().build();
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        
        List tokenList = Arrays.asList(new String[]{"-o"});
        ListIterator iter = tokenList.listIterator();
        iter.next();
        iter.previous();
        
        parser.processArgs(opt, iter);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOptionUnknownOption() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha");
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        
        List tokenList = Arrays.asList(new String[]{"-x"});
        parser.processOption("-x", tokenList.listIterator());
    }

    @Test
    public void testProcessOptionNormalOption() throws ParseException {
        Option opt = Option.builder("a").build();
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        
        List tokenList = Arrays.asList(new String[]{"-a"});
        parser.processOption("-a", tokenList.listIterator());
        
        assertEquals(1, parser.cmd.getOptions().length);
    }

    @Test
    public void testProcessOptionWithOptionalArg() throws ParseException {
        Option opt = Option.builder("a").hasOptionalArg().build();
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        
        List tokenList = Arrays.asList(new String[]{"-a"});
        parser.processOption("-a", tokenList.listIterator());
        
        assertEquals(1, parser.cmd.getOptions().length);
    }

    @Test
    public void testParseSingleArgument() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha");
        
        CommandLine result = parser.parse(options, new String[]{"arg1"});
        
        assertEquals(1, result.getArgs().length);
        assertEquals("arg1", result.getArgs()[0]);
    }

    @Test
    public void testParseMultipleArguments() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha");
        
        CommandLine result = parser.parse(options, new String[]{"arg1", "arg2"});
        
        assertEquals(2, result.getArgs().length);
    }

    @Test
    public void testParseArgumentWithStopAtNonOption() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha");
        
        CommandLine result = parser.parse(options, new String[]{"arg1", "-a"}, true);
        
        assertEquals(2, result.getArgs().length);
        assertEquals(0, result.getOptions().length);
    }
}