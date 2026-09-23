package org.jsoup.nodes;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Map;

public class EntitiesTest {

    @Test
    public void testIsNamedEntityWithValidNames() {
        assertTrue(Entities.isNamedEntity("amp"));
        assertTrue(Entities.isNamedEntity("lt"));
        assertTrue(Entities.isNamedEntity("gt"));
        assertTrue(Entities.isNamedEntity("quot"));
        assertTrue(Entities.isNamedEntity("nbsp"));
        assertTrue(Entities.isNamedEntity("copy"));
        assertTrue(Entities.isNamedEntity("reg"));
        assertTrue(Entities.isNamedEntity("trade"));
    }

    @Test
    public void testIsNamedEntityWithInvalidNames() {
        assertFalse(Entities.isNamedEntity("invalid"));
        assertFalse(Entities.isNamedEntity(""));
        assertFalse(Entities.isNamedEntity(null));
        assertFalse(Entities.isNamedEntity("amp;"));
    }

    @Test
    public void testIsBaseNamedEntity() {
        assertTrue(Entities.isBaseNamedEntity("amp"));
        assertTrue(Entities.isBaseNamedEntity("lt"));
        assertTrue(Entities.isBaseNamedEntity("gt"));
        assertTrue(Entities.isBaseNamedEntity("quot"));
        assertTrue(Entities.isBaseNamedEntity("nbsp"));
        assertFalse(Entities.isBaseNamedEntity("copy"));
        assertFalse(Entities.isBaseNamedEntity("invalid"));
        assertFalse(Entities.isBaseNamedEntity(""));
        assertFalse(Entities.isBaseNamedEntity(null));
    }

    @Test
    public void testGetCharacterByName() {
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
        assertEquals(Character.valueOf('>'), Entities.getCharacterByName("gt"));
        assertEquals(Character.valueOf('"'), Entities.getCharacterByName("quot"));
        assertEquals(Character.valueOf('\u00A0'), Entities.getCharacterByName("nbsp"));
        assertEquals(Character.valueOf('\u00A9'), Entities.getCharacterByName("copy"));
        assertNull(Entities.getCharacterByName("invalid"));
        assertNull(Entities.getCharacterByName(""));
        assertNull(Entities.getCharacterByName(null));
    }

    @Test
    public void testEscapeNormalCases() {
        Document.OutputSettings out = new Document.OutputSettings();
        
        // Basic escapes
        assertEquals("&amp;", Entities.escape("&", out));
        assertEquals("&lt;", Entities.escape("<", out));
        assertEquals("&gt;", Entities.escape(">", out));
        assertEquals("&quot;", Entities.escape("\"", out));
        
        // Non-special characters
        assertEquals("hello", Entities.escape("hello", out));
        assertEquals("hello world", Entities.escape("hello world", out));
        assertEquals("hello&world", Entities.escape("hello&world", out));
    }

    @Test
    public void testEscapeWithNormaliseWhite() {
        Document.OutputSettings out = new Document.OutputSettings();
        
        // No normalise whitespace
        assertEquals("hello  world", Entities.escape("hello  world", out));
        
        // With normalise whitespace
        out.normaliseWhiteSpace(true);
        assertEquals("hello world", Entities.escape("hello  world", out));
        assertEquals(" hello world", Entities.escape("  hello world", out));
        assertEquals("hello world ", Entities.escape("hello world  ", out));
        
        // With strip leading whitespace
        out.stripLeadingWhite(true);
        out.normaliseWhiteSpace(true);
        assertEquals("hello world", Entities.escape("  hello world", out));
    }

    @Test
    public void testEscapeWithDifferentEscapeModes() {
        Document.OutputSettings out = new Document.OutputSettings();
        
        // XHTML mode
        out.escapeMode(Entities.EscapeMode.xhtml);
        assertEquals("&#xa0;", Entities.escape("\u00A0", out));
        
        // Base mode
        out.escapeMode(Entities.EscapeMode.base);
        assertEquals("&nbsp;", Entities.escape("\u00A0", out));
        
        // Extended mode
        out.escapeMode(Entities.EscapeMode.extended);
        assertEquals("&nbsp;", Entities.escape("\u00A0", out));
    }

    @Test
    public void testEscapeWithAttributeContext() {
        Document.OutputSettings out = new Document.OutputSettings();
        
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "<test>", out, true, false, false);
        assertEquals("<test>", accum.toString());
        
        accum = new StringBuilder();
        Entities.escape(accum, "<test>", out, false, false, false);
        assertEquals("&lt;test&gt;", accum.toString());
    }

    @Test
    public void testEscapeWithSpecialCharacters() {
        Document.OutputSettings out = new Document.OutputSettings();
        
        // Non-breaking space
        assertEquals("&nbsp;", Entities.escape("\u00A0", out));
        
        // Copyright symbol
        assertEquals("&copy;", Entities.escape("\u00A9", out));
    }

    @Test
    public void testUnescape() {
        assertEquals("&", Entities.unescape("&amp;"));
        assertEquals("<", Entities.unescape("&lt;"));
        assertEquals(">", Entities.unescape("&gt;"));
        assertEquals("\"", Entities.unescape("&quot;"));
        assertEquals("\u00A0", Entities.unescape("&nbsp;"));
        assertEquals("hello", Entities.unescape("hello"));
        assertEquals("hello&world", Entities.unescape("hello&amp;world"));
    }

    @Test
    public void testUnescapeWithStrictMode() {
        // Strict mode requires semicolon
        assertEquals("&amp", Entities.unescape("&amp", true));
        assertEquals("&", Entities.unescape("&amp;", true));
        
        // Non-strict mode allows missing semicolon
        assertEquals("&", Entities.unescape("&amp", false));
        assertEquals("&", Entities.unescape("&amp;", false));
    }

    @Test
    public void testEscapeModeGetMap() {
        Map<String, String> xhtmlMap = Entities.EscapeMode.xhtml.getMap();
        assertEquals("quot", xhtmlMap.get("\""));
        assertEquals("amp", xhtmlMap.get("&"));
        assertEquals("lt", xhtmlMap.get("<"));
        assertEquals("gt", xhtmlMap.get(">"));
        
        Map<String, String> baseMap = Entities.EscapeMode.base.getMap();
        assertTrue(baseMap.containsKey("\u00A0"));
        
        Map<String, String> extendedMap = Entities.EscapeMode.extended.getMap();
        assertTrue(extendedMap.containsKey("\u00A9"));
    }

    @Test
    public void testToCharacterKeyFunction() {
        // This is tested indirectly through escape functionality
        // The method is package-private, testing through public API
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.xhtml);
        assertEquals("&#xa0;", Entities.escape("\u00A0", out));
        
        out.escapeMode(Entities.EscapeMode.base);
        assertEquals("&nbsp;", Entities.escape("\u00A0", out));
    }

    @Test
    public void testEscapeHandlesUnicodeSupplementaryCharacters() {
        Document.OutputSettings out = new Document.OutputSettings();
        
        // Supplementary character (musical symbols - outside Basic Multilingual Plane)
        String musicalSymbols = "\uD834\uDD1E";
        String escaped = Entities.escape(musicalSymbols, out);
        assertNotNull(escaped);
        assertTrue(escaped.length() > 0);
    }

    @Test
    public void testEscapeWithEmptyInput() {
        Document.OutputSettings out = new Document.OutputSettings();
        assertEquals("", Entities.escape("", out));
        assertEquals(0, Entities.escape("", out).length());
    }

    @Test
    public void testEscapeMixedContent() {
        Document.OutputSettings out = new Document.OutputSettings();
        String mixed = "Hello & welcome to <test> \"page\" 'continued'";
        String escaped = Entities.escape(mixed, out);
        assertEquals("Hello &amp; welcome to &lt;test&gt; \"page\" 'continued'", escaped);
    }

    @Test
    public void testEscapeWithNormaliseWhiteAndAttributes() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.normaliseWhiteSpace(true);
        
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "hello  <test>  world", out, true, true, false);
        assertEquals("hello  <test>  world", accum.toString());
    }

    @Test
    public void testCanEncodeHelper() {
        // Test through reflection or indirectly through escape
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.xhtml);
        
        // ASCII characters should be encoded
        String result = Entities.escape("hello", out);
        assertEquals("hello", result);
    }

    @Test
    public void testEscapeWithEncoderFallback() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.extended);
        
        // Character that may not be in default charset but should be escaped
        String chineseChars = "\u4E2D\u6587";
        String result = Entities.escape(chineseChars, out);
        assertNotNull(result);
    }
}