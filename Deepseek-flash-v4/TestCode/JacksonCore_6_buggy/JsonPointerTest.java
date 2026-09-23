package com.fasterxml.jackson.core;

import static org.junit.Assert.*;

import org.junit.Test;

public class JsonPointerTest {

    @Test
    public void testCompileEmptyString() {
        JsonPointer ptr = JsonPointer.compile("");
        assertNotNull(ptr);
        assertTrue(ptr.matches());
        assertEquals("", ptr.toString());
        assertEquals("", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testCompileNull() {
        JsonPointer ptr = JsonPointer.compile(null);
        assertNotNull(ptr);
        assertTrue(ptr.matches());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompileInvalidNoLeadingSlash() {
        JsonPointer.compile("foo");
    }

    @Test
    public void testCompileSingleSegment() {
        JsonPointer ptr = JsonPointer.compile("/foo");
        assertFalse(ptr.matches());
        assertEquals("foo", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.tail().matches());
        assertEquals("/foo", ptr.toString());
    }

    @Test
    public void testCompileNumericSegment() {
        JsonPointer ptr = JsonPointer.compile("/123");
        assertEquals(123, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchElement());
        assertFalse(ptr.mayMatchProperty());
    }

    @Test
    public void testCompileEmptySegment() {
        JsonPointer ptr = JsonPointer.compile("/");
        assertFalse(ptr.matches());
        assertEquals("", ptr.getMatchingProperty());
        assertTrue(ptr.tail().matches());
    }

    @Test
    public void testCompileEscapedTilde0() {
        JsonPointer ptr = JsonPointer.compile("/~0");
        assertEquals("~", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testCompileEscapedTilde1() {
        JsonPointer ptr = JsonPointer.compile("/~1");
        assertEquals("/", ptr.getMatchingProperty());
    }

    @Test
    public void testCompileInvalidEscape() {
        JsonPointer ptr = JsonPointer.compile("/~2");
        assertEquals("~2", ptr.getMatchingProperty());
    }

    @Test
    public void testCompileEscapedInMiddle() {
        JsonPointer ptr = JsonPointer.compile("/a~0b");
        assertEquals("a~b", ptr.getMatchingProperty());
    }

    @Test
    public void testCompileMultipleSegments() {
        JsonPointer ptr = JsonPointer.compile("/foo/bar");
        assertFalse(ptr.matches());
        assertEquals("foo", ptr.getMatchingProperty());
        JsonPointer tail = ptr.tail();
        assertEquals("bar", tail.getMatchingProperty());
        assertTrue(tail.tail().matches());
    }

    @Test
    public void testValueOfAlias() {
        JsonPointer ptr = JsonPointer.valueOf("/val");
        assertEquals("val", ptr.getMatchingProperty());
    }

    @Test
    public void testGetMatchingIndexBoundary() {
        assertEquals(-1, JsonPointer.compile("/").getMatchingIndex());
        assertEquals(0, JsonPointer.compile("/0").getMatchingIndex());
        assertEquals(2147483647, JsonPointer.compile("/2147483647").getMatchingIndex());
        assertEquals(-1, JsonPointer.compile("/2147483648").getMatchingIndex());
        assertEquals(-1, JsonPointer.compile("/12345678901").getMatchingIndex());
        assertEquals(-1, JsonPointer.compile("/01").getMatchingIndex());
    }

    @Test
    public void testMatchElement() {
        JsonPointer ptr = JsonPointer.compile("/5");
        assertNotNull(ptr.matchElement(5));
        assertNull(ptr.matchElement(4));
        assertNull(ptr.matchElement(-1));
    }

    @Test
    public void testMatchProperty() {
        JsonPointer ptr = JsonPointer.compile("/foo");
        assertNotNull(ptr.matchProperty("foo"));
        assertNull(ptr.matchProperty("bar"));
        assertNull(ptr.tail().matchProperty("foo"));
    }

    @Test
    public void testMatches() {
        assertTrue(JsonPointer.compile("").matches());
        assertFalse(JsonPointer.compile("/a").matches());
    }

    @Test
    public void testEquals() {
        assertEquals(JsonPointer.compile("/a"), JsonPointer.compile("/a"));
        assertNotEquals(JsonPointer.compile("/a"), JsonPointer.compile("/b"));
        assertNotEquals(JsonPointer.compile("/a"), null);
        assertNotEquals(JsonPointer.compile("/a"), "not pointer");
        assertNotEquals(JsonPointer.compile("/a"), new Object());
        assertSame(JsonPointer.compile("/a"), JsonPointer.compile("/a"));
    }

    @Test
    public void testHashCode() {
        assertEquals(JsonPointer.compile("/a").hashCode(), JsonPointer.compile("/a").hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("/a/b", JsonPointer.compile("/a/b").toString());
        assertEquals("", JsonPointer.compile("").toString());
    }

    @Test
    public void testMayMatchMethods() {
        JsonPointer prop = JsonPointer.compile("/foo");
        assertTrue(prop.mayMatchProperty());
        assertFalse(prop.mayMatchElement());

        JsonPointer elem = JsonPointer.compile("/1");
        assertTrue(elem.mayMatchElement());
        assertFalse(elem.mayMatchProperty());
    }

    @Test
    public void testTail() {
        JsonPointer ptr = JsonPointer.compile("/a/b/c");
        assertEquals("b", ptr.tail().getMatchingProperty());
        assertEquals("c", ptr.tail().tail().getMatchingProperty());
        assertTrue(ptr.tail().tail().tail().matches());
    }

    @Test
    public void testParseQuotedTailEscapeSlashAtEnd() {
        JsonPointer ptr = JsonPointer.compile("/~1");
        assertEquals("/", ptr.getMatchingProperty());
    }

    @Test
    public void testParseIndexSuperLongString() {
        JsonPointer ptr = JsonPointer.compile("/9999999999");
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testParseIndexEmptyString() {
        JsonPointer ptr = JsonPointer.compile("/");
        assertEquals(-1, ptr.getMatchingIndex());
    }
}