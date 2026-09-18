package com.fasterxml.jackson.core.io;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;

public class NumberInputTest {

    // ---------- parseInt(char[], offset, len) ----------

    @Test
    public void testParseIntCharArrayLen1() {
        char[] arr = "5".toCharArray();
        assertEquals(5, NumberInput.parseInt(arr, 0, 1));
    }

    @Test
    public void testParseIntCharArrayLen2() {
        char[] arr = "12".toCharArray();
        assertEquals(12, NumberInput.parseInt(arr, 0, 2));
    }

    @Test
    public void testParseIntCharArrayLen3() {
        char[] arr = "123".toCharArray();
        assertEquals(123, NumberInput.parseInt(arr, 0, 3));
    }

    @Test
    public void testParseIntCharArrayLen4() {
        char[] arr = "1234".toCharArray();
        assertEquals(1234, NumberInput.parseInt(arr, 0, 4));
    }

    @Test
    public void testParseIntCharArrayLen5() {
        char[] arr = "12345".toCharArray();
        assertEquals(12345, NumberInput.parseInt(arr, 0, 5));
    }

    @Test
    public void testParseIntCharArrayLen6() {
        char[] arr = "123456".toCharArray();
        assertEquals(123456, NumberInput.parseInt(arr, 0, 6));
    }

    @Test
    public void testParseIntCharArrayLen7() {
        char[] arr = "1234567".toCharArray();
        assertEquals(1234567, NumberInput.parseInt(arr, 0, 7));
    }

    @Test
    public void testParseIntCharArrayLen8() {
        char[] arr = "12345678".toCharArray();
        assertEquals(12345678, NumberInput.parseInt(arr, 0, 8));
    }

    @Test
    public void testParseIntCharArrayLen9() {
        char[] arr = "123456789".toCharArray();
        assertEquals(123456789, NumberInput.parseInt(arr, 0, 9));
    }

    @Test
    public void testParseIntCharArrayWithOffset() {
        char[] arr = "xx98765".toCharArray();
        assertEquals(98765, NumberInput.parseInt(arr, 2, 5));
    }

    // ---------- parseInt(String) ----------

    @Test
    public void testParseIntStringSingleDigit() {
        assertEquals(0, NumberInput.parseInt("0"));
        assertEquals(5, NumberInput.parseInt("5"));
    }

    @Test
    public void testParseIntStringTwoDigits() {
        assertEquals(12, NumberInput.parseInt("12"));
    }

    @Test
    public void testParseIntStringThreeDigits() {
        assertEquals(123, NumberInput.parseInt("123"));
    }

    @Test
    public void testParseIntStringFourDigits() {
        assertEquals(1234, NumberInput.parseInt("1234"));
    }

    @Test
    public void testParseIntStringNineDigitsLoop() {
        assertEquals(123456789, NumberInput.parseInt("123456789"));
    }

    @Test
    public void testParseIntStringNegativeSimple() {
        assertEquals(-5, NumberInput.parseInt("-5"));
    }

    @Test
    public void testParseIntStringNegativeMultiDigit() {
        assertEquals(-123456789, NumberInput.parseInt("-123456789"));
    }

    @Test
    public void testParseIntStringNegativeLengthOneThrows() {
        try {
            NumberInput.parseInt("-");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testParseIntStringNegativeFallbackLongerThanTen() {
        // length 11 (>10), still valid int
        assertEquals(-2000000000, NumberInput.parseInt("-2000000000"));
    }

    @Test
    public void testParseIntStringPositiveFallbackLongerThanNine() {
        // length 10 (>9), fallback to Integer.parseInt
        assertEquals(1000000000, NumberInput.parseInt("1000000000"));
    }

    @Test
    public void testParseIntStringInvalidFirstCharThrows() {
        try {
            NumberInput.parseInt("a");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testParseIntStringInvalidSecondCharThrows() {
        try {
            NumberInput.parseInt("1a23");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testParseIntStringInvalidThirdCharThrows() {
        try {
            NumberInput.parseInt("12a45");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testParseIntStringInvalidInLoopThrows() {
        try {
            NumberInput.parseInt("1234a678");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    // ---------- parseLong(char[], offset, len) ----------

    @Test
    public void testParseLongCharArray() {
        char[] arr = "123456789012345".toCharArray(); // len 15
        assertEquals(123456789012345L, NumberInput.parseLong(arr, 0, 15));
    }

    @Test
    public void testParseLongCharArrayMax18() {
        char[] arr = "123456789012345678".toCharArray(); // len 18
        assertEquals(123456789012345678L, NumberInput.parseLong(arr, 0, 18));
    }

    // ---------- parseLong(String) ----------

    @Test
    public void testParseLongStringShort() {
        // length <=9, delegates to parseInt
        assertEquals(123456789L, NumberInput.parseLong("123456789"));
    }

    @Test
    public void testParseLongStringLong() {
        // length >9, delegates to Long.parseLong
        assertEquals(1234567890123L, NumberInput.parseLong("1234567890123"));
    }

    @Test
    public void testParseLongStringNegativeLong() {
        assertEquals(-1234567890123L, NumberInput.parseLong("-1234567890123"));
    }

    // ---------- inLongRange(char[], offset, len, boolean) ----------

    @Test
    public void testInLongRangeCharArrayShorter() {
        char[] arr = "12345".toCharArray();
        assertTrue(NumberInput.inLongRange(arr, 0, 5, false));
    }

    @Test
    public void testInLongRangeCharArrayLonger() {
        char[] arr = "123456789012345678901".toCharArray(); // 21 digits
        assertFalse(NumberInput.inLongRange(arr, 0, 21, false));
    }

    @Test
    public void testInLongRangeCharArrayEqualLenSameValue() {
        // MAX_LONG_STR = "9223372036854775807"
        char[] arr = "9223372036854775807".toCharArray();
        assertTrue(NumberInput.inLongRange(arr, 0, 20, false));
    }

    @Test
    public void testInLongRangeCharArrayEqualLenSmaller() {
        char[] arr = "9223372036854775800".toCharArray();
        assertTrue(NumberInput.inLongRange(arr, 0, 20, false));
    }

    @Test
    public void testInLongRangeCharArrayEqualLenLarger() {
        char[] arr = "9223372036854775999".toCharArray();
        assertFalse(NumberInput.inLongRange(arr, 0, 19, false));
    }

    @Test
    public void testInLongRangeCharArrayNegativeEqualLenSameValue() {
        // MIN_LONG_STR_NO_SIGN = "9223372036854775808"
        char[] arr = "9223372036854775808".toCharArray();
        assertTrue(NumberInput.inLongRange(arr, 0, 20, true));
    }

    // ---------- inLongRange(String, boolean) ----------

    @Test
    public void testInLongRangeStringShorter() {
        assertTrue(NumberInput.inLongRange("12345", false));
    }

    @Test
    public void testInLongRangeStringLonger() {
        assertFalse(NumberInput.inLongRange("123456789012345678901", false));
    }

    @Test
    public void testInLongRangeStringEqualLenSameValue() {
        assertTrue(NumberInput.inLongRange("9223372036854775807", false));
    }

    @Test
    public void testInLongRangeStringEqualLenSmaller() {
        assertTrue(NumberInput.inLongRange("9223372036854775800", false));
    }

    @Test
    public void testInLongRangeStringEqualLenLarger() {
        assertFalse(NumberInput.inLongRange("9223372036854775999", false));
    }

    @Test
    public void testInLongRangeStringNegativeEqualLenSameValue() {
        assertTrue(NumberInput.inLongRange("9223372036854775808", true));
    }

    // ---------- parseAsInt(String, defaultValue) ----------

    @Test
    public void testParseAsIntNull() {
        assertEquals(42, NumberInput.parseAsInt(null, 42));
    }

    @Test
    public void testParseAsIntEmpty() {
        assertEquals(42, NumberInput.parseAsInt("", 42));
    }

    @Test
    public void testParseAsIntWhitespaceOnly() {
        assertEquals(42, NumberInput.parseAsInt("   ", 42));
    }

    @Test
    public void testParseAsIntPlusSign() {
        assertEquals(123, NumberInput.parseAsInt("+123", 0));
    }

    @Test
    public void testParseAsIntMinusSign() {
        assertEquals(-123, NumberInput.parseAsInt("-123", 0));
    }

    @Test
    public void testParseAsIntDecimalCoerced() {
        assertEquals(123, NumberInput.parseAsInt("123.45", 0));
    }

    @Test
    public void testParseAsIntInvalidReturnsDefault() {
        assertEquals(99, NumberInput.parseAsInt("abc", 99));
    }

    @Test
    public void testParseAsIntOverflowReturnsDefault() {
        assertEquals(77, NumberInput.parseAsInt("999999999999999999999", 77));
    }

    @Test
    public void testParseAsIntNormal() {
        assertEquals(12345, NumberInput.parseAsInt("12345", 0));
    }

    // ---------- parseAsLong(String, defaultValue) ----------

    @Test
    public void testParseAsLongNull() {
        assertEquals(42L, NumberInput.parseAsLong(null, 42L));
    }

    @Test
    public void testParseAsLongEmpty() {
        assertEquals(42L, NumberInput.parseAsLong("", 42L));
    }

    @Test
    public void testParseAsLongWhitespaceOnly() {
        assertEquals(42L, NumberInput.parseAsLong("   ", 42L));
    }

    @Test
    public void testParseAsLongPlusSign() {
        assertEquals(123456789012L, NumberInput.parseAsLong("+123456789012", 0L));
    }

    @Test
    public void testParseAsLongMinusSign() {
        assertEquals(-123456789012L, NumberInput.parseAsLong("-123456789012", 0L));
    }

    @Test
    public void testParseAsLongDecimalCoerced() {
        assertEquals(123L, NumberInput.parseAsLong("123.45", 0L));
    }

    @Test
    public void testParseAsLongInvalidReturnsDefault() {
        assertEquals(99L, NumberInput.parseAsLong("abc", 99L));
    }

    @Test
    public void testParseAsLongOverflowReturnsDefault() {
        assertEquals(77L, NumberInput.parseAsLong("99999999999999999999999999", 77L));
    }

    @Test
    public void testParseAsLongNormal() {
        assertEquals(1234567890123L, NumberInput.parseAsLong("1234567890123", 0L));
    }

    // ---------- parseAsDouble(String, defaultValue) ----------

    @Test
    public void testParseAsDoubleNull() {
        assertEquals(1.5, NumberInput.parseAsDouble(null, 1.5), 0.0001);
    }

    @Test
    public void testParseAsDoubleEmpty() {
        assertEquals(1.5, NumberInput.parseAsDouble("", 1.5), 0.0001);
    }

    @Test
    public void testParseAsDoubleWhitespaceOnly() {
        assertEquals(1.5, NumberInput.parseAsDouble("   ", 1.5), 0.0001);
    }

    @Test
    public void testParseAsDoubleNormal() {
        assertEquals(3.14, NumberInput.parseAsDouble("3.14", 0.0), 0.0001);
    }

    @Test
    public void testParseAsDoubleInvalidReturnsDefault() {
        assertEquals(9.9, NumberInput.parseAsDouble("abc", 9.9), 0.0001);
    }

    // ---------- parseDouble(String) ----------

    @Test
    public void testParseDoubleNormal() {
        assertEquals(3.14, NumberInput.parseDouble("3.14"), 0.0001);
    }

    @Test
    public void testParseDoubleNastySmall() {
        assertEquals(Double.MIN_VALUE, NumberInput.parseDouble(NumberInput.NASTY_SMALL_DOUBLE), 0.0);
    }

    @Test
    public void testParseDoubleInvalidThrows() {
        try {
            NumberInput.parseDouble("not-a-number");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    // ---------- parseBigDecimal(String) ----------

    @Test
    public void testParseBigDecimalStringNormal() {
        BigDecimal bd = NumberInput.parseBigDecimal("123.456");
        assertEquals(new BigDecimal("123.456"), bd);
    }

    @Test
    public void testParseBigDecimalStringInvalidThrows() {
        try {
            NumberInput.parseBigDecimal("not-a-decimal");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    // ---------- parseBigDecimal(char[]) ----------

    @Test
    public void testParseBigDecimalCharArray() {
        char[] arr = "789.012".toCharArray();
        BigDecimal bd = NumberInput.parseBigDecimal(arr);
        assertEquals(new BigDecimal("789.012"), bd);
    }

    @Test
    public void testParseBigDecimalCharArrayInvalidThrows() {
        char[] arr = "xyz".toCharArray();
        try {
            NumberInput.parseBigDecimal(arr);
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    // ---------- parseBigDecimal(char[], offset, len) ----------

    @Test
    public void testParseBigDecimalCharArrayOffsetLen() {
        char[] arr = "xx123.45yy".toCharArray();
        BigDecimal bd = NumberInput.parseBigDecimal(arr, 2, 6);
        assertEquals(new BigDecimal("123.45"), bd);
    }

    @Test
    public void testParseBigDecimalCharArrayOffsetLenInvalidThrows() {
        char[] arr = "xxabcYY".toCharArray();
        try {
            NumberInput.parseBigDecimal(arr, 2, 3);
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }
}