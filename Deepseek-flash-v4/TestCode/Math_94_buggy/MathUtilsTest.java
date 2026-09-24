package org.apache.commons.math.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void testAddAndCheckInt() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
        assertEquals(Integer.MAX_VALUE, MathUtils.addAndCheck(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, MathUtils.addAndCheck(Integer.MIN_VALUE, 0));
        assertEquals(Integer.MAX_VALUE - 1, MathUtils.addAndCheck(Integer.MAX_VALUE, -1));
    }

    @Test
    public void testAddAndCheckIntOverflow() {
        try {
            MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
            fail();
        } catch (ArithmeticException e) {
        }
        try {
            MathUtils.addAndCheck(Integer.MIN_VALUE, -1);
            fail();
        } catch (ArithmeticException e) {
        }
    }

    @Test
    public void testAddAndCheckLong() {
        assertEquals(5L, MathUtils.addAndCheck(2L, 3L));
        assertEquals(Long.MAX_VALUE, MathUtils.addAndCheck(Long.MAX_VALUE - 1, 1L));
        try {
            MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
            fail();
        } catch (ArithmeticException e) {
        }
        try {
            MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
            fail();
        } catch (ArithmeticException e) {
        }
    }

    @Test
    public void testBinomialCoefficient() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        assertEquals(1L, MathUtils.binomialCoefficient(0, 0));
    }

    @Test
    public void testBinomialCoefficientIllegalArgument() {
        try {
            MathUtils.binomialCoefficient(2, 3);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            MathUtils.binomialCoefficient(-1, 2);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            MathUtils.binomialCoefficientDouble(2, 3);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            MathUtils.binomialCoefficientLog(-1, 2);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficientOverflow() {
        MathUtils.binomialCoefficient(67, 33);
    }

    @Test
    public void testBinomialCoefficientLogAndDouble() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), 0.0);
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 1), 1e-12);
        assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 2), 1e-12);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), 1e-12);
    }

    @Test
    public void testCosh() {
        assertEquals(1.0, MathUtils.cosh(0.0), 0.0);
        assertEquals(1.5430806348152437, MathUtils.cosh(1.0), 1e-15);
    }

    @Test
    public void testEqualsDouble() {
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertFalse(MathUtils.equals(1.0, 2.0));
    }

    @Test
    public void testEqualsDoubleArray() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        assertFalse(MathUtils.equals(new double[]{1.0}, null));
        assertFalse(MathUtils.equals(null, new double[]{1.0}));
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
        assertTrue(MathUtils.equals(new double[]{1.0, Double.NaN}, new double[]{1.0, Double.NaN}));
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{2.0}));
        assertTrue(MathUtils.equals(new double[0], new double[0]));
    }

    @Test
    public void testFactorial() {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(120L, MathUtils.factorial(5));
        try {
            MathUtils.factorial(-1);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            MathUtils.factorial(21);
            fail();
        } catch (ArithmeticException e) {
        }
    }

    @Test
    public void testFactorialDoubleAndLog() {
        assertEquals(1.0, MathUtils.factorialDouble(0), 0.0);
        assertEquals(120.0, MathUtils.factorialDouble(5), 1e-12);
        assertEquals(0.0, MathUtils.factorialLog(0), 0.0);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-12);
        try {
            MathUtils.factorialDouble(-1);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            MathUtils.factorialLog(-1);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testGcd() {
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(1, MathUtils.gcd(0, 1));
        assertEquals(1, MathUtils.gcd(1, 0));
        assertEquals(6, MathUtils.gcd(12, 18));
        assertEquals(6, MathUtils.gcd(-12, 18));
        assertEquals(1, MathUtils.gcd(5, 7));
    }

    @Test
    public void testHash() {
        assertEquals(new Double(3.14).hashCode(), MathUtils.hash(3.14));
        assertEquals(Arrays.hashCode(new double[]{1.0, 2.0}), MathUtils.hash(new double[]{1.0, 2.0}));
    }

    @Test
    public void testIndicators() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) -1, MathUtils.indicator((byte) -1));
        assertEquals((byte) 1, MathUtils.indicator((byte) 2));
        assertEquals(1.0, MathUtils.indicator(0.0), 0.0);
        assertEquals(-1.0, MathUtils.indicator(-3.2), 0.0);
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
        assertEquals(1.0f, MathUtils.indicator(0.0f), 0.0f);
        assertEquals(-1.0f, MathUtils.indicator(-3.2f), 0.0f);
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
        assertEquals(1, MathUtils.indicator(0));
        assertEquals(-1, MathUtils.indicator(-2));
        assertEquals(1L, MathUtils.indicator(0L));
        assertEquals(-1L, MathUtils.indicator(-2L));
        assertEquals((short) 1, MathUtils.indicator((short) 0));
        assertEquals((short) -1, MathUtils.indicator((short) -2));
    }

    @Test
    public void testLcm() {
        assertEquals(12, MathUtils.lcm(4, 6));
        assertEquals(0, MathUtils.lcm(0, 5));
    }

    @Test
    public void testLog() {
        assertEquals(2.0, MathUtils.log(10.0, 100.0), 1e-12);
    }

    @Test
    public void testMulAndCheckInt() {
        assertEquals(12, MathUtils.mulAndCheck(3, 4));
        try {
            MathUtils.mulAndCheck(100000, 100000);
            fail();
        } catch (ArithmeticException e) {
        }
    }

    @Test
    public void testMulAndCheckLong() {
        assertEquals(12L, MathUtils.mulAndCheck(3L, 4L));
        assertEquals(0L, MathUtils.mulAndCheck(0L, 4L));
        try {
            MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
            fail();
        } catch (ArithmeticException e) {
        }
        try {
            MathUtils.mulAndCheck(Long.MIN_VALUE, -1L);
            fail();
        } catch (ArithmeticException e) {
        }
    }

    @Test
    public void testNextAfter() {
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.nextAfter(Double.NEGATIVE_INFINITY, 1.0), 0.0);
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);
        assertTrue(MathUtils.nextAfter(1.0, 2.0) > 1.0);
        assertTrue(MathUtils.nextAfter(1.0, 0.0) < 1.0);
    }

    @Test
    public void testScalb() {
        assertEquals(0.0, MathUtils.scalb(0.0, 5), 0.0);
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 5)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 5), 0.0);
        assertEquals(8.0, MathUtils.scalb(1.0, 3), 0.0);
        assertEquals(0.125, MathUtils.scalb(1.0, -3), 0.0);
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, Math.PI), 1e-12);
        assertEquals(Math.PI, MathUtils.normalizeAngle(3 * Math.PI, Math.PI), 1e-12);
        assertEquals(0.0, MathUtils.normalizeAngle(2 * Math.PI, 0.0), 1e-12);
    }

    @Test
    public void testRoundDouble() {
        assertEquals(1.23, MathUtils.round(1.234, 2), 1e-12);
        assertEquals(1.24, MathUtils.round(1.235, 2), 1e-12);
        assertEquals(-1.24, MathUtils.round(-1.235, 2), 1e-12);
        assertEquals(1.0, MathUtils.round(1.0, 0), 0.0);
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2), 0.0);
    }

    @Test
    public void testRoundDoubleWithRoundingMethod() {
        assertEquals(1.0, MathUtils.round(1.5, 0, BigDecimal.ROUND_DOWN), 0.0);
        assertEquals(2.0, MathUtils.round(1.5, 0, BigDecimal.ROUND_CEILING), 0.0);
        assertEquals(1.0, MathUtils.round(1.5, 0, BigDecimal.ROUND_FLOOR), 0.0);
        assertEquals(2.0, MathUtils.round(1.5, 0, BigDecimal.ROUND_HALF_EVEN), 0.0);
        assertEquals(2.0, MathUtils.round(2.5, 0, BigDecimal.ROUND_HALF_EVEN), 0.0);
        assertEquals(1.0, MathUtils.round(1.5, 0, BigDecimal.ROUND_HALF_DOWN), 0.0);
        assertEquals(2.0, MathUtils.round(1.5, 0, BigDecimal.ROUND_HALF_UP), 0.0);
        assertEquals(2.0, MathUtils.round(1.6, 0, BigDecimal.ROUND_UP), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundInvalidMethod() {
        MathUtils.round(1.5, 0, 99);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundUnnecessaryInexact() {
        MathUtils.round(1.5, 0, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test
    public void testRoundFloat() {
        assertEquals(1.23f, MathUtils.round(1.234f, 2), 0.001f);
        assertEquals(-1.24f, MathUtils.round(-1.235f, 2), 0.001f);
        assertEquals(1.0f, MathUtils.round(1.0f, 0), 0.0f);
        assertTrue(Float.isNaN(MathUtils.round(Float.NaN, 2)));
    }

    @Test
    public void testSign() {
        assertEquals((byte) -1, MathUtils.sign((byte) -2));
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign((byte) 3));
        assertEquals(-1.0, MathUtils.sign(-2.0), 0.0);
        assertEquals(0.0, MathUtils.sign(0.0), 0.0);
        assertEquals(1.0, MathUtils.sign(3.0), 0.0);
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
        assertEquals(-1.0f, MathUtils.sign(-2.0f), 0.0f);
        assertEquals(0.0f, MathUtils.sign(0.0f), 0.0f);
        assertEquals(1.0f, MathUtils.sign(3.0f), 0.0f);
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
        assertEquals(-1, MathUtils.sign(-2));
        assertEquals(0, MathUtils.sign(0));
        assertEquals(1, MathUtils.sign(3));
        assertEquals(-1L, MathUtils.sign(-2L));
        assertEquals(0L, MathUtils.sign(0L));
        assertEquals(1L, MathUtils.sign(3L));
        assertEquals((short) -1, MathUtils.sign((short) -2));
        assertEquals((short) 0, MathUtils.sign((short) 0));
        assertEquals((short) 1, MathUtils.sign((short) 3));
    }

    @Test
    public void testSinh() {
        assertEquals(0.0, MathUtils.sinh(0.0), 0.0);
        assertEquals(1.1752011936438014, MathUtils.sinh(1.0), 1e-15);
    }

    @Test
    public void testSubAndCheckInt() {
        assertEquals(2, MathUtils.subAndCheck(5, 3));
        try {
            MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
            fail();
        } catch (ArithmeticException e) {
        }
        try {
            MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
            fail();
        } catch (ArithmeticException e) {
        }
    }

    @Test
    public void testSubAndCheckLong() {
        assertEquals(2L, MathUtils.subAndCheck(5L, 3L));
        assertEquals(Long.MAX_VALUE, MathUtils.subAndCheck(-1L, Long.MIN_VALUE));
        try {
            MathUtils.subAndCheck(0L, Long.MIN_VALUE);
            fail();
        } catch (ArithmeticException e) {
        }
        try {
            MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
            fail();
        } catch (ArithmeticException e) {
        }
    }
}