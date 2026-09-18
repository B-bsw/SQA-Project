package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

public class DefaultParserTest
{
    private DefaultParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new DefaultParser();
        options = new Options();
    }

    @Test
    public void parse_givenNullArguments_shouldReturnEmptyCommandLine() throws Exception
    {
        // Arrange & Act
        CommandLine cl = parser.parse(options, null);

        // Assert
        Assert.assertNotNull(cl);
        Assert.assertEquals(0, cl.getArgs().length);
        Assert.assertEquals(0, cl.getOptions().length);
    }

    @Test
    public void parse_givenEmptyArguments_shouldReturnEmptyCommandLine() throws Exception
    {
        // Arrange & Act
        CommandLine cl = parser.parse(options, new String[0]);

        // Assert
        Assert.assertNotNull(cl);
        Assert.assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void parse_givenSimpleShortOption_shouldParseOption() throws Exception
    {
        // Arrange
        Option optA = new Option("a", "alpha", false, "Alpha flag");
        options.addOption(optA);

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-a"});

        // Assert
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("alpha"));
    }

    @Test
    public void parse_givenShortOptionWithSeparateArg_shouldAssignValue() throws Exception
    {
        // Arrange
        Option optB = new Option("b", "beta", true, "Beta option");
        options.addOption(optB);

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-b", "valueB"});

        // Assert
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertEquals("valueB", cl.getOptionValue("b"));
    }

    @Test
    public void parse_givenShortOptionMissingArg_shouldThrowMissingArgumentException() throws Exception
    {
        // Arrange
        Option optB = new Option("b", true, "Beta option");
        options.addOption(optB);

        // Act & Assert
        try
        {
            parser.parse(options, new String[] {"-b"});
            Assert.fail("Expected MissingArgumentException was not thrown");
        }
        catch (MissingArgumentException e)
        {
            Assert.assertEquals("b", e.getOption().getOpt());
        }
    }

    @Test
    public void parse_givenLongOptionWithoutEqual_shouldParseOption() throws Exception
    {
        // Arrange
        Option optConfig = new Option("c", "config", true, "Config file");
        options.addOption(optConfig);

        // Act
        CommandLine cl = parser.parse(options, new String[] {"--config", "app.properties"});

        // Assert
        Assert.assertTrue(cl.hasOption("config"));
        Assert.assertEquals("app.properties", cl.getOptionValue("config"));
    }

    @Test
    public void parse_givenLongOptionWithEqual_shouldParseOptionAndValue() throws Exception
    {
        // Arrange
        Option optConfig = new Option("c", "config", true, "Config file");
        options.addOption(optConfig);

        // Act
        CommandLine cl = parser.parse(options, new String[] {"--config=app.properties"});

        // Assert
        Assert.assertTrue(cl.hasOption("config"));
        Assert.assertEquals("app.properties", cl.getOptionValue("config"));
    }

    @Test
    public void parse_givenLongOptionWithEqualOnFlagWithoutArg_shouldThrowUnrecognizedOption() throws Exception
    {
        // Arrange
        Option optFlag = new Option("f", "flag", false, "Flag option");
        options.addOption(optFlag);

        // Act & Assert
        try
        {
            parser.parse(options, new String[] {"--flag=value"});
            Assert.fail("Expected UnrecognizedOptionException was not thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            Assert.assertEquals("--flag=value", e.getOption());
        }
    }

    @Test
    public void parse_givenAmbiguousLongOptionWithoutEqual_shouldThrowAmbiguousOptionException() throws Exception
    {
        // Arrange
        options.addOption(new Option(null, "verbose", false, "Verbose mode"));
        options.addOption(new Option(null, "version", false, "Print version"));

        // Act & Assert
        try
        {
            parser.parse(options, new String[] {"--ver"});
            Assert.fail("Expected AmbiguousOptionException was not thrown");
        }
        catch (AmbiguousOptionException e)
        {
            Assert.assertEquals("--ver", e.getOption());
            Assert.assertEquals(2, e.getMatchingOptions().size());
        }
    }

    @Test
    public void parse_givenAmbiguousLongOptionWithEqual_shouldThrowAmbiguousOptionException() throws Exception
    {
        // Arrange
        options.addOption(new Option(null, "output", true, "Output destination"));
        options.addOption(new Option(null, "outformat", true, "Output format"));

        // Act & Assert
        try
        {
            parser.parse(options, new String[] {"--out=test.txt"});
            Assert.fail("Expected AmbiguousOptionException was not thrown");
        }
        catch (AmbiguousOptionException e)
        {
            Assert.assertEquals("--out", e.getOption());
            Assert.assertEquals(2, e.getMatchingOptions().size());
        }
    }

    @Test
    public void parse_givenConcatenatedShortFlags_shouldParseAllFlags() throws Exception
    {
        // Arrange
        options.addOption(new Option("a", false, "Flag a"));
        options.addOption(new Option("b", false, "Flag b"));
        options.addOption(new Option("c", false, "Flag c"));

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-abc"});

        // Assert
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertTrue(cl.hasOption("c"));
    }

    @Test
    public void parse_givenConcatenatedShortOptionWithAttachedValue_shouldParseFlagsAndValue() throws Exception
    {
        // Arrange
        options.addOption(new Option("a", false, "Flag a"));
        options.addOption(new Option("b", true, "Option b with value"));

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-abHello"});

        // Assert
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertEquals("Hello", cl.getOptionValue("b"));
    }

    @Test
    public void parse_givenConcatenatedOptionsWithUnknownOption_shouldThrowUnrecognizedOptionException() throws Exception
    {
        // Arrange
        options.addOption(new Option("a", false, "Flag a"));

        // Act & Assert
        try
        {
            parser.parse(options, new String[] {"-ax"});
            Assert.fail("Expected UnrecognizedOptionException was not thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            Assert.assertEquals("-ax", e.getOption());
        }
    }

    @Test
    public void parse_givenConcatenatedOptionsWithStopAtNonOption_shouldStopAndAddArgs() throws Exception
    {
        // Arrange
        options.addOption(new Option("a", false, "Flag a"));

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-ax", "-b"}, true);

        // Assert
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("x", cl.getArgs()[0]);
        Assert.assertEquals("-b", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenDoubleHyphenDelimiter_shouldSkipParsingSubsequentTokens() throws Exception
    {
        // Arrange
        options.addOption(new Option("a", false, "Flag a"));
        options.addOption(new Option("b", false, "Flag b"));

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-a", "--", "-b", "extra"});

        // Assert
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertFalse(cl.hasOption("b"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("-b", cl.getArgs()[0]);
        Assert.assertEquals("extra", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenNegativeNumberAsOptionArgument_shouldTreatAsArgumentNotOption() throws Exception
    {
        // Arrange
        options.addOption(new Option("n", true, "Number argument"));

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-n", "-42.5"});

        // Assert
        Assert.assertTrue(cl.hasOption("n"));
        Assert.assertEquals("-42.5", cl.getOptionValue("n"));
    }

    @Test
    public void parse_givenSingleHyphen_shouldTreatAsNonOptionArgument() throws Exception
    {
        // Arrange & Act
        CommandLine cl = parser.parse(options, new String[] {"-"});

        // Assert
        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("-", cl.getArgs()[0]);
    }

    @Test
    public void parse_givenQuotedArgument_shouldStripQuotes() throws Exception
    {
        // Arrange
        options.addOption(new Option("s", true, "String argument"));

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-s", "\"quoted text\""});

        // Assert
        Assert.assertEquals("quoted text", cl.getOptionValue("s"));
    }

    @Test
    public void parse_givenShortOptionWithEqual_shouldParseValue() throws Exception
    {
        // Arrange
        options.addOption(new Option("s", true, "Single char option with arg"));

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-s=myValue"});

        // Assert
        Assert.assertTrue(cl.hasOption("s"));
        Assert.assertEquals("myValue", cl.getOptionValue("s"));
    }

    @Test
    public void parse_givenShortOptionWithoutArgWithEqual_shouldThrowUnrecognizedOptionException() throws Exception
    {
        // Arrange
        options.addOption(new Option("s", false, "Single char option without arg"));

        // Act & Assert
        try
        {
            parser.parse(options, new String[] {"-s=illegal"});
            Assert.fail("Expected UnrecognizedOptionException was not thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            Assert.assertEquals("-s=illegal", e.getOption());
        }
    }

    @Test
    public void parse_givenJavaPropertyStyleTokenWithEqual_shouldParseTwoValues() throws Exception
    {
        // Arrange
        Option propOption = new Option("D", true, "Define property");
        propOption.setArgs(Option.UNLIMITED_VALUES);
        options.addOption(propOption);

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-Dkey=value"});

        // Assert
        Assert.assertTrue(cl.hasOption("D"));
        String[] values = cl.getOptionValues("D");
        Assert.assertEquals(2, values.length);
        Assert.assertEquals("key", values[0]);
        Assert.assertEquals("value", values[1]);
    }

    @Test
    public void parse_givenJavaPropertyStyleTokenWithoutEqual_shouldParseSingleValue() throws Exception
    {
        // Arrange
        Option propOption = new Option("D", true, "Define property");
        propOption.setArgs(2);
        options.addOption(propOption);

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-DmyProp"});

        // Assert
        Assert.assertTrue(cl.hasOption("D"));
        Assert.assertEquals("myProp", cl.getOptionValue("D"));
    }

    @Test
    public void parse_givenSingleHyphenLongPrefixMatch_shouldParseLongOption() throws Exception
    {
        // Arrange
        Option optLong = new Option("o", "output-file", true, "Output file");
        options.addOption(optLong);

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-output-fileTarget.txt"});

        // Assert
        Assert.assertTrue(cl.hasOption("output-file"));
        Assert.assertEquals("Target.txt", cl.getOptionValue("output-file"));
    }

    @Test
    public void parse_givenSingleHyphenMatchingExactLongOption_shouldParseLongOption() throws Exception
    {
        // Arrange
        Option optLong = new Option("h", "help", false, "Help display");
        options.addOption(optLong);

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-help"});

        // Assert
        Assert.assertTrue(cl.hasOption("help"));
    }

    @Test
    public void parse_givenSingleHyphenUnknownOptionWhenStopAtNonOptionFalse_shouldThrowUnrecognizedOptionException() throws Exception
    {
        // Arrange & Act & Assert
        try
        {
            parser.parse(options, new String[] {"-z"});
            Assert.fail("Expected UnrecognizedOptionException was not thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            Assert.assertEquals("-z", e.getOption());
        }
    }

    @Test
    public void parse_givenSingleHyphenUnknownOptionWhenStopAtNonOptionTrue_shouldTreatAsArgumentAndStop() throws Exception
    {
        // Arrange
        options.addOption(new Option("a", false, "Flag a"));

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-a", "-unknown", "-b"}, true);

        // Assert
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("-unknown", cl.getArgs()[0]);
        Assert.assertEquals("-b", cl.getArgs()[1]);
    }

    @Test
    public void parse_givenMissingRequiredOption_shouldThrowMissingOptionException() throws Exception
    {
        // Arrange
        Option req = new Option("r", "required", true, "Required option");
        req.setRequired(true);
        options.addOption(req);

        // Act & Assert
        try
        {
            parser.parse(options, new String[] {});
            Assert.fail("Expected MissingOptionException was not thrown");
        }
        catch (MissingOptionException e)
        {
            Assert.assertTrue(e.getMissingOptions().contains("r"));
        }
    }

    @Test
    public void parse_givenPresentRequiredOption_shouldPassValidation() throws Exception
    {
        // Arrange
        Option req = new Option("r", "required", true, "Required option");
        req.setRequired(true);
        options.addOption(req);

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-r", "val"});

        // Assert
        Assert.assertTrue(cl.hasOption("r"));
        Assert.assertEquals("val", cl.getOptionValue("r"));
    }

    @Test
    public void parse_givenRequiredOptionGroupMissing_shouldThrowMissingOptionException() throws Exception
    {
        // Arrange
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("x", false, "Option X"));
        group.addOption(new Option("y", false, "Option Y"));
        options.addOptionGroup(group);

        // Act & Assert
        try
        {
            parser.parse(options, new String[] {});
            Assert.fail("Expected MissingOptionException was not thrown");
        }
        catch (MissingOptionException e)
        {
            Assert.assertTrue(e.getMissingOptions().contains(group));
        }
    }

    @Test
    public void parse_givenRequiredOptionGroupPresent_shouldPassValidation() throws Exception
    {
        // Arrange
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("x", false, "Option X"));
        group.addOption(new Option("y", false, "Option Y"));
        options.addOptionGroup(group);

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-x"});

        // Assert
        Assert.assertTrue(cl.hasOption("x"));
        Assert.assertFalse(cl.hasOption("y"));
    }

    @Test
    public void parse_givenOptionGroupWithTwoSelectedOptions_shouldThrowAlreadySelectedException() throws Exception
    {
        // Arrange
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("x", false, "Option X"));
        group.addOption(new Option("y", false, "Option Y"));
        options.addOptionGroup(group);

        // Act & Assert
        try
        {
            parser.parse(options, new String[] {"-x", "-y"});
            Assert.fail("Expected AlreadySelectedException was not thrown");
        }
        catch (AlreadySelectedException e)
        {
            Assert.assertEquals(group, e.getOptionGroup());
            Assert.assertEquals("y", e.getOption().getOpt());
        }
    }

    @Test
    public void parse_givenPropertiesWithArgOption_shouldApplyDefaultPropertyValue() throws Exception
    {
        // Arrange
        options.addOption(new Option("p", "port", true, "Server port"));
        Properties props = new Properties();
        props.setProperty("port", "8080");

        // Act
        CommandLine cl = parser.parse(options, new String[0], props);

        // Assert
        Assert.assertTrue(cl.hasOption("port"));
        Assert.assertEquals("8080", cl.getOptionValue("port"));
    }

    @Test
    public void parse_givenPropertiesAndCliArgProvided_shouldPreferCliArgOverProperty() throws Exception
    {
        // Arrange
        options.addOption(new Option("p", "port", true, "Server port"));
        Properties props = new Properties();
        props.setProperty("port", "8080");

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-p", "9090"}, props);

        // Assert
        Assert.assertTrue(cl.hasOption("port"));
        Assert.assertEquals("9090", cl.getOptionValue("port"));
    }

    @Test
    public void parse_givenPropertiesWithFlagTrueValues_shouldActivateFlag() throws Exception
    {
        // Arrange
        options.addOption(new Option("v", "verbose", false, "Verbose mode"));
        options.addOption(new Option("d", "debug", false, "Debug mode"));
        options.addOption(new Option("t", "trace", false, "Trace mode"));

        Properties props = new Properties();
        props.setProperty("verbose", "true");
        props.setProperty("debug", "yes");
        props.setProperty("trace", "1");

        // Act
        CommandLine cl = parser.parse(options, new String[0], props);

        // Assert
        Assert.assertTrue(cl.hasOption("verbose"));
        Assert.assertTrue(cl.hasOption("debug"));
        Assert.assertTrue(cl.hasOption("trace"));
    }

    @Test
    public void parse_givenPropertiesWithFlagFalseValues_shouldNotActivateFlag() throws Exception
    {
        // Arrange
        options.addOption(new Option("v", "verbose", false, "Verbose mode"));
        Properties props = new Properties();
        props.setProperty("verbose", "no");

        // Act
        CommandLine cl = parser.parse(options, new String[0], props);

        // Assert
        Assert.assertFalse(cl.hasOption("verbose"));
    }

    @Test
    public void parse_givenPropertiesWithUnknownOption_shouldThrowUnrecognizedOptionException() throws Exception
    {
        // Arrange
        Properties props = new Properties();
        props.setProperty("unknownProp", "value");

        // Act & Assert
        try
        {
            parser.parse(options, new String[0], props);
            Assert.fail("Expected UnrecognizedOptionException was not thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            Assert.assertEquals("unknownProp", e.getOption());
        }
    }

    @Test
    public void parse_givenPropertiesWithOptionInAlreadySelectedGroup_shouldIgnoreProperty() throws Exception
    {
        // Arrange
        Option optA = new Option("a", false, "Option A");
        Option optB = new Option("b", false, "Option B");
        OptionGroup group = new OptionGroup();
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        Properties props = new Properties();
        props.setProperty("b", "true");

        // Act
        CommandLine cl = parser.parse(options, new String[] {"-a"}, props);

        // Assert
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertFalse(cl.hasOption("b"));
    }

    @Test
    public void parse_givenUnrecognizedLongOptionWithoutEqual_shouldThrowUnrecognizedOptionException() throws Exception
    {
        // Arrange & Act & Assert
        try
        {
            parser.parse(options, new String[] {"--unknownOption"});
            Assert.fail("Expected UnrecognizedOptionException was not thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            Assert.assertEquals("--unknownOption", e.getOption());
        }
    }

    @Test
    public void parse_givenUnrecognizedLongOptionWithEqual_shouldThrowUnrecognizedOptionException() throws Exception
    {
        // Arrange & Act & Assert
        try
        {
            parser.parse(options, new String[] {"--unknownOption=foo"});
            Assert.fail("Expected UnrecognizedOptionException was not thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            Assert.assertEquals("--unknownOption=foo", e.getOption());
        }
    }

    @Test
    public void parse_givenNonOptionArguments_shouldAccumulateInCommandLineArgs() throws Exception
    {
        // Arrange
        options.addOption(new Option("a", false, "Flag a"));

        // Act
        CommandLine cl = parser.parse(options, new String[] {"arg1", "-a", "arg2"});

        // Assert
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("arg1", cl.getArgs()[0]);
        Assert.assertEquals("arg2", cl.getArgs()[1]);
    }
}