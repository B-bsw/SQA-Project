package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Before;
import org.junit.Test;

public class NumericEntityUnescaperTest {

    private NumericEntityUnescaper unescaper;

    @Before
    public void setUp() {
        unescaper = new NumericEntityUnescaper();
    }

    @Test
    public void testTranslateDecimalEntity() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "&#65;";
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals("A", writer.toString());
        assertEquals(5, consumed);
    }

    @Test
    public void testTranslateHexEntityLowerX() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "&#x41;";
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals("A", writer.toString());
        assertEquals(6, consumed);
    }

    @Test
    public void testTranslateHexEntityUpperX() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "&#X41;";
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals("A", writer.toString());
        assertEquals(6, consumed);
    }

    @Test
    public void testTranslateSingleDigitEntity() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "&#9;";
        int consumed = unescaper.translate(input, 0, writer);
        // char code 9 is tab
        assertEquals("\t", writer.toString());
        assertEquals(4, consumed);
    }

    @Test
    public void testTranslateMultipleDigitsLoop() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "&#12345;";
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(new String(Character.toChars(12345)), writer.toString());
        assertEquals(8, consumed);
    }

    @Test
    public void testTranslateNotAnEntityNoAmp() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "test";
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateNotAnEntityMissingHash() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "&abc;";
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateNumberFormatExceptionEmptyValue() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "&#;";
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateNumberFormatExceptionInvalidHex() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "&#xZZ;";
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateNumberFormatExceptionInvalidDecimal() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "&#abc;";
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateFullStringWithSurroundingText() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "before &#65; after";
        int consumed = unescaper.translate(input, 7, writer);
        assertEquals("A", writer.toString());
        assertEquals(5, consumed);
    }

    @Test
    public void testPublicTranslateCharSequenceMethod() {
        String input = "Hello &#65; World";
        String result = unescaper.translate(input);
        assertEquals("Hello A World", result);
    }

    @Test
    public void testPublicTranslateCharSequenceWithHex() {
        String input = "&#x48;&#x65;&#x6C;&#x6C;&#x6F;";
        String result = unescaper.translate(input);
        assertEquals("Hello", result);
    }

    @Test
    public void testPublicTranslateCharSequenceEmptyInput() {
        String input = "";
        String result = unescaper.translate(input);
        assertEquals("", result);
    }

    @Test
    public void testPublicTranslateCharSequenceNullInput() {
        String result = unescaper.translate(null);
        assertNull(result);
    }

    @Test
    public void testPublicTranslateCharSequenceWriterMethod() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "Value: &#100;";
        unescaper.translate(input, writer);
        assertEquals("Value: d", writer.toString());
    }

    @Test
    public void testTranslateNoEntityPlainText() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "plain text without entities";
        String result = unescaper.translate(input);
        assertEquals(input, result);
    }

    @Test
    public void testTranslateZeroCodepoint() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "&#0;";
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(4, consumed);
        assertEquals(1, writer.toString().length());
        assertEquals(0, writer.toString().charAt(0));
    }

    @Test
    public void testTranslateHexZero() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "&#x0;";
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(5, consumed);
        assertEquals(1, writer.toString().length());
        assertEquals(0, writer.toString().charAt(0));
    }

    @Test
    public void testTranslateLargeHexValue() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "&#xFF;";
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(255, writer.toString().charAt(0));
        assertEquals(6, consumed);
    }
}