package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.junit.Assert;
import org.junit.Test;

public class SoundexUtilsTest {

    private static class DummyEncoder implements StringEncoder {
        public String encode(String str) throws EncoderException {
            if ("FAIL".equals(str)) {
                throw new EncoderException("Simulated error");
            }
            return str;
        }

        public Object encode(Object obj) throws EncoderException {
            if (obj instanceof String) {
                return encode((String) obj);
            }
            throw new EncoderException("Parameter is not a String");
        }
    }

    @Test
    public void constructor_shouldInstantiateSuccessfully() {
        // Arrange & Act
        SoundexUtils utils = new SoundexUtils();

        // Assert
        Assert.assertNotNull(utils);
    }

    @Test
    public void clean_givenNull_shouldReturnNull() {
        // Arrange
        String input = null;

        // Act
        String result = SoundexUtils.clean(input);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void clean_givenEmptyString_shouldReturnEmptyString() {
        // Arrange
        String input = "";

        // Act
        String result = SoundexUtils.clean(input);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void clean_givenAllLowerCaseLetters_shouldReturnUpperCase() {
        // Arrange
        String input = "testing";

        // Act
        String result = SoundexUtils.clean(input);

        // Assert
        Assert.assertEquals("TESTING", result);
    }

    @Test
    public void clean_givenAllUpperCaseLetters_shouldReturnSameUpperCase() {
        // Arrange
        String input = "TESTING";

        // Act
        String result = SoundexUtils.clean(input);

        // Assert
        Assert.assertEquals("TESTING", result);
    }

    @Test
    public void clean_givenMixedLettersAndNonLetters_shouldFilterAndReturnUpperCase() {
        // Arrange
        String input = "t-e_s!t 123";

        // Act
        String result = SoundexUtils.clean(input);

        // Assert
        Assert.assertEquals("TEST", result);
    }

    @Test
    public void clean_givenNonLettersOnly_shouldReturnEmptyString() {
        // Arrange
        String input = "123456!@#$%^&*()_+ -=";

        // Act
        String result = SoundexUtils.clean(input);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void clean_givenSingleLetter_shouldReturnSingleLetterUpperCase() {
        // Arrange
        String input = "a";

        // Act
        String result = SoundexUtils.clean(input);

        // Assert
        Assert.assertEquals("A", result);
    }

    @Test
    public void clean_givenSingleNonLetter_shouldReturnEmptyString() {
        // Arrange
        String input = "!";

        // Act
        String result = SoundexUtils.clean(input);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void differenceEncoded_givenBothNull_shouldReturnZero() {
        // Arrange
        String es1 = null;
        String es2 = null;

        // Act
        int result = SoundexUtils.differenceEncoded(es1, es2);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void differenceEncoded_givenFirstNull_shouldReturnZero() {
        // Arrange
        String es1 = null;
        String es2 = "A123";

        // Act
        int result = SoundexUtils.differenceEncoded(es1, es2);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void differenceEncoded_givenSecondNull_shouldReturnZero() {
        // Arrange
        String es1 = "A123";
        String es2 = null;

        // Act
        int result = SoundexUtils.differenceEncoded(es1, es2);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void differenceEncoded_givenBothEmpty_shouldReturnZero() {
        // Arrange
        String es1 = "";
        String es2 = "";

        // Act
        int result = SoundexUtils.differenceEncoded(es1, es2);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void differenceEncoded_givenFirstEmptySecondNonEmpty_shouldReturnZero() {
        // Arrange
        String es1 = "";
        String es2 = "A123";

        // Act
        int result = SoundexUtils.differenceEncoded(es1, es2);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void differenceEncoded_givenFirstNonEmptySecondEmpty_shouldReturnZero() {
        // Arrange
        String es1 = "A123";
        String es2 = "";

        // Act
        int result = SoundexUtils.differenceEncoded(es1, es2);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void differenceEncoded_givenIdenticalStrings_shouldReturnFullLength() {
        // Arrange
        String es1 = "A123";
        String es2 = "A123";

        // Act
        int result = SoundexUtils.differenceEncoded(es1, es2);

        // Assert
        Assert.assertEquals(4, result);
    }

    @Test
    public void differenceEncoded_givenCompletelyDifferentStrings_shouldReturnZero() {
        // Arrange
        String es1 = "ABCD";
        String es2 = "EFGH";

        // Act
        int result = SoundexUtils.differenceEncoded(es1, es2);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void differenceEncoded_givenPartiallyMatchingSameLength_shouldReturnMatchCount() {
        // Arrange
        String es1 = "A123";
        String es2 = "A193";

        // Act
        int result = SoundexUtils.differenceEncoded(es1, es2);

        // Assert
        Assert.assertEquals(3, result);
    }

    @Test
    public void differenceEncoded_givenDifferentLengthsMatchingPrefix_shouldReturnMatchedPrefixCount() {
        // Arrange
        String es1 = "A123";
        String es2 = "A123456";

        // Act
        int result = SoundexUtils.differenceEncoded(es1, es2);

        // Assert
        Assert.assertEquals(4, result);
    }

    @Test
    public void differenceEncoded_givenDifferentLengthsWithInterleavedMatches_shouldCheckUpToShorterLength() {
        // Arrange
        String es1 = "AXCY";
        String es2 = "AZC";

        // Act
        int result = SoundexUtils.differenceEncoded(es1, es2);

        // Assert
        Assert.assertEquals(2, result);
    }

    @Test
    public void difference_givenValidEncoderAndMatchingStrings_shouldReturnMatchCount() throws EncoderException {
        // Arrange
        StringEncoder encoder = new DummyEncoder();
        String s1 = "TEST";
        String s2 = "TEST";

        // Act
        int result = SoundexUtils.difference(encoder, s1, s2);

        // Assert
        Assert.assertEquals(4, result);
    }

    @Test
    public void difference_givenValidEncoderAndDifferingStrings_shouldReturnCorrectDifference() throws EncoderException {
        // Arrange
        StringEncoder encoder = new DummyEncoder();
        String s1 = "TEST";
        String s2 = "TOST";

        // Act
        int result = SoundexUtils.difference(encoder, s1, s2);

        // Assert
        Assert.assertEquals(3, result);
    }

    @Test(expected = EncoderException.class)
    public void difference_givenEncoderThrowsExceptionOnFirstString_shouldPropagateException() throws EncoderException {
        // Arrange
        StringEncoder encoder = new DummyEncoder();
        String s1 = "FAIL";
        String s2 = "TEST";

        // Act
        SoundexUtils.difference(encoder, s1, s2);

        // Assert: Exception expected
    }

    @Test(expected = EncoderException.class)
    public void difference_givenEncoderThrowsExceptionOnSecondString_shouldPropagateException() throws EncoderException {
        // Arrange
        StringEncoder encoder = new DummyEncoder();
        String s1 = "TEST";
        String s2 = "FAIL";

        // Act
        SoundexUtils.difference(encoder, s1, s2);

        // Assert: Exception expected
    }
}