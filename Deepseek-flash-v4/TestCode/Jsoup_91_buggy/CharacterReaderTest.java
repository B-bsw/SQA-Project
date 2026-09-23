package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

public class CharacterReaderTest {

    @Test
    public void testEmptyInput() {
        CharacterReader r = new CharacterReader("");
        assertTrue(r.isEmpty());
        assertEquals(CharacterReader.EOF, r.current());
        assertEquals(CharacterReader.EOF, r.consume());
        assertEquals("", r.consumeToEnd());
    }

    @Test
    public void testConstructorBufferSizing() {
        CharacterReader zero = new CharacterReader(new StringReader("abc"), 0);
        assertTrue(zero.isEmpty());
        assertEquals(CharacterReader.EOF, zero.current());

        CharacterReader large = new CharacterReader(new StringReader("abc"), CharacterReader.maxBufferLen + 1);
        assertEquals('a', large.current());
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullReaderThrows() {
        new CharacterReader((Reader) null);
    }

    @Test(expected = NullPointerException.class)
    public void nullStringThrows() {
        new CharacterReader((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void readerWithoutMarkThrows() {
        Reader noMark = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) {
                return -1;
            }

            @Override
            public void close() {
            }
        };
        new CharacterReader(noMark);
    }

    @Test
    public void testConsumeAndAdvance() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals('a', r.current());
        assertEquals('a', r.consume());
        assertEquals('b', r.current());
        r.advance();
        assertEquals('c', r.current());
        r.unconsume();
        assertEquals('b', r.current());
        assertEquals(1, r.pos());
    }

    @Test(expected = UncheckedIOException.class)
    public void unconsumeAtStartThrows() {
        new CharacterReader("a").unconsume();
    }

    @Test
    public void testMarkRewind() {
        CharacterReader r = new CharacterReader("abcd");
        r.consume();
        r.mark();
        r.consume();
        r.consume();
        r.rewindToMark();
        assertEquals('b', r.current());
    }

    @Test(expected = UncheckedIOException.class)
    public void rewindWithoutMarkThrows() {
        new CharacterReader("a").rewindToMark();
    }

    @Test
    public void testNextIndexOf() {
        CharacterReader r = new CharacterReader("abcabc");
        assertEquals(0, r.nextIndexOf('a'));
        assertEquals(1, r.nextIndexOf('b'));
        assertEquals(-1, r.nextIndexOf('z'));
        assertEquals(2, r.nextIndexOf("ca"));
        assertEquals(-1, r.nextIndexOf("zz"));
    }

    @Test
    public void testConsumeTo() {
        CharacterReader r = new CharacterReader("a-b-c");
        assertEquals("a", r.consumeTo('-'));
        assertEquals('-', r.current());
        assertEquals("-b-c", r.consumeTo('z'));
        assertTrue(r.isEmpty());

        CharacterReader r2 = new CharacterReader("abcd");
        assertEquals("ab", r2.consumeTo("cd"));
        assertEquals('c', r2.current());
    }

    @Test
    public void testConsumeToAny() {
        CharacterReader r = new CharacterReader("abc;def");
        assertEquals("abc", r.consumeToAny(';', ','));
        assertEquals(';', r.current());

        CharacterReader atDelimiter = new CharacterReader(";abc");
        assertEquals("", atDelimiter.consumeToAny(';'));
        assertEquals(';', atDelimiter.current());

        CharacterReader noDelim = new CharacterReader("abc");
        assertEquals("abc", noDelim.consumeToAny(';'));
        assertTrue(noDelim.isEmpty());

        CharacterReader sorted = new CharacterReader("abc;def");
        assertEquals("abc", sorted.consumeToAnySorted(new char[]{';', 'x'}));
        assertEquals(';', sorted.current());

        CharacterReader sortedNotFound = new CharacterReader("abcdef");
        assertEquals("abcdef", sortedNotFound.consumeToAnySorted(new char[]{';', 'x'}));
        assertTrue(sortedNotFound.isEmpty());
    }

    @Test
    public void testConsumeDataAndTagName() {
        CharacterReader r = new CharacterReader("abc<def");
        assertEquals("abc", r.consumeData());
        assertEquals('<', r.current());

        CharacterReader r2 = new CharacterReader("div>span");
        assertEquals("div", r2.consumeTagName());
        assertEquals('>', r2.current());

        CharacterReader r3 = new CharacterReader("plain");
        assertEquals("plain", r3.consumeData());
        assertTrue(r3.isEmpty());
    }

    @Test
    public void testConsumeSequences() {
        CharacterReader letters = new CharacterReader("abc123def");
        assertEquals("abc", letters.consumeLetterSequence());
        assertEquals('1', letters.current());

        CharacterReader lettersThenDigits = new CharacterReader("abc123def");
        assertEquals("abc123", lettersThenDigits.consumeLetterThenDigitSequence());
        assertEquals('d', lettersThenDigits.current());

        CharacterReader onlyLetters = new CharacterReader("abc");
        assertEquals("abc", onlyLetters.consumeLetterThenDigitSequence());
        assertTrue(onlyLetters.isEmpty());

        CharacterReader digits = new CharacterReader("123abc");
        assertEquals("123", digits.consumeDigitSequence());
        assertEquals('a', digits.current());

        CharacterReader hex = new CharacterReader("ab12zz");
        assertEquals("ab12", hex.consumeHexSequence());
        assertEquals('z', hex.current());

        CharacterReader noLetters = new CharacterReader("123");
        assertEquals("", noLetters.consumeLetterSequence());
        assertEquals('1', noLetters.current());
    }

    @Test
    public void testMatches() {
        CharacterReader r = new CharacterReader("Ab1");
        assertTrue(r.matches('A'));
        assertTrue(r.matches("Ab"));
        assertTrue(r.matches(""));
        assertFalse(r.matches("Ab1?"));
        assertTrue(r.matchesIgnoreCase("ab"));
        assertTrue(r.matchesAny('x', 'A'));
        assertFalse(r.matchesAny('x', 'y'));
        assertTrue(r.matchesAnySorted(new char[]{'A', 'x'}));
        assertFalse(r.matchesAnySorted(new char[]{'B', 'C'}));
        assertTrue(r.matchesLetter());
        assertFalse(r.matchesDigit());

        r.consume();
        assertTrue(r.matchesLetter());
        assertFalse(r.matchesDigit());

        r.consume();
        assertTrue(r.matchesDigit());
        assertFalse(r.matchesLetter());
    }

    @Test
    public void testMatchConsume() {
        CharacterReader r = new CharacterReader("Abc");
        assertTrue(r.matchConsume("Ab"));
        assertEquals(2, r.pos());
        assertFalse(r.matchConsume("z"));
        assertTrue(r.matchConsumeIgnoreCase("C"));
        assertTrue(r.isEmpty());
    }

    @Test
    public void testContainsIgnoreCase() {
        assertTrue(new CharacterReader("</title>").containsIgnoreCase("TITLE"));
        assertTrue(new CharacterReader("</TITLE>").containsIgnoreCase("title"));
        assertFalse(new CharacterReader("abc").containsIgnoreCase("z"));
    }

    @Test
    public void testConsumeToEndAndToString() {
        CharacterReader r = new CharacterReader("abcd");
        r.consume();
        assertEquals("bcd", r.toString());
        assertEquals("bcd", r.consumeToEnd());
        assertTrue(r.isEmpty());
    }

    @Test
    public void testRangeEquals() {
        char[] chars = {'a', 'b', 'c'};
        assertTrue(CharacterReader.rangeEquals(chars, 0, 3, "abc"));
        assertFalse(CharacterReader.rangeEquals(chars, 0, 3, "abd"));
        assertFalse(CharacterReader.rangeEquals(chars, 0, 2, "abc"));
        assertFalse(CharacterReader.rangeEquals(chars, 0, 3, "ab"));
    }

    @Test
    public void testStringCacheReuse() {
        CharacterReader r = new CharacterReader("a-a");
        String first = r.consumeTo('-');
        assertEquals("a", first);
        r.consume();
        String second = r.consumeToEnd();
        assertEquals("a", second);
        assertSame(first, second);
    }

    @Test
    public void testBufferUpRefill() {
        int readAhead = CharacterReader.maxBufferLen * 3 / 4;
        StringBuilder sb = new StringBuilder(30001);
        for (int i = 0; i < 30000; i++) {
            sb.append('a');
        }
        sb.append('b');

        CharacterReader r = new CharacterReader(sb.toString());
        for (int i = 0; i < readAhead; i++) {
            r.consume();
        }
        assertEquals('a', r.current());
        r.consume();

        String rest = r.consumeToEnd();
        assertEquals(30001 - readAhead - 1, rest.length());
        assertTrue(rest.endsWith("b"));
        assertTrue(r.isEmpty());
    }
}