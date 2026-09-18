package org.apache.commons.cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParserTest
{
    private TestParser parser;
    private Options options;

    private static class TestParser extends Parser
    {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) throws ParseException
        {
            if (arguments == null)
            {
                return new String[0];
            }
            return arguments;
        }
    }

    @Before
    public void setUp()
    {
        parser = new TestParser();
        options = new Options();
    }

    @Test
    public void parse_givenNullArguments_shouldReturnEmptyCommandLine() throws ParseException
    {
        CommandLine cmd = parser.parse(options, null);

        Assert.assertNotNull(cmd);
        Assert.assertEquals(0, cmd.getArgs().length);
        Assert.assertEquals(0, cmd.getOptions().length);
    }

    @Test
    public void parse_givenEmptyArguments_shouldReturnEmptyCommandLine() throws ParseException
    {
        CommandLine cmd = parser.parse(options, new String[0]);

        Assert.assertNotNull(cmd);
        Assert.assertEquals(0, cmd.getArgs().length);
        Assert.assertEquals(0, cmd.getOptions().length);
    }

    @Test
    public void parse_givenValidOptionsAndArguments_shouldPopulateCommandLine() throws ParseException
    {
        Option optA = new Option("a", false, "option a");
        Option optB = new Option("b", true, "option b");
        options.addOption(optA);
        options.addOption(optB);

        String[] args = new String[] { "-a", "-b", "foo", "extra1", "extra2" };
        CommandLine cmd = parser.parse(options, args);

        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertTrue(cmd.hasOption("b"));
        Assert.assertEquals("foo", cmd.getOptionValue("b"));
        List argList = Arrays.asList(cmd.getArgs());
        Assert.assertEquals(2, argList.size());
        Assert.assertEquals("extra1", argList.get(0));
        Assert.assertEquals("extra2", argList.get(1));
    }

    @Test
    public void parse_givenDoubleDashToken_shouldEatRemainingTokensAsArgs() throws ParseException
    {
        Option optA = new Option("a", false, "option a");
        options.addOption(optA);

        String[] args = new String[] { "-a", "--", "-notAnOption", "param" };
        CommandLine cmd = parser.parse(options, args);

        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertEquals(2, cmd.getArgs().length);
        Assert.assertEquals("-notAnOption", cmd.getArgs()[0]);
        Assert.assertEquals("param", cmd.getArgs()[1]);
    }

    @Test
    public void parse_givenMultipleDoubleDashTokens_shouldIgnoreSubsequentDoubleDashes() throws ParseException
    {
        String[] args = new String[] { "--", "val1", "--", "val2" };
        CommandLine cmd = parser.parse(options, args);

        Assert.assertEquals(2, cmd.getArgs().length);
        Assert.assertEquals("val1", cmd.getArgs()[0]);
        Assert.assertEquals("val2", cmd.getArgs()[1]);
    }

    @Test
    public void parse_givenSingleDashWithoutStopAtNonOption_shouldAddDashAsArg() throws ParseException
    {
        String[] args = new String[] { "-", "value" };
        CommandLine cmd = parser.parse(options, args, false);

        Assert.assertEquals(2, cmd.getArgs().length);
        Assert.assertEquals("-", cmd.getArgs()[0]);
        Assert.assertEquals("value", cmd.getArgs()[1]);
    }

    @Test
    public void parse_givenSingleDashWithStopAtNonOption_shouldStopAndEatRemainingTokens() throws ParseException
    {
        String[] args = new String[] { "-", "extra1", "extra2" };
        CommandLine cmd = parser.parse(options, args, true);

        Assert.assertEquals(2, cmd.getArgs().length);
        Assert.assertEquals("extra1", cmd.getArgs()[0]);
        Assert.assertEquals("extra2", cmd.getArgs()[1]);
    }

    @Test
    public void parse_givenUnrecognizedOptionWithStopAtNonOption_shouldStopAndAddRemainingTokens() throws ParseException
    {
        Option optA = new Option("a", false, "option a");
        options.addOption(optA);

        String[] args = new String[] { "-a", "-unknown", "rest1", "rest2" };
        CommandLine cmd = parser.parse(options, args, true);

        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertEquals(3, cmd.getArgs().length);
        Assert.assertEquals("-unknown", cmd.getArgs()[0]);
        Assert.assertEquals("rest1", cmd.getArgs()[1]);
        Assert.assertEquals("rest2", cmd.getArgs()[2]);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void parse_givenUnrecognizedOptionWithoutStopAtNonOption_shouldThrowUnrecognizedOptionException() throws ParseException
    {
        String[] args = new String[] { "-z" };
        parser.parse(options, args, false);
    }

    @Test
    public void parse_givenNonOptionArgumentWithStopAtNonOption_shouldStopAndEatRest() throws ParseException
    {
        Option optA = new Option("a", false, "option a");
        options.addOption(optA);

        String[] args = new String[] { "-a", "nonOption", "-a", "anotherNonOption" };
        CommandLine cmd = parser.parse(options, args, true);

        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertEquals(3, cmd.getArgs().length);
        Assert.assertEquals("nonOption", cmd.getArgs()[0]);
        Assert.assertEquals("-a", cmd.getArgs()[1]);
        Assert.assertEquals("anotherNonOption", cmd.getArgs()[2]);
    }

    @Test
    public void parse_givenNonOptionArgumentWithoutStopAtNonOption_shouldAddArgAndContinueParsing() throws ParseException
    {
        Option optA = new Option("a", false, "option a");
        Option optB = new Option("b", false, "option b");
        options.addOption(optA);
        options.addOption(optB);

        String[] args = new String[] { "-a", "plainArg", "-b" };
        CommandLine cmd = parser.parse(options, args, false);

        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertTrue(cmd.hasOption("b"));
        Assert.assertEquals(1, cmd.getArgs().length);
        Assert.assertEquals("plainArg", cmd.getArgs()[0]);
    }

    @Test
    public void parse_givenReusedOptionsInstance_shouldClearPreviousOptionValues() throws ParseException
    {
        Option optA = new Option("a", true, "option a");
        options.addOption(optA);

        CommandLine cmd1 = parser.parse(options, new String[] { "-a", "firstVal" });
        Assert.assertEquals("firstVal", cmd1.getOptionValue("a"));

        CommandLine cmd2 = parser.parse(options, new String[] { "-a", "secondVal" });
        Assert.assertEquals("secondVal", cmd2.getOptionValue("a"));
    }

    @Test(expected = MissingOptionException.class)
    public void checkRequiredOptions_givenMissingRequiredOption_shouldThrowMissingOptionException() throws ParseException
    {
        Option requiredOpt = new Option("r", false, "required option");
        requiredOpt.setRequired(true);
        options.addOption(requiredOpt);

        parser.parse(options, new String[0]);
    }

    @Test
    public void checkRequiredOptions_givenPresentRequiredOption_shouldSucceed() throws ParseException
    {
        Option requiredOpt = new Option("r", false, "required option");
        requiredOpt.setRequired(true);
        options.addOption(requiredOpt);

        CommandLine cmd = parser.parse(options, new String[] { "-r" });
        Assert.assertTrue(cmd.hasOption("r"));
    }

    @Test(expected = MissingOptionException.class)
    public void checkRequiredOptions_givenMissingRequiredOptionGroup_shouldThrowMissingOptionException() throws ParseException
    {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("g1", false, "group option 1"));
        group.addOption(new Option("g2", false, "group option 2"));
        options.addOptionGroup(group);

        parser.parse(options, new String[0]);
    }

    @Test
    public void checkRequiredOptions_givenPresentRequiredOptionGroup_shouldSucceed() throws ParseException
    {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option g1 = new Option("g1", false, "group option 1");
        Option g2 = new Option("g2", false, "group option 2");
        group.addOption(g1);
        group.addOption(g2);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[] { "-g1" });
        Assert.assertTrue(cmd.hasOption("g1"));
        Assert.assertEquals("g1", group.getSelected());
    }

    @Test(expected = AlreadySelectedException.class)
    public void parse_givenMultipleOptionsFromSameGroup_shouldThrowAlreadySelectedException() throws ParseException
    {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("x", false, "option x"));
        group.addOption(new Option("y", false, "option y"));
        options.addOptionGroup(group);

        parser.parse(options, new String[] { "-x", "-y" });
    }

    @Test(expected = MissingArgumentException.class)
    public void processArgs_givenOptionRequiresArgButNoneProvided_shouldThrowMissingArgumentException() throws ParseException
    {
        Option opt = new Option("f", true, "file option");
        options.addOption(opt);

        parser.parse(options, new String[] { "-f" });
    }

    @Test(expected = MissingArgumentException.class)
    public void processArgs_givenNextTokenIsAnotherOption_shouldThrowMissingArgumentException() throws ParseException
    {
        Option optF = new Option("f", true, "file option");
        Option optA = new Option("a", false, "option a");
        options.addOption(optF);
        options.addOption(optA);

        parser.parse(options, new String[] { "-f", "-a" });
    }

    @Test
    public void processArgs_givenOptionalArgAndNoArgProvided_shouldSucceed() throws ParseException
    {
        Option opt = new Option("o", true, "optional arg option");
        opt.setOptionalArg(true);
        options.addOption(opt);

        CommandLine cmd = parser.parse(options, new String[] { "-o" });
        Assert.assertTrue(cmd.hasOption("o"));
        Assert.assertNull(cmd.getOptionValue("o"));
    }

    @Test
    public void processArgs_givenQuotedArgument_shouldStripQuotes() throws ParseException
    {
        Option opt = new Option("q", true, "quoted option");
        options.addOption(opt);

        CommandLine cmd = parser.parse(options, new String[] { "-q", "\"quotedValue\"" });
        Assert.assertEquals("quotedValue", cmd.getOptionValue("q"));
    }

    @Test
    public void processArgs_givenMultipleArgumentsUpToOptionMaxArgs_shouldConsumeValuesAndBreakOnLimit() throws ParseException
    {
        Option opt = new Option("m", true, "multiple values");
        opt.setArgs(2);
        options.addOption(opt);

        CommandLine cmd = parser.parse(options, new String[] { "-m", "v1", "v2", "trailingArg" });
        String[] values = cmd.getOptionValues("m");
        Assert.assertNotNull(values);
        Assert.assertEquals(2, values.length);
        Assert.assertEquals("v1", values[0]);
        Assert.assertEquals("v2", values[1]);
        Assert.assertEquals(1, cmd.getArgs().length);
        Assert.assertEquals("trailingArg", cmd.getArgs()[0]);
    }

    @Test
    public void processProperties_givenNullProperties_shouldDoNothing() throws ParseException
    {
        Option opt = new Option("p", false, "property option");
        options.addOption(opt);

        CommandLine cmd = parser.parse(options, new String[0], null);
        Assert.assertFalse(cmd.hasOption("p"));
    }

    @Test
    public void processProperties_givenEmptyProperties_shouldDoNothing() throws ParseException
    {
        Properties props = new Properties();
        CommandLine cmd = parser.parse(options, new String[0], props);
        Assert.assertEquals(0, cmd.getOptions().length);
    }

    @Test
    public void processProperties_givenOptionWithArg_shouldAddValueFromProperties() throws ParseException
    {
        Option opt = new Option("server", true, "server name");
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("server", "localhost");

        CommandLine cmd = parser.parse(options, new String[0], props);
        Assert.assertTrue(cmd.hasOption("server"));
        Assert.assertEquals("localhost", cmd.getOptionValue("server"));
    }

    @Test
    public void processProperties_givenOptionAlreadyProvidedInArgs_shouldNotBeOverwrittenByProperties() throws ParseException
    {
        Option opt = new Option("port", true, "port number");
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("port", "8080");

        CommandLine cmd = parser.parse(options, new String[] { "-port", "9090" }, props);
        Assert.assertTrue(cmd.hasOption("port"));
        Assert.assertEquals("9090", cmd.getOptionValue("port"));
    }

    @Test
    public void processProperties_givenFlagOptionWithTrueYesOrOne_shouldAddOption() throws ParseException
    {
        Option optTrue = new Option("v1", false, "flag 1");
        Option optYes = new Option("v2", false, "flag 2");
        Option optOne = new Option("v3", false, "flag 3");
        options.addOption(optTrue);
        options.addOption(optYes);
        options.addOption(optOne);

        Properties props = new Properties();
        props.setProperty("v1", "tRuE");
        props.setProperty("v2", "YES");
        props.setProperty("v3", "1");

        CommandLine cmd = parser.parse(options, new String[0], props);
        Assert.assertTrue(cmd.hasOption("v1"));
        Assert.assertTrue(cmd.hasOption("v2"));
        Assert.assertTrue(cmd.hasOption("v3"));
    }

    @Test
    public void processProperties_givenFlagOptionWithOtherValues_shouldNotAddOption() throws ParseException
    {
        Option optNo = new Option("f1", false, "flag 1");
        Option optFalse = new Option("f2", false, "flag 2");
        Option optZero = new Option("f3", false, "flag 3");
        options.addOption(optNo);
        options.addOption(optFalse);
        options.addOption(optZero);

        Properties props = new Properties();
        props.setProperty("f1", "no");
        props.setProperty("f2", "false");
        props.setProperty("f3", "0");

        CommandLine cmd = parser.parse(options, new String[0], props);
        Assert.assertFalse(cmd.hasOption("f1"));
        Assert.assertFalse(cmd.hasOption("f2"));
        Assert.assertFalse(cmd.hasOption("f3"));
    }

    @Test
    public void processProperties_givenRequiredOptionSatisfiedByProperty_shouldSatisfyRequiredCheck() throws ParseException
    {
        Option reqOpt = new Option("req", true, "required option");
        reqOpt.setRequired(true);
        options.addOption(reqOpt);

        Properties props = new Properties();
        props.setProperty("req", "suppliedValue");

        CommandLine cmd = parser.parse(options, new String[0], props);
        Assert.assertTrue(cmd.hasOption("req"));
        Assert.assertEquals("suppliedValue", cmd.getOptionValue("req"));
    }

    @Test
    public void processProperties_givenRequiredGroupSatisfiedByProperty_shouldSatisfyRequiredGroupCheck() throws ParseException
    {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option gOpt1 = new Option("gOpt1", false, "group option 1");
        group.addOption(gOpt1);
        options.addOptionGroup(group);

        Properties props = new Properties();
        props.setProperty("gOpt1", "true");

        CommandLine cmd = parser.parse(options, new String[0], props);
        Assert.assertTrue(cmd.hasOption("gOpt1"));
        Assert.assertEquals("gOpt1", group.getSelected());
    }

    @Test
    public void processProperties_givenOptionCannotAddValue_shouldCatchExceptionSilently() throws ParseException
    {
        Option opt = new Option("noArg", false, "takes no arg but mocked as hasArg");
        opt.setArgs(0);
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("noArg", "illegalValue");

        CommandLine cmd = parser.parse(options, new String[0], props);
        Assert.assertFalse(cmd.hasOption("noArg"));
    }

    @Test
    public void gettersAndSetters_givenOptions_shouldStoreAndRetrieveCorrectly()
    {
        Option req = new Option("k", "key option");
        req.setRequired(true);
        options.addOption(req);

        parser.setOptions(options);

        Assert.assertSame(options, parser.getOptions());
        Assert.assertNotNull(parser.getRequiredOptions());
        Assert.assertEquals(1, parser.getRequiredOptions().size());
        Assert.assertTrue(parser.getRequiredOptions().contains("k"));
    }

    @Test
    public void parse_givenOverloadedConvenienceMethods_shouldDelegateProperly() throws ParseException
    {
        Option opt = new Option("t", true, "target option");
        options.addOption(opt);

        CommandLine cmd1 = parser.parse(options, new String[] { "-t", "v1" });
        Assert.assertEquals("v1", cmd1.getOptionValue("t"));

        Properties props = new Properties();
        props.setProperty("t", "v2");
        CommandLine cmd2 = parser.parse(options, new String[0], props);
        Assert.assertEquals("v2", cmd2.getOptionValue("t"));

        CommandLine cmd3 = parser.parse(options, new String[] { "-t", "v3", "extra" }, true);
        Assert.assertEquals("v3", cmd3.getOptionValue("t"));
        Assert.assertEquals(1, cmd3.getArgs().length);
        Assert.assertEquals("extra", cmd3.getArgs()[0]);
    }
}