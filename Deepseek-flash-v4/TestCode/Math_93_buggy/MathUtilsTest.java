package org.apache.commons.math.util;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void testAddAndCheckInt() {
        assertEquals(3, MathUtils.addAndCheck(1, 2));
        assertEquals(-1, MathUtils.addAndCheck(1, -2));
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
    public void testAddAndCheckLong() {
        assertEquals(3L, MathUtils.addAndCheck(1L, 2L));
        assertEquals(-9223372036854775807L, MathUtils.addAndCheck(1L, Long.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongOverflowPositive() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongOverflowNegative() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongOverflowA() {
        MathUtils.addAndCheck(-1L, Long.MIN_VALUE);
    }

    @Test
    public void testBinomialCoefficient() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
        assertEquals(120L, MathUtils.binomialCoefficient(10, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNLessK() {
        MathUtils.binomialCoefficient(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNegativeN() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficientOverflow() {
        MathUtils.binomialCoefficient(67, 33);
    }

    @Test
    public void testBinomialCoefficientDouble() {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 5), 0.0);
        assertEquals(120.0, MathUtils.binomialCoefficientDouble(10, 3), 1e-12);
    }

    @Test
    public void testBinomialCoefficientLog() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), 0.0);
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 1), 1e-12);
        assertEquals(Math.log(120.0), MathUtils.binomialCoefficientLog(10, 3), 1e-12);
    }

    @Test
    public void testCoshSinh() {
        assertEquals(1.0, MathUtils.cosh(0.0), 0.0);
        assertEquals(0.0, MathUtils.sinh(0.0), 0.0);
        assertEquals(1.5430806348152437, MathUtils.cosh(1.0), 1e-12);
        assertEquals(1.1752011936438014, MathUtils.sinh(1.0), 1e-12);
    }

    @Test
    public void testEqualsDouble() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertFalse(MathUtils.equals(1.0, 2.0));
    }

    @Test
    public void testEqualsDoubleArray() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        assertFalse(MathUtils.equals(new double[]{1.0}, (double[]) null));
        assertFalse(MathUtils.equals((double[]) null, new double[]{1.0}));
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
        assertTrue(MathUtils.equals(new double[0], new double[0]));
        assertTrue(MathUtils.equals(new double[]{Double.NaN, 1.0}, new double[]{Double.NaN, 1.0}));
        assertFalse(MathUtils.equals(new double[]{Double.NaN, 1.0}, new double[]{1.0, 1.0}));
        assertFalse(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));
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
        assertEquals(1.0, MathUtils.factorialDouble(0), 0.0);
        assertEquals(120.0, MathUtils.factorialDouble(5), 1e-12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDoubleNegative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialLog() {
        assertEquals(0.0, MathUtils.factorialLog(0), 0.0);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLogNegative() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testGcd() {
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(5, MathUtils.gcd(5, 0));
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
        assertEquals(1072693248, MathUtils.hash(1.0));
        assertEquals(1072693279, MathUtils.hash(new double[]{1.0}));
        assertEquals(1, MathUtils.hash(new double[0]));
        assertEquals(0, MathUtils.hash((double[]) null));
    }

    @Test
    public void testIndicator() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) -1, MathUtils.indicator((byte) -1));
        assertEquals(1.0, MathUtils.indicator(0.0), 0.0);
        assertEquals(-1.0, MathUtils.indicator(-2.0), 0.0);
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
        assertEquals(1.0f, MathUtils.indicator(0.0f), 0.0f);
        assertEquals(-1.0f, MathUtils.indicator(-2.0f), 0.0f);
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
        assertEquals(1, MathUtils.indicator(0));
        assertEquals(-1, MathUtils.indicator(-5));
        assertEquals(1L, MathUtils.indicator(0L));
        assertEquals(-1L, MathUtils.indicator(-5L));
        assertEquals((short) 1, MathUtils.indicator((short) 0));
        assertEquals((short) -1, MathUtils.indicator((short) -5));
    }

    @Test
    public void testLcm() {
        assertEquals(15, MathUtils.lcm(3, 5));
        assertEquals(15, MathUtils.lcm(-3, 5));
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(0, MathUtils.lcm(5, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmOverflow() {
        MathUtils.lcm(Integer.MAX_VALUE, 2);
    }

    @Test
    public void testLog() {
        assertEquals(2.0, MathUtils.log(10, 100), 1e-12);
        assertEquals(3.0, MathUtils.log(2, 8), 1e-12);
    }

    @Test
    public void testMulAndCheckInt() {
        assertEquals(12, MathUtils.mulAndCheck(3, 4));
        assertEquals(-12, MathUtils.mulAndCheck(-3, 4));
        assertEquals(0, MathUtils.mulAndCheck(0, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckIntOverflowPositive() {
        MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckIntOverflowNegative() {
        MathUtils.mulAndCheck(Integer.MIN_VALUE, -1);
    }

    @Test
    public void testMulAndCheckLong() {
        assertEquals(12L, MathUtils.mulAndCheck(3L, 4L));
        assertEquals(-12L, MathUtils.mulAndCheck(-3L, 4L));
        assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));
        assertEquals(0L, MathUtils.mulAndCheck(Long.MIN_VALUE, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongOverflowPositive() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongOverflowNegative() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testNextAfter() {
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.nextAfter(Double.NEGATIVE_INFINITY, -1.0), 0.0);
        assertEquals(0.9999999999999999, MathUtils.nextAfter(1.0, 0.0), 1e-15);
    }

    @Test
    public void testScalb() {
        assertEquals(2.0, MathUtils.scalb(1.0, 1), 0.0);
        assertEquals(0.5, MathUtils.scalb(1.0, -1), 0.0);
        assertEquals(0.0, MathUtils.scalb(0.0, 100), 0.0);
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 1)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 1), 0.0);
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 1e-12);
        assertEquals(-Math.PI, MathUtils.normalizeAngle(Math.PI, 0.0), 1e-12);
        assertEquals(-Math.PI / 2.0, MathUtils.normalizeAngle(3.0 * Math.PI / 2.0, 0.0), 1e-12);
    }

    @Test
    public void testRoundDouble() {
        assertEquals(1.23, MathUtils.round(1.2345, 2), 1e-12);
        assertEquals(2.35, MathUtils.round(2.345, 2), 1e-12);
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 0)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.round(Double.NEGATIVE_INFINITY, 2), 0.0);
    }

    @Test
    public void testRoundDoubleRoundingMethod() {
        assertEquals(2.0, MathUtils.round(1.2, 0, BigDecimal.ROUND_CEILING), 0.0);
        assertEquals(-1.0, MathUtils.round(-1.2, 0, BigDecimal.ROUND_CEILING), 0.0);
        assertEquals(-2.0, MathUtils.round(-1.2, 0, BigDecimal.ROUND_FLOOR), 0.0);
        assertEquals(1.0, MathUtils.round(1.5, 0, BigDecimal.ROUND_DOWN), 0.0);
        assertEquals(2.0, MathUtils.round(1.2, 0, BigDecimal.ROUND_UP), 0.0);
        assertEquals(2.0, MathUtils.round(2.5, 0, BigDecimal.ROUND_HALF_EVEN), 0.0);
        assertEquals(4.0, MathUtils.round(3.5, 0, BigDecimal.ROUND_HALF_EVEN), 0.0);
        assertEquals(1.0, MathUtils.round(1.0, 0, BigDecimal.ROUND_UNNECESSARY), 0.0);
    }

    @Test
    public void testRoundFloat() {
        assertEquals(1.24f, MathUtils.round(1.235f, 2), 0.001f);
    }

    @Test
    public void testRoundFloatRoundingModes() {
        assertEquals(2.0f, MathUtils.round(1.2f, 0, BigDecimal.ROUND_CEILING), 0.0f);
        assertEquals(-1.0f, MathUtils.round(-1.2f, 0, BigDecimal.ROUND_CEILING), 0.0f);
        assertEquals(-2.0f, MathUtils.round(-1.2f, 0, BigDecimal.ROUND_FLOOR), 0.0f);
        assertEquals(1.0f, MathUtils.round(1.8f, 0, BigDecimal.ROUND_DOWN), 0.0f);
        assertEquals(2.0f, MathUtils.round(1.2f, 0, BigDecimal.ROUND_UP), 0.0f);
        assertEquals(1.0f, MathUtils.round(1.5f, 0, BigDecimal.ROUND_HALF_DOWN), 0.0f);
        assertEquals(2.0f, MathUtils.round(1.6f, 0, BigDecimal.ROUND_HALF_DOWN), 0.0f);
        assertEquals(2.0f, MathUtils.round(1.5f, 0, BigDecimal.ROUND_HALF_UP), 0.0f);
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_EVEN), 0.0f);
        assertEquals(4.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_HALF_EVEN), 0.0f);
        assertEquals(1.0f, MathUtils.round(1.0f, 0, BigDecimal.ROUND_UNNECESSARY), 0.0f);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloatUnnecessaryInexact() {
        MathUtils.round(1.5f, 0, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloatInvalidRoundingMethod() {
        MathUtils.round(1.5f, 0, 99);
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
    public void testSubAndCheckInt() {
        assertEquals(2, MathUtils.subAndCheck(5, 3));
        assertEquals(-8, MathUtils.subAndCheck(-5, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntOverflowPositive() {
        MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntOverflowNegative() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    @Test
    public void testSubAndCheckLong() {
        assertEquals(2L, MathUtils.subAndCheck(5L, 3L));
        assertEquals(Long.MAX_VALUE, MathUtils.subAndCheck(-1L, Long.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongBMinPositive() {
        MathUtils.subAndCheck(1L, Long.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongOverflow() {
        MathUtils.subAndCheck(Long.MIN_VALUE, 1L);
    }
}