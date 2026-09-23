package org.apache.commons.lang;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsTest {

    // Constructor test
    @Test
    public void testConstructor() throws Exception {
        assertNotNull(new NumberUtils());
        Constructor<?> c = NumberUtils.class.getDeclaredConstructor();
        assertEquals(Modifier.PUBLIC, c.getModifiers() & Modifier.PUBLIC);
        assertEquals(Modifier.PUBLIC, NumberUtils.class.getModifiers() & Modifier.PUBLIC);
    }

    // stringToInt(String) tests
    @Test
    public void testStringToInt_String() {
        assertEquals(4, NumberUtils.stringToInt("4"));
        assertEquals(0, NumberUtils.stringToInt("4x"));
        assertEquals(0, NumberUtils.stringToInt(""));
        assertEquals(0, NumberUtils.stringToInt(" "));
        assertEquals(0, NumberUtils.stringToInt(null));
        assertEquals(123, NumberUtils.stringToInt("123"));
    }

    // stringToInt(String, int) tests
    @Test
    public void testStringToInt_StringInt() {
        assertEquals(4, NumberUtils.stringToInt("4", 1));
        assertEquals(1, NumberUtils.stringToInt("4x", 1));
        assertEquals(1, NumberUtils.stringToInt("", 1));
        assertEquals(1, NumberUtils.stringToInt(" ", 1));
        assertEquals(1, NumberUtils.stringToInt(null, 1));
        assertEquals(0, NumberUtils.stringToInt("", 0));
        assertEquals(-5, NumberUtils.stringToInt("-5", 0));
        assertEquals(999, NumberUtils.stringToInt("999", 0));
    }

    // createNumber tests
    @Test
    public void testCreateNumber() throws Exception {
        assertNull(NumberUtils.createNumber(null));
        assertEquals(Integer.valueOf(7), NumberUtils.createNumber("7"));
        assertEquals(Integer.valueOf(7), NumberUtils.createNumber(" 7"));
        assertEquals(Integer.valueOf(7), NumberUtils.createNumber("+7"));
        assertEquals(Integer.valueOf(-7), NumberUtils.createNumber("-7"));
        assertEquals(Integer.valueOf(0), NumberUtils.createNumber("0"));
        assertEquals(Integer.valueOf(0), NumberUtils.createNumber("0x0"));
        assertEquals(Integer.valueOf(0), NumberUtils.createNumber("0X0"));
        assertEquals(Integer.valueOf(0), NumberUtils.createNumber("-0x0"));
        assertEquals(Integer.valueOf(0), NumberUtils.createNumber("-0X0"));
        assertEquals(Integer.valueOf(10), NumberUtils.createNumber("0xA"));
        assertEquals(Integer.valueOf(10), NumberUtils.createNumber("0XA"));
        assertEquals(Integer.valueOf(-10), NumberUtils.createNumber("-0xA"));
        assertEquals(Integer.valueOf(10), NumberUtils.createNumber("0xa"));
        assertEquals(Integer.valueOf(-10), NumberUtils.createNumber("-0xa"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(Long.valueOf(-2147483648L), NumberUtils.createNumber("-2147483648"));
        assertEquals(Long.valueOf(9223372036854775807L), NumberUtils.createNumber("9223372036854775807"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808"));
        assertEquals(Double.valueOf("1.1"), NumberUtils.createNumber("1.1"));
        assertEquals(Float.valueOf("1.1"), NumberUtils.createNumber("1.1f"));
        assertEquals(Float.valueOf("1.1"), NumberUtils.createNumber("1.1F"));
        assertEquals(Double.valueOf("1.1"), NumberUtils.createNumber("1.1d"));
        assertEquals(Double.valueOf("1.1"), NumberUtils.createNumber("1.1D"));
        assertEquals(Double.valueOf("1.1"), NumberUtils.createNumber("1.1"));
        assertEquals(new BigDecimal("1.1"), NumberUtils.createNumber("1.1"));
        assertEquals(new BigDecimal("12345678901234567890.1"), NumberUtils.createNumber("12345678901234567890.1"));
        assertEquals(Long.valueOf("1"), NumberUtils.createNumber("1l"));
        assertEquals(Long.valueOf("1"), NumberUtils.createNumber("1L"));
        assertEquals(new BigInteger("12345678901234567890"), NumberUtils.createNumber("12345678901234567890l"));
        assertEquals(Float.valueOf("1e5"), NumberUtils.createNumber("1e5"));
        assertEquals(Double.valueOf("1e5"), NumberUtils.createNumber("1e5"));
        assertEquals(Float.valueOf("1e5"), NumberUtils.createNumber("1e5f"));
        assertEquals(Double.valueOf("1e5"), NumberUtils.createNumber("1e5d"));
        assertEquals(new BigDecimal("1e5"), NumberUtils.createNumber("1e5"));
        assertEquals(Float.valueOf("1.1e5"), NumberUtils.createNumber("1.1e5f"));
        assertEquals(Double.valueOf("1.1e5"), NumberUtils.createNumber("1.1e5d"));
        assertEquals(new BigDecimal("1.1e5"), NumberUtils.createNumber("1.1e5"));
        assertEquals(Float.valueOf("10"), NumberUtils.createNumber("0X10f"));
        assertEquals(new BigDecimal("0.1"), NumberUtils.createNumber("0.1"));
        assertEquals(new BigDecimal("0"), NumberUtils.createNumber(".0"));
        assertEquals(new BigDecimal("0.0"), NumberUtils.createNumber("0.0"));
        assertEquals(new BigDecimal("0"), NumberUtils.createNumber("0."));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidFormat() {
        NumberUtils.createNumber("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidFormat2() {
        NumberUtils.createNumber("--1");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidFormat3() {
        NumberUtils.createNumber("-");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidFormat4() {
        NumberUtils.createNumber("0x");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidFormat5() {
        NumberUtils.createNumber("--0x1");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidFormat6() {
        NumberUtils.createNumber("0x1g");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidFormat7() {
        NumberUtils.createNumber("1.1.2");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidFormat8() {
        NumberUtils.createNumber("1.2e");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidFormat9() {
        NumberUtils.createNumber("1e");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidFormat10() {
        NumberUtils.createNumber("1e2e3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidFormat11() {
        NumberUtils.createNumber("1.2e3.4");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidFormat12() {
        NumberUtils.createNumber("abc");
    }

    // createFloat tests
    @Test
    public void testCreateFloat() {
        assertEquals(Float.valueOf("1.1"), NumberUtils.createFloat("1.1"));
        assertEquals(Float.valueOf("0"), NumberUtils.createFloat("0"));
        assertEquals(Float.valueOf("0"), NumberUtils.createFloat(".0"));
        assertEquals(Float.valueOf("2"), NumberUtils.createFloat("0x2"));
        assertEquals(Float.valueOf("10"), NumberUtils.createFloat("0xA"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloatNull() {
        NumberUtils.createFloat(null);
    }

    // createDouble tests
    @Test
    public void testCreateDouble() {
        assertEquals(Double.valueOf("1.1"), NumberUtils.createDouble("1.1"));
        assertEquals(Double.valueOf("0"), NumberUtils.createDouble("0"));
        assertEquals(Double.valueOf("2"), NumberUtils.createDouble("0x2"));
        assertEquals(Double.valueOf("10"), NumberUtils.createDouble("0xA"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDoubleNull() {
        NumberUtils.createDouble(null);
    }

    // createInteger tests
    @Test
    public void testCreateInteger() {
        assertEquals(Integer.valueOf(1), NumberUtils.createInteger("1"));
        assertEquals(Integer.valueOf(1), NumberUtils.createInteger(" 1"));
        assertEquals(Integer.valueOf(-1), NumberUtils.createInteger(" -1"));
        assertEquals(Integer.valueOf(10), NumberUtils.createInteger("0xA"));
        assertEquals(Integer.valueOf(10), NumberUtils.createInteger("0XA"));
        assertEquals(Integer.valueOf(-10), NumberUtils.createInteger("-0xA"));
        assertEquals(Integer.valueOf(-10), NumberUtils.createInteger("-0XA"));
        assertEquals(Integer.valueOf(1), NumberUtils.createInteger("1f"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateIntegerNull() {
        NumberUtils.createInteger(null);
    }

    // createLong tests
    @Test
    public void testCreateLong() {
        assertEquals(Long.valueOf(1L), NumberUtils.createLong("1"));
        assertEquals(Long.valueOf(1L), NumberUtils.createLong(" 1"));
        assertEquals(Long.valueOf(-1L), NumberUtils.createLong(" -1"));
        assertEquals(Long.valueOf(-1L), NumberUtils.createLong("-1f"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLongNull() {
        NumberUtils.createLong(null);
    }

    // createBigInteger tests
    @Test
    public void testCreateBigInteger() {
        assertEquals(BigInteger.ONE, NumberUtils.createBigInteger("1"));
        assertEquals(BigInteger.valueOf(-1), NumberUtils.createBigInteger("-1"));
        assertEquals(BigInteger.valueOf(10), NumberUtils.createBigInteger("0xA"));
        assertEquals(BigInteger.valueOf(10), NumberUtils.createBigInteger("0XA"));
        assertEquals(BigInteger.valueOf(-10), NumberUtils.createBigInteger("-0xA"));
        assertEquals(BigInteger.TEN, NumberUtils.createBigInteger("10L"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigIntegerNull() {
        NumberUtils.createBigInteger(null);
    }

    // createBigDecimal tests
    @Test
    public void testCreateBigDecimal() {
        assertEquals(BigDecimal.ONE, NumberUtils.createBigDecimal("1"));
        assertEquals(BigDecimal.valueOf(-1), NumberUtils.createBigDecimal("-1"));
        assertEquals(new BigDecimal("1.1"), NumberUtils.createBigDecimal("1.1"));
        assertEquals(new BigDecimal("10"), NumberUtils.createBigDecimal("10"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimalNull() {
        NumberUtils.createBigDecimal(null);
    }

    // minimum tests
    @Test
    public void testMinimumLong() {
        assertEquals(1L, NumberUtils.minimum(1L, 2L, 3L));
        assertEquals(1L, NumberUtils.minimum(2L, 1L, 3L));
        assertEquals(1L, NumberUtils.minimum(2L, 3L, 1L));
        assertEquals(1L, NumberUtils.minimum(1L, 1L, 1L));
        assertEquals(Long.MIN_VALUE, NumberUtils.minimum(Long.MIN_VALUE, 0L, Long.MAX_VALUE));
    }

    @Test
    public void testMinimumInt() {
        assertEquals(1, NumberUtils.minimum(1, 2, 3));
        assertEquals(1, NumberUtils.minimum(2, 1, 3));
        assertEquals(1, NumberUtils.minimum(2, 3, 1));
        assertEquals(1, NumberUtils.minimum(1, 1, 1));
        assertEquals(Integer.MIN_VALUE, NumberUtils.minimum(Integer.MIN_VALUE, 0, Integer.MAX_VALUE));
    }

    @Test
    public void testMinimumLongEdgeCases() {
        assertEquals(Long.MIN_VALUE, NumberUtils.minimum(Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE));
        assertEquals(Long.MAX_VALUE, NumberUtils.minimum(Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE));
        assertEquals(Long.MIN_VALUE, NumberUtils.minimum(0L, Long.MIN_VALUE, 1L));
    }

    // maximum tests
    @Test
    public void testMaximumLong() {
        assertEquals(3L, NumberUtils.maximum(1L, 2L, 3L));
        assertEquals(3L, NumberUtils.maximum(3L, 2L, 1L));
        assertEquals(3L, NumberUtils.maximum(2L, 3L, 1L));
        assertEquals(3L, NumberUtils.maximum(1L, 1L, 3L));
        assertEquals(Long.MAX_VALUE, NumberUtils.maximum(Long.MAX_VALUE, 0L, Long.MIN_VALUE));
    }

    @Test
    public void testMaximumInt() {
        assertEquals(3, NumberUtils.maximum(1, 2, 3));
        assertEquals(3, NumberUtils.maximum(3, 2, 1));
        assertEquals(3, NumberUtils.maximum(2, 3, 1));
        assertEquals(3, NumberUtils.maximum(1, 1, 3));
        assertEquals(Integer.MAX_VALUE, NumberUtils.maximum(Integer.MAX_VALUE, 0, Integer.MIN_VALUE));
    }

    @Test
    public void testMaximumLongEdgeCases() {
        assertEquals(Long.MIN_VALUE, NumberUtils.maximum(Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE));
        assertEquals(Long.MAX_VALUE, NumberUtils.maximum(Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE));
        assertEquals(Long.MAX_VALUE, NumberUtils.maximum(0L, Long.MAX_VALUE, 1L));
    }

    // compare(double, double) tests
    @Test
    public void testCompareDouble() {
        assertEquals(-1, NumberUtils.compare(1.0, 2.0));
        assertEquals(1, NumberUtils.compare(2.0, 1.0));
        assertEquals(0, NumberUtils.compare(1.0, 1.0));
        assertEquals(-1, NumberUtils.compare(-1.0, 1.0));
        assertEquals(1, NumberUtils.compare(1.0, -1.0));
        assertEquals(-1, NumberUtils.compare(-Double.MAX_VALUE, Double.MAX_VALUE));
        assertEquals(1, NumberUtils.compare(Double.MAX_VALUE, -Double.MAX_VALUE));
        assertEquals(0, NumberUtils.compare(Double.NaN, Double.NaN));
        assertEquals(-1, NumberUtils.compare(Double.NaN, 1.0));
        assertEquals(1, NumberUtils.compare(1.0, Double.NaN));
        assertEquals(0, NumberUtils.compare(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
        assertEquals(0, NumberUtils.compare(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY));
        assertEquals(1, NumberUtils.compare(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY));
        assertEquals(-1, NumberUtils.compare(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY));
        assertEquals(1, NumberUtils.compare(0.0, -0.0));
        assertEquals(-1, NumberUtils.compare(-0.0, 0.0));
    }

    // isDigits tests
    @Test
    public void testIsDigits() {
        assertTrue(NumberUtils.isDigits("123"));
        assertTrue(NumberUtils.isDigits("0"));
        assertTrue(NumberUtils.isDigits("1234567890"));
        assertFalse(NumberUtils.isDigits("12.3"));
        assertFalse(NumberUtils.isDigits("12a"));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits("-123"));
        assertFalse(NumberUtils.isDigits(" 123"));
        assertFalse(NumberUtils.isDigits("123 "));
    }

    // isNumber tests
    @Test
    public void testIsNumber() {
        assertTrue(NumberUtils.isNumber("1"));
        assertTrue(NumberUtils.isNumber("1.1"));
        assertTrue(NumberUtils.isNumber(".1"));
        assertTrue(NumberUtils.isNumber("1."));
        assertTrue(NumberUtils.isNumber("1e1"));
        assertTrue(NumberUtils.isNumber("1E1"));
        assertTrue(NumberUtils.isNumber("1e-1"));
        assertTrue(NumberUtils.isNumber("1e+1"));
        assertTrue(NumberUtils.isNumber("-1"));
        assertTrue(NumberUtils.isNumber("+1"));
        assertTrue(NumberUtils.isNumber("01"));
        assertTrue(NumberUtils.isNumber("0x1"));
        assertTrue(NumberUtils.isNumber("0X1"));
        assertTrue(NumberUtils.isNumber("-0x1"));
        assertTrue(NumberUtils.isNumber("+0x1"));
        assertTrue(NumberUtils.isNumber("0x10"));
        assertTrue(NumberUtils.isNumber("-0x10"));
        assertTrue(NumberUtils.isNumber("0xABCDEF"));
        assertTrue(NumberUtils.isNumber("-0xABCDEF"));
        assertTrue(NumberUtils.isNumber("1f"));
        assertTrue(NumberUtils.isNumber("1F"));
        assertTrue(NumberUtils.isNumber("1d"));
        assertTrue(NumberUtils.isNumber("1D"));
        assertTrue(NumberUtils.isNumber("1l"));
        assertTrue(NumberUtils.isNumber("1L"));
        assertTrue(NumberUtils.isNumber("1234567890L"));
        assertTrue(NumberUtils.isNumber("1234567890l"));
        assertTrue(NumberUtils.isNumber("1.1f"));
        assertTrue(NumberUtils.isNumber("1.1F"));
        assertTrue(NumberUtils.isNumber("1.1d"));
        assertTrue(NumberUtils.isNumber("1.1D"));
        assertTrue(NumberUtils.isNumber("1.1e1f"));
        assertTrue(NumberUtils.isNumber("1.1e1F"));
        assertTrue(NumberUtils.isNumber("1.1e1d"));
        assertTrue(NumberUtils.isNumber("1.1e1D"));

        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(" 1"));
        assertFalse(NumberUtils.isNumber("1 "));
        assertFalse(NumberUtils.isNumber("1.1.1"));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1e1e1"));
        assertFalse(NumberUtils.isNumber("1e-"));
        assertFalse(NumberUtils.isNumber("1e+"));
        assertFalse(NumberUtils.isNumber("--1"));
        assertFalse(NumberUtils.isNumber("++1"));
        assertFalse(NumberUtils.isNumber("+-1"));
        assertFalse(NumberUtils.isNumber("-+1"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("0xG"));
        assertFalse(NumberUtils.isNumber("0x1G"));
        assertFalse(NumberUtils.isNumber("0x1f1"));
        assertFalse(NumberUtils.isNumber("ff"));
        assertFalse(NumberUtils.isNumber("1.1e1f1"));
        assertFalse(NumberUtils.isNumber("1.1e1L"));
        assertFalse(NumberUtils.isNumber("1.1e1D1"));
        assertFalse(NumberUtils.isNumber("1.1.1f"));
        assertFalse(NumberUtils.isNumber("1f1"));
        assertFalse(NumberUtils.isNumber("1d1"));
        assertFalse(NumberUtils.isNumber("1l1"));
        assertFalse(NumberUtils.isNumber("1L1"));
        assertFalse(NumberUtils.isNumber("0x1f1f"));
    }
}