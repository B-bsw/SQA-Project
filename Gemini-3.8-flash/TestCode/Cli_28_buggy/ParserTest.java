package org.apache.commons.cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParserTest
{
    private static class TestParser extends Parser
    {
        private boolean flattenThrowsException;

        public TestParser()
        {
            this.flattenThrowsException = false;
        }

        public void setFlattenThrowsException(boolean flattenThrowsException)
        {
            this.flattenThrowsException = flattenThrowsException;
        }

        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) throws ParseException
        {
            if (this.flattenThrowsException)
            {
                throw new ParseException("Simulated flatten exception");
            }
            if (arguments == null)
            {
                return new String[0];
            }
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

    @Test
    public void parse_givenTwoArgOverload_shouldParseArgumentsSuccessfully() throws Exception
    {
        Option optA = new Option("a", "alpha", false, "Flag option");
        options.addOption(optA);

        String[] args = new String[] { "-a", "extraArg" };
        CommandLine cl = parser.parse(options, args);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("extraArg", cl.getArgs()[0]);
    }

    @Test
    public void parse_givenThreeArgPropertiesOverload_shouldApplyProperties() throws Exception
    {
        Option optA = new Option("a", "alpha", true, "Option with arg");
        options.addOption(optA);

        Properties props = new Properties();
        props.setProperty("a", "propertyValue");

        CommandLine cl = parser.parse(options, new String[0], props);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals("propertyValue", cl.getOptionValue("a"));
    }

    @Test
    public void parse_givenThreeArgStopAtNonOptionOverload_shouldStopAtNonOption() throws Exception
    {
        Option optA = new Option("a", "alpha", false, "Flag option");
        options.addOption(optA);

        String[] args = new String[] { "nonOption", "-a" };
        CommandLine cl = parser.parse(options, args, true);

        Assert.assertNotNull(cl);
        Assert.assertFalse(cl.hasOption("a"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("nonOption", cl.getArgs()[0]);
        Assert.assertEquals("-a", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenNullArguments_shouldTreatAsEmptyArray() throws Exception
    {
        Option optA = new Option("a", "alpha", false, "Flag option");
        options.addOption(optA);

        CommandLine cl = parser.parse(options, null);

        Assert.assertNotNull(cl);
        Assert.assertFalse(cl.hasOption("a"));
        Assert.assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void parse_givenFlattenThrowsException_shouldPropagateParseException()
    {
        parser.setFlattenThrowsException(true);

        try
        {
            parser.parse(options, new String[] { "-a" });
            Assert.fail("Expected ParseException when flatten fails");
        }
        catch (ParseException e)
        {
            Assert.assertEquals("Simulated flatten exception", e.getMessage());
        }
    }

    @Test
    public void parse_givenExistingOptionValuesAndGroup_shouldClearBeforeParsing() throws Exception
    {
        Option optA = new Option("a", true, "Option A");
        optA.addValueForProcessing("oldValue");
        options.addOption(optA);

        OptionGroup group = new OptionGroup();
        Option optB = new Option("b", false, "Option B");
        group.addOption(optB);
        group.setSelected(optB);
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[0]);

        Assert.assertNotNull(cl);
        Assert.assertNull(optA.getValues());
        Assert.assertNull(group.getSelected());
    }

    @Test
    public void parse_givenDoubleDashToken_shouldEatRemainingTokensExcludingExtraDoubleDashes() throws Exception
    {
        Option optA = new Option("a", false, "Flag option");
        options.addOption(optA);

        String[] args = new String[] { "--", "arg1", "--", "arg2" };
        CommandLine cl = parser.parse(options, args);

        Assert.assertNotNull(cl);
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("arg1", cl.getArgs()[0]);
        Assert.assertEquals("arg2", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenSingleDashAndStopAtNonOptionFalse_shouldAddDashAsArgument() throws Exception
    {
        String[] args = new String[] { "-" };
        CommandLine cl = parser.parse(options, args, false);

        Assert.assertNotNull(cl);
        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("-", cl.getArgs()[0]);
    }

    @Test
    public void parse_givenSingleDashAndStopAtNonOptionTrue_shouldEatRemainingTokens() throws Exception
    {
        Option optA = new Option("a", false, "Flag option");
        options.addOption(optA);

        String[] args = new String[] { "-", "-a", "arg1" };
        CommandLine cl = parser.parse(options, args, true);

        Assert.assertNotNull(cl);
        Assert.assertFalse(cl.hasOption("a"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("-a", cl.getArgs()[0]);
        Assert.assertEquals("arg1", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenUnrecognizedOptionAndStopAtNonOptionTrue_shouldEatRemainingTokens() throws Exception
    {
        Option optA = new Option("a", false, "Flag option");
        options.addOption(optA);

        String[] args = new String[] { "-unknown", "-a", "arg1" };
        CommandLine cl = parser.parse(options, args, true);

        Assert.assertNotNull(cl);
        Assert.assertFalse(cl.hasOption("a"));
        Assert.assertEquals(3, cl.getArgs().length);
        Assert.assertEquals("-unknown", cl.getArgs()[0]);
        Assert.assertEquals("-a", cl.getArgs()[1]);
        Assert.assertEquals("arg1", cl.getArgs()[2]);
    }

    @Test
    public void parse_givenUnrecognizedOptionAndStopAtNonOptionFalse_shouldThrowUnrecognizedOptionException()
    {
        String[] args = new String[] { "-unknown" };

        try
        {
            parser.parse(options, args, false);
            Assert.fail("Expected UnrecognizedOptionException");
        }
        catch (UnrecognizedOptionException e)
        {
            Assert.assertEquals("-unknown", e.getOption());
        }
        catch (ParseException e)
        {
            Assert.fail("Unexpected exception type: " + e.getClass().getName());
        }
    }

    @Test
    public void parse_givenArgumentAndStopAtNonOptionTrue_shouldEatRemainingTokens() throws Exception
    {
        Option optA = new Option("a", false, "Flag option");
        options.addOption(optA);

        String[] args = new String[] { "arg1", "-a", "arg2" };
        CommandLine cl = parser.parse(options, args, true);

        Assert.assertNotNull(cl);
        Assert.assertFalse(cl.hasOption("a"));
        Assert.assertEquals(3, cl.getArgs().length);
        Assert.assertEquals("arg1", cl.getArgs()[0]);
        Assert.assertEquals("-a", cl.getArgs()[1]);
        Assert.assertEquals("arg2", cl.getArgs()[2]);
    }

    @Test
    public void parse_givenArgumentAndStopAtNonOptionFalse_shouldAddArgAndContinueParsingOptions() throws Exception
    {
        Option optA = new Option("a", false, "Flag option");
        options.addOption(optA);

        String[] args = new String[] { "arg1", "-a", "arg2" };
        CommandLine cl = parser.parse(options, args, false);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("arg1", cl.getArgs()[0]);
        Assert.assertEquals("arg2", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenRequiredOptionPresent_shouldSucceed() throws Exception
    {
        Option optR = new Option("r", "required", false, "Required option");
        optR.setRequired(true);
        options.addOption(optR);

        String[] args = new String[] { "-r" };
        CommandLine cl = parser.parse(options, args);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("r"));
        Assert.assertTrue(parser.getRequiredOptions().isEmpty());
    }

    @Test
    public void parse_givenRequiredOptionMissing_shouldThrowMissingOptionException()
    {
        Option optR = new Option("r", "required", false, "Required option");
        optR.setRequired(true);
        options.addOption(optR);

        try
        {
            parser.parse(options, new String[0]);
            Assert.fail("Expected MissingOptionException");
        }
        catch (MissingOptionException e)
        {
            Assert.assertNotNull(e.getMissingOptions());
            Assert.assertTrue(e.getMissingOptions().contains("r"));
        }
        catch (ParseException e)
        {
            Assert.fail("Unexpected exception: " + e.getClass().getName());
        }
    }

    @Test
    public void parse_givenRequiredOptionGroupPresent_shouldSelectOptionAndSucceed() throws Exception
    {
        Option optG1 = new Option("x", "optionX", false, "Option X");
        Option optG2 = new Option("y", "optionY", false, "Option Y");
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(optG1);
        group.addOption(optG2);
        options.addOptionGroup(group);

        String[] args = new String[] { "-x" };
        CommandLine cl = parser.parse(options, args);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("x"));
        Assert.assertEquals("x", group.getSelected());
        Assert.assertTrue(parser.getRequiredOptions().isEmpty());
    }

    @Test
    public void parse_givenRequiredOptionGroupMissing_shouldThrowMissingOptionException()
    {
        Option optG1 = new Option("x", "optionX", false, "Option X");
        Option optG2 = new Option("y", "optionY", false, "Option Y");
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(optG1);
        group.addOption(optG2);
        options.addOptionGroup(group);

        try
        {
            parser.parse(options, new String[0]);
            Assert.fail("Expected MissingOptionException");
        }
        catch (MissingOptionException e)
        {
            Assert.assertNotNull(e.getMissingOptions());
            Assert.assertFalse(e.getMissingOptions().isEmpty());
        }
        catch (ParseException e)
        {
            Assert.fail("Unexpected exception: " + e.getClass().getName());
        }
    }

    @Test
    public void parse_givenOptionWithArgument_shouldAttachValue() throws Exception
    {
        Option optO = new Option("o", "output", true, "Output file");
        options.addOption(optO);

        String[] args = new String[] { "-o", "file.txt" };
        CommandLine cl = parser.parse(options, args);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("o"));
        Assert.assertEquals("file.txt", cl.getOptionValue("o"));
    }

    @Test
    public void parse_givenOptionWithQuotedArgument_shouldStripQuotes() throws Exception
    {
        Option optO = new Option("o", "output", true, "Output file");
        options.addOption(optO);

        String[] args = new String[] { "-o", "\"quoted_value\"" };
        CommandLine cl = parser.parse(options, args);

        Assert.assertNotNull(cl);
        Assert.assertEquals("quoted_value", cl.getOptionValue("o"));
    }

    @Test
    public void parse_givenOptionMissingRequiredArgument_shouldThrowMissingArgumentException()
    {
        Option optO = new Option("o", "output", true, "Output file");
        options.addOption(optO);

        String[] args = new String[] { "-o" };

        try
        {
            parser.parse(options, args);
            Assert.fail("Expected MissingArgumentException");
        }
        catch (MissingArgumentException e)
        {
            Assert.assertEquals(optO, e.getOption());
        }
        catch (ParseException e)
        {
            Assert.fail("Unexpected exception: " + e.getClass().getName());
        }
    }

    @Test
    public void parse_givenOptionFollowedByAnotherOption_shouldThrowMissingArgumentException()
    {
        Option optO = new Option("o", "output", true, "Output file");
        Option optF = new Option("f", "flag", false, "Flag");
        options.addOption(optO);
        options.addOption(optF);

        String[] args = new String[] { "-o", "-f" };

        try
        {
            parser.parse(options, args);
            Assert.fail("Expected MissingArgumentException");
        }
        catch (MissingArgumentException e)
        {
            Assert.assertEquals(optO, e.getOption());
        }
        catch (ParseException e)
        {
            Assert.fail("Unexpected exception: " + e.getClass().getName());
        }
    }

    @Test
    public void parse_givenOptionWithOptionalArgMissing_shouldSucceedWithoutValue() throws Exception
    {
        Option optO = new Option("o", "optional", true, "Optional argument");
        optO.setOptionalArg(true);
        Option optF = new Option("f", "flag", false, "Flag");
        options.addOption(optO);
        options.addOption(optF);

        String[] args = new String[] { "-o", "-f" };
        CommandLine cl = parser.parse(options, args);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("o"));
        Assert.assertNull(cl.getOptionValue("o"));
        Assert.assertTrue(cl.hasOption("f"));
    }

    @Test
    public void parse_givenOptionWithSingleArgFollowedByAnotherArg_shouldTreatSecondAsCommandLineArg() throws Exception
    {
        Option optO = new Option("o", "one", true, "Single arg option");
        optO.setArgs(1);
        options.addOption(optO);

        String[] args = new String[] { "-o", "val1", "extraArg" };
        CommandLine cl = parser.parse(options, args);

        Assert.assertNotNull(cl);
        Assert.assertEquals("val1", cl.getOptionValue("o"));
        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("extraArg", cl.getArgs()[0]);
    }

    @Test
    public void processProperties_givenNullProperties_shouldDoNothing()
    {
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processProperties(null);

        Assert.assertEquals(0, parser.cmd.getArgs().length);
    }

    @Test
    public void processProperties_givenOptionAlreadyPresentInCommandLine_shouldNotOverride() throws Exception
    {
        Option optO = new Option("o", "output", true, "Output");
        options.addOption(optO);

        Properties props = new Properties();
        props.setProperty("o", "propertyVal");

        CommandLine cl = parser.parse(options, new String[] { "-o", "cliVal" }, props);

        Assert.assertEquals("cliVal", cl.getOptionValue("o"));
    }

    @Test
    public void processProperties_givenFlagOptionWithYesTrueOr1_shouldAddFlagOption() throws Exception
    {
        Option optY = new Option("y", "yesOpt", false, "Flag Y");
        Option optT = new Option("t", "trueOpt", false, "Flag T");
        Option optOne = new Option("one", "oneOpt", false, "Flag 1");
        options.addOption(optY);
        options.addOption(optT);
        options.addOption(optOne);

        Properties props = new Properties();
        props.setProperty("y", "yes");
        props.setProperty("t", "TRUE");
        props.setProperty("one", "1");

        CommandLine cl = parser.parse(options, new String[0], props);

        Assert.assertTrue(cl.hasOption("y"));
        Assert.assertTrue(cl.hasOption("t"));
        Assert.assertTrue(cl.hasOption("one"));
    }

    @Test
    public void processProperties_givenFlagOptionWithInvalidValue_shouldBreakAndNotAddOption() throws Exception
    {
        Option optF = new Option("f", "flag", false, "Flag option");
        options.addOption(optF);

        Properties props = new Properties();
        props.setProperty("f", "no");

        CommandLine cl = parser.parse(options, new String[0], props);

        Assert.assertFalse(cl.hasOption("f"));
    }

    @Test
    public void processProperties_givenOptionThrowingRuntimeExceptionOnAddValue_shouldIgnoreException() throws Exception
    {
        Option throwingOption = new Option("bad", "badOpt", true, "Throws on add value")
        {
            public void addValueForProcessing(String value)
            {
                throw new RuntimeException("Simulated value processing failure");
            }
        };
        options.addOption(throwingOption);

        Properties props = new Properties();
        props.setProperty("bad", "val");

        CommandLine cl = parser.parse(options, new String[0], props);

        Assert.assertTrue(cl.hasOption("bad"));
        Assert.assertNull(cl.getOptionValue("bad"));
    }

    @Test
    public void checkRequiredOptions_givenRequiredOptionsRemaining_shouldThrowMissingOptionException()
    {
        Option optR = new Option("r", "req", false, "Required option");
        optR.setRequired(true);
        options.addOption(optR);

        parser.setOptions(options);

        try
        {
            parser.checkRequiredOptions();
            Assert.fail("Expected MissingOptionException");
        }
        catch (MissingOptionException e)
        {
            Assert.assertTrue(e.getMissingOptions().contains("r"));
        }
    }

    @Test
    public void checkRequiredOptions_givenNoRequiredOptions_shouldNotThrowException() throws Exception
    {
        parser.setOptions(options);
        parser.checkRequiredOptions();
    }

    @Test
    public void getOptionsAndGetRequiredOptions_shouldReturnConfiguredObjects()
    {
        Option optR = new Option("r", "req", false, "Required option");
        optR.setRequired(true);
        options.addOption(optR);

        parser.setOptions(options);

        Assert.assertSame(options, parser.getOptions());
        Assert.assertNotNull(parser.getRequiredOptions());
        Assert.assertEquals(1, parser.getRequiredOptions().size());
        Assert.assertEquals("r", parser.getRequiredOptions().get(0));
    }
}