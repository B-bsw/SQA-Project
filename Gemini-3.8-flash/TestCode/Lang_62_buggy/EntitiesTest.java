package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link Entities}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class EntitiesTest {

    @Test
    public void xmlEntities_escapeAndUnescape_shouldConvertSpecialChars() {
        // Arrange
        Entities xml = Entities.XML;

        // Act
        String escaped = xml.escape("<hello & 'world'>");
        String unescaped = xml.unescape(escaped);

        // Assert
        assertEquals("&lt;hello &amp; &apos;world&apos;&gt;", escaped);
        assertEquals("<hello & 'world'>", unescaped);
    }

    @Test
    public void html40Entities_escapeAndUnescape_shouldConvertEntities() {
        // Arrange
        Entities html = Entities.HTML40;

        // Act
        String escaped = html.escape("10 < 20 & 30 > 10");
        String unescaped = html.unescape(escaped);

        // Assert
        assertTrue(escaped.contains("&lt;"));
        assertTrue(escaped.contains("&amp;"));
        assertTrue(escaped.contains("&gt;"));
        assertEquals("10 < 20 & 30 > 10", unescaped);
    }
}
