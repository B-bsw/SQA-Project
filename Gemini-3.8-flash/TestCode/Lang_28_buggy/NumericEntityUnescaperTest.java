package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.StringWriter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit Test Suite for {@link NumericEntityUnescaper}.
 * Strict compatibility: Java 1.4 / Java 7 syntax, JUnit 4, no third-party test libraries.
 */
public class NumericEntityUnescaperTest {

    private NumericEntityUnescaper unescaper;

    @Before
    public void setUp() {
        unescaper = new NumericEntityUnescaper();
    }

    // ==========================================
    // Phase 1: Happy Path Tests
    // ==========================================

    @Test
    public void translate_givenValidDecimalEntity_shouldTranslateAndReturnConsumedLength() throws IOException {
        // Arrange
        CharSequence input = "&#65;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(5, consumed);
        Assert.assertEquals("A", out.toString());
    }

    @Test
    public void translate_givenValidHexEntityLowerCaseX_shouldTranslateAndReturnConsumedLength() throws IOException {
        // Arrange
        CharSequence input = "&#x41;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(6, consumed);
        Assert.assertEquals("A", out.toString());
    }

    @Test
    public void translate_givenValidHexEntityUpperCaseX_shouldTranslateAndReturnConsumedLength() throws IOException {
        // Arrange
        CharSequence input = "&#X42;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(6, consumed);
        Assert.assertEquals("B", out.toString());
    }

    @Test
    public void translate_givenMultiDigitDecimalEntity_shouldTranslateCorrectly() throws IOException {
        // Arrange
        CharSequence input = "&#1234;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(7, consumed);
        Assert.assertEquals(String.valueOf((char) 1234), out.toString());
    }

    @Test
    public void translate_givenMultiDigitHexEntity_shouldTranslateCorrectly() throws IOException {
        // Arrange
        CharSequence input = "&#x3042;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(8, consumed);
        Assert.assertEquals(String.valueOf((char) 0x3042), out.toString());
    }

    @Test
    public void translate_givenEntityAtNonZeroIndex_shouldTranslateFromGivenIndex() throws IOException {
        // Arrange
        CharSequence input = "Prefix &#65; Suffix";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 7, out);

        // Assert
        Assert.assertEquals(5, consumed);
        Assert.assertEquals("A", out.toString());
    }

    // ==========================================
    // Phase 2: Boundary & Edge Cases
    // ==========================================

    @Test
    public void translate_givenNonAmpersandPrefix_shouldReturnZeroAndNotWrite() throws IOException {
        // Arrange
        CharSequence input = "Plain text";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenAmpersandWithoutHash_shouldReturnZeroAndNotWrite() throws IOException {
        // Arrange
        CharSequence input = "&amp;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenAmpersandFollowedByNonHashChar_shouldReturnZeroAndNotWrite() throws IOException {
        // Arrange
        CharSequence input = "&123;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenEmptyDecimalEntity_shouldCatchNumberFormatExceptionAndReturnZero() throws IOException {
        // Arrange
        CharSequence input = "&#;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenEmptyHexEntityLowerCase_shouldCatchNumberFormatExceptionAndReturnZero() throws IOException {
        // Arrange
        CharSequence input = "&#x;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenEmptyHexEntityUpperCase_shouldCatchNumberFormatExceptionAndReturnZero() throws IOException {
        // Arrange
        CharSequence input = "&#X;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenInvalidDecimalCharacters_shouldCatchNumberFormatExceptionAndReturnZero() throws IOException {
        // Arrange
        CharSequence input = "&#XYZ;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenInvalidHexCharacters_shouldCatchNumberFormatExceptionAndReturnZero() throws IOException {
        // Arrange
        CharSequence input = "&#xGHI;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void translate_givenDecimalOverflow_shouldCatchNumberFormatExceptionAndReturnZero() throws IOException {
        // Arrange
        CharSequence input = "&#9999999999999999999999999;";
        StringWriter out = new StringWriter();

        // Act
        int consumed = unescaper.translate(input, 0, out);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    // ==========================================
    // Phase 3: Error & Exception Branches
    // ==========================================

    @Test
    public void translate_givenNullInput_shouldThrowNullPointerException() throws IOException {
        // Arrange
        StringWriter out = new StringWriter();

        // Act & Assert
        try {
            unescaper.translate(null, 0, out);
            Assert.fail("Expected NullPointerException when input is null");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

    @Test
    public void translate_givenAmpersandAtLastIndex_shouldThrowIndexOutOfBoundsException() throws IOException {
        // Arrange
        CharSequence input = "&";
        StringWriter out = new StringWriter();

        // Act & Assert
        try {
            unescaper.translate(input, 0, out);
            Assert.fail("Expected IndexOutOfBoundsException when ampersand is at string end");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception
        }
    }

    @Test
    public void translate_givenIncompleteEntityPrefix_shouldThrowIndexOutOfBoundsException() throws IOException {
        // Arrange
        CharSequence input = "&#";
        StringWriter out = new StringWriter();

        // Act & Assert
        try {
            unescaper.translate(input, 0, out);
            Assert.fail("Expected IndexOutOfBoundsException when string ends right after hash");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception
        }
    }

    @Test
    public void translate_givenIncompleteHexPrefix_shouldThrowIndexOutOfBoundsException() throws IOException {
        // Arrange
        CharSequence input = "&#x";
        StringWriter out = new StringWriter();

        // Act & Assert
        try {
            unescaper.translate(input, 0, out);
            Assert.fail("Expected IndexOutOfBoundsException when string ends right after hex marker");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception
        }
    }

    @Test
    public void translate_givenMissingTerminatingSemicolon_shouldThrowIndexOutOfBoundsException() throws IOException {
        // Arrange
        CharSequence input = "&#65";
        StringWriter out = new StringWriter();

        // Act & Assert
        try {
            unescaper.translate(input, 0, out);
            Assert.fail("Expected IndexOutOfBoundsException when terminating semicolon is missing");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception
        }
    }
}