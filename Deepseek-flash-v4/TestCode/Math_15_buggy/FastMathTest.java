package org.apache.commons.math3.util;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class FastMathTest {
    
    private static final double EPS = 1e-10;
    
    @Before
    public void setUp() { }
    
    @After
    public void tearDown() { }
    
    // ========== abs tests ==========
    
    @Test
    public void testAbsInt() {
        assertEquals(0, FastMath.abs(0));
        assertEquals(5, FastMath.abs(5));
        assertEquals(5, FastMath.abs(-5));
        assertEquals(Integer.MIN_VALUE, FastMath.abs(Integer.MIN_VALUE));
    }
    
    @Test
    public void testAbsLong() {
        assertEquals(0L, FastMath.abs(0L));
        assertEquals(5L, FastMath.abs(-5L));
        assertEquals(Long.MIN_VALUE, FastMath.abs(Long.MIN_VALUE));
    }
    
    @Test
    public void testAbsFloat() {
        assertEquals(0.0f, FastMath.abs(0.0f), 0.0f);
        assertEquals(5.5f, FastMath.abs(-5.5f), 0.0f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.abs(Float.NEGATIVE_INFINITY), 0.0f);
        assertTrue(Float.isNaN(FastMath.abs(Float.NaN)));
    }
    
    @Test
    public void testAbsDouble() {
        assertEquals(0.0, FastMath.abs(0.0), 0.0);
        assertEquals(5.5, FastMath.abs(-5.5), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.abs(Double.NEGATIVE_INFINITY), 0.0);
        assertTrue(Double.isNaN(FastMath.abs(Double.NaN)));
    }
    
    // ========== sqrt tests ==========
    
    @Test
    public void testSqrt() {
        assertEquals(2.0, FastMath.sqrt(4.0), EPS);
        assertEquals(0.0, FastMath.sqrt(0.0), EPS);
        assertTrue(Double.isNaN(FastMath.sqrt(-1.0)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.sqrt(Double.POSITIVE_INFINITY), EPS);
        assertTrue(Double.isNaN(FastMath.sqrt(Double.NaN)));
    }
    
    // ========== cosh tests ==========
    
    @Test
    public void testCosh() {
        assertEquals(1.0, FastMath.cosh(0.0), EPS);
        assertEquals(Math.cosh(1.0), FastMath.cosh(1.0), 1e-10);
        assertEquals(Math.cosh(-1.0), FastMath.cosh(-1.0), 1e-10);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(Double.POSITIVE_INFINITY), EPS);
        assertTrue(Double.isNaN(FastMath.cosh(Double.NaN)));
    }
    
    @Test
    public void testCoshLargeValue() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(1000.0), EPS);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(-1000.0), EPS);
    }
    
    // ========== sinh tests ==========
    
    @Test
    public void testSinh() {
        assertEquals(0.0, FastMath.sinh(0.0), EPS);
        assertEquals(Math.sinh(1.0), FastMath.sinh(1.0), 1e-10);
        assertEquals(Math.sinh(-1.0), FastMath.sinh(-1.0), 1e-10);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.sinh(Double.POSITIVE_INFINITY), EPS);
        assertTrue(Double.isNaN(FastMath.sinh(Double.NaN)));
    }
    
    // ========== tanh tests ==========
    
    @Test
    public void testTanh() {
        assertEquals(0.0, FastMath.tanh(0.0), EPS);
        assertEquals(Math.tanh(1.0), FastMath.tanh(1.0), 1e-10);
        assertEquals(Math.tanh(-1.0), FastMath.tanh(-1.0), 1e-10);
        assertEquals(1.0, FastMath.tanh(100.0), EPS);
        assertEquals(-1.0, FastMath.tanh(-100.0), EPS);
        assertTrue(Double.isNaN(FastMath.tanh(Double.NaN)));
    }
    
    // ========== signum tests ==========
    
    @Test
    public void testSignumDouble() {
        assertEquals(0.0, FastMath.signum(0.0), EPS);
        assertEquals(1.0, FastMath.signum(5.0), EPS);
        assertEquals(-1.0, FastMath.signum(-5.0), EPS);
        assertEquals(1.0, FastMath.signum(Double.POSITIVE_INFINITY), EPS);
        assertEquals(-1.0, FastMath.signum(Double.NEGATIVE_INFINITY), EPS);
    }
    
    @Test
    public void testSignumFloat() {
        assertEquals(0.0f, FastMath.signum(0.0f), 0.0f);
        assertEquals(1.0f, FastMath.signum(5.0f), 0.0f);
        assertEquals(-1.0f, FastMath.signum(-5.0f), 0.0f);
    }
    
    // ========== exp tests ==========
    
    @Test
    public void testExp() {
        assertEquals(1.0, FastMath.exp(0.0), EPS);
        assertEquals(Math.exp(1.0), FastMath.exp(1.0), 1e-10);
        assertEquals(Math.exp(-1.0), FastMath.exp(-1.0), 1e-10);
        assertEquals(0.0, FastMath.exp(-1000.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(1000.0), EPS);
        assertTrue(Double.isNaN(FastMath.exp(Double.NaN)));
    }
    
    // ========== expm1 tests ==========
    
    @Test
    public void testExpm1() {
        assertEquals(0.0, FastMath.expm1(0.0), EPS);
        assertEquals(Math.expm1(1.0), FastMath.expm1(1.0), 1e-10);
        assertEquals(-1.0, FastMath.expm1(-1000.0), EPS);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.expm1(1000.0), EPS);
        assertTrue(Double.isNaN(FastMath.expm1(Double.NaN)));
    }
    
    // ========== log tests ==========
    
    @Test
    public void testLog() {
        assertEquals(0.0, FastMath.log(1.0), EPS);
        assertEquals(1.0, FastMath.log(Math.E), EPS);
        assertTrue(Double.isNaN(FastMath.log(-1.0)));
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), EPS);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log(Double.POSITIVE_INFINITY), EPS);
        assertTrue(Double.isNaN(FastMath.log(Double.NaN)));
    }
    
    // ========== log1p tests ==========
    
    @Test
    public void testLog1p() {
        assertEquals(0.0, FastMath.log1p(0.0), EPS);
        assertEquals(Math.log1p(1.0), FastMath.log1p(1.0), 1e-10);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), EPS);
        assertTrue(Double.isNaN(FastMath.log1p(-2.0)));
    }
    
    // ========== log10 tests ==========
    
    @Test
    public void testLog10() {
        assertEquals(0.0, FastMath.log10(1.0), EPS);
        assertEquals(1.0, FastMath.log10(10.0), EPS);
        assertTrue(Double.isNaN(FastMath.log10(-1.0)));
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log10(0.0), EPS);
    }
    
    // ========== pow tests ==========
    
    @Test
    public void testPowDoubleDouble() {
        assertEquals(8.0, FastMath.pow(2.0, 3.0), EPS);
        assertEquals(1.0, FastMath.pow(2.0, 0.0), EPS);
        assertEquals(0.25, FastMath.pow(2.0, -2.0), EPS);
        assertEquals(1.0, FastMath.pow(1.0, Double.NaN), EPS);
        assertTrue(Double.isNaN(FastMath.pow(-1.0, 0.5)));
    }
    
    @Test
    public void testPowWithSpecialCases() {
        assertEquals(0.0, FastMath.pow(0.0, 2.0), EPS);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.0, -2.0), EPS);
        assertEquals(1.0, FastMath.pow(Double.NaN, 0.0), EPS);
        assertEquals(1.0, FastMath.pow(123.0, 0.0), EPS);
    }
    
    @Test
    public void testPowDoubleInt() {
        assertEquals(8.0, FastMath.pow(2.0, 3), EPS);
        assertEquals(1.0, FastMath.pow(2.0, 0), EPS);
        assertEquals(0.25, FastMath.pow(2.0, -2), EPS);
        assertEquals(1.0, FastMath.pow(2.0, -0), EPS);
    }
    
    // ========== sin/cos/tan tests ==========
    
    @Test
    public void testSin() {
        assertEquals(0.0, FastMath.sin(0.0), EPS);
        assertEquals(Math.sin(1.0), FastMath.sin(1.0), 1e-10);
        assertEquals(1.0, FastMath.sin(Math.PI/2), 1e-10);
        assertEquals(0.0, FastMath.sin(Math.PI), 1e-10);
    }
    
    @Test
    public void testCos() {
        assertEquals(1.0, FastMath.cos(0.0), EPS);
        assertEquals(Math.cos(1.0), FastMath.cos(1.0), 1e-10);
        assertEquals(0.0, FastMath.cos(Math.PI/2), 1e-10);
        assertEquals(-1.0, FastMath.cos(Math.PI), 1e-10);
    }
    
    @Test
    public void testTan() {
        assertEquals(0.0, FastMath.tan(0.0), EPS);
        assertEquals(Math.tan(1.0), FastMath.tan(1.0), 1e-10);
    }
    
    // ========== asin/acos/atan tests ==========
    
    @Test
    public void testAsin() {
        assertEquals(0.0, FastMath.asin(0.0), EPS);
        assertEquals(Math.PI/2, FastMath.asin(1.0), EPS);
        assertEquals(-Math.PI/2, FastMath.asin(-1.0), EPS);
        assertTrue(Double.isNaN(FastMath.asin(1.5)));
    }
    
    @Test
    public void testAcos() {
        assertEquals(0.0, FastMath.acos(1.0), EPS);
        assertEquals(Math.PI/2, FastMath.acos(0.0), EPS);
        assertEquals(Math.PI, FastMath.acos(-1.0), EPS);
        assertTrue(Double.isNaN(FastMath.acos(1.5)));
    }
    
    @Test
    public void testAtan() {
        assertEquals(0.0, FastMath.atan(0.0), EPS);
        assertEquals(Math.PI/4, FastMath.atan(1.0), EPS);
        assertEquals(-Math.PI/4, FastMath.atan(-1.0), EPS);
        assertEquals(Math.PI/2, FastMath.atan(Double.POSITIVE_INFINITY), EPS);
        assertEquals(-Math.PI/2, FastMath.atan(Double.NEGATIVE_INFINITY), EPS);
    }
    
    // ========== atan2 tests ==========
    
    @Test
    public void testAtan2() {
        assertEquals(0.0, FastMath.atan2(0.0, 1.0), EPS);
        assertEquals(Math.PI/2, FastMath.atan2(1.0, 0.0), EPS);
        assertEquals(Math.PI, FastMath.atan2(0.0, -1.0), EPS);
        assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, 1.0)));
    }
    
    // ========== toRadians/toDegrees tests ==========
    
    @Test
    public void testToRadiansToDegrees() {
        assertEquals(0.0, FastMath.toRadians(0.0), EPS);
        assertEquals(Math.PI, FastMath.toRadians(180.0), EPS);
        assertEquals(180.0, FastMath.toDegrees(Math.PI), EPS);
    }
    
    // ========== ulp tests ==========
    
    @Test
    public void testUlp() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.ulp(Double.POSITIVE_INFINITY), EPS);
        assertEquals(Double.MIN_VALUE, FastMath.ulp(0.0), EPS);
    }
    
    // ========== floor/ceil/rint/round tests ==========
    
    @Test
    public void testFloorCeilRintRound() {
        assertEquals(1.0, FastMath.floor(1.5), EPS);
        assertEquals(2.0, FastMath.ceil(1.5), EPS);
        assertEquals(2.0, FastMath.rint(1.5), EPS);
        assertEquals(2L, FastMath.round(1.5));
        assertEquals(1L, FastMath.round(1.4));
    }
    
    // ========== cbrt tests ==========
    
    @Test
    public void testCbrt() {
        assertEquals(2.0, FastMath.cbrt(8.0), EPS);
        assertEquals(0.0, FastMath.cbrt(0.0), EPS);
        assertEquals(-2.0, FastMath.cbrt(-8.0), EPS);
    }
    
    // ========== nextUp tests ==========
    
    @Test
    public void testNextUp() {
        assertEquals(1.0, FastMath.nextUp(0.9999999999999999), EPS);
        assertEquals(Double.MIN_VALUE, FastMath.nextUp(0.0), EPS);
    }
    
    // ========== getExponent tests ==========
    
    @Test
    public void testGetExponent() {
        assertEquals(0, FastMath.getExponent(1.0));
        assertEquals(1, FastMath.getExponent(2.0));
        assertEquals(-1, FastMath.getExponent(0.5));
    }
}