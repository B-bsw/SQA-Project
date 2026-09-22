package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link WordUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class WordUtilsTest {

    @Test
    public void capitalizeAndUncapitalize_shouldChangeFirstLetter() {
        // Arrange & Act & Assert
        assertEquals("Hello World", WordUtils.capitalize("hello world"));
        assertEquals("hello world", WordUtils.uncapitalize("Hello World"));
        assertNull(WordUtils.capitalize(null));
    }

    @Test
    public void wrap_shouldWrapLongTextAtWidth() {
        // Arrange
        String text = "Here is a long piece of text that should be wrapped nicely";

        // Act
        String wrapped = WordUtils.wrap(text, 20);

        // Assert
        assertNotNull(wrapped);
        assertTrue(wrapped.contains("
"));
    }

    @Test
    public void initials_shouldExtractFirstLetters() {
        // Arrange & Act & Assert
        assertEquals("JD", WordUtils.initials("John Doe"));
        assertEquals("BBS", WordUtils.initials("Big Bright Sun"));
        assertNull(WordUtils.initials(null));
    }
}
