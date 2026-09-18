package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
        // Arrange
        options.addOption("a", "alpha", false, "alpha option");

        // Act
        CommandLine cmd = parser.parse(options, null);

        // Assert
        assertNotNull(cmd);
        assertEquals(0, cmd.getOptions().length);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void parse_givenShortOptionWithoutArgument_shouldParseOptionSuccessfully() throws Exception
    {
        // Arrange
        options.addOption("a", "alpha", false, "alpha option");
        String[] args = new String[]{"-a"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("a"));
        assertFalse(cmd.hasOption("b"));
    }

    @Test
    public void parse_givenShortOptionWithSeparateArgument_shouldParseOptionAndArgument() throws Exception
    {
        // Arrange
        options.addOption("b", "beta", true, "beta option");
        String[] args = new String[]{"-b", "value1"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("b"));
        assertEquals("value1", cmd.getOptionValue("b"));
    }

    @Test
    public void parse_givenShortOptionWithQuotedArgument_shouldStripQuotes() throws Exception
    {
        // Arrange
        options.addOption("b", true, "beta option");
        String[] args = new String[]{"-b", "\"quotedValue\""};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("b"));
        assertEquals("quotedValue", cmd.getOptionValue("b"));
    }

    @Test
    public void parse_givenShortOptionWithNegativeNumberArgument_shouldAcceptNegativeNumber() throws Exception
    {
        // Arrange
        options.addOption("n", "num", true, "number option");
        String[] args = new String[]{"-n", "-42.5"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("n"));
        assertEquals("-42.5", cmd.getOptionValue("n"));
    }

    @Test
    public void parse_givenShortOptionWithEqualSign_shouldParseValue() throws Exception
    {
        // Arrange
        options.addOption("s", "set", true, "set option");
        String[] args = new String[]{"-s=configValue"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("s"));
        assertEquals("configValue", cmd.getOptionValue("s"));
    }

    @Test
    public void parse_givenShortOptionWithEqualSignWhenNoArgExpected_shouldThrowUnrecognizedOptionException()
    {
        // Arrange
        options.addOption("f", "flag", false, "flag option without arg");
        String[] args = new String[]{"-f=unexpected"};

        // Act & Assert
        try
        {
            parser.parse(options, args, false);
            fail("Expected UnrecognizedOptionException was not thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            assertEquals("-f=unexpected", e.getOption());
        }
        catch (ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenLongOptionWithoutEqual_shouldParseSuccessfully() throws Exception
    {
        // Arrange
        options.addOption("l", "longopt", false, "long option");
        String[] args = new String[]{"--longopt"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("longopt"));
        assertTrue(cmd.hasOption("l"));
    }

    @Test
    public void parse_givenLongOptionWithSeparateArgument_shouldParseValue() throws Exception
    {
        // Arrange
        options.addOption("o", "output", true, "output file");
        String[] args = new String[]{"--output", "file.txt"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("output"));
        assertEquals("file.txt", cmd.getOptionValue("output"));
    }

    @Test
    public void parse_givenLongOptionWithEqualSign_shouldParseValue() throws Exception
    {
        // Arrange
        options.addOption("f", "file", true, "file path");
        String[] args = new String[]{"--file=data.json"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("file"));
        assertEquals("data.json", cmd.getOptionValue("file"));
    }

    @Test
    public void parse_givenLongOptionWithEqualSignWhenNoArgExpected_shouldThrowUnrecognizedOptionException()
    {
        // Arrange
        options.addOption("v", "verbose", false, "verbose mode");
        String[] args = new String[]{"--verbose=true"};

        // Act & Assert
        try
        {
            parser.parse(options, args, false);
            fail("Expected UnrecognizedOptionException was not thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            assertEquals("--verbose=true", e.getOption());
        }
        catch (ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenAmbiguousLongOptionWithoutEqual_shouldThrowAmbiguousOptionException()
    {
        // Arrange
        options.addOption(new Option("t", "test", false, "test option"));
        options.addOption(new Option("e", "testing", false, "testing option"));
        String[] args = new String[]{"--te"};

        // Act & Assert
        try
        {
            parser.parse(options, args);
            fail("Expected AmbiguousOptionException was not thrown");
        }
        catch (AmbiguousOptionException e)
        {
            assertEquals("--te", e.getOption());
            assertEquals(2, e.getMatchingOptions().size());
        }
        catch (ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenAmbiguousLongOptionWithEqual_shouldThrowAmbiguousOptionException()
    {
        // Arrange
        options.addOption(new Option("t", "test", true, "test option"));
        options.addOption(new Option("e", "testing", true, "testing option"));
        String[] args = new String[]{"--te=sample"};

        // Act & Assert
        try
        {
            parser.parse(options, args);
            fail("Expected AmbiguousOptionException was not thrown");
        }
        catch (AmbiguousOptionException e)
        {
            assertEquals("--te", e.getOption());
        }
        catch (ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenPartialMatchingLongOption_shouldMatchExactOption() throws Exception
    {
        // Arrange
        options.addOption("c", "config", true, "config path");
        String[] args = new String[]{"--conf=app.xml"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("config"));
        assertEquals("app.xml", cmd.getOptionValue("config"));
    }

    @Test
    public void parse_givenSingleHyphenToken_shouldTreatAsArgument() throws Exception
    {
        // Arrange
        String[] args = new String[]{"-"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertEquals(1, cmd.getArgs().length);
        assertEquals("-", cmd.getArgs()[0]);
    }

    @Test
    public void parse_givenDoubleHyphenToken_shouldSkipParsingRemainingArguments() throws Exception
    {
        // Arrange
        options.addOption("a", false, "alpha");
        String[] args = new String[]{"--", "-a", "--other", "extra"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertFalse(cmd.hasOption("a"));
        assertEquals(3, cmd.getArgs().length);
        assertEquals("-a", cmd.getArgs()[0]);
        assertEquals("--other", cmd.getArgs()[1]);
        assertEquals("extra", cmd.getArgs()[2]);
    }

    @Test
    public void parse_givenConcatenatedShortFlags_shouldParseAllFlags() throws Exception
    {
        // Arrange
        options.addOption("a", false, "flag a");
        options.addOption("b", false, "flag b");
        options.addOption("c", false, "flag c");
        String[] args = new String[]{"-abc"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertTrue(cmd.hasOption("c"));
    }

    @Test
    public void parse_givenConcatenatedOptionWithTrailingArgument_shouldAssignTrailingStringToLastOption() throws Exception
    {
        // Arrange
        options.addOption("a", false, "flag a");
        options.addOption("f", true, "file option");
        String[] args = new String[]{"-afmyfile.txt"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("f"));
        assertEquals("myfile.txt", cmd.getOptionValue("f"));
    }

    @Test
    public void parse_givenConcatenatedOptionsWithUnknownCharAndStopAtNonOptionFalse_shouldThrowException()
    {
        // Arrange
        options.addOption("a", false, "flag a");
        String[] args = new String[]{"-ax"};

        // Act & Assert
        try
        {
            parser.parse(options, args, false);
            fail("Expected UnrecognizedOptionException was not thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            assertEquals("-ax", e.getOption());
        }
        catch (ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenConcatenatedOptionsWithUnknownCharAndStopAtNonOptionTrue_shouldAddRemainderToArgs() throws Exception
    {
        // Arrange
        options.addOption("a", false, "flag a");
        options.addOption("b", false, "flag b");
        String[] args = new String[]{"-abz", "extra"};

        // Act
        CommandLine cmd = parser.parse(options, args, true);

        // Assert
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertEquals(2, cmd.getArgs().length);
        assertEquals("z", cmd.getArgs()[0]);
        assertEquals("extra", cmd.getArgs()[1]);
    }

    @Test
    public void parse_givenUnknownShortOptionWithStopAtNonOptionTrue_shouldStopParsing() throws Exception
    {
        // Arrange
        options.addOption("a", false, "flag a");
        String[] args = new String[]{"-z", "-a"};

        // Act
        CommandLine cmd = parser.parse(options, args, true);

        // Assert
        assertFalse(cmd.hasOption("a"));
        assertEquals(2, cmd.getArgs().length);
        assertEquals("-z", cmd.getArgs()[0]);
        assertEquals("-a", cmd.getArgs()[1]);
    }

    @Test
    public void parse_givenSingleHyphenLongOptionWithEqualSign_shouldParseThroughHandleLongOptionWithEqual() throws Exception
    {
        // Arrange
        options.addOption("opt", "option", true, "custom option");
        String[] args = new String[]{"-option=customVal"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("option"));
        assertEquals("customVal", cmd.getOptionValue("option"));
    }

    @Test
    public void parse_givenSingleHyphenLongPrefixWithoutEqual_shouldExtractPrefixAndArgument() throws Exception
    {
        // Arrange
        Option opt = new Option("server", "serverName", true, "server address");
        options.addOption(opt);
        String[] args = new String[]{"-serverLocalhost"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("server"));
        assertEquals("Localhost", cmd.getOptionValue("server"));
    }

    @Test
    public void parse_givenJavaPropertyStyleOptionWithoutEqual_shouldExtractKeyAndTreatAsProperty() throws Exception
    {
        // Arrange
        Option propertyOpt = new Option("D", true, "JVM property");
        propertyOpt.setArgs(Option.UNLIMITED_VALUES);
        options.addOption(propertyOpt);
        String[] args = new String[]{"-DpropertyKey"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("D"));
        assertEquals("propertyKey", cmd.getOptionValue("D"));
    }

    @Test
    public void parse_givenJavaPropertyStyleOptionWithEqual_shouldExtractKeyAndValue() throws Exception
    {
        // Arrange
        Option propertyOpt = new Option("D", true, "JVM property");
        propertyOpt.setArgs(2);
        options.addOption(propertyOpt);
        String[] args = new String[]{"-Duser.name=admin"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("D"));
        String[] values = cmd.getOptionValues("D");
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("user.name", values[0]);
        assertEquals("admin", values[1]);
    }

    @Test
    public void parse_givenMissingRequiredOption_shouldThrowMissingOptionException()
    {
        // Arrange
        Option reqOpt = new Option("r", "required", false, "required option");
        reqOpt.setRequired(true);
        options.addOption(reqOpt);
        String[] args = new String[]{"-other"};

        // Act & Assert
        try
        {
            parser.parse(options, args, true);
            fail("Expected MissingOptionException was not thrown");
        }
        catch (MissingOptionException e)
        {
            assertTrue(e.getMissingOptions().contains("r"));
        }
        catch (ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenRequiredOptionGroupProvided_shouldPassValidation() throws Exception
    {
        // Arrange
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "optA", false, "option A");
        Option optB = new Option("b", "optB", false, "option B");
        group.addOption(optA);
        group.addOption(optB);
        group.setRequired(true);
        options.addOptionGroup(group);

        String[] args = new String[]{"-a"};

        // Act
        CommandLine cmd = parser.parse(options, args);

        // Assert
        assertTrue(cmd.hasOption("a"));
        assertFalse(cmd.hasOption("b"));
    }

    @Test
    public void parse_givenRequiredOptionGroupMissing_shouldThrowMissingOptionException()
    {
        // Arrange
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "optA", false, "option A");
        group.addOption(optA);
        group.setRequired(true);
        options.addOptionGroup(group);

        String[] args = new String[]{"extraArg"};

        // Act & Assert
        try
        {
            parser.parse(options, args, true);
            fail("Expected MissingOptionException was not thrown");
        }
        catch (MissingOptionException e)
        {
            assertEquals(1, e.getMissingOptions().size());
        }
        catch (ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenOptionGroupWithTwoOptionsSpecified_shouldThrowAlreadySelectedException()
    {
        // Arrange
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", false, "option A");
        Option optB = new Option("b", false, "option B");
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        String[] args = new String[]{"-a", "-b"};

        // Act & Assert
        try
        {
            parser.parse(options, args);
            fail("Expected AlreadySelectedException was not thrown");
        }
        catch (AlreadySelectedException e)
        {
            assertEquals(group, e.getOptionGroup());
            assertEquals(optB, e.getOption());
        }
        catch (ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenOptionMissingArgumentAtEndOfInput_shouldThrowMissingArgumentException()
    {
        // Arrange
        Option opt = new Option("k", "key", true, "key option");
        opt.setRequired(false);
        options.addOption(opt);
        String[] args = new String[]{"-k"};

        // Act & Assert
        try
        {
            parser.parse(options, args);
            fail("Expected MissingArgumentException was not thrown");
        }
        catch (MissingArgumentException e)
        {
            assertEquals("k", e.getOption().getOpt());
        }
        catch (ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenOptionMissingArgumentBeforeAnotherOption_shouldThrowMissingArgumentException()
    {
        // Arrange
        options.addOption("k", "key", true, "key option");
        options.addOption("f", "flag", false, "flag option");
        String[] args = new String[]{"-k", "-f"};

        // Act & Assert
        try
        {
            parser.parse(options, args);
            fail("Expected MissingArgumentException was not thrown");
        }
        catch (MissingArgumentException e)
        {
            assertEquals("k", e.getOption().getOpt());
        }
        catch (ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenPropertiesWithUnrecognizedOption_shouldThrowUnrecognizedOptionException()
    {
        // Arrange
        Properties props = new Properties();
        props.setProperty("unknownProp", "value");

        // Act & Assert
        try
        {
            parser.parse(options, new String[]{}, props);
            fail("Expected UnrecognizedOptionException was not thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            assertEquals("unknownProp", e.getOption());
        }
        catch (ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void parse_givenPropertiesForExistingArgumentOption_shouldPopulateArgumentFromProperties() throws Exception
    {
        // Arrange
        options.addOption("p", "path", true, "file path");
        Properties props = new Properties();
        props.setProperty("path", "/var/log");

        // Act
        CommandLine cmd = parser.parse(options, new String[]{}, props);

        // Assert
        assertTrue(cmd.hasOption("path"));
        assertEquals("/var/log", cmd.getOptionValue("path"));
    }

    @Test
    public void parse_givenPropertiesForExistingFlagOption_shouldActivateFlagWhenTrueYesOr1() throws Exception
    {
        // Arrange
        options.addOption("t", "trueOpt", false, "flag option");
        options.addOption("y", "yesOpt", false, "flag option");
        options.addOption("o", "oneOpt", false, "flag option");
        options.addOption("n", "noOpt", false, "flag option");

        Properties props = new Properties();
        props.setProperty("trueOpt", "true");
        props.setProperty("yesOpt", "YES");
        props.setProperty("oneOpt", "1");
        props.setProperty("noOpt", "0");

        // Act
        CommandLine cmd = parser.parse(options, new String[]{}, props);

        // Assert
        assertTrue(cmd.hasOption("trueOpt"));
        assertTrue(cmd.hasOption("yesOpt"));
        assertTrue(cmd.hasOption("oneOpt"));
        assertFalse(cmd.hasOption("noOpt"));
    }

    @Test
    public void parse_givenPropertiesWhenOptionAlreadySpecifiedInArgs_shouldNotOverrideCommandLineValue() throws Exception
    {
        // Arrange
        options.addOption("f", "file", true, "target file");
        Properties props = new Properties();
        props.setProperty("file", "default.txt");
        String[] args = new String[]{"--file", "override.txt"};

        // Act
        CommandLine cmd = parser.parse(options, args, props);

        // Assert
        assertTrue(cmd.hasOption("file"));
        assertEquals("override.txt", cmd.getOptionValue("file"));
    }

    @Test
    public void parse_givenPropertiesWhenGroupOptionAlreadySelected_shouldSkipProperty() throws Exception
    {
        // Arrange
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "optA", false, "option A");
        Option optB = new Option("b", "optB", false, "option B");
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        Properties props = new Properties();
        props.setProperty("b", "true");
        String[] args = new String[]{"-a"};

        // Act
        CommandLine cmd = parser.parse(options, args, props);

        // Assert
        assertTrue(cmd.hasOption("a"));
        assertFalse(cmd.hasOption("b"));
    }

    @Test
    public void parse_givenStopAtNonOptionTrue_shouldCollectRemainingTokensAsNonOptionArguments() throws Exception
    {
        // Arrange
        options.addOption("a", "alpha", false, "flag");
        String[] args = new String[]{"-a", "nonOption1", "-unknown", "nonOption2"};

        // Act
        CommandLine cmd = parser.parse(options, args, true);

        // Assert
        assertTrue(cmd.hasOption("a"));
        assertEquals(3, cmd.getArgs().length);
        assertEquals("nonOption1", cmd.getArgs()[0]);
        assertEquals("-unknown", cmd.getArgs()[1]);
        assertEquals("nonOption2", cmd.getArgs()[2]);
    }

    @Test
    public void parse_givenOverloadedMethodSignatures_shouldRouteCorrectly() throws Exception
    {
        // Arrange
        options.addOption("a", false, "flag");

        // Act 1: parse(options, args)
        CommandLine cmd1 = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd1.hasOption("a"));

        // Act 2: parse(options, args, boolean)
        CommandLine cmd2 = parser.parse(options, new String[]{"-a", "arg1"}, true);
        assertTrue(cmd2.hasOption("a"));
        assertEquals(1, cmd2.getArgs().length);

        // Act 3: parse(options, args, Properties)
        Properties props = new Properties();
        CommandLine cmd3 = parser.parse(options, new String[]{"-a"}, props);
        assertTrue(cmd3.hasOption("a"));
    }

    @Test
    public void parse_givenSingleHyphenUnknownOptionWhenStopAtNonOptionFalse_shouldThrowUnrecognizedOptionException()
    {
        // Arrange
        String[] args = new String[]{"-unknown"};

        // Act & Assert
        try
        {
            parser.parse(options, args, false);
            fail("Expected UnrecognizedOptionException was not thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            assertEquals("-unknown", e.getOption());
        }
        catch (ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }
}