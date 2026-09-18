package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class PosixParserTest
{
    private PosixParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new PosixParser();
        options = new Options();
        options.addOption("a", false, "option a, no arg");
        options.addOption("b", true, "option b, requires arg");
        options.addOption("c", false, "option c, no arg");
    }

    // ---------- SPECIAL TOKEN "--" prefix ----------

    @Test
    public void testFlatten_LongOptionWithoutEquals()
    {
        String[] args = { "--foo" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--foo" }, result);
    }

    @Test
    public void testFlatten_LongOptionWithEquals()
    {
        String[] args = { "--foo=bar" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--foo", "bar" }, result);
    }

    @Test
    public void testFlatten_DoubleHyphenAlone()
    {
        String[] args = { "--" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--" }, result);
    }

    // ---------- SINGLE HYPHEN ----------

    @Test
    public void testFlatten_SingleHyphen()
    {
        String[] args = { "-" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-" }, result);
    }

    // ---------- SHORT OPTION LENGTH == 2 ----------

    @Test
    public void testFlatten_ShortOptionValid()
    {
        String[] args = { "-a" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a" }, result);
    }

    @Test
    public void testFlatten_ShortOptionInvalid_StopAtNonOptionTrue()
    {
        String[] args = { "-x", "extra1", "extra2" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "-x", "extra1", "extra2" }, result);
    }

    @Test
    public void testFlatten_ShortOptionInvalid_StopAtNonOptionFalse()
    {
        String[] args = { "-x" };
        String[] result = parser.flatten(options, args, false);
        assertEquals(0, result.length);
    }

    // ---------- MULTI CHAR TOKEN THAT MATCHES A FULL REGISTERED OPTION ----------

    @Test
    public void testFlatten_MultiCharRegisteredOption()
    {
        Options localOptions = new Options();
        localOptions.addOption("abc", false, "multi char option");
        localOptions.addOption("a", false, "option a");
        String[] args = { "-abc" };
        String[] result = parser.flatten(localOptions, args, false);
        assertArrayEquals(new String[] { "-abc" }, result);
    }

    // ---------- BURST TOKEN ----------

    @Test
    public void testFlatten_BurstToken_AllValid_NoArgs()
    {
        String[] args = { "-ac" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a", "-c" }, result);
    }

    @Test
    public void testFlatten_BurstToken_WithArgConsumingRemainder()
    {
        String[] args = { "-bvalue" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-b", "value" }, result);
    }

    @Test
    public void testFlatten_BurstToken_ArgOptionAtEndNoRemainder()
    {
        String[] args = { "-ab" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a", "-b" }, result);
    }

    @Test
    public void testFlatten_BurstToken_InvalidChar_StopAtNonOptionTrue()
    {
        Options localOptions = new Options();
        localOptions.addOption("a", false, "option a");
        localOptions.addOption("b", true, "option b");
        localOptions.addOption("c", false, "option c");
        String[] args = { "-xz" };
        String[] result = parser.flatten(localOptions, args, true);
        assertArrayEquals(new String[] { "--", "xz" }, result);
    }

    @Test
    public void testFlatten_BurstToken_InvalidChar_StopAtNonOptionFalse()
    {
        Options localOptions = new Options();
        localOptions.addOption("a", false, "option a");
        localOptions.addOption("b", true, "option b");
        localOptions.addOption("c", false, "option c");
        String[] args = { "-xz" };
        String[] result = parser.flatten(localOptions, args, false);
        assertArrayEquals(new String[] { "-xz" }, result);
    }

    // ---------- NON OPTION TOKENS / process() ----------

    @Test
    public void testFlatten_NonOption_StopAtNonOptionTrue_NoCurrentOption()
    {
        String[] args = { "foo" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "--", "foo" }, result);
    }

    @Test
    public void testFlatten_NonOption_StopAtNonOptionTrue_WithCurrentOptionHasArg()
    {
        String[] args = { "-b", "value" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "-b", "value" }, result);
    }

    @Test
    public void testFlatten_NonOption_StopAtNonOptionFalse()
    {
        String[] args = { "value" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "value" }, result);
    }

    // ---------- GOBBLE (0 / 1 / many remaining tokens) ----------

    @Test
    public void testFlatten_Gobble_ZeroRemainingTokens()
    {
        String[] args = { "foo" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "--", "foo" }, result);
    }

    @Test
    public void testFlatten_Gobble_SingleRemainingToken()
    {
        String[] args = { "foo", "bar" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "--", "foo", "bar" }, result);
    }

    @Test
    public void testFlatten_Gobble_MultipleRemainingTokens()
    {
        String[] args = { "foo", "bar", "baz" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "--", "foo", "bar", "baz" }, result);
    }

    // ---------- BOUNDARY / EMPTY INPUT ----------

    @Test
    public void testFlatten_EmptyArguments()
    {
        String[] args = {};
        String[] result = parser.flatten(options, args, false);
        assertEquals(0, result.length);
    }

    // ---------- NULL INPUT / EXCEPTION PATH ----------

    @Test(expected = NullPointerException.class)
    public void testFlatten_NullArguments_ThrowsException()
    {
        parser.flatten(options, null, false);
    }

    @Test(expected = NullPointerException.class)
    public void testFlatten_NullOptions_ThrowsException()
    {
        String[] args = { "-a" };
        parser.flatten(null, args, false);
    }

    // ---------- MIXED / MULTIPLE TOKENS IN A SINGLE flatten() CALL ----------

    @Test
    public void testFlatten_MixedTokens()
    {
        String[] args = { "-a", "-b", "value", "--foo=bar", "-" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a", "-b", "value", "--foo", "bar", "-" }, result);
    }

    // ---------- PUBLIC METHOD (inherited from Parser) ----------

    @Test
    public void testParse_PublicMethod_ShortOptions() throws ParseException
    {
        Options localOptions = new Options();
        localOptions.addOption("a", false, "option a");
        localOptions.addOption("b", true, "option b requires arg");

        CommandLine cmd = parser.parse(localOptions, new String[] { "-a", "-b", "value" });

        assertTrue(cmd.hasOption("a"));
        assertEquals("value", cmd.getOptionValue("b"));
    }

    @Test
    public void testParse_PublicMethod_LongOptionWithEquals() throws ParseException
    {
        Options localOptions = new Options();
        localOptions.addOption("b", "bar", true, "bar option requires arg");

        CommandLine cmd = parser.parse(localOptions, new String[] { "--bar=hello" });

        assertTrue(cmd.hasOption("bar"));
        assertEquals("hello", cmd.getOptionValue("bar"));
    }

    @Test
    public void testParse_PublicMethod_NoOptions() throws ParseException
    {
        Options localOptions = new Options();
        localOptions.addOption("a", false, "option a");

        CommandLine cmd = parser.parse(localOptions, new String[] {});

        assertTrue(!cmd.hasOption("a"));
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParse_PublicMethod_ExtraArguments() throws ParseException
    {
        Options localOptions = new Options();
        localOptions.addOption("a", false, "option a");

        CommandLine cmd = parser.parse(localOptions, new String[] { "-a", "extra1", "extra2" });

        assertTrue(cmd.hasOption("a"));
        assertArrayEquals(new String[] { "extra1", "extra2" }, cmd.getArgs());
    }

    @Test
    public void testParse_PublicMethod_MissingRequiredOption_ThrowsParseException()
    {
        Options localOptions = new Options();
        Option required = new Option("r", false, "required option");
        required.setRequired(true);
        localOptions.addOption(required);

        try
        {
            parser.parse(localOptions, new String[] {});
            fail("Expected ParseException due to missing required option");
        }
        catch (ParseException e)
        {
            // expected
        }
    }
}