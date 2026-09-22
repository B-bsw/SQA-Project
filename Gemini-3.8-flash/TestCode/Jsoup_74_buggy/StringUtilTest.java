package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringUtilTest {

    @Test
    public void constructor_givenDefault_shouldInstantiateSuccessfully() {
        // Arrange & Act
        StringUtil util = new StringUtil();

        // Assert
        Assert.assertNotNull(util);
    }

    @Test
    public void joinCollection_givenEmptyCollection_shouldReturnEmptyString() {
        // Arrange
        List strings = Collections.EMPTY_LIST;

        // Act
        String result = StringUtil.join(strings, ",");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void joinCollection_givenSingleElementCollection_shouldReturnSingleElement() {
        // Arrange
        List strings = Collections.singletonList("apple");

        // Act
        String result = StringUtil.join(strings, ", ");

        // Assert
        Assert.assertEquals("apple", result);
    }

    @Test
    public void joinCollection_givenMultipleElements_shouldReturnJoinedString() {
        // Arrange
        List strings = Arrays.asList(new String[]{"apple", "banana", "cherry"});

        // Act
        String result = StringUtil.join(strings, ", ");

        // Assert
        Assert.assertEquals("apple, banana, cherry", result);
    }

    @Test
    public void joinArray_givenEmptyArray_shouldReturnEmptyString() {
        // Arrange
        String[] strings = new String[0];

        // Act
        String result = StringUtil.join(strings, "-");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void joinArray_givenSingleElementArray_shouldReturnSingleElement() {
        // Arrange
        String[] strings = new String[]{"foo"};

        // Act
        String result = StringUtil.join(strings, "-");

        // Assert
        Assert.assertEquals("foo", result);
    }

    @Test
    public void joinArray_givenMultipleElementArray_shouldReturnJoinedString() {
        // Arrange
        String[] strings = new String[]{"one", "two", "three"};

        // Act
        String result = StringUtil.join(strings, "|");

        // Assert
        Assert.assertEquals("one|two|three", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void padding_givenNegativeWidth_shouldThrowIllegalArgumentException() {
        // Arrange & Act & Assert
        StringUtil.padding(-1);
    }

    @Test
    public void padding_givenZeroWidth_shouldReturnEmptyString() {
        // Arrange & Act
        String result = StringUtil.padding(0);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void padding_givenWidthWithinCachedBoundary_shouldReturnCachedPadding() {
        // Arrange & Act
        String pad1 = StringUtil.padding(1);
        String pad20 = StringUtil.padding(20);

        // Assert
        Assert.assertEquals(" ", pad1);
        Assert.assertEquals("                    ", pad20);
        Assert.assertEquals(20, pad20.length());
    }

    @Test
    public void padding_givenWidthExceedingCachedBoundary_shouldGenerateCorrectSpaces() {
        // Arrange & Act
        String pad21 = StringUtil.padding(21);
        String pad30 = StringUtil.padding(30);

        // Assert
        Assert.assertEquals(21, pad21.length());
        Assert.assertEquals("                     ", pad21);
        Assert.assertEquals(30, pad30.length());
        Assert.assertEquals("                              ", pad30);
    }

    @Test
    public void isBlank_givenNullString_shouldReturnTrue() {
        // Arrange & Act
        boolean result = StringUtil.isBlank(null);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isBlank_givenEmptyString_shouldReturnTrue() {
        // Arrange & Act
        boolean result = StringUtil.isBlank("");

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isBlank_givenOnlyWhitespace_shouldReturnTrue() {
        // Arrange
        String whitespace = "  \t \n \r \f ";

        // Act
        boolean result = StringUtil.isBlank(whitespace);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isBlank_givenNonWhitespaceCharacters_shouldReturnFalse() {
        // Arrange & Act & Assert
        Assert.assertFalse(StringUtil.isBlank("a"));
        Assert.assertFalse(StringUtil.isBlank("   abc   "));
        Assert.assertFalse(StringUtil.isBlank("abc   "));
        Assert.assertFalse(StringUtil.isBlank("   abc"));
    }

    @Test
    public void isNumeric_givenNullString_shouldReturnFalse() {
        // Arrange & Act
        boolean result = StringUtil.isNumeric(null);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isNumeric_givenEmptyString_shouldReturnFalse() {
        // Arrange & Act
        boolean result = StringUtil.isNumeric("");

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isNumeric_givenDigitsOnly_shouldReturnTrue() {
        // Arrange & Act
        boolean result = StringUtil.isNumeric("0123456789");

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isNumeric_givenAlphanumericOrSymbols_shouldReturnFalse() {
        // Arrange & Act & Assert
        Assert.assertFalse(StringUtil.isNumeric("123a45"));
        Assert.assertFalse(StringUtil.isNumeric("abc"));
        Assert.assertFalse(StringUtil.isNumeric(" 123"));
        Assert.assertFalse(StringUtil.isNumeric("123 "));
        Assert.assertFalse(StringUtil.isNumeric("12.3"));
        Assert.assertFalse(StringUtil.isNumeric("-123"));
    }

    @Test
    public void isWhitespace_givenStandardWhitespaceChars_shouldReturnTrue() {
        // Arrange & Act & Assert
        Assert.assertTrue(StringUtil.isWhitespace(' '));
        Assert.assertTrue(StringUtil.isWhitespace('\t'));
        Assert.assertTrue(StringUtil.isWhitespace('\n'));
        Assert.assertTrue(StringUtil.isWhitespace('\f'));
        Assert.assertTrue(StringUtil.isWhitespace('\r'));
    }

    @Test
    public void isWhitespace_givenNonWhitespaceOrNbsp_shouldReturnFalse() {
        // Arrange & Act & Assert
        Assert.assertFalse(StringUtil.isWhitespace('a'));
        Assert.assertFalse(StringUtil.isWhitespace('0'));
        Assert.assertFalse(StringUtil.isWhitespace(160));
    }

    @Test
    public void isActuallyWhitespace_givenStandardWhitespaceAndNbsp_shouldReturnTrue() {
        // Arrange & Act & Assert
        Assert.assertTrue(StringUtil.isActuallyWhitespace(' '));
        Assert.assertTrue(StringUtil.isActuallyWhitespace('\t'));
        Assert.assertTrue(StringUtil.isActuallyWhitespace('\n'));
        Assert.assertTrue(StringUtil.isActuallyWhitespace('\f'));
        Assert.assertTrue(StringUtil.isActuallyWhitespace('\r'));
        Assert.assertTrue(StringUtil.isActuallyWhitespace(160));
    }

    @Test
    public void isActuallyWhitespace_givenNonWhitespace_shouldReturnFalse() {
        // Arrange & Act & Assert
        Assert.assertFalse(StringUtil.isActuallyWhitespace('a'));
        Assert.assertFalse(StringUtil.isActuallyWhitespace(161));
        Assert.assertFalse(StringUtil.isActuallyWhitespace('Z'));
    }

    @Test
    public void normaliseWhitespace_givenMultipleWhitespaces_shouldCollapseToSingleSpaces() {
        // Arrange
        String input = "  Hello   \n \t World \r\f !  ";

        // Act
        String result = StringUtil.normaliseWhitespace(input);

        // Assert
        Assert.assertEquals(" Hello World ! ", result);
    }

    @Test
    public void appendNormalisedWhitespace_givenStripLeadingTrue_shouldRemoveLeadingWhitespace() {
        // Arrange
        StringBuilder sb = new StringBuilder();
        String input = "   \n\tHello   World  ";

        // Act
        StringUtil.appendNormalisedWhitespace(sb, input, true);

        // Assert
        Assert.assertEquals("Hello World ", sb.toString());
    }

    @Test
    public void appendNormalisedWhitespace_givenStripLeadingFalse_shouldKeepSingleLeadingWhitespace() {
        // Arrange
        StringBuilder sb = new StringBuilder();
        String input = "   Hello   World  ";

        // Act
        StringUtil.appendNormalisedWhitespace(sb, input, false);

        // Assert
        Assert.assertEquals(" Hello World ", sb.toString());
    }

    @Test
    public void appendNormalisedWhitespace_givenSupplementaryCodePoint_shouldPreserveCharacters() {
        // Arrange
        StringBuilder sb = new StringBuilder();
        // 0x1F600 is grinning face emoji (surrogate pair in UTF-16)
        String emojiString = "A " + new String(Character.toChars(0x1F600)) + "  B";

        // Act
        StringUtil.appendNormalisedWhitespace(sb, emojiString, true);

        // Assert
        Assert.assertEquals("A " + new String(Character.toChars(0x1F600)) + " B", sb.toString());
    }

    @Test
    public void in_givenNeedlePresent_shouldReturnTrue() {
        // Arrange & Act
        boolean result = StringUtil.in("apple", "orange", "apple", "banana");

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void in_givenNeedleNotPresent_shouldReturnFalse() {
        // Arrange & Act
        boolean result = StringUtil.in("pear", "orange", "apple", "banana");

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void in_givenEmptyHaystack_shouldReturnFalse() {
        // Arrange & Act
        boolean result = StringUtil.in("needle", new String[0]);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void inSorted_givenNeedlePresent_shouldReturnTrue() {
        // Arrange
        String[] sortedHaystack = new String[]{"apple", "banana", "cherry", "date"};

        // Act
        boolean result = StringUtil.inSorted("cherry", sortedHaystack);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inSorted_givenNeedleNotPresent_shouldReturnFalse() {
        // Arrange
        String[] sortedHaystack = new String[]{"apple", "banana", "cherry", "date"};

        // Act
        boolean result = StringUtil.inSorted("fig", sortedHaystack);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void resolveUrl_givenRelativePath_shouldResolveCorrectly() throws MalformedURLException {
        // Arrange
        URL base = new URL("http://example.com/dir/page.html");
        String rel = "sub/index.html";

        // Act
        URL resolved = StringUtil.resolve(base, rel);

        // Assert
        Assert.assertEquals("http://example.com/dir/sub/index.html", resolved.toExternalForm());
    }

    @Test
    public void resolveUrl_givenQueryStringRelativeUrl_shouldAppendToBasePath() throws MalformedURLException {
        // Arrange
        URL base = new URL("http://example.com/dir/page.html");
        String rel = "?foo=bar&key=val";

        // Act
        URL resolved = StringUtil.resolve(base, rel);

        // Assert
        Assert.assertEquals("http://example.com/dir/page.html?foo=bar&key=val", resolved.toExternalForm());
    }

    @Test
    public void resolveUrl_givenDotRelativeAndBaseWithoutLeadingSlash_shouldPrefixSlashAndResolve() throws MalformedURLException {
        // Arrange
        URL baseWithoutLeadingSlash = new URL("http", "example.com", 80, "file");
        String rel = "./relative.html";

        // Act
        URL resolved = StringUtil.resolve(baseWithoutLeadingSlash, rel);

        // Assert
        Assert.assertEquals("http://example.com/relative.html", resolved.toExternalForm());
    }

    @Test
    public void resolveString_givenValidBaseAndRelativeUrl_shouldReturnResolvedUrl() {
        // Arrange
        String base = "http://example.com/path/";
        String rel = "target.html";

        // Act
        String result = StringUtil.resolve(base, rel);

        // Assert
        Assert.assertEquals("http://example.com/path/target.html", result);
    }

    @Test
    public void resolveString_givenMalformedBaseButValidAbsoluteRel_shouldReturnRelUrl() {
        // Arrange
        String malformedBase = "ht!tp://invalid base url";
        String absRel = "http://example.com/absolute";

        // Act
        String result = StringUtil.resolve(malformedBase, absRel);

        // Assert
        Assert.assertEquals("http://example.com/absolute", result);
    }

    @Test
    public void resolveString_givenMalformedBaseAndMalformedRel_shouldReturnEmptyString() {
        // Arrange
        String malformedBase = "ht!tp://invalid base url";
        String malformedRel = "ht!tp://invalid relative url";

        // Act
        String result = StringUtil.resolve(malformedBase, malformedRel);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void resolveString_givenValidBaseAndInvalidRelativeUrl_shouldReturnEmptyString() {
        // Arrange
        String base = "http://example.com/";
        String rel = "http://:::";

        // Act
        String result = StringUtil.resolve(base, rel);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void stringBuilder_givenInitialCall_shouldReturnCleanStringBuilder() {
        // Arrange & Act
        StringBuilder sb = StringUtil.stringBuilder();

        // Assert
        Assert.assertNotNull(sb);
        Assert.assertEquals(0, sb.length());
    }

    @Test
    public void stringBuilder_givenSubsequentCallWithinLimit_shouldClearExistingBuffer() {
        // Arrange
        StringBuilder sb1 = StringUtil.stringBuilder();
        sb1.append("test string content");

        // Act
        StringBuilder sb2 = StringUtil.stringBuilder();

        // Assert
        Assert.assertSame(sb1, sb2);
        Assert.assertEquals(0, sb2.length());
    }

    @Test
    public void stringBuilder_givenBufferExceedingMaxLimit_shouldAllocateNewStringBuilder() {
        // Arrange
        StringBuilder sb1 = StringUtil.stringBuilder();
        char[] hugePayload = new char[8 * 1024 + 1];
        Arrays.fill(hugePayload, 'x');
        sb1.append(hugePayload);

        // Act
        StringBuilder sb2 = StringUtil.stringBuilder();

        // Assert
        Assert.assertNotSame(sb1, sb2);
        Assert.assertEquals(0, sb2.length());
    }
}