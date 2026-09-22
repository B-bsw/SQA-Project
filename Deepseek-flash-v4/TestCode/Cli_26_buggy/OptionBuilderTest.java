package org.apache.commons.cli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OptionBuilderTest {

    @Before
    public void setUp() {
        OptionBuilder.reset();
    }

    @After
    public void tearDown() {
        OptionBuilder.reset();
    }

    @Test
    public void testCreateWithChar() {
        OptionBuilder.withLongOpt("test");
        OptionBuilder.hasArg();
        Option option = OptionBuilder.create('a');
        assertNotNull(option);
        assertEquals("a", option.getOpt());
        assertEquals("test", option.getLongOpt());
        assertTrue(option.hasArg());
        assertFalse(option.isRequired());
    }

    @Test
    public void testCreateWithoutLongOptThrowsException() {
        try {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("must specify longopt", e.getMessage());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithInvalidOpt() {
        OptionBuilder.create("invalid");
    }

    @Test
    public void testCreateWithLongOptOnly() {
        OptionBuilder.withLongOpt("longOpt");
        Option option = OptionBuilder.create();
        assertNull(option.getOpt());
        assertEquals("longOpt", option.getLongOpt());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
        assertFalse(option.isRequired());
    }

    @Test
    public void testHasArgWithBoolean() {
        OptionBuilder.withLongOpt("opt");
        OptionBuilder.hasArg(true);
        Option option = OptionBuilder.create('o');
        assertTrue(option.hasArg());
        OptionBuilder.reset();
        OptionBuilder.withLongOpt("opt2");
        OptionBuilder.hasArg(false);
        option = OptionBuilder.create('p');
        assertFalse(option.hasArg());
    }

    @Test
    public void testIsRequired() {
        OptionBuilder.withLongOpt("req");
        OptionBuilder.isRequired(true);
        Option op1 = OptionBuilder.create('r');
        assertTrue(op1.isRequired());
        OptionBuilder.withLongOpt("req2");
        OptionBuilder.isRequired(false);
        Option op2 = OptionBuilder.create('s');
        assertFalse(op2.isRequired());
    }

    @Test
    public void testHasArgs() {
        OptionBuilder.withLongOpt("args");
        OptionBuilder.hasArgs();
        Option option = OptionBuilder.create('a');
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    @Test
    public void testHasArgsWithNumber() {
        OptionBuilder.withLongOpt("numArgs");
        OptionBuilder.hasArgs(3);
        Option option = OptionBuilder.create('n');
        assertEquals(3, option.getArgs());
    }

    @Test
    public void testHasOptionalArg() {
        OptionBuilder.withLongOpt("optional");
        OptionBuilder.hasOptionalArg();
        Option option = OptionBuilder.create('o');
        assertTrue(option.hasOptionalArg());
        assertEquals(1, option.getArgs());
    }

    @Test
    public void testHasOptionalArgs() {
        OptionBuilder.withLongOpt("optionalArgs");
        OptionBuilder.hasOptionalArgs();
        Option option = OptionBuilder.create('a');
        assertTrue(option.hasOptionalArg());
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    @Test
    public void testHasOptionalArgsWithNumber() {
        OptionBuilder.withLongOpt("optionalArgsNum");
        OptionBuilder.hasOptionalArgs(2);
        Option option = OptionBuilder.create('b');
        assertTrue(option.hasOptionalArg());
        assertEquals(2, option.getArgs());
    }

    @Test
    public void testWithType() {
        OptionBuilder.withLongOpt("typed");
        OptionBuilder.withType(Integer.class);
        Option option = OptionBuilder.create('t');
        assertEquals(Integer.class, option.getType());
    }

    @Test
    public void testWithDescription() {
        String desc = "Test description";
        OptionBuilder.withLongOpt("desc");
        OptionBuilder.withDescription(desc);
        Option option = OptionBuilder.create('d');
        assertEquals(desc, option.getDescription());
    }

    @Test
    public void testWithValueSeparator() {
        OptionBuilder.withLongOpt("sep");
        OptionBuilder.withValueSeparator(':');
        Option option = OptionBuilder.create('s');
        assertEquals(':', option.getValueSeparator());
    }

    @Test
    public void testWithValueSeparatorDefault() {
        OptionBuilder.withLongOpt("sepDefault");
        OptionBuilder.withValueSeparator();
        Option option = OptionBuilder.create('e');
        assertEquals('=', option.getValueSeparator());
    }

    @Test
    public void testCreateResetsBuilder() {
        OptionBuilder.withLongOpt("temp");
        OptionBuilder.hasArgs(4);
        OptionBuilder.isRequired();
        OptionBuilder.withType(String.class);
        OptionBuilder.withDescription("temp");
        OptionBuilder.withValueSeparator(';');
        OptionBuilder.withArgName("argName");
        OptionBuilder.create('x');
        OptionBuilder.withLongOpt("newOpt");
        Option option = OptionBuilder.create('y');
        assertEquals("newOpt", option.getLongOpt());
        assertFalse(option.isRequired());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
        assertNull(option.getType());
        assertEquals("arg", option.getArgName());
        assertEquals((char) 0, option.getValueSeparator());
    }

    @Test
    public void testWithArgName() {
        String argName = "myArg";
        OptionBuilder.withLongOpt("namedArg");
        OptionBuilder.withArgName(argName);
        Option option = OptionBuilder.create('a');
        assertEquals(argName, option.getArgName());
    }
}