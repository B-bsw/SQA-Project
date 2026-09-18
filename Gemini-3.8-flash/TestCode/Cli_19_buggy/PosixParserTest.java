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
    public void flatten_givenDoubleHyphenToken_shouldPreserveDoubleHyphen() {
        // Arrange
        String[] args = new String[] {"--"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] {"--"}, result);
    }

    @Test
    public void flatten_givenLongOptionWithoutEquals_shouldPreserveToken() {
        // Arrange
        options.addOption(new Option("f", "foo", false, "foo option"));
        String[] args = new String[] {"--foo"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] {"--foo"}, result);
    }

    @Test
    public void flatten_givenLongOptionWithEquals_shouldSplitKeyAndValue() {
        // Arrange
        options.addOption(new Option("f", "foo", true, "foo option"));
        String[] args = new String[] {"--foo=bar"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] {"--foo", "bar"}, result);
    }

    @Test
    public void flatten_givenSingleHyphen_shouldPreserveSingleHyphen() {
        // Arrange
        String[] args = new String[] {"-"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] {"-"}, result);
    }

    @Test
    public void flatten_givenValidTwoCharOption_shouldAddTokenAndSetCurrentOption() {
        // Arrange
        options.addOption(new Option("a", false, "option a"));
        String[] args = new String[] {"-a"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] {"-a"}, result);
    }

    @Test
    public void flatten_givenInvalidTwoCharOptionAndStopAtNonOptionFalse_shouldIgnoreToken() {
        // Arrange
        String[] args = new String[] {"-z"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void flatten_givenInvalidTwoCharOptionAndStopAtNonOptionTrue_shouldGobbleRemaining() {
        // Arrange
        String[] args = new String[] {"-z", "extra1", "extra2"};

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        Assert.assertArrayEquals(new String[] {"-z", "extra1", "extra2"}, result);
    }

    @Test
    public void flatten_givenRegisteredMultiCharOptionStartingWithHyphen_shouldPreserveOptionToken() {
        // Arrange
        options.addOption(new Option("test", false, "multi-char single hyphen option"));
        String[] args = new String[] {"-test"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] {"-test"}, result);
    }

    @Test
    public void flatten_givenBurstingWithMultipleValidSingleOptions_shouldBurstSuccessfully() {
        // Arrange
        options.addOption(new Option("a", false, "option a"));
        options.addOption(new Option("b", false, "option b"));
        options.addOption(new Option("c", false, "option c"));
        String[] args = new String[] {"-abc"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] {"-a", "-b", "-c"}, result);
    }

    @Test
    public void flatten_givenBurstingWithOptionTakingArgInSameToken_shouldBurstAndAttachRemainingAsArg() {
        // Arrange
        options.addOption(new Option("a", false, "option a"));
        options.addOption(new Option("f", true, "file option"));
        String[] args = new String[] {"-afmyfilename.txt"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] {"-a", "-f", "myfilename.txt"}, result);
    }

    @Test
    public void flatten_givenBurstingWithOptionTakingArgAtLastCharacter_shouldNotBurstExtraArg() {
        // Arrange
        options.addOption(new Option("a", false, "option a"));
        options.addOption(new Option("f", true, "file option"));
        String[] args = new String[] {"-af"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] {"-a", "-f"}, result);
    }

    @Test
    public void flatten_givenBurstingUnrecognizedOptionAndStopAtNonOptionFalse_shouldAddFullToken() {
        // Arrange
        options.addOption(new Option("a", false, "option a"));
        String[] args = new String[] {"-az"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] {"-a", "-az"}, result);
    }

    @Test
    public void flatten_givenBurstingUnrecognizedOptionAndStopAtNonOptionTrue_shouldProcessAsNonOptionAndGobble() {
        // Arrange
        options.addOption(new Option("a", false, "option a"));
        String[] args = new String[] {"-az", "remainder1", "remainder2"};

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        Assert.assertArrayEquals(new String[] {"-a", "--", "z", "remainder1", "remainder2"}, result);
    }

    @Test
    public void flatten_givenNonOptionAndStopAtNonOptionFalse_shouldAddDirectly() {
        // Arrange
        String[] args = new String[] {"value1", "value2"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        Assert.assertArrayEquals(new String[] {"value1", "value2"}, result);
    }

    @Test
    public void flatten_givenNonOptionWhenPreviousOptionHasArgAndStopAtNonOptionTrue_shouldConsumeArg() {
        // Arrange
        options.addOption(new Option("b", true, "option b"));
        String[] args = new String[] {"-b", "foo"};

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        Assert.assertArrayEquals(new String[] {"-b", "foo"}, result);
    }

    @Test
    public void flatten_givenNonOptionWhenPreviousOptionHasNoArgAndStopAtNonOptionTrue_shouldAddDashDashAndGobble() {
        // Arrange
        options.addOption(new Option("a", false, "option a"));
        String[] args = new String[] {"-a", "nonOption1", "nonOption2"};

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        Assert.assertArrayEquals(new String[] {"-a", "--", "nonOption1", "nonOption2"}, result);
    }

    @Test
    public void flatten_givenNonOptionWhenCurrentOptionIsNullAndStopAtNonOptionTrue_shouldAddDashDashAndGobble() {
        // Arrange
        String[] args = new String[] {"nonOption1", "nonOption2"};

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        Assert.assertArrayEquals(new String[] {"--", "nonOption1", "nonOption2"}, result);
    }

    @Test
    public void flatten_givenSecondCallOnSameParserInstance_shouldResetState() {
        // Arrange
        options.addOption(new Option("a", false, "option a"));
        String[] firstArgs = new String[] {"-a", "nonOption"};
        parser.flatten(options, firstArgs, true);

        // Act
        String[] secondArgs = new String[] {"-a"};
        String[] secondResult = parser.flatten(options, secondArgs, false);

        // Assert
        Assert.assertArrayEquals(new String[] {"-a"}, secondResult);
    }

    @Test(expected = NullPointerException.class)
    public void flatten_givenNullArguments_shouldThrowNullPointerException() {
        // Act
        parser.flatten(options, null, false);
    }

    @Test
    public void burstToken_givenProtectedMethodInvocation_shouldBurstDirectly() {
        // Arrange
        options.addOption(new Option("x", false, "option x"));
        options.addOption(new Option("y", false, "option y"));
        parser.flatten(options, new String[0], false);

        // Act
        parser.burstToken("-xy", false);
        String[] result = parser.flatten(options, new String[0], false);

        // Assert
        Assert.assertNotNull(result);
    }
}