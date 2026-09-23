package org.apache.commons.math.complex;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class ComplexTest {
    private Complex complex;
    private static final double EPSILON = 1e-10;

    @Before
    public void setUp() {
        complex = new Complex(3.0, 4.0);
    }

    @After
    public void tearDown() {
        complex = null;
    }

    // Test Constructor and getters
    @Test
    public void testConstructorAndGetters() {
        Complex c = new Complex(1.5, -2.5);
        assertEquals(1.5, c.getReal(), 0.0);
        assertEquals(-2.5, c.getImaginary(), 0.0);
        
        Complex c2 = new Complex(5.0);
        assertEquals(5.0, c2.getReal(), 0.0);
        assertEquals(0.0, c2.getImaginary(), 0.0);
    }

    // Test NaN detection
    @Test
    public void testIsNaN() {
        assertFalse(complex.isNaN());
        assertTrue(new Complex(Double.NaN, 1.0).isNaN());
        assertTrue(new Complex(1.0, Double.NaN).isNaN());
        assertTrue(Complex.NaN.isNaN());
        assertFalse(Complex.INF.isNaN());
    }

    // Test isInfinite
    @Test
    public void testIsInfinite() {
        assertFalse(complex.isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 1.0).isInfinite());
        assertTrue(new Complex(1.0, Double.NEGATIVE_INFINITY).isInfinite());
        assertTrue(Complex.INF.isInfinite());
        assertFalse(new Complex(Double.NaN, 1.0).isInfinite());
    }

    // Test abs - normal case
    @Test
    public void testAbsNormalCase() {
        assertEquals(5.0, new Complex(3.0, 4.0).abs(), 0.0);
        assertEquals(Math.sqrt(2), new Complex(1.0, 1.0).abs(), EPSILON);
        assertEquals(1.0, new Complex(0.0, 1.0).abs(), 0.0);
    }

    // Test abs - zero and boundary
    @Test
    public void testAbsBoundaryCases() {
        assertEquals(0.0, new Complex(0.0, 0.0).abs(), 0.0);
        assertEquals(Double.NaN, new Complex(Double.NaN, 0.0).abs(), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, new Complex(Double.POSITIVE_INFINITY, 0.0).abs(), 0.0);
        // Test both components equal
        double val = Math.sqrt(2);
        Complex c = new Complex(1.0, 1.0);
        assertEquals(val, c.abs(), EPSILON);
    }

    // Test add(Complex)
    @Test
    public void testAddComplex() {
        Complex other = new Complex(1.0, 2.0);
        Complex result = complex.add(other);
        assertEquals(4.0, result.getReal(), 0.0);
        assertEquals(6.0, result.getImaginary(), 0.0);
        
        // Test NaN propagation
        Complex nan = new Complex(Double.NaN, 0.0);
        assertTrue(complex.add(nan).isNaN());
    }

    // Test add(Complex) with null
    @Test(expected = NullArgumentException.class)
    public void testAddComplexNull() {
        complex.add((Complex) null);
    }

    // Test add(double)
    @Test
    public void testAddDouble() {
        Complex result = complex.add(2.0);
        assertEquals(5.0, result.getReal(), 0.0);
        assertEquals(4.0, result.getImaginary(), 0.0);
        
        // Test NaN
        assertTrue(complex.add(Double.NaN).isNaN());
    }

    // Test conjugate
    @Test
    public void testConjugate() {
        Complex result = complex.conjugate();
        assertEquals(3.0, result.getReal(), 0.0);
        assertEquals(-4.0, result.getImaginary(), 0.0);
    }

    // Test divide(Complex)
    @Test
    public void testDivideComplex() {
        Complex divisor = new Complex(1.0, 1.0);
        Complex result = complex.divide(divisor);
        assertEquals(3.0, result.getReal(), 0.0);
        assertEquals(-1.0, result.getImaginary(), 0.0);
        
        // Test division by zero
        Complex zero = new Complex(0.0, 0.0);
        Complex inf = complex.divide(zero);
        assertTrue(inf.isInfinite());
    }

    // Test divide(Complex) with null
    @Test(expected = NullArgumentException.class)
    public void testDivideComplexNull() {
        complex.divide((Complex) null);
    }

    // Test divide(double)
    @Test
    public void testDivideDouble() {
        Complex result = complex.divide(2.0);
        assertEquals(1.5, result.getReal(), 0.0);
        assertEquals(2.0, result.getImaginary(), 0.0);
        
        // Test division by zero
        assertTrue(complex.divide(0.0).isInfinite());
        
        // Test division by infinity
        Complex infResult = complex.divide(Double.POSITIVE_INFINITY);
        assertEquals(0.0, infResult.getReal(), 0.0);
        assertEquals(0.0, infResult.getImaginary(), 0.0);
    }

    // Test equals
    @Test
    public void testEquals() {
        Complex c1 = new Complex(3.0, 4.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex c3 = new Complex(4.0, 3.0);
        Complex c4 = new Complex(Double.NaN, 0.0);
        Complex c5 = new Complex(Double.NaN, 0.0);
        
        assertTrue(c1.equals(c1));
        assertFalse(c1.equals(null));
        assertFalse(c1.equals("not a complex"));
        assertFalse(c1.equals(c3));
        assertFalse(c1.equals(c4));
        assertTrue(c4.equals(c5));
    }

    // Test hashCode
    @Test
    public void testHashCode() {
        Complex c1 = new Complex(3.0, 4.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex nan = new Complex(Double.NaN, 0.0);
        Complex nan2 = new Complex(Double.NaN, 0.0);
        
        assertEquals(c1.hashCode(), c2.hashCode());
        assertEquals(nan.hashCode(), nan2.hashCode());
        assertEquals(7, nan.hashCode());
    }

    // Test multiply(Complex)
    @Test
    public void testMultiplyComplex() {
        Complex other = new Complex(2.0, 3.0);
        Complex result = complex.multiply(other);
        assertEquals(-6.0, result.getReal(), 0.0);
        assertEquals(17.0, result.getImaginary(), 0.0);
        
        // Test multiply by zero
        Complex zero = new Complex(0.0, 0.0);
        Complex zeroResult = complex.multiply(zero);
        assertEquals(0.0, zeroResult.getReal(), 0.0);
        assertEquals(0.0, zeroResult.getImaginary(), 0.0);
    }

    // Test multiply(Complex) with null
    @Test(expected = NullArgumentException.class)
    public void testMultiplyComplexNull() {
        complex.multiply((Complex) null);
    }

    // Test multiply(double)
    @Test
    public void testMultiplyDouble() {
        Complex result = complex.multiply(2.0);
        assertEquals(6.0, result.getReal(), 0.0);
        assertEquals(8.0, result.getImaginary(), 0.0);
        
        Complex zero = complex.multiply(0.0);
        assertEquals(0.0, zero.getReal(), 0.0);
        assertEquals(0.0, zero.getImaginary(), 0.0);
    }

    // Test negate
    @Test
    public void testNegate() {
        Complex result = complex.negate();
        assertEquals(-3.0, result.getReal(), 0.0);
        assertEquals(-4.0, result.getImaginary(), 0.0);
    }

    // Test subtract(Complex)
    @Test
    public void testSubtractComplex() {
        Complex other = new Complex(1.0, 2.0);
        Complex result = complex.subtract(other);
        assertEquals(2.0, result.getReal(), 0.0);
        assertEquals(2.0, result.getImaginary(), 0.0);
    }

    // Test subtract(Complex) with null
    @Test(expected = NullArgumentException.class)
    public void testSubtractComplexNull() {
        complex.subtract((Complex) null);
    }

    // Test subtract(double)
    @Test
    public void testSubtractDouble() {
        Complex result = complex.subtract(1.0);
        assertEquals(2.0, result.getReal(), 0.0);
        assertEquals(4.0, result.getImaginary(), 0.0);
    }

    // Test acos
    @Test
    public void testAcos() {
        Complex c = new Complex(0.5, 0.0);
        Complex result = c.acos();
        assertEquals(1.0471975511965976, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    // Test asin
    @Test
    public void testAsin() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.asin();
        assertEquals(0.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    // Test atan
    @Test
    public void testAtan() {
        Complex c = new Complex(1.0, 0.0);
        Complex result = c.atan();
        assertEquals(Math.PI / 4, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    // Test cos
    @Test
    public void testCos() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.cos();
        assertEquals(1.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    // Test cosh
    @Test
    public void testCosh() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.cosh();
        assertEquals(1.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    // Test exp
    @Test
    public void testExp() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.exp();
        assertEquals(1.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
        
        Complex c2 = new Complex(0.0, Math.PI);
        Complex result2 = c2.exp();
        assertEquals(-1.0, result2.getReal(), EPSILON);
        assertEquals(0.0, result2.getImaginary(), EPSILON);
    }

    // Test log
    @Test
    public void testLog() {
        Complex c = new Complex(1.0, 0.0);
        Complex result = c.log();
        assertEquals(0.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
        
        Complex c2 = new Complex(0.0, 1.0);
        Complex result2 = c2.log();
        assertEquals(0.0, result2.getReal(), EPSILON);
        assertEquals(Math.PI / 2, result2.getImaginary(), EPSILON);
    }

    // Test pow(Complex)
    @Test
    public void testPowComplex() {
        Complex base = new Complex(2.0, 0.0);
        Complex exp = new Complex(2.0, 0.0);
        Complex result = base.pow(exp);
        assertEquals(4.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    // Test pow(double)
    @Test
    public void testPowDouble() {
        Complex c = new Complex(2.0, 0.0);
        Complex result = c.pow(3.0);
        assertEquals(8.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    // Test sin
    @Test
    public void testSin() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.sin();
        assertEquals(0.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    // Test sinh
    @Test
    public void testSinh() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.sinh();
        assertEquals(0.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    // Test sqrt
    @Test
    public void testSqrt() {
        Complex c = new Complex(4.0, 0.0);
        Complex result = c.sqrt();
        assertEquals(2.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
        
        Complex c2 = new Complex(0.0, 0.0);
        Complex result2 = c2.sqrt();
        assertEquals(0.0, result2.getReal(), EPSILON);
        assertEquals(0.0, result2.getImaginary(), EPSILON);
    }

    // Test sqrt1z
    @Test
    public void testSqrt1z() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.sqrt1z();
        assertEquals(1.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    // Test tan
    @Test
    public void testTan() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.tan();
        assertEquals(0.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    // Test tanh
    @Test
    public void testTanh() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.tanh();
        assertEquals(0.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    // Test getArgument
    @Test
    public void testGetArgument() {
        Complex c = new Complex(1.0, 1.0);
        assertEquals(Math.PI / 4, c.getArgument(), EPSILON);
        Complex c2 = new Complex(1.0, 0.0);
        assertEquals(0.0, c2.getArgument(), EPSILON);
        Complex c3 = new Complex(0.0, 1.0);
        assertEquals(Math.PI / 2, c3.getArgument(), EPSILON);
    }

    // Test nthRoot
    @Test
    public void testNthRoot() {
        Complex c = new Complex(8.0, 0.0);
        List<Complex> roots = c.nthRoot(3);
        assertEquals(3, roots.size());
        assertEquals(2.0, roots.get(0).getReal(), EPSILON);
        
        // Test NaN
        Complex nan = new Complex(Double.NaN, 0.0);
        List<Complex> nanRoots = nan.nthRoot(2);
        assertEquals(1, nanRoots.size());
        assertTrue(nanRoots.get(0).isNaN());
        
        // Test INF
        Complex inf = new Complex(Double.POSITIVE_INFINITY, 0.0);
        List<Complex> infRoots = inf.nthRoot(2);
        assertEquals(1, infRoots.size());
        assertTrue(infRoots.get(0).isInfinite());
    }

    // Test nthRoot with non-positive n
    @Test(expected = NotPositiveException.class)
    public void testNthRootNonPositive() {
        Complex c = new Complex(8.0, 0.0);
        c.nthRoot(0);
    }

    // Test valueOf
    @Test
    public void testValueOf() {
        Complex c1 = Complex.valueOf(2.0, 3.0);
        assertEquals(2.0, c1.getReal(), 0.0);
        assertEquals(3.0, c1.getImaginary(), 0.0);
        
        Complex c2 = Complex.valueOf(2.0);
        assertEquals(2.0, c2.getReal(), 0.0);
        assertEquals(0.0, c2.getImaginary(), 0.0);
        
        Complex nan = Complex.valueOf(Double.NaN, 0.0);
        assertTrue(nan.isNaN());
        
        Complex nan2 = Complex.valueOf(Double.NaN);
        assertTrue(nan2.isNaN());
    }

    // Test readResolve
    @Test
    public void testReadResolve() {
        Complex c = new Complex(1.0, 2.0);
        Complex resolved = c.createComplex(1.0, 2.0);
        assertEquals(c, resolved);
    }

    // Test getField
    @Test
    public void testGetField() {
        assertEquals(ComplexField.getInstance(), complex.getField());
    }

    // Test toString
    @Test
    public void testToString() {
        assertEquals("(3.0, 4.0)", complex.toString());
    }
}