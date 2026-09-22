package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link StrBuilder}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class StrBuilderTest {

    @Test
    public void appendAndToString_shouldAccumulateContent() {
        // Arrange
        StrBuilder sb = new StrBuilder();

        // Act
        sb.append("Hello")
          .append(' ')
          .append("World")
          .append(123);

        // Assert
        assertEquals("Hello World123", sb.toString());
        assertEquals(14, sb.length());
        assertFalse(sb.isEmpty());
    }

    @Test
    public void clearAndSetLength_shouldResetBuffer() {
        // Arrange
        StrBuilder sb = new StrBuilder("Initial Content");

        // Act
        sb.clear();

        // Assert
        assertEquals(0, sb.length());
        assertTrue(sb.isEmpty());
        assertEquals("", sb.toString());
    }

    @Test
    public void substringAndDelete_shouldModifyBuffer() {
        // Arrange
        StrBuilder sb = new StrBuilder("abcdefgh");

        // Act
        String sub = sb.substring(2, 5);
        sb.delete(2, 5);

        // Assert
        assertEquals("cde", sub);
        assertEquals("abfgh", sb.toString());
    }
}
