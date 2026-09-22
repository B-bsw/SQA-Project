package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import java.util.Properties;
import static org.junit.Assert.*;

public class DefaultParserTest {
    private DefaultParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new DefaultParser();
        options = new Options();
    }

    @Test
    public void testParseWithoutArguments() throws ParseException {
        CommandLine cmd = parser.parse(options, new String[]{});
        assertNotNull(cmd);
        assertTrue(cmd.getArgs().length == 0);
    }

    @Test
    public void testParseWithNullArguments() throws ParseException {
        CommandLine cmd = parser.parse(options, (String[]) null);
        assertNotNull(cmd);
        assertTrue(cmd.getArgs().length == 0);
    }

    @Test
    public void testParseWithStopAtNonOption() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = new String[]{"-a", "value", "non-option"};
        CommandLine cmd = parser.parse(options, args, true);
        assertTrue(cmd.hasOption("a"));
        assertEquals(1, cmd.getArgs().length);
        assertEquals("non-option", cmd.getArgs()[0]);
    }

    @Test
    public void testParseLongOptionWithEquals() throws ParseException {
        options.addOption("l", "long", true, "Long option");
        String[] args = new String[]{"--long=value"};
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("l"));
        assertEquals("value", cmd.getOptionValue("l"));
    }

    @Test
    public void testParseLongOptionWithoutEquals() throws ParseException {
        options.addOption("l", "long", true, "Long option");
        String[] args = new String[]{"--long", "value"};
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("l"));
        assertEquals("value", cmd.getOptionValue("l"));
    }

    @Test
    public void testParseShortOptionWithEquals() throws ParseException {
        options.addOption("s", "short", true, "Short option");
        String[] args = new String[]{"-s=value"};
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("s"));
        assertEquals("value", cmd.getOptionValue("s"));
    }

    @Test
    public void testParseShortOptionSpaceValue() throws ParseException {
        options.addOption("s", "short", true, "Short option");
        String[] args = new String[]{"-s", "value"};
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("s"));
        assertEquals("value", cmd.getOptionValue("s"));
    }

    @Test
    public void testParseShortOptionConcatenated() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", false, "Beta option");
        String[] args = new String[]{"-ab"};
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
    }

    @Test
    public void testParseShortOptionConcatenatedWithArg() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = new String[]{"-abvalue"};
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertEquals("value", cmd.getOptionValue("b"));
    }

    @Test
    public void testParsePropertyOption() throws ParseException {
        options.addOption("p", "prop", true, "Property option");
        Properties props = new Properties();
        props.setProperty("p", "value");
        CommandLine cmd = parser.parse(options, new String[]{}, props);
        assertTrue(cmd.hasOption("p"));
        assertEquals("value", cmd.getOptionValue("p"));
    }

    @Test
    public void testParsePropertyOptionWithMissingOption() {
        Properties props = new Properties();
        props.setProperty("nonexistent", "value");
        try {
            parser.parse(options, new String[]{}, props);
            fail("Expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException e) {
            assertEquals("Default option wasn't defined", e.getMessage());
        }
    }

    @Test
    public void testParsePropertyOptionWithGroupSelection() throws ParseException {
        OptionGroup group = new OptionGroup();
        group.addOption(Option.builder("a").build());
        group.addOption(Option.builder("b").build());
        options.addOptionGroup(group);
        Properties props = new Properties();
        props.setProperty("a", "true");
        CommandLine cmd = parser.parse(options, new String[]{}, props);
        assertTrue(cmd.hasOption("a"));
        assertFalse(cmd.hasOption("b"));
    }

    @Test
    public void testParsePropertyOptionWithAlreadySelectedOption() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = new String[]{"-a"};
        Properties props = new Properties();
        props.setProperty("a", "false");
        CommandLine cmd = parser.parse(options, args, props);
        assertTrue(cmd.hasOption("a"));
        assertEquals(null, cmd.getOptionValue("a"));
    }

    @Test
    public void testParseWithMissingRequiredOption() {
        options.addOption(Option.builder("r").required().build());
        try {
            parser.parse(options, new String[]{});
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertNotNull(e.getMissingOptions());
            assertEquals(1, e.getMissingOptions().size());
        }
    }

    @Test
    public void testParseWithMissingRequiredArg() {
        options.addOption(Option.builder("r").hasArg().required().build());
        try {
            parser.parse(options, new String[]{"-r"});
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException e) {
            assertNotNull(e.getOption());
        }
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParseWithUnrecognizedShortOption() throws ParseException {
        parser.parse(options, new String[]{"-x"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParseWithUnrecognizedLongOption() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha option");
        parser.parse(options, new String[]{"--unknown"});
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testParseWithAmbiguousLongOption() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "alpine", false, "Alpine option");
        parser.parse(options, new String[]{"--al"});
    }

    @Test
    public void testParseLongOptionWithPartialMatch() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha option");
        CommandLine cmd = parser.parse(options, new String[]{"--alp"});
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParseDoubleDashStopsParsing() throws ParseException {
        String[] args = new String[]{"--", "-a", "value"};
        CommandLine cmd = parser.parse(options, args);
        assertEquals(2, cmd.getArgs().length);
        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testParseNegativeNumberAsValue() throws ParseException {
        options.addOption("n", "num", true, "Number option");
        String[] args = new String[]{"-n", "-10"};
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("n"));
        assertEquals("-10", cmd.getOptionValue("n"));
    }

    @Test
    public void testParseNegativeNumberAsOption() throws ParseException {
        options.addOption("n", "num", true, "Number option");
        String[] args = new String[]{"-n-10"};
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("n"));
        assertEquals("-10", cmd.getOptionValue("n"));
    }

    @Test
    public void testParseJavaPropertyStyleValue() throws ParseException {
        options.addOption("d", "debug", false, "Debug option");
        String[] args = new String[]{"-Dkey=value"};
        CommandLine cmd = parser.parse(options, args);
        assertNotNull(cmd);
    }

    @Test
    public void testParseWithPropertiesNull() throws ParseException {
        CommandLine cmd = parser.parse(options, new String[]{"arg"}, null, false);
        assertNotNull(cmd);
        assertEquals(1, cmd.getArgs().length);
    }

    @Test
    public void testParseWithStopAtNonOptionAndUnknownToken() throws ParseException {
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = new String[]{"-a", "unknown", "-b"};
        CommandLine cmd = parser.parse(options, args, true);
        assertTrue(cmd.hasOption("a"));
        assertEquals(2, cmd.getArgs().length);
        assertEquals("unknown", cmd.getArgs()[0]);
        assertEquals("-b", cmd.getArgs()[1]);
    }
}