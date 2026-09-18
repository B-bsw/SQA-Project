package org.apache.commons.cli;

import java.util.Properties;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefaultParserTest {

    private DefaultParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new DefaultParser();
        options = new Options();
    }

    @Test
    public void parse_givenNullArguments_shouldReturnEmptyCommandLine() throws Exception {
        CommandLine cmd = parser.parse(options, null);
        Assert.assertNotNull(cmd);
        Assert.assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void parse_givenEmptyArguments_shouldReturnEmptyCommandLine() throws Exception {
        CommandLine cmd = parser.parse(options, new String[0]);
        Assert.assertNotNull(cmd);
        Assert.assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void parse_givenSimpleShortOptionWithoutArg_shouldParseSuccessfully() throws Exception {
        Option optA = new Option("a", "alpha", false, "Option A");
        options.addOption(optA);

        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertTrue(cmd.hasOption("alpha"));
    }

    @Test
    public void parse_givenShortOptionWithSeparateArg_shouldCaptureValue() throws Exception {
        Option optB = new Option("b", "beta", true, "Option B");
        options.addOption(optB);

        CommandLine cmd = parser.parse(options, new String[]{"-b", "value1"});
        Assert.assertTrue(cmd.hasOption("b"));
        Assert.assertEquals("value1", cmd.getOptionValue("b"));
    }

    @Test
    public void parse_givenShortOptionWithQuotedArg_shouldStripQuotes() throws Exception {
        Option optB = new Option("b", true, "Option B");
        options.addOption(optB);

        CommandLine cmd = parser.parse(options, new String[]{"-b", "\"quoted-value\""});
        Assert.assertTrue(cmd.hasOption("b"));
        Assert.assertEquals("quoted-value", cmd.getOptionValue("b"));
    }

    @Test
    public void parse_givenShortOptionWithAttachedEqualSignAndArg_shouldCaptureValue() throws Exception {
        Option optB = new Option("b", true, "Option B");
        options.addOption(optB);

        CommandLine cmd = parser.parse(options, new String[]{"-b=attachedValue"});
        Assert.assertTrue(cmd.hasOption("b"));
        Assert.assertEquals("attachedValue", cmd.getOptionValue("b"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void parse_givenShortOptionWithAttachedEqualSignWhenNoArgAccepted_shouldThrowException() throws Exception {
        Option optA = new Option("a", false, "Option A");
        options.addOption(optA);

        parser.parse(options, new String[]{"-a=unexpected"});
    }

    @Test
    public void parse_givenLongOptionWithoutArg_shouldParseSuccessfully() throws Exception {
        Option optVerbose = new Option(null, "verbose", false, "Verbose flag");
        options.addOption(optVerbose);

        CommandLine cmd = parser.parse(options, new String[]{"--verbose"});
        Assert.assertTrue(cmd.hasOption("verbose"));
    }

    @Test
    public void parse_givenLongOptionWithSeparateArg_shouldCaptureValue() throws Exception {
        Option optFile = new Option(null, "file", true, "File path");
        options.addOption(optFile);

        CommandLine cmd = parser.parse(options, new String[]{"--file", "test.txt"});
        Assert.assertTrue(cmd.hasOption("file"));
        Assert.assertEquals("test.txt", cmd.getOptionValue("file"));
    }

    @Test
    public void parse_givenLongOptionWithEqualSignAndArg_shouldCaptureValue() throws Exception {
        Option optFile = new Option(null, "file", true, "File path");
        options.addOption(optFile);

        CommandLine cmd = parser.parse(options, new String[]{"--file=test.txt"});
        Assert.assertTrue(cmd.hasOption("file"));
        Assert.assertEquals("test.txt", cmd.getOptionValue("file"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void parse_givenLongOptionWithEqualSignWhenNoArgAccepted_shouldThrowException() throws Exception {
        Option optVerbose = new Option(null, "verbose", false, "Verbose flag");
        options.addOption(optVerbose);

        parser.parse(options, new String[]{"--verbose=extra"});
    }

    @Test(expected = AmbiguousOptionException.class)
    public void parse_givenAmbiguousLongOptionWithoutEqual_shouldThrowAmbiguousOptionException() throws Exception {
        options.addOption(new Option(null, "verbose", false, "Verbose mode"));
        options.addOption(new Option(null, "version", false, "Display version"));

        parser.parse(options, new String[]{"--ver"});
    }

    @Test(expected = AmbiguousOptionException.class)
    public void parse_givenAmbiguousLongOptionWithEqual_shouldThrowAmbiguousOptionException() throws Exception {
        options.addOption(new Option(null, "output-file", true, "Output destination"));
        options.addOption(new Option(null, "output-format", true, "Output layout"));

        parser.parse(options, new String[]{"--output=stdout"});
    }

    @Test
    public void parse_givenSingleHyphenToken_shouldTreatAsArgument() throws Exception {
        CommandLine cmd = parser.parse(options, new String[]{"-"});
        Assert.assertEquals(1, cmd.getArgs().length);
        Assert.assertEquals("-", cmd.getArgs()[0]);
    }

    @Test
    public void parse_givenDoubleHyphenToken_shouldStopOptionParsingAndTreatRestAsArgs() throws Exception {
        options.addOption(new Option("a", false, "Flag A"));

        CommandLine cmd = parser.parse(options, new String[]{"-a", "--", "-b", "--other"});
        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertEquals(2, cmd.getArgs().length);
        Assert.assertEquals("-b", cmd.getArgs()[0]);
        Assert.assertEquals("--other", cmd.getArgs()[1]);
    }

    @Test
    public void parse_givenNegativeNumberForOptionAcceptingArg_shouldTreatAsValue() throws Exception {
        options.addOption(new Option("n", true, "Number"));

        CommandLine cmd = parser.parse(options, new String[]{"-n", "-42.5"});
        Assert.assertTrue(cmd.hasOption("n"));
        Assert.assertEquals("-42.5", cmd.getOptionValue("n"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void parse_givenUnknownOptionWithoutStopAtNonOption_shouldThrowUnrecognizedOptionException() throws Exception {
        parser.parse(options, new String[]{"-unknown"});
    }

    @Test
    public void parse_givenUnknownOptionWithStopAtNonOption_shouldStopAndTreatAsArgs() throws Exception {
        options.addOption(new Option("a", false, "Flag A"));

        CommandLine cmd = parser.parse(options, new String[]{"-a", "-unknown", "extra"}, true);
        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertEquals(2, cmd.getArgs().length);
        Assert.assertEquals("-unknown", cmd.getArgs()[0]);
        Assert.assertEquals("extra", cmd.getArgs()[1]);
    }

    @Test
    public void parse_givenNonOptionTokenWithStopAtNonOption_shouldStopAndAddRemainingArgs() throws Exception {
        options.addOption(new Option("a", false, "Flag A"));
        options.addOption(new Option("b", false, "Flag B"));

        CommandLine cmd = parser.parse(options, new String[]{"-a", "filename.txt", "-b"}, true);
        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertFalse(cmd.hasOption("b"));
        Assert.assertEquals(2, cmd.getArgs().length);
        Assert.assertEquals("filename.txt", cmd.getArgs()[0]);
        Assert.assertEquals("-b", cmd.getArgs()[1]);
    }

    @Test(expected = MissingArgumentException.class)
    public void parse_givenOptionMissingRequiredArgAtEnd_shouldThrowMissingArgumentException() throws Exception {
        options.addOption(new Option("f", true, "File"));

        parser.parse(options, new String[]{"-f"});
    }

    @Test(expected = MissingOptionException.class)
    public void parse_givenMissingRequiredOption_shouldThrowMissingOptionException() throws Exception {
        Option req = new Option("r", "required", false, "Required option");
        req.setRequired(true);
        options.addOption(req);

        parser.parse(options, new String[]{});
    }

    @Test
    public void parse_givenPresentRequiredOption_shouldSucceed() throws Exception {
        Option req = new Option("r", "required", false, "Required option");
        req.setRequired(true);
        options.addOption(req);

        CommandLine cmd = parser.parse(options, new String[]{"-r"});
        Assert.assertTrue(cmd.hasOption("r"));
    }

    @Test
    public void parse_givenRequiredOptionGroupSatisfied_shouldSucceed() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option optA = new Option("a", false, "Option A");
        Option optB = new Option("b", false, "Option B");
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertEquals("a", group.getSelected());
    }

    @Test(expected = MissingOptionException.class)
    public void parse_givenRequiredOptionGroupMissing_shouldThrowMissingOptionException() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("a", false, "Option A"));
        group.addOption(new Option("b", false, "Option B"));
        options.addOptionGroup(group);

        parser.parse(options, new String[]{});
    }

    @Test(expected = AlreadySelectedException.class)
    public void parse_givenTwoOptionsFromSameOptionGroup_shouldThrowAlreadySelectedException() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "Option A"));
        group.addOption(new Option("b", false, "Option B"));
        options.addOptionGroup(group);

        parser.parse(options, new String[]{"-a", "-b"});
    }

    @Test
    public void parse_givenConcatenatedFlags_shouldParseAllFlags() throws Exception {
        options.addOption(new Option("a", false, "Option A"));
        options.addOption(new Option("b", false, "Option B"));
        options.addOption(new Option("c", false, "Option C"));

        CommandLine cmd = parser.parse(options, new String[]{"-abc"});
        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertTrue(cmd.hasOption("b"));
        Assert.assertTrue(cmd.hasOption("c"));
    }

    @Test
    public void parse_givenConcatenatedFlagsWithTerminalOptionAcceptingArg_shouldAssignRestAsValue() throws Exception {
        options.addOption(new Option("v", false, "Verbose"));
        options.addOption(new Option("f", true, "File"));

        CommandLine cmd = parser.parse(options, new String[]{"-vffilename.txt"});
        Assert.assertTrue(cmd.hasOption("v"));
        Assert.assertTrue(cmd.hasOption("f"));
        Assert.assertEquals("filename.txt", cmd.getOptionValue("f"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void parse_givenConcatenatedOptionsWithUnknownChar_shouldThrowUnrecognizedOptionException() throws Exception {
        options.addOption(new Option("a", false, "Option A"));

        parser.parse(options, new String[]{"-ax"});
    }

    @Test
    public void parse_givenConcatenatedOptionsWithUnknownCharAndStopAtNonOption_shouldStopAndKeepRemaining() throws Exception {
        options.addOption(new Option("a", false, "Option A"));

        CommandLine cmd = parser.parse(options, new String[]{"-ax", "following"}, true);
        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertEquals(2, cmd.getArgs().length);
        Assert.assertEquals("x", cmd.getArgs()[0]);
        Assert.assertEquals("following", cmd.getArgs()[1]);
    }

    @Test
    public void parse_givenJavaPropertyStyleOptionWithoutEqual_shouldExtractKeyAndValue() throws Exception {
        Option propOpt = new Option("D", true, "Property");
        propOpt.setArgs(2);
        options.addOption(propOpt);

        CommandLine cmd = parser.parse(options, new String[]{"-Dfoo=bar"});
        Assert.assertTrue(cmd.hasOption("D"));
        String[] values = cmd.getOptionValues("D");
        Assert.assertNotNull(values);
        Assert.assertEquals(2, values.length);
        Assert.assertEquals("foo", values[0]);
        Assert.assertEquals("bar", values[1]);
    }

    @Test
    public void parse_givenJavaPropertyStyleOptionWithoutEqualsSign_shouldExtractSingleValue() throws Exception {
        Option propOpt = new Option("D", true, "Property");
        propOpt.setArgs(2);
        options.addOption(propOpt);

        CommandLine cmd = parser.parse(options, new String[]{"-Dkeyonly"});
        Assert.assertTrue(cmd.hasOption("D"));
        Assert.assertEquals("keyonly", cmd.getOptionValue("D"));
    }

    @Test
    public void parse_givenJavaPropertyStyleOptionUnlimitedValues_shouldExtractKeyAndValue() throws Exception {
        Option propOpt = new Option("D", true, "Property");
        propOpt.setArgs(Option.UNLIMITED_VALUES);
        options.addOption(propOpt);

        CommandLine cmd = parser.parse(options, new String[]{"-Dparam=value"});
        Assert.assertTrue(cmd.hasOption("D"));
        String[] values = cmd.getOptionValues("D");
        Assert.assertNotNull(values);
        Assert.assertEquals("param", values[0]);
        Assert.assertEquals("value", values[1]);
    }

    @Test
    public void parse_givenLongPrefixSingleHyphenOptionWithArg_shouldExtractLongPrefixAndValue() throws Exception {
        Option logfile = new Option(null, "logfile", true, "Log file destination");
        options.addOption(logfile);

        CommandLine cmd = parser.parse(options, new String[]{"-logfileaudit.log"});
        Assert.assertTrue(cmd.hasOption("logfile"));
        Assert.assertEquals("audit.log", cmd.getOptionValue("logfile"));
    }

    @Test
    public void parse_givenLongOptionMatchingWithoutLeadingDoubleHyphen_shouldMatchAndProcess() throws Exception {
        Option help = new Option(null, "help", false, "Display help");
        options.addOption(help);

        CommandLine cmd = parser.parse(options, new String[]{"-help"});
        Assert.assertTrue(cmd.hasOption("help"));
    }

    @Test
    public void parse_givenProperties_shouldPopulateCommandLine() throws Exception {
        options.addOption(new Option("a", false, "Flag A"));
        options.addOption(new Option("b", false, "Flag B"));
        options.addOption(new Option("c", false, "Flag C"));
        options.addOption(new Option("d", false, "Flag D"));
        options.addOption(new Option("f", true, "File path"));

        Properties props = new Properties();
        props.setProperty("a", "true");
        props.setProperty("b", "yes");
        props.setProperty("c", "1");
        props.setProperty("d", "false");
        props.setProperty("f", "propfile.txt");

        CommandLine cmd = parser.parse(options, new String[0], props);
        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertTrue(cmd.hasOption("b"));
        Assert.assertTrue(cmd.hasOption("c"));
        Assert.assertFalse(cmd.hasOption("d"));
        Assert.assertTrue(cmd.hasOption("f"));
        Assert.assertEquals("propfile.txt", cmd.getOptionValue("f"));
    }

    @Test
    public void parse_givenCliOptionOverridesProperty_shouldRetainCliValue() throws Exception {
        options.addOption(new Option("f", true, "File path"));

        Properties props = new Properties();
        props.setProperty("f", "fromProps.txt");

        CommandLine cmd = parser.parse(options, new String[]{"-f", "fromCli.txt"}, props);
        Assert.assertTrue(cmd.hasOption("f"));
        Assert.assertEquals("fromCli.txt", cmd.getOptionValue("f"));
    }

    @Test
    public void parse_givenNullProperties_shouldProcessNormallyWithoutException() throws Exception {
        options.addOption(new Option("a", false, "Flag A"));

        CommandLine cmd = parser.parse(options, new String[]{"-a"}, null, false);
        Assert.assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void parse_givenOptionNoArgFollowedByAnotherOption_shouldResetCurrentOption() throws Exception {
        options.addOption(new Option("a", false, "Flag A"));
        options.addOption(new Option("b", true, "Flag B"));

        CommandLine cmd = parser.parse(options, new String[]{"-a", "-b", "val"});
        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertTrue(cmd.hasOption("b"));
        Assert.assertEquals("val", cmd.getOptionValue("b"));
    }

    @Test
    public void parse_givenSingleHyphenTokenInStopAtNonOptionMode_shouldBeRecordedAsArgument() throws Exception {
        CommandLine cmd = parser.parse(options, new String[]{"-"}, true);
        Assert.assertEquals(1, cmd.getArgs().length);
        Assert.assertEquals("-", cmd.getArgs()[0]);
    }
}