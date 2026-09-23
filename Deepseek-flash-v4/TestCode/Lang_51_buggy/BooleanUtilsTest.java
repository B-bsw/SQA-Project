package org.apache.commons.lang;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class BooleanUtilsTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testNegate() {
        assertNull(BooleanUtils.negate(null));
        assertEquals(Boolean.FALSE, BooleanUtils.negate(Boolean.TRUE));
        assertEquals(Boolean.TRUE, BooleanUtils.negate(Boolean.FALSE));
    }

    @Test
    public void testIsTrue() {
        assertFalse(BooleanUtils.isTrue(null));
        assertFalse(BooleanUtils.isTrue(Boolean.FALSE));
        assertTrue(BooleanUtils.isTrue(Boolean.TRUE));
    }

    @Test
    public void testIsNotTrue() {
        assertTrue(BooleanUtils.isNotTrue(null));
        assertTrue(BooleanUtils.isNotTrue(Boolean.FALSE));
        assertFalse(BooleanUtils.isNotTrue(Boolean.TRUE));
    }

    @Test
    public void testIsFalse() {
        assertFalse(BooleanUtils.isFalse(null));
        assertFalse(BooleanUtils.isFalse(Boolean.FALSE));
        assertTrue(BooleanUtils.isFalse(Boolean.TRUE));
    }

    @Test
    public void testIsNotFalse() {
        assertTrue(BooleanUtils.isNotFalse(null));
        assertTrue(BooleanUtils.isNotFalse(Boolean.FALSE));
        assertFalse(BooleanUtils.isNotFalse(Boolean.TRUE));
    }

    @Test
    public void testToBooleanObject_boolean() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(true));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(false));
    }

    @Test
    public void testToBoolean_Boolean() {
        assertFalse(BooleanUtils.toBoolean((Boolean) null));
        assertFalse(BooleanUtils.toBoolean(Boolean.FALSE));
        assertTrue(BooleanUtils.toBoolean(Boolean.TRUE));
    }

    @Test
    public void testToBooleanDefaultIfNull() {
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(null, false));
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(null, true));
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true));
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false));
    }

    @Test
    public void testToBoolean_int() {
        assertFalse(BooleanUtils.toBoolean(0));
        assertTrue(BooleanUtils.toBoolean(1));
    }

    @Test
    public void testToBooleanObject_int() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(0));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(1));
    }

    @Test
    public void testToBooleanObject_Integer() {
        assertNull(BooleanUtils.toBooleanObject((Integer) null));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(Integer.valueOf(0)));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(1)));
    }

    @Test
    public void testToBoolean_int_int_int() {
        assertTrue(BooleanUtils.toBoolean(1, 1, 0));
        assertFalse(BooleanUtils.toBoolean(0, 1, 0));
        try {
            BooleanUtils.toBoolean(2, 1, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToBoolean_Integer_Integer_Integer() {
        assertTrue(BooleanUtils.toBoolean((Integer) null, (Integer) null, Integer.valueOf(0)));
        assertFalse(BooleanUtils.toBoolean((Integer) null, Integer.valueOf(1), (Integer) null));
        assertTrue(BooleanUtils.toBoolean(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0)));
        assertFalse(BooleanUtils.toBoolean(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0)));
        try {
            BooleanUtils.toBoolean(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToBooleanObject_int_int_int_int() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(1, 1, 0, 2));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(0, 1, 0, 2));
        assertNull(BooleanUtils.toBooleanObject(2, 1, 0, 2));
        try {
            BooleanUtils.toBooleanObject(3, 1, 0, 2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToBooleanObject_Integer_Integer_Integer_Integer() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject((Integer) null, (Integer) null, Integer.valueOf(0), Integer.valueOf(2)));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject((Integer) null, Integer.valueOf(1), (Integer) null, Integer.valueOf(2)));
        assertNull(BooleanUtils.toBooleanObject((Integer) null, Integer.valueOf(1), Integer.valueOf(0), (Integer) null));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2)));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2)));
        assertNull(BooleanUtils.toBooleanObject(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2)));
        try {
            BooleanUtils.toBooleanObject(Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToInteger_boolean() {
        assertEquals(1, BooleanUtils.toInteger(true));
        assertEquals(0, BooleanUtils.toInteger(false));
    }

    @Test
    public void testToIntegerObject_boolean() {
        assertEquals(Integer.valueOf(1), BooleanUtils.toIntegerObject(true));
        assertEquals(Integer.valueOf(0), BooleanUtils.toIntegerObject(false));
    }

    @Test
    public void testToIntegerObject_Boolean() {
        assertNull(BooleanUtils.toIntegerObject((Boolean) null));
        assertEquals(Integer.valueOf(1), BooleanUtils.toIntegerObject(Boolean.TRUE));
        assertEquals(Integer.valueOf(0), BooleanUtils.toIntegerObject(Boolean.FALSE));
    }

    @Test
    public void testToInteger_boolean_int_int() {
        assertEquals(5, BooleanUtils.toInteger(true, 5, 6));
        assertEquals(6, BooleanUtils.toInteger(false, 5, 6));
    }

    @Test
    public void testToInteger_Boolean_int_int_int() {
        assertEquals(7, BooleanUtils.toInteger((Boolean) null, 5, 6, 7));
        assertEquals(5, BooleanUtils.toInteger(Boolean.TRUE, 5, 6, 7));
        assertEquals(6, BooleanUtils.toInteger(Boolean.FALSE, 5, 6, 7));
    }

    @Test
    public void testToIntegerObject_boolean_Integer_Integer() {
        assertEquals(Integer.valueOf(5), BooleanUtils.toIntegerObject(true, Integer.valueOf(5), Integer.valueOf(6)));
        assertEquals(Integer.valueOf(6), BooleanUtils.toIntegerObject(false, Integer.valueOf(5), Integer.valueOf(6)));
    }

    @Test
    public void testToIntegerObject_Boolean_Integer_Integer_Integer() {
        assertEquals(Integer.valueOf(7), BooleanUtils.toIntegerObject((Boolean) null, Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7)));
        assertEquals(Integer.valueOf(5), BooleanUtils.toIntegerObject(Boolean.TRUE, Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7)));
        assertEquals(Integer.valueOf(6), BooleanUtils.toIntegerObject(Boolean.FALSE, Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7)));
    }

    @Test
    public void testToBooleanObject_String() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("true"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("false"));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("on"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("off"));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("yes"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("no"));
        assertNull(BooleanUtils.toBooleanObject("invalid"));
        assertNull(BooleanUtils.toBooleanObject((String) null));
    }

    @Test
    public void testToBooleanObject_String_String_String_String() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject((String) null, (String) null, "false", "null"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject((String) null, "true", (String) null, "null"));
        assertNull(BooleanUtils.toBooleanObject((String) null, "true", "false", (String) null));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("match", "match", "false", "null"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("match", "true", "match", "null"));
        assertNull(BooleanUtils.toBooleanObject("match", "true", "false", "match"));
        try {
            BooleanUtils.toBooleanObject("nomatch", "true", "false", "null");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToBoolean_String() {
        assertTrue(BooleanUtils.toBoolean("true"));
        assertFalse(BooleanUtils.toBoolean("false"));
        assertTrue(BooleanUtils.toBoolean("on"));
        assertFalse(BooleanUtils.toBoolean("off"));
        assertTrue(BooleanUtils.toBoolean("yes"));
        assertFalse(BooleanUtils.toBoolean("no"));
        assertFalse(BooleanUtils.toBoolean((String) null));
        assertFalse(BooleanUtils.toBoolean("invalid"));
        assertFalse(BooleanUtils.toBoolean(""));
    }

    @Test
    public void testToBoolean_String_String_String() {
        assertTrue(BooleanUtils.toBoolean((String) null, (String) null, "false"));
        assertFalse(BooleanUtils.toBoolean((String) null, "true", (String) null));
        assertTrue(BooleanUtils.toBoolean("match", "match", "false"));
        assertFalse(BooleanUtils.toBoolean("match", "true", "match"));
        try {
            BooleanUtils.toBoolean("nomatch", "true", "false");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToStringTrueFalse() {
        assertEquals("true", BooleanUtils.toStringTrueFalse(true));
        assertEquals("false", BooleanUtils.toStringTrueFalse(false));
    }

    @Test
    public void testToStringOnOff() {
        assertEquals("on", BooleanUtils.toStringOnOff(true));
        assertEquals("off", BooleanUtils.toStringOnOff(false));
    }

    @Test
    public void testToStringYesNo() {
        assertEquals("yes", BooleanUtils.toStringYesNo(true));
        assertEquals("no", BooleanUtils.toStringYesNo(false));
    }

    @Test
    public void testToString_Boolean_String_String_String() {
        assertEquals("nullString", BooleanUtils.toString((Boolean) null, "trueString", "falseString", "nullString"));
        assertEquals("trueString", BooleanUtils.toString(Boolean.TRUE, "trueString", "falseString", "nullString"));
        assertEquals("falseString", BooleanUtils.toString(Boolean.FALSE, "trueString", "falseString", "nullString"));
    }

    @Test
    public void testToString_boolean_String_String() {
        assertEquals("trueString", BooleanUtils.toString(true, "trueString", "falseString"));
        assertEquals("falseString", BooleanUtils.toString(false, "trueString", "falseString"));
    }

    @Test
    public void testXor_booleanArray() {
        try {
            BooleanUtils.xor((boolean[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            BooleanUtils.xor(new boolean[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        assertTrue(BooleanUtils.xor(new boolean[] { true }));
        assertFalse(BooleanUtils.xor(new boolean[] { false }));
        assertFalse(BooleanUtils.xor(new boolean[] { true, true }));
        assertTrue(BooleanUtils.xor(new boolean[] { true, false }));
        assertFalse(BooleanUtils.xor(new boolean[] { true, false, true }));
        assertTrue(BooleanUtils.xor(new boolean[] { true, false, false }));
    }

    @Test
    public void testXor_BooleanArray() {
        try {
            BooleanUtils.xor((Boolean[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            BooleanUtils.xor(new Boolean[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            BooleanUtils.xor(new Boolean[] { null, Boolean.TRUE });
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        assertEquals(Boolean.TRUE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE }));
        assertEquals(Boolean.FALSE, BooleanUtils.xor(new Boolean[] { Boolean.FALSE }));
        assertEquals(Boolean.FALSE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE }));
        assertEquals(Boolean.TRUE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE }));
        assertEquals(Boolean.FALSE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE, Boolean.TRUE }));
        assertEquals(Boolean.TRUE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE, Boolean.FALSE }));
    }
}