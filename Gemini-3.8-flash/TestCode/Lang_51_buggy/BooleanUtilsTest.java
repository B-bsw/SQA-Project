package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link BooleanUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class BooleanUtilsTest {

    @Test
    public void toBoolean_givenStrings_shouldParseBooleans() {
        // Arrange & Act & Assert
        assertTrue(BooleanUtils.toBoolean("true"));
        assertTrue(BooleanUtils.toBoolean("TRUE"));
        assertTrue(BooleanUtils.toBoolean("yes"));
        assertTrue(BooleanUtils.toBoolean("on"));

        assertFalse(BooleanUtils.toBoolean("false"));
        assertFalse(BooleanUtils.toBoolean("no"));
        assertFalse(BooleanUtils.toBoolean("off"));
        assertFalse(BooleanUtils.toBoolean((String) null));
    }

    @Test
    public void toBoolean_givenInts_shouldConvert() {
        // Arrange & Act & Assert
        assertTrue(BooleanUtils.toBoolean(1));
        assertFalse(BooleanUtils.toBoolean(0));
    }

    @Test
    public void toStringTrueFalse_shouldFormat() {
        // Arrange & Act & Assert
        assertEquals("true", BooleanUtils.toStringTrueFalse(true));
        assertEquals("false", BooleanUtils.toStringTrueFalse(false));
        assertEquals("yes", BooleanUtils.toStringYesNo(true));
        assertEquals("no", BooleanUtils.toStringYesNo(false));
    }
}
