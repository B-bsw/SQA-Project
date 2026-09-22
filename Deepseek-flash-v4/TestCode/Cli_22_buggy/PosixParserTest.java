package org.apache.commons.cli;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PosixParserTest {

    private PosixParser parser = new PosixParser();
    private Options options;

    private void setUpOptions() {
        options = new Options();
        options.addOption("a", false, "no arg");
        options.addOption("b", true, "with arg");
        options.addOption("c", false, "no arg");
    }

    @Test
    public void testFlattenWithSingleHyphen() {
        setUpOptions();
        String[] args = new String[]{"-"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-"}, result);
    }

    @Test
    public void testFlattenWithDoubleDash() {
        setUpOptions();
        String[] args = new String[]{"--", "value"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--", "value"}, result);
    }

    @Test
    public void testFlattenWithLongOption() {
        setUpOptions();
        String[] args = new String[]{"--foo"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--foo"}, result);
    }

    @Test
    public void testFlattenWithLongOptionWithEquals() {
        setUpOptions();
        options.addOption("foo", true, "foo option");
        String[] args = new String[]{"--foo=bar"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--foo", "bar"}, result);
    }

    @Test
    public void testFlattenWithShortOption() {
        setUpOptions();
        String[] args = new String[]{"-a"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a"}, result);
    }

    @Test
    public void testFlattenWithBurstOption() {
        setUpOptions();
        String[] args = new String[]{"-ab"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b"}, result);
    }

    @Test
    public void testFlattenWithBurstOptionWithArg() {
        setUpOptions();
        String[] args = new String[]{"-bbar"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-b", "bar"}, result);
    }

    @Test
    public void testFlattenWithBurstOptionWithArgInMiddle() {
        setUpOptions();
        options.addOption("d", true, "with arg");
        String[] args = new String[]{"-abxyz"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "xyz"}, result);
    }

    @Test
    public void testFlattenWithStopAtNonOption() {
        setUpOptions();
        String[] args = new String[]{"-a", "value", "-b"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "--", "value", "-b"}, result);
    }

    @Test
    public void testFlattenWithStopAtNonOptionAndBurst() {
        setUpOptions();
        String[] args = new String[]{"-az", "value"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "--", "z", "value"}, result);
    }

    @Test
    public void testFlattenWithNonOptionToken() {
        setUpOptions();
        String[] args = new String[]{"value"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"value"}, result);
    }

    @Test
    public void testFlattenWithNonOptionTokenStopAtNonOption() {
        setUpOptions();
        String[] args = new String[]{"value", "-a"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "value", "-a"}, result);
    }

    @Test
    public void testFlattenWithUnknownShortOption() {
        setUpOptions();
        String[] args = new String[]{"-x"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-x"}, result);
    }

    @Test
    public void testFlattenWithUnknownShortOptionStopAtNonOption() {
        setUpOptions();
        String[] args = new String[]{"-x"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "-x"}, result);
    }

    @Test
    public void testFlattenWithMixedArgs() {
        setUpOptions();
        String[] args = new String[]{"-a", "--foo", "-b", "arg", "value"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "--foo", "-b", "arg", "value"}, result);
    }

    @Test
    public void testFlattenWithStopAtNonOptionAndDoubleDash() {
        setUpOptions();
        String[] args = new String[]{"-a", "--", "-b"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "--", "-b"}, result);
    }

    @Test
    public void testFlattenWithEmptyArgs() {
        setUpOptions();
        String[] args = new String[]{};
        String[] result = parser.flatten(options, args, false);
        assertEquals(0, result.length);
    }

    @Test
    public void testBurstTokenWithOptionAndStopAtNonOption() {
        setUpOptions();
        String[] args = new String[]{"-abc"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "-b", "c"}, result);
    }

    @Test
    public void testBurstTokenWithoutOptionAndStopAtNonOption() {
        setUpOptions();
        String[] args = new String[]{"-xz"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "-xz"}, result);
    }

    @Test
    public void testBurstTokenWithoutOptionAndNoStopAtNonOption() {
        setUpOptions();
        String[] args = new String[]{"-xz"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-xz"}, result);
    }

    @Test
    public void testFlattenWithNullArgument() {
        setUpOptions();
        try {
            parser.flatten(options, null, false);
            fail("Should have thrown NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testFlattenWithNullOptions() {
        String[] args = new String[]{"-a"};
        try {
            parser.flatten(null, args, false);
            fail("Should have thrown NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testFlattenWithLongOptionThatHasOption() {
        options = new Options();
        options.addOption("foo", false, "no arg");
        String[] args = new String[]{"--foo"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--foo"}, result);
    }

    @Test
    public void testFlattenWithLongOptionThatHasArg() {
        options = new Options();
        options.addOption("foo", true, "with arg");
        String[] args = new String[]{"--foo=bar"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--foo", "bar"}, result);
    }

    @Test
    public void testProcessNonOptionToken() throws Exception {
        setUpOptions();
        String[] args = new String[]{"-a", "value"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "--", "value"}, result);
    }

    @Test
    public void testGobbleWithEatTheRest() {
        setUpOptions();
        String[] args = new String[]{"-a", "value", "more"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "--", "value", "more"}, result);
    }

    @Test
    public void testGobbleWithoutEatTheRest() {
        setUpOptions();
        String[] args = new String[]{"value", "more"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"value", "more"}, result);
    }

    @Test
    public void testBurstTokenWithOptionAndRemainingChars() {
        setUpOptions();
        options.addOption("d", true, "with arg");
        String[] args = new String[]{"-abd"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "d"}, result);
    }

    @Test
    public void testBurstTokenWithOptionAndNoRemainingChars() {
        setUpOptions();
        String[] args = new String[]{"-ab"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b"}, result);
    }

    @Test
    public void testBurstTokenWithStopAtNonOptionAndUnknownOption() {
        setUpOptions();
        String[] args = new String[]{"-ax"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "x"}, result);
    }

    @Test
    public void testBurstTokenWithStopAtNonOptionAndUnknownOptionAtStart() {
        setUpOptions();
        String[] args = new String[]{"-xa"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "-xa"}, result);
    }

    @Test
    public void testFlattenWithMultipleOptions() {
        setUpOptions();
        String[] args = new String[]{"-abc"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "-c"}, result);
    }

    @Test
    public void testFlattenWithOptionThenNonOption() {
        setUpOptions();
        String[] args = new String[]{"-a", "value", "-b"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "value", "-b"}, result);
    }

    @Test
    public void testFlattenWithStopAtNonOptionAndNonOptionAtBeginning() {
        setUpOptions();
        String[] args = new String[]{"value", "-a"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "value", "-a"}, result);
    }

    @Test
    public void testFlattenWithMultipleBurstTokens() {
        setUpOptions();
        String[] args = new String[]{"-abc", "-de"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "-c", "-d", "e"}, result);
    }

    @Test
    public void testFlattenWithMixedLongAndShortOptions() {
        setUpOptions();
        options.addOption("foo", true, "long option");
        String[] args = new String[]{"--foo=bar", "-a", "-baz"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--foo", "bar", "-a", "-b", "az"}, result);
    }

    @Test
    public void testFlattenWithNullTokenInArray() {
        setUpOptions();
        String[] args = new String[]{"-a", null, "-b"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", null, "-b"}, result);
    }

    @Test
    public void testFlattenWithDoubleDashAndStopAtNonOption() {
        setUpOptions();
        String[] args = new String[]{"--", "-a"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "-a"}, result);
    }
}