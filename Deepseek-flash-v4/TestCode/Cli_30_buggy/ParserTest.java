import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

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

    @Test
    public void testParseWithNullArguments() throws ParseException {
        options.addOption("a", "aaa", false, "desc");
        parser.setOptions(options);
        CommandLine result = parser.parse(options, null);
        assertNotNull(result);
        assertEquals(0, result.getArgs().length);
    }

    @Test
    public void testParseWithStopAtNonOptionAndNonOptionArgument() throws ParseException {
        options.addOption("a", "aaa", false, "desc");
        parser.setOptions(options);
        String[] args = {"foo", "-a"};
        CommandLine result = parser.parse(options, args, null, true);
        assertTrue(result.hasOption("a"));
        assertEquals(1, result.getArgs().length);
        assertEquals("foo", result.getArgs()[0]);
    }

    @Test
    public void testParseWithStopAtNonOptionAndOptionAfterNonOption() throws ParseException {
        options.addOption("a", "aaa", false, "desc");
        parser.setOptions(options);
        String[] args = {"foo", "-a"};
        CommandLine result = parser.parse(options, args, null, true);
        assertEquals(1, result.getArgs().length);
        assertFalse(result.hasOption("a"));
    }

    @Test
    public void testParseWithDoubleDashEatTheRest() throws ParseException {
        options.addOption("a", "aaa", false, "desc");
        parser.setOptions(options);
        String[] args = {"--", "-a", "value"};
        CommandLine result = parser.parse(options, args, null, false);
        assertFalse(result.hasOption("a"));
        assertEquals(2, result.getArgs().length);
    }

    @Test
    public void testParseWithSingleDashAddsArg() throws ParseException {
        parser.setOptions(options);
        String[] args = {"-", "foo"};
        CommandLine result = parser.parse(options, args, null, false);
        assertEquals(1, result.getArgs().length);
        assertEquals("foo", result.getArgs()[0]);
    }

    @Test
    public void testParseWithUnrecognizedOptionThrowsException() {
        parser.setOptions(options);
        String[] args = {"-x"};
        try {
            parser.parse(options, args);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e instanceof UnrecognizedOptionException);
        }
    }

    @Test
    public void testParseWithRequiredOptionMissing() {
        Option required = new Option("r", "required", true, "desc");
        required.setRequired(true);
        options.addOption(required);
        parser.setOptions(options);
        String[] args = {};
        try {
            parser.parse(options, args);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            // expected
        }
    }

    @Test
    public void testParseWithPropertiesAndRequiredOption() throws ParseException {
        Option opt = new Option("a", "aaa", true, "desc");
        opt.setRequired(true);
        options.addOption(opt);
        parser.setOptions(options);
        Properties props = new Properties();
        props.setProperty("a", "value");
        CommandLine result = parser.parse(options, new String[0], props, false);
        assertTrue(result.hasOption("a"));
        assertEquals("value", result.getOptionValue("a"));
    }

    @Test
    public void testProcessArgsWithDifferentValues() throws ParseException {
        Option opt = new Option("a", "aaa", true, "desc");
        opt.setArgName("arg");
        options.addOption(opt);
        parser.setOptions(options);
        parser.setOptions(new Options());
        ListIterator iter = Arrays.asList("value1", "value2", "-b").listIterator();
        parser.processArgs(opt, iter);
        assertNotNull(opt.getValues());
        assertEquals(2, opt.getValues().length);
        assertEquals("value1", opt.getValues()[0]);
        assertEquals("value2", opt.getValues()[1]);
    }

    @Test
    public void testProcessArgsWithNoValue() {
        Option opt = new Option("a", "aaa", false, "desc");
        options.addOption(opt);
        parser.setOptions(options);
        ListIterator iter = Arrays.asList("-b").listIterator();
        try {
            parser.processArgs(opt, iter);
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException e) {
            // expected
        }
    }

    @Test
    public void testProcessArgsWithQuotesStripped() throws ParseException {
        Option opt = new Option("a", "aaa", true, "desc");
        options.addOption(opt);
        parser.setOptions(options);
        ListIterator iter = Arrays.asList("\"value\"", "-b").listIterator();
        parser.processArgs(opt, iter);
        assertEquals("value", opt.getValue());
    }

    @Test
    public void testProcessPropertiesWithNullProperties() throws ParseException {
        parser.setOptions(options);
        parser.setOptions(new Options());
        parser.processProperties(null);
        // No exception expected
    }

    @Test
    public void testCheckRequiredOptionsWithEmptyList() throws MissingOptionException {
        parser.setOptions(new Options());
        parser.checkRequiredOptions();
        // No exception expected
    }

    @Test
    public void testCheckRequiredOptionsWithNonEmptyList() {
        options.addOption("a", "aaa", false, "desc");
        Options options2 = new Options();
        parser.setOptions(options2);
        parser.updateRequiredOptions(new Option("a", "aaa", false, "desc"));
        try {
            parser.checkRequiredOptions();
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            // expected
        }
    }

    @Test
    public void testProcessOptionWithOptionGroup() throws ParseException {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "aaa", false, "desc");
        Option opt2 = new Option("b", "bbb", false, "desc");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processOption("a", Arrays.asList().listIterator());
        assertTrue(parser.cmd.hasOption("a"));
    }

    @Test
    public void testProcessOptionWithRequiredOption() throws ParseException {
        Option opt = new Option("r", "required", true, "desc");
        opt.setRequired(true);
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processOption("r", Arrays.asList("val").listIterator());
        assertTrue(parser.cmd.hasOption("r"));
    }

    @Test
    public void testUpdateRequiredOptionsWithGroupAndNonRequiredOption() throws ParseException {
        Option opt = new Option("a", "aaa", false, "desc");
        opt.setRequired(false);
        options.addOption(opt);
        parser.setOptions(options);
        parser.updateRequiredOptions(opt);
        // No exception expected
    }

    @Test
    public void testParseWithPropertiesAndNonExistingOption() throws ParseException {
        options.addOption("a", "aaa", false, "desc");
        parser.setOptions(options);
        Properties props = new Properties();
        props.setProperty("b", "value");
        CommandLine result = parser.parse(options, new String[0], props, false);
        assertNotNull(result);
        assertFalse(result.hasOption("b"));
    }

    @Test
    public void testParseWithOptionGroupAndProperties() throws ParseException {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "aaa", true, "desc");
        Option opt2 = new Option("b", "bbb", false, "desc");
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);
        parser.setOptions(options);
        Properties props = new Properties();
        props.setProperty("a", "value");
        props.setProperty("b", "true");
        CommandLine result = parser.parse(options, new String[0], props, false);
        assertTrue(result.hasOption("a"));
        assertEquals("value", result.getOptionValue("a"));
    }
}