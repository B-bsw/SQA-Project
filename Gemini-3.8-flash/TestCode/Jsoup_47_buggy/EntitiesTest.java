package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Map;

public class EntitiesTest {

    @Test
    public void isNamedEntity_givenKnownFullEntity_shouldReturnTrue() {
        // Arrange
        String entityName = "amp";

        // Act
        boolean result = Entities.isNamedEntity(entityName);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isNamedEntity_givenUnknownEntity_shouldReturnFalse() {
        // Arrange
        String entityName = "nonExistentEntityXYZ123";

        // Act
        boolean result = Entities.isNamedEntity(entityName);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isBaseNamedEntity_givenKnownBaseEntity_shouldReturnTrue() {
        // Arrange
        String entityName = "lt";

        // Act
        boolean result = Entities.isBaseNamedEntity(entityName);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isBaseNamedEntity_givenExtendedOrUnknownEntity_shouldReturnFalse() {
        // Arrange
        String entityName = "notAnEntity";

        // Act
        boolean result = Entities.isBaseNamedEntity(entityName);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void getCharacterByName_givenKnownEntity_shouldReturnCharacter() {
        // Arrange
        String entityName = "gt";

        // Act
        Character c = Entities.getCharacterByName(entityName);

        // Assert
        Assert.assertNotNull(c);
        Assert.assertEquals(Character.valueOf('>'), c);
    }

    @Test
    public void getCharacterByName_givenUnknownEntity_shouldReturnNull() {
        // Arrange
        String entityName = "unknownEntity";

        // Act
        Character c = Entities.getCharacterByName(entityName);

        // Assert
        Assert.assertNull(c);
    }

    @Test
    public void escapeMode_valuesAndGetMap_shouldBePopulated() {
        // Act & Assert
        for (Entities.EscapeMode mode : Entities.EscapeMode.values()) {
            Map<Character, String> map = mode.getMap();
            Assert.assertNotNull(map);
            Assert.assertFalse(map.isEmpty());
        }
        Assert.assertNotNull(Entities.EscapeMode.valueOf("base"));
        Assert.assertNotNull(Entities.EscapeMode.valueOf("xhtml"));
        Assert.assertNotNull(Entities.EscapeMode.valueOf("extended"));
    }

    @Test
    public void escape_givenEmptyString_shouldReturnEmptyString() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        String input = "";

        // Act
        String result = Entities.escape(input, settings);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void escape_givenAsciiSpecialCharsNotInAttribute_shouldEscapeHtmlCharacters() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset(Charset.forName("UTF-8"));
        String input = "& < > \" '";

        // Act
        String result = Entities.escape(input, settings);

        // Assert
        Assert.assertEquals("&amp; &lt; &gt; \" '", result);
    }

    @Test
    public void escape_givenSpecialCharsInAttribute_shouldEscapeQuotesAndKeepTags() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset(Charset.forName("UTF-8"));
        StringBuilder accum = new StringBuilder();
        String input = "<tag attr=\"hello & world\">";

        // Act
        Entities.escape(accum, input, settings, true, false, false);

        // Assert
        Assert.assertEquals("<tag attr=&quot;hello &amp; world&quot;>", accum.toString());
    }

    @Test
    public void escape_givenNonBreakingSpaceInNonXhtmlMode_shouldEscapeToNbsp() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.base);
        String input = "Hello\u00A0World";

        // Act
        String result = Entities.escape(input, settings);

        // Assert
        Assert.assertEquals("Hello&nbsp;World", result);
    }

    @Test
    public void escape_givenNonBreakingSpaceInXhtmlMode_shouldEscapeToHex() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.xhtml);
        String input = "Hello\u00A0World";

        // Act
        String result = Entities.escape(input, settings);

        // Assert
        Assert.assertEquals("Hello&#xa0;World", result);
    }

    @Test
    public void escape_givenAsciiCharsetWithNonAsciiCharactersMapped_shouldEscapeToEntity() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset(Charset.forName("US-ASCII"));
        settings.escapeMode(Entities.EscapeMode.base);
        String input = "\u00A9"; // copyright sign

        // Act
        String result = Entities.escape(input, settings);

        // Assert
        Assert.assertEquals("&copy;", result);
    }

    @Test
    public void escape_givenAsciiCharsetWithNonAsciiCharactersUnmapped_shouldEscapeToHex() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset(Charset.forName("US-ASCII"));
        settings.escapeMode(Entities.EscapeMode.xhtml); // xhtml map only has lt, gt, amp, quot
        String input = "\u03C0"; // Greek pi

        // Act
        String result = Entities.escape(input, settings);

        // Assert
        Assert.assertEquals("&#x3c0;", result);
    }

    @Test
    public void escape_givenFallbackCharsetIso88591_shouldEncodeEncodableAndHexUnencodable() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset(Charset.forName("ISO-8859-1"));
        settings.escapeMode(Entities.EscapeMode.xhtml);
        // \u00E9 (e acute) is encodable in ISO-8859-1; \u03C0 is not encodable and not in xhtml map
        String input = "\u00E9 \u03C0";

        // Act
        String result = Entities.escape(input, settings);

        // Assert
        Assert.assertEquals("\u00E9 &#x3c0;", result);
    }

    @Test
    public void escape_givenSupplementaryCharactersWithUtf8_shouldEncodeVerbatim() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset(Charset.forName("UTF-8"));
        // Code point 0x1F600 (Grinning Face emoji)
        String input = new String(Character.toChars(0x1F600));

        // Act
        String result = Entities.escape(input, settings);

        // Assert
        Assert.assertEquals(input, result);
    }

    @Test
    public void escape_givenSupplementaryCharactersWithAscii_shouldEscapeToHex() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset(Charset.forName("US-ASCII"));
        String input = new String(Character.toChars(0x1F600));

        // Act
        String result = Entities.escape(input, settings);

        // Assert
        Assert.assertEquals("&#x1f600;", result);
    }

    @Test
    public void escape_givenNormaliseWhiteWithoutStripLeading_shouldCollapseWhitespaces() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        StringBuilder accum = new StringBuilder();
        String input = "   a   b \t\n  c   ";

        // Act
        Entities.escape(accum, input, settings, false, true, false);

        // Assert
        Assert.assertEquals(" a b c ", accum.toString());
    }

    @Test
    public void escape_givenNormaliseWhiteWithStripLeading_shouldDropLeadingWhitespaceAndCollapse() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        StringBuilder accum = new StringBuilder();
        String input = "   a   b  ";

        // Act
        Entities.escape(accum, input, settings, false, true, true);

        // Assert
        Assert.assertEquals("a b ", accum.toString());
    }

    @Test
    public void escape_givenNormaliseWhiteWithOnlyWhitespacesAndStripLeading_shouldOutputEmpty() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        StringBuilder accum = new StringBuilder();
        String input = "    \t \n ";

        // Act
        Entities.escape(accum, input, settings, false, true, true);

        // Assert
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void unescape_givenEscapedStringDefaultStrictness_shouldUnescape() {
        // Arrange
        String input = "&lt;&gt;&amp;&quot;&apos;";

        // Act
        String result = Entities.unescape(input);

        // Assert
        Assert.assertEquals("<>&\"'", result);
    }

    @Test
    public void unescape_givenEscapedStringWithStrictFlag_shouldUnescape() {
        // Arrange
        String strictInput = "&amp; &lt;";
        String nonStrictInput = "&amp; &amp";

        // Act
        String strictResult = Entities.unescape(strictInput, true);
        String nonStrictResult = Entities.unescape(nonStrictInput, false);

        // Assert
        Assert.assertEquals("& <", strictResult);
        Assert.assertEquals("& &", nonStrictResult);
    }
}