package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class NumberUtilsTest {
    private NumberUtils nu;

    @Before
    public void setUp() {
        nu = new NumberUtils();
    }

    @Test
    public void testToInt() {
        assertEquals(123, NumberUtils.toInt("123"));
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(5, NumberUtils.toInt("abc", 5));
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToLong() {
        assertEquals(123456789L, NumberUtils.toLong("123456789"));
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(7L, NumberUtils.toLong("xyz", 7L));
    }

    @Test
    public void testToFloat() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.001);
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.001);
        assertEquals(2.5f, NumberUtils.toFloat("bad", 2.5f), 0.001);
    }

    @Test
    public void testToDouble() {
        assertEquals(3.14, NumberUtils.toDouble("3.14"), 0.001);
        assertEquals(0.0, NumberUtils.toDouble(null), 0.001);
        assertEquals(9.9, NumberUtils.toDouble("bad", 9.9), 0.001);
    }

    @Test
    public void testToByte() {
        assertEquals(10, NumberUtils.toByte("10"));
        assertEquals(0, NumberUtils.toByte(null));
        assertEquals(3, NumberUtils.toByte("bad", (byte) 3));
    }

    @Test
    public void testToShort() {
        assertEquals(100, NumberUtils.toShort("100"));
        assertEquals(0, NumberUtils.toShort(null));
        assertEquals(42, NumberUtils.toShort("bad", (short) 42));
    }

    @Test
    public void testCreateNumber() throws Exception {
        assertEquals(Integer.valueOf(10), NumberUtils.createNumber("10"));
        assertEquals(Long.valueOf(100L), NumberUtils.createNumber("100L"));
        assertEquals(Float.valueOf(1.0f), NumberUtils.createNumber("1.0f"));
        assertEquals(Double.valueOf(2.0), NumberUtils.createNumber("2.0"));
        assertEquals(new BigDecimal("123.45"), NumberUtils.createNumber("123.45"));
        assertEquals(new BigInteger("12345678901234567890"), NumberUtils.createNumber("12345678901234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlank() {
        NumberUtils.createNumber("  ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalid() {
        NumberUtils.createNumber("abc");
    }

    @Test
    public void testCreateFloat() {
        assertEquals(Float.valueOf(1.1f), NumberUtils.createFloat("1.1"));
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateDouble() {
        assertEquals(Double.valueOf(2.2), NumberUtils.createDouble("2.2"));
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateInteger() {
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
        assertEquals(Integer.valueOf(255), NumberUtils.createInteger("0xFF"));
    }

    @Test
    public void testCreateLong() {
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
    }

    @Test
    public void testCreateBigInteger() {
        assertEquals(new BigInteger("123456789"), NumberUtils.createBigInteger("123456789"));
    }

    @Test
    public void testCreateBigDecimal() {
        assertEquals(new BigDecimal("123.45"), NumberUtils.createBigDecimal("123.45"));
    }

    @Test
    public void testMinIntArray() {
        assertEquals(1, NumberUtils.min(new int[]{3, 5, 1, 9}));
        assertEquals(-5, NumberUtils.min(new int[]{-1, -5, -2}));
        assertEquals(7, NumberUtils.min(new int[]{7}));
    }

    @Test
    public void testMaxIntArray() {
        assertEquals(9, NumberUtils.max(new int[]{3, 5, 1, 9}));
        assertEquals(-1, NumberUtils.max(new int[]{-1, -5, -2}));
        assertEquals(7, NumberUtils.max(new int[]{7}));
    }

    @Test
    public void testMinLongArray() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 5L, 1L, 9L}));
        assertEquals(-5L, NumberUtils.min(new long[]{-1L, -5L, -2L}));
    }

    @Test
    public void testMaxLongArray() {
        assertEquals(9L, NumberUtils.max(new long[]{3L, 5L, 1L, 9L}));
        assertEquals(-1L, NumberUtils.max(new long[]{-1L, -5L, -2L}));
    }

    @Test
    public void testMinShortArray() {
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 5, 1, 9}));
        assertEquals((short) -5, NumberUtils.min(new short[]{-1, -5, -2}));
    }

    @Test
    public void testMaxShortArray() {
        assertEquals((short) 9, NumberUtils.max(new short[]{3, 5, 1, 9}));
        assertEquals((short) -1, NumberUtils.max(new short[]{-1, -5, -2}));
    }

    @Test
    public void testMinByteArray() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 5, 1, 9}));
        assertEquals((byte) -5, NumberUtils.min(new byte[]{-1, -5, -2}));
    }

    @Test
    public void testMaxByteArray() {
        assertEquals((byte) 9, NumberUtils.max(new byte[]{3, 5, 1, 9}));
        assertEquals((byte) -1, NumberUtils.max(new byte[]{-1, -5, -2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinNullArray() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinEmptyArray() {
        NumberUtils.min(new int[0]);
    }

    @Test
    public void testMaxDoubleArray() {
        assertEquals(3.5, NumberUtils.max(new double[]{1.0, 3.5, 2.2}), 0.001);
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.0, Double.NaN, 2.0})));
    }

    @Test
    public void testMaxFloatArray() {
        assertEquals(3.5f, NumberUtils.max(new float[]{1.0f, 3.5f, 2.2f}), 0.001);
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test
    public void testMinDoubleArray() {
        assertEquals(1.0, NumberUtils.min(new double[]{1.0, 3.5, 2.2}), 0.001);
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.0, Double.NaN, 2.0})));
    }

    @Test
    public void testMinFloatArray() {
        assertEquals(1.0f, NumberUtils.min(new float[]{1.0f, 3.5f, 2.2f}), 0.001);
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test
    public void testMinThreeValues() {
        assertEquals(1, NumberUtils.min(3, 1, 2));
        assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
        assertEquals(1.0, NumberUtils.min(3.0, 1.0, 2.0), 0.001);
        assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.001);
    }

    @Test
    public void testMaxThreeValues() {
        assertEquals(3, NumberUtils.max(3, 1, 2));
        assertEquals(3L, NumberUtils.max(3L, 1L, 2L));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 1, (short) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 1, (byte) 2));
        assertEquals(3.0, NumberUtils.max(3.0, 1.0, 2.0), 0.001);
        assertEquals(3.0f, NumberUtils.max(3.0f, 1.0f, 2.0f), 0.001);
    }

    @Test
    public void testIsDigits() {
        assertTrue(NumberUtils.isDigits("123"));
        assertFalse(NumberUtils.isDigits("123a"));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits("-123"));
    }

    @Test
    public void testIsNumber() {
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("123.5"));
        assertTrue(NumberUtils.isNumber("1.23e4"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("0x1A"));
        assertTrue(NumberUtils.isNumber("1L"));
        assertTrue(NumberUtils.isNumber("1.0f"));
        assertTrue(NumberUtils.isNumber("1.0d"));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertFalse(NumberUtils.isNumber("--1"));
    }

    @Test
    public void testConstants() {
        assertEquals(Long.valueOf(0L), NumberUtils.LONG_ZERO);
        assertEquals(Long.valueOf(1L), NumberUtils.LONG_ONE);
        assertEquals(Integer.valueOf(0), NumberUtils.INTEGER_ZERO);
        assertEquals(Integer.valueOf(1), NumberUtils.INTEGER_ONE);
        assertEquals(Double.valueOf(0.0), NumberUtils.DOUBLE_ZERO);
        assertEquals(Float.valueOf(0.0f), NumberUtils.FLOAT_ZERO);
    }
}