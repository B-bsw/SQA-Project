package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

public class DefaultParserTest {
    private DefaultParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new DefaultParser();
        options = new Options();
    }

    @Test
    public void testParseNullArguments() throws Exception {
        CommandLine cmd = parser.parse(options, null);
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParseEmptyArguments() throws Exception {
        CommandLine cmd = parser.parse(options, new String[0]);
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParseSimpleShortOption() throws Exception {
        options.addOption("a", "alpha", false, "Alpha option");
        CommandLine cmd = parser.parse(options, new String[] {"-a"});
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParseShortOptionWithValue() throws Exception {
        options.addOption("a", "alpha", true, "Alpha option");
        CommandLine cmd = parser.parse(options, new String[] {"-a", "value"});
        assertTrue(cmd.hasOption("a"));
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    public void testParseShortOptionWithEquals() throws Exception {
        options.addOption("a", "alpha", true, "Alpha option");
        CommandLine cmd = parser.parse(options, new String[] {"-a=value"});
        assertTrue(cmd.hasOption("a"));
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    public void testParseLongOption() throws Exception {
        options.addOption("a", "alpha", false, "Alpha option");
        CommandLine cmd = parser.parse(options, new String[] {"--alpha"});
        assertTrue(cmd.hasOption("alpha"));
    }

    @Test
    public void testParseLongOptionWithValue() throws Exception {
        options.addOption("a", "alpha", true, "Alpha option");
        CommandLine cmd = parser.parse(options, new String[] {"--alpha", "value"});
        assertTrue(cmd.hasOption("alpha"));
        assertEquals("value", cmd.getOptionValue("alpha"));
    }

    @Test
    public void testParseLongOptionWithEquals() throws Exception {
        options.addOption("a", "alpha", true, "Alpha option");
        CommandLine cmd = parser.parse(options, new String[] {"--alpha=value"});
        assertTrue(cmd.hasOption("alpha"));
        assertEquals("value", cmd.getOptionValue("alpha"));
    }

    @Test
    public void testParseDoubleDash() throws Exception {
        options.addOption("a", "alpha", false, "Alpha option");
        CommandLine cmd = parser.parse(options, new String[] {"--", "-a"});
        assertFalse(cmd.hasOption("a"));
        assertEquals(1, cmd.getArgs().length);
        assertEquals("-a", cmd.getArgs()[0]);
    }

    @Test
    public void testParseStopAtNonOption() throws Exception {
        options.addOption("a", "alpha", false, "Alpha option");
        CommandLine cmd = parser.parse(options, new String[] {"-a", "value", "--unknown"}, null, true);
        assertTrue(cmd.hasOption("a"));
        assertEquals(1, cmd.getArgs().length);
        assertEquals("value", cmd.getArgs()[0]);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParseUnrecognizedOption() throws Exception {
        parser.parse(options, new String[] {"-z"});
    }

    @Test
    public void testParseUnknownTokenAsArgument() throws Exception {
        options.addOption("a", "alpha", false, "Alpha option");
        CommandLine cmd = parser.parse(options, new String[] {"value"});
        assertEquals(1, cmd.getArgs().length);
        assertEquals("value", cmd.getArgs()[0]);
    }

    @Test
    public void testParseNegativeNumberAsArgument() throws Exception {
        options.addOption("n", "number", true, "Number option");
        CommandLine cmd = parser.parse(options, new String[] {"-n", "-5"});
        assertTrue(cmd.hasOption("n"));
        assertEquals("-5", cmd.getOptionValue("n"));
    }

    @Test
    public void testParseJavaProperty() throws Exception {
        options.addOption("D", true, "Property");
        CommandLine cmd = parser.parse(options, new String[] {"-Dkey=value"});
        assertTrue(cmd.hasOption("D"));
        assertEquals("key=value", cmd.getOptionValue("D"));
    }

    @Test
    public void testParseConcatenatedShortOptions() throws Exception {
        options.addOption("a", false, "Alpha");
        options.addOption("b", false, "Beta");
        options.addOption("c", false, "Gamma");
        CommandLine cmd = parser.parse(options, new String[] {"-abc"});
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertTrue(cmd.hasOption("c"));
    }

    @Test
    public void testParseShortOptionWithValueInConcatenated() throws Exception {
        options.addOption("a", false, "Alpha");
        options.addOption("b", true, "Beta");
        CommandLine cmd = parser.parse(options, new String[] {"-ab", "value"});
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertEquals("value", cmd.getOptionValue("b"));
    }

    @Test
    public void testParseLongOptionWithValueUsingSingleDash() throws Exception {
        options.addOption("a", "alpha", true, "Alpha");
        CommandLine cmd = parser.parse(options, new String[] {"-alpha", "value"});
        assertTrue(cmd.hasOption("alpha"));
        assertEquals("value", cmd.getOptionValue("alpha"));
    }

    @Test
    public void testParseLongOptionWithValueSingleDashEquals() throws Exception {
        options.addOption("a", "alpha", true, "Alpha");
        CommandLine cmd = parser.parse(options, new String[] {"-alpha=value"});
        assertTrue(cmd.hasOption("alpha"));
        assertEquals("value", cmd.getOptionValue("alpha"));
    }

    @Test
    public void testParseLongOptionWithEqualsInValue() throws Exception {
        options.addOption("a", "alpha", true, "Alpha");
        CommandLine cmd = parser.parse(options, new String[] {"--alpha=key=value"});
        assertTrue(cmd.hasOption("alpha"));
        assertEquals("key=value", cmd.getOptionValue("alpha"));
    }

    @Test(expected = MissingArgumentException.class)
    public void testParseMissingRequiredArgument() throws Exception {
        options.addOption("a", "alpha", true, "Alpha");
        parser.parse(options, new String[] {"-a"});
    }

    @Test(expected = MissingOptionException.class)
    public void testParseMissingRequiredOption() throws Exception {
        options.addRequiredOption("a", "alpha", false, "Required");
        parser.parse(options, new String[0]);
    }

    @Test
    public void testParseWithProperties() throws Exception {
        options.addOption("a", "alpha", true, "Alpha");
        Properties props = new Properties();
        props.setProperty("a", "value");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("a"));
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    public void testParseWithPropertiesYesValue() throws Exception {
        options.addOption("flag", false, "Flag");
        Properties props = new Properties();
        props.setProperty("flag", "yes");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("flag"));
    }

    @Test
    public void testParseWithPropertiesNonYesValue() throws Exception {
        options.addOption("flag", false, "Flag");
        Properties props = new Properties();
        props.setProperty("flag", "no");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertFalse(cmd.hasOption("flag"));
    }

    @Test
    public void testParseOptionGroup() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(OptionBuilder.create("a"));
        group.addOption(OptionBuilder.create("b"));
        options.addOptionGroup(group);
        CommandLine cmd = parser.parse(options, new String[] {"-a"});
        assertTrue(cmd.hasOption("a"));
        assertFalse(cmd.hasOption("b"));
    }

    @Test(expected = AlreadySelectedException.class)
    public void testParseOptionGroupAlreadySelected() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(OptionBuilder.create("a"));
        group.addOption(OptionBuilder.create("b"));
        options.addOptionGroup(group);
        parser.parse(options, new String[] {"-a", "-b"});
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testParseAmbiguousLongOption() throws Exception {
        options.addOption("a", "alpha", false, "Alpha");
        options.addOption("b", "alphabet", false, "Alphabet");
        parser.parse(options, new String[] {"--alp"});
    }

    @Test
    public void testParseLongPrefix() throws Exception {
        options.addOption("a", "alpha", true, "Alpha");
        CommandLine cmd = parser.parse(options, new String[] {"--al=value"});
        assertTrue(cmd.hasOption("alpha"));
        assertEquals("value", cmd.getOptionValue("alpha"));
    }

    @Test
    public void testParseLongPrefixNoValue() throws Exception {
        options.addOption("a", "alpha", false, "Alpha");
        CommandLine cmd = parser.parse(options, new String[] {"--al"});
        assertTrue(cmd.hasOption("alpha"));
    }

    @Test
    public void testParseJavaPropertySingleChar() throws Exception {
        options.addOption("D", true, "Property");
        CommandLine cmd = parser.parse(options, new String[] {"-Dkey=value"});
        assertTrue(cmd.hasOption("D"));
        assertEquals("key=value", cmd.getOptionValue("D"));
    }

    @Test
    public void testParseNegativeNumber() throws Exception {
        options.addOption("d", "double", true, "Double");
        CommandLine cmd = parser.parse(options, new String[] {"-d", "-1.5"});
        assertTrue(cmd.hasOption("d"));
        assertEquals("-1.5", cmd.getOptionValue("d"));
    }

    @Test
    public void testParseEmptyOption() throws Exception {
        CommandLine cmd = parser.parse(options, new String[] {"-"});
        assertEquals(0, cmd.getArgs().length);
    }
}