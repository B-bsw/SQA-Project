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
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(5, NumberUtils.toInt("abc", 5));
        assertEquals(123, NumberUtils.toInt("123", 0));
    }
    
    @Test
    public void testToLong() {
        assertEquals(123L, NumberUtils.toLong("123"));
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(7L, NumberUtils.toLong("invalid", 7L));
    }
    
    @Test
    public void testToFloat() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0f);
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
        assertEquals(2.5f, NumberUtils.toFloat("bad", 2.5f), 0.0f);
    }
    
    @Test
    public void testToDouble() {
        assertEquals(1.5, NumberUtils.toDouble("1.5"), 0.0);
        assertEquals(0.0, NumberUtils.toDouble(null), 0.0);
        assertEquals(3.5, NumberUtils.toDouble("bad", 3.5), 0.0);
    }
    
    @Test
    public void testToByte() {
        assertEquals((byte) 10, NumberUtils.toByte("10"));
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 3, NumberUtils.toByte("bad", (byte) 3));
    }
    
    @Test
    public void testToShort() {
        assertEquals((short) 100, NumberUtils.toShort("100"));
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) 7, NumberUtils.toShort("bad", (short) 7));
    }
    
    @Test(expected = NumberFormatException.class)
    public void testToIntInvalid() {
        NumberUtils.toInt("abc");
    }
    
    @Test(expected = NumberFormatException.class)
    public void testToLongInvalid() {
        NumberUtils.toLong("invalid");
    }
    
    @Test
    public void testCreateNumber() throws NumberFormatException {
        assertEquals(Integer.valueOf("42"), NumberUtils.createNumber("42"));
        assertEquals(Long.valueOf("123456"), NumberUtils.createNumber("123456"));
        assertEquals(Float.valueOf("1.5f"), NumberUtils.createNumber("1.5f"));
        assertEquals(Double.valueOf("2.5d"), NumberUtils.createNumber("2.5d"));
        assertEquals(new java.math.BigInteger("123456789012345"), NumberUtils.createNumber("123456789012345"));
        assertEquals(new java.math.BigDecimal("123.456"), NumberUtils.createNumber("123.456"));
        assertEquals(java.math.BigInteger.valueOf(255), NumberUtils.createNumber("0xFF"));
    }
    
    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlank() {
        NumberUtils.createNumber("");
    }
    
    @Test
    public void testCreateFloat() {
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
    }
    
    @Test
    public void testCreateDouble() {
        assertEquals(Double.valueOf(2.5), NumberUtils.createDouble("2.5"));
    }
    
    @Test
    public void testCreateInteger() {
        assertEquals(Integer.valueOf("10"), NumberUtils.createInteger("10"));
    }
    
    @Test
    public void testCreateLong() {
        assertEquals(Long.valueOf("100"), NumberUtils.createLong("100"));
    }
    
    @Test
    public void testCreateBigInteger() {
        assertEquals(new java.math.BigInteger("123456789"), NumberUtils.createBigInteger("123456789"));
    }
    
    @Test
    public void testCreateBigDecimal() {
        assertEquals(new java.math.BigDecimal("123.45"), NumberUtils.createBigDecimal("123.45"));
    }
    
    @Test
    public void testMin() {
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
        assertEquals(1L, NumberUtils.min(new long[]{3, 1, 2}));
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 1, 2}));
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 1, 2}));
        assertEquals(1.0, NumberUtils.min(new double[]{3.0, 1.0, 2.0}), 0.0);
        assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 1.0f, 2.0f}), 0.0f);
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
    public void testMax() {
        assertEquals(3, NumberUtils.max(new int[]{3, 1, 2}));
        assertEquals(3L, NumberUtils.max(new long[]{3, 1, 2}));
        assertEquals((short) 3, NumberUtils.max(new short[]{3, 1, 2}));
        assertEquals((byte) 3, NumberUtils.max(new byte[]{3, 1, 2}));
        assertEquals(3.0, NumberUtils.max(new double[]{3.0, 1.0, 2.0}), 0.0);
        assertEquals(3.0f, NumberUtils.max(new float[]{3.0f, 1.0f, 2.0f}), 0.0f);
    }
    
    @Test
    public void testMinThreeValues() {
        assertEquals(1, NumberUtils.min(5, 1, 9));
        assertEquals(1L, NumberUtils.min(5L, 1L, 9L));
        assertEquals((short) 1, NumberUtils.min((short) 5, (short) 1, (short) 9));
        assertEquals((byte) 1, NumberUtils.min((byte) 5, (byte) 1, (byte) 9));
        assertEquals(1.0, NumberUtils.min(5.0, 1.0, 9.0), 0.0);
        assertEquals(1.0f, NumberUtils.min(5.0f, 1.0f, 9.0f), 0.0f);
    }
    
    @Test
    public void testMaxThreeValues() {
        assertEquals(9, NumberUtils.max(5, 1, 9));
        assertEquals(9L, NumberUtils.max(5L, 1L, 9L));
        assertEquals((short) 9, NumberUtils.max((short) 5, (short) 1, (short) 9));
        assertEquals((byte) 9, NumberUtils.max((byte) 5, (byte) 1, (byte) 9));
        assertEquals(1.0, NumberUtils.max(5.0, 1.0, 9.0), 0.0);
        assertEquals(9.0f, NumberUtils.max(5.0f, 1.0f, 9.0f), 0.0f);
    }
    
    @Test
    public void testIsDigits() {
        assertTrue(NumberUtils.isDigits("12345"));
        assertFalse(NumberUtils.isDigits("12a45"));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits("-123"));
    }
    
    @Test
    public void testIsNumber() {
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("1.5"));
        assertTrue(NumberUtils.isNumber("1e10"));
        assertTrue(NumberUtils.isNumber("1.5f"));
        assertTrue(NumberUtils.isNumber("1.5d"));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber("abc"));
        assertFalse(NumberUtils.isNumber("123abc"));
    }
}