package org.apache.commons.math.util;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MathUtilsTest {

    @Test
    public void testAddAndCheckNormal() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
        assertEquals(-1, MathUtils.addAndCheck(-2, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckOverflow() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }

    @Test
    public void testAddAndCheckLongNormal() {
        assertEquals(10L, MathUtils.addAndCheck(4L, 6L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongOverflow() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    @Test
    public void testMulAndCheckNormal() {
        assertEquals(12, MathUtils.mulAndCheck(3, 4));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckOverflow() {
        MathUtils.mulAndCheck(100000, 100000);
    }

    @Test
    public void testMulAndCheckLongNormal() {
        assertEquals(30L, MathUtils.mulAndCheck(5L, 6L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongOverflow() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test
    public void testSubAndCheckNormal() {
        assertEquals(2, MathUtils.subAndCheck(5, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckOverflow() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    @Test
    public void testGcdNormal() {
        assertEquals(4, MathUtils.gcd(12, 8));
        assertEquals(1, MathUtils.gcd(13, 7));
    }

    @Test
    public void testGcdZero() {
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(5, MathUtils.gcd(5, 0));
        assertEquals(0, MathUtils.gcd(0, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdMinValue() {
        MathUtils.gcd(Integer.MIN_VALUE, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdBothMinValue() {
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test
    public void testBinomialCoefficientNormal() {
        assertEquals(10, MathUtils.binomialCoefficient(5, 2));
        assertEquals(1, MathUtils.binomialCoefficient(0, 0));
        assertEquals(1, MathUtils.binomialCoefficient(5, 5));
        assertEquals(5, MathUtils.binomialCoefficient(5, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientException() {
        MathUtils.binomialCoefficient(2, 5);
    }

    @Test
    public void testBinomialCoefficientLargeN61() {
        long result = MathUtils.binomialCoefficient(61, 30);
        assertTrue(result > 0);
    }

    @Test
    public void testBinomialCoefficientLargeN65() {
        long result = MathUtils.binomialCoefficient(65, 30);
        assertTrue(result > 0);
    }

    @Test
    public void testBinomialCoefficientLargeN70() {
        long result = MathUtils.binomialCoefficient(70, 35);
        assertTrue(result > 0);
    }

    @Test
    public void testEquals() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertFalse(MathUtils.equals(1.0, 2.0));
    }

    @Test
    public void testEqualsWithEps() {
        assertTrue(MathUtils.equals(1.0, 1.0001, 0.001));
        assertFalse(MathUtils.equals(1.0, 1.001, 0.0001));
    }

    @Test
    public void testEqualsArray() {
        assertTrue(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 2.0}));
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{2.0}));
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
        assertFalse(MathUtils.equals(null, new double[]{1.0}));
        assertFalse(MathUtils.equals(new double[]{1.0}, null));
        assertTrue(MathUtils.equals(null, null));
    }

    @Test
    public void testNormalizeArrayNormal() {
        double[] values = {1.0, 2.0, 3.0};
        double[] norm = MathUtils.normalizeArray(values, 10.0);
        assertEquals(10.0/6.0, norm[0], 1e-12);
        assertEquals(20.0/6.0, norm[1], 1e-12);
        assertEquals(30.0/6.0, norm[2], 1e-12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArrayInfiniteSum() {
        MathUtils.normalizeArray(new double[]{1.0}, Double.POSITIVE_INFINITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArrayNaNValues() {
        MathUtils.normalizeArray(new double[]{1.0}, Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArrayZeroSum() {
        MathUtils.normalizeArray(new double[]{0.0, 0.0}, 10.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArrayInfiniteElement() {
        MathUtils.normalizeArray(new double[]{1.0, Double.POSITIVE_INFINITY}, 10.0);
    }

    @Test
    public void testNormalizeArrayWithNaN() {
        double[] values = {1.0, Double.NaN, 2.0};
        double[] norm = MathUtils.normalizeArray(values, 6.0);
        assertEquals(2.0, norm[0], 1e-12);
        assertTrue(Double.isNaN(norm[1]));
        assertEquals(4.0, norm[2], 1e-12);
    }

    @Test
    public void testRound() {
        assertEquals(1.23, MathUtils.round(1.2345, 2), 1e-12);
        assertEquals(1.24, MathUtils.round(1.2355, 2), 1e-12);
    }

    @Test
    public void testRoundSpecial() {
        assertTrue(Double.isInfinite(MathUtils.round(Double.POSITIVE_INFINITY, 2)));
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
    }

    @Test
    public void testRoundUnscaled() {
        double val = 1.5;
        assertEquals(2.0, MathUtils.round(val, 0, BigDecimal.ROUND_UP), 1e-12);
        assertEquals(1.0, MathUtils.round(val, 0, BigDecimal.ROUND_DOWN), 1e-12);
        assertEquals(2.0, MathUtils.round(val, 0, BigDecimal.ROUND_HALF_UP), 1e-12);
        assertEquals(1.0, MathUtils.round(val, 0, BigDecimal.ROUND_HALF_DOWN), 1e-12);
        assertEquals(2.0, MathUtils.round(val, 0, BigDecimal.ROUND_HALF_EVEN), 1e-12);
    }

    @Test
    public void testSignInt() {
        assertEquals(0, MathUtils.sign(0));
        assertEquals(1, MathUtils.sign(5));
        assertEquals(-1, MathUtils.sign(-3));
    }

    @Test
    public void testIndicatorInt() {
        assertEquals(1, MathUtils.indicator(0));
        assertEquals(1, MathUtils.indicator(5));
        assertEquals(-1, MathUtils.indicator(-3));
    }

    @Test
    public void testPowInt() {
        assertEquals(8, MathUtils.pow(2, 3));
        assertEquals(1, MathUtils.pow(2, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowIntNegativeExponent() {
        MathUtils.pow(2, -1);
    }

    @Test
    public void testPowLong() {
        assertEquals(8L, MathUtils.pow(2L, 3));
    }

    @Test
    public void testDistance1() {
        assertEquals(7, MathUtils.distance1(new int[]{1, 2}, new int[]{4, 6}));
        double d = MathUtils.distance1(new double[]{1.0, 2.0}, new double[]{4.0, 6.0});
        assertEquals(7.0, d, 1e-12);
    }

    @Test
    public void testDistance() {
        double d = MathUtils.distance(new int[]{0, 0}, new int[]{3, 4});
        assertEquals(5.0, d, 1e-12);
        d = MathUtils.distance(new double[]{0.0, 0.0}, new double[]{3.0, 4.0});
        assertEquals(5.0, d, 1e-12);
    }

    @Test
    public void testDistanceInf() {
        assertEquals(4, MathUtils.distanceInf(new int[]{1, 2}, new int[]{4, 6}));
        double d = MathUtils.distanceInf(new double[]{1.0, 2.0}, new double[]{4.0, 6.0});
        assertEquals(4.0, d, 1e-12);
    }

    @Test
    public void testCosh() {
        assertEquals(1.0, MathUtils.cosh(0.0), 1e-12);
        double expected = (Math.exp(1) + Math.exp(-1)) / 2.0;
        assertEquals(expected, MathUtils.cosh(1.0), 1e-12);
    }

    @Test
    public void testSinh() {
        assertEquals(0.0, MathUtils.sinh(0.0), 1e-12);
        double expected = (Math.exp(1) - Math.exp(-1)) / 2.0;
        assertEquals(expected, MathUtils.sinh(1.0), 1e-12);
    }

    @Test
    public void testNextAfter() {
        assertTrue(MathUtils.nextAfter(1.0, 2.0) > 1.0);
        assertTrue(MathUtils.nextAfter(1.0, 0.5) < 1.0);
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 1e-12);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 1e-12);
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
        assertTrue(Double.isInfinite(MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0)));
    }

    @Test
    public void testScalb() {
        assertEquals(8.0, MathUtils.scalb(2.0, 2), 1e-12);
        assertEquals(0.0, MathUtils.scalb(0.0, 2), 1e-12);
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 2)));
        assertTrue(Double.isInfinite(MathUtils.scalb(Double.POSITIVE_INFINITY, 2)));
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(2 * Math.PI, 0.0), 1e-12);
        assertEquals(Math.PI, MathUtils.normalizeAngle(Math.PI, 0.0), 1e-12);
        assertEquals(-Math.PI, MathUtils.normalizeAngle(-Math.PI, 0.0), 1e-12);
    }

    @Test
    public void testLcm() {
        assertEquals(24, MathUtils.lcm(6, 8));
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(0, MathUtils.lcm(5, 0));
        assertEquals(1, MathUtils.lcm(1, 1));
    }

    @Test
    public void testFactorial() {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(120L, MathUtils.factorial(5));
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorialOverflow() {
        MathUtils.factorial(21);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        MathUtils.factorial(-1);
    }

    @Test
    public void testFactorialLog() {
        assertEquals(0.0, MathUtils.factorialLog(0), 1e-12);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-12);
        double log100 = MathUtils.factorialLog(100);
        assertTrue(log100 > 0);
    }

    @Test
    public void testPowBigInteger() {
        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerNegativeExponent() {
        MathUtils.pow(BigInteger.valueOf(2), -1);
    }

    @Test
    public void testHash() {
        assertEquals(new Double(1.0).hashCode(), MathUtils.hash(1.0));
    }

    @Test
    public void testEqualsWithMaxUlps() {
        assertTrue(MathUtils.equals(0.0, Double.MIN_VALUE, 1));
        assertTrue(MathUtils.equals(0.0, 0.0, 1));
        assertFalse(MathUtils.equals(0.0, 1e-10, 1));
    }

    @Test
    public void testCompareTo() {
        assertEquals(-1, MathUtils.compareTo(1.0, 2.0, 0.1));
        assertEquals(1, MathUtils.compareTo(2.0, 1.0, 0.1));
        assertEquals(0, MathUtils.compareTo(1.0, 1.0001, 0.001));
    }

    @Test
    public void testSignDouble() {
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
        assertEquals(0.0, MathUtils.sign(0.0), 1e-12);
        assertEquals(1.0, MathUtils.sign(5.0), 1e-12);
        assertEquals(-1.0, MathUtils.sign(-3.0), 1e-12);
    }

    @Test
    public void testIndicatorDouble() {
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
        assertEquals(1.0, MathUtils.indicator(5.0), 1e-12);
        assertEquals(-1.0, MathUtils.indicator(-3.0), 1e-12);
    }

    @Test
    public void testIndicatorByte() {
        assertEquals((byte)1, MathUtils.indicator((byte)0));
        assertEquals((byte)1, MathUtils.indicator((byte)5));
        assertEquals((byte)-1, MathUtils.indicator((byte)-3));
    }

    @Test
    public void testSignByte() {
        assertEquals((byte)0, MathUtils.sign((byte)0));
        assertEquals((byte)1, MathUtils.sign((byte)5));
        assertEquals((byte)-1, MathUtils.sign((byte)-3));
    }

    @Test
    public void testBinomialCoefficientDouble() {
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), 1e-12);
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(1, 0), 1e-12);
        double c = MathUtils.binomialCoefficientDouble(67, 30);
        assertTrue(c > 0);
    }

    @Test
    public void testBinomialCoefficientLog() {
        assertEquals(Math.log(10), MathUtils.binomialCoefficientLog(5, 2), 1e-12);
        double log = MathUtils.binomialCoefficientLog(100, 50);
        assertTrue(log > 0);
        double logLarge = MathUtils.binomialCoefficientLog(2000, 1000);
        assertTrue(logLarge > 0);
    }
}