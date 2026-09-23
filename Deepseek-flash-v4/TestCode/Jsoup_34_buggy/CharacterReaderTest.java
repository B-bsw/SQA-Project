package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CharacterReaderTest {
    private CharacterReader reader;

    @Before
    public void setUp() {
        reader = new CharacterReader("Hello World 123");
    }

    @Test(expected = NullPointerException.class)
    public void testNullInput() {
        new CharacterReader(null);
    }

    @Test
    public void testPosInitial() {
        assertEquals(0, reader.pos());
    }

    @Test
    public void testIsEmptyAndConsume() {
        assertFalse(reader.isEmpty());
        assertEquals('H', reader.consume());
        assertEquals(1, reader.pos());
        assertEquals("Hello World 123", reader.toString());
        
        CharacterReader emptyReader = new CharacterReader("");
        assertTrue(emptyReader.isEmpty());
        assertEquals(CharacterReader.EOF, emptyReader.current());
        assertEquals(CharacterReader.EOF, emptyReader.consume());
    }

    @Test
    public void testCurrentAndAdvance() {
        assertEquals('H', reader.current());
        reader.advance();
        assertEquals('e', reader.current());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testUnconsumeAndMarkRewind() {
        reader.consume();
        reader.unconsume();
        assertEquals('H', reader.consume());
        
        reader.mark();
        reader.consume(); // consume 'e'
        reader.consume(); // consume 'l'
        reader.rewindToMark();
        assertEquals("ello World 123", reader.consumeToEnd());
    }

    @Test
    public void testConsumeAsString() {
        assertEquals("H", reader.consumeAsString());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testNextIndexOfChar() {
        assertEquals(0, reader.nextIndexOf('H'));
        assertEquals(2, reader.nextIndexOf('l'));
        assertEquals(-1, reader.nextIndexOf('x'));
        
        reader = new CharacterReader("abcabc");
        reader.consume();
        assertEquals(2, reader.nextIndexOf('a'));
    }

    @Test
    public void testNextIndexOfSequence() {
        assertEquals(0, reader.nextIndexOf("Hello"));
        assertEquals(2, reader.nextIndexOf("llo"));
        assertEquals(-1, reader.nextIndexOf("xyz"));
        assertEquals(-1, reader.nextIndexOf(""));
        
        reader = new CharacterReader("aXbXcX");
        assertEquals(1, reader.nextIndexOf("Xb"));
        assertEquals(0, reader.nextIndexOf("aX"));
    }

    @Test
    public void testConsumeTo() {
        assertEquals("He", reader.consumeTo('l'));
        assertEquals("l", reader.consumeTo(' '));
        assertEquals("World", reader.consumeTo(' '));
        assertEquals(" 123", reader.consumeToEnd());
    }

    @Test
    public void testConsumeToSequence() {
        CharacterReader r = new CharacterReader("one two three");
        assertEquals("one", r.consumeTo(" two"));
        assertEquals("two three", r.consumeToEnd());
    }

    @Test
    public void testConsumeToAny() {
        CharacterReader r = new CharacterReader("abcde1234fgh");
        assertEquals("abcde", r.consumeToAny('1', '2', '3'));
        
        r = new CharacterReader("12345");
        assertEquals("", r.consumeToAny('1'));
        assertEquals("12345", r.consumeToEnd());
    }

    @Test
    public void testConsumeToEnd() {
        assertEquals("Hello World 123", reader.consumeToEnd());
        assertTrue(reader.isEmpty());
        assertEquals("", reader.consumeToEnd());
    }

    @Test
    public void testConsumeLetterSequence() {
        CharacterReader r = new CharacterReader("abc123");
        assertEquals("abc", r.consumeLetterSequence());
        assertEquals("123", r.consumeToEnd());
        
        r = new CharacterReader("123abc");
        assertEquals("", r.consumeLetterSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequence() {
        CharacterReader r = new CharacterReader("abc123def");
        assertEquals("abc123", r.consumeLetterThenDigitSequence());
        
        r = new CharacterReader("abc");
        assertEquals("abc", r.consumeLetterThenDigitSequence());
        
        r = new CharacterReader("abc  123");
        assertEquals("abc", r.consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeHexSequence() {
        CharacterReader r = new CharacterReader("abcdef123xyz");
        assertEquals("abcdef123", r.consumeHexSequence());
        
        r = new CharacterReader("xyz");
        assertEquals("", r.consumeHexSequence());
    }

    @Test
    public void testConsumeDigitSequence() {
        CharacterReader r = new CharacterReader("123abc456");
        assertEquals("123", r.consumeDigitSequence());
        
        r = new CharacterReader("abc");
        assertEquals("", r.consumeDigitSequence());
    }

    @Test
    public void testMatchesChar() {
        assertTrue(reader.matches('H'));
        assertFalse(reader.matches('h'));
        
        CharacterReader empty = new CharacterReader("");
        assertFalse(empty.matches('a'));
    }

    @Test
    public void testMatchesString() {
        assertTrue(reader.matches("Hello"));
        assertFalse(reader.matches("World"));
        assertFalse(reader.matches("Hello World 1234")); // too long
    }

    @Test
    public void testMatchesIgnoreCase() {
        assertTrue(reader.matchesIgnoreCase("hello"));
        assertTrue(reader.matchesIgnoreCase("HELLO WORLD 123"));
        assertFalse(reader.matchesIgnoreCase("world"));
        assertFalse(reader.matchesIgnoreCase("Hello World 1234"));
    }

    @Test
    public void testMatchesAny() {
        assertTrue(reader.matchesAny('H', 'x', 'y'));
        assertFalse(reader.matchesAny('x', 'y', 'z'));
        
        CharacterReader empty = new CharacterReader("");
        assertFalse(empty.matchesAny('a'));
    }

    @Test
    public void testMatchesLetter() {
        assertTrue(reader.matchesLetter());
        
        reader = new CharacterReader("1abc");
        assertFalse(reader.matchesLetter());
        
        CharacterReader empty = new CharacterReader("");
        assertFalse(empty.matchesLetter());
    }

    @Test
    public void testMatchesDigit() {
        reader = new CharacterReader("123abc");
        assertTrue(reader.matchesDigit());
        
        reader = new CharacterReader("abc123");
        assertFalse(reader.matchesDigit());
        
        CharacterReader empty = new CharacterReader("");
        assertFalse(empty.matchesDigit());
    }

    @Test
    public void testMatchConsume() {
        assertTrue(reader.matchConsume("Hello"));
        assertEquals(5, reader.pos());
        assertEquals("World 123", reader.toString());
        
        assertFalse(reader.matchConsume("No"));
    }

    @Test
    public void testMatchConsumeIgnoreCase() {
        assertTrue(reader.matchConsumeIgnoreCase("hello"));
        assertEquals(5, reader.pos());
        
        assertFalse(reader.matchConsumeIgnoreCase("no"));
    }

    @Test
    public void testContainsIgnoreCase() {
        assertTrue(reader.containsIgnoreCase("world"));
        assertTrue(reader.containsIgnoreCase("WORLD"));
        assertFalse(reader.containsIgnoreCase("hello world extra"));
    }

    @Test
    public void testComplexScenario() {
        reader.consume(); // H
        int startPos = reader.pos();
        assertEquals("ello World 123", reader.toString());
        
        reader.consumeTo('d');
        assertEquals("12", reader.consumeTo('3'));
        reader.mark();
        assertEquals('3', reader.consume());
        assertEquals(0, reader.nextIndexOf('x'));
    }

    @Test
    public void testMultipleCharactersAndBranches() {
        CharacterReader r = new CharacterReader("aXbXcX");
        
        assertTrue(r.matchConsume("aX"));
        assertEquals(2, r.pos());
        assertTrue(r.matches('b'));
        r.consume();
        assertEquals('X', r.current());
        r.advance();
        assertEquals('c', r.current());
        assertTrue(r.matches("cX"));
        r.consumeToEnd();
        assertTrue(r.isEmpty());
    }

    @Test
    public void testBoundaryConditions() {
        CharacterReader r = new CharacterReader("A");
        assertFalse(r.isEmpty());
        assertEquals('A', r.current());
        assertEquals("A", r.toString());
        r.consume();
        assertTrue(r.isEmpty());
        assertEquals(CharacterReader.EOF, r.current());
        assertEquals(CharacterReader.EOF, r.consume());
        assertEquals(-1, r.nextIndexOf('A'));
        assertEquals("", r.consumeToEnd());
    }
}