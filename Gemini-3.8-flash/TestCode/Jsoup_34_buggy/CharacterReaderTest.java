package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullInput_shouldThrowException() {
        new CharacterReader(null);
    }

    @Test
    public void constructor_givenEmptyString_shouldBeEmpty() {
        CharacterReader reader = new CharacterReader("");
        Assert.assertEquals(0, reader.pos());
        Assert.assertTrue(reader.isEmpty());
        Assert.assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void pos_givenInitialStateAndConsumptions_shouldTrackCorrectPosition() {
        CharacterReader reader = new CharacterReader("abc");
        Assert.assertEquals(0, reader.pos());
        reader.consume();
        Assert.assertEquals(1, reader.pos());
        reader.advance();
        Assert.assertEquals(2, reader.pos());
        reader.unconsume();
        Assert.assertEquals(1, reader.pos());
    }

    @Test
    public void isEmpty_givenNonEmptyString_shouldReturnFalseUntilFullyConsumed() {
        CharacterReader reader = new CharacterReader("a");
        Assert.assertFalse(reader.isEmpty());
        reader.consume();
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void current_givenNonEmptyReader_shouldReturnCharacterWithoutAdvancing() {
        CharacterReader reader = new CharacterReader("ab");
        Assert.assertEquals('a', reader.current());
        Assert.assertEquals('a', reader.current());
        Assert.assertEquals(0, reader.pos());
    }

    @Test
    public void current_givenEmptyReader_shouldReturnEof() {
        CharacterReader reader = new CharacterReader("");
        Assert.assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void consume_givenCharacters_shouldReturnCurrentAndAdvance() {
        CharacterReader reader = new CharacterReader("ab");
        Assert.assertEquals('a', reader.consume());
        Assert.assertEquals(1, reader.pos());
        Assert.assertEquals('b', reader.consume());
        Assert.assertEquals(2, reader.pos());
        Assert.assertEquals(CharacterReader.EOF, reader.consume());
        Assert.assertEquals(3, reader.pos());
    }

    @Test
    public void unconsume_givenAdvancedReader_shouldDecrementPos() {
        CharacterReader reader = new CharacterReader("abc");
        reader.consume();
        reader.consume();
        Assert.assertEquals(2, reader.pos());
        reader.unconsume();
        Assert.assertEquals(1, reader.pos());
        Assert.assertEquals('b', reader.current());
    }

    @Test
    public void advance_givenReader_shouldIncrementPos() {
        CharacterReader reader = new CharacterReader("test");
        reader.advance();
        Assert.assertEquals(1, reader.pos());
        Assert.assertEquals('e', reader.current());
    }

    @Test
    public void markAndRewindToMark_givenVariousPositions_shouldRewindToMarkedPosition() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consume(); // pos 1
        reader.mark();
        reader.consume(); // pos 2
        reader.consume(); // pos 3
        Assert.assertEquals(3, reader.pos());

        reader.rewindToMark();
        Assert.assertEquals(1, reader.pos());
        Assert.assertEquals('b', reader.current());
    }

    @Test
    public void rewindToMark_givenDefaultMark_shouldRewindToZero() {
        CharacterReader reader = new CharacterReader("xyz");
        reader.advance();
        reader.rewindToMark();
        Assert.assertEquals(0, reader.pos());
        Assert.assertEquals('x', reader.current());
    }

    @Test
    public void consumeAsString_givenAvailableCharacters_shouldReturnSingleCharStringAndAdvance() {
        CharacterReader reader = new CharacterReader("hello");
        String result = reader.consumeAsString();
        Assert.assertEquals("h", result);
        Assert.assertEquals(1, reader.pos());
    }

    @Test
    public void nextIndexOfChar_givenPresentChar_shouldReturnRelativeOffset() {
        CharacterReader reader = new CharacterReader("abcdef");
        Assert.assertEquals(3, reader.nextIndexOf('d'));
        reader.advance(); // pos = 1 ('b')
        Assert.assertEquals(2, reader.nextIndexOf('d'));
    }

    @Test
    public void nextIndexOfChar_givenAbsentChar_shouldReturnNegativeOne() {
        CharacterReader reader = new CharacterReader("abcdef");
        Assert.assertEquals(-1, reader.nextIndexOf('z'));
    }

    @Test
    public void nextIndexOfChar_givenTargetAtCurrentPosition_shouldReturnZero() {
        CharacterReader reader = new CharacterReader("abcdef");
        Assert.assertEquals(0, reader.nextIndexOf('a'));
    }

    @Test
    public void nextIndexOfCharSequence_givenContainedSubstring_shouldReturnOffset() {
        CharacterReader reader = new CharacterReader("abc def ghi def");
        Assert.assertEquals(4, reader.nextIndexOf("def"));
        reader.advance(); // pos 1
        Assert.assertEquals(3, reader.nextIndexOf("def"));
    }

    @Test
    public void nextIndexOfCharSequence_givenPartialMatchThenFullMatch_shouldFindCorrectOffset() {
        CharacterReader reader = new CharacterReader("abacabadabacabae");
        Assert.assertEquals(4, reader.nextIndexOf("abad"));
    }

    @Test
    public void nextIndexOfCharSequence_givenNotFound_shouldReturnNegativeOne() {
        CharacterReader reader = new CharacterReader("abcdefg");
        Assert.assertEquals(-1, reader.nextIndexOf("xyz"));
        Assert.assertEquals(-1, reader.nextIndexOf("efgh"));
    }

    @Test
    public void nextIndexOfCharSequence_givenTargetLongerThanRemainder_shouldReturnNegativeOne() {
        CharacterReader reader = new CharacterReader("abc");
        Assert.assertEquals(-1, reader.nextIndexOf("abcdef"));
    }

    @Test
    public void consumeToChar_givenCharExists_shouldConsumeUntilChar() {
        CharacterReader reader = new CharacterReader("foo=bar");
        String consumed = reader.consumeTo('=');
        Assert.assertEquals("foo", consumed);
        Assert.assertEquals('=', reader.current());
        Assert.assertEquals(3, reader.pos());
    }

    @Test
    public void consumeToChar_givenCharNotFound_shouldConsumeToEnd() {
        CharacterReader reader = new CharacterReader("foobar");
        String consumed = reader.consumeTo('=');
        Assert.assertEquals("foobar", consumed);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToString_givenStringExists_shouldConsumeUntilString() {
        CharacterReader reader = new CharacterReader("start<!--comment-->end");
        String consumed = reader.consumeTo("<!--");
        Assert.assertEquals("start", consumed);
        Assert.assertEquals('<', reader.current());
        Assert.assertEquals(5, reader.pos());
    }

    @Test
    public void consumeToString_givenStringNotFound_