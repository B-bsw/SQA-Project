package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

    @Test
    public void flatten_givenDoubleHyphenTokenWithoutEqual_shouldKeepToken() {
        // Arrange
        options.addOption("verbose", false, "Verbose output");
        String[] args = new String[] { "--verbose" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] { "--verbose" }, result);
    }

    @Test
    public void flatten_givenDoubleHyphenTokenWithEqual_shouldSplitOptionAndValue() {
        // Arrange
        options.addOption("foo", true, "Option with value");
        String[] args = new String[] { "--foo=bar" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] { "--foo", "bar" }, result);
    }

    @Test
    public void flatten_givenDoubleHyphenTokenWithEmptyValue_shouldSplitWithEmptyString() {
        // Arrange
        options.addOption("foo", true, "Option with value");
        String[] args = new String[] { "--foo=" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] { "--foo", "" }, result);
    }

    @Test
    public void flatten_givenOnlyDoubleHyphenDelimiter_shouldPreserveDelimiter() {
        // Arrange
        String[] args = new String[] { "--", "param1", "param2" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] { "--", "param1", "param2" }, result);
    }

    @Test
    public void flatten_givenSingleHyphenToken_shouldPreserveSingleHyphen() {
        // Arrange
        String[] args = new String[] { "-" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] { "-" }, result);
    }

    @Test
    public void flatten_givenSingleHyphenTokenMixedWithArguments_shouldPreserveAll() {
        // Arrange
        String[] args = new String[] { "arg1", "-", "arg2" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] { "arg1", "-", "arg2" }, result);
    }

    @Test
    public void flatten_givenValidTwoCharOption_shouldAddOption() {
        // Arrange
        options.addOption("a", false, "Option a");
        String[] args = new String[] { "-a" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] { "-a" }, result);
    }

    @Test
    public void flatten_givenInvalidTwoCharOptionAndStopAtNonOptionFalse_shouldIgnoreToken() {
        // Arrange
        String[] args = new String[] { "-x", "remaining" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert: -x is not in options, so ignored; remaining is added
        Assert.assertArrayEquals(new String[] { "remaining" }, result);
    }

    @Test
    public void flatten_givenInvalidTwoCharOptionAndStopAtNonOptionTrue_shouldGobbleRest() {
        // Arrange
        String[] args = new String[] { "-x", "file1.txt", "file2.txt" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert: -x sets eatTheRest, remaining tokens gobbled
        Assert.assertArrayEquals(new String[] { "file1.txt", "file2.txt" }, result);
    }

    @Test
    public void flatten_givenLongOptionMatchingFullToken_shouldAddTokenDirectly() {
        // Arrange
        options.addOption("opt", false, "Three letter option");
        String[] args = new String[] { "-opt" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] { "-opt" }, result);
    }

    @Test
    public void flatten_givenClusteredShortOptionsWithoutArgs_shouldBurstAll() {
        // Arrange
        options.addOption("a", false, "Option a");
        options.addOption("b", false, "Option b");
        options.addOption("c", false, "Option c");
        String[] args = new String[] { "-abc" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] { "-a", "-b", "-c" }, result);
    }

    @Test
    public void flatten_givenClusteredShortOptionsWithAttachedArgument_shouldBurstOptionAndArgument() {
        // Arrange
        options.addOption("f", true, "File option");
        String[] args = new String[] { "-ffoo.txt" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert: -f followed by remainder "foo.txt"
        Assert.assertArrayEquals(new String[] { "-f", "foo.txt" }, result);
    }

    @Test
    public void flatten_givenClusteredOptionWithArgAtEnd_shouldBurstPrefixAndOption() {
        // Arrange
        options.addOption("a", false, "Option a");
        options.addOption("f", true, "File option");
        String[] args = new String[] { "-af", "foo.txt" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert: -a then -f, file argument remains as next token
        Assert.assertArrayEquals(new String[] { "-a", "-f", "foo.txt" }, result);
    }

    @Test
    public void flatten_givenBurstTokenWithUnknownCharAndStopAtNonOptionFalse_shouldAddFullTokenAndBreak() {
        // Arrange
        options.addOption("a", false, "Option a");
        String[] args = new String[] { "-az" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert: -a is parsed, then 'z' unknown -> full token "-az" added
        Assert.assertArrayEquals(new String[] { "-a", "-az" }, result);
    }

    @Test
    public void flatten_givenBurstTokenWithUnknownCharAndStopAtNonOptionTrueWithNoCurrentOptionArg_shouldProcessRemaining() {
        // Arrange
        options.addOption("a", false, "Option a");
        String[] args = new String[] { "-az", "extra" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert: -a processed, then 'z' unknown triggers process("z") -> "--", "z", then gobbles "extra"
        Assert.assertArrayEquals(new String[] { "-a", "--", "z", "extra" }, result);
    }

    @Test
    public void flatten_givenBurstTokenUnknownFirstCharAndStopAtNonOptionTrue_shouldProcessRemaining() {
        // Arrange
        String[] args = new String[] { "-zx", "tail" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert: 'z' unknown, process("zx") -> "--", "zx", gobbles "tail"
        Assert.assertArrayEquals(new String[] { "--", "zx", "tail" }, result);
    }

    @Test
    public void flatten_givenNonOptionTokenWhenStopAtNonOptionFalse_shouldAddTokenDirectly() {
        // Arrange
        String[] args = new String[] { "file1", "file2" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] { "file1", "file2" }, result);
    }

    @Test
    public void flatten_givenNonOptionTokenWhenStopAtNonOptionTrueAndNoCurrentOption_shouldAddDoubleHyphenAndGobble() {
        // Arrange
        String[] args = new String[] { "arg1", "arg2" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert: no currentOption, so adds "--", "arg1", then gobbles "arg2"
        Assert.assertArrayEquals(new String[] { "--", "arg1", "arg2" }, result);
    }

    @Test
    public void flatten_givenOptionExpectingArgFollowedByArgumentWhenStopAtNonOptionTrue_shouldConsumeArgAndContinue() {
        // Arrange
        options.addOption("b", true, "Option with arg");
        options.addOption("c", false, "Flag option");
        String[] args = new String[] { "-b", "valueB", "-c" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert: -b sets currentOption (hasArg=true), valueB satisfies it, currentOption becomes null, -c continues
        Assert.assertArrayEquals(new String[] { "-b", "valueB", "-c" }, result);
    }

    @Test
    public void flatten_givenOptionExpectingArgThenNextNonOptionStops_shouldAddDoubleHyphenForSubsequentNonOption() {
        // Arrange
        options.addOption("b", true, "Option with arg");
        String[] args = new String[] { "-b", "valueB", "extra1", "extra2" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert: -b consumes valueB (currentOption becomes null), extra1 triggers "--", "extra1", gobbles "extra2"
        Assert.assertArrayEquals(new String[] { "-b", "valueB", "--", "extra1", "extra2" }, result);
    }

    @Test
    public void flatten_givenMultipleFlattenCalls_shouldResetInternalStateProperly() {
        // Arrange
        options.addOption("a", false, "Option a");
        String[] firstArgs = new String[] { "stopHere", "leftover" };
        String[] secondArgs = new String[] { "-a" };

        // Act
        String[] firstResult = parser.flatten(options, firstArgs, true);
        String[] secondResult = parser.flatten(options, secondArgs, false);

        // Assert
        Assert.assertArrayEquals(new String[] { "--", "stopHere", "leftover" }, firstResult);
        Assert.assertArrayEquals(new String[] { "-a" }, secondResult);
    }

    @Test
    public void flatten_givenOptionTokenFollowedByMultipleArguments_shouldHandleCorrectly() {
        // Arrange
        options.addOption("a", false, "Flag a");
        options.addOption("b", true, "Option b with value");
        String[] args = new String[] { "-a", "--key=val", "-b", "bVal", "nonOpt" };

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] { "-a", "--key", "val", "-b", "bVal", "nonOpt" }, result);
    }

    @Test
    public void flatten_givenSingleHyphenWhenStopAtNonOptionTrue_shouldPreserveSingleHyphen() {
        // Arrange
        String[] args = new String[] { "-" };

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        Assert.assertArrayEquals(new String[] { "-" }, result);
    }

    @Test(expected = NullPointerException.class)
    public void flatten_givenNullArguments_shouldThrowNullPointerException() {
        // Act
        parser.flatten(options, null, false);
    }
}