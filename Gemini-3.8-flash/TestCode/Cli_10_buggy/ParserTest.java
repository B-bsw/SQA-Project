package org.apache.commons.cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParserTest {

    private static class DummyParser extends Parser {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments;
        }
    }

    private Parser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new DummyParser();
        options = new Options();
    }

    @Test
    public void parse_givenTwoArgParse_shouldParseSuccessfully() throws Exception {
        Option optA = new Option("a", "alpha", false, "option a");
        options.addOption(optA);

        CommandLine cl = parser.parse(options, new String[]{"-a"});

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(options, parser.getOptions());
        Assert.assertNotNull(parser.getRequiredOptions());
    }

    @Test
    public void parse_givenThreeArgParseWithOptionsAndProps_shouldParseSuccessfully() throws Exception {
        Option optA = new Option("a", "alpha", true, "option a");
        options.addOption(optA);
        Properties props = new Properties();
        props.setProperty("a", "propValue");

        CommandLine cl = parser.parse(options, new String[0], props);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals("propValue", cl.getOptionValue("a"));
    }

    @Test
    public void parse_givenThreeArgParseWithStopAtNonOption_shouldStopParsing() throws Exception {
        Option optA = new Option("a", "alpha", false, "option a");
        options.addOption(optA);

        CommandLine cl = parser.parse(options, new String[]{"-a", "nonOption", "-b"}, true);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("nonOption", cl.getArgs()[0]);
        Assert.assertEquals("-b", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenNullArguments_shouldTreatAsEmptyArray() throws Exception {
        CommandLine cl = parser.parse(options, null);

        Assert.assertNotNull(cl);
        Assert.assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void parse_givenDoubleDash_shouldEatTheRest() throws Exception {
        Option optA = new Option("a", "alpha", false, "option a");
        options.addOption(optA);

        String[] args = new String[]{"-a", "--", "-b", "--", "foo"};
        CommandLine cl = parser.parse(options, args, false);

        Assert.assertTrue(cl.hasOption("a"));
        String[] remaining = cl.getArgs();
        Assert.assertEquals(2, remaining.length);
        Assert.assertEquals("-b", remaining[0]);
        Assert.assertEquals("foo", remaining[1]);
    }

    @Test
    public void parse_givenSingleDashWithStopAtNonOptionFalse_shouldAddDashAsArg() throws Exception {
        String[] args = new String[]{"-"};
        CommandLine cl = parser.parse(options, args, false);

        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("-", cl.getArgs()[0]);
    }

    @Test
    public void parse_givenSingleDashWithStopAtNonOptionTrue_shouldEatTheRest() throws Exception {
        String[] args = new String[]{"-", "extra1", "extra2"};
        CommandLine cl = parser.parse(options, args, true);

        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("extra1", cl.getArgs()[0]);
        Assert.assertEquals("extra2", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenUnknownOptionWithStopAtNonOptionTrue_shouldEatTheRest() throws Exception {
        Option optA = new Option("a", "alpha", false, "option a");
        options.addOption(optA);

        String[] args = new String[]{"-a", "-unknown", "extra"};
        CommandLine cl = parser.parse(options, args, true);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("-unknown", cl.getArgs()[0]);
        Assert.assertEquals("extra", cl.getArgs()[1]);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void parse_givenUnknownOptionWithStopAtNonOptionFalse_shouldThrowException() throws Exception {
        String[] args = new String[]{"-unknown"};
        parser.parse(options, args, false);
    }

    @Test
    public void parse_givenNonOptionArgWithStopAtNonOptionTrue_shouldEatTheRest() throws Exception {
        Option optA = new Option("a", "alpha", false, "option a");
        options.addOption(optA);

        String[] args = new String[]{"arg1", "-a", "arg2"};
        CommandLine cl = parser.parse(options, args, true);

        Assert.assertFalse(cl.hasOption("a"));
        Assert.assertEquals(3, cl.getArgs().length);
        Assert.assertEquals("arg1", cl.getArgs()[0]);
        Assert.assertEquals("-a", cl.getArgs()[1]);
        Assert.assertEquals("arg2", cl.getArgs()[2]);
    }

    @Test
    public void parse_givenNonOptionArgWithStopAtNonOptionFalse_shouldAddArgAndContinueParsing() throws Exception {
        Option optA = new Option("a", "alpha", false, "option a");
        options.addOption(optA);

        String[] args = new String[]{"arg1", "-a", "arg2"};
        CommandLine cl = parser.parse(options, args, false);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("arg1", cl.getArgs()[0]);
        Assert.assertEquals("arg2", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenReuseOptionsWithValues_shouldClearValuesCLI71() throws Exception {
        Option optA = new Option("a", true, "option a");
        options.addOption(optA);

        CommandLine cl1 = parser.parse(options, new String[]{"-a", "val1"});
        Assert.assertEquals("val1", cl1.getOptionValue("a"));

        CommandLine cl2 = parser.parse(options, new String[]{"-a", "val2"});
        Assert.assertEquals("val2", cl2.getOptionValue("a"));
        Assert.assertEquals(1, cl2.getOptionValues("a").length);
    }

    @Test
    public void parse_givenRequiredOptionSatisfied_shouldParseSuccessfully() throws Exception {
        Option optA = new Option("a", false, "option a");
        optA.setRequired(true);
        options.addOption(optA);

        CommandLine cl = parser.parse(options, new String[]{"-a"});
        Assert.assertTrue(cl.hasOption("a"));
    }

    @Test(expected = MissingOptionException.class)
    public void parse_givenSingleMissingRequiredOption_shouldThrowMissingOptionException() throws Exception {
        Option optA = new Option("a", false, "option a");
        optA.setRequired(true);
        options.addOption(optA);

        try {
            parser.parse(options, new String[0]);
        } catch (MissingOptionException e) {
            Assert.assertTrue(e.getMessage().startsWith("Missing required option: "));
            Assert.assertTrue(e.getMessage().indexOf("a") != -1);
            throw e;
        }
    }

    @Test(expected = MissingOptionException.class)
    public void parse_givenMultipleMissingRequiredOptions_shouldThrowMissingOptionExceptionWithPlural() throws Exception {
        Option optA = new Option("a", false, "option a");
        optA.setRequired(true);
        Option optB = new Option("b", false, "option b");
        optB.setRequired(true);
        options.addOption(optA);
        options.addOption(optB);

        try {
            parser.parse(options, new String[0]);
        } catch (MissingOptionException e) {
            Assert.assertTrue(e.getMessage().startsWith("Missing required options: "));
            throw e;
        }
    }

    @Test
    public void parse_givenOptionInRequiredOptionGroupSatisfied_shouldPass() throws Exception {
        Option optA = new Option("a", false, "option a");
        Option optB = new Option("b", false, "option b");
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[]{"-a"});
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertFalse(cl.hasOption("b"));
    }

    @Test(expected = MissingOptionException.class)
    public void parse_givenOptionInRequiredOptionGroupNotSatisfied_shouldThrowMissingOptionException() throws Exception {
        Option optA = new Option("a", false, "option a");
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(optA);
        options.addOptionGroup(group);

        parser.parse(options, new String[0]);
    }

    @Test
    public void parse_givenOptionInOptionalOptionGroup_shouldPass() throws Exception {
        Option optA = new Option("a", false, "option a");
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        group.addOption(optA);
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[]{"-a"});
        Assert.assertTrue(cl.hasOption("a"));
    }

    @Test
    public void processProperties_givenNullProperties_shouldDoNothing() throws Exception {
        Option optA = new Option("a", false, "option a");
        options.addOption(optA);

        CommandLine cl = parser.parse(options, new String[]{"-a"}, null, false);
        Assert.assertTrue(cl.hasOption("a"));
    }

    @Test
    public void processProperties_givenOptionAlreadyOnCommandLine_shouldNotOverwrite() throws Exception {
        Option optA = new Option("a", true, "option a");
        options.addOption(optA);

        Properties props = new Properties();
        props.setProperty("a", "propValue");

        CommandLine cl = parser.parse(options, new String[]{"-a", "cliValue"}, props);
        Assert.assertEquals("cliValue", cl.getOptionValue("a"));
    }

    @Test
    public void processProperties_givenOptionWithArgAndValidProperty_shouldAddOptionValue() throws Exception {
        Option optA = new Option("a", true, "option a");
        options.addOption(optA);

        Properties props = new Properties();
        props.setProperty("a", "propValue");

        CommandLine cl = parser.parse(options, new String[0], props);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals("propValue", cl.getOptionValue("a"));
    }

    @Test
    public void processProperties_givenOptionWithoutArgAndValueYes_shouldAddOption() throws Exception {
        Option optA = new Option("a", false, "option a");
        options.addOption(optA);

        Properties props = new Properties();
        props.setProperty("a", "yes");

        CommandLine cl = parser.parse(options, new String[0], props);
        Assert.assertTrue(cl.hasOption("a"));
    }

    @Test
    public void processProperties_givenOptionWithoutArgAndValueTrue_shouldAddOption() throws Exception {
        Option optA = new Option("a", false, "option a");
        options.addOption(optA);

        Properties props = new Properties();
        props.setProperty("a", "true");

        CommandLine cl = parser.parse(options, new String[0], props);
        Assert.assertTrue(cl.hasOption("a"));
    }

    @Test
    public void processProperties_givenOptionWithoutArgAndValueOne_shouldAddOption() throws Exception {
        Option optA = new Option("a", false, "option a");
        options.addOption(optA);

        Properties props = new Properties();
        props.setProperty("a", "1");

        CommandLine cl = parser.parse(options, new String[0], props);
        Assert.assertTrue(cl.hasOption("a"));
    }

    @Test
    public void processProperties_givenOptionWithoutArgAndValueNotTrue_shouldBreakLoop() throws Exception {
        Option optA = new Option("a", false, "option a");
        options.addOption(optA);

        Properties props = new Properties();
        props.setProperty("a", "false");

        CommandLine cl = parser.parse(options, new String[0], props);
        Assert.assertFalse(cl.hasOption("a"));
    }

    @Test
    public void processProperties_givenOptionWithArgWhenCannotAddValue_shouldCatchExceptionAndAddOption() throws Exception {
        Option optA = new Option("a", true, "option a") {
            public boolean addValueForProcessing(String value) {
                throw new RuntimeException("Cannot add value");
            }
        };
        options.addOption(optA);

        Properties props = new Properties();
        props.setProperty("a", "val");

        CommandLine cl = parser.parse(options, new String[0], props);
        Assert.assertTrue(cl.hasOption("a"));
    }

    @Test
    public void processProperties_givenOptionWithArgAndExistingValues_shouldNotAddAgain() throws Exception {
        Option optA = new Option("a", true, "option a");
        optA.addValueForProcessing("existing");
        options.addOption(optA);

        Properties props = new Properties();
        props.setProperty("a", "newVal");

        CommandLine cl = parser.parse(options, new String[0], props);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals("existing", cl.getOptionValue("a"));
    }

    @Test(expected = MissingArgumentException.class)
    public void processArgs_givenMissingArgumentWithoutOptionalArg_shouldThrowException() throws Exception {
        Option optA = new Option("a", true, "option a");
        options.addOption(optA);

        List tokens = new ArrayList();
        tokens.add("-a");
        ListIterator iter = tokens.listIterator();
        iter.next();

        parser.setOptions(options);
        parser.processArgs(optA, iter);
    }

    @Test
    public void processArgs_givenMissingArgumentWithOptionalArg_shouldNotThrowException() throws Exception {
        Option optA = new Option("a", true, "option a");
        optA.setOptionalArg(true);
        options.addOption(optA);

        List tokens = new ArrayList();
        ListIterator iter = tokens.listIterator();

        parser.setOptions(options);
        parser.processArgs(optA, iter);

        Assert.assertNull(optA.getValues());
    }

    @Test
    public void processArgs_givenOptionFollowedByAnotherOption_shouldStopProcessingArgs() throws Exception {
        Option optA = new Option("a", true, "option a");
        optA.setOptionalArg(true);
        Option optB = new Option("b", false, "option b");
        options.addOption(optA);
        options.addOption(optB);

        List tokens = new ArrayList();
        tokens.add("-b");
        ListIterator iter = tokens.listIterator();

        parser.setOptions(options);
        parser.processArgs(optA, iter);

        Assert.assertEquals("-b", iter.next());
    }

    @Test
    public void processArgs_givenQuotedArgument_shouldStripQuotes() throws Exception {
        Option optA = new Option("a", true, "option a");
        options.addOption(optA);

        List tokens = new ArrayList();
        tokens.add("\"quotedValue\"");
        ListIterator iter = tokens.listIterator();

        parser.setOptions(options);
        parser.processArgs(optA, iter);

        Assert.assertEquals("quotedValue", optA.getValue());
    }

    @Test
    public void processArgs_givenExceptionDuringValueProcessing_shouldStopAndRewind() throws Exception {
        Option optA = new Option("a", false, "option a") {
            public int getArgs() {
                return 1;
            }
            public boolean hasArg() {
                return true;
            }
            public String[] getValues() {
                return new String[]{"first"};
            }
            public boolean addValueForProcessing(String value) {
                throw new RuntimeException("Limit reached");
            }
        };
        options.addOption(optA);

        List tokens = new ArrayList();
        tokens.add("secondVal");
        ListIterator iter = tokens.listIterator();

        parser.setOptions(options);
        parser.processArgs(optA, iter);

        Assert.assertTrue(iter.hasNext());
        Assert.assertEquals("secondVal", iter.next());
    }

    @Test
    public void processArgs_givenMultipleArgumentsForOption_shouldConsumeAllArguments() throws Exception {
        Option optM = new Option("m", "multiple", true, "multiple values");
        optM.setArgs(2);
        options.addOption(optM);

        CommandLine cl = parser.parse(options, new String[]{"-m", "val1", "val2", "remainingArg"});

        Assert.assertTrue(cl.hasOption("m"));
        String[] values = cl.getOptionValues("m");
        Assert.assertEquals(2, values.length);
        Assert.assertEquals("val1", values[0]);
        Assert.assertEquals("val2", values[1]);
        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("remainingArg", cl.getArgs()[0]);
    }
}