package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

public class LexerTest {

    private Lexer createLexer(String input, CSVFormat format) {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader(input));
        return new Lexer(format, reader) {
            @Override
            Token nextToken(Token reusableToken) throws IOException {
                return null;
            }
        };
    }

    @Test
    public void testReadEscapeCR() throws IOException {
        Lexer lexer = createLexer("\\r", CSVFormat.DEFAULT);
        assertEquals(CR, lexer.readEscape());
    }

    @Test
    public void testReadEscapeLF() throws IOException {
        Lexer lexer = createLexer("\\n", CSVFormat.DEFAULT);
        assertEquals(LF, lexer.readEscape());
    }

    @Test
    public void testReadEscapeTAB() throws IOException {
        Lexer lexer = createLexer("\\t", CSVFormat.DEFAULT);
        assertEquals(TAB, lexer.readEscape());
    }

    @Test
    public void testReadEscapeBackspace() throws IOException {
        Lexer lexer = createLexer("\\b", CSVFormat.DEFAULT);
        assertEquals(BACKSPACE, lexer.readEscape());
    }

    @Test
    public void testReadEscapeFF() throws IOException {
        Lexer lexer = createLexer("\\f", CSVFormat.DEFAULT);
        assertEquals(FF, lexer.readEscape());
    }

    @Test
    public void testReadEscapeCRLF() throws IOException {
        Lexer lexer = createLexer("\r", CSVFormat.DEFAULT);
        assertEquals(CR, lexer.readEscape());
    }

    @Test
    public void testReadEscapeLFDirect() throws IOException {
        Lexer lexer = createLexer("\n", CSVFormat.DEFAULT);
        assertEquals(LF, lexer.readEscape());
    }

    @Test
    public void testReadEscapeFFDirect() throws IOException {
        Lexer lexer = createLexer("\f", CSVFormat.DEFAULT);
        assertEquals(FF, lexer.readEscape());
    }

    @Test
    public void testReadEscapeTABDirect() throws IOException {
        Lexer lexer = createLexer("\t", CSVFormat.DEFAULT);
        assertEquals(TAB, lexer.readEscape());
    }

    @Test
    public void testReadEscapeBackspaceDirect() throws IOException {
        Lexer lexer = createLexer("\b", CSVFormat.DEFAULT);
        assertEquals(BACKSPACE, lexer.readEscape());
    }

    @Test
    public void testReadEscapeEOF() throws IOException {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        try {
            lexer.readEscape();
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("EOF whilst processing escape sequence", e.getMessage());
        }
    }

    @Test
    public void testReadEscapeDefault() throws IOException {
        Lexer lexer = createLexer("x", CSVFormat.DEFAULT);
        assertEquals('x', lexer.readEscape());
    }

    @Test
    public void testReadEscapeDefaultEndOfStream() throws IOException {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        try {
            lexer.readEscape();
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testTrimTrailingSpacesNoSpaces() {
        StringBuilder buffer = new StringBuilder("abc");
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        lexer.trimTrailingSpaces(buffer);
        assertEquals("abc", buffer.toString());
    }

    @Test
    public void testTrimTrailingSpacesWithSpaces() {
        StringBuilder buffer = new StringBuilder("abc   ");
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        lexer.trimTrailingSpaces(buffer);
        assertEquals("abc", buffer.toString());
    }

    @Test
    public void testTrimTrailingSpacesAllSpaces() {
        StringBuilder buffer = new StringBuilder("   ");
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        lexer.trimTrailingSpaces(buffer);
        assertEquals("", buffer.toString());
    }

    @Test
    public void testTrimTrailingSpacesMixedSpacesAndTabs() {
        StringBuilder buffer = new StringBuilder("abc \t ");
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        lexer.trimTrailingSpaces(buffer);
        assertEquals("abc", buffer.toString());
    }

    @Test
    public void testReadEndOfLineLF() throws IOException {
        Lexer lexer = createLexer("\n", CSVFormat.DEFAULT);
        assertTrue(lexer.readEndOfLine(LF));
    }

    @Test
    public void testReadEndOfLineCR() throws IOException {
        Lexer lexer = createLexer("\r", CSVFormat.DEFAULT);
        assertTrue(lexer.readEndOfLine(CR));
    }

    @Test
    public void testReadEndOfLineCRLF() throws IOException {
        Lexer lexer = createLexer("\r\n", CSVFormat.DEFAULT);
        assertTrue(lexer.readEndOfLine(CR));
    }

    @Test
    public void testReadEndOfLineCRNotLF() throws IOException {
        Lexer lexer = createLexer("\rX", CSVFormat.DEFAULT);
        assertTrue(lexer.readEndOfLine(CR));
    }

    @Test
    public void testReadEndOfLineNeither() throws IOException {
        Lexer lexer = createLexer("X", CSVFormat.DEFAULT);
        assertFalse(lexer.readEndOfLine('X'));
    }

    @Test
    public void testIsWhitespaceDelimiter() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT.withDelimiter(' '));
        assertFalse(lexer.isWhitespace(' '));
    }

    @Test
    public void testIsWhitespaceRegularSpace() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertTrue(lexer.isWhitespace(' '));
    }

    @Test
    public void testIsWhitespaceTab() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertTrue(lexer.isWhitespace('\t'));
    }

    @Test
    public void testIsWhitespaceNewLine() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertTrue(lexer.isWhitespace('\n'));
    }

    @Test
    public void testIsStartOfLineLF() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertTrue(lexer.isStartOfLine(LF));
    }

    @Test
    public void testIsStartOfLineCR() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertTrue(lexer.isStartOfLine(CR));
    }

    @Test
    public void testIsStartOfLineUndefined() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertTrue(lexer.isStartOfLine(UNDEFINED));
    }

    @Test
    public void testIsStartOfLineCharacter() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertFalse(lexer.isStartOfLine('a'));
    }

    @Test
    public void testIsEndOfFile() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertTrue(lexer.isEndOfFile(END_OF_STREAM));
    }

    @Test
    public void testIsEndOfFileNotEof() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertFalse(lexer.isEndOfFile('a'));
    }

    @Test
    public void testIsDelimiter() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT.withDelimiter(','));
        assertTrue(lexer.isDelimiter(','));
    }

    @Test
    public void testIsDelimiterFalse() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT.withDelimiter(','));
        assertFalse(lexer.isDelimiter(';'));
    }

    @Test
    public void testIsEscape() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT.withEscape('\\'));
        assertTrue(lexer.isEscape('\\'));
    }

    @Test
    public void testIsEscapeFalse() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT.withEscape('\\'));
        assertFalse(lexer.isEscape('/'));
    }

    @Test
    public void testIsQuoteChar() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT.withQuote('"'));
        assertTrue(lexer.isQuoteChar('"'));
    }

    @Test
    public void testIsQuoteCharFalse() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT.withQuote('"'));
        assertFalse(lexer.isQuoteChar('\''));
    }

    @Test
    public void testIsCommentStart() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT.withCommentMarker('#'));
        assertTrue(lexer.isCommentStart('#'));
    }

    @Test
    public void testIsCommentStartFalse() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT.withCommentMarker('#'));
        assertFalse(lexer.isCommentStart(';'));
    }

    @Test
    public void testNullEscapeMapping() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT.withEscape(null));
        assertFalse(lexer.isEscape('\\'));
    }

    @Test
    public void testNullQuoteMapping() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT.withQuote(null));
        assertFalse(lexer.isQuoteChar('"'));
    }

    @Test
    public void testNullCommentStartMapping() {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT.withCommentMarker(null));
        assertFalse(lexer.isCommentStart('#'));
    }

    @Test
    public void testIgnoreSurroundingSpaces() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        Lexer lexer = createLexer("", format);
        assertTrue(lexer.ignoreSurroundingSpaces);
    }

    @Test
    public void testIgnoreEmptyLinesDefault() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
        Lexer lexer = createLexer("", format);
        assertTrue(lexer.ignoreEmptyLines);
    }

    @Test
    public void testReadEscapeWithFormatBorderline() throws IOException {
        Lexer lexer = createLexer("", CSVFormat.DEFAULT.withDelimiter(','));
        assertEquals(',', lexer.readEscape());
    }

    @Test
    public void testReadEscapeWithFormatDelimiterAndEscape() throws IOException {
        Lexer lexer = createLexer(",", CSVFormat.DEFAULT.withDelimiter(','));
        assertEquals(',', lexer.readEscape());
    }

    @Test
    public void testReadEscapeWithFormatQuote() throws IOException {
        Lexer lexer = createLexer("\"", CSVFormat.DEFAULT.withQuote('"'));
        assertEquals('"', lexer.readEscape());
    }

    @Test
    public void testReadEscapeWithFormatCommentStart() throws IOException {
        Lexer lexer = createLexer("#", CSVFormat.DEFAULT.withCommentMarker('#'));
        assertEquals('#', lexer.readEscape());
    }

    @Test
    public void testReadEscapeWithFormatEscape() throws IOException {
        Lexer lexer = createLexer("\\", CSVFormat.DEFAULT.withEscape('\\'));
        assertEquals('\\', lexer.readEscape());
    }

    @Test
    public void testReadEscapeWithFormatEscapedEscape() throws IOException {
        Lexer lexer = createLexer("\\\\", CSVFormat.DEFAULT.withEscape('\\'));
        assertEquals('\\', lexer.readEscape());
    }
}