package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.junit.Test;

public class SoundexUtilsTest {

    private static class MockEncoder implements StringEncoder {
        private final String encoded;
        private boolean threw;

        MockEncoder(String encoded) {
            this.encoded = encoded;
        }

        MockEncoder(boolean throwException) {
            this.encoded = null;
            this.threw = throwException;
        }

        @Override
        public String encode(String str) throws EncoderException {
            if (threw) {
                throw new EncoderException("Mock exception");
            }
            return encoded;
        }

        @Override
        public Object encode(Object obj) throws EncoderException {
            return encode((String) obj);
        }
    }

    @Test
    public void testCleanNull() {
        assertNull(SoundexUtils.clean(null));
    }

    @Test
    public void testCleanEmpty() {
        assertEquals("", SoundexUtils.clean(""));
    }

    @Test
    public void testCleanOnlyLetters() {
        assertEquals("HELLO", SoundexUtils.clean("hello"));
    }

    @Test
    public void testCleanWithNonLetters() {
        assertEquals("HELLO", SoundexUtils.clean("h3e!l@l#o$"));
    }

    @Test
    public void testCleanMixedCaseWithNonLetters() {
        assertEquals("ABC", SoundexUtils.clean("A1b2C3!"));
    }

    @Test
    public void testCleanAllNonLetters() {
        assertEquals("", SoundexUtils.clean("123!@#"));
    }

    @Test
    public void testCleanUnicodeLetters() {
        // Using 'é' and 'ñ' which are letters but not A-Z
        assertEquals("ÉÑ", SoundexUtils.clean("éñ"));
    }

    @Test
    public void testDifferenceWithNullEncodedStrings() {
        assertEquals(0, SoundexUtils.differenceEncoded(null, "ABC"));
        assertEquals(0, SoundexUtils.differenceEncoded("ABC", null));
        assertEquals(0, SoundexUtils.differenceEncoded(null, null));
    }

    @Test
    public void testDifferenceEncodedSameStrings() {
        assertEquals(3, SoundexUtils.differenceEncoded("ABC", "ABC"));
    }

    @Test
    public void testDifferenceEncodedDifferentStrings() {
        assertEquals(0, SoundexUtils.differenceEncoded("ABC", "XYZ"));
    }

    @Test
    public void testDifferenceEncodedPartialMatch() {
        assertEquals(2, SoundexUtils.differenceEncoded("ABCD", "ABXY"));
    }

    @Test
    public void testDifferenceEncodedDifferentLengths() {
        assertEquals(2, SoundexUtils.differenceEncoded("ABC", "AB"));
        assertEquals(2, SoundexUtils.differenceEncoded("AB", "ABC"));
    }

    @Test
    public void testDifferenceEncodedSameCharactersDifferentPositions() {
        assertEquals(1, SoundexUtils.differenceEncoded("AB", "BA"));
    }

    @Test
    public void testDifferenceNormalCase() throws EncoderException {
        MockEncoder encoder = new MockEncoder("ABCD");
        assertEquals(2, SoundexUtils.difference(encoder, "hello", "he"));
    }

    @Test
    public void testDifferenceWhenEncoderThrows() {
        MockEncoder encoder = new MockEncoder(true);
        try {
            SoundexUtils.difference(encoder, "hello", "he");
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            // expected
        }
    }

    @Test
    public void testDifferenceWithDifferentEncodedLengths() throws EncoderException {
        MockEncoder encoder1 = new MockEncoder("ABC");
        MockEncoder encoder2 = new MockEncoder("AB");
        // Both encoders return same encoded value for simplicity
        assertEquals(2, SoundexUtils.difference(encoder1, "s1", "s2"));
        assertEquals(2, SoundexUtils.difference(encoder2, "s1", "s2"));
    }

    @Test
    public void testDifferenceEncodedOneCharEach() {
        assertEquals(1, SoundexUtils.differenceEncoded("A", "A"));
        assertEquals(0, SoundexUtils.differenceEncoded("A", "B"));
    }

    @Test
    public void testDifferenceEncodedEmptyStrings() {
        assertEquals(0, SoundexUtils.differenceEncoded("", ""));
    }

    @Test
    public void testDifferenceEncodedDifferentCase() {
        // Case sensitive comparison
        assertEquals(0, SoundexUtils.differenceEncoded("A", "a"));
    }

    @Test
    public void testDifferenceEncodedNullAndEmpty() {
        assertEquals(0, SoundexUtils.differenceEncoded(null, ""));
        assertEquals(0, SoundexUtils.differenceEncoded("", null));
    }

    @Test
    public void testDifferenceEncodedLongStrings() {
        String long1 = "ABCDEFGH";
        String long2 = "ABCDEFGH";
        assertEquals(8, SoundexUtils.differenceEncoded(long1, long2));
    }

    @Test
    public void testDifferenceEncodedCharComparisonCaseSensitive() {
        // Test that 'A' and 'a' are not equal
        assertEquals(0, SoundexUtils.differenceEncoded("A", "a"));
    }

    @Test
    public void testCleanSpaces() {
        assertEquals("HELLO WORLD", SoundexUtils.clean(" hello world "));
    }

    @Test
    public void testCleanTabsAndNewlines() {
        assertEquals("HELLO", SoundexUtils.clean("h\te\nl\nl\to"));
    }

    @Test
    public void testCleanAlreadyUpperCase() {
        assertEquals("HELLO", SoundexUtils.clean("HELLO"));
    }

    @Test
    public void testCleanMixedCase() {
        assertEquals("HELLO", SoundexUtils.clean("HeLLo"));
    }

    @Test
    public void testCleanNumbersRemoved() {
        assertEquals("ABC", SoundexUtils.clean("A1B2C3"));
    }

    @Test
    public void testCleanSpecialCharactersRemoved() {
        assertEquals("HELLO", SoundexUtils.clean("h!e@l#l$o%^"));
    }

    @Test
    public void testCleanMultipleNonLetterCharacters() {
        assertEquals("ABC", SoundexUtils.clean("A B C"));
    }

    @Test
    public void testDifferenceSameEncoding() throws EncoderException {
        MockEncoder encoder = new MockEncoder("XYZ");
        assertEquals(3, SoundexUtils.difference(encoder, "s1", "s2"));
    }

    @Test
    public void testDifferenceDifferentEncodings() throws EncoderException {
        MockEncoder encoder1 = new MockEncoder("ABC");
        MockEncoder encoder2 = new MockEncoder("ABD");
        assertEquals(2, SoundexUtils.difference(encoder1, "s1", "s2"));
        assertEquals(2, SoundexUtils.difference(encoder2, "s1", "s2"));
    }

    @Test
    public void testDifferenceNullFirstArg() throws EncoderException {
        MockEncoder encoder = new MockEncoder("ABC");
        assertEquals(2, SoundexUtils.difference(encoder, null, "def"));
    }

    @Test
    public void testDifferenceNullSecondArg() throws EncoderException {
        MockEncoder encoder = new MockEncoder("ABC");
        assertEquals(2, SoundexUtils.difference(encoder, "def", null));
    }

    @Test
    public void testDifferenceBothNull() throws EncoderException {
        MockEncoder encoder = new MockEncoder("ABC");
        assertEquals(2, SoundexUtils.difference(encoder, null, null));
    }

    @Test
    public void testDifferenceEncodedBothNull() {
        assertEquals(0, SoundexUtils.differenceEncoded(null, null));
    }

    @Test
    public void testCleanNonEnglishLetters() {
        // "Ü" is a letter but not A-Z
        assertEquals("Ü", SoundexUtils.clean("Ü"));
    }

    @Test
    public void testCleanMixedWithNonEnglish() {
        assertEquals("ABCÜ", SoundexUtils.clean("a1b2c3ü"));
    }

    @Test
    public void testDifferenceEncodedSameLengthRepeatedChars() {
        assertEquals(3, SoundexUtils.differenceEncoded("AAA", "AAA"));
    }

    @Test
    public void testDifferenceEncodedOneEmptyOneNonEmpty() {
        assertEquals(0, SoundexUtils.differenceEncoded("", "A"));
        assertEquals(0, SoundexUtils.differenceEncoded("A", ""));
    }
}