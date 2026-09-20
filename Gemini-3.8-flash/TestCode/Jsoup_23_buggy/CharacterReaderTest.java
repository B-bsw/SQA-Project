package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullInput_shouldThrowIllegalArgumentException() {
        // Arrange & Act & Assert
        new CharacterReader(null);
    }

    @Test
    public void constructor_givenCarriageReturnVariants_shouldNormaliseToNewlines() {
        // Arrange
        CharacterReader reader = new CharacterReader("line1\r\nline2\rline3\nline4");

        // Act & Assert
        Assert.assertEquals("line1\nline2\nline3\nline4", reader.toString());
    }

    @Test
    public void pos_givenInitialStateAndAdvances_shouldTrackPositionAccurately() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");

        // Act & Assert
        Assert.assertEquals(0, reader.pos());
        reader.advance();
        Assert.assertEquals(1, reader.pos());
        reader.advance();
        Assert.assertEquals(2, reader.pos());
    }

    @Test
    public void isEmpty_givenEmptyString_shouldReturnTrue() {
        // Arrange
        CharacterReader reader = new CharacterReader("");

        // Act & Assert
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void isEmpty_givenNonEmptyString_shouldReturnFalseUntilConsumed() {
        // Arrange
        CharacterReader reader = new CharacterReader("a");

        // Act & Assert
        Assert.assertFalse(reader.isEmpty());
        reader.consume();
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void current_givenNonEmptyInput_shouldReturnCurrentCharacterWithoutAdvancing() {
        // Arrange
        CharacterReader reader = new CharacterReader("ab");

        // Act & Assert
        Assert.assertEquals('a', reader.current());
        Assert.assertEquals(0, reader.pos());
    }

    @Test
    public void current_givenEmptyInput_shouldReturnEof() {
        // Arrange
        CharacterReader reader = new CharacterReader("");

        // Act & Assert
        Assert.assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void consume_givenNonEmptyInput_shouldReturnCurrentCharacterAndAdvance() {
        // Arrange
        CharacterReader reader = new CharacterReader("ab");

        // Act & Assert
        Assert.assertEquals('a', reader.consume());
        Assert.assertEquals(1, reader.pos());
        Assert.assertEquals('b', reader.consume());
        Assert.assertEquals(2, reader.pos());
        Assert.assertEquals(CharacterReader.EOF, reader.consume());
        Assert.assertEquals(3, reader.pos());
    }

    @Test
    public void unconsume_givenAdvancedPosition_shouldDecrementPosition() {
        // Arrange
        CharacterReader reader = new CharacterReader("ab");
        reader.consume();
        Assert.assertEquals(1, reader.pos());

        // Act
        reader.unconsume();

        // Assert
        Assert.assertEquals(0, reader.pos());
        Assert.assertEquals('a', reader.current());
    }

    @Test
    public void markAndRewindToMark_givenPositionMoves_shouldRestoreMarkedPosition() {
        // Arrange
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consume(); // pos 1
        reader.mark();
        reader.consume(); // pos 2
        reader.consume(); // pos 3

        // Act
        reader.rewindToMark();

        // Assert
        Assert.assertEquals(1, reader.pos());
        Assert.assertEquals('b', reader.current());
    }

    @Test
    public void consumeAsString_givenInput_shouldAdvancePositionAndReturnSubstring() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");

        // Act
        String result = reader.consumeAsString();

        // Assert
        Assert.assertEquals("", result);
        Assert.assertEquals(1, reader.pos());
    }

    @Test
    public void consumeToChar_givenCharPresent_shouldConsumeUpToChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("foo-bar");

        // Act
        String result = reader.consumeTo('-');

        // Assert
        Assert.assertEquals("foo", result);
        Assert.assertEquals('-', reader.current());
    }

    @Test
    public void consumeToChar_givenCharAbsent_shouldConsumeToEnd() {
        // Arrange
        CharacterReader reader = new CharacterReader("foobar");

        // Act
        String result = reader.consumeTo('-');

        // Assert
        Assert.assertEquals("foobar", result);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToString_givenSequencePresent_shouldConsumeUpToSequence() {
        // Arrange
        CharacterReader reader = new CharacterReader("startTARGETend");

        // Act
        String result = reader.consumeTo("TARGET");

        // Assert
        Assert.assertEquals("start", result);
        Assert.assertTrue(reader.matches("TARGET"));
    }

    @Test
    public void consumeToString_givenSequenceAbsent_shouldConsumeToEnd() {
        // Arrange
        CharacterReader reader = new CharacterReader("startTARGETend");

        // Act
        String result = reader.consumeTo("MISSING");

        // Assert
        Assert.assertEquals("startTARGETend", result);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToAny_givenMatchingChars_shouldConsumeUpToFirstMatchedChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("hello world");

        // Act
        String result = reader.consumeToAny('o', ' ');

        // Assert
        Assert.assertEquals("hell", result);
        Assert.assertEquals('o', reader.current());
    }

    @Test
    public void consumeToAny_givenNoMatchingChars_shouldConsumeEntireString() {
        // Arrange
        CharacterReader reader = new CharacterReader("hello");

        // Act
        String result = reader.consumeToAny('x', 'y', 'z');

        // Assert
        Assert.assertEquals("hello", result);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToAny_givenImmediateMatch_shouldReturnEmptyString() {
        // Arrange
        CharacterReader reader = new CharacterReader("hello");

        // Act
        String result = reader.consumeToAny('h');

        // Assert
        Assert.assertEquals("", result);
        Assert.assertEquals('h', reader.current());
    }

    @Test
    public void consumeToEnd_givenPartialRead_shouldConsumeRemainingCharacters() {
        // Arrange
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consume();
        reader.consume();

        // Act
        String result = reader.consumeToEnd();

        // Assert
        Assert.assertEquals("cdef", result);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeLetterSequence_givenLettersAndNonLetters_shouldConsumeLettersOnly() {
        // Arrange
        CharacterReader reader = new CharacterReader("AbCd123");

        // Act
        String result = reader.consumeLetterSequence();

        // Assert
        Assert.assertEquals("AbCd", result);
        Assert.assertEquals('1', reader.current());
    }

    @Test
    public void consumeLetterSequence_givenNonLetterStart_shouldReturnEmpty() {
        // Arrange
        CharacterReader reader = new CharacterReader("123abc");

        // Act
        String result = reader.consumeLetterSequence();

        // Assert
        Assert.assertEquals("", result);
        Assert.assertEquals('1', reader.current());
    }

    @Test
    public void consumeLetterSequence_givenAllLetters_shouldConsumeAll() {
        // Arrange
        CharacterReader reader = new CharacterReader("abcXYZ");

        // Act
        String result = reader.consumeLetterSequence();

        // Assert
        Assert.assertEquals("abcXYZ", result);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeHexSequence_givenHexCharsAndOthers_shouldConsumeHexOnly() {
        // Arrange
        CharacterReader reader = new CharacterReader("0123456789ABCDEFabcdefGHI");

        // Act
        String result = reader.consumeHexSequence();

        // Assert
        Assert.assertEquals("0123456789ABCDEFabcdef", result);
        Assert.assertEquals('G', reader.current());
    }

    @Test
    public void consumeHexSequence_givenNonHexStart_shouldReturnEmpty() {
        // Arrange
        CharacterReader reader = new CharacterReader("GHI012");

        // Act
        String result = reader.consumeHexSequence();

        // Assert
        Assert.assertEquals("", result);
        Assert.assertEquals('G', reader.current());
    }

    @Test
    public void consumeHexSequence_givenAllHexChars_shouldConsumeAll() {
        // Arrange
        CharacterReader reader = new CharacterReader("aF09");

        // Act
        String result = reader.consumeHexSequence();

        // Assert
        Assert.assertEquals("aF09", result);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeDigitSequence_givenDigitsAndNonDigits_shouldConsumeDigitsOnly() {
        // Arrange
        CharacterReader reader = new CharacterReader("0123456789abc");

        // Act
        String result = reader.consumeDigitSequence();

        // Assert
        Assert.assertEquals("0123456789", result);
        Assert.assertEquals('a', reader.current());
    }

    @Test
    public void consumeDigitSequence_givenNonDigitStart_shouldReturnEmpty() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc123");

        // Act
        String result = reader.consumeDigitSequence();

        // Assert
        Assert.assertEquals("", result);
        Assert.assertEquals('a', reader.current());
    }

    @Test
    public void consumeDigitSequence_givenAllDigits_shouldConsumeAll() {
        // Arrange
        CharacterReader reader = new CharacterReader("98765");

        // Act
        String result = reader.consumeDigitSequence();

        // Assert
        Assert.assertEquals("98765", result);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void matchesChar_givenMatchingAndMismatchingChars_shouldReturnExpectedBoolean() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");

        // Act & Assert
        Assert.assertTrue(reader.matches('a'));
        Assert.assertFalse(reader.matches('b'));

        reader.consumeToEnd();
        Assert.assertFalse(reader.matches('a'));
    }

    @Test
    public void matchesString_givenMatchingAndMismatchingString_shouldReturnExpectedBoolean() {
        // Arrange
        CharacterReader reader = new CharacterReader("abcdef");

        // Act & Assert
        Assert.assertTrue(reader.matches("abc"));
        Assert.assertFalse(reader.matches("bcd"));

        reader.advance();
        Assert.assertTrue(reader.matches("bc"));
    }

    @Test
    public void matchesIgnoreCase_givenDifferentCases_shouldReturnTrue() {
        // Arrange
        CharacterReader reader = new CharacterReader("AbCdEf");

        // Act & Assert
        Assert.assertTrue(reader.matchesIgnoreCase("abcdef"));
        Assert.assertTrue(reader.matchesIgnoreCase("ABCDEF"));
        Assert.assertFalse(reader.matchesIgnoreCase("xyz"));
    }

    @Test
    public void matchesAnyChar_givenCharsInInput_shouldMatchCorrectly() {
        // Arrange
        CharacterReader reader = new CharacterReader("test");

        // Act & Assert
        Assert.assertTrue(reader.matchesAny('x', 't', 'y'));
        Assert.assertFalse(reader.matchesAny('a', 'b', 'c'));

        reader.consumeToEnd();
        Assert.assertFalse(reader.matchesAny('t'));
    }

    @Test
    public void matchesLetter_givenVariousChars_shouldValidateAccurately() {
        // Arrange
        CharacterReader readerEmpty = new CharacterReader("");
        CharacterReader readerUpper = new CharacterReader("A");
        CharacterReader readerLower = new CharacterReader("z");
        CharacterReader readerDigit = new CharacterReader("1");
        CharacterReader readerSpecial = new CharacterReader("@");

        // Act & Assert
        Assert.assertFalse(readerEmpty.matchesLetter());
        Assert.assertTrue(readerUpper.matchesLetter());
        Assert.assertTrue(readerLower.matchesLetter());
        Assert.assertFalse(readerDigit.matchesLetter());
        Assert.assertFalse(readerSpecial.matchesLetter());
    }

    @Test
    public void matchesDigit_givenVariousChars_shouldValidateAccurately() {
        // Arrange
        CharacterReader readerEmpty = new CharacterReader("");
        CharacterReader readerDigit0 = new CharacterReader("0");
        CharacterReader readerDigit9 = new CharacterReader("9");
        CharacterReader readerLetter = new CharacterReader("a");
        CharacterReader readerSpecial = new CharacterReader("/");

        // Act & Assert
        Assert.assertFalse(readerEmpty.matchesDigit());
        Assert.assertTrue(readerDigit0.matchesDigit());
        Assert.assertTrue(readerDigit9.matchesDigit());
        Assert.assertFalse(readerLetter.matchesDigit());
        Assert.assertFalse(readerSpecial.matchesDigit());
    }

    @Test
    public void matchConsume_givenMatchingSequence_shouldConsumeAndReturnTrue() {
        // Arrange
        CharacterReader reader = new CharacterReader("hello world");

        // Act
        boolean matched = reader.matchConsume("hello");

        // Assert
        Assert.assertTrue(matched);
        Assert.assertEquals(5, reader.pos());
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void matchConsume_givenMismatchSequence_shouldNotAdvanceAndReturnFalse() {
        // Arrange
        CharacterReader reader = new CharacterReader("hello world");

        // Act
        boolean matched = reader.matchConsume("world");

        // Assert
        Assert.assertFalse(matched);
        Assert.assertEquals(0, reader.pos());
        Assert.assertEquals('h', reader.current());
    }

    @Test
    public void matchConsumeIgnoreCase_givenMatchingCaseInsensitive_shouldConsumeAndReturnTrue() {
        // Arrange
        CharacterReader reader = new CharacterReader("HeLLo World");

        // Act
        boolean matched = reader.matchConsumeIgnoreCase("hello");

        // Assert
        Assert.assertTrue(matched);
        Assert.assertEquals(5, reader.pos());
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void matchConsumeIgnoreCase_givenMismatch_shouldNotAdvanceAndReturnFalse() {
        // Arrange
        CharacterReader reader = new CharacterReader("HeLLo World");

        // Act
        boolean matched = reader.matchConsumeIgnoreCase("world");

        // Assert
        Assert.assertFalse(matched);
        Assert.assertEquals(0, reader.pos());
        Assert.assertEquals('H', reader.current());
    }

    @Test
    public void containsIgnoreCase_givenMatchingLowerOrUpper_shouldReturnTrue() {
        // Arrange
        CharacterReader reader1 = new CharacterReader("<html><title>Sample</title></html>");
        CharacterReader reader2 = new CharacterReader("<html><TITLE>Sample</TITLE></html>");

        // Act & Assert
        Assert.assertTrue(reader1.containsIgnoreCase("</title>"));
        Assert.assertTrue(reader2.containsIgnoreCase("</title>"));
        Assert.assertTrue(reader1.containsIgnoreCase("</TITLE>"));
        Assert.assertTrue(reader2.containsIgnoreCase("</TITLE>"));
    }

    @Test
    public void containsIgnoreCase_givenMissingSequence_shouldReturnFalse() {
        // Arrange
        CharacterReader reader = new CharacterReader("<html><body>Sample</body></html>");

        // Act & Assert
        Assert.assertFalse(reader.containsIgnoreCase("</title>"));
    }

    @Test
    public void toString_givenVariousPositions_shouldReturnRemainingString() {
        // Arrange
        CharacterReader reader = new CharacterReader("abcdef");

        // Act & Assert
        Assert.assertEquals("abcdef", reader.toString());
        reader.consume();
        reader.consume();
        Assert.assertEquals("cdef", reader.toString());
        reader.consumeToEnd();
        Assert.assertEquals("", reader.toString());
    }
}