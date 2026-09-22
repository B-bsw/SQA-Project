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
    public void constructor_givenEmptyString_shouldBeEmptyImmediately() {
        // Arrange
        CharacterReader reader = new CharacterReader("");

        // Act & Assert
        Assert.assertEquals(0, reader.pos());
        Assert.assertTrue(reader.isEmpty());
        Assert.assertEquals(CharacterReader.EOF, reader.current());
        Assert.assertEquals(CharacterReader.EOF, reader.consume());
        Assert.assertEquals("", reader.toString());
    }

    @Test
    public void pos_givenConsumingCharacters_shouldTrackCurrentPosition() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");

        // Act & Assert
        Assert.assertEquals(0, reader.pos());
        reader.consume();
        Assert.assertEquals(1, reader.pos());
        reader.advance();
        Assert.assertEquals(2, reader.pos());
        reader.unconsume();
        Assert.assertEquals(1, reader.pos());
    }

    @Test
    public void current_givenValidPositionAndEof_shouldReturnCurrentCharOrEof() {
        // Arrange
        CharacterReader reader = new CharacterReader("a");

        // Act & Assert
        Assert.assertEquals('a', reader.current());
        reader.consume();
        Assert.assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void consume_givenInput_shouldConsumeCharAndAdvance() {
        // Arrange
        CharacterReader reader = new CharacterReader("ab");

        // Act & Assert
        Assert.assertEquals('a', reader.consume());
        Assert.assertEquals('b', reader.consume());
        Assert.assertEquals(CharacterReader.EOF, reader.consume());
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void markAndRewindToMark_givenRepositioning_shouldResetToMarkedPosition() {
        // Arrange
        CharacterReader reader = new CharacterReader("abcdef");

        // Act
        reader.consume(); // pos 1 ('b')
        reader.mark();
        reader.consume(); // pos 2 ('c')
        reader.consume(); // pos 3 ('d')
        Assert.assertEquals(3, reader.pos());
        reader.rewindToMark();

        // Assert
        Assert.assertEquals(1, reader.pos());
        Assert.assertEquals('b', reader.current());
    }

    @Test
    public void consumeAsString_givenInput_shouldReturnSingleCharStringAndAdvance() {
        // Arrange
        CharacterReader reader = new CharacterReader("xyz");

        // Act
        String first = reader.consumeAsString();
        String second = reader.consumeAsString();

        // Assert
        Assert.assertEquals("x", first);
        Assert.assertEquals("y", second);
        Assert.assertEquals(2, reader.pos());
    }

    @Test
    public void nextIndexOfChar_givenPresentAndAbsentChar_shouldReturnCorrectOffsetOrMinusOne() {
        // Arrange
        CharacterReader reader = new CharacterReader("hello world");

        // Act & Assert
        Assert.assertEquals(0, reader.nextIndexOf('h'));
        Assert.assertEquals(4, reader.nextIndexOf('o'));
        Assert.assertEquals(-1, reader.nextIndexOf('z'));

        reader.consumeTo('w'); // pos at 'w'
        Assert.assertEquals(0, reader.nextIndexOf('w'));
        Assert.assertEquals(-1, reader.nextIndexOf('h')); // 'h' is behind current pos
    }

    @Test
    public void nextIndexOfCharSequence_givenFullAndPartialMatches_shouldReturnCorrectOffsetOrMinusOne() {
        // Arrange
        CharacterReader reader = new CharacterReader("banana and banister");

        // Act & Assert
        Assert.assertEquals(0, reader.nextIndexOf("ban"));
        Assert.assertEquals(7, reader.nextIndexOf("and"));
        Assert.assertEquals(11, reader.nextIndexOf("banister"));
        Assert.assertEquals(-1, reader.nextIndexOf("apple"));

        // Match sequence that extends past input length
        Assert.assertEquals(-1, reader.nextIndexOf("banister plus extra"));
    }

    @Test
    public void nextIndexOfCharSequence_givenRepeatedStartChars_shouldScanCorrectly() {
        // Arrange
        CharacterReader reader = new CharacterReader("mississippi");

        // Act & Assert
        Assert.assertEquals(2, reader.nextIndexOf("ssi"));
        Assert.assertEquals(5, reader.nextIndexOf("ssip"));
        Assert.assertEquals(-1, reader.nextIndexOf("ssiz"));
    }

    @Test
    public void consumeToChar_givenPresentChar_shouldConsumeUntilChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("test:data");

        // Act
        String prefix = reader.consumeTo(':');

        // Assert
        Assert.assertEquals("test", prefix);
        Assert.assertEquals(':', reader.current());
        Assert.assertEquals(4, reader.pos());
    }

    @Test
    public void consumeToChar_givenAbsentChar_shouldConsumeToEnd() {
        // Arrange
        CharacterReader reader = new CharacterReader("no delimiters here");

        // Act
        String result = reader.consumeTo(';');

        // Assert
        Assert.assertEquals("no delimiters here", result);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToString_givenPresentString_shouldConsumeUntilString() {
        // Arrange
        CharacterReader reader = new CharacterReader("start<!--comment-->end");

        // Act
        String result = reader.consumeTo("<!--");

        // Assert
        Assert.assertEquals("start", result);
        Assert.assertEquals('<', reader.current());
    }

    @Test
    public void consumeToString_givenAbsentString_shouldConsumeToEnd() {
        // Arrange
        CharacterReader reader = new CharacterReader("plain text without token");

        // Act
        String result = reader.consumeTo("missing");

        // Assert
        Assert.assertEquals("plain text without token", result);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToAny_givenMultipleDelimiters_shouldStopAtFirstMatch() {
        // Arrange
        CharacterReader reader = new CharacterReader("foo&bar<baz");

        // Act
        String first = reader.consumeToAny('&', '<');
        char delimiter = reader.consume();
        String second = reader.consumeToAny('&', '<');

        // Assert
        Assert.assertEquals("foo", first);
        Assert.assertEquals('&', delimiter);
        Assert.assertEquals("bar", second);
        Assert.assertEquals('<', reader.current());
    }

    @Test
    public void consumeToAny_givenNoDelimitersPresent_shouldConsumeAll() {
        // Arrange
        CharacterReader reader = new CharacterReader("alphanumeric");

        // Act
        String result = reader.consumeToAny('!', '@', '#');

        // Assert
        Assert.assertEquals("alphanumeric", result);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToAny_givenEmptyReader_shouldReturnEmptyString() {
        // Arrange
        CharacterReader reader = new CharacterReader("");

        // Act
        String result = reader.consumeToAny('a', 'b');

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void consumeToAnySorted_givenSortedDelimiters_shouldStopAtFirstMatch() {
        // Arrange
        CharacterReader reader = new CharacterReader("user_id=123");
        char[] sortedDelimiters = new char[]{ '=', '_' }; // Sorted: '=', '_' (ASCII 61, 95)

        // Act
        String firstPart = reader.consumeToAnySorted(sortedDelimiters);
        reader.consume(); // skip '_'
        String secondPart = reader.consumeToAnySorted(sortedDelimiters);

        // Assert
        Assert.assertEquals("user", firstPart);
        Assert.assertEquals("id", secondPart);
        Assert.assertEquals('=', reader.current());
    }

    @Test
    public void consumeToAnySorted_givenNoMatch_shouldConsumeAll() {
        // Arrange
        CharacterReader reader = new CharacterReader("content");
        char[] sortedDelims = new char[]{ 'x', 'y', 'z' };

        // Act
        String result = reader.consumeToAnySorted(sortedDelims);

        // Assert
        Assert.assertEquals("content", result);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeData_givenDataContainingHtmlTokens_shouldStopAtBoundary() {
        // Arrange
        CharacterReader readerAmp = new CharacterReader("data&amp;");
        CharacterReader readerLt = new CharacterReader("data<tag>");
        CharacterReader readerNull = new CharacterReader("data\u0000remainder");
        CharacterReader readerClean = new CharacterReader("dataclean");

        // Act & Assert
        Assert.assertEquals("data", readerAmp.consumeData());
        Assert.assertEquals('&', readerAmp.current());

        Assert.assertEquals("data", readerLt.consumeData());
        Assert.assertEquals('<', readerLt.current());

        Assert.assertEquals("data", readerNull.consumeData());
        Assert.assertEquals('\u0000', readerNull.current());

        Assert.assertEquals("dataclean", readerClean.consumeData());
        Assert.assertTrue(readerClean.isEmpty());
    }

    @Test
    public void consumeTagName_givenTagNameWithTerminators_shouldStopAtTerminator() {
        // Terminators: '\t', '\n', '\r', '\f', ' ', '/', '>', TokeniserState.nullChar
        char[] terminators = new char[]{ '\t', '\n', '\r', '\f', ' ', '/', '>', '\u0000' };

        for (int i = 0; i < terminators.length; i++) {
            char t = terminators[i];
            CharacterReader reader = new CharacterReader("div" + t + "more");
            String tag = reader.consumeTagName();
            Assert.assertEquals("div", tag);
            Assert.assertEquals(t, reader.current());
        }
    }

    @Test
    public void consumeTagName_givenNoTerminator_shouldConsumeAll() {
        // Arrange
        CharacterReader reader = new CharacterReader("div");

        // Act
        String tag = reader.consumeTagName();

        // Assert
        Assert.assertEquals("div", tag);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToEnd_givenPositionInMiddle_shouldConsumeRemainingAndAdvance() {
        // Arrange
        CharacterReader reader = new CharacterReader("prefix-suffix");
        reader.consumeTo('-');
        reader.consume(); // skip '-'

        // Act
        String remaining = reader.consumeToEnd();

        // Assert
        Assert.assertEquals("suffix", remaining);
        Assert.assertTrue(reader.isEmpty());
        Assert.assertEquals("", reader.consumeToEnd());
    }

    @Test
    public void consumeLetterSequence_givenLettersAndNonLetters_shouldConsumeLettersOnly() {
        // Arrange
        CharacterReader reader = new CharacterReader("AbCdEf123");

        // Act
        String letters = reader.consumeLetterSequence();

        // Assert
        Assert.assertEquals("AbCdEf", letters);
        Assert.assertEquals('1', reader.current());

        // When non-letter at start
        String empty = reader.consumeLetterSequence();
        Assert.assertEquals("", empty);
    }

    @Test
    public void consumeLetterThenDigitSequence_givenCombinations_shouldConsumeCorrectly() {
        // Arrange
        CharacterReader reader1 = new CharacterReader("abc123xyz");
        CharacterReader reader2 = new CharacterReader("123abc");
        CharacterReader reader3 = new CharacterReader("abc");

        // Act & Assert
        Assert.assertEquals("abc123", reader1.consumeLetterThenDigitSequence());
        Assert.assertEquals('x', reader1.current());

        Assert.assertEquals("123", reader2.consumeLetterThenDigitSequence());
        Assert.assertEquals('a', reader2.current());

        Assert.assertEquals("abc", reader3.consumeLetterThenDigitSequence());
        Assert.assertTrue(reader3.isEmpty());
    }

    @Test
    public void consumeHexSequence_givenHexCharsAndTerminator_shouldConsumeHexDigitsOnly() {
        // Arrange
        CharacterReader reader = new CharacterReader("0123456789abcdefABCDEFghi");

        // Act
        String hex = reader.consumeHexSequence();

        // Assert
        Assert.assertEquals("0123456789abcdefABCDEF", hex);
        Assert.assertEquals('g', reader.current());

        // When non-hex at start
        String empty = reader.consumeHexSequence();
        Assert.assertEquals("", empty);
    }

    @Test
    public void consumeDigitSequence_givenDigitsAndNonDigits_shouldConsumeDigitsOnly() {
        // Arrange
        CharacterReader reader = new CharacterReader("1234567890px");

        // Act
        String digits = reader.consumeDigitSequence();

        // Assert
        Assert.assertEquals("1234567890", digits);
        Assert.assertEquals('p', reader.current());

        // When non-digit at start
        String empty = reader.consumeDigitSequence();
        Assert.assertEquals("", empty);
    }

    @Test
    public void matchesChar_givenMatchesAndMismatches_shouldReturnCorrectBoolean() {
        // Arrange
        CharacterReader reader = new CharacterReader("a");

        // Act & Assert
        Assert.assertTrue(reader.matches('a'));
        Assert.assertFalse(reader.matches('b'));
        reader.consume();
        Assert.assertFalse(reader.matches('a')); // EOF
    }

    @Test
    public void matchesString_givenExactAndPartialMatches_shouldReturnExpectedBoolean() {
        // Arrange
        CharacterReader reader = new CharacterReader("hello world");

        // Act & Assert
        Assert.assertTrue(reader.matches("hello"));
        Assert.assertFalse(reader.matches("help"));
        Assert.assertFalse(reader.matches("hello world extra")); // Longer than remaining

        reader.consumeToEnd();
        Assert.assertFalse(reader.matches("any"));
    }

    @Test
    public void matchesIgnoreCase_givenMixedCaseStrings_shouldReturnTrueWhenMatching() {
        // Arrange
        CharacterReader reader = new CharacterReader("HeLLo World");

        // Act & Assert
        Assert.assertTrue(reader.matchesIgnoreCase("hello"));
        Assert.assertTrue(reader.matchesIgnoreCase("HELLO"));
        Assert.assertTrue(reader.matchesIgnoreCase("HeLLo"));
        Assert.assertFalse(reader.matchesIgnoreCase("help"));
        Assert.assertFalse(reader.matchesIgnoreCase("hello world!!")); // Longer than remaining
    }

    @Test
    public void matchesAny_givenVarargsChars_shouldIdentifyMatches() {
        // Arrange
        CharacterReader reader = new CharacterReader("target");

        // Act & Assert
        Assert.assertTrue(reader.matchesAny('a', 't', 'z'));
        Assert.assertFalse(reader.matchesAny('x', 'y', 'z'));

        reader.consumeToEnd();
        Assert.assertFalse(reader.matchesAny('t')); // EOF
    }

    @Test
    public void matchesAnySorted_givenSortedChars_shouldIdentifyMatches() {
        // Arrange
        CharacterReader reader = new CharacterReader("target");
        char[] sortedMatch = new char[]{ 'a', 'm', 't' };
        char[] sortedNoMatch = new char[]{ 'b', 'c', 'd' };

        // Act & Assert
        Assert.assertTrue(reader.matchesAnySorted(sortedMatch));
        Assert.assertFalse(reader.matchesAnySorted(sortedNoMatch));

        reader.consumeToEnd();
        Assert.assertFalse(reader.matchesAnySorted(sortedMatch)); // EOF
    }

    @Test
    public void matchesLetterAndMatchesDigit_givenVariousInputs_shouldClassifyCorrectly() {
        // Arrange
        CharacterReader readerAlphaUpper = new CharacterReader("Z");
        CharacterReader readerAlphaLower = new CharacterReader("z");
        CharacterReader readerDigit = new CharacterReader("9");
        CharacterReader readerSymbol = new CharacterReader("$");
        CharacterReader readerEmpty = new CharacterReader("");

        // Act & Assert
        Assert.assertTrue(readerAlphaUpper.matchesLetter());
        Assert.assertFalse(readerAlphaUpper.matchesDigit());

        Assert.assertTrue(readerAlphaLower.matchesLetter());
        Assert.assertFalse(readerAlphaLower.matchesDigit());

        Assert.assertFalse(readerDigit.matchesLetter());
        Assert.assertTrue(readerDigit.matchesDigit());

        Assert.assertFalse(readerSymbol.matchesLetter());
        Assert.assertFalse(readerSymbol.matchesDigit());

        Assert.assertFalse(readerEmpty.matchesLetter());
        Assert.assertFalse(readerEmpty.matchesDigit());
    }

    @Test
    public void matchConsume_givenMatchingAndMismatchingSequence_shouldAdvanceOnlyOnMatch() {
        // Arrange
        CharacterReader reader = new CharacterReader("prefix_data");

        // Act & Assert
        Assert.assertFalse(reader.matchConsume("wrong"));
        Assert.assertEquals(0, reader.pos());

        Assert.assertTrue(reader.matchConsume("prefix_"));
        Assert.assertEquals(7, reader.pos());
        Assert.assertEquals("data", reader.toString());
    }

    @Test
    public void matchConsumeIgnoreCase_givenDifferentCases_shouldAdvanceOnlyOnMatch() {
        // Arrange
        CharacterReader reader = new CharacterReader("PreFix_Data");

        // Act & Assert
        Assert.assertFalse(reader.matchConsumeIgnoreCase("WRONG"));
        Assert.assertEquals(0, reader.pos());

        Assert.assertTrue(reader.matchConsumeIgnoreCase("prefix_"));
        Assert.assertEquals(7, reader.pos());
        Assert.assertEquals("Data", reader.toString());
    }

    @Test
    public void containsIgnoreCase_givenVaryingCases_shouldFindSubstringCorrectly() {
        // Arrange
        CharacterReader reader = new CharacterReader("<div>CONTENT</DIV>");

        // Act & Assert
        Assert.assertTrue(reader.containsIgnoreCase("</DIV>"));
        Assert.assertTrue(reader.containsIgnoreCase("content"));
        Assert.assertTrue(reader.containsIgnoreCase("<div>"));
        Assert.assertFalse(reader.containsIgnoreCase("span"));
    }

    @Test
    public void toString_givenReadingInProgress_shouldReturnOnlyRemainingString() {
        // Arrange
        CharacterReader reader = new CharacterReader("123456789");

        // Act & Assert
        Assert.assertEquals("123456789", reader.toString());
        reader.consume();
        reader.consume();
        Assert.assertEquals("3456789", reader.toString());
        reader.consumeToEnd();
        Assert.assertEquals("", reader.toString());
    }

    @Test
    public void rangeEquals_givenIdenticalAndDifferentCharactersOrLengths_shouldReturnExpected() {
        // Arrange
        CharacterReader reader = new CharacterReader("abcde12345");

        // Act & Assert
        Assert.assertTrue(reader.rangeEquals(0, 5, "abcde"));
        Assert.assertFalse(reader.rangeEquals(0, 5, "abcdf")); // char mismatch
        Assert.assertFalse(reader.rangeEquals(0, 4, "abcde")); // length mismatch
        Assert.assertFalse(reader.rangeEquals(0, 5, "abcd"));  // length mismatch
        Assert.assertTrue(reader.rangeEquals(5, 5, "12345"));
    }

    @Test
    public void cacheString_givenStringsExceedingMaxCacheLen_shouldBypassCache() {
        // String longer than maxCacheLen (12 chars)
        String longString = "1234567890123";
        CharacterReader reader = new CharacterReader(longString);

        // Act
        String result = reader.consumeToEnd();

        // Assert
        Assert.assertEquals(longString, result);
    }

    @Test
    public void cacheString_givenRepeatedShortStrings_shouldHitAndReuseCache() {
        // Arrange
        CharacterReader reader = new CharacterReader("tag-tag-tag-");

        // Act
        String first = reader.consumeTo('-');
        reader.consume(); // skip '-'
        String second = reader.consumeTo('-');
        reader.consume(); // skip '-'
        String third = reader.consumeTo('-');

        // Assert
        Assert.assertEquals("tag", first);
        Assert.assertSame(first, second); // Cache hit returns same object reference
        Assert.assertSame(second, third);
    }

    @Test
    public void cacheString_givenHashCollisionDifferentContent_shouldUpdateCacheEntry() {
        // Two 3-character strings designed to collide under index = (31 * hash + val) & 511
        // 'Aa' and 'BB' have same hashCode in Java: 'A'*31 + 'a' = 65*31 + 97 = 2112; 'B'*31 + 'B' = 66*31 + 66 = 2112
        // Appending 'X' to both preserves equal hash codes and indices in stringCache.
        CharacterReader reader = new CharacterReader("AaX|BBX|AaX");

        // Act
        String first = reader.consumeTo('|');
        reader.consume(); // skip '|'
        String second = reader.consumeTo('|');
        reader.consume(); // skip '|'
        String third = reader.consumeToEnd();

        // Assert
        Assert.assertEquals("AaX", first);
        Assert.assertEquals("BBX", second);
        Assert.assertEquals("AaX", third);
        Assert.assertNotSame(first, second);
        Assert.assertNotSame(first, third); // Cache entry was replaced by BBX then updated by third
    }
}