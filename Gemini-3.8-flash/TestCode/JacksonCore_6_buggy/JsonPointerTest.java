package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link JsonPointer}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class JsonPointerTest {

    @Test
    public void compile_givenNullOrEmpty_shouldReturnEmptyPointer() {
        // Arrange & Act
        JsonPointer pNull = JsonPointer.compile(null);
        JsonPointer pEmpty = JsonPointer.compile("");

        // Assert
        assertNotNull(pNull);
        assertTrue(pNull.matches());
        assertEquals("", pNull.toString());
        assertSame(pNull, pEmpty);
    }

    @Test(expected = IllegalArgumentException.class)
    public void compile_givenStringWithoutLeadingSlash_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        JsonPointer.compile("invalid_no_slash");
    }

    @Test
    public void compile_givenSimplePath_shouldParseSegmentsCorrectly() {
        // Arrange
        String expression = "/users/12/name";

        // Act
        JsonPointer ptr = JsonPointer.compile(expression);

        // Assert
        assertNotNull(ptr);
        assertFalse(ptr.matches());
        assertEquals("users", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());

        JsonPointer second = ptr.tail();
        assertNotNull(second);
        assertEquals("12", second.getMatchingProperty());
        assertEquals(12, second.getMatchingIndex());
        assertTrue(second.mayMatchProperty());
        assertTrue(second.mayMatchElement());

        JsonPointer third = second.tail();
        assertNotNull(third);
        assertEquals("name", third.getMatchingProperty());
        assertEquals(-1, third.getMatchingIndex());

        JsonPointer end = third.tail();
        assertNotNull(end);
        assertTrue(end.matches());
    }

    @Test
    public void compile_givenEscapedCharacters_shouldUnescapeProperly() {
        // Arrange & Act: ~0 -> ~, ~1 -> /
        JsonPointer ptr = JsonPointer.compile("/a~1b/c~0d");

        // Assert
        assertNotNull(ptr);
        assertEquals("a/b", ptr.getMatchingProperty());
        JsonPointer second = ptr.tail();
        assertEquals("c~d", second.getMatchingProperty());
    }

    @Test
    public void valueOf_givenValidExpression_shouldMatchCompileResult() {
        // Arrange
        String expression = "/address/city";

        // Act
        JsonPointer p1 = JsonPointer.compile(expression);
        JsonPointer p2 = JsonPointer.valueOf(expression);

        // Assert
        assertEquals(p1, p2);
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void matchProperty_givenMatchingAndMismatching_shouldReturnTailOrNull() {
        // Arrange
        JsonPointer ptr = JsonPointer.compile("/foo/bar");

        // Act
        JsonPointer matched = ptr.matchProperty("foo");
        JsonPointer notMatched = ptr.matchProperty("baz");

        // Assert
        assertNotNull(matched);
        assertEquals("bar", matched.getMatchingProperty());
        assertNull(notMatched);
    }

    @Test
    public void matchElement_givenMatchingAndMismatchingIndex_shouldReturnTailOrNull() {
        // Arrange
        JsonPointer ptr = JsonPointer.compile("/5/item");

        // Act
        JsonPointer matched = ptr.matchElement(5);
        JsonPointer notMatched = ptr.matchElement(3);
        JsonPointer negative = ptr.matchElement(-1);

        // Assert
        assertNotNull(matched);
        assertEquals("item", matched.getMatchingProperty());
        assertNull(notMatched);
        assertNull(negative);
    }

    @Test
    public void equalsAndHashCode_shouldAdhereToContract() {
        // Arrange
        JsonPointer p1 = JsonPointer.compile("/a/b/c");
        JsonPointer p2 = JsonPointer.compile("/a/b/c");
        JsonPointer p3 = JsonPointer.compile("/a/b/d");

        // Act & Assert
        assertEquals(p1, p1);
        assertEquals(p1, p2);
        assertEquals(p2, p1);
        assertFalse(p1.equals(p3));
        assertFalse(p1.equals(null));
        assertFalse(p1.equals("/a/b/c"));
        assertEquals(p1.hashCode(), p2.hashCode());
    }
}
