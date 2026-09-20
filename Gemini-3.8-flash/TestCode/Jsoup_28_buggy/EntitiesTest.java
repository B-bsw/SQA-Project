package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;

public class EntitiesTest {

    @Test
    public void privateConstructor_shouldBePrivateAndCallableViaReflection() throws Exception {
        // Arrange
        Constructor<Entities> constructor = Entities.class.getDeclaredConstructor(new Class[0]);

        // Act & Assert
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        Entities instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull(instance);
    }

    @Test
    public void escapeMode_valuesAndValueOf_shouldReturnEnumConstants() {
        // Act
        Entities.EscapeMode[] modes = Entities.EscapeMode.values();
        Entities.EscapeMode xhtml = Entities.EscapeMode.valueOf("xhtml");
        Entities.EscapeMode base = Entities.EscapeMode.valueOf("base");
        Entities.EscapeMode extended = Entities.EscapeMode.valueOf("extended");

        // Assert
        Assert.assertEquals(3, modes.length);
        Assert.assertEquals(Entities.EscapeMode.xhtml, xhtml);
        Assert.assertEquals(Entities.EscapeMode.base, base);
        Assert.assertEquals(Entities.EscapeMode.extended, extended);
    }

    @Test
    public void escapeMode_getMap_shouldReturnPopulatedMaps() {
        // Act
        Map<Character, String> xhtmlMap = Entities.EscapeMode.xhtml.getMap();
        Map<Character, String> baseMap = Entities.EscapeMode.base.getMap();
        Map<Character, String> extendedMap = Entities.EscapeMode.extended.getMap();

        // Assert
        Assert.assertNotNull(xhtmlMap);
        Assert.assertNotNull(baseMap);
        Assert.assertNotNull(extendedMap);

        Assert.assertTrue(xhtmlMap.containsKey(Character.valueOf('<')));
        Assert.assertTrue(baseMap.containsKey(Character.valueOf('<')));
        Assert.assertTrue(extendedMap.containsKey(Character.valueOf('<')));

        Assert.assertEquals("lt", xhtmlMap.get(Character.valueOf('<')));
        Assert.assertEquals("gt", xhtmlMap.get(Character.valueOf('>')));
        Assert.assertEquals("amp", xhtmlMap.get(Character.valueOf('&')));
        Assert.assertEquals("quot", xhtmlMap.get(Character.valueOf('"')));
        Assert.assertEquals("apos", xhtmlMap.get(Character.valueOf('\'')));
    }

    @Test
    public void isNamedEntity_givenKnownEntity_shouldReturnTrue() {
        // Act & Assert
        Assert.assertTrue(Entities.isNamedEntity("lt"));
        Assert.assertTrue(Entities.isNamedEntity("gt"));
        Assert.assertTrue(Entities.isNamedEntity("amp"));
        Assert.assertTrue(Entities.isNamedEntity("quot"));
    }

    @Test
    public void isNamedEntity_givenUnknownEntity_shouldReturnFalse() {
        // Act & Assert
        Assert.assertFalse(Entities.isNamedEntity("unknownEntityXYZ123"));
        Assert.assertFalse(Entities.isNamedEntity(""));
        Assert.assertFalse(Entities.isNamedEntity("1234"));
    }

    @Test
    public void getCharacterByName_givenKnownEntity_shouldReturnExpectedCharacter() {
        // Act & Assert
        Assert.assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
        Assert.assertEquals(Character.valueOf('>'), Entities.getCharacterByName("gt"));
        Assert.assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        Assert.assertEquals(Character.valueOf('"'), Entities.getCharacterByName("quot"));
    }

    @Test
    public void getCharacterByName_givenUnknownEntity_shouldReturnNull() {
        // Act & Assert
        Assert.assertNull(Entities.getCharacterByName("unknownEntityXYZ123"));
        Assert.assertNull(Entities.getCharacterByName(""));
    }

    @Test
    public void escape_givenEmptyString_shouldReturnEmptyString() {
        // Arrange
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();

        // Act
        String result = Entities.escape("", encoder, Entities.EscapeMode.xhtml);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void escape_givenXhtmlModeAndSpecialCharacters_shouldEscapeToEntities() {
        // Arrange
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String input = "<>&\"'";

        // Act
        String result = Entities.escape(input, encoder, Entities.EscapeMode.xhtml);

        // Assert
        Assert.assertEquals("&lt;&gt;&amp;&quot;&apos;", result);
    }

    @Test
    public void escape_givenEncodableAsciiCharacters_shouldNotEscape() {
        // Arrange
        CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
        String input = "Hello World 123 !?/";

        // Act
        String result = Entities.escape(input, encoder, Entities.EscapeMode.xhtml);

        // Assert
        Assert.assertEquals("Hello World 123 !?/", result);
    }

    @Test
    public void escape_givenUnencodableCharacter_shouldEscapeToNumericEntity() {
        // Arrange
        CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
        String input = "\u00A9"; // Copyright symbol, not in xhtml entity map

        // Act
        String result = Entities.escape(input, asciiEncoder, Entities.EscapeMode.xhtml);

        // Assert
        Assert.assertEquals("&#169;", result);
    }

    @Test
    public void escape_givenDocumentOutputSettings_shouldEscapeCorrectly() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        String input = "<b>Test & 'quote'</b>";

        // Act
        String result = Entities.escape(input, settings);

        // Assert
        Assert.assertTrue(result.contains("&lt;b&gt;"));
        Assert.assertTrue(result.contains("&amp;"));
    }

    @Test
    public void unescape_givenStringWithoutAmpersand_shouldReturnOriginalStringImmediately() {
        // Arrange
        String input = "Plain text without entity marker";

        // Act
        String result = Entities.unescape(input);

        // Assert
        Assert.assertSame(input, result);
    }

    @Test
    public void unescape_givenAmpersandWithoutEntityPattern_shouldReturnStringUnmodified() {
        // Arrange
        String input = "Bread & Butter && & ;";

        // Act
        String result = Entities.unescape(input);

        // Assert
        Assert.assertEquals("Bread & Butter && & ;", result);
    }

    @Test
    public void unescape_givenValidNamedEntities_shouldUnescapeToCharacters() {
        // Arrange
        String input = "&lt;div class=&quot;main&quot;&gt;Tom &amp; Jerry&apos;s&lt;/div&gt;";

        // Act
        String result = Entities.unescape(input);

        // Assert
        Assert.assertEquals("<div class=\"main\">Tom & Jerry's</div>", result);
    }

    @Test
    public void unescape_givenUnknownNamedEntity_shouldRetainOriginalToken() {
        // Arrange
        String input = "&unknownEntity; &foo;";

        // Act
        String result = Entities.unescape(input);

        // Assert
        Assert.assertEquals("&unknownEntity; &foo;", result);
    }

    @Test
    public void unescape_givenDecimalNumericEntity_shouldUnescapeToCharacter() {
        // Arrange
        String input = "&#65;&#66;&#67;"; // ABC

        // Act
        String result = Entities.unescape(input);

        // Assert
        Assert.assertEquals("ABC", result);
    }

    @Test
    public void unescape_givenHexNumericEntityLowercaseX_shouldUnescapeToCharacter() {
        // Arrange
        String input = "&#x41;&#x42;&#x43;"; // ABC

        // Act
        String result = Entities.unescape(input);

        // Assert
        Assert.assertEquals("ABC", result);
    }

    @Test
    public void unescape_givenHexNumericEntityUppercaseX_shouldUnescapeToCharacter() {
        // Arrange
        String input = "&#X41;&#X42;&#X43;"; // ABC

        // Act
        String result = Entities.unescape(input);

        // Assert
        Assert.assertEquals("ABC", result);
    }

    @Test
    public void unescape_givenOverflowDecimalNumericEntity_shouldCatchNumberFormatExceptionAndRetainToken() {
        // Arrange
        String input = "&#9999999999999999999999999999999999999999;";

        // Act
        String result = Entities.unescape(input);

        // Assert
        Assert.assertEquals(input, result);
    }

    @Test
    public void unescape_givenOverflowHexNumericEntity_shouldCatchNumberFormatExceptionAndRetainToken() {
        // Arrange
        String input = "&#xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF;";

        // Act
        String result = Entities.unescape(input);

        // Assert
        Assert.assertEquals(input, result);
    }

    @Test
    public void unescape_givenNonStrictWithoutTrailingSemicolon_shouldUnescape() {
        // Arrange
        String input = "&lt &gt &amp &quot";

        // Act
        String result = Entities.unescape(input, false);

        // Assert
        Assert.assertEquals("< > & \"", result);
    }

    @Test
    public void unescape_givenStrictWithoutTrailingSemicolon_shouldNotUnescape() {
        // Arrange
        String input = "&lt &gt &amp &quot";

        // Act
        String result = Entities.unescape(input, true);

        // Assert
        Assert.assertEquals("&lt &gt &amp &quot", result);
    }

    @Test
    public void unescape_givenStrictWithTrailingSemicolon_shouldUnescape() {
        // Arrange
        String input = "&lt; &gt; &amp; &quot;";

        // Act
        String result = Entities.unescape(input, true);

        // Assert
        Assert.assertEquals("< > & \"", result);
    }

    @Test
    public void unescape_singleArgOverload_shouldDefaultToNonStrict() {
        // Arrange
        String input = "&lt &gt";

        // Act
        String result = Entities.unescape(input);

        // Assert
        Assert.assertEquals("< >", result);
    }

    @Test
    public void unescape_givenReplacementWithRegexSpecialCharacters_shouldQuoteCorrectly() {
        // Arrange
        // &#36; is '$' and &#92; is '\', both are special characters in Matcher.appendReplacement
        String input = "Price: &#36;100 and path: C:&#92;test";

        // Act
        String result = Entities.unescape(input);

        // Assert
        Assert.assertEquals("Price: $100 and path: C:\\test", result);
    }

    @Test
    public void unescape_givenMixedEntitiesAndSurroundingText_shouldPreserveStructure() {
        // Arrange
        String input = "Prefix &lt;&#x41;&#66;&gt; Suffix &amp; &unknown;";

        // Act
        String result = Entities.unescape(input);

        // Assert
        Assert.assertEquals("Prefix <AB> Suffix & &unknown;", result);
    }
}