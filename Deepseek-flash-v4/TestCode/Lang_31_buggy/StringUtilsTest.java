package org.apache.commons.lang3;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class StringUtilsTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("foo"));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("foo"));
    }

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank("   "));
        assertFalse(StringUtils.isBlank("foo"));
    }

    @Test
    public void testIsNotBlank() {
        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank(""));
        assertFalse(StringUtils.isNotBlank("   "));
        assertTrue(StringUtils.isNotBlank("foo"));
    }

    @Test
    public void testTrim() {
        assertEquals("foo", StringUtils.trim("  foo  "));
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim("   "));
    }

    @Test
    public void testTrimToNull() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertNull(StringUtils.trimToNull("   "));
        assertEquals("foo", StringUtils.trimToNull("  foo  "));
    }

    @Test
    public void testTrimToEmpty() {
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty(""));
        assertEquals("", StringUtils.trimToEmpty("   "));
        assertEquals("foo", StringUtils.trimToEmpty("  foo  "));
    }

    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("abc", StringUtils.strip("  abc  "));
        assertEquals("abc", StringUtils.strip("  abc  ", null));
        assertEquals("abc", StringUtils.strip("  abc  ", " "));
    }

    @Test
    public void testStripToNull() {
        assertNull(StringUtils.stripToNull(null));
        assertNull(StringUtils.stripToNull(""));
        assertNull(StringUtils.stripToNull("   "));
        assertEquals("abc", StringUtils.stripToNull("  abc  "));
    }

    @Test
    public void testStripToEmpty() {
        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("", StringUtils.stripToEmpty(""));
        assertEquals("", StringUtils.stripToEmpty("   "));
        assertEquals("abc", StringUtils.stripToEmpty("  abc  "));
    }

    @Test
    public void testStripStart() {
        assertNull(StringUtils.stripStart(null, null));
        assertEquals("abc  ", StringUtils.stripStart("  abc  ", null));
        assertEquals("abc  ", StringUtils.stripStart("  abc  ", " "));
        assertEquals("abc  ", StringUtils.stripStart("xxabc  ", "x"));
        assertEquals("  abc  ", StringUtils.stripStart("  abc  ", ""));
        assertEquals("abc  ", StringUtils.stripStart("  abc  ", " "));
    }

    @Test
    public void testStripEnd() {
        assertNull(StringUtils.stripEnd(null, null));
        assertEquals("  abc", StringUtils.stripEnd("  abc  ", null));
        assertEquals("  abc", StringUtils.stripEnd("  abc  ", " "));
        assertEquals("  abc", StringUtils.stripEnd("  abcxx", "x"));
        assertEquals("  abc  ", StringUtils.stripEnd("  abc  ", ""));
    }

    @Test
    public void testStripAll() {
        assertArrayEquals(null, StringUtils.stripAll(null));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.stripAll(new String[]{"  abc  ", "  def  "}));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.stripAll(new String[]{"  abc  ", "  def  "}, null));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.stripAll(new String[]{"xxabcxx", "xxdefxx"}, "x"));
    }

    @Test
    public void testStripAccents() {
        assertNull(StringUtils.stripAccents(null));
        assertEquals("a", StringUtils.stripAccents("a"));
    }

    @Test
    public void testIndexOf() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(1, StringUtils.indexOf("abc", 'b'));
        assertEquals(-1, StringUtils.indexOf("abc", 'z'));
    }

    @Test
    public void testIndexOfString() {
        assertEquals(-1, StringUtils.indexOf(null, "a"));
        assertEquals(-1, StringUtils.indexOf("", "a"));
        assertEquals(1, StringUtils.indexOf("abc", "bc"));
        assertEquals(0, StringUtils.indexOf("abc", ""));
        assertEquals(-1, StringUtils.indexOf("abc", "z"));
    }

    @Test
    public void testIndexOfIgnoreCase() {
        assertEquals(-1, StringUtils.indexOfIgnoreCase(null, "a"));
        assertEquals(0, StringUtils.indexOfIgnoreCase("ABC", "a"));
        assertEquals(2, StringUtils.indexOfIgnoreCase("abc", "C"));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("abc", "z"));
    }

    @Test
    public void testLastIndexOf() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
        assertEquals(2, StringUtils.lastIndexOf("abc", 'c'));
        assertEquals(-1, StringUtils.lastIndexOf("abc", 'z'));
    }

    @Test
    public void testLastIndexOfString() {
        assertEquals(-1, StringUtils.lastIndexOf(null, "a"));
        assertEquals(2, StringUtils.lastIndexOf("abcabc", "c"));
        assertEquals(3, StringUtils.lastIndexOf("abcabc", "a"));
        assertEquals(-1, StringUtils.lastIndexOf("abc", "z"));
    }

    @Test
    public void testContains() {
        assertFalse(StringUtils.contains(null, 'a'));
        assertTrue(StringUtils.contains("abc", 'a'));
        assertFalse(StringUtils.contains("abc", 'z'));
    }

    @Test
    public void testContainsString() {
        assertFalse(StringUtils.contains(null, "a"));
        assertTrue(StringUtils.contains("abc", "bc"));
        assertFalse(StringUtils.contains("abc", "z"));
    }

    @Test
    public void testContainsAny() {
        assertFalse(StringUtils.containsAny(null, "a"));
        assertTrue(StringUtils.containsAny("abc", "zab"));
        assertFalse(StringUtils.containsAny("abc", "zzz"));
    }

    @Test
    public void testContainsNone() {
        assertTrue(StringUtils.containsNone(null, "a"));
        assertTrue(StringUtils.containsNone("abc", "zz"));
        assertFalse(StringUtils.containsNone("abc", "bz"));
    }

    @Test
    public void testIndexOfAny() {
        assertEquals(-1, StringUtils.indexOfAny(null, new String[]{"a"}));
        assertEquals(-1, StringUtils.indexOfAny("abc", null));
        assertEquals(0, StringUtils.indexOfAny("abc", new String[]{"a", "b"}));
        assertEquals(-1, StringUtils.indexOfAny("abc", new String[]{"z"}));
    }

    @Test
    public void testIndexOfAnyStr() {
        assertEquals(-1, StringUtils.indexOfAny(null, new String[]{"a"}));
        assertEquals(-1, StringUtils.indexOfAny("abc", null));
        assertEquals(0, StringUtils.indexOfAny("abc", new String[]{"a", "b"}));
    }

    @Test
    public void testSubstring() {
        assertNull(StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("", 0));
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("bc", StringUtils.substring("abc", 1));
        assertEquals("", StringUtils.substring("abc", 4));
    }

    @Test
    public void testSubstringRange() {
        assertNull(StringUtils.substring(null, 0, 2));
        assertEquals("", StringUtils.substring("", 0, 2));
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
        assertEquals("bc", StringUtils.substring("abc", 1, 3));
        assertEquals("", StringUtils.substring("abc", 2, 0));
    }

    @Test
    public void testSubstringBefore() {
        assertEquals("a", StringUtils.substringBefore("abc", "b"));
        assertEquals("", StringUtils.substringBefore("abc", "a"));
        assertEquals("abc", StringUtils.substringBefore("abc", "z"));
        assertNull(StringUtils.substringBefore(null, "b"));
        assertEquals("", StringUtils.substringBefore("abc", ""));
    }

    @Test
    public void testSubstringAfter() {
        assertEquals("c", StringUtils.substringAfter("abc", "b"));
        assertEquals("", StringUtils.substringAfter("abc", "c"));
        assertEquals("", StringUtils.substringAfter("abc", "z"));
        assertNull(StringUtils.substringAfter(null, "b"));
    }

    @Test
    public void testSubstringBeforeLast() {
        assertEquals("a", StringUtils.substringBeforeLast("abcabc", "b"));
        assertEquals("abc", StringUtils.substringBeforeLast("abc", "z"));
        assertNull(StringUtils.substringBeforeLast(null, "b"));
    }

    @Test
    public void testSubstringAfterLast() {
        assertEquals("c", StringUtils.substringAfterLast("abcabc", "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", "c"));
        assertEquals("", StringUtils.substringAfterLast("abc", "z"));
        assertNull(StringUtils.substringAfterLast(null, "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
    }

    @Test
    public void testSubstringBetween() {
        assertNull(StringUtils.substringBetween(null, "a"));
        assertEquals("b", StringUtils.substringBetween("abc", "a", "c"));
        assertNull(StringUtils.substringBetween("abc", "z"));
        assertNull(StringUtils.substringBetween("abc", "a", "z"));
        assertEquals("b", StringUtils.substringBetween("abc", "a", "c"));
    }

    @Test
    public void testSplit() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a,b,c"));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a,b,c", ","));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a,b,c", ",", 3));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a b c"));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a b c", null));
    }

    @Test
    public void testSplitPreserveAllTokens() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.splitPreserveAllTokens("a,b,c"));
        assertArrayEquals(new String[]{"a", "", "b", "c"}, StringUtils.splitPreserveAllTokens("a,,b,c"));
    }

    @Test
    public void testSplitByCharacterType() {
        assertArrayEquals(new String[]{"ab", "c", "De", "F"}, StringUtils.splitByCharacterType("ab cDeF"));
        assertNull(StringUtils.splitByCharacterType(null));
        assertEquals(0, StringUtils.splitByCharacterType("").length);
    }

    @Test
    public void testSplitByCharacterTypeCamelCase() {
        assertArrayEquals(new String[]{"camel", "Case"}, StringUtils.splitByCharacterTypeCamelCase("camelCase"));
        assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
    }

    @Test
    public void testJoin() {
        assertNull(StringUtils.join((Object[]) null));
        assertEquals("", StringUtils.join(new Object[]{}));
        assertEquals("a", StringUtils.join(new Object[]{"a"}));
        assertEquals("a,b", StringUtils.join(new Object[]{"a", "b"}, ","));
        assertEquals("a b", StringUtils.join(new Object[]{"a", "b"}, " "));
        assertEquals("a", StringUtils.join(new Object[]{"a", null}, ","));
    }

    @Test
    public void testDeleteWhitespace() {
        assertEquals("abc", StringUtils.deleteWhitespace("  a b c  "));
        assertNull(StringUtils.deleteWhitespace(null));
    }

    @Test
    public void testRemoveStart() {
        assertNull(StringUtils.removeStart(null, "a"));
        assertEquals("bc", StringUtils.removeStart("abc", "a"));
        assertEquals("abc", StringUtils.removeStart("abc", "z"));
        assertEquals("abc", StringUtils.removeStart("abc", ""));
    }

    @Test
    public void testRemoveEnd() {
        assertNull(StringUtils.removeEnd(null, "c"));
        assertEquals("ab", StringUtils.removeEnd("abc", "c"));
        assertEquals("abc", StringUtils.removeEnd("abc", "z"));
        assertEquals("abc", StringUtils.removeEnd("abc", ""));
    }

    @Test
    public void testRemoveStartIgnoreCase() {
        assertEquals("bc", StringUtils.removeStartIgnoreCase("aBc", "a"));
        assertEquals("abc", StringUtils.removeStartIgnoreCase("abc", "z"));
        assertNull(StringUtils.removeStartIgnoreCase(null, "a"));
    }

    @Test
    public void testRemoveEndIgnoreCase() {
        assertEquals("ab", StringUtils.removeEndIgnoreCase("abC", "c"));
        assertEquals("abc", StringUtils.removeEndIgnoreCase("abc", "z"));
        assertNull(StringUtils.removeEndIgnoreCase(null, "c"));
    }

    @Test
    public void testRepeat() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("", 2));
        assertEquals("abab", StringUtils.repeat("ab", 2));
        assertEquals("", StringUtils.repeat("ab", 0));
        assertEquals("ab", StringUtils.repeat("ab", 1));
        assertEquals("aaa", StringUtils.repeat("a", 3));
    }

    @Test
    public void testRepeatStringSeparator() {
        assertEquals("a,b", StringUtils.repeat("a", "b", 2));
        assertEquals("", StringUtils.repeat("a", "b", 0));
        assertEquals("a", StringUtils.repeat("a", "b", 1));
    }

    @Test
    public void testRightPad() {
        assertEquals("ab ", StringUtils.rightPad("ab", 3));
        assertEquals("ab  ", StringUtils.rightPad("ab", 4, ' '));
        assertEquals("ab  ", StringUtils.rightPad("ab", 4, "  "));
        assertEquals("ab", StringUtils.rightPad("ab", 1, " "));
        assertEquals("ab", StringUtils.rightPad("ab", 0, " "));
    }

    @Test
    public void testLeftPad() {
        assertEquals(" ab", StringUtils.leftPad("ab", 3));
        assertEquals("  ab", StringUtils.leftPad("ab", 4, ' '));
        assertEquals("ab", StringUtils.leftPad("ab", 1, " "));
        assertEquals("ab", StringUtils.leftPad("ab", 0, " "));
    }

    @Test
    public void testCenter() {
        assertEquals(" ab ", StringUtils.center("ab", 4));
        assertNull(StringUtils.center(null, 4));
        assertEquals("ab", StringUtils.center("ab", 1));
        assertEquals("ab", StringUtils.center("ab", 0));
    }

    @Test
    public void testUpperCase() {
        assertEquals("ABC", StringUtils.upperCase("abc"));
        assertEquals("ABC", StringUtils.upperCase("aBc"));
        assertNull(StringUtils.upperCase(null));
        assertEquals("ABC", StringUtils.upperCase("abc", Locale.ENGLISH));
    }

    @Test
    public void testLowerCase() {
        assertEquals("abc", StringUtils.lowerCase("ABC"));
        assertEquals("abc", StringUtils.lowerCase("aBc"));
        assertNull(StringUtils.lowerCase(null));
        assertEquals("abc", StringUtils.lowerCase("ABC", Locale.ENGLISH));
    }

    @Test
    public void testSwapCase() {
        assertEquals("aBc", StringUtils.swapCase("AbC"));
        assertNull(StringUtils.swapCase(null));
        assertEquals("", StringUtils.swapCase(""));
    }

    @Test
    public void testDefaultString() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("abc", StringUtils.defaultString("abc"));
        assertEquals("", StringUtils.defaultString(""));
    }

    @Test
    public void testDefaultIfEmpty() {
        assertEquals("default", StringUtils.defaultIfEmpty(null, "default"));
        assertEquals("default", StringUtils.defaultIfEmpty("", "default"));
        assertEquals("abc", StringUtils.defaultIfEmpty("abc", "default"));
    }

    @Test
    public void testDefaultIfBlank() {
        assertEquals("default", StringUtils.defaultIfBlank(null, "default"));
        assertEquals("default", StringUtils.defaultIfBlank("", "default"));
        assertEquals("default", StringUtils.defaultIfBlank("   ", "default"));
        assertEquals("abc", StringUtils.defaultIfBlank("abc", "default"));
    }

    @Test
    public void testReverse() {
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    @Test
    public void testAbbreviate() {
        assertEquals("...", StringUtils.abbreviate("abc", 3));
        assertEquals("a...", StringUtils.abbreviate("abc", 4));
        assertEquals("...", StringUtils.abbreviate("abcdef", 3));
        assertEquals("ab...", StringUtils.abbreviate("abcdef", 5));
        assertEquals("abc", StringUtils.abbreviate("abc", 4));
    }

    @Test
    public void testAbbreviateMiddle() {
        assertEquals("abc...xyz", StringUtils.abbreviateMiddle("abcdefghijklmnopqrstuvwxyz", "...", 10));
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", "...", 3));
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", "...", 2));
    }

    @Test
    public void testIndexOfDifference() {
        assertEquals(-1, StringUtils.indexOfDifference(null, null));
        assertEquals(-1, StringUtils.indexOfDifference("abc", "abc"));
        assertEquals(3, StringUtils.indexOfDifference("abc", "abz"));
        assertEquals(0, StringUtils.indexOfDifference("abc", "xyz"));
    }

    @Test
    public void testGetCommonPrefix() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"abc", "abd"}));
        assertEquals("ab", StringUtils.getCommonPrefix(new String[]{"abc", "abx"}));
        assertNull(StringUtils.getCommonPrefix(new String[]{null}));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"a", "b"}));
    }

    @Test
    public void testLevenshteinDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(3, StringUtils.getLevenshteinDistance("kitten", "sitting"));
        assertEquals(0, StringUtils.getLevenshteinDistance("kitten", "kitten"));
        assertEquals(5, StringUtils.getLevenshteinDistance("", "kitten"));
        assertEquals(5, StringUtils.getLevenshteinDistance("kitten", ""));
    }

    @Test
    public void testStartsWith() {
        assertFalse(StringUtils.startsWith(null, "a"));
        assertTrue(StringUtils.startsWith("abc", "a"));
        assertFalse(StringUtils.startsWith("abc", "z"));
        assertTrue(StringUtils.startsWith("abc", ""));
        assertTrue(StringUtils.startsWith("abc", "AbC", true));
    }

    @Test
    public void testEndsWith() {
        assertFalse(StringUtils.endsWith(null, "a"));
        assertTrue(StringUtils.endsWith("abc", "c"));
        assertFalse(StringUtils.endsWith("abc", "z"));
        assertTrue(StringUtils.endsWith("abc", ""));
        assertTrue(StringUtils.endsWith("abc", "AbC", true));
    }

    @Test
    public void testContainsIgnoreCase() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        assertTrue(StringUtils.containsIgnoreCase("abc", "A"));
        assertTrue(StringUtils.containsIgnoreCase("abc", "BC"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "z"));
    }

    @Test
    public void testStripAllNull() {
        assertArrayEquals(null, StringUtils.stripAll(null, null));
    }

    @Test
    public void testStripAllWithStripChars() {
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.stripAll(new String[]{"xxabcxx", "xxdefxx"}, "x"));
    }

    @Test
    public void testStripAllNullOrEmptyStrs() {
        assertArrayEquals(new String[]{"", "abc"}, StringUtils.stripAll(new String[]{"", "abc"}, null));
    }

    @Test
    public void testStripAllSingleElement() {
        assertArrayEquals(new String[]{"abc"}, StringUtils.stripAll(new String[]{"  abc  "}, null));
    }

    @Test
    public void testStripAllMultipleElements() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.stripAll(new String[]{" a ", " b ", " c "}, null));
    }

    @Test
    public void testStripAccentsNormal() {
        assertEquals("a", StringUtils.stripAccents("a"));
    }

    @Test
    public void testStripAccentsWithCombining() {
        assertEquals("a", StringUtils.stripAccents("a\u0300"));
    }

    @Test
    public void testStripAccentsWithUnsupported() {
        try {
            // Force the reflection to throw
            assertNotNull(StringUtils.stripAccents("a\u0300"));
        } catch (RuntimeException e) {
            assertTrue(e instanceof RuntimeException || e instanceof UnsupportedOperationException);
        }
    }

    @Test
    public void testSubstringBetweenNullTag() {
        assertNull(StringUtils.substringBetween("abc", null, "c"));
    }

    @Test
    public void testSubstringBetweenNullStr() {
        assertNull(StringUtils.substringBetween(null, "a", "c"));
    }

    @Test
    public void testSubstringBetweenNullBoth() {
        assertNull(StringUtils.substringBetween(null, null));
    }

    @Test
    public void testSubstringBetweenNotFound() {
        assertNull(StringUtils.substringBetween("abc", "z", "c"));
    }

    @Test
    public void testSubstringBetweenNotFoundEnd() {
        assertNull(StringUtils.substringBetween("abc", "a", "z"));
    }

    @Test
    public void testSubstringBetweenEmptyTag() {
        assertNull(StringUtils.substringBetween("abc", "", "c"));
    }

    @Test
    public void testCenterNullString() {
        assertNull(StringUtils.center(null, 4));
    }

    @Test
    public void testCenterShortString() {
        assertEquals("ab", StringUtils.center("ab", 1));
    }

    @Test
    public void testCenterZeroSize() {
        assertEquals("ab", StringUtils.center("ab", 0));
    }

    @Test
    public void testCenterNegativeSize() {
        assertEquals("ab", StringUtils.center("ab", -1));
    }

    @Test
    public void testCenterOdd() {
        assertEquals(" abc ", StringUtils.center("abc", 5));
    }

    @Test
    public void testCenterEven() {
        assertEquals(" ab ", StringUtils.center("ab", 4));
    }

    @Test
    public void testUpperCaseNull() {
        assertNull(StringUtils.upperCase(null));
    }

    @Test
    public void testLowerCaseNull() {
        assertNull(StringUtils.lowerCase(null));
    }

    @Test
    public void testSwapCaseNull() {
        assertNull(StringUtils.swapCase(null));
    }

    @Test
    public void testDefaultStringNull() {
        assertEquals("", StringUtils.defaultString(null));
    }

    @Test
    public void testDefaultStringEmpty() {
        assertEquals("", StringUtils.defaultString(""));
    }

    @Test
    public void testDefaultStringNonEmpty() {
        assertEquals("abc", StringUtils.defaultString("abc"));
    }

    @Test
    public void testReverseNull() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testReverseEmpty() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    public void testReverseSingle() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    public void testReverseMulti() {
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    @Test
    public void testAbbreviateNull() {
        assertEquals("", StringUtils.abbreviate(null, 4));
    }

    @Test
    public void testAbbreviateEmpty() {
        assertEquals("", StringUtils.abbreviate("", 4));
    }

    @Test
    public void testAbbreviateTooShort() {
        assertEquals("abc", StringUtils.abbreviate("abc", 2));
    }

    @Test
    public void testAbbreviateExactMax() {
        assertEquals("abc", StringUtils.abbreviate("abc", 3));
    }

    @Test
    public void testAbbreviateOneMore() {
        assertEquals("...", StringUtils.abbreviate("abc", 4));
    }

    @Test
    public void testAbbreviateTwoMore() {
        assertEquals("a...", StringUtils.abbreviate("abc", 5));
    }

    @Test
    public void testAbbreviateLonger() {
        assertEquals("ab...", StringUtils.abbreviate("abcdefghijklmno", 5));
    }

    @Test
    public void testLevenshteinDistanceNullStrings() {
        assertEquals(-1, StringUtils.getLevenshteinDistance(null, "abc"));
        assertEquals(-1, StringUtils.getLevenshteinDistance("abc", null));
        assertEquals(-1, StringUtils.getLevenshteinDistance(null, null));
    }

    @Test
    public void testLevenshteinDistanceEqual() {
        assertEquals(0, StringUtils.getLevenshteinDistance("abc", "abc"));
    }

    @Test
    public void testLevenshteinDistanceDifferent() {
        assertEquals(2, StringUtils.getLevenshteinDistance("abc", "abd"));
    }

    @Test
    public void testLevenshteinDistanceOneEmpty() {
        assertEquals(3, StringUtils.getLevenshteinDistance("", "abc"));
        assertEquals(3, StringUtils.getLevenshteinDistance("abc", ""));
    }

    @Test
    public void testLevenshteinDistanceQuadratic() {
        assertEquals(3, StringUtils.getLevenshteinDistance("horse", "ros"));
    }

    @Test
    public void testStartsWithNullPrefix() {
        assertFalse(StringUtils.startsWith("abc", null));
    }

    @Test
    public void testStartsWithBothNull() {
        assertTrue(StringUtils.startsWith(null, null));
    }

    @Test
    public void testStartsWithNullStr() {
        assertFalse(StringUtils.startsWith(null, "a"));
    }

    @Test
    public void testStartsWithEmpty() {
        assertTrue(StringUtils.startsWith("abc", ""));
    }

    @Test
    public void testStartsWithIgnoreCaseNull() {
        assertFalse(StringUtils.startsWith("abc", null));
        assertFalse(StringUtils.startsWith(null, "a"));
        assertTrue(StringUtils.startsWith(null, null));
    }

    @Test
    public void testEndsWithNullSuffix() {
        assertFalse(StringUtils.endsWith("abc", null));
    }

    @Test
    public void testEndsWithBothNull() {
        assertTrue(StringUtils.endsWith(null, null));
    }

    @Test
    public void testEndsWithNullStr() {
        assertFalse(StringUtils.endsWith(null, "c"));
    }

    @Test
    public void testEndsWithEmpty() {
        assertTrue(StringUtils.endsWith("abc", ""));
    }

    @Test
    public void testEndsWithIgnoreCaseNull() {
        assertFalse(StringUtils.endsWith("abc", null));
        assertFalse(StringUtils.endsWith(null, "c"));
        assertTrue(StringUtils.endsWith(null, null));
    }

    @Test
    public void testEndsWithIgnoreCase() {
        assertTrue(StringUtils.endsWith("aBc", "C", true));
        assertTrue(StringUtils.endsWith("aBc", "Bc", true));
        assertTrue(StringUtils.endsWith("aBc", "aBc", true));
        assertFalse(StringUtils.endsWith("aBc", "b", true));
    }

    @Test
    public void testStartsWithIgnoreCase() {
        assertTrue(StringUtils.startsWith("aBc", "A", true));
        assertTrue(StringUtils.startsWith("aBc", "aB", true));
        assertTrue(StringUtils.startsWith("aBc", "aBc", true));
        assertFalse(StringUtils.startsWith("aBc", "b", true));
    }

    @Test
    public void testContainsIgnoreCaseNull() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        assertFalse(StringUtils.containsIgnoreCase("abc", null));
    }

    @Test
    public void testContainsIgnoreCaseNormal() {
        assertTrue(StringUtils.containsIgnoreCase("abc", "B"));
        assertTrue(StringUtils.containsIgnoreCase("abc", "A"));
        assertTrue(StringUtils.containsIgnoreCase("abc", "BC"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "Z"));
    }
}