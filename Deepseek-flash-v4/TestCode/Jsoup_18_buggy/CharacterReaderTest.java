package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;

public class CharacterReaderTest {
    private CharacterReader reader;

    @Before
    public void setUp() {
        reader = new CharacterReader("Hello World 123");
    }

    @Test
    public void testPosInitial() {
        assertEquals(0, reader.pos());
    }

    @Test
    public void testIsEmptyOnEmptyReader() {
        CharacterReader emptyReader = new CharacterReader("");
        assertTrue(emptyReader.isEmpty());
    }

    @Test
    public void testIsEmptyAfterConsumingAll() {
        reader.consumeToEnd();
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testIsEmptyOnNonEmptyReader() {
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testCurrentWithContent() {
        assertEquals('H', reader.current());
    }

    @Test
    public void testCurrentAtEnd() {
        CharacterReader endReader = new CharacterReader("");
        assertEquals(CharacterReader.EOF, endReader.current());
    }

    @Test
    public void testConsumeNextChar() {
        assertEquals('H', reader.consume());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testConsumeAtEnd() {
        CharacterReader endReader = new CharacterReader("");
        assertEquals(CharacterReader.EOF, endReader.consume());
    }

    @Test
    public void testConsumeMultipleChars() {
        assertEquals('H', reader.consume());
        assertEquals('e', reader.consume());
        assertEquals('l', reader.consume());
        assertEquals(3, reader.pos());
    }

    @Test
    public void testUnconsume() {
        reader.consume();
        reader.consume();
        reader.unconsume();
        assertEquals(1, reader.pos());
        assertEquals('e', reader.current());
    }

    @Test
    public void testAdvance() {
        reader.consume();
        reader.advance();
        assertEquals(2, reader.pos());
    }

    @Test
    public void testMarkAndRewindToMark() {
        reader.consume();
        reader.consume();
        reader.mark();
        reader.consume();
        reader.consume();
        reader.rewindToMark();
        assertEquals(2, reader.pos());
        assertEquals('l', reader.current());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testConsumeAsStringAtEnd() {
        CharacterReader endReader = new CharacterReader("");
        endReader.consumeAsString();
    }

    @Test
    public void testConsumeAsStringSingleChar() {
        CharacterReader testReader = new CharacterReader("abc");
        assertEquals("a", testReader.consumeAsString());
        assertEquals(1, testReader.pos());
    }

    @Test
    public void testConsumeToStringFound() {
        CharacterReader testReader = new CharacterReader("hello world");
        assertEquals("hello", testReader.consumeTo(" "));
        assertEquals(5, testReader.pos());
    }

    @Test
    public void testConsumeToStringNotFound() {
        CharacterReader testReader = new CharacterReader("hello world");
        assertEquals("hello world", testReader.consumeTo(","));
        assertTrue(testReader.isEmpty());
    }

    @Test
    public void testConsumeToStringEmptySeq() {
        CharacterReader testReader = new CharacterReader("abc");
        assertEquals("", testReader.consumeTo(""));
    }

    @Test
    public void testConsumeToStringImmediateMatch() {
        CharacterReader testReader = new CharacterReader("abc");
        assertEquals("", testReader.consumeTo("a"));
        assertEquals(0, testReader.pos());
    }

    @Test
    public void testConsumeToSeqFound() {
        CharacterReader testReader = new CharacterReader("hello, world");
        assertEquals("hello", testReader.consumeTo(", w"));
        assertEquals(5, testReader.pos());
    }

    @Test
    public void testConsumeToSeqNotFound() {
        CharacterReader testReader = new CharacterReader("hello");
        assertEquals("hello", testReader.consumeTo("xyz"));
        assertTrue(testReader.isEmpty());
    }

    @Test
    public void testConsumeToFirstCharMatch() {
        CharacterReader testReader = new CharacterReader("a");
        assertEquals("", testReader.consumeTo("a"));
        assertEquals(0, testReader.pos());
    }

    @Test
    public void testConsumeToMiddleMatch() {
        CharacterReader testReader = new CharacterReader("abab");
        assertEquals("ab", testReader.consumeTo("ab"));
        assertEquals(2, testReader.pos());
    }

    @Test
    public void testConsumeToAnyMatchingFirst() {
        CharacterReader testReader = new CharacterReader("abc");
        String result = testReader.consumeToAny('b', 'd');
        assertEquals("a", result);
        assertEquals(1, testReader.pos());
    }

    @Test
    public void testConsumeToAnyMatchingLast() {
        CharacterReader testReader = new CharacterReader("abcd");
        String result = testReader.consumeToAny('d', 'e');
        assertEquals("abc", result);
        assertEquals(3, testReader.pos());
    }

    @Test
    public void testConsumeToAnyNoMatch() {
        CharacterReader testReader = new CharacterReader("abc");
        String result = testReader.consumeToAny('d', 'e');
        assertEquals("abc", result);
        assertEquals(3, testReader.pos());
    }

    @Test
    public void testConsumeToAnyImmediateMatch() {
        CharacterReader testReader = new CharacterReader("abc");
        String result = testReader.consumeToAny('a');
        assertEquals("", result);
        assertEquals(0, testReader.pos());
    }

    @Test
    public void testConsumeToAnyEmptySeq() {
        CharacterReader testReader = new CharacterReader("abc");
        String result = testReader.consumeToAny();
        assertEquals("", result);
        assertEquals(0, testReader.pos());
    }

    @Test
    public void testConsumeToAnyAtEnd() {
        CharacterReader testReader = new CharacterReader("");
        String result = testReader.consumeToAny('a');
        assertEquals("", result);
        assertEquals(0, testReader.pos());
    }

    @Test
    public void testConsumeToEndWithContent() {
        CharacterReader testReader = new CharacterReader("hello");
        String result = testReader.consumeToEnd();
        assertEquals("hell", result);
        assertEquals(5, testReader.pos());
    }

    @Test
    public void testConsumeToEndAtCurrentPosition() {
        CharacterReader testReader = new CharacterReader("hello");
        testReader.consume();
        String result = testReader.consumeToEnd();
        assertEquals("ell", result);
        assertEquals(5, testReader.pos());
    }

    @Test
    public void testConsumeToEndAtLastChar() {
        CharacterReader testReader = new CharacterReader("hi");
        testReader.consumeToEnd();
        testReader.consume();
        testReader.consumeToEnd();
        assertEquals(2, testReader.pos());
    }

    @Test
    public void testConsumeLetterSequenceOnlyLetters() {
        CharacterReader testReader = new CharacterReader("abc123");
        String result = testReader.consumeLetterSequence();
        assertEquals("abc", result);
        assertEquals(3, testReader.pos());
    }

    @Test
    public void testConsumeLetterSequenceNoLetters() {
        CharacterReader testReader = new CharacterReader("123");
        String result = testReader.consumeLetterSequence();
        assertEquals("", result);
        assertEquals(0, testReader.pos());
    }

    @Test
    public void testConsumeLetterSequenceStartsWithNonLetter() {
        CharacterReader testReader = new CharacterReader("1abc");
        String result = testReader.consumeLetterSequence();
        assertEquals("", result);
        assertEquals(0, testReader.pos());
    }

    @Test
    public void testConsumeHexSequence() {
        CharacterReader testReader = new CharacterReader("abc123def");
        String result = testReader.consumeHexSequence();
        assertEquals("abc123def", result);
        assertEquals(9, testReader.pos());
    }

    @Test
    public void testConsumeHexSequenceWithUppercase() {
        CharacterReader testReader = new CharacterReader("ABC012xyz");
        String result = testReader.consumeHexSequence();
        assertEquals("ABC012", result);
        assertEquals(6, testReader.pos());
    }

    @Test
    public void testConsumeHexSequenceNoHex() {
        CharacterReader testReader = new CharacterReader("xyz");
        String result = testReader.consumeHexSequence();
        assertEquals("", result);
        assertEquals(0, testReader.pos());
    }

    @Test
    public void testConsumeDigitSequence() {
        CharacterReader testReader = new CharacterReader("123abc");
        String result = testReader.consumeDigitSequence();
        assertEquals("123", result);
        assertEquals(3, testReader.pos());
    }

    @Test
    public void testConsumeDigitSequenceNoDigits() {
        CharacterReader testReader = new CharacterReader("abc");
        String result = testReader.consumeDigitSequence();
        assertEquals("", result);
        assertEquals(0, testReader.pos());
    }

    @Test
    public void testConsumeDigitSequencePartial() {
        CharacterReader testReader = new CharacterReader("12a34");
        String result = testReader.consumeDigitSequence();
        assertEquals("12", result);
        assertEquals(2, testReader.pos());
    }

    @Test
    public void testMatchesCharacter() {
        assertTrue(reader.matches('H'));
    }

    @Test
    public void testMatchesCharacterFalse() {
        assertFalse(reader.matches('x'));
    }

    @Test
    public void testMatchesCharacterAtEnd() {
        CharacterReader testReader = new CharacterReader("");
        assertFalse(testReader.matches('a'));
    }

    @Test
    public void testMatchesSequence() {
        CharacterReader testReader = new CharacterReader("hello");
        assertTrue(testReader.matches("hell"));
    }

    @Test
    public void testMatchesSequenceFalse() {
        CharacterReader testReader = new CharacterReader("hello");
        assertFalse(testReader.matches("ell"));
    }

    @Test
    public void testMatchesSequenceAtEnd() {
        CharacterReader testReader = new CharacterReader("hi");
        testReader.consumeToEnd();
        assertFalse(testReader.matches("hi"));
    }

    @Test
    public void testMatchesIgnoreCase() {
        CharacterReader testReader = new CharacterReader("Hello");
        assertTrue(testReader.matchesIgnoreCase("hello"));
    }

    @Test
    public void testMatchesIgnoreCaseWithMixedContent() {
        CharacterReader testReader = new CharacterReader("AbC123");
        assertTrue(testReader.matchesIgnoreCase("aBc"));
    }

    @Test
    public void testMatchesIgnoreCaseWithLongerSeq() {
        CharacterReader testReader = new CharacterReader("abcd");
        assertFalse(testReader.matchesIgnoreCase("abcde"));
    }

    @Test
    public void testMatchesIgnoreCaseAtEnd() {
        CharacterReader testReader = new CharacterReader("x");
        assertTrue(testReader.matchesIgnoreCase("X"));
    }

    @Test
    public void testMatchesAnyWithMatch() {
        assertTrue(reader.matchesAny('x', 'H'));
    }

    @Test
    public void testMatchesAnyNoMatch() {
        assertFalse(reader.matchesAny('x', 'y'));
    }

    @Test
    public void testMatchesAnyAtEnd() {
        CharacterReader testReader = new CharacterReader("");
        assertFalse(testReader.matchesAny('a'));
    }

    @Test
    public void testMatchesAnyEmptyVarArgs() {
        assertFalse(reader.matchesAny());
    }

    @Test
    public void testMatchesLetterWithLetter() {
        assertTrue(reader.matchesLetter());
    }

    @Test
    public void testMatchesLetterWithDigit() {
        CharacterReader testReader = new CharacterReader("1abc");
        assertFalse(testReader.matchesLetter());
    }

    @Test
    public void testMatchesLetterAtEnd() {
        CharacterReader testReader = new CharacterReader("");
        assertFalse(testReader.matchesLetter());
    }

    @Test
    public void testMatchesLetterWithUppercase() {
        CharacterReader testReader = new CharacterReader("AbC");
        assertTrue(testReader.matchesLetter());
    }

    @Test
    public void testMatchesDigitWithDigit() {
        CharacterReader testReader = new CharacterReader("123");
        assertTrue(testReader.matchesDigit());
    }

    @Test
    public void testMatchesDigitWithLetter() {
        CharacterReader testReader = new CharacterReader("abc");
        assertFalse(testReader.matchesDigit());
    }

    @Test
    public void testMatchesDigitAtEnd() {
        CharacterReader testReader = new CharacterReader("");
        assertFalse(testReader.matchesDigit());
    }

    @Test
    public void testMatchConsumeTrue() {
        CharacterReader testReader = new CharacterReader("hello world");
        assertTrue(testReader.matchConsume("hello"));
        assertEquals(5, testReader.pos());
    }

    @Test
    public void testMatchConsumeFalse() {
        CharacterReader testReader = new CharacterReader("hello world");
        assertFalse(testReader.matchConsume("world"));
        assertEquals(0, testReader.pos());
    }

    @Test
    public void testMatchConsumeAtEnd() {
        CharacterReader testReader = new CharacterReader("");
        assertFalse(testReader.matchConsume("a"));
    }

    @Test
    public void testMatchConsumeIgnoreCaseTrue() {
        CharacterReader testReader = new CharacterReader("Hello");
        assertTrue(testReader.matchConsumeIgnoreCase("hello"));
        assertEquals(5, testReader.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCaseFalse() {
        CharacterReader testReader = new CharacterReader("Hello");
        assertFalse(testReader.matchConsumeIgnoreCase("world"));
        assertEquals(0, testReader.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCaseAtEnd() {
        CharacterReader testReader = new CharacterReader("");
        assertFalse(testReader.matchConsumeIgnoreCase("a"));
    }

    @Test
    public void testContainsIgnoreCaseLowercase() {
        CharacterReader testReader = new CharacterReader("...</html>...");
        assertTrue(testReader.containsIgnoreCase("</html>"));
    }

    @Test
    public void testContainsIgnoreCaseUppercase() {
        CharacterReader testReader = new CharacterReader("...<HTML>...");
        assertTrue(testReader.containsIgnoreCase("<html>"));
    }

    @Test
    public void testContainsIgnoreCaseNotFound() {
        CharacterReader testReader = new CharacterReader("abc");
        assertFalse(testReader.containsIgnoreCase("def"));
    }

    @Test
    public void testContainsIgnoreCaseAtEnd() {
        CharacterReader testReader = new CharacterReader("hello");
        assertTrue(testReader.containsIgnoreCase("hello"));
    }

    @Test
    public void testContainsIgnoreCaseAtPosition() {
        CharacterReader testReader = new CharacterReader("xxhello");
        testReader.consumeTo('h');
        assertTrue(testReader.containsIgnoreCase("ello"));
    }

    @Test
    public void testToStringWithContent() {
        CharacterReader testReader = new CharacterReader("hello");
        assertEquals("hello", testReader.toString());
    }

    @Test
    public void testToStringAfterConsumingSome() {
        CharacterReader testReader = new CharacterReader("hello");
        testReader.consume();
        testReader.consume();
        assertEquals("llo", testReader.toString());
    }

    @Test
    public void testToStringAtEnd() {
        CharacterReader testReader = new CharacterReader("");
        assertEquals("", testReader.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testUnconsumeAtStart() {
        reader.unconsume();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testConsumeStringInvalidLength() {
        CharacterReader testReader = new CharacterReader("");
        testReader.consumeAsString();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testConsumeToEndOnEmptyString() {
        CharacterReader testReader = new CharacterReader("");
        testReader.consumeToEnd();
    }

    @Test
    public void testConsumeToEndOnNonEmptyString() {
        CharacterReader testReader = new CharacterReader("hello");
        testReader.consumeToEnd();
        assertTrue(testReader.isEmpty());
    }

    @Test
    public void testConsumeToEndOnLastChar() {
        CharacterReader testReader = new CharacterReader("hello");
        testReader.consume();
        testReader.consumeToEnd();
        assertTrue(testReader.isEmpty());
    }

    @Test
    public void testConsumeToEndOnSingleChar() {
        CharacterReader testReader = new CharacterReader("a");
        testReader.consumeToEnd();
        testReader.consumeToEnd();
        assertTrue(testReader.isEmpty());
    }

    @Test
    public void testConsumeToEndAfterAll() {
        CharacterReader testReader = new CharacterReader("ab");
        testReader.consumeToEnd();
        testReader.consumeToEnd();
        assertTrue(testReader.isEmpty());
    }

    @Test
    public void testConsumeToEndWhenPosAtLengthMinus1() {
        CharacterReader testReader = new CharacterReader("ab");
        testReader.consume();
        testReader.consumeToEnd();
        assertTrue(testReader.isEmpty());
    }

    @Test
    public void testConsumeToEndWhenPosAtLength() {
        CharacterReader testReader = new CharacterReader("ab");
        testReader.consume();
        testReader.consume();
        testReader.consumeToEnd();
        assertTrue(testReader.isEmpty());
    }

    @Test
    public void testConsumeToEndNoConsume() {
        CharacterReader testReader = new CharacterReader("");
        testReader.consumeToEnd();
        assertTrue(testReader.isEmpty());
    }

    @Test
    public void testConsumeToEndMulti() {
        CharacterReader testReader = new CharacterReader("abcd");
        testReader.consumeToEnd();
        assertEquals(4, testReader.pos());
    }

    @Test
    public void testConsumeToEndWithContentAfterPos() {
        CharacterReader testReader = new CharacterReader("hello world");
        testReader.consumeToEnd();
        assertEquals(11, testReader.pos());
    }

}