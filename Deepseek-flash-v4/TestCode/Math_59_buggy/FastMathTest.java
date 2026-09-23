package org.apache.commons.math.util;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

public class FastMathTest {

    private static final double EPSILON = 1e-10;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSqrtNormal() {
        Assert.assertEquals(2.0, FastMath.sqrt(4.0), EPSILON);
    }

    @Test
    public void testSqrtZero() {
        Assert.assertEquals(0.0, FastMath.sqrt(0.0), EPSILON);
    }

    @Test
    public void testSqrtNegative() {
        Assert.assertTrue(Double.isNaN(FastMath.sqrt(-1.0)));
    }

    @Test
    public void testCoshNormal() {
        Assert.assertEquals(Math.cosh(1.0), FastMath.cosh(1.0), EPSILON);
    }

    @Test
    public void testCoshPositiveLarge() {
        Assert.assertEquals(Math.cosh(25.0), FastMath.cosh(25.0), EPSILON);
    }

    @Test
    public void testCoshNegative() {
        Assert.assertEquals(Math.cosh(-1.0), FastMath.cosh(-1.0), EPSILON);
    }

    @Test
    public void testCoshNaN() {
        Assert.assertTrue(Double.isNaN(FastMath.cosh(Double.NaN)));
    }

    @Test
    public void testSinhNormal() {
        Assert.assertEquals(Math.sinh(0.5), FastMath.sinh(0.5), EPSILON);
    }

    @Test
    public void testSinhZero() {
        Assert.assertEquals(0.0, FastMath.sinh(0.0), EPSILON);
    }

    @Test
    public void testSinhNegative() {
        Assert.assertEquals(Math.sinh(-0.5), FastMath.sinh(-0.5), EPSILON);
    }

    @Test
    public void testSinhLargePositive() {
        Assert.assertEquals(Math.sinh(30.0), FastMath.sinh(30.0), EPSILON);
    }

    @Test
    public void testTanhNormal() {
        Assert.assertEquals(Math.tanh(0.5), FastMath.tanh(0.5), EPSILON);
    }

    @Test
    public void testTanhZero() {
        Assert.assertEquals(0.0, FastMath.tanh(0.0), EPSILON);
    }

    @Test
    public void testTanhLargePositive() {
        Assert.assertEquals(1.0, FastMath.tanh(100.0), EPSILON);
    }

    @Test
    public void testTanhLargeNegative() {
        Assert.assertEquals(-1.0, FastMath.tanh(-100.0), EPSILON);
    }

    @Test
    public void testTanhNaN() {
        Assert.assertTrue(Double.isNaN(FastMath.tanh(Double.NaN)));
    }

    @Test
    public void testAcoshNormal() {
        Assert.assertEquals(Math.log(2.0 + Math.sqrt(3.0)), FastMath.acosh(2.0), EPSILON);
    }

    @Test
    public void testAcoshOne() {
        Assert.assertEquals(0.0, FastMath.acosh(1.0), EPSILON);
    }

    @Test
    public void testAsinhNormal() {
        Assert.assertEquals(Math.log(0.5 + Math.sqrt(1.25)), FastMath.asinh(0.5), EPSILON);
    }

    @Test
    public void testAsinhNegative() {
        Assert.assertEquals(Math.log(-0.5 + Math.sqrt(1.25)), FastMath.asinh(-0.5), EPSILON);
    }

    @Test
    public void testAsinhZero() {
        Assert.assertEquals(0.0, FastMath.asinh(0.0), EPSILON);
    }

    @Test
    public void testAtanhNormal() {
        Assert.assertEquals(0.5 * Math.log(1.5 / 0.5), FastMath.atanh(0.25), EPSILON);
    }

    @Test
    public void testAtanhNegative() {
        Assert.assertEquals(0.5 * Math.log(0.5 / 1.5), FastMath.atanh(-0.25), EPSILON);
    }

    @Test
    public void testSignumPositive() {
        Assert.assertEquals(1.0, FastMath.signum(5.5), EPSILON);
    }

    @Test
    public void testSignumNegative() {
        Assert.assertEquals(-1.0, FastMath.signum(-5.5), EPSILON);
    }

    @Test
    public void testSignumZero() {
        Assert.assertEquals(0.0, FastMath.signum(0.0), EPSILON);
    }

    @Test
    public void testSignumNaNSign() {
        Assert.assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));
    }

    @Test
    public void testNextUpPositive() {
        double input = 1.0;
        double expected = Math.nextUp(1.0);
        Assert.assertEquals(expected, FastMath.nextUp(input), EPSILON);
    }

    @Test
    public void testNextUpNegative() {
        double input = -10.0;
        double expected = Math.nextUp(-10.0);
        Assert.assertEquals(expected, FastMath.nextUp(input), EPSILON);
    }

    @Test
    public void testNextUpNaN() {
        Assert.assertTrue(Double.isNaN(FastMath.nextUp(Double.NaN)));
    }

    @Test
    public void testExpNormal() {
        Assert.assertEquals(Math.exp(1.0), FastMath.exp(1.0), EPSILON);
    }

    @Test
    public void testExpNegative() {
        Assert.assertEquals(Math.exp(-1.0), FastMath.exp(-1.0), EPSILON);
    }

    @Test
    public void testExpLargePositive() {
        Assert.assertEquals(Math.exp(750.0), FastMath.exp(750.0), EPSILON);
    }

    @Test
    public void testExpZero() {
        Assert.assertEquals(1.0, FastMath.exp(0.0), EPSILON);
    }

    @Test
    public void testExpNegativeInfinity() {
        Assert.assertEquals(0.0, FastMath.exp(Double.NEGATIVE_INFINITY), EPSILON);
    }

    @Test
    public void testExpm1Zero() {
        Assert.assertEquals(0.0, FastMath.expm1(0.0), EPSILON);
    }

    @Test
    public void testExpm1NegativeOne() {
        Assert.assertEquals(-1.0, FastMath.expm1(-1.0), EPSILON);
    }

    @Test
    public void testExpm1Small() {
        double x = 0.0001;
        Assert.assertEquals(Math.expm1(x), FastMath.expm1(x), EPSILON);
    }

    @Test
    public void testLogNatural() {
        Assert.assertEquals(Math.log(2.0), FastMath.log(2.0), EPSILON);
    }

    @Test
    public void testLogOne() {
        Assert.assertEquals(0.0, FastMath.log(1.0), EPSILON);
    }

    @Test
    public void testLogNegative() {
        Assert.assertTrue(Double.isNaN(FastMath.log(-1.0)));
    }

    @Test
    public void testLogZero() {
        Assert.assertFalse(FastMath.log(0.0) > 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 0.0);
    }

    @Test
    public void testLogNaN() {
        Assert.assertTrue(Double.isNaN(FastMath.log(Double.NaN)));
    }

    @Test
    public void testLog1pZero() {
        Assert.assertEquals(0.0, FastMath.log1p(0.0), EPSILON);
    }

    @Test
    public void testLog1pMinusOne() {
        Assert.assertTrue(Double.isInfinite(FastMath.log1p(-1.0)));
    }

    @Test
    public void testLog1pSmallPositive() {
        double x = 1e-10;
        Assert.assertEquals(Math.log1p(x), FastMath.log1p(x), EPSILON);
    }

    @Test
    public void testLog10Normal() {
        Assert.assertEquals(Math.log10(50.0), FastMath.log10(50.0), EPSILON);
    }

    @Test
    public void testLog10One() {
        Assert.assertEquals(0.0, FastMath.log10(1.0), EPSILON);
    }

    @Test
    public void testLog10NaN() {
        Assert.assertTrue(Double.isNaN(FastMath.log10(Double.NaN)));
    }

    @Test
    public void testPowNormal() {
        Assert.assertEquals(Math.pow(2.0, 3.0), FastMath.pow(2.0, 3.0), EPSILON);
    }

    @Test
    public void testPowZeroExponent() {
        Assert.assertEquals(1.0, FastMath.pow(5.0, 0.0), EPSILON);
    }

    @Test
    public void testPowNegativeBaseOddExponent() {
        Assert.assertEquals(Math.pow(-2.0, 3.0), FastMath.pow(-2.0, 3.0), EPSILON);
    }

    @Test
    public void testPowNegativeBaseEvenExponent() {
        Assert.assertEquals(Math.pow(-2.0, 4.0), FastMath.pow(-2.0, 4.0), EPSILON);
    }

    @Test
    public void testPowNaNAndOne() {
        Assert.assertEquals(1.0, FastMath.pow(Double.NaN, 0.0), EPSILON);
    }

    @Test
    public void testPowOneAndOne() {
        Assert.assertEquals(1.0, FastMath.pow(1.0, Double.NaN), EPSILON);
    }

    @Test
    public void testPowInfiniteBaseNegativeExponent() {
        Assert.assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, -2.0), EPSILON);
    }

    @Test
    public void testSinNormal() {
        Assert.assertEquals(Math.sin(1.0), FastMath.sin(1.0), EPSILON);
    }

    @Test
    public void testSinZero() {
        Assert.assertEquals(0.0, FastMath.sin(0.0), EPSILON);
    }

    @Test
    public void testSinPiOverTwo() {
        Assert.assertEquals(Math.sin(Math.PI / 2), FastMath.sin(Math.PI / 2), EPSILON);
    }

    @Test
    public void testCosNormal() {
        Assert.assertEquals(Math.cos(1.0), FastMath.cos(1.0), EPSILON);
    }

    @Test
    public void testCosZero() {
        Assert.assertEquals(1.0, FastMath.cos(0.0), EPSILON);
    }

    @Test
    public void testTanNormal() {
        Assert.assertEquals(Math.tan(1.0), FastMath.tan(1.0), EPSILON);
    }

    @Test
    public void testTanZero() {
        Assert.assertEquals(0.0, FastMath.tan(0.0), EPSILON);
    }

    @Test
    public void testAtanNormal() {
        Assert.assertEquals(Math.atan(1.0), FastMath.atan(1.0), EPSILON);
    }

    @Test
    public void testAtanNegative() {
        Assert.assertEquals(Math.atan(-1.0), FastMath.atan(-1.0), EPSILON);
    }

    @Test
    public void testAtan2Normal() {
        Assert.assertEquals(Math.atan2(1.0, 2.0), FastMath.atan2(1.0, 2.0), EPSILON);
    }

    @Test
    public void testAtan2ZeroYPositiveX() {
        Assert.assertEquals(0.0, FastMath.atan2(0.0, 1.0), EPSILON);
    }

    @Test
    public void testAtan2NegativeZeroY() {
        Assert.assertEquals(-0.0, FastMath.atan2(-0.0, 1.0), EPSILON);
    }

    @Test
    public void testAsinNormal() {
        Assert.assertEquals(Math.asin(0.5), FastMath.asin(0.5), EPSILON);
    }

    @Test
    public void testAsinOne() {
        Assert.assertEquals(Math.PI / 2, FastMath.asin(1.0), EPSILON);
    }

    @Test
    public void testAcosNormal() {
        Assert.assertEquals(Math.acos(0.5), FastMath.acos(0.5), EPSILON);
    }

    @Test
    public void testAcosOne() {
        Assert.assertEquals(0.0, FastMath.acos(1.0), EPSILON);
    }

    @Test
    public void testCbrtNormal() {
        Assert.assertEquals(Math.cbrt(27.0), FastMath.cbrt(27.0), EPSILON);
    }

    @Test
    public void testCbrtNegative() {
        Assert.assertEquals(Math.cbrt(-27.0), FastMath.cbrt(-27.0), EPSILON);
    }

    @Test
    public void testToRadiansNormal() {
        Assert.assertEquals(Math.toRadians(180.0), FastMath.toRadians(180.0), EPSILON);
    }

    @Test
    public void testToDegreesNormal() {
        Assert.assertEquals(Math.toDegrees(Math.PI), FastMath.toDegrees(Math.PI), EPSILON);
    }

    @Test
    public void testAbsIntNegative() {
        Assert.assertEquals(5, FastMath.abs(-5));
    }

    @Test
    public void testAbsIntPositive() {
        Assert.assertEquals(5, FastMath.abs(5));
    }

    @Test
    public void testAbsLongNegative() {
        Assert.assertEquals(5L, FastMath.abs(-5L));
    }

    @Test
    public void testAbsFloatNegative() {
        Assert.assertEquals(5.0f, FastMath.abs(-5.0f), 0.001f);
    }

    @Test
    public void testAbsDoubleNegative() {
        Assert.assertEquals(5.0, FastMath.abs(-5.0), EPSILON);
    }

    @Test
    public void testUlpNormal() {
        Assert.assertEquals(Math.ulp(1.0), FastMath.ulp(1.0), EPSILON);
    }

    @Test
    public void testNextAfterPositive() {
        Assert.assertEquals(Math.nextAfter(1.0, 2.0), FastMath.nextAfter(1.0, 2.0), EPSILON);
    }

    @Test
    public void testNextAfterNaN() {
        Assert.assertTrue(Double.isNaN(FastMath.nextAfter(Double.NaN, 1.0)));
    }

    @Test
    public void testFloorNormal() {
        Assert.assertEquals(1.0, FastMath.floor(1.5), EPSILON);
    }

    @Test
    public void testFloorNegative() {
        Assert.assertEquals(-2.0, FastMath.floor(-1.5), EPSILON);
    }

    @Test
    public void testCeilNormal() {
        Assert.assertEquals(2.0, FastMath.ceil(1.5), EPSILON);
    }

    @Test
    public void testCeilNegative() {
        Assert.assertEquals(-1.0, FastMath.ceil(-1.5), EPSILON);
    }

    @Test
    public void testRintNormal() {
        Assert.assertEquals(2.0, FastMath.rint(1.5), EPSILON);
    }

    @Test
    public void testRintHalfEven() {
        Assert.assertEquals(2.0, FastMath.rint(2.5), EPSILON);
    }

    @Test
    public void testRoundDouble() {
        Assert.assertEquals(2L, FastMath.round(2.3));
    }

    @Test
    public void testRoundDoubleLarge() {
        Assert.assertEquals(3L, FastMath.round(2.5));
    }

    @Test
    public void testRoundFloat() {
        Assert.assertEquals(2, FastMath.round(2.3f));
    }

    @Test
    public void testMinIntNormal() {
        Assert.assertEquals(1, FastMath.min(1, 2));
    }

    @Test
    public void testMaxIntNormal() {
        Assert.assertEquals(2, FastMath.max(1, 2));
    }

    @Test
    public void testMinLongNormal() {
        Assert.assertEquals(1L, FastMath.min(1L, 2L));
    }

    @Test
    public void testMaxLongNormal() {
        Assert.assertEquals(2L, FastMath.max(1L, 2L));
    }

    @Test
    public void testMinFloatNormal() {
        Assert.assertEquals(1.0f, FastMath.min(1.0f, 2.0f), 0.001f);
    }

    @Test
    public void testMaxFloatNormal() {
        Assert.assertEquals(2.0f, FastMath.max(1.0f, 2.0f), 0.001f);
    }

    @Test
    public void testMinDoubleNormal() {
        Assert.assertEquals(1.0, FastMath.min(1.0, 2.0), EPSILON);
    }

    @Test
    public void testMaxDoubleNormal() {
        Assert.assertEquals(2.0, FastMath.max(1.0, 2.0), EPSILON);
    }

    @Test
    public void testMinWithNaN() {
        Assert.assertTrue(Double.isNaN(FastMath.min(Double.NaN, 1.0)));
    }

    @Test
    public void testMaxWithNaN() {
        Assert.assertTrue(Double.isNaN(FastMath.max(Double.NaN, 1.0)));
    }
}