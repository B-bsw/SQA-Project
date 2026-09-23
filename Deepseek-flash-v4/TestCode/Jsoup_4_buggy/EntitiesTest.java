package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

public class EntitiesTest {
    private CharsetEncoder asciiEncoder;
    private Document.OutputSettings baseSettings;
    private Document.OutputSettings extendedSettings;

    @Before
    public void setUp() {
        asciiEncoder = StandardCharsets.US_ASCII.newEncoder();
        baseSettings = new Document.OutputSettings();
        baseSettings.escapeMode(Entities.EscapeMode.base);
        baseSettings.encoder(asciiEncoder);
        extendedSettings = new Document.OutputSettings();
        extendedSettings.escapeMode(Entities.EscapeMode.extended);
        extendedSettings.encoder(asciiEncoder);
    }

    @After
    public void tearDown() {
        // No cleanup needed
    }

    @Test
    public void testEscapeBasicAscii() {
        Assert.assertEquals("&lt;div&gt;", Entities.escape("<div>", baseSettings));
        Assert.assertEquals("&amp;", Entities.escape("&", baseSettings));
        Assert.assertEquals("&quot;", Entities.escape("\"", baseSettings));
    }

    @Test
    public void testEscapeNonAsciiWithExtended() {
        Assert.assertEquals("&Abreve;", Entities.escape("\u0102", extendedSettings));
        Assert.assertEquals("&Acy;", Entities.escape("\u0410", extendedSettings));
    }

    @Test
    public void testEscapeNonAsciiWithBase() {
        Assert.assertEquals("&#256;", Entities.escape("\u0100", baseSettings));
        Assert.assertEquals("&#x100;", Entities.escape("\u0100", asciiEncoder, Entities.EscapeMode.extended));
    }

    @Test
    public void testEscapeUnencodableCharacter() {
        Assert.assertEquals("&#128;&#x26;&#x3C;", Entities.escape("\u0080&<", asciiEncoder, Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeEmptyString() {
        Assert.assertEquals("", Entities.escape("", baseSettings));
        Assert.assertEquals("", Entities.escape("", asciiEncoder, Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeNullInput() {
        try {
            Entities.escape(null, baseSettings);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }

        try {
            Entities.escape(null, asciiEncoder, Entities.EscapeMode.base);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testEscapeSpecialCharacters() {
        Assert.assertEquals("&nbsp;", Entities.escape("\u00A0", baseSettings));
        Assert.assertEquals("&#xA0;", Entities.escape("\u00A0", asciiEncoder, Entities.EscapeMode.extended));
    }

    @Test
    public void testUnescapePlainTextWithNoAmpersand() {
        Assert.assertEquals("hello world", Entities.unescape("hello world"));
        Assert.assertEquals("", Entities.unescape(""));
    }

    @Test
    public void testUnescapeBasicEntities() {
        Assert.assertEquals("<div>", Entities.unescape("&lt;div&gt;"));
        Assert.assertEquals("&", Entities.unescape("&amp;"));
        Assert.assertEquals("\"", Entities.unescape("&quot;"));
    }

    @Test
    public void testUnescapeNumericEntities() {
        Assert.assertEquals("\u0100", Entities.unescape("&#256;"));
        Assert.assertEquals("\u0100", Entities.unescape("&#x100;"));
        Assert.assertEquals("\u0100", Entities.unescape("&#X100;"));
    }

    @Test
    public void testUnescapeFullEntityNames() {
        Assert.assertEquals("\u0102", Entities.unescape("&Abreve;"));
        Assert.assertEquals("\u0410", Entities.unescape("&Acy;"));
    }

    @Test
    public void testUnescapeInvalidNumericEntity() {
        Assert.assertEquals("&#invalid;", Entities.unescape("&#invalid;"));
        Assert.assertEquals("&#xZZ;", Entities.unescape("&#xZZ;"));
    }

    @Test
    public void testUnescapeUnknownEntity() {
        Assert.assertEquals("&unknownentity;", Entities.unescape("&unknownentity;"));
    }

    @Test
    public void testUnescapeMixedContent() {
        String mixed = "&lt;tag&gt; &amp; &#65;&#x42; text &copy;";
        Assert.assertEquals("<tag> & AB text \u00A9", Entities.unescape(mixed));
    }

    @Test
    public void testUnescapeWithoutSemicolon() {
        Assert.assertEquals("&lt", Entities.unescape("&lt"));
    }

    @Test
    public void testEscapeRoundTrip() {
        String original = "&<>\"'";
        String escaped = Entities.escape(original, baseSettings);
        Assert.assertEquals("&amp;&lt;&gt;&quot;'", escaped);
        Assert.assertEquals(original, Entities.unescape(escaped));
    }

    @Test
    public void testEscapeNullEncoder() {
        try {
            Entities.escape("test", null, Entities.EscapeMode.base);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testEscapeNullEscapeMode() {
        try {
            Entities.escape("test", asciiEncoder, null);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }
}