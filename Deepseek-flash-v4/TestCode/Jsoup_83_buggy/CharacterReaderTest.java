package org.jsoup.parser;

import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

public class CharacterReaderTest {

    private static CharacterReader reader(String input) {
        return new CharacterReader(input);
    }

    private static class UnsupportedMarkReader extends Reader {
        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            return -1;
        }

        @Override
        public void close() throws IOException {
        }

        @Override
        public boolean markSupported() {
            return false;
        }
    }

    @Test(expected = NullPointerException.class)
    public void constructorNullReaderThrows() {
        new CharacterReader((Reader) null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorUnsupportedMarkThrows() {
        new CharacterReader(new UnsupportedMarkReader(), 10);
    }

    @Test
    public void emptyReaderReportsEmpty() {
        CharacterReader r = reader("");
        assertTrue(r.isEmpty());
        assertEquals(0, r.pos());
        assertTrue(CharacterReader.EOF == r.current());
        assertTrue(CharacterReader.EOF == r.consume());
    }

    @Test
    public void positionAndIsEmptyTrackConsumption() {
        CharacterReader r = reader("abc");
        assertFalse(r.isEmpty());
        assertEquals(0, r.pos());

        r.advance();
        assertEquals(1, r.pos());

        r.unconsume();
        assertEquals(0, r.pos());

        r.consume();
        r.consume();
        assertEquals(2, r.pos());
        assertFalse(r.isEmpty());

        r.consume();
        assertTrue(r.isEmpty());
        assertEquals(3, r.pos());
    }

    @Test
    public void markAndRewindRestorePosition() {
        CharacterReader r = reader("abcd");
        r.advance();
        r.mark();
        r.advance();
        r.advance();
        assertEquals(3, r.pos());

        r.rewindToMark();
        assertEquals(1, r.pos());
    }

    @Test
    public void consumeReadsCurrentAndAdvances() {
        CharacterReader r = reader("abc");
        assertEquals('a', r.consume());
        assertEquals('b', r.current());
        assertEquals('c', r.consume());
        assertTrue(CharacterReader.EOF == r.consume());
    }

    @Test
    public void nextIndexOfCharFindsRelativeOffset() {
        CharacterReader r = reader("abcab");
        assertEquals(1, r.nextIndexOf('b'));

        r.consume();
        assertEquals(0, r.nextIndexOf('b'));
        assertEquals(-1, r.nextIndexOf('z'));
    }

    @Test
    public void nextIndexOfSequenceFindsRelativeOffset() {
        CharacterReader r = reader("abcdab");
        assertEquals(2, r.nextIndexOf("cd"));

        r.consume();
        assertEquals(2, r.nextIndexOf("da"));
        assertEquals(-1, r.nextIndexOf("zz"));
        assertEquals(-1, r.nextIndexOf("abcdab!"));
    }

    @Test
    public void consumeToCharReadsUpToDelimiter() {
        CharacterReader r = reader("abc def");
        assertEquals("abc", r.consumeTo(' '));
        assertEquals(' ', r.current());

        r.consume();
        assertEquals("def", r.consumeTo(' '));
        assertTrue(r.isEmpty());
    }

    @Test
    public void consumeToCharWhenNoDelimiterReadsToEnd() {
        CharacterReader r = reader("abcdef");
        assertEquals("abcdef", r.consumeTo('x'));
        assertTrue(r.isEmpty());
    }

    @Test
    public void consumeToStringReadsUpToSequence() {
        CharacterReader r = reader("abcd");
        assertEquals("abc", r.consumeTo("d"));
        assertEquals('d', r.current());

        CharacterReader r2 = reader("abc");
        assertEquals("abc", r2.consumeTo("zz"));

        CharacterReader r3 = reader("abc");
        r3.consume();
        assertEquals("", r3.consumeTo("b"));
    }

    @Test
    public void consumeToAnyReadsUpToFirstDelimiter() {
        CharacterReader r = reader("abc&def");
        assertEquals("abc", r.consumeToAny('&', '<'));
        assertEquals('&', r.current());

        CharacterReader r2 = reader("abcdef");
        assertEquals("abcdef", r2.consumeToAny('x', 'y'));

        CharacterReader r3 = reader("abc");
        r3.advance();
        assertEquals("", r3.consumeToAny('b'));
    }

    @Test
    public void consumeToAnySortedReadsUsingBinarySearch() {
        CharacterReader r = reader("abc&def");
        assertEquals("abc", r.consumeToAnySorted('&', '<'));
        assertEquals('&', r.current());

        CharacterReader r2 = reader("abc");
        assertEquals("abc", r2.consumeToAnySorted('d', 'e'));

        CharacterReader r3 = reader("abc");
        assertEquals("", r3.consumeToAnySorted('a', 'b'));
    }

    @Test
    public void consumeDataStopsAtMarkupChars() {
        CharacterReader r = reader("abc<def");
        assertEquals("abc", r.consumeData());
        assertEquals('<', r.current());

        CharacterReader r2 = reader("&amp;");
        assertEquals("", r2.consumeData());
        assertEquals('&', r2.current());

        CharacterReader r3 = reader("abc");
        assertEquals("abc", r3.consumeData());
    }

    @Test
    public void consumeTagNameStopsAtTagDelimiters() {
        CharacterReader r = reader("div.class>span");
        assertEquals("div.class", r.consumeTagName());
        assertEquals('>', r.current());

        CharacterReader r2 = reader("br/");
        assertEquals("br", r2.consumeTagName());
        assertEquals('/', r2.current());
    }

    @Test
    public void consumeToEndReadsAllRemaining() {
        CharacterReader r = reader("abc");
        assertEquals("abc", r.consumeToEnd());
        assertTrue(r.isEmpty());
    }

    @Test
    public void letterSequenceReadsAsciiAndUnicodeLetters() {
        CharacterReader r = reader("abc123");
        assertEquals("abc", r.consumeLetterSequence());
        assertEquals('1', r.current());

        CharacterReader r2 = reader("123");
        assertEquals("", r2.consumeLetterSequence());

        CharacterReader r3 = reader("é1");
        assertEquals("é", r3.consumeLetterSequence());
    }

    @Test
    public void letterThenDigitSequenceHandlesLettersDigitsLetters() {
        CharacterReader r = reader("abc123def");
        assertEquals("abc123", r.consumeLetterThenDigitSequence());
        assertEquals('d', r.current());

        CharacterReader r2 = reader("abc");
        assertEquals("abc", r2.consumeLetterThenDigitSequence());
    }

    @Test
    public void hexSequenceReadsHexDigits() {
        CharacterReader r = reader("1aFg");
        assertEquals("1aF", r.consumeHexSequence());
        assertEquals('g', r.current());

        CharacterReader r2 = reader("xyz");
        assertEquals("", r2.consumeHexSequence());
    }

    @Test
    public void digitSequenceReadsDigits() {
        CharacterReader r = reader("123a");
        assertEquals("123", r.consumeDigitSequence());
        assertEquals('a', r.current());

        CharacterReader r2 = reader("abc");
        assertEquals("", r2.consumeDigitSequence());
    }

    @Test
    public void matchesCharAndStringDoNotConsume() {
        CharacterReader r = reader("Abc");
        assertTrue(r.matches('A'));
        assertTrue(r.matches("Ab"));
        assertFalse(r.matches("Ad"));
        assertTrue(r.matches("Ab"));
        assertFalse(r.matches("Abcd"));
    }

    @Test
    public void matchesIgnoreCaseDoesNotConsume() {
        CharacterReader r = reader("Abc");
        assertTrue(r.matchesIgnoreCase("aBc"));
        assertFalse(r.matchesIgnoreCase("abX"));
    }

    @Test
    public void matchesAnyHandlesEmptyAndMatches() {
        CharacterReader r = reader("abc");
        assertTrue(r.matchesAny('x', 'a'));
        assertFalse(r.matchesAny('x', 'y'));

        CharacterReader empty = reader("");
        assertFalse(empty.matchesAny('a'));
    }

    @Test
    public void matchesAnySortedUsesBinarySearch() {
        CharacterReader r = reader("abc");
        assertTrue(r.matchesAnySorted(new char[]{'a', 'b', 'c'}));
        assertFalse(r.matchesAnySorted(new char[]{'d', 'e', 'f'}));
        assertFalse(reader("").matchesAnySorted(new char[]{'a'}));
    }

    @Test
    public void matchesLetterAndDigit() {
        CharacterReader r = reader("a1é");
        assertTrue(r.matchesLetter());
        assertFalse(r.matchesDigit());

        r.consume();
        assertFalse(r.matchesLetter());
        assertTrue(r.matchesDigit());

        r.consume();
        assertTrue(r.matchesLetter());
    }

    @Test
    public void matchConsumeConsumesOnlyOnFullMatch() {
        CharacterReader r = reader("Abc");
        assertTrue(r.matchConsume("Ab"));
        assertEquals(2, r.pos());
        assertFalse(r.matchConsume("Ab"));
        assertTrue(r.matchConsume("c"));
    }

    @Test
    public void matchConsumeIgnoresCaseAndConsumes() {
        CharacterReader r = reader("Abc");
        assertTrue(r.matchConsumeIgnoreCase("aB"));
        assertEquals(2, r.pos());
    }

    @Test
    public void containsIgnoreCaseSearchesForNormalizedVariants() {
        CharacterReader r = reader("Hello WORLD");
        assertTrue(r.containsIgnoreCase("world"));
        assertTrue(r.containsIgnoreCase("WORLD"));

        CharacterReader r2 = reader("hello world");
        assertTrue(r2.containsIgnoreCase("WORLD"));
        assertFalse(r2.containsIgnoreCase("xyz"));
    }

    @Test
    public void toStringReturnsRemainingTail() {
        CharacterReader r = reader("hello");
        r.consumeTo("ll");
        assertEquals("llo", r.toString());
    }

    @Test
    public void rangeEqualsMatchesOrRejectsRanges() {
        char[] buf = "abcabc".toCharArray();
        assertTrue(CharacterReader.rangeEquals(buf, 0, 3, "abc"));
        assertFalse(CharacterReader.rangeEquals(buf, 0, 3, "abd"));
        assertFalse(CharacterReader.rangeEquals(buf, 0, 4, "abc"));
    }

    @Test
    public void bufferUpRefillsFromSmallBuffer() {
        String content = "0123456789abcdefghijklmnopqrstuvwxyz";
        CharacterReader r = new CharacterReader(new StringReader(content), 10);

        StringBuilder sb = new StringBuilder();
        while (!r.isEmpty()) {
            sb.append(r.consume());
        }

        assertEquals(content, sb.toString());
    }
}