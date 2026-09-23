package org.apache.commons.lang3;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.util.*;

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
        assertFalse(StringUtils.isEmpty("bob"));
        assertFalse(StringUtils.isEmpty("  bob  "));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("bob"));
    }

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank("  bob  "));
    }

    @Test
    public void testIsNotBlank() {
        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank(""));
        assertFalse(StringUtils.isNotBlank(" "));
        assertTrue(StringUtils.isNotBlank("bob"));
    }

    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("", StringUtils.trim("   "));
        assertEquals("abc", StringUtils.trim("  abc  "));
    }

    @Test
    public void testTrimToNull() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertNull(StringUtils.trimToNull("   "));
        assertEquals("abc", StringUtils.trimToNull("  abc  "));
    }

    @Test
    public void testTrimToEmpty() {
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty(""));
        assertEquals("abc", StringUtils.trimToEmpty("  abc  "));
    }

    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("abc", StringUtils.strip("  abc  "));
        assertEquals("abc", StringUtils.strip("  ab  c  "));
        assertEquals("abc", StringUtils.strip("xxabcxx", "x"));
        assertEquals("abc", StringUtils.strip("xxabcxx", ""));
        assertEquals("abc", StringUtils.strip("xxabcxx", null));
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
        assertEquals("abc", StringUtils.stripToEmpty("  abc  "));
    }

    @Test
    public void testStripAll() {
        assertNull(StringUtils.stripAll((String[]) null));
        assertArrayEquals(new String[0], StringUtils.stripAll(new String[0]));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.stripAll("  abc  ", "  def  "));
    }

    @Test
    public void testStripAccents() {
        assertNull(StringUtils.stripAccents(null));
        assertEquals("a", StringUtils.stripAccents("a"));
    }

    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEqualsIgnoreCase() {
        assertTrue(StringUtils.equalsIgnoreCase(null, null));
        assertFalse(StringUtils.equalsIgnoreCase(null, "abc"));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
    }

    @Test
    public void testIndexOf() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(0, StringUtils.indexOf("abc", 'a'));
        assertEquals(1, StringUtils.indexOf("abc", 'b'));
        assertEquals(-1, StringUtils.indexOf("abc", 'z'));
    }

    @Test
    public void testIndexOfString() {
        assertEquals(-1, StringUtils.indexOf(null, "a"));
        assertEquals(-1, StringUtils.indexOf("abc", null));
        assertEquals(0, StringUtils.indexOf("abc", "a"));
        assertEquals(1, StringUtils.indexOf("abc", "bc"));
        assertEquals(-1, StringUtils.indexOf("abc", "z"));
        assertEquals(0, StringUtils.indexOf("", ""));
    }

    @Test
    public void testIndexOfIgnoreCase() {
        assertEquals(-1, StringUtils.indexOfIgnoreCase(null, "a"));
        assertEquals(0, StringUtils.indexOfIgnoreCase("ABC", "a"));
        assertEquals(1, StringUtils.indexOfIgnoreCase("aBCb", "bc"));
    }

    @Test
    public void testIndexOfAny() {
        assertEquals(-1, StringUtils.indexOfAny(null, "abc"));
        assertEquals(-1, StringUtils.indexOfAny("abc", (String) null));
        assertEquals(0, StringUtils.indexOfAny("abc", "a"));
        assertEquals(1, StringUtils.indexOfAny("abc", "b"));
    }

    @Test
    public void testContains() {
        assertFalse(StringUtils.contains(null, 'a'));
        assertFalse(StringUtils.contains("", 'a'));
        assertTrue(StringUtils.contains("abc", 'a'));
        assertFalse(StringUtils.contains("abc", 'z'));
    }

    @Test
    public void testContainsString() {
        assertFalse(StringUtils.contains(null, "a"));
        assertFalse(StringUtils.contains("abc", null));
        assertTrue(StringUtils.contains("abc", "a"));
        assertFalse(StringUtils.contains("abc", "z"));
    }

    @Test
    public void testContainsIgnoreCase() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        assertFalse(StringUtils.containsIgnoreCase("abc", null));
        assertTrue(StringUtils.containsIgnoreCase("ABC", "a"));
    }

    @Test
    public void testContainsWhitespace() {
        assertFalse(StringUtils.containsWhitespace(null));
        assertTrue(StringUtils.containsWhitespace("a b"));
        assertFalse(StringUtils.containsWhitespace("ab"));
    }

    @Test
    public void testIndexOfAnyChars() {
        assertEquals(-1, StringUtils.indexOfAny(null, "abc"));
        assertEquals(-1, StringUtils.indexOfAny("abc", (String) null));
        assertEquals(0, StringUtils.indexOfAny("abc", "a"));
    }

    @Test
    public void testContainsAny() {
        assertFalse(StringUtils.containsAny(null, "abc"));
        assertFalse(StringUtils.containsAny("abc", null));
        assertTrue(StringUtils.containsAny("abc", "a"));
        assertFalse(StringUtils.containsAny("abc", "z"));
    }

    @Test
    public void testContainsOnly() {
        assertFalse(StringUtils.containsOnly(null, "abc"));
        assertTrue(StringUtils.containsOnly("", "abc"));
        assertTrue(StringUtils.containsOnly("abc", "abc"));
        assertFalse(StringUtils.containsOnly("abc", "ab"));
        assertFalse(StringUtils.containsOnly("abc", ""));
    }

    @Test
    public void testContainsNone() {
        assertTrue(StringUtils.containsNone(null, "abc"));
        assertTrue(StringUtils.containsNone("abc", null));
        assertTrue(StringUtils.containsNone("", "abc"));
        assertTrue(StringUtils.containsNone("abc", "def"));
        assertFalse(StringUtils.containsNone("abc", "a"));
    }

    @Test
    public void testIndexOfAnyStrings() {
        assertEquals(-1, StringUtils.indexOfAny(null, "abc"));
        assertEquals(-1, StringUtils.indexOfAny("abc", (String[]) null));
        assertEquals(0, StringUtils.indexOfAny("abc", "a"));
        assertEquals(1, StringUtils.indexOfAny("abc", "b", "c"));
        assertEquals(-1, StringUtils.indexOfAny("abc", "z"));
    }

    @Test
    public void testLastIndexOf() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
        assertEquals(-1, StringUtils.lastIndexOf("", 'a'));
        assertEquals(2, StringUtils.lastIndexOf("abc", 'c'));
        assertEquals(-1, StringUtils.lastIndexOf("abc", 'z'));
    }

    @Test
    public void testLastIndexOfString() {
        assertEquals(-1, StringUtils.lastIndexOf(null, "a"));
        assertEquals(-1, StringUtils.lastIndexOf("abc", null));
        assertEquals(1, StringUtils.lastIndexOf("abc", "bc"));
        assertEquals(-1, StringUtils.lastIndexOf("abc", "z"));
    }

    @Test
    public void testSubstring() {
        assertNull(StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("", 0));
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("bc", StringUtils.substring("abc", 1));
        assertEquals("", StringUtils.substring("abc", -1));
        assertEquals("abc", StringUtils.substring("abc", -4));
        assertEquals("abc", StringUtils.substring("abc", 0, 3));
        assertEquals("b", StringUtils.substring("abc", 1, 2));
        assertEquals("", StringUtils.substring("abc", 2, 1));
    }

    @Test
    public void testLeft() {
        assertNull(StringUtils.left(null, 0));
        assertEquals("", StringUtils.left("", 0));
        assertEquals("abc", StringUtils.left("abc", 3));
        assertEquals("ab", StringUtils.left("abc", 2));
        assertEquals("abc", StringUtils.left("abc", 5));
        assertEquals("", StringUtils.left("abc", 0));
        assertEquals("", StringUtils.left("abc", -1));
    }

    @Test
    public void testRight() {
        assertNull(StringUtils.right(null, 0));
        assertEquals("", StringUtils.right("", 0));
        assertEquals("abc", StringUtils.right("abc", 3));
        assertEquals("bc", StringUtils.right("abc", 2));
        assertEquals("abc", StringUtils.right("abc", 5));
        assertEquals("", StringUtils.right("abc", 0));
        assertEquals("", StringUtils.right("abc", -1));
    }

    @Test
    public void testMid() {
        assertNull(StringUtils.mid(null, 0, 0));
        assertEquals("", StringUtils.mid("", 0, 0));
        assertEquals("b", StringUtils.mid("abc", 1, 1));
        assertEquals("abc", StringUtils.mid("abc", 0, 3));
        assertEquals("abc", StringUtils.mid("abc", 0, 5));
        assertEquals("", StringUtils.mid("abc", 0, -1));
        assertEquals("", StringUtils.mid("abc", 5, 2));
    }

    @Test
    public void testSubstringBefore() {
        assertEquals(null, StringUtils.substringBefore(null, "a"));
        assertEquals("", StringUtils.substringBefore("", "a"));
        assertEquals("", StringUtils.substringBefore("abc", "a"));
        assertEquals("a", StringUtils.substringBefore("abcba", "b"));
        assertEquals("", StringUtils.substringBefore("abc", "z"));
    }

    @Test
    public void testSubstringAfter() {
        assertEquals(null, StringUtils.substringAfter(null, "a"));
        assertEquals("", StringUtils.substringAfter("", "a"));
        assertEquals("bc", StringUtils.substringAfter("abc", "a"));
        assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
        assertEquals("", StringUtils.substringAfter("abc", "z"));
    }

    @Test
    public void testSubstringBetween() {
        assertNull(StringUtils.substringBetween(null, "a"));
        assertNull(StringUtils.substringBetween("", "a"));
        assertEquals("b", StringUtils.substringBetween("abc", "a", "c"));
        assertNull(StringUtils.substringBetween("abc", "a", "z"));
        assertNull(StringUtils.substringBetween("abc", "z"));
        assertNull(StringUtils.substringBetween("abc", "a", null));
    }

    @Test
    public void testSplit() {
        assertNull(StringUtils.split(null));
        assertArrayEquals(new String[0], StringUtils.split(""));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a b c"));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a  b  c"));
        assertArrayEquals(new String[]{"abc"}, StringUtils.split("abc"));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a,b,c", ','));
    }

    @Test
    public void testSplitByWholeSeparator() {
        assertNull(StringUtils.splitByWholeSeparator(null, "a"));
        assertArrayEquals(new String[0], StringUtils.splitByWholeSeparator("", "a"));
        assertArrayEquals(new String[]{"a", "b"}, StringUtils.splitByWholeSeparator("a--b", "--"));
    }

    @Test
    public void testSplitPreserveAllTokens() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
        assertArrayEquals(new String[]{"a", "", "b"}, StringUtils.splitPreserveAllTokens("a,,b"));
    }

    @Test
    public void testSplitByCharacterType() {
        assertNull(StringUtils.splitByCharacterType(null));
        assertArrayEquals(new String[0], StringUtils.splitByCharacterType(""));
        assertArrayEquals(new String[]{"ab", "12", "cd"}, StringUtils.splitByCharacterType("ab12cd"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase() {
        assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
        assertArrayEquals(new String[]{"ab", "12", "Cd"}, StringUtils.splitByCharacterTypeCamelCase("ab12Cd"));
    }

    @Test
    public void testJoin() {
        assertNull(StringUtils.join((Object[]) null));
        assertEquals("", StringUtils.join(new Object[0]));
        assertEquals("a", StringUtils.join(new Object[]{"a"}));
        assertEquals("a,b", StringUtils.join(new Object[]{"a", "b"}, ','));
        assertEquals("a, b", StringUtils.join(new Object[]{"a", "b"}, ", "));
        assertEquals("a, b", StringUtils.join(new Object[]{"a", "b"}, ", ", 0, 2));
    }

    @Test
    public void testDeleteWhitespace() {
        assertNull(StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("abc", StringUtils.deleteWhitespace("  a  b  c  "));
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));
    }

    @Test
    public void testReplace() {
        assertNull(StringUtils.replace(null, "a", "b"));
        assertEquals("", StringUtils.replace("", "a", "b"));
        assertEquals("abc", StringUtils.replace("abc", "a", "b"));
        assertEquals("bbc", StringUtils.replace("abc", "a", "b"));
        assertEquals("abc", StringUtils.replace("abc", "z", "b"));
        assertEquals("abc", StringUtils.replace("abc", "a", null));
    }

    @Test
    public void testReplaceOnce() {
        assertNull(StringUtils.replaceOnce(null, "a", "b"));
        assertEquals("", StringUtils.replaceOnce("", "a", "b"));
        assertEquals("bbc", StringUtils.replaceOnce("abc", "a", "b"));
        assertEquals("abc", StringUtils.replaceOnce("abc", "z", "b"));
    }

    @Test
    public void testReplaceChars() {
        assertNull(StringUtils.replaceChars(null, "a", "b"));
        assertEquals("", StringUtils.replaceChars("", "a", "b"));
        assertEquals("abc", StringUtils.replaceChars("abc", "a", "b"));
        assertEquals("bbc", StringUtils.replaceChars("abc", "a", "b"));
        assertEquals("abc", StringUtils.replaceChars("abc", "z", "b"));
    }

    @Test
    public void testOverlay() {
        assertNull(StringUtils.overlay(null, "a", 0, 0));
        assertEquals("", StringUtils.overlay("", "a", 0, 0));
        assertEquals("a", StringUtils.overlay("abc", "a", 0, 3));
        assertEquals("abc", StringUtils.overlay("abc", "a", 0, 0));
    }

    @Test
    public void testChomp() {
        assertEquals("abc", StringUtils.chomp("abc\n"));
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc", StringUtils.chomp("abc\r"));
        assertEquals("abc", StringUtils.chomp("abc"));
    }

    @Test
    public void testChop() {
        assertEquals("", StringUtils.chop(""));
        assertEquals("", StringUtils.chop("a"));
        assertEquals("ab", StringUtils.chop("abc"));
    }

    @Test
    public void testRepeat() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("", 2));
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("abab", StringUtils.repeat("ab", 2));
        assertEquals("", StringUtils.repeat("a", 0));
        assertEquals("", StringUtils.repeat("a", -1));
    }

    @Test
    public void testRepeatStringSeparator() {
        assertNull(StringUtils.repeat(null, ",", 2));
        assertEquals("a,a", StringUtils.repeat("a", ",", 2));
        assertEquals("", StringUtils.repeat("a", ",", 0));
        assertEquals("", StringUtils.repeat("a", ",", -1));
    }

    @Test
    public void testRightPad() {
        assertNull(StringUtils.rightPad(null, 2));
        assertEquals("", StringUtils.rightPad("", 2));
        assertEquals("ab", StringUtils.rightPad("a", 2));
        assertEquals("a ", StringUtils.rightPad("a", 2, ' '));
        assertEquals("aa", StringUtils.rightPad("a", 2, 'b'));
        assertEquals("ab", StringUtils.rightPad("a", 3, "bc"));
        assertEquals("a", StringUtils.rightPad("a", 0));
        assertEquals("a", StringUtils.rightPad("a", -1));
    }

    @Test
    public void testLeftPad() {
        assertNull(StringUtils.leftPad(null, 2));
        assertEquals("  ", StringUtils.leftPad("", 2));
        assertEquals(" a", StringUtils.leftPad("a", 2));
        assertEquals("ba", StringUtils.leftPad("a", 2, "bc"));
        assertEquals("a", StringUtils.leftPad("a", 0));
        assertEquals("a", StringUtils.leftPad("a", -1));
    }

    @Test
    public void testCenter() {
        assertNull(StringUtils.center(null, 2));
        assertEquals("  ", StringUtils.center("", 2));
        assertEquals(" a ", StringUtils.center("a", 3));
        assertEquals("aa", StringUtils.center("a", 2, "ba"));
        assertEquals("a", StringUtils.center("a", 0));
        assertEquals("a", StringUtils.center("a", -1));
    }

    @Test
    public void testUpperCase() {
        assertNull(StringUtils.upperCase(null));
        assertEquals("ABC", StringUtils.upperCase("abc"));
        assertEquals("ABC", StringUtils.upperCase("ABC"));
    }

    @Test
    public void testLowerCase() {
        assertNull(StringUtils.lowerCase(null));
        assertEquals("abc", StringUtils.lowerCase("ABC"));
        assertEquals("abc", StringUtils.lowerCase("abc"));
    }

    @Test
    public void testCapitalize() {
        assertNull(StringUtils.capitalize(null));
        assertEquals("", StringUtils.capitalize(""));
        assertEquals("Abc", StringUtils.capitalize("abc"));
        assertEquals("ABC", StringUtils.capitalize("ABC"));
    }

    @Test
    public void testUncapitalize() {
        assertNull(StringUtils.uncapitalize(null));
        assertEquals("", StringUtils.uncapitalize(""));
        assertEquals("abc", StringUtils.uncapitalize("Abc"));
        assertEquals("aBC", StringUtils.uncapitalize("ABC"));
    }

    @Test
    public void testSwapCase() {
        assertNull(StringUtils.swapCase(null));
        assertEquals("", StringUtils.swapCase(""));
        assertEquals("aBC", StringUtils.swapCase("Abc"));
        assertEquals("Abc", StringUtils.swapCase("aBC"));
        assertEquals("a-bc", StringUtils.swapCase("a-BC"));
    }

    @Test
    public void testCountMatches() {
        assertEquals(0, StringUtils.countMatches(null, 'a'));
        assertEquals(0, StringUtils.countMatches("", 'a'));
        assertEquals(2, StringUtils.countMatches("abca", 'a'));
        assertEquals(1, StringUtils.countMatches("abca", 'b'));
        assertEquals(0, StringUtils.countMatches("abca", 'z'));
    }

    @Test
    public void testIsAlpha() {
        assertFalse(StringUtils.isAlpha(null));
        assertFalse(StringUtils.isAlpha(""));
        assertTrue(StringUtils.isAlpha("abc"));
        assertFalse(StringUtils.isAlpha("abc1"));
    }

    @Test
    public void testIsAlphanumeric() {
        assertFalse(StringUtils.isAlphanumeric(null));
        assertFalse(StringUtils.isAlphanumeric(""));
        assertTrue(StringUtils.isAlphanumeric("abc123"));
        assertFalse(StringUtils.isAlphanumeric("abc 123"));
    }

    @Test
    public void testIsNumeric() {
        assertFalse(StringUtils.isNumeric(null));
        assertFalse(StringUtils.isNumeric(""));
        assertTrue(StringUtils.isNumeric("123"));
        assertFalse(StringUtils.isNumeric("123 "));
    }

    @Test
    public void testIsWhitespace() {
        assertFalse(StringUtils.isWhitespace(null));
        assertFalse(StringUtils.isWhitespace(""));
        assertTrue(StringUtils.isWhitespace("   "));
        assertFalse(StringUtils.isWhitespace(" a "));
    }

    @Test
    public void testDefaultString() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("", StringUtils.defaultString(""));
        assertEquals("abc", StringUtils.defaultString("abc"));
    }

    @Test
    public void testReverse() {
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    @Test
    public void testAbbreviate() {
        assertNull(StringUtils.abbreviate(null, 4));
        assertEquals("", StringUtils.abbreviate("", 4));
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
        assertEquals("...", StringUtils.abbreviate("abcdefg", 3));
        assertEquals("a...", StringUtils.abbreviate("abcdefg", 4));
        assertEquals("...", StringUtils.abbreviate("abcdefg", 1));
    }

    @Test
    public void testDifference() {
        assertEquals("abc", StringUtils.difference("abc", "abc"));
        assertEquals("def", StringUtils.difference("abc", "abcdef"));
        assertEquals("", StringUtils.difference("abcdef", "abc"));
    }

    @Test
    public void testIndexOfDifference() {
        assertEquals(-1, StringUtils.indexOfDifference("abc", "abc"));
        assertEquals(3, StringUtils.indexOfDifference("abc", "abcdef"));
        assertEquals(3, StringUtils.indexOfDifference("abcdef", "abc"));
        assertEquals(0, StringUtils.indexOfDifference("", "abc"));
        assertEquals(0, StringUtils.indexOfDifference("abc", ""));
    }

    @Test
    public void testGetCommonPrefix() {
        assertEquals("", StringUtils.getCommonPrefix());
        assertEquals("", StringUtils.getCommonPrefix((String) null));
        assertEquals("", StringUtils.getCommonPrefix(""));
        assertEquals("abc", StringUtils.getCommonPrefix("abcdef", "abcxyz"));
        assertEquals("", StringUtils.getCommonPrefix("abcdef", ""));
    }

    @Test
    public void testGetLevenshteinDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("a", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
        assertEquals(1, StringUtils.getLevenshteinDistance("abc", "abd"));
        assertEquals(3, StringUtils.getLevenshteinDistance("kitten", "sitting"));
    }

    @Test
    public void testStartsWith() {
        assertFalse(StringUtils.startsWith(null, "a"));
        assertFalse(StringUtils.startsWith("abc", null));
        assertFalse(StringUtils.startsWith("", "a"));
        assertTrue(StringUtils.startsWith("abc", "ab"));
        assertFalse(StringUtils.startsWith("abc", "bc"));
    }

    @Test
    public void testStartsWithIgnoreCase() {
        assertFalse(StringUtils.startsWithIgnoreCase(null, "a"));
        assertTrue(StringUtils.startsWithIgnoreCase("abc", "AB"));
    }

    @Test
    public void testEndsWith() {
        assertFalse(StringUtils.endsWith(null, "a"));
        assertFalse(StringUtils.endsWith("abc", null));
        assertFalse(StringUtils.endsWith("", "a"));
        assertTrue(StringUtils.endsWith("abc", "bc"));
        assertFalse(StringUtils.endsWith("abc", "ab"));
    }

    @Test
    public void testEndsWithIgnoreCase() {
        assertFalse(StringUtils.endsWithIgnoreCase(null, "a"));
        assertTrue(StringUtils.endsWithIgnoreCase("abc", "BC"));
    }

    @Test
    public void testNormalizeSpace() {
        assertNull(StringUtils.normalizeSpace(null));
        assertEquals("", StringUtils.normalizeSpace(""));
        assertEquals("a b", StringUtils.normalizeSpace("  a   b  "));
        assertEquals("a b", StringUtils.normalizeSpace("a b"));
    }

    @Test
    public void testLength() {
        assertEquals(0, StringUtils.length(null));
        assertEquals(0, StringUtils.length(""));
        assertEquals(3, StringUtils.length("abc"));
    }

    @Test
    public void testIsAllUpperCase() {
        assertFalse(StringUtils.isAllUpperCase(null));
        assertFalse(StringUtils.isAllUpperCase(""));
        assertTrue(StringUtils.isAllUpperCase("ABC"));
        assertFalse(StringUtils.isAllUpperCase("AbC"));
    }

    @Test
    public void testIsAllLowerCase() {
        assertFalse(StringUtils.isAllLowerCase(null));
        assertFalse(StringUtils.isAllLowerCase(""));
        assertTrue(StringUtils.isAllLowerCase("abc"));
        assertFalse(StringUtils.isAllLowerCase("aBc"));
    }

    @Test
    public void testIsMixedCase() {
        assertFalse(StringUtils.isMixedCase(null));
        assertFalse(StringUtils.isMixedCase(""));
        assertFalse(StringUtils.isMixedCase("abc"));
        assertTrue(StringUtils.isMixedCase("aBc"));
    }

    @Test
    public void testIsNumericSpace() {
        assertFalse(StringUtils.isNumericSpace(null));
        assertFalse(StringUtils.isNumericSpace(""));
        assertTrue(StringUtils.isNumericSpace("123 456"));
        assertFalse(StringUtils.isNumericSpace("123a"));
    }

    @Test
    public void testIsAlphanumericSpace() {
        assertFalse(StringUtils.isAlphanumericSpace(null));
        assertFalse(StringUtils.isAlphanumericSpace(""));
        assertTrue(StringUtils.isAlphanumericSpace("abc 123"));
        assertFalse(StringUtils.isAlphanumericSpace("abc!"));
    }

    @Test
    public void testIsAlphaSpace() {
        assertFalse(StringUtils.isAlphaSpace(null));
        assertFalse(StringUtils.isAlphaSpace(""));
        assertTrue(StringUtils.isAlphaSpace("abc def"));
        assertFalse(StringUtils.isAlphaSpace("abc1"));
    }

    @Test
    public void testIsAsciiPrintable() {
        assertFalse(StringUtils.isAsciiPrintable(null));
        assertTrue(StringUtils.isAsciiPrintable(""));
        assertTrue(StringUtils.isAsciiPrintable("abc"));
        assertFalse(StringUtils.isAsciiPrintable("\u0000"));
    }

    @Test
    public void testRemoveStart() {
        assertNull(StringUtils.removeStart(null, "a"));
        assertEquals("bc", StringUtils.removeStart("abc", "a"));
        assertEquals("abc", StringUtils.removeStart("abc", "b"));
        assertEquals("abc", StringUtils.removeStart("abc", ""));
    }

    @Test
    public void testRemoveEnd() {
        assertNull(StringUtils.removeEnd(null, "a"));
        assertEquals("ab", StringUtils.removeEnd("abc", "c"));
        assertEquals("abc", StringUtils.removeEnd("abc", "b"));
        assertEquals("abc", StringUtils.removeEnd("abc", ""));
    }

    @Test
    public void testRemove() {
        assertNull(StringUtils.remove(null, "a"));
        assertEquals("bc", StringUtils.remove("abc", "a"));
        assertEquals("abc", StringUtils.remove("abc", "z"));
    }

    @Test
    public void testRemoveIgnoreCase() {
        assertNull(StringUtils.removeIgnoreCase(null, "a"));
        assertEquals("bc", StringUtils.removeIgnoreCase("abc", "A"));
        assertEquals("abc", StringUtils.removeIgnoreCase("abc", "z"));
    }

    @Test
    public void testRemoveStartIgnoreCase() {
        assertNull(StringUtils.removeStartIgnoreCase(null, "a"));
        assertEquals("bc", StringUtils.removeStartIgnoreCase("abc", "A"));
        assertEquals("abc", StringUtils.removeStartIgnoreCase("abc", "b"));
    }

    @Test
    public void testRemoveEndIgnoreCase() {
        assertNull(StringUtils.removeEndIgnoreCase(null, "a"));
        assertEquals("ab", StringUtils.removeEndIgnoreCase("abc", "C"));
        assertEquals("abc", StringUtils.removeEndIgnoreCase("abc", "b"));
    }

    @Test
    public void testDecode() {
        assertNull(StringUtils.decode(null));
        assertEquals("abc", StringUtils.decode("abc"));
        assertEquals("a b", StringUtils.decode("a+20b"));
    }

    @Test
    public void testEncode() {
        assertNull(StringUtils.encode(null));
        assertEquals("abc", StringUtils.encode("abc"));
        assertEquals("a b", StringUtils.encode("a b"));
    }
}