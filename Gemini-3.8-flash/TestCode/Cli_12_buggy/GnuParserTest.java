package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class GnuParserTest {

    private GnuParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new GnuParser();
        options = new Options();
        options.addOption("a", false, "simple option a");
        options.addOption("b", false, "simple option b");
        options.addOption("foo", false, "long option foo");
    }

    @Test
    public void flatten_givenEmptyArguments_shouldReturnEmptyArray() {
        // Arrange
        String[] arguments = new String[0];

        // Act
        String[] result = parser.flatten(options, arguments, false);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void flatten_givenDoubleHyphenOnly_shouldReturnDoubleHyphen() {
        // Arrange
        String[] arguments = new String[]{"--"};

        // Act
        String[] result = parser.flatten(options, arguments, false);

        // Assert
        Assert.assertArrayEquals(new String[]{"--"}, result);
    }

    @Test
    public void flatten_givenDoubleHyphenWithSubsequentArgs_shouldEatTheRest() {
        // Arrange
        String[] arguments = new String[]{"--", "arg1", "-unknown", "--another"};

        // Act
        String[] result = parser.flatten(options, arguments, false);

        // Assert
        String[] expected = new String[]{"--", "arg1", "-unknown", "--another"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenSingleHyphen_shouldPreserveSingleHyphen() {
        // Arrange
        String[] arguments = new String[]{"-", "file.txt"};

        // Act
        String[] result = parser.flatten(options, arguments, false);

        // Assert
        String[] expected = new String[]{"-", "file.txt"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenKnownShortOption_shouldPreserveOption() {
        // Arrange
        String[] arguments = new String[]{"-a", "-b"};

        // Act
        String[] result = parser.flatten(options, arguments, false);

        // Assert
        String[] expected = new String[]{"-a", "-b"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenKnownLongOption_shouldPreserveOption() {
        // Arrange
        String[] arguments = new String[]{"--foo"};

        // Act
        String[] result = parser.flatten(options, arguments, false);

        // Assert
        String[] expected = new String[]{"--foo"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenSpecialPropertyOption_shouldSplitIntoPrefixAndValue() {
        // Arrange
        Options customOptions = new Options() {
            public boolean hasOption(String opt) {
                if ("-D".equals(opt)) {
                    return true;
                }
                return super.hasOption(opt);
            }
        };
        String[] arguments = new String[]{"-Dproperty=value"};

        // Act
        String[] result = parser.flatten(customOptions, arguments, false);

        // Assert
        String[] expected = new String[]{"-D", "property=value"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenSpecialPropertyOptionWithEmptyValue_shouldSplitIntoPrefixAndEmptyString() {
        // Arrange
        Options customOptions = new Options() {
            public boolean hasOption(String opt) {
                if ("-D".equals(opt)) {
                    return true;
                }
                return super.hasOption(opt);
            }
        };
        String[] arguments = new String[]{"-D"};

        // Act
        String[] result = parser.flatten(customOptions, arguments, false);

        // Assert
        String[] expected = new String[]{"-D", ""};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenUnknownOptionAndStopAtNonOptionTrue_shouldEatTheRest() {
        // Arrange
        String[] arguments = new String[]{"-unknown", "remaining1", "--foo"};

        // Act
        String[] result = parser.flatten(options, arguments, true);

        // Assert
        String[] expected = new String[]{"-unknown", "remaining1", "--foo"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenUnknownOptionAndStopAtNonOptionFalse_shouldNotEatTheRest() {
        // Arrange
        String[] arguments = new String[]{"-unknown", "regularArg", "-a"};

        // Act
        String[] result = parser.flatten(options, arguments, false);

        // Assert
        String[] expected = new String[]{"-unknown", "regularArg", "-a"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void flatten_givenNonOptionArguments_shouldPreserveTokens() {
        // Arrange
        String[] arguments = new String[]{"arg1", "arg2", "arg3"};

        // Act
        String[] result = parser