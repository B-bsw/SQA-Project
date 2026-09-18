package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

/**
 * Test suite for {@link Parser}.
 */
public class ParserTest {

    private static class ConcreteParser extends Parser {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments;
        }
    }

    private ConcreteParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new ConcreteParser();
        options = new Options();
    }

    @Test
    public void parse_givenTwoArgParse_shouldDelegateAndSucceed() throws Exception {
        options.addOption("a", "alpha", false, "alpha option");
        String[] args = new String[] { "-a" };

        CommandLine cl = parser.parse(options, args);

        assertNotNull(cl);
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void parse_givenThreeArgParseWithProperties_shouldDelegateAndSucceed() throws Exception {
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", true, "beta option");
        String[] args = new String[] { "-a" };
        Properties props = new Properties();
        props.setProperty("b", "propValue");

        CommandLine cl = parser.parse(options, args, props);

        assertNotNull(cl);
        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
        assertEquals("propValue", cl.getOptionValue("b"));
    }

    @Test
    public void parse_givenThreeArgParseWithStopAtNonOption_shouldDelegateAndSucceed() throws Exception {
        options.addOption("a", false, "alpha option");
        String[] args = new String[] { "-a", "nonOption", "extra" };

        CommandLine cl = parser.parse(options, args, true);

        assertNotNull(cl);
        assertTrue(cl.hasOption("a"));
        assertEquals(2, cl.getArgs().length);
        assertEquals("nonOption", cl.getArgs()[0]);
        assertEquals("extra", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenNullArguments_shouldTreatAsEmptyArray() throws Exception {
        CommandLine cl = parser.parse(options, null);

        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void parse_givenOptionsWithPreviousValues_shouldClearValues() throws Exception {
        Option opt = new Option("v", true, "value option");
        opt.addValueForProcessing("oldValue");
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[0]);

        assertNotNull(cl);
        assertNull(opt.getValues());
    }

    @Test
    public void parse_givenDoubleDashToken_shouldEatTheRestExcludingDoubleDash() throws Exception {
        options.addOption("a", false, "alpha option");
        String[] args = new String[] { "-a", "--", "arg1", "--", "arg2" };

        CommandLine cl = parser.parse(options, args, false);

        assertNotNull(cl);
        assertTrue(cl.hasOption("a"));
        String[] leftOver = cl.getArgs();
        assertEquals(2, leftOver.length);
        assertEquals("arg1", leftOver[0]);
        assertEquals("arg2", leftOver[1]);
    }

    @Test
    public void parse_givenSingleDashAndStopAtNonOptionFalse_shouldAddDashAsArg() throws Exception {
        String[] args = new String[] { "-", "extra" };

        CommandLine cl = parser.parse(options, args, false);

        assertNotNull(cl);
        assertEquals(2, cl.getArgs().length);
        assertEquals("-", cl.getArgs()[0]);
        assertEquals("extra", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenSingleDashAndStopAtNonOptionTrue_shouldEatTheRest() throws Exception {
        String[] args = new String[] { "-", "extra1", "--", "extra2" };

        CommandLine cl = parser.parse(options, args, true);

        assertNotNull(cl);
        assertEquals(2, cl.getArgs().length);
        assertEquals("extra1", cl.getArgs()[0]);
        assertEquals("extra2", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenUnrecognizedOptionWithStopAtNonOptionTrue_shouldEatTheRestAndAddCurrentAsArg() throws Exception {
        options.addOption("a", false, "alpha option");
        String[] args = new String[] { "-a", "-unknown", "extra1", "--", "extra2" };

        CommandLine cl = parser.parse(options, args, true);

        assertNotNull(cl);
        assertTrue(cl.hasOption("a"));
        assertEquals(3, cl.getArgs().length);
        assertEquals("-unknown", cl.getArgs()[0]);
        assertEquals("extra1", cl.getArgs()[1]);
        assertEquals("extra2", cl.getArgs()[2]);
    }

    @Test
    public void parse_givenUnrecognizedOptionWithStopAtNonOptionFalse_shouldThrowUnrecognizedOptionException() {
        String[] args = new String[] { "-unknown" };

        try {
            parser.parse(options, args, false);
            fail("Expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException e) {
            assertTrue(e.getMessage().indexOf("-unknown") >= 0);
        } catch (ParseException e) {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenNonOptionWithStopAtNonOptionTrue_shouldEatTheRest() throws Exception {
        String[] args = new String[] { "arg1", "arg2", "--", "arg3" };

        CommandLine cl = parser.parse(options, args, true);

        assertNotNull(cl);
        assertEquals(3, cl.getArgs().length);
        assertEquals("arg1", cl.getArgs()[0]);
        assertEquals("arg2", cl.getArgs()[1]);
        assertEquals("arg3", cl.getArgs()[2]);
    }

    @Test
    public void parse_givenNonOptionWithStopAtNonOptionFalse_shouldAccumulateArgs() throws Exception {
        String[] args = new String[] { "arg1", "arg2" };

        CommandLine cl = parser.parse(options, args, false);

        assertNotNull(cl);
        assertEquals(2, cl.getArgs().length);
        assertEquals("arg1", cl.getArgs()[0]);
        assertEquals("arg2", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenRequiredOptionSupplied_shouldSucceed() throws Exception {
        Option req = new Option("r", "req", false, "required option");
        req.setRequired(true);
        options.addOption(req);

        CommandLine cl = parser.parse(options, new String[] { "-r" });

        assertNotNull(cl);
        assertTrue(cl.hasOption("r"));
        assertEquals(0, parser.getRequiredOptions().size());
    }

    @Test
    public void parse_givenSingleRequiredOptionMissing_shouldThrowMissingOptionExceptionWithSingularMessage() {
        Option req = new Option("r", "req", false, "required option");
        req.setRequired(true);
        options.addOption(req);

        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().indexOf("Missing required option: ") >= 0);
        } catch (ParseException e) {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenMultipleRequiredOptionsMissing_shouldThrowMissingOptionExceptionWithPluralMessage() {
        Option req1 = new Option("r", "req1", false, "required option 1");
        req1.setRequired(true);
        Option req2 = new Option("s", "req2", false, "required option 2");
        req2.setRequired(true);
        options.addOption(req1);
        options.addOption(req2);

        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().indexOf("Missing required options: ") >= 0);
        } catch (ParseException e) {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenRequiredOptionGroupSupplied_shouldRemoveGroupFromRequiredAndSetSelected() throws Exception {
        OptionGroup group = new OptionGroup();
        Option g1 = new Option("g1", "group opt 1");
        Option g2 = new Option("g2", "group opt 2");
        group.addOption(g1);
        group.addOption(g2);
        group.setRequired(true);
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[] { "-g1" });

        assertNotNull(cl);
        assertTrue(cl.hasOption("g1"));
        assertEquals("g1", group.getSelected());
        assertEquals(0, parser.getRequiredOptions().size());
    }

    @Test
    public void parse_givenNonRequiredOptionGroupSupplied_shouldSetSelected() throws Exception {
        OptionGroup group = new OptionGroup();
        Option g1 = new Option("g1", "group opt 1");
        group.addOption(g1);
        group.setRequired(false);
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[] { "-g1" });

        assertNotNull(cl);
        assertTrue(cl.hasOption("g1"));
        assertEquals("g1", group.getSelected());
    }

    @Test
    public void processArgs_givenNextTokenIsKnownOptionStartingWithDash_shouldStopAndRewind() throws Exception {
        options.addOption("a", true, "option a");
        options.addOption("b", false, "option b");
        parser.setOptions(options);

        List tokens = new ArrayList();
        tokens.add("-b");
        ListIterator iter = tokens.listIterator();

        Option optA = options.getOption("a");
        optA.setOptionalArg(true);
        parser.processArgs(optA, iter);

        assertTrue(iter.hasNext());
        assertEquals("-b", iter.next());
    }

    @Test
    public void processArgs_givenQuotedValue_shouldStripQuotesAndAddValue() throws Exception {
        options.addOption("a", true, "option a");
        parser.setOptions(options);

        List tokens = new ArrayList();
        tokens.add("\"quotedValue\"");
        ListIterator iter = tokens.listIterator();

        Option optA = options.getOption("a");
        parser.processArgs(optA, iter);

        assertNotNull(optA.getValues());
        assertEquals(1, optA.getValues().length);
        assertEquals("quotedValue", optA.getValues()[0]);
    }

    @Test
    public void processArgs_givenExceptionOnAddValue_shouldCatchAndStop() throws Exception {
        Option faultyOpt = new Option("f", true, "faulty option") {
            public void addValueForProcessing(String val) {
                throw new RuntimeException("Simulated add value error");
            }
        };
        faultyOpt.setOptionalArg(true);
        options.addOption(faultyOpt);
        parser.setOptions(options);

        List tokens = new ArrayList();
        tokens.add("someVal");
        tokens.add("nextVal");
        ListIterator iter = tokens.listIterator();

        parser.processArgs(faultyOpt, iter);

        assertTrue(iter.hasNext());
        assertEquals("someVal", iter.next());
    }

    @Test
    public void processArgs_givenMissingRequiredArg_shouldThrowMissingArgumentException() {
        Option opt = new Option("m", true, "mandatory arg");
        options.addOption(opt);
        parser.setOptions(options);

        List tokens = new ArrayList();
        ListIterator iter = tokens.listIterator();

        try {
            parser.processArgs(opt, iter);
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException e) {
            assertTrue(e.getMessage().indexOf("Missing argument for option:m") >= 0);
        } catch (ParseException e) {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void processArgs_givenMissingOptionalArg_shouldNotThrowException() throws Exception {
        Option opt = new Option("o", true, "optional arg");
        opt.setOptionalArg(true);
        options.addOption(opt);
        parser.setOptions(options);

        List tokens = new ArrayList();
        ListIterator iter = tokens.listIterator();

        parser.processArgs(opt, iter);
        assertNull(opt.getValues());
    }

    @Test
    public void processProperties_givenNullProperties_shouldDoNothing() throws Exception {
        options.addOption("a", false, "alpha");
        CommandLine cl = parser.parse(options, new String[0], null, false);
        assertNotNull(cl);
        assertFalse(cl.hasOption("a"));
    }

    @Test
    public void processProperties_givenOptionAlreadyPresentInCmd_shouldSkipProperty() throws Exception {
        options.addOption("a", true, "alpha");
        Properties props = new Properties();
        props.setProperty("a", "propVal");

        CommandLine cl = parser.parse(options, new String[] { "-a", "cliVal" }, props, false);

        assertNotNull(cl);
        assertEquals("cliVal", cl.getOptionValue("a"));
    }

    @Test
    public void processProperties_givenArgOptionWithNullValues_shouldAddValueFromProperty() throws Exception {
        options.addOption("b", true, "beta");
        Properties props = new Properties();
        props.setProperty("b", "propValue");

        CommandLine cl = parser.parse(options, new String[0], props, false);

        assertNotNull(cl);
        assertTrue(cl.hasOption("b"));
        assertEquals("propValue", cl.getOptionValue("b"));
    }

    @Test
    public void processProperties_givenArgOptionWithExistingValues_shouldNotOverwrite() throws Exception {
        Option opt = new Option("c", true, "gamma");
        opt.addValueForProcessing("existingVal");
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("c", "propValue");

        CommandLine cl = parser.parse(options, new String[0], props, false);

        assertNotNull(cl);
        assertTrue(cl.hasOption("c"));
        assertEquals("existingVal", cl.getOptionValue("c"));
    }

    @Test
    public void processProperties_givenArgOptionWithExceptionOnAddValue_shouldIgnoreException() throws Exception {
        Option faultyOpt = new Option("f", true, "faulty") {
            public void addValueForProcessing(String val) {
                throw new RuntimeException("Simulated exception in property processing");
            }
        };
        options.addOption(faultyOpt);

        Properties props = new Properties();
        props.setProperty("f", "propValue");

        CommandLine cl = parser.parse(options, new String[0], props, false);

        assertNotNull(cl);
        assertTrue(cl.hasOption("f"));
    }

    @Test
    public void processProperties_givenNonArgOptionWithYesOrTrueOr1_shouldAddOption() throws Exception {
        options.addOption("x", false, "option x");
        options.addOption("y", false, "option y");
        options.addOption("z", false, "option z");

        Properties props = new Properties();
        props.setProperty("x", "yes");
        props.setProperty("y", "TRUE");
        props.setProperty("z", "1");

        CommandLine cl = parser.parse(options, new String[0], props, false);

        assertNotNull(cl);
        assertTrue(cl.hasOption("x"));
        assertTrue(cl.hasOption("y"));
        assertTrue(cl.hasOption("z"));
    }

    @Test
    public void processProperties_givenNonArgOptionWithInvalidValue_shouldBreakPropertiesLoop() throws Exception {
        options.addOption("x", false, "option x");
        Properties props = new Properties();
        props.setProperty("x", "invalidValue");

        CommandLine cl = parser.parse(options, new String[0], props, false);

        assertNotNull(cl);
        assertFalse(cl.hasOption("x"));
    }

    @Test
    public void setOptions_and_getOptions_shouldReflectState() {
        assertNull(parser.getOptions());
        assertNull(parser.getRequiredOptions());

        options.addOption("a", false, "option a");
        parser.setOptions(options);

        assertEquals(options, parser.getOptions());
        assertEquals(options.getRequiredOptions(), parser.getRequiredOptions());
    }
}