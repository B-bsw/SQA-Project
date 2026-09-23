package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class EntitiesTest {

    @Test
    public void escape_givenStandardString_shouldEscapeReservedCharacters() {
        String input = "<foo & "bar">";
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset(Charset.forName("UTF-8"));
        settings.escapeMode(Entities.EscapeMode.base);

        String result = Entities.escape(input, settings);

        Assert.assertTrue(result.contains("&lt;"));
        Assert.assertTrue(result.contains("&gt;"));
        Assert.assertTrue(result.contains("&amp;"));
        Assert.assertTrue(result.contains("&quot;"));
    }

    @Test
    public void escape_givenEmptyString_shouldReturnEmptyString() {
        String input = "";
        Document.OutputSettings settings = new Document.OutputSettings();

        String result = Entities.escape(input, settings);

        Assert.assertEquals("", result);
    }

    @Test
    public void escape_givenPlainText_shouldReturnUnmodified() {
        String input = "Hello World 123";
        Document.OutputSettings settings = new Document.OutputSettings();

        String result = Entities.escape(input, settings);

        Assert.assertEquals("Hello World 123", result);
    }

    @Test
    public void escape_withExtendedMode_shouldEscapeSpecialCharacters() {
        String input = "© ®";
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset(Charset.forName("US-ASCII"));
        settings.escapeMode(Entities.EscapeMode.extended);

        String result = Entities.escape(input, settings);

        Assert.assertNotNull(result);
    }

    @Test
    public void escape_withEncoderDirectly_shouldEscapeProperly() {
        String input = "<a>&</a>";
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();

        String result = Entities.escape(input, encoder, Entities.EscapeMode.base);

        Assert.assertEquals("&lt;a&gt;&amp;&lt;/a&gt;", result);
    }

    @Test
    public void unescape_givenNamedEntities_shouldUnescapeToCharacters() {
        String input = "&lt;&gt;&amp;&quot;&apos;";

        String result = Entities.unescape(input);

        Assert.assertTrue(result.contains("<"));
        Assert.assertTrue(result.contains(">"));
        Assert.assertTrue(result.contains("&"));
        Assert.assertTrue(result.contains("""));
    }

    @Test
    public void unescape_givenDecimalEntity_shouldUnescapeToCharacter() {
        String input = "&#65;&#66;&#67;";

        String result = Entities.unescape(input);

        Assert.assertEquals("ABC", result);
    }

    @Test
    public void unescape_givenHexEntity_shouldUnescapeToCharacter() {
        String input = "&#x41;&#X42;&#x43;";

        String result = Entities.unescape(input);

        Assert.assertEquals("ABC", result);
    }

    @Test
    public void unescape_givenNoEntities_shouldReturnSameString() {
        String input = "Simple text without any ampersand";

        String result = Entities.unescape(input);

        Assert.assertEquals(input, result);
    }

    @Test
    public void unescape_givenInvalidEntity_shouldNotThrowException() {
        String input = "&invalidEntityName123;";

        String result = Entities.unescape(input);

        Assert.assertNotNull(result);
    }

    @Test
    public void escapeMode_values_shouldContainExpectedEnums() {
        Entities.EscapeMode[] modes = Entities.EscapeMode.values();

        Assert.assertNotNull(modes);
        Assert.assertTrue(modes.length >= 2);
        Assert.assertEquals(Entities.EscapeMode.base, Entities.EscapeMode.valueOf("base"));
        Assert.assertEquals(Entities.EscapeMode.extended, Entities.EscapeMode.valueOf("extended"));
    }
}
