package org.apache.commons.lang.math;

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
    public void stringToInt_andToLong_shouldParse() {
        // Arrange & Act & Assert
        assertEquals(123, NumberUtils.stringToInt("123"));
        assertEquals(42, NumberUtils.stringToInt("bad", 42));
        assertEquals(12345L, NumberUtils.toLong("12345"));
        assertEquals(99L, NumberUtils.toLong("bad", 99L));
    }

    @Test
    public void isNumber_shouldValidate() {
        // Arrange & Act & Assert
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-45.67"));
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber("abc"));
    }

    @Test
    public void createNumber_shouldInstantiateCorrectType() {
        // Arrange & Act & Assert
        assertEquals(Integer.valueOf(10), NumberUtils.createNumber("10"));
        assertEquals(Long.valueOf(10000000000L), NumberUtils.createNumber("10000000000L"));
        assertEquals(Float.valueOf(1.5f), NumberUtils.createNumber("1.5f"));
    }
}
