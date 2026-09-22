package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option with arg");
        options.addOption("c", false, "C option");
    }

    @Test
    public void testFlattenWithSingleShortOptions() {
        String[] args = {"-a", "-b", "value", "nonOption"};
        String[] result = parser.flatten(options, args, false);
        assertEquals(4, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-b", result[1]);
        assertEquals("value", result[2]);
        assertEquals("nonOption", result[3]);
    }

    @Test
    public void testFlattenWithCombinedShortOptions() {
        String[] args = {"-ac"};
        String[] result = parser.flatten(options, args, false);
        assertEquals(2, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-c", result[1]);
    }

    @Test
    public void testFlattenWithOptionHavingArgumentInSameToken() {
        String[] args = {"-bvalue"};
        String[] result = parser.flatten(options, args, false);
        assertEquals(2, result.length);
        assertEquals("-b", result[0]);
        assertEquals("value", result[1]);
    }

    @Test
    public void testFlattenWithLongOptions() {
        String[] args = {"--alpha", "--beta=value"};
        String[] result = parser.flatten(options, args, false);
        assertEquals(3, result.length);
        assertEquals("--alpha", result[0]);
        assertEquals("--beta", result[1]);
        assertEquals("value", result[2]);
    }

    @Test
    public void testFlattenWithDoubleDash() {
        String[] args = {"--", "-a"};
        String[] result = parser.flatten(options, args, false);
        assertEquals(2, result.length);
        assertEquals("--", result[0]);
        assertEquals("-a", result[1]);
    }

    @Test
    public void testFlattenWithSingleHyphen() {
        String[] args = {"-"};
        String[] result = parser.flatten(options, args, false);
        assertEquals(1, result.length);
        assertEquals("-", result[0]);
    }

    @Test
    public void testFlattenWithNonOptionStopsAtNonOption() {
        String[] args = {"-a", "nonOption", "-c"};
        String[] result = parser.flatten(options, args, true);
        assertEquals(3, result.length);
        assertEquals("-a", result[0]);
        assertEquals("nonOption", result[1]);
        assertEquals("-c", result[2]);
    }

    @Test
    public void testFlattenWithOptionThatHasArgAndRemainingChars() {
        String[] args = {"-barg"};
        String[] result = parser.flatten(options, args, false);
        assertEquals(2, result.length);
        assertEquals("-b", result[0]);
        assertEquals("arg", result[1]);
    }

    @Test
    public void testFlattenWhenOptionNotExistAndStopsAtNonOption() {
        String[] args = {"-z", "value"};
        String[] result = parser.flatten(options, args, true);
        assertEquals(2, result.length);
        assertEquals("--", result[0]);
        assertEquals("value", result[1]);
    }

    @Test
    public void testInitialize(): void {
        // Directly test private init through reflection or testing flatten with multiple calls
        String[] args1 = {"-a"};
        parser.flatten(options, args1, false);
        String[] result2 = parser.flatten(options, new String[]{"-c"}, false);
        assertEquals(1, result2.length);
        assertEquals("-c", result2[0]);
        // Ensure tokens are cleared between calls 
        assertEquals(1, result2.length);
    }

    @Test
    public void testFlattenWithEmptyArguments() {
        String[] args = {};
        String[] result = parser.flatten(options, args, false);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testOptionWithArgs() {
        options.addOption("e", "extended", true, "Extended option");
        options.getOption("e").setArgs(3);
        String[] args = {"-e", "val1", "val2", "val3"};
        // Note: flatten will just add tokens; actual parsing is handled by Parser
        String[] result = parser.flatten(options, args, false);
        assertEquals(4, result.length);
        assertEquals("-e", result[0]);
        assertEquals("val1", result[1]);
        assertEquals("val2", result[2]);
        assertEquals("val3", result[3]);
    }

    @Test
    public void testMultipleTokensWithOptionArguments() {
        String[] args = {"-b", "arg1", "arg2", "arg3"};
        String[] result = parser.flatten(options, args, false);
        assertEquals(4, result.length);
        assertEquals("-b", result[0]);
        assertEquals("arg1", result[1]);
        assertEquals("arg2", result[2]);
        assertEquals("arg3", result[3]);
    }

    @Test
    public void testNonOptionTokenNotStartingWithDash() {
        String[] args = {"hello", "-a"};
        String[] result = parser.flatten(options, args, false);
        assertEquals(3, result.length);
        assertEquals("hello", result[0]);
        assertEquals("-a", result[1]);
        assertEquals("--", result[2]); // process adds "--" for non-option with eatTheRest
    }

    @Test
    public void testStopAtNonOptionWithNonOptionFirst() {
        String[] args = {"hello", "-a"};
        String[] result = parser.flatten(options, args, true);
        assertEquals(2, result.length);
        assertEquals("hello", result[0]);
        assertEquals("-a", result[1]);
    }

    @Test
    public void testGobbleAfterNonOptionWithArgument() {
        String[] args = {"-a", "-b", "value", "var1", "var2"};
        // Testing eatTheRest logic after -a processes and sets eatTheRest
        String[] result = parser.flatten(options, args, false);
        assertEquals(6, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-b", result[1]);
        assertEquals("value", result[2]);
        assertEquals("var1", result[3]);
        assertEquals("var2", result[4]);
        assertEquals("--", result[5]);
    }

    @Test
    public void testLongOptionExactMatch() {
        String[] args = {"--alpha"};
        String[] result = parser.flatten(options, args, false);
        assertEquals(1, result.length);
        assertEquals("--alpha", result[0]);
    }

    @Test
    public void testTokenWithEqualsButNoOption() {
        String[] args = {"--=value"};
        String[] result = parser.flatten(options, args, false);
        assertEquals(2, result.length);
        assertEquals("--", result[0]);
        assertEquals("value", result[1]);
    }

    @Test
    public void testNullArgumentsArray() {
        // Should handle gracefully, but not explicitly handled in code; let's test behavior
        try {
            String[] result = parser.flatten(options, null, false);
            // If no exception, then possibly empty
            assertNull(result);
        } catch (NullPointerException e) {
            // Expected behavior
        }
    }
}