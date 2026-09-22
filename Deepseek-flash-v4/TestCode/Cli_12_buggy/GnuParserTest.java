package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.cli.Options;

public class GnuParserTest {

    private GnuParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new GnuParser();
        options = new Options();
        options.addOption("d", "debug", false, "debug flag");
        options.addOption("p", "property", true, "property with value");
        options.addOption("h", "help", false, "help flag");
    }

    @Test
    public void testFlattenWithSingleDashOptions() {
        String[] args = {"-d", "-p", "value", "-h"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-d", "-p", "value", "-h"}, result);
    }

    @Test
    public void testFlattenWithDoubleDashOptions() {
        String[] args = {"--debug", "--property=value", "--help"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--debug", "--property=value", "--help"}, result);
    }

    @Test
    public void testFlattenWithShortOptionAndValue() {
        String[] args = {"-Dproperty=value"};
        Options opts = new Options();
        opts.addOption("D", "define", true, "define property");
        String[] result = parser.flatten(opts, args, false);
        assertArrayEquals(new String[]{"-D", "property=value"}, result);
    }

    @Test
    public void testFlattenWithUnknownOption() {
        String[] args = {"-x", "value"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-x", "value"}, result);
    }

    @Test
    public void testFlattenStopAtNonOption() {
        String[] args = {"-d", "file.txt", "--debug"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-d", "file.txt", "--debug"}, result);
    }

    @Test
    public void testFlattenWithoutStopAtNonOption() {
        String[] args = {"-d", "file.txt", "--debug"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-d", "file.txt", "--debug"}, result);
    }

    @Test
    public void testFlattenWithDoubleDashSeparator() {
        String[] args = {"-d", "--", "--unknown"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-d", "--", "--unknown"}, result);
    }

    @Test
    public void testFlattenWithSingleDash() {
        String[] args = {"-"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-"}, result);
    }

    @Test
    public void testFlattenWithEmptyArguments() {
        String[] args = {};
        String[] result = parser.flatten(options, args, false);
        assertEquals(0, result.length);
    }

    @Test
    public void testFlattenWithNullArgument() {
        String[] args = {null};
        String[] result = parser.flatten(options, args, false);
        assertEquals(1, result.length);
        assertNull(result[0]);
    }

    @Test(expected = NullPointerException.class)
    public void testFlattenWithNullArgumentsArray() {
        parser.flatten(options, null, false);
    }

    @Test
    public void testFlattenWithLongOptionPrefixOnly() {
        String[] args = {"--"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--"}, result);
    }
}