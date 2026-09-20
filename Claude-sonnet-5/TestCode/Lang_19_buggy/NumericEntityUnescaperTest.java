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
    public void testDecimalWithSemicolon() throws IOException {
        String input = "&#65;";
        StringWriter writer = new StringWriter();
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(5, consumed);
        assertEquals("A", writer.toString());
    }

    @Test
    public void testDecimalWithoutSemicolon() throws IOException {
        // the implementation still requires a ';' to terminate scanning,
        // but result length calc does not include it if not consumed as ';'
        String input = "&#65;X";
        StringWriter writer = new StringWriter();
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(5, consumed);
        assertEquals("A", writer.toString());
    }

    @Test
    public void testHexLowerCaseX() throws IOException {
        String input = "&#x41;";
        StringWriter writer = new StringWriter();
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(6, consumed);
        assertEquals("A", writer.toString());
    }

    @Test
    public void testHexUpperCaseX() throws IOException {
        String input = "&#X41;";
        StringWriter writer = new StringWriter();
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(6, consumed);
        assertEquals("A", writer.toString());
    }

    @Test
    public void testSurrogatePairForCodePointAboveFFFF() throws IOException {
        // U+1F600 (emoji) decimal codepoint = 128512
        String input = "&#128512;";
        StringWriter writer = new StringWriter();
        int consumed = unescaper.translate(input, 0, writer);
        char[] expectedChars = Character.toChars(128512);
        String expected = new String(expectedChars);
        assertEquals(input.length(), consumed);
        assertEquals(expected, writer.toString());
    }

    @Test
    public void testHexSurrogatePairForCodePointAboveFFFF() throws IOException {
        // U+1F600 in hex is 1F600
        String input = "&#x1F600;";
        StringWriter writer = new StringWriter();
        int consumed = unescaper.translate(input, 0, writer);
        char[] expectedChars = Character.toChars(0x1F600);
        String expected = new String(expectedChars);
        assertEquals(input.length(), consumed);
        assertEquals(expected, writer.toString());
    }

    @Test
    public void testNotAnEntity_NoAmpersand() throws IOException {
        String input = "abc";
        StringWriter writer = new StringWriter();
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testNotAnEntity_AmpersandWithoutHash() throws IOException {
        String input = "&abc;";
        StringWriter writer = new StringWriter();
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testBoundary_AmpersandIsLastChar() throws IOException {
        String input = "&";
        StringWriter writer = new StringWriter();
        int consumed = unescaper.translate(input, 0, writer);
        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testBoundary_IndexAtSecondToLastPositionFails() throws IOException {
        // index = length - 1, so index < seqEnd -1 is false
        String input = "x&";
        StringWriter writer = new StringWriter();
        int consumed = unescaper.translate(input, 1, writer);
        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testNumberFormatException_EmptyDecimalValue() throws IOException {
        // "&#;" -> start==end, empty string to parse -> NumberFormatException
        String input = "&#;";