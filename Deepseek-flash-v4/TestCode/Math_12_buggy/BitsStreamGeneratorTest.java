package org.apache.commons.math3.random;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;

public class BitsStreamGeneratorTest {

    private TestableBitsStreamGenerator generator;

    @Before
    public void setUp() {
        generator = new TestableBitsStreamGenerator();
    }

    @After
    public void tearDown() {
        generator = null;
    }

    @Test
    public void testNextBoolean() {
        generator.nextValues = new int[] {0, 1, 2, 3};
        assertFalse(generator.nextBoolean());
        assertTrue(generator.nextBoolean());
        assertTrue(generator.nextBoolean());
        assertTrue(generator.nextBoolean());
    }

    @Test
    public void testNextBytesWithLengthLessThanFour() {
        byte[] bytes = new byte[3];
        generator.nextValues = new int[] {0x01020304};
        generator.nextBytes(bytes);
        assertEquals(0x04, bytes[0]);
        assertEquals(0x03, bytes[1]);
        assertEquals(0x02, bytes[2]);
    }

    @Test
    public void testNextBytesWithLengthMultipleOfFour() {
        byte[] bytes = new byte[4];
        generator.nextValues = new int[] {0x01020304};
        generator.nextBytes(bytes);
        assertEquals(0x04, bytes[0]);
        assertEquals(0x03, bytes[1]);
        assertEquals(0x02, bytes[2]);
        assertEquals(0x01, bytes[3]);
    }

    @Test
    public void testNextBytesWithLengthNotMultipleOfFour() {
        byte[] bytes = new byte[6];
        generator.nextValues = new int[] {0x01020304, 0x0A0B0C0D};
        generator.nextBytes(bytes);
        assertEquals(0x04, bytes[0]);
        assertEquals(0x03, bytes[1]);
        assertEquals(0x02, bytes[2]);
        assertEquals(0x01, bytes[3]);
        assertEquals(0x0D, bytes[4]);
        assertEquals(0x0C, bytes[5]);
    }

    @Test
    public void testNextBytesEmptyArray() {
        byte[] bytes = new byte[0];
        generator.nextBytes(bytes);
        assertEquals(0, bytes.length);
    }

    @Test
    public void testNextDouble() {
        generator.nextValues = new int[] {0x12345678, 0x9ABCDEF0};
        double result = generator.nextDouble();
        assertTrue(result >= 0.0 && result < 1.0);
    }

    @Test
    public void testNextFloat() {
        generator.nextValues = new int[] {0x12345678};
        float result = generator.nextFloat();
        assertTrue(result >= 0.0f && result < 1.0f);
    }

    @Test
    public void testNextGaussianInitialCall() {
        generator.nextValues = new int[] {0x40000000, 0x40000000};
        double result = generator.nextGaussian();
        assertFalse(Double.isNaN(result));
        assertNotNull(result);
    }

    @Test
    public void testNextGaussianPair() {
        generator.nextValues = new int[] {0x40000000, 0x40000000, 0x40000000, 0x40000000};
        double first = generator.nextGaussian();
        double second = generator.nextGaussian();
        assertFalse(Double.isNaN(first));
        assertFalse(Double.isNaN(second));
        assertNotEquals(first, second);
    }

    @Test
    public void testNextGaussianCacheCleared() {
        generator.nextValues = new int[] {0x40000000, 0x40000000, 0x40000000, 0x40000000};
        generator.nextGaussian();
        generator.clear();
        double third = generator.nextGaussian();
        assertFalse(Double.isNaN(third));
    }

    @Test
    public void testNextIntDefault() {
        generator.nextValues = new int[] {0x12345678};
        assertEquals(0x12345678, generator.nextInt());
    }

    @Test
    public void testNextIntWithPowerOfTwo() {
        generator.nextValues = new int[] {0x40000000};
        int result = generator.nextInt(16);
        assertTrue(result >= 0 && result < 16);
    }

    @Test
    public void testNextIntWithNonPowerOfTwo() {
        generator.nextValues = new int[] {0x40000000, 0x40000000};
        int result = generator.nextInt(15);
        assertTrue(result >= 0 && result < 15);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNextIntWithZero() {
        generator.nextInt(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNextIntWithNegative() {
        generator.nextInt(-1);
    }

    @Test
    public void testNextLong() {
        generator.nextValues = new int[] {0x12345678, 0x9ABCDEF0};
        long result = generator.nextLong();
        assertEquals(0x123456789ABCDEFL, result);
    }

    @Test
    public void testClearAndNextGaussian() {
        generator.nextValues = new int[] {0x40000000, 0x40000000, 0x40000000, 0x40000000};
        double first = generator.nextGaussian();
        double second = generator.nextGaussian();
        assertFalse(Double.isNaN(first));
        assertFalse(Double.isNaN(second));
        generator.clear();
        double third = generator.nextGaussian();
        assertFalse(Double.isNaN(third));
    }

    private static class TestableBitsStreamGenerator extends BitsStreamGenerator {
        private int[] nextValues;
        private int index = 0;

        @Override
        protected int next(int bits) {
            if (index >= nextValues.length) {
                index = 0;
            }
            int value = nextValues[index++];
            return (int) (value & ((1L << bits) - 1));
        }

        @Override
        public void setSeed(int seed) {
            // no-op for test
        }

        @Override
        public void setSeed(int[] seed) {
            // no-op for test
        }

        @Override
        public void setSeed(long seed) {
            // no-op for test
        }
    }

    @Test
    public void testNextIntWithNarrowingAndRejection() {
        generator.nextValues = new int[] {0x40000000, 0x40000000, 0x00000100};
        int result = generator.nextInt(2);
        assertTrue(result == 0 || result == 1);
    }

    @Test
    public void testNextBytesWithRepeatedAccess() {
        byte[] bytes1 = new byte[4];
        byte[] bytes2 = new byte[4];
        generator.nextValues = new int[] {0x01020304, 0x05060708};
        generator.nextBytes(bytes1);
        generator.nextBytes(bytes2);
        assertArrayEquals(new byte[] {0x04, 0x03, 0x02, 0x01}, bytes1);
        assertArrayEquals(new byte[] {0x08, 0x07, 0x06, 0x05}, bytes2);
    }

    @Test
    public void testNextGaussianLoopAround() {
        generator.nextValues = new int[] {0x40000000, 0x40000000, 0x40000000, 0x40000000};
        for (int i = 0; i < 10; i++) {
            double result = generator.nextGaussian();
            assertFalse(Double.isNaN(result));
        }
    }

    @Test
    public void testNextIntWithLimitAndLoop() {
        generator.nextValues = new int[] {0x40000000, 0x40000000, 0x40000000, 0x40000000};
        for (int i = 0; i < 5; i++) {
            int result = generator.nextInt(100000);
            assertTrue(result >= 0 && result < 100000);
        }
    }
}