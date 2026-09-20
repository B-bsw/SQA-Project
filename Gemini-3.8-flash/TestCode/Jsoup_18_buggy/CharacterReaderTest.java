package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullInput_shouldThrowIllegalArgumentException() {
        new CharacterReader(null);
    }

    @Test
    public void pos_givenInitialState_shouldReturnZero() {
        CharacterReader reader = new CharacterReader("abc");
        Assert.assertEquals(0, reader.pos());
    }

    @Test
    public void isEmpty_givenEmptyInput_shouldReturnTrue() {
        CharacterReader reader = new CharacterReader("");
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void isEmpty_givenNonEmptyInput_shouldReturnFalse() {
        CharacterReader reader = new CharacterReader("a");
        Assert.assertFalse(reader.isEmpty());
    }

    @Test
    public void isEmpty_afterConsumingAll_shouldReturnTrue() {
        CharacterReader reader = new CharacterReader("a");
        reader.consume();
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void current_givenNonEmptyReader_shouldReturnCurrentChar() {
        CharacterReader reader = new CharacterReader("abc");
        Assert.assertEquals('a', reader.current());
    }

    @Test
    public void current_givenEmptyReader_shouldReturnEof() {
        CharacterReader reader = new CharacterReader("");
        Assert.assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void consume_givenNonEmptyReader_shouldReturnCharAndAdvance() {
        CharacterReader reader = new CharacterReader("ab");
        char first = reader.consume();
        Assert.assertEquals('a', first);
        Assert.assertEquals(1, reader.pos());
        Assert.assertEquals('b', reader.current());
    }

    @Test
    public void consume_givenEmptyReader_shouldReturnEofAndAdvance() {
        CharacterReader reader = new CharacterReader("");
        char val = reader.consume();
        Assert.assertEquals(CharacterReader.EOF, val);
        Assert.assertEquals(1, reader.pos());
    }

    @Test
    public void unconsume_afterConsuming_shouldDecrementPos() {
        CharacterReader reader = new CharacterReader("abc");
        reader.consume();
        Assert.assertEquals(1, reader.pos());
        reader.unconsume();
        Assert.assertEquals(0, reader.pos());
        Assert.assertEquals('a', reader.current());
    }

    @Test
    public void advance_givenFreshReader_shouldIncrementPos() {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        Assert.assertEquals(1, reader.pos());
        Assert.assertEquals('b', reader.current());
    }

    @Test
    public void markAndRewindToMark_givenPositionAdvance_shouldRewindToMarkedPosition() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.advance();
        reader.advance();
        reader.mark();
        Assert.assertEquals(2, reader.pos());

        reader.advance();
        reader.advance();
        Assert.assertEquals(4, reader.pos());

        reader.rewindToMark();
        Assert.assertEquals(2, reader.pos());
        Assert.assertEquals('c', reader.current());
    }

    @Test
    public void consumeAsString_givenReader_shouldReturnEmptyStringAndAdvance() {
        CharacterReader reader = new CharacterReader("abc");
        String result = reader.consumeAsString();
        Assert.assertEquals("", result);
        Assert.assertEquals(1, reader.pos());
    }

    @Test
    public void consumeToChar_givenCharPresent_shouldConsumeUpToChar() {
        CharacterReader reader = new CharacterReader("one-two-three");
        String consumed = reader.consumeTo('-');
        Assert.assertEquals("one", consumed);
        Assert.assertEquals(3, reader.pos());
        Assert.assertEquals('-', reader.current());
    }

    @Test
    public void consumeToChar_givenCharNotPresent_shouldFallbackToConsumeToEnd() {
        CharacterReader reader = new CharacterReader("hello");
        String consumed = reader.consumeTo('z');
        Assert.assertEquals("hell", consumed);
        Assert.assertEquals(5, reader.pos());
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToString_givenStringPresent_shouldConsumeUpToString() {
        CharacterReader reader = new CharacterReader("one::two::three");
        String consumed = reader.consumeTo("::");
        Assert.assertEquals("one", consumed);
        Assert.assertEquals(3, reader.pos());
        Assert.assertEquals(':', reader.current());
    }

    @Test
    public void consumeToString_givenStringNotPresent_shouldFallbackToConsumeToEnd() {
        CharacterReader reader = new CharacterReader("hello");
        String consumed = reader.consumeTo("world");
        Assert.assertEquals("hell", consumed);
        Assert.assertEquals(5, reader.pos());
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToAny_givenMatchingCharInSequence_shouldConsumeUpToTarget() {
        CharacterReader reader = new CharacterReader("abcdef");
        String consumed = reader.consumeToAny('x', 'd', 'z');
        Assert.assertEquals("abc", consumed);
        Assert.assertEquals(3, reader.pos());
        Assert.assertEquals('d', reader.current());
    }

    @Test
    public void consumeToAny_givenTargetAtCurrentPosition_shouldReturnEmptyString() {
        CharacterReader reader = new CharacterReader("abcdef");
        String consumed = reader.consumeToAny('a');
        Assert.assertEquals("", consumed);
        Assert.assertEquals(0, reader.pos());
    }

    @Test
    public void consumeToAny_givenNoMatchingChar_shouldConsumeUntilEnd() {
        CharacterReader reader = new CharacterReader("abc");
        String consumed = reader.consumeToAny('x', 'y', 'z');
        Assert.assertEquals("abc", consumed);
        Assert.assertEquals(3, reader.pos());
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToAny_givenEmptyReader_shouldReturnEmptyString() {
        CharacterReader reader = new CharacterReader("");
        String consumed = reader.consumeToAny('a', 'b');
        Assert.assertEquals("", consumed);
        Assert.assertEquals(0, reader.pos());
    }

    @Test
    public void consumeToEnd_givenNonEmptyString_shouldReturnAllExceptLastCharAndReachEnd() {
        CharacterReader reader = new CharacterReader("testing");
        String result = reader.consumeToEnd();
        Assert.assertEquals("testin", result);
        Assert.assertEquals(7, reader.pos());
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeLetterSequence_givenLettersAndNonLetters_shouldConsumeOnlyLetters() {
        CharacterReader reader = new CharacterReader("aBcDeF123");
        String result = reader.consumeLetterSequence();
        Assert.assertEquals("aBcDeF", result);
        Assert.assertEquals(6, reader.pos());
        Assert.assertEquals('1', reader.current());
    }

    @Test
    public void consumeLetterSequence_givenNonLetterStart_shouldReturnEmptyString() {
        CharacterReader reader = new CharacterReader("123abc");
        String result = reader.consumeLetterSequence();
        Assert.assertEquals("", result);
        Assert.assertEquals(0, reader.pos());
    }

    @Test
    public void consumeLetterSequence_givenEmptyReader_shouldReturnEmptyString() {
        CharacterReader reader = new CharacterReader("");
        String result = reader.consumeLetterSequence();
        Assert.assertEquals("", result);
        Assert.assertEquals(0, reader.pos());
    }

    @Test
    public void consumeHexSequence_givenHexCharsAndOthers_shouldConsumeHexPortion() {
        CharacterReader reader = new CharacterReader("0123456789ABCDEFabcdefGHI");
        String result = reader.consumeHexSequence();
        Assert.assertEquals("0123456789ABCDEFabcdef", result);
        Assert.assertEquals(22, reader.pos());
        Assert.assertEquals('G', reader.current());
    }

    @Test
    public void consumeHexSequence_givenNonHexStart_shouldReturnEmptyString() {
        CharacterReader reader = new CharacterReader("xyz012");
        String result = reader.consumeHexSequence();
        Assert.assertEquals("", result);
        Assert.assertEquals(0, reader.pos());
    }

    @Test
    public void consumeHexSequence_givenEmptyReader_shouldReturnEmptyString() {
        CharacterReader reader = new CharacterReader("");
        String result = reader.consumeHexSequence();
        Assert.assertEquals("", result);
        Assert.assertEquals(0, reader.pos());
    }

    @Test
    public void consumeDigitSequence_givenDigitsFollowedByLetters_shouldConsumeDigitsOnly() {
        CharacterReader reader = new CharacterReader("1234567890abc");
        String result = reader.consumeDigitSequence();
        Assert.assertEquals("1234567890", result);
        Assert.assertEquals(10, reader.pos());
        Assert.assertEquals('a', reader.current());
    }

    @Test
    public void consumeDigitSequence_givenNonDigitStart_shouldReturnEmptyString() {
        CharacterReader reader = new CharacterReader("abc123");
        String result = reader.consumeDigitSequence();
        Assert.assertEquals("", result);
        Assert.assertEquals(0, reader.pos());
    }

    @Test
    public void consumeDigitSequence_givenEmptyReader_shouldReturnEmptyString() {
        CharacterReader reader = new CharacterReader("");
        String result = reader.consumeDigitSequence();
        Assert.assertEquals("", result);
        Assert.assertEquals(0, reader.pos());
    }

    @Test
    public void matchesChar_givenMatchingChar_shouldReturnTrue() {
        CharacterReader reader = new CharacterReader("abc");
        Assert.assertTrue(reader.matches('a'));
    }

    @Test
    public void matchesChar_givenMismatchingChar_shouldReturnFalse() {
        CharacterReader reader = new CharacterReader("abc");
        Assert.assertFalse(reader.matches('b'));
    }

    @Test
    public void matchesChar_givenEmptyReader_shouldReturnFalse() {
        CharacterReader reader = new CharacterReader("");
        Assert.assertFalse(reader.matches('a'));
    }

    @Test
    public void matchesString_givenMatchingPrefix_shouldReturnTrue() {
        CharacterReader reader = new CharacterReader("abcdef");
        Assert.assertTrue(reader.matches("abc"));
    }

    @Test
    public void matchesString_givenMismatchingPrefix_shouldReturnFalse() {
        CharacterReader reader = new CharacterReader("abcdef");
        Assert.assertFalse(reader.matches("abd"));
    }

    @Test
    public void matchesIgnoreCase_givenMatchingCaseInsensitive_shouldReturnTrue() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        Assert.assertTrue(reader.matchesIgnoreCase("AbCdE"));
    }

    @Test
    public void matchesIgnoreCase_givenMismatchingString_shouldReturnFalse() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        Assert.assertFalse(reader.matchesIgnoreCase("xyz"));
    }

    @Test
    public void matchesAny_givenEmptyReader_shouldReturnFalse() {
        CharacterReader reader = new CharacterReader("");
        Assert.assertFalse(reader.matchesAny('a', 'b', 'c'));
    }

    @Test
    public void matchesAny_givenCharMatchesOneOfSequence_shouldReturnTrue() {
        CharacterReader reader = new CharacterReader("test");
        Assert.assertTrue(reader.matchesAny('x', 't', 'y'));
    }

    @Test
    public void matchesAny_givenCharMatchesNone_shouldReturnFalse() {
        CharacterReader reader = new CharacterReader("test");
        Assert.assertFalse(reader.matchesAny('x', 'y', 'z'));
    }

    @Test
    public void matchesLetter_givenEmptyReader_shouldReturnFalse() {
        CharacterReader reader = new CharacterReader("");
        Assert.assertFalse(reader.matchesLetter());
    }

    @Test
    public void matchesLetter_givenUppercaseLetter_shouldReturnTrue() {
        CharacterReader reader = new CharacterReader("Z");
        Assert.assertTrue(reader.matchesLetter());
    }

    @Test
    public void matchesLetter_givenLowercaseLetter_shouldReturnTrue() {
        CharacterReader reader = new CharacterReader("z");
        Assert.assertTrue(reader.matchesLetter());
    }

    @Test
    public void matchesLetter_givenDigitOrSymbol_shouldReturnFalse() {
        CharacterReader readerDigit = new CharacterReader("5");
        Assert.assertFalse(readerDigit.matchesLetter());

        CharacterReader readerSymbol = new CharacterReader("@");
        Assert.assertFalse(readerSymbol.matchesLetter());
    }

    @Test
    public void matchesDigit_givenEmptyReader_shouldReturnFalse() {
        CharacterReader reader = new CharacterReader("");
        Assert.assertFalse(reader.matchesDigit());
    }

    @Test
    public void matchesDigit_givenDigits_shouldReturnTrue() {
        CharacterReader readerZero = new CharacterReader("0");
        Assert.assertTrue(readerZero.matchesDigit());

        CharacterReader readerNine = new CharacterReader("9");
        Assert.assertTrue(readerNine.matchesDigit());
    }

    @Test
    public void matchesDigit_givenNonDigit_shouldReturnFalse() {
        CharacterReader readerChar = new CharacterReader("a");
        Assert.assertFalse(readerChar.matchesDigit());

        CharacterReader readerSymbol = new CharacterReader("/");
        Assert.assertFalse(readerSymbol.matchesDigit());
    }

    @Test
    public void matchConsume_givenMatchingSequence_shouldAdvanceAndReturnTrue() {
        CharacterReader reader = new CharacterReader("hello world");
        boolean matched = reader.matchConsume("hello ");
        Assert.assertTrue(matched);
        Assert.assertEquals(6, reader.pos());
        Assert.assertEquals('w', reader.current());
    }

    @Test
    public void matchConsume_givenMismatchingSequence_shouldNotAdvanceAndReturnFalse() {
        CharacterReader reader = new CharacterReader("hello world");
        boolean matched = reader.matchConsume("world");
        Assert.assertFalse(matched);
        Assert.assertEquals(0, reader.pos());
        Assert.assertEquals('h', reader.current());
    }

    @Test
    public void matchConsumeIgnoreCase_givenMatchingCaseInsensitive_shouldAdvanceAndReturnTrue() {
        CharacterReader reader = new CharacterReader("HELLO world");
        boolean matched = reader.matchConsumeIgnoreCase("hello ");
        Assert.assertTrue(matched);
        Assert.assertEquals(6, reader.pos());
        Assert.assertEquals('w', reader.current());
    }

    @Test
    public void matchConsumeIgnoreCase_givenMismatchingSequence_shouldNotAdvanceAndReturnFalse() {
        CharacterReader reader = new CharacterReader("HELLO world");
        boolean matched = reader.matchConsumeIgnoreCase("world");
        Assert.assertFalse(matched);
        Assert.assertEquals(0, reader.pos());
        Assert.assertEquals('H', reader.current());
    }

    @Test
    public void containsIgnoreCase_givenLowerCaseOccurrence_shouldReturnTrue() {
        CharacterReader reader = new CharacterReader("<html><title>Sample</title></html>");
        Assert.assertTrue(reader.containsIgnoreCase("</title>"));
    }

    @Test
    public void containsIgnoreCase_givenUpperCaseOccurrence_shouldReturnTrue() {
        CharacterReader reader = new CharacterReader("<html><TITLE>Sample</TITLE></html>");
        Assert.assertTrue(reader.containsIgnoreCase("</title>"));
    }

    @Test
    public void containsIgnoreCase_givenNonExistingSequence_shouldReturnFalse() {
        CharacterReader reader = new CharacterReader("<html><head></head></html>");
        Assert.assertFalse(reader.containsIgnoreCase("</title>"));
    }

    @Test
    public void containsIgnoreCase_afterAdvancingPastMatch_shouldReturnFalse() {
        CharacterReader reader = new CharacterReader("<title>test</title>");
        reader.consumeTo('>');
        reader.advance();
        Assert.assertFalse(reader.containsIgnoreCase("<title>"));
    }

    @Test
    public void toString_givenVariousPositions_shouldReturnRemainingSubstring() {
        CharacterReader reader = new CharacterReader("abcdef");
        Assert.assertEquals("abcdef", reader.toString());

        reader.advance();
        reader.advance();
        Assert.assertEquals("cdef", reader.toString());

        reader.consumeToEnd();
        Assert.assertEquals("", reader.toString());
    }
}