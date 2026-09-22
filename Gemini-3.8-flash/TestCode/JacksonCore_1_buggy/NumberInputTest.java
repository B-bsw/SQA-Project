package com.fasterxml.jackson.core.io;

import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;

/**
 * Comprehensive Unit Tests for {@link NumberInput}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class NumberInputTest {

    @Test
    public void parseIntCharArray_givenSingleAndMultipleDigits_shouldParseCorrectly() {
        // Arrange
        char[] chars = "0123456789".toCharArray();

        // Act & Assert
        assertEquals(0, NumberInput.parseInt(chars, 0, 1));
        assertEquals(1, NumberInput.parseInt(chars, 1, 1));
        assertEquals(12, NumberInput.parseInt(chars, 1, 2));
        assertEquals(12345, NumberInput.parseInt(chars, 1, 5));
        assertEquals(123456789, NumberInput.parseInt(chars, 1, 9));
    }

    @Test
    public void parseIntString_givenPositiveAndNegativeStrings_shouldParseCorrectly() {
        // Arrange & Act & Assert
        assertEquals(0, NumberInput.parseInt("0"));
        assertEquals(42, NumberInput.parseInt("42"));
        assertEquals(999999999, NumberInput.parseInt("999999999"));
        assertEquals(-1, NumberInput.parseInt("-1"));
        assertEquals(-42, NumberInput.parseInt("-42"));
        assertEquals(-123456789, NumberInput.parseInt("-123456789"));
        assertEquals(Integer.MAX_VALUE, NumberInput.parseInt(String.valueOf(Integer.MAX_VALUE)));
        assertEquals(Integer.MIN_VALUE, NumberInput.parseInt(String.valueOf(Integer.MIN_VALUE)));
    }

    @Test(expected = NumberFormatException.class)
    public void parseIntString_givenNonNumericString_shouldThrowException() {
        // Arrange & Act
        NumberInput.parseInt("not_a_number");
    }

    @Test
    public void parseLongCharArray_givenValidChars_shouldParseLong() {
        // Arrange
        char[] chars = "123456789012345678".toCharArray();

        // Act
        long val = NumberInput.parseLong(chars, 0, 18);

        // Assert
        assertEquals(123456789012345678L, val);
    }

    @Test
    public void parseLongString_givenShortAndLongStrings_shouldParseLong() {
        // Arrange & Act & Assert
        assertEquals(12345L, NumberInput.parseLong("12345"));
        assertEquals(123456789012345L, NumberInput.parseLong("123456789012345"));
        assertEquals(Long.MAX_VALUE, NumberInput.parseLong(String.valueOf(Long.MAX_VALUE)));
        assertEquals(Long.MIN_VALUE, NumberInput.parseLong(String.valueOf(Long.MIN_VALUE)));
    }

    @Test
    public void inLongRangeCharArray_givenVariousLengths_shouldEvaluateCorrectly() {
        // Arrange
        char[] maxLong = String.valueOf(Long.MAX_VALUE).toCharArray();
        char[] minLongNoSign = String.valueOf(Long.MIN_VALUE).substring(1).toCharArray();

        // Act & Assert
        assertTrue(NumberInput.inLongRange(maxLong, 0, maxLong.length, false));
        assertTrue(NumberInput.inLongRange(minLongNoSign, 0, minLongNoSign.length, true));

        char[] shortDigits = "123".toCharArray();
        assertTrue(NumberInput.inLongRange(shortDigits, 0, shortDigits.length, false));

        char[] tooLong = "12345678901234567890".toCharArray();
        assertFalse(NumberInput.inLongRange(tooLong, 0, tooLong.length, false));
    }

    @Test
    public void inLongRangeString_givenBoundaryStrings_shouldEvaluateCorrectly() {
        // Arrange & Act & Assert
        assertTrue(NumberInput.inLongRange(String.valueOf(Long.MAX_VALUE), false));
        assertTrue(NumberInput.inLongRange(String.valueOf(Long.MIN_VALUE).substring(1), true));
        assertTrue(NumberInput.inLongRange("9223372036854775806", false));
        assertFalse(NumberInput.inLongRange("9223372036854775808", false));
        assertFalse(NumberInput.inLongRange("10000000000000000000", false));
    }

    @Test
    public void parseAsInt_givenValidAndInvalidInputs_shouldHandleDefaults() {
        // Arrange & Act & Assert
        assertEquals(99, NumberInput.parseAsInt(null, 99));
        assertEquals(99, NumberInput.parseAsInt("", 99));
        assertEquals(99, NumberInput.parseAsInt("   ", 99));
        assertEquals(123, NumberInput.parseAsInt("123", 99));
        assertEquals(123, NumberInput.parseAsInt("+123", 99));
        assertEquals(-123, NumberInput.parseAsInt("-123", 99));
        assertEquals(12, NumberInput.parseAsInt("12.89", 99));
        assertEquals(99, NumberInput.parseAsInt("invalid", 99));
    }

    @Test
    public void parseAsLong_givenValidAndInvalidInputs_shouldHandleDefaults() {
        // Arrange & Act & Assert
        assertEquals(55L, NumberInput.parseAsLong(null, 55L));
        assertEquals(55L, NumberInput.parseAsLong("", 55L));
        assertEquals(55L, NumberInput.parseAsLong("   ", 55L));
        assertEquals(123456789012L, NumberInput.parseAsLong("123456789012", 55L));
        assertEquals(100L, NumberInput.parseAsLong("+100", 55L));
        assertEquals(-200L, NumberInput.parseAsLong("-200", 55L));
        assertEquals(123L, NumberInput.parseAsLong("123.456", 55L));
        assertEquals(55L, NumberInput.parseAsLong("not_a_number", 55L));
    }

    @Test
    public void parseAsDouble_givenValidAndInvalidInputs_shouldHandleDefaults() {
        // Arrange & Act & Assert
        assertEquals(1.5, NumberInput.parseAsDouble(null, 1.5), 0.0001);
        assertEquals(1.5, NumberInput.parseAsDouble("", 1.5), 0.0001);
        assertEquals(1.5, NumberInput.parseAsDouble("   ", 1.5), 0.0001);
        assertEquals(3.14159, NumberInput.parseAsDouble("3.14159", 1.5), 0.00001);
        assertEquals(Double.MIN_VALUE, NumberInput.parseAsDouble(NumberInput.NASTY_SMALL_DOUBLE, 1.5), 0.0);
        assertEquals(1.5, NumberInput.parseAsDouble("xyz", 1.5), 0.0001);
    }

    @Test
    public void parseDouble_givenNastyDouble_shouldReturnDoubleMinValue() {
        // Arrange & Act
        double result = NumberInput.parseDouble(NumberInput.NASTY_SMALL_DOUBLE);

        // Assert
        assertEquals(Double.MIN_VALUE, result, 0.0);
    }

    @Test
    public void parseBigDecimal_givenStringAndCharArray_shouldParseCorrectly() {
        // Arrange
        String decimalStr = "12345.67890";
        char[] decimalChars = decimalStr.toCharArray();

        // Act
        BigDecimal bd1 = NumberInput.parseBigDecimal(decimalStr);
        BigDecimal bd2 = NumberInput.parseBigDecimal(decimalChars);
        BigDecimal bd3 = NumberInput.parseBigDecimal(decimalChars, 0, 5);

        // Assert
        assertEquals(new BigDecimal(decimalStr), bd1);
        assertEquals(new BigDecimal(decimalStr), bd2);
        assertEquals(new BigDecimal("12345"), bd3);
    }
}
