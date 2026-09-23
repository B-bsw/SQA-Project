package org.jsoup.parser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CharacterReaderTest {
    private CharacterReader reader;

    @Before
    public void setUp() {
        reader = new CharacterReader("Hello, World! 123");
    }

    @Test
    public void testPosInitial() {
        assertEquals(0, reader.pos());
    }

    @Test
    public void testIsEmptyWhenEmpty() {
        assertTrue(new CharacterReader("").isEmpty());
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testCurrentAndConsume() {
        assertEquals('H', reader.current());
        assertEquals('H', reader.consume());
        assertEquals('e', reader.current());
        assertEquals('e', reader.consume());
        assertEquals(2, reader.pos());
    }

    @Test
    public void testCurrentEOF() {
        CharacterReader empty = new CharacterReader("");
        assertEquals(CharacterReader.EOF, empty.current());
    }

    @Test
    public void testUnconsumeAndAdvance() {
        reader.advance();
        assertEquals(1, reader.pos());
        reader.unconsume();
        assertEquals(0, reader.pos());
    }

    @Test
    public void testMarkAndRewindToMark() {
        reader.consume();
        reader.consume();
        int pos = reader.pos();
        reader.mark();
        reader.consume();
        assertTrue(reader.pos() > pos);
        reader.rewindToMark();
        assertEquals(pos, reader.pos());
    }

    @Test
    public void testConsumeAsString() {
        assertEquals("H", reader.consumeAsString());
        assertEquals("e", reader.consumeAsString());
        assertEquals(2, reader.pos());
    }

    @Test
    public void testNextIndexOfCharFound() {
        assertEquals(1, reader.nextIndexOf('e'));
        assertEquals(6, reader.nextIndexOf('W'));
    }

    @Test
    public void testNextIndexOfCharNotFound() {
        assertEquals(-1, reader.nextIndexOf('z'));
        assertEquals(-1, new CharacterReader("").nextIndexOf('a'));
    }

    @Test
    public void testNextIndexOfCharAtCurrentPos() {
        assertEquals(0, reader.nextIndexOf('H'));
    }

    @Test
    public void testNextIndexOfSequenceFound() {
        assertEquals(1, reader.nextIndexOf("ell"));
        assertEquals(7, reader.nextIndexOf("Wor"));
    }

    @Test
    public void testNextIndexOfSequenceNotFound() {
        assertEquals(-1, reader.nextIndexOf("xyz"));
        assertEquals(-1, reader.nextIndexOf(""));
    }

    @Test
    public void testNextIndexOfSequenceAtEnd() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals(0, r.nextIndexOf("abc"));
        assertEquals(-1, r.nextIndexOf("abcd"));
    }

    @Test
    public void testAndConsumeToCharFound() {
        CharacterReader r = new CharacterReader("Hello, World");
        assertEquals("Hell", r.consumeTo('o'));
        assertEquals(4, r.pos());
    }

    @Test
    public void testConsumeToCharNotFound() {
        CharacterReader r = new CharacterReader("Hello");
        assertEquals("Hello", r.consumeTo('z'));
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConsumeToSequenceFound() {
        CharacterReader r = new CharacterReader("Hello, World");
        assertEquals("Hello, ", r.consumeTo("World"));
        assertEquals(7, r.pos());
    }

    @Test
    public void testConsumeToSequenceNotFound() {
        CharacterReader r = new CharacterReader("Hello");
        assertEquals("Hello", r.consumeTo("xyz"));
    }

    @Test
    public void testConsumeToAnyImmediate() {
        CharacterReader r = new CharacterReader("abc<def");
        assertEquals("", r.consumeToAny('<'));
        assertEquals(0, r.pos());
    }

    @Test
    public void testConsumeToAny() {
        CharacterReader r = new CharacterReader("abc<def");
        assertEquals("abc", r.consumeToAny('<', '>'));
        assertEquals(3, r.pos());
    }

    @Test
    public void testConsumeToAnyNotFound() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abcdef", r.consumeToAny('<', '>'));
    }

    @Test
    public void testConsumeToAnySortedHigherThanN() {
        char[] chars = new char[]{'<', '>'};
        CharacterReader r = new CharacterReader("abc<def");
        assertEquals("abc", r.consumeToAnySorted(chars));
    }

    @Test
    public void testConsumeData() {
        CharacterReader r = new CharacterReader("abc<def&ghi\0jkl");
        assertEquals("abc", r.consumeData());
        assertEquals(3, r.pos());
        r.advance(); // consume '<'
        assertEquals("def", r.consumeData());
        r.advance(); // consume '&'
        assertEquals("ghi", r.consumeData());
        r.advance(); // consume '\0'
        assertEquals("jkl", r.consumeData());
    }

    @Test
    public void testConsumeDataNoSpecial() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abcdef", r.consumeData());
    }

    @Test
    public void testConsumeTagName() {
        CharacterReader r = new CharacterReader("tagName  >extra");
        assertEquals("tagName", r.consumeTagName());
        assertEquals(7, r.pos());
    }

    @Test
    public void testConsumeTagNameWithSpecials() {
        CharacterReader r = new CharacterReader("div\tclass");
        assertEquals("div", r.consumeTagName());
        assertEquals(3, r.pos());
    }

    @Test
    public void testConsumeToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abcdef", r.consumeToEnd());
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConsumeLetterSequence() {
        CharacterReader r = new CharacterReader("abc123");
        assertEquals("abc", r.consumeLetterSequence());
        assertEquals(3, r.pos());
    }

    @Test
    public void testConsumeLetterSequenceOnlyLetters() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals("abc", r.consumeLetterSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequence() {
        CharacterReader r = new CharacterReader("abc123def");
        assertEquals("abc123", r.consumeLetterThenDigitSequence());
        assertEquals(6, r.pos());
    }

    @Test
    public void testConsumeLetterThenDigitSequenceNoDigits() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals("abc", r.consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeHexSequence() {
        CharacterReader r = new CharacterReader("1aF3bc");
        assertEquals("1aF3bc", r.consumeHexSequence());
    }

    @Test
    public void testConsumeHexSequenceNonHex() {
        CharacterReader r = new CharacterReader("12G");
        assertEquals("12", r.consumeHexSequence());
    }

    @Test
    public void testConsumeDigitSequence() {
        CharacterReader r = new CharacterReader("123abc");
        assertEquals("123", r.consumeDigitSequence());
    }

    @Test
    public void testMatchChar() {
        assertTrue(reader.matches('H'));
        assertFalse(reader.matches('h'));
        CharacterReader empty = new CharacterReader("");
        assertFalse(empty.matches('a'));
    }

    @Test
    public void testMatchesSequence() {
        assertTrue(reader.matches("Hello"));
        assertTrue(reader.matches("He"));
        assertFalse(reader.matches("Hx"));
        assertFalse(reader.matches("Hello, World! 123x"));
    }

    @Test
    public void testMatchesIgnoreCase() {
        assertTrue(reader.matchesIgnoreCase("hello"));
        assertTrue(reader.matchesIgnoreCase("HELLO"));
        assertFalse(reader.matchesIgnoreCase("helx"));
        assertFalse(reader.matchesIgnoreCase("hello, world! 1234"));
    }

    @Test
    public void testMatchesAny() {
        assertTrue(reader.matchesAny('x', 'H'));
        assertFalse(reader.matchesAny('x', 'y'));
        CharacterReader empty = new CharacterReader("");
        assertFalse(empty.matchesAny('a'));
    }

    @Test
    public void testMatchesAnySorted() {
        char[] chars = new char[]{'y', 'H'};
        assertTrue(reader.matchesAnySorted(chars));
        char[] notFound = new char[]{'x', 'z'};
        assertFalse(reader.matchesAnySorted(notFound));
        CharacterReader empty = new CharacterReader("");
        assertFalse(empty.matchesAnySorted(chars));
    }

    @Test
    public void testMatchesLetter() {
        assertTrue(reader.matchesLetter());
        CharacterReader r = new CharacterReader("1a");
        assertFalse(r.matchesLetter());
        CharacterReader empty = new CharacterReader("");
        assertFalse(empty.matchesLetter());
    }

    @Test
    public void testMatchesDigit() {
        CharacterReader r = new CharacterReader("123");
        assertTrue(r.matchesDigit());
        CharacterReader notDigit = new CharacterReader("a");
        assertFalse(notDigit.matchesDigit());
        CharacterReader empty = new CharacterReader("");
        assertFalse(empty.matchesDigit());
    }

    @Test
    public void testMatchConsume() {
        CharacterReader r = new CharacterReader("abcdef");
        assertTrue(r.matchConsume("abc"));
        assertEquals(3, r.pos());
        assertFalse(r.matchConsume("x"));
        assertEquals(3, r.pos());
    }

    @Test
    public void testMatchConsumeFalseWithMoreSeq() {
        CharacterReader r = new CharacterReader("ab");
        assertFalse(r.matchConsume("abc"));
    }

    @Test
    public void testMatchConsumeIgnoreCase() {
        CharacterReader r = new CharacterReader("ABCdef");
        assertTrue(r.matchConsumeIgnoreCase("abc"));
        assertEquals(3, r.pos());
        assertFalse(r.matchConsumeIgnoreCase("x"));
    }

    @Test
    public void testContainsIgnoreCase() {
        assertTrue(reader.containsIgnoreCase("world"));
        assertTrue(reader.containsIgnoreCase("WORLD"));
        assertTrue(reader.containsIgnoreCase("LO,"));
        assertFalse(reader.containsIgnoreCase("notthere"));
    }

    @Test
    public void testToString() {
        assertEquals("Hello, World! 123", reader.toString());
        reader.consumeTo('o');
        assertEquals(" World! 123", reader.toString());
    }

    @Test
    public void testCacheStringShort() {
        CharacterReader r = new CharacterReader("abcdefghijklmnop");  // 16 chars
        assertEquals("abcd", r.consumeTo("e"));
        assertEquals("abcd", r.toString());
    }

    @Test
    public void testCacheStringLengthExceedsMax() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) sb.append('a');
        CharacterReader r = new CharacterReader(sb.toString());
        assertEquals(sb.toString(), r.consumeToEnd());
    }

    @Test
    public void testRangeEqualsExact() {
        CharacterReader r = new CharacterReader("hello world");
        assertTrue(r.rangeEquals(0, 5, "hello"));
        assertTrue(r.rangeEquals(6, 5, "world"));
    }

    @Test
    public void testRangeEqualsWrongLength() {
        CharacterReader r = new CharacterReader("hello");
        assertFalse(r.rangeEquals(0, 4, "hell"));
        assertFalse(r.rangeEquals(0, 5, "helloo"));
    }

    @Test
    public void testNullInput() {
        try {
            new CharacterReader(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testEmptyCacheString() {
        CharacterReader r = new CharacterReader("");
        assertEquals("", r.consumeToEnd());
    }
}