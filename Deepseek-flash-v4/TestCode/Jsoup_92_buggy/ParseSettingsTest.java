package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ParseSettingsTest {

    @Test
    public void testHtmlDefaultNormalizesTagAndAttribute() {
        ParseSettings settings = ParseSettings.htmlDefault;
        assertFalse(settings.preserveTagCase());
        assertEquals("div", settings.normalizeTag("Div"));
        assertEquals("div", settings.normalizeTag("  Div  "));
        assertEquals("class", settings.normalizeAttribute("CLASS"));
    }

    @Test
    public void testPreserveCasePreservesTagAndAttributeCase() {
        ParseSettings settings = ParseSettings.preserveCase;
        assertTrue(settings.preserveTagCase());
        assertEquals("Div", settings.normalizeTag(" Div "));
        assertEquals("CLASS", settings.normalizeAttribute(" CLASS "));
    }

    @Test
    public void testCustomSettingsRespectFlags() {
        ParseSettings lowerTagPreserveAttr = new ParseSettings(false, true);
        assertEquals("span", lowerTagPreserveAttr.normalizeTag("SPAN"));
        assertEquals("DATA-X", lowerTagPreserveAttr.normalizeAttribute(" DATA-X "));

        ParseSettings preserveTagLowerAttr = new ParseSettings(true, false);
        assertEquals("SPAN", preserveTagLowerAttr.normalizeTag(" SPAN "));
        assertEquals("href", preserveTagLowerAttr.normalizeAttribute(" HREF "));
    }

    @Test
    public void testNormalizeTrimsToEmptyString() {
        ParseSettings preserveCase = ParseSettings.preserveCase;
        assertEquals("", preserveCase.normalizeTag("   "));
        assertEquals("", preserveCase.normalizeAttribute("   "));
        assertEquals("", ParseSettings.htmlDefault.normalizeTag(""));
        assertEquals("", ParseSettings.htmlDefault.normalizeAttribute(""));
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeTagNullThrowsNullPointerException() {
        ParseSettings.htmlDefault.normalizeTag(null);
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeAttributeNullThrowsNullPointerException() {
        ParseSettings.htmlDefault.normalizeAttribute(null);
    }

    @Test
    public void testNormalizeAttributesDefaultNormalizesKeys() {
        Attributes attributes = new Attributes();
        attributes.put("CLASS", "button");
        Attributes result = ParseSettings.htmlDefault.normalizeAttributes(attributes);
        assertSame(attributes, result);
        assertEquals("button", result.get("class"));
    }

    @Test
    public void testNormalizeAttributesPreserveCaseKeepsKeys() {
        Attributes attributes = new Attributes();
        attributes.put("CLASS", "button");
        Attributes result = ParseSettings.preserveCase.normalizeAttributes(attributes);
        assertSame(attributes, result);
        assertEquals("button", result.get("CLASS"));
        assertNull(result.get("class"));
    }

    @Test
    public void testNormalizeAttributesPreserveCaseAllowsNull() {
        assertNull(ParseSettings.preserveCase.normalizeAttributes(null));
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeAttributesDefaultNullThrowsNullPointerException() {
        ParseSettings.htmlDefault.normalizeAttributes(null);
    }
}