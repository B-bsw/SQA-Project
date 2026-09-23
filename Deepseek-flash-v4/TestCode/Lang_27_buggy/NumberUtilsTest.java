package org.apache.commons.lang3.math;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class NumberUtilsTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testToInt() {
        assertEquals(123, NumberUtils.toInt("123"));
        assertEquals(-456, NumberUtils.toInt("-456"));
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(5, NumberUtils.toInt(null, 5));
        assertEquals(5, NumberUtils.toInt("abc", 5));
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToLong() {
        assertEquals(123L, NumberUtils.toLong("123"));
        assertEquals(-456L, NumberUtils.toLong("-456"));
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(5L, NumberUtils.toLong(null, 5L));
        assertEquals(5L, NumberUtils.toLong("abc", 5L));
    }

    @Test
    public void testToFloat() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.001);
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.001);
        assertEquals(5.0f, NumberUtils.toFloat("abc", 5.0f), 0.001);
    }

    @Test
    public void testToDouble() {
        assertEquals(1.5, NumberUtils.toDouble("1.5"), 0.001);
        assertEquals(0.0, NumberUtils.toDouble(null), 0.001);
        assertEquals(5.0, NumberUtils.toDouble("abc", 5.0), 0.001);
    }

    @Test
    public void testToByte() {
        assertEquals((byte) 127, NumberUtils.toByte("127"));
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 5, NumberUtils.toByte("abc", (byte) 5));
    }

    @Test
    public void testToShort() {
        assertEquals((short) 123, NumberUtils.toShort("123"));
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) 5, NumberUtils.toShort("abc", (short) 5));
    }

    @Test
    public void testCreateNumber() {
        assertEquals(Long.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Integer.valueOf(0x1F), NumberUtils.createNumber("0x1F"));
        assertEquals(Float.valueOf("1.5"), NumberUtils.createNumber("1.5f"));
        assertEquals(Double.valueOf("2.5"), NumberUtils.createNumber("2.5d"));
        assertEquals(new java.math.BigDecimal("3.14"), NumberUtils.createNumber("3.14"));
        assertEquals(Float.valueOf("1.5"), NumberUtils.createNumber("1.5F"));
        assertEquals(Double.valueOf("2.5"), NumberUtils.createNumber("2.5D"));
        
        try {
            NumberUtils.createNumber("");
            fail("NumberFormatException expected");
        } catch (NumberFormatException e) {
            // expected
        }
        
        try {
            NumberUtils.createNumber(null);
            fail("NumberFormatException expected");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testCreateFloat() {
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
        try {
            NumberUtils.createFloat(null);
            fail("NumberFormatException expected");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testCreateDouble() {
        assertEquals(Double.valueOf(1.5), NumberUtils.createDouble("1.5"));
    }

    @Test
    public void testCreateInteger() {
        assertEquals(Integer.valueOf("FF", 16), NumberUtils.createInteger("0xFF"));
    }

    @Test
    public void testCreateLong() {
        assertEquals(Long.valueOf(123), NumberUtils.createLong("123"));
    }

    @Test
    public void testCreateBigInteger() {
        assertEquals(new java.math.BigInteger("123456789"), NumberUtils.createBigInteger("123456789"));
    }

    @Test
    public void testCreateBigDecimal() {
        assertEquals(new java.math.BigDecimal("3.14"), NumberUtils.createBigDecimal("3.14"));
    }

    @Test
    public void testMin() {
        assertEquals(1, NumberUtils.min(new int[] {3, 1, 2}));
        assertEquals(1L, NumberUtils.min(new long[] {3L, 1L, 2L}));
        assertEquals((short) 1, NumberUtils.min(new short[] {3, 1, 2}));
        assertEquals((byte) 1, NumberUtils.min(new byte[] {3, 1, 2}));
        assertEquals(1.0, NumberUtils.min(new double[] {3.0, 1.0, 2.0}), 0.001);
        assertEquals(1.0f, NumberUtils.min(new float[] {3.0f, 1.0f, 2.0f}), 0.001);
        
        assertTrue(Double.isNaN(NumberUtils.min(new double[] {3.0, Double.NaN, 2.0})));
        assertTrue(Float.isNaN(NumberUtils.min(new float[] {3.0f, Float.NaN, 2.0f})));

        try {
            NumberUtils.min((int[]) null);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // expected
        }
        
        try {
            NumberUtils.min(new int[] {});
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testMax() {
        assertEquals(3, NumberUtils.max(new int[] {3, 1, 2}));
        assertEquals(3L, NumberUtils.max(new long[] {1L, 3L, 2L}));
        assertEquals((short) 3, NumberUtils.max(new short[] {1, 3, 2}));
        assertEquals((byte) 3, NumberUtils.max(new byte[] {1, 3, 2}));
        assertEquals(3.0, NumberUtils.max(new double[] {1.0, 3.0, 2.0}), 0.001);
        assertEquals(3.0f, NumberUtils.max(new float[] {1.0f, 3.0f, 2.0f}), 0.001);
        
        assertTrue(Double.isNaN(NumberUtils.max(new double[] {1.0, Double.NaN, 2.0})));
        assertTrue(Float.isNaN(NumberUtils.max(new float[] {1.0f, Float.NaN, 2.0f})));
    }

    @Test
    public void testMinLong() {
        assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
        assertEquals(0L, NumberUtils.min(0L, 1L, 2L));
    }

    @Test
    public void testMinInt() {
        assertEquals(1, NumberUtils.min(3, 1, 2));
        assertEquals(0, NumberUtils.min(0, 1, 2));
    }

    @Test
    public void testMinShort() {
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
    }

    @Test
    public void testMinByte() {
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
    }

    @Test
    public void testMinDouble() {
        assertEquals(1.0, NumberUtils.min(3.0, 1.0, 2.0), 0.001);
    }

    @Test
    public void testMinFloat() {
        assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.001);
    }

    @Test
    public void testMaxLong() {
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
    }

    @Test
    public void testMaxInt() {
        assertEquals(3, NumberUtils.max(1, 3, 2));
    }

    @Test
    public void testMaxShort() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
    }

    @Test
    public void testMaxByte() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
    }

    @Test
    public void testMaxDouble() {
        assertEquals(3.0, NumberUtils.max(1.0, 3.0, 2.0), 0.001);
    }

    @Test
    public void testMaxFloat() {
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.001);
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
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("1.5"));
        assertTrue(NumberUtils.isNumber("1.5e2"));
        assertTrue(NumberUtils.isNumber("0x1F"));
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("1.5f"));
        assertTrue(NumberUtils.isNumber("1.5D"));
        assertTrue(NumberUtils.isNumber("0.5"));
        assertFalse(NumberUtils.isNumber("abc"));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber("123Lg"));
        assertFalse(NumberUtils.isNumber("--123"));
        assertFalse(NumberUtils.isNumber("123e"));
        assertFalse(NumberUtils.isNumber("123.5.6"));
    }
}