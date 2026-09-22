package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link NumberUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class NumberUtilsTest {

    @Test
    public void stringToInt_shouldConvertOrReturnDefault() {
        // Arrange & Act & Assert
        assertEquals(123, NumberUtils.stringToInt("123"));
        assertEquals(0, NumberUtils.stringToInt("invalid"));
        assertEquals(42, NumberUtils.stringToInt("invalid", 42));
    }

    @Test
    public void isNumber_shouldValidateNumericStrings() {
        // Arrange & Act & Assert
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-45.67"));
        assertTrue(NumberUtils.isNumber("1.2e3"));
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber("abc"));
    }

    @Test
    public void createNumber_shouldCreateAppropriateNumberInstance() {
        // Arrange & Act & Assert
        assertEquals(Integer.valueOf(10), NumberUtils.createNumber("10"));
        assertEquals(Long.valueOf(10000000000L), NumberUtils.createNumber("10000000000L"));
        assertEquals(Float.valueOf(1.5f), NumberUtils.createNumber("1.5f"));
    }
}
