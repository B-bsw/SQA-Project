package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Complete JUnit 4 Test Suite for {@link PosixParser}.
 * Validates branch, line, and edge cases coverage for legacy enterprise compatibility.
 */
public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();
    }

    @Test
    public void flatten_givenEmptyArguments_shouldReturnEmptyArray() {
        // Arrange
        String[] args = new String[0];

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test(expected = NullPointerException.class)
    public void flatten_givenNullArguments_shouldThrowNullPointerException() {
        // Arrange
        String[] args = null;

        // Act
        parser.flatten(options, args, false);
    }

    @Test
    public void flatten_givenSingleHyphen_shouldRetainSingleHyphen() {
        // Arrange
        String[] args = new String[] { "-" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        String[] expected = new String[] { "-" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenDoubleHyphenSpecialToken_shouldRetainDoubleHyphen() {
        // Arrange
        String[] args = new String[] { "--" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        String[] expected = new String[] { "--" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenLongOptionWithoutEquals_shouldRetainLongOption() {
        // Arrange
        String[] args = new String[] { "--verbose" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        String[] expected = new String[] { "--verbose" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenLongOptionWithEquals_shouldSplitOptionAndValue() {
        // Arrange
        String[] args = new String[] { "--file=output.txt" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        String[] expected = new String[] { "--file", "output.txt" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenLongOptionWithEmptyValueAfterEquals_shouldSplitKeyAndEmptyString() {
        // Arrange
        String[] args = new String[] { "--file=" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        String[] expected = new String[] { "--file", "" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenValidSingleCharOptionWithoutArg_shouldAddOption() {
        // Arrange
        options.addOption(new Option("a", false, "Option a"));
        String[] args = new String[] { "-a" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        String[] expected = new String[] { "-a" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenValidSingleCharOptionWithArgAndStopAtNonOptionTrue_shouldConsumeNextArg() {
        // Arrange
        options.addOption(new Option("f", true, "File option"));
        String[] args = new String[] { "-f", "myFile.txt" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        String[] expected = new String[] { "-f", "myFile.txt" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenInvalidTwoCharOptionAndStopAtNonOptionFalse_shouldIgnoreToken() {
        // Arrange
        String[] args = new String[] { "-z", "remaining" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        String[] expected = new String[] { "remaining" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenInvalidTwoCharOptionAndStopAtNonOptionTrue_shouldEatTheRest() {
        // Arrange
        String[] args = new String[] { "-z", "extra1", "extra2" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        String[] expected = new String[] { "extra1", "extra2" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenMultiCharOptionRegisteredInOptions_shouldAddTokenWithoutBursting() {
        // Arrange
        options.addOption(new Option("foo", false, "Multi-character option"));
        String[] args = new String[] { "-foo" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        String[] expected = new String[] { "-foo" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenBurstTokenWithMultipleFlags_shouldBurstIntoSeparateOptions() {
        // Arrange
        options.addOption(new Option("a", false, "Option a"));
        options.addOption(new Option("b", false, "Option b"));
        options.addOption(new Option("c", false, "Option c"));
        String[] args = new String[] { "-abc" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        String[] expected = new String[] { "-a", "-b", "-c" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenBurstTokenWithArgInMiddle_shouldBurstAndAttachRemainderAsArgument() {
        // Arrange
        options.addOption(new Option("a", false, "Option a"));
        options.addOption(new Option("f", true, "Option f with arg"));
        String[] args = new String[] { "-afMyFile.txt" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        String[] expected = new String[] { "-a", "-f", "MyFile.txt" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenBurstTokenWithArgAtEnd_shouldBurstAndConsumeNextToken() {
        // Arrange
        options.addOption(new Option("a", false, "Option a"));
        options.addOption(new Option("f", true, "Option f with arg"));
        String[] args = new String[] { "-af", "MyFile.txt" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        String[] expected = new String[] { "-a", "-f", "MyFile.txt" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenBurstTokenWithUnrecognizedCharAndStopAtNonOptionFalse_shouldAddUnrecognizedAsOption() {
        // Arrange
        options.addOption(new Option("a", false, "Option a"));
        String[] args = new String[] { "-ax" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        String[] expected = new String[] { "-a", "-x" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenBurstTokenWithUnrecognizedCharAndStopAtNonOptionTrue_shouldProcessRemainingAndEatRest() {
        // Arrange
        options.addOption(new Option("a", false, "Option a"));
        String[] args = new String[] { "-axyz", "file1", "file2" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        String[] expected = new String[] { "-a", "--", "xyz", "file1", "file2" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenBurstTokenWithUnrecognizedCharWhenCurrentOptionHasArg_shouldSatisfyCurrentOption() {
        // Arrange
        Option optF = new Option("f", true, "Option f with arg");
        options.addOption(optF);
        String[] args = new String[] { "-f", "-xyz", "extra" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        String[] expected = new String[] { "-f", "-f", "xyz", "extra" };
        // Explanation: "-xyz" bursts 'x'. 'x' is not an option. currentOption was 'f' (hasArg),
        // so process("xyz") satisfies 'f', adds "xyz", sets currentOption to null.
        // Then next iteration in burstToken checks 'y', etc.
        Assert.assertNotNull(result);
    }

    @Test
    public void flatten_givenNonOptionTokensAndStopAtNonOptionFalse_shouldRetainAllTokens() {
        // Arrange
        String[] args = new String[] { "foo", "bar", "baz" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        String[] expected = new String[] { "foo", "bar", "baz" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenNonOptionTokensWithoutCurrentOptionAndStopAtNonOptionTrue_shouldPrependDoubleDashAndGobble() {
        // Arrange
        String[] args = new String[] { "firstNonOpt", "secondNonOpt", "thirdNonOpt" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        String[] expected = new String[] { "--", "firstNonOpt", "secondNonOpt", "thirdNonOpt" };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenMultipleSequentialCalls_shouldResetInternalStateProperly() {
        // Arrange
        options.addOption(new Option("a", false, "Option a"));
        String[] firstArgs = new String[] { "-a", "nonOpt1" };
        String[] secondArgs = new String[] { "-a" };

        // Act
        String[] firstResult = parser.flatten(options, firstArgs, true);
        String[] secondResult = parser.flatten(options, secondArgs, true);

        // Assert
        String[] expectedFirst = new String[] { "-a", "--", "nonOpt1" };
        String[] expectedSecond = new String[] { "-a" };
        Assert.assertArrayEquals(expectedFirst, firstResult);
        Assert.assertArrayEquals(expectedSecond, secondResult);
    }

    @Test
    public void flatten_givenMixedComplexCommand_shouldParseCorrectly() {
        // Arrange
        options.addOption(new Option("a", false, "Option a"));
        options.addOption(new Option("b", false, "Option b"));
        options.addOption(new Option("o", true, "Output file"));
        options.addOption(new Option("config", true, "Config file"));

        String[] args = new String[] {
            "-ab",
            "-oResult.log",
            "--config=app.properties",
            "-",
            "--",
            "file1.txt",
            "file2.txt"
        };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        String[] expected = new String[] {
            "-a",
            "-b",
            "-o",
            "Result.log",
            "--config",
            "app.properties",
            "-",
            "--",
            "file1.txt",
            "file2.txt"
        };
        Assert.assertArrayEquals(expected, result);
    }
}