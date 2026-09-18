package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PosixParserTest
{
    private PosixParser parser;

    @Before
    public void setUp()
    {
        parser = new PosixParser();
    }

    private Options createOptions()
    {
        Options options = new Options();
        options.addOption("a", true, "option with arg");
        options.addOption("b", false, "boolean option b");
        options.addOption("c", false, "boolean option c");
        return options;
    }

    // ------------------------------------------------------------------
    // Long option handling ("--foo" / "--foo=bar")
    // ------------------------------------------------------------------

    @Test
    public void testFlattenLongOptionNoEquals()
    {
        Options options = new Options();
        String[] args = { "--foo" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "--foo" }, result);
    }

    @Test
    public void testFlattenLongOptionWithEquals()
    {
        Options options = new Options();
        String[] args = { "--foo=bar" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "--foo", "bar" }, result);
    }

    // ------------------------------------------------------------------
    // Single hyphen handling ("-")
    // ------------------------------------------------------------------

    @Test
    public void testFlattenSingleHyphen()
    {
        Options options = new Options();
        String[] args = { "-" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-" }, result);
    }

    // ------------------------------------------------------------------
    // Two character short option handling ("-a")
    // ------------------------------------------------------------------

    @Test
    public void testFlattenShortOptionValid()
    {
        Options options = createOptions();
        String[] args = { "-a" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-a" }, result);
    }

    @Test
    public void testFlattenShortOptionInvalidStopAtNonOptionTrue()
    {
        Options options = createOptions();
        String[] args = { "-x", "r1", "r2" };

        String[] result = parser.flatten(options, args, true);

        // "-x" is not a valid option, stopAtNonOption sets eatTheRest = true
        // and gobbles the remaining tokens directly (multiple loop rounds)
        assertArrayEquals(new String[] { "r1", "r2" }, result);
    }

    @Test
    public void testFlattenShortOptionInvalidStopAtNonOptionFalse()
    {
        Options options = createOptions();
        String[] args = { "-x", "r1", "r2" };

        String[] result = parser.flatten(options, args, false);

        // "-x" is dropped silently, other plain tokens added normally
        assertArrayEquals(new String[] { "r1", "r2" }, result);
    }

    @Test
    public void testFlattenGobbleOneRound()
    {
        Options options = createOptions();
        String[] args = { "-x", "only1" };

        String[] result = parser.flatten(options, args, true);

        assertArrayEquals(new String[] { "only1" }, result);
    }

    // ------------------------------------------------------------------
    // Long token registered directly as an option (no bursting needed)
    // ------------------------------------------------------------------

    @Test
    public void testFlattenLongTokenRegisteredDirectly()
    {
        Options options = new Options();
        options.addOption("longopt", false, "long option desc");
        String[] args = { "-longopt" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-longopt" }, result);
    }

    // ------------------------------------------------------------------
    // Bursting long tokens
    // ------------------------------------------------------------------

    @Test
    public void testFlattenBurstTokenWithArgAndRemainingChars()
    {
        Options options = createOptions();
        String[] args = { "-ab" };

        String[] result = parser.flatten(options, args, false);

        // 'a' has an argument, 'b' is treated as the remaining characters
        assertArrayEquals(new String[] { "-a", "b" }, result);
    }

    @Test
    public void testFlattenBurstTokenMultipleBooleanOptions()
    {
        Options options = createOptions();
        String[] args = { "-bc" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-b", "-c" }, result);
    }

    @Test
    public void testFlattenBurstTokenInvalidCharStopAtNonOptionTrue()
    {
        Options options = createOptions();
        String[] args = { "-bz" };

        String[] result = parser.flatten(options, args, true);

        assertArrayEquals(new String[] { "-b", "--", "z" }, result);
    }

    @Test
    public void testFlattenBurstTokenInvalidCharStopAtNonOptionFalse()
    {
        Options options = createOptions();
        String[] args = { "-bz" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-b", "-bz" }, result);
    }

    // ------------------------------------------------------------------
    // Plain (non option) token handling
    // ------------------------------------------------------------------

    @Test
    public void testFlattenPlainTokenStopAtNonOptionFalse()
    {
        Options options = new Options();
        String[] args = { "plain1", "plain2" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "plain1", "plain2" }, result);
    }

    // ------------------------------------------------------------------
    // process() logic - both branches exercised in a single flatten call
    // ------------------------------------------------------------------

    @Test
    public void testFlattenProcessLogicStopAtNonOptionTrue()
    {
        Options options = createOptions();
        String[] args = { "-a", "value1", "somethingelse" };

        String[] result = parser.flatten(options, args, true);

        assertArrayEquals(
            new String[] { "-a", "value1", "--", "somethingelse" }, result);
    }

    // ------------------------------------------------------------------
    // Boundary values
    // ------------------------------------------------------------------

    @Test
    public void testFlattenEmptyArguments()
    {
        Options options = new Options();
        String[] args = new String[0];

        String[] result = parser.flatten(options, args, false);

        assertEquals(0, result.length);
    }

    // ------------------------------------------------------------------
    // null / exception paths
    // ------------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testFlattenNullArgumentsThrowsException()
    {
        Options options = new Options();
        parser.flatten(options, null, false);
    }

    @Test(expected = NullPointerException.class)
    public void testFlattenNullOptionsThrowsException()
    {
        String[] args = { "-a" };
        parser.flatten(null, args, false);
    }

    // ------------------------------------------------------------------
    // burstToken called directly (protected, same-package access)
    // ------------------------------------------------------------------

    @Test
    public void testBurstTokenDirectCallViaFlatten()
    {
        Options options = createOptions();
        // trigger burstToken indirectly through flatten but validate the
        // protected method behavior explicitly as well
        parser.burstTokenPublicTestHelperSetup(options);

        parser.burstToken("-ab", false);

        String[] result = parser.getTokensAsArray();

        assertArrayEquals(new String[] { "-a", "b" }, result);
    }
}