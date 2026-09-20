package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParseSettingsTest {

    @Test
    public void testHtmlDefaultStaticInstance() {
        assertFalse(ParseSettings.htmlDefault.preserveTagCase());
        assertEquals("div", ParseSettings.htmlDefault.normalizeTag("DIV"));
        assertEquals("id", ParseSettings.htmlDefault.normalizeAttribute("ID"));
    }

    @Test
    public void testPreserveCaseStaticInstance() {
        assertTrue(ParseSettings.preserveCase.preserveTagCase());
        assertEquals("DIV", ParseSettings.preserveCase.normalizeTag("DIV"));
        assertEquals("ID", ParseSettings.preserveCase.normalizeAttribute("ID"));
    }

    @Test
    public void testConstructorBothTrue() {
        ParseSettings settings = new ParseSettings(true, true);
        assertTrue(settings.preserveTagCase());
        assertEquals("MyTag", settings.normalizeTag("MyTag"));
        assertEquals("MyAttr", settings.normalizeAttribute("MyAttr"));
    }

    @Test
    public void testConstructorBothFalse() {
        ParseSettings settings = new ParseSettings(false, false);
        assertFalse(settings.preserveTagCase());
        assertEquals("mytag", settings.normalizeTag("MyTag"));
        assertEquals("myattr", settings.normalizeAttribute("MyAttr"));
    }

    @Test
    public void testConstructorTagTrueAttributeFalse() {
        ParseSettings settings = new ParseSettings(true, false);
        assertTrue(settings.preserveTagCase());
        assertEquals("MyTag", settings.normalizeTag("MyTag"));
        assertEquals("myattr", settings.normalizeAttribute("MyAttr"));
    }

    @Test
    public void testConstructorTagFalseAttributeTrue() {
        ParseSettings settings = new ParseSettings(false, true);
        assertFalse(settings.preserveTagCase());
        assertEquals("mytag", settings.normalizeTag("MyTag"));
        assertEquals("MyAttr", settings.normalizeAttribute("MyAttr"));
    }

    @Test
    public void testNormalizeTagTrimsWhitespace() {
        ParseSettings settings = new ParseSettings(true, true);
        assertEquals("div", settings.normalizeTag("  div  "));
    }

    @Test
    public void testNormalizeAttributeTrimsWhitespace() {
        ParseSettings settings = new ParseSettings(true, true);
        assertEquals("id", settings.normalizeAttribute("  id  "));
    }

    @Test
    public void testNormalizeTagWithLowerCasePreserveFalse() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("span", settings.normalizeTag("  SPAN  "));
    }

    @Test
    public void testNormalizeAttributeWithLowerCasePreserveFalse() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("class", settings.normalizeAttribute("  CLASS  "));
    }

    @Test
    public void testNormalizeTagEmptyString() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("", settings.normalizeTag(""));
    }

    @Test
    public void testNormalizeAttributeEmptyString() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("", settings.normalizeAttribute(""));
    }

    @Test
    public void testNormalizeTagOnlyWhitespace() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("", settings.normalizeTag("   "));
    }

    @Test
    public void testNormalizeAttributeOnlyWhitespace() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("", settings.normalizeAttribute("   "));
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeTagNullThrowsException() {
        ParseSettings settings = new ParseSettings(false, false);
        settings.normalizeTag(null);
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeAttributeNullThrowsException() {
        ParseSettings settings = new ParseSettings(false, false);
        settings.normalizeAttribute(null);
    }

    @Test
    public void testNormalizeAttributesWithPreserveAttributeCaseFalse() {
        ParseSettings settings = new ParseSettings(false, false);
        Attributes attributes = new Attributes();
        attributes.put("ID", "value1");
        attributes.put("CLASS", "value2");

        Attributes result = settings.normalizeAttributes(attributes);

        assertNotNull(result);
        assertEquals("value1", result.get("id"));
        assertEquals("value2", result.get("class"));
    }

    @Test
    public void testNormalizeAttributesWithPreserveAttributeCaseTrue() {
        ParseSettings settings = new ParseSettings(false, true);
        Attributes attributes = new Attributes();
        attributes.put("ID", "value1");
        attributes.put("CLASS", "value2");

        Attributes result = settings.normalizeAttributes(attributes);

        assertNotNull(result);
        assertEquals("value1", result.get("ID"));
        assertEquals("value2", result.get("CLASS"));
        assertSame(attributes, result);
    }

    @Test
    public void testNormalizeAttributesReturnsSameInstance() {
        ParseSettings settings = new ParseSettings(true, true);
        Attributes attributes = new Attributes();
        attributes.put("data-test", "value");

        Attributes result = settings.normalizeAttributes(attributes);

        assertSame(attributes, result);
    }

    @Test
    public void testNormalizeAttributesEmptyAttributes() {
        ParseSettings settings = new ParseSettings(false, false);
        Attributes attributes = new Attributes();

        Attributes result = settings.normalizeAttributes(attributes);

        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void testPreserveTagCaseGetterTrue() {
        ParseSettings settings = new ParseSettings(true, false);
        assertTrue(settings.preserveTagCase());
    }

    @Test
    public void testPreserveTagCaseGetterFalse() {
        ParseSettings settings = new ParseSettings(false, false);
        assertFalse(settings.preserveTagCase());
    }

    @Test
    public void testMultipleAttributesNormalization() {
        ParseSettings settings = new