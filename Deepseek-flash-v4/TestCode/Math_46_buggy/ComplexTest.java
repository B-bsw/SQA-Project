package org.apache.commons.math.complex;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.List;

public class ComplexTest {
    private Complex one;
    private Complex two;
    private Complex i;
    private Complex nan;
    private Complex inf;
    private Complex zero;

    @Before
    public void setUp() {
        one = new Complex(1.0, 0.0);
        two = new Complex(2.0, 0.0);
        i = new Complex(0.0, 1.0);
        nan = new Complex(Double.NaN, 0.0);
        inf = new Complex(Double.POSITIVE_INFINITY, 0.0);
        zero = new Complex(0.0, 0.0);
    }

    @After
    public void tearDown() {
        // No cleanup needed
    }

    @Test
    public void testConstructorAndGetters() {
        Complex c = new Complex(1.5, 2.5);
        assertEquals(1.5, c.getReal(), 0.0);
        assertEquals(2.5, c.getImaginary(), 0.0);
        assertFalse(c.isNaN());
        assertFalse(c.isInfinite());
        assertFalse(c.isZero());
    }

    @Test
    public void testConstructorSingleParam() {
        Complex c = new Complex(3.0);
        assertEquals(3.0, c.getReal(), 0.0);
        assertEquals(0.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testConstructorNaN() {
        Complex c = new Complex(Double.NaN, 1.0);
        assertTrue(c.isNaN());
        assertFalse(c.isInfinite());
    }

    @Test
    public void testConstructorInfinite() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 0.0);
        assertFalse(c.isNaN());
        assertTrue(c.isInfinite());
    }

    @Test
    public void testConstructorZero() {
        Complex c = new Complex(0.0, 0.0);
        assertTrue(c.isZero());
        assertFalse(c.isNaN());
        assertFalse(c.isInfinite());
    }

    @Test
    public void testAbsZero() {
        assertEquals(0.0, zero.abs(), 0.0);
    }

    @Test
    public void testAbsPositiveReal() {
        Complex c = new Complex(3.0, 0.0);
        assertEquals(3.0, c.abs(), 0.0);
    }

    @Test
    public void testAbsImaginaryOnly() {
        Complex c = new Complex(0.0, 4.0);
        assertEquals(4.0, c.abs(), 0.0);
    }

    @Test
    public void testAbsComplex() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), 0.0001);
    }

    @Test
    public void testAbsNaN() {
        assertTrue(Double.isNaN(nan.abs()));
    }

    @Test
    public void testAbsInfinite() {
        assertTrue(Double.isInfinite(inf.abs()));
    }

    @Test
    public void testAddNormal() {
        Complex result = one.add(two);
        assertEquals(3.0, result.getReal(), 0.0);
        assertEquals(0.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testAddComplexParts() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex result = c1.add(c2);
        assertEquals(4.0, result.getReal(), 0.0);
        assertEquals(6.0, result.getImaginary(), 0.0);
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNull() {
        one.add((Complex) null);
    }

    @Test
    public void testAddNaN() {
        Complex result = one.add(nan);
        assertTrue(result.isNaN());
    }

    @Test
    public void testAddDouble() {
        Complex result = one.add(2.0);
        assertEquals(3.0, result.getReal(), 0.0);
        assertEquals(0.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testAddDoubleNaN() {
        Complex result = one.add(Double.NaN);
        assertTrue(result.isNaN());
    }

    @Test
    public void testConjugate() {
        Complex c = new Complex(1.0, 2.0);
        Complex result = c.conjugate();
        assertEquals(1.0, result.getReal(), 0.0);
        assertEquals(-2.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testDivideNormal() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 0.0);
        Complex result = c1.divide(c2);
        assertEquals(1.0, result.getReal(), 0.0001);
        assertEquals(2.0, result.getImaginary(), 0.0001);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNull() {
        one.divide((Complex) null);
    }

    @Test
    public void testDivideByZero() {
        Complex result = one.divide(zero);
        assertEquals(Complex.INF, result);
    }

    @Test
    public void testDivideZeroByZero() {
        Complex zero = new Complex(0.0, 0.0);
        Complex result = zero.divide(zero);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideInfinite() {
        Complex result = one.divide(inf);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideDouble() {
        Complex c = new Complex(4.0, 6.0);
        Complex result = c.divide(2.0);
        assertEquals(2.0, result.getReal(), 0.0);
        assertEquals(3.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testDivideDoubleZero() {
        Complex result = one.divide(0.0);
        assertEquals(Complex.INF, result);
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(one.equals(one));
    }

    @Test
    public void testEqualsEqualObjects() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testEqualsDifferentObjects() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 3.0);
        assertFalse(c1.equals(c2));
    }

    @Test
    public void testEqualsNonComplex() {
        assertFalse(one.equals("not a complex"));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(one.equals(null));
    }

    @Test
    public void testEqualsNaN() {
        Complex c1 = new Complex(Double.NaN, 1.0);
        Complex c2 = new Complex(Double.NaN, 1.0);
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testHashCode() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        assertEquals(c1.hashCode(), c2.hashCode());
    }

    @Test
    public void testIsNaNTrue() {
        assertTrue(nan.isNaN());
    }

    @Test
    public void testIsNaNFalse() {
        assertFalse(one.isNaN());
    }

    @Test
    public void testIsInfiniteTrue() {
        assertTrue(inf.isInfinite());
    }

    @Test
    public void testMultiplyNormal() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex result = c1.multiply(c2);
        assertEquals(-5.0, result.getReal(), 0.0);
        assertEquals(10.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testMultiplyZero() {
        Complex result = one.multiply(zero);
        assertEquals(0.0, result.getReal(), 0.0);
        assertEquals(0.0, result.getImaginary(), 0.0);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNull() {
        one.multiply((Complex) null);
    }

    @Test
    public void testMultiplyInfinite() {
        Complex result = inf.multiply(one);
        assertEquals(Complex.INF, result);
    }

    @Test
    public void testNegate() {
        Complex result = new Complex(1.0, -2.0).negate();
        assertEquals(-1.0, result.getReal(), 0.0);
        assertEquals(2.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testSubtractNormal() {
        Complex c1 = new Complex(5.0, 7.0);
        Complex c2 = new Complex(2.0, 3.0);
        Complex result = c1.subtract(c2);
        assertEquals(3.0, result.getReal(), 0.0);
        assertEquals(4.0, result.getImaginary(), 0.0);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNull() {
        one.subtract((Complex) null);
    }

    @Test
    public void testSubtractDouble() {
        Complex c = new Complex(5.0, 7.0);
        Complex result = c.subtract(3.0);
        assertEquals(2.0, result.getReal(), 0.0);
        assertEquals(7.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testCos() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.cos();
        assertEquals(1.0, result.getReal(), 0.0001);
        assertEquals(0.0, result.getImaginary(), 0.0001);
    }

    @Test
    public void testCosh() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.cosh();
        assertEquals(1.0, result.getReal(), 0.0001);
        assertEquals(0.0, result.getImaginary(), 0.0001);
    }

    @Test
    public void testExp() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.exp();
        assertEquals(1.0, result.getReal(), 0.0001);
        assertEquals(0.0, result.getImaginary(), 0.0001);
    }

    @Test
    public void testLog() {
        Complex c = new Complex(1.0, 0.0);
        Complex result = c.log();
        assertEquals(0.0, result.getReal(), 0.0001);
        assertEquals(0.0, result.getImaginary(), 0.0001);
    }

    @Test
    public void testSqrt() {
        Complex c = new Complex(4.0, 0.0);
        Complex result = c.sqrt();
        assertEquals(2.0, result.getReal(), 0.0001);
        assertEquals(0.0, result.getImaginary(), 0.0001);
    }

    @Test
    public void testSqrtZero() {
        Complex result = zero.sqrt();
        assertEquals(0.0, result.getReal(), 0.0);
        assertEquals(0.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testTan() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.tan();
        assertEquals(0.0, result.getReal(), 0.0001);
        assertEquals(0.0, result.getImaginary(), 0.0001);
    }

    @Test
    public void testTanh() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.tanh();
        assertEquals(0.0, result.getReal(), 0.0001);
        assertEquals(0.0, result.getImaginary(), 0.0001);
    }

    @Test
    public void testGetArgument() {
        Complex c = new Complex(1.0, 1.0);
        assertEquals(Math.PI / 4, c.getArgument(), 0.0001);
    }

    @Test
    public void testNthRootFibonacci() {
        List<Complex> roots = one.nthRoot(1);
        assertEquals(1, roots.size());
        assertEquals(1.0, roots.get(0).getReal(), 0.0);
        assertEquals(0.0, roots.get(0).getImaginary(), 0.0);
    }

    @Test
    public void testNthRootFourRoots() {
        List<Complex> roots = one.nthRoot(4);
        assertEquals(4, roots.size());
        assertEquals(1.0, roots.get(0).getReal(), 0.0001);
        assertEquals(0.0, roots.get(0).getImaginary(), 0.0001);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRootNegativeN() {
        one.nthRoot(-1);
    }

    @Test
    public void testNthRootZero() {
        List<Complex> roots = Complex.ZERO.nthRoot(3);
        assertEquals(3, roots.size());
        assertEquals(0.0, roots.get(0).getReal(), 0.0);
        assertEquals(0.0, roots.get(0).getImaginary(), 0.0);
    }

    @Test
    public void testValueOf() {
        Complex c = Complex.valueOf(1.0, 2.0);
        assertEquals(1.0, c.getReal(), 0.0);
        assertEquals(2.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testValueOfNaN() {
        Complex c = Complex.valueOf(Double.NaN, 1.0);
        assertTrue(c.isNaN());
    }

    @Test
    public void testValueOfSingle() {
        Complex c = Complex.valueOf(1.0);
        assertEquals(1.0, c.getReal(), 0.0);
        assertEquals(0.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testToString() {
        assertEquals("(1.0, 2.0)", new Complex(1.0, 2.0).toString());
    }

    @Test
    public void testAcos() {
        Complex c = new Complex(1.0, 0.0);
        Complex result = c.acos();
        assertEquals(0.0, result.getReal(), 0.0001);
    }

    @Test
    public void testAsin() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.asin();
        assertEquals(0.0, result.getReal(), 0.0001);
    }

    @Test
    public void testAtan() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.atan();
        assertEquals(0.0, result.getReal(), 0.0001);
    }

    @Test
    public void testPow() {
        Complex c = new Complex(2.0, 0.0);
        Complex result = c.pow(2.0);
        assertEquals(4.0, result.getReal(), 0.0001);
    }

    @Test
    public void testGetField() {
        assertNotNull(one.getField());
    }
}