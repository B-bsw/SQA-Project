package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullReader_shouldThrowException() {
        new CharacterReader((Reader) null, 1024);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenReaderWithoutMarkSupport_shouldThrowException() {
        Reader nonMarkReader = new Reader() {
            public int read(char[] cbuf, int off, int len) throws IOException {
                return -1;
            }

            public void close() throws IOException {
            }

            public boolean markSupported() {
                return false;
            }
        };
        new CharacterReader(nonMarkReader);
    }

    @Test
    public void constructor_givenBufferLargerThanMax_shouldCapAtMaxBufferLen() {
        CharacterReader reader = new CharacterReader(new StringReader("test"), CharacterReader.maxBufferLen + 5000);
        Assert.assertEquals("test", reader.toString());
    }

    @Test(expected = UncheckedIOException.class)
    public void constructor_givenReaderThrowingIOException_shouldThrowUncheckedIOException() {
        Reader errorReader = new Reader() {
            public int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated IO fault");
            }

            public void close() throws IOException {
            }

            public boolean markSupported() {
                return true;
            }
        };
        new CharacterReader(errorReader);
    }

    @Test
    public void pos_givenVariousOperations_shouldTrackCursorCorrectly() {
        CharacterReader reader = new CharacterReader("abcdef");
        Assert.assertEquals(0, reader.pos());
        reader.consume();
        Assert.assertEquals(1, reader.pos());
        reader.advance();
        Assert.assertEquals(2, reader.pos());
        reader.unconsume();
        Assert.assertEquals(1, reader.pos());
    }

    @Test
    public void isEmpty_givenEmptyAndNonEmptyInputs_shouldReturnExpected() {
        CharacterReader emptyReader = new CharacterReader("");
        Assert.assertTrue(emptyReader.isEmpty());

        CharacterReader nonEmptyReader = new CharacterReader("a");
        Assert.assertFalse(nonEmptyReader.isEmpty());
        nonEmptyReader.consume();
        Assert.assertTrue(nonEmptyReader.isEmpty());
    }

    @Test
    public void current_whenAtDataAndAtEof_shouldReturnCharOrEof() {
        CharacterReader reader = new CharacterReader("ab");
        Assert.assertEquals('a', reader.current());
        reader.advance();
        Assert.assertEquals('b', reader.current());
        reader.advance();
        Assert.assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void consume_whenReadingContent_shouldReturnExpectedAndAdvance() {
        CharacterReader reader = new CharacterReader("xyz");
        Assert.assertEquals('x', reader.consume());
        Assert.assertEquals('y', reader.consume());
        Assert.assertEquals('z', reader.consume());
        Assert.assertEquals(CharacterReader.EOF, reader.consume());
        Assert.assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void markAndRewind_shouldRestoreCursorToMarkedPosition() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consume(); // pos 1
        reader.consume(); // pos 2
        reader.mark();

        reader.consume(); // pos 3
        reader.consume(); // pos 4
        Assert.assertEquals('e', reader.current());

        reader.rewindToMark();
        Assert.assertEquals(2, reader.pos());
        Assert.assertEquals('c', reader.current());
    }

    @Test
    public void nextIndexOfChar_whenPresentOrAbsent_shouldReturnOffsetOrMinusOne() {
        CharacterReader reader = new CharacterReader("hello world");
        Assert.assertEquals(4, reader.nextIndexOf('o'));
        Assert.assertEquals(-1, reader.nextIndexOf('z'));

        reader.consumeTo(' ');
        reader.consume(); // skip space
        Assert.assertEquals(1, reader.nextIndexOf('o'));
    }

    @Test
    public void nextIndexOfSeq_whenPresentOrAbsent_shouldReturnOffsetOrMinusOne() {
        CharacterReader reader = new CharacterReader("abracadabra");
        Assert.assertEquals(7, reader.nextIndexOf("dab"));
        Assert.assertEquals(0, reader.nextIndexOf("abra"));
        Assert.assertEquals(-1, reader.nextIndexOf("zebra"));
        Assert.assertEquals(-1, reader.nextIndexOf("abracadabrazzz"));

        CharacterReader shortReader = new CharacterReader("abc");
        Assert.assertEquals(-1, shortReader.nextIndexOf("abcd"));
    }

    @Test
    public void consumeToChar_whenFoundAndNotFound_shouldConsumeProperly() {
        CharacterReader reader = new CharacterReader("foo;bar");
        String consumed = reader.consumeTo(';');
        Assert.assertEquals("foo", consumed);
        Assert.assertEquals(';', reader.current());

        String remaining = reader.consumeTo('z');
        Assert.assertEquals(";bar", remaining);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToString_whenFoundAndNotFound_shouldConsumeProperly() {
        CharacterReader reader = new CharacterReader("start<!--comment-->end");
        String prefix = reader.consumeTo("<!--");
        Assert.assertEquals("start", prefix);
        Assert.assertTrue(reader.matches("<!--"));

        String rest = reader.consumeTo("notfound");
        Assert.assertEquals("<!--comment-->end", rest);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToAny_whenDelimitersEncountered_shouldStopAtFirstMatch() {
        CharacterReader reader = new CharacterReader("hello <world> and &more");
        String part1 = reader.consumeToAny('&', '<');
        Assert.assertEquals("hello ", part1);
        Assert.assertEquals('<', reader.current());

        reader.consume(); // skip '<'
        String part2 = reader.consumeToAny('>', '&');
        Assert.assertEquals("world", part2);
        Assert.assertEquals('>', reader.current());

        reader.consume(); // skip '>'
        String part3 = reader.consumeToAny('x', 'y', 'z');
        Assert.assertEquals(" and &more", part3);
        Assert.assertTrue(reader.isEmpty());

        String emptyResult = reader.consumeToAny('a', 'b');
        Assert.assertEquals("", emptyResult);
    }

    @Test
    public void consumeToAnySorted_whenDelimitersEncountered_shouldStopAtMatch() {
        char[] sortedDelims = new char[]{'&', '<', '>'};
        CharacterReader reader = new CharacterReader("text<tag>more&rest");

        String part1 = reader.consumeToAnySorted(sortedDelims);
        Assert.assertEquals("text", part1);
        Assert.assertEquals('<', reader.current());

        reader.consume();
        String part2 = reader.consumeToAnySorted(sortedDelims);
        Assert.assertEquals("tag", part2);
        Assert.assertEquals('>', reader.current());

        reader.consume();
        String part3 = reader.consumeToAnySorted(sortedDelims);
        Assert.assertEquals("more", part3);
        Assert.assertEquals('&', reader.current());

        reader.consume();
        String part4 = reader.consumeToAnySorted(sortedDelims);
        Assert.assertEquals("rest", part4);
        Assert.assertTrue(reader.isEmpty());

        String part5 = reader.consumeToAnySorted(sortedDelims);
        Assert.assertEquals("", part5);
    }

    @Test
    public void consumeData_shouldStopAtAmpersandLtOrNull() {
        CharacterReader reader1 = new CharacterReader("hello&world");
        Assert.assertEquals("hello", reader1.consumeData());
        Assert.assertEquals('&', reader1.current());

        CharacterReader reader2 = new CharacterReader("data<div");
        Assert.assertEquals("data", reader2.consumeData());
        Assert.assertEquals('<', reader2.current());

        CharacterReader reader3 = new CharacterReader("data\u0000rest");
        Assert.assertEquals("data", reader3.consumeData());
        Assert.assertEquals('\u0000', reader3.current());

        CharacterReader reader4 = new CharacterReader("&start");
        Assert.assertEquals("", reader4.consumeData());
    }

    @Test
    public void consumeTagName_shouldStopAtDelimiters() {
        char[] delimiters = new char[]{'\t', '\n', '\r', '\f', ' ', '/', '>', '\u0000'};
        for (int i = 0; i < delimiters.length; i++) {
            char d = delimiters[i];
            CharacterReader reader = new CharacterReader("tag" + d + "tail");
            Assert.assertEquals("tag", reader.consumeTagName());
            Assert.assertEquals(d, reader.current());
        }

        CharacterReader emptyReader = new CharacterReader("/div");
        Assert.assertEquals("", emptyReader.consumeTagName());
    }

    @Test
    public void consumeLetterSequence_shouldConsumeOnlyLetters() {
        CharacterReader reader = new CharacterReader("Hello123World");
        Assert.assertEquals("Hello", reader.consumeLetterSequence());
        Assert.assertEquals('1', reader.current());

        CharacterReader readerNonAscii = new CharacterReader("สวัสดี123");
        Assert.assertEquals("สวัสดี", readerNonAscii.consumeLetterSequence());

        CharacterReader symbolReader = new CharacterReader("!abc");
        Assert.assertEquals("", symbolReader.consumeLetterSequence());
    }

    @Test
    public void consumeLetterThenDigitSequence_shouldConsumeLettersFollowedByDigits() {
        CharacterReader reader = new CharacterReader("h123-rest");
        Assert.assertEquals("h123", reader.consumeLetterThenDigitSequence());
        Assert.assertEquals('-', reader.current());

        CharacterReader nonDigitFollow = new CharacterReader("hello world");
        Assert.assertEquals("hello", nonDigitFollow.consumeLetterThenDigitSequence());

        CharacterReader digitOnly = new CharacterReader("123abc");
        Assert.assertEquals("123", digitOnly.consumeLetterThenDigitSequence());

        CharacterReader neither = new CharacterReader("@123");
        Assert.assertEquals("", neither.consumeLetterThenDigitSequence());
    }

    @Test
    public void consumeHexSequence_shouldConsumeValidHexDigits() {
        CharacterReader reader = new CharacterReader("1A2f9z0");
        Assert.assertEquals("1A2f9", reader.consumeHexSequence());
        Assert.assertEquals('z', reader.current());

        CharacterReader nonHex = new CharacterReader("ghij");
        Assert.assertEquals("", nonHex.consumeHexSequence());
    }

    @Test
    public void consumeDigitSequence_shouldConsumeDigitsOnly() {
        CharacterReader reader = new CharacterReader("12345abc");
        Assert.assertEquals("12345", reader.consumeDigitSequence());
        Assert.assertEquals('a', reader.current());

        CharacterReader nonDigit = new CharacterReader("abc123");
        Assert.assertEquals("", nonDigit.consumeDigitSequence());
    }

    @Test
    public void matchesChar_givenVariousChars_shouldMatchExpected() {
        CharacterReader reader = new CharacterReader("hello");
        Assert.assertTrue(reader.matches('h'));
        Assert.assertFalse(reader.matches('e'));

        CharacterReader emptyReader = new CharacterReader("");
        Assert.assertFalse(emptyReader.matches('h'));
    }

    @Test
    public void matchesString_givenExactOrDifferentString_shouldMatchProperly() {
        CharacterReader reader = new CharacterReader("jsoup test");
        Assert.assertTrue(reader.matches("jsoup"));
        Assert.assertFalse(reader.matches("jsoupx"));
        Assert.assertFalse(reader.matches("jsoup test extra long string beyond length"));

        CharacterReader shortReader = new CharacterReader("abc");
        Assert.assertFalse(shortReader.matches("abcd"));
    }

    @Test
    public void matchesIgnoreCase_givenCases_shouldMatchInsensitively() {
        CharacterReader reader = new CharacterReader("HTMLParser");
        Assert.assertTrue(reader.matchesIgnoreCase("html"));
        Assert.assertTrue(reader.matchesIgnoreCase("HTML"));
        Assert.assertTrue(reader.matchesIgnoreCase("Html"));
        Assert.assertFalse(reader.matchesIgnoreCase("xml"));
        Assert.assertFalse(reader.matchesIgnoreCase("HTMLParserAndMore"));
    }

    @Test
    public void matchesAny_givenChars_shouldReturnTrueIfMatched() {
        CharacterReader reader = new CharacterReader("alpha");
        Assert.assertTrue(reader.matchesAny('x', 'y', 'a'));
        Assert.assertFalse(reader.matchesAny('b', 'c', 'd'));

        CharacterReader emptyReader = new CharacterReader("");
        Assert.assertFalse(emptyReader.matchesAny('a', 'b'));
    }

    @Test
    public void matchesAnySorted_givenSortedChars_shouldMatchProperly() {
        char[] sorted = new char[]{'a', 'e', 'i', 'o', 'u'};
        Arrays.sort(sorted);

        CharacterReader reader = new CharacterReader("apple");
        Assert.assertTrue(reader.matchesAnySorted(sorted));

        CharacterReader reader2 = new CharacterReader("banana");
        Assert.assertFalse(reader2.matchesAnySorted(sorted));

        CharacterReader emptyReader = new CharacterReader("");
        Assert.assertFalse(emptyReader.matchesAnySorted(sorted));
    }

    @Test
    public void matchesLetter_givenVariousChars_shouldValidateLetter() {
        CharacterReader letterReader = new CharacterReader("Alpha");
        Assert.assertTrue(letterReader.matchesLetter());

        CharacterReader digitReader = new CharacterReader("123");
        Assert.assertFalse(digitReader.matchesLetter());

        CharacterReader unicodeReader = new CharacterReader("กขค");
        Assert.assertTrue(unicodeReader.matchesLetter());

        CharacterReader emptyReader = new CharacterReader("");
        Assert.assertFalse(emptyReader.matchesLetter());
    }

    @Test
    public void matchesDigit_givenDigitsAndNonDigits_shouldValidateDigit() {
        CharacterReader digitReader = new CharacterReader("987");
        Assert.assertTrue(digitReader.matchesDigit());

        CharacterReader letterReader = new CharacterReader("xyz");
        Assert.assertFalse(letterReader.matchesDigit());

        CharacterReader emptyReader = new CharacterReader("");
        Assert.assertFalse(emptyReader.matchesDigit());
    }

    @Test
    public void matchConsume_whenMatchOrMismatch_shouldAdvanceOrStay() {
        CharacterReader reader = new CharacterReader("<div>content</div>");
        Assert.assertTrue(reader.matchConsume("<div>"));
        Assert.assertEquals("content</div>", reader.toString());

        Assert.assertFalse(reader.matchConsume("<span>"));
        Assert.assertEquals("content</div>", reader.toString());
    }

    @Test
    public void matchConsumeIgnoreCase_whenMatchOrMismatch_shouldAdvanceOrStay() {
        CharacterReader reader = new CharacterReader("<DIV>content</DIV>");
        Assert.assertTrue(reader.matchConsumeIgnoreCase("<div>"));
        Assert.assertEquals("content</DIV>", reader.toString());

        Assert.assertFalse(reader.matchConsumeIgnoreCase("<span>"));
        Assert.assertEquals("content</DIV>", reader.toString());
    }

    @Test
    public void containsIgnoreCase_whenPresentOrAbsent_shouldReturnExpected() {
        CharacterReader reader = new CharacterReader("<html><BODY>test</boDY></html>");
        Assert.assertTrue(reader.containsIgnoreCase("</body"));
        Assert.assertTrue(reader.containsIgnoreCase("</BODY"));
        Assert.assertFalse(reader.containsIgnoreCase("</head>"));
    }

    @Test
    public void toString_shouldReturnRemainingUnconsumedContent() {
        CharacterReader reader = new CharacterReader("Sample content string");
        Assert.assertEquals("Sample content string", reader.toString());

        reader.consumeTo(' ');
        reader.consume();
        Assert.assertEquals("content string", reader.toString());
    }

    @Test
    public void cacheString_shouldHandleCacheHitAndCacheCollisionAndLargeStrings() {
        CharacterReader reader = new CharacterReader("tag tag longerthantwelvechars longerthantwelvechars");
        String firstTag = reader.consumeTo(' ');
        reader.consume(); // space
        String secondTag = reader.consumeTo(' ');
        reader.consume(); // space

        Assert.assertSame(firstTag, secondTag);

        String longStr1 = reader.consumeTo(' ');
        reader.consume(); // space
        String longStr2 = reader.consumeToEnd();

        Assert.assertEquals("longerthantwelvechars", longStr1);
        Assert.assertEquals("longerthantwelvechars", longStr2);
        Assert.assertNotSame(longStr1, longStr2);
    }

    @Test
    public void rangeEquals_givenMatchingAndMismatchingInputs_shouldReturnExpected() {
        CharacterReader reader = new CharacterReader("abcdef");
        Assert.assertTrue(reader.rangeEquals(0, 3, "abc"));
        Assert.assertFalse(reader.rangeEquals(0, 3, "abd"));
        Assert.assertFalse(reader.rangeEquals(0, 2, "abc"));
        Assert.assertFalse(reader.rangeEquals(0, 4, "abc"));
    }

    @Test
    public void bufferUp_givenStreamExceedingBufferSplitPoint_shouldRefillBufferSeamlessly() {
        int largeSize = CharacterReader.maxBufferLen + 1000;
        char[] largeData = new char[largeSize];
        for (int i = 0; i < largeSize; i++) {
            largeData[i] = (char) ('a' + (i % 26));
        }
        String largeString = new String(largeData);

        CharacterReader reader = new CharacterReader(largeString);
        int halfWay = (int) (CharacterReader.maxBufferLen * 0.80);
        for (int i = 0; i < halfWay; i++) {
            reader.consume();
        }

        // Trigger bufferUp by advancing beyond split point
        char next = reader.consume();
        Assert.assertEquals(largeData[halfWay], next);

        String remaining = reader.consumeToEnd();
        Assert.assertEquals(largeString.substring(halfWay + 1), remaining);
    }
}