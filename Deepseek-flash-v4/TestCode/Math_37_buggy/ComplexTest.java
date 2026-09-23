package org.apache.commons.math.complex;

import static org.junit.Assert.*;
import java.util.List;
import org.apache.commons.math.exception.NotPositiveException;
import org.apache.commons.math.exception.NullArgumentException;
import org.junit.Test;

public class ComplexTest {

    private static final double EPSILON = 1e-10;

    @Test
    public void testConstructors() {
        Complex c1 = new Complex(1.0, 2.0);
        assertEquals(1.0, c1.getReal(), 0.0);
        assertEquals(2.0, c1.getImaginary(), 0.0);
        assertFalse(c1.isNaN());
        assertFalse(c1.isInfinite());
        Complex c2 = new Complex(Double.NaN);
        assertTrue(c2.isNaN());
        Complex c3 = new Complex(Double.POSITIVE_INFINITY);
        assertTrue(c3.isInfinite());
        assertFalse(c3.isNaN());
    }

    @Test
    public void testConstants() {
        assertEquals(0.0, Complex.ZERO.getReal(), 0.0);
        assertEquals(0.0, Complex.ZERO.getImaginary(), 0.0);
        assertEquals(1.0, Complex.ONE.getReal(), 0.0);
        assertEquals(0.0, Complex.ONE.getImaginary(), 0.0);
        assertTrue(Complex.I.isInfinite() == false);
        assertEquals(1.0, Complex.I.getImaginary(), 0.0);
        assertTrue(Complex.NaN.isNaN());
        assertTrue(Complex.INF.isInfinite());
    }

    @Test
    public void testAbs() {
        Complex c1 = new Complex(3.0, 4.0);
        assertEquals(5.0, c1.abs(), EPSILON);
        Complex c2 = new Complex(0.0, 0.0);
        assertEquals(0.0, c2.abs(), 0.0);
        Complex c3 = new Complex(Double.NaN, 0.0);
        assertTrue(Double.isNaN(c3.abs()));
        Complex c4 = new Complex(Double.POSITIVE_INFINITY, 0.0);
        assertEquals(Double.POSITIVE_INFINITY, c4.abs(), 0.0);
        Complex c5 = new Complex(0.0, -5.0);
        assertEquals(5.0, c5.abs(), EPSILON);
        Complex c6 = new Complex(1.0, 1.0);
        assertEquals(Math.sqrt(2.0), c6.abs(), EPSILON);
    }

    @Test
    public void testAbsBoundary() {
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.abs(), 0.0);
        Complex c2 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, c2.abs(), 0.0);
    }

    @Test
    public void testAdd() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex result = c1.add(c2);
        assertEquals(4.0, result.getReal(), EPSILON);
        assertEquals(6.0, result.getImaginary(), EPSILON);
        Complex nanResult = c1.add(new Complex(Double.NaN));
        assertTrue(nanResult.isNaN());
        assertEquals(5.0, c1.add(4.0).getReal(), EPSILON);
        assertTrue(c1.add(Double.NaN).isNaN());
        assertTrue(new Complex(Double.NaN).add(c1).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNull() {
        new Complex(1.0).add(null);
    }

    @Test
    public void testConjugate() {
        Complex c = new Complex(1.0, 2.0);
        Complex result = c.conjugate();
        assertEquals(1.0, result.getReal(), 0.0);
        assertEquals(-2.0, result.getImaginary(), 0.0);
        Complex nan = new Complex(Double.NaN);
        assertTrue(nan.conjugate().isNaN());
    }

    @Test
    public void testDivide() {
        Complex c1 = new Complex(2.0, 3.0);
        Complex c2 = new Complex(1.0, 1.0);
        Complex result = c1.divide(c2);
        assertEquals(2.5, result.getReal(), EPSILON);
        assertEquals(0.5, result.getImaginary(), EPSILON);
        assertTrue(c1.divide(new Complex(Double.NaN)).isNaN());
        assertEquals(Complex.ZERO, c1.divide(new Complex(Double.POSITIVE_INFINITY)));
        assertTrue(c1.divide(0.0).isInfinite());
        assertTrue(c1.divide(Double.NaN).isNaN());
        assertTrue(c1.divide(0.0).equals(Complex.INF));
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNull() {
        new Complex(1.0).divide(null);
    }

    @Test
    public void testDivideZero() {
        Complex c = new Complex(1.0, 0.0);
        assertTrue(c.divide(0.0).isInfinite());
        assertTrue(c.divide(new Complex(0.0, 0.0)).isInfinite());
        assertTrue(new Complex(Double.NaN).divide(0.0).isNaN());
    }

    @Test
    public void testReciprocal() {
        Complex c = new Complex(1.0, 0.0);
        assertEquals(1.0, c.reciprocal().getReal(), EPSILON);
        assertTrue(Complex.ZERO.reciprocal().isInfinite());
        assertTrue(new Complex(Double.NaN).reciprocal().isNaN());
        assertTrue(new Complex(Double.POSITIVE_INFINITY).reciprocal().isInfinite());
    }

    @Test
    public void testEquals() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex c3 = new Complex(1.0, 3.0);
        assertEquals(c1, c2);
        assertNotEquals(c1, c3);
        assertNotEquals(c1, null);
        assertNotEquals(c1, new Object());
        Complex nan = new Complex(Double.NaN);
        assertEquals(nan, nan);
        assertNotEquals(nan, new Complex(Double.NaN));
    }

    @Test
    public void testHashCode() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        assertEquals(c1.hashCode(), c2.hashCode());
        assertNotEquals(c1.hashCode(), new Complex(1.0, 3.0).hashCode());
    }

    @Test
    public void testGetField() {
        assertNotNull(new Complex(1.0).getField());
    }

    @Test
    public void testMultiply() {
        Complex c1 = new Complex(2.0, 3.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex result = c1.multiply(c2);
        assertEquals(-4.0, result.getReal(), EPSILON);
        assertEquals(7.0, result.getImaginary(), EPSILON);
        assertTrue(c1.multiply(new Complex(Double.NaN)).isNaN());
        assertTrue(c1.multiply(Double.NaN).isNaN());
        assertTrue(c1.multiply(new Complex(Double.POSITIVE_INFINITY)).isInfinite());
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNull() {
        new Complex(1.0).multiply((Complex) null);
    }

    @Test
    public void testMultiplyInt() {
        Complex c = new Complex(2.0, 3.0);
        Complex result = c.multiply(2);
        assertEquals(4.0, result.getReal(), EPSILON);
        assertEquals(6.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testNegate() {
        Complex c = new Complex(1.0, -2.0);
        Complex result = c.negate();
        assertEquals(-1.0, result.getReal(), 0.0);
        assertEquals(2.0, result.getImaginary(), 0.0);
        assertTrue(new Complex(Double.NaN).negate().isNaN());
    }

    @Test
    public void testSubtract() {
        Complex c1 = new Complex(5.0, 6.0);
        Complex c2 = new Complex(3.0, 2.0);
        Complex result = c1.subtract(c2);
        assertEquals(2.0, result.getReal(), EPSILON);
        assertEquals(4.0, result.getImaginary(), EPSILON);
        assertTrue(c1.subtract(new Complex(Double.NaN)).isNaN());
        assertEquals(2.0, c1.subtract(3.0).getReal(), EPSILON);
        assertTrue(c1.subtract(Double.NaN).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNull() {
        new Complex(1.0).subtract(null);
    }

    @Test
    public void testLog() {
        Complex c = new Complex(1.0, 0.0);
        assertEquals(0.0, c.log().getReal(), EPSILON);
        assertTrue(new Complex(Double.NaN).log().isNaN());
    }

    @Test
    public void testPow() {
        Complex c = new Complex(2.0, 0.0);
        Complex result = c.pow(new Complex(2.0, 0.0));
        assertEquals(4.0, result.getReal(), EPSILON);
        assertTrue(c.pow(Double.NaN).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testPowNull() {
        new Complex(1.0).pow((Complex) null);
    }

    @Test
    public void testSinhCosh() {
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.sinh().getReal(), EPSILON);
        assertEquals(1.0, c.cosh().getReal(), EPSILON);
        assertTrue(new Complex(Double.NaN).sinh().isNaN());
        assertTrue(new Complex(Double.NaN).cosh().isNaN());
    }

    @Test
    public void testSinCos() {
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.sin().getReal(), EPSILON);
        assertEquals(1.0, c.cos().getReal(), EPSILON);
        assertTrue(new Complex(Double.NaN).sin().isNaN());
        assertTrue(new Complex(Double.NaN).cos().isNaN());
    }

    @Test
    public void testSqrt() {
        Complex c = new Complex(4.0, 0.0);
        assertEquals(2.0, c.sqrt().getReal(), EPSILON);
        Complex negative = new Complex(-4.0, 0.0);
        assertEquals(0.0, negative.sqrt().getReal(), EPSILON);
        assertTrue(new Complex(Double.NaN).sqrt().isNaN());
    }

    @Test
    public void testSqrt1z() {
        Complex c = new Complex(1.0, 0.0);
        assertEquals(0.0, c.sqrt1z().getReal(), EPSILON);
        assertTrue(new Complex(Double.NaN).sqrt1z().isNaN());
    }

    @Test
    public void testTan() {
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.tan().getReal(), EPSILON);
        assertTrue(new Complex(Double.NaN).tan().isNaN());
    }

    @Test
    public void testTanh() {
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.tanh().getReal(), EPSILON);
    }

    @Test
    public void testGetArgument() {
        Complex c = new Complex(1.0, 1.0);
        assertEquals(Math.PI / 4, c.getArgument(), EPSILON);
        Complex negative = new Complex(-1.0, 0.0);
        assertEquals(Math.PI, negative.getArgument(), EPSILON);
    }

    @Test
    public void testNthRoot() {
        Complex c = new Complex(1.0, 0.0);
        List<Complex> roots = c.nthRoot(4);
        assertEquals(4, roots.size());
        assertEquals(1.0, roots.get(0).getReal(), EPSILON);
        assertTrue(new Complex(Double.NaN).nthRoot(3).get(0).isNaN());
        assertTrue(new Complex(Double.POSITIVE_INFINITY).nthRoot(3).get(0).isInfinite());
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRootNegative() {
        new Complex(1.0).nthRoot(0);
    }

    @Test
    public void testValueOf() {
        Complex c = Complex.valueOf(1.0, 2.0);
        assertEquals(1.0, c.getReal(), 0.0);
        assertEquals(2.0, c.getImaginary(), 0.0);
        assertTrue(Complex.valueOf(Double.NaN).isNaN());
        assertTrue(Complex.valueOf(1.0, Double.NaN).isNaN());
    }

    @Test
    public void testToString() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals("(1.0, 2.0)", c.toString());
    }

    @Test
    public void testReadResolve() {
        Complex c = new Complex(1.0, 2.0);
        Complex resolved = c.readResolve();
        assertEquals(c, resolved);
    }
}