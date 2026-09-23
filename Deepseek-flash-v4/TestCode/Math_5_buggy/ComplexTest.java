package org.apache.commons.math3.complex;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ComplexTest {
    private Complex complex;

    @Before
    public void setUp() {
        complex = new Complex(3.0, 4.0);
    }

    @Test
    public void testConstructor() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(1.0, c.getReal(), 0.0);
        assertEquals(2.0, c.getImaginary(), 0.0);
        assertFalse(c.isNaN());
        assertFalse(c.isInfinite());
    }

    @Test
    public void testConstructorWithNaN() {
        Complex c = new Complex(Double.NaN, 2.0);
        assertTrue(c.isNaN());
    }

    @Test
    public void testConstructorWithInfinite() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 2.0);
        assertTrue(c.isInfinite());
        assertFalse(c.isNaN());
    }

    @Test
    public void testConstructorWithRealOnly() {
        Complex c = new Complex(5.0);
        assertEquals(0.0, c.getImaginary(), 0.0);
        assertEquals(5.0, c.getReal(), 0.0);
    }

    @Test
    public void testAbs() {
        assertEquals(5.0, complex.abs(), 0.0001);
    }

    @Test
    public void testAbsWithNaN() {
        Complex c = new Complex(Double.NaN, 1.0);
        assertTrue(Double.isNaN(c.abs()));
    }

    @Test
    public void testAbsWithInfinite() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.POSITIVE_INFINITY, c.abs(), 0.0);
    }

    @Test
    public void testAbsWithNegativeValues() {
        Complex c = new Complex(-3.0, -4.0);
        assertEquals(5.0, c.abs(), 0.0001);
    }

    @Test
    public void testAddComplex() {
        Complex c = complex.add(new Complex(1.0, 2.0));
        assertEquals(4.0, c.getReal(), 0.0);
        assertEquals(6.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testAddWithNaN() {
        Complex c = complex.add(new Complex(Double.NaN, 1.0));
        assertTrue(c.isNaN());
    }

    @Test
    public void testAddWithNull() {
        try {
            complex.add(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddDouble() {
        Complex c = complex.add(2.0);
        assertEquals(5.0, c.getReal(), 0.0);
        assertEquals(4.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testAddDoubleWithNaN() {
        Complex c = complex.add(Double.NaN);
        assertTrue(c.isNaN());
    }

    @Test
    public void testConjugate() {
        Complex c = complex.conjugate();
        assertEquals(3.0, c.getReal(), 0.0);
        assertEquals(-4.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testDivide() {
        Complex divisor = new Complex(1.0, 1.0);
        Complex result = complex.divide(divisor);
        assertEquals(3.5, result.getReal(), 0.0001);
        assertEquals(0.5, result.getImaginary(), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        Complex result = complex.divide(new Complex(0.0, 0.0));
        assertTrue(result.isNaN() || result.isInfinite());
    }

    @Test
    public void testDivideWithNaN() {
        Complex result = complex.divide(new Complex(Double.NaN, 1.0));
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideWithNull() {
        try {
            complex.divide(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testMultiplyComplex() {
        Complex result = complex.multiply(new Complex(2.0, 3.0));
        assertEquals(-6.0, result.getReal(), 0.0001);
        assertEquals(17.0, result.getImaginary(), 0.0001);
    }

    @Test
    public void testMultiplyWithNaN() {
        Complex result = complex.multiply(new Complex(Double.NaN, 1.0));
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiplyByInt() {
        Complex result = complex.multiply(2);
        assertEquals(6.0, result.getReal(), 0.0);
        assertEquals(8.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testNegate() {
        Complex result = complex.negate();
        assertEquals(-3.0, result.getReal(), 0.0);
        assertEquals(-4.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testSubtractComplex() {
        Complex result = complex.subtract(new Complex(1.0, 2.0));
        assertEquals(2.0, result.getReal(), 0.0);
        assertEquals(2.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testSubtractWithNaN() {
        Complex result = complex.subtract(new Complex(Double.NaN, 2.0));
        assertTrue(result.isNaN());
    }

    @Test
    public void testSubtractDouble() {
        Complex result = complex.subtract(2.0);
        assertEquals(1.0, result.getReal(), 0.0);
        assertEquals(4.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testEquals() {
        Complex c1 = new Complex(3.0, 4.0);
        assertTrue(complex.equals(c1));
        assertFalse(complex.equals(null));
        assertFalse(complex.equals(new String("test")));
    }

    @Test
    public void testEqualsWithNaN() {
        Complex c1 = new Complex(Double.NaN, 4.0);
        Complex c2 = new Complex(Double.NaN, 4.0);
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testHashCode() {
        assertNotNull(complex.hashCode());
    }

    @Test
    public void testInequality() {
        Complex c1 = new Complex(3.0, 5.0);
        assertFalse(complex.equals(c1));
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
    public void testIsNaN() {
        Complex c = new Complex(Double.NaN, 1.0);
        assertTrue(c.isNaN());
        assertFalse(complex.isNaN());
    }

    @Test
    public void testIsInfinite() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertTrue(c.isInfinite());
        assertFalse(complex.isInfinite());
    }

    @Test
    public void testTanh() {
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.tanh().getReal(), 0.0001);
    }

    @Test
    public void testTanhWithNaN() {
        Complex c = new Complex(Double.NaN, 1.0);
        assertTrue(c.tanh().isNaN());
    }

    @Test
    public void testTanhWithPositiveLargeReal() {
        Complex c = new Complex(21.0, 0.0);
        Complex result = c.tanh();
        assertEquals(1.0, result.getReal(), 0.0001);
        assertEquals(0.0, result.getImaginary(), 0.0001);
    }

    @Test
    public void testTanhWithNegativeLargeReal() {
        Complex c = new Complex(-21.0, 0.0);
        Complex result = c.tanh();
        assertEquals(-1.0, result.getReal(), 0.0001);
        assertEquals(0.0, result.getImaginary(), 0.0001);
    }

    @Test
    public void testCreateComplex() {
        Complex c = complex.createComplex(1.0, 2.0);
        assertEquals(1.0, c.getReal(), 0.0);
        assertEquals(2.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testValueOfDoubleDouble() {
        Complex c = Complex.valueOf(1.0, 2.0);
        assertEquals(1.0, c.getReal(), 0.0);
        assertEquals(2.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testValueOfDoubleDoubleWithNaN() {
        Complex c = Complex.valueOf(Double.NaN, 2.0);
        assertEquals(Double.NaN, c.getReal(), 0.0);
    }

    @Test
    public void testValueOfDouble() {
        Complex c = Complex.valueOf(1.0);
        assertEquals(1.0, c.getReal(), 0.0);
        assertEquals(0.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testValueOfDoubleWithNaN() {
        Complex c = Complex.valueOf(Double.NaN);
        assertEquals(Double.NaN, c.getReal(), 0.0);
    }

    @Test
    public void testReadResolve() {
        Complex c = new Complex(1.0, 2.0);
        Complex c2 = c.readResolve();
        assertEquals(c, c2);
    }

    @Test
    public void testGetField() {
        assertNotNull(complex.getField());
    }

    @Test
    public void testToString() {
        assertEquals("(3.0, 4.0)", complex.toString());
    }

    @Test
    public void testNthRoot() {
        List<Complex> roots = complex.nthRoot(2);
        assertEquals(2, roots.size());
    }

    @Test
    public void testNthRootWithInvalidN() {
        try {
            complex.nthRoot(0);
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }
    }

    @Test
    public void testNthRootWithNaN() {
        Complex c = new Complex(Double.NaN, 1.0);
        List<Complex> roots = c.nthRoot(4);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isNaN());
    }

    @Test
    public void testNthRootWithInfinite() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 0.0);
        List<Complex> roots = c.nthRoot(4);
        assertEquals(4, roots.size());
    }

    @Test
    public void testNthRootWithZeroN() {
        Complex c = new Complex(1.0, 0.0);
        try {
            c.nthRoot(0);
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }
    }

    @Test
    public void testNthRootWithNormal() {
        Complex c = new Complex(1.0, 0.0);
        List<Complex> roots = c.nthRoot(4);
        assertEquals(4, roots.size());
    }

    @Test
    public void testGetArgument() {
        assertEquals(FastMath.atan2(4.0, 3.0), complex.getArgument(), 0.0001);
    }

    @Test
    public void testLog() {
        Complex c = complex.log();
        assertEquals(FastMath.log(5.0), c.getReal(), 0.0001);
    }

    @Test
    public void testPow() {
        Complex c = complex.pow(2.0);
        assertEquals(-7.0, c.getReal(), 0.0001);
        assertEquals(24.0, c.getImaginary(), 0.0001);
    }

    @Test
    public void testPowWithComplex() {
        Complex c = complex.pow(new Complex(2.0, 1.0));
        assertNotNull(c);
    }

    @Test
    public void testPowWithNaN() {
        Complex c = complex.pow(new Complex(Double.NaN, 1.0));
        assertTrue(c.isNaN());
    }

    @Test
    public void testSqrt() {
        Complex c = new Complex(4.0, 12.0);
        Complex sqrt = c.sqrt();
        assertNotNull(sqrt);
    }

    @Test
    public void testSqrtWithZero() {
        Complex c = new Complex(0.0, 0.0);
        Complex sqrt = c.sqrt();
        assertEquals(0.0, sqrt.getReal(), 0.0);
        assertEquals(0.0, sqrt.getImaginary(), 0.0);
    }

    @Test
    public void testCos() {
        Complex c = new Complex(1.0, 2.0);
        Complex cos = c.cos();
        assertNotNull(cos);
    }

    @Test
    public void testCosh() {
        Complex c = new Complex(1.0, 2.0);
        Complex cosh = c.cosh();
        assertNotNull(cosh);
    }

    @Test
    public void testExp() {
        Complex c = new Complex(1.0, 2.0);
        Complex exp = c.exp();
        assertNotNull(exp);
    }

    @Test
    public void testSin() {
        Complex c = new Complex(1.0, 2.0);
        Complex sin = c.sin();
        assertNotNull(sin);
    }

    @Test
    public void testSinh() {
        Complex c = new Complex(1.0, 2.0);
        Complex sinh = c.sinh();
        assertNotNull(sinh);
    }

    @Test
    public void testAcos() {
        Complex c = new Complex(0.5, 0.0);
        Complex acos = c.acos();
        assertNotNull(acos);
    }

    @Test
    public void testAsin() {
        Complex c = new Complex(0.5, 0.0);
        Complex asin = c.asin();
        assertNotNull(asin);
    }

    @Test
    public void testAtan() {
        Complex c = new Complex(0.5, 0.0);
        Complex atan = c.atan();
        assertNotNull(atan);
    }

    @Test
    public void testTan() {
        Complex c = new Complex(0.5, 0.0);
        Complex tan = c.tan();
        assertNotNull(tan);
    }

    @Test
    public void testTanWithNaN() {
        Complex c = new Complex(Double.NaN, 1.0);
        assertTrue(c.tan().isNaN());
    }

    @Test
    public void testSqrt1z() {
        Complex c = new Complex(0.5, 0.0);
        Complex sqrt1z = c.sqrt1z();
        assertNotNull(sqrt1z);
    }

    @Test
    public void testMultiplyWithInfinite() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Complex result = c.multiply(new Complex(1.0, 1.0));
        assertTrue(result.isInfinite());
    }

    @Test
    public void testDivideWithInfiniteDivisor() {
        Complex c = new Complex(1.0, 1.0);
        Complex result = c.divide(new Complex(Double.POSITIVE_INFINITY, 0.0));
        assertNotNull(result);
    }

    @Test
    public void testDivideWithInfiniteAndNotInfinite() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Complex result = c.divide(new Complex(1.0, 1.0));
        assertNotNull(result);
    }

    @Test
    public void testMultiplyDoubleWithNaN() {
        Complex result = complex.multiply(Double.NaN);
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiplyDoubleWithInfinite() {
        Complex c = new Complex(1.0, Double.POSITIVE_INFINITY);
        Complex result = c.multiply(2.0);
        assertNotNull(result);
    }

    @Test
    public void testTanWithLargeImaginaryPositive() {
        Complex c = new Complex(0.0, 21.0);
        Complex result = c.tan();
        assertEquals(0.0, result.getReal(), 0.0001);
        assertEquals(1.0, result.getImaginary(), 0.0001);
    }

    @Test
    public void testTanWithLargeImaginaryNegative() {
        Complex c = new Complex(0.0, -21.0);
        Complex result = c.tan();
        assertEquals(0.0, result.getReal(), 0.0001);
        assertEquals(-1.0, result.getImaginary(), 0.0001);
    }
}