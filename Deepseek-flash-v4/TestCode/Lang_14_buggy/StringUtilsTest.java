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
        assertFalse(StringUtils.isEmpty("bob"));
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
        assertEquals("", StringUtils.trimToEmpty("   "));
        assertEquals("abc", StringUtils.trimToEmpty("  abc  "));
    }

    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("abc", StringUtils.strip("  abc  "));
        assertEquals("abc", StringUtils.strip("  abc  ", null));
        assertEquals("abc", StringUtils.strip("  abc  ", " "));
        assertEquals("abc", StringUtils.strip("  abc  ", ""));
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
    public void testStripAll() {
        assertNull(StringUtils.stripAll((String[]) null));
        assertArrayEquals(new String[]{"abc"}, StringUtils.stripAll("  abc  "));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.stripAll(" abc ", " def "));
        assertArrayEquals(new String[]{"abc", null}, StringUtils.stripAll(" abc ", null));
    }

    @Test
    public void testStripAccents() {
        assertNull(StringUtils.stripAccents(null));
        assertEquals("", StringUtils.stripAccents(""));
        assertEquals("cafe", StringUtils.stripAccents("café"));
        assertEquals("AAAA", StringUtils.stripAccents("\u00C0\u00C1\u00C2\u00C3"));
    }

    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "abd"));
    }

    @Test
    public void testIndexOf() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(1, StringUtils.indexOf("abc", 'b'));
        assertEquals(-1, StringUtils.indexOf("abc", 'd'));
    }

    @Test
    public void testIndexOfString() {
        assertEquals(-1, StringUtils.indexOf(null, "a"));
        assertEquals(-1, StringUtils.indexOf("", "a"));
        assertEquals(1, StringUtils.indexOf("abc", "bc"));
        assertEquals(-1, StringUtils.indexOf("abc", "cd"));
        assertEquals(0, StringUtils.indexOf("abc", ""));
    }

    @Test
    public void testOrdinalIndexOf() {
        assertEquals(1, StringUtils.ordinalIndexOf("abab", "ab", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("abab", "ab", 3));
        assertEquals(0, StringUtils.ordinalIndexOf("abab", "ab", 1));
    }

    @Test
    public void testIndexOfIgnoreCase() {
        assertEquals(1, StringUtils.indexOfIgnoreCase("aBc", "B"));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("abc", "d"));
        assertEquals(0, StringUtils.indexOfIgnoreCase("ABC", "a"));
    }

    @Test
    public void testContains() {
        assertFalse(StringUtils.contains(null, 'a'));
        assertFalse(StringUtils.contains("", 'a'));
        assertTrue(StringUtils.contains("abc", 'b'));
        assertFalse(StringUtils.contains("abc", 'd'));
    }

    @Test
    public void testContainsString() {
        assertFalse(StringUtils.contains(null, "a"));
        assertFalse(StringUtils.contains("", "a"));
        assertTrue(StringUtils.contains("abc", "bc"));
        assertFalse(StringUtils.contains("abc", "cd"));
    }

    @Test
    public void testIndexOfAny() {
        assertEquals(1, StringUtils.indexOfAny("abc", "bcd"));
        assertEquals(-1, StringUtils.indexOfAny("abc", "xyz"));
        assertEquals(-1, StringUtils.indexOfAny(null, "xyz"));
    }

    @Test
    public void testContainsAny() {
        assertTrue(StringUtils.containsAny("abc", "b"));
        assertFalse(StringUtils.containsAny("abc", "d"));
    }

    @Test
    public void testContainsOnly() {
        assertFalse(StringUtils.containsOnly("abc", "ab"));
        assertTrue(StringUtils.containsOnly("ab", "ab"));
        assertFalse(StringUtils.containsOnly("abc", "ab"));
    }

    @Test
    public void testContainsNone() {
        assertTrue(StringUtils.containsNone("abc", "def"));
        assertFalse(StringUtils.containsNone("abc", "bcd"));
    }

    @Test
    public void testIndexOfAnyStrings() {
        assertEquals(2, StringUtils.indexOfAny("hello", new String[]{"lo", "hel"}));
        assertEquals(-1, StringUtils.indexOfAny("hello", new String[]{"xyz"}));
    }

    @Test
    public void testSubstring() {
        assertEquals("bc", StringUtils.substring("abcd", 1, 3));
        assertEquals("abc", StringUtils.substring("abcd", -3, 4));
        assertEquals("abcd", StringUtils.substring("abcd", -3, -1));
        assertEquals("", StringUtils.substring("abcd", 2, 2));
        assertEquals("", StringUtils.substring(null, 0));
    }

    @Test
    public void testLeft() {
        assertEquals("ab", StringUtils.left("abc", 2));
        assertEquals("abc", StringUtils.left("abc", 5));
        assertEquals("", StringUtils.left(null, 2));
    }

    @Test
    public void testRight() {
        assertEquals("bc", StringUtils.right("abc", 2));
        assertEquals("abc", StringUtils.right("abc", 5));
        assertEquals("", StringUtils.right(null, 2));
    }

    @Test
    public void testMid() {
        assertEquals("bc", StringUtils.mid("abcd", 1, 2));
        assertEquals("bcd", StringUtils.mid("abcd", 1, 5));
        assertEquals("", StringUtils.mid(null, 1, 2));
    }

    @Test
    public void testSubstringBefore() {
        assertEquals("ab", StringUtils.substringBefore("abcd", "cd"));
        assertEquals("abc", StringUtils.substringBefore("abc", "z"));
        assertEquals("", StringUtils.substringBefore("abc", "a"));
    }

    @Test
    public void testSubstringAfter() {
        assertEquals("cd", StringUtils.substringAfter("abcd", "ab"));
        assertEquals("bcd", StringUtils.substringAfter("abcd", "a"));
        assertEquals("", StringUtils.substringAfter("abcd", "z"));
    }

    @Test
    public void testSubstringBetween() {
        assertEquals("bc", StringUtils.substringBetween("abcd", "a", "d"));
        assertEquals("b", StringUtils.substringBetween("abcd", "a", "c"));
        assertNull(StringUtils.substringBetween("abcd", "z", "d"));
    }

    @Test
    public void testSplit() {
        assertArrayEquals(new String[]{"ab", "cd"}, StringUtils.split("ab cd"));
        assertArrayEquals(new String[0], StringUtils.split(""));
        assertNull(StringUtils.split(null));
        assertArrayEquals(new String[]{"ab", "cd"}, StringUtils.split("ab cd", ' '));
    }

    @Test
    public void testSplitByWholeSeparator() {
        assertArrayEquals(new String[]{"ab", "cd"}, StringUtils.splitByWholeSeparator("ab--cd", "--"));
        assertArrayEquals(new String[]{"ab", "cd"}, StringUtils.splitByWholeSeparator("ab cd", " "));
    }

    @Test
    public void testSplitPreserveAllTokens() {
        assertArrayEquals(new String[]{"ab", "", "cd"}, StringUtils.splitPreserveAllTokens("ab  cd", ' '));
    }

    @Test
    public void testSplitByCharacterType() {
        assertArrayEquals(new String[]{"abc", " ", "def"}, StringUtils.splitByCharacterType("abc def"));
        assertArrayEquals(new String[]{"a", "B", "C"}, StringUtils.splitByCharacterTypeCamelCase("aBC"));
    }

    @Test
    public void testJoin() {
        assertEquals("ab", StringUtils.join(new Object[]{"a", "b"}));
        assertEquals("a,b", StringUtils.join(new Object[]{"a", "b"}, ','));
        assertEquals("", StringUtils.join(new Object[]{}));
        assertNull(StringUtils.join((Object[]) null));
        assertEquals("a-b", StringUtils.join(new Object[]{"a", "b"}, "-"));
    }

    @Test
    public void testDeleteWhitespace() {
        assertEquals("abc", StringUtils.deleteWhitespace("  a b c  "));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertNull(StringUtils.deleteWhitespace(null));
    }

    @Test
    public void testReplace() {
        assertEquals("aXc", StringUtils.replace("abc", "b", "X"));
        assertEquals("abc", StringUtils.replace("abc", "z", "X"));
        assertNull(StringUtils.replace(null, "a", "b"));
    }

    @Test
    public void testReplaceOnce() {
        assertEquals("aXc", StringUtils.replaceOnce("abc", "b", "X"));
        assertEquals("abc", StringUtils.replaceOnce("abc", "z", "X"));
    }

    @Test
    public void testReplaceChars() {
        assertEquals("aXc", StringUtils.replaceChars("abc", 'b', 'X'));
        assertEquals("abc", StringUtils.replaceChars("abc", 'z', 'X'));
    }

    @Test
    public void testOverlay() {
        assertEquals("abXXd", StringUtils.overlay("abcd", "XX", 2, 2));
        assertEquals("XXcd", StringUtils.overlay("abcd", "XX", 0, 2));
        assertEquals("abXX", StringUtils.overlay("abcd", "XX", 2, 5));
        assertEquals("XXabcd", StringUtils.overlay("abcd", "XX", -1, 2));
        assertEquals("abXX", StringUtils.overlay("abcd", "XX", 0, 5));
    }

    @Test
    public void testChomp() {
        assertEquals("abc", StringUtils.chomp("abc\n"));
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc", StringUtils.chomp("abc\r"));
        assertEquals("abc", StringUtils.chomp("abc"));
        assertNull(StringUtils.chomp(null));
        assertEquals("", StringUtils.chomp(""));
    }

    @Test
    public void testChop() {
        assertEquals("ab", StringUtils.chop("abc"));
        assertEquals("", StringUtils.chop("a"));
        assertNull(StringUtils.chop(null));
        assertEquals("", StringUtils.chop(""));
    }

    @Test
    public void testRepeat() {
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("", StringUtils.repeat("a", 0));
        assertEquals("", StringUtils.repeat("a", -1));
        assertEquals("", StringUtils.repeat(null, 3));
        assertEquals("abab", StringUtils.repeat("ab", 2));
    }

    @Test
    public void testRepeatWithSeparator() {
        assertEquals("a,a,a", StringUtils.repeat("a", ",", 3));
        assertEquals("", StringUtils.repeat("a", ",", 0));
        assertEquals("a", StringUtils.repeat("a", ",", 1));
    }

    @Test
    public void testRightPad() {
        assertEquals("ab   ", StringUtils.rightPad("ab", 5));
        assertEquals("ab", StringUtils.rightPad("ab", 2));
        assertEquals("abaaa", StringUtils.rightPad("ab", 5, 'a'));
        assertEquals("ab", StringUtils.rightPad("ab", -1));
        assertEquals("", StringUtils.rightPad("", 0));
    }

    @Test
    public void testLeftPad() {
        assertEquals("   ab", StringUtils.leftPad("ab", 5));
        assertEquals("ab", StringUtils.leftPad("ab", 2));
        assertEquals("aaaab", StringUtils.leftPad("ab", 5, 'a'));
        assertEquals("ab", StringUtils.leftPad("ab", -1));
        assertEquals("", StringUtils.leftPad("", 0));
    }

    @Test
    public void testCenter() {
        assertEquals("  ab  ", StringUtils.center("ab", 6));
        assertEquals("ab", StringUtils.center("ab", 2));
        assertEquals("  ab  ", StringUtils.center("ab", 6, ' '));
        assertEquals("", StringUtils.center("", 0));
        assertEquals("ab", StringUtils.center("ab", -1));
    }

    @Test
    public void testUpperCase() {
        assertEquals("ABC", StringUtils.upperCase("abc"));
        assertNull(StringUtils.upperCase(null));
        assertEquals("ABC", StringUtils.upperCase("abc", Locale.ENGLISH));
    }

    @Test
    public void testLowerCase() {
        assertEquals("abc", StringUtils.lowerCase("ABC"));
        assertNull(StringUtils.lowerCase(null));
        assertEquals("abc", StringUtils.lowerCase("ABC", Locale.ENGLISH));
    }

    @Test
    public void testCapitalize() {
        assertEquals("Abc", StringUtils.capitalize("abc"));
        assertNull(StringUtils.capitalize(null));
        assertEquals("Abc", StringUtils.capitalize("a"));
    }

    @Test
    public void testUncapitalize() {
        assertEquals("abc", StringUtils.uncapitalize("Abc"));
        assertNull(StringUtils.uncapitalize(null));
        assertEquals("", StringUtils.uncapitalize(""));
    }

    @Test
    public void testSwapCase() {
        assertEquals("aBC", StringUtils.swapCase("Abc"));
        assertNull(StringUtils.swapCase(null));
        assertEquals("", StringUtils.swapCase(""));
    }

    @Test
    public void testCountMatches() {
        assertEquals(2, StringUtils.countMatches("abab", 'a'));
        assertEquals(0, StringUtils.countMatches("abab", 'z'));
        assertEquals(0, StringUtils.countMatches(null, 'a'));
    }

    @Test
    public void testDefaultString() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("abc", StringUtils.defaultString("abc"));
        assertEquals("def", StringUtils.defaultString(null, "def"));
        assertEquals("abc", StringUtils.defaultString("abc", "def"));
    }

    @Test
    public void testDefaultIfBlank() {
        assertEquals("def", StringUtils.defaultIfBlank(null, "def"));
        assertEquals("def", StringUtils.defaultIfBlank("", "def"));
        assertEquals("def", StringUtils.defaultIfBlank(" ", "def"));
        assertEquals("abc", StringUtils.defaultIfBlank("abc", "def"));
    }

    @Test
    public void testDefaultIfEmpty() {
        assertEquals("def", StringUtils.defaultIfEmpty(null, "def"));
        assertEquals("def", StringUtils.defaultIfEmpty("", "def"));
        assertEquals(" ", StringUtils.defaultIfEmpty(" ", "def"));
        assertEquals("abc", StringUtils.defaultIfEmpty("abc", "def"));
    }

    @Test
    public void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"));
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    public void testAbbreviate() {
        assertEquals("...", StringUtils.abbreviate("abcdef", 3));
        assertEquals("abc...", StringUtils.abbreviate("abcdefgh", 6));
        assertEquals("...fgh", StringUtils.abbreviate("abcdefgh", 4, 6));
        assertEquals("abcd", StringUtils.abbreviate("abcd", 4));
    }

    @Test
    public void testDifference() {
        assertEquals("def", StringUtils.difference("abc", "abcdef"));
        assertEquals("", StringUtils.difference("abcdef", "abc"));
        assertNull(StringUtils.difference(null, "abc"));
        assertNull(StringUtils.difference("abc", null));
        assertEquals("", StringUtils.difference("abc", "abc"));
    }

    @Test
    public void testGetCommonPrefix() {
        assertEquals("ab", StringUtils.getCommonPrefix("ab", "abc", "abd"));
        assertEquals("", StringUtils.getCommonPrefix("", "abc"));
        assertEquals("", StringUtils.getCommonPrefix("abc", "def"));
        assertEquals("abc", StringUtils.getCommonPrefix("abc"));
    }

    @Test
    public void testGetLevenshteinDistance() {
        assertEquals(3, StringUtils.getLevenshteinDistance("kitten", "sitting"));
        assertEquals(0, StringUtils.getLevenshteinDistance("abc", "abc"));
        assertEquals(3, StringUtils.getLevenshteinDistance("", "abc"));
        assertEquals(3, StringUtils.getLevenshteinDistance("kitten", ""));
        assertEquals(-1, StringUtils.getLevenshteinDistance("abc", "abcdef", 3));
    }

    @Test
    public void testStartsWith() {
        assertTrue(StringUtils.startsWith("abc", "ab"));
        assertFalse(StringUtils.startsWith("abc", "bc"));
        assertTrue(StringUtils.startsWith(null, null));
        assertFalse(StringUtils.startsWith(null, "ab"));
    }

    @Test
    public void testStartsWithIgnoreCase() {
        assertTrue(StringUtils.startsWithIgnoreCase("abc", "AB"));
        assertFalse(StringUtils.startsWithIgnoreCase("abc", "bc"));
        assertTrue(StringUtils.startsWithIgnoreCase(null, null));
    }

    @Test
    public void testEndsWith() {
        assertTrue(StringUtils.endsWith("abc", "bc"));
        assertFalse(StringUtils.endsWith("abc", "ab"));
        assertTrue(StringUtils.endsWith(null, null));
        assertFalse(StringUtils.endsWith(null, "ab"));
    }

    @Test
    public void testEndsWithIgnoreCase() {
        assertTrue(StringUtils.endsWithIgnoreCase("abc", "BC"));
        assertFalse(StringUtils.endsWithIgnoreCase("abc", "AB"));
        assertTrue(StringUtils.endsWithIgnoreCase(null, null));
    }

    @Test
    public void testNormalizeSpace() {
        assertEquals("a b c", StringUtils.normalizeSpace("  a   b   c  "));
        assertEquals("", StringUtils.normalizeSpace(""));
        assertNull(StringUtils.normalizeSpace(null));
        assertEquals("a", StringUtils.normalizeSpace(" a "));
    }

    @Test
    public void testIndexList() {
        assertEquals(-1, StringUtils.indexOfAny("abc", (List<Character>) null));
        assertEquals(1, StringUtils.indexOfAny("abc", Arrays.asList('b', 'z')));
    }

    @Test
    public void testStripAllVariadic() {
        assertNull(StringUtils.stripAll((String[]) null));
        assertArrayEquals(new String[]{"a", "b"}, StringUtils.stripAll(" a", " b "));
        assertArrayEquals(new String[]{"a", "b", null}, StringUtils.stripAll(" a", " b ", null));
    }

    @Test
    public void testSplitWorkerMultiple() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.split("ab cd ef", " "));
        assertArrayEquals(new String[]{"ab", "", "cd"}, StringUtils.splitPreserveAllTokens("ab  cd", ' '));
    }

    @Test
    public void testReplaceRepeatedly() {
        assertEquals("aXcXd", StringUtils.replace("abcbd", "b", "X"));
    }

    @Test
    public void testReplaceCharsString() {
        assertEquals("aXc", StringUtils.replaceChars("abc", "b", "X"));
        assertEquals("aXc", StringUtils.replaceChars("abc", "zb", "Y"));
        assertEquals("aYc", StringUtils.replaceChars("abc", "b", "YZ"));
        assertEquals("abc", StringUtils.replaceChars("abc", "", ""));
    }

    @Test
    public void testChompMultiple() {
        assertEquals("abc", StringUtils.chomp("abc\r\n\r\n"));
        assertEquals("abc", StringUtils.chomp("abc\n\n\n"));
    }

    @Test
    public void testRepeatWithSeparatorMultiple() {
        assertEquals("a, a, a", StringUtils.repeat("a", ", ", 3));
        assertEquals("a", StringUtils.repeat("a", ", ", 1));
    }

    @Test
    public void testAbbreviateOffset() {
        assertEquals("...", StringUtils.abbreviate("abcdefgh", 0, 3));
        assertEquals("abc", StringUtils.abbreviate("abcdefgh", 1, 3));
        assertEquals("...", StringUtils.abbreviate("abcdefgh", -1, 3));
    }

    @Test
    public void testDifferenceNull() {
        assertNull(StringUtils.difference(null, null));
        assertEquals("a", StringUtils.difference("a", "ba"));
    }

    @Test
    public void testGetLevenshteinDistanceNull() {
        try {
            StringUtils.getLevenshteinDistance(null, "abc");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
        try {
            StringUtils.getLevenshteinDistance("abc", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testGetCommonPrefixEmptyArray() {
        assertEquals("", StringUtils.getCommonPrefix());
    }
}