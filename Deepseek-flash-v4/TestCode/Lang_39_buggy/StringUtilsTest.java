package org.apache.commons.lang3;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class StringUtilsTest {
    @Before
    public void setUp() { }
    
    @After
    public void tearDown() { }
    
    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("abc"));
    }
    
    @Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("abc"));
    }
    
    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank("   "));
        assertFalse(StringUtils.isBlank(" abc "));
    }
    
    @Test
    public void testIsNotBlank() {
        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank("   "));
        assertTrue(StringUtils.isNotBlank("abc"));
    }
    
    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("abc", StringUtils.trim("  abc  "));
        assertEquals("a b", StringUtils.trim("  a b  "));
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
    public void testStripNullChars() {
        assertNull(StringUtils.strip(null, null));
        assertEquals("", StringUtils.strip("", null));
        assertEquals("abc", StringUtils.strip("xxabcxx", "x"));
        assertEquals("abc", StringUtils.strip("abc", ""));
    }
    
    @Test
    public void testStripStart() {
        assertNull(StringUtils.stripStart(null, null));
        assertEquals("", StringUtils.stripStart("", null));
        assertEquals("abc  ", StringUtils.stripStart("  abc  ", null));
        assertEquals("abc  ", StringUtils.stripStart("xxabc  ", "x"));
        assertEquals("abc", StringUtils.stripStart("abc", ""));
    }
    
    @Test
    public void testStripEnd() {
        assertNull(StringUtils.stripEnd(null, null));
        assertEquals("", StringUtils.stripEnd("", null));
        assertEquals("  abc", StringUtils.stripEnd("  abc  ", null));
        assertEquals("  abc", StringUtils.stripEnd("  abcxx", "x"));
        assertEquals("abc", StringUtils.stripEnd("abc", ""));
    }
    
    @Test
    public void testStripAll() {
        assertNull(StringUtils.stripAll(null));
        assertNotNull(StringUtils.stripAll(new String[]{"  a  ", "  b  "}));
        assertEquals("a", StringUtils.stripAll(new String[]{"  a  "})[0]);
        assertEquals("b", StringUtils.stripAll(new String[]{"  a  ", "  b  "})[1]);
        assertNotNull(StringUtils.stripAll(new String[]{"aa", "bb"}, "a"));
        assertEquals("", StringUtils.stripAll(new String[]{""})[0]);
    }
    
    @Test
    public void testStripAllSingleElement() {
        String[] input = new String[]{"  hello  "};
        String[] result = StringUtils.stripAll(input);
        assertEquals("hello", result[0]);
        assertEquals(1, result.length);
    }
    
    @Test
    public void testStripAccents() {
        assertEquals("AE", StringUtils.stripAccents("\u00C6"));
        assertNull(StringUtils.stripAccents(null));
        assertEquals("", StringUtils.stripAccents(""));
    }
    
    @Test
    public void testIndexOf() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(0, StringUtils.indexOf("abc", 'a'));
        assertEquals(1, StringUtils.indexOf("abc", 'b'));
        assertEquals(-1, StringUtils.indexOf("abc", 'z'));
        assertEquals(-1, StringUtils.indexOf("abc", 'a', -1));
        assertEquals(1, StringUtils.indexOf("abc", 'b', 1));
        assertEquals(-1, StringUtils.indexOf("abc", 'c', 3));
    }
    
    @Test
    public void testIndexOfChar() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(0, StringUtils.indexOf("abc", 'a'));
        assertEquals(-1, StringUtils.indexOf("abc", 'z'));
        assertEquals(0, StringUtils.indexOf("abc", 'a', 0));
        assertEquals(1, StringUtils.indexOf("abc", 'b', 1));
        assertEquals(2, StringUtils.indexOf("abc", 'c', 2));
    }
    
    @Test
    public void testIndexOfString() {
        assertEquals(-1, StringUtils.indexOf(null, "a"));
        assertEquals(-1, StringUtils.indexOf("abc", null));
        assertEquals(-1, StringUtils.indexOf("abc", ""));
        assertEquals(0, StringUtils.indexOf("abc", "a"));
        assertEquals(1, StringUtils.indexOf("abc", "bc"));
        assertEquals(0, StringUtils.indexOf("abc", "ab"));
        assertEquals(-1, StringUtils.indexOf("abc", "abcd"));
    }
    
    @Test
    public void testLastIndexOf() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
        assertEquals(-1, StringUtils.lastIndexOf("", 'a'));
        assertEquals(2, StringUtils.lastIndexOf("aba", 'a'));
        assertEquals(-1, StringUtils.lastIndexOf(null, 'a', 0));
        assertEquals(1, StringUtils.lastIndexOf("aba", 'b', 2));
        assertEquals(-1, StringUtils.lastIndexOf("aba", 'z', 2));
    }
    
    @Test
    public void testContains() {
        assertFalse(StringUtils.contains(null, 'a'));
        assertTrue(StringUtils.contains("abc", 'a'));
        assertFalse(StringUtils.contains("abc", 'z'));
        assertFalse(StringUtils.contains(null, "a"));
        assertFalse(StringUtils.contains("abc", null));
        assertTrue(StringUtils.contains("abc", "b"));
        assertTrue(StringUtils.contains("abc", ""));
        assertFalse(StringUtils.contains("abc", "z"));
        assertTrue(StringUtils.contains("abc", "bc"));
    }
    
    @Test
    public void testContainsAny() {
        assertFalse(StringUtils.containsAny(null, null));
        assertFalse(StringUtils.containsAny("", "a"));
        assertFalse(StringUtils.containsAny("abc", ""));
        assertFalse(StringUtils.containsAny(null, "a"));
        assertTrue(StringUtils.containsAny("abc", "zby"));
        assertFalse(StringUtils.containsAny("abc", "zxy"));
    }
    
    @Test
    public void testContainsNone() {
        assertTrue(StringUtils.containsNone("abc", 'd'));
        assertFalse(StringUtils.containsNone("abc", 'a'));
        assertTrue(StringUtils.containsNone("abc", 'z', 'y'));
        assertFalse(StringUtils.containsNone("abc", 'z', 'a'));
    }
    
    @Test
    public void testContainsOnly() {
        assertTrue(StringUtils.containsOnly("abc", "abc"));
        assertFalse(StringUtils.containsOnly("abc", "ab"));
        assertFalse(StringUtils.containsOnly("abc", "abcd"));
        assertTrue(StringUtils.containsOnly("", ""));
        assertFalse(StringUtils.containsOnly(null, "abc"));
        assertFalse(StringUtils.containsOnly("", "abc"));
    }
    
    @Test
    public void testIndexesOf() {
        assertNull(StringUtils.indexOfAny(null, new String[]{"a"}));
        assertNull(StringUtils.indexOfAny("abc", null));
        assertEquals(1, StringUtils.indexOfAny("abc", new String[]{"b", "a"}));
        assertEquals(-1, StringUtils.indexOfAny("abc", new String[]{"z", "x"}));
        assertEquals(-1, StringUtils.indexOfAny("abc", new String[]{null}));
        assertEquals(0, StringUtils.indexOfAny("abc", new String[]{"", "a"}));
    }
    
    @Test
    public void testSubstring() {
        assertNull(StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("", 0));
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("bc", StringUtils.substring("abc", 1));
        assertEquals("abc", StringUtils.substring("abc", -1));
        assertEquals("", StringUtils.substring("abc", 4));
    }
    
    @Test
    public void testSubstringRange() {
        assertNull(StringUtils.substring(null, 0, 2));
        assertEquals("", StringUtils.substring("", 0, 2));
        assertEquals("ab", StringUtils.substring("abcd", 0, 2));
        assertEquals("abc", StringUtils.substring("abcd", 0, -1));
        assertEquals("bcd", StringUtils.substring("abcd", 1, 5));
        assertEquals("", StringUtils.substring("abcd", 3, 2));
        assertEquals("", StringUtils.substring("abcd", -2, 2));
    }
    
    @Test
    public void testLeft() {
        assertNull(StringUtils.left(null, 2));
        assertEquals("", StringUtils.left("", 2));
        assertEquals("ab", StringUtils.left("abc", 2));
        assertEquals("abc", StringUtils.left("abc", 5));
        assertEquals("", StringUtils.left("abc", -1));
        assertEquals("", StringUtils.left("abc", 0));
    }
    
    @Test
    public void testRight() {
        assertNull(StringUtils.right(null, 2));
        assertEquals("", StringUtils.right("", 2));
        assertEquals("bc", StringUtils.right("abc", 2));
        assertEquals("abc", StringUtils.right("abc", 5));
        assertEquals("", StringUtils.right("abc", -1));
    }
    
    @Test
    public void testMid() {
        assertNull(StringUtils.mid(null, 1, 2));
        assertEquals("", StringUtils.mid("", 1, 2));
        assertEquals("bc", StringUtils.mid("abcd", 1, 2));
        assertEquals("", StringUtils.mid("abcd", -1, 2));
        assertEquals("", StringUtils.mid("abcd", 3, -1));
        assertEquals("cd", StringUtils.mid("abcd", 2, 3));
    }
    
    @Test
    public void testSubstringBefore() {
        assertNull(StringUtils.substringBefore(null, "a"));
        assertEquals("", StringUtils.substringBefore("", "a"));
        assertEquals("abc", StringUtils.substringBefore("abc", null));
        assertEquals("", StringUtils.substringBefore("abc", "a"));
        assertEquals("a", StringUtils.substringBefore("abc", "b"));
        assertEquals("", StringUtils.substringBefore("abc", "z"));
    }
    
    @Test
    public void testSubstringAfter() {
        assertNull(StringUtils.substringAfter(null, "a"));
        assertEquals("", StringUtils.substringAfter("", "a"));
        assertEquals("", StringUtils.substringAfter("abc", null));
        assertEquals("bc", StringUtils.substringAfter("abc", "a"));
        assertEquals("c", StringUtils.substringAfter("abc", "b"));
        assertEquals("", StringUtils.substringAfter("abc", "z"));
    }
    
    @Test
    public void testSubstringBeforeLast() {
        assertNull(StringUtils.substringBeforeLast(null, "a"));
        assertEquals("", StringUtils.substringBeforeLast("", "a"));
        assertEquals("", StringUtils.substringBeforeLast("abc", "a"));
        assertEquals("ab", StringUtils.substringBeforeLast("abc", "b"));
        assertEquals("a", StringUtils.substringBeforeLast("abca", "a"));
        assertEquals("", StringUtils.substringBeforeLast("abc", "z"));
    }
    
    @Test
    public void testSubstringAfterLast() {
        assertNull(StringUtils.substringAfterLast(null, "a"));
        assertEquals("", StringUtils.substringAfterLast("", "a"));
        assertEquals("", StringUtils.substringAfterLast("abc", "a"));
        assertEquals("c", StringUtils.substringAfterLast("abc", "b"));
        assertEquals("", StringUtils.substringAfterLast("abca", "a"));
        assertEquals("", StringUtils.substringAfterLast("abc", "z"));
    }
    
    @Test
    public void testSubstringBetween() {
        assertNull(StringUtils.substringBetween(null, "a"));
        assertNull(StringUtils.substringBetween("abc", null));
        assertNull(StringUtils.substringBetween("abc", "z"));
        assertEquals("b", StringUtils.substringBetween("abc", "a", "c"));
        assertEquals("", StringUtils.substringBetween("abc", "a", "b"));
        assertEquals("b", StringUtils.substringBetween("abcabc", "a", "c"));
    }
    
    @Test
    public void testSubstringBetweenNoTag() {
        assertNull(StringUtils.substringBetween("abc", null, "b"));
        assertNull(StringUtils.substringBetween("abc", "a", null));
        assertEquals("b", StringUtils.substringBetween("abc", "a", "c"));
        assertNull(StringUtils.substringBetween("abc", "z", "x"));
    }
    
    @Test
    public void testSplit() {
        assertNull(StringUtils.split(null));
        assertEquals(0, StringUtils.split("").length);
        assertEquals(2, StringUtils.split("a b").length);
        assertEquals("a", StringUtils.split("a b")[0]);
        assertEquals("b", StringUtils.split("a b")[1]);
        assertEquals(2, StringUtils.split("a  b").length);
    }
    
    @Test
    public void testSplitByChar() {
        assertNull(StringUtils.split(null, 'a'));
        assertEquals(0, StringUtils.split("", 'a').length);
        assertEquals(2, StringUtils.split("a,b", ',').length);
        assertEquals("a", StringUtils.split("a,b", ',')[0]);
        assertEquals("b", StringUtils.split("a,b", ',')[1]);
        assertEquals(2, StringUtils.split("aab", 'a').length);
    }
    
    @Test
    public void testSplitByString() {
        assertNull(StringUtils.split(null, " "));
        assertEquals(0, StringUtils.split("", " ").length);
        assertEquals(1, StringUtils.split("abc", " ").length);
        assertEquals(2, StringUtils.split("a b", " ").length);
        assertEquals(2, StringUtils.split("a  b", " ").length);
    }
    
    @Test
    public void testSplitByWholeSeparator() {
        assertNull(StringUtils.splitByWholeSeparator(null, " "));
        assertEquals(0, StringUtils.splitByWholeSeparator("", " ").length);
        assertEquals(1, StringUtils.splitByWholeSeparator("abc", " ").length);
        assertEquals(2, StringUtils.splitByWholeSeparator("a b", " ").length);
        assertEquals(2, StringUtils.splitByWholeSeparator("a-b", "-").length);
    }
    
    @Test
    public void testSplitPreserveAllTokens() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
        assertEquals(1, StringUtils.splitPreserveAllTokens("").length);
        assertEquals(3, StringUtils.splitPreserveAllTokens("a b").length);
        assertEquals("a", StringUtils.splitPreserveAllTokens("a b")[0]);
        assertEquals("b", StringUtils.splitPreserveAllTokens("a b")[2]);
        assertEquals(3, StringUtils.splitPreserveAllTokens("a  b").length);
    }
    
    @Test
    public void testSplitByCharacterType() {
        assertNull(StringUtils.splitByCharacterType(null));
        assertEquals(0, StringUtils.splitByCharacterType("").length);
        assertEquals(2, StringUtils.splitByCharacterType("ab12").length);
        assertEquals("ab", StringUtils.splitByCharacterType("ab12")[0]);
        assertEquals("12", StringUtils.splitByCharacterType("ab12")[1]);
        assertEquals(2, StringUtils.splitByCharacterType("a-b").length);
    }
    
    @Test
    public void testSplitByCharacterTypeCamelCase() {
        assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
        assertEquals(0, StringUtils.splitByCharacterTypeCamelCase("").length);
        assertEquals(1, StringUtils.splitByCharacterTypeCamelCase("A").length);
        assertEquals(2, StringUtils.splitByCharacterTypeCamelCase("aB").length);
        assertEquals("a", StringUtils.splitByCharacterTypeCamelCase("aB")[0]);
        assertEquals("B", StringUtils.splitByCharacterTypeCamelCase("aB")[1]);
    }
    
    @Test
    public void testJoin() {
        assertNull(StringUtils.join((Object[]) null));
        assertEquals("", StringUtils.join(new Object[]{}));
        assertEquals("a", StringUtils.join(new Object[]{"a"}));
        assertEquals("a,b", StringUtils.join(new Object[]{"a", "b"}, ","));
    }
    
    @Test
    public void testJoinWithSeparator() {
        assertEquals("a b", StringUtils.join(new Object[]{"a", "b"}, " "));
        assertEquals("a,b", StringUtils.join(new Object[]{"a", "b"}, ","));
        assertEquals("a", StringUtils.join(new Object[]{"a"}, ","));
        assertEquals("", StringUtils.join(new Object[]{""}, ","));
        assertEquals("a", StringUtils.join(new Object[]{null, "a"}, ","));
    }
    
    @Test
    public void testJoinIterable() {
        java.util.List<String> list = new java.util.ArrayList<String>();
        list.add("a");
        list.add("b");
        assertEquals("a,b", StringUtils.join(list, ","));
        assertNull(StringUtils.join((Iterable<String>) null, ","));
    }
    
    @Test
    public void testDeleteWhitespace() {
        assertNull(StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("abc", StringUtils.deleteWhitespace(" a b c "));
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));
    }
    
    @Test
    public void testReplace() {
        assertNull(StringUtils.replace(null, "a", "b"));
        assertEquals("", StringUtils.replace("", "a", "b"));
        assertEquals("abc", StringUtils.replace("abc", null, "b"));
        assertEquals("abc", StringUtils.replace("abc", "a", null));
        assertEquals("cba", StringUtils.replace("abc", "a", "cba"));
        assertEquals("bcd", StringUtils.replace("abc", "a", "b"));
    }
    
    @Test
    public void testReplaceOnce() {
        assertNull(StringUtils.replaceOnce(null, "a", "b"));
        assertEquals("", StringUtils.replaceOnce("", "a", "b"));
        assertEquals("abc", StringUtils.replaceOnce("abc", null, "b"));
        assertEquals("abc", StringUtils.replaceOnce("abc", "a", null));
        assertEquals("cba", StringUtils.replaceOnce("abc", "a", "cba"));
        assertEquals("bbc", StringUtils.replaceOnce("abc", "a", "b"));
    }
    
    @Test
    public void testReplaceChars() {
        assertNull(StringUtils.replaceChars(null, 'a', 'b'));
        assertEquals("", StringUtils.replaceChars("", 'a', 'b'));
        assertEquals("abc", StringUtils.replaceChars("abc", 'z', 'b'));
        assertEquals("abc", StringUtils.replaceChars("abc", 'a', 'b'));
        assertEquals("bbc", StringUtils.replaceChars("abc", 'a', 'b'));
    }
    
    @Test
    public void testOverlay() {
        assertNull(StringUtils.overlay(null, "a", 0, 1));
        assertEquals("", StringUtils.overlay("", "a", 0, 1));
        assertEquals("a", StringUtils.overlay("abc", "a", -1, 5));
        assertEquals("abcd", StringUtils.overlay("abcd", "a", 1, 1));
        assertEquals("a", StringUtils.overlay("abc", "", 0, 3));
        assertEquals("a", StringUtils.overlay("abc", "a", 0, 0));
    }
    
    @Test
    public void testChomp() {
        assertEquals("abc", StringUtils.chomp("abc\n"));
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc", StringUtils.chomp("abc\r"));
        assertEquals("", StringUtils.chomp(""));
        assertEquals("a", StringUtils.chomp("a"));
        assertEquals("", StringUtils.chomp("\n"));
    }
    
    @Test
    public void testChop() {
        assertEquals("ab", StringUtils.chop("abc"));
        assertEquals("", StringUtils.chop("ab"));
        assertEquals("", StringUtils.chop("a"));
        assertEquals("", StringUtils.chop(""));
        assertEquals("abc", StringUtils.chop("abcd"));
    }
    
    @Test
    public void testRepeatZero() {
        assertEquals("", StringUtils.repeat("a", 0));
        assertEquals("", StringUtils.repeat("ab", 0));
        assertEquals("", StringUtils.repeat("", 3));
    }
    
    @Test
    public void testRepeatOne() {
        assertEquals("a", StringUtils.repeat("a", 1));
        assertEquals("ab", StringUtils.repeat("ab", 1));
    }
    
    @Test
    public void testRepeatMany() {
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("abab", StringUtils.repeat("ab", 2));
        assertEquals("", StringUtils.repeat("a", -1));
    }
    
    @Test
    public void testRepeatWithSeparator() {
        assertEquals("a,a", StringUtils.repeat("a", ",", 2));
        assertEquals("ab,ab", StringUtils.repeat("ab", ",", 2));
        assertEquals("", StringUtils.repeat("a", ",", 0));
    }
    
    @Test
    public void testRightPad() {
        assertNull(StringUtils.rightPad(null, 5));
        assertEquals("a    ", StringUtils.rightPad("a", 5));
        assertEquals("abc", StringUtils.rightPad("abc", 2));
        assertEquals("abc  ", StringUtils.rightPad("abc", 5, " "));
        assertEquals("ab", StringUtils.rightPad("ab", 2, " "));
    }
    
    @Test
    public void testLeftPad() {
        assertNull(StringUtils.leftPad(null, 5));
        assertEquals("    a", StringUtils.leftPad("a", 5));
        assertEquals("a", StringUtils.leftPad("abc", 1));
        assertEquals("  abc", StringUtils.leftPad("abc", 5, " "));
    }
    
    @Test
    public void testCenter() {
        assertNull(StringUtils.center(null, 1));
        assertEquals("a", StringUtils.center("a", 1));
        assertEquals("  a ", StringUtils.center("a", 4));
        assertEquals(" a ", StringUtils.center("a", 3, " "));
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
        assertEquals("Abc", StringUtils.capitalize("abc"));
        assertEquals("ABC", StringUtils.capitalize("aBC"));
        assertEquals("", StringUtils.capitalize(""));
    }
    
    @Test
    public void testUncapitalize() {
        assertNull(StringUtils.uncapitalize(null));
        assertEquals("aBC", StringUtils.uncapitalize("ABC"));
        assertEquals("abc", StringUtils.uncapitalize("abc"));
        assertEquals("", StringUtils.uncapitalize(""));
    }
    
    @Test
    public void testSwapCase() {
        assertNull(StringUtils.swapCase(null));
        assertEquals("aBC", StringUtils.swapCase("Abc"));
        assertEquals("a", StringUtils.swapCase("A"));
        assertEquals("", StringUtils.swapCase(""));
    }
    
    @Test
    public void testCountMatches() {
        assertEquals(0, StringUtils.countMatches("abc", 'z'));
        assertEquals(2, StringUtils.countMatches("aba", 'a'));
        assertEquals(1, StringUtils.countMatches("abc", 'b'));
    }
    
    @Test
    public void testDefaultString() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("abc", StringUtils.defaultString("abc"));
        assertEquals("", StringUtils.defaultString(""));
        assertEquals("null", StringUtils.defaultString("null"));
    }
    
    @Test
    public void testReverse() {
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("a", StringUtils.reverse("a"));
    }
    
    @Test
    public void testAbbreviate() {
        assertEquals("...", StringUtils.abbreviate("abcdef", 3));
        assertEquals("abc...", StringUtils.abbreviate("abcdef", 6));
        assertEquals("...", StringUtils.abbreviate("abcdef", 4));
        assertEquals("...", StringUtils.abbreviate("abcdef", 7));
        assertEquals("abcdef", StringUtils.abbreviate("abcdef", 8));
    }
    
    @Test
    public void testGetLevenshteinDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("a", "b"));
        assertEquals(0, StringUtils.getLevenshteinDistance("a", "a"));
        assertEquals(3, StringUtils.getLevenshteinDistance("kitten", "sitting"));
        try {
            StringUtils.getLevenshteinDistance(null, "a");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) { }
        try {
            StringUtils.getLevenshteinDistance("a", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) { }
    }
    
    @Test
    public void testStartsWith() {
        assertFalse(StringUtils.startsWith(null, "a"));
        assertFalse(StringUtils.startsWith("abc", null));
        assertTrue(StringUtils.startsWith("abc", "ab"));
        assertFalse(StringUtils.startsWith("abc", "bc"));
        assertFalse(StringUtils.startsWith(null, null));
        assertTrue(StringUtils.startsWith("abc", ""));
    }
    
    @Test
    public void testStartsWithIgnoreCase() {
        assertFalse(StringUtils.startsWithIgnoreCase(null, "a"));
        assertTrue(StringUtils.startsWithIgnoreCase("abc", "ab"));
        assertTrue(StringUtils.startsWithIgnoreCase("ABC", "ab"));
        assertFalse(StringUtils.startsWithIgnoreCase("abc", "bc"));
    }
    
    @Test
    public void testEndsWith() {
        assertFalse(StringUtils.endsWith(null, "a"));
        assertFalse(StringUtils.endsWith("abc", null));
        assertTrue(StringUtils.endsWith("abc", "bc"));
        assertFalse(StringUtils.endsWith("abc", "ab"));
        assertFalse(StringUtils.endsWith(null, null));
        assertTrue(StringUtils.endsWith("abc", ""));
    }
    
    @Test
    public void testEndsWithIgnoreCase() {
        assertFalse(StringUtils.endsWithIgnoreCase(null, "a"));
        assertTrue(StringUtils.endsWithIgnoreCase("abc", "BC"));
        assertTrue(StringUtils.endsWithIgnoreCase("ABC", "bc"));
        assertFalse(StringUtils.endsWithIgnoreCase("abc", "ab"));
    }
}