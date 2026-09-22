package org.apache.commons.lang3;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test suite for {@link RandomStringUtils}.
 * Built strictly for legacy Java environments (Java 1.4 / 7 compatibility).
 */
public class RandomStringUtilsTest {

    // -----------------------------------------------------------------------
    // Constructor Test
    // -----------------------------------------------------------------------

    @Test
    public void constructor_givenInstantiation_shouldCreateInstance() {
        // Arrange & Act
        RandomStringUtils instance = new RandomStringUtils();

        // Assert
        Assert.assertNotNull(instance);
    }

    // -----------------------------------------------------------------------
    // Count Edge Cases (count == 0 and count < 0)
    // -----------------------------------------------------------------------

    @Test
    public void random_givenCountZero_shouldReturnEmptyString() {
        // Arrange
        int count = 0;

        // Act
        String result = RandomStringUtils.random(count);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void random_givenNegativeCount_shouldThrowIllegalArgumentException() {
        // Arrange
        int count = -1;

        // Act
        RandomStringUtils.random(count);
    }

    @Test(expected = IllegalArgumentException.class)
    public void random_givenEmptyCharArray_shouldThrowIllegalArgumentException() {
        // Arrange
        int count = 5;
        char[] chars = new char[0];

        // Act
        RandomStringUtils.random(count, chars);
    }

    @Test(expected = IllegalArgumentException.class)
    public void random_givenEmptyStringChars_shouldThrowIllegalArgumentException() {
        // Arrange
        int count = 5;
        String chars = "";

        // Act
        RandomStringUtils.random(count, chars);
    }

    // -----------------------------------------------------------------------
    // Convenience Method Tests
    // -----------------------------------------------------------------------

    @Test
    public void random_givenCountOnly_shouldReturnStringOfSpecifiedLength() {
        // Arrange
        int count = 10;

        // Act
        String result = RandomStringUtils.random(count);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(count, result.length());
    }

    @Test
    public void randomAscii_givenCount_shouldReturnOnlyAsciiPrintableCharacters() {
        // Arrange
        int count = 100;

        // Act
        String result = RandomStringUtils.randomAscii(count);

        // Assert
        Assert.assertEquals(count, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue("Character " + ch + " should be >= 32", ch >= 32);
            Assert.assertTrue("Character " + ch + " should be <= 126", ch <= 126);
        }
    }

    @Test
    public void randomAlphabetic_givenCount_shouldReturnOnlyLetters() {
        // Arrange
        int count = 100;

        // Act
        String result = RandomStringUtils.randomAlphabetic(count);

        // Assert
        Assert.assertEquals(count, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue("Character " + ch + " must be a letter", Character.isLetter(ch));
        }
    }

    @Test
    public void randomNumeric_givenCount_shouldReturnOnlyDigits() {
        // Arrange
        int count = 100;

        // Act
        String result = RandomStringUtils.randomNumeric(count);

        // Assert
        Assert.assertEquals(count, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue("Character " + ch + " must be a digit", Character.isDigit(ch));
        }
    }

    @Test
    public void randomAlphanumeric_givenCount_shouldReturnOnlyLettersOrDigits() {
        // Arrange
        int count = 100;

        // Act
        String result = RandomStringUtils.randomAlphanumeric(count);

        // Assert
        Assert.assertEquals(count, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue("Character " + ch + " must be letter or digit", Character.isLetterOrDigit(ch));
        }
    }

    // -----------------------------------------------------------------------
    // Variations of random(...) signatures
    // -----------------------------------------------------------------------

    @Test
    public void random_givenCountAndLettersNumbersFlags_shouldReturnValidLength() {
        // Arrange & Act
        String resultLetters = RandomStringUtils.random(15, true, false);
        String resultNumbers = RandomStringUtils.random(15, false, true);

        // Assert
        Assert.assertEquals(15, resultLetters.length());
        Assert.assertEquals(15, resultNumbers.length());
    }

    @Test
    public void random_givenCountStartEndLettersNumbers_shouldGenerateWithinAsciiRange() {
        // Arrange
        int count = 20;
        int start = 'a';
        int end = 'z' + 1;

        // Act
        String result = RandomStringUtils.random(count, start, end, true, false);

        // Assert
        Assert.assertEquals(count, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue(ch >= 'a' && ch <= 'z');
        }
    }

    @Test
    public void random_givenNullCharsArray_shouldUseDefaultCharset() {
        // Arrange
        char[] nullChars = null;

        // Act
        String result = RandomStringUtils.random(10, nullChars);

        // Assert
        Assert.assertEquals(10, result.length());
    }

    @Test
    public void random_givenNullStringChars_shouldUseDefaultCharset() {
        // Arrange
        String nullString = null;

        // Act
        String result = RandomStringUtils.random(10, nullString);

        // Assert
        Assert.assertEquals(10, result.length());
    }

    @Test
    public void random_givenSpecifiedCharArray_shouldSampleOnlyProvidedChars() {
        // Arrange
        char[] allowed = new char[]{'A', 'B', 'C'};

        // Act
        String result = RandomStringUtils.random(50, allowed);

        // Assert
        Assert.assertEquals(50, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue(ch == 'A' || ch == 'B' || ch == 'C');
        }
    }

    @Test
    public void random_givenSpecifiedString_shouldSampleOnlyProvidedChars() {
        // Arrange
        String allowed = "XYZ";

        // Act
        String result = RandomStringUtils.random(30, allowed);

        // Assert
        Assert.assertEquals(30, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue(ch == 'X' || ch == 'Y' || ch == 'Z');
        }
    }

    @Test
    public void random_givenVarargsCharsWithStartEnd_shouldSampleOnlySubrange() {
        // Arrange
        char[] chars = new char[]{'0', '1', '2', '3', '4', '5'};

        // Act
        String result = RandomStringUtils.random(25, 0, 3, false, false, chars);

        // Assert
        Assert.assertEquals(25, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue(ch == '0' || ch == '1' || ch == '2');
        }
    }

    // -----------------------------------------------------------------------
    // Seeding and Determinism Tests
    // -----------------------------------------------------------------------

    @Test
    public void random_givenFixedSeed_shouldGenerateIdenticalSequences() {
        // Arrange
        long seed = 123456789L;
        Random random1 = new Random(seed);
        Random random2 = new Random(seed);

        // Act
        String result1 = RandomStringUtils.random(20, 0, 0, true, true, null, random1);
        String result2 = RandomStringUtils.random(20, 0, 0, true, true, null, random2);

        // Assert
        Assert.assertEquals(result1, result2);
    }

    @Test
    public void random_givenZeroStartAndEndWithChars_shouldSetEndToCharsLength() {
        // Arrange
        char[] chars = new char[]{'M', 'N', 'O'};
        Random fixedRandom = new Random(42L);

        // Act
        String result = RandomStringUtils.random(10, 0, 0, false, false, chars, fixedRandom);

        // Assert
        Assert.assertEquals(10, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            Assert.assertTrue(ch == 'M' || ch == 'N' || ch == 'O');
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void random_givenOutOfBoundsRangeWithChars_shouldThrowArrayIndexOutOfBoundsException() {
        // Arrange
        char[] chars = new char[]{'A', 'B'};
        // start = 0, end = 5 is beyond chars.length
        RandomStringUtils.random(10, 0, 5, false, false, chars, new Random());
    }

    // -----------------------------------------------------------------------
    // Surrogate Pairs & Character Filtering Branches
    // -----------------------------------------------------------------------

    /**
     * Mock Random implementation to deterministically feed sequence of integers.
     */
    private static class DeterministicSequenceRandom extends Random {
        private static final long serialVersionUID = 1L;
        private final int[] sequence;
        private int index;

        public DeterministicSequenceRandom(int[] sequence) {
            super();
            this.sequence = sequence;
            this.index = 0;
        }

        public int nextInt(int bound) {
            int val = sequence[index];
            index = (index + 1) % sequence.length;
            return val;
        }
    }

    @Test
    public void random_givenHighSurrogateChosenFirst_shouldPairWithLowSurrogate() {
        // Arrange:
        // ch = 55296 (d800, high surrogate).
        // Next random int generates low surrogate offset: 56320 + nextInt(128).
        DeterministicSequenceRandom mockRandom = new DeterministicSequenceRandom(new int[]{
            55296, // first character: high surrogate
            10     // low surrogate offset: 56320 + 10 = 56330
        });

        // Act
        String result = RandomStringUtils.random(2, 0, 65535, false, false, null, mockRandom);

        // Assert
        Assert.assertEquals(2, result.length());
        Assert.assertEquals((char) 55296, result.charAt(0));
        Assert.assertEquals((char) 56330, result.charAt(1));
    }

    @Test
    public void random_givenLowSurrogateChosenFirst_shouldPairWithHighSurrogate() {
        // Arrange:
        // ch = 56320 (dc00, low surrogate).
        // Next random int generates high surrogate offset: 55296 + nextInt(128).
        DeterministicSequenceRandom mockRandom = new DeterministicSequenceRandom(new int[]{
            56320, // first character: low surrogate
            20     // high surrogate offset: 55296 + 20 = 55316
        });

        // Act
        String result = RandomStringUtils.random(2, 0, 65535, false, false, null, mockRandom);

        // Assert
        Assert.assertEquals(2, result.length());
        Assert.assertEquals((char) 55316, result.charAt(0));
        Assert.assertEquals((char) 56320, result.charAt(1));
    }

    @Test
    public void random_givenHighSurrogateWhenCountIsZero_shouldRejectAndRetry() {
        // Arrange:
        // buffer fills in reverse: index 1 then index 0.
        // At index 0 (count becomes 0 in while loop), high surrogate is encountered:
        // count == 0 branch fires (count++), then fallback valid char 'A' (65) is selected.
        DeterministicSequenceRandom mockRandom = new DeterministicSequenceRandom(new int[]{
            'B',    // index 1
            55296,  // index 0 -> count == 0 branch triggered -> rejected
            'A'     // index 0 retry -> accepted
        });

        // Act
        String result = RandomStringUtils.random(2, 0, 65535, false, false, null, mockRandom);

        // Assert
        Assert.assertEquals(2, result.length());
        Assert.assertEquals('A', result.charAt(0));
        Assert.assertEquals('B', result.charAt(1));
    }

    @Test
    public void random_givenLowSurrogateWhenCountIsZero_shouldRejectAndRetry() {
        // Arrange:
        // At index 0 (count becomes 0 in while loop), low surrogate is encountered:
        // count == 0 branch fires (count++), then fallback valid char 'Z' (90) is selected.
        DeterministicSequenceRandom mockRandom = new DeterministicSequenceRandom(new int[]{
            'Y',    // index 1
            56320,  // index 0 -> count == 0 branch triggered -> rejected
            'Z'     // index 0 retry -> accepted
        });

        // Act
        String result = RandomStringUtils.random(2, 0, 65535, false, false, null, mockRandom);

        // Assert
        Assert.assertEquals(2, result.length());
        Assert.assertEquals('Z', result.charAt(0));
        Assert.assertEquals('Y', result.charAt(1));
    }

    @Test
    public void random_givenPrivateHighSurrogate_shouldSkipAndRetry() {
        // Arrange:
        // ch = 56192 falls in [56192, 56319] -> private high surrogate branch -> count++
        DeterministicSequenceRandom mockRandom = new DeterministicSequenceRandom(new int[]{
            56192, // private high surrogate -> skipped
            'C'    // regular character -> accepted
        });

        // Act
        String result = RandomStringUtils.random(1, 0, 65535, false, false, null, mockRandom);

        // Assert
        Assert.assertEquals(1, result.length());
        Assert.assertEquals("C", result);
    }

    @Test
    public void random_givenFilteredCharacterNonLetterNonDigit_shouldSkipAndRetry() {
        // Arrange:
        // letters = true, numbers = false
        // Feed '@' (64, not a letter), then 'K' (75, is a letter)
        DeterministicSequenceRandom mockRandom = new DeterministicSequenceRandom(new int[]{
            '@', // rejected by letters filter
            'K'  // accepted
        });

        // Act
        String result = RandomStringUtils.random(1, 0, 127, true, false, null, mockRandom);

        // Assert
        Assert.assertEquals(1, result.length());
        Assert.assertEquals("K", result);
    }
}