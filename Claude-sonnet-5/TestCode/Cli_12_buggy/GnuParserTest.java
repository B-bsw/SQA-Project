package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class GnuParserTest
{
    private GnuParser parser;

    @Before
    public void setUp()
    {
        parser = new GnuParser();
    }

    // ---------- Normal cases ----------

    @Test
    public void testFlattenSimpleNonOptionArgument()
    {
        Options options = new Options();
        String[] args = new String[] { "value" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "value" }, result);
    }

    @Test
    public void testFlattenOptionExists()
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        String[] args = new String[] { "-a" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-a" }, result);
    }

    @Test
    public void testFlattenPropertyStyleOption()
    {
        Options options = new Options();
        options.addOption("D", true, "property option");

        String[] args = new String[] { "-Dproperty=value" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-D", "property=value" }, result);
    }

    // ---------- "--" and "-" special tokens ----------

    @Test
    public void testFlattenDoubleDashEatsRest()
    {
        Options options = new Options();
        String[] args = new String[] { "--", "foo", "-bar" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "--", "foo", "-bar" }, result);
    }

    @Test
    public void testFlattenSingleDash()
    {
        Options options = new Options();
        String[] args = new String[] { "-" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-" }, result);
    }

    // ---------- Unknown option, stopAtNonOption branches ----------

    @Test
    public void testFlattenUnknownOptionStopAtNonOptionFalse()
    {
        Options options = new Options();
        String[] args = new String[] { "-x", "foo", "bar" };

        String[] result = parser.flatten(options, args, false);

        // stopAtNonOption is false, so eatTheRest stays false and each token
        // is processed individually
        assertArrayEquals(new String[] { "-x", "foo", "bar" }, result);
    }

    @Test
    public void testFlattenUnknownOptionStopAtNonOptionTrue()
    {
        Options options = new Options();
        String[] args = new String[] { "-x", "foo", "bar" };

        String[] result = parser.flatten(options, args, true);

        // stopAtNonOption true triggers eatTheRest, remaining tokens are
        // simply appended without further processing
        assertArrayEquals(new String[] { "-x", "foo", "bar" }, result);
    }

    // ---------- Multiple loops / mixed tokens ----------

    @Test
    public void testFlattenMultipleTokensMixed()
    {
        Options options = new Options();
        options.addOption("a", false, "a option");
        options.addOption("D", true, "property option");

        String[] args = new String[] { "-a", "-Dprop=val", "value", "--", "extra1", "extra2" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-a", "-D", "prop=val", "value", "--", "extra1", "extra2" }, result);
    }

    @Test
    public void testFlattenEatTheRestMidway()
    {
        Options options = new Options();
        String[] args = new String[] { "value1", "-x", "value2", "value3" };

        String[] result = parser.flatten(options, args, true);

        assertArrayEquals(new String[] { "value1", "-x", "value2", "value3" }, result);
    }

    // ---------- Boundary values ----------

    @Test
    public void testFlattenEmptyArgumentsArray()
    {
        Options options = new Options();
        String[] args = new String[0];

        String[] result = parser.flatten(options, args, false);

        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testFlattenSingleArgument()
    {
        Options options = new Options();
        String[] args = new String[] { "onlyOne" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "onlyOne" }, result);
    }

    // ---------- Null / exception paths ----------

    @Test(expected = NullPointerException.class)
    public void testFlattenNullArgumentsThrowsException()
    {
        Options options = new Options();
        parser.flatten(options, null, false);
    }

    @Test(expected = NullPointerException.class)
    public void testFlattenNullOptionsThrowsException()
    {
        String[] args = new String[] { "-a" };
        parser.flatten(null, args, false);
    }

    @Test
    public void testFlattenEmptyStringArgument()
    {
        Options options = new Options();
        String[] args = new String[] { "" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "" }, result);
    }
}