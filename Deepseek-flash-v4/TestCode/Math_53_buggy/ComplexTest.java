package org.apache.commons.math.complex;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class ComplexTest {
    private Complex complex;

    @Before
    public void setUp() {
        complex = new Complex(3.0, 4.0);
    }

    @After
    public void tearDown() {
        complex = null;
    }

    @Test
    public void testConstructorNaN() {
        Complex nan = new Complex(Double.NaN, 1.0);
        assertTrue(nan.isNaN());
        assertFalse(nan.isInfinite());
    }

    @Test
    public void testConstructorInfinite() {
        Complex inf = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertTrue(inf.isInfinite());
        assertFalse(inf.isNaN());
    }

    @Test
    public void testAbs() {
        assertEquals(5.0, complex.abs(), 0.0);
        assertEquals(0.0, Complex.ZERO.abs(), 0.0);
        assertEquals(Double.NaN, Complex.NaN.abs(), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), 0.0);
    }

    @Test
    public void testAbsWithImaginaryGreater() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), 0.0);
        Complex c2 = new Complex(0.0, 4.0);
        assertEquals(4.0, c2.abs(), 0.0);
        Complex c3 = new Complex(3.0, 0.0);
        assertEquals(3.0, c3.abs(), 0.0);
    }

    @Test
    public void testAdd() {
        Complex result = complex.add(new Complex(1.0, -1.0));
        assertEquals(4.0, result.getReal(), 0.0);
        assertEquals(3.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testAddNull() {
        try {
            complex.add(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConjugate() {
        Complex result = complex.conjugate();
        assertEquals(3.0, result.getReal(), 0.0);
        assertEquals(-4.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testConjugateNaN() {
        Complex nan = new Complex(Double.NaN, 1.0);
        assertSame(Complex.NaN, nan.conjugate());
    }

    @Test
    public void testDivide() {
        Complex result = complex.divide(new Complex(1.0, 1.0));
        assertEquals(3.5, result.getReal(), 0.0);
        assertEquals(0.5, result.getImaginary(), 0.0);
    }

    @Test
    public void testDivideByZero() {
        Complex result = complex.divide(Complex.ZERO);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideWithInfiniteDenominator() {
        Complex result = new Complex(1.0, 2.0).divide(Complex.INF);
        assertEquals(0.0, result.getReal(), 0.0);
        assertEquals(0.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testDivideWithInfiniteNumeratorAndFiniteDenominator() {
        Complex result = Complex.INF.divide(new Complex(1.0, 1.0));
        assertTrue(result.isInfinite());
    }

    @Test
    public void testEquals() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        assertTrue(c1.equals(c2));
        assertTrue(c1.equals(c1));
        assertFalse(c1.equals(null));
        assertFalse(c1.equals(new Object()));
        assertFalse(c1.equals(new Complex(2.0, 2.0)));
        assertFalse(c1.equals(new Complex(1.0, 3.0)));
    }

    @Test
    public void testEqualsNaN() {
        Complex c1 = new Complex(Double.NaN, 1.0);
        Complex c2 = new Complex(Double.NaN, 1.0);
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testEqualsNonNaN() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        assertFalse(c1.equals(new Complex(Double.NaN, 2.0)));
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testHashCode() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        assertEquals(c1.hashCode(), c2.hashCode());
        assertEquals(7, Complex.NaN.hashCode());
    }

    @Test
    public void testGetImaginary() {
        assertEquals(4.0, complex.getImaginary(), 0.0);
    }

    @Test
    public void testGetReal() {
        assertEquals(3.0, complex.getReal(), 0.0);
    }

    @Test
    public void testIsInfinite() {
        assertFalse(complex.isInfinite());
        assertTrue(Complex.INF.isInfinite());
        assertFalse(Complex.NaN.isInfinite());
    }

    @Test
    public void testIsNaN() {
        assertFalse(complex.isNaN());
        assertTrue(Complex.NaN.isNaN());
        assertFalse(Complex.INF.isNaN());
    }

    @Test
    public void testMultiplyComplex() {
        Complex result = complex.multiply(new Complex(2.0, -1.0));
        assertEquals(10.0, result.getReal(), 0.0);
        assertEquals(5.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testMultiplyComplexNull() {
        try {
            complex.multiply((Complex) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testMultiplyComplexNaN() {
        assertTrue(complex.multiply(Complex.NaN).isNaN());
    }

    @Test
    public void testMultiplyComplexInfinite() {
        Complex result = new Complex(1.0, 2.0).multiply(Complex.INF);
        assertTrue(result.isInfinite());
    }

    @Test
    public void testMultiplyDouble() {
        Complex result = complex.multiply(2.0);
        assertEquals(6.0, result.getReal(), 0.0);
        assertEquals(8.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testMultiplyDoubleNaN() {
        assertTrue(complex.multiply(Double.NaN).isNaN());
    }

    @Test
    public void testMultiplyDoubleInfinite() {
        Complex result = new Complex(Double.POSITIVE_INFINITY, 1.0).multiply(2.0);
        assertTrue(result.isInfinite());
    }

    @Test
    public void testNegate() {
        Complex result = complex.negate();
        assertEquals(-3.0, result.getReal(), 0.0);
        assertEquals(-4.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testNegateNaN() {
        assertSame(Complex.NaN, Complex.NaN.negate());
    }

    @Test
    public void testSubtract() {
        Complex result = complex.subtract(new Complex(1.0, 2.0));
        assertEquals(2.0, result.getReal(), 0.0);
        assertEquals(2.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testSubtractNull() {
        try {
            complex.subtract(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSubtractNaN() {
        assertTrue(complex.subtract(Complex.NaN).isNaN());
    }

    @Test
    public void testAcos() {
        Complex result = Complex.ONE.acos();
        assertNotNull(result);
    }

    @Test
    public void testAcosNaN() {
        assertSame(Complex.NaN, Complex.NaN.acos());
    }

    @Test
    public void testAsin() {
        Complex result = Complex.ONE.asin();
        assertNotNull(result);
    }

    @Test
    public void testAsinNaN() {
        assertSame(Complex.NaN, Complex.NaN.asin());
    }

    @Test
    public void testAtan() {
        Complex result = Complex.ONE.atan();
        assertNotNull(result);
    }

    @Test
    public void testAtanNaN() {
        assertSame(Complex.NaN, Complex.NaN.atan());
    }

    @Test
    public void testCos() {
        Complex result = complex.cos();
        assertEquals(Math.cos(3.0) * Math.cosh(4.0), result.getReal(), 0.0);
        assertEquals(-Math.sin(3.0) * Math.sinh(4.0), result.getImaginary(), 0.0);
    }

    @Test
    public void testCosNaN() {
        assertSame(Complex.NaN, Complex.NaN.cos());
    }

    @Test
    public void testCosh() {
        Complex result = complex.cosh();
        assertEquals(Math.cosh(3.0) * Math.cos(4.0), result.getReal(), 0.0);
        assertEquals(Math.sinh(3.0) * Math.sin(4.0), result.getImaginary(), 0.0);
    }

    @Test
    public void testCoshNaN() {
        assertSame(Complex.NaN, Complex.NaN.cosh());
    }

    @Test
    public void testExp() {
        Complex result = complex.exp();
        assertEquals(Math.exp(3.0) * Math.cos(4.0), result.getReal(), 0.0);
        assertEquals(Math.exp(3.0) * Math.sin(4.0), result.getImaginary(), 0.0);
    }

    @Test
    public void testExpNaN() {
        assertSame(Complex.NaN, Complex.NaN.exp());
    }

    @Test
    public void testLog() {
        Complex result = complex.log();
        assertEquals(Math.log(5.0), result.getReal(), 0.0);
        assertEquals(Math.atan2(4.0, 3.0), result.getImaginary(), 0.0);
    }

    @Test
    public void testLogNaN() {
        assertSame(Complex.NaN, Complex.NaN.log());
    }

    @Test
    public void testPowNull() {
        try {
            complex.pow(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSin() {
        Complex result = complex.sin();
        assertEquals(Math.sin(3.0) * Math.cosh(4.0), result.getReal(), 0.0);
        assertEquals(Math.cos(3.0) * Math.sinh(4.0), result.getImaginary(), 0.0);
    }

    @Test
    public void testSinNaN() {
        assertSame(Complex.NaN, Complex.NaN.sin());
    }

    @Test
    public void testSinh() {
        Complex result = complex.sinh();
        assertEquals(Math.sinh(3.0) * Math.cos(4.0), result.getReal(), 0.0);
        assertEquals(Math.cosh(3.0) * Math.sin(4.0), result.getImaginary(), 0.0);
    }

    @Test
    public void testSinhNaN() {
        assertSame(Complex.NaN, Complex.NaN.sinh());
    }

    @Test
    public void testSqrt() {
        Complex result = complex.sqrt();
        assertEquals(Math.sqrt((Math.sqrt(25.0) + 3.0) / 2.0), result.getReal(), 0.0);
        assertEquals(4.0 / (2.0 * Math.sqrt((Math.sqrt(25.0) + 3.0) / 2.0)), result.getImaginary(), 0.0);
    }

    @Test
    public void testSqrtNaN() {
        assertSame(Complex.NaN, Complex.NaN.sqrt());
    }

    @Test
    public void testSqrtZero() {
        Complex result = Complex.ZERO.sqrt();
        assertEquals(0.0, result.getReal(), 0.0);
        assertEquals(0.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testSqrtNegativeReal() {
        Complex result = new Complex(-1.0, 0.0).sqrt();
        assertEquals(0.0, result.getReal(), 0.0);
        assertEquals(1.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testSqrt1z() {
        Complex result = complex.sqrt1z();
        assertNotNull(result);
    }

    @Test
    public void testTan() {
        Complex result = complex.tan();
        double real2 = 2.0 * 3.0;
        double imaginary2 = 2.0 * 4.0;
        double d = Math.cos(real2) + Math.cosh(imaginary2);
        assertEquals(Math.sin(real2) / d, result.getReal(), 0.0);
        assertEquals(Math.sinh(imaginary2) / d, result.getImaginary(), 0.0);
    }

    @Test
    public void testTanNaN() {
        assertSame(Complex.NaN, Complex.NaN.tan());
    }

    @Test
    public void testTanh() {
        Complex result = complex.tanh();
        double real2 = 2.0 * 3.0;
        double imaginary2 = 2.0 * 4.0;
        double d = Math.cosh(real2) + Math.cos(imaginary2);
        assertEquals(Math.sinh(real2) / d, result.getReal(), 0.0);
        assertEquals(Math.sin(imaginary2) / d, result.getImaginary(), 0.0);
    }

    @Test
    public void testTanhNaN() {
        assertSame(Complex.NaN, Complex.NaN.tanh());
    }

    @Test
    public void testGetArgument() {
        assertEquals(Math.atan2(4.0, 3.0), complex.getArgument(), 0.0);
    }

    @Test
    public void testNthRoot() {
        List<Complex> roots = complex.nthRoot(2);
        assertEquals(2, roots.size());
        assertEquals(Math.sqrt(Math.sqrt(25.0)), roots.get(0).getReal(), 0.0);
    }

    @Test
    public void testNthRootZero() {
        List<Complex> roots = Complex.ZERO.nthRoot(2);
        assertEquals(1, roots.size());
        assertEquals(0.0, roots.get(0).getReal(), 0.0);
    }

    @Test
    public void testNthRootNaN() {
        List<Complex> roots = Complex.NaN.nthRoot(2);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isNaN());
    }

    @Test
    public void testNthRootInfinite() {
        List<Complex> roots = Complex.INF.nthRoot(2);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isInfinite());
    }

    @Test
    public void testNthRootNegativeN() {
        try {
            complex.nthRoot(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testNthRootZeroN() {
        try {
            complex.nthRoot(0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCreateComplex() {
        Complex result = complex.createComplex(1.0, 2.0);
        assertEquals(1.0, result.getReal(), 0.0);
        assertEquals(2.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testGetField() {
        assertNotNull(complex.getField());
    }

    @Test
    public void testToString() {
        assertEquals("(3.0, 4.0)", complex.toString());
    }
}