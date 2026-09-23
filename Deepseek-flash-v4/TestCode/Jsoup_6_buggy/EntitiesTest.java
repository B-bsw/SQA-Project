package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class EntitiesTest {

    @Before
    public void setUp() {
        // No setup required for static utility class
    }

    @After
    public void tearDown() {
        // No teardown required
    }

    @Test
    public void testEscapeExtendedMode() {
        Document.OutputSettings out = new Document.OutputSettings().escapeMode(Entities.EscapeMode.extended);
        assertEquals("&amp;", Entities.escape("&", out));
        assertEquals("&lt;", Entities.escape("<", out));
        assertEquals("&gt;", Entities.escape(">", out));
        assertEquals("&quot;", Entities.escape("\"", out));
    }

    @Test
    public void testEscapeBaseMode() {
        Document.OutputSettings out = new Document.OutputSettings().escapeMode(Entities.EscapeMode.base);
        assertEquals("&amp;", Entities.escape("&", out));
        assertEquals("&lt;", Entities.escape("<", out));
        assertEquals("&gt;", Entities.escape(">", out));
        assertEquals("&quot;", Entities.escape("\"", out));
    }

    @Test
    public void testEscapeNonAsciiWithEncoder() {
        CharsetEncoder encoder = java.nio.charset.StandardCharsets.UTF_8.newEncoder();
        assertEquals("&#233;", Entities.escape("é", encoder, Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeEmptyString() {
        Document.OutputSettings out = new Document.OutputSettings().escapeMode(Entities.EscapeMode.base);
        assertEquals("", Entities.escape("", out));
    }

    @Test
    public void testEscapeNoSpecialChars() {
        Document.OutputSettings out = new Document.OutputSettings().escapeMode(Entities.EscapeMode.base);
        assertEquals("simple", Entities.escape("simple", out));
    }

    @Test
    public void testEscapeNullInput() {
        Document.OutputSettings out = new Document.OutputSettings().escapeMode(Entities.EscapeMode.base);
        try {
            Entities.escape(null, out);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testUnescapeBasic() {
        assertEquals("&", Entities.unescape("&amp;"));
        assertEquals("<", Entities.unescape("&lt;"));
        assertEquals(">", Entities.unescape("&gt;"));
        assertEquals("\"", Entities.unescape("&quot;"));
    }

    @Test
    public void testUnescapeNoAmpersand() {
        assertEquals("plain text", Entities.unescape("plain text"));
    }

    @Test
    public void testUnescapeNumericDecimal() {
        assertEquals("\u00e9", Entities.unescape("&#233;"));
    }

    @Test
    public void testUnescapeNumericHex() {
        assertEquals("\u00e9", Entities.unescape("&#xE9;"));
        assertEquals("\u00e9", Entities.unescape("&#XE9;"));
    }

    @Test
    public void testUnescapeInvalidNumeric() {
        assertEquals("&#invalid;", Entities.unescape("&#invalid;"));
    }

    @Test
    public void testUnescapeEmptyString() {
        assertEquals("", Entities.unescape(""));
    }

    @Test
    public void testUnescapeNullInput() {
        try {
            Entities.unescape(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testUnescapeNumericOutOfRange() {
        assertEquals("\ufffd", Entities.unescape("&#1111111;"));
    }

    @Test
    public void testUnescapeMultipleEntities() {
        assertEquals("& < >", Entities.unescape("&amp; &lt; &gt;"));
    }

    @Test
    public void testCanEncodePath() {
        java.nio.charset.CharsetEncoder ascii = java.nio.charset.StandardCharsets.US_ASCII.newEncoder();
        assertEquals("abc", Entities.escape("abc", ascii, Entities.EscapeMode.base));
    }
}