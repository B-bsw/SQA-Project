package org.apache.commons.lang3.text.translate;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class NumericEntityUnescaperTest {

    @Test
    public void translate_givenNonEntityChar_shouldReturnZero() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "Hello World";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenAmpersandAtEndOfInput_shouldReturnZero() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "Test&";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 4, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenAmpersandNotFollowedByHash_shouldReturnZero() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&amp;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenDecimalEntity_shouldTranslateAndWriteChar() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&#65;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(5, consumed);
        Assert.assertEquals("A", out.toString());
    }

    @Test
    public void translate_givenHexEntityWithLowerX_shouldTranslateAndWriteChar() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&#x41;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(6, consumed);
        Assert.assertEquals("A", out.toString());
    }

    @Test
    public void translate_givenHexEntityWithUpperX_shouldTranslateAndWriteChar() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&#X42;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(6, consumed);
        Assert.assertEquals("B", out.toString());
    }

    @Test
    public void translate_givenMaxBmpEntityValue_shouldWriteSingleChar() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&#65535;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(8, consumed);
        Assert.assertEquals("\uFFFF", out.toString());
    }

    @Test
    public void translate_givenSupplementaryCodePoint_shouldWriteSurrogatePair() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&#x10000;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(9, consumed);
        char[] expectedChars = Character.toChars(0x10000);
        Assert.assertEquals(new String(expectedChars), out.toString());
    }

    @Test
    public void translate_givenLargeSupplementaryCodePoint_shouldWriteSurrogatePair() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&#119558;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(9, consumed);
        char[] expectedChars = Character.toChars(119558);
        Assert.assertEquals(new String(expectedChars), out.toString());
    }

    @Test
    public void translate_givenInvalidDecimalNumber_shouldCatchExceptionAndReturnZero() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&#notANumber;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenInvalidHexNumber_shouldCatchExceptionAndReturnZero() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&#xZZZ;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenEmptyEntity_shouldCatchExceptionAndReturnZero() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&#;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenEmptyHexEntity_shouldCatchExceptionAndReturnZero() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&#x;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenEntityInMiddleOfString_shouldTranslateCorrectSlice() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "Prefix&#67;Suffix";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 6, out);

        // Assert
        Assert.assertEquals(5, consumed);
        Assert.assertEquals("C", out.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void translate_givenMissingSemicolon_shouldThrowIndexOutOfBoundsException() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&#65";
        StringWriter out = new StringWriter();

        // Act
        unescaper.translate(input, 0, out);
    }

    @Test(expected = NullPointerException.class)
    public void translate_givenNullInput_shouldThrowNullPointerException() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();

        // Act
        unescaper.translate(null, 0, out);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void translate_givenIndexOutOfBounds_shouldThrowIndexOutOfBoundsException() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&#65;";
        StringWriter out = new StringWriter();

        // Act
        unescaper.translate(input, 10, out);
    }

    @Test(expected = NullPointerException.class)
    public void translate_givenNullWriterOnValidMatch_shouldThrowNullPointerException() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "&#65;";

        // Act
        unescaper.translate(input, 0, null);
    }

    @Test
    public void translate_givenNullWriterOnNonMatch_shouldReturnZeroWithoutException() throws IOException {
        // Arrange
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        CharSequence input = "ABC";

        // Act
        int consumed = unescaper.translate(input, 0, null);

        // Assert
        Assert.assertEquals(0, consumed);
    }
}