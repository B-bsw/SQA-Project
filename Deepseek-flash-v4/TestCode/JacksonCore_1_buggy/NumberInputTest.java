package com.fasterxml.jackson.core.io;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;

public class NumberInputTest {

    @Test
    public void testParseIntCharKnownLength() {
        char[] digits = "123456789".toCharArray();
        assertEquals(123456789, NumberInput.parseInt(digits, 0, 9));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testParseIntCharEmpty() {
        char[] digits = new char[0];
        NumberInput.parseInt(digits, 0, 0);
    }

    @Test
    public void testParseIntStringPositive() {
        assertEquals(42, NumberInput.parseInt("42"));
    }

    @Test
    public void testParseIntStringNegative() {
        assertEquals(-123, NumberInput.parseInt("-123"));
    }

    @Test
    public void testParseIntStringLeadingPlus() {
        assertEquals(7, NumberInput.parseInt("+7"));
    }

    @Test
    public void testParseIntStringTooLongPositive() {
        assertEquals(1234567890, NumberInput.parseInt("1234567890"));
    }

    @Test
    public void testParseIntStringNegativeTooLong() {
        assertEquals(-12345678901L, NumberInput.parseInt("-12345678901"));
    }

    @Test
    public void testParseIntStringNonNumericChar() {
        assertEquals(0, NumberInput.parseInt("12a3"));
    }

    @Test
    public void testParseIntStringSingleDigit() {
        assertEquals(5, NumberInput.parseInt("5"));
    }

    @Test
    public void testParseIntStringMultipleDigits() {
        assertEquals(12345, NumberInput.parseInt("12345"));
    }

    @Test
    public void testParseLongCharArray() {
        char[] digits = "123456789012345678".toCharArray();
        assertEquals(123456789012345678L, NumberInput.parseLong(digits, 0, 18));
    }

    @Test
    public void testParseLongStringShort() {
        assertEquals(123L, NumberInput.parseLong("123"));
    }

    @Test
    public void testParseLongStringLong() {
        assertEquals(1234567890123456789L, NumberInput.parseLong("1234567890123456789"));
    }

    @Test
    public void testInLongRangeShorter() {
        assertTrue(NumberInput.inLongRange(new char[]{'1','2','3'}, 0, 3, true));
    }

    @Test
    public void testInLongRangeLonger() {
        assertFalse(NumberInput.inLongRange(new char[]{'1','2','3','4','5','6','7','8','9','0','1','2','3','4','5','6','7','8','9'}, 0, 19, false));
    }

    @Test
    public void testInLongRangeEqualMax() {
        assertTrue(NumberInput.inLongRange(new char[]{'9','2','2','3','3','7','2','0','3','6','8','5','4','7','7','5','8','0','7'}, 0, 19, false));
    }

    @Test
    public void testInLongRangeGreaterThanMax() {
        assertFalse(NumberInput.inLongRange(new char[]{'9','2','2','3','3','7','2','0','3','6','8','5','4','7','7','5','8','0','8'}, 0, 19, false));
    }

    @Test
    public void testParseAsLongNull() {
        assertEquals(5L, NumberInput.parseAsLong(null, 5L));
    }

    @Test
    public void testParseAsLongEmpty() {
        assertEquals(10L, NumberInput.parseAsLong("  ", 10L));
    }

    @Test
    public void testParseAsLongLeadingPlus() {
        assertEquals(123L, NumberInput.parseAsLong("+123", 0L));
    }

    @Test
    public void testParseAsLongLeadingMinus() {
        assertEquals(-123L, NumberInput.parseAsLong("-123", 0L));
    }

    @Test
    public void testParseAsLongNonNumeric() {
        assertEquals(3L, NumberInput.parseAsLong("abc", 3L));
    }

    @Test
    public void testParseAsLongNumericWithinRange() {
        assertEquals(42L, NumberInput.parseAsLong("42", 1L));
    }

    @Test
    public void testParseAsLongNumericOutOfRange() {
        assertEquals(1L, NumberInput.parseAsLong("9223372036854775808", 1L));
    }

    @Test
    public void testParseAsLongNegativeOutOfRange() {
        assertEquals(2L, NumberInput.parseAsLong("-9223372036854775809", 2L));
    }

    @Test
    public void testParseAsLongMixedNumericNonNumeric() {
        assertEquals(2L, NumberInput.parseAsLong("12.5", 2L));
    }

    @Test
    public void testParseAsDoubleNull() {
        assertEquals(1.0, NumberInput.parseAsDouble(null, 1.0), 0.0);
    }

    @Test
    public void testParseAsDoubleEmpty() {
        assertEquals(2.0, NumberInput.parseAsDouble("  ", 2.0), 0.0);
    }

    @Test
    public void testParseAsDoubleValidNumber() {
        assertEquals(3.5, NumberInput.parseAsDouble("3.5", 0.0), 0.0);
    }

    @Test
    public void testParseAsDoubleInvalidNumber() {
        assertEquals(4.0, NumberInput.parseAsDouble("abc", 4.0), 0.0);
    }

    @Test
    public void testParseDoubleNastySmall() {
        assertEquals(Double.MIN_VALUE, NumberInput.parseDouble(NumberInput.NASTY_SMALL_DOUBLE), 0.0);
    }

    @Test
    public void testParseDoubleNormal() {
        assertEquals(1.5, NumberInput.parseDouble("1.5"), 0.0);
    }

    @Test(expected = NumberFormatException.class)
    public void testParseDoubleInvalid() {
        NumberInput.parseDouble("not a number");
    }

    @Test
    public void testParseBigDecimalString() {
        BigDecimal bd = NumberInput.parseBigDecimal("12345.678");
        assertEquals(new BigDecimal("12345.678").compareTo(bd), 0);
    }

    @Test
    public void testParseBigDecimalCharArray() {
        char[] buffer = "12345.678".toCharArray();
        BigDecimal bd = NumberInput.parseBigDecimal(buffer);
        assertEquals(new BigDecimal("12345.678").compareTo(bd), 0);
    }

    @Test
    public void testParseBigDecimalCharArrayOffsetLength() {
        char[] buffer = "12345.678".toCharArray();
        BigDecimal bd = NumberInput.parseBigDecimal(buffer, 1, 5);
        assertEquals(new BigDecimal("2345.6").compareTo(bd), 0);
    }

    @Test(expected = NumberFormatException.class)
    public void testParseBigDecimalInvalidString() {
        NumberInput.parseBigDecimal("abc");
    }

    @Test
    public void testParseIntStringNull() {
        try {
            NumberInput.parseInt((String) null);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testParseDoubleNegative() {
        assertEquals(-1.25, NumberInput.parseDouble("-1.25"), 0.0);
    }

    @Test
    public void testParseDoubleZero() {
        assertEquals(0.0, NumberInput.parseDouble("0.0"), 0.0);
    }

    @Test
    public void testParseDoubleVerySmall() {
        assertEquals(1.0E-10, NumberInput.parseDouble("1.0E-10"), 0.0);
    }

    @Test
    public void testParseAsLongWhitespaceTrim() {
        assertEquals(100L, NumberInput.parseAsLong("  100  ", 0L));
    }

    @Test
    public void testInLongRangeNegativeEqualMin() {
        assertTrue(NumberInput.inLongRange("9223372036854775808", 0, 19, true));
    }

    @Test
    public void testInLongRangeNegativeExceed() {
        assertFalse(NumberInput.inLongRange("9223372036854775809", 0, 19, true));
    }

    @Test
    public void testParseIntCharWithSingleDigit() {
        char[] digits = "7".toCharArray();
        assertEquals(7, NumberInput.parseInt(digits, 0, 1));
    }

    @Test
    public void testParseIntCharNegativeWithOffset() {
        char[] digits = "-123".toCharArray();
        assertEquals(123, NumberInput.parseInt(digits, 1, 3));
    }

    @Test
    public void testParseIntStringLeadingZeros() {
        assertEquals(45, NumberInput.parseInt("00045"));
    }

    @Test
    public void testParseIntStringManyDigits() {
        assertEquals(123456789, NumberInput.parseInt("123456789"));
    }

    @Test
    public void testParseLongStringNegativeShort() {
        assertEquals(-42L, NumberInput.parseLong("-42"));
    }

    @Test
    public void testParseLongStringMaxLong() {
        assertEquals(Long.MAX_VALUE, NumberInput.parseLong("9223372036854775807"));
    }

    @Test
    public void testParseLongStringMinLong() {
        assertEquals(Long.MIN_VALUE, NumberInput.parseLong("-9223372036854775808"));
    }

    @Test
    public void testParseAsLongNumericLargerThanLongBecomesDouble() {
        assertEquals(100L, NumberInput.parseAsLong("1e2", 100L));
    }

    @Test
    public void testParseAsLongJustNumber() {
        assertEquals(123L, NumberInput.parseAsLong("123", 456L));
    }

    @Test
    public void testParseAsLongLeadingZeros() {
        assertEquals(7L, NumberInput.parseAsLong("0007", 0L));
    }

    @Test
    public void testParseAsDoubleTrimLeadingTrailing() {
        assertEquals(1.1, NumberInput.parseAsDouble("  1.1  ", 0.0), 0.0);
    }

    @Test
    public void testParseDoubleNegativeExponent() {
        assertEquals(-1.5E-10, NumberInput.parseDouble("-1.5E-10"), 0.0);
    }

    @Test
    public void testParseDoublePositiveExponent() {
        assertEquals(1.5E10, NumberInput.parseDouble("1.5E10"), 0.0);
    }

    @Test
    public void testParseBigDecimalStringLarge() {
        BigDecimal bd = NumberInput.parseBigDecimal("123456789012345678901234567890");
        assertEquals(new BigDecimal("123456789012345678901234567890").compareTo(bd), 0);
    }

    @Test
    public void testParseBigDecimalCharArrayLength() {
        char[] buffer = "9876.54".toCharArray();
        BigDecimal bd = NumberInput.parseBigDecimal(buffer, 0, 7);
        assertEquals(new BigDecimal("9876.54").compareTo(bd), 0);
    }

    @Test
    public void testParseBigDecimalNegative() {
        BigDecimal bd = NumberInput.parseBigDecimal("-123.45");
        assertEquals(new BigDecimal("-123.45").compareTo(bd), 0);
    }
}