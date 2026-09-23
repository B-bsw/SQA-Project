package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TagTest {

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfNull() {
        Tag.valueOf(null, ParseSettings.preserveCase);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfEmpty() {
        Tag.valueOf("", ParseSettings.preserveCase);
    }

    @Test
    public void testValueOfKnownBlock() {
        Tag tag = Tag.valueOf("div", ParseSettings.preserveCase);
        assertTrue(tag.isBlock());
        assertTrue(tag.formatAsBlock());
        assertFalse(tag.isEmpty());
        assertFalse(tag.isSelfClosing());
        assertTrue(tag.isKnownTag());
        assertEquals("div", tag.getName());
    }

    @Test
    public void testValueOfKnownInline() {
        Tag tag = Tag.valueOf("span", ParseSettings.preserveCase);
        assertFalse(tag.isBlock());
        assertTrue(tag.isInline());
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void testValueOfEmptyTag() {
        Tag tag = Tag.valueOf("br", ParseSettings.preserveCase);
        assertTrue(tag.isEmpty());
        assertTrue(tag.isSelfClosing());
        assertFalse(tag.canContainInline());
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void testValueOfPreserveWhitespace() {
        Tag tag = Tag.valueOf("pre", ParseSettings.preserveCase);
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void testValueOfFormListed() {
        Tag tag = Tag.valueOf("input", ParseSettings.preserveCase);
        assertTrue(tag.isFormListed());
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void testValueOfUnknown() {
        Tag tag = Tag.valueOf("foo", ParseSettings.preserveCase);
        assertFalse(tag.isBlock());
        assertFalse(tag.isKnownTag());
        assertEquals("foo", tag.getName());
        assertFalse(tag.isEmpty());
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void testIsKnownTagStatic() {
        assertTrue(Tag.isKnownTag("div"));
        assertFalse(Tag.isKnownTag("unknown"));
    }

    @Test
    public void testEqualsAndHashCode() {
        Tag tag1 = Tag.valueOf("p", ParseSettings.preserveCase);
        Tag tag2 = Tag.valueOf("p", ParseSettings.preserveCase);
        assertEquals(tag1, tag2);
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

    @Test
    public void testNotEquals() {
        Tag tag1 = Tag.valueOf("p", ParseSettings.preserveCase);
        Tag tag2 = Tag.valueOf("div", ParseSettings.preserveCase);
        assertFalse(tag1.equals(tag2));
    }

    @Test
    public void testSetSelfClosing() {
        Tag tag = Tag.valueOf("div", ParseSettings.preserveCase);
        assertFalse(tag.isselfClosing()); // not empty, default selfClosing false
        tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
        assertFalse(tag.isEmpty()); // still not empty
    }

    @Test
    public void testToString() {
        Tag tag = Tag.valueOf("div", ParseSettings.preserveCase);
        assertEquals("div", tag.toString());
    }

    @Test
    public void testCaseSensitivityPreserve() {
        Tag tagUpper = Tag.valueOf("DIV", ParseSettings.preserveCase);
        assertEquals("DIV", tagUpper.getName());
        Tag tagLower = Tag.valueOf("div", ParseSettings.preserveCase);
        assertNotEquals(tagUpper.getName(), tagLower.getName());
        assertFalse(tagUpper.equals(tagLower));
    }

    @Test
    public void testCaseSensitivityHtmlDefault() {
        Tag tag = Tag.valueOf("DIV", ParseSettings.htmlDefault);
        assertEquals("div", tag.getName());
        // Should be the same instance as the registered "div" tag
        Tag knownDiv = Tag.valueOf("div", ParseSettings.htmlDefault);
        assertSame(tag, knownDiv);
    }

    @Test
    public void testIsDataForScriptTag() {
        // script is in blockTags, not empty, canContainInline unchanged (true)
        Tag tag = Tag.valueOf("script", ParseSettings.preserveCase);
        assertFalse(tag.isData()); // !canContainInline && !isEmpty -> false
    }

    @Test
    public void testCanContainBlockForInline() {
        Tag tag = Tag.valueOf("span", ParseSettings.preserveCase);
        assertFalse(tag.canContainBlock()); // same as isBlock for inline
    }

    @Test
    public void testFormatAsBlockForFormatAsInlineTags() {
        // "a" is in formatAsInlineTags
        Tag tag = Tag.valueOf("a", ParseSettings.preserveCase);
        assertTrue(tag.isInline()); // a is inline
        assertFalse(tag.formatAsBlock()); // overridden in static initializer
    }

    @Test
    public void testPreserveWhitespaceForPre() {
        Tag tag = Tag.valueOf("pre", ParseSettings.preserveCase);
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void testFormSubmitForInput() {
        Tag tag = Tag.valueOf("input", ParseSettings.preserveCase);
        assertTrue(tag.isFormSubmittable());
    }
}