package org.apache.commons.math3.random;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Complete Unit Test Suite for BitsStreamGenerator.
 * Designed for legacy enterprise environments (Java 1.4/7 compatible, JUnit 4).
 */
public class BitsStreamGeneratorTest {

    /**
     * Concrete testable subclass of BitsStreamGenerator.
     */
    private static class DummyGenerator extends BitsStreamGenerator {
        private int[] sequence;
        private int index;
        private int constantValue;
        private boolean useSequence;
        private int lastRequestedBits;
        private int seedCount;

        public DummyGenerator() {
            super();
            this.useSequence = false;
            this.constantValue = 0;
            this.index = 0;
            this.sequence = null;
            this.lastRequestedBits = -1;
            this.seedCount = 0;
        }

        public void setSequence(int[] seq) {
            this.sequence = seq;
            this.index = 0;
            this.useSequence = true;
        }

        public void setConstant(int val) {
            this.constantValue = val;
            this.useSequence = false;
        }

        public int getLastRequestedBits() {
            return lastRequestedBits;
        }

        public int getSeedCount() {
            return seedCount;
        }

        public void setSeed(int seed) {
            seedCount++;
        }

        public void setSeed(int[] seed) {
            seedCount++;
        }

        public void setSeed(long seed) {
            seedCount++;
        }

        protected int next(int bits) {
            this.lastRequestedBits = bits;
            int raw;
            if (useSequence && sequence != null) {
                if (index < sequence.length) {
                    raw = sequence[index++];
                } else {
                    raw = sequence[sequence.length - 1];
                }
            } else {
                raw = constantValue;
            }

            if (bits >= 32) {
                return raw;
            }
            return raw & ((1 << bits) - 1);
        }
    }

    private DummyGenerator generator;

    @Before
    public void setUp() {
        generator = new DummyGenerator();
    }

    // =========================================================================
    // nextBoolean Tests
    // =========================================================================

    @Test
    public void nextBoolean_givenNonZeroBit_shouldReturnTrue() {
        // Arrange
        generator.setConstant(1);

        // Act
        boolean result = generator.nextBoolean();

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(1, generator.getLastRequestedBits());
    }

    @Test
    public void nextBoolean_givenZeroBit_shouldReturnFalse() {
        // Arrange
        generator.setConstant(0);

        // Act
        boolean result = generator.nextBoolean();

        // Assert
        Assert.assertFalse(result);
        Assert.assertEquals(1, generator.getLastRequestedBits());
    }

    // =========================================================================
    // nextInt() Tests
    // =========================================================================

    @Test
    public void nextInt_givenArbitraryBitPattern_shouldReturnFull32Bits() {
        // Arrange
        int expected = 0x12345678;
        generator.setConstant(expected);

        // Act
        int actual = generator.nextInt();

        // Assert
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(32, generator.getLastRequestedBits());
    }

    // =========================================================================
    // nextInt(int n) Tests: Boundary & Exception Branches
    // =========================================================================

    @Test(expected = NotStrictlyPositiveException.class)
    public void nextInt_givenZero_shouldThrowNotStrictlyPositiveException() {
        generator.nextInt(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void nextInt_givenNegativeValue_shouldThrowNotStrictlyPositiveException() {
        generator.nextInt(-1);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void nextInt_givenMinInteger_shouldThrowNotStrictlyPositiveException() {
        generator.nextInt(Integer.MIN_VALUE);
    }

    // =========================================================================
    // nextInt(int n) Tests: Power of Two Branch
    // =========================================================================

    @Test
    public void nextInt_givenPowerOfTwoN_shouldReturnExpectedShiftedValue() {
        // Arrange: n = 8 (power of two), next(31) returning 0x40000000 (half of max 31-bit)
        // Expected: (int) ((8L * 0x40000000L) >> 31) = (8 * 1073741824) >> 31 = 4
        generator.setConstant(0x40000000);
        int n = 8;

        // Act
        int actual = generator.nextInt(n);

        // Assert
        Assert.assertEquals(4, actual);
        Assert.assertEquals(31, generator.getLastRequestedBits());
    }

    @Test
    public void nextInt_givenPowerOfTwoOne_shouldReturnZero() {
        // Arrange: n = 1 is power of 2, (1 & -1) == 1
        generator.setConstant(0x7fffffff);
        int n = 1;

        // Act
        int actual = generator.nextInt(n);

        // Assert
        Assert.assertEquals(0, actual);
    }

    @Test
    public void nextInt_givenPowerOfTwo16Max31Bits_shouldCalculateCorrectly() {
        // Arrange: n = 16, bits = 0x7FFFFFFF (2147483647)
        // (16L * 2147483647L) >> 31 = 15
        generator.setConstant(0x7fffffff);
        int n = 16;

        // Act
        int actual = generator.nextInt(n);

        // Assert
        Assert.assertEquals(15, actual);
    }

    // =========================================================================
    // nextInt(int n) Tests: Non-Power of Two Branch & Rejection Loop
    // =========================================================================

    @Test
    public void nextInt_givenNonPowerOfTwoNormalValue_shouldReturnModuloWithoutRejection() {
        // Arrange: n = 5, bits = 14
        // bits - val + (n - 1) = 14 - (14 % 5) + 4 = 14 - 4 + 4 = 14 >= 0 -> loop terminates
        generator.setConstant(14);
        int n = 5;

        // Act
        int actual = generator.nextInt(n);

        // Assert
        Assert.assertEquals(14 % 5, actual);
    }

    @Test
    public void nextInt_givenNonPowerOfTwoOverflowRejection_shouldRetryUntilValid() {
        // Arrange:
        // When n = 3, Integer.MAX_VALUE = 2147483647.
        // val = 2147483647 % 3 = 1.
        // bits - val + (n - 1) = 2147483647 - 1 + 2 = 2147483648 -> in 32-bit signed int overflows to -2147483648 < 0.
        // This triggers the while condition (rejection)!
        // Next iteration returns 10: val = 10 % 3 = 1; 10 - 1 + 2 = 11 >= 0 -> accepted.
        int[] seq = new int[] { 0x7fffffff, 10 };
        generator.setSequence(seq);
        int n = 3;

        // Act
        int actual = generator.nextInt(n);

        // Assert
        Assert.assertEquals(1, actual);
    }

    // =========================================================================
    // nextLong() Tests
    // =========================================================================

    @Test
    public void nextLong_givenTwo32BitValues_shouldCombineInto64BitLong() {
        // Arrange
        // high = 0x12345678, low = 0x9abcdef0
        // Expected: (0x12345678L << 32) | (0x9abcdef0L & 0xffffffffL)
        int[] seq = new int[] { 0x12345678, 0x9abcdef0 };
        generator.setSequence(seq);

        // Act
        long actual = generator.nextLong();

        // Assert
        long expected = (0x12345678L << 32) | 0x9abcdef0L;
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(32, generator.getLastRequestedBits());
    }

    // =========================================================================
    // nextFloat() Tests
    // =========================================================================

    @Test
    public void nextFloat_givenZero_shouldReturnZeroFloat() {
        // Arrange
        generator.setConstant(0);

        // Act
        float actual = generator.nextFloat();

        // Assert
        Assert.assertEquals(0.0f, actual, 0.0f);
        Assert.assertEquals(23, generator.getLastRequestedBits());
    }

    @Test
    public void nextFloat_givenMax23Bits_shouldReturnStrictlyLessThanOne() {
        // Arrange: 23 bits max is (1 << 23) - 1
        generator.setConstant((1 << 23) - 1);

        // Act
        float actual = generator.nextFloat();

        // Assert
        Assert.assertTrue(actual >= 0.0f);
        Assert.assertTrue(actual < 1.0f);
    }

    // =========================================================================
    // nextDouble() Tests
    // =========================================================================

    @Test
    public void nextDouble_givenZeroBits_shouldReturnZeroDouble() {
        // Arrange
        generator.setConstant(0);

        // Act
        double actual = generator.nextDouble();

        // Assert
        Assert.assertEquals(0.0, actual, 0.0);
        Assert.assertEquals(26, generator.getLastRequestedBits());
    }

    @Test
    public void nextDouble_givenMax26Bits_shouldReturnValidRange() {
        // Arrange
        generator.setConstant((1 << 26) - 1);

        // Act
        double actual = generator.nextDouble();

        // Assert
        Assert.assertTrue(actual >= 0.0);
        Assert.assertTrue(actual < 1.0);
    }

    // =========================================================================
    // nextBytes(byte[]) Tests: 0, 1, 2, 3, 4, 7 bytes branches
    // =========================================================================

    @Test
    public void nextBytes_givenEmptyArray_shouldRemainEmpty() {
        // Arrange
        byte[] bytes = new byte[0];

        // Act
        generator.nextBytes(bytes);

        // Assert
        Assert.assertEquals(0, bytes.length);
    }

    @Test
    public void nextBytes_givenLength1_shouldFillOnlyOneByte() {
        // Arrange: length 1 enters only the second loop (tail bytes)
        generator.setConstant(0x12345678);
        byte[] bytes = new byte[1];

        // Act
        generator.nextBytes(bytes);

        // Assert
        Assert.assertEquals((byte) 0x78, bytes[0]);
    }

    @Test
    public void nextBytes_givenLength2_shouldFillTwoBytes() {
        // Arrange
        generator.setConstant(0x12345678);
        byte[] bytes = new byte[2];

        // Act
        generator.nextBytes(bytes);

        // Assert
        Assert.assertEquals((byte) 0x78, bytes[0]);
        Assert.assertEquals((byte) 0x56, bytes[1]);
    }

    @Test
    public void nextBytes_givenLength3_shouldFillThreeBytes() {
        // Arrange
        generator.setConstant(0x12345678);
        byte[] bytes = new byte[3];

        // Act
        generator.nextBytes(bytes);

        // Assert
        Assert.assertEquals((byte) 0x78, bytes[0]);
        Assert.assertEquals((byte) 0x56, bytes[1]);
        Assert.assertEquals((byte) 0x34, bytes[2]);
    }

    @Test
    public void nextBytes_givenLength4_shouldFillExactChunkWithoutTail() {
        // Arrange: exactly 4 bytes executes the main loop once, tail loop doesn't execute
        generator.setConstant(0x12345678);
        byte[] bytes = new byte[4];

        // Act
        generator.nextBytes(bytes);

        // Assert
        Assert.assertEquals((byte) 0x78, bytes[0]);
        Assert.assertEquals((byte) 0x56, bytes[1]);
        Assert.assertEquals((byte) 0x34, bytes[2]);
        Assert.assertEquals((byte) 0x12, bytes[3]);
    }

    @Test
    public void nextBytes_givenLength7_shouldFillFullChunkAndTailBytes() {
        // Arrange: 7 bytes = 1 full chunk (4 bytes) + 3 tail bytes
        int[] seq = new int[] { 0x12345678, (int) 0xAABBCCDD };
        generator.setSequence(seq);
        byte[] bytes = new byte[7];

        // Act
        generator.nextBytes(bytes);

        // Assert
        Assert.assertEquals((byte) 0x78, bytes[0]);
        Assert.assertEquals((byte) 0x56, bytes[1]);
        Assert.assertEquals((byte) 0x34, bytes[2]);
        Assert.assertEquals((byte) 0x12, bytes[3]);
        Assert.assertEquals((byte) 0xDD, bytes[4]);
        Assert.assertEquals((byte) 0xCC, bytes[5]);
        Assert.assertEquals((byte) 0xBB, bytes[6]);
    }

    // =========================================================================
    // nextGaussian() and clear() Tests
    // =========================================================================

    @Test
    public void nextGaussian_givenSubsequentCalls_shouldGeneratePairAndUseCachedValue() {
        // Arrange: Provide stable sequence for nextDouble() calls
        // nextDouble() calls next(26) twice per invocation
        generator.setConstant(12345678);

        // Act
        double firstGaussian = generator.nextGaussian();
        double secondGaussian = generator.nextGaussian();

        // Assert: Both values should be real finite numbers
        Assert.assertFalse(Double.isNaN(firstGaussian));
        Assert.assertFalse(Double.isInfinite(firstGaussian));
        Assert.assertFalse(Double.isNaN(secondGaussian));
        Assert.assertFalse(Double.isInfinite(secondGaussian));

        // Act 3rd call: Next gaussian pair should be generated
        double thirdGaussian = generator.nextGaussian();
        Assert.assertFalse(Double.isNaN(thirdGaussian));
    }

    @Test
    public void clear_givenCachedGaussian_shouldInvalidateCacheAndRegenerate() {
        // Arrange
        generator.setConstant(23456789);
        double first = generator.nextGaussian();

        // Act
        generator.clear(); // Clears cache (sets nextGaussian = Double.NaN)
        double afterClear = generator.nextGaussian(); // Must generate fresh pair, not return cached

        // Assert
        Assert.assertFalse(Double.isNaN(first));
        Assert.assertFalse(Double.isNaN(afterClear));
    }

    // =========================================================================
    // setSeed Tests (Abstract Method Verification)
    // =========================================================================

    @Test
    public void setSeed_givenVariousTypes_shouldInvokeProperly() {
        // Arrange & Act
        generator.setSeed(42);
        generator.setSeed(new int[] { 1, 2, 3 });
        generator.setSeed(9876543210L);

        // Assert
        Assert.assertEquals(3, generator.getSeedCount());
    }
}