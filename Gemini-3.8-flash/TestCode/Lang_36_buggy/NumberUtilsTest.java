package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Comprehensive Unit Tests for {@link NumberUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class NumberUtilsTest {

    @Test
    public void toIntAndToLong_givenValidAndInvalidInputs_shouldParseOrReturnDefault() {
        // Arrange & Act & Assert
        assertEquals(123, NumberUtils.toInt("123"));
        assertEquals(0, NumberUtils.toInt("bad"));
        assertEquals(99, NumberUtils.toInt("bad", 99));

        assertEquals(123456789L, NumberUtils.toLong("123456789"));
        assertEquals(0L, NumberUtils.toLong("bad"));
        assertEquals(55L, NumberUtils.toLong("bad", 55L));
    }

    @Test
    public void toFloatAndToDouble_givenValidAndInvalidInputs_shouldParse() {
        // Arrange & Act & Assert
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.001f);
        assertEquals(0.0f, NumberUtils.toFloat("xyz"), 0.001f);

        assertEquals(2.75d, NumberUtils.toDouble("2.75"), 0.001d);
        assertEquals(10.0d, NumberUtils.toDouble("invalid", 10.0d), 0.001d);
    }

    @Test
    public void minAndMax_givenArrayOfNumbers_shouldFindExtremes() {
        // Arrange & Act & Assert
        assertEquals(1, NumberUtils.min(new int[] { 5, 3, 1, 9, 7 }));
        assertEquals(9, NumberUtils.max(new int[] { 5, 3, 1, 9, 7 }));

        assertEquals(1.2, NumberUtils.min(new double[] { 3.4, 1.2, 5.6 }), 0.001);
        assertEquals(5.6, NumberUtils.max(new double[] { 3.4, 1.2, 5.6 }), 0.001);
    }

    @Test
    public void isNumber_givenVariousStringRepresentations_shouldValidate() {
        // Arrange & Act & Assert
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123.45"));
        assertTrue(NumberUtils.isNumber("1.2e3"));
        assertTrue(NumberUtils.isNumber("0x1A"));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber("123a"));
    }

    @Test
    public void createNumber_givenFormattedStrings_shouldCreateAppropriateType() {
        // Arrange & Act & Assert
        assertEquals(Integer.valueOf(100), NumberUtils.createNumber("100"));
        assertEquals(Long.valueOf(1234567890123L), NumberUtils.createNumber("1234567890123L"));
        assertEquals(Float.valueOf(1.5f), NumberUtils.createNumber("1.5f"));
        assertEquals(Double.valueOf(2.5d), NumberUtils.createNumber("2.5d"));
        assertEquals(new BigInteger("99999999999999999999"), NumberUtils.createNumber("99999999999999999999"));
        assertEquals(new BigDecimal("123.456789"), NumberUtils.createNumber("123.456789"));
    }
}
