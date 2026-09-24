package org.apache.commons.math.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void testAddAndCheckInt() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
        assertEquals(-1, MathUtils.addAndCheck(Integer.MIN_VALUE, Integer.MAX_VALUE));
        assertEquals(Integer.MIN_VALUE, MathUtils.addAndCheck(Integer.MIN_VALUE, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckIntOverflow() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }

    @Test
    public void testAddAndCheckLong() {
        assertEquals(7L, MathUtils.addAndCheck(5L, 2L));
        assertEquals(-7L, MathUtils.addAndCheck(-3L, -4L));
        assertEquals(-1L, MathUtils.addAndCheck(Long.MIN_VALUE, Long.MAX_VALUE));
        assertEquals(0L, MathUtils.addAndCheck(-3L, 3L));
        assertEquals(Long.MIN_VALUE, MathUtils.addAndCheck(Long.MIN_VALUE, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongOverflow() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    @Test
    public void testBinomialCoefficient() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        assertEquals(120L, MathUtils.binomialCoefficient(10, 3));
        assertEquals(1891L, MathUtils.binomialCoefficient(62, 2));
        assertEquals(1891L, MathUtils.binomialCoefficient(62, 60));
    }

    @Test
    public void testBinomialCoefficientIllegalArgument() {
        try {
            MathUtils.binomialCoefficient(2, 3);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            MathUtils.binomialCoefficient(-1, -1);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficientOverflow() {
        MathUtils.binomialCoefficient(67, 33);
    }

    @Test
    public void testBinomialCoefficientDouble() {
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), 0.0);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 4), 0.0);
        assertEquals(1891.0, MathUtils.binomialCoefficientDouble(62, 2), 0.0);
        assertEquals(1.0089134454556419e29,
                MathUtils.binomialCoefficientDouble(100, 50), 1e15);
    }

    @Test
    public void testBinomialCoefficientLog() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), 0.0);
        assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 2), 1e-12);
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 4), 1e-12);
        assertEquals(Math.log(1.0089134454556419e29),
                MathUtils.binomialCoefficientLog(100, 50), 1e-10);
        assertTrue(MathUtils.binomialCoefficientLog(1030, 5) > 0.0);
    }

    @Test
    public void testCoshSinh() {
        assertEquals(1.0, MathUtils.cosh(0.0), 0.0);
        assertEquals(Math.cosh(1.0), MathUtils.cosh(1.0), 1e-12);
        assertEquals(0.0, MathUtils.sinh(0.0), 0.0);
        assertEquals(Math.sinh(1.0), MathUtils.sinh(1.0), 1e-12);
    }

    @Test
    public void testEqualsDouble() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertFalse(MathUtils.equals(1.0, 2.0));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
    }

    @Test
    public void testEqualsDoubleWithEpsilon() {
        assertTrue(MathUtils.equals(1.0, 1.0, 0.1));
        assertTrue(MathUtils.equals(1.0, 1.05, 0.1));
        assertTrue(MathUtils.equals(1.05, 1.0, 0.1));
        assertFalse(MathUtils.equals(1.0, 1.2, 0.1));
        assertFalse(MathUtils.equals(1.2, 1.0, 0.1));
    }

    @Test
    public void testEqualsArray() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        assertFalse(MathUtils.equals(null, new double[] {1.0}));
        assertFalse(MathUtils.equals(new double[] {1.0}, null));
        assertFalse(MathUtils.equals(new double[] {1.0}, new double[] {1.0, 2.0}));
        assertTrue(MathUtils.equals(new double[0], new double[0]));
        assertTrue(MathUtils.equals(new double[] {1.0}, new double[] {1.0}));
        assertFalse(MathUtils.equals(new double[] {1.0}, new double[] {1.5}));
        assertTrue(MathUtils.equals(new double[] {1.0, 2.0, 3.0}, new double[] {1.0, 2.0, 3.0}));
        assertFalse(MathUtils.equals(new double[] {1.0, 2.0, 3.0}, new double[] {1.0, 2.0, 4.0}));
    }

    @Test
    public void testFactorial() {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(120L, MathUtils.factorial(5));
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }

    @Test
    public void testFactorialExceptions() {
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
    public void testFactorialDoubleLog() {
        assertEquals(1.0, MathUtils.factorialDouble(0), 0.0);
        assertEquals(120.0, MathUtils.factorialDouble(5), 0.0);
        assertEquals(5.109094217170944E19, MathUtils.factorialDouble(21), 1e5);
        assertEquals(0.0, MathUtils.factorialLog(0), 0.0);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-12);
        assertEquals(45.3801388984769, MathUtils.factorialLog(21), 1e-10);
    }

    @Test
    public void testGcd() {
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(12, MathUtils.gcd(0, 12));
        assertEquals(12, MathUtils.gcd(12, 0));
        assertEquals(6, MathUtils.gcd(12, 18));
        assertEquals(6, MathUtils.gcd(-12, 18));
        assertEquals(6, MathUtils.gcd(12, -18));
        assertEquals(1, MathUtils.gcd(17, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdOverflow() {
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test
    public void testHash() {
        assertEquals(Double.valueOf(1.5).hashCode(), MathUtils.hash(1.5));
        assertEquals(Arrays.hashCode(new double[] {1.0, 2.0}),
                MathUtils.hash(new double[] {1.0, 2.0}));
    }

    @Test
    public void testIndicator() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) 1, MathUtils.indicator((byte) 3));
        assertEquals((byte) -1, MathUtils.indicator((byte) -3));

        assertEquals(1.0, MathUtils.indicator(0.0), 0.0);
        assertEquals(1.0, MathUtils.indicator(-0.0), 0.0);
        assertEquals(-1.0, MathUtils.indicator(-2.0), 0.0);
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));

        assertEquals(1.0f, MathUtils.indicator(0.0f), 0.0f);
        assertEquals(-1.0f, MathUtils.indicator(-2.0f), 0.0f);
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));

        assertEquals(1, MathUtils.indicator(0));
        assertEquals(1, MathUtils.indicator(3));
        assertEquals(-1, MathUtils.indicator(-3));

        assertEquals(1L, MathUtils.indicator(0L));
        assertEquals(-1L, MathUtils.indicator(-3L));

        assertEquals((short) 1, MathUtils.indicator((short) 0));
        assertEquals((short) -1, MathUtils.indicator((short) -3));
    }

    @Test
    public void testLcm() {
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(0, MathUtils.lcm(5, 0));
        assertEquals(6, MathUtils.lcm(2, 3));
        assertEquals(12, MathUtils.lcm(-4, 6));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmOverflow() {
        MathUtils.lcm(Integer.MAX_VALUE, 2);
    }

    @Test
    public void testLog() {
        assertEquals(2.0, MathUtils.log(10.0, 100.0), 1e-12);
        assertEquals(3.0, MathUtils.log(2.0, 8.0), 1e-12);
    }

    @Test
    public void testMulAndCheckInt() {
        assertEquals(6, MathUtils.mulAndCheck(2, 3));
        assertEquals(-6, MathUtils.mulAndCheck(-2, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckIntOverflow() {
        MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
    }

    @Test
    public void testMulAndCheckLong() {
        assertEquals(6L, MathUtils.mulAndCheck(2L, 3L));
        assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));
        assertEquals(-6L, MathUtils.mulAndCheck(-2L, 3L));
        assertEquals(0L, MathUtils.mulAndCheck(0L, Long.MAX_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongOverflow() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test
    public void testNextAfter() {
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.nextAfter(Double.NEGATIVE_INFINITY, 1.0), 0.0);
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);
        assertTrue(MathUtils.nextAfter(1.0, Double.POSITIVE_INFINITY) > 1.0);
        assertTrue(MathUtils.nextAfter(1.0, 0.0) < 1.0);
    }

    @Test
    public void testScalb() {
        assertEquals(8.0, MathUtils.scalb(2.0, 2), 0.0);
        assertEquals(0.5, MathUtils.scalb(1.0, -1), 0.0);
        assertEquals(0.0, MathUtils.scalb(0.0, 100), 0.0);
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 1)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, -5), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.scalb(Double.NEGATIVE_INFINITY, 5), 0.0);
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 0.0);
        assertEquals(-Math.PI, MathUtils.normalizeAngle(Math.PI, 0.0), 1e-12);
        assertEquals(-Math.PI / 2, MathUtils.normalizeAngle(3 * Math.PI / 2, 0.0), 1e-12);
        assertEquals(Math.PI, MathUtils.normalizeAngle(3 * Math.PI, Math.PI), 1e-12);
    }

    @Test
    public void testRoundDouble() {
        assertEquals(3.0, MathUtils.round(2.5, 0), 0.0);
        assertEquals(-3.0, MathUtils.round(-2.5, 0), 0.0);
        assertEquals(2.35, MathUtils.round(2.345, 2), 1e-12);
        assertEquals(2.0, MathUtils.round(2.5, 0, BigDecimal.ROUND_DOWN), 0.0);
        assertEquals(3.0, MathUtils.round(2.5, 0, BigDecimal.ROUND_CEILING), 0.0);
        assertEquals(-2.0, MathUtils.round(-2.5, 0, BigDecimal.ROUND_CEILING), 0.0);
        assertEquals(2.0, MathUtils.round(2.5, 0, BigDecimal.ROUND_FLOOR), 0.0);
        assertEquals(-3.0, MathUtils.round(-2.5, 0, BigDecimal.ROUND_FLOOR), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2), 0.0);
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
    }

    @Test
    public void testRoundFloat() {
        assertEquals(3.0f, MathUtils.round(2.5f, 0), 0.0f);
        assertEquals(-3.0f, MathUtils.round(-2.5f, 0), 0.0f);

        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_DOWN), 0.0f);
        assertEquals(-2.0f, MathUtils.round(-2.5f, 0, BigDecimal.ROUND_DOWN), 0.0f);
        assertEquals(3.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_CEILING), 0.0f);
        assertEquals(-2.0f, MathUtils.round(-2.5f, 0, BigDecimal.ROUND_CEILING), 0.0f);
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_FLOOR), 0.0f);
        assertEquals(-3.0f, MathUtils.round(-2.5f, 0, BigDecimal.ROUND_FLOOR), 0.0f);
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_DOWN), 0.0f);
        assertEquals(3.0f, MathUtils.round(2.6f, 0, BigDecimal.ROUND_HALF_DOWN), 0.0f);
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_EVEN), 0.0f);
        assertEquals(2.0f, MathUtils.round(2.4f, 0, BigDecimal.ROUND_HALF_EVEN), 0.0f);
        assertEquals(4.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_HALF_EVEN), 0.0f);
        assertEquals(3.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_UP), 0.0f);
        assertEquals(3.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_UP), 0.0f);
        assertEquals(2.0f, MathUtils.round(2.0f, 0, BigDecimal.ROUND_UNNECESSARY), 0.0f);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloatUnnecessary() {
        MathUtils.round(2.5f, 0, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloatInvalidMethod() {
        MathUtils.round(2.5f, 0, -1);
    }

    @Test
    public void testSign() {
        assertEquals(-1, MathUtils.sign(-5));
        assertEquals(0, MathUtils.sign(0));
        assertEquals(1, MathUtils.sign(5));

        assertEquals(-1L, MathUtils.sign(-5L));
        assertEquals(0L, MathUtils.sign(0L));
        assertEquals(1L, MathUtils.sign(5L));

        assertEquals((short) -1, MathUtils.sign((short) -5));
        assertEquals((short) 0, MathUtils.sign((short) 0));
        assertEquals((short) 1, MathUtils.sign((short) 5));

        assertEquals((byte) -1, MathUtils.sign((byte) -5));
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign((byte) 5));

        assertEquals(-1.0, MathUtils.sign(-5.0), 0.0);
        assertEquals(0.0, MathUtils.sign(0.0), 0.0);
        assertEquals(1.0, MathUtils.sign(5.0), 0.0);
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));

        assertEquals(-1.0f, MathUtils.sign(-5.0f), 0.0f);
        assertEquals(0.0f, MathUtils.sign(0.0f), 0.0f);
        assertEquals(1.0f, MathUtils.sign(5.0f), 0.0f);
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
    }

    @Test
    public void testSubAndCheckInt() {
        assertEquals(7, MathUtils.subAndCheck(10, 3));
        assertEquals(-2147483647, MathUtils.subAndCheck(Integer.MIN_VALUE, -1));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntOverflow() {
        MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
    }

    @Test
    public void testSubAndCheckLong() {
        assertEquals(5L, MathUtils.subAndCheck(5L, 0L));
        assertEquals(0L, MathUtils.subAndCheck(Long.MIN_VALUE, Long.MIN_VALUE));
        assertEquals(-1L, MathUtils.subAndCheck(0L, 1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongOverflow() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }
}