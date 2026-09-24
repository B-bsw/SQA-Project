package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexTest {

    private static final double EPS = 1e-12;

    @Test
    public void testConstructorAndGetters() {
        Complex c = new Complex(3.0, -4.0);
        assertEquals(3.0, c.getReal(), 0.0);
        assertEquals(-4.0, c.getImaginary(), 0.0);
        assertEquals(1.0, Complex.ONE.getReal(), 0.0);
        assertEquals(1.0, Complex.I.getImaginary(), 0.0);
    }

    @Test
    public void testAbs() {
        assertEquals(5.0, new Complex(3.0, 4.0).abs(), 0.0);
        assertEquals(5.0, new Complex(4.0, 3.0).abs(), 0.0);
        assertEquals(0.0, Complex.ZERO.abs(), 0.0);
        assertEquals(7.0, new Complex(-7.0, 0.0).abs(), 0.0);
        assertEquals(7.0, new Complex(0.0, 7.0).abs(), 0.0);
        assertTrue(Double.isNaN(Complex.NaN.abs()));
        assertTrue(Double.isInfinite(Complex.INF.abs()));
    }

    @Test
    public void testAddSubtract() {
        assertComplexEquals(3.0, 3.0, new Complex(1.0, 2.0).add(new Complex(2.0, 1.0)));
        assertComplexEquals(-1.0, 1.0, new Complex(1.0, 2.0).subtract(new Complex(2.0, 1.0)));
        assertTrue(new Complex(Double.NaN, 0.0).add(Complex.ONE).isNaN());
        assertTrue(Complex.ONE.subtract(new Complex(0.0, Double.NaN)).isNaN());
    }

    @Test
    public void testMultiplyAndDivide() {
        assertComplexEquals(-5.0, 10.0, new Complex(1.0, 2.0).multiply(new Complex(3.0, 4.0)));
        assertComplexEquals(0.44, 0.08, new Complex(1.0, 2.0).divide(new Complex(3.0, 4.0)));
        assertComplexEquals(2.2, 0.4, new Complex(4.0, 3.0).divide(new Complex(2.0, 1.0)));
        assertTrue(Complex.ONE.divide(Complex.ZERO).isNaN());
        assertTrue(Complex.NaN.multiply(Complex.ONE).isNaN());
        assertSame(Complex.ZERO, Complex.ONE.divide(Complex.INF));
        assertSame(Complex.INF, new Complex(Double.POSITIVE_INFINITY, 0.0).multiply(Complex.ONE));
    }

    @Test
    public void testConjugateNegate() {
        assertComplexEquals(1.0, -2.0, new Complex(1.0, 2.0).conjugate());
        assertComplexEquals(-1.0, -2.0, new Complex(1.0, 2.0).negate());
        assertTrue(Complex.NaN.conjugate().isNaN());
        assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testEqualsAndHashCode() {
        Complex c = new Complex(3.0, -4.0);
        assertTrue(c.equals(c));
        assertFalse(c.equals(null));
        assertFalse(c.equals("not a complex"));
        assertTrue(c.equals(new Complex(3.0, -4.0)));
        assertFalse(c.equals(new Complex(-3.0, -4.0)));
        assertFalse(new Complex(0.0, 1.0).equals(new Complex(-0.0, 1.0)));
        assertFalse(new Complex(1.0, 0.0).equals(new Complex(1.0, -0.0)));
        assertTrue(Complex.NaN.equals(new Complex(Double.NaN, 123.0)));
        assertFalse(Complex.ONE.equals(Complex.NaN));
        assertEquals(7, Complex.NaN.hashCode());
        assertEquals(c.hashCode(), new Complex(3.0, -4.0).hashCode());
    }

    @Test
    public void testIsNaNIsInfinite() {
        assertTrue(new Complex(Double.NaN, 1.0).isNaN());
        assertTrue(new Complex(1.0, Double.NaN).isNaN());
        assertFalse(Complex.INF.isNaN());
        assertTrue(Complex.INF.isInfinite());
        assertTrue(new Complex(Double.NEGATIVE_INFINITY, 0.0).isInfinite());
        assertFalse(Complex.ONE.isInfinite());
    }

    @Test
    public void testNaNPropagation() {
        Complex nan = new Complex(Double.NaN, 0.0);
        assertNaN(nan.acos());
        assertNaN(nan.asin());
        assertNaN(nan.atan());
        assertNaN(nan.cos());
        assertNaN(nan.cosh());
        assertNaN(nan.exp());
        assertNaN(nan.log());
        assertNaN(nan.sin());
        assertNaN(nan.sinh());
        assertNaN(nan.sqrt());
        assertNaN(nan.sqrt1z());
        assertNaN(nan.tan());
        assertNaN(nan.tanh());
        assertNaN(nan.conjugate());
        assertNaN(nan.negate());
        assertNaN(nan.add(Complex.ONE));
        assertNaN(nan.subtract(Complex.ONE));
        assertNaN(nan.multiply(Complex.ONE));
        assertNaN(nan.divide(Complex.ONE));
    }

    @Test
    public void testPow() {
        assertComplexEquals(8.0, 0.0, new Complex(2.0, 0.0).pow(new Complex(3.0, 0.0)));
        assertTrue(new Complex(2.0, 0.0).pow(Complex.NaN).isNaN());
    }

    @Test(expected = NullPointerException.class)
    public void testPowNull() {
        new Complex(1.0, 0.0).pow(null);
    }

    @Test
    public void testTranscendentals() {
        assertComplexEquals(0.0, 0.0, new Complex(0.0, 0.0).sin());
        assertComplexEquals(1.0, 0.0, new Complex(0.0, 0.0).cos());
        assertComplexEquals(0.0, 0.0, new Complex(0.0, 0.0).tan());
        assertComplexEquals(1.0, 0.0, new Complex(0.0, 0.0).cosh());
        assertComplexEquals(0.0, 0.0, new Complex(0.0, 0.0).sinh());
        assertComplexEquals(0.0, 0.0, new Complex(0.0, 0.0).tanh());
        assertComplexEquals(1.0, 0.0, new Complex(0.0, 0.0).exp());
        assertComplexEquals(0.0, 0.0, new Complex(1.0, 0.0).log());
        assertComplexEquals(2.0, 0.0, new Complex(4.0, 0.0).sqrt());
        assertComplexEquals(0.0, 1.0, new Complex(-1.0, 0.0).sqrt());
        assertComplexEquals(1.0, 0.0, new Complex(0.0, 0.0).sqrt1z());
        assertComplexEquals(0.0, 0.0, new Complex(0.0, 0.0).asin());
        assertComplexEquals(0.0, 0.0, new Complex(1.0, 0.0).acos());
        assertComplexEquals(0.0, 0.0, new Complex(0.0, 0.0).atan());
    }

    private static void assertComplexEquals(double expectedReal, double expectedImaginary, Complex actual) {
        assertEquals(expectedReal, actual.getReal(), EPS);
        assertEquals(expectedImaginary, actual.getImaginary(), EPS);
    }

    private static void assertNaN(Complex c) {
        assertTrue("Expected NaN", c.isNaN());
    }
}