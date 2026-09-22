package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

public class CharacterReaderTest {

    private static class UnmarkableReader extends Reader {
        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            return -1;
        }

        @Override
        public void close() throws IOException {
        }

        @Override
        public boolean markSupported() {
            return false;
        }
    }

    private static class FailingReader extends Reader {
        private final boolean failOnSkip;
        private final boolean failOnRead;
        private final boolean failOnReset;

        FailingReader(boolean failOnSkip, boolean failOnRead, boolean failOnReset) {
            this.failOnSkip = failOnSkip;
            this.failOnRead = failOnRead;
            this.failOnReset = failOnReset;
        }

        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            if (failOnRead) {
                throw new IOException("Simulated read exception");
            }
            return -1;
        }

        @Override
        public long skip(long n) throws IOException {
            if (failOnSkip) {
                throw new IOException("Simulated skip exception");
            }
            return super.skip(n);
        }

        @Override
        public void reset() throws IOException {
            if (failOnReset) {
                throw new IOException("Simulated reset exception");
            }
            super.reset();
        }

        @Override
        public void mark(int readAheadLimit) throws IOException {
        }

        @Override
        public void close() throws IOException {
        }

        @Override
        public boolean markSupported() {
            return true;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullReader_shouldThrowException() {
        new CharacterReader((Reader) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenUnmarkableReader_shouldThrowException() {
        new CharacterReader(new UnmarkableReader());
    }

    @Test
    public void constructor_givenSizeLargerThanMaxBuffer_shouldCapToMaxBuffer() {
        String data = "LargeBufferTest";
        CharacterReader reader = new CharacterReader(new StringReader(data), CharacterReader.maxBufferLen + 100);
        Assert.assertEquals('L', reader.current());
        Assert.assertEquals(data, reader.consumeToEnd());
    }

    @Test
    public void constructor_givenValidString_shouldInitializeCorrectly() {
        CharacterReader reader = new CharacterReader("Hello");
        Assert.assertEquals(0, reader.pos());
        Assert.assertEquals('H', reader.current());
        Assert.assertFalse(reader.isEmpty());
    }

    @Test(expected = UncheckedIOException.class)
    public void bufferUp_givenReaderThrowingIOException_shouldThrowUncheckedIOException() {
        new CharacterReader(new FailingReader(false, true, false));
    }

    @Test
    public void pos_givenConsumeAndAdvance_shouldTrackCursorPosition() {
        CharacterReader reader = new CharacterReader("abcdef");
        Assert.assertEquals(0, reader.pos());
        reader.consume();
        Assert.assertEquals(1, reader.pos());
        reader.advance();
        Assert.assertEquals(2, reader.pos());
        reader.consumeTo('e');
        Assert.assertEquals(4, reader.pos());
    }

    @Test
    public void isEmpty_givenEmptyString_shouldReturnTrue() {
        CharacterReader reader = new CharacterReader("");
        Assert.assertTrue(reader.isEmpty());
        Assert.assertEquals(CharacterReader.EOF, reader.current());
        Assert.assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void isEmpty_givenNonEmptyString_shouldReturnFalseUntilConsumed() {
        CharacterReader reader = new CharacterReader("a");
        Assert.assertFalse(reader.isEmpty());
        char c = reader.consume();
        Assert.assertEquals('a', c);
        Assert.assertTrue(reader.isEmpty());
        Assert.assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test(expected = UncheckedIOException.class)
    public void unconsume_whenAtStartOfBuffer_shouldThrowUncheckedIOException() {
        CharacterReader reader = new CharacterReader("test");
        reader.unconsume();
    }

    @Test
    public void unconsume_afterConsume_shouldRewindOneChar() {
        CharacterReader reader = new CharacterReader("abc");
        char c1 = reader.consume();
        Assert.assertEquals('a', c1);
        Assert.assertEquals(1, reader.pos());
        reader.unconsume();
        Assert.assertEquals(0, reader.pos());
        Assert.assertEquals('a', reader.current());
    }

    @Test(expected = UncheckedIOException.class)
    public void rewindToMark_withoutMark_shouldThrowUncheckedIOException() {
        CharacterReader reader = new CharacterReader("test");
        reader.rewindToMark();
    }

    @Test
    public void markAndRewindToMark_givenMark_shouldRewindToMarkedPos() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consume(); // at 'b', pos 1
        reader.mark();
        reader.consume(); // at 'c', pos 2
        reader.consume(); // at 'd', pos 3
        Assert.assertEquals(3, reader.pos());
        reader.rewindToMark();
        Assert.assertEquals(1, reader.pos());
        Assert.assertEquals('b', reader.current());
    }

    @Test
    public void nextIndexOf_givenChar_shouldReturnCorrectOffset() {
        CharacterReader reader = new CharacterReader("one two three");
        Assert.assertEquals(3, reader.nextIndexOf(' '));
        Assert.assertEquals(0, reader.nextIndexOf('o'));
        Assert.assertEquals(-1, reader.nextIndexOf('z'));

        reader.consumeTo('t');
        Assert.assertEquals(0, reader.nextIndexOf('t'));
        Assert.assertEquals(3, reader.nextIndexOf(' '));
    }

    @Test
    public void nextIndexOf_givenCharSequence_shouldReturnCorrectOffset() {
        CharacterReader reader = new CharacterReader("abc 123 def 123");
        Assert.assertEquals(4, reader.nextIndexOf("123"));
        Assert.assertEquals(-1, reader.nextIndexOf("xyz"));
        Assert.assertEquals(-1, reader.nextIndexOf("1234567890"));

        CharacterReader readerMismatch = new CharacterReader("abxabyabz");
        Assert.assertEquals(6, readerMismatch.nextIndexOf("abz"));
        Assert.assertEquals(-1, readerMismatch.nextIndexOf("abw"));
    }

    @Test
    public void nextIndexOf_givenPartialMatchAtBufferEnd_shouldReturnMinusOne() {
        CharacterReader reader = new CharacterReader("hello world");
        Assert.assertEquals(-1, reader.nextIndexOf("world!"));
    }

    @Test
    public void consumeTo_givenCharPresent_shouldConsumeUpToChar() {
        CharacterReader reader = new CharacterReader("foo=bar");
        String consumed = reader.consumeTo('=');
        Assert.assertEquals("foo", consumed);
        Assert.assertEquals('=', reader.current());
    }

    @Test
    public void consumeTo_givenCharNotPresent_shouldConsumeToEnd() {
        CharacterReader reader = new CharacterReader("foobar");
        String consumed = reader.consumeTo('=');
        Assert.assertEquals("foobar", consumed);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeTo_givenStringSequencePresent_shouldConsumeUpToSequence() {
        CharacterReader reader = new CharacterReader("start<!--comment-->end");
        String consumed = reader.consumeTo("<!--");
        Assert.assertEquals("start", consumed);
        Assert.assertEquals('<', reader.current());
    }

    @Test
    public void consumeTo_givenStringSequenceNotPresent_shouldConsumeToEnd() {
        CharacterReader reader = new CharacterReader("start comment end");
        String consumed = reader.consumeTo("<!--");
        Assert.assertEquals("start comment end", consumed);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToAny_givenChars_shouldConsumeUntilFirstDelimiter() {
        CharacterReader reader = new CharacterReader("first;second,third");
        String consumed1 = reader.consumeToAny(';', ',');
        Assert.assertEquals("first", consumed1);
        Assert.assertEquals(';', reader.consume());

        String consumed2 = reader.consumeToAny(';', ',');
        Assert.assertEquals("second", consumed2);
        Assert.assertEquals(',', reader.consume());

        String consumed3 = reader.consumeToAny(';', ',');
        Assert.assertEquals("third", consumed3);
        Assert.assertTrue(reader.isEmpty());

        String consumedEmpty = reader.consumeToAny(';', ',');
        Assert.assertEquals("", consumedEmpty);
    }

    @Test
    public void consumeToAnySorted_givenSortedChars_shouldConsumeUntilMatchedChar() {
        char[] sortedDelims = new char[]{',', ';'};
        CharacterReader reader = new CharacterReader("first;second,third");
        String consumed1 = reader.consumeToAnySorted(sortedDelims);
        Assert.assertEquals("first", consumed1);
        Assert.assertEquals(';', reader.consume());

        String consumed2 = reader.consumeToAnySorted(sortedDelims);
        Assert.assertEquals("second", consumed2);
        Assert.assertEquals(',', reader.consume());

        String consumed3 = reader.consumeToAnySorted(sortedDelims);
        Assert.assertEquals("third", consumed3);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeData_givenSpecialDataChars_shouldStopAtAmpersandLessThanOrNullChar() {
        CharacterReader readerAmp = new CharacterReader("foo&bar");
        Assert.assertEquals("foo", readerAmp.consumeData());
        Assert.assertEquals('&', readerAmp.current());

        CharacterReader readerTag = new CharacterReader("div<span");
        Assert.assertEquals("div", readerTag.consumeData());
        Assert.assertEquals('<', readerTag.current());

        CharacterReader readerNull = new CharacterReader("data\u0000rest");
        Assert.assertEquals("data", readerNull.consumeData());
        Assert.assertEquals('\u0000', readerNull.current());

        CharacterReader readerPlain = new CharacterReader("plainText");
        Assert.assertEquals("plainText", readerPlain.consumeData());
        Assert.assertTrue(readerPlain.isEmpty());

        Assert.assertEquals("", readerPlain.consumeData());
    }

    @Test
    public void consumeTagName_givenVariousDelimiters_shouldStopCorrectly() {
        char[] delimiters = new char[]{'\t', '\n', '\r', '\f', ' ', '/', '>', '<', '\u0000'};
        for (int i = 0; i < delimiters.length; i++) {
            char d = delimiters[i];
            CharacterReader reader = new CharacterReader("tag" + d + "more");
            Assert.assertEquals("tag", reader.consumeTagName());
            Assert.assertEquals(d, reader.current());
        }

        CharacterReader plainReader = new CharacterReader("justTagName");
        Assert.assertEquals("justTagName", plainReader.consumeTagName());
        Assert.assertTrue(plainReader.isEmpty());
        Assert.assertEquals("", plainReader.consumeTagName());
    }

    @Test
    public void consumeToEnd_givenContent_shouldReturnAllRemainingAndEmptyBuffer() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consume();
        reader.consume();
        String remaining = reader.consumeToEnd();
        Assert.assertEquals("cdef", remaining);
        Assert.assertTrue(reader.isEmpty());
        Assert.assertEquals("", reader.consumeToEnd());
    }

    @Test
    public void consumeLetterSequence_givenLettersAndNonLetters_shouldConsumeOnlyLetters() {
        CharacterReader reader = new CharacterReader("HelloWorld123");
        Assert.assertEquals("HelloWorld", reader.consumeLetterSequence());
        Assert.assertEquals('1', reader.current());

        CharacterReader readerNonAscii = new CharacterReader("Äpfel!");
        Assert.assertEquals("Äpfel", readerNonAscii.consumeLetterSequence());
        Assert.assertEquals('!', readerNonAscii.current());

        CharacterReader readerEmpty = new CharacterReader("123");
        Assert.assertEquals("", readerEmpty.consumeLetterSequence());
    }

    @Test
    public void consumeLetterThenDigitSequence_givenLetterThenDigit_shouldConsumeAppropriately() {
        CharacterReader reader1 = new CharacterReader("abc123def");
        Assert.assertEquals("abc123", reader1.consumeLetterThenDigitSequence());
        Assert.assertEquals('d', reader1.current());

        CharacterReader readerLettersOnly = new CharacterReader("lettersOnly");
        Assert.assertEquals("lettersOnly", readerLettersOnly.consumeLetterThenDigitSequence());
        Assert.assertTrue(readerLettersOnly.isEmpty());

        CharacterReader readerDigitsOnly = new CharacterReader("123abc");
        Assert.assertEquals("123", readerDigitsOnly.consumeLetterThenDigitSequence());
        Assert.assertEquals('a', readerDigitsOnly.current());

        CharacterReader readerSpecial = new CharacterReader("!@#");
        Assert.assertEquals("", readerSpecial.consumeLetterThenDigitSequence());
    }

    @Test
    public void consumeHexSequence_givenHexChars_shouldConsumeValidHexPrefix() {
        CharacterReader reader = new CharacterReader("0123456789abcdefABCDEFxyz");
        Assert.assertEquals("0123456789abcdefABCDEF", reader.consumeHexSequence());
        Assert.assertEquals('x', reader.current());

        CharacterReader nonHex = new CharacterReader("xyz");
        Assert.assertEquals("", nonHex.consumeHexSequence());
    }

    @Test
    public void consumeDigitSequence_givenDigits_shouldConsumeDigitsOnly() {
        CharacterReader reader = new CharacterReader("1234567890abc");
        Assert.assertEquals("1234567890", reader.consumeDigitSequence());
        Assert.assertEquals('a', reader.current());

        CharacterReader nonDigit = new CharacterReader("abc");
        Assert.assertEquals("", nonDigit.consumeDigitSequence());
    }

    @Test
    public void matches_givenChar_shouldMatchCorrectly() {
        CharacterReader reader = new CharacterReader("abc");
        Assert.assertTrue(reader.matches('a'));
        Assert.assertFalse(reader.matches('b'));

        reader.consumeToEnd();
        Assert.assertFalse(reader.matches('a'));
    }

    @Test
    public void matches_givenStringSequence_shouldMatchExactCase() {
        CharacterReader reader = new CharacterReader("hello world");
        Assert.assertTrue(reader.matches("hello"));
        Assert.assertFalse(reader.matches("Hello"));
        Assert.assertFalse(reader.matches("hello world longer"));
        Assert.assertFalse(reader.matches("hella"));

        CharacterReader emptyReader = new CharacterReader("");
        Assert.assertFalse(emptyReader.matches("anything"));
    }

    @Test
    public void matchesIgnoreCase_givenString_shouldMatchIgnoringCase() {
        CharacterReader reader = new CharacterReader("hElLo WoRlD");
        Assert.assertTrue(reader.matchesIgnoreCase("hello"));
        Assert.assertTrue(reader.matchesIgnoreCase("HELLO"));
        Assert.assertFalse(reader.matchesIgnoreCase("world"));
        Assert.assertFalse(reader.matchesIgnoreCase("hello world longer string"));

        CharacterReader emptyReader = new CharacterReader("");
        Assert.assertFalse(emptyReader.matchesIgnoreCase("test"));
    }

    @Test
    public void matchesAny_givenVarargs_shouldMatchAnySpecifiedChar() {
        CharacterReader reader = new CharacterReader("apple");
        Assert.assertTrue(reader.matchesAny('x', 'y', 'a'));
        Assert.assertFalse(reader.matchesAny('x', 'y', 'z'));

        CharacterReader emptyReader = new CharacterReader("");
        Assert.assertFalse(emptyReader.matchesAny('a', 'b'));
    }

    @Test
    public void matchesAnySorted_givenSortedChars_shouldMatchAny() {
        char[] sorted = new char[]{'a', 'e', 'i', 'o', 'u'};
        CharacterReader reader = new CharacterReader("apple");
        Assert.assertTrue(reader.matchesAnySorted(sorted));

        reader.consume(); // current is 'p'
        Assert.assertFalse(reader.matchesAnySorted(sorted));

        CharacterReader emptyReader = new CharacterReader("");
        Assert.assertFalse(emptyReader.matchesAnySorted(sorted));
    }

    @Test
    public void matchesLetter_givenCurrentChar_shouldDistinguishLetters() {
        CharacterReader readerLetterLower = new CharacterReader("a");
        Assert.assertTrue(readerLetterLower.matchesLetter());

        CharacterReader readerLetterUpper = new CharacterReader("Z");
        Assert.assertTrue(readerLetterUpper.matchesLetter());

        CharacterReader readerUnicodeLetter = new CharacterReader("é");
        Assert.assertTrue(readerUnicodeLetter.matchesLetter());

        CharacterReader readerDigit = new CharacterReader("1");
        Assert.assertFalse(readerDigit.matchesLetter());

        CharacterReader emptyReader = new CharacterReader("");
        Assert.assertFalse(emptyReader.matchesLetter());
    }

    @Test
    public void matchesDigit_givenCurrentChar_shouldDistinguishDigits() {
        CharacterReader readerDigit = new CharacterReader("5");
        Assert.assertTrue(readerDigit.matchesDigit());

        CharacterReader readerLetter = new CharacterReader("a");
        Assert.assertFalse(readerLetter.matchesDigit());

        CharacterReader emptyReader = new CharacterReader("");
        Assert.assertFalse(emptyReader.matchesDigit());
    }

    @Test
    public void matchConsume_givenMatchingSequence_shouldAdvanceAndReturnTrue() {
        CharacterReader reader = new CharacterReader("abcdef");
        Assert.assertTrue(reader.matchConsume("abc"));
        Assert.assertEquals('d', reader.current());

        Assert.assertFalse(reader.matchConsume("xyz"));
        Assert.assertEquals('d', reader.current());
    }

    @Test
    public void matchConsumeIgnoreCase_givenMatchingSequenceCaseInsensitive_shouldAdvanceAndReturnTrue() {
        CharacterReader reader = new CharacterReader("aBcDef");
        Assert.assertTrue(reader.matchConsumeIgnoreCase("ABC"));
        Assert.assertEquals('D', reader.current());

        Assert.assertFalse(reader.matchConsumeIgnoreCase("XYZ"));
        Assert.assertEquals('D', reader.current());
    }

    @Test
    public void containsIgnoreCase_givenSearchSequence_shouldReturnTrueIfPresent() {
        CharacterReader reader = new CharacterReader("<html><head><TITLE>Test</title></head>");
        Assert.assertTrue(reader.containsIgnoreCase("</title>"));
        Assert.assertTrue(reader.containsIgnoreCase("</TITLE>"));
        Assert.assertFalse(reader.containsIgnoreCase("</style>"));
    }

    @Test
    public void toString_shouldReturnRemainingChars() {
        CharacterReader reader = new CharacterReader("sample text");
        Assert.assertEquals("sample text", reader.toString());
        reader.consume();
        reader.consume();
        Assert.assertEquals("mple text", reader.toString());
        reader.consumeToEnd();
        Assert.assertEquals("", reader.toString());
    }

    @Test
    public void rangeEquals_staticAndInstance_shouldVerifyCorrectRanges() {
        char[] buf = "abcdef".toCharArray();
        Assert.assertTrue(CharacterReader.rangeEquals(buf, 0, 3, "abc"));
        Assert.assertFalse(CharacterReader.rangeEquals(buf, 0, 3, "abd"));
        Assert.assertFalse(CharacterReader.rangeEquals(buf, 0, 2, "abc"));
        Assert.assertFalse(CharacterReader.rangeEquals(buf, 0, 4, "abc"));

        CharacterReader reader = new CharacterReader("abcdef");
        Assert.assertTrue(reader.rangeEquals(0, 3, "abc"));
        Assert.assertFalse(reader.rangeEquals(0, 3, "xyz"));
    }

    @Test
    public void stringCache_reusedStrings_shouldReturnCachedInstances() {
        CharacterReader reader = new CharacterReader("item item item longerThanMaxCacheLength");
        String first = reader.consumeTo(' ');
        reader.consume();
        String second = reader.consumeTo(' ');
        reader.consume();
        String third = reader.consumeTo(' ');
        reader.consume();
        String longString = reader.consumeToEnd();

        Assert.assertEquals("item", first);
        Assert.assertSame(first, second);
        Assert.assertSame(second, third);
        Assert.assertEquals("longerThanMaxCacheLength", longString);
    }

    @Test
    public void bufferUp_withLargeInputAcrossBuffers_shouldStreamCorrectly() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < CharacterReader.maxBufferLen + 1000; i++) {
            sb.append('x');
        }
        sb.append("end");

        CharacterReader reader = new CharacterReader(new StringReader(sb.toString()));
        for (int i = 0; i < CharacterReader.maxBufferLen + 1000; i++) {
            Assert.assertEquals('x', reader.consume());
        }
        Assert.assertEquals("end", reader.consumeToEnd());
        Assert.assertTrue(reader.isEmpty());
    }
}