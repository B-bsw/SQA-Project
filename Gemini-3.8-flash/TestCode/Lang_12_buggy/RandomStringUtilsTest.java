package org.apache.commons.lang3;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Random;

public class RandomStringUtilsTest {

    private static class FixedSequenceRandom extends Random {
        private static final long serialVersionUID = 1L;
        private final int[] values;
        private int index;

        public FixedSequenceRandom(int[] values) {
            this.values = values;
            this.index = 0;
        }

        public int nextInt(int bound) {
            int val = values[index];
            index = (index + 1) % values.length;
            return val;
        }
    }

    @Test
    public void constructor_whenInstantiated_shouldNotBeNull() {
        // Arrange & Act
        RandomStringUtils instance = new RandomStringUtils();

        // Assert
        Assert.assertNotNull(instance);
    }

    @Test
    public void constructor_publicModifierCheck_shouldBePublic() throws NoSuchMethodException {
        // Arrange & Act
        Constructor constructor = RandomStringUtils.class.getConstructor(new Class[0]);

        // Assert
        Assert.assertTrue(Modifier.isPublic(constructor.getModifiers()));
    }

    @Test
    public void random_givenCountZero_shouldReturnEmptyString() {
        // Arrange & Act
        String result = RandomStringUtils.random(0);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void random_givenNegativeCount_shouldThrowException() {
        // Arrange, Act & Assert
        RandomStringUtils.random(-1);
    }

    @Test
    public void random_givenPositiveCount_shouldReturnStringOfSpecifiedLength() {
        // Arrange
        int count = 10;

        // Act
        String result = RandomStringUtils.random(count);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(count, result.length());
    }

    @Test
    public void randomAscii_givenCountZero_shouldReturnEmptyString() {
        // Arrange & Act
        String result = RandomStringUtils.randomAscii(0);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void randomAscii_givenNegativeCount_shouldThrowException() {
        // Arrange, Act & Assert
        RandomStringUtils.randomAscii(-5);
    }

    @Test
    public void randomAscii_givenPositiveCount_shouldReturnAsciiPrintableString() {
        // Arrange
        int count = 50;

        // Act
        String result = RandomStringUtils.randomAscii(count);

        // Assert
        Assert.assertEquals(count, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue("Char out of ASCII range: " + (int) ch, ch >= 32 && ch <= 126);
        }
    }

    @Test
    public void randomAlphabetic_givenCountZero_shouldReturnEmptyString() {
        // Arrange & Act
        String result = RandomStringUtils.randomAlphabetic(0);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void randomAlphabetic_givenNegativeCount_shouldThrowException() {
        // Arrange, Act & Assert
        RandomStringUtils.randomAlphabetic(-1);
    }

    @Test
    public void randomAlphabetic_givenPositiveCount_shouldReturnOnlyLetters() {
        // Arrange
        int count = 30;

        // Act
        String result = RandomStringUtils.randomAlphabetic(count);

        // Assert
        Assert.assertEquals(count, result.length());
        for (int i = 0; i < result.length(); i++) {
            Assert.assertTrue("Char is not a letter: " + result.charAt(i), Character.isLetter(result.charAt(i)));
        }
    }

    @Test
    public void randomAlphanumeric_givenCountZero_shouldReturnEmptyString() {
        // Arrange & Act
        String result = RandomStringUtils.randomAlphanumeric(0);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void randomAlphanumeric_givenNegativeCount_shouldThrowException() {
        // Arrange, Act & Assert
        RandomStringUtils.randomAlphanumeric(-1);
    }

    @Test
    public void randomAlphanumeric_givenPositiveCount_shouldReturnLettersOrDigits() {
        // Arrange
        int count = 40;

        // Act
        String result = RandomStringUtils.randomAlphanumeric(count);

        // Assert
        Assert.assertEquals(count, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue("Char is not alphanumeric: " + ch, Character.isLetterOrDigit(ch));
        }
    }

    @Test
    public void randomNumeric_givenCountZero_shouldReturnEmptyString() {
        // Arrange & Act
        String result = RandomStringUtils.randomNumeric(0);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void randomNumeric_givenNegativeCount_shouldThrowException() {
        // Arrange, Act & Assert
        RandomStringUtils.randomNumeric(-1);
    }

    @Test
    public void randomNumeric_givenPositiveCount_shouldReturnOnlyDigits() {
        // Arrange
        int count = 25;

        // Act
        String result = RandomStringUtils.randomNumeric(count);

        // Assert
        Assert.assertEquals(count, result.length());
        for (int i = 0; i < result.length(); i++) {
            Assert.assertTrue("Char is not a digit: " + result.charAt(i), Character.isDigit(result.charAt(i)));
        }
    }

    @Test
    public void random_givenCountAndBooleans_shouldGenerateExpectedCharacters() {
        // Arrange & Act
        String lettersOnly = RandomStringUtils.random(20, true, false);
        String numbersOnly = RandomStringUtils.random(20, false, true);

        // Assert
        Assert.assertEquals(20, lettersOnly.length());
        for (int i = 0; i < lettersOnly.length(); i++) {
            Assert.assertTrue(Character.isLetter(lettersOnly.charAt(i)));
        }

        Assert.assertEquals(20, numbersOnly.length());
        for (int i = 0; i < numbersOnly.length(); i++) {
            Assert.assertTrue(Character.isDigit(numbersOnly.charAt(i)));
        }
    }

    @Test
    public void random_givenCountStartEndAndBooleans_shouldGenerateWithinBounds() {
        // Arrange
        int start = 'a';
        int end = 'e';

        // Act
        String result = RandomStringUtils.random(20, start, end, true, false);

        // Assert
        Assert.assertEquals(20, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue(ch >= 'a' && ch < 'e');
        }
    }

    @Test
    public void random_givenCountStartEndBooleansAndCharsArray_shouldSampleFromProvidedChars() {
        // Arrange
        char[] chars = new char[]{'X', 'Y', 'Z'};

        // Act
        String result = RandomStringUtils.random(15, 0, chars.length, true, false, chars);

        // Assert
        Assert.assertEquals(15, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue(ch == 'X' || ch == 'Y' || ch == 'Z');
        }
    }

    @Test
    public void random_givenStringChars_shouldGenerateFromCharactersInString() {
        // Arrange
        String charSet = "ABC123";

        // Act
        String result = RandomStringUtils.random(30, charSet);

        // Assert
        Assert.assertEquals(30, result.length());
        for (int i = 0; i < result.length(); i++) {
            Assert.assertTrue(charSet.indexOf(result.charAt(i)) >= 0);
        }
    }

    @Test
    public void random_givenNullStringChars_shouldSampleFromAllCharacters() {
        // Arrange & Act
        String result = RandomStringUtils.random(10, (String) null);

        // Assert
        Assert.assertEquals(10, result.length());
    }

    @Test
    public void random_givenCharArray_shouldGenerateFromGivenCharacters() {
        // Arrange
        char[] chars = new char[]{'m', 'n', 'o'};

        // Act
        String result = RandomStringUtils.random(10, chars);

        // Assert
        Assert.assertEquals(10, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue(ch == 'm' || ch == 'n' || ch == 'o');
        }
    }

    @Test
    public void random_givenNullCharArray_shouldSampleFromAllCharacters() {
        // Arrange & Act
        String result = RandomStringUtils.random(10, (char[]) null);

        // Assert
        Assert.assertEquals(10, result.length());
    }

    @Test
    public void random_givenFixedRandomSeed_shouldProduceIdenticalResults() {
        // Arrange
        Random rand1 = new Random(12345L);
        Random rand2 = new Random(12345L);

        // Act
        String result1 = RandomStringUtils.random(20, 0, 0, true, true, null, rand1);
        String result2 = RandomStringUtils.random(20, 0, 0, true, true, null, rand2);

        // Assert
        Assert.assertEquals(result1, result2);
    }

    @Test
    public void random_givenLettersAndNumbersFalseWithStartEndZero_shouldSetBoundsToIntegerMax() {
        // Arrange: start=0, end=0, letters=false, numbers=false -> gap = Integer.MAX_VALUE
        FixedSequenceRandom mockRandom = new FixedSequenceRandom(new int[]{65, 66, 67});

        // Act
        String result = RandomStringUtils.random(3, 0, 0, false, false, null, mockRandom);

        // Assert
        Assert.assertEquals("CBA", result);
    }

    @Test
    public void random_givenCharsArrayAndMockRandom_shouldPickCorrectChars() {
        // Arrange
        char[] customChars = new char[]{'q', 'w', 'e', 'r', 't', 'y'};
        FixedSequenceRandom mockRandom = new FixedSequenceRandom(new int[]{0, 2, 4});

        // Act
        String result = RandomStringUtils.random(3, 0, customChars.length, false, false, customChars, mockRandom);

        // Assert
        Assert.assertEquals("twq", result);
    }

    @Test
    public void random_givenLetterFilterRejectingNonLetters_shouldRetryUntilLetterFound() {
        // Arrange: start=' ', end='z'+1. Return non-letter '$' (36 - 32 = 4), then letter 'A' (65 - 32 = 33)
        FixedSequenceRandom mockRandom = new FixedSequenceRandom(new int[]{4, 33});

        // Act
        String result = RandomStringUtils.random(1, ' ', 'z' + 1, true, false, null, mockRandom);

        // Assert
        Assert.assertEquals("A", result);
    }

    @Test
    public void random_givenNumberFilterRejectingNonDigits_shouldRetryUntilDigitFound() {
        // Arrange: return non-digit 'A' (65 - 32 = 33), then digit '5' (53 - 32 = 21)
        FixedSequenceRandom mockRandom = new FixedSequenceRandom(new int[]{33, 21});

        // Act
        String result = RandomStringUtils.random(1, ' ', 'z' + 1, false, true, null, mockRandom);

        // Assert
        Assert.assertEquals("5", result);
    }

    @Test
    public void random_givenLowSurrogateWithCountGreaterThanZero_shouldPairWithHighSurrogate() {
        // Arrange:
        // When ch is low surrogate (56320 <= ch <= 57343) and count > 0:
        // buffer[count] = ch; count--; buffer[count] = 55296 + random.nextInt(128);
        int lowSurrogate = 56320;
        int nextRandomVal = 10;
        FixedSequenceRandom mockRandom = new FixedSequenceRandom(new int[]{lowSurrogate, nextRandomVal});

        // Act
        String result = RandomStringUtils.random(2, 0, 60000, false, false, null, mockRandom);

        // Assert
        Assert.assertEquals(2, result.length());
        Assert.assertEquals((char) (55296 + nextRandomVal), result.charAt(0));
        Assert.assertEquals((char) lowSurrogate, result.charAt(1));
    }

    @Test
    public void random_givenLowSurrogateWhenCountIsZero_shouldIncrementCountAndRetry() {
        // Arrange:
        // Generating 1 char. First pick a normal char 'Z' for index 0 (which becomes count=0 after loop dec).
        // If next random yields low surrogate with count == 0, count increments and retries.
        // Then return normal char 'A'.
        int lowSurrogate = 56320;
        FixedSequenceRandom mockRandom = new FixedSequenceRandom(new int[]{lowSurrogate, 'A'});

        // Act
        String result = RandomStringUtils.random(1, 0, 60000, false, false, null, mockRandom);

        // Assert
        Assert.assertEquals("A", result);
    }

    @Test
    public void random_givenHighSurrogateWithCountGreaterThanZero_shouldPairWithLowSurrogate() {
        // Arrange:
        // When ch is high surrogate (55296 <= ch <= 56191) and count > 0:
        // buffer[count] = 56320 + random.nextInt(128); count--; buffer[count] = ch;
        int highSurrogate = 55300;
        int nextRandomVal = 5;
        FixedSequenceRandom mockRandom = new FixedSequenceRandom(new int[]{highSurrogate, nextRandomVal});

        // Act
        String result = RandomStringUtils.random(2, 0, 60000, false, false, null, mockRandom);

        // Assert
        Assert.assertEquals(2, result.length());
        Assert.assertEquals((char) highSurrogate, result.charAt(0));
        Assert.assertEquals((char) (56320 + nextRandomVal), result.charAt(1));
    }

    @Test
    public void random_givenHighSurrogateWhenCountIsZero_shouldIncrementCountAndRetry() {
        // Arrange:
        // When ch is high surrogate and count == 0, count increments and retries.
        int highSurrogate = 55300;
        FixedSequenceRandom mockRandom = new FixedSequenceRandom(new int[]{highSurrogate, 'K'});

        // Act
        String result = RandomStringUtils.random(1, 0, 60000, false, false, null, mockRandom);

        // Assert
        Assert.assertEquals("K", result);
    }

    @Test
    public void random_givenPrivateHighSurrogate_shouldSkipAndRetry() {
        // Arrange:
        // Characters between 56192 and 56319 are private high surrogates and must be skipped
        int privateHighSurrogate = 56200;
        FixedSequenceRandom mockRandom = new FixedSequenceRandom(new int[]{privateHighSurrogate, 'X'});

        // Act
        String result = RandomStringUtils.random(1, 0, 60000, false, false, null, mockRandom);

        // Assert
        Assert.assertEquals("X", result);
    }

    @Test
    public void random_givenEmptyCharsArray_shouldThrowArrayIndexOutOfBoundsException() {
        // Arrange
        char[] emptyChars = new char[0];

        // Act & Assert
        try {
            RandomStringUtils.random(1, emptyChars);
            Assert.fail("Expected an ArrayIndexOutOfBoundsException or IllegalArgumentException");
        } catch (ArrayIndexOutOfBoundsException ex) {
            // Success
        } catch (IllegalArgumentException ex) {
            // Success
        }
    }
}