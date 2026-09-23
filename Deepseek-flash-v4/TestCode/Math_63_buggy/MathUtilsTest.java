package org.apache.commons.math.util;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.math.exception.NonMonotonousSequenceException;

public class MathUtilsTest {
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAddAndCheckIntNormal() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
        assertEquals(-5, MathUtils.addAndCheck(-2, -3));
        assertEquals(0, MathUtils.addAndCheck(Integer.MAX_VALUE, Integer.MIN_VALUE + 1));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckIntOverflow() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }
    
    @Test
    public void testAddAndCheckIntUnderflow() {
        try {
            MathUtils.addAndCheck(Integer.MIN_VALUE, -1);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
        }
    }
    
    @Test
    public void testAddAndCheckLongNormal() {
        assertEquals(10L, MathUtils.addAndCheck(4L, 6L));
        assertEquals(-10L, MathUtils.addAndCheck(-4L, -6L));
        assertEquals(0L, MathUtils.addAndCheck(Long.MAX_VALUE, Long.MIN_VALUE + 1));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongOverflow() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }
    
    @Test
    public void testAddAndCheckLongNegativeOverflow() {
        try {
            MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
        }
    }
    
    @Test
    public void testBinomialCoefficientBasic() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNLessThanK() {
        MathUtils.binomialCoefficient(3, 5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNegativeN() {
        MathUtils.binomialCoefficient(-1, 2);
    }
    
    @Test
    public void testBinomialCoefficientLarge() {
        assertEquals(155117520L, MathUtils.binomialCoefficient(30, 10));
    }
    
    @Test
    public void testBinomialCoefficientDoubleBasic() {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), 0.0001);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 1), 0.0001);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientDoubleInvalid() {
        MathUtils.binomialCoefficientDouble(2, 5);
    }
    
    @Test
    public void testBinomialCoefficientLogBasic() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), 0.0001);
        assertEquals(Math.log(5), MathUtils.binomialCoefficientLog(5, 1), 0.0001);
        assertEquals(Math.log(10), MathUtils.binomialCoefficientLog(5, 2), 0.0001);
    }
    
    @Test
    public void testCompareTo() {
        assertEquals(0, MathUtils.compareTo(1.0, 1.0, 0.1));
        assertEquals(-1, MathUtils.compareTo(0.5, 1.0, 0.1));
        assertEquals(1, MathUtils.compareTo(1.5, 1.0, 0.1));
    }
    
    @Test
    public void testCosh() {
        assertEquals(1.0, MathUtils.cosh(0.0), 0.0001);
        assertEquals(Math.cosh(1.0), MathUtils.cosh(1.0), 0.0001);
    }
    
    @Test
    public void testEqualsDouble() {
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertFalse(MathUtils.equals(1.0, 2.0));
    }
    
    @Test
    public void testEqualsWithEpsilon() {
        assertTrue(MathUtils.equals(1.0, 1.05, 0.1));
        assertFalse(MathUtils.equals(1.0, 1.15, 0.1));
    }
    
    @Test
    public void testEqualsWithUlps() {
        assertTrue(MathUtils.equals(1.0, 1.0, 1));
        assertFalse(MathUtils.equals(1.0, 1.1, 1));
    }
    
    @Test
    public void testEqualsDoubleArray() {
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {1.0, 2.0, 3.0};
        assertTrue(MathUtils.equals(x, y));
        double[] z = {1.0, 2.0, 4.0};
        assertFalse(MathUtils.equals(x, z));
        assertTrue(MathUtils.equals(null, null));
        assertFalse(MathUtils.equals(x, null));
        assertFalse(MathUtils.equals(null, y));
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
        assertEquals(1.0, MathUtils.factorialDouble(0), 0.0001);
        assertEquals(1.0, MathUtils.factorialDouble(1), 0.0001);
        assertEquals(120.0, MathUtils.factorialDouble(5), 0.0001);
    }
    
    @Test
    public void testFactorialLog() {
        assertEquals(0.0, MathUtils.factorialLog(0), 0.0001);
        assertEquals(Math.log(1.0), MathUtils.factorialLog(1), 0.0001);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLogNegative() {
        MathUtils.factorialLog(-1);
    }
    
    @Test
    public void testGcdInt() {
        assertEquals(4, MathUtils.gcd(8, 12));
        assertEquals(1, MathUtils.gcd(7, 13));
        assertEquals(6, MathUtils.gcd(-12, 18));
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(5, MathUtils.gcd(0, 5));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testGcdIntMinValue() {
        MathUtils.gcd(Integer.MIN_VALUE, 0);
    }
    
    @Test
    public void testGcdLong() {
        assertEquals(4L, MathUtils.gcd(8L, 12L));
        assertEquals(1L, MathUtils.gcd(7L, 13L));
        assertEquals(0L, MathUtils.gcd(0L, 0L));
        assertEquals(5L, MathUtils.gcd(0L, 5L));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testGcdLongMinValue() {
        MathUtils.gcd(Long.MIN_VALUE, 0L);
    }
    
    @Test
    public void testHashDouble() {
        assertEquals(new Double(1.0).hashCode(), MathUtils.hash(1.0));
    }
    
    @Test
    public void testIndicatorByte() {
        assertEquals((byte)1, MathUtils.indicator((byte)5));
        assertEquals((byte)-1, MathUtils.indicator((byte)-5));
        assertEquals((byte)1, MathUtils.indicator((byte)0));
    }
    
    @Test
    public void testIndicatorDouble() {
        assertEquals(1.0, MathUtils.indicator(5.0), 0.0001);
        assertEquals(-1.0, MathUtils.indicator(-5.0), 0.0001);
        assertEquals(1.0, MathUtils.indicator(0.0), 0.0001);
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
    }
    
    @Test
    public void testIndicatorInt() {
        assertEquals(1, MathUtils.indicator(5));
        assertEquals(-1, MathUtils.indicator(-5));
        assertEquals(1, MathUtils.indicator(0));
    }
    
    @Test
    public void testIndicatorLong() {
        assertEquals(1L, MathUtils.indicator(5L));
        assertEquals(-1L, MathUtils.indicator(-5L));
        assertEquals(1L, MathUtils.indicator(0L));
    }
    
    @Test
    public void testLcmInt() {
        assertEquals(12, MathUtils.lcm(4, 6));
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(35, MathUtils.lcm(5, 7));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testLcmIntOverflow() {
        MathUtils.lcm(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
    
    @Test
    public void testLcmLong() {
        assertEquals(12L, MathUtils.lcm(4L, 6L));
        assertEquals(0L, MathUtils.lcm(0L, 5L));
        assertEquals(35L, MathUtils.lcm(5L, 7L));
    }
    
    @Test
    public void testLog() {
        assertEquals(1.0, MathUtils.log(2.0, 2.0), 0.0001);
        assertEquals(2.0, MathUtils.log(10.0, 100.0), 0.0001);
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
        assertEquals(0L, MathUtils.mulAndCheck(0L, 100L));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongOverflow() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }
    
    @Test
    public void testScalb() {
        assertEquals(2.0, MathUtils.scalb(1.0, 1), 0.0001);
        assertEquals(0.5, MathUtils.scalb(1.0, -1), 0.0001);
        assertEquals(0.0, MathUtils.scalb(0.0, 5), 0.0001);
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 2)));
    }
    
    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(Math.PI, 0.0), 0.0001);
        assertEquals(Math.PI / 2, MathUtils.normalizeAngle(3 * Math.PI / 2, Math.PI / 2), 0.0001);
    }
    
    @Test
    public void testNormalizeArray() {
        double[] values = {1.0, 2.0, 3.0};
        double[] normalized = MathUtils.normalizeArray(values, 10.0);
        assertEquals(10.0, normalized[0] + normalized[1] + normalized[2], 0.0001);
        assertEquals(1.6666666666666667, normalized[0], 0.0001);
        assertEquals(3.3333333333333335, normalized[1], 0.0001);
        assertEquals(5.0, normalized[2], 0.0001);
    }
    
    @Test
    public void testNormalizeArrayWithNaN() {
        double[] values = {1.0, Double.NaN, 3.0};
        double[] normalized = MathUtils.normalizeArray(values, 4.0);
        assertTrue(Double.isNaN(normalized[1]));
        assertEquals(4.0, normalized[0] + normalized[2], 0.0001);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testNormalizeArraySumZero() {
        double[] values = {0.0, 0.0};
        MathUtils.normalizeArray(values, 1.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArrayInfiniteSum() {
        double[] values = {1.0, 2.0};
        MathUtils.normalizeArray(values, Double.POSITIVE_INFINITY);
    }
    
    @Test
    public void testRound() {
        assertEquals(3.0, MathUtils.round(2.5, 0), 0.0001);
        assertEquals(2.0, MathUtils.round(2.4, 0), 0.0001);
        assertEquals(-3.0, MathUtils.round(-2.5, 0), 0.0001);
        assertEquals(2.35, MathUtils.round(2.345, 2), 0.0001);
    }
    
    @Test
    public void testRoundInfinite() {
        assertTrue(Double.isInfinite(MathUtils.round(Double.POSITIVE_INFINITY, 2)));
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
    }
    
    @Test
    public void testSignDouble() {
        assertEquals(1.0, MathUtils.sign(5.0), 0.0001);
        assertEquals(-1.0, MathUtils.sign(-5.0), 0.0001);
        assertEquals(0.0, MathUtils.sign(0.0), 0.0001);
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
    }
    
    @Test
    public void testSignInt() {
        assertEquals(1, MathUtils.sign(5));
        assertEquals(-1, MathUtils.sign(-5));
        assertEquals(0, MathUtils.sign(0));
    }
    
    @Test
    public void testSinh() {
        assertEquals(0.0, MathUtils.sinh(0.0), 0.0001);
        assertEquals(Math.sinh(1.0), MathUtils.sinh(1.0), 0.0001);
    }
    
    @Test
    public void testSubAndCheckInt() {
        assertEquals(2, MathUtils.subAndCheck(5, 3));
        assertEquals(-2, MathUtils.subAndCheck(-5, -3));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntOverflow() {
        MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
    }
    
    @Test
    public void testSubAndCheckLong() {
        assertEquals(2L, MathUtils.subAndCheck(5L, 3L));
        assertEquals(-2L, MathUtils.subAndCheck(-5L, -3L));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongOverflow() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }
    
    @Test
    public void testPowInt() {
        assertEquals(8, MathUtils.pow(2, 3));
        assertEquals(1, MathUtils.pow(5, 0));
        assertEquals(16, MathUtils.pow(4, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPowIntNegativeExponent() {
        MathUtils.pow(2, -1);
    }
    
    @Test
    public void testPowLong() {
        assertEquals(8L, MathUtils.pow(2L, 3));
        assertEquals(1L, MathUtils.pow(5L, 0));
        assertEquals(16L, MathUtils.pow(4L, 2));
    }
    
    @Test
    public void testPowBigInteger() {
        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), 3));
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(5), 0));
    }
    
    @Test
    public void testDistance1() {
        double[] p1 = {1.0, 2.0};
        double[] p2 = {3.0, 5.0};
        assertEquals(5.0, MathUtils.distance1(p1, p2), 0.0001);
    }
    
    @Test
    public void testDistanceInt() {
        int[] p1 = {1, 2};
        int[] p2 = {3, 5};
        assertEquals(5.0, MathUtils.distance(p1, p2), 0.0001);
    }
    
    @Test
    public void testDistanceDouble() {
        double[] p1 = {1.0, 2.0};
        double[] p2 = {4.0, 6.0};
        assertEquals(5.0, MathUtils.distance(p1, p2), 0.0001);
    }
    
    @Test
    public void testDistanceInf() {
        double[] p1 = {1.0, 2.0};
        double[] p2 = {4.0, 6.0};
        assertEquals(4.0, MathUtils.distanceInf(p1, p2), 0.0001);
    }
    
    @Test
    public void testCheckOrderIncreasing() {
        double[] values = {1.0, 2.0, 3.0};
        MathUtils.checkOrder(values);
    }
    
    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrderNotIncreasing() {
        double[] values = {3.0, 2.0, 1.0};
        MathUtils.checkOrder(values);
    }
    
    @Test
    public void testCheckOrderNonStrict() {
        double[] values = {1.0, 1.0, 2.0};
        MathUtils.checkOrder(values, MathUtils.OrderDirection.INCREASING, false);
    }
    
    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrderStrictEqual() {
        double[] values = {1.0, 1.0, 2.0};
        MathUtils.checkOrder(values, MathUtils.OrderDirection.INCREASING, true);
    }
    
    @Test
    public void testCheckOrderDecreasing() {
        double[] values = {3.0, 2.0, 1.0};
        MathUtils.checkOrder(values, MathUtils.OrderDirection.DECREASING, true);
    }
    
    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrderNotDecreasing() {
        double[] values = {1.0, 2.0, 3.0};
        MathUtils.checkOrder(values, MathUtils.OrderDirection.DECREASING, true);
    }
    
    @Test
    public void testSafeNormNormal() {
        double[] v = {3.0, 4.0};
        assertEquals(5.0, MathUtils.safeNorm(v), 0.0001);
    }
    
    @Test
    public void testSafeNormZero() {
        double[] v = {0.0, 0.0, 0.0};
        assertEquals(0.0, MathUtils.safeNorm(v), 0.0001);
    }
    
    @Test
    public void testSafeNormLarge() {
        double[] v = {1e200, 0.0};
        assertEquals(1e200, MathUtils.safeNorm(v), 1e190);
    }
    
    @Test
    public void testSafeNormSmall() {
        double[] v = {1e-200, 0.0};
        assertEquals(1e-200, MathUtils.safeNorm(v), 1e-210);
    }
}