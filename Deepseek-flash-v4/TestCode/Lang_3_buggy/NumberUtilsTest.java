package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsTest {

    @Test
    public void testToInt() {
        assertEquals(123, NumberUtils.toInt("123"));
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(5, NumberUtils.toInt("abc", 5));
        assertEquals(-42, NumberUtils.toInt("-42"));
    }

    @Test
    public void testToLong() {
        assertEquals(123L, NumberUtils.toLong("123"));
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(9L, NumberUtils.toLong("xyz", 9L));
        assertEquals(Long.MAX_VALUE, NumberUtils.toLong("9223372036854775807"));
    }

    @Test
    public void testToFloat() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0f);
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
        assertEquals(3.14f, NumberUtils.toFloat("pi", 3.14f), 0.0f);
        assertEquals(Float.NaN, NumberUtils.toFloat("NaN"), 0.0f);
    }

    @Test
    public void testToDouble() {
        assertEquals(2.5, NumberUtils.toDouble("2.5"), 0.0);
        assertEquals(0.0, NumberUtils.toDouble(null), 0.0);
        assertEquals(-1.0, NumberUtils.toDouble("neg", -1.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, NumberUtils.toDouble("Infinity"), 0.0);
    }

    @Test
    public void testToByte() {
        assertEquals((byte) 7, NumberUtils.toByte("7"));
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 2, NumberUtils.toByte("two", (byte) 2));
        assertEquals(Byte.MIN_VALUE, NumberUtils.toByte("-128"));
    }

    @Test
    public void testToShort() {
        assertEquals((short) 10, NumberUtils.toShort("10"));
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) -3, NumberUtils.toShort("neg", (short) -3));
        assertEquals(Short.MAX_VALUE, NumberUtils.toShort("32767"));
    }

    @Test(expected = NumberFormatException.class)
    public void testToIntInvalid() {
        NumberUtils.toInt("12a");
    }

    @Test(expected = NumberFormatException.class)
    public void testToLongInvalid() {
        NumberUtils.toLong("abc");
    }

    @Test
    public void testCreateNumber() throws Exception {
        assertEquals(Integer.valueOf(42), NumberUtils.createNumber("42"));
        assertEquals(Long.valueOf(12345678901L), NumberUtils.createNumber("12345678901"));
        assertEquals(new BigInteger("123456789012345678901"), NumberUtils.createNumber("123456789012345678901"));
        assertEquals(Float.valueOf(1.5f), NumberUtils.createNumber("1.5f"));
        assertEquals(Double.valueOf(2.5), NumberUtils.createNumber("2.5d"));
        assertEquals(new BigDecimal("0.001"), NumberUtils.createNumber("0.001"));
        assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
        assertEquals(Long.valueOf(0xffffffffL), NumberUtils.createNumber("0xFFFFFFFF"));
        assertEquals(Integer.valueOf(0x100), NumberUtils.createNumber("#100"));
        assertEquals(Integer.valueOf(010), NumberUtils.createNumber("010"));
        assertEquals(Long.valueOf(0777L), NumberUtils.createNumber("0777l"));
        assertEquals(Float.valueOf(10.0f), NumberUtils.createNumber("10.0f"));
        assertEquals(Double.valueOf(-0.5), NumberUtils.createNumber("-0.5d"));
        assertEquals(new BigInteger("-12345678901234567890"), NumberUtils.createNumber("-12345678901234567890"));
        assertEquals(new BigDecimal("1e3"), NumberUtils.createNumber("1e3"));
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
    public void testCreateNumberInvalidSuffix() {
        assertNull(NumberUtils.createNumber("12x"));
    }

    @Test
    public void testCreateFloat() {
        assertEquals(1.5f, NumberUtils.createFloat("1.5"), 0.0f);
        assertEquals(Float.NaN, NumberUtils.createFloat("NaN"), 0.0f);
    }

    @Test
    public void testCreateDouble() {
        assertEquals(2.5, NumberUtils.createDouble("2.5"), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, NumberUtils.createDouble("Infinity"), 0.0);
    }

    @Test
    public void testCreateInteger() {
        assertEquals(123, NumberUtils.createInteger("123"));
        assertEquals(-45, NumberUtils.createInteger("-45"));
    }

    @Test
    public void testCreateLong() {
        assertEquals(123L, NumberUtils.createLong("123"));
        assertEquals(-45L, NumberUtils.createLong("-45"));
    }

    @Test
    public void testCreateBigInteger() {
        assertEquals(new BigInteger("12345678901234567890"), NumberUtils.createBigInteger("12345678901234567890"));
        assertEquals(new BigInteger("-ff", 16), NumberUtils.createBigInteger("-0xff"));
        assertEquals(new BigInteger("777", 8), NumberUtils.createBigInteger("0777"));
    }

    @Test
    public void testCreateBigDecimal() {
        assertEquals(new BigDecimal("1.5"), NumberUtils.createBigDecimal("1.5"));
        assertEquals(new BigDecimal("2.50"), NumberUtils.createBigDecimal("2.50"));
        assertEquals(new BigDecimal("--3"), NumberUtils.createBigDecimal("--3"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimalNull() {
        NumberUtils.createBigDecimal(null);
    }

    @Test
    public void testMinLongArray() {
        long[] arr = {3L, 1L, 2L};
        assertEquals(1L, NumberUtils.min(arr));
        assertEquals(Long.MIN_VALUE, NumberUtils.min(new long[]{Long.MIN_VALUE, 0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinNullArray() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinEmptyArray() {
        NumberUtils.min(new long[]{});
    }

    @Test
    public void testMinIntArray() {
        int[] arr = {5, -1, 3};
        assertEquals(-1, NumberUtils.min(arr));
        assertEquals(0, NumberUtils.min(new int[]{0}));
    }

    @Test
    public void testMinShortArray() {
        short[] arr = {2, 0, -2};
        assertEquals(-2, NumberUtils.min(arr));
    }

    @Test
    public void testMinByteArray() {
        byte[] arr = {1, -1, 0};
        assertEquals(-1, NumberUtils.min(arr));
    }

    @Test
    public void testMinDoubleArray() {
        double[] arr = {1.5, 0.5, 2.0};
        assertEquals(0.5, NumberUtils.min(arr), 0.0);
        assertEquals(Double.NaN, NumberUtils.min(new double[]{1.0, Double.NaN}), 0.0);
    }

    @Test
    public void testMinFloatArray() {
        float[] arr = {1.5f, 0.5f, 2.0f};
        assertEquals(0.5f, NumberUtils.min(arr), 0.0f);
        assertEquals(Float.NaN, NumberUtils.min(new float[]{1.0f, Float.NaN}), 0.0f);
    }

    @Test
    public void testMaxLongArray() {
        long[] arr = {3L, 1L, 2L};
        assertEquals(3L, NumberUtils.max(arr));
        assertEquals(Long.MAX_VALUE, NumberUtils.max(new long[]{Long.MAX_VALUE, -1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxNullArray() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxEmptyArray() {
        NumberUtils.max(new long[]{});
    }

    @Test
    public void testMaxIntArray() {
        int[] arr = {5, -1, 10};
        assertEquals(10, NumberUtils.max(arr));
        assertEquals(-1, NumberUtils.max(new int[]{-5, -1, -3}));
    }

    @Test
    public void testMaxShortArray() {
        short[] arr = {2, 0, 5};
        assertEquals(5, NumberUtils.max(arr));
    }

    @Test
    public void testMaxByteArray() {
        byte[] arr = {1, -1, 9};
        assertEquals(9, NumberUtils.max(arr));
    }

    @Test
    public void testMaxDoubleArray() {
        double[] arr = {1.5, 0.5, 2.0};
        assertEquals(2.0, NumberUtils.max(arr), 0.0);
        assertEquals(Double.NaN, NumberUtils.max(new double[]{1.0, Double.NaN}), 0.0);
    }

    @Test
    public void testMaxFloatArray() {
        float[] arr = {1.5f, 0.5f, 2.0f};
        assertEquals(2.0f, NumberUtils.max(arr), 0.0f);
        assertEquals(Float.NaN, NumberUtils.max(new float[]{1.0f, Float.NaN}), 0.0f);
    }

    @Test
    public void testMinLongTriple() {
        assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
        assertEquals(-1L, NumberUtils.min(-1L, 5L, 0L));
    }

    @Test
    public void testMinIntTriple() {
        assertEquals(1, NumberUtils.min(3, 1, 2));
        assertEquals(-1, NumberUtils.min(-1, 5, 0));
    }

    @Test
    public void testMinShortTriple() {
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
        assertEquals((short) -1, NumberUtils.min((short) -1, (short) 5, (short) 0));
    }

    @Test
    public void testMinByteTriple() {
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
        assertEquals((byte) -1, NumberUtils.min((byte) -1, (byte) 5, (byte) 0));
    }

    @Test
    public void testMinDoubleTriple() {
        assertEquals(0.5, NumberUtils.min(1.5, 0.5, 2.0), 0.0);
        assertEquals(-1.0, NumberUtils.min(-1.0, 5.0, 0.0), 0.0);
    }

    @Test
    public void testMinFloatTriple() {
        assertEquals(0.5f, NumberUtils.min(1.5f, 0.5f, 2.0f), 0.0f);
        assertEquals(-1.0f, NumberUtils.min(-1.0f, 5.0f, 0.0f), 0.0f);
    }

    @Test
    public void testMaxLongTriple() {
        assertEquals(3L, NumberUtils.max(3L, 1L, 2L));
        assertEquals(5L, NumberUtils.max(-1L, 5L, 0L));
    }

    @Test
    public void testMaxIntTriple() {
        assertEquals(3, NumberUtils.max(3, 1, 2));
        assertEquals(5, NumberUtils.max(-1, 5, 0));
    }

    @Test
    public void testMaxShortTriple() {
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 1, (short) 2));
        assertEquals((short) 5, NumberUtils.max((short) -1, (short) 5, (short) 0));
    }

    @Test
    public void testMaxByteTriple() {
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 1, (byte) 2));
        assertEquals((byte) 5, NumberUtils.max((byte) -1, (byte) 5, (byte) 0));
    }

    @Test
    public void testMaxDoubleTriple() {
        assertEquals(2.0, NumberUtils.max(1.5, 0.5, 2.0), 0.0);
        assertEquals(5.0, NumberUtils.max(-1.0, 5.0, 0.0), 0.0);
    }

    @Test
    public void testMaxFloatTriple() {
        assertEquals(2.0f, NumberUtils.max(1.5f, 0.5f, 2.0f), 0.0f);
        assertEquals(5.0f, NumberUtils.max(-1.0f, 5.0f, 0.0f), 0.0f);
    }

    @Test
    public void testIsDigits() {
        assertTrue(NumberUtils.isDigits("123"));
        assertTrue(NumberUtils.isDigits("0"));
        assertFalse(NumberUtils.isDigits("12a"));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits("-123"));
        assertFalse(NumberUtils.isDigits("12.3"));
    }

    @Test
    public void testIsNumber() {
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("123.45"));
        assertTrue(NumberUtils.isNumber("1.5e10"));
        assertTrue(NumberUtils.isNumber("0xFF"));
        assertTrue(NumberUtils.isNumber("0777"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("1.5f"));
        assertTrue(NumberUtils.isNumber("1.5d"));
        assertTrue(NumberUtils.isNumber("1.5F"));
        assertTrue(NumberUtils.isNumber("1.5D"));
        assertTrue(NumberUtils.isNumber("10L"));
        assertTrue(NumberUtils.isNumber("10l"));
        assertTrue(NumberUtils.isNumber("0xABC"));
        assertTrue(NumberUtils.isNumber("0Xabc"));
        assertTrue(NumberUtils.isNumber("#1A"));
        assertTrue(NumberUtils.isNumber("1e-10"));
        assertTrue(NumberUtils.isNumber("1E+10"));

        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber("12a"));
        assertFalse(NumberUtils.isNumber("--12"));
        assertFalse(NumberUtils.isNumber("12."));
        assertFalse(NumberUtils.isNumber(".12"));
        assertFalse(NumberUtils.isNumber("12.3.4"));
        assertFalse(NumberUtils.isNumber("12e"));
        assertFalse(NumberUtils.isNumber("1.5e10.2"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("0xGG"));
        assertFalse(NumberUtils.isNumber("12L12"));
        assertFalse(NumberUtils.isNumber("+-12"));
        assertFalse(NumberUtils.isNumber("1.5g"));
        assertFalse(NumberUtils.isNumber("1.5e"));
        assertFalse(NumberUtils.isNumber("e10"));
    }
}