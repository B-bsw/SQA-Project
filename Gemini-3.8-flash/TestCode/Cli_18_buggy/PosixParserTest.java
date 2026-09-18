package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void flatten_givenDoubleHyphenWithoutEquals_shouldPreserveToken() {
        // Arrange
        String[] args = new String[]{"--verbose", "--"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        assertEquals(2, result.length);
        assertEquals("--verbose", result[0]);
        assertEquals("--", result[1]);
    }

    @Test
    public void flatten_givenDoubleHyphenWithEquals_shouldSplitKeyAndValue() {
        // Arrange
        String[] args = new String[]{"--foo=bar", "--key=value=extra"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        assertEquals(4, result.length);
        assertEquals("--foo", result[0]);
        assertEquals("bar", result[1]);
        assertEquals("--key", result[2]);
        assertEquals("value=extra", result[3]);
    }

    @Test
    public void flatten_givenSingleHyphen_shouldAddSingleHyphenToken() {
        // Arrange
        String[] args = new String[]{"-"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        assertEquals(1, result.length);
        assertEquals("-", result[0]);
    }

    @Test
    public void flatten_givenValidTwoCharOption_shouldAddOption() {
        // Arrange
        options.addOption("a", false, "Option a");
        String[] args = new String[]{"-a"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        assertEquals(1, result.length);
        assertEquals("-a", result[0]);
    }

    @Test
    public void flatten_givenUnrecognizedTwoCharOptionWithStopAtNonOptionTrue_shouldIgnoreAndGobbleRest() {
        // Arrange
        String[] args = new String[]{"-x", "extra1", "extra2"};

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        assertEquals(2, result.length);
        assertEquals("extra1", result[0]);
        assertEquals("extra2", result[1]);
    }

    @Test
    public void flatten_givenUnrecognizedTwoCharOptionWithStopAtNonOptionFalse_shouldIgnoreOption() {
        // Arrange
        String[] args = new String[]{"-x", "arg1"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        assertEquals(1, result.length);
        assertEquals("arg1", result[0]);
    }

    @Test
    public void flatten_givenRecognizedMultiCharOptionStartingWithHyphen_shouldAddTokenDirectly() {
        // Arrange
        options.addOption("foo", false, "Option foo");
        String[] args = new String[]{"-foo"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        assertEquals(1, result.length);
        assertEquals("-foo", result[0]);
    }

    @Test
    public void flatten_givenBurstTokenWithMultipleOptionsWithoutArg_shouldBurstAllOptions() {
        // Arrange
        options.addOption("a", false, "Option a");
        options.addOption("b", false, "Option b");
        options.addOption("c", false, "Option c");
        String[] args = new String[]{"-abc"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        assertEquals(3, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-b", result[1]);
        assertEquals("-c", result[2]);
    }

    @Test
    public void flatten_givenBurstTokenWhereOptionHasArg_shouldBurstAndAddRemainingStringAsArg() {
        // Arrange
        options.addOption("a", false, "Option a");
        options.addOption("f", true, "Option f with file arg");
        String[] args = new String[]{"-afoutput.txt"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        assertEquals(3, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-f", result[1]);
        assertEquals("output.txt", result[2]);
    }

    @Test
    public void flatten_givenBurstTokenUnrecognizedCharWithStopAtNonOptionFalse_shouldAddOriginalToken() {
        // Arrange
        options.addOption("a", false, "Option a");
        String[] args = new String[]{"-az"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        assertEquals(2, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-az", result[1]);
    }

    @Test
    public void flatten_givenBurstTokenUnrecognizedCharWithStopAtNonOptionTrue_shouldProcessAndGobble() {
        // Arrange
        options.addOption("a", false, "Option a");
        String[] args = new String[]{"-az", "remaining1", "remaining2"};

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        assertEquals(5, result.length);
        assertEquals("-a", result[0]);
        assertEquals("--", result[1]);
        assertEquals("z", result[2]);
        assertEquals("remaining1", result[3]);
        assertEquals("remaining2", result[4]);
    }

    @Test
    public void flatten_givenNonOptionTokensWithStopAtNonOptionFalse_shouldPreserveAllTokens() {
        // Arrange
        String[] args = new String[]{"arg1", "arg2", "arg3"};

        // Act
        String[] result = parser.flatten(options, args, false);

        // Assert
        assertEquals(3, result.length);
        assertEquals("arg1", result[0]);
        assertEquals("arg2", result[1]);
        assertEquals("arg3", result[2]);
    }

    @Test
    public void flatten_givenNonOptionTokensWithStopAtNonOptionTrueAndNoCurrentOption_shouldAddHyphensAndGobble() {
        // Arrange
        String[] args = new String[]{"firstNonOption", "secondNonOption"};

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        assertEquals(3, result.length);
        assertEquals("--", result[0]);
        assertEquals("firstNonOption", result[1]);
        assertEquals("secondNonOption", result[2]);
    }

    @Test
    public void flatten_givenOptionWithArgFollowedByArgumentWithStopAtNonOptionTrue_shouldConsumeArgThenStopAtNext() {
        // Arrange
        options.addOption("b", true, "Option b with arg");
        String[] args = new String[]{"-b", "bValue", "extra1", "extra2"};

        // Act
        String[] result = parser.flatten(options, args, true);

        // Assert
        assertEquals(5, result.length);
        assertEquals("-b", result[0]);
        assertEquals("bValue", result[1]);
        assertEquals("--", result[2]);
        assertEquals("extra1", result[3]);
        assertEquals("extra2", result[4]);
    }

    @Test
    public void flatten_givenRepeatedFlattenCalls_shouldResetInternalStateProperly() {
        // Arrange
        options.addOption("a", false, "Option a");
        String[] firstArgs = new String[]{"-a", "stoppedArg", "remaining"};
        String[] secondArgs = new String[]{"-a"};

        // Act
        String[] firstResult = parser.flatten(options, firstArgs, true);
        String[] secondResult = parser.flatten(options, secondArgs, true);

        // Assert
        assertEquals(4, firstResult.length);
        assertEquals("-a", firstResult[0]);
        assertEquals("--", firstResult[1]);
        assertEquals("stoppedArg", firstResult[2]);
        assertEquals("remaining", firstResult[3]);

        assertEquals(1, secondResult.length);
        assertEquals("-a", secondResult[0]);
    }

    @Test(expected = NullPointerException.class)
    public void flatten_givenNullArguments_shouldThrowNullPointerException() {
        // Act
        parser.flatten(options, null, false);
    }
}