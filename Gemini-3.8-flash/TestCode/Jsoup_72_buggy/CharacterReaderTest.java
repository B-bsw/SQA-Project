package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

public class CharacterReaderTest {

    @Test
    public void constructor_givenString_shouldInitializeCorrectly() {
        // Arrange & Act
        CharacterReader reader = new CharacterReader("One Two Three");

        // Assert
        Assert.assertEquals(0, reader.pos());
        Assert.assertFalse(reader.isEmpty());
        Assert.assertEquals('O', reader.current());
        Assert.assertEquals("One Two Three", reader.toString());
    }

    @Test
    public void constructor_givenReaderAndSize_shouldInitializeCorrectly() {
        // Arrange
        StringReader sr = new StringReader("Sample content");

        // Act
        CharacterReader reader = new CharacterReader(sr, 16);

        // Assert
        Assert.assertEquals(0, reader.pos());
        Assert.assertFalse(reader.isEmpty());
        Assert.assertEquals('S', reader.current());
    }

    @Test
    public void constructor_givenReaderWithLargeSize_shouldCapAtMaxBufferLen() {
        // Arrange
        StringReader sr = new StringReader("Short content");

        // Act
        CharacterReader reader = new CharacterReader(sr, CharacterReader.maxBufferLen + 1000);

        // Assert
        Assert.assertEquals('S', reader.current());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullReader_shouldThrowException() {
        // Arrange, Act & Assert
        new CharacterReader((Reader) null, 64);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenReaderWithoutMarkSupport_shouldThrowException() {
        // Arrange
        Reader unmarkableReader = new Reader() {
            public int read(char[] cbuf, int off, int len) throws IOException {
                return -1;
            }

            public void close() throws IOException {
            }

            public boolean markSupported() {
                return false;
            }
        };

        // Act & Assert
        new CharacterReader(unmarkableReader);
    }

    @Test(expected = UncheckedIOException.class)
    public void bufferUp_givenReaderThrowingIOException_shouldThrowUncheckedIOException() {
        // Arrange
        Reader failingReader = new Reader() {
            public int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated read failure");
            }

            public void close() throws IOException {
            }

            public boolean markSupported() {
                return true;
            }

            public void mark(int readAheadLimit) throws IOException {
            }

            public void reset() throws IOException {
            }
        };

        // Act & Assert
        new CharacterReader(failingReader, 32);
    }

    @Test
    public void pos_givenConsumptions_shouldTrackCorrectPosition() {
        // Arrange
        CharacterReader reader = new CharacterReader("abcdef");

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
    public void isEmpty_givenEmptyInput_shouldReturnTrue() {
        // Arrange
        CharacterReader reader = new CharacterReader("");

        // Act & Assert
        Assert.assertTrue(reader.isEmpty());
        Assert.assertEquals(CharacterReader.EOF, reader.current());
        Assert.assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void consumeAndCurrent_givenNormalString_shouldReadSequentially() {
        // Arrange
        CharacterReader reader = new CharacterReader("ab");

        // Act & Assert
        Assert.assertEquals('a', reader.current());
        Assert.assertEquals('a', reader.consume());
        Assert.assertEquals('b', reader.current());
        Assert.assertEquals('b', reader.consume());
        Assert.assertEquals(CharacterReader.EOF, reader.current());
        Assert.assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void unconsume_givenConsumedCharacter_shouldStepBack() {
        // Arrange
        CharacterReader reader = new CharacterReader("test");

        // Act
        char c1 = reader.consume();
        reader.unconsume();
        char c2 = reader.consume();

        // Assert
        Assert.assertEquals('t', c1);
        Assert.assertEquals('t', c2);
    }

    @Test
    public void markAndRewindToMark_givenMarkedPosition_shouldRestoreCorrectly() {
        // Arrange
        CharacterReader reader = new CharacterReader("hello world");

        // Act
        reader.consume(); // h
        reader.consume(); // e
        reader.mark();
        reader.consume(); // l
        reader.consume(); // l
        reader.rewindToMark();

        // Assert
        Assert.assertEquals(2, reader.pos());
        Assert.assertEquals('l', reader.current());
    }

    @Test
    public void nextIndexOfChar_givenPresentAndAbsentChars_shouldReturnExpectedIndices() {
        // Arrange
        CharacterReader reader = new CharacterReader("banana");

        // Act & Assert
        Assert.assertEquals(0, reader.nextIndexOf('b'));
        Assert.assertEquals(1, reader.nextIndexOf('a'));
        Assert.assertEquals(2, reader.nextIndexOf('n'));
        Assert.assertEquals(-1, reader.nextIndexOf('z'));

        reader.consume(); // advance to 'a'
        Assert.assertEquals(0, reader.nextIndexOf('a'));
        Assert.assertEquals(-1, reader.nextIndexOf('b'));
    }

    @Test
    public void nextIndexOfCharSequence_givenVariousPatterns_shouldMatchOrReturnNegativeOne() {
        // Arrange
        CharacterReader reader = new CharacterReader("abracadabra");

        // Act & Assert
        Assert.assertEquals(0, reader.nextIndexOf("abra"));
        Assert.assertEquals(4, reader.nextIndexOf("cad"));
        Assert.assertEquals(7, reader.nextIndexOf("abra"));
        Assert.assertEquals(-1, reader.nextIndexOf("notfound"));
        Assert.assertEquals(-1, reader.nextIndexOf("abracadabraz"));
    }

    @Test
    public void nextIndexOfCharSequence_givenPartialPrefixMatch_shouldHandleGracefully() {
        // Arrange
        CharacterReader reader = new CharacterReader("mississippi");

        // Act & Assert
        Assert.assertEquals(2, reader.nextIndexOf("ssis"));
        Assert.assertEquals(5, reader.nextIndexOf("ssip"));
    }

    @Test
    public void consumeToChar_givenCharInString_shouldConsumeUpToChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("foo=bar");

        // Act
        String token = reader.consumeTo('=');

        // Assert
        Assert.assertEquals("foo", token);
        Assert.assertEquals('=', reader.current());
    }

    @Test
    public void consumeToChar_givenCharNotInString_shouldConsumeToEnd() {
        // Arrange
        CharacterReader reader = new CharacterReader("no_delimiters_here");

        // Act
        String token = reader.consumeTo('?');

        // Assert
        Assert.assertEquals("no_delimiters_here", token);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToString_givenSequenceInString_shouldConsumeUpToSequence() {
        // Arrange
        CharacterReader reader = new CharacterReader("start<!--comment-->end");

        // Act
        String token = reader.consumeTo("<!--");

        // Assert
        Assert.assertEquals("start", token);
        Assert.assertTrue(reader.matches("<!--"));
    }

    @Test
    public void consumeToString_givenSequenceNotInString_shouldConsumeToEnd() {
        // Arrange
        CharacterReader reader = new CharacterReader("some text without tag");

        // Act
        String token = reader.consumeTo("</table>");

        // Assert
        Assert.assertEquals("some text without tag", token);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToAny_givenVariousDelimiters_shouldStopAtFirstMatch() {
        // Arrange
        CharacterReader reader = new CharacterReader("key = value; other");

        // Act
        String part1 = reader.consumeToAny('=', ';');
        char delimiter = reader.consume();
        String part2 = reader.consumeToAny(';', 'z');

        // Assert
        Assert.assertEquals("key ", part1);
        Assert.assertEquals('=', delimiter);
        Assert.assertEquals(" value", part2);
    }

    @Test
    public void consumeToAny_givenNoMatch_shouldConsumeToEnd() {
        // Arrange
        CharacterReader reader = new CharacterReader("all_clear");

        // Act
        String consumed = reader.consumeToAny('x', 'y', 'z');

        // Assert
        Assert.assertEquals("all_clear", consumed);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToAny_whenAlreadyAtDelimiter_shouldReturnEmptyString() {
        // Arrange
        CharacterReader reader = new CharacterReader("=value");

        // Act
        String consumed = reader.consumeToAny('=', ';');

        // Assert
        Assert.assertEquals("", consumed);
        Assert.assertEquals('=', reader.current());
    }

    @Test
    public void consumeToAnySorted_givenSortedDelimiters_shouldStopAtFirstMatch() {
        // Arrange
        CharacterReader reader = new CharacterReader("alpha,beta;gamma");
        char[] sortedDelims = new char[] {',', ';'};
        Arrays.sort(sortedDelims);

        // Act
        String token1 = reader.consumeToAnySorted(sortedDelims);
        reader.consume(); // skip delimiter ','
        String token2 = reader.consumeToAnySorted(sortedDelims);

        // Assert
        Assert.assertEquals("alpha", token1);
        Assert.assertEquals("beta", token2);
    }

    @Test
    public void consumeToAnySorted_whenAlreadyAtDelimiter_shouldReturnEmptyString() {
        // Arrange
        CharacterReader reader = new CharacterReader(";gamma");
        char[] sortedDelims = new char[] {',', ';'};
        Arrays.sort(sortedDelims);

        // Act
        String token = reader.consumeToAnySorted(sortedDelims);

        // Assert
        Assert.assertEquals("", token);
        Assert.assertEquals(';', reader.current());
    }

    @Test
    public void consumeData_givenHtmlData_shouldStopAtAmpersandLtOrNull() {
        // Arrange
        CharacterReader reader1 = new CharacterReader("text&amp;");
        CharacterReader reader2 = new CharacterReader("text<tag>");
        CharacterReader reader3 = new CharacterReader("text\u0000null");
        CharacterReader reader4 = new CharacterReader("text_only");

        // Act & Assert
        Assert.assertEquals("text", reader1.consumeData());
        Assert.assertEquals('&', reader1.current());

        Assert.assertEquals("text", reader2.consumeData());
        Assert.assertEquals('<', reader2.current());

        Assert.assertEquals("text", reader3.consumeData());
        Assert.assertEquals('\u0000', reader3.current());

        Assert.assertEquals("text_only", reader4.consumeData());
        Assert.assertTrue(reader4.isEmpty());
    }

    @Test
    public void consumeTagName_givenTagContent_shouldStopAtWhitespaceOrSpecialTagChars() {
        // Arrange
        char[] terminators = new char[] {'\t', '\n', '\r', '\f', ' ', '/', '>', '\u0000'};
        for (int i = 0; i < terminators.length; i++) {
            char term = terminators[i];
            CharacterReader reader = new CharacterReader("div" + term + "more");
            String tag = reader.consumeTagName();
            Assert.assertEquals("div", tag);
            Assert.assertEquals(term, reader.current());
        }

        CharacterReader clean = new CharacterReader("span");
        Assert.assertEquals("span", clean.consumeTagName());
        Assert.assertTrue(clean.isEmpty());
    }

    @Test
    public void consumeLetterSequence_givenMixedInput_shouldConsumeOnlyLetters() {
        // Arrange
        CharacterReader reader = new CharacterReader("HelloWorld123");

        // Act
        String letters = reader.consumeLetterSequence();

        // Assert
        Assert.assertEquals("HelloWorld", letters);
        Assert.assertEquals('1', reader.current());
    }

    @Test
    public void consumeLetterSequence_givenNonAsciiLetter_shouldConsumeLetter() {
        // Arrange
        CharacterReader reader = new CharacterReader("Übungsheft 4");

        // Act
        String letters = reader.consumeLetterSequence();

        // Assert
        Assert.assertEquals("Übungsheft", letters);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void consumeLetterThenDigitSequence_givenLettersAndDigits_shouldConsumeBoth() {
        // Arrange
        CharacterReader reader1 = new CharacterReader("h1header");
        CharacterReader reader2 = new CharacterReader("header");
        CharacterReader reader3 = new CharacterReader("123");

        // Act
        String val1 = reader1.consumeLetterThenDigitSequence();
        String val2 = reader2.consumeLetterThenDigitSequence();
        String val3 = reader3.consumeLetterThenDigitSequence();

        // Assert
        Assert.assertEquals("h1", val1);
        Assert.assertEquals("header", reader1.consumeToEnd());

        Assert.assertEquals("header", val2);
        Assert.assertTrue(reader2.isEmpty());

        Assert.assertEquals("", val3);
        Assert.assertEquals("123", reader3.consumeToEnd());
    }

    @Test
    public void consumeHexSequence_givenHexChars_shouldConsumeValidHexOnly() {
        // Arrange
        CharacterReader reader = new CharacterReader("0123456789abcdefABCDEFghijk");

        // Act
        String hex = reader.consumeHexSequence();

        // Assert
        Assert.assertEquals("0123456789abcdefABCDEF", hex);
        Assert.assertEquals('g', reader.current());
    }

    @Test
    public void consumeDigitSequence_givenDigitChars_shouldConsumeDigitsOnly() {
        // Arrange
        CharacterReader reader = new CharacterReader("9876543210px");

        // Act
        String digits = reader.consumeDigitSequence();

        // Assert
        Assert.assertEquals("9876543210", digits);
        Assert.assertEquals('p', reader.current());
    }

    @Test
    public void matchesChar_givenVariousScenarios_shouldMatchCorrectly() {
        // Arrange
        CharacterReader reader = new CharacterReader("div");

        // Act & Assert
        Assert.assertTrue(reader.matches('d'));
        Assert.assertFalse(reader.matches('i'));

        reader.consumeToEnd();
        Assert.assertFalse(reader.matches('d'));
    }

    @Test
    public void matchesString_givenExactOrDifferentString_shouldReturnBoolean() {
        // Arrange
        CharacterReader reader = new CharacterReader("div class='test'");

        // Act & Assert
        Assert.assertTrue(reader.matches("div"));
        Assert.assertFalse(reader.matches("span"));
        Assert.assertFalse(reader.matches("div class='test' AND LONGER TEXT"));

        reader.consumeToEnd();
        Assert.assertFalse(reader.matches("div"));
    }

    @Test
    public void matchesIgnoreCase_givenMixedCaseString_shouldMatchInsensitive() {
        // Arrange
        CharacterReader reader = new CharacterReader("DIV class='test'");

        // Act & Assert
        Assert.assertTrue(reader.matchesIgnoreCase("div"));
        Assert.assertTrue(reader.matchesIgnoreCase("DIV"));
        Assert.assertFalse(reader.matchesIgnoreCase("SPAN"));
        Assert.assertFalse(reader.matchesIgnoreCase("DIV class='test' TOO LONG"));

        reader.consumeToEnd();
        Assert.assertFalse(reader.matchesIgnoreCase("DIV"));
    }

    @Test
    public void matchesAny_givenCharList_shouldReturnTrueIfCurrentMatchesAny() {
        // Arrange
        CharacterReader reader = new CharacterReader("hello");

        // Act & Assert
        Assert.assertTrue(reader.matchesAny('x', 'h', 'z'));
        Assert.assertFalse(reader.matchesAny('a', 'b', 'c'));

        reader.consumeToEnd();
        Assert.assertFalse(reader.matchesAny('h'));
    }

    @Test
    public void matchesAnySorted_givenSortedChars_shouldReturnTrueIfMatches() {
        // Arrange
        CharacterReader reader = new CharacterReader("hello");
        char[] sortedMatch = new char[] {'e', 'h', 'z'};
        char[] sortedNoMatch = new char[] {'a', 'b', 'c'};
        Arrays.sort(sortedMatch);
        Arrays.sort(sortedNoMatch);

        // Act & Assert
        Assert.assertTrue(reader.matchesAnySorted(sortedMatch));
        Assert.assertFalse(reader.matchesAnySorted(sortedNoMatch));

        reader.consumeToEnd();
        Assert.assertFalse(reader.matchesAnySorted(sortedMatch));
    }

    @Test
    public void matchesLetter_givenDifferentChars_shouldIdentifyLetters() {
        // Arrange
        CharacterReader r1 = new CharacterReader("abc");
        CharacterReader r2 = new CharacterReader("XYZ");
        CharacterReader r3 = new CharacterReader("123");
        CharacterReader r4 = new CharacterReader("$#@");
        CharacterReader r5 = new CharacterReader("");

        // Act & Assert
        Assert.assertTrue(r1.matchesLetter());
        Assert.assertTrue(r2.matchesLetter());
        Assert.assertFalse(r3.matchesLetter());
        Assert.assertFalse(r4.matchesLetter());
        Assert.assertFalse(r5.matchesLetter());
    }

    @Test
    public void matchesDigit_givenDifferentChars_shouldIdentifyDigits() {
        // Arrange
        CharacterReader r1 = new CharacterReader("012");
        CharacterReader r2 = new CharacterReader("987");
        CharacterReader r3 = new CharacterReader("abc");
        CharacterReader r4 = new CharacterReader("");

        // Act & Assert
        Assert.assertTrue(r1.matchesDigit());
        Assert.assertTrue(r2.matchesDigit());
        Assert.assertFalse(r3.matchesDigit());
        Assert.assertFalse(r4.matchesDigit());
    }

    @Test
    public void matchConsume_givenMatchingAndNonMatchingString_shouldAdvanceOnlyOnMatch() {
        // Arrange
        CharacterReader reader = new CharacterReader("target text");

        // Act & Assert
        Assert.assertFalse(reader.matchConsume("missing"));
        Assert.assertEquals(0, reader.pos());

        Assert.assertTrue(reader.matchConsume("target"));
        Assert.assertEquals(6, reader.pos());
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void matchConsumeIgnoreCase_givenDifferentCase_shouldAdvanceOnlyOnMatch() {
        // Arrange
        CharacterReader reader = new CharacterReader("TARGET text");

        // Act & Assert
        Assert.assertFalse(reader.matchConsumeIgnoreCase("missing"));
        Assert.assertEquals(0, reader.pos());

        Assert.assertTrue(reader.matchConsumeIgnoreCase("target"));
        Assert.assertEquals(6, reader.pos());
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void containsIgnoreCase_givenSearchedString_shouldFindPresence() {
        // Arrange
        CharacterReader reader = new CharacterReader("prelude </TITLE> epilogue");

        // Act & Assert
        Assert.assertTrue(reader.containsIgnoreCase("</title>"));
        Assert.assertTrue(reader.containsIgnoreCase("</TITLE>"));
        Assert.assertFalse(reader.containsIgnoreCase("</style>"));
    }

    @Test
    public void rangeEquals_givenBufferSubranges_shouldValidateEquality() {
        // Arrange
        CharacterReader reader = new CharacterReader("sample text for equality");

        // Act & Assert
        Assert.assertTrue(reader.rangeEquals(0, 6, "sample"));
        Assert.assertFalse(reader.rangeEquals(0, 6, "simple"));
        Assert.assertFalse(reader.rangeEquals(0, 5, "sample"));
        Assert.assertTrue(CharacterReader.rangeEquals("sample".toCharArray(), 0, 6, "sample"));
        Assert.assertFalse(CharacterReader.rangeEquals("sample".toCharArray(), 0, 5, "sample"));
        Assert.assertFalse(CharacterReader.rangeEquals("sample".toCharArray(), 0, 6, "sampXX"));
    }

    @Test
    public void cacheString_givenRepeatedAndOverlongStrings_shouldCacheAndEvictProperly() {
        // Arrange - Strings shorter than or equal to 12 chars should be cached; longer ones not cached.
        CharacterReader reader = new CharacterReader("div div div this_is_a_very_long_tag_name");

        // Act
        String t1 = reader.consumeTagName(); // "div"
        reader.consume(); // space
        String t2 = reader.consumeTagName(); // "div"
        reader.consume(); // space
        String t3 = reader.consumeTagName(); // "div"
        reader.consume(); // space
        String longTag = reader.consumeTagName(); // "this_is_a_very_long_tag_name"

        // Assert
        Assert.assertEquals("div", t1);
        Assert.assertSame(t1, t2);
        Assert.assertSame(t2, t3);
        Assert.assertEquals("this_is_a_very_long_tag_name", longTag);
    }

    @Test
    public void bufferUp_givenLargeContentExceedingSplitPoint_shouldBufferSeamlessly() {
        // Arrange - generate text larger than CharacterReader.maxBufferLen (32768)
        int size = CharacterReader.maxBufferLen + 2048;
        char[] content = new char[size];
        for (int i = 0; i < size; i++) {
            content[i] = (char) ('a' + (i % 26));
        }
        content[size - 5] = 'Z';
        String text = new String(content);

        // Act
        CharacterReader reader = new CharacterReader(new StringReader(text), CharacterReader.maxBufferLen);

        // Consume until near buffer split point and past it
        String consumed = reader.consumeTo('Z');

        // Assert
        Assert.assertEquals(size - 5, consumed.length());
        Assert.assertEquals('Z', reader.consume());
        Assert.assertEquals(content[size - 4], reader.consume());
        Assert.assertFalse(reader.isEmpty());
    }

    @Test
    public void toString_givenReaderState_shouldReturnRemainingString() {
        // Arrange
        CharacterReader reader = new CharacterReader("remaining content");

        // Act
        reader.consumeTo(' ');
        reader.consume(); // space
        String rest = reader.toString();

        // Assert
        Assert.assertEquals("content", rest);
    }
}