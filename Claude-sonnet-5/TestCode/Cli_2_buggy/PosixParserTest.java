package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PosixParserTest {

    private Options options;
    private PosixParser parser;

    @Before
    public void setUp() throws Exception {
        options = new Options();
        options.addOption(new Option("a", "aOpt no arg"));
        options.addOption(new Option("b", true, "bOpt requires arg"));
        options.addOption(new Option("c", "cOpt no arg"));
        options.addOption(new Option("ab", "abOpt composite long single-hyphen"));
        parser = new PosixParser();
    }

    @Test
    public void testConstructor() {
        PosixParser p = new PosixParser();
        assertNotNull(p);
    }

    @Test
    public void testFlattenLongOptionWithEquals() {
        String[] args = new String[] { "--foo=bar" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--foo", "bar" }, result);
    }

    @Test
    public void testFlattenLongOptionWithoutEquals() {
        String[] args = new String[] { "--foo" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--foo" }, result);
    }

    @Test
    public void testFlattenDoubleDashAlone() {
        String[] args = new String[] { "--" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--" }, result);
    }

    @Test
    public void testFlattenSingleHyphen() {
        String[] args = new String[] { "-" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-" }, result);
    }

    @Test
    public void testFlattenTwoCharValidOption() {
        String[] args = new String[] { "-a" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a" }, result);
    }

    @Test
    public void testFlattenTwoCharInvalidOption_StopAtNonOptionTrue() {
        String[] args = new String[] { "-x", "rest1", "rest2" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "rest1", "rest2" }, result);
    }

    @Test
    public void testFlattenTwoCharInvalidOption_StopAtNonOptionFalse() {
        String[] args = new String[] { "-x" };
        String[] result = parser.flatten(options, args, false);
        assertEquals(0, result.length);
    }

    @Test
    public void testFlattenMultiCharExactOptionMatch() {
        String[] args = new String[] { "-ab" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-ab" }, result);
    }

    @Test
    public void testFlattenBurstWithArgOption() {
        // 'b' requires an arg, 'a' after it is the value
        String[] args = new String[] { "-ba" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-b", "a" }, result);
    }

    @Test
    public void testFlattenBurstMultipleNoArgOptions() {
        // 'a' and 'c' both exist and do not have args, "-ac" is not itself a
        // registered option so it must be burst
        String[] args = new String[] { "-ac" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a", "-c" }, result);
    }

    @Test
    public void testFlattenBurstNonExistOption_StopAtNonOptionTrue() {
        // 'a' exists, 'd' does not; stopAtNonOption true triggers eatTheRest
        String[] args = new String[] { "-ad", "extra" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "-a", "--", "d", "extra" }, result);
    }

    @Test
    public void testFlattenBurstNonExistOption_StopAtNonOptionFalse() {
        String[] args = new String[] { "-ad" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a", "-d" }, result);
    }

    @Test
    public void testFlattenBurstNonExistFirstChar_StopAtNonOptionTrue_NoBreakContinuation() {
        // 'd' does not exist and is the first char burst -> triggers process()
        // with currentOption == null, then loop continues (no break) to 'a'
        String[] args = new String[] { "-da", "extra" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "--", "da", "-a", "extra" }, result);
    }

    @Test
    public void testFlattenNonOptionToken_StopAtNonOptionTrue() {
        String[] args = new String[] { "positional", "extra" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "--", "positional", "extra" }, result);
    }

    @Test
    public void testFlattenNonOptionToken_StopAtNonOptionFalse() {
        String[] args = new String[] { "positional" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "positional" }, result);
    }

    @Test
    public void testFlattenEmptyArguments() {
        String[] args = new String[] {};
        String[] result = parser.flatten(options, args, false);
        assertEquals(0, result.length);
    }

    @Test(expected = NullPointerException.class)
    public void testFlattenNullTokenThrowsNPE() {
        String[] args = new String[] { null };
        parser.flatten(options, args, false);
    }

    @Test
    public void testFlattenProcessWithCurrentOptionHasArg() {
        // 'b' has arg; when stopAtNonOption is true and a following non-option
        // token appears, process() is invoked with currentOption having hasArg() true
        String[] args = new String[] { "-b", "value1" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "-b", "value1" }, result);
    }

    @Test
    public void testParseSimpleOption() throws Exception {
        Options opts = new Options();
        opts.addOption(new Option("a", "aOpt"));
        CommandLine cl = parser.parse(opts, new String[] { "-a" });
        assertTrue(cl.hasOption("a"));
    }

    @Test(expected = ParseException.class)
    public void testParseMissingRequiredOption() throws Exception {
        Options opts = new Options();
        Option req = new Option("r", "required option");
        req.setRequired(true);
        opts.addOption(req);
        parser.parse(opts, new String[] {});
    }
}