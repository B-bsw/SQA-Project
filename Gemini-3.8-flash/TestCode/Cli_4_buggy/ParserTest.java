package org.apache.commons.cli;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParserTest {

    private static class TestParser extends Parser {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            if (arguments == null) {
                return new String[0];
            }
            return arguments;
        }
    }

    private TestParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new TestParser();
        options = new Options();
    }

    @Test
    public void parse_givenTwoArgSignature_shouldParseSuccessfully() throws Exception {
        options.addOption("a", false, "option a");
        String[] args = new String[] { "-a" };

        CommandLine cl = parser.parse(options, args);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
    }

    @Test
    public void parse_givenThreeArgWithProperties_shouldParseOptionAndProperties() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption("b", "opt-b", true, "option b with arg");

        String[] args = new String[] { "-a" };
        Properties props = new Properties();
        props.setProperty("b", "propValue");

        CommandLine cl = parser.parse(options, args, props);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertEquals("propValue", cl.getOptionValue("b"));
    }

    @Test
    public void parse_givenThreeArgWithStopAtNonOption_shouldStopAtNonOption() throws Exception {
        options.addOption("a", false, "option a");
        String[] args = new String[] { "-a", "nonOption1", "nonOption2" };

        CommandLine cl = parser.parse(options, args, true);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
        String[] extraArgs = cl.getArgs();
        Assert.assertEquals(2, extraArgs.length);
        Assert.assertEquals("nonOption1", extraArgs[0]);
        Assert.assertEquals("nonOption2", extraArgs[1]);
    }

    @Test
    public void parse_givenNullArguments_shouldTreatAsEmptyArray() throws Exception {
        CommandLine cl = parser.parse(options, null);

        Assert.assertNotNull(cl);
        Assert.assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void parse_givenDoubleDashToken_shouldEatRemainingTokens() throws Exception {
        options.addOption("a", false, "option a");
        String[] args = new String[] { "--", "-a", "--", "arg1" };

        CommandLine cl = parser.parse(options, args);

        Assert.assertNotNull(cl);
        Assert.assertFalse(cl.hasOption("a"));
        String[] leftover = cl.getArgs();
        Assert.assertEquals(2, leftover.length);
        Assert.assertEquals("-a", leftover[0]);
        Assert.assertEquals("arg1", leftover[1]);
    }

    @Test
    public void parse_givenSingleDashWithoutStopAtNonOption_shouldAddAsArgument() throws Exception {
        String[] args = new String[] { "-" };

        CommandLine cl = parser.parse(options, args, false);

        Assert.assertNotNull(cl);
        String[] leftover = cl.getArgs();
        Assert.assertEquals(1, leftover.length);
        Assert.assertEquals("-", leftover[0]);
    }

    @Test
    public void parse_givenSingleDashWithStopAtNonOption_shouldEatRemainingTokens() throws Exception {
        String[] args = new String[] { "-", "extra1", "extra2" };

        CommandLine cl = parser.parse(options, args, true);

        Assert.assertNotNull(cl);
        String[] leftover = cl.getArgs();
        Assert.assertEquals(2, leftover.length);
        Assert.assertEquals("extra1", leftover[0]);
        Assert.assertEquals("extra2", leftover[1]);
    }

    @Test
    public void parse_givenUnrecognizedOptionWithStopAtNonOption_shouldEatRemainingTokens() throws Exception {
        options.addOption("a", false, "option a");
        String[] args = new String[] { "-unknown", "-a", "extra" };

        CommandLine cl = parser.parse(options, args, true);

        Assert.assertNotNull(cl);
        Assert.assertFalse(cl.hasOption("a"));
        String[] leftover = cl.getArgs();
        Assert.assertEquals(3, leftover.length);
        Assert.assertEquals("-unknown", leftover[0]);
        Assert.assertEquals("-a", leftover[1]);
        Assert.assertEquals("extra", leftover[2]);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void parse_givenUnrecognizedOptionWithoutStopAtNonOption_shouldThrowException() throws Exception {
        String[] args = new String[] { "-unknown" };

        parser.parse(options, args, false);
    }

    @Test
    public void parse_givenNormalArgumentWithoutStopAtNonOption_shouldAddArgAndContinueParsing() throws Exception {
        options.addOption("a", false, "option a");
        String[] args = new String[] { "arg1", "-a", "arg2" };

        CommandLine cl = parser.parse(options, args, false);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
        String[] leftover = cl.getArgs();
        Assert.assertEquals(2, leftover.length);
        Assert.assertEquals("arg1", leftover[0]);
        Assert.assertEquals("arg2", leftover[1]);
    }

    @Test
    public void parse_givenNormalArgumentWithStopAtNonOption_shouldStopAndEatRest() throws Exception {
        options.addOption("a", false, "option a");
        String[] args = new String[] { "arg1", "-a", "arg2" };

        CommandLine cl = parser.parse(options, args, true);

        Assert.assertNotNull(cl);
        Assert.assertFalse(cl.hasOption("a"));
        String[] leftover = cl.getArgs();
        Assert.assertEquals(3, leftover.length);
        Assert.assertEquals("arg1", leftover[0]);
        Assert.assertEquals("-a", leftover[1]);
        Assert.assertEquals("arg2", leftover[2]);
    }

    @Test
    public void parse_givenRequiredOptionPresent_shouldSucceed() throws Exception {
        Option opt = new Option("r", "required", false, "required option");
        opt.setRequired(true);
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[] { "-r" });

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("r"));
    }

    @Test(expected = MissingOptionException.class)
    public void parse_givenRequiredOptionMissing_shouldThrowMissingOptionException() throws Exception {
        Option opt = new Option("r", "required", false, "required option");
        opt.setRequired(true);
        options.addOption(opt);

        parser.parse(options, new String[0]);
    }

    @Test
    public void parse_givenRequiredOptionGroupPresent_shouldSucceed() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option optA = new Option("a", "alpha", false, "alpha");
        Option optB = new Option("b", "beta", false, "beta");
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[] { "-b" });

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertEquals("b", group.getSelected());
    }

    @Test(expected = MissingOptionException.class)
    public void parse_givenRequiredOptionGroupMissing_shouldThrowMissingOptionException() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("a", "alpha", false, "alpha"));
        options.addOptionGroup(group);

        parser.parse(options, new String[0]);
    }

    @Test
    public void parse_givenOptionalArgOptionWithoutValue_shouldNotThrowMissingArgumentException() throws Exception {
        Option opt = new Option("o", true, "optional arg");
        opt.setOptionalArg(true);
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[] { "-o" });

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("o"));
        Assert.assertNull(cl.getOptionValue("o"));
    }

    @Test(expected = MissingArgumentException.class)
    public void parse_givenMandatoryArgOptionWithoutValue_shouldThrowMissingArgumentException() throws Exception {
        options.addOption("m", true, "mandatory arg");

        parser.parse(options, new String[] { "-m" });
    }

    @Test(expected = MissingArgumentException.class)
    public void parse_givenMandatoryArgOptionFollowedByAnotherOption_shouldThrowMissingArgumentException() throws Exception {
        options.addOption("m", true, "mandatory arg");
        options.addOption("b", false, "other option");

        parser.parse(options, new String[] { "-m", "-b" });
    }

    @Test
    public void parse_givenOptionValueWithQuotes_shouldStripQuotes() throws Exception {
        options.addOption("v", true, "value option");

        CommandLine cl = parser.parse(options, new String[] { "-v", "\"quotedValue\"" });

        Assert.assertNotNull(cl);
        Assert.assertEquals("quotedValue", cl.getOptionValue("v"));
    }

    @Test
    public void parse_givenOptionValuesExceedingCount_shouldStopAddingValuesAndLeaveNextArg() throws Exception {
        Option opt = new Option("v", true, "single value option");
        opt.setArgs(1);
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[] { "-v", "val1", "val2" });

        Assert.assertNotNull(cl);
        Assert.assertEquals("val1", cl.getOptionValue("v"));
        String[] leftover = cl.getArgs();
        Assert.assertEquals(1, leftover.length);
        Assert.assertEquals("val2", leftover[0]);
    }

    @Test
    public void parse_givenNullProperties_shouldNotFail() throws Exception {
        options.addOption("a", false, "option a");

        CommandLine cl = parser.parse(options, new String[] { "-a" }, null, false);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
    }

    @Test
    public void parse_givenPropertiesWhenOptionAlreadyProvidedInArgs_shouldNotOverride() throws Exception {
        options.addOption("a", true, "option a");
        Properties props = new Properties();
        props.setProperty("a", "fromProps");

        CommandLine cl = parser.parse(options, new String[] { "-a", "fromArgs" }, props);

        Assert.assertNotNull(cl);
        Assert.assertEquals("fromArgs", cl.getOptionValue("a"));
    }

    @Test
    public void parse_givenPropertiesWithBooleanValues_shouldAddOptionForTrueYes1() throws Exception {
        options.addOption("t", false, "true opt");
        options.addOption("y", false, "yes opt");
        options.addOption("one", false, "1 opt");

        Properties props = new Properties();
        props.setProperty("t", "true");
        props.setProperty("y", "yes");
        props.setProperty("one", "1");

        CommandLine cl = parser.parse(options, new String[0], props);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("t"));
        Assert.assertTrue(cl.hasOption("y"));
        Assert.assertTrue(cl.hasOption("one"));
    }

    @Test
    public void parse_givenPropertiesWithFalseValue_shouldBreakAndNotAddOption() throws Exception {
        options.addOption("f", false, "flag option");
        Properties props = new Properties();
        props.setProperty("f", "false");

        CommandLine cl = parser.parse(options, new String[0], props);

        Assert.assertNotNull(cl);
        Assert.assertFalse(cl.hasOption("f"));
    }

    @Test
    public void parse_givenMultipleInvocationsOnSameOptions_shouldClearPreviousValues() throws Exception {
        options.addOption("v", true, "value option");

        CommandLine cl1 = parser.parse(options, new String[] { "-v", "first" });
        Assert.assertEquals("first", cl1.getOptionValue("v"));

        CommandLine cl2 = parser.parse(options, new String[0]);
        Assert.assertNull(cl2.getOptionValue("v"));
    }

    @Test
    public void processArgs_givenListIteratorAndOptionWithMultipleArgs_shouldConsumeAll() throws Exception {
        Option opt = new Option("m", true, "multi arg option");
        opt.setArgs(2);
        options.addOption(opt);

        List tokens = Arrays.asList(new String[] { "val1", "val2" });
        ListIterator iter = tokens.listIterator();

        parser.parse(options, new String[0]); // initialize parser.options
        parser.processArgs(opt, iter);

        Assert.assertNotNull(opt.getValues());
        Assert.assertEquals(2, opt.getValues().length);
        Assert.assertEquals("val1", opt.getValues()[0]);
        Assert.assertEquals("val2", opt.getValues()[1]);
        Assert.assertFalse(iter.hasNext());
    }
}