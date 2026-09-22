package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link StringUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class StringUtilsTest {

    @Test
    public void isEmptyAndIsBlank_givenVariousStrings_shouldReturnExpectedBooleans() {
        // Arrange & Act & Assert
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("abc"));

        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank("   "));
        assertFalse(StringUtils.isBlank("  a  "));
    }

    @Test
    public void trimAndStrip_givenWhitespaceStrings_shouldTrim() {
        // Arrange & Act & Assert
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim("   "));
        assertEquals("abc", StringUtils.trim("  abc  "));
        assertEquals("abc", StringUtils.strip("  abc  "));
    }

    @Test
    public void equals_givenStrings_shouldCheckEqualitySafely() {
        // Arrange & Act & Assert
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
    }

    @Test
    public void indexOfAndContains_shouldFindSubstrings() {
        // Arrange & Act & Assert
        assertEquals(2, StringUtils.indexOf("hello", 'l'));
        assertEquals(-1, StringUtils.indexOf("hello", 'z'));
        assertTrue(StringUtils.contains("hello", "ell"));
        assertFalse(StringUtils.contains("hello", "world"));
    }

    @Test
    public void containsAny_givenCharArraysAndStrings_shouldDetectMatches() {
        // Arrange & Act & Assert
        assertTrue(StringUtils.containsAny("hello", 'a', 'e', 'i'));
        assertFalse(StringUtils.containsAny("hello", 'a', 'u'));
        assertTrue(StringUtils.containsAny("hello", "xyz", "ell"));
    }

    @Test
    public void joinAndSplit_givenArraysAndDelimiters_shouldCombineAndSeparate() {
        // Arrange
        String[] parts = new String[] { "one", "two", "three" };

        // Act
        String joined = StringUtils.join(parts, ",");
        String[] split = StringUtils.split(joined, ",");

        // Assert
        assertEquals("one,two,three", joined);
        assertNotNull(split);
        assertEquals(3, split.length);
        assertEquals("one", split[0]);
        assertEquals("two", split[1]);
        assertEquals("three", split[2]);
    }

    @Test
    public void replaceEach_givenSearchAndReplacementArrays_shouldReplace() {
        // Arrange
        String text = "hello world";
        String[] search = new String[] { "hello", "world" };
        String[] replace = new String[] { "hi", "earth" };

        // Act
        String result = StringUtils.replaceEach(text, search, replace);

        // Assert
        assertEquals("hi earth", result);
    }

    @Test
    public void defaultString_givenNullAndValues_shouldReturnDefault() {
        // Arrange & Act & Assert
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("default", StringUtils.defaultString(null, "default"));
        assertEquals("val", StringUtils.defaultString("val", "default"));
    }
}
