package org.apache.commons.math.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void testAddAndCheckIntNormal() {
        assertEquals(3, MathUtils.addAndCheck(1, 2));
        assertEquals(0, MathUtils.addAndCheck(-1, 1));
        assertEquals(Integer.MAX_VALUE, MathUtils.addAndCheck(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, MathUtils.addAndCheck(Integer.MIN_VALUE, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckIntOverflowPositive() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckIntOverflowNegative() {
        MathUtils.addAndCheck(Integer.MIN_VALUE, -1);
    }

    @Test
    public void testAddAndCheckLongNormal() {
        assertEquals(3L, MathUtils.addAndCheck(1L, 2L));
        assertEquals(0L, MathUtils.addAndCheck(-1L, 1L));
        assertEquals(Long.MAX_VALUE, MathUtils.addAndCheck(Long.MAX_VALUE, 0L));
        assertEquals(Long.MIN_VALUE, MathUtils.addAndCheck(Long.MIN_VALUE, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongOverflowPositive() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongOverflowNegative() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testBinomialCoefficientNormal() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNLessThanK() {
        MathUtils.binomialCoefficient(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNegativeN() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficientOverflow() {
        MathUtils.binomialCoefficient(70, 35);
    }

    @Test
    public void testBinomialCoefficientDoubleAndLog() {
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), 0.0);
        assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 2), 1e-12);
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), 0.0);
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 1), 1e-12);
    }

    @Test
    public void testCosh() {
        assertEquals(1.0, MathUtils.cosh(0.0), 0.0);
        assertEquals((Math.exp(1.0) + Math.exp(-1.0)) / 2.0, MathUtils.cosh(1.0), 1e-12);
    }

    @Test
    public void testEqualsDouble() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertTrue(MathUtils.equals(0.0, -0.0));
        assertFalse(MathUtils.equals(1.0, 2.0));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
    }

    @Test
    public void testEqualsDoubleArray() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        assertFalse(MathUtils.equals(null, new double[] {1.0}));
        assertFalse(MathUtils.equals(new double[] {1.0}, null));
        assertFalse(MathUtils.equals(new double[] {1.0}, new double[] {1.0, 2.0}));
        assertTrue(MathUtils.equals(new double[] {1.0, Double.NaN}, new double[] {1.0, Double.NaN}));
        assertFalse(MathUtils.equals(new double[] {1.0, 2.0}, new double[] {1.0, 3.0}));
        assertTrue(MathUtils.equals(new double[] {}, new double[] {}));
    }

    @Test
    public void testFactorial() {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(1L, MathUtils.factorial(1));
        assertEquals(120L, MathUtils.factorial(5));
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        MathUtils.factorial(-1);
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorialTooLarge() {
        MathUtils.factorial(21);
    }

    @Test
    public void testFactorialDouble() {
        assertEquals(120.0, MathUtils.factorialDouble(5), 0.0);
        assertEquals(2432902008176640000.0, MathUtils.factorialDouble(20), 0.0);
        assertTrue(MathUtils.factorialDouble(21) > 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDoubleNegative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialLog() {
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-12);
        assertTrue(MathUtils.factorialLog(21) > MathUtils.factorialLog(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLogNegative() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testGcdNormal() {
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(6, MathUtils.gcd(12, 18));
        assertEquals(6, MathUtils.gcd(-12, 18));
        assertEquals(1, MathUtils.gcd(1, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdOverflow() {
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test
    public void testHash() {
        assertEquals(0, MathUtils.hash(0.0));
        assertEquals(1072693248, MathUtils.hash(1.0));
        assertEquals(1, MathUtils.hash(new double[] {1.0, 2.0}));
    }

    @Test
    public void testIndicator() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) -1, MathUtils.indicator((byte) -1));
        assertEquals(1.0, MathUtils.indicator(0.0), 0.0);
        assertEquals(-1.0, MathUtils.indicator(-0.5), 0.0);
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
        assertEquals(1.0f, MathUtils.indicator(0.0f), 0.0f);
        assertEquals(-1.0f, MathUtils.indicator(-1.0f), 0.0f);
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
        assertEquals(1, MathUtils.indicator(0));
        assertEquals(-1, MathUtils.indicator(-1));
        assertEquals(1L, MathUtils.indicator(0L));
        assertEquals(-1L, MathUtils.indicator(-1L));
        assertEquals((short) 1, MathUtils.indicator((short) 0));
        assertEquals((short) -1, MathUtils.indicator((short) -1));
    }

    @Test
    public void testLcm() {
        assertEquals(12, MathUtils.lcm(4, 6));
        assertEquals(12, MathUtils.lcm(-4, 6));
        assertEquals(0, MathUtils.lcm(0, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmOverflow() {
        MathUtils.lcm(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }

    @Test
    public void testLog() {
        assertEquals(2.0, MathUtils.log(10.0, 100.0), 1e-12);
        assertEquals(1.0, MathUtils.log(Math.E, Math.E), 1e-12);
    }

    @Test
    public void testMulAndCheckIntNormal() {
        assertEquals(6, MathUtils.mulAndCheck(2, 3));
        assertEquals(-6, MathUtils.mulAndCheck(-2, 3));
        assertEquals(0, MathUtils.mulAndCheck(0, 100));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckIntOverflow() {
        MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
    }

    @Test
    public void testMulAndCheckLongNormal() {
        assertEquals(6L, MathUtils.mulAndCheck(2L, 3L));
        assertEquals(-6L, MathUtils.mulAndCheck(-2L, 3L));
        assertEquals(0L, MathUtils.mulAndCheck(0L, Long.MAX_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongOverflow() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test
    public void testNextAfter() {
        assertTrue(MathUtils.nextAfter(1.0, 2.0) > 1.0);
        assertTrue(MathUtils.nextAfter(1.0, 0.0) < 1.0);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0), 0.0);
    }

    @Test
    public void testScalb() {
        assertEquals(0.0, MathUtils.scalb(0.0, 10), 0.0);
        assertEquals(0.5, MathUtils.scalb(1.0, -1), 0.0);
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 5)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 5), 0.0);
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 1e-12);
        assertEquals(0.0, MathUtils.normalizeAngle(2 * Math.PI, 0.0), 1e-12);
        assertEquals(Math.PI, MathUtils.normalizeAngle(-Math.PI, 0.0), 1e-12);
        assertEquals(Math.PI, MathUtils.normalizeAngle(Math.PI, 0.0), 1e-12);
    }

    @Test
    public void testRoundDouble() {
        assertEquals(1.23, MathUtils.round(1.234, 2), 0.0);
        assertEquals(1.24, MathUtils.round(1.235, 2), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2), 0.0);
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
    }

    @Test
    public void testRoundFloat() {
        assertEquals(1.23f, MathUtils.round(1.234f, 2), 0.001f);
        assertEquals(1.24f, MathUtils.round(1.235f, 2), 0.001f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundInvalidRoundingMethod() {
        MathUtils.round(1.0, 0, 999);
    }

    @Test
    public void testRoundUnnecessary() {
        assertEquals(1.0, MathUtils.round(1.0, 0, BigDecimal.ROUND_UNNECESSARY), 0.0);
        try {
            MathUtils.round(1.1, 0, BigDecimal.ROUND_UNNECESSARY);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException expected) {
            // expected
        }
    }

    @Test
    public void testSign() {
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign((byte) 1));
        assertEquals((byte) -1, MathUtils.sign((byte) -1));
        assertEquals(0.0, MathUtils.sign(0.0), 0.0);
        assertEquals(1.0, MathUtils.sign(1.0), 0.0);
        assertEquals(-1.0, MathUtils.sign(-1.0), 0.0);
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
        assertEquals(0.0f, MathUtils.sign(0.0f), 0.0f);
        assertEquals(1.0f, MathUtils.sign(1.0f), 0.0f);
        assertEquals(-1.0f, MathUtils.sign(-1.0f), 0.0f);
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
        assertEquals(0, MathUtils.sign(0));
        assertEquals(1, MathUtils.sign(1));
        assertEquals(-1, MathUtils.sign(-1));
        assertEquals(0L, MathUtils.sign(0L));
        assertEquals(1L, MathUtils.sign(1L));
        assertEquals(-1L, MathUtils.sign(-1L));
        assertEquals((short) 0, MathUtils.sign((short) 0));
        assertEquals((short) 1, MathUtils.sign((short) 1));
        assertEquals((short) -1, MathUtils.sign((short) -1));
    }

    @Test
    public void testSinh() {
        assertEquals(0.0, MathUtils.sinh(0.0), 0.0);
        assertEquals((Math.exp(1.0) - Math.exp(-1.0)) / 2.0, MathUtils.sinh(1.0), 1e-12);
    }

    @Test
    public void testSubAndCheckIntNormal() {
        assertEquals(-1, MathUtils.subAndCheck(1, 2));
        assertEquals(0, MathUtils.subAndCheck(-1, -1));
        assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntOverflow() {
        MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
    }

    @Test
    public void testSubAndCheckLongNormal() {
        assertEquals(-1L, MathUtils.subAndCheck(1L, 2L));
        assertEquals(0L, MathUtils.subAndCheck(-1L, -1L));
        assertEquals(Long.MAX_VALUE, MathUtils.subAndCheck(Long.MAX_VALUE, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongOverflow() {
        MathUtils.subAndCheck(Long.MIN_VALUE, 1L);
    }
}