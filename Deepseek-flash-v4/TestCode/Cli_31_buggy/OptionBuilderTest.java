package org.apache.commons.cli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class OptionBuilderTest {
    private Field longoptField;
    private Field descriptionField;
    private Field argNameField;
    private Field requiredField;
    private Field numberOfArgsField;
    private Field typeField;
    private Field optionalArgField;
    private Field valuesepField;

    @Before
    public void setUp() throws Exception {
        longoptField = OptionBuilder.class.getDeclaredField("longopt");
        descriptionField = OptionBuilder.class.getDeclaredField("description");
        argNameField = OptionBuilder.class.getDeclaredField("argName");
        requiredField = OptionBuilder.class.getDeclaredField("required");
        numberOfArgsField = OptionBuilder.class.getDeclaredField("numberOfArgs");
        typeField = OptionBuilder.class.getDeclaredField("type");
        optionalArgField = OptionBuilder.class.getDeclaredField("optionalArg");
        valuesepField = OptionBuilder.class.getDeclaredField("valuesep");

        longoptField.setAccessible(true);
        descriptionField.setAccessible(true);
        argNameField.setAccessible(true);
        requiredField.setAccessible(true);
        numberOfArgsField.setAccessible(true);
        typeField.setAccessible(true);
        optionalArgField.setAccessible(true);
        valuesepField.setAccessible(true);

        // Reset to defaults via create() or reflection
        OptionBuilder.create('x'); // this triggers reset
    }

    @After
    public void tearDown() throws Exception {
        // Clean up to avoid affecting other tests
        OptionBuilder.create('x'); // resets values
    }

    @Test
    public void testWithLongOpt_setsLongOpt() throws Exception {
        OptionBuilder.withLongOpt("test-long");
        assertEquals("test-long", longoptField.get(null));
    }

    @Test
    public void testWithLongOpt_returnsBuilderInstance() {
        assertSame(OptionBuilder.instance, OptionBuilder.withLongOpt("x"));
    }

    @Test
    public void testHasArg_setsNumberOfArgsToOne() throws Exception {
        OptionBuilder.hasArg();
        assertEquals(1, numberOfArgsField.getInt(null));
    }

    @Test
    public void testHasArgTrue_setsNumberOfArgsToOne() throws Exception {
        OptionBuilder.hasArg(true);
        assertEquals(1, numberOfArgsField.getInt(null));
    }

    @Test
    public void testHasArgFalse_setsNumberOfArgsToUninitialized() throws Exception {
        OptionBuilder.hasArg(false);
        assertEquals(Option.UNINITIALIZED, numberOfArgsField.getInt(null));
    }

    @Test
    public void testWithArgName_setsArgName() throws Exception {
        OptionBuilder.withArgName("myArg");
        assertEquals("myArg", argNameField.get(null));
    }

    @Test
    public void testIsRequired_setsRequiredTrue() throws Exception {
        OptionBuilder.isRequired();
        assertTrue(requiredField.getBoolean(null));
    }

    @Test
    public void testIsRequiredTrue_setsRequiredTrue() throws Exception {
        OptionBuilder.isRequired(true);
        assertTrue(requiredField.getBoolean(null));
    }

    @Test
    public void testIsRequiredFalse_setsRequiredFalse() throws Exception {
        OptionBuilder.isRequired(false);
        assertFalse(requiredField.getBoolean(null));
    }

    @Test
    public void testWithValueSeparator_setsSeparatorToEquals() throws Exception {
        OptionBuilder.withValueSeparator();
        assertEquals('=', valuesepField.getChar(null));
    }

    @Test
    public void testWithValueSeparatorChar_setsSeparator() throws Exception {
        OptionBuilder.withValueSeparator(':');
        assertEquals(':', valuesepField.getChar(null));
    }

    @Test
    public void testHasArgs_setsNumberOfArgsToUnlimited() throws Exception {
        OptionBuilder.hasArgs();
        assertEquals(Option.UNLIMITED_VALUES, numberOfArgsField.getInt(null));
    }

    @Test
    public void testHasArgsInt_setsNumberOfArgs() throws Exception {
        OptionBuilder.hasArgs(5);
        assertEquals(5, numberOfArgsField.getInt(null));
    }

    @Test
    public void testHasOptionalArg_setsArgsToOneAndOptionalTrue() throws Exception {
        OptionBuilder.hasOptionalArg();
        assertEquals(1, numberOfArgsField.getInt(null));
        assertTrue(optionalArgField.getBoolean(null));
    }

    @Test
    public void testHasOptionalArgs_setsArgsToUnlimitedAndOptionalTrue() throws Exception {
        OptionBuilder.hasOptionalArgs();
        assertEquals(Option.UNLIMITED_VALUES, numberOfArgsField.getInt(null));
        assertTrue(optionalArgField.getBoolean(null));
    }

    @Test
    public void testHasOptionalArgsInt_setsArgsAndOptionalTrue() throws Exception {
        OptionBuilder.hasOptionalArgs(3);
        assertEquals(3, numberOfArgsField.getInt(null));
        assertTrue(optionalArgField.getBoolean(null));
    }

    @Test
    public void testWithType_setsType() throws Exception {
        Object type = new Object();
        OptionBuilder.withType(type);
        assertSame(type, typeField.get(null));
    }

    @Test
    public void testWithDescription_setsDescription() throws Exception {
        OptionBuilder.withDescription("desc");
        assertEquals("desc", descriptionField.get(null));
    }

    @Test
    public void testCreate_char_createsOption() {
        Option opt = OptionBuilder.create('a');
        assertNotNull(opt);
        assertEquals("a", opt.getOpt());
        assertEquals("arg", opt.getArgName());
        assertEquals(-1, opt.getArgs());
        assertFalse(opt.isRequired());
        assertFalse(opt.hasOptionalArg());
        assertNull(opt.getLongOpt());
        assertNull(opt.getType());
        assertEquals(0, opt.getValueSeparator());
    }

    @Test
    public void testCreate_noLongOpt_throwsIllegalArgumentException() {
        try {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("must specify longopt", e.getMessage());
        }
    }

    @Test
    public void testCreate_withLongOpt_createsOptionWithLongOpt() {
        OptionBuilder.withLongOpt("long-opt");
        Option opt = OptionBuilder.create('l');
        assertNotNull(opt);
        assertEquals("long-opt", opt.getLongOpt());
    }

    @Test
    public void testCreate_resetsStateAfterCreation() {
        OptionBuilder.withLongOpt("long").hasArg().isRequired();
        OptionBuilder.create('x');
        
        // After create, all values should be reset
        assertEquals(Option.UNINITIALIZED, numberOfArgsField.getInt(null));
        assertFalse(requiredField.getBoolean(null));
        assertFalse(optionalArgField.getBoolean(null));
        assertNull(longoptField.get(null));
        assertNull(descriptionField.get(null));
        assertNull(typeField.get(null));
        assertEquals("arg", argNameField.get(null));
        assertEquals((char) 0, valuesepField.getChar(null));
    }

    @Test
    public void testCreate_withAllAttributes_appliesThemToOption() {
        OptionBuilder.withLongOpt("long")
                .withDescription("description")
                .withArgName("name")
                .isRequired()
                .hasArg()
                .withType(String.class)
                .withValueSeparator(':');

        Option opt = OptionBuilder.create('d');
        
        assertNotNull(opt);
        assertEquals("long", opt.getLongOpt());
        assertEquals("description", opt.getDescription());
        assertEquals("name", opt.getArgName());
        assertTrue(opt.isRequired());
        assertEquals(1, opt.getArgs());
        assertEquals(String.class, opt.getType());
        assertEquals(':', opt.getValueSeparator());
    }

    @Test
    public void testCreate_char_invalidOption_throws() {
        try {
            OptionBuilder.create('');
            fail("Expected IllegalArgumentException for empty string");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCreate_resetsEvenWhenOptionInvalid() {
        OptionBuilder.withLongOpt("long");
        try {
            OptionBuilder.create("invalid opt with spaces");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        // State should be reset
        assertNull(longoptField.get(null));
        assertEquals(Option.UNINITIALIZED, numberOfArgsField.getInt(null));
        assertFalse(requiredField.getBoolean(null));
        assertFalse(optionalArgField.getBoolean(null));
        assertEquals("arg", argNameField.get(null));
        assertNull(descriptionField.get(null));
        assertNull(typeField.get(null));
        assertEquals((char) 0, valuesepField.getChar(null));
    }

    @Test
    public void testCreate_returnsInstanceSameForAllCalls() {
        OptionBuilder builder1 = OptionBuilder.withLongOpt("a");
        OptionBuilder builder2 = OptionBuilder.withLongOpt("b");
        assertSame(builder1, builder2);
        assertSame(OptionBuilder.instance, builder1);
    }
}