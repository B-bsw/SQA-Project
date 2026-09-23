package org.apache.commons.lang;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class StringUtilsTest {
    
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor<StringUtils> constructor = StringUtils.class.getDeclaredConstructor();
        assertTrue(Modifier.isPublic(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("test"));
        assertFalse(StringUtils.isEmpty("  test  "));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("test"));
    }

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank("  "));
        assertFalse(StringUtils.isBlank("test"));
    }

    @Test
    public void testIsNotBlank() {
        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank(""));
        assertFalse(StringUtils.isNotBlank("  "));
        assertTrue(StringUtils.isNotBlank("test"));
    }

    @Test
    public void testTrim() {
        assertEquals(null, StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("test", StringUtils.trim("  test  "));
        assertEquals("test", StringUtils.trim("test"));
    }

    @Test
    public void testTrimToNull() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertNull(StringUtils.trimToNull("   "));
        assertEquals("test", StringUtils.trimToNull("  test  "));
    }

    @Test
    public void testTrimToEmpty() {
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty(""));
        assertEquals("test", StringUtils.trimToEmpty("  test  "));
    }

    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("test", StringUtils.strip("  test  "));
        assertEquals("test", StringUtils.strip("test"));
    }

    @Test
    public void testStripWithStripChars() {
        assertEquals("test", StringUtils.strip("xyxtestyyx", "xy"));
        assertEquals("test", StringUtils.strip("test", null));
        assertEquals("test", StringUtils.strip("test", ""));
    }

    @Test
    public void testStripStart() {
        assertNull(StringUtils.stripStart(null, null));
        assertEquals("testxx", StringUtils.stripStart("yxtestxx", "yx"));
        assertEquals("test", StringUtils.stripStart("test", ""));
    }

    @Test
    public void testStripEnd() {
        assertNull(StringUtils.stripEnd(null, null));
        assertEquals("test", StringUtils.stripEnd("testxx", "x"));
        assertEquals("test", StringUtils.stripEnd("test", ""));
    }

    @Test
    public void testStripAll() {
        assertNull(StringUtils.stripAll(null));
        assertNull(StringUtils.stripAll(new String[] {null}));
        assertArrayEquals(new String[]{"test", "test2"}, StringUtils.stripAll(new String[]{"  test  ", "  test2  "}));
        assertArrayEquals(new String[]{"t", "e"}, StringUtils.stripAll(new String[]{"xtx", "exe"}, "x"));
    }

    @Test
    public void testIndexOf() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(2, StringUtils.indexOf("abcdef", 'c'));
        assertEquals(-1, StringUtils.indexOf("abcdef", 'z'));
    }

    @Test
    public void testIndexOfWithStartPos() {
        assertEquals(3, StringUtils.indexOf("abcdefabc", 'a', 1));
        assertEquals(-1, StringUtils.indexOf("abcdef", 'a', 1));
    }

    @Test
    public void testIndexOfString() {
        assertEquals(-1, StringUtils.indexOf(null, "abc"));
        assertEquals(-1, StringUtils.indexOf("abc", null));
        assertEquals(0, StringUtils.indexOf("abcdef", ""));
        assertEquals(2, StringUtils.indexOf("abcdef", "cde"));
        assertEquals(-1, StringUtils.indexOf("abcdef", "z"));
    }

    @Test
    public void testIndexOfStringWithStartPos() {
        assertEquals(3, StringUtils.indexOf("abcdefabc", "abc", 1));
        assertEquals(-1, StringUtils.indexOf("abcdef", "abc", 1));
    }

    @Test
    public void testLastIndexOf() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
        assertEquals(-1, StringUtils.lastIndexOf("", 'a'));
        assertEquals(3, StringUtils.lastIndexOf("abcabc", 'c'));
    }

    @Test
    public void testLastIndexOfString() {
        assertEquals(-1, StringUtils.lastIndexOf(null, "a"));
        assertEquals(-1, StringUtils.lastIndexOf("abc", null));
        assertEquals(3, StringUtils.lastIndexOf("abcabc", "abc"));
    }

    @Test
    public void testContains() {
        assertFalse(StringUtils.contains(null, 'a'));
        assertTrue(StringUtils.contains("abcdef", 'c'));
        assertFalse(StringUtils.contains("abcdef", 'z'));
    }

    @Test
    public void testContainsString() {
        assertFalse(StringUtils.contains(null, "a"));
        assertTrue(StringUtils.contains("abcdef", "cde"));
        assertFalse(StringUtils.contains("abcdef", "xyz"));
    }

    @Test
    public void testContainsAny() {
        assertFalse(StringUtils.containsAny(null, new char[]{'a'}));
        assertTrue(StringUtils.containsAny("abcdef", new char[]{'z', 'c'}));
        assertFalse(StringUtils.containsAny("abcdef", new char[]{'z', 'x'}));
    }

    @Test
    public void testContainsAnyString() {
        assertFalse(StringUtils.containsAny(null, "abc"));
        assertTrue(StringUtils.containsAny("abcdef", "zc"));
        assertFalse(StringUtils.containsAny("abcdef", "zx"));
    }

    @Test
    public void testContainsOnly() {
        assertFalse(StringUtils.containsOnly(null, "abc"));
        assertFalse(StringUtils.containsOnly("", "abc"));
        assertFalse(StringUtils.containsOnly("ab", "abc"));
        assertTrue(StringUtils.containsOnly("abc", "abc"));
        assertFalse(StringUtils.containsOnly("abz", "abc"));
    }

    @Test
    public void testContainsNone() {
        assertTrue(StringUtils.containsNone(null, "abc"));
        assertTrue(StringUtils.containsNone("", "abc"));
        assertFalse(StringUtils.containsNone("abcdef", "zxc"));
        assertTrue(StringUtils.containsNone("abcdef", "xyz"));
    }

    @Test
    public void testContainsNoneString() {
        assertTrue(StringUtils.containsNone("abcd", null));
        assertFalse(StringUtils.containsNone("abcdef", "abc"));
    }

    @Test
    public void testContainsAnyButNone() {
        assertFalse(StringUtils.containsAnyBut(null, new char[]{'a'}));
        assertFalse(StringUtils.containsAnyBut("abc", new char[]{'a','b','c'}));
        assertTrue(StringUtils.containsAnyBut("abc", new char[]{'a','b'}));
    }

    @Test
    public void testContainsAnyBut() {
        assertFalse(StringUtils.containsAnyBut("abc", "abc"));
        assertTrue(StringUtils.containsAnyBut("abc", "ab"));
    }

    @Test
    public void testSubstring() {
        assertEquals(null, StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("", 0));
        assertEquals("bcd", StringUtils.substring("abcd", 1));
        assertEquals("abc", StringUtils.substring("abcd", 0, 3));
        assertEquals("abcd", StringUtils.substring("abcd", -2));
        assertEquals("", StringUtils.substring("abcd", 2, 1));
    }

    @Test
    public void testLeft() {
        assertNull(StringUtils.left(null, 1));
        assertEquals("ab", StringUtils.left("abc", 2));
        assertEquals("abc", StringUtils.left("abc", 5));
        assertEquals("", StringUtils.left("abc", -1));
    }

    @Test
    public void testRight() {
        assertNull(StringUtils.right(null, 1));
        assertEquals("bc", StringUtils.right("abc", 2));
        assertEquals("abc", StringUtils.right("abc", 5));
        assertEquals("", StringUtils.right("abc", -1));
    }

    @Test
    public void testMid() {
        assertNull(StringUtils.mid(null, 1, 1));
        assertEquals("bc", StringUtils.mid("abcd", 1, 2));
        assertEquals("", StringUtils.mid("abcd", 3, 2));
        assertEquals("abd", StringUtils.mid("abcd", -2, 2));
    }

    @Test
    public void testSubstringBefore() {
        assertEquals("", StringUtils.substringBefore(null, "a"));
        assertEquals("", StringUtils.substringBefore("a", null));
        assertEquals("", StringUtils.substringBefore("abcba", "b"));
        assertEquals("", StringUtils.substringBefore("abc", "a"));
        assertEquals("a", StringUtils.substringBefore("abcba", "c"));
        assertEquals("abc", StringUtils.substringBefore("abcba", "z"));
    }

    @Test
    public void testSubstringAfter() {
        assertEquals("", StringUtils.substringAfter(null, "a"));
        assertEquals("", StringUtils.substringAfter("abc", null));
        assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
        assertEquals("", StringUtils.substringAfter("abc", "a"));
    }

    @Test
    public void testSubstringBeforeLast() {
        assertEquals("", StringUtils.substringBeforeLast(null, "a"));
        assertEquals("", StringUtils.substringBeforeLast("abc", null));
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
        assertEquals("", StringUtils.substringBeforeLast("abc", "z"));
    }

    @Test
    public void testSubstringAfterLast() {
        assertEquals("", StringUtils.substringAfterLast(null, "a"));
        assertEquals("", StringUtils.substringAfterLast("abc", null));
        assertEquals("ba", StringUtils.substringAfterLast("abcba", "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", "z"));
    }

    @Test
    public void testSubstringBetween() {
        assertNull(StringUtils.substringBetween(null, "a"));
        assertNull(StringUtils.substringBetween("abc", null));
        assertNull(StringUtils.substringBetween("abc", "a"));
        assertEquals("bc", StringUtils.substringBetween("abc", "a", "c"));
        assertEquals("b", StringUtils.substringBetween("abcabc", "a"));
    }

    @Test
    public void testSplit() {
        assertNull(StringUtils.split(null));
        assertArrayEquals(new String[]{}, StringUtils.split(""));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a b c"));
        assertArrayEquals(new String[]{}, StringUtils.split("  "));
    }

    @Test
    public void testSplitWithSeparator() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a,b,c", ","));
        assertArrayEquals(new String[]{"a", "b"}, StringUtils.split("a,b", ","));
        assertArrayEquals(new String[]{"a"}, StringUtils.split("a", ","));
    }

    @Test
    public void testSplitPreserveAllTokens() {
        assertArrayEquals(new String[]{""}, StringUtils.splitPreserveAllTokens(""));
        assertArrayEquals(new String[]{"a", "", "b"}, StringUtils.splitPreserveAllTokens("a,,b"));
    }

    @Test
    public void testJoin() {
        assertEquals("", StringUtils.join((Object[]) null));
        assertEquals("", StringUtils.join(new Object[]{}));
        assertEquals("a", StringUtils.join(new Object[]{"a"}));
        assertEquals("a,b", StringUtils.join(new Object[]{"a", "b"}, ","));
        assertEquals("a,null,c", StringUtils.join(new Object[]{"a", null, "c"}, ","));
    }

    @Test
    public void testJoinIterator() {
        List<String> list = new ArrayList<String>();
        assertEquals("", StringUtils.join(list.iterator(), ","));
        list.add("a");
        list.add("b");
        assertEquals("a,b", StringUtils.join(list.iterator(), ","));
        assertEquals("a,null", StringUtils.join(new java.util.Arrays.asList(new String[]{"a", null}).iterator(), ","));
    }

    @Test
    public void testDeleteWhitespace() {
        assertEquals("", StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("abc", StringUtils.deleteWhitespace("a b c"));
        assertEquals("abc", StringUtils.deleteWhitespace(" a b c "));
    }

    @Test
    public void testRemoveStart() {
        assertEquals("", StringUtils.removeStart(null, "a"));
        assertEquals("abc", StringUtils.removeStart("abc", null));
        assertEquals("bc", StringUtils.removeStart("abc", "a"));
        assertEquals("abc", StringUtils.removeStart("abc", "z"));
    }

    @Test
    public void testRemoveStartIgnoreCase() {
        assertEquals("bc", StringUtils.removeStartIgnoreCase("Abc", "a"));
        assertEquals("abc", StringUtils.removeStartIgnoreCase("abc", "z"));
    }

    @Test
    public void testRemoveEnd() {
        assertEquals("", StringUtils.removeEnd(null, "a"));
        assertEquals("abc", StringUtils.removeEnd("abc", null));
        assertEquals("ab", StringUtils.removeEnd("abc", "c"));
        assertEquals("abc", StringUtils.removeEnd("abc", "z"));
    }

    @Test
    public void testRemoveEndIgnoreCase() {
        assertEquals("ab", StringUtils.removeEndIgnoreCase("abC", "c"));
        assertEquals("abc", StringUtils.removeEndIgnoreCase("abc", "z"));
    }

    @Test
    public void testRemove() {
        assertEquals("", StringUtils.remove(null, "a"));
        assertEquals("abc", StringUtils.remove("abc", null));
        assertEquals("bc", StringUtils.remove("abc", "a"));
        assertEquals("abc", StringUtils.remove("abc", "z"));
    }

    @Test
    public void testReplace() {
        assertEquals("", StringUtils.replace(null, "a", "b"));
        assertEquals("abc", StringUtils.replace("abc", null, "b"));
        assertEquals("abc", StringUtils.replace("abc", "a", null));
        assertEquals("abc", StringUtils.replace("abc", "a", "b", 0));
        assertEquals("bbc", StringUtils.replace("abc", "a", "b", 2));
        assertEquals("bbb", StringUtils.replace("aaa", "a", "b", 2));
    }

    @Test
    public void testChomp() {
        assertEquals("abc", StringUtils.chomp("abc\n"));
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc", StringUtils.chomp("abc"));
        assertEquals("", StringUtils.chomp(""));
    }

    @Test
    public void testRepeat() {
        assertEquals("", StringUtils.repeat("a", 0));
        assertEquals("a", StringUtils.repeat("a", 1));
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("abc", StringUtils.repeat("abc", 1));
    }

    @Test
    public void testRepeatWithSeparator() {
        assertEquals("a,a", StringUtils.repeat("a", ",", 2));
        assertEquals("a", StringUtils.repeat("a", ",", 1));
        assertEquals("", StringUtils.repeat("a", ",", 0));
        assertEquals("a,a,a", StringUtils.repeat("a", ",", 3));
    }

    @Test
    public void testRightPad() {
        assertEquals("abc", StringUtils.rightPad("abc", 3));
        assertEquals("abc  ", StringUtils.rightPad("abc", 5));
        assertEquals("abc", StringUtils.rightPad(null, 3));
        assertEquals("abcab", StringUtils.rightPad("abc", 5, "ab"));
    }

    @Test
    public void testLeftPad() {
        assertEquals("abc", StringUtils.leftPad("abc", 3));
        assertEquals("  abc", StringUtils.leftPad("abc", 5));
        assertEquals("abc", StringUtils.leftPad(null, 3));
        assertEquals("ababc", StringUtils.leftPad("abc", 5, "ab"));
    }

    @Test
    public void testCenter() {
        assertEquals("abc", StringUtils.center("abc", 3));
        assertEquals(" abc ", StringUtils.center("abc", 5));
        assertEquals("abc", StringUtils.center(null, 3));
        assertEquals("  abc  ", StringUtils.center("abc", 7));
    }

    @Test
    public void testUpperCase() {
        assertEquals("ABC", StringUtils.upperCase("abc"));
        assertEquals("ABC", StringUtils.upperCase("ABC"));
        assertEquals(null, StringUtils.upperCase(null));
        assertEquals("ABC", StringUtils.upperCase("aBc", Locale.ENGLISH));
    }

    @Test
    public void testLowerCase() {
        assertEquals("abc", StringUtils.lowerCase("ABC"));
        assertEquals("abc", StringUtils.lowerCase("abc"));
        assertEquals(null, StringUtils.lowerCase(null));
        assertEquals("abc", StringUtils.lowerCase("AbC", Locale.ENGLISH));
    }

    @Test
    public void testCapitalize() {
        assertEquals("ABC", StringUtils.capitalize("aBC"));
        assertEquals("ABC", StringUtils.capitalize("ABC"));
        assertEquals(null, StringUtils.capitalize(null));
        assertEquals("a", StringUtils.capitalize("a"));
    }

    @Test
    public void testUncapitalize() {
        assertEquals("aBC", StringUtils.uncapitalize("ABC"));
        assertEquals("ABC", StringUtils.uncapitalize("ABC"));
        assertEquals("ABC", StringUtils.uncapitalize("ABC"));
        assertEquals(null, StringUtils.uncapitalize(null));
    }

    @Test
    public void testSwapCase() {
        assertEquals("aBC", StringUtils.swapCase("Abc"));
        assertEquals("A", StringUtils.swapCase("a"));
        assertEquals(null, StringUtils.swapCase(null));
    }

    @Test
    public void testIsAlpha() {
        assertFalse(StringUtils.isAlpha(null));
        assertTrue(StringUtils.isAlpha("abc"));
        assertFalse(StringUtils.isAlpha("abc1"));
        assertFalse(StringUtils.isAlpha(""));
    }

    @Test
    public void testIsAlphaSpace() {
        assertFalse(StringUtils.isAlphaSpace(null));
        assertTrue(StringUtils.isAlphaSpace("abc def"));
        assertFalse(StringUtils.isAlphaSpace("abc1"));
        assertFalse(StringUtils.isAlphaSpace(""));
    }

    @Test
    public void testIsAlphanumeric() {
        assertFalse(StringUtils.isAlphanumeric(null));
        assertTrue(StringUtils.isAlphanumeric("abc123"));
        assertFalse(StringUtils.isAlphanumeric("abc "));
        assertFalse(StringUtils.isAlphanumeric(""));
    }

    @Test
    public void testIsAlphanumericSpace() {
        assertFalse(StringUtils.isAlphanumericSpace(null));
        assertTrue(StringUtils.isAlphanumericSpace("abc 123"));
        assertFalse(StringUtils.isAlphanumericSpace("abc!"));
        assertFalse(StringUtils.isAlphanumericSpace(""));
    }

    @Test
    public void testIsAsciiPrintable() {
        assertFalse(StringUtils.isAsciiPrintable(null));
        assertTrue(StringUtils.isAsciiPrintable("abc"));
        assertFalse(StringUtils.isAsciiPrintable("\u0000"));
    }

    @Test
    public void testIsNumeric() {
        assertFalse(StringUtils.isNumeric(null));
        assertTrue(StringUtils.isNumeric("123"));
        assertFalse(StringUtils.isNumeric("12a"));
        assertFalse(StringUtils.isNumeric(""));
    }

    @Test
    public void testIsNumericSpace() {
        assertFalse(StringUtils.isNumericSpace(null));
        assertTrue(StringUtils.isNumericSpace("123 456"));
        assertFalse(StringUtils.isNumericSpace("12a"));
        assertFalse(StringUtils.isNumericSpace(""));
    }

    @Test
    public void testIsWhitespace() {
        assertFalse(StringUtils.isWhitespace(null));
        assertTrue(StringUtils.isWhitespace(" "));
        assertFalse(StringUtils.isWhitespace("a"));
    }

    @Test
    public void testIsAllLowerCase() {
        assertFalse(StringUtils.isAllLowerCase(null));
        assertTrue(StringUtils.isAllLowerCase("abc"));
        assertFalse(StringUtils.isAllLowerCase("Abc"));
    }

    @Test
    public void testIsAllUpperCase() {
        assertFalse(StringUtils.isAllUpperCase(null));
        assertTrue(StringUtils.isAllUpperCase("ABC"));
        assertFalse(StringUtils.isAllUpperCase("aBC"));
    }

    @Test
    public void testDefaultString() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("abc", StringUtils.defaultString("abc"));
        assertEquals("default", StringUtils.defaultString(null, "default"));
        assertEquals("abc", StringUtils.defaultString("abc", "default"));
    }

    @Test
    public void testDefaultIfEmpty() {
        assertEquals("default", StringUtils.defaultIfEmpty("", "default"));
        assertEquals("abc", StringUtils.defaultIfEmpty("abc", "default"));
        assertEquals("default", StringUtils.defaultIfEmpty(null, "default"));
    }

    @Test
    public void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("", StringUtils.reverse(""));
        assertEquals(null, StringUtils.reverse(null));
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    public void testAbbreviate() {
        assertEquals("abc", StringUtils.abbreviate("abc", 3));
        assertEquals("ab...", StringUtils.abbreviate("abcde", 5));
        assertEquals("a...", StringUtils.abbreviate("abcde", 4));
        assertEquals("...", StringUtils.abbreviate("abcde", 3));
    }

    @Test
    public void testDifference() {
        assertEquals("cde", StringUtils.difference("abc", "abcde"));
        assertEquals("abc", StringUtils.difference("abc", "abc"));
        assertEquals("abc", StringUtils.difference(null, "abc"));
        assertEquals("abc", StringUtils.difference("abc", null));
    }

    @Test
    public void testGetLevenshteinDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("abc", "abc"));
        assertEquals(1, StringUtils.getLevenshteinDistance("abc", "abd"));
        assertEquals(3, StringUtils.getLevenshteinDistance("kitten", "sitting"));
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
    }

    @Test
    public void testStartsWith() {
        assertFalse(StringUtils.startsWith(null, "a"));
        assertFalse(StringUtils.startsWith("abc", null));
        assertTrue(StringUtils.startsWith("abcdef", "abc"));
        assertFalse(StringUtils.startsWith("abcdef", "bc"));
    }

    @Test
    public void testStartsWithIgnoreCase() {
        assertTrue(StringUtils.startsWithIgnoreCase("Abc", "a"));
        assertFalse(StringUtils.startsWithIgnoreCase("Abc", "b"));
    }

    @Test
    public void testStartsWithAny() {
        assertFalse(StringUtils.startsWithAny("abc", new String[]{"z", "a"}));
        assertTrue(StringUtils.startsWithAny("abc", new String[]{"a"}));
        assertFalse(StringUtils.startsWithAny("abc", null));
    }

    @Test
    public void testEndsWith() {
        assertFalse(StringUtils.endsWith(null, "a"));
        assertFalse(StringUtils.endsWith("abc", null));
        assertTrue(StringUtils.endsWith("abcdef", "def"));
        assertFalse(StringUtils.endsWith("abcdef", "de"));
    }

    @Test
    public void testEndsWithIgnoreCase() {
        assertTrue(StringUtils.endsWithIgnoreCase("Abc", "c"));
        assertFalse(StringUtils.endsWithIgnoreCase("Abc", "b"));
    }
}