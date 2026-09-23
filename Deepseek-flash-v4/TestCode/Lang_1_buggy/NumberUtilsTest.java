package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class NumberUtilsTest {
    
    @Before
    public void setUp() {
    }

    // Test toInt
    @Test
    public void testToInt() {
        assertEquals(123, NumberUtils.toInt("123"));
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(-1, NumberUtils.toInt("abc", -1));
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    // Test toLong
    @Test
    public void testToLong() {
        assertEquals(123L, NumberUtils.toLong("123"));
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(-1L, NumberUtils.toLong("abc", -1L));
        assertEquals(0L, NumberUtils.toLong("abc"));
    }

    // Test toFloat
    @Test
    public void testToFloat() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
        assertEquals(-1.0f, NumberUtils.toFloat("abc", -1.0f), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0001f);
    }

    // Test toDouble
    @Test
    public void testToDouble() {
        assertEquals(2.5, NumberUtils.toDouble("2.5"), 0.0001);
        assertEquals(0.0, NumberUtils.toDouble(null), 0.0001);
        assertEquals(-1.0, NumberUtils.toDouble("abc", -1.0), 0.0001);
        assertEquals(0.0, NumberUtils.toDouble("abc"), 0.0001);
    }

    // Test toByte
    @Test
    public void testToByte() {
        assertEquals((byte) 10, NumberUtils.toByte("10"));
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) -1, NumberUtils.toByte("abc", (byte) -1));
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
    }

    // Test toShort
    @Test
    public void testToShort() {
        assertEquals((short) 10, NumberUtils.toShort("10"));
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) -1, NumberUtils.toShort("abc", (short) -1));
        assertEquals((short) 0, NumberUtils.toShort("abc"));
    }

    // Test createNumber
    @Test
    public void testCreateNumber() {
        assertEquals(Integer.valueOf(100), NumberUtils.createNumber("100"));
        assertEquals(Long.valueOf(100000000000L), NumberUtils.createNumber("100000000000"));
        assertEquals(Double.valueOf(1.5), NumberUtils.createNumber("1.5"));
        assertEquals(Float.valueOf(1.5f), NumberUtils.createNumber("1.5f"));
        assertEquals(Double.valueOf(1.5), NumberUtils.createNumber("1.5d"));
        assertEquals(BigInteger.valueOf(255), NumberUtils.createNumber("0xFF"));
        assertNull(NumberUtils.createNumber(null));
        try {
            NumberUtils.createNumber("");
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
        try {
            NumberUtils.createNumber("   ");
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    // Test createBigDecimal
    @Test
    public void testCreateBigDecimal() {
        assertEquals(new BigDecimal("123.45"), NumberUtils.createBigDecimal("123.45"));
        assertEquals(new BigDecimal("123"), NumberUtils.createBigDecimal("123"));
        assertEquals(new BigDecimal("--123"), NumberUtils.createBigDecimal("--123"));
        try {
            NumberUtils.createBigDecimal("abc");
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    // Test min methods
    @Test
    public void testMin() {
        assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
        assertEquals(1, NumberUtils.min(3, 1, 2));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
        assertEquals(1.0, NumberUtils.min(3.0, 1.0, 2.0), 0.0001);
        assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.0001f);
        
        double[] doubleArr = {3.0, 1.0, 2.0};
        assertEquals(1.0, NumberUtils.min(doubleArr), 0.0001);
        double[] nanArr = {3.0, Double.NaN, 2.0};
        assertTrue(Double.isNaN(NumberUtils.min(nanArr)));
        
        int[] intArr = {3, 1, 2};
        assertEquals(1, NumberUtils.max(intArr));
    }

    // Test max methods
    @Test
    public void testMax() {
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        assertEquals(3, NumberUtils.max(1, 3, 2));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        assertEquals(3.0, NumberUtils.max(1.0, 3.0, 2.0), 0.0001);
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0001f);
    }

    // Test isDigits
    @Test
    public void testIsDigits() {
        assertTrue(NumberUtils.isDigits("12345"));
        assertFalse(NumberUtils.isDigits("123.45"));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits("12a34"));
    }

    // Test isNumber
    @Test
    public void testIsNumber() {
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("123.45"));
        assertTrue(NumberUtils.isNumber("123e10"));
        assertTrue(NumberUtils.isNumber("123E-5"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("0xFF"));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber("12a34"));
        assertFalse(NumberUtils.isNumber("--123"));
    }

    // Test createFloat and related
    @Test
    public void testCreateFloat() {
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
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
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
        try {
            NumberUtils.createInteger("123abc");
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testCreateLong() {
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
        try {
            NumberUtils.createLong("123abc");
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testCreateBigInteger() {
        assertEquals(BigInteger.valueOf(255), NumberUtils.createBigInteger("0xFF"));
        assertEquals(BigInteger.valueOf(-255), NumberUtils.createBigInteger("-0xFF"));
        assertEquals(BigInteger.valueOf(8), NumberUtils.createBigInteger("010"));
        try {
            NumberUtils.createBigInteger("abc");
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    // Test createBigDecimal with leading --
    @Test
    public void testCreateBigDecimalDoubleDash() {
        assertEquals(new BigDecimal("123"), NumberUtils.createBigDecimal("--123"));
        try {
            NumberUtils.createBigDecimal(null);
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    // Test max with arrays
    @Test
    public void testMaxWithArrays() {
        long[] longArr = {1L, 5L, 3L};
        assertEquals(5L, NumberUtils.max(longArr));
        
        int[] intArr = {1, 5, 3};
        assertEquals(5, NumberUtils.max(intArr));
        
        short[] shortArr = {1, 5, 3};
        assertEquals((short) 5, NumberUtils.max(shortArr));
        
        byte[] byteArr = {1, 5, 3};
        assertEquals((byte) 5, NumberUtils.max(byteArr));
        
        double[] doubleArr = {1.0, 5.0, 3.0};
        assertEquals(5.0, NumberUtils.max(doubleArr), 0.0001);
        
        float[] floatArr = {1.0f, 5.0f, 3.0f};
        assertEquals(5.0f, NumberUtils.max(floatArr), 0.0001f);
    }

    // Test min with arrays
    @Test
    public void testMinWithArrays() {
        long[] longArr = {1L, 5L, 3L};
        assertEquals(1L, NumberUtils.min(longArr));
        
        int[] intArr = {1, 5, 3};
        assertEquals(1, NumberUtils.min(intArr));
        
        short[] shortArr = {1, 5, 3};
        assertEquals((short) 1, NumberUtils.min(shortArr));
        
        byte[] byteArr = {1, 5, 3};
        assertEquals((byte) 1, NumberUtils.min(byteArr));
        
        double[] doubleArr = {1.0, 5.0, 3.0};
        assertEquals(1.0, NumberUtils.min(doubleArr), 0.0001);
        
        float[] floatArr = {1.0f, 5.0f, 3.0f};
        assertEquals(1.0f, NumberUtils.min(floatArr), 0.0001f);
        
        double[] nanArr = {1.0, Double.NaN, 3.0};
        assertTrue(Double.isNaN(NumberUtils.min(nanArr)));
        
        float[] nanFloatArr = {1.0f, Float.NaN, 3.0f};
        assertTrue(Float.isNaN(NumberUtils.min(nanFloatArr)));
    }

    // Test exception for empty array
    @Test(expected = IllegalArgumentException.class)
    public void testMinEmptyArray() {
        NumberUtils.min(new double[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxNullArray() {
        NumberUtils.max((double[]) null);
    }

    // Test isAllZeros private method indirectly
    @Test
    public void testIsNumberWithSuffixes() {
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("123f"));
        assertTrue(NumberUtils.isNumber("123d"));
        assertFalse(NumberUtils.isNumber("123x"));
    }

    // Test isNumber with edge cases
    @Test
    public void testIsNumberEdgeCases() {
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("0xG"));
        assertTrue(NumberUtils.isNumber("0xA"));
        assertFalse(NumberUtils.isNumber("-"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertFalse(NumberUtils.isNumber("1e2e3"));
        assertTrue(NumberUtils.isNumber("1e2"));
        assertTrue(NumberUtils.isNumber("1E2"));
        assertTrue(NumberUtils.isNumber("1e-2"));
    }

    // Test createNumber with various formats
    @Test
    public void testCreateNumberVariousFormats() {
        assertTrue(NumberUtils.createNumber("123") instanceof Integer);
        assertTrue(NumberUtils.createNumber("123L") instanceof Long);
        assertTrue(NumberUtils.createNumber("123f") instanceof Float);
        assertTrue(NumberUtils.createNumber("123d") instanceof Double);
        assertTrue(NumberUtils.createNumber("0x7F") instanceof Integer);
        assertTrue(NumberUtils.createNumber("0x7FFFFFFFFFFFFFFF") instanceof Long);
        assertTrue(NumberUtils.createNumber("0x7FFFFFFFFFFFFFFFFFFFFFFFF") instanceof BigInteger);
    }
}