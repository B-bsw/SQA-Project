package org.apache.commons.math.fraction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class FractionTest {

    private void assertFraction(int expectedNumerator, int expectedDenominator, Fraction fraction) {
        assertEquals(expectedNumerator, fraction.getNumerator());
        assertEquals(expectedDenominator, fraction.getDenominator());
    }

    @Test
    public void testConstants() {
        assertFraction(2, 1, Fraction.TWO);
        assertFraction(1, 1, Fraction.ONE);
        assertFraction(0, 1, Fraction.ZERO);
        assertFraction(-1, 1, Fraction.MINUS_ONE);
    }

    @Test
    public void testConstructorIntInt() {
        assertFraction(1, 2, new Fraction(2, 4));
        assertFraction(-1, 2, new Fraction(1, -2));
        assertFraction(-3, 4, new Fraction(6, -8));
        assertFraction(0, 1, new Fraction(0, -5));
    }

    @Test(expected = ArithmeticException.class)
    public void testConstructorZeroDenominator() {
        new Fraction(1, 0);
    }

    @Test
    public void testConstructorNegativeDenominatorOverflow() {
        try {
            new Fraction(1, Integer.MIN_VALUE);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // expected
        }
        try {
            new Fraction(Integer.MIN_VALUE, -1);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testGetReducedFraction() {
        assertFraction(1, 2, Fraction.getReducedFraction(2, 4));
        assertFraction(-3, 4, Fraction.getReducedFraction(3, -4));
        assertSame(Fraction.ZERO, Fraction.getReducedFraction(0, 88));
    }

    @Test
    public void testGetReducedFractionBoundary() {
        assertFraction(-1, 1073741824, Fraction.getReducedFraction(2, Integer.MIN_VALUE));
    }

    @Test
    public void testGetReducedFractionExceptions() {
        try {
            Fraction.getReducedFraction(1, 0);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // expected
        }
        try {
            Fraction.getReducedFraction(1, Integer.MIN_VALUE);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // expected
        }
        try {
            Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testDoubleConstructor() throws FractionConversionException {
        assertFraction(1, 2, new Fraction(0.5));
        assertFraction(2, 1, new Fraction(2.0));
        assertFraction(-5, 4, new Fraction(-1.25));
        assertFraction(1, 2, new Fraction(0.5, 1e-9, 100));
    }

    @Test
    public void testDoubleConstructorMaxDenominator() throws FractionConversionException {
        assertFraction(22, 7, new Fraction(Math.PI, 10));
    }

    @Test
    public void testDoubleConstructorExceptions() {
        try {
            new Fraction(1.0e10);
            fail("Expected FractionConversionException");
        } catch (FractionConversionException e) {
            // expected
        }
        try {
            new Fraction(Math.PI, 1e-15, 1);
            fail("Expected FractionConversionException");
        } catch (FractionConversionException e) {
            // expected
        }
    }

    @Test
    public void testAbs() {
        Fraction f = new Fraction(1, 2);
        assertSame(f, f.abs());
        assertFraction(2, 3, new Fraction(-2, 3).abs());
    }

    @Test
    public void testNegate() {
        assertFraction(-1, 2, new Fraction(1, 2).negate());
        assertFraction(1, 2, new Fraction(-1, 2).negate());
        Fraction min = new Fraction(Integer.MIN_VALUE, 1);
        try {
            min.negate();
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testReciprocal() {
        assertFraction(5, 3, new Fraction(3, 5).reciprocal());
        try {
            Fraction.ZERO.reciprocal();
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testConversions() {
        Fraction f = new Fraction(3, 2);
        assertEquals(3, f.getNumerator());
        assertEquals(2, f.getDenominator());
        assertEquals(1.5, f.doubleValue(), 0.0);
        assertEquals(1.5f, f.floatValue(), 0.0f);
        assertEquals(1, f.intValue());
        assertEquals(1L, f.longValue());
    }

    @Test
    public void testCompareTo() {
        Fraction f12 = new Fraction(1, 2);
        Fraction f13 = new Fraction(1, 3);
        Fraction f26 = new Fraction(2, 4);
        assertEquals(0, f12.compareTo(f26));
        assertTrue(f13.compareTo(f12) < 0);
        assertTrue(f12.compareTo(f13) > 0);
    }

    @Test
    public void testEquals() {
        Fraction f12 = new Fraction(1, 2);
        assertTrue(f12.equals(f12));
        assertTrue(f12.equals(new Fraction(2, 4)));
        assertFalse(f12.equals(null));
        assertFalse(f12.equals(new Object()));
        assertFalse(f12.equals(new Fraction(1, 3)));
    }

    @Test
    public void testHashCode() {
        assertEquals(new Fraction(1, 2).hashCode(), new Fraction(2, 4).hashCode());
    }

    @Test
    public void testAdd() {
        assertFraction(1, 1, new Fraction(1, 2).add(new Fraction(1, 2)));
        assertFraction(5, 6, new Fraction(1, 2).add(new Fraction(1, 3)));
        Fraction f = new Fraction(2, 3);
        assertSame(f, Fraction.ZERO.add(f));
        Fraction f2 = new Fraction(3, 5);
        assertSame(f2, f2.add(Fraction.ZERO));
    }

    @Test
    public void testSubtract() {
        assertFraction(1, 6, new Fraction(1, 2).subtract(new Fraction(1, 3)));
        assertFraction(1, 4, new Fraction(3, 4).subtract(new Fraction(1, 2)));
        assertFraction(-2, 3, Fraction.ZERO.subtract(new Fraction(2, 3)));
        Fraction f = new Fraction(7, 8);
        assertSame(f, f.subtract(Fraction.ZERO));
    }

    @Test
    public void testAddSubNull() {
        try {
            new Fraction(1, 2).add(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            new Fraction(1, 2).subtract(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testMultiply() {
        assertFraction(1, 2, new Fraction(2, 3).multiply(new Fraction(3, 4)));
        assertSame(Fraction.ZERO, Fraction.ZERO.multiply(new Fraction(1, 2)));
        assertSame(Fraction.ZERO, new Fraction(1, 2).multiply(Fraction.ZERO));
    }

    @Test
    public void testMultiplyDivideNull() {
        try {
            new Fraction(1, 2).multiply(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            new Fraction(1, 2).divide(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDivide() {
        assertFraction(3, 10, new Fraction(3, 5).divide(new Fraction(2, 1)));
        try {
            new Fraction(1, 2).divide(Fraction.ZERO);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // expected
        }
    }
}