package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

public class NumericEntityUnescaperTest {

    private final NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
    private final StringWriter writer = new StringWriter();

    @Test
    public void testDecimalEntity() throws IOException {
        CharSequence input = "&#65;";
        int result = unescaper.translate(input, 0, writer);
        assertEquals(5, result);
        assertEquals("A", writer.toString());
    }

    @Test
    public void testHexEntity() throws IOException {
        CharSequence input = "&#x41;";
        int result = unescaper.translate(input, 0, writer);
        assertEquals(6, result);
        assertEquals("A", writer.toString());
    }

    @Test
    public void testDecimalWithoutSemicolon() throws IOException {
        CharSequence input = "&#65";
        int result = unescaper.translate(input, 0, writer);
        assertEquals(4, result);
        assertEquals("A", writer.toString());
    }

    @Test
    public void testHexWithoutSemicolon() throws IOException {
        CharSequence input = "&#x41";
        int result = unescaper.translate(input, 0, writer);
        assertEquals(5, result);
        assertEquals("A", writer.toString());
    }

    @Test
    public void testUpperCaseHexPrefix() throws IOException {
        CharSequence input = "&#X42;";
        int result = unescaper.translate(input, 0, writer);
        assertEquals(6, result);
        assertEquals("B", writer.toString());
    }

    @Test
    public void testEntityAtNonZeroIndex() throws IOException {
        CharSequence input = "abc&#66;def";
        int result = unescaper.translate(input, 3, writer);
        assertEquals(5, result);
        assertEquals("B", writer.toString());
    }

    @Test
    public void testNonEntityReturnsZero() throws IOException {
        CharSequence input = "notanentity";
        int result = unescaper.translate(input, 0, writer);
        assertEquals(0, result);
        assertEquals("", writer.toString());
    }

    @Test
    public void testAmpersandNotFollowedByHash() throws IOException {
        CharSequence input = "&amp;";
        int result = unescaper.translate(input, 0, writer);
        assertEquals(0, result);
        assertEquals("", writer.toString());
    }

    @Test
    public void testIncompleteHexPrefix() throws IOException {
        CharSequence input = "&#x";
        try {
            unescaper.translate(input, 0, writer);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected behavior
        }
    }

    @Test
    public void testInvalidNumberFormat() throws IOException {
        CharSequence input = "&#abc;";
        StringWriter sw = new StringWriter();
        int result = unescaper.translate(input, 0, sw);
        assertEquals(0, result);
        assertEquals("", sw.toString());
    }

    @Test
    public void testEntityWithMultipleDigits() throws IOException {
        CharSequence input = "&#x1F600;";
        int result = unescaper.translate(input, 0, writer);
        String output = writer.toString();
        assertEquals(8, result);
        assertEquals(Character.toString(Character.toChars(0x1F600)[0]) +
                Character.toString(Character.toChars(0x1F600)[1]), output);
    }

    @Test
    public void testEntityAtEndOfInput() throws IOException {
        CharSequence input = "&#65";
        int result = unescaper.translate(input, 0, writer);
        assertEquals(4, result);
        assertEquals("A", writer.toString());
    }

    @Test
    public void testEntityInMiddleOfString() throws IOException {
        CharSequence input = "abc&#67;def";
        StringWriter sw = new StringWriter();
        int result = unescaper.translate(input, 3, sw);
        assertEquals(5, result);
        assertEquals("C", sw.toString());
    }

    @Test
    public void testBoundaryIndexAtStart() throws IOException {
        CharSequence input = "&#68;";
        int result = unescaper.translate(input, 0, writer);
        assertEquals(5, result);
        assertEquals("D", writer.toString());
    }

    @Test
    public void testNonEntityAtStart() throws IOException {
        CharSequence input = "x&#69;";
        int result = unescaper.translate(input, 0, writer);
        assertEquals(0, result);
        assertEquals("", writer.toString());
    }

    @Test
    public void testInvalidHexValue() throws IOException {
        CharSequence input = "&#xZZ;";
        StringWriter sw = new StringWriter();
        int result = unescaper.translate(input, 0, sw);
        assertEquals(0, result);
        assertEquals("", sw.toString());
    }

    @Test
    public void testDecimalValueMaxChar() throws IOException {
        CharSequence input = "&#65535;";
        int result = unescaper.translate(input, 0, writer);
        assertEquals(8, result);
        assertEquals("\uFFFF", writer.toString());
    }

    @Test
    public void testSurrogatePairAtBoundary() throws IOException {
        CharSequence input = "&#x10000;";
        int result = unescaper.translate(input, 0, writer);
        String output = writer.toString();
        assertEquals(8, result);
        assertEquals(2, output.length());
        assertEquals(0xD800, output.charAt(0));
        assertEquals(0xDC00, output.charAt(1));
    }

    @Test
    public void testLeadingZerosInHex() throws IOException {
        CharSequence input = "&#x00003A;";
        int result = unescaper.translate(input, 0, writer);
        assertEquals(10, result);
        assertEquals(":", writer.toString());
    }

    @Test
    public void testEmptyString() throws IOException {
        CharSequence input = "";
        int result = unescaper.translate(input, 0, writer);
        assertEquals(0, result);
        assertEquals("", writer.toString());
    }
}