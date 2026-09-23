package com.fasterxml.jackson.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class JsonPointerTest {

    // --- Constructor/Factory: tests for compile() ---
    @Test
    public void testCompileEmptyOrNull() {
        JsonPointer p1 = JsonPointer.compile("");   // empty string
        JsonPointer p2 = JsonPointer.compile(null); // null input
        assertNotNull(p1);
        assertNotNull(p2);
        assertTrue("empty pointer should match()", p1.matches());
        assertTrue("null pointer should be same as EMPTY", p1.equals(p2)); // both empty
        assertEquals("empty pointer toString should be empty", "", p1.toString());
    }

    @Test
    public void testCompileInvalidNoLeadingSlash() {
        // no leading slash -> IllegalArgumentException
        try {
            JsonPointer.compile("abc");
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCompileSingleSegment() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertNotNull(p);
        assertFalse("should not match (has segment)", p.matches());
        assertEquals("matching property should be 'foo'", "foo", p.getMatchingProperty());
        assertEquals("matching element index should be -1 (not array)", -1, p.getMatchingIndex());
        // tail of single segment should be EMPTY
        JsonPointer tail = p.tail();
        assertNotNull(tail);
        assertTrue("tail of single segment should match()", tail.matches());
    }

    @Test
    public void testCompileMultipleSegments() {
        JsonPointer p = JsonPointer.compile("/a/b/c");
        assertFalse(p.matches());
        assertEquals("a", p.getMatchingProperty());
        // tail at "b"
        JsonPointer p2 = p.tail();
        assertNotNull(p2);
        assertEquals("b", p2.getMatchingProperty());
        // tail at "c"
        JsonPointer p3 = p2.tail();
        assertNotNull(p3);
        assertEquals("c", p3.getMatchingProperty());
        assertTrue(p3.tail().matches()); // after "c" is empty
    }

    @Test
    public void testCompileWithQuotingTilde() {
        // tilde handling: "~0" -> '~', "~1" -> '/'
        JsonPointer p = JsonPointer.compile("/a~0b");  // "a~b"
        assertNotNull(p);
        assertEquals("a~b", p.getMatchingProperty());
    }

    @Test
    public void testCompileWithSlashEscape() {
        // "~1" becomes '/'
        JsonPointer p = JsonPointer.compile("/a~1b");  // "a/b"
        assertNotNull(p);
        assertEquals("a/b", p.getMatchingProperty());
    }

    // --- matchProperty / matchElement ---
    @Test
    public void testMatchProperty() {
        JsonPointer p = JsonPointer.compile("/foo/bar");

        // root of pointer; matchProperty("foo") -> segment "bar"
        JsonPointer sub = p.matchProperty("foo");
        assertNotNull(sub);
        assertEquals("bar", sub.getMatchingProperty());

        // mismatch property
        assertNull("matching non-matching property should return null", p.matchProperty("baz"));

        // on empty pointer, matchProperty should return null (no next segment)
        JsonPointer empty = JsonPointer.compile("");
        assertNull(empty.matchProperty("anything"));
    }

    @Test
    public void testMatchElement() {
        JsonPointer p = JsonPointer.compile("/100");  // array index 100
        assertTrue(p.mayMatchElement());
        assertEquals(100, p.getMatchingIndex());

        // matching element index
        JsonPointer sub = p.matchElement(100);
        assertNotNull("matching element with correct index should return next segment", sub);
        assertNull("wrong index should return null", p.matchElement(99));
        assertNull("negative index should return null", p.matchElement(-1));

        // mayMatchElement for non-array pointers
        JsonPointer q = JsonPointer.compile("/abc");
        assertFalse(q.mayMatchElement());
        assertEquals(-1, q.getMatchingIndex());
    }

    @Test
    public void testMayMatchPropertyAndElementCombined() {
        JsonPointer p = JsonPointer.compile("/foo1/2");
        assertTrue(p.mayMatchProperty());   // property "foo1"
        assertFalse(p.mayMatchElement());   // not array index

        JsonPointer q = JsonPointer.compile("/42");
        assertTrue(q.mayMatchElement());    // index 42
        assertEquals(42, q.getMatchingIndex());
        // property name should also be available but may not match pattern, but still non-null
        assertNotNull(q.getMatchingProperty()); // it is "42"
    }

    // --- edge cases: array index large numbers ---
    @Test
    public void testLargeArrayIndexBoundary() {
        // 10-digit number within integer range: 2147483647 (max int)
        JsonPointer p = JsonPointer.compile("/2147483647");
        assertEquals("max int index", 2147483647, p.getMatchingIndex());

        // 10-digit exceeding int range: 2147483648 -> returns -1
        JsonPointer p2 = JsonPointer.compile("/2147483648");
        assertEquals("overflow should yield -1", -1, p2.getMatchingIndex());
        // no exception, but matching element not possible
        assertFalse(p2.mayMatchElement());
    }

    @Test
    public void testIndexEmptyOrNonNumeric() {
        JsonPointer p = JsonPointer.compile("/");
        // empty segment
        assertEquals("empty should not be numeric", -1, p.getMatchingIndex());
        assertFalse(p.mayMatchElement());
    }

    // --- equals, hashCode, toString ---
    @Test
    public void testEquals() {
        JsonPointer p1 = JsonPointer.compile("/a");
        JsonPointer p2 = JsonPointer.compile("/a");
        JsonPointer p3 = JsonPointer.compile("/b");
        assertTrue("same content should be equal", p1.equals(p2));
        assertFalse("different content should not be equal", p1.equals(p3));
        assertFalse("null not equal", p1.equals(null));
        assertFalse("non-JsonPointer not equal", p1.equals("someString"));
        assertTrue("same reference equal", p1.equals(p1));
    }

    @Test
    public void testHashCode() {
        JsonPointer p1 = JsonPointer.compile("/a");
        JsonPointer p2 = JsonPointer.compile("/a");
        assertEquals("same content should have same hash", p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("/a/b", JsonPointer.compile("/a/b").toString());
        assertEquals("", JsonPointer.compile("").toString());
    }

    // --- test protected members indirectly via subclass (for getters) ---
    @Test
    public void testProtectedMembersViaSubclass() {
        class SubPointer extends JsonPointer {
            public SubPointer() { super(); }
            public SubPointer(String full, String seg, JsonPointer next) { super(full, seg, next); }
        }
        SubPointer sp = new SubPointer("/test", "test", JsonPointer.compile(""));
        assertEquals("test", sp._matchingPropertyName);
        assertEquals(-1, sp._matchingElementIndex);
        assertNotNull(sp._asString);
    }

    // --- exception path for compile ---
    @Test
    public void testCompileNullThrows() {
        // already covered in testCompileEmptyOrNull, but for completeness:
        assertNotNull(JsonPointer.compile(null));
    }

    // --- additional edge cases: complex escapes ---
    @Test
    public void testQuotedTailWithEscapes() {
        JsonPointer p = JsonPointer.compile("/hello~1world/test");
        // segment: "hello/world"
        assertEquals("hello/world", p.getMatchingProperty());
        JsonPointer tail = p.tail();
        assertEquals("test", tail.getMatchingProperty());
    }

    @Test
    public void testQuotedTailWithTilde0() {
        JsonPointer p = JsonPointer.compile("/~0~0");
        assertEquals("~~", p.getMatchingProperty());
    }

    @Test
    public void testQuotedTailAtEnd() {
        // tilde at the very end -> treated as plain '~'
        JsonPointer p = JsonPointer.compile("/foo~");
        // "foo~" (since '~' alone is not valid, but we keep it)
        assertEquals("foo~", p.getMatchingProperty());
    }

    // --- test _parseIndex for various values ---
    @Test
    public void testParseIndexPrivateMethod() throws Exception {
        java.lang.reflect.Method method = JsonPointer.class.getDeclaredMethod("_parseIndex", String.class);
        method.setAccessible(true);
        assertEquals(123, ((Integer) method.invoke(null, "123")).intValue());
        assertEquals(0, ((Integer) method.invoke(null, "0")).intValue());
        assertEquals(-1, ((Integer) method.invoke(null, "")).intValue());
        assertEquals(-1, ((Integer) method.invoke(null, "12345678901")).intValue()); // >10 chars
        assertEquals(-1, ((Integer) method.invoke(null, "12a"))).intValue());
    }
}