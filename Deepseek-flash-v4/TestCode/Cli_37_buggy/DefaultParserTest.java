package org.apache.commons.cli;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Properties;

public class DefaultParserTest {
    private Options options;
    private DefaultParser parser;

    @Before
    public void setUp() {
        options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option with arg");
        options.addOption("c", "gamma", true, "Gamma option with arg");
        options.addOption("D", "property", true, "Java property");
        parser = new DefaultParser();
    }

    @Test
    public void testParseWithNullArguments() throws ParseException {
        CommandLine cl = parser.parse(options, null);
        assertNotNull(cl);
        assertFalse(cl.hasOption("a"));
    }

    @Test
    public void testParseSimpleShortOption() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("b"));
    }

    @Test
    public void testParseShortOptionWithValue() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{"-b", "value1"});
        assertTrue(cl.hasOption("b"));
        assertEquals("value1", cl.getOptionValue("b"));
    }

    @Test
    public void testParseShortOptionWithEquals() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{"-b=value2"});
        assertTrue(cl.hasOption("b"));
        assertEquals("value2", cl.getOptionValue("b"));
    }

    @Test
    public void testParseLongOption() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{"--alpha"});
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testParseLongOptionWithValue() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{"--beta", "val"});
        assertTrue(cl.hasOption("b"));
        assertEquals("val", cl.getOptionValue("b"));
    }

    @Test
    public void testParseLongOptionWithEquals() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{"--beta=val"});
        assertTrue(cl.hasOption("b"));
        assertEquals("val", cl.getOptionValue("b"));
    }

    @Test
    public void testParseConcatenatedShortOptions() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testParseWithDoubleDashStopsParsing() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{"-a", "--", "-b", "value"});
        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("b"));
        assertEquals("-b", cl.getArgs()[0]);
        assertEquals("value", cl.getArgs()[1]);
    }

    @Test
    public void testParseUnknownOption() {
        try {
            parser.parse(options, new String[]{"-z"});
            fail("Expected ParseException for unknown option");
        } catch (ParseException e) {
            assertTrue(e instanceof UnrecognizedOptionException);
        }
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParseUnknownOptionShortWithStopAtNonOptionFalse() throws ParseException {
        parser.parse(options, new String[]{"-z"}, false);
    }

    @Test
    public void testParseUnknownOptionWithStopAtNonOptionTrue() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{"-z"}, true);
        assertEquals("-z", cl.getArgs()[0]);
    }

    @Test
    public void testParseUnknownLongOptionWithStopAtNonOptionTrue() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{"--zzz"}, true);
        assertNotNull(cl);
    }

    @Test(expected = MissingArgumentException.class)
    public void testParseOptionMissingRequiredArg() throws ParseException {
        parser.parse(options, new String[]{"-b"});
    }

    @Test
    public void testParseSingleDashToken() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{"-"});
        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testParseJavaPropertyShortOption() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{"-Dkey=value"});
        assertTrue(cl.hasOption("D"));
        assertEquals("key=value", cl.getOptionValue("D"));
    }

    @Test
    public void testParseProperties() throws ParseException {
        properties = new Properties();
        properties.setProperty("a", "true");
        CommandLine cl = parser.parse(options, new String[]{}, properties);
        assertTrue(cl.hasOption("a"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParsePropertiesWithInvalidOption() throws ParseException {
        Properties props = new Properties();
        props.setProperty("zzz", "true");
        parser.parse(options, new String[]{}, props);
    }

    @Test(expected = MissingOptionException.class)
    public void testParseMissingRequiredOption() {
        Options reqOptions = new Options();
        reqOptions.addOption(Option.builder("r").required().build());
        try {
            parser.parse(reqOptions, new String[]{});
        } catch (ParseException e) {
            fail("Expected MissingOptionException but got: " + e.getMessage());
        }
    }

    @Test
    public void testParseNegativeNumberAsValue() throws ParseException {
        options.addOption("n", "num", true, "A number");
        CommandLine cl = parser.parse(options, new String[]{"-n", "-5"});
        assertEquals("-5", cl.getOptionValue("n"));
    }

    @Test
    public void testParseLongPrefixMatching() throws ParseException {
        Options opts = new Options();
        opts.addOption(Option.builder("Xmx").longOpt("max-memory").hasArg().build());
        CommandLine cl = parser.parse(opts, new String[]{"-Xmx512m"});
        assertTrue(cl.hasOption("Xmx"));
    }

    @Test
    public void testParseShortAndLongCombined() throws ParseException {
        Options opts = new Options();
        opts.addOption(Option.builder("L").hasArg().build());
        CommandLine cl = parser.parse(opts, new String[]{"-L5"});
        assertEquals("5", cl.getOptionValue("L"));
    }

    @Test
    public void testHandleUnknownTokenAsArgument() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{"plainarg"});
        assertEquals("plainarg", cl.getArgs()[0]);
    }

    @Test
    public void testParseEmptyArguments() throws ParseException {
        CommandLine cl = parser.parse(options, new String[]{});
        assertNotNull(cl);
        assertFalse(cl.hasOption("a"));
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testAmbiguousLongOption() throws ParseException {
        Options opts = new Options();
        opts.addOption("a", "alpha", false, "");
        opts.addOption("b", "alpine", false, "");
        parser.parse(opts, new String[]{"--alp"});
    }

    @Test
    public void testCheckRequiredArgsWhenCurrentOptionNull() throws ParseException {
        Options noArgsOpts = new Options();
        noArgsOpts.addOption("x", "xtra", false, "No args");
        CommandLine cl = parser.parse(noArgsOpts, new String[]{"-x"});
        assertTrue(cl.hasOption("x"));
    }
}