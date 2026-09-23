package org.apache.commons.math3.fraction;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

public class FractionTest {

    private Fraction fraction;

    @Before
    public void setUp() {
        fraction = new Fraction(1, 2);
    }

    @After
    public void tearDown() {
        fraction = null;
    }

    @Test
    public void testConstructorDouble() throws FractionConversionException {
        Fraction f = new Fraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorDoubleMaxDenominator() throws FractionConversionException {
        Fraction f = new Fraction(0.5, 10);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleNonConvergent() throws FractionConversionException {
        new Fraction(Double.MAX_VALUE, 1e-300, 2);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleOverflow() throws FractionConversionException {
        new Fraction(Double.POSITIVE_INFINITY);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleOverflowIterations() throws FractionConversionException {
        new Fraction(0.123456789, 1e-300, 5);
    }

    @Test
    public void testConstructorInt() {
        Fraction f = new Fraction(5);
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructorIntInt() {
        Fraction f = new Fraction(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntZeroDenominator() {
        try {
            new Fraction(1, 0);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testConstructorIntIntNegativeDenominator() {
        Fraction f = new Fraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntNegativeBoth() {
        Fraction f = new Fraction(-1, -2);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntMinValue() {
        try {
            new Fraction(Integer.MIN_VALUE, -1);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testConstructorIntIntZeroNumerator() {
        Fraction f = new Fraction(0, 5);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testAbs() {
        Fraction f = new Fraction(-1, 2);
        assertEquals(new Fraction(1, 2), f.abs());
        assertEquals(fraction, fraction.abs());
    }

    @Test
    public void testAbsMinValue() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        Fraction result = f.abs();
        assertEquals(Integer.MAX_VALUE, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @Test
    public void testCompareTo() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(3, 4);
        assertEquals(0, f1.compareTo(f2));
        assertTrue(f1.compareTo(f3) < 0);
        assertTrue(f3.compareTo(f1) > 0);
    }

    @Test
    public void testDoubleValue() {
        assertEquals(0.5, fraction.doubleValue(), 0.0001);
        assertEquals(0.0, new Fraction(0, 1).doubleValue(), 0.0001);
    }

    @Test
    public void testEquals() {
        Fraction f = new Fraction(2, 4);
        assertTrue(fraction.equals(f));
        assertTrue(fraction.equals(fraction));
        assertFalse(fraction.equals(null));
        assertFalse(fraction.equals(new Object()));
        assertFalse(fraction.equals(new Fraction(1, 3)));
    }

    @Test
    public void testFloatValue() {
        assertEquals(0.5f, fraction.floatValue(), 0.0001f);
    }

    @Test
    public void testGetDenominator() {
        assertEquals(2, fraction.getDenominator());
        assertEquals(1, new Fraction(5).getDenominator());
    }

    @Test
    public void testGetNumerator() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(0, new Fraction(0, 5).getNumerator());
    }

    @Test
    public void testHashCode() {
        Fraction f = new Fraction(1, 2);
        assertEquals(fraction.hashCode(), f.hashCode());
        assertNotEquals(fraction.hashCode(), new Fraction(1, 3).hashCode());
    }

    @Test
    public void testIntValue() {
        assertEquals(0, fraction.intValue());
        assertEquals(2, new Fraction(5, 2).intValue());
        assertEquals(-2, new Fraction(-5, 2).intValue());
    }

    @Test
    public void testLongValue() {
        assertEquals(0L, fraction.longValue());
        assertEquals(2L, new Fraction(5, 2).longValue());
    }

    @Test
    public void testNegate() {
        assertEquals(new Fraction(-1, 2), fraction.negate());
        assertEquals(new Fraction(1, 2), new Fraction(-1, 2).negate());
    }

    @Test
    public void testNegateMinValue() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        Fraction result = f.negate();
        assertEquals(Integer.MAX_VALUE, result.getNumerator());
    }

    @Test
    public void testReciprocal() {
        Fraction f = new Fraction(2, 3);
        assertEquals(new Fraction(3, 2), f.reciprocal());
        assertEquals(new Fraction(1, 2), new Fraction(2, 1).reciprocal());
    }

    @Test
    public void testAddFraction() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction result = f1.add(f2);
        assertEquals(new Fraction(5, 6), result);
    }

    @Test
    public void testAddFractionNull() {
        try {
            fraction.add((Fraction) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddFractionOverflow() {
        Fraction f = new Fraction(Integer.MAX_VALUE, 1);
        try {
            f.add(f);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testAddInt() {
        assertEquals(new Fraction(3, 2), fraction.add(1));
        assertEquals(new Fraction(-1, 2), fraction.add(-1));
    }

    @Test
    public void testSubtractFraction() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertEquals(new Fraction(1, 6), f1.subtract(f2));
    }

    @Test
    public void testSubtractFractionNull() {
        try {
            fraction.subtract((Fraction) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSubtractInt() {
        assertEquals(new Fraction(-1, 2), fraction.subtract(1));
        assertEquals(new Fraction(3, 2), fraction.subtract(-1));
    }

    @Test
    public void testMultiplyFraction() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 3);
        assertEquals(new Fraction(1, 3), f1.multiply(f2));
        assertEquals(Fraction.ZERO, new Fraction(0, 1).multiply(f2));
    }

    @Test
    public void testMultiplyFractionNull() {
        try {
            fraction.multiply((Fraction) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testMultiplyInt() {
        assertEquals(new Fraction(2, 1), fraction.multiply(2));
        assertEquals(new Fraction(0, 1), fraction.multiply(0));
    }

    @Test
    public void testDivideFraction() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 3);
        assertEquals(new Fraction(3, 4), f1.divide(f2));
    }

    @Test
    public void testDivideFractionNull() {
        try {
            fraction.divide((Fraction) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDivideFractionZero() {
        Fraction f = new Fraction(1, 2);
        try {
            f.divide(Fraction.ZERO);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testDivideInt() {
        assertEquals(new Fraction(1, 4), fraction.divide(2));
    }

    @Test
    public void testPercentageValue() {
        assertEquals(50.0, fraction.percentageValue(), 0.0001);
        assertEquals(0.0, Fraction.ZERO.percentageValue(), 0.0001);
    }

    @Test
    public void testGetReducedFraction() {
        Fraction f = Fraction.getReducedFraction(2, 4);
        assertEquals(new Fraction(1, 2), f);
        assertEquals(Fraction.ZERO, Fraction.getReducedFraction(0, 5));
    }

    @Test
    public void testGetReducedFractionZeroDenominator() {
        try {
            Fraction.getReducedFraction(1, 0);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testGetReducedFractionMinValue() {
        Fraction f = Fraction.getReducedFraction(Integer.MIN_VALUE, 2);
        assertEquals(Integer.MIN_VALUE, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetReducedFractionNegativeDenominator() {
        Fraction f = Fraction.getReducedFraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetReducedFractionMinValueDenominator() {
        Fraction f = Fraction.getReducedFraction(1, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(Integer.MIN_VALUE, f.getDenominator());
    }

    @Test
    public void testToString() {
        assertEquals("1 / 2", fraction.toString());
        assertEquals("5", new Fraction(5).toString());
        assertEquals("0", Fraction.ZERO.toString());
    }

    @Test
    public void testGetField() {
        assertNotNull(fraction.getField());
        assertEquals(FractionField.getInstance(), fraction.getField());
    }
}