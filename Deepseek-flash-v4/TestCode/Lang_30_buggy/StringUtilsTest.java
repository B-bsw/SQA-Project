package org.apache.commons.lang3;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest {

    private static final String[] EMPTY_ARRAY = new String[0];

    @Before
    public void setUp() {
        // No setup needed for pure static methods
    }

    // ========== isEmpty ==========
    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("abc"));
    }

    // ========== isNotEmpty ==========
    @Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("abc"));
    }

    // ========== trim ==========
    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("abc", StringUtils.trim("  abc  "));
        assertEquals("a b", StringUtils.trim(" a b "));
    }

    // ========== trimToNull ==========
    @Test
    public void testTrimToNull() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertNull(StringUtils.trimToNull("   "));
        assertEquals("abc", StringUtils.trimToNull(" abc "));
    }

    // ========== trimToEmpty ==========
    @Test
    public void testTrimToEmpty() {
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty(""));
        assertEquals("hello", StringUtils.trimToEmpty("  hello  "));
    }

    // ========== strip ==========
    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("abc", StringUtils.strip("  abc  "));
        assertEquals("abc", StringUtils.strip("  abxx", "x"));
    }

    @Test
    public void testStripWithStripChars() {
        assertEquals("abc", StringUtils.strip("xxabcxx", "x"));
        assertEquals("abc", StringUtils.strip("xxabcxx", ""));
        assertEquals("xxabcxx", StringUtils.strip("xxabcxx", null));
    }

    // ========== stripStart ==========
    @Test
    public void testStripStart() {
        assertNull(StringUtils.stripStart(null, null));
        assertEquals("", StringUtils.stripStart("", ""));
        assertEquals("abc", StringUtils.stripStart("xxxabc", "x"));
        assertEquals("abc", StringUtils.stripStart("abc", "x"));
    }

    // ========== stripEnd ==========
    @Test
    public void testStripEnd() {
        assertNull(StringUtils.stripEnd(null, null));
        assertEquals("", StringUtils.stripEnd("", ""));
        assertEquals("abc", StringUtils.stripEnd("abcxxx", "x"));
        assertEquals("abc", StringUtils.stripEnd("abc", "x"));
    }

    // ========== stripAll ==========
    @Test
    public void testStripAll() {
        assertNull(StringUtils.stripAll(null));
        
        String[] input = {"  a", "b  ", " c "};
        String[] result = StringUtils.stripAll(input);
        assertArrayEquals(new String[]{"a", "b", "c"}, result);
        
        String[] result2 = StringUtils.stripAll(input, " ");
        assertArrayEquals(new String[]{"a", "b", "c"}, result2);
    }

    // ========== stripAccents ==========
    @Test
    public void testStripAccents() {
        assertNull(StringUtils.stripAccents(null));
        assertEquals("", StringUtils.stripAccents(""));
        assertEquals("hello", StringUtils.stripAccents("h\u00E9llo")); 
    }

    // ========== equals ==========
    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "abd"));
    }

    // ========== indexOf ==========
    @Test
    public void testIndexOf() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(0, StringUtils.indexOf("abc", 'a'));
        assertEquals(2, StringUtils.indexOf("abc", 'c'));
        assertEquals(-1, StringUtils.indexOf("abc", 'd'));
    }

    @Test
    public void testIndexOfString() {
        assertEquals(-1, StringUtils.indexOf(null, "a"));
        assertEquals(-1, StringUtils.indexOf("", "a"));
        assertEquals(0, StringUtils.indexOf("abc", "a"));
        assertEquals(1, StringUtils.indexOf("abc", "bc"));
        assertEquals(-1, StringUtils.indexOf("abc", "d"));
    }

    @Test
    public void testIndexOfWithStartPos() {
        assertEquals(0, StringUtils.indexOf("abcabc", "a", 0));
        assertEquals(3, StringUtils.indexOf("abcabc", "a", 1));
        assertEquals(-1, StringUtils.indexOf("abcabc", "a", 4));
    }

    // ========== lastIndexOf ==========
    @Test
    public void testLastIndexOf() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
        assertEquals(2, StringUtils.lastIndexOf("abc", 'c'));
        assertEquals(3, StringUtils.lastIndexOf("abca", 'a'));
    }

    // ========== contains ==========
    @Test
    public void testContains() {
        assertFalse(StringUtils.contains(null, 'a'));
        assertTrue(StringUtils.contains("abc", 'a'));
        assertFalse(StringUtils.contains("abc", 'd'));
    }

    @Test
    public void testContainsString() {
        assertFalse(StringUtils.contains(null, "a"));
        assertTrue(StringUtils.contains("abc", "ab"));
        assertFalse(StringUtils.contains("abc", "d"));
    }

    // ========== containsAny ==========
    @Test
    public void testContainsAny() {
        assertFalse(StringUtils.containsAny(null, new char[]{'a'}));
        assertTrue(StringUtils.containsAny("abc", new char[]{'d', 'b'}));
        assertFalse(StringUtils.containsAny("abc", new char[]{'d', 'e'}));
    }

    // ========== indexOfAny ==========
    @Test
    public void testIndexOfAny() {
        assertEquals(-1, StringUtils.indexOfAny(null, null));
        assertEquals(-1, StringUtils.indexOfAny("", new char[]{'a'}));
        assertEquals(1, StringUtils.indexOfAny("abc", new char[]{'b', 'z'}));
        assertEquals(-1, StringUtils.indexOfAny("abc", new char[]{'z', 'x'}));
    }

    // ========== substring ==========
    @Test
    public void testSubstring() {
        assertNull(StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("", 0));
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("bc", StringUtils.substring("abc", 1));
        assertNull(StringUtils.substring("abc", 4));
    }

    @Test
    public void testSubstringWithEnd() {
        assertNull(StringUtils.substring(null, 0, 2));
        assertEquals("", StringUtils.substring("abc", 0, 0));
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
        assertEquals("abc", StringUtils.substring("abc", 0, 5));
        assertEquals("bc", StringUtils.substring("abc", 1, 3));
    }

    // ========== left/right/mid ==========
    @Test
    public void testLeft() {
        assertNull(StringUtils.left(null, 1));
        assertEquals("", StringUtils.left("", 1));
        assertEquals("ab", StringUtils.left("abc", 2));
        assertEquals("abc", StringUtils.left("abc", 5));
    }

    @Test
    public void testRight() {
        assertNull(StringUtils.right(null, 1));
        assertEquals("", StringUtils.right("", 1));
        assertEquals("bc", StringUtils.right("abc", 2));
        assertEquals("abc", StringUtils.right("abc", 5));
    }

    @Test
    public void testMid() {
        assertNull(StringUtils.mid(null, 1, 2));
        assertEquals("", StringUtils.mid("abc", 0, 0));
        assertEquals("ab", StringUtils.mid("abc", 0, 2));
        assertEquals("bc", StringUtils.mid("abc", 1, 2));
    }

    // ========== substringBefore/After ==========
    @Test
    public void testSubstringBefore() {
        assertEquals("ab", StringUtils.substringBefore("abc", "c"));
        assertEquals("", StringUtils.substringBefore("abc", "a"));
        assertEquals("", StringUtils.substringBefore("abc", ""));
        assertEquals("abc", StringUtils.substringBefore("abc", "z"));
    }

    @Test
    public void testSubstringAfter() {
        assertEquals("c", StringUtils.substringAfter("abc", "ab"));
        assertNull(StringUtils.substringAfter("abc", null));
        assertEquals("", StringUtils.substringAfter("abc", "c"));
    }

    // ========== split ==========
    @Test
    public void testSplit() {
        assertNull(StringUtils.split(null));
        assertArrayEquals(EMPTY_ARRAY, StringUtils.split(""));
        assertArrayEquals(new String[]{"a", "b"}, StringUtils.split("a b"));
        assertArrayEquals(new String[]{"a", "b"}, StringUtils.split("a  b"));
    }

    @Test
    public void testSplitWithSeparator() {
        assertArrayEquals(new String[]{"a", "b"}, StringUtils.split("a,b", ","));
        assertArrayEquals(new String[]{"a", "b"}, StringUtils.split("aXXb", "XX"));
    }

    @Test
    public void testSplitPreserveAllTokens() {
        String[] result = StringUtils.splitPreserveAllTokens("a b", ' ');
        assertArrayEquals(new String[]{"a", "b"}, result);
        
        String[] result2 = StringUtils.splitPreserveAllTokens("a  b", ' ');
        assertArrayEquals(new String[]{"a", "", "b"}, result2);
    }

    // ========== join ==========
    @Test
    public void testJoin() {
        assertEquals(null, StringUtils.join((Object[]) null, ','));
        assertEquals("", StringUtils.join(new Object[]{}, ','));
        assertEquals("a", StringUtils.join(new Object[]{"a"}, ','));
        assertEquals("a,b", StringUtils.join(new Object[]{"a", "b"}, ','));
        assertEquals("a+b", StringUtils.join(new Object[]{"a", "b"}, '+'));
    }

    @Test
    public void testJoinArray() {
        assertEquals(null, StringUtils.join((Object[]) null));
        assertEquals("", StringUtils.join(new Object[]{}));
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}));
    }

    // ========== deleteWhitespace ==========
    @Test
    public void testDeleteWhitespace() {
        assertNull(StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("abc", StringUtils.deleteWhitespace("a b c"));
        assertEquals("abc", StringUtils.deleteWhitespace("  a  b  c  "));
    }

    // ========== removeStart/removeEnd ==========
    @Test
    public void testRemoveStart() {
        assertEquals("bc", StringUtils.removeStart("abc", "a"));
        assertEquals("abc", StringUtils.removeStart("abc", "z"));
        assertNull(StringUtils.removeStart(null, "a"));
        assertEquals("bc", StringUtils.removeStart("abc", ""));
    }

    @Test
    public void testRemoveEnd() {
        assertEquals("ab", StringUtils.removeEnd("abc", "c"));
        assertEquals("abc", StringUtils.removeEnd("abc", "z"));
        assertNull(StringUtils.removeEnd(null, "a"));
        assertEquals("ab", StringUtils.removeEnd("abc", ""));
    }

    // ========== chomp ==========
    @Test
    public void testChomp() {
        assertEquals("abc", StringUtils.chomp("abc\n"));
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc", StringUtils.chomp("abc"));
        assertEquals("", StringUtils.chomp(""));
    }

    // ========== chop ==========
    @Test
    public void testChop() {
        assertEquals("ab", StringUtils.chop("abc"));
        assertEquals("", StringUtils.chop("a"));
        assertNull(StringUtils.chop(null));
        assertEquals("", StringUtils.chop(""));
    }

    // ========== repeat ==========
    @Test
    public void testRepeat() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("", 5));
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("abab", StringUtils.repeat("ab", 2));
    }

    @Test
    public void testRepeatWithSeparator() {
        assertEquals("a,a", StringUtils.repeat("a", ",", 2));
        assertEquals("aaa", StringUtils.repeat("a", ",", 0));
    }

    // ========== pad ==========
    @Test
    public void testLeftPad() {
        assertEquals("  abc", StringUtils.leftPad("abc", 5));
        assertEquals("xxabc", StringUtils.leftPad("abc", 5, 'x'));
        assertEquals("abc", StringUtils.leftPad("abc", 2));
    }

    @Test
    public void testRightPad() {
        assertEquals("abc  ", StringUtils.rightPad("abc", 5));
        assertEquals("abcxx", StringUtils.rightPad("abc", 5, 'x'));
        assertEquals("abc", StringUtils.rightPad("abc", 2));
    }

    @Test
    public void testCenter() {
        assertNull(StringUtils.center(null, 5));
        assertEquals("  a  ", StringUtils.center("a", 5));
        assertEquals("xxaxx", StringUtils.center("a", 5, 'x'));
        assertEquals("a", StringUtils.center("a", 1));
    }

    // ========== case changes ==========
    @Test
    public void testUpperCase() {
        assertNull(StringUtils.upperCase(null));
        assertEquals("ABC", StringUtils.upperCase("abc"));
        assertEquals("ABC", StringUtils.upperCase("ABC", Locale.ENGLISH));
    }

    @Test
    public void testLowerCase() {
        assertNull(StringUtils.lowerCase(null));
        assertEquals("abc", StringUtils.lowerCase("ABC"));
        assertEquals("abc", StringUtils.lowerCase("ABC", Locale.ENGLISH));
    }

    @Test
    public void testSwapCase() {
        assertNull(StringUtils.swapCase(null));
        assertEquals("aBC", StringUtils.swapCase("Abc"));
        assertEquals("A1B", StringUtils.swapCase("a1b"));
    }

    // ========== capitalize ==========
    @Test
    public void testCapitalize() {
        assertNull(StringUtils.capitalize(null));
        assertEquals("Abc", StringUtils.capitalize("abc"));
        assertEquals("ABC", StringUtils.capitalize("ABC"));
    }

    // ========== defaultString ==========
    @Test
    public void testDefaultString() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("abc", StringUtils.defaultString("abc"));
    }

    // ========== reverse ==========
    @Test
    public void testReverse() {
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    // ========== abbreviate ==========
    @Test
    public void testAbbreviate() {
        assertNull(StringUtils.abbreviate(null, 5));
        assertEquals("abc", StringUtils.abbreviate("abc", 5));
        assertEquals("ab...", StringUtils.abbreviate("abcdef", 5));
        assertEquals("abc...", StringUtils.abbreviate("abcdefgh", 6));
    }

    // ========== commonPrefix ==========
    @Test
    public void testGetCommonPrefix() {
        assertEquals("", StringUtils.getCommonPrefix(null));
        assertEquals("abcd", StringUtils.getCommonPrefix(new String[]{"abcdef", "abcdxy"}));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"abc", "def"}));
    }

    // ========== Levenshtein ==========
    @Test
    public void testGetLevenshteinDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(3, StringUtils.getLevenshteinDistance("kitten", "sitting"));
        assertEquals(5, StringUtils.getLevenshteinDistance("abc", "defgh"));
    }

    // ========== startsWith/endsWith ==========
    @Test
    public void testStartsWith() {
        assertTrue(StringUtils.startsWith("abc", "ab"));
        assertFalse(StringUtils.startsWith("abc", "bc"));
        assertFalse(StringUtils.startsWith(null, "ab"));
        assertFalse(StringUtils.startsWith("abc", null));
    }

    @Test
    public void testEndsWith() {
        assertTrue(StringUtils.endsWith("abc", "bc"));
        assertFalse(StringUtils.endsWith("abc", "ab"));
        assertFalse(StringUtils.endsWith(null, "ab"));
    }

    // ========== splitByCharacterType ==========
    @Test
    public void testSplitByCharacterType() {
        assertArrayEquals(new String[]{"a", "B", "C", "d"},
                StringUtils.splitByCharacterType("aBCd"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase() {
        assertArrayEquals(new String[]{"ab", "Cd", "E", "f"},
                StringUtils.splitByCharacterTypeCamelCase("abCdEf"));
    }
}