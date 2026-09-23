package org.jsoup.nodes;

import org.junit.Test;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EntitiesTest {
    private static final CharsetEncoder ASCII = Charset.forName("US-ASCII").newEncoder();
    private static final CharsetEncoder UTF8 = Charset.forName("UTF-8").newEncoder();

    @Test
    public void testEscapeEmptyString() {
        assertEquals("", Entities.escape("", ASCII, Entities.EscapeMode.xhtml));
    }

    @Test
    public void testEscapePlainAscii() {
        assertEquals("abc", Entities.escape("abc", ASCII, Entities.EscapeMode.xhtml));
    }

    @Test
    public void testEscapeNamedEntityInMap() {
        assertEquals("&amp;", Entities.escape("&", ASCII, Entities.EscapeMode.xhtml));
        assertEquals("&lt;", Entities.escape("<", ASCII, Entities.EscapeMode.xhtml));
        assertEquals("&gt;", Entities.escape(">", ASCII, Entities.EscapeMode.xhtml));
    }

    @Test
    public void testEscapeCharacterEncodableByEncoder() {
        assertEquals("a\u00e9b", Entities.escape("a\u00e9b", UTF8, Entities.EscapeMode.xhtml));
    }

    @Test
    public void testEscapeCharacterNotEncodableByEncoder() {
        assertEquals("&#3585;", Entities.escape("\u0e01", ASCII, Entities.EscapeMode.xhtml));
    }

    @Test
    public void testEscapeUsesExtendedMapWhenAvailable() {
        assertEquals("&euro;", Entities.escape("\u20ac", ASCII, Entities.EscapeMode.extended));
    }

    @Test
    public void testEscapeUsesBaseMapWhenAvailable() {
        assertEquals("&eacute;", Entities.escape("\u00e9", ASCII, Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeMultipleCharacters() {
        assertEquals("&amp;&amp;&amp;", Entities.escape("&&&", ASCII, Entities.EscapeMode.xhtml));
    }

    @Test(expected = NullPointerException.class)
    public void testEscapeNullString() {
        Entities.escape(null, ASCII, Entities.EscapeMode.xhtml);
    }

    @Test
    public void testUnescapeWithoutAmpersand() {
        assertEquals("hello", Entities.unescape("hello"));
    }

    @Test
    public void testUnescapeNamedEntity() {
        assertEquals("&", Entities.unescape("&amp;"));
        assertEquals("\u00e9", Entities.unescape("&eacute;"));
    }

    @Test
    public void testUnescapeEntityWithoutSemicolon() {
        assertEquals("&", Entities.unescape("&amp"));
    }

    @Test
    public void testUnescapeDecimalNumericEntity() {
        assertEquals("\u00e9", Entities.unescape("&#233;"));
    }

    @Test
    public void testUnescapeHexNumericEntity() {
        assertEquals("\u00e9", Entities.unescape("&#xE9;"));
        assertEquals("\u00e9", Entities.unescape("&#Xe9;"));
    }

    @Test
    public void testUnescapeUnknownNamedEntityRemains() {
        assertEquals("&unknown;", Entities.unescape("&unknown;"));
    }

    @Test
    public void testUnescapeInvalidNumericEntityRemains() {
        assertEquals("&#invalid;", Entities.unescape("&#invalid;"));
    }

    @Test
    public void testUnescapeMultipleEntities() {
        assertEquals("a&b\u00e9c", Entities.unescape("a&amp;b&eacute;c"));
    }

    @Test
    public void testUnescapeEmptyString() {
        assertEquals("", Entities.unescape(""));
    }

    @Test(expected = NullPointerException.class)
    public void testUnescapeNullString() {
        Entities.unescape(null);
    }
}