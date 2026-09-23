package org.apache.commons.lang.math;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsTest {
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testStringToInt() {
        assertEquals(123, NumberUtils.stringToInt("123"));
        assertEquals(0, NumberUtils.stringToInt(null));
        assertEquals(5, NumberUtils.stringToInt("abc", 5));
    }
    
    @Test
    public void testToInt() {
        assertEquals(42, NumberUtils.toInt("42"));
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(-1, NumberUtils.toInt("abc", -1));
        assertEquals(0, NumberUtils.toInt(""));
    }
    
    @Test
    public void testToIntInvalidInput() {
        assertEquals(10, NumberUtils.toInt("12a", 10));
        assertEquals(-100, NumberUtils.toInt("xyz", -100));
    }
    
    @Test
    public void testToLong() {
        assertEquals(100L, NumberUtils.toLong("100"));
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(50L, NumberUtils.toLong("abc", 50L));
    }
    
    @Test
    public void testToFloat() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.001f);
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.001f);
        assertEquals(2.5f, NumberUtils.toFloat("abc", 2.5f), 0.001f);
    }
    
    @Test
    public void testToDouble() {
        assertEquals(2.5, NumberUtils.toDouble("2.5"), 0.001);
        assertEquals(0.0, NumberUtils.toDouble(null), 0.001);
        assertEquals(3.5, NumberUtils.toDouble("abc", 3.5), 0.001);
    }
    
    @Test
    public void testCreateNumber() {
        assertNotNull(NumberUtils.createNumber("123"));
        assertEquals(123, NumberUtils.createNumber("123").intValue());
        assertEquals(123L, NumberUtils.createNumber("123L").longValue());
        assertEquals(1.5f, NumberUtils.createNumber("1.5f").floatValue(), 0.001f);
        assertEquals(2.5, NumberUtils.createNumber("2.5d").doubleValue(), 0.001);
        assertEquals(10, NumberUtils.createNumber("0xA").intValue());
        assertEquals(-10, NumberUtils.createNumber("-0xA").intValue());
        assertEquals(1234567890123L, NumberUtils.createNumber("1234567890123").longValue());
        assertEquals(1234567890123L, NumberUtils.createNumber("1234567890123L").longValue());
        assertEquals(new BigDecimal("123456789012345678901234567890.123"), 
                     NumberUtils.createNumber("123456789012345678901234567890.123"));
        assertEquals(new BigDecimal("123456789012345678901234567890"), 
                     NumberUtils.createNumber("123456789012345678901234567890"));
    }
    
    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlankString() {
        NumberUtils.createNumber("");
    }
    
    @Test(expected = NumberFormatException.class)
    public void testCreateNumberNull() {
        NumberUtils.createNumber(null);
    }
    
    @Test
    public void testCreateNumberInvalidFormat() {
        try {
            NumberUtils.createNumber("1.2.3");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }
    
    @Test
    public void testCreateFloat() {
        assertEquals(1.5f, NumberUtils.createFloat("1.5").floatValue(), 0.001f);
        assertEquals(0.0f, NumberUtils.createFloat("0.0").floatValue(), 0.001f);
    }
    
    @Test
    public void testCreateDouble() {
        assertEquals(1.5, NumberUtils.createDouble("1.5").doubleValue(), 0.001);
        assertEquals(0.0, NumberUtils.createDouble("0.0").doubleValue(), 0.001);
    }
    
    @Test
    public void testCreateInteger() {
        assertEquals(42, NumberUtils.createInteger("42").intValue());
        assertEquals(-42, NumberUtils.createInteger("-42").intValue());
        assertEquals(0x1A, NumberUtils.createInteger("0x1A").intValue());
    }
    
    @Test
    public void testCreateLong() {
        assertEquals(42L, NumberUtils.createLong("42").longValue());
        assertEquals(0x1AL, NumberUtils.createLong("0x1A").longValue());
    }
    
    @Test
    public void testCreateBigInteger() {
        assertEquals(new BigInteger("12345678901234567890"), 
                     NumberUtils.createBigInteger("12345678901234567890"));
    }
    
    @Test
    public void testCreateBigDecimal() {
        assertEquals(new BigDecimal("12345.6789"), 
                     NumberUtils.createBigDecimal("12345.6789"));
    }
    
    @Test
    public void testEqualsByteArrays() {
        byte[] arr1 = {1, 2, 3};
        byte[] arr2 = {1, 2, 3};
        byte[] arr3 = {1, 2, 4};
        assertTrue(NumberUtils.equals(arr1, arr2));
        assertFalse(NumberUtils.equals(arr1, arr3));
        assertTrue(NumberUtils.equals((byte[]) null, (byte[]) null));
        assertFalse(NumberUtils.equals(arr1, null));
        assertFalse(NumberUtils.equals(null, arr2));
        byte[] arr4 = {1, 2};
        assertFalse(NumberUtils.equals(arr1, arr4));
    }
    
    @Test
    public void testEqualsShortArrays() {
        short[] arr1 = {1, 2, 3};
        short[] arr2 = {1, 2, 3};
        short[] arr3 = {1, 2, 4};
        assertTrue(NumberUtils.equals(arr1, arr2));
        assertFalse(NumberUtils.equals(arr1, arr3));
        assertTrue(NumberUtils.equals((short[]) null, (short[]) null));
    }
    
    @Test
    public void testEqualsIntArrays() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        assertTrue(NumberUtils.equals(arr1, arr2));
        assertFalse(NumberUtils.equals(arr1, arr3));
        assertTrue(NumberUtils.equals((int[]) null, (int[]) null));
    }
    
    @Test
    public void testEqualsLongArrays() {
        long[] arr1 = {1L, 2L, 3L};
        long[] arr2 = {1L, 2L, 3L};
        long[] arr3 = {1L, 2L, 4L};
        assertTrue(NumberUtils.equals(arr1, arr2));
        assertFalse(NumberUtils.equals(arr1, arr3));
        assertTrue(NumberUtils.equals((long[]) null, (long[]) null));
    }
    
    @Test
    public void testEqualsFloatArrays() {
        float[] arr1 = {1.0f, 2.0f, 3.0f};
        float[] arr2 = {1.0f, 2.0f, 3.0f};
        float[] arr3 = {1.0f, 2.0f, 4.0f};
        assertTrue(NumberUtils.equals(arr1, arr2));
        assertFalse(NumberUtils.equals(arr1, arr3));
        assertTrue(NumberUtils.equals((float[]) null, (float[]) null));
    }
    
    @Test
    public void testEqualsDoubleArrays() {
        double[] arr1 = {1.0, 2.0, 3.0};
        double[] arr2 = {1.0, 2.0, 3.0};
        double[] arr3 = {1.0, 2.0, 4.0};
        assertTrue(NumberUtils.equals(arr1, arr2));
        assertFalse(NumberUtils.equals(arr1, arr3));
        assertTrue(NumberUtils.equals((double[]) null, (double[]) null));
    }
    
    @Test
    public void testMinWithLongArray() {
        long[] arr = {3L, 1L, 2L};
        assertEquals(1L, NumberUtils.min(arr));
        assertEquals(5L, NumberUtils.min(new long[]{5L}));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMinNullLongArray() {
        NumberUtils.min((long[]) null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMinEmptyLongArray() {
        NumberUtils.min(new long[0]);
    }
    
    @Test
    public void testMinWithIntArray() {
        int[] arr = {3, 1, 2};
        assertEquals(1, NumberUtils.min(arr));
        int[] single = {5};
        assertEquals(5, NumberUtils.min(single));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMinNullIntArray() {
        NumberUtils.min((int[]) null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMinEmptyIntArray() {
        NumberUtils.min(new int[0]);
    }
    
    @Test
    public void testMinWithShortArray() {
        short[] arr = {3, 1, 2};
        assertEquals(1, NumberUtils.min(arr));
    }
    
    @Test
    public void testMinWithByteArray() {
        byte[] arr = {3, 1, 2};
        assertEquals(1, NumberUtils.min(arr));
    }
    
    @Test
    public void testMinWithDoubleArray() {
        double[] arr = {3.5, 1.2, 2.8};
        assertEquals(1.2, NumberUtils.min(arr), 0.001);
    }
    
    @Test
    public void testMinWithFloatArray() {
        float[] arr = {3.5f, 1.2f, 2.8f};
        assertEquals(1.2f, NumberUtils.min(arr), 0.001f);
    }
    
    @Test
    public void testMaxWithLongArray() {
        long[] arr = {3L, 1L, 2L};
        assertEquals(3L, NumberUtils.max(arr));
        long[] single = {5L};
        assertEquals(5L, NumberUtils.max(single));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMaxNullLongArray() {
        NumberUtils.max((long[]) null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMaxEmptyLongArray() {
        NumberUtils.max(new long[0]);
    }
    
    @Test
    public void testMaxWithIntArray() {
        int[] arr = {3, 1, 2};
        assertEquals(3, NumberUtils.max(arr));
    }
    
    @Test
    public void testMaxWithShortArray() {
        short[] arr = {3, 1, 2};
        assertEquals(3, NumberUtils.max(arr));
    }
    
    @Test
    public void testMaxWithByteArray() {
        byte[] arr = {3, 1, 2};
        assertEquals(3, NumberUtils.max(arr));
    }
    
    @Test
    public void testMaxWithDoubleArray() {
        double[] arr = {3.5, 1.2, 2.8};
        assertEquals(3.5, NumberUtils.max(arr), 0.001);
    }
    
    @Test
    public void testMaxWithFloatArray() {
        float[] arr = {3.5f, 1.2f, 2.8f};
        assertEquals(3.5f, NumberUtils.max(arr), 0.001f);
    }
    
    @Test
    public void testMinLongValues() {
        assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
        assertEquals(5L, NumberUtils.min(5L, 5L, 5L));
        assertEquals(-1L, NumberUtils.min(0L, -1L, 1L));
    }
    
    @Test
    public void testMinIntValues() {
        assertEquals(1, NumberUtils.min(3, 1, 2));
        assertEquals(5, NumberUtils.min(5, 5, 5));
        assertEquals(-1, NumberUtils.min(0, -1, 1));
    }
    
    @Test
    public void testMinShortValues() {
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
        assertEquals((short) 5, NumberUtils.min((short) 5, (short) 5, (short) 5));
    }
    
    @Test
    public void testMinByteValues() {
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
        assertEquals((byte) 5, NumberUtils.min((byte) 5, (byte) 5, (byte) 5));
    }
    
    @Test
    public void testMinDoubleValues() {
        assertEquals(1.5, NumberUtils.min(3.5, 1.5, 2.5), 0.001);
        assertEquals(5.0, NumberUtils.min(5.0, 5.0, 5.0), 0.001);
    }
    
    @Test
    public void testMinFloatValues() {
        assertEquals(1.5f, NumberUtils.min(3.5f, 1.5f, 2.5f), 0.001f);
        assertEquals(5.0f, NumberUtils.min(5.0f, 5.0f, 5.0f), 0.001f);
    }
    
    @Test
    public void testMaxLongValues() {
        assertEquals(3L, NumberUtils.max(3L, 1L, 2L));
        assertEquals(5L, NumberUtils.max(5L, 5L, 5L));
        assertEquals(1L, NumberUtils.max(0L, -1L, 1L));
    }
    
    @Test
    public void testMaxIntValues() {
        assertEquals(3, NumberUtils.max(3, 1, 2));
        assertEquals(5, NumberUtils.max(5, 5, 5));
        assertEquals(1, NumberUtils.max(0, -1, 1));
    }
    
    @Test
    public void testMaxShortValues() {
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 1, (short) 2));
        assertEquals((short) 5, NumberUtils.max((short) 5, (short) 5, (short) 5));
    }
    
    @Test
    public void testMaxByteValues() {
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 1, (byte) 2));
        assertEquals((byte) 5, NumberUtils.max((byte) 5, (byte) 5, (byte) 5));
    }
    
    @Test
    public void testMaxDoubleValues() {
        assertEquals(3.5, NumberUtils.max(3.5, 1.5, 2.5), 0.001);
        assertEquals(5.0, NumberUtils.max(5.0, 5.0, 5.0), 0.001);
    }
    
    @Test
    public void testMaxFloatValues() {
        assertEquals(3.5f, NumberUtils.max(3.5f, 1.5f, 2.5f), 0.001f);
        assertEquals(5.0f, NumberUtils.max(5.0f, 5.0f, 5.0f), 0.001f);
    }
    
    @Test
    public void testCompareDouble() {
        assertEquals(-1, NumberUtils.compare(1.0, 2.0));
        assertEquals(1, NumberUtils.compare(2.0, 1.0));
        assertEquals(0, NumberUtils.compare(1.0, 1.0));
        assertEquals(1, NumberUtils.compare(Double.NaN, 1.0));
        assertEquals(-1, NumberUtils.compare(1.0, Double.NaN));
        assertEquals(0, NumberUtils.compare(Double.NaN, Double.NaN));
        assertEquals(1, NumberUtils.compare(0.0, -0.0));
    }
    
    @Test
    public void testCompareFloat() {
        assertEquals(-1, NumberUtils.compare(1.0f, 2.0f));
        assertEquals(1, NumberUtils.compare(2.0f, 1.0f));
        assertEquals(0, NumberUtils.compare(1.0f, 1.0f));
        assertEquals(1, NumberUtils.compare(Float.NaN, 1.0f));
        assertEquals(-1, NumberUtils.compare(1.0f, Float.NaN));
        assertEquals(0, NumberUtils.compare(Float.NaN, Float.NaN));
        assertEquals(1, NumberUtils.compare(0.0f, -0.0f));
    }
    
    @Test
    public void testIsDigits() {
        assertTrue(NumberUtils.isDigits("123"));
        assertTrue(NumberUtils.isDigits("0"));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits("12a"));
        assertFalse(NumberUtils.isDigits("-123"));
        assertFalse(NumberUtils.isDigits("12.3"));
    }
    
    @Test
    public void testIsNumber() {
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("1.23"));
        assertTrue(NumberUtils.isNumber("1.23e4"));
        assertTrue(NumberUtils.isNumber("1.23E4"));
        assertTrue(NumberUtils.isNumber("1.23e+4"));
        assertTrue(NumberUtils.isNumber("1.23e-4"));
        assertTrue(NumberUtils.isNumber("0xA"));
        assertTrue(NumberUtils.isNumber("-0xA"));
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("1.23f"));
        assertTrue(NumberUtils.isNumber("1.23d"));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber("abc"));
        assertFalse(NumberUtils.isNumber("12a34"));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertFalse(NumberUtils.isNumber("--1"));
        assertFalse(NumberUtils.isNumber("0x"));
    }
}