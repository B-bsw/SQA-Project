package org.jsoup.helper;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class StringUtilTest {
    private StringBuilder sb;

    @Before
    public void setUp() {
        sb = new StringBuilder();
    }

    @After
    public void tearDown() {
        sb = null;
    }

    @Test
    public void testJoin_EmptyCollection_ReturnsEmptyString() {
        Collection<String> empty = new ArrayList<String>();
        assertEquals("", StringUtil.join(empty, ","));
    }

    @Test
    public void testJoin_SingleElementCollection_ReturnsThatElement() {
        Collection<String> single = Arrays.asList("hello");
        assertEquals("hello", StringUtil.join(single, ","));
    }

    @Test
    public void testJoin_MultipleElementsCollection_ReturnsJoinedString() {
        Collection<String> multiple = Arrays.asList("a", "b", "c");
        assertEquals("a-b-c", StringUtil.join(multiple, "-"));
    }

    @Test
    public void testJoin_NullSeparator_ThrowsNullPointerException() {
        Collection<String> collection = Arrays.asList("a", "b");
        try {
            StringUtil.join(collection, null);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testJoin_EmptyIterator_ReturnsEmptyString() {
        Iterator<String> empty = new ArrayList<String>().iterator();
        assertEquals("", StringUtil.join(empty, ","));
    }

    @Test
    public void testJoin_SingleElementIterator_ReturnsThatElement() {
        Iterator<String> single = Arrays.asList("single").iterator();
        assertEquals("single", StringUtil.join(single, ","));
    }

    @Test
    public void testJoin_MultipleElementsIterator_ReturnsJoinedString() {
        Iterator<String> multiple = Arrays.asList("x", "y", "z").iterator();
        assertEquals("x|y|z", StringUtil.join(multiple, "|"));
    }

    @Test
    public void testJoin_ArrayWithElements_ReturnsJoinedString() {
        String[] array = {"1", "2", "3"};
        assertEquals("1,2,3", StringUtil.join(array, ","));
    }

    @Test
    public void testPadding_NegativeWidth_ThrowsIllegalArgumentException() {
        try {
            StringUtil.padding(-1);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testPadding_ZeroWidth_ReturnsEmptyString() {
        assertEquals("", StringUtil.padding(0));
    }

    @Test
    public void testPadding_SmallWidth_MemoizedPadding() {
        assertEquals("  ", StringUtil.padding(2));
    }

    @Test
    public void testPadding_LargeWidth_GeneratesPadding() {
        assertEquals("     ", StringUtil.padding(5));
    }

    @Test
    public void testIsBlank_NullString_ReturnsTrue() {
        assertTrue(StringUtil.isBlank(null));
    }

    @Test
    public void testIsBlank_EmptyString_ReturnsTrue() {
        assertTrue(StringUtil.isBlank(""));
    }

    @Test
    public void testIsBlank_WhitespaceString_ReturnsTrue() {
        assertTrue(StringUtil.isBlank("   \t\n"));
    }

    @Test
    public void testIsBlank_NonWhitespaceString_ReturnsFalse() {
        assertFalse(StringUtil.isBlank("hello"));
    }

    @Test
    public void testIsBlank_MixedStringWithWhitespace_ReturnsFalse() {
        assertFalse(StringUtil.isBlank("  hello  "));
    }

    @Test
    public void testIsNumeric_NullString_ReturnsFalse() {
        assertFalse(StringUtil.isNumeric(null));
    }

    @Test
    public void testIsNumeric_EmptyString_ReturnsFalse() {
        assertFalse(StringUtil.isNumeric(""));
    }

    @Test
    public void testIsNumeric_AllDigits_ReturnsTrue() {
        assertTrue(StringUtil.isNumeric("12345"));
    }

    @Test
    public void testIsNumeric_ContainsNonDigit_ReturnsFalse() {
        assertFalse(StringUtil.isNumeric("12a45"));
    }

    @Test
    public void testIsNumeric_SingleDigit_ReturnsTrue() {
        assertTrue(StringUtil.isNumeric("7"));
    }

    @Test
    public void testIsWhitespace_Space_ReturnsTrue() {
        assertTrue(StringUtil.isWhitespace(' '));
    }

    @Test
    public void testIsWhitespace_Tab_ReturnsTrue() {
        assertTrue(StringUtil.isWhitespace('\t'));
    }

    @Test
    public void testIsWhitespace_Newline_ReturnsTrue() {
        assertTrue(StringUtil.isWhitespace('\n'));
    }

    @Test
    public void testIsWhitespace_NonWhitespace_ReturnsFalse() {
        assertFalse(StringUtil.isWhitespace('a'));
    }

    @Test
    public void testIsActuallyWhitespace_Nbsp_ReturnsTrue() {
        assertTrue(StringUtil.isActuallyWhitespace(160));
    }

    @Test
    public void testIsActuallyWhitespace_Space_ReturnsTrue() {
        assertTrue(StringUtil.isActuallyWhitespace(' '));
    }

    @Test
    public void testIsActuallyWhitespace_Tab_ReturnsTrue() {
        assertTrue(StringUtil.isActuallyWhitespace('\t'));
    }

    @Test
    public void testIsActuallyWhitespace_Newline_ReturnsTrue() {
        assertTrue(StringUtil.isActuallyWhitespace('\n'));
    }

    @Test
    public void testIsActuallyWhitespace_FormFeed_ReturnsTrue() {
        assertTrue(StringUtil.isActuallyWhitespace('\f'));
    }

    @Test
    public void testIsActuallyWhitespace_CarriageReturn_ReturnsTrue() {
        assertTrue(StringUtil.isActuallyWhitespace('\r'));
    }

    @Test
    public void testIsActuallyWhitespace_NonWhitespace_ReturnsFalse() {
        assertFalse(StringUtil.isActuallyWhitespace('x'));
    }

    @Test
    public void testNormaliseWhitespace_EmptyString_ReturnsEmptyString() {
        assertEquals("", StringUtil.normaliseWhitespace(""));
    }

    @Test
    public void testNormaliseWhitespace_OnlyWhitespace_ReturnsSingleSpace() {
        assertEquals(" ", StringUtil.normaliseWhitespace("   \n\t"));
    }

    @Test
    public void testNormaliseWhitespace_MultipleSpacesCollapsedToSingle() {
        assertEquals("hello world", StringUtil.normaliseWhitespace("hello   world"));
    }

    @Test
    public void testNormaliseWhitespace_NewlineConvertedToSpace() {
        assertEquals("hello world", StringUtil.normaliseWhitespace("hello\nworld"));
    }

    @Test
    public void testNormaliseWhitespace_TabConvertedToSpace() {
        assertEquals("hello world", StringUtil.normaliseWhitespace("hello\tworld"));
    }

    @Test
    public void testNormaliseWhitespace_MixedWhitespace_CollapsedAndConverted() {
        assertEquals("a b c", StringUtil.normaliseWhitespace("  a   \n\t b \f c  "));
    }

    @Test
    public void testAppendNormalisedWhitespace_StripLeadingTrue_StripsLeadingWhitespace() {
        StringBuilder accum = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(accum, "   hello", true);
        assertEquals("hello", accum.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_StripLeadingFalse_KeepsLeadingWhitespace() {
        StringBuilder accum = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(accum, "   hello", false);
        assertEquals(" hello", accum.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_EmptyString_DoesNotAppendAnything() {
        StringBuilder accum = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(accum, "", false);
        assertEquals("", accum.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_OnlyWhitespace_AppendsSingleSpace() {
        StringBuilder accum = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(accum, "   \n\t", false);
        assertEquals(" ", accum.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_MixedContent_AppendsNormalized() {
        StringBuilder accum = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(accum, "  hello \n world  ", false);
        assertEquals(" hello world ", accum.toString());
    }

    @Test
    public void testIn_NeedleInHaystack_ReturnsTrue() {
        assertTrue(StringUtil.in("b", "a", "b", "c"));
    }

    @Test
    public void testIn_NeedleNotInHaystack_ReturnsFalse() {
        assertFalse(StringUtil.in("z", "a", "b", "c"));
    }

    @Test
    public void testIn_EmptyHaystack_ReturnsFalse() {
        assertFalse(StringUtil.in("a"));
    }

    @Test
    public void testInSorted_NeedleInSortedHaystack_ReturnsTrue() {
        String[] haystack = {"apple", "banana", "cherry"};
        assertTrue(StringUtil.inSorted("banana", haystack));
    }

    @Test
    public void testInSorted_NeedleNotInSortedHaystack_ReturnsFalse() {
        String[] haystack = {"apple", "banana", "cherry"};
        assertFalse(StringUtil.inSorted("grape", haystack));
    }

    @Test
    public void testInSorted_NullNeedle_ThrowsNullPointerException() {
        String[] haystack = {"apple", "banana", "cherry"};
        try {
            StringUtil.inSorted(null, haystack);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testResolve_AbsoluteRelUrl_ReturnsSameUrl() throws Exception {
        String base = "http://example.com/path/file.html";
        String rel = "http://other.com/absolute";
        assertEquals(new URL("http://other.com/absolute"), new URL(StringUtil.resolve(base, rel)));
    }

    @Test
    public void testResolve_RelativeUrl_ResolvesAgainstBase() throws Exception {
        String base = "http://example.com/path/file.html";
        String rel = "../other";
        assertEquals(new URL("http://example.com/other"), new URL(StringUtil.resolve(base, rel)));
    }

    @Test
    public void testResolve_AbsoluteRelUrl_ReturnsRelUrlAsIs() throws Exception {
        String base = "http://example.com/";
        String rel = "http://another.com/resource";
        assertEquals("http://another.com/resource", StringUtil.resolve(base, rel));
    }

    @Test
    public void testResolve_BaseWithQuery_AndRelStartsWithQuestionMark() throws Exception {
        String base = "http://example.com/path";
        String rel = "?query=1";
        String result = StringUtil.resolve(base, rel);
        assertEquals("http://example.com/path?query=1", result);
    }

    @Test
    public void testResolve_BaseWithoutPath_AndRelStartsWithDot_Workaround() throws Exception {
        String base = "http://example.com";
        String rel = "./foo";
        String result = StringUtil.resolve(base, rel);
        assertEquals("http://example.com/./foo", result);
    }

    @Test
    public void testResolve_InvalidBase_AndValidRel_ReturnsRelAsAbsolute() throws Exception {
        String base = "not_a_valid_url";
        String rel = "http://valid.com/path";
        assertEquals("http://valid.com/path", StringUtil.resolve(base, rel));
    }

    @Test
    public void testResolve_InvalidBase_AndInvalidRel_ReturnsEmptyString() {
        String base = "not_a_valid_url";
        String rel = "also_not_valid";
        assertEquals("", StringUtil.resolve(base, rel));
    }

    @Test
    public void testResolve_BaseAndRelBothValid_ReturnsResolvedUrl() throws Exception {
        String base = "http://example.com/dir/";
        String rel = "sub/file.html";
        assertEquals("http://example.com/dir/sub/file.html", StringUtil.resolve(base, rel));
    }

    @Test
    public void testResolve_RelUrlIsEmptyString_ReturnsBaseUrl() throws Exception {
        String base = "http://example.com/path/file.html";
        String rel = "";
        assertEquals("http://example.com/path/file.html", StringUtil.resolve(base, rel));
    }

    @Test
    public void testStringBuilder_ReturnsNonEmptyReusableBuilder() {
        StringBuilder sb1 = StringUtil.stringBuilder();
        sb1.append("test");
        assertEquals("test", sb1.toString());
        // simulates retrieving again
        StringBuilder sb2 = StringUtil.stringBuilder();
        assertEquals("", sb2.toString());
        assertNotSame(sb1, sb2); // may be different instance if size limit exceeded
    }

    @Test
    public void testStringBuilder_MaxSizeNotExceeded_ReusesInstance() {
        StringBuilder sb1 = StringUtil.stringBuilder();
        sb1.append("a");
        StringBuilder sb2 = StringUtil.stringBuilder();
        assertSame(sb1, sb2); // should be same instance within size limit
    }

    @Test
    public void testStringBuilder_SizeLimitExceeded_DoesNotReuseInstance() {
        StringBuilder sb = StringUtil.stringBuilder();
        // fill many characters to exceed 8KB
        for (int i = 0; i < 5000; i++) {
            sb.append("a");
        }
        StringBuilder sb2 = StringUtil.stringBuilder();
        assertNotSame(sb, sb2); // should be new instance because sb was too large
    }

    @Test
    public void testStringBuilder_ClearsPreviousContent() {
        StringBuilder sb = StringUtil.stringBuilder();
        sb.append("hello");
        assertEquals("hello", sb.toString());
        StringBuilder sb2 = StringUtil.stringBuilder();
        assertEquals("", sb2.toString());
    }

    @Test
    public void testNormaliseWhitespace_UnicodeWhitespace() {
        assertEquals("a b", StringUtil.normaliseWhitespace("a\u00A0b")); // non-breaking space
    }

    @Test
    public void testIsBlank_UnicodeWhitespace_ReturnsTrue() {
        assertTrue(StringUtil.isBlank("\u00A0\u2007")); // non-breaking spaces
    }

    @Test
    public void testIsNumeric_UnicodeDigits_ReturnsTrue() {
        assertTrue(StringUtil.isNumeric("\u0660\u0661")); // Arabic-Indic digits
    }

    @Test
    public void testNormaliseWhitespace_AllWhitespace_ReturnsSingleSpace() {
        assertEquals(" ", StringUtil.normaliseWhitespace(" \t\n\r\f\u00A0"));
    }

    @Test
    public void testJoin_MixedTypesInCollection_ToStringConcatenated() {
        Collection<Object> mixed = Arrays.asList((Object)1, 2.5, "three");
        assertEquals("1-2.5-three", StringUtil.join(mixed, "-"));
    }

    @Test
    public void testInSorted_NullNeedle_ThrowsException() {
        String[] haystack = {"a", "b"};
        try {
            StringUtil.inSorted(null, haystack);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testAppendNormalisedWhitespace_NullString_ThrowsNullPointerException() {
        try {
            StringUtil.appendNormalisedWhitespace(sb, null, false);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
}