package org.apache.commons.lang3;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class StringUtilsTest {

    private static final String HIGH_SURROGATE_PAIR = "\uD83D\uDE00";

    @Test
    public void constructor_whenInstantiated_shouldNotNull() {
        StringUtils utils = new StringUtils();
        assertNotNull(utils);
    }

    @Test
    public void isEmpty_givenNullOrEmpty_shouldReturnTrue() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void isEmpty_givenNonEmpty_shouldReturnFalse() {
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("a"));
    }

    @Test
    public void isNotEmpty_givenNullOrEmpty_shouldReturnFalse() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
    }

    @Test
    public void isNotEmpty_givenNonEmpty_shouldReturnTrue() {
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("bob"));
    }

    @Test
    public void isBlank_givenNullOrWhitespace_shouldReturnTrue() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertTrue(StringUtils.isBlank(" \t \r\n "));
    }

    @Test
    public void isBlank_givenNonWhitespace_shouldReturnFalse() {
        assertFalse(StringUtils.isBlank(" a "));
        assertFalse(StringUtils.isBlank("abc"));
    }

    @Test
    public void isNotBlank_givenBlankOrNull_shouldReturnFalse() {
        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank(""));
        assertFalse(StringUtils.isNotBlank("   "));
    }

    @Test
    public void isNotBlank_givenNonBlank_shouldReturnTrue() {
        assertTrue(StringUtils.isNotBlank("a"));
        assertTrue(StringUtils.isNotBlank(" abc "));
    }

    @Test
    public void trim_givenVariousInputs_shouldTrimProperly() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("", StringUtils.trim("   "));
        assertEquals("abc", StringUtils.trim("  abc  "));
    }

    @Test
    public void trimToNull_givenNullOrWhitespace_shouldReturnNull() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertNull(StringUtils.trimToNull("   "));
        assertEquals("abc", StringUtils.trimToNull("  abc  "));
    }

    @Test
    public void trimToEmpty_givenVariousInputs_shouldReturnTrimmedOrEmpty() {
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty(""));
        assertEquals("", StringUtils.trimToEmpty("   "));
        assertEquals("abc", StringUtils.trimToEmpty("  abc  "));
    }

    @Test
    public void strip_givenNullOrEmpty_shouldHandleGracefully() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("abc", StringUtils.strip("  abc  "));
    }

    @Test
    public void stripToNull_givenVariousInputs_shouldReturnNullOrStripped() {
        assertNull(StringUtils.stripToNull(null));
        assertNull(StringUtils.stripToNull(""));
        assertNull(StringUtils.stripToNull("   "));
        assertEquals("abc", StringUtils.stripToNull("  abc  "));
    }

    @Test
    public void stripToEmpty_givenVariousInputs_shouldReturnEmptyOrStripped() {
        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("", StringUtils.stripToEmpty(""));
        assertEquals("", StringUtils.stripToEmpty("   "));
        assertEquals("abc", StringUtils.stripToEmpty("  abc  "));
    }

    @Test
    public void strip_givenCustomStripChars_shouldStripCustomCharacters() {
        assertNull(StringUtils.strip(null, "*"));
        assertEquals("", StringUtils.strip("", "*"));
        assertEquals("abc", StringUtils.strip("*&abc&*", "*&"));
        assertEquals("abc", StringUtils.strip("abc", ""));
    }

    @Test
    public void stripStart_givenVariousInputs_shouldStripBeginning() {
        assertNull(StringUtils.stripStart(null, "a"));
        assertEquals("", StringUtils.stripStart("", "a"));
        assertEquals("abc", StringUtils.stripStart("  abc", null));
        assertEquals("abc", StringUtils.stripStart("yxabc", "xyz"));
        assertEquals("yxabc", StringUtils.stripStart("yxabc", ""));
    }

    @Test
    public void stripEnd_givenVariousInputs_shouldStripEnd() {
        assertNull(StringUtils.stripEnd(null, "a"));
        assertEquals("", StringUtils.stripEnd("", "a"));
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
        assertEquals("abc", StringUtils.stripEnd("abcyx", "xyz"));
        assertEquals("abcyx", StringUtils.stripEnd("abcyx", ""));
    }

    @Test
    public void stripAll_givenArray_shouldStripElements() {
        assertNull(StringUtils.stripAll((String[]) null));
        assertEquals(0, StringUtils.stripAll(new String[0]).length);
        String[] input = new String[] { "  a  ", " b " };
        String[] expected = new String[] { "a", "b" };
        assertArrayEquals(expected, StringUtils.stripAll(input));

        String[] customInput = new String[] { "*a*", "*b*" };
        assertArrayEquals(expected, StringUtils.stripAll(customInput, "*"));
    }

    @Test
    public void stripAccents_givenNullOrText_shouldReturnExpected() {
        assertNull(StringUtils.stripAccents(null));
        assertEquals("e", StringUtils.stripAccents("\u00E9"));
        assertEquals("abc", StringUtils.stripAccents("abc"));
    }

    @Test
    public void equals_givenCharSequencePairs_shouldCheckEquality() {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void equalsIgnoreCase_givenCharSequencePairs_shouldIgnoreCase() {
        assertTrue(StringUtils.equalsIgnoreCase(null, null));
        assertFalse(StringUtils.equalsIgnoreCase(null, "abc"));
        assertFalse(StringUtils.equalsIgnoreCase("abc", null));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "abc"));
        assertFalse(StringUtils.equalsIgnoreCase("abc", "abcd"));
    }

    @Test
    public void indexOf_givenCharAndStartPos_shouldFindCorrectIndex() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(1, StringUtils.indexOf("aabaabaa", 'b'));
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', 2));
        assertEquals(-1, StringUtils.indexOf("aabaabaa", 'b', 9));
        assertEquals(-1, StringUtils.indexOf(null, 'b', 0));
        assertEquals(-1, StringUtils.indexOf("", 'b', 0));
    }

    @Test
    public void indexOf_givenCharSequenceAndStartPos_shouldFindCorrectIndex() {
        assertEquals(-1, StringUtils.indexOf(null, "a"));
        assertEquals(-1, StringUtils.indexOf("a", null));
        assertEquals(0, StringUtils.indexOf("aabaabaa", "a"));
        assertEquals(3, StringUtils.indexOf("aabaabaa", "b", 2));
        assertEquals(-1, StringUtils.indexOf("aabaabaa", "b", 9));
        assertEquals(-1, StringUtils.indexOf(null, "b", 0));
        assertEquals(-1, StringUtils.indexOf("aabaabaa", null, 0));
    }

    @Test
    public void ordinalIndexOf_givenOrdinal_shouldFindCorrectMatch() {
        assertEquals(-1, StringUtils.ordinalIndexOf(null, "a", 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("a", null, 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("a", "a", 0));
        assertEquals(-1, StringUtils.ordinalIndexOf("a", "a", -1));
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "", 1));
        assertEquals(2, StringUtils.ordinalIndexOf("aabaabaa", "b", 1));
        assertEquals(5, StringUtils.ordinalIndexOf("aabaabaa", "b", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "b", 3));
    }

    @Test
    public void lastOrdinalIndexOf_givenOrdinal_shouldFindReverseMatch() {
        assertEquals(5, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 1));
        assertEquals(2, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 2));
        assertEquals(-1, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 3));
        assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1));
    }

    @Test
    public void indexOfIgnoreCase_givenVariousInputs_shouldMatchCorrectly() {
        assertEquals(-1, StringUtils.indexOfIgnoreCase(null, "a"));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("a", null));
        assertEquals(0, StringUtils.indexOfIgnoreCase("a", ""));
        assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", "A"));
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "B", 2));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "B", 9));
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "B", -1));
    }

    @Test
    public void lastIndexOf_givenCharAndCharSequence_shouldMatchCorrectly() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
        assertEquals(-1, StringUtils.lastIndexOf("", 'a'));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b'));
        assertEquals(2, StringUtils.lastIndexOf("aabaabaa", 'b', 4));
        assertEquals(-1, StringUtils.lastIndexOf(null, 'b', 0));
        assertEquals(-1, StringUtils.lastIndexOf("", 'b', 0));

        assertEquals(-1, StringUtils.lastIndexOf(null, "b"));
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", null));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", "b"));
        assertEquals(2, StringUtils.lastIndexOf("aabaabaa", "b", 4));
        assertEquals(-1, StringUtils.lastIndexOf(null, "b", 0));
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", null, 0));
    }

    @Test
    public void lastIndexOfIgnoreCase_givenVariousInputs_shouldMatchCorrectly() {
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "a"));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("a", null));
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B"));
        assertEquals(2, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 4));
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 10));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", -1));
        assertEquals(2, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "", 2));
    }

    @Test
    public void contains_givenCharOrSequence_shouldEvaluateCorrectly() {
        assertFalse(StringUtils.contains(null, 'a'));
        assertFalse(StringUtils.contains("", 'a'));
        assertTrue(StringUtils.contains("abc", 'a'));
        assertFalse(StringUtils.contains("abc", 'z'));

        assertFalse(StringUtils.contains(null, "a"));
        assertFalse(StringUtils.contains("abc", null));
        assertTrue(StringUtils.contains("abc", "a"));
        assertFalse(StringUtils.contains("abc", "z"));
    }

    @Test
    public void containsIgnoreCase_givenInputs_shouldIgnoreCase() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        assertFalse(StringUtils.containsIgnoreCase("abc", null));
        assertTrue(StringUtils.containsIgnoreCase("abc", "A"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "Z"));
    }

    @Test
    public void containsWhitespace_givenInputs_shouldDetectWhitespace() {
        assertFalse(StringUtils.containsWhitespace(null));
        assertFalse(StringUtils.containsWhitespace(""));
        assertFalse(StringUtils.containsWhitespace("abc"));
        assertTrue(StringUtils.containsWhitespace("a b c"));
    }

    @Test
    public void indexOfAny_givenCharArray_shouldFindAnyChar() {
        assertEquals(-1, StringUtils.indexOfAny(null, new char[] { 'a' }));
        assertEquals(-1, StringUtils.indexOfAny("", new char[] { 'a' }));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", new char[0]));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new char[] { 'z', 'a' }));
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", new char[] { 'b', 'y' }));
        assertEquals(-1, StringUtils.indexOfAny("aba", new char[] { 'z' }));

        assertEquals(0, StringUtils.indexOfAny(HIGH_SURROGATE_PAIR, HIGH_SURROGATE_PAIR.toCharArray()));
    }

    @Test
    public void indexOfAny_givenString_shouldFindAnyChar() {
        assertEquals(-1, StringUtils.indexOfAny(null, "a"));
        assertEquals(-1, StringUtils.indexOfAny("a", (String) null));
        assertEquals(-1, StringUtils.indexOfAny("", "a"));
        assertEquals(-1, StringUtils.indexOfAny("a", ""));
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", "za"));
    }

    @Test
    public void containsAny_givenCharArrayOrCharSequence_shouldCheckPresence() {
        assertFalse(StringUtils.containsAny(null, new char[] { 'a' }));
        assertFalse(StringUtils.containsAny("", new char[] { 'a' }));
        assertFalse(StringUtils.containsAny("abc", (char[]) null));
        assertFalse(StringUtils.containsAny("abc", new char[0]));
        assertTrue(StringUtils.containsAny("zzabyycdxx", new char[] { 'z', 'a' }));
        assertFalse(StringUtils.containsAny("zzabyycdxx", new char[] { '1', '2' }));

        assertFalse(StringUtils.containsAny("zzabyycdxx", (CharSequence) null));
        assertTrue(StringUtils.containsAny("zzabyycdxx", "za"));
        assertTrue(StringUtils.containsAny(HIGH_SURROGATE_PAIR, HIGH_SURROGATE_PAIR));
        assertTrue(StringUtils.containsAny(HIGH_SURROGATE_PAIR, new char[] { HIGH_SURROGATE_PAIR.charAt(0) }));
    }

    @Test
    public void indexOfAnyBut_givenCharArrayAndString_shouldFindNotContained() {
        assertEquals(-1, StringUtils.indexOfAnyBut(null, new char[] { 'a' }));
        assertEquals(-1, StringUtils.indexOfAnyBut("", new char[] { 'a' }));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", new char[0]));
        assertEquals(2, StringUtils.indexOfAnyBut("zzabyycdxx", new char[] { 'z' }));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", new char[] { 'a', 'b' }));

        assertEquals(-1, StringUtils.indexOfAnyBut(null, "a"));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", (String) null));
        assertEquals(-1, StringUtils.indexOfAnyBut("", "a"));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", ""));
        assertEquals(2, StringUtils.indexOfAnyBut("zzabyycdxx", "z"));

        assertEquals(0, StringUtils.indexOfAnyBut(HIGH_SURROGATE_PAIR, "a"));
        assertEquals(0, StringUtils.indexOfAnyBut(HIGH_SURROGATE_PAIR + "a", HIGH_SURROGATE_PAIR.charAt(0) + "b"));
        assertEquals(-1, StringUtils.indexOfAnyBut(HIGH_SURROGATE_PAIR, HIGH_SURROGATE_PAIR.toCharArray()));
    }

    @Test
    public void containsOnly_givenInputs_shouldVerifySubset() {
        assertFalse(StringUtils.containsOnly(null, new char[] { 'a' }));
        assertFalse(StringUtils.containsOnly("a", (char[]) null));
        assertTrue(StringUtils.containsOnly("", new char[] { 'a' }));
        assertFalse(StringUtils.containsOnly("ab", new char[0]));
        assertTrue(StringUtils.containsOnly("abab", new char[] { 'a', 'b' }));
        assertFalse(StringUtils.containsOnly("abac", new char[] { 'a', 'b' }));

        assertFalse(StringUtils.containsOnly(null, "a"));
        assertFalse(StringUtils.containsOnly("a", (String) null));
        assertTrue(StringUtils.containsOnly("abab", "ab"));
    }

    @Test
    public void containsNone_givenInputs_shouldVerifyAbsence() {
        assertTrue(StringUtils.containsNone(null, new char[] { 'a' }));
        assertTrue(StringUtils.containsNone("a", (char[]) null));
        assertTrue(StringUtils.containsNone("ab", new char[] { 'x', 'y' }));
        assertFalse(StringUtils.containsNone("ab", new char[] { 'a', 'x' }));

        assertTrue(StringUtils.containsNone(null, "a"));
        assertTrue(StringUtils.containsNone("ab", (String) null));
        assertTrue(StringUtils.containsNone("ab", "xy"));
        assertFalse(StringUtils.containsNone("ab", "ax"));

        assertFalse(StringUtils.containsNone(HIGH_SURROGATE_PAIR, HIGH_SURROGATE_PAIR.toCharArray()));
        assertFalse(StringUtils.containsNone(HIGH_SURROGATE_PAIR, new char[] { HIGH_SURROGATE_PAIR.charAt(0) }));
    }

    @Test
    public void indexOfAny_givenStringArray_shouldFindEarliestMatch() {
        assertEquals(-1, StringUtils.indexOfAny(null, new String[] { "a" }));
        assertEquals(-1, StringUtils.indexOfAny("abc", (String[]) null));
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", new String[] { "ab", "cd" }));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", new String[] { "mn", "op" }));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", new String[] { null }));
    }

    @Test
    public void lastIndexOfAny_givenStringArray_shouldFindLatestMatch() {
        assertEquals(-1, StringUtils.lastIndexOfAny(null, new String[] { "a" }));
        assertEquals(-1, StringUtils.lastIndexOfAny("abc", (String[]) null));
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", new String[] { "ab", "cd" }));
        assertEquals(-1, StringUtils.lastIndexOfAny("zzabyycdxx", new String[] { "mn", "op" }));
        assertEquals(-1, StringUtils.lastIndexOfAny("zzabyycdxx", new String[] { null }));
    }

    @Test
    public void substring_givenStartAndEnd_shouldSliceString() {
        assertNull(StringUtils.substring(null, 0));
        assertEquals("cba", StringUtils.substring("abcba", 2));
        assertEquals("ba", StringUtils.substring("abcba", -2));
        assertEquals("abcba", StringUtils.substring("abcba", -10));
        assertEquals("", StringUtils.substring("abcba", 10));

        assertNull(StringUtils.substring(null, 0, 2));
        assertEquals("bc", StringUtils.substring("abcba", 1, 3));
        assertEquals("cb", StringUtils.substring("abcba", 2, -1));
        assertEquals("", StringUtils.substring("abcba", 4, 2));
        assertEquals("abcba", StringUtils.substring("abcba", -10, 10));
        assertEquals("", StringUtils.substring("abcba", -1, -2));
    }

    @Test
    public void leftRightMid_givenVariousLengths_shouldSliceProperly() {
        assertNull(StringUtils.left(null, 2));
        assertEquals("", StringUtils.left("abc", -1));
        assertEquals("abc", StringUtils.left("abc", 5));
        assertEquals("ab", StringUtils.left("abc", 2));

        assertNull(StringUtils.right(null, 2));
        assertEquals("", StringUtils.right("abc", -1));
        assertEquals("abc", StringUtils.right("abc", 5));
        assertEquals("bc", StringUtils.right("abc", 2));

        assertNull(StringUtils.mid(null, 0, 2));
        assertEquals("", StringUtils.mid("abc", 0, -1));
        assertEquals("", StringUtils.mid("abc", 5, 2));
        assertEquals("ab", StringUtils.mid("abc", -2, 2));
        assertEquals("c", StringUtils.mid("abc", 2, 5));
        assertEquals("b", StringUtils.mid("abc", 1, 1));
    }

    @Test
    public void substringBeforeAndAfter_givenSeparators_shouldExtractParts() {
        assertNull(StringUtils.substringBefore(null, "a"));
        assertEquals("abc", StringUtils.substringBefore("abc", null));
        assertEquals("", StringUtils.substringBefore("abc", ""));
        assertEquals("a", StringUtils.substringBefore("abcba", "b"));
        assertEquals("abc", StringUtils.substringBefore("abc", "z"));

        assertNull(StringUtils.substringAfter(null, "a"));
        assertEquals("", StringUtils.substringAfter("abc", null));
        assertEquals("abc", StringUtils.substringAfter("abc", ""));
        assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
        assertEquals("", StringUtils.substringAfter("abc", "z"));

        assertNull(StringUtils.substringBeforeLast(null, "a"));
        assertEquals("abc", StringUtils.substringBeforeLast("abc", null));
        assertEquals("abc", StringUtils.substringBeforeLast("abc", ""));
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
        assertEquals("abc", StringUtils.substringBeforeLast("abc", "z"));

        assertNull(StringUtils.substringAfterLast(null, "a"));
        assertEquals("", StringUtils.substringAfterLast("abc", null));
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", "z"));
        assertEquals("", StringUtils.substringAfterLast("abcba", "a"));
    }

    @Test
    public void substringBetween_givenDelimiters_shouldExtractMatches() {
        assertNull(StringUtils.substringBetween(null, "tag"));
        assertNull(StringUtils.substringBetween("abc", null));
        assertNull(StringUtils.substringBetween("abc", "[", null));
        assertEquals("bar", StringUtils.substringBetween("[bar]", "[", "]"));
        assertNull(StringUtils.substringBetween("[bar", "[", "]"));

        assertNull(StringUtils.substringsBetween(null, "[", "]"));
        assertNull(StringUtils.substringsBetween("abc", null, "]"));
        assertNull(StringUtils.substringsBetween("abc", "[", null));
        assertArrayEquals(new String[0], StringUtils.substringsBetween("", "[", "]"));
        assertArrayEquals(new String[] { "bar", "baz" }, StringUtils.substringsBetween("[bar] and [baz]", "[", "]"));
        assertNull(StringUtils.substringsBetween("no tags here", "[", "]"));
    }

    @Test
    public void split_givenVariousSeparators_shouldTokenize() {
        assertNull(StringUtils.split(null));
        assertArrayEquals(new String[0], StringUtils.split(""));
        assertArrayEquals(new String[] { "abc", "def" }, StringUtils.split("abc def"));

        assertArrayEquals(new String[] { "a", "b", "c" }, StringUtils.split("a.b.c", '.'));
        assertArrayEquals(new String[] { "a", "b", "c" }, StringUtils.split("a,b;c", ",;"));
        assertArrayEquals(new String[] { "a", "b;c" }, StringUtils.split("a,b;c", ",;", 2));

        assertArrayEquals(new String[] { "a", "b" }, StringUtils.split("a:b", ":"));
    }

    @Test
    public void splitByWholeSeparator_givenVariousInputs_shouldSplitAccurately() {
        assertNull(StringUtils.splitByWholeSeparator(null, "::"));
        assertArrayEquals(new String[0], StringUtils.splitByWholeSeparator("", "::"));
        assertArrayEquals(new String[] { "ab", "de", "fg" }, StringUtils.splitByWholeSeparator("ab  de fg", null));
        assertArrayEquals(new String[] { "ab", "de", "fg" }, StringUtils.splitByWholeSeparator("ab  de fg", ""));
        assertArrayEquals(new String[] { "ab", "cd" }, StringUtils.splitByWholeSeparator("ab::cd", "::"));
        assertArrayEquals(new String[] { "ab", "cd::ef" }, StringUtils.splitByWholeSeparator("ab::cd::ef", "::", 2));
    }

    @Test
    public void splitByWholeSeparatorPreserveAllTokens_givenInputs_shouldPreserve() {
        assertNull(StringUtils.splitByWholeSeparatorPreserveAllTokens(null, "::"));
        assertArrayEquals(new String[0], StringUtils.splitByWholeSeparatorPreserveAllTokens("", "::"));
        assertArrayEquals(new String[] { "ab", "", "cd" }, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab::::cd", "::"));
        assertArrayEquals(new String[] { "ab", "::cd" }, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab::::cd", "::", 2));
        assertArrayEquals(new String[] { "ab", "cd" }, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab cd", null));
    }

    @Test
    public void splitPreserveAllTokens_givenVariousInputs_shouldRetainEmptyTokens() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
        assertArrayEquals(new String[0], StringUtils.splitPreserveAllTokens(""));
        assertArrayEquals(new String[] { "a", "", "b" }, StringUtils.splitPreserveAllTokens("a  b"));
        assertArrayEquals(new String[] { "a", "", "b" }, StringUtils.splitPreserveAllTokens("a::b", ':'));
        assertArrayEquals(new String[] { "a", "", "b" }, StringUtils.splitPreserveAllTokens("a::b", ":"));
        assertArrayEquals(new String[] { "a", "", "b" }, StringUtils.splitPreserveAllTokens("a:,b", ":,"));
        assertArrayEquals(new String[] { "a", ":b" }, StringUtils.splitPreserveAllTokens("a::b", ":", 2));
    }

    @Test
    public void splitByCharacterType_givenCamelCaseAndStandard_shouldSegment() {
        assertNull(StringUtils.splitByCharacterType(null));
        assertArrayEquals(new String[0], StringUtils.splitByCharacterType(""));
        assertArrayEquals(new String[] { "ab", "C", "123" }, StringUtils.splitByCharacterType("abC123"));
        assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
        assertArrayEquals(new String[] { "camel", "Case" }, StringUtils.splitByCharacterTypeCamelCase("camelCase"));
    }

    @Test
    public void join_givenArraysAndCollections_shouldConcatenate() {
        assertNull(StringUtils.join((Object[]) null, ','));
        assertEquals("", StringUtils.join(new Object[0], ','));
        assertEquals("a;b;c", StringUtils.join(new String[] { "a", "b", "c" }, ';'));
        assertEquals("a-b", StringUtils.join(new String[] { "a", "b", "c" }, '-', 0, 2));

        assertNull(StringUtils.join((Object[]) null, ","));
        assertEquals("a, b, c", StringUtils.join(new String[] { "a", "b", "c" }, ", "));
        assertEquals("ab", StringUtils.join(new String[] { "a", "b" }, (String) null));

        assertNull(StringUtils.join((Iterator<?>) null, ','));
        assertEquals("", StringUtils.join(new ArrayList<String>().iterator(), ','));
        assertEquals("a", StringUtils.join(Arrays.asList(new String[] { "a" }).iterator(), ','));
        assertEquals("a,b", StringUtils.join(Arrays.asList(new String[] { "a", "b" }).iterator(), ','));

        assertNull(StringUtils.join((Iterator<?>) null, ","));
        assertEquals("", StringUtils.join(new ArrayList<String>().iterator(), ","));
        assertEquals("a", StringUtils.join(Arrays.asList(new String[] { "a" }).iterator(), ","));
        assertEquals("a, b", StringUtils.join(Arrays.asList(new String[] { "a", "b" }).iterator(), ", "));

        assertNull(StringUtils.join((Iterable<?>) null, ','));
        assertNull(StringUtils.join((Iterable<?>) null, ","));
        assertEquals("a,b", StringUtils.join(Arrays.asList(new String[] { "a", "b" }), ','));
        assertEquals("a,b", StringUtils.join(Arrays.asList(new String[] { "a", "b" }), ","));

        assertEquals("a,b", StringUtils.join("a", "b"));
    }

    @Test
    public void deleteWhitespace_givenInputs_shouldStripAllSpaces() {
        assertNull(StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("abc", StringUtils.deleteWhitespace(" a b c "));
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));
    }

    @Test
    public void removeStartAndEnd_givenAffixes_shouldTrimMatches() {
        assertNull(StringUtils.removeStart(null, "a"));
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", ""));
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", "xyz"));

        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("WWW.domain.com", "www."));
        assertEquals("WWW.domain.com", StringUtils.removeStartIgnoreCase("WWW.domain.com", "xyz"));

        assertNull(StringUtils.removeEnd(null, "a"));
        assertEquals("www.domain", StringUtils.removeEnd("www.domain.com", ".com"));
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", ".org"));

        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.COM", ".com"));
        assertEquals("www.domain.COM", StringUtils.removeEndIgnoreCase("www.domain.COM", ".org"));
    }

    @Test
    public void remove_givenSubstringOrChar_shouldDeleteAllOccurrences() {
        assertNull(StringUtils.remove(null, "a"));
        assertEquals("queued", StringUtils.remove("queued", ""));
        assertEquals("qud", StringUtils.remove("queued", "e"));

        assertNull(StringUtils.remove(null, 'a'));
        assertEquals("queued", StringUtils.remove("queued", 'z'));
        assertEquals("qud", StringUtils.remove("queued", 'e'));
    }

    @Test
    public void replace_givenMaxAndStrings_shouldReplaceProperly() {
        assertNull(StringUtils.replace(null, "a", "b"));
        assertEquals("aba", StringUtils.replace("aba", null, "b"));
        assertEquals("aba", StringUtils.replace("aba", "a", null));
        assertEquals("aba", StringUtils.replace("aba", "a", "z", 0));
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
        assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
        assertEquals("zbz", StringUtils.replace("aba", "a", "z", -1));
        assertEquals("zba", StringUtils.replace("aba", "a", "z", 1));
        assertEquals("abc", StringUtils.replace("abc", "d", "z"));
    }

    @Test
    public void replaceEach_givenArrays_shouldReplaceSimultaneously() {
        assertNull(StringUtils.replaceEach(null, new String[] { "a" }, new String[] { "b" }));
        assertEquals("aba", StringUtils.replaceEach("aba", null, new String[] { "b" }));
        assertEquals("aba", StringUtils.replaceEach("aba", new String[] { "a" }, null));
        assertEquals("aba", StringUtils.replaceEach("aba", new String[0], new String[0]));
        assertEquals("aba", StringUtils.replaceEach("aba", new String[] { "c" }, new String[] { "d" }));
        assertEquals("b", StringUtils.replaceEach("aba", new String[] { "a" }, new String[] { "" }));
        assertEquals("cdc", StringUtils.replaceEach("aba", new String[] { "a", "b" }, new String[] { "c", "d" }));

        assertEquals("d", StringUtils.replaceEachRepeatedly("a", new String[] { "a", "b", "c" }, new String[] { "b", "c", "d" }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceEach_givenMismatchedArrayLengths_shouldThrowException() {
        StringUtils.replaceEach("aba", new String[] { "a" }, new String[] { "b", "c" });
    }

    @Test(expected = IllegalStateException.class)
    public void replaceEachRepeatedly_givenNegativeTimeToLive_shouldThrowException() {
        StringUtils.replaceEachRepeatedly("aba", new String[] { "a", "b" }, new String[] { "b", "a" });
    }

    @Test
    public void replaceChars_givenCharsOrStrings_shouldSubstitute() {
        assertNull(StringUtils.replaceChars(null, 'a', 'b'));
        assertEquals("zbz", StringUtils.replaceChars("aba", 'a', 'z'));

        assertNull(StringUtils.replaceChars(null, "a", "b"));
        assertEquals("aba", StringUtils.replaceChars("aba", null, "b"));
        assertEquals("aba", StringUtils.replaceChars("aba", "", "b"));
        assertEquals("b", StringUtils.replaceChars("aba", "a", null));
        assertEquals("zaz", StringUtils.replaceChars("aba", "ab", "zy"));
    }

    @Test
    public void overlay_givenIndices_shouldOverlayCorrectly() {
        assertNull(StringUtils.overlay(null, "abc", 0, 0));
        assertEquals("abcdef", StringUtils.overlay("abcdef", null, 2, 4));
        assertEquals("abzzef", StringUtils.overlay("abcdef", "zz", 2, 4));
        assertEquals("abzzef", StringUtils.overlay("abcdef", "zz", 4, 2));
        assertEquals("zzabcdef", StringUtils.overlay("abcdef", "zz", -1, 0));
        assertEquals("abcdefzz", StringUtils.overlay("abcdef", "zz", 10, 12));
    }

    @Test
    public void chompAndChop_givenVariousStrings_shouldStripEndings() {
        assertNull(StringUtils.chomp(null));
        assertEquals("", StringUtils.chomp(""));
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc", StringUtils.chomp("abc\r"));
        assertEquals("abc", StringUtils.chomp("abc\n"));
        assertEquals("abc", StringUtils.chomp("abc"));
        assertEquals("", StringUtils.chomp("\r"));

        assertNull(StringUtils.chomp(null, ";"));
        assertEquals("abc", StringUtils.chomp("abc;", ";"));
        assertEquals("abc", StringUtils.chomp("abc", ";"));

        assertNull(StringUtils.chop(null));
        assertEquals("", StringUtils.chop(""));
        assertEquals("", StringUtils.chop("a"));
        assertEquals("ab", StringUtils.chop("abc"));
        assertEquals("abc", StringUtils.chop("abc\r\n"));
        assertEquals("abc", StringUtils.chop("abc\r"));
        assertEquals("abc", StringUtils.chop("abc\n"));
    }

    @Test
    public void repeat_givenVariousCounts_shouldDuplicateString() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("abc", 0));
        assertEquals("", StringUtils.repeat("abc", -1));
        assertEquals("abc", StringUtils.repeat("abc", 1));
        assertEquals("", StringUtils.repeat("", 5));
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("ababab", StringUtils.repeat("ab", 3));
        assertEquals("abcabcabc", StringUtils.repeat("abc", 3));

        assertEquals("a,a,a", StringUtils.repeat("a", ",", 3));
        assertEquals("aaa", StringUtils.repeat("a", null, 3));
        assertEquals("aaa", StringUtils.repeat('a', 3));
    }

    @Test
    public void pad_givenLeftAndRight_shouldPadString() {
        assertNull(StringUtils.rightPad(null, 5));
        assertEquals("abc", StringUtils.rightPad("abc", 2));
        assertEquals("abc  ", StringUtils.rightPad("abc", 5));
        assertEquals("abc00", StringUtils.rightPad("abc", 5, '0'));
        assertEquals("abc--", StringUtils.rightPad("abc", 5, "-"));
        assertEquals("abc-+-+", StringUtils.rightPad("abc", 7, "-+"));
        assertEquals("abc", StringUtils.rightPad("abc", 5, ""));

        assertNull(StringUtils.leftPad(null, 5));
        assertEquals("abc", StringUtils.leftPad("abc", 2));
        assertEquals("  abc", StringUtils.leftPad("abc", 5));
        assertEquals("00abc", StringUtils.leftPad("abc", 5, '0'));
        assertEquals("--abc", StringUtils.leftPad("abc", 5, "-"));
        assertEquals("-+-+abc", StringUtils.leftPad("abc", 7, "-+"));
        assertEquals("abc", StringUtils.leftPad("abc", 5, ""));

        assertEquals(8195, StringUtils.leftPad("abc", 8195, ' ').length());
        assertEquals(8195, StringUtils.rightPad("abc", 8195, ' ').length());
    }

    @Test
    public void length_givenCharSequence_shouldReturnAccurateCount() {
        assertEquals(0, StringUtils.length(null));
        assertEquals(0, StringUtils.length(""));
        assertEquals(3, StringUtils.length("abc"));
    }

    @Test
    public void center_givenSizeAndPads_shouldCenterString() {
        assertNull(StringUtils.center(null, 5));
        assertEquals("abc", StringUtils.center("abc", 0));
        assertEquals("abc", StringUtils.center("abc", 2));
        assertEquals(" abc ", StringUtils.center("abc", 5));
        assertEquals("0abc0", StringUtils.center("abc", 5, '0'));
        assertEquals("-abc-", StringUtils.center("abc", 5, "-"));
        assertEquals(" abc ", StringUtils.center("abc", 5, ""));
    }

    @Test
    public void caseConversions_givenStrings_shouldTransformCase() {
        assertNull(StringUtils.upperCase(null));
        assertEquals("ABC", StringUtils.upperCase("abc"));
        assertEquals("ABC", StringUtils.upperCase("abc", Locale.ENGLISH));
        assertNull(StringUtils.upperCase(null, Locale.ENGLISH));

        assertNull(StringUtils.lowerCase(null));
        assertEquals("abc", StringUtils.lowerCase("ABC"));
        assertEquals("abc", StringUtils.lowerCase("ABC", Locale.ENGLISH));
        assertNull(StringUtils.lowerCase(null, Locale.ENGLISH));

        assertNull(StringUtils.capitalize(null));
        assertEquals("", StringUtils.capitalize(""));
        assertEquals("Cat", StringUtils.capitalize("cat"));

        assertNull(StringUtils.uncapitalize(null));
        assertEquals("", StringUtils.uncapitalize(""));
        assertEquals("cat", StringUtils.uncapitalize("Cat"));

        assertNull(StringUtils.swapCase(null));
        assertEquals("", StringUtils.swapCase(""));
        assertEquals("cAT", StringUtils.swapCase("Cat"));
    }

    @Test
    public void countMatches_givenSubstrings_shouldCountMatches() {
        assertEquals(0, StringUtils.countMatches(null, "a"));
        assertEquals(0, StringUtils.countMatches("abc", null));
        assertEquals(0, StringUtils.countMatches("abc", ""));
        assertEquals(2, StringUtils.countMatches("aba", "a"));
        assertEquals(0, StringUtils.countMatches("abc", "d"));
    }

    @Test
    public void isAlphaAndAlphanumericPredicates_givenVariousStrings_shouldValidate() {
        assertFalse(StringUtils.isAlpha(null));
        assertFalse(StringUtils.isAlpha(""));
        assertTrue(StringUtils.isAlpha("abc"));
        assertFalse(StringUtils.isAlpha("ab1"));

        assertFalse(StringUtils.isAlphaSpace(null));
        assertTrue(StringUtils.isAlphaSpace(""));
        assertTrue(StringUtils.isAlphaSpace("ab c"));
        assertFalse(StringUtils.isAlphaSpace("ab 1"));

        assertFalse(StringUtils.isAlphanumeric(null));
        assertFalse(StringUtils.isAlphanumeric(""));
        assertTrue(StringUtils.isAlphanumeric("ab1"));
        assertFalse(StringUtils.isAlphanumeric("ab 1"));

        assertFalse(StringUtils.isAlphanumericSpace(null));
        assertTrue(StringUtils.isAlphanumericSpace(""));
        assertTrue(StringUtils.isAlphanumericSpace("ab 1"));
        assertFalse(StringUtils.isAlphanumericSpace("ab-1"));

        assertFalse(StringUtils.isAsciiPrintable(null));
        assertTrue(StringUtils.isAsciiPrintable("abc"));
        assertFalse(StringUtils.isAsciiPrintable("\u0000"));

        assertFalse(StringUtils.isNumeric(null));
        assertFalse(StringUtils.isNumeric(""));
        assertTrue(StringUtils.isNumeric("123"));
        assertFalse(StringUtils.isNumeric("12a"));

        assertFalse(StringUtils.isNumericSpace(null));
        assertTrue(StringUtils.isNumericSpace(""));
        assertTrue(StringUtils.isNumericSpace("12 3"));
        assertFalse(StringUtils.isNumericSpace("12-3"));

        assertFalse(StringUtils.isWhitespace(null));
        assertTrue(StringUtils.isWhitespace(""));
        assertTrue(StringUtils.isWhitespace("   "));
        assertFalse(StringUtils.isWhitespace(" a "));

        assertFalse(StringUtils.isAllLowerCase(null));
        assertFalse(StringUtils.isAllLowerCase(""));
        assertTrue(StringUtils.isAllLowerCase("abc"));
        assertFalse(StringUtils.isAllLowerCase("aBc"));

        assertFalse(StringUtils.isAllUpperCase(null));
        assertFalse(StringUtils.isAllUpperCase(""));
        assertTrue(StringUtils.isAllUpperCase("ABC"));
        assertFalse(StringUtils.isAllUpperCase("ABc"));
    }

    @Test
    public void defaultString_givenVariousStrings_shouldProvideFallback() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("abc", StringUtils.defaultString("abc"));

        assertEquals("default", StringUtils.defaultString(null, "default"));
        assertEquals("abc", StringUtils.defaultString("abc", "default"));

        assertEquals("default", StringUtils.defaultIfBlank(null, "default"));
        assertEquals("default", StringUtils.defaultIfBlank("   ", "default"));
        assertEquals("abc", StringUtils.defaultIfBlank("abc", "default"));

        assertEquals("default", StringUtils.defaultIfEmpty(null, "default"));
        assertEquals("default", StringUtils.defaultIfEmpty("", "default"));
        assertEquals("   ", StringUtils.defaultIfEmpty("   ", "default"));
    }

    @Test
    public void reverseAndDelimited_givenStrings_shouldReverse() {
        assertNull(StringUtils.reverse(null));
        assertEquals("cba", StringUtils.reverse("abc"));

        assertNull(StringUtils.reverseDelimited(null, '.'));
        assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.'));
    }

    @Test
    public void abbreviate_givenWidths_shouldAbbreviateProperly() {
        assertNull(StringUtils.abbreviate(null, 5));
        assertEquals("abcdef", StringUtils.abbreviate("abcdef", 10));
        assertEquals("ab...", StringUtils.abbreviate("abcdefg", 5));

        assertEquals("abcdef", StringUtils.abbreviate("abcdef", 0, 10));
        assertEquals("...f...", StringUtils.abbreviate("abcdefghijkl", 5, 7));
        assertEquals("...jkl", StringUtils.abbreviate("abcdefghijkl", 9, 6));

        try {
            StringUtils.abbreviate("abcdef", 3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Success
        }

        try {
            StringUtils.abbreviate("abcdefghij", 5, 6);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }

    @Test
    public void abbreviateMiddle_givenLengths_shouldShortenCenter() {
        assertNull(StringUtils.abbreviateMiddle(null, "..", 5));
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", null, 5));
        assertEquals("abcde", StringUtils.abbreviateMiddle("abcde", "..", 10));
        assertEquals("abcde", StringUtils.abbreviateMiddle("abcde", "..", 3));
        assertEquals("a..e", StringUtils.abbreviateMiddle("abcde", "..", 4));
    }

    @Test
    public void difference_givenPairsAndArrays_shouldDetectDifferences() {
        assertEquals("def", StringUtils.difference("abc", "abcdef"));
        assertEquals("abc", StringUtils.difference(null, "abc"));
        assertEquals("abc", StringUtils.difference("abc", null));
        assertEquals("", StringUtils.difference("abc", "abc"));

        assertEquals(-1, StringUtils.indexOfDifference((CharSequence) "abc", (CharSequence) "abc"));
        assertEquals(0, StringUtils.indexOfDifference((CharSequence) null, (CharSequence) "abc"));
        assertEquals(2, StringUtils.indexOfDifference((CharSequence) "ab", (CharSequence) "abxyz"));

        assertEquals(-1, StringUtils.indexOfDifference((CharSequence[]) null));
        assertEquals(-1, StringUtils.indexOfDifference(new CharSequence[] { "abc" }));
        assertEquals(-1, StringUtils.indexOfDifference(new CharSequence[] { "abc", "abc" }));
        assertEquals(0, StringUtils.indexOfDifference(new CharSequence[] { null, "abc" }));
        assertEquals(2, StringUtils.indexOfDifference(new CharSequence[] { "ab", "abxyz", "ab123" }));
        assertEquals(2, StringUtils.indexOfDifference(new CharSequence[] { "ab", "abc" }));

        assertEquals("", StringUtils.getCommonPrefix((String[]) null));
        assertEquals("", StringUtils.getCommonPrefix(new String[0]));
        assertEquals("", StringUtils.getCommonPrefix(new String[] { null }));
        assertEquals("ab", StringUtils.getCommonPrefix(new String[] { "abc", "abd" }));
    }

    @Test
    public void levenshteinDistance_givenVariations_shouldComputeDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        assertEquals(3, StringUtils.getLevenshteinDistance("kitten", "sitting"));

        assertEquals(0, StringUtils.getLevenshteinDistance("", "", 0));
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a", 1));
        assertEquals(-1, StringUtils.getLevenshteinDistance("", "a", 0));
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog", 1));
        assertEquals(-1, StringUtils.getLevenshteinDistance("frog", "fog", 0));
        assertEquals(3, StringUtils.getLevenshteinDistance("kitten", "sitting", 4));
        assertEquals(-1, StringUtils.getLevenshteinDistance("kitten", "sitting", 2));

        try {
            StringUtils.getLevenshteinDistance(null, "a");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Success
        }

        try {
            StringUtils.getLevenshteinDistance("a", "b", -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }

    @Test
    public void startsWithAndEndsWith_givenPrefixesAndSuffixes_shouldMatch() {
        assertTrue(StringUtils.startsWith(null, null));
        assertFalse(StringUtils.startsWith(null, "a"));
        assertFalse(StringUtils.startsWith("a", null));
        assertTrue(StringUtils.startsWith("abcdef", "abc"));
        assertFalse(StringUtils.startsWith("abcdef", "xyz"));
        assertFalse(StringUtils.startsWith("abc", "abcdef"));

        assertTrue(StringUtils.startsWithIgnoreCase("abcdef", "ABC"));
        assertFalse(StringUtils.startsWithIgnoreCase("abcdef", "XYZ"));

        assertTrue(StringUtils.startsWithAny("abcdef", "xyz", "abc"));
        assertFalse(StringUtils.startsWithAny("abcdef", "xyz", "123"));
        assertFalse(StringUtils.startsWithAny(null, "abc"));
        assertFalse(StringUtils.startsWithAny("abcdef", (String[]) null));

        assertTrue(StringUtils.endsWith(null, null));
        assertFalse(StringUtils.endsWith(null, "a"));
        assertFalse(StringUtils.endsWith("a", null));
        assertTrue(StringUtils.endsWith("abcdef", "def"));
        assertFalse(StringUtils.endsWith("abcdef", "xyz"));
        assertFalse(StringUtils.endsWith("def", "abcdef"));

        assertTrue(StringUtils.endsWithIgnoreCase("abcdef", "DEF"));
        assertFalse(StringUtils.endsWithIgnoreCase("abcdef", "XYZ"));

        assertTrue(StringUtils.endsWithAny("abcdef", "xyz", "def"));
        assertFalse(StringUtils.endsWithAny("abcdef", "xyz", "123"));
        assertFalse(StringUtils.endsWithAny(null, "def"));
        assertFalse(StringUtils.endsWithAny("abcdef", (String[]) null));
    }

    @Test
    public void normalizeSpace_givenVariousWhitespace_shouldCompactWhitespace() {
        assertNull(StringUtils.normalizeSpace(null));
        assertEquals("", StringUtils.normalizeSpace(""));
        assertEquals("a b c", StringUtils.normalizeSpace("  a  \t \n b   c  "));
    }
}