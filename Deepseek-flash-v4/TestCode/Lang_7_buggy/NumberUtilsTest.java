package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;

public class NumberUtilsTest {
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testToInt() {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(0, NumberUtils.toInt(""));
        assertEquals(5, NumberUtils.toInt("5"));
        assertEquals(10, NumberUtils.toInt("10", 99));
        assertEquals(99, NumberUtils.toInt("abc", 99));
        assertEquals(0, NumberUtils.toInt("abc"));
        assertEquals(-3, NumberUtils.toInt("-3"));
        assertEquals(0, NumberUtils.toInt(null, 0));
        assertEquals(42, NumberUtils.toInt("42", 0));
    }
    
    @Test
    public void testToLong() {
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(5L, NumberUtils.toLong("5"));
        assertEquals(99L, NumberUtils.toLong("abc", 99L));
        assertEquals(0L, NumberUtils.toLong(""));
        assertEquals(-10L, NumberUtils.toLong("-10"));
        assertEquals(100L, NumberUtils.toLong("100"));
    }
    
    @Test
    public void testToFloat() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001);
        assertEquals(5.5f, NumberUtils.toFloat("5.5"), 0.0001);
        assertEquals(99.9f, NumberUtils.toFloat("abc", 99.9f), 0.0001);
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0001);
        assertEquals(-2.5f, NumberUtils.toFloat("-2.5"), 0.0001);
    }
    
    @Test
    public void testToDouble() {
        assertEquals(0.0, NumberUtils.toDouble(null), 0.0001);
        assertEquals(3.14, NumberUtils.toDouble("3.14"), 0.0001);
        assertEquals(77.7, NumberUtils.toDouble("abc", 77.7), 0.0001);
        assertEquals(0.0, NumberUtils.toDouble(""), 0.0001);
        assertEquals(-1.5, NumberUtils.toDouble("-1.5"), 0.0001);
    }
    
    @Test
    public void testToByte() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 5, NumberUtils.toByte("5"));
        assertEquals((byte) 99, NumberUtils.toByte("abc", (byte) 99));
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
        assertEquals((byte) -10, NumberUtils.toByte("-10"));
    }
    
    @Test
    public void testToShort() {
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) 5, NumberUtils.toShort("5"));
        assertEquals((short) 99, NumberUtils.toShort("abc", (short) 99));
        assertEquals((short) 0, NumberUtils.toShort(""));
        assertEquals((short) -10, NumberUtils.toShort("-10"));
    }
    
    @Test
    public void testCreateNumber() {
        assertEquals(Integer.valueOf(5), NumberUtils.createNumber("5"));
        assertEquals(Long.valueOf(123456789L), NumberUtils.createNumber("123456789"));
        assertEquals(Double.valueOf(5.5), NumberUtils.createNumber("5.5"));
        assertEquals(Float.valueOf(3.14f), NumberUtils.createNumber("3.14f"));
        assertEquals(Double.valueOf(2.718), NumberUtils.createNumber("2.718d"));
        assertEquals(new java.math.BigInteger("123456789012345678901234567890"), NumberUtils.createNumber("123456789012345678901234567890"));
        assertEquals(java.math.BigDecimal.valueOf(0.1), NumberUtils.createNumber("0.1"));
        
        assertNull(NumberUtils.createNumber(null));
        assertNull(NumberUtils.createNumber(""));
    }
    
    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlank() {
        NumberUtils.createNumber("   ");
    }
    
    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalid() {
        NumberUtils.createNumber("abc");
    }
    
    @Test
    public void testCreateNumberHex() {
        assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
        assertEquals(Long.valueOf(255L), NumberUtils.createLong("0xFF"));
    }
    
    @Test
    public void testCreateFloat() {
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createFloat("0"));
        try {
            NumberUtils.createFloat("abc");
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }
    
    @Test
    public void testCreateDouble() {
        assertEquals(Double.valueOf(1.5), NumberUtils.createDouble("1.5"));
        try {
            NumberUtils.createDouble("abc");
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }
    
    @Test
    public void testCreateInteger() {
        assertEquals(Integer.valueOf(10), NumberUtils.createInteger("10"));
        assertEquals(Integer.valueOf(16), NumberUtils.createInteger("0x10"));
    }
    
    @Test
    public void testCreateLong() {
        assertEquals(Long.valueOf(10L), NumberUtils.createLong("10"));
        try {
            NumberUtils.createLong("abc");
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }
    
    @Test
    public void testCreateBigInteger() {
        assertEquals(new java.math.BigInteger("100"), NumberUtils.createBigInteger("100"));
    }
    
    @Test
    public void testCreateBigDecimal() {
        assertEquals(new java.math.BigDecimal("100.5"), NumberUtils.createBigDecimal("100.5"));
    }
    
    @Test
    public void testMinLongArray() {
        assertEquals(1L, NumberUtils.min(new long[]{5L, 1L, 3L}));
        assertEquals(-5L, NumberUtils.min(new long[]{-5L, 0L, 10L}));
        assertEquals(1L, NumberUtils.min(new long[]{1L}));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayNull() {
        NumberUtils.min((long[]) null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayEmpty() {
        NumberUtils.min(new long[0]);
    }
    
    @Test
    public void testMinIntArray() {
        assertEquals(1, NumberUtils.min(new int[]{5, 1, 3}));
        assertEquals(-10, NumberUtils.min(new int[]{-10, 0, 5}));
    }
    
    @Test
    public void testMinShortArray() {
        assertEquals((short) 1, NumberUtils.min(new short[]{(short) 5, (short) 1, (short) 3}));
    }
    
    @Test
    public void testMinByteArray() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{(byte) 5, (byte) 1, (byte) 3}));
    }
    
    @Test
    public void testMinDoubleArray() {
        assertEquals(1.5, NumberUtils.min(new double[]{5.5, 1.5, 3.5}), 0.001);
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.0, Double.NaN, 3.0})));
    }
    
    @Test
    public void testMinFloatArray() {
        assertEquals(1.5f, NumberUtils.min(new float[]{5.5f, 1.5f, 3.5f}), 0.001f);
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.0f, Float.NaN, 3.0f})));
    }
    
    @Test
    public void testMaxLongArray() {
        assertEquals(5L, NumberUtils.max(new long[]{5L, 1L, 3L}));
        assertEquals(10L, NumberUtils.max(new long[]{-5L, 0L, 10L}));
    }
    
    @Test
    public void testMaxIntArray() {
        assertEquals(5, NumberUtils.max(new int[]{5, 1, 3}));
        assertEquals(10, NumberUtils.max(new int[]{-10, 0, 10}));
    }
    
    @Test
    public void testMaxShortArray() {
        assertEquals((short) 5, NumberUtils.max(new short[]{(short) 5, (short) 1, (short) 3}));
    }
    
    @Test
    public void testMaxByteArray() {
        assertEquals((byte) 5, NumberUtils.max(new byte[]{(byte) 5, (byte) 1, (byte) 3}));
    }
    
    @Test
    public void testMaxDoubleArray() {
        assertEquals(5.5, NumberUtils.max(new double[]{5.5, 1.5, 3.5}), 0.001);
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.0, Double.NaN, 3.0})));
    }
    
    @Test
    public void testMaxFloatArray() {
        assertEquals(5.5f, NumberUtils.max(new float[]{5.5f, 1.5f, 3.5f}), 0.001f);
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.0f, Float.NaN, 3.0f})));
    }
    
    @Test
    public void testMin() {
        assertEquals(1L, NumberUtils.min(5L, 1L, 3L));
        assertEquals(1, NumberUtils.min(5, 1, 3));
        assertEquals((short) 1, NumberUtils.min((short) 5, (short) 1, (short) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 5, (byte) 1, (byte) 3));
        assertEquals(1.5, NumberUtils.min(5.5, 1.5, 3.3), 0.01);
        assertEquals(1.5f, NumberUtils.min(5.5f, 1.5f, 3.3f), 0.01f);
    }
    
    @Test
    public void testMax() {
        assertEquals(9L, NumberUtils.max(5L, 9L, 3L));
        assertEquals(9, NumberUtils.max(5, 9, 3));
        assertEquals((short) 9, NumberUtils.max((short) 5, (short) 9, (short) 3));
        assertEquals((byte) 9, NumberUtils.max((byte) 5, (byte) 9, (byte) 3));
        assertEquals(9.9, NumberUtils.max(5.5, 9.9, 3.3), 0.01);
        assertEquals(9.9f, NumberUtils.max(5.5f, 9.9f, 3.3f), 0.01f);
    }
    
    @Test
    public void testIsDigits() {
        assertTrue(NumberUtils.isDigits("12345"));
        assertFalse(NumberUtils.isDigits("123a5"));
        assertFalse(NumberUtils.isDigits("1.23"));
        assertFalse(NumberUtils.isDigits("-123"));
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertTrue(NumberUtils.isDigits("0"));
        assertFalse(NumberUtils.isDigits(" 123"));
    }
    
    @Test
    public void testIsNumber() {
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("123.45"));
        assertTrue(NumberUtils.isNumber(".5"));
        assertTrue(NumberUtils.isNumber("1e5"));
        assertTrue(NumberUtils.isNumber("1E5"));
        assertTrue(NumberUtils.isNumber("1.5e-3"));
        assertTrue(NumberUtils.isNumber("0xFF"));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber("abc"));
        assertFalse(NumberUtils.isNumber("12e"));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertFalse(NumberUtils.isNumber("-"));
        assertFalse(NumberUtils.isNumber("12d"));
        assertFalse(NumberUtils.isNumber("12l"));
        assertFalse(NumberUtils.isNumber("--123"));
        assertFalse(NumberUtils.isNumber("0x"));
    }
}