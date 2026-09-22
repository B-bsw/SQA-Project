package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class OptionTest {
    private Option option;

    @Before
    public void setUp() {
        option = new Option("a", "longA", false, "desc");
    }

    @Test
    public void testConstructors() {
        Option opt1 = new Option("b", "desc2");
        assertEquals("b", opt1.getOpt());
        assertNull(opt1.getLongOpt());
        assertFalse(opt1.hasArg());
        assertEquals("desc2", opt1.getDescription());

        Option opt2 = new Option("c", true, "desc3");
        assertTrue(opt2.hasArg());
        assertEquals(1, opt2.getArgs());
        assertNull(opt2.getLongOpt());

        Option opt3 = new Option("d", "longD", true, "desc4");
        assertEquals("d", opt3.getOpt());
        assertEquals("longD", opt3.getLongOpt());
        assertTrue(opt3.hasArg());
        assertEquals(1, opt3.getArgs());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOption() {
        new Option("invalid option", "desc");
    }

    @Test
    public void testGetId() {
        assertEquals('a', option.getId());
    }

    @Test
    public void testGetKey() {
        assertEquals("a", option.getKey());
        Option longOpt = new Option(null, "longOnly", false, "desc");
        assertEquals("longOnly", longOpt.getKey());
    }

    @Test
    public void testSetTypeAndGetType() {
        assertNull(option.getType());
        Object type = new Object();
        option.setType(type);
        assertSame(type, option.getType());
    }

    @Test
    public void testSetLongOptAndHasLongOpt() {
        assertTrue(option.hasLongOpt());
        assertEquals("longA", option.getLongOpt());
        option.setLongOpt("newLong");
        assertEquals("newLong", option.getLongOpt());
        Option opt = new Option("a", "desc");
        assertFalse(opt.hasLongOpt());
        opt.setLongOpt(null);
        assertFalse(opt.hasLongOpt());
    }

    @Test
    public void testSetOptionalArgAndHasOptionalArg() {
        assertFalse(option.hasOptionalArg());
        option.setOptionalArg(true);
        assertTrue(option.hasOptionalArg());
        option.setOptionalArg(false);
        assertFalse(option.hasOptionalArg());
    }

    @Test
    public void testHasArg() {
        assertFalse(option.hasArg());
        option.setOptionalArg(true);
        assertFalse(option.hasArg());
        option.setArgs(2);
        assertTrue(option.hasArg());
        option.setArgs(0);
        assertFalse(option.hasArg());
        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.hasArg());
    }

    @Test
    public void testSetDescriptionAndGetDescription() {
        assertEquals("desc", option.getDescription());
        option.setDescription("newDesc");
        assertEquals("newDesc", option.getDescription());
        option.setDescription(null);
        assertNull(option.getDescription());
    }

    @Test
    public void testIsRequiredAndSetRequired() {
        assertFalse(option.isRequired());
        option.setRequired(true);
        assertTrue(option.isRequired());
        option.setRequired(false);
        assertFalse(option.isRequired());
    }

    @Test
    public void testSetArgNameAndGetArgName() {
        assertEquals("arg", option.getArgName());
        option.setArgName("myArg");
        assertEquals("myArg", option.getArgName());
        assertTrue(option.hasArgName());
        option.setArgName(null);
        assertFalse(option.hasArgName());
        option.setArgName("");
        assertFalse(option.hasArgName());
        assertEquals("", option.getArgName());
    }

    @Test
    public void testHasArgs() {
        assertFalse(option.hasArgs());
        option.setArgs(2);
        assertTrue(option.hasArgs());
        option.setArgs(1);
        assertFalse(option.hasArgs());
        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.hasArgs());
        option.setArgs(0);
        assertFalse(option.hasArgs());
        option.setArgs(1);
        assertFalse(option.hasArgs());
        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.hasArgs());
    }

    @Test
    public void testSetArgsAndGetArgs() {
        assertEquals(Option.UNINITIALIZED, option.getArgs());
        option.setArgs(5);
        assertEquals(5, option.getArgs());
        option.setArgs(Option.UNLIMITED_VALUES);
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
        option.setArgs(0);
        assertEquals(0, option.getArgs());
    }

    @Test
    public void testSetValueSeparatorAndGetValueSeparator() {
        assertEquals('\0', option.getValueSeparator());
        option.setValueSeparator('=');
        assertEquals('=', option.getValueSeparator());
        assertTrue(option.hasValueSeparator());
        option.setValueSeparator('\0');
        assertFalse(option.hasValueSeparator());
    }

    @Test
    public void testAddValueForProcessingNoArgsAllowed() {
        try {
            option.addValueForProcessing("value");
            fail("Should have thrown RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("NO_ARGS_ALLOWED", e.getMessage());
        }
    }

    @Test
    public void testAddValueForProcessingWithArgs() {
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("value1");
        assertEquals("value1", opt.getValue());
        assertEquals(1, opt.getValuesList().size());
    }

    @Test
    public void testAddValueForProcessingWithMultipleArgs() {
        Option opt = new Option("a", "long", true, "desc");
        opt.setArgs(3);
        opt.addValueForProcessing("value1");
        opt.addValueForProcessing("value2");
        opt.addValueForProcessing("value3");
        assertEquals(3, opt.getValuesList().size());
        assertEquals("value2", opt.getValue(1));
    }

    @Test
    public void testAddValueForProcessingWithSeparator() {
        Option opt = new Option("a", true, "desc");
        opt.setValueSeparator(':');
        opt.addValueForProcessing("v1:v2:v3");
        assertEquals(2, opt.getValuesList().size());
        assertEquals("v1", opt.getValue(0));
        assertEquals("v2:v3", opt.getValue(1));
    }

    @Test
    public void testAddValueForProcessingWithSeparatorExact() {
        Option opt = new Option("a", "long", true, "desc");
        opt.setArgs(2);
        opt.setValueSeparator(':');
        opt.addValueForProcessing("v1:v2");
        assertEquals(2, opt.getValuesList().size());
        assertEquals("v1", opt.getValue(0));
        assertEquals("v2", opt.getValue(1));
    }

    @Test
    public void testAddValueForProcessingWithSeparatorTooMany() {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(2);
        opt.setValueSeparator(':');
        opt.addValueForProcessing("v1:v2:v3");
        assertEquals(2, opt.getValuesList().size());
        assertEquals("v1", opt.getValue(0));
        assertEquals("v2", opt.getValue(1));
    }

    @Test
    public void testAddValueForProcessingWithSeparatorNoValues() {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(3);
        opt.setValueSeparator(':');
        opt.addValueForProcessing("v1:");
        assertEquals(1, opt.getValuesList().size());
        assertEquals("v1", opt.getValue(0));
    }

    @Test
    public void testGetValue() {
        assertNull(option.getValue());
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("value");
        assertEquals("value", opt.getValue());
        opt.addValueForProcessing("value2");
        assertEquals("value", opt.getValue());
    }

    @Test
    public void testGetValueIndex() {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(2);
        opt.addValueForProcessing("v1");
        opt.addValueForProcessing("v2");
        assertEquals("v1", opt.getValue(0));
        assertEquals("v2", opt.getValue(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueIndexOutOfBounds() {
        option.getValue(0);
    }

    @Test
    public void testGetValueDefault() {
        assertEquals("default", option.getValue("default"));
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("value");
        assertEquals("value", opt.getValue("default"));
    }

    @Test
    public void testGetValuesNull() {
        assertNull(option.getValues());
    }

    @Test
    public void testGetValues() {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(2);
        opt.addValueForProcessing("v1");
        opt.addValueForProcessing("v2");
        String[] values = opt.getValues();
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("v1", values[0]);
        assertEquals("v2", values[1]);
    }

    @Test
    public void testGetValuesList() {
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("v1");
        List list = opt.getValuesList();
        assertNotNull(list);
        assertEquals(1, list.size());
        assertEquals("v1", list.get(0));
    }

    @Test
    public void testToString() {
        Option opt = new Option("a", true, "desc");
        assertEquals("[ option: a [ARG] :: desc ]", opt.toString());
        opt.setLongOpt("long");
        assertEquals("[ option: a long [ARG] :: desc ]", opt.toString());
        opt.setArgs(3);
        assertEquals("[ option: a long [ARG...] :: desc ]", opt.toString());
        opt.setType(String.class);
        assertEquals("[ option: a long [ARG...] :: desc :: class java.lang.String ]", opt.toString());
    }

    @Test
    public void testEquals() {
        assertFalse(option.equals(null));
        assertFalse(option.equals(new Object()));
        assertTrue(option.equals(option));
        Option same = new Option("a", "longA", false, "desc");
        assertTrue(option.equals(same));
        Option diffShort = new Option("b", "longA", false, "desc");
        assertFalse(option.equals(diffShort));
        Option diffLong = new Option("a", "longB", false, "desc");
        assertFalse(option.equals(diffLong));
        Option diffBoth = new Option("b", "longB", false, "desc");
        assertFalse(option.equals(diffBoth));
        Option optNullShort = new Option(null, "longA", false, "desc");
        assertFalse(optNullShort.equals(option));
        assertFalse(option.equals(optNullShort));
        Option bothNullShort = new Option(null, "longA", false, "desc");
        Option bothNullShort2 = new Option(null, "longA", false, "desc");
        assertTrue(bothNullShort.equals(bothNullShort2));
        Option optNullLong = new Option("a", null, false, "desc");
        assertFalse(optNullLong.equals(option));
        Option bothNullLong = new Option("a", null, false, "desc");
        assertTrue(bothNullLong.equals(new Option("a", null, false, "desc")));
    }

    @Test
    public void testHashCode() {
        Option same = new Option("a", "longA", false, "desc");
        assertEquals(option.hashCode(), same.hashCode());
        Option diff = new Option("b", "longA", false, "desc");
        assertNotSame(option.hashCode(), diff.hashCode());
        Option optNullShort = new Option(null, "longA", false, "desc");
        Option optNullShort2 = new Option(null, "longA", false, "desc");
        assertEquals(optNullShort.hashCode(), optNullShort2.hashCode());
        Option optNullLong = new Option("a", null, false, "desc");
        assertNotSame(optNullLong.hashCode(), option.hashCode());
    }

    @Test
    public void testClone() {
        Option opt = new Option("a", "longA", true, "desc");
        opt.addValueForProcessing("value");
        try {
            Option cloned = (Option) opt.clone();
            assertNotSame(opt, cloned);
            assertEquals(opt.getOpt(), cloned.getOpt());
            assertEquals(opt.getLongOpt(), cloned.getLongOpt());
            assertEquals(opt.hasArg(), cloned.hasArg());
            assertEquals(opt.getDescription(), cloned.getDescription());
            assertNotSame(opt.getValuesList(), cloned.getValuesList());
            assertEquals(opt.getValuesList(), cloned.getValuesList());
        } catch (CloneNotSupportedException e) {
            fail("Clone should be supported");
        }
    }

    @Test
    public void testHasNoValues() {
        Option opt = new Option("a", true, "desc");
        assertTrue(opt.getValuesList().isEmpty());
        opt.addValueForProcessing("value");
        assertFalse(opt.getValuesList().isEmpty());
    }

    @Test
    public void testAddValueForProcessingWithLimit() {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(2);
        opt.addValueForProcessing("v1");
        assertTrue(opt.acceptsArg());
        opt.addValueForProcessing("v2");
        assertFalse(opt.acceptsArg());
        assertEquals(2, opt.getValuesList().size());
    }

    @Test
    public void testAddValueForProcessingNoLimit() {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(Option.UNLIMITED_VALUES);
        opt.addValueForProcessing("v1");
        opt.addValueForProcessing("v2");
        assertTrue(opt.acceptsArg());
        assertEquals(2, opt.getValuesList().size());
    }

    @Test
    public void testAcceptsArg() {
        assertFalse(option.acceptsArg());
        option.setOptionalArg(true);
        assertTrue(option.acceptsArg());
    }
}