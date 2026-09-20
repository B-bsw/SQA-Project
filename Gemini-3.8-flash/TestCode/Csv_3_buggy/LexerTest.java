package org.apache.commons.csv;

import static org.apache.commons.csv.Constants.BACKSPACE;
import static org.apache.commons.csv.Constants.CR;
import static org.apache.commons.csv.Constants.END_OF_STREAM;
import static org.apache.commons.csv.Constants.FF;
import static org.apache.commons.csv.Constants.LF;
import static org.apache.commons.csv.Constants.TAB;
import static org.apache.commons.csv.Constants.UNDEFINED;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

/**
 * Unit test suite for {@link Lexer}.
 */
public class LexerTest {

    private static final char DISABLED = '\ufffe';

    private static class ConcreteTestLexer extends Lexer {
        ConcreteTestLexer(final CSVFormat format, final ExtendedBufferedReader in) {
            super(format, in);
        }

        Token nextToken(final Token reusableToken) throws IOException {
            return reusableToken;
        }
    }

    private ConcreteTestLexer createLexer(final String input, final CSVFormat format) {
        final ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader(input));
        return new ConcreteTestLexer(format, reader);
    }

    @Test
    public void constructor_givenDefaultFormat_shouldInitializeFieldsCorrectly() {
        // Arrange
        final CSVFormat format = CSVFormat.DEFAULT;
        final ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader(""));

        // Act
        final ConcreteTestLexer lexer = new ConcreteTestLexer(format, reader);

        // Assert
        assertNotNull(lexer.format);
        assertNotNull(lexer.in);
        assertEquals(format.getDelimiter(), lexer.isDelimiter(format.getDelimiter()) ? format.getDelimiter() : 0);
        assertFalse(lexer.ignoreSurroundingSpaces);
        assertTrue(lexer.ignoreEmptyLines);
        assertTrue(lexer.isQuoteChar('"'));
        assertFalse(lexer.isEscape('\\'));
        assertFalse(lexer.isCommentStart('#'));
    }

    @Test
    public void constructor_givenFormatWithCustomSettings_shouldInitializeFields() {
        // Arrange
        final CSVFormat format = CSVFormat.DEFAULT
                .withDelimiter(';')
                .withEscape('\\')
                .withQuoteChar('\'')
                .withCommentStart('#')
                .withIgnoreSurroundingSpaces(true)
                .withIgnoreEmptyLines(false);
        final ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader(""));

        // Act
        final ConcreteTestLexer lexer = new ConcreteTestLexer(format, reader);

        // Assert
        assertTrue(lexer.isDelimiter(';'));
        assertTrue(lexer.isEscape('\\'));
        assertTrue(lexer.isQuoteChar('\''));
        assertTrue(lexer.isCommentStart('#'));
        assertTrue(lexer.ignoreSurroundingSpaces);
        assertFalse(lexer.ignoreEmptyLines);
    }

    @Test
    public void constructor_givenFormatWithNullCharacters_shouldMapToDisabled() {
        // Arrange
        final CSVFormat format = CSVFormat.DEFAULT
                .withEscape((Character) null)
                .withQuoteChar((Character) null)
                .withCommentStart((Character) null);
        final ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader(""));

        // Act
        final ConcreteTestLexer lexer = new ConcreteTestLexer(format, reader);

        // Assert
        assertTrue(lexer.isEscape(DISABLED));
        assertTrue(lexer.isQuoteChar(DISABLED));
        assertTrue(lexer.isCommentStart(DISABLED));
        assertFalse(lexer.isEscape('\\'));
        assertFalse(lexer.isQuoteChar('"'));
        assertFalse(lexer.isCommentStart('#'));
    }

    @Test
    public void getLineNumber_givenReaderWithLines_shouldDelegateToBufferedReader() throws IOException {
        // Arrange
        final ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("line1\nline2\nline3"));
        final ConcreteTestLexer lexer = new ConcreteTestLexer(CSVFormat.DEFAULT, reader);

        // Act & Assert
        assertEquals(0, lexer.getLineNumber());
        reader.readLine();
        assertEquals(1, lexer.getLineNumber());
        reader.readLine();
        assertEquals(2, lexer.getLineNumber());
    }

    @Test
    public void readEscape_givenCharR_shouldReturnCR() throws IOException {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("r", CSVFormat.DEFAULT);

        // Act
        final int result = lexer.readEscape();

        // Assert
        assertEquals(CR, result);
    }

    @Test
    public void readEscape_givenCharN_shouldReturnLF() throws IOException {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("n", CSVFormat.DEFAULT);

        // Act
        final int result = lexer.readEscape();

        // Assert
        assertEquals(LF, result);
    }

    @Test
    public void readEscape_givenCharT_shouldReturnTAB() throws IOException {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("t", CSVFormat.DEFAULT);

        // Act
        final int result = lexer.readEscape();

        // Assert
        assertEquals(TAB, result);
    }

    @Test
    public void readEscape_givenCharB_shouldReturnBACKSPACE() throws IOException {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("b", CSVFormat.DEFAULT);

        // Act
        final int result = lexer.readEscape();

        // Assert
        assertEquals(BACKSPACE, result);
    }

    @Test
    public void readEscape_givenCharF_shouldReturnFF() throws IOException {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("f", CSVFormat.DEFAULT);

        // Act
        final int result = lexer.readEscape();

        // Assert
        assertEquals(FF, result);
    }

    @Test
    public void readEscape_givenLiteralCR_shouldReturnCR() throws IOException {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("\r", CSVFormat.DEFAULT);

        // Act
        final int result = lexer.readEscape();

        // Assert
        assertEquals(CR, result);
    }

    @Test
    public void readEscape_givenLiteralLF_shouldReturnLF() throws IOException {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("\n", CSVFormat.DEFAULT);

        // Act
        final int result = lexer.readEscape();

        // Assert
        assertEquals(LF, result);
    }

    @Test
    public void readEscape_givenLiteralFF_shouldReturnFF() throws IOException {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("\f", CSVFormat.DEFAULT);

        // Act
        final int result = lexer.readEscape();

        // Assert
        assertEquals(FF, result);
    }

    @Test
    public void readEscape_givenLiteralTAB_shouldReturnTAB() throws IOException {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("\t", CSVFormat.DEFAULT);

        // Act
        final int result = lexer.readEscape();

        // Assert
        assertEquals(TAB, result);
    }

    @Test
    public void readEscape_givenLiteralBACKSPACE_shouldReturnBACKSPACE() throws IOException {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("\b", CSVFormat.DEFAULT);

        // Act
        final int result = lexer.readEscape();

        // Assert
        assertEquals(BACKSPACE, result);
    }

    @Test
    public void readEscape_givenNormalChar_shouldReturnSameChar() throws IOException {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("a", CSVFormat.DEFAULT);

        // Act
        final int result = lexer.readEscape();

        // Assert
        assertEquals('a', result);
    }

    @Test
    public void readEscape_givenEndOfStream_shouldThrowIOException() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT);

        // Act & Assert
        try {
            lexer.readEscape();
            fail("Expected IOException when escaping at end of stream");
        } catch (final IOException e) {
            assertEquals("EOF whilst processing escape sequence", e.getMessage());
        }
    }

    @Test
    public void trimTrailingSpaces_givenEmptyBuffer_shouldRemainEmpty() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT);
        final StringBuilder buffer = new StringBuilder("");

        // Act
        lexer.trimTrailingSpaces(buffer);

        // Assert
        assertEquals(0, buffer.length());
        assertEquals("", buffer.toString());
    }

    @Test
    public void trimTrailingSpaces_givenNoTrailingSpaces_shouldRemainUnchanged() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT);
        final StringBuilder buffer = new StringBuilder("abc");

        // Act
        lexer.trimTrailingSpaces(buffer);

        // Assert
        assertEquals("abc", buffer.toString());
    }

    @Test
    public void trimTrailingSpaces_givenTrailingSpaces_shouldTrimSpaces() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT);
        final StringBuilder buffer = new StringBuilder("abc   ");

        // Act
        lexer.trimTrailingSpaces(buffer);

        // Assert
        assertEquals("abc", buffer.toString());
    }

    @Test
    public void trimTrailingSpaces_givenMixedWhitespaceTrailing_shouldTrimAllTrailing() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT);
        final StringBuilder buffer = new StringBuilder("test \t\r\n ");

        // Act
        lexer.trimTrailingSpaces(buffer);

        // Assert
        assertEquals("test", buffer.toString());
    }

    @Test
    public void trimTrailingSpaces_givenOnlyWhitespace_shouldBecomeEmpty() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT);
        final StringBuilder buffer = new StringBuilder("   \t\n  ");

        // Act
        lexer.trimTrailingSpaces(buffer);

        // Assert
        assertEquals(0, buffer.length());
        assertEquals("", buffer.toString());
    }

    @Test
    public void trimTrailingSpaces_givenInternalSpaces_shouldPreserveInternalSpaces() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT);
        final StringBuilder buffer = new StringBuilder("a b c   ");

        // Act
        lexer.trimTrailingSpaces(buffer);

        // Assert
        assertEquals("a b c", buffer.toString());
    }

    @Test
    public void readEndOfLine_givenCRFollowedByLF_shouldReturnTrueAndConsumeLF() throws IOException {
        // Arrange
        final ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("\r\nremainder"));
        final ConcreteTestLexer lexer = new ConcreteTestLexer(CSVFormat.DEFAULT, reader);
        final int firstChar = reader.read();

        // Act
        final boolean isEol = lexer.readEndOfLine(firstChar);

        // Assert
        assertTrue(isEol);
        assertEquals('r', reader.read());
    }

    @Test
    public void readEndOfLine_givenCRFollowedByNonLF_shouldReturnTrueAndNotConsumeNextChar() throws IOException {
        // Arrange
        final ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("\ra"));
        final ConcreteTestLexer lexer = new ConcreteTestLexer(CSVFormat.DEFAULT, reader);
        final int firstChar = reader.read();

        // Act
        final boolean isEol = lexer.readEndOfLine(firstChar);

        // Assert
        assertTrue(isEol);
        assertEquals('a', reader.read());
    }

    @Test
    public void readEndOfLine_givenCRAtEndOfStream_shouldReturnTrue() throws IOException {
        // Arrange
        final ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("\r"));
        final ConcreteTestLexer lexer = new ConcreteTestLexer(CSVFormat.DEFAULT, reader);
        final int firstChar = reader.read();

        // Act
        final boolean isEol = lexer.readEndOfLine(firstChar);

        // Assert
        assertTrue(isEol);
        assertEquals(END_OF_STREAM, reader.read());
    }

    @Test
    public void readEndOfLine_givenLF_shouldReturnTrue() throws IOException {
        // Arrange
        final ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("\na"));
        final ConcreteTestLexer lexer = new ConcreteTestLexer(CSVFormat.DEFAULT, reader);
        final int firstChar = reader.read();

        // Act
        final boolean isEol = lexer.readEndOfLine(firstChar);

        // Assert
        assertTrue(isEol);
        assertEquals('a', reader.read());
    }

    @Test
    public void readEndOfLine_givenNormalCharacter_shouldReturnFalse() throws IOException {
        // Arrange
        final ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("abc"));
        final ConcreteTestLexer lexer = new ConcreteTestLexer(CSVFormat.DEFAULT, reader);
        final int firstChar = reader.read();

        // Act
        final boolean isEol = lexer.readEndOfLine(firstChar);

        // Assert
        assertFalse(isEol);
    }

    @Test
    public void readEndOfLine_givenEndOfStream_shouldReturnFalse() throws IOException {
        // Arrange
        final ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader(""));
        final ConcreteTestLexer lexer = new ConcreteTestLexer(CSVFormat.DEFAULT, reader);
        final int firstChar = reader.read();

        // Act
        final boolean isEol = lexer.readEndOfLine(firstChar);

        // Assert
        assertFalse(isEol);
    }

    @Test
    public void isWhitespace_givenWhitespaceWhenNotDelimiter_shouldReturnTrue() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withDelimiter(','));

        // Act & Assert
        assertTrue(lexer.isWhitespace(' '));
        assertTrue(lexer.isWhitespace('\t'));
        assertTrue(lexer.isWhitespace('\n'));
        assertTrue(lexer.isWhitespace('\r'));
    }

    @Test
    public void isWhitespace_givenWhitespaceWhenItIsDelimiter_shouldReturnFalse() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withDelimiter('\t'));

        // Act & Assert
        assertFalse(lexer.isWhitespace('\t'));
        assertTrue(lexer.isWhitespace(' '));
    }

    @Test
    public void isWhitespace_givenNonWhitespace_shouldReturnFalse() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withDelimiter(','));

        // Act & Assert
        assertFalse(lexer.isWhitespace('a'));
        assertFalse(lexer.isWhitespace(','));
        assertFalse(lexer.isWhitespace('1'));
    }

    @Test
    public void isStartOfLine_givenLF_shouldReturnTrue() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT);

        // Act & Assert
        assertTrue(lexer.isStartOfLine(LF));
    }

    @Test
    public void isStartOfLine_givenCR_shouldReturnTrue() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT);

        // Act & Assert
        assertTrue(lexer.isStartOfLine(CR));
    }

    @Test
    public void isStartOfLine_givenUndefined_shouldReturnTrue() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT);

        // Act & Assert
        assertTrue(lexer.isStartOfLine(UNDEFINED));
    }

    @Test
    public void isStartOfLine_givenOtherCharacters_shouldReturnFalse() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT);

        // Act & Assert
        assertFalse(lexer.isStartOfLine('a'));
        assertFalse(lexer.isStartOfLine(' '));
        assertFalse(lexer.isStartOfLine(END_OF_STREAM));
    }

    @Test
    public void isEndOfFile_givenEndOfStream_shouldReturnTrue() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT);

        // Act & Assert
        assertTrue(lexer.isEndOfFile(END_OF_STREAM));
    }

    @Test
    public void isEndOfFile_givenNonEndOfStream_shouldReturnFalse() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT);

        // Act & Assert
        assertFalse(lexer.isEndOfFile(0));
        assertFalse(lexer.isEndOfFile('a'));
        assertFalse(lexer.isEndOfFile(LF));
    }

    @Test
    public void isDelimiter_givenMatchingChar_shouldReturnTrue() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withDelimiter(','));

        // Act & Assert
        assertTrue(lexer.isDelimiter(','));
    }

    @Test
    public void isDelimiter_givenNonMatchingChar_shouldReturnFalse() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withDelimiter(','));

        // Act & Assert
        assertFalse(lexer.isDelimiter(';'));
        assertFalse(lexer.isDelimiter(' '));
    }

    @Test
    public void isEscape_givenMatchingChar_shouldReturnTrue() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withEscape('\\'));

        // Act & Assert
        assertTrue(lexer.isEscape('\\'));
    }

    @Test
    public void isEscape_givenNonMatchingChar_shouldReturnFalse() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withEscape('\\'));

        // Act & Assert
        assertFalse(lexer.isEscape('/'));
        assertFalse(lexer.isEscape('a'));
    }

    @Test
    public void isEscape_givenDisabledEscape_shouldReturnTrueOnlyForDisabledChar() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withEscape((Character) null));

        // Act & Assert
        assertTrue(lexer.isEscape(DISABLED));
        assertFalse(lexer.isEscape('\\'));
    }

    @Test
    public void isQuoteChar_givenMatchingChar_shouldReturnTrue() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withQuoteChar('"'));

        // Act & Assert
        assertTrue(lexer.isQuoteChar('"'));
    }

    @Test
    public void isQuoteChar_givenNonMatchingChar_shouldReturnFalse() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withQuoteChar('"'));

        // Act & Assert
        assertFalse(lexer.isQuoteChar('\''));
        assertFalse(lexer.isQuoteChar('a'));
    }

    @Test
    public void isQuoteChar_givenDisabledQuoteChar_shouldReturnTrueOnlyForDisabledChar() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withQuoteChar((Character) null));

        // Act & Assert
        assertTrue(lexer.isQuoteChar(DISABLED));
        assertFalse(lexer.isQuoteChar('"'));
    }

    @Test
    public void isCommentStart_givenMatchingChar_shouldReturnTrue() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withCommentStart('#'));

        // Act & Assert
        assertTrue(lexer.isCommentStart('#'));
    }

    @Test
    public void isCommentStart_givenNonMatchingChar_shouldReturnFalse() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withCommentStart('#'));

        // Act & Assert
        assertFalse(lexer.isCommentStart(';'));
        assertFalse(lexer.isCommentStart('a'));
    }

    @Test
    public void isCommentStart_givenDisabledCommentStart_shouldReturnTrueOnlyForDisabledChar() {
        // Arrange
        final ConcreteTestLexer lexer = createLexer("", CSVFormat.DEFAULT.withCommentStart((Character) null));

        // Act & Assert
        assertTrue(lexer.isCommentStart(DISABLED));
        assertFalse(lexer.isCommentStart('#'));
    }
}