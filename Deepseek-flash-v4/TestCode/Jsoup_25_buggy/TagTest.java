package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TagTest {

    @Test
    public void testValueOfKnownTagReturnsRegisteredTag() {
        Tag p = Tag.valueOf("p");
        assertNotNull(p);
        assertEquals("p", p.getName());
        assertTrue(p.isKnownTag());
        assertTrue(p.isBlock());
        assertFalse(p.formatAsBlock());
        assertTrue(p.canContainBlock());
        assertFalse(p.isEmpty());
        assertFalse(p.isSelfClosing());
        assertFalse(p.isData());
        assertFalse(p.preserveWhitespace());
    }

    @Test
    public void testValueOfUnknownTagReturnsGenericTag() {
        Tag unknown = Tag.valueOf("myTag");
        assertNotNull(unknown);
        assertEquals("mytag", unknown.getName());
        assertFalse(unknown.isKnownTag());
        assertFalse(unknown.isBlock());
        assertTrue(unknown.canContainBlock());
        assertTrue(unknown.formatAsBlock());
        assertTrue(unknown.canContainInline());
        assertFalse(unknown.isEmpty());
        assertFalse(unknown.isSelfClosing());
        assertFalse(unknown.isData());
        assertFalse(unknown.preserveWhitespace());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfNullThrowsException() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfEmptyStringThrowsException() {
        Tag.valueOf("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfBlankStringThrowsException() {
        Tag.valueOf("   ");
    }

    @Test
    public void testValueOfTrimsWhitespaceAndLowercases() {
        Tag p = Tag.valueOf("  P  ");
        assertEquals("p", p.getName());
        assertTrue(p.isKnownTag());
    }

    @Test
    public void testValueOfUnknownWithWhitespace() {
        Tag t = Tag.valueOf("  MyTag ");
        assertEquals("mytag", t.getName());
        assertFalse(t.isKnownTag());
    }

    @Test
    public void testInlineTagProperties() {
        Tag span = Tag.valueOf("span");
        assertFalse(span.isBlock());
        assertTrue(span.isInline());
        assertFalse(span.canContainBlock());
        assertFalse(span.formatAsBlock());
        assertFalse(span.isEmpty());
        assertFalse(span.isSelfClosing());
        assertTrue(span.canContainInline());
        assertTrue(span.isKnownTag());
    }

    @Test
    public void testEmptyTagProperties() {
        Tag img = Tag.valueOf("img");
        assertTrue(img.isEmpty());
        assertTrue(img.isSelfClosing());
        assertFalse(img.canContainBlock());
        assertFalse(img.canContainInline());
        assertFalse(img.isData());
    }

    @Test
    public void testPreserveWhitespaceTag() {
        Tag pre = Tag.valueOf("pre");
        assertTrue(pre.preserveWhitespace());
    }

    @Test
    public void testSetSelfClosing() {
        Tag p = Tag.valueOf("p");
        assertFalse(p.isSelfClosing());
        p.setSelfClosing();
        assertTrue(p.isSelfClosing());
    }

    @Test
    public void testIsKnownTagStatic() {
        assertTrue(Tag.isKnownTag("p"));
        assertFalse(Tag.isKnownTag("P"));
        assertFalse(Tag.isKnownTag("unknown"));
    }

    @Test
    public void testIsKnownTagInstance() {
        Tag p = Tag.valueOf("p");
        assertTrue(p.isKnownTag());
        Tag unknown = Tag.valueOf("custom");
        assertFalse(unknown.isKnownTag());
    }

    @Test
    public void testFormatAsBlock() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.formatAsBlock());
        Tag p = Tag.valueOf("p");
        assertFalse(p.formatAsBlock());
        Tag span = Tag.valueOf("span");
        assertFalse(span.formatAsBlock());
    }

    @Test
    public void testCanContainBlock() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.canContainBlock());
        Tag span = Tag.valueOf("span");
        assertFalse(span.canContainBlock());
        Tag img = Tag.valueOf("img");
        assertFalse(img.canContainBlock());
    }

    @Test
    public void testEquals() {
        Tag p1 = Tag.valueOf("p");
        Tag p2 = Tag.valueOf("p");
        assertEquals(p1, p2);
        assertSame(p1, p2);

        Tag unknown1 = Tag.valueOf("foo");
        Tag unknown2 = Tag.valueOf("foo");
        assertEquals(unknown1, unknown2);
        assertNotSame(unknown1, unknown2);

        Tag p3 = Tag.valueOf("p");
        Tag div = Tag.valueOf("div");
        assertFalse(p3.equals(div));

        assertFalse(p3.equals(null));
        assertFalse(p3.equals("p"));
    }

    @Test
    public void testHashCode() {
        Tag p1 = Tag.valueOf("p");
        Tag p2 = Tag.valueOf("p");
        assertEquals(p1.hashCode(), p2.hashCode());

        Tag unknown1 = Tag.valueOf("foo");
        Tag unknown2 = Tag.valueOf("foo");
        assertEquals(unknown1.hashCode(), unknown2.hashCode());
    }

    @Test
    public void testToString() {
        Tag p = Tag.valueOf("p");
        assertEquals("p", p.toString());
        Tag unknown = Tag.valueOf("custom");
        assertEquals("custom", unknown.toString());
    }
}