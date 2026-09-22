package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.Map;

public class EntitiesTest {

    private Document.OutputSettings outputSettings;

    @Before
    public void setUp() {
        outputSettings = new Document.OutputSettings();
    }

    @Test
    public void constructor_privateAccess_shouldBeInaccessibleAndCallableViaReflection() throws Exception {
        Constructor<Entities> constructor = Entities.class.getDeclaredConstructor(new Class[0]);
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        Entities instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull(instance);
    }

    @Test
    public void escapeMode_getMap_shouldReturnNonEmptyEntityMaps() {
        Map<Character, String> xhtmlMap = Entities.EscapeMode.xhtml.getMap();
        Map<Character, String> baseMap = Entities.EscapeMode.base.getMap();
        Map<Character, String> extendedMap = Entities.EscapeMode.extended.getMap();

        Assert.assertNotNull(xhtmlMap);
        Assert.assertNotNull(baseMap);
        Assert.assertNotNull(extendedMap);

        Assert.assertEquals("amp", xhtmlMap.get(Character.valueOf('&')));
        Assert.assertEquals("quot", xhtmlMap.get(Character.valueOf('"')));
        Assert.assertEquals("lt", xhtmlMap.get(Character.valueOf('<')));
        Assert.assertEquals("gt", xhtmlMap.get(Character.valueOf('>')));
        Assert.assertNull(xhtmlMap.get(Character.valueOf((char) 0xA0)));

        Assert.assertTrue(extendedMap.size() > baseMap.size());
        Assert.assertTrue(baseMap.size() >= xhtmlMap.size());
    }

    @Test
    public void isNamedEntity_givenKnownEntity_shouldReturnTrue() {
        Assert.assertTrue(Entities.isNamedEntity("lt"));
        Assert.assertTrue(Entities.isNamedEntity("gt"));
        Assert.assertTrue(Entities.isNamedEntity("amp"));
        Assert.assertTrue(Entities.isNamedEntity("quot"));
        Assert.assertTrue(Entities.isNamedEntity("copy"));
        Assert.assertTrue(Entities.isNamedEntity("nbsp"));
    }

    @Test
    public void isNamedEntity_givenUnknownEntity_shouldReturnFalse() {
        Assert.assertFalse(Entities.isNamedEntity("unknownEntityXYZ"));
        Assert.assertFalse(Entities.isNamedEntity(""));
    }

    @Test
    public void isBaseNamedEntity_givenBaseEntity_shouldReturnTrue() {
        Assert.assertTrue(Entities.isBaseNamedEntity("lt"));
        Assert.assertTrue(Entities.isBaseNamedEntity("gt"));
        Assert.assertTrue(Entities.isBaseNamedEntity("amp"));
        Assert.assertTrue(Entities.isBaseNamedEntity("quot"));
    }

    @Test
    public void isBaseNamedEntity_givenNonBaseEntity_shouldReturnFalse() {
        Assert.assertFalse(Entities.isBaseNamedEntity("unknownBaseEntity123"));
        Assert.assertFalse(Entities.isBaseNamedEntity(""));
    }

    @Test
    public void getCharacterByName_givenKnownEntity_shouldReturnCharacter() {
        Assert.assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
        Assert.assertEquals(Character.valueOf('>'), Entities.getCharacterByName("gt"));
        Assert.assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        Assert.assertEquals(Character.valueOf('"'), Entities.getCharacterByName("quot"));
    }

    @Test
    public void getCharacterByName_givenUnknownEntity_shouldReturnNull() {
        Assert.assertNull(Entities.getCharacterByName("invalidNamedEntity"));
    }

    @Test
    public void escape_givenAsciiSpecialCharsNotInAttribute_shouldEscapeReservedCharacters() {
        outputSettings.charset(Charset.forName("UTF-8"));
        outputSettings.escapeMode(Entities.EscapeMode.base);

        String input = "& < > \"";
        String escaped = Entities.escape(input, outputSettings);

        Assert.assertEquals("&amp; &lt; &gt; \"", escaped);
    }

    @Test
    public void escape_givenAsciiSpecialCharsInAttribute_shouldEscapeQuotesAndPreserveAngleBrackets() {
        outputSettings.charset(Charset.forName("UTF-8"));
        outputSettings.escapeMode(Entities.EscapeMode.base);

        StringBuilder accum = new StringBuilder();
        String input = "& < > \"";
        Entities.escape(accum, input, outputSettings, true, false, false);

        Assert.assertEquals("&amp; < > &quot;", accum.toString());
    }

    @Test
    public void escape_givenNbspWithNonXhtmlMode_shouldEscapeToEntity() {
        outputSettings.charset(Charset.forName("UTF-8"));
        outputSettings.escapeMode(Entities.EscapeMode.base);

        String input = "Hello\u00A0World";
        String escaped = Entities.escape(input, outputSettings);

        Assert.assertEquals("Hello&nbsp;World", escaped);
    }

    @Test
    public void escape_givenNbspWithXhtmlMode_shouldPreserveRawCharacter() {
        outputSettings.charset(Charset.forName("UTF-8"));
        outputSettings.escapeMode(Entities.EscapeMode.xhtml);

        String input = "Hello\u00A0World";
        String escaped = Entities.escape(input, outputSettings);

        Assert.assertEquals("Hello\u00A0World", escaped);
    }

    @Test
    public void escape_givenAsciiCharsetWithNamedEntity_shouldEscapeUsingEntityName() {
        outputSettings.charset(Charset.forName("US-ASCII"));
        outputSettings.escapeMode(Entities.EscapeMode.base);

        String input = "\u00A9"; // copyright symbol
        String escaped = Entities.escape(input, outputSettings);

        Assert.assertEquals("&copy;", escaped);
    }

    @Test
    public void escape_givenAsciiCharsetWithoutNamedEntity_shouldEscapeToHex() {
        outputSettings.charset(Charset.forName("US-ASCII"));
        outputSettings.escapeMode(Entities.EscapeMode.xhtml);

        String input = "\u4E2D"; // Chinese character 'Zhong' (not in xhtml entities)
        String escaped = Entities.escape(input, outputSettings);

        Assert.assertEquals("&#x4e2d;", escaped);
    }

    @Test
    public void escape_givenFallbackCharsetWithUnencodableChar_shouldEscapeToHexOrEntity() {
        outputSettings.charset(Charset.forName("ISO-8859-1"));
        outputSettings.escapeMode(Entities.EscapeMode.base);

        String input = "\u4E2D"; // cannot be encoded by ISO-8859-1 and not in base map
        String escaped = Entities.escape(input, outputSettings);

        Assert.assertEquals("&#x4e2d;", escaped);
    }

    @Test
    public void escape_givenFallbackCharsetWithEncodableChar_shouldRetainCharacter() {
        outputSettings.charset(Charset.forName("ISO-8859-1"));
        outputSettings.escapeMode(Entities.EscapeMode.base);

        String input = "\u00E9"; // 'é', encodable by ISO-8859-1
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, input, outputSettings, false, false, false);

        Assert.assertEquals("\u00E9", accum.toString());
    }

    @Test
    public void escape_givenUtfCharset_shouldPreserveStandardUnicodeChars() {
        outputSettings.charset(Charset.forName("UTF-8"));
        outputSettings.escapeMode(Entities.EscapeMode.base);

        String input = "\u4E2D\u6587";
        String escaped = Entities.escape(input, outputSettings);

        Assert.assertEquals("\u4E2D\u6587", escaped);
    }

    @Test
    public void escape_givenSupplementaryCharactersWithUtfEncoder_shouldOutputDirectly() {
        outputSettings.charset(Charset.forName("UTF-8"));
        outputSettings.escapeMode(Entities.EscapeMode.base);

        String input = "\uD83D\uDCA9"; // code point 0x1F4A9
        String escaped = Entities.escape(input, outputSettings);

        Assert.assertEquals("\uD83D\uDCA9", escaped);
    }

    @Test
    public void escape_givenSupplementaryCharactersWithAsciiEncoder_shouldEscapeToHex() {
        outputSettings.charset(Charset.forName("US-ASCII"));
        outputSettings.escapeMode(Entities.EscapeMode.base);

        String input = "\uD83D\uDCA9"; // code point 0x1F4A9
        String escaped = Entities.escape(input, outputSettings);

        Assert.assertEquals("&#x1f4a9;", escaped);
    }

    @Test
    public void escape_givenWhitespaceNormalisationAndStripLeadingWhite_shouldTrimAndCollapse() {
        outputSettings.charset(Charset.forName("UTF-8"));

        StringBuilder accum = new StringBuilder();
        String input = "   Hello    World   ";
        Entities.escape(accum, input, outputSettings, false, true, true);

        Assert.assertEquals("Hello World ", accum.toString());
    }

    @Test
    public void escape_givenWhitespaceNormalisationWithoutStripLeadingWhite_shouldCollapseWithoutTrim() {
        outputSettings.charset(Charset.forName("UTF-8"));

        StringBuilder accum = new StringBuilder();
        String input = "   Hello    World   ";
        Entities.escape(accum, input, outputSettings, false, true, false);

        Assert.assertEquals(" Hello World ", accum.toString());
    }

    @Test
    public void escape_givenWhitespaceNormalisationOnOnlyWhitespace_shouldCollapseCorrectly() {
        outputSettings.charset(Charset.forName("UTF-8"));

        StringBuilder accum = new StringBuilder();
        String input = "     ";
        Entities.escape(accum, input, outputSettings, false, true, true);
        Assert.assertEquals("", accum.toString());

        accum = new StringBuilder();
        Entities.escape(accum, input, outputSettings, false, true, false);
        Assert.assertEquals(" ", accum.toString());
    }

    @Test
    public void escape_givenEmptyString_shouldReturnEmptyString() {
        outputSettings.charset(Charset.forName("UTF-8"));
        String escaped = Entities.escape("", outputSettings);
        Assert.assertEquals("", escaped);
    }

    @Test
    public void unescape_givenEscapedEntities_shouldDecodeToOriginalChars() {
        String input = "&lt;hello &amp; world&gt; &quot;&nbsp;";
        String unescaped = Entities.unescape(input);

        Assert.assertEquals("<hello & world> \"\u00A0", unescaped);
    }

    @Test
    public void unescape_givenStrictParameter_shouldObeyStrictness() {
        String inputStrict = "&amp; &quot;";
        String unescapedStrict = Entities.unescape(inputStrict, true);
        Assert.assertEquals("& \"", unescapedStrict);

        String inputLoose = "&amp";
        String unescapedStrictFalse = Entities.unescape(inputLoose, false);
        Assert.assertEquals("&", unescapedStrictFalse);
    }
}