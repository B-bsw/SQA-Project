package org.apache.commons.lang3;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class StringUtilsTest {

    @Test
    public void constructor_whenInstantiated_shouldNotNull() {
        StringUtils instance = new StringUtils();
        Assert.assertNotNull(instance);
    }

    @Test
    public void isEmpty_givenNullOrEmptyOrText_shouldReturnExpected() {
        Assert.assertTrue(StringUtils.isEmpty(null));
        Assert.assertTrue(StringUtils.isEmpty(""));
        Assert.assertFalse(StringUtils.isEmpty(" "));
        Assert.assertFalse(StringUtils.isEmpty("abc"));
    }

    @Test
    public void isNotEmpty_givenNullOrEmptyOrText_shouldReturnExpected() {
        Assert.assertFalse(StringUtils.isNotEmpty(null));
        Assert.assertFalse(StringUtils.isNotEmpty(""));
        Assert.assertTrue(StringUtils.isNotEmpty(" "));
        Assert.assertTrue(StringUtils.isNotEmpty("abc"));
    }

    @Test
    public void isBlank_givenNullEmptyWhitespaceText_shouldReturnExpected() {
        Assert.assertTrue(StringUtils.isBlank(null));
        Assert.assertTrue(StringUtils.isBlank(""));
        Assert.assertTrue(StringUtils.isBlank(" \t\r\n "));
        Assert.assertFalse(StringUtils.isBlank("  a  "));
        Assert.assertFalse(StringUtils.isBlank("abc"));
    }

    @Test
    public void isNotBlank_givenNullEmptyWhitespaceText_shouldReturnExpected() {
        Assert.assertFalse(StringUtils.isNotBlank(null));
        Assert.assertFalse(StringUtils.isNotBlank(""));
        Assert.assertFalse(StringUtils.isNotBlank(" \t\r\n "));
        Assert.assertTrue(StringUtils.isNotBlank("  a  "));
        Assert.assertTrue(StringUtils.isNotBlank("abc"));
    }

    @Test
    public void trim_givenVariousStrings_shouldTrimWhitespace() {
        Assert.assertNull(StringUtils.trim(null));
        Assert.assertEquals("", StringUtils.trim(""));
        Assert.assertEquals("", StringUtils.trim("   "));
        Assert.assertEquals("abc", StringUtils.trim("  abc  "));
    }

    @Test
    public void trimToNull_givenVariousStrings_shouldReturnTrimmedOrNull() {
        Assert.assertNull(StringUtils.trimToNull(null));
        Assert.assertNull(StringUtils.trimToNull(""));
        Assert.assertNull(StringUtils.trimToNull("   "));
        Assert.assertEquals("abc", StringUtils.trimToNull("  abc  "));
    }

    @Test
    public void trimToEmpty_givenVariousStrings_shouldReturnTrimmedOrEmpty() {
        Assert.assertEquals("", StringUtils.trimToEmpty(null));
        Assert.assertEquals("", StringUtils.trimToEmpty(""));
        Assert.assertEquals("", StringUtils.trimToEmpty("   "));
        Assert.assertEquals("abc", StringUtils.trimToEmpty("  abc  "));
    }

    @Test
    public void strip_givenNullOrEmptyOrSpaces_shouldStripWhitespace() {
        Assert.assertNull(StringUtils.strip(null));
        Assert.assertEquals("", StringUtils.strip(""));
        Assert.assertEquals("", StringUtils.strip("   "));
        Assert.assertEquals("abc", StringUtils.strip("  abc  "));
        Assert.assertEquals("abc", StringUtils.strip("  \t abc \r \n "));
    }

    @Test
    public void stripToNull_givenVariousStrings_shouldReturnStrippedOrNull() {
        Assert.assertNull(StringUtils.stripToNull(null));
        Assert.assertNull(StringUtils.stripToNull(""));
        Assert.assertNull(StringUtils.stripToNull("   "));
        Assert.assertEquals("abc", StringUtils.stripToNull("  abc  "));
    }

    @Test
    public void stripToEmpty_givenVariousStrings_shouldReturnStrippedOrEmpty() {
        Assert.assertEquals("", StringUtils.stripToEmpty(null));
        Assert.assertEquals("", StringUtils.stripToEmpty(""));
        Assert.assertEquals("", StringUtils.stripToEmpty("   "));
        Assert.assertEquals("abc", StringUtils.stripToEmpty("  abc  "));
    }

    @Test
    public void strip_givenCustomChars_shouldStripSpecifiedChars() {
        Assert.assertNull(StringUtils.strip(null, "*"));
        Assert.assertEquals("", StringUtils.strip("", "*"));
        Assert.assertEquals("abc", StringUtils.strip("**abc**", "*"));
        Assert.assertEquals("abc", StringUtils.strip("xyzabcxyz", "xyz"));
        Assert.assertEquals("  abc  ", StringUtils.strip("  abc  ", ""));
    }

    @Test
    public void stripStart_givenVariousInputs_shouldStripFromBeginning() {
        Assert.assertNull(StringUtils.stripStart(null, "*"));
        Assert.assertEquals("", StringUtils.stripStart("", "*"));
        Assert.assertEquals("abc  ", StringUtils.stripStart("  abc  ", null));
        Assert.assertEquals("abc**", StringUtils.stripStart("**abc**", "*"));
        Assert.assertEquals("**abc**", StringUtils.stripStart("**abc**", ""));
        Assert.assertEquals("abcxyz", StringUtils.stripStart("xyzabcxyz", "xyz"));
    }

    @Test
    public void stripEnd_givenVariousInputs_shouldStripFromEnd() {
        Assert.assertNull(StringUtils.stripEnd(null, "*"));
        Assert.assertEquals("", StringUtils.stripEnd("", "*"));
        Assert.assertEquals("  abc", StringUtils.stripEnd("  abc  ", null));
        Assert.assertEquals("**abc", StringUtils.stripEnd("**abc**", "*"));
        Assert.assertEquals("**abc**", StringUtils.stripEnd("**abc**", ""));
        Assert.assertEquals("xyzabc", StringUtils.stripEnd("xyzabcxyz", "xyz"));
    }

    @Test
    public void stripAll_givenArrayWithoutChars_shouldStripWhitespaceFromAll() {
        Assert.assertNull(StringUtils.stripAll((String[]) null));
        Assert.assertArrayEquals(new String[0], StringUtils.stripAll(new String[0]));
        String[] input = new String[] {"  a  ", " b ", "c"};
        String[] expected = new String[] {"a", "b", "c"};
        Assert.assertArrayEquals(expected, StringUtils.stripAll(input));
    }

    @Test
    public void stripAll_givenArrayWithChars_shouldStripTargetCharsFromAll() {
        Assert.assertNull(StringUtils.stripAll((String[]) null, "*"));
        String[] input = new String[] {"*a*", "**b**", "c*"};
        String[] expected = new String[] {"a", "b", "c"};
        Assert.assertArrayEquals(expected, StringUtils.stripAll(input, "*"));
    }

    @Test
    public void stripAccents_givenNullOrPlainOrAccented_shouldReturnExpected() {
        Assert.assertNull(StringUtils.stripAccents(null));
        Assert.assertEquals("", StringUtils.stripAccents(""));
        Assert.assertEquals("control", StringUtils.stripAccents("control"));
        Assert.assertEquals("eclair", StringUtils.stripAccents("\u00e9clair"));
    }

    @Test
    public void equals_givenCharSequencePairs_shouldReturnCorrectEquality() {
        Assert.assertTrue(StringUtils.equals(null, null));
        Assert.assertFalse(StringUtils.equals(null, "abc"));
        Assert.assertFalse(StringUtils.equals("abc", null));
        Assert.assertTrue(StringUtils.equals("abc", "abc"));
        Assert.assertFalse(StringUtils.equals("abc", "ABC"));
        Assert.assertTrue(StringUtils.equals(new StringBuilder("abc"), new StringBuilder("abc")));
    }

    @Test
    public void equalsIgnoreCase_givenVariousInputs_shouldMatchIgnoringCase() {
        Assert.assertTrue(StringUtils.equalsIgnoreCase(null, null));
        Assert.assertFalse(StringUtils.equalsIgnoreCase(null, "abc"));
        Assert.assertFalse(StringUtils.equalsIgnoreCase("abc", null));
        Assert.assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
        Assert.assertTrue(StringUtils.equalsIgnoreCase("abc", "abc"));
        Assert.assertFalse(StringUtils.equalsIgnoreCase("abcd", "abc"));
    }

    @Test
    public void indexOf_char_givenVariousInputs_shouldFindCorrectPosition() {
        Assert.assertEquals(-1, StringUtils.indexOf(null, 'a'));
        Assert.assertEquals(-1, StringUtils.indexOf("", 'a'));
        Assert.assertEquals(1, StringUtils.indexOf("aabaabaa", 'b'));
        Assert.assertEquals(-1, StringUtils.indexOf("aabaabaa", 'z'));

        Assert.assertEquals(-1, StringUtils.indexOf(null, 'a', 0));
        Assert.assertEquals(-1, StringUtils.indexOf("", 'a', 0));
        Assert.assertEquals(1, StringUtils.indexOf("aabaabaa", 'b', 0));
        Assert.assertEquals(4, StringUtils.indexOf("aabaabaa", 'b', 2));
        Assert.assertEquals(-1, StringUtils.indexOf("aabaabaa", 'b', 99));
    }

    @Test
    public void indexOf_string_givenVariousInputs_shouldFindCorrectPosition() {
        Assert.assertEquals(-1, StringUtils.indexOf(null, "a"));
        Assert.assertEquals(-1, StringUtils.indexOf("a", null));
        Assert.assertEquals(0, StringUtils.indexOf("aabaabaa", ""));
        Assert.assertEquals(1, StringUtils.indexOf("aabaabaa", "ab"));
        Assert.assertEquals(-1, StringUtils.indexOf("aabaabaa", "zz"));

        Assert.assertEquals(-1, StringUtils.indexOf(null, "a", 0));
        Assert.assertEquals(-1, StringUtils.indexOf("a", null, 0));
        Assert.assertEquals(1, StringUtils.indexOf("aabaabaa", "ab", 0));
        Assert.assertEquals(4, StringUtils.indexOf("aabaabaa", "ab", 2));
    }

    @Test
    public void ordinalIndexOf_givenVariousOrdinals_shouldFindCorrectPositions() {
        Assert.assertEquals(-1, StringUtils.ordinalIndexOf(null, "a", 1));
        Assert.assertEquals(-1, StringUtils.ordinalIndexOf("a", null, 1));
        Assert.assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "a", 0));
        Assert.assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "a", -1));
        Assert.assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "", 1));
        Assert.assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
        Assert.assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "a", 2));
        Assert.assertEquals(3, StringUtils.ordinalIndexOf("aabaabaa", "a", 3));
        Assert.assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "a", 10));
    }

    @Test
    public void lastOrdinalIndexOf_givenVariousOrdinals_shouldFindCorrectPositions() {
        Assert.assertEquals(-1, StringUtils.lastOrdinalIndexOf(null, "a", 1));
        Assert.assertEquals(-1, StringUtils.lastOrdinalIndexOf("a", null, 1));
        Assert.assertEquals(-1, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 0));
        Assert.assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1));
        Assert.assertEquals(7, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 1));
        Assert.assertEquals(6, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 2));
        Assert.assertEquals(-1, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 10));
    }

    @Test
    public void indexOfIgnoreCase_givenVariousInputs_shouldMatchIgnoringCase() {
        Assert.assertEquals(-1, StringUtils.indexOfIgnoreCase(null, "a"));
        Assert.assertEquals(-1, StringUtils.indexOfIgnoreCase("a", null));
        Assert.assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", ""));
        Assert.assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB"));
        Assert.assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 5));
        Assert.assertEquals(4, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 2));
        Assert.assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", "A", -5));
        Assert.assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 99));
        Assert.assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "", 2));
    }

    @Test
    public void lastIndexOf_char_givenVariousInputs_shouldFindExpectedIndices() {
        Assert.assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
        Assert.assertEquals(-1, StringUtils.lastIndexOf("", 'a'));
        Assert.assertEquals(4, StringUtils.lastIndexOf("aabaabaa", 'b'));
        Assert.assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", 'z'));

        Assert.assertEquals(-1, StringUtils.lastIndexOf(null, 'a', 0));
        Assert.assertEquals(-1, StringUtils.lastIndexOf("", 'a', 0));
        Assert.assertEquals(1, StringUtils.lastIndexOf("aabaabaa", 'b', 2));
    }

    @Test
    public void lastIndexOf_string_givenVariousInputs_shouldFindExpectedIndices() {
        Assert.assertEquals(-1, StringUtils.lastIndexOf(null, "a"));
        Assert.assertEquals(-1, StringUtils.lastIndexOf("a", null));
        Assert.assertEquals(4, StringUtils.lastIndexOf("aabaabaa", "ab"));
        Assert.assertEquals(8, StringUtils.lastIndexOf("aabaabaa", ""));

        Assert.assertEquals(-1, StringUtils.lastIndexOf(null, "a", 0));
        Assert.assertEquals(-1, StringUtils.lastIndexOf("a", null, 0));
        Assert.assertEquals(1, StringUtils.lastIndexOf("aabaabaa", "ab", 2));
    }

    @Test
    public void lastIndexOfIgnoreCase_givenVariousInputs_shouldFindExpectedIndices() {
        Assert.assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "a"));
        Assert.assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("a", null));
        Assert.assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB"));
        Assert.assertEquals(8, StringUtils.lastIndexOfIgnoreCase("aabaabaa", ""));
        Assert.assertEquals(1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB", 2));
        Assert.assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB", -1));
        Assert.assertEquals(1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB", 99));
        Assert.assertEquals(3, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "", 3));
    }

    @Test
    public void contains_charAndString_shouldReturnExpectedBoolean() {
        Assert.assertFalse(StringUtils.contains(null, 'a'));
        Assert.assertFalse(StringUtils.contains("", 'a'));
        Assert.assertTrue(StringUtils.contains("abc", 'a'));
        Assert.assertFalse(StringUtils.contains("abc", 'z'));

        Assert.assertFalse(StringUtils.contains(null, "a"));
        Assert.assertFalse(StringUtils.contains("a", null));
        Assert.assertTrue(StringUtils.contains("abc", ""));
        Assert.assertTrue(StringUtils.contains("abc", "bc"));
        Assert.assertFalse(StringUtils.contains("abc", "d"));
    }

    @Test
    public void containsIgnoreCase_givenVariousInputs_shouldReturnCorrectBoolean() {
        Assert.assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        Assert.assertFalse(StringUtils.containsIgnoreCase("a", null));
        Assert.assertTrue(StringUtils.containsIgnoreCase("abc", "BC"));
        Assert.assertFalse(StringUtils.containsIgnoreCase("abc", "XYZ"));
    }

    @Test
    public void containsWhitespace_givenVariousInputs_shouldDetectWhitespace() {
        Assert.assertFalse(StringUtils.containsWhitespace(null));
        Assert.assertFalse(StringUtils.containsWhitespace(""));
        Assert.assertFalse(StringUtils.containsWhitespace("abc"));
        Assert.assertTrue(StringUtils.containsWhitespace("a b"));
        Assert.assertTrue(StringUtils.containsWhitespace("a\tb"));
    }

    @Test
    public void indexOfAny_charArray_shouldReturnFirstMatchingIndex() {
        Assert.assertEquals(-1, StringUtils.indexOfAny(null, 'a'));
        Assert.assertEquals(-1, StringUtils.indexOfAny("zz", new char[0]));
        Assert.assertEquals(0, StringUtils.indexOfAny("zz", 'z', 'a'));
        Assert.assertEquals(1, StringUtils.indexOfAny("az", 'z'));
        Assert.assertEquals(-1, StringUtils.indexOfAny("abc", 'x', 'y'));
        Assert.assertEquals(-1, StringUtils.indexOfAny(null, "a"));
        Assert.assertEquals(-1, StringUtils.indexOfAny("a", (String) null));
        Assert.assertEquals(-1, StringUtils.indexOfAny("a", ""));
        Assert.assertEquals(1, StringUtils.indexOfAny("zzay", "ay"));
    }

    @Test
    public void containsAny_charArrayAndString_shouldReturnExpectedBoolean() {
        Assert.assertFalse(StringUtils.containsAny(null, 'a'));
        Assert.assertFalse(StringUtils.containsAny("a", new char[0]));
        Assert.assertTrue(StringUtils.containsAny("zzay", 'a', 'b'));
        Assert.assertFalse(StringUtils.containsAny("zz", 'a', 'b'));

        Assert.assertFalse(StringUtils.containsAny(null, "a"));
        Assert.assertFalse(StringUtils.containsAny("a", (CharSequence) null));
        Assert.assertTrue(StringUtils.containsAny("zzay", "a"));
        Assert.assertFalse(StringUtils.containsAny("zz", "a"));
    }

    @Test
    public void indexOfAnyBut_charArrayAndString_shouldReturnExpectedIndex() {
        Assert.assertEquals(-1, StringUtils.indexOfAnyBut(null, 'a'));
        Assert.assertEquals(-1, StringUtils.indexOfAnyBut("a", new char[0]));
        Assert.assertEquals(2, StringUtils.indexOfAnyBut("zzay", 'z'));
        Assert.assertEquals(-1, StringUtils.indexOfAnyBut("zzz", 'z'));

        Assert.assertEquals(-1, StringUtils.indexOfAnyBut(null, "z"));
        Assert.assertEquals(-1, StringUtils.indexOfAnyBut("z", (CharSequence) null));
        Assert.assertEquals(2, StringUtils.indexOfAnyBut("zzay", "z"));
        Assert.assertEquals(-1, StringUtils.indexOfAnyBut("zzz", "z"));
    }

    @Test
    public void containsOnly_givenCharOrString_shouldCheckExclusively() {
        Assert.assertFalse(StringUtils.containsOnly(null, 'a'));
        Assert.assertFalse(StringUtils.containsOnly("a", (char[]) null));
        Assert.assertTrue(StringUtils.containsOnly("", 'a'));
        Assert.assertFalse(StringUtils.containsOnly("ab", new char[0]));
        Assert.assertTrue(StringUtils.containsOnly("abab", 'a', 'b'));
        Assert.assertFalse(StringUtils.containsOnly("abac", 'a', 'b'));

        Assert.assertFalse(StringUtils.containsOnly(null, "a"));
        Assert.assertFalse(StringUtils.containsOnly("a", (String) null));
        Assert.assertTrue(StringUtils.containsOnly("abab", "ab"));
        Assert.assertFalse(StringUtils.containsOnly("abac", "ab"));
    }

    @Test
    public void containsNone_givenCharOrString_shouldCheckAbsence() {
        Assert.assertTrue(StringUtils.containsNone(null, 'a'));
        Assert.assertTrue(StringUtils.containsNone("a", (char[]) null));
        Assert.assertTrue(StringUtils.containsNone("ab", 'x', 'y'));
        Assert.assertFalse(StringUtils.containsNone("ab", 'a', 'y'));

        Assert.assertTrue(StringUtils.containsNone(null, "a"));
        Assert.assertTrue(StringUtils.containsNone("a", (String) null));
        Assert.assertTrue(StringUtils.containsNone("ab", "xy"));
        Assert.assertFalse(StringUtils.containsNone("ab", "ay"));
    }

    @Test
    public void indexOfAny_strings_shouldReturnFirstOccurrenceAmongArray() {
        Assert.assertEquals(-1, StringUtils.indexOfAny(null, new String[] {"a"}));
        Assert.assertEquals(-1, StringUtils.indexOfAny("abc", (String[]) null));
        Assert.assertEquals(0, StringUtils.indexOfAny("zzay", new String[] {"z", "a"}));
        Assert.assertEquals(2, StringUtils.indexOfAny("zzay", new String[] {"ay", "a"}));
        Assert.assertEquals(-1, StringUtils.indexOfAny("zzay", new String[] {"no", "match"}));
        Assert.assertEquals(0, StringUtils.indexOfAny("zzay", new String[] {null, "zz"}));
    }

    @Test
    public void lastIndexOfAny_strings_shouldReturnLastOccurrenceAmongArray() {
        Assert.assertEquals(-1, StringUtils.lastIndexOfAny(null, new String[] {"a"}));
        Assert.assertEquals(-1, StringUtils.lastIndexOfAny("abc", (String[]) null));
        Assert.assertEquals(2, StringUtils.lastIndexOfAny("zzay", new String[] {"z", "a"}));
        Assert.assertEquals(2, StringUtils.lastIndexOfAny("zzay", new String[] {"ay", null}));
        Assert.assertEquals(-1, StringUtils.lastIndexOfAny("zzay", new String[] {"none"}));
    }

    @Test
    public void substring_withStart_shouldExtractExpectedPart() {
        Assert.assertNull(StringUtils.substring(null, 0));
        Assert.assertEquals("cba", StringUtils.substring("abcba", 2));
        Assert.assertEquals("ba", StringUtils.substring("abcba", -2));
        Assert.assertEquals("abcba", StringUtils.substring("abcba", -10));
        Assert.assertEquals("", StringUtils.substring("abcba", 10));
    }

    @Test
    public void substring_withStartAndEnd_shouldExtractExpectedPart() {
        Assert.assertNull(StringUtils.substring(null, 0, 1));
        Assert.assertEquals("bc", StringUtils.substring("abcba", 1, 3));
        Assert.assertEquals("b", StringUtils.substring("abcba", 1, -3));
        Assert.assertEquals("", StringUtils.substring("abcba", 3, 1));
        Assert.assertEquals("abcba", StringUtils.substring("abcba", -10, 10));
        Assert.assertEquals("", StringUtils.substring("abcba", -10, -8));
    }

    @Test
    public void left_right_mid_shouldExtractSubstringsAccurately() {
        Assert.assertNull(StringUtils.left(null, 2));
        Assert.assertEquals("", StringUtils.left("abc", -1));
        Assert.assertEquals("abc", StringUtils.left("abc", 5));
        Assert.assertEquals("ab", StringUtils.left("abc", 2));

        Assert.assertNull(StringUtils.right(null, 2));
        Assert.assertEquals("", StringUtils.right("abc", -1));
        Assert.assertEquals("abc", StringUtils.right("abc", 5));
        Assert.assertEquals("bc", StringUtils.right("abc", 2));

        Assert.assertNull(StringUtils.mid(null, 0, 2));
        Assert.assertEquals("", StringUtils.mid("abc", 0, -1));
        Assert.assertEquals("", StringUtils.mid("abc", 5, 2));
        Assert.assertEquals("ab", StringUtils.mid("abc", -1, 2));
        Assert.assertEquals("bc", StringUtils.mid("abc", 1, 5));
        Assert.assertEquals("b", StringUtils.mid("abc", 1, 1));
    }

    @Test
    public void substringBefore_andAfter_shouldExtractCorrectParts() {
        Assert.assertNull(StringUtils.substringBefore(null, "b"));
        Assert.assertEquals("a", StringUtils.substringBefore("abcba", "b"));
        Assert.assertEquals("abcba", StringUtils.substringBefore("abcba", "z"));
        Assert.assertEquals("", StringUtils.substringBefore("abcba", ""));
        Assert.assertEquals("abcba", StringUtils.substringBefore("abcba", null));

        Assert.assertNull(StringUtils.substringAfter(null, "b"));
        Assert.assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
        Assert.assertEquals("", StringUtils.substringAfter("abcba", "z"));
        Assert.assertEquals("abcba", StringUtils.substringAfter("abcba", ""));
        Assert.assertEquals("", StringUtils.substringAfter("abcba", null));

        Assert.assertNull(StringUtils.substringBeforeLast(null, "b"));
        Assert.assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
        Assert.assertEquals("abcba", StringUtils.substringBeforeLast("abcba", "z"));
        Assert.assertEquals("abcba", StringUtils.substringBeforeLast("abcba", ""));

        Assert.assertNull(StringUtils.substringAfterLast(null, "b"));
        Assert.assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        Assert.assertEquals("", StringUtils.substringAfterLast("abcba", "z"));
        Assert.assertEquals("", StringUtils.substringAfterLast("abcba", ""));
        Assert.assertEquals("", StringUtils.substringAfterLast("abcba", "a"));
    }

    @Test
    public void substringBetween_singleAndPairs_shouldExtractContent() {
        Assert.assertNull(StringUtils.substringBetween(null, "tag"));
        Assert.assertEquals("bar", StringUtils.substringBetween("[bar]", "[", "]"));
        Assert.assertNull(StringUtils.substringBetween("[bar]", "[", null));
        Assert.assertNull(StringUtils.substringBetween("[bar]", null, "]"));
        Assert.assertNull(StringUtils.substringBetween("bar", "[", "]"));
        Assert.assertNull(StringUtils.substringBetween("[bar", "[", "]"));
        Assert.assertEquals("bar", StringUtils.substringBetween("/bar/", "/"));

        Assert.assertNull(StringUtils.substringsBetween(null, "[", "]"));
        Assert.assertNull(StringUtils.substringsBetween("[a][b]", "", "]"));
        Assert.assertNull(StringUtils.substringsBetween("[a][b]", "[", ""));
        Assert.assertArrayEquals(new String[0], StringUtils.substringsBetween("", "[", "]"));
        Assert.assertArrayEquals(new String[] {"a", "b"}, StringUtils.substringsBetween("[a][b]", "[", "]"));
        Assert.assertNull(StringUtils.substringsBetween("nomatch", "[", "]"));
    }

    @Test
    public void split_standardVariants_shouldSplitCorrectly() {
        Assert.assertNull(StringUtils.split(null));
        Assert.assertArrayEquals(new String[] {"a", "b", "c"}, StringUtils.split("a b c"));
        Assert.assertArrayEquals(new String[] {"a", "b", "c"}, StringUtils.split("a:b:c", ':'));
        Assert.assertArrayEquals(new String[] {"a", "b", "c"}, StringUtils.split("a,b;c", ",;"));
        Assert.assertArrayEquals(new String[] {"a", "b;c"}, StringUtils.split("a,b;c", ",;", 2));
        Assert.assertArrayEquals(new String[0], StringUtils.split(""));
    }

    @Test
    public void splitByWholeSeparator_variants_shouldSplitPreservingOrNot() {
        Assert.assertNull(StringUtils.splitByWholeSeparator(null, "."));
        Assert.assertArrayEquals(new String[0], StringUtils.splitByWholeSeparator("", "."));
        Assert.assertArrayEquals(new String[] {"ab", "cd"}, StringUtils.splitByWholeSeparator("ab..cd", ".."));
        Assert.assertArrayEquals(new String[] {"ab", "cd"}, StringUtils.splitByWholeSeparator("ab cd", null));
        Assert.assertArrayEquals(new String[] {"ab", "cd.ef"}, StringUtils.splitByWholeSeparator("ab..cd.ef", "..", 2));

        Assert.assertArrayEquals(new String[] {"ab", "", "cd"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab....cd", ".."));
        Assert.assertArrayEquals(new String[] {"ab", "..cd"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab....cd", "..", 2));
    }

    @Test
    public void splitPreserveAllTokens_shouldKeepEmptyElements() {
        Assert.assertNull(StringUtils.splitPreserveAllTokens(null));
        Assert.assertArrayEquals(new String[0], StringUtils.splitPreserveAllTokens(""));
        Assert.assertArrayEquals(new String[] {"a", "", "b"}, StringUtils.splitPreserveAllTokens("a  b"));
        Assert.assertArrayEquals(new String[] {"a", "", "b"}, StringUtils.splitPreserveAllTokens("a::b", ':'));
        Assert.assertArrayEquals(new String[] {"a", "", "b"}, StringUtils.splitPreserveAllTokens("a,,b", ","));
        Assert.assertArrayEquals(new String[] {"a", ",b"}, StringUtils.splitPreserveAllTokens("a,,b", ",", 2));
        Assert.assertArrayEquals(new String[] {"a", "", "b"}, StringUtils.splitPreserveAllTokens("a,;b", ",;"));
    }

    @Test
    public void splitByCharacterType_shouldSeparateByTypeAndCamelCase() {
        Assert.assertNull(StringUtils.splitByCharacterType(null));
        Assert.assertArrayEquals(new String[0], StringUtils.splitByCharacterType(""));
        Assert.assertArrayEquals(new String[] {"ab", "12", "CD"}, StringUtils.splitByCharacterType("ab12CD"));
        Assert.assertArrayEquals(new String[] {"foo", "Bar"}, StringUtils.splitByCharacterTypeCamelCase("fooBar"));
        Assert.assertArrayEquals(new String[] {"Foo", "Bar"}, StringUtils.splitByCharacterTypeCamelCase("FooBar"));
    }

    @Test
    public void join_arrayAndCollectionVariants_shouldJoinExpectedly() {
        Assert.assertNull(StringUtils.join((Object[]) null, ','));
        Assert.assertEquals("", StringUtils.join(new Object[0], ','));
        Assert.assertEquals("a,b,c", StringUtils.join(new String[] {"a", "b", "c"}, ','));
        Assert.assertEquals("a-b", StringUtils.join(new String[] {"a", "b", "c"}, '-', 0, 2));

        Assert.assertNull(StringUtils.join((Object[]) null, ","));
        Assert.assertEquals("", StringUtils.join(new Object[0], ","));
        Assert.assertEquals("a,b,c", StringUtils.join(new String[] {"a", "b", "c"}, ","));
        Assert.assertEquals("abc", StringUtils.join(new String[] {"a", "b", "c"}, (String) null));

        Assert.assertEquals("a/b/c", StringUtils.join("a", "b", "c"));

        List<String> list = Arrays.asList("a", "b", "c");
        Assert.assertNull(StringUtils.join((Iterator<?>) null, ','));
        Assert.assertEquals("", StringUtils.join(new ArrayList<String>().iterator(), ','));
        Assert.assertEquals("a", StringUtils.join(Arrays.asList("a").iterator(), ','));
        Assert.assertEquals("a,b,c", StringUtils.join(list.iterator(), ','));

        Assert.assertNull(StringUtils.join((Iterator<?>) null, ","));
        Assert.assertEquals("", StringUtils.join(new ArrayList<String>().iterator(), ","));
        Assert.assertEquals("a", StringUtils.join(Arrays.asList("a").iterator(), ","));
        Assert.assertEquals("a,b,c", StringUtils.join(list.iterator(), ","));
        Assert.assertEquals("abc", StringUtils.join(list.iterator(), (String) null));

        Assert.assertNull(StringUtils.join((Iterable<?>) null, ','));
        Assert.assertEquals("a,b,c", StringUtils.join((Iterable<?>) list, ','));
        Assert.assertNull(StringUtils.join((Iterable<?>) null, ","));
        Assert.assertEquals("a,b,c", StringUtils.join((Iterable<?>) list, ","));
    }

    @Test
    public void deleteWhitespace_givenVariousStrings_shouldRemoveAllBlanks() {
        Assert.assertNull(StringUtils.deleteWhitespace(null));
        Assert.assertEquals("", StringUtils.deleteWhitespace(""));
        Assert.assertEquals("abc", StringUtils.deleteWhitespace("  a b \t c \n "));
        Assert.assertEquals("abc", StringUtils.deleteWhitespace("abc"));
    }

    @Test
    public void remove_variants_shouldRemoveSpecifiedCharactersOrSubstrings() {
        Assert.assertNull(StringUtils.removeStart(null, "a"));
        Assert.assertEquals("abc", StringUtils.removeStart("abc", ""));
        Assert.assertEquals("bc", StringUtils.removeStart("abc", "a"));
        Assert.assertEquals("abc", StringUtils.removeStart("abc", "b"));

        Assert.assertEquals("bc", StringUtils.removeStartIgnoreCase("ABC", "a"));
        Assert.assertEquals("ABC", StringUtils.removeStartIgnoreCase("ABC", "b"));

        Assert.assertNull(StringUtils.removeEnd(null, "c"));
        Assert.assertEquals("ab", StringUtils.removeEnd("abc", "c"));
        Assert.assertEquals("abc", StringUtils.removeEnd("abc", "b"));

        Assert.assertEquals("ab", StringUtils.removeEndIgnoreCase("ABC", "c"));
        Assert.assertEquals("ABC", StringUtils.removeEndIgnoreCase("ABC", "b"));

        Assert.assertNull(StringUtils.remove(null, "a"));
        Assert.assertEquals("ac", StringUtils.remove("aba", "b"));
        Assert.assertEquals("ac", StringUtils.remove("aba", 'b'));
        Assert.assertEquals("aba", StringUtils.remove("aba", 'z'));
    }

    @Test
    public void replace_variants_shouldPerformSubstitutions() {
        Assert.assertNull(StringUtils.replace(null, "a", "b"));
        Assert.assertEquals("bbc", StringUtils.replaceOnce("aba", "a", "b"));
        Assert.assertEquals("bbc", StringUtils.replace("abc", "a", "b"));
        Assert.assertEquals("bba", StringUtils.replace("aaa", "a", "b", 2));
        Assert.assertEquals("aaa", StringUtils.replace("aaa", "a", "b", 0));
        Assert.assertEquals("aaa", StringUtils.replace("aaa", "z", "b", 2));

        Assert.assertEquals("bad", StringUtils.replaceEach("abc", new String[] {"a", "c"}, new String[] {"b", "d"}));
        Assert.assertEquals("d", StringUtils.replaceEachRepeatedly("a", new String[] {"a", "b", "c"}, new String[] {"b", "c", "d"}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceEach_whenArraysLengthMismatch_shouldThrowException() {
        StringUtils.replaceEach("abc", new String[] {"a"}, new String[] {"b", "c"});
    }

    @Test(expected = IllegalStateException.class)
    public void replaceEachRepeatedly_whenInfiniteLoopDetected_shouldThrowException() {
        StringUtils.replaceEachRepeatedly("a", new String[] {"a"}, new String[] {"a"});
    }

    @Test
    public void replaceChars_charAndString_shouldMapReplacements() {
        Assert.assertNull(StringUtils.replaceChars(null, 'a', 'b'));
        Assert.assertEquals("bbc", StringUtils.replaceChars("abc", 'a', 'b'));
        Assert.assertNull(StringUtils.replaceChars(null, "a", "b"));
        Assert.assertEquals("abc", StringUtils.replaceChars("abc", "", "b"));
        Assert.assertEquals("adc", StringUtils.replaceChars("abc", "b", "d"));
        Assert.assertEquals("ac", StringUtils.replaceChars("abc", "b", ""));
        Assert.assertEquals("ac", StringUtils.replaceChars("abc", "b", null));
        Assert.assertEquals("abc", StringUtils.replaceChars("abc", "z", "x"));
    }

    @Test
    public void overlay_givenVariousRanges_shouldInsertAndReplace() {
        Assert.assertNull(StringUtils.overlay(null, "abc", 0, 1));
        Assert.assertEquals("abcdef", StringUtils.overlay("abcdef", null, 2, 4));
        Assert.assertEquals("abZZef", StringUtils.overlay("abcdef", "ZZ", 2, 4));
        Assert.assertEquals("abZZef", StringUtils.overlay("abcdef", "ZZ", 4, 2));
        Assert.assertEquals("ZZabcdef", StringUtils.overlay("abcdef", "ZZ", -5, 0));
        Assert.assertEquals("abcdefZZ", StringUtils.overlay("abcdef", "ZZ", 10, 20));
    }

    @Test
    public void chomp_and_chop_shouldTrimLineBreaksOrLastChar() {
        Assert.assertNull(StringUtils.chomp(null));
        Assert.assertEquals("", StringUtils.chomp(""));
        Assert.assertEquals("abc", StringUtils.chomp("abc\r\n"));
        Assert.assertEquals("abc", StringUtils.chomp("abc\n"));
        Assert.assertEquals("abc", StringUtils.chomp("abc\r"));
        Assert.assertEquals("abc", StringUtils.chomp("abc"));
        Assert.assertEquals("", StringUtils.chomp("\n"));

        Assert.assertEquals("abc", StringUtils.chomp("abcsep", "sep"));

        Assert.assertNull(StringUtils.chop(null));
        Assert.assertEquals("", StringUtils.chop(""));
        Assert.assertEquals("", StringUtils.chop("a"));
        Assert.assertEquals("ab", StringUtils.chop("abc"));
        Assert.assertEquals("abc", StringUtils.chop("abc\r\n"));
        Assert.assertEquals("abc", StringUtils.chop("abc\n"));
    }

    @Test
    public void repeat_givenStringOrChar_shouldMultiplyOutput() {
        Assert.assertNull(StringUtils.repeat((String) null, 2));
        Assert.assertEquals("", StringUtils.repeat("abc", 0));
        Assert.assertEquals("", StringUtils.repeat("abc", -1));
        Assert.assertEquals("abc", StringUtils.repeat("abc", 1));
        Assert.assertEquals("aaa", StringUtils.repeat("a", 3));
        Assert.assertEquals("ababab", StringUtils.repeat("ab", 3));
        Assert.assertEquals("abcabcabc", StringUtils.repeat("abc", 3));

        Assert.assertEquals("a,a,a", StringUtils.repeat("a", ",", 3));
        Assert.assertNull(StringUtils.repeat((String) null, ",", 3));

        Assert.assertEquals("aaa", StringUtils.repeat('a', 3));
    }

    @Test
    public void rightPad_leftPad_center_shouldPadStringProperly() {
        Assert.assertNull(StringUtils.rightPad(null, 5));
        Assert.assertEquals("abc  ", StringUtils.rightPad("abc", 5));
        Assert.assertEquals("abc", StringUtils.rightPad("abc", 2));
        Assert.assertEquals("abc--", StringUtils.rightPad("abc", 5, '-'));
        Assert.assertEquals("abcxyz", StringUtils.rightPad("abc", 6, "xyz"));
        Assert.assertEquals("abcxy", StringUtils.rightPad("abc", 5, "xyz"));

        Assert.assertNull(StringUtils.leftPad(null, 5));
        Assert.assertEquals("  abc", StringUtils.leftPad("abc", 5));
        Assert.assertEquals("abc", StringUtils.leftPad("abc", 2));
        Assert.assertEquals("--abc", StringUtils.leftPad("abc", 5, '-'));
        Assert.assertEquals("xyzabc", StringUtils.leftPad("abc", 6, "xyz"));
        Assert.assertEquals("xyabc", StringUtils.leftPad("abc", 5, "xyz"));

        Assert.assertNull(StringUtils.center(null, 5));
        Assert.assertEquals("abc", StringUtils.center("abc", 0));
        Assert.assertEquals(" abc ", StringUtils.center("abc", 5));
        Assert.assertEquals("abc", StringUtils.center("abc", 2));
        Assert.assertEquals("-abc-", StringUtils.center("abc", 5, '-'));
        Assert.assertEquals("xabcy", StringUtils.center("abc", 5, "xy"));
    }

    @Test
    public void length_givenCharSequence_shouldReturnCorrectLength() {
        Assert.assertEquals(0, StringUtils.length(null));
        Assert.assertEquals(0, StringUtils.length(""));
        Assert.assertEquals(3, StringUtils.length("abc"));
    }

    @Test
    public void upperCase_lowerCase_capitalize_swapCase_shouldModifyCasing() {
        Assert.assertNull(StringUtils.upperCase(null));
        Assert.assertEquals("ABC", StringUtils.upperCase("abc"));
        Assert.assertEquals("ABC", StringUtils.upperCase("abc", Locale.ENGLISH));

        Assert.assertNull(StringUtils.lowerCase(null));
        Assert.assertEquals("abc", StringUtils.lowerCase("ABC"));
        Assert.assertEquals("abc", StringUtils.lowerCase("ABC", Locale.ENGLISH));

        Assert.assertNull(StringUtils.capitalize(null));
        Assert.assertEquals("", StringUtils.capitalize(""));
        Assert.assertEquals("Abc", StringUtils.capitalize("abc"));

        Assert.assertNull(StringUtils.uncapitalize(null));
        Assert.assertEquals("", StringUtils.uncapitalize(""));
        Assert.assertEquals("abc", StringUtils.uncapitalize("Abc"));

        Assert.assertNull(StringUtils.swapCase(null));
        Assert.assertEquals("", StringUtils.swapCase(""));
        Assert.assertEquals("aBCd", StringUtils.swapCase("AbcD"));
    }

    @Test
    public void countMatches_givenSubstrings_shouldCountAccurately() {
        Assert.assertEquals(0, StringUtils.countMatches(null, "a"));
        Assert.assertEquals(0, StringUtils.countMatches("a", null));
        Assert.assertEquals(0, StringUtils.countMatches("", "a"));
        Assert.assertEquals(0, StringUtils.countMatches("abc", ""));
        Assert.assertEquals(2, StringUtils.countMatches("abba", "a"));
        Assert.assertEquals(1, StringUtils.countMatches("abba", "bb"));
    }

    @Test
    public void isCharacterClassificationChecks_shouldReturnCorrectBooleans() {
        Assert.assertFalse(StringUtils.isAlpha(null));
        Assert.assertFalse(StringUtils.isAlpha(""));
        Assert.assertTrue(StringUtils.isAlpha("abc"));
        Assert.assertFalse(StringUtils.isAlpha("ab2"));

        Assert.assertFalse(StringUtils.isAlphaSpace(null));
        Assert.assertTrue(StringUtils.isAlphaSpace(""));
        Assert.assertTrue(StringUtils.isAlphaSpace("ab c"));
        Assert.assertFalse(StringUtils.isAlphaSpace("ab 2"));

        Assert.assertFalse(StringUtils.isAlphanumeric(null));
        Assert.assertFalse(StringUtils.isAlphanumeric(""));
        Assert.assertTrue(StringUtils.isAlphanumeric("ab2"));
        Assert.assertFalse(StringUtils.isAlphanumeric("ab#2"));

        Assert.assertFalse(StringUtils.isAlphanumericSpace(null));
        Assert.assertTrue(StringUtils.isAlphanumericSpace("ab 2"));
        Assert.assertFalse(StringUtils.isAlphanumericSpace("ab #"));

        Assert.assertFalse(StringUtils.isAsciiPrintable(null));
        Assert.assertTrue(StringUtils.isAsciiPrintable("abc"));
        Assert.assertFalse(StringUtils.isAsciiPrintable("\u0000"));

        Assert.assertFalse(StringUtils.isNumeric(null));
        Assert.assertFalse(StringUtils.isNumeric(""));
        Assert.assertTrue(StringUtils.isNumeric("123"));
        Assert.assertFalse(StringUtils.isNumeric("12a"));

        Assert.assertFalse(StringUtils.isNumericSpace(null));
        Assert.assertTrue(StringUtils.isNumericSpace("12 3"));
        Assert.assertFalse(StringUtils.isNumericSpace("12 a"));

        Assert.assertFalse(StringUtils.isWhitespace(null));
        Assert.assertTrue(StringUtils.isWhitespace("  \t\n"));
        Assert.assertFalse(StringUtils.isWhitespace("  a  "));

        Assert.assertFalse(StringUtils.isAllLowerCase(null));
        Assert.assertFalse(StringUtils.isAllLowerCase(""));
        Assert.assertTrue(StringUtils.isAllLowerCase("abc"));
        Assert.assertFalse(StringUtils.isAllLowerCase("abC"));

        Assert.assertFalse(StringUtils.isAllUpperCase(null));
        Assert.assertFalse(StringUtils.isAllUpperCase(""));
        Assert.assertTrue(StringUtils.isAllUpperCase("ABC"));
        Assert.assertFalse(StringUtils.isAllUpperCase("ABc"));
    }

    @Test
    public void defaultString_andIfEmptyOrBlank_shouldFallbackWhenNecessary() {
        Assert.assertEquals("", StringUtils.defaultString(null));
        Assert.assertEquals("abc", StringUtils.defaultString("abc"));
        Assert.assertEquals("default", StringUtils.defaultString(null, "default"));

        Assert.assertEquals("default", StringUtils.defaultIfEmpty(null, "default"));
        Assert.assertEquals("default", StringUtils.defaultIfEmpty("", "default"));
        Assert.assertEquals(" ", StringUtils.defaultIfEmpty(" ", "default"));

        Assert.assertEquals("default", StringUtils.defaultIfBlank(null, "default"));
        Assert.assertEquals("default", StringUtils.defaultIfBlank("", "default"));
        Assert.assertEquals("default", StringUtils.defaultIfBlank("   ", "default"));
        Assert.assertEquals("abc", StringUtils.defaultIfBlank("abc", "default"));
    }

    @Test
    public void reverse_andDelimited_shouldReverseContents() {
        Assert.assertNull(StringUtils.reverse(null));
        Assert.assertEquals("cba", StringUtils.reverse("abc"));
        Assert.assertNull(StringUtils.reverseDelimited(null, '.'));
        Assert.assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.'));
    }

    @Test
    public void abbreviate_andMiddle_shouldShortenStrings() {
        Assert.assertNull(StringUtils.abbreviate(null, 4));
        Assert.assertEquals("abcdef", StringUtils.abbreviate("abcdef", 6));
        Assert.assertEquals("a...", StringUtils.abbreviate("abcdefg", 4));
        Assert.assertEquals("...g", StringUtils.abbreviate("abcdefg", 6, 4));
        Assert.assertEquals("...defg", StringUtils.abbreviate("abcdefg", 7, 7));

        Assert.assertNull(StringUtils.abbreviateMiddle(null, ".", 4));
        Assert.assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 5));
        Assert.assertEquals("a..d", StringUtils.abbreviateMiddle("abcdefd", "..", 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void abbreviate_whenWidthLessThan4_shouldThrowException() {
        StringUtils.abbreviate("abcdef", 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void abbreviate_whenWidthWithOffsetLessThan7_shouldThrowException() {
        StringUtils.abbreviate("abcdefghijk", 5, 5);
    }

    @Test
    public void difference_andIndexOfDifference_shouldIdentifyDiscrepancies() {
        Assert.assertEquals("cde", StringUtils.difference("abc", "abcde"));
        Assert.assertEquals("abc", StringUtils.difference(null, "abc"));
        Assert.assertEquals("abc", StringUtils.difference("abc", null));
        Assert.assertEquals("", StringUtils.difference("abc", "abc"));

        Assert.assertEquals(-1, StringUtils.indexOfDifference("abc", "abc"));
        Assert.assertEquals(0, StringUtils.indexOfDifference(null, "abc"));
        Assert.assertEquals(3, StringUtils.indexOfDifference("abc", "abcde"));
        Assert.assertEquals(3, StringUtils.indexOfDifference("abcdef", "abc"));

        Assert.assertEquals(-1, StringUtils.indexOfDifference((CharSequence[]) null));
        Assert.assertEquals(-1, StringUtils.indexOfDifference(new CharSequence[] {"abc"}));
        Assert.assertEquals(0, StringUtils.indexOfDifference(new CharSequence[] {null, "abc"}));
        Assert.assertEquals(-1, StringUtils.indexOfDifference(new CharSequence[] {null, null}));
        Assert.assertEquals(-1, StringUtils.indexOfDifference(new CharSequence[] {"", ""}));
        Assert.assertEquals(3, StringUtils.indexOfDifference(new CharSequence[] {"abc", "abcde", "abcz"}));
        Assert.assertEquals(3, StringUtils.indexOfDifference(new CharSequence[] {"abc", "abcde"}));
    }

    @Test
    public void getCommonPrefix_shouldReturnLongestSharedPrefix() {
        Assert.assertEquals("", StringUtils.getCommonPrefix((String[]) null));
        Assert.assertEquals("", StringUtils.getCommonPrefix(new String[0]));
        Assert.assertEquals("abc", StringUtils.getCommonPrefix(new String[] {"abcdef", "abcxyz", "abc"}));
        Assert.assertEquals("", StringUtils.getCommonPrefix(new String[] {"abc", "def"}));
        Assert.assertEquals("", StringUtils.getCommonPrefix(new String[] {null, "def"}));
    }

    @Test
    public void getLevenshteinDistance_standardAndWithThreshold_shouldCalculateEdits() {
        Assert.assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        Assert.assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
        Assert.assertEquals(1, StringUtils.getLevenshteinDistance("a", ""));
        Assert.assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        Assert.assertEquals(3, StringUtils.getLevenshteinDistance("kitten", "sitting"));

        Assert.assertEquals(0, StringUtils.getLevenshteinDistance("", "", 0));
        Assert.assertEquals(1, StringUtils.getLevenshteinDistance("", "a", 1));
        Assert.assertEquals(-1, StringUtils.getLevenshteinDistance("", "a", 0));
        Assert.assertEquals(1, StringUtils.getLevenshteinDistance("a", "", 1));
        Assert.assertEquals(-1, StringUtils.getLevenshteinDistance("a", "", 0));
        Assert.assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog", 1));
        Assert.assertEquals(-1, StringUtils.getLevenshteinDistance("frog", "fog", 0));
        Assert.assertEquals(3, StringUtils.getLevenshteinDistance("kitten", "sitting", 3));
        Assert.assertEquals(-1, StringUtils.getLevenshteinDistance("kitten", "sitting", 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getLevenshteinDistance_whenSourceNull_shouldThrowException() {
        StringUtils.getLevenshteinDistance(null, "a");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getLevenshteinDistance_whenThresholdNegative_shouldThrowException() {
        StringUtils.getLevenshteinDistance("a", "b", -1);
    }

    @Test
    public void startsWith_andEndsWith_allVariants_shouldMatchCorrectly() {
        Assert.assertTrue(StringUtils.startsWith(null, null));
        Assert.assertFalse(StringUtils.startsWith(null, "abc"));
        Assert.assertFalse(StringUtils.startsWith("abc", null));
        Assert.assertFalse(StringUtils.startsWith("ab", "abcd"));
        Assert.assertTrue(StringUtils.startsWith("abcdef", "abc"));
        Assert.assertFalse(StringUtils.startsWith("abcdef", "ABC"));

        Assert.assertTrue(StringUtils.startsWithIgnoreCase("abcdef", "ABC"));
        Assert.assertFalse(StringUtils.startsWithIgnoreCase("abcdef", "XYZ"));

        Assert.assertFalse(StringUtils.startsWithAny(null, "a"));
        Assert.assertFalse(StringUtils.startsWithAny("abc", (String[]) null));
        Assert.assertTrue(StringUtils.startsWithAny("abcdef", "xy", "abc"));
        Assert.assertFalse(StringUtils.startsWithAny("abcdef", "xy", "zz"));

        Assert.assertTrue(StringUtils.endsWith(null, null));
        Assert.assertFalse(StringUtils.endsWith(null, "def"));
        Assert.assertFalse(StringUtils.endsWith("def", null));
        Assert.assertFalse(StringUtils.endsWith("de", "cdef"));
        Assert.assertTrue(StringUtils.endsWith("abcdef", "def"));
        Assert.assertFalse(StringUtils.endsWith("abcdef", "DEF"));

        Assert.assertTrue(StringUtils.endsWithIgnoreCase("abcdef", "DEF"));
        Assert.assertFalse(StringUtils.endsWithIgnoreCase("abcdef", "XYZ"));

        Assert.assertFalse(StringUtils.endsWithAny(null, "f"));
        Assert.assertFalse(StringUtils.endsWithAny("abc", (String[]) null));
        Assert.assertTrue(StringUtils.endsWithAny("abcdef", "xy", "def"));
        Assert.assertFalse(StringUtils.endsWithAny("abcdef", "xy", "zz"));
    }

    @Test
    public void normalizeSpace_givenWhitespaceText_shouldSquashSpaces() {
        Assert.assertNull(StringUtils.normalizeSpace(null));
        Assert.assertEquals("", StringUtils.normalizeSpace(""));
        Assert.assertEquals("a b c", StringUtils.normalizeSpace("  a   b \t\r\n c  "));
    }

    @Test
    public void toString_givenBytesAndCharset_shouldDecodeCorrectly() throws UnsupportedEncodingException {
        byte[] bytes = new byte[] {65, 66, 67};
        Assert.assertEquals("ABC", StringUtils.toString(bytes, null));
        Assert.assertEquals("ABC", StringUtils.toString(bytes, "UTF-8"));
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void toString_givenInvalidCharset_shouldThrowException() throws UnsupportedEncodingException {
        byte[] bytes = new byte[] {65, 66, 67};
        StringUtils.toString(bytes, "INVALID_CHARSET_NAME_123");
    }
}