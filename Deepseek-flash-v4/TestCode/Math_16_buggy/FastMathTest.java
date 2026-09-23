package org.apache.commons.math3.util;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class FastMathTest {
    
    private static final double EPSILON = 1e-10;
    private static final double MAX_VALUE = Double.MAX_VALUE;
    private static final double MIN_VALUE = Double.MIN_VALUE;

    @Before
    public void setUp() {
        // Test setup
    }

    @After
    public void tearDown() {
        // Test teardown
    }

    @Test
    public void testAbsInt() {
        assertEquals(5, FastMath.abs(5));
        assertEquals(5, FastMath.abs(-5));
        assertEquals(0, FastMath.abs(0));
        assertEquals(Integer.MIN_VALUE, FastMath.abs(Integer.MIN_VALUE));
    }

    @Test
    public void testAbsLong() {
        assertEquals(5L, FastMath.abs(5L));
        assertEquals(5L, FastMath.abs(-5L));
        assertEquals(0L, FastMath.abs(0L));
        assertEquals(Long.MIN_VALUE, FastMath.abs(Long.MIN_VALUE));
    }

    @Test
    public void testAbsFloat() {
        assertEquals(5.0f, FastMath.abs(5.0f), 0.0f);
        assertEquals(5.0f, FastMath.abs(-5.0f), 0.0f);
        assertEquals(0.0f, FastMath.abs(0.0f), 0.0f);
        assertEquals(Float.MAX_VALUE, FastMath.abs(-Float.MAX_VALUE), 0.0f);
    }

    @Test
    public void testAbsDouble() {
        assertEquals(5.0, FastMath.abs(5.0), 0.0);
        assertEquals(5.0, FastMath.abs(-5.0), 0.0);
        assertEquals(0.0, FastMath.abs(0.0), 0.0);
        assertEquals(Double.MAX_VALUE, FastMath.abs(-Double.MAX_VALUE), 0.0);
    }

    @Test
    public void testSqrt() {
        assertEquals(2.0, FastMath.sqrt(4.0), 0.0);
        assertEquals(0.0, FastMath.sqrt(0.0), 0.0);
        assertEquals(Double.NaN, FastMath.sqrt(-1.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.sqrt(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testCosh() {
        assertEquals(1.0, FastMath.cosh(0.0), 0.0);
        assertEquals(Math.cosh(1.0), FastMath.cosh(1.0), 1e-10);
        assertEquals(Math.cosh(-1.0), FastMath.cosh(-1.0), 1e-10);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(Double.POSITIVE_INFINITY), 0.0);
        assertEquals(0.5 * FastMath.exp(20.0), FastMath.cosh(20.0), 1e-5);
    }

    @Test
    public void testSinh() {
        assertEquals(0.0, FastMath.sinh(0.0), 0.0);
        assertEquals(Math.sinh(1.0), FastMath.sinh(1.0), 1e-10);
        assertEquals(Math.sinh(-1.0), FastMath.sinh(-1.0), 1e-10);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.sinh(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testTanh() {
        assertEquals(0.0, FastMath.tanh(0.0), 0.0);
        assertEquals(1.0, FastMath.tanh(20.0), 0.0);
        assertEquals(-1.0, FastMath.tanh(-20.0), 0.0);
        assertEquals(Math.tanh(1.0), FastMath.tanh(1.0), 1e-10);
        assertEquals(Double.NaN, FastMath.tanh(Double.NaN), 0.0);
    }

    @Test
    public void testSignumDouble() {
        assertEquals(0.0, FastMath.signum(0.0), 0.0);
        assertEquals(1.0, FastMath.signum(5.0), 0.0);
        assertEquals(-1.0, FastMath.signum(-5.0), 0.0);
        assertEquals(1.0, FastMath.signum(Double.POSITIVE_INFINITY), 0.0);
        assertEquals(-1.0, FastMath.signum(Double.NEGATIVE_INFINITY), 0.0);
    }

    @Test
    public void testSignumFloat() {
        assertEquals(0.0f, FastMath.signum(0.0f), 0.0f);
        assertEquals(1.0f, FastMath.signum(5.0f), 0.0f);
        assertEquals(-1.0f, FastMath.signum(-5.0f), 0.0f);
        assertEquals(1.0f, FastMath.signum(Float.POSITIVE_INFINITY), 0.0f);
        assertEquals(-1.0f, FastMath.signum(Float.NEGATIVE_INFINITY), 0.0f);
    }

    @Test
    public void testNextUpDouble() {
        assertEquals(1.0, FastMath.nextUp(0.9999999999999999), 0.0);
        assertEquals(Double.MIN_VALUE, FastMath.nextUp(0.0), 0.0);
        assertEquals(Double.NaN, FastMath.nextUp(Double.NaN), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.nextUp(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testNextUpFloat() {
        assertEquals(1.0f, FastMath.nextUp(0.9999999999999999f), 0.0f);
        assertEquals(Float.MIN_VALUE, FastMath.nextUp(0.0f), 0.0f);
        assertEquals(Float.NaN, FastMath.nextUp(Float.NaN), 0.0f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.nextUp(Float.POSITIVE_INFINITY), 0.0f);
    }

    @Test
    public void testExp() {
        assertEquals(1.0, FastMath.exp(0.0), 0.0);
        assertEquals(Math.exp(1.0), FastMath.exp(1.0), 1e-10);
        assertEquals(Math.exp(-1.0), FastMath.exp(-1.0), 1e-10);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(1000.0), 0.0);
        assertEquals(0.0, FastMath.exp(-1000.0), 0.0);
    }

    @Test
    public void testExpm1() {
        assertEquals(0.0, FastMath.expm1(0.0), 0.0);
        assertEquals(Math.expm1(1.0), FastMath.expm1(1.0), 1e-10);
        assertEquals(Math.expm1(-1.0), FastMath.expm1(-1.0), 1e-10);
        assertEquals(-1.0, FastMath.expm1(-Double.MAX_VALUE), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.expm1(Double.MAX_VALUE), 0.0);
    }

    @Test
    public void testLog() {
        assertEquals(0.0, FastMath.log(1.0), 0.0);
        assertEquals(1.0, FastMath.log(Math.E), 1e-10);
        assertEquals(Math.log(10.0), FastMath.log(10.0), 1e-10);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 0.0);
        assertEquals(Double.NaN, FastMath.log(-1.0), 0.0);
        assertEquals(Double.NaN, FastMath.log(Double.NaN), 0.0);
    }

    @Test
    public void testLog1p() {
        assertEquals(0.0, FastMath.log1p(0.0), 0.0);
        assertEquals(Math.log1p(1.0), FastMath.log1p(1.0), 1e-10);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), 0.0);
        assertEquals(Double.NaN, FastMath.log1p(-2.0), 0.0);
        assertEquals(Math.log1p(0.5), FastMath.log1p(0.5), 1e-10);
    }

    @Test
    public void testLog10() {
        assertEquals(0.0, FastMath.log10(1.0), 0.0);
        assertEquals(1.0, FastMath.log10(10.0), 1e-10);
        assertEquals(2.0, FastMath.log10(100.0), 1e-10);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log10(0.0), 0.0);
        assertEquals(Double.NaN, FastMath.log10(-1.0), 0.0);
    }

    @Test
    public void testPow() {
        assertEquals(1.0, FastMath.pow(2.0, 0.0), 0.0);
        assertEquals(8.0, FastMath.pow(2.0, 3.0), 0.0);
        assertEquals(0.25, FastMath.pow(2.0, -2.0), 0.0);
        assertEquals(1.0, FastMath.pow(0.0, 0.0), 0.0);
        assertEquals(Double.NaN, FastMath.pow(Double.NaN, 1.0), 0.0);
    }

    @Test
    public void testPowInt() {
        assertEquals(1.0, FastMath.pow(2.0, 0), 0.0);
        assertEquals(8.0, FastMath.pow(2.0, 3), 0.0);
        assertEquals(0.5, FastMath.pow(2.0, -1), 0.0);
        assertEquals(1.0, FastMath.pow(0.0, 0), 0.0);
        assertEquals(0.0, FastMath.pow(0.0, 1), 0.0);
        assertEquals(1.0, FastMath.pow(1.0, 100), 0.0);
    }

    @Test
    public void testSin() {
        assertEquals(0.0, FastMath.sin(0.0), 0.0);
        assertEquals(1.0, FastMath.sin(Math.PI / 2), 1e-10);
        assertEquals(0.0, FastMath.sin(Math.PI), 1e-10);
        assertEquals(-1.0, FastMath.sin(-Math.PI / 2), 1e-10);
        assertEquals(Double.NaN, FastMath.sin(Double.NaN), 0.0);
        assertEquals(0.0, FastMath.sin(Math.PI * 1000), 1e-10);
    }

    @Test
    public void testCos() {
        assertEquals(1.0, FastMath.cos(0.0), 0.0);
        assertEquals(0.0, FastMath.cos(Math.PI / 2), 1e-10);
        assertEquals(-1.0, FastMath.cos(Math.PI), 1e-10);
        assertEquals(0.0, FastMath.cos(-Math.PI / 2), 1e-10);
        assertEquals(Double.NaN, FastMath.cos(Double.NaN), 0.0);
    }

    @Test
    public void testTan() {
        assertEquals(0.0, FastMath.tan(0.0), 0.0);
        assertEquals(1.0, FastMath.tan(Math.PI / 4), 1e-10);
        assertEquals(-1.0, FastMath.tan(-Math.PI / 4), 1e-10);
        assertEquals(Double.NaN, FastMath.tan(Double.NaN), 0.0);
        assertEquals(Math.tan(1.0), FastMath.tan(1.0), 1e-10);
    }

    @Test
    public void testAtan() {
        assertEquals(0.0, FastMath.atan(0.0), 0.0);
        assertEquals(Math.PI / 4, FastMath.atan(1.0), 1e-10);
        assertEquals(-Math.PI / 4, FastMath.atan(-1.0), 1e-10);
        assertEquals(Math.PI / 2, FastMath.atan(Double.POSITIVE_INFINITY), 1e-10);
        assertEquals(-Math.PI / 2, FastMath.atan(Double.NEGATIVE_INFINITY), 1e-10);
        assertEquals(Math.atan(0.5), FastMath.atan(0.5), 1e-10);
    }

    @Test
    public void testAtan2() {
        assertEquals(0.0, FastMath.atan2(0.0, 1.0), 0.0);
        assertEquals(Math.PI / 2, FastMath.atan2(1.0, 0.0), 0.0);
        assertEquals(Math.PI, FastMath.atan2(0.0, -1.0), 1e-10);
        assertEquals(-Math.PI / 2, FastMath.atan2(-1.0, 0.0), 0.0);
        assertEquals(-Math.PI, FastMath.atan2(-0.0, -1.0), 1e-10);
        assertEquals(Double.NaN, FastMath.atan2(Double.NaN, 1.0), 0.0);
        assertEquals(0.0, FastMath.atan2(0.0, 0.0), 0.0);
    }

    @Test
    public void testAsin() {
        assertEquals(0.0, FastMath.asin(0.0), 0.0);
        assertEquals(Math.PI / 2, FastMath.asin(1.0), 1e-10);
        assertEquals(-Math.PI / 2, FastMath.asin(-1.0), 1e-10);
        assertEquals(Double.NaN, FastMath.asin(1.5), 0.0);
        assertEquals(Double.NaN, FastMath.asin(-1.5), 0.0);
        assertEquals(Math.asin(0.5), FastMath.asin(0.5), 1e-10);
    }

    @Test
    public void testAcos() {
        assertEquals(0.0, FastMath.acos(1.0), 0.0);
        assertEquals(Math.PI / 2, FastMath.acos(0.0), 1e-10);
        assertEquals(Math.PI, FastMath.acos(-1.0), 1e-10);
        assertEquals(Double.NaN, FastMath.acos(1.5), 0.0);
        assertEquals(Double.NaN, FastMath.acos(-1.5), 0.0);
    }

    @Test
    public void testCbrt() {
        assertEquals(0.0, FastMath.cbrt(0.0), 0.0);
        assertEquals(2.0, FastMath.cbrt(8.0), 1e-10);
        assertEquals(-2.0, FastMath.cbrt(-8.0), 1e-10);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cbrt(Double.POSITIVE_INFINITY), 0.0);
        assertEquals(Math.cbrt(27.0), FastMath.cbrt(27.0), 1e-10);
    }

    @Test
    public void testToRadiansDegrees() {
        assertEquals(0.0, FastMath.toRadians(0.0), 0.0);
        assertEquals(Math.PI, FastMath.toRadians(180.0), 1e-10);
        assertEquals(180.0, FastMath.toDegrees(Math.PI), 1e-10);
        assertEquals(0.0, FastMath.toDegrees(0.0), 0.0);
        assertEquals(FastMath.toDegrees(Double.POSITIVE_INFINITY), FastMath.toDegrees(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testUlpDouble() {
        assertEquals(Double.MIN_VALUE, FastMath.ulp(1.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.ulp(Double.POSITIVE_INFINITY), 0.0);
        assertEquals(Double.MIN_VALUE, FastMath.ulp(0.0), 0.0);
        assertEquals(Double.NaN, FastMath.ulp(Double.NaN), 0.0);
    }

    @Test
    public void testUlpFloat() {
        assertEquals(Float.MIN_VALUE, FastMath.ulp(1.0f), 0.0f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.ulp(Float.POSITIVE_INFINITY), 0.0f);
        assertEquals(Float.MIN_VALUE, FastMath.ulp(0.0f), 0.0f);
        assertEquals(Float.NaN, FastMath.ulp(Float.NaN), 0.0f);
    }

    @Test
    public void testFloor() {
        assertEquals(1.0, FastMath.floor(1.5), 0.0);
        assertEquals(-2.0, FastMath.floor(-1.5), 0.0);
        assertEquals(1.0, FastMath.floor(1.0), 0.0);
        assertEquals(0.0, FastMath.floor(0.0), 0.0);
    }

    @Test
    public void testCeil() {
        assertEquals(2.0, FastMath.ceil(1.5), 0.0);
        assertEquals(-1.0, FastMath.ceil(-1.5), 0.0);
        assertEquals(1.0, FastMath.ceil(1.0), 0.0);
        assertEquals(0.0, FastMath.ceil(0.0), 0.0);
    }

    @Test
    public void testRint() {
        assertEquals(2.0, FastMath.rint(1.5), 0.0);
        assertEquals(1.0, FastMath.rint(1.4), 0.0);
        assertEquals(0.0, FastMath.rint(0.0), 0.0);
        assertEquals(-1.0, FastMath.rint(-0.5), 0.0);
    }

    @Test
    public void testRoundDouble() {
        assertEquals(2L, FastMath.round(1.5));
        assertEquals(1L, FastMath.round(1.4));
        assertEquals(0L, FastMath.round(0.0));
        assertEquals(-1L, FastMath.round(-0.5));
        assertEquals(Long.MAX_VALUE, FastMath.round(Double.MAX_VALUE));
    }

    @Test
    public void testRoundFloat() {
        assertEquals(2, FastMath.round(1.5f));
        assertEquals(1, FastMath.round(1.4f));
        assertEquals(0, FastMath.round(0.0f));
        assertEquals(-1, FastMath.round(-0.5f));
        assertEquals(Integer.MAX_VALUE, FastMath.round(Float.MAX_VALUE));
    }

    @Test
    public void testGetExponentDouble() {
        assertEquals(0, FastMath.getExponent(1.0));
        assertEquals(1, FastMath.getExponent(2.0));
        assertEquals(-1, FastMath.getExponent(0.5));
        assertEquals(1024, FastMath.getExponent(Double.POSITIVE_INFINITY));
        assertEquals(1024, FastMath.getExponent(Double.NaN));
    }

    @Test
    public void testGetExponentFloat() {
        assertEquals(0, FastMath.getExponent(1.0f));
        assertEquals(1, FastMath.getExponent(2.0f));
        assertEquals(-1, FastMath.getExponent(0.5f));
        assertEquals(128, FastMath.getExponent(Float.POSITIVE_INFINITY));
        assertEquals(128, FastMath.getExponent(Float.NaN));
    }
}