package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumberUtilsTest {

    private static final double DOUBLE_DELTA = 0.0d;
    private static final float FLOAT_DELTA = 0.0f;

    // --- toInt tests ---
    @Test
    public void testToInt_ValidString() {
        assertEquals(42, NumberUtils.toInt("42"));
    }

    @Test
    public void testToInt_InvalidString_ReturnsDefault() {
        assertEquals(7, NumberUtils.toInt("invalid", 7));
    }

    @Test
    public void testToInt_Null_ReturnsDefault() {
        assertEquals(5, NumberUtils.toInt(null, 5));
    }

    @Test(expected = NumberFormatException.class)
    public void testToInt_InvalidString_ThrowsException() {
        NumberUtils.toInt("abc");
    }

    // --- toLong tests ---
    @Test
    public void testToLong_ValidString() {
        assertEquals(123L, NumberUtils.toLong("123"));
    }

    @Test
    public void testToLong_Null_ReturnsDefault() {
        assertEquals(9L, NumberUtils.toLong(null, 9L));
    }

    @Test(expected = NumberFormatException.class)
    public void testToLong_InvalidString_ThrowsException() {
        NumberUtils.toLong("invalid");
    }

    // --- toFloat tests ---
    @Test
    public void testToFloat_ValidString() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), FLOAT_DELTA);
    }

    @Test
    public void testToFloat_Null_ReturnsDefault() {
        assertEquals(2.5f, NumberUtils.toFloat(null, 2.5f), FLOAT_DELTA);
    }

    @Test(expected = NumberFormatException.class)
    public void testToFloat_InvalidString_ThrowsException() {
        NumberUtils.toFloat("abc");
    }

    // --- toDouble tests ---
    @Test
    public void testToDouble_ValidString() {
        assertEquals(2.25, NumberUtils.toDouble("2.25"), DOUBLE_DELTA);
    }

    @Test
    public void testToDouble_Null_ReturnsDefault() {
        assertEquals(1.0, NumberUtils.toDouble(null, 1.0), DOUBLE_DELTA);
    }

    @Test(expected = NumberFormatException.class)
    public void testToDouble_InvalidString_ThrowsException() {
        NumberUtils.toDouble("invalid");
    }

    // --- toByte tests ---
    @Test
    public void testToByte_ValidString() {
        assertEquals((byte) 10, NumberUtils.toByte("10"));
    }

    @Test
    public void testToByte_Null_ReturnsDefault() {
        assertEquals((byte) 3, NumberUtils.toByte(null, (byte) 3));
    }

    @Test(expected = NumberFormatException.class)
    public void testToByte_InvalidString_ThrowsException() {
        NumberUtils.toByte("abc");
    }

    // --- toShort tests ---
    @Test
    public void testToShort_ValidString() {
        assertEquals((short) 100, NumberUtils.toShort("100"));
    }

    @Test
    public void testToShort_Null_ReturnsDefault() {
        assertEquals((short) 7, NumberUtils.toShort(null, (short) 7));
    }

    @Test(expected = NumberFormatException.class)
    public void testToShort_InvalidString_ThrowsException() {
        NumberUtils.toShort("invalid");
    }

    // --- createNumber tests ---
    @Test
    public void testCreateNumber_WholeNumber_ReturnsLong() {
        assertTrue(NumberUtils.createNumber("123") instanceof Long);
    }

    @Test
    public void testCreateNumber_Decimal_ReturnsDouble() {
        assertTrue(NumberUtils.createNumber("1.5") instanceof Double);
    }

    @Test
    public void testCreateNumber_Hex_ReturnsInteger() {
        assertTrue(NumberUtils.createNumber("0x1F") instanceof Integer);
    }

    @Test
    public void testCreateNumber_NotFound_ReturnsBigDecimal() {
        assertTrue(NumberUtils.createNumber("1.2.3") instanceof java.math.BigDecimal);
    }

    @Test
    public void testCreateNumber_WithL_ReturnsLong() {
        assertTrue(NumberUtils.createNumber("123L") instanceof Long);
    }

    @Test
    public void testCreateNumber_WithF_ReturnsFloat() {
        assertTrue(NumberUtils.createNumber("1.5f") instanceof Float);
    }

    @Test
    public void testCreateNumber_WithD_ReturnsDouble() {
        assertTrue(NumberUtils.createNumber("2.5d") instanceof Double);
    }

    @Test
    public void testCreateNumber_WithExp_ReturnsLong() {
        assertTrue(NumberUtils.createNumber("1e3") instanceof Long);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Blank_ThrowsException() {
        NumberUtils.createNumber("  ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Invalid_ThrowsException() {
        NumberUtils.createNumber("1.a");
    }

    // --- createFloat/Double/Integer/Long/BigInteger/BigDecimal tests ---
    @Test
    public void testCreateFloat() {
        assertEquals(1.5f, NumberUtils.createFloat("1.5"), FLOAT_DELTA);
    }

    @Test
    public void testCreateDouble() {
        assertEquals(2.25, NumberUtils.createDouble("2.25"), DOUBLE_DELTA);
    }

    @Test
    public void testCreateInteger() {
        assertEquals(123, NumberUtils.createInteger("123").intValue());
    }

    @Test
    public void testCreateLong() {
        assertEquals(123L, NumberUtils.createLong("123").longValue());
    }

    @Test
    public void testCreateBigInteger() {
        assertEquals(new java.math.BigInteger("123"), NumberUtils.createBigInteger("123"));
    }

    @Test
    public void testCreateBigDecimal() {
        assertEquals(new java.math.BigDecimal("1.23"), NumberUtils.createBigDecimal("1.23"));
    }

    // --- min tests ---
    @Test
    public void testMin_NullArray_ThrowsException() {
        try {
            NumberUtils.min((int[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_EmptyArray_ThrowsException() {
        try {
            NumberUtils.min(new int[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_VariousTypes() {
        assertEquals(1, NumberUtils.min(new int[] {3, 1, 2}));
        assertEquals(1L, NumberUtils.min(new long[] {5L, 1L, 3L}));
        assertEquals((short) 1, NumberUtils.min(new short[] {(short) 3, (short) 1, (short) 2}));
        assertEquals((byte) 1, NumberUtils.min(new byte[] {(byte) 3, (byte) 1, (byte) 2}));
        assertEquals(1.0, NumberUtils.min(new double[] {3.0, 1.0, 2.0}), DOUBLE_DELTA);
        assertEquals(1.5f, NumberUtils.min(new float[] {3.0f, 1.5f, 2.0f}), FLOAT_DELTA);
    }

    @Test
    public void testMin_Double_NaN() {
        assertTrue(Double.isNaN(NumberUtils.min(new double[] {1.0, Double.NaN, 2.0})));
    }

    @Test
    public void testMin_Float_NaN() {
        assertTrue(Float.isNaN(NumberUtils.min(new float[] {1.0f, Float.NaN, 2.0f})));
    }

    // --- max tests ---
    @Test
    public void testMax_NullArray_ThrowsException() {
        try {
            NumberUtils.max((int[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_EmptyArray_ThrowsException() {
        try {
            NumberUtils.max(new int[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_VariousTypes() {
        assertEquals(3, NumberUtils.max(new int[] {3, 1, 2}));
        assertEquals(5L, NumberUtils.max(new long[] {5L, 1L, 3L}));
        assertEquals((short) 3, NumberUtils.max(new short[] {(short) 3, (short) 1, (short) 2}));
        assertEquals((byte) 3, NumberUtils.max(new byte[] {(byte) 3, (byte) 1, (byte) 2}));
        assertEquals(3.0, NumberUtils.max(new double[] {3.0, 1.0, 2.0}), DOUBLE_DELTA);
        assertEquals(3.0f, NumberUtils.max(new float[] {3.0f, 1.5f, 2.0f}), FLOAT_DELTA);
    }

    @Test
    public void testMax_Double_NaN() {
        assertTrue(Double.isNaN(NumberUtils.max(new double[] {1.0, Double.NaN, 2.0})));
    }

    public void testMax_Float_NaN() {
        assertTrue(Float.isNaN(NumberUtils.max(new float[] {1.0f, Float.NaN, 2.0f})));
    }

    // --- isDigits tests ---
    @Test
    public void testIsDigits_ValidNumericString() {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_Null_Or_Empty() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_NonDigits() {
        assertFalse(NumberUtils.isDigits("12a45"));
        assertFalse(NumberUtils.isDigits("12.45"));
    }

    // --- isNumber tests ---
    @Test
    public void testIsNumber_ValidCases() {
        assertTrue(NumberUtils.isNumber("0"));
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("1.5"));
        assertTrue(NumberUtils.isNumber("0x1F"));
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("1.5D"));
        assertTrue(NumberUtils.isNumber("1e3"));
        assertTrue(NumberUtils.isNumber("-1"));
    }

    @Test
    public void testIsNumber_InvalidCases() {
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertFalse(NumberUtils.isNumber("12Lx"));
        assertFalse(NumberUtils.isNumber("e10"));
        assertFalse(NumberUtils.isNumber("--1"));
    }

    // --- min/max with three primitive args ---
    @Test
    public void testMinThreeArgs() {
        assertEquals(1, NumberUtils.min(3, 1, 2));
        assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
        assertEquals(1.0, NumberUtils.min(3.0, 1.0, 2.0), DOUBLE_DELTA);
        assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), FLOAT_DELTA);
    }

    @Test
    public void testMaxThreeArgs() {
        assertEquals(3, NumberUtils.max(3, 1, 2));
        assertEquals(3L, NumberUtils.max(3L, 1L, 2L));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 1, (short) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 1, (byte) 2));
        assertEquals(3.0, NumberUtils.max(3.0, 1.0, 2.0), DOUBLE_DELTA);
        assertEquals(3.0f, NumberUtils.max(3.0f, 1.0f, 2.0f), FLOAT_DELTA);
    }
}