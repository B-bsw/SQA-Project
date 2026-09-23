package org.apache.commons.math3.fraction;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class FractionTest {
    
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
    
    @Test(expected = MathArithmeticException.class)
    public void testConstructorZeroDenominator() {
        new Fraction(1, 0);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testConstructorMinValue() {
        new Fraction(Integer.MIN_VALUE, -1);
    }
    
    @Test
    public void testConstructorNegativeDenominator() {
        Fraction f = new Fraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }
    
    @Test
    public void testConstructorDouble() throws FractionConversionException {
        Fraction f = new Fraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }
    
    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleNonConvergent() throws FractionConversionException {
        new Fraction(Math.PI, 1.0e-20, 1);
    }
    
    @Test
    public void testAdd() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction result = f1.add(f2);
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }
    
    @Test
    public void testAddInteger() {
        Fraction f = new Fraction(1, 2);
        Fraction result = f.add(1);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }
    
    @Test(expected = NullArgumentException.class)
    public void testAddNull() {
        new Fraction(1, 2).add((Fraction) null);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAddOverflow() {
        new Fraction(Integer.MAX_VALUE, 1).add(new Fraction(1, 1));
    }
    
    @Test
    public void testSubtract() {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(1, 4);
        Fraction result = f1.subtract(f2);
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }
    
    @Test
    public void testSubtractInteger() {
        Fraction f = new Fraction(3, 2);
        Fraction result = f.subtract(1);
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }
    
    @Test(expected = NullArgumentException.class)
    public void testSubtractNull() {
        new Fraction(1, 2).subtract((Fraction) null);
    }
    
    @Test
    public void testMultiply() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);
        Fraction result = f1.multiply(f2);
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }
    
    @Test
    public void testMultiplyZero() {
        Fraction f = new Fraction(0, 1);
        Fraction result = f.multiply(new Fraction(5, 6));
        assertSame(Fraction.ZERO, result);
    }
    
    @Test
    public void testMultiplyInteger() {
        Fraction f = new Fraction(1, 2);
        Fraction result = f.multiply(2);
        assertEquals(1, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }
    
    @Test(expected = NullArgumentException.class)
    public void testMultiplyNull() {
        new Fraction(1, 2).multiply((Fraction) null);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiplyOverflow() {
        new Fraction(Integer.MAX_VALUE, 1).multiply(new Fraction(2, 1));
    }
    
    @Test
    public void testDivide() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction result = f1.divide(f2);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }
    
    @Test
    public void testDivideInteger() {
        Fraction f = new Fraction(1, 2);
        Fraction result = f.divide(2);
        assertEquals(1, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }
    
    @Test(expected = NullArgumentException.class)
    public void testDivideNull() {
        new Fraction(1, 2).divide((Fraction) null);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testDivideByZero() {
        Fraction.ZERO.divide(new Fraction(1, 2));
    }
    
    @Test
    public void testReciprocal() {
        Fraction f = new Fraction(2, 3);
        Fraction result = f.reciprocal();
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }
    
    @Test
    public void testNegate() {
        Fraction f = new Fraction(2, 3);
        Fraction result = f.negate();
        assertEquals(-2, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }
    
    @Test
    public void testAbs() {
        Fraction f = new Fraction(-2, 3);
        Fraction result = f.abs();
        assertEquals(2, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }
    
    @Test
    public void testDoubleValue() {
        assertEquals(0.5, new Fraction(1, 2).doubleValue(), 1e-15);
    }
    
    @Test
    public void testFloatValue() {
        assertEquals(0.5f, new Fraction(1, 2).floatValue(), 1e-15f);
    }
    
    @Test
    public void testIntValue() {
        assertEquals(1, new Fraction(3, 2).intValue());
    }
    
    @Test
    public void testLongValue() {
        assertEquals(1L, new Fraction(3, 2).longValue());
    }
    
    @Test
    public void testPercentageValue() {
        assertEquals(50.0, new Fraction(1, 2).percentageValue(), 1e-15);
    }
    
    @Test
    public void testToString() {
        assertEquals("1 / 2", new Fraction(1, 2).toString());
        assertEquals("1 / 1", new Fraction(1, 1).toString());
        assertEquals("0 / 1", new Fraction(0, 1).toString());
    }
    
    @Test
    public void testEquals() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(1, 3);
        assertTrue(f1.equals(f2));
        assertFalse(f1.equals(f3));
        assertFalse(f1.equals(null));
        assertFalse(f1.equals("Not a fraction"));
    }
    
    @Test
    public void testHashCode() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        assertEquals(f1.hashCode(), f2.hashCode());
    }
    
    @Test
    public void testCompareTo() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction f3 = new Fraction(1, 2);
        assertEquals(1, f1.compareTo(f2));
        assertEquals(-1, f2.compareTo(f1));
        assertEquals(0, f1.compareTo(f3));
    }
    
    @Test
    public void testGetReducedFraction() {
        Fraction f = Fraction.getReducedFraction(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFractionZeroDenominator() {
        Fraction.getReducedFraction(1, 0);
    }
    
    @Test
    public void testGetReducedFractionNegative() {
        Fraction f = Fraction.getReducedFraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }
    
    @Test
    public void testGetReducedFractionMinValue() {
        Fraction f = Fraction.getReducedFraction(Integer.MIN_VALUE, 2);
        assertEquals(Integer.MIN_VALUE / 2, f.getNumerator());
    }
    
    @Test
    public void testGetField() {
        assertNotNull(new Fraction(1, 2).getField());
    }
    
    @Test
    public void testConstants() {
        assertEquals(2, Fraction.TWO.getNumerator());
        assertEquals(1, Fraction.TWO.getDenominator());
        assertEquals(0, Fraction.ZERO.getNumerator());
        assertNotNull(Fraction.ONE);
        assertNotNull(Fraction.FOUR_FIFTHS);
        assertNotNull(Fraction.ONE_FIFTH);
        assertNotNull(Fraction.ONE_HALF);
        assertNotNull(Fraction.ONE_QUARTER);
        assertNotNull(Fraction.ONE_THIRD);
        assertNotNull(Fraction.THREE_FIFTHS);
        assertNotNull(Fraction.THREE_QUARTERS);
        assertNotNull(Fraction.TWO_FIFTHS);
        assertNotNull(Fraction.TWO_QUARTERS);
        assertNotNull(Fraction.TWO_THIRDS);
        assertNotNull(Fraction.MINUS_ONE);
    }
    
    @Test
    public void testGetNumeratorDenominator() {
        Fraction f = new Fraction(3, 4);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }
    
    @Test
    public void testSubtractResultingZero() {
        Fraction f = new Fraction(1, 2);
        Fraction result = f.subtract(f);
        assertEquals(0, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAddOverflowNegative() {
        new Fraction(Integer.MIN_VALUE, 1).add(new Fraction(-1, 1));
    }
    
    @Test
    public void testMultiplyByOne() {
        Fraction f = new Fraction(2, 3);
        assertEquals(f, f.multiply(Fraction.ONE));
    }
}