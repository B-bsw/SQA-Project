package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.junit.Assert.*;

import java.util.Arrays;

public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();
    }

    @After
    public void tearDown() {
        parser = null;
        options = null;
    }

    @Test
    public void testFlattenWithEmptyArguments() {
        String[] result = parser.flatten(options, new String[]{}, false);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testFlattenWithNullArguments() {
        String[] result = parser.flatten(options, null, false);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testFlattenWithDoubleDashToken() {
        String[] result = parser.flatten(options, new String[]{"--"}, false);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("--", result[0]);
    }

    @Test
    public void testFlattenWithDoubleDashAndEquals() {
        String[] result = parser.flatten(options, new String[]{"--opt=value"}, false);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("--opt", result[0]);
        assertEquals("value", result[1]);
    }

    @Test
    public void testFlattenWithSingleHyphen() {
        String[] result = parser.flatten(options, new String[]{"-"}, false);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("-", result[0]);
    }

    @Test
    public void testFlattenWithValidTwoCharOption() {
        options.addOption("a", false, "option a");
        String[] result = parser.flatten(options, new String[]{"-a"}, false);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("-a", result[0]);
    }

    @Test
    public void testFlattenWithValidTwoCharOptionAndStopAtNonOption() {
        options.addOption("a", false, "option a");
        String[] result = parser.flatten(options, new String[]{"-a", "value"}, true);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("-a", result[0]);
    }

    @Test
    public void testFlattenWithValidMultiCharOption() {
        options.addOption("abc", false, "option abc");
        String[] result = parser.flatten(options, new String[]{"-abc"}, false);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("-abc", result[0]);
    }

    @Test
    public void testFlattenWithBurstTokenWithArgAndRemainingString() {
        options.addOption("b", true, "option b with arg");
        String[] result = parser.flatten(options, new String[]{"-bvalue"}, false);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("-b", result[0]);
        assertEquals("value", result[1]);
    }

    @Test
    public void testFlattenWithBurstTokenNoOptionStopAtNonOption() {
        String[] result = parser.flatten(options, new String[]{"-xyz"}, true);
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals("--", result[0]);
        assertEquals("x", result[1]);
        assertEquals("y", result[2]);
    }

    @Test
    public void testFlattenWithBurstTokenNoOptionNoStopAtNonOption() {
        String[] result = parser.flatten(options, new String[]{"-xyz"}, false);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("-xyz", result[0]);
    }

    @Test
    public void testFlattenWithNonOptionAndStopAtNonOption() {
        String[] result = parser.flatten(options, new String[]{"value"}, true);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("--", result[0]);
        assertEquals("value", result[1]);
    }

    @Test
    public void testFlattenWithNonOptionAndNotStopAtNonOption() {
        String[] result = parser.flatten(options, new String[]{"value"}, false);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("value", result[0]);
    }

    @Test
    public void testFlattenWithMixedOptionsAndArgs() {
        options.addOption("a", false, "option a");
        options.addOption("b", true, "option b");
        String[] input = {"-a", "value", "-b", "bvalue"};
        String[] result = parser.flatten(options, input, false);
        assertNotNull(result);
        assertEquals(4, result.length);
        assertEquals("-a", result[0]);
        assertEquals("value", result[1]);
        assertEquals("-b", result[2]);
        assertEquals("bvalue", result[3]);
    }

    @Test
    public void testFlattenWithSingleHyphenAndValue() {
        String[] input = {"-", "value"};
        String[] result = parser.flatten(options, input, false);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("-", result[0]);
        assertEquals("value", result[1]);
    }

    @Test
    public void testFlattenWithArgOptionAndEquals() {
        options.addOption("c", true, "option c");
        String[] input = {"--c=value"};
        String[] result = parser.flatten(options, input, false);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("--c", result[0]);
        assertEquals("value", result[1]);
    }

    @Test
    public void testFlattenWithArgOptionAndNoEquals() {
        options.addOption("d", true, "option d");
        String[] input = {"--d", "value"};
        String[] result = parser.flatten(options, input, false);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("--d", result[0]);
        assertEquals("value", result[1]);
    }

    @Test
    public void testFlattenWithStopAtNonOptionAndBurstToken() {
        options.addOption("a", false, "option a");
        String[] input = {"-abc", "value"};
        String[] result = parser.flatten(options, input, true);
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals("-a", result[0]);
        assertEquals("--", result[1]);
        assertEquals("bc", result[2]);
    }

    @Test
    public void testFlattenWithArgOptionAndBurst() {
        options.addOption("e", true, "option e");
        String[] input = {"-evalue"};
        String[] result = parser.flatten(options, input, false);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("-e", result[0]);
        assertEquals("value", result[1]);
    }

    @Test
    public void testFlattenWithArgOptionAndBurstWithStopAtNonOption() {
        options.addOption("e", true, "option e");
        String[] input = {"-evalue", "extra"};
        String[] result = parser.flatten(options, input, true);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("-e", result[0]);
        assertEquals("value", result[1]);
    }

    @Test
    public void testFlattenWithMultipleUnknownOptions() {
        String[] input = {"-x", "-y", "-z"};
        String[] result = parser.flatten(options, input, false);
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals("-x", result[0]);
        assertEquals("-y", result[1]);
        assertEquals("-z", result[2]);
    }

    @Test
    public void testFlattenWithKnownOptionThenUnknownOption() {
        options.addOption("a", false, "option a");
        String[] input = {"-a", "-x", "value"};
        String[] result = parser.flatten(options, input, false);
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-x", result[1]);
        assertEquals("value", result[2]);
    }

    @Test
    public void testFlattenWithSingleCharOptionAndArgWithHasArg() {
        options.addOption("f", true, "option f");
        String[] input = {"-f", "argval"};
        String[] result = parser.flatten(options, input, false);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("-f", result[0]);
        assertEquals("argval", result[1]);
    }

    @Test
    public void testFlattenWithSingleCharOptionNoArg() {
        options.addOption("g", false, "option g");
        String[] input = {"-g"};
        String[] result = parser.flatten(options, input, false);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("-g", result[0]);
    }

    @Test
    public void testFlattenWithTokenStartingWithDoubleDashButNotOption() {
        String[] input = {"--unknown"};
        String[] result = parser.flatten(options, input, false);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("--unknown", result[0]);
    }

    @Test
    public void testFlattenWithEqualsInDoubleDashToken() {
        String[] input = {"--opt=val=ue"};
        String[] result = parser.flatten(options, input, false);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("--opt", result[0]);
        assertEquals("val=ue", result[1]);
    }
}