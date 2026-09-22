package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link StringEscapeUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class StringEscapeUtilsTest {

    @Test
    public void escapeAndUnescapeJava_shouldHandleEscapes() {
        // Arrange
        String raw = "Tab:	, Newline:
, Quote:"";

        // Act
        String escaped = StringEscapeUtils.escapeJava(raw);
        String unescaped = StringEscapeUtils.unescapeJava(escaped);

        // Assert
        assertTrue(escaped.contains("\t"));
        assertTrue(escaped.contains("\n"));
        assertTrue(escaped.contains("\""));
        assertEquals(raw, unescaped);
    }

    @Test
    public void escapeAndUnescapeHtml_shouldHandleMarkup() {
        // Arrange
        String html = "<div class="box">A & B</div>";

        // Act
        String escaped = StringEscapeUtils.escapeHtml(html);
        String unescaped = StringEscapeUtils.unescapeHtml(escaped);

        // Assert
        assertTrue(escaped.contains("&lt;"));
        assertTrue(escaped.contains("&amp;"));
        assertTrue(escaped.contains("&gt;"));
        assertEquals(html, unescaped);
    }

    @Test
    public void escapeAndUnescapeXml_shouldHandleXmlEntities() {
        // Arrange
        String xml = "<tag attr='value'>&</tag>";

        // Act
        String escaped = StringEscapeUtils.escapeXml(xml);
        String unescaped = StringEscapeUtils.unescapeXml(escaped);

        // Assert
        assertTrue(escaped.contains("&lt;"));
        assertTrue(escaped.contains("&gt;"));
        assertTrue(escaped.contains("&amp;"));
        assertEquals(xml, unescaped);
    }
}
