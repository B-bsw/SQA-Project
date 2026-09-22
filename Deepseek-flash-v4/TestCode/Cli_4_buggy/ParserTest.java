package org.apache.commons.cli;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;
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
    }

    // Test parse(Options, String[]) - basic valid option
    @Test
    public void testParseValidOption() throws ParseException {
        Option opt = new Option("a", "aaa", false, "desc");
        options.addOption(opt);
        cmd = parser.parse(options, new String[]{"-a"});
        assertNotNull(cmd);
        assertTrue(cmd.hasOption("a"));
    }

    // Test parse with properties - valid bool option
    @Test
    public void testParseWithProperties() throws ParseException {
        Option opt = new Option("b", false, "bool");
        options.addOption(opt);
        Properties props = new Properties();
        props.setProperty("b", "true");
        cmd = parser.parse(options, new String[0], props);
        assertNotNull(cmd);
        assertTrue(cmd.hasOption("b"));
    }

    // Test parse with properties - invalid bool value
    @Test
    public void testParseWithPropertiesInvalidBool() throws ParseException {
        Option opt = new Option("c", false, "bool");
        options.addOption(opt);
        Properties props = new Properties();
        props.setProperty("c", "no");
        cmd = parser.parse(options, new String[0], props);
        assertNotNull(cmd);
        assertFalse(cmd.hasOption("c"));
    }

    // Test parse with properties - option has arg
    @Test
    public void testParseWithPropertiesHasArg() throws ParseException {
        Option opt = new Option("d", true, "desc");
        options.addOption(opt);
        Properties props = new Properties();
        props.setProperty("d", "value");
        cmd = parser.parse(options, new String[0], props);
        assertNotNull(cmd);
        assertTrue(cmd.hasOption("d"));
        assertEquals("value", cmd.getOptionValue("d"));
    }

    // Test parse with null arguments
    @Test
    public void testParseNullArguments() throws ParseException {
        cmd = parser.parse(options, null);
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    // Test parse with stopAtNonOption true and non-option encountered
    @Test
    public void testParseStopAtNonOption() throws ParseException {
        Option opt = new Option("e", false, "desc");
        options.addOption(opt);
        cmd = parser.parse(options, new String[]{"-e", "arg1", "arg2"}, true);
        assertNotNull(cmd);
        assertTrue(cmd.hasOption("e"));
        assertEquals(2, cmd.getArgs().length);
    }

    // Test parse with stopAtNonOption false and non-option encountered
    @Test
    public void testParseDontStopAtNonOption() throws ParseException {
        Option opt = new Option("f", false, "desc");
        options.addOption(opt);
        cmd = parser.parse(options, new String[]{"-f", "arg1"}, false);
        assertNotNull(cmd);
        assertTrue(cmd.hasOption("f"));
        assertEquals(1, cmd.getArgs().length);
    }

    // Test processOption with unrecognized option throws exception
    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOptionUnrecognized() throws ParseException {
        options.addOption(new Option("g", false, "desc"));
        parser.parse(options, new String[]{"-z"});
    }

    // Test processOption with required option not present
    @Test(expected = MissingOptionException.class)
    public void testProcessOptionRequiredMissing() throws ParseException {
        Option req = new Option("h", true, "required");
        req.setRequired(true);
        options.addOption(req);
        parser.parse(options, new String[0]);
    }

    // Test processArgs with missing required arg
    @Test(expected = MissingArgumentException.class)
    public void testProcessArgsMissingArg() throws ParseException {
        Option opt = new Option("i", true, "needs arg");
        options.addOption(opt);
        cmd = new CommandLine();
        parser.parse(options, new String[]{"-i"});
    }

    // Test processArgs with valid argument
    @Test
    public void testProcessArgsValid() throws ParseException {
        Option opt = new Option("j", true, "needs arg");
        options.addOption(opt);
        cmd = parser.parse(options, new String[]{"-j", "value"});
        assertTrue(cmd.hasOption("j"));
        assertEquals("value", cmd.getOptionValue("j"));
    }

    // Test processing of properties in processProperties (private method)
    @Test
    public void testProcessPropertiesWithNullProps() throws ParseException {
        Option opt = new Option("k", true, "arg");
        options.addOption(opt);
        cmd = parser.parse(options, new String[0], null);
        assertFalse(cmd.hasOption("k"));
    }

    // Test flatten call with non-array arguments
    @Test
    public void testFlattenWithNullArgs() throws ParseException {
        final boolean[] called = {false};
        Parser testParser = new Parser() {
            @Override
            protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
                called[0] = true;
                assertNull(arguments);
                return null;
            }
        };
        try {
            testParser.parse(new Options(), (String[]) null);
        } catch (NullPointerException e) {
            // expected, flatten returns null
        }
        assertTrue(called[0]);
    }

    // Test option group handling - required group
    @Test
    public void testOptionGroupRequired() throws ParseException {
        OptionGroup group = new OptionGroup();
        Option g1 = new Option("m", false, "g1");
        Option g2 = new Option("n", false, "g2");
        group.addOption(g1);
        group.addOption(g2);
        group.setRequired(true);
        options.addOptionGroup(group);
        cmd = parser.parse(options, new String[]{"-m"});
        assertTrue(cmd.hasOption("m"));
        // should not throw since group is satisfied
    }

    // Test double-dash handling in parse loop
    @Test
    public void testParseDoubleDash() throws ParseException {
        options.addOption(new Option("o", false, "opt"));
        cmd = parser.parse(options, new String[]{"-o", "--", "-x"});
        assertTrue(cmd.hasOption("o"));
        // after --, -x should be added as arg
        String[] args = cmd.getArgs();
        assertEquals(1, args.length);
        assertEquals("-x", args[0]);
    }

    // Test single dash handling with stopAtNonOption
    @Test
    public void testSingleDashStopAtNonOption() throws ParseException {
        options.addOption(new Option("p", false, "opt"));
        cmd = parser.parse(options, new String[]{"-"}, true);
        assertEquals(1, cmd.getArgs().length);
        assertEquals("-", cmd.getArgs()[0]);
    }
}