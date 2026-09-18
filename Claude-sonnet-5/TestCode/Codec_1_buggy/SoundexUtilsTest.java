package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.junit.Test;

public class SoundexUtilsTest {

    // ---------- clean() tests ----------

    @Test
    public void testCleanNull() {
        assertNull(SoundexUtils.clean(null));
    }

    @Test
    public void testCleanEmptyString() {
        assertEquals("", SoundexUtils.clean(""));
    }

    @Test
    public void testCleanAllLettersMixedCase() {
        // all chars are letters -> count == len branch, uses toUpperCase()
        assertEquals("ABCDEF", SoundexUtils.clean("abcDEf"));
    }

    @Test
    public void testCleanWithNonLetterCharacters() {
        // contains spaces and digits -> count != len branch, uses toUpperCase(Locale.ENGLISH)
        assertEquals("HELLOWORLD", SoundexUtils.clean("Hello, World123!"));
    }

    @Test
    public void testCleanSingleLetter() {
        assertEquals("A", SoundexUtils.clean("a"));
    }

    @Test
    public void testCleanOnlyNonLetters() {
        assertEquals("", SoundexUtils.clean("12345!@#$%"));
    }

    // ---------- differenceEncoded() tests ----------

    @Test
    public void testDifferenceEncodedBothNull() {
        assertEquals(0, SoundexUtils.differenceEncoded(null, null));
    }

    @Test
    public void testDifferenceEncodedFirstNull() {
        assertEquals(0, SoundexUtils.differenceEncoded(null, "ABCD"));
    }

    @Test
    public void testDifferenceEncodedSecondNull() {
        assertEquals(0, SoundexUtils.differenceEncoded("ABCD", null));
    }

    @Test
    public void testDifferenceEncodedEmptyStrings() {
        // lengthToMatch = 0, loop runs 0 times
        assertEquals(0, SoundexUtils.differenceEncoded("", ""));
    }

    @Test
    public void testDifferenceEncodedNoMatch() {
        assertEquals(0, SoundexUtils.differenceEncoded("ABCD", "WXYZ"));
    }

    @Test
    public void testDifferenceEncodedFullMatch() {
        // loop runs multiple times, all match
        assertEquals(4, SoundexUtils.differenceEncoded("ABCD", "ABCD"));
    }

    @Test
    public void testDifferenceEncodedPartialMatch() {
        // loop runs multiple times, some match
        assertEquals(2, SoundexUtils.differenceEncoded("ABCD", "ABXY"));
    }

    @Test
    public void testDifferenceEncodedSingleCharMatch() {
        // loop runs exactly 1 time
        assertEquals(1, SoundexUtils.differenceEncoded("A", "A"));
    }

    @Test
    public void testDifferenceEncodedSingleCharNoMatch() {
        // loop runs exactly 1 time, no match
        assertEquals(0, SoundexUtils.differenceEncoded("A", "B"));
    }

    @Test
    public void testDifferenceEncodedDifferentLengths() {
        // lengthToMatch = min(len1, len2)
        assertEquals(2, SoundexUtils.differenceEncoded("ABCDEF", "AB"));
    }

    // ---------- difference() tests ----------

    private static class SimpleEncoder implements StringEncoder {
        public String encode(String source) throws EncoderException {
            return source == null ? null : source.toUpperCase();
        }

        public Object encode(Object source) throws EncoderException {
            if (source instanceof String) {
                return encode((String) source);
            }
            throw new EncoderException("Unsupported type");
        }
    }

    private static class ThrowingEncoder implements StringEncoder {
        public String encode(String source) throws EncoderException {
            throw new EncoderException("Encoding failed");
        }

        public Object encode(Object source) throws EncoderException {
            throw new EncoderException("Encoding failed");
        }
    }

    @Test
    public void testDifferenceNormalCase() throws EncoderException {
        StringEncoder encoder = new SimpleEncoder();
        int result = SoundexUtils.difference(encoder, "abcd", "abcd");
        assertEquals(4, result);
    }

    @Test
    public void testDifferencePartialMatchCase() throws EncoderException {
        StringEncoder encoder = new SimpleEncoder();
        int result = SoundexUtils.difference(encoder, "abcd", "abef");
        assertEquals(2, result);
    }

    @Test
    public void testDifferenceNoMatchCase() throws EncoderException {
        StringEncoder encoder = new SimpleEncoder();
        int result = SoundexUtils.difference(encoder, "abcd", "wxyz");
        assertEquals(0, result);
    }

    @Test(expected = EncoderException.class)
    public void testDifferenceThrowsEncoderException() throws EncoderException {
        StringEncoder encoder = new ThrowingEncoder();
        SoundexUtils.difference(encoder, "abcd", "efgh");
    }

    @Test
    public void testDifferenceWithNullEncodedResult() throws EncoderException {
        StringEncoder encoder = new StringEncoder() {
            public String encode(String source) throws EncoderException {
                return null;
            }

            public Object encode(Object source) throws EncoderException {
                return null;
            }
        };
        int result = SoundexUtils.difference(encoder, "abcd", "efgh");
        assertEquals(0, result);
    }
}