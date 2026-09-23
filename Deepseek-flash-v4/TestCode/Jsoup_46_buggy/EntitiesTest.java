package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import static org.junit.Assert.*;

public class EntitiesTest {
    private Document.OutputSettings settings;
    private Document.OutputSettings xhtmlSettings;
    private Document.OutputSettings baseSettings;
    private Document.OutputSettings extendedSettings;

    @Before
    public void setUp() {
        settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.extended);
        settings.charset("UTF-8");
        
        xhtmlSettings = new Document.OutputSettings();
        xhtmlSettings.escapeMode(Entities.EscapeMode.xhtml);
        xhtmlSettings.charset("UTF-8");
        
        baseSettings = new Document.OutputSettings();
        baseSettings.escapeMode(Entities.EscapeMode.base);
        baseSettings.charset("UTF-8");
        
        extendedSettings = new Document.OutputSettings();
        extendedSettings.escapeMode(Entities.EscapeMode.extended);
        extendedSettings.charset("UTF-8");
    }

    @After
    public void tearDown() {
        settings = null;
        xhtmlSettings = null;
        baseSettings = null;
        extendedSettings = null;
    }

    @Test
    public void testIsNamedEntityKnownEntities() {
        assertTrue("lt should be a named entity", Entities.isNamedEntity("lt"));
        assertTrue("amp should be a named entity", Entities.isNamedEntity("amp"));
        assertTrue("copy should be a named entity", Entities.isNamedEntity("copy"));
        assertTrue("reg should be a named entity", Entities.isNamedEntity("reg"));
    }

    @Test
    public void testIsNamedEntityUnknownEntities() {
        assertFalse("unknown entity should return false", Entities.isNamedEntity("nonexistent"));
        assertFalse("null entity should return false", Entities.isNamedEntity(null));
        assertFalse("empty string should return false", Entities.isNamedEntity(""));
        assertFalse("uppercase should return false", Entities.isNamedEntity("LT"));
    }

    @Test
    public void testIsBaseNamedEntityKnownBaseEntities() {
        assertTrue("lt should be a base named entity", Entities.isBaseNamedEntity("lt"));
        assertTrue("gt should be a base named entity", Entities.isBaseNamedEntity("gt"));
        assertTrue("amp should be a base named entity", Entities.isBaseNamedEntity("amp"));
        assertTrue("quot should be a base named entity", Entities.isBaseNamedEntity("quot"));
    }

    @Test
    public void testIsBaseNamedEntityNonBaseEntities() {
        assertFalse("copy is not a base entity", Entities.isBaseNamedEntity("copy"));
        assertFalse("reg is not a base entity", Entities.isBaseNamedEntity("reg"));
        assertFalse("null should return false", Entities.isBaseNamedEntity(null));
        assertFalse("empty string should return false", Entities.isBaseNamedEntity(""));
    }

    @Test
    public void testGetCharacterByNameKnownEntity() {
        assertEquals("lt should map to <", Character.valueOf('<'), Entities.getCharacterByName("lt"));
        assertEquals("amp should map to &", Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertEquals("copy should map to ©", Character.valueOf('\u00A9'), Entities.getCharacterByName("copy"));
        assertEquals("reg should map to ®", Character.valueOf('\u00AE'), Entities.getCharacterByName("reg"));
    }

    @Test
    public void testGetCharacterByNameUnknownEntity() {
        assertNull("unknown entity should be null", Entities.getCharacterByName("nonexistent"));
        assertNull("null should be null", Entities.getCharacterByName(null));
        assertNull("empty string should be null", Entities.getCharacterByName(""));
    }

    @Test
    public void testEscapeBasicAmpersand() {
        assertEquals("Basic escaping", "a&amp;b", Entities.escape("a&b", settings));
    }

    @Test
    public void testEscapeLessThanAttribute() {
        settings.escapeMode(Entities.EscapeMode.base);
        assertEquals("Less than in attribute", "&lt;script>", Entities.escape("<script>", settings));
        
        // In attribute, < should not be escaped
        Document.OutputSettings attrSettings = new Document.OutputSettings();
        attrSettings.escapeMode(Entities.EscapeMode.base);
        attrSettings.charset("UTF-8");
        assertEquals("Less than outside attribute", "&lt;script&gt;", Entities.escape("<script>", attrSettings));
    }

    @Test
    public void testEscapeNormaliseWhiteSpace() {
        settings.prettyPrint(true);
        String input = "  hello \n\t world  ";
        String escaped = Entities.escape(input, settings);
        assertEquals("Whitespace normalisation", " hello   world ", escaped);
    }

    @Test
    public void testEscapeStripLeadingWhiteSpace() {
        Document.OutputSettings stripSettings = new Document.OutputSettings();
        stripSettings.escapeMode(Entities.EscapeMode.base);
        stripSettings.charset("UTF-8");
        
        String result = Entities.escape("   hello", stripSettings);
        assertEquals("Leading whitespace kept", "   hello", result);
    }

    @Test
    public void testEscapeNonAsciiCharacters() {
        String unicode = "café";
        String escaped = Entities.escape(unicode, settings);
        assertEquals("UTF-8 can encode, should keep as is", "café", escaped);
    }

    @Test
    public void testEscapeInXhtmlMode() {
        String input = "&<>\"";
        String escaped = Entities.escape(input, xhtmlSettings);
        assertEquals("XHTML mode: & as &amp;, < as &lt;, > as &gt;, \" as &quot;", 
                     "&amp;&lt;&gt;&quot;", escaped);
    }

    @Test
    public void testEscapeInAttributeMode() {
        Document.OutputSettings attrSettings = new Document.OutputSettings();
        attrSettings.escapeMode(Entities.EscapeMode.base);
        attrSettings.charset("UTF-8");
        
        String input = "<tag attr=\"value\">";
        assertEquals("In attribute: < and > not escaped, \" is", 
                     "&lt;tag attr=&quot;value&quot;&gt;", 
                     Entities.escape(input, attrSettings));
    }

    @Test
    public void testEscapeNullInput() {
        try {
            Entities.escape(null, settings);
            fail("Should throw NullPointerException for null input");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testUnescapeBasicEntity() {
        assertEquals("Basic unescape", "&", Entities.unescape("&amp;"));
        assertEquals("Less than unescape", "<", Entities.unescape("&lt;"));
    }

    @Test
    public void testUnescapeStrictMode() {
        assertEquals("Non-strict unescape", "&", Entities.unescape("&amp"));
        try {
            Entities.unescape("&amp", true);
            fail("Strict mode should throw for missing semicolon");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testUnescapeNotEntity() {
        assertEquals("No entity to unescape", "hello", Entities.unescape("hello"));
    }

    @Test
    public void testUnescapeNullInput() {
        assertNull("Null input returns null", Entities.unescape(null));
    }

    @Test
    public void testEscapeWithExtendedEntities() {
        String input = "©®";
        String escaped = Entities.escape(input, extendedSettings);
        assertEquals("Extended mode: © as &copy;, ® as &reg;", "&copy;&reg;", escaped);
    }

    @Test
    public void testEscapeWithBaseEntities() {
        Document.OutputSettings baseOut = new Document.OutputSettings();
        baseOut.escapeMode(Entities.EscapeMode.base);
        baseOut.charset("US-ASCII");
        
        String input = "©®";
        String escaped = Entities.escape(input, baseOut);
        // © and ® are not in base, so should be hex encoded
        assertEquals("Base mode: © and ® hex encoded", "&#xa9;&#xae;", escaped);
    }

    @Test
    public void testSurrogatePairs() {
        String emoji = new String(Character.toChars(0x1F600)); // smiley emoji
        String escaped = Entities.escape(emoji, settings);
        assertEquals("Emoji with extended mode should be hex encoded", "&#x1f600;", escaped);
        
        Document.OutputSettings asciiSettings = new Document.OutputSettings();
        asciiSettings.escapeMode(Entities.EscapeMode.base);
        asciiSettings.charset("US-ASCII");
        String asciiEscaped = Entities.escape(emoji, asciiSettings);
        assertEquals("Emoji with US-ASCII should be hex encoded", "&#x1f600;", asciiEscaped);
    }

    @Test
    public void testEscapeWithAsciiCharset() {
        Document.OutputSettings asciiSettings = new Document.OutputSettings();
        asciiSettings.escapeMode(Entities.EscapeMode.base);
        asciiSettings.charset("US-ASCII");
        
        String input = "café";
        String escaped = Entities.escape(input, asciiSettings);
        assertEquals("Non-ASCII with US-ASCII charset should be escaped", "caf&#xe9;", escaped);
    }

    @Test
    public void testEscapeNonAsciiInAttribute() {
        Document.OutputSettings attrSettings = new Document.OutputSettings();
        attrSettings.escapeMode(Entities.EscapeMode.base);
        attrSettings.charset("US-ASCII");
        
        String result = Entities.escape("café", attrSettings);
        assertEquals("Non-ASCII in attribute", "caf&#xe9;", result);
    }

    @Test
    public void testEscapeWithXhtmlAndNonAscii() {
        String input = "café";
        String escaped = Entities.escape(input, xhtmlSettings);
        assertEquals("XHTML mode, UTF-8 can encode, should keep", "café", escaped);
    }

    @Test
    public void testMultipleEntities() {
        String input = "&<>\"'";
        String escaped = Entities.escape(input, settings);
        assertEquals("Mix of entities", "&amp;&lt;&gt;&quot;'", escaped);
    }

    @Test
    public void testEscapeNormaliseWhiteSpaceSingleRound() {
        Document.OutputSettings normaliseSettings = new Document.OutputSettings();
        normaliseSettings.escapeMode(Entities.EscapeMode.base);
        normaliseSettings.charset("UTF-8");
        normaliseSettings.prettyPrint(true);
        
        String input = "  a  b  ";
        String result = Entities.escape(input, normaliseSettings);
        // First leading whitespace should be stripped if stripLeadingWhite is true (but not in this overload)
        assertEquals("Whitespace normalisation", " a  b ", result);
    }

    @Test
    public void testEscapeNormaliseWhiteSpaceTwoRounds() {
        Document.OutputSettings normaliseSettings = new Document.OutputSettings();
        normaliseSettings.escapeMode(Entities.EscapeMode.base);
        normaliseSettings.charset("UTF-8");
        normaliseSettings.prettyPrint(true);
        
        String input = "  a\t\n  b  ";
        String result = Entities.escape(input, normaliseSettings);
        assertEquals("Whitespace normalisation with mixed whitespace", " a b  ", result);
    }
}