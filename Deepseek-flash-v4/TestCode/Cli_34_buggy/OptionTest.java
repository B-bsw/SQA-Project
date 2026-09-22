import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class OptionTest {
    private Option option;

    @Before
    public void setUp() {
        option = new Option("a", "longA", false, "test option");
    }

    @After
    public void tearDown() {
        option = null;
    }

    @Test
    public void testConstructorWithHasArg() {
        Option opt = new Option("b", "longB", true, "desc");
        assertEquals("b", opt.getOpt());
        assertEquals("longB", opt.getLongOpt());
        assertEquals("desc", opt.getDescription());
        assertEquals(1, opt.getArgs());
        assertTrue(opt.hasArg());
        assertFalse(opt.hasArgs());
    }

    @Test
    public void testConstructorWithoutHasArg() {
        Option opt = new Option("c", "longC", false, "desc");
        assertEquals("c", opt.getOpt());
        assertEquals("longC", opt.getLongOpt());
        assertEquals(-1, opt.getArgs());
        assertFalse(opt.hasArg());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidOption() {
        new Option("", "longD", true, "desc");
    }

    @Test
    public void testGetId() {
        assertEquals('a', option.getId());
    }

    @Test
    public void testGetKeyWithOpt() {
        assertEquals("a", option.getKey());
    }

    @Test
    public void testGetKeyWithoutOpt() {
        Option opt = new Option(null, "longE", false, "desc");
        assertEquals("longE", opt.getKey());
    }

    @Test
    public void testGetOpt() {
        assertEquals("a", option.getOpt());
    }

    @Test
    public void testGetTypeAndSetType() {
        assertNull(option.getType());
        Class type = String.class;
        option.setType(type);
        assertEquals(type, option.getType());
    }

    @Test
    public void testGetLongOptAndSetLongOpt() {
        option.setLongOpt("newLong");
        assertEquals("newLong", option.getLongOpt());
    }

    @Test
    public void testSetOptionalArgAndHasOptionalArg() {
        assertFalse(option.hasOptionalArg());
        option.setOptionalArg(true);
        assertTrue(option.hasOptionalArg());
    }

    @Test
    public void testHasLongOpt() {
        assertTrue(option.hasLongOpt());
        Option opt = new Option("f", null, false, "desc");
        assertFalse(opt.hasLongOpt());
    }

    @Test
    public void testHasArgWithNumberOfArgs() {
        Option opt = new Option("g", true, "desc");
        assertTrue(opt.hasArg());
        Option opt2 = new Option("h", false, "desc");
        assertFalse(opt2.hasArg());
    }

    @Test
    public void testGetDescriptionAndSetDescription() {
        assertEquals("test option", option.getDescription());
        option.setDescription("new description");
        assertEquals("new description", option.getDescription());
    }

    @Test
    public void testIsRequiredAndSetRequired() {
        assertFalse(option.isRequired());
        option.setRequired(true);
        assertTrue(option.isRequired());
    }

    @Test
    public void testSetArgNameAndGetArgName() {
        assertNull(option.getArgName());
        option.setArgName("argName");
        assertEquals("argName", option.getArgName());
    }

    @Test
    public void testHasArgName() {
        assertFalse(option.hasArgName());
        option.setArgName("arg");
        assertTrue(option.hasArgName());
        option.setArgName("");
        assertFalse(option.hasArgName());
    }

    @Test
    public void testHasArgs() {
        Option opt = new Option("i", false, "desc");
        opt.setArgs(2);
        assertTrue(opt.hasArgs());
        opt.setArgs(1);
        assertFalse(opt.hasArgs());
        opt.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(opt.hasArgs());
    }

    @Test
    public void testSetArgsAndGetArgs() {
        option.setArgs(3);
        assertEquals(3, option.getArgs());
    }

    @Test
    public void testSetValueSeparatorAndGetValueSeparator() {
        assertEquals(0, option.getValueSeparator());
        option.setValueSeparator('=');
        assertEquals('=', option.getValueSeparator());
    }

    @Test
    public void testHasValueSeparator() {
        assertFalse(option.hasValueSeparator());
        option.setValueSeparator('=');
        assertTrue(option.hasValueSeparator());
    }

    @Test
    public void testAddValueForProcessing() {
        Option opt = new Option("j", true, "desc");
        opt.addValueForProcessing("value1");
        assertEquals("value1", opt.getValue());
    }

    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessingWithNoArgsAllowed() {
        option.addValueForProcessing("value");
    }

    @Test
    public void testAddValueForProcessingWithSeperator() {
        Option opt = new Option("k", true, "desc");
        opt.setArgs(3);
        opt.setValueSeparator('=');
        opt.addValueForProcessing("a=b=c");
        assertEquals(3, opt.getValues().length);
        assertEquals("a", opt.getValue(0));
        assertEquals("b", opt.getValue(1));
        assertEquals("c", opt.getValue(2));
    }

    @Test
    public void testGetValueWithDefault() {
        assertEquals("default", option.getValue("default"));
        option.addValueForProcessing("actual");
        assertEquals("actual", option.getValue("default"));
    }

    @Test
    public void testGetValues() {
        assertNull(option.getValues());
        Option opt = new Option("l", true, "desc");
        opt.addValueForProcessing("v1");
        opt.addValueForProcessing("v2");
        String[] values = opt.getValues();
        assertEquals(2, values.length);
        assertEquals("v1", values[0]);
        assertEquals("v2", values[1]);
    }

    @Test
    public void testGetValuesList() {
        Option opt = new Option("m", true, "desc");
        opt.addValueForProcessing("v1");
        opt.addValueForProcessing("v2");
        List values = opt.getValuesList();
        assertEquals(2, values.size());
        assertEquals("v1", values.get(0));
        assertEquals("v2", values.get(1));
    }

    @Test
    public void testToStringWithAllFields() {
        Option opt = new Option("n", "longN", true, "desc");
        opt.setValueSeparator('=');
        opt.setType(String.class);
        String result = opt.toString();
        assertTrue(result.contains("[ option: n longN [ARG] :: desc :: class java.lang.String ]"));
    }

    @Test
    public void testToStringWithoutOptionalFields() {
        Option opt = new Option("o", false, "desc");
        String result = opt.toString();
        assertTrue(result.contains("[ option: o  :: desc ]"));
    }

    @Test
    public void testEqualsAndHashCode() {
        Option opt1 = new Option("p", "longP", false, "desc");
        Option opt2 = new Option("p", "longP", false, "desc");
        Option opt3 = new Option("q", "longQ", false, "desc");
        Option opt4 = new Option("p", null, false, "desc");
        Option opt5 = new Option(null, "longP", false, "desc");
        Option opt6 = new Option(null, null, false, "desc");

        assertEquals(opt1, opt1);
        assertNotEquals(opt1, null);
        assertNotEquals(opt1, new Object());
        assertEquals(opt1, opt2);
        assertNotEquals(opt1, opt3);
        assertNotEquals(opt1, opt4);
        assertNotEquals(opt4, opt1);
        assertNotEquals(opt4, opt5);
        assertNotEquals(opt5, opt6);
        assertNotEquals(opt6, opt5);
        assertEquals(opt6, new Option(null, null, false, "desc"));
        assertEquals(opt1.hashCode(), opt2.hashCode());
        assertNotEquals(opt1.hashCode(), opt3.hashCode());
    }

    @Test
    public void testClone() {
        Option opt1 = new Option("r", "longR", true, "desc");
        opt1.setArgs(2);
        opt1.setValueSeparator('=');
        Option opt2 = (Option) opt1.clone();
        assertEquals(opt1, opt2);
        assertNotSame(opt1, opt2);
        opt1.addValueForProcessing("value");
        opt2.addValueForProcessing("value2");
        assertNotEquals(opt1.getValue(), opt2.getValue());
    }

    @Test
    public void testHasArgsWithArgsGreaterThanOne() {
        Option opt = new Option("s", true, "desc");
        opt.setArgs(3);
        assertTrue(opt.hasArgs());
    }

    @Test
    public void testHasArgsWithZeroArgs() {
        Option opt = new Option("t", false, "desc");
        opt.setArgs(0);
        assertTrue(opt.hasArgs());
    }

    @Test
    public void testHasArgWithOptionalArg() {
        Option opt = new Option("u", true, "desc");
        opt.setOptionalArg(true);
        assertFalse(opt.hasArg());
    }

    @Test
    public void testGetValueWhenNoValues() {
        Option opt = new Option("v", false, "desc");
        opt.addValueForProcessing("value");
        // Should not throw because acceptsArg returns true
    }

    @Test
    public void testAcceptsArgWithOptionalArg() {
        Option opt = new Option("w", true, "desc");
        opt.setOptionalArg(true);
        assertTrue(opt.acceptsArg());
        opt.addValueForProcessing("value");
        assertFalse(opt.acceptsArg());
    }

    @Test
    public void testAddWithNoArgsAllowed() {
        Option opt = new Option("x", false, "desc");
        try {
            opt.addValueForProcessing("value");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("NO_ARGS_ALLOWED", e.getMessage());
        }
    }

    @Test
    public void testProcessValueWithSeparatorAndMaxArgsReached() {
        Option opt = new Option("y", true, "desc");
        opt.setArgs(2);
        opt.setValueSeparator('=');
        opt.addValueForProcessing("a=b=c");
        String[] values = opt.getValues();
        assertEquals(2, values.length);
        assertEquals("a", values[0]);
        assertEquals("b", values[1]);
    }
}