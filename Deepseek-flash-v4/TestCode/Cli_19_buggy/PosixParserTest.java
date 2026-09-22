package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class PosixParserTest {

    private Options options;
    private PosixParser parser;

    @Before
    public void setUp() {
        options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option with arg");
        options.addOption("c", "charlie", true, "Charlie option with arg, can take multiple");
        options.getOption("c").setArgs(3);
        parser = new PosixParser();
    }

    @Test
    public void testFlattenWithSimpleOptions() {
        String[] args = {"-a", "-b", "value", "plain"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "value", "plain"}, result);
    }

    @Test
    public void testFlattenWithLongOptionsEquals() {
        String[] args = {"--alpha=value1", "--beta=value2"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--alpha", "value1", "--beta", "value2"}, result);
    }

    @Test
    public void testFlattenWithDoubleDashToken() {
        String[] args = {"--", "-a", "-b"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--", "-a", "-b"}, result);
    }

    @Test
    public void testFlattenWithSingleHyphenToken() {
        String[] args = {"-"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-"}, result);
    }

    @Test
    public void testFlattenWithBurstTokenSingleCharOptions() {
        String[] args = {"-abc"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "-c"}, result);
    }

    @Test
    public void testFlattenWithBurstTokenAndArgInSameToken() {
        String[] args = {"-bvalue"};
        String[] result = parser.flatten(options, args, false);
        // options.hasOption("-b") false, so bursting occurs
        // -b has arg, so "value" is added as separate token
        assertArrayEquals(new String[]{"-b", "value"}, result);
    }

    @Test
    public void testFlattenWithStopAtNonOptionTrue() {
        String[] args = {"-a", "plain", "-b", "value"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "--", "plain", "-b", "value"}, result);
    }

    @Test
    public void testFlattenWithUnknownOptionNonStop() {
        String[] args = {"-x", "value"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-x", "value"}, result);
    }

    @Test
    public void testFlattenWithUnknownOptionStopAtNonOption() {
        String[] args = {"-x", "value", "-a"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "-x", "value", "-a"}, result);
    }

    @Test
    public void testFlattenWithMultipleArgOptionAndMoreChars() {
        // -c takes 3 args, test exceeding in token burst
        String[] args = {"-cvalue"};
        // Option 'c' hasArg and remaining "value" added, then break
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-c", "value"}, result);
    }

    @Test
    public void testFlattenWithEmptyArguments() {
        String[] args = {};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{}, result);
    }

    @Test
    public void testFlattenWithNullArguments() {
        try {
            parser.flatten(options, null, false);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testFlattenWithBurstTokenStopAtNonOption() {
        // options has "a","b","c" but not "x"
        String[] args = {"-ax"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "--", "-x"}, result);
    }

    @Test
    public void testFlattenWithBurstTokenNonStopAtNonOption() {
        String[] args = {"-ax"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-x"}, result);
    }

    @Test
    public void testFlattenWithMultipleCharOptionButLongOption() {
        // Test token that matches long option exactly
        String[] args = {"--alpha"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--alpha"}, result);
    }
}