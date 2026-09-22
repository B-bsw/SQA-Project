package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CharacterReaderTest {
    private CharacterReader reader;

    @Before
    public void setUp() {
        reader = new CharacterReader("hello world\r\nThis is\ra Test\r\n");
    }

    @Test
    public void testConstructor_NormalizesLineEndings() {
        assertEquals("hello world\nThis is\na Test\n", reader.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullInput() {
        new CharacterReader(null);
    }

    @Test
    public void testPosAndIsEmpty() {
        assertEquals(0, reader.pos());
        assertFalse(reader.isEmpty());
        
        reader = new CharacterReader("");
        assertEquals(0, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testCurrent() {
        assertEquals('h', reader.current());
        reader.advance();
        reader.advance();
        assertEquals('l', reader.current());
        
        reader = new CharacterReader("");
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsume() {
        assertEquals('h', reader.consume());
        assertEquals('e', reader.consume());
        assertEquals(2, reader.pos());
    }

    @Test
    public void testConsume_AtEnd() {
        reader = new CharacterReader("a");
        reader.consume();
        assertEquals(CharacterReader.EOF, reader.consume());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testUnconsumeAndAdvance() {
        reader.advance();
        reader.unconsume();
        assertEquals(0, reader.pos());
        reader.advance();
        reader.advance();
        reader.unconsume();
        assertEquals(1, reader.pos());
    }

    @Test
    public void testMarkAndRewindToMark() {
        reader.advance();
        reader.advance();
        reader.mark();
        reader.advance();
        reader.rewindToMark();
        assertEquals(2, reader.pos());
    }

    @Test
    public void testConsumeAsString() {
        assertEquals("h", reader.consumeAsString());
        assertEquals(1, reader.pos());
        reader.consumeAsString();
        assertEquals("l", reader.consumeAsString());
    }

    @Test
    public void testConsumeTo_Char_Found() {
        assertEquals("hello", reader.consumeTo(' '));
        assertEquals(5, reader.pos());
        assertTrue(reader.matches(' '));
    }

    @Test
    public void testConsumeTo_Char_NotFound() {
        reader.consumeTo(',');
        assertEquals(0, reader.pos());
        reader = new CharacterReader("test");
        assertEquals("test", reader.consumeTo('z'));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeTo_String_Found() {
        reader.consumeTo("wor");
        assertEquals("hello ", reader.consumeTo("wor"));
        assertEquals(6, reader.pos());
    }

    @Test
    public void testConsumeTo_String_NotFound() {
        reader.consumeTo("zzz");
        assertEquals(0, reader.pos());
        assertEquals("hello world\nThis is\na Test\n", reader.consumeTo("nonexistent"));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToAny() {
        assertEquals("hello", reader.consumeToAny(' ', '!'));
        assertEquals(5, reader.pos());
        
        reader = new CharacterReader("abc");
        assertEquals("", reader.consumeToAny('a', 'x'));
    }

    @Test
    public void testConsumeToAny_EmptyInput() {
        reader = new CharacterReader("");
        assertEquals("", reader.consumeToAny('a', 'b'));
    }

    @Test
    public void testConsumeToEnd() {
        reader = new CharacterReader("Test\r\nEnd");
        reader.advance();
        reader.advance();
        assertEquals("st\nEnd", reader.consumeToEnd());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeLetterSequence() {
        assertEquals("hello", reader.consumeLetterSequence());
        assertEquals(5, reader.pos());
        
        reader = new CharacterReader("123abc");
        assertEquals("", reader.consumeLetterSequence());
        assertEquals(0, reader.pos());
    }

    @Test
    public void testConsumeHexSequence() {
        reader = new CharacterReader("1aF2 hello");
        assertEquals("1aF2", reader.consumeHexSequence());
        
        reader = new CharacterReader("xyz");
        assertEquals("", reader.consumeHexSequence());
    }

    @Test
    public void testConsumeDigitSequence() {
        reader = new CharacterReader("12345abc");
        assertEquals("12345", reader.consumeDigitSequence());
        
        reader = new CharacterReader("abc123");
        assertEquals("", reader.consumeDigitSequence());
    }

    @Test
    public void testMatches_Char() {
        assertTrue(reader.matches('h'));
        assertFalse(reader.matches('x'));
        
        reader = new CharacterReader("");
        assertFalse(reader.matches('h'));
    }

    @Test
    public void testMatches_String() {
        assertTrue(reader.matches("hello"));
        assertFalse(reader.matches("world"));
        
        reader = new CharacterReader("");
        assertFalse(reader.matches("abc"));
    }

    @Test
    public void testMatchesIgnoreCase() {
        assertTrue(reader.matchesIgnoreCase("HELLO"));
        assertFalse(reader.matchesIgnoreCase("WORLD"));
    }

    @Test
    public void testMatchesAny() {
        assertTrue(reader.matchesAny('h', 'e'));
        assertFalse(reader.matchesAny('x', 'y'));
        assertTrue(reader.matchesAny('h', 'l'));
        
        reader = new CharacterReader("");
        assertFalse(reader.matchesAny('h'));
    }

    @Test
    public void testMatchesLetter() {
        assertTrue(reader.matchesLetter());
        reader.advance();
        assertTrue(reader.matchesLetter());
        
        reader = new CharacterReader("123abc");
        assertFalse(reader.matchesLetter());
        
        reader = new CharacterReader("");
        assertFalse(reader.matchesLetter());
    }

    @Test
    public void testMatchesDigit() {
        reader = new CharacterReader("123abc");
        assertTrue(reader.matchesDigit());
        reader.advance();
        assertTrue(reader.matchesDigit());
        
        reader = new CharacterReader("abc");
        assertFalse(reader.matchesDigit());
        
        reader = new CharacterReader("");
        assertFalse(reader.matchesDigit());
    }

    @Test
    public void testMatchConsume() {
        assertTrue(reader.matchConsume("hello"));
        assertEquals(5, reader.pos());
        assertFalse(reader.matchConsume("world"));
        
        reader = new CharacterReader("abc");
        assertFalse(reader.matchConsume("x"));
        assertTrue(reader.matchConsume("abc"));
    }

    @Test
    public void testMatchConsumeIgnoreCase() {
        assertTrue(reader.matchConsumeIgnoreCase("HELLO"));
        assertEquals(5, reader.pos());
        assertFalse(reader.matchConsumeIgnoreCase("WORLD"));
        
        reader = new CharacterReader("abc");
        assertTrue(reader.matchConsumeIgnoreCase("ABC"));
    }

    @Test
    public void testContainsIgnoreCase() {
        assertTrue(reader.containsIgnoreCase("WORLD"));
        assertTrue(reader.containsIgnoreCase("THIS"));
        assertFalse(reader.containsIgnoreCase("zzzz"));
    }

    @Test
    public void testConsumeUntilEnd_ConsumesRest() {
        reader = new CharacterReader("test");
        assertEquals("test", reader.consumeToEnd());
        assertTrue(reader.isEmpty());
        assertEquals("", reader.consumeToEnd());
    }
}