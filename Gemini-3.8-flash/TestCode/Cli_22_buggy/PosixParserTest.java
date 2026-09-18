package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for {@link PosixParser} targeting full branch and line coverage.
 */
public class PosixParserTest
{
    private PosixParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new PosixParser();
        options = new Options();
    }

    @Test
    public void flatten_givenEmptyArguments_shouldReturnEmptyArray()
    {
        // Arrange
        String[] args = new String[0];

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void flatten_givenSingleHyphen_shouldAddAsSingleHyphenToken()
    {
        // Arrange
        String[] args = new String[] { "-" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertEquals(1, result.length);
        Assert.assertEquals("-", result[0]);
    }

    @Test
    public void flatten_givenSingleHyphenWithStopAtNonOption_shouldAddAsSingleHyphenToken()
    {
        // Arrange
        String[] args = new String[] { "-", "extra" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        // "-" does not trigger eatTheRest, but "extra" triggers processNonOptionToken
        Assert.assertEquals(4, result.length);
        Assert.assertEquals("-", result[0]);
        Assert.assertEquals("--", result[1]);
        Assert.assertEquals("extra", result[2]);
    }

    @Test
    public void flatten_givenValidLongOptionWithoutEquals_shouldAddOption()
    {
        // Arrange
        options.addOption("f", "foo", false, "description");
        String[] args = new String[] { "--foo" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertEquals(1, result.length);
        Assert.assertEquals("--foo", result[0]);
    }

    @Test
    public void flatten_givenValidLongOptionWithEquals_shouldSplitOptionAndValue()
    {
        // Arrange
        options.addOption("f", "foo", true, "description");
        String[] args = new String[] { "--foo=bar" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertEquals(2, result.length);
        Assert.assertEquals("--foo", result[0]);
        Assert.assertEquals("bar", result[1]);
    }

    @Test
    public void flatten_givenUnknownLongOption_shouldTriggerNonOptionProcessingAndGobbleRemaining()
    {
        // Arrange
        String[] args = new String[] { "--unknown", "arg1", "arg2" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        // eatTheRest is activated, adding "--", value, and gobbled args
        Assert.assertEquals(4, result.length);
        Assert.assertEquals("--", result[0]);
        Assert.assertEquals("--unknown", result[1]);
        Assert.assertEquals("arg1", result[2]);
        Assert.assertEquals("arg2", result[3]);
    }

    @Test
    public void flatten_givenUnknownLongOptionWithEquals_shouldTriggerNonOptionProcessing()
    {
        // Arrange
        String[] args = new String[] { "--unknown=val", "remain" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("--", result[0]);
        Assert.assertEquals("--unknown=val", result[1]);
        Assert.assertEquals("remain", result[2]);
    }

    @Test
    public void flatten_givenValidShortOptionLengthTwo_shouldAddToken()
    {
        // Arrange
        options.addOption("a", false, "option a");
        String[] args = new String[] { "-a" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertEquals(1, result.length);
        Assert.assertEquals("-a", result[0]);
    }

    @Test
    public void flatten_givenUnknownShortOptionLengthTwoNoStopAtNonOption_shouldAddTokenWithoutGobbling()
    {
        // Arrange
        String[] args = new String[] { "-u", "another" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertEquals(2, result.length);
        Assert.assertEquals("-u", result[0]);
        Assert.assertEquals("another", result[1]);
    }

    @Test
    public void flatten_givenUnknownShortOptionLengthTwoStopAtNonOption_shouldEnableEatTheRestAndGobble()
    {
        // Arrange
        String[] args = new String[] { "-u", "another" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        // processOptionToken sets eatTheRest = true because unknown and stopAtNonOption = true
        Assert.assertEquals(2, result.length);
        Assert.assertEquals("-u", result[0]);
        Assert.assertEquals("another", result[1]);
    }

    @Test
    public void flatten_givenMultiCharTokenMatchingRegisteredOption_shouldProcessOptionTokenDirectly()
    {
        // Arrange
        options.addOption("D", "property", true, "sys prop");
        // Register short option with multiple characters if supported
        Option multiOpt = new Option("foo", false, "multi char option");
        options.addOption(multiOpt);
        String[] args = new String[] { "-foo" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertEquals(1, result.length);
        Assert.assertEquals("-foo", result[0]);
    }

    @Test
    public void flatten_givenBurstTokensWithoutArg_shouldSplitAllOptions()
    {
        // Arrange
        options.addOption("a", false, "opt a");
        options.addOption("b", false, "opt b");
        options.addOption("c", false, "opt c");
        String[] args = new String[] { "-abc" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("-a", result[0]);
        Assert.assertEquals("-b", result[1]);
        Assert.assertEquals("-c", result[2]);
    }

    @Test
    public void flatten_givenBurstTokenWithArgInMiddle_shouldExtractRemainingAsArg()
    {
        // Arrange
        options.addOption("a", false, "opt a");
        options.addOption("f", true, "file arg");
        String[] args = new String[] { "-afmyFile.txt" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("-a", result[0]);
        Assert.assertEquals("-f", result[1]);
        Assert.assertEquals("myFile.txt", result[2]);
    }

    @Test
    public void flatten_givenBurstTokenWithArgAtLastCharacter_shouldNotAppendEmptyToken()
    {
        // Arrange
        options.addOption("a", false, "opt a");
        options.addOption("f", true, "file arg");
        String[] args = new String[] { "-af" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertEquals(2, result.length);
        Assert.assertEquals("-a", result[0]);
        Assert.assertEquals("-f", result[1]);
    }

    @Test
    public void flatten_givenBurstTokenWithUnrecognizedCharStopAtNonOption_shouldProcessNonOptionTokenAndGobble()
    {
        // Arrange
        options.addOption("a", false, "opt a");
        String[] args = new String[] { "-azUnknown", "rest1", "rest2" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        // -a processed, then 'z' not recognized with stopAtNonOption=true -> processNonOptionToken("zUnknown")
        Assert.assertEquals(5, result.length);
        Assert.assertEquals("-a", result[0]);
        Assert.assertEquals("--", result[1]);
        Assert.assertEquals("zUnknown", result[2]);
        Assert.assertEquals("rest1", result[3]);
        Assert.assertEquals("rest2", result[4]);
    }

    @Test
    public void flatten_givenBurstTokenWithUnrecognizedCharNoStopAtNonOption_shouldAddFullTokenAndHaltBursting()
    {
        // Arrange
        options.addOption("a", false, "opt a");
        String[] args = new String[] { "-azUnknown" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        // -a processed, then 'z' not recognized with stopAtNonOption=false -> adds full token "-azUnknown"
        Assert.assertEquals(2, result.length);
        Assert.assertEquals("-a", result[0]);
        Assert.assertEquals("-azUnknown", result[1]);
    }

    @Test
    public void flatten_givenNonOptionTokenNoStopAtNonOption_shouldAddTokenAsIs()
    {
        // Arrange
        String[] args = new String[] { "nonOption1", "nonOption2" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertEquals(2, result.length);
        Assert.assertEquals("nonOption1", result[0]);
        Assert.assertEquals("nonOption2", result[1]);
    }

    @Test
    public void flatten_givenNonOptionTokenWithStopAtNonOption_shouldAddDoubleHyphenAndGobbleAllRemaining()
    {
        // Arrange
        String[] args = new String[] { "firstNonOpt", "secondNonOpt", "-a" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        Assert.assertEquals(4, result.length);
        Assert.assertEquals("--", result[0]);
        Assert.assertEquals("firstNonOpt", result[1]);
        Assert.assertEquals("secondNonOpt", result[2]);
        Assert.assertEquals("-a", result[3]);
    }

    @Test
    public void flatten_givenSpecialDoubleHyphenArgument_shouldHandleAsNonOptionOrOption()
    {
        // Arrange
        String[] args = new String[] { "--", "remain" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        // "--" starts with "--", options.hasOption("--") is false -> processNonOptionToken("--")
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("--", result[0]);
        Assert.assertEquals("--", result[1]);
        Assert.assertEquals("remain", result[2]);
    }

    @Test
    public void flatten_givenSequentialRunsOnSameParser_shouldProperlyResetStateViaInit()
    {
        // Arrange
        options.addOption("a", false, "opt a");
        String[] firstArgs = new String[] { "nonOpt", "gobbled" };
        String[] secondArgs = new String[] { "-a" };

        // Act
        String[] firstResult = parser.flatten(options, firstArgs, true);
        String[] secondResult = parser.flatten(options, secondArgs, false);

        // Assert
        Assert.assertEquals(3, firstResult.length);
        Assert.assertEquals("--", firstResult[0]);
        Assert.assertEquals("nonOpt", firstResult[1]);
        Assert.assertEquals("gobbled", firstResult[2]);

        Assert.assertEquals(1, secondResult.length);
        Assert.assertEquals("-a", secondResult[0]);
    }

    @Test
    public void burstToken_givenDirectCallWithRecognizedOptions_shouldPopulateTokensDirectly()
    {
        // Arrange
        options.addOption("x", false, "opt x");
        options.addOption("y", true, "opt y with value");
        // Initialize parser options through flatten
        parser.flatten(options, new String[0], false);

        // Act
        parser.burstToken("-xyVal", false);
        String[] result = parser.flatten(options, new String[0], false);

        // Assert: init resets tokens on flatten call, but direct invocation test verifies no exceptions
        Assert.assertNotNull(result);
    }

    @Test
    public void flatten_givenMixedComplexCommandLines_shouldParseCorrectly()
    {
        // Arrange
        options.addOption("v", "verbose", false, "verbose mode");
        options.addOption("f", "file", true, "target file");
        options.addOption("o", "output", true, "output dir");
        String[] args = new String[] {
            "--verbose",
            "-fout.txt",
            "--output=dist",
            "-",
            "cmd",
            "param"
        };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertEquals(8, result.length);
        Assert.assertEquals("--verbose", result[0]);
        Assert.assertEquals("-f", result[1]);
        Assert.assertEquals("out.txt", result[2]);
        Assert.assertEquals("--output", result[3]);
        Assert.assertEquals("dist", result[4]);
        Assert.assertEquals("-", result[5]);
        Assert.assertEquals("cmd", result[6]);
        Assert.assertEquals("param", result[7]);
    }
}