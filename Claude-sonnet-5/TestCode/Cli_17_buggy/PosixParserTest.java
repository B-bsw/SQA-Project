package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class PosixParserTest
{
    private Options options;
    private PosixParser parser;

    @Before
    public void setUp()
    {
        options = new Options();
        options.addOption("a", false, "option a - no arg");
        options.addOption("b", true, "option b - has arg");
        options.addOption("c", false, "option c - no arg");
        parser = new PosixParser();
    }

    // ---------- Long option handling ----------

    @Test
    public void testFlattenLongOptionNoEquals()
    {
        String[] args = {"--verbose"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--verbose"}, result);
    }

    @Test
    public void testFlattenLongOptionWithEquals()
    {
        String[] args = {"--file=test.txt"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--file", "test.txt"}, result);
    }

    @Test
    public void testFlattenDoubleHyphenAlone()
    {
        String[] args = {"--"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--"}, result);
    }

    // ---------- Single hyphen handling ----------

    @Test
    public void testFlattenSingleHyphen()
    {
        String[] args = {"-"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-"}, result);
    }

    // ---------- Two character option token handling ----------

    @Test
    public void testFlattenShortOptionExists()
    {
        String[] args = {"-a"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a"}, result);
    }

    @Test
    public void testFlattenShortOptionNotExistsStopAtNonOptionTrue()
    {
        String[] args = {"-x", "remaining"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"remaining"}, result);
    }

    @Test
    public void testFlattenShortOptionNotExistsStopAtNonOptionFalse()
    {
        String[] args = {"-x"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{}, result);
    }

    // ---------- Multi-character token that matches a registered option exactly ----------

    @Test
    public void testFlattenMultiCharOptionExistsAsWhole()
    {
        Options multiOpts = new Options();
        multiOpts.addOption("xyz", false, "multi char option");
        String[] args = {"-xyz"};
        String[] result = parser.flatten(multiOpts, args, false);
        assertArrayEquals(new String[]{"-xyz"}, result);
    }

    // ---------- Bursting behaviour ----------

    @Test
    public void testFlattenBurstTokenWithArgumentAttached()
    {
        String[] args = {"-ab5"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "5"}, result);
    }

    @Test
    public void testFlattenBurstTokenNonOptionStopAtNonOptionTrue()
    {
        String[] args = {"-ax"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "--", "x"}, result);
    }

    @Test
    public void testFlattenBurstTokenNonOptionStopAtNonOptionFalse()
    {
        String[] args = {"-ax"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-ax"}, result);
    }

    // ---------- Non option token handling ----------

    @Test
    public void testFlattenNonOptionTokenStopAtNonOptionTrueNoCurrentOption()
    {
        String[] args = {"data"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "data"}, result);
    }

    @Test
    public void testFlattenNonOptionTokenStopAtNonOptionTrueWithCurrentOptionHavingArg()
    {
        String[] args = {"-b", "data"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-b", "data"}, result);
    }

    @Test
    public void testFlattenNonOptionTokenStopAtNonOptionFalse()
    {
        String[] args = {"data"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"data"}, result);
    }

    // ---------- Boundary: empty arguments ----------

    @Test
    public void testFlattenEmptyArguments()
    {
        String[] args = {};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{}, result);
    }

    // ---------- Multiple loop iterations (many tokens) ----------

    @Test
    public void testFlattenMultipleTokens()
    {
        String[] args = {"-a", "-c", "--verbose", "plainArg"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-c", "--verbose", "plainArg"}, result);
    }

    // ---------- Exception paths ----------

    @Test(expected = NullPointerException.class)
    public void testFlattenNullArguments()
    {
        parser.flatten(options, null, false);
    }

    @Test(expected = NullPointerException.class)
    public void testFlattenNullOptionsWithBurstToken()
    {
        // token length > 2, not "--", not "-": requires options lookup -> NPE if options null
        parser.flatten(null, new String[]{"-ab"}, false);
    }

    // ---------- Inherited public parse() methods ----------

    @Test
    public void testParseNormalCase() throws ParseException
    {
        Options opts = new Options();
        opts.addOption("a", false, "desc a");
        opts.addOption("b", true, "desc b");

        PosixParser p = new PosixParser();
        CommandLine cl = p.parse(opts, new String[]{"-a", "-b", "value"});

        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
        assertEquals("value", cl.getOptionValue("b"));
    }

    @Test
    public void testParseNoOptions() throws ParseException
    {
        Options opts = new Options();
        opts.addOption("a", false, "desc a");

        PosixParser p = new PosixParser();
        CommandLine cl = p.parse(opts, new String[]{});

        assertFalse(cl.hasOption("a"));
        assertEquals(0, cl.getArgs().length);
    }

    @Test(expected = MissingOptionException.class)
    public void testParseMissingRequiredOptionThrowsException() throws ParseException
    {
        Options opts = new Options();
        Option required = new Option("r", false, "required option");
        required.setRequired(true);
        opts.addOption(required);

        PosixParser p = new PosixParser();
        p.parse(opts, new String[]{});
    }

    // ---------- burstToken direct behaviour with option having no more chars remaining ----------

    @Test
    public void testFlattenBurstTokenArgOptionAtEndOfToken()
    {
        // "-b" is exactly length 2 so it goes through processOptionToken, not burstToken.
        // To force burstToken path with hasArg option at very end of token (no leftover chars),
        // combine with a leading no-arg option so total length > 2.
        String[] args = {"-ab"};
        String[] result = parser.flatten(options, args, false);
        // 'a' has no arg -> added, loop continues to 'b' which has arg but no leftover chars
        // since token.length() == (i+1) the substring branch is skipped, loop ends naturally.
        assertArrayEquals(new String[]{"-a", "-b"}, result);
    }
}