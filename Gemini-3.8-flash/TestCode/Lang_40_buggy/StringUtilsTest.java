package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link StringUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class StringUtilsTest {

    @Test
    public void isEmptyAndIsBlank_shouldIdentifyEmptyStrings() {
        // Arrange & Act & Assert
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty("abc"));

        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank("   "));
        assertFalse(StringUtils.isBlank("abc"));
    }

    @Test
    public void equals_shouldHandleNullsSafely() {
        // Arrange & Act & Assert
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "a"));
        assertFalse(StringUtils.equals("a", null));
        assertTrue(StringUtils.equals("a", "a"));
        assertTrue(StringUtils.equalsIgnoreCase("a", "A"));
    }

    @Test
    public void substringAndTrim_shouldManipulateString() {
        // Arrange & Act & Assert
        assertEquals("bc", StringUtils.substring("abc", 1));
        assertEquals("b", StringUtils.substring("abc", 1, 2));
        assertEquals("abc", StringUtils.trim("  abc  "));
        assertNull(StringUtils.trim(null));
    }

    @Test
    public void joinAndSplit_shouldProcessDelimitedText() {
        // Arrange
        String[] input = new String[] { "foo", "bar", "baz" };

        // Act
        String joined = StringUtils.join(input, "-");
        String[] split = StringUtils.split(joined, "-");

        // Assert
        assertEquals("foo-bar-baz", joined);
        assertNotNull(split);
        assertEquals(3, split.length);
        assertEquals("foo", split[0]);
    }
}
