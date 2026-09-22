package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;

/**
 * Comprehensive Unit Tests for {@link ExtendedMessageFormat}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class ExtendedMessageFormatTest {

    @Test
    public void format_givenPatternAndArguments_shouldSubstitute() {
        // Arrange
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello, {0}! Today is {1}.", new HashMap());

        // Act
        String result = emf.format(new Object[] { "Alice", "Monday" });

        // Assert
        assertEquals("Hello, Alice! Today is Monday.", result);
    }

    @Test
    public void toPattern_shouldReturnOriginalPattern() {
        // Arrange
        String pattern = "Value={0}";
        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern);

        // Act & Assert
        assertEquals(pattern, emf.toPattern());
    }
}
