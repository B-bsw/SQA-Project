package org.apache.commons.lang.math;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class FractionTest {
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetFractionIntInt() {
        Fraction f = Fraction.getFraction(1, 2);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
        
        Fraction f2 = Fraction.getFraction(-1, 2);
        assertEquals(-1, f2.getNumerator());
        assertEquals(2, f2.getDenominator());
    }
    
    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntIntZeroDenominator() {
        Fraction.getFraction(1, 0);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntIntMinValue() {
        Fraction.getFraction(Integer.MIN_VALUE, -1);
    }
    
    @Test
    public void testGetFractionIntIntInt() {
        Fraction f = Fraction.getFraction(1, 1, 2);
        assertEquals(3, f.getNumerator());
        assertEquals(2, f.getDenominator());
        
        Fraction f2 = Fraction.getFraction(-1, 1, 2);
        assertEquals(-1, f2.getNumerator());
        assertEquals(2, f2.getDenominator());
        
        Fraction f3 = Fraction.getFraction(0, 0, 2);
        assertEquals(0, f3.getNumerator());
        assertEquals(2, f3.getDenominator());
    }
    
    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntIntIntNegativeDenominator() {
        Fraction.getFraction(1, 1, -2);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntIntIntNegativeNumerator() {
        Fraction.getFraction(1, -1, 2);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntIntIntOverflow() {
        Fraction.getFraction(Integer.MAX_VALUE, 1, 2);
    }
    
    @Test
    public void testGetReducedFraction() {
        Fraction f = Fraction.getReducedFraction(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
        
        Fraction f2 = Fraction.getReducedFraction(0, 5);
        assertSame(Fraction.ZERO, f2);
        
        Fraction f3 = Fraction.getReducedFraction(Integer.MIN_VALUE, 2);
        assertEquals(Integer.MIN_VALUE / 2, f3.getNumerator());
    }
    
    @Test
    public void testGetFractionDouble() {
        Fraction f = Fraction.getFraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
        
        Fraction f2 = Fraction.getFraction(-0.75);
        assertEquals(-3, f2.getNumerator());
        assertEquals(4, f2.getDenominator());
        
        Fraction f3 = Fraction.getFraction(1.0);
        assertEquals(1, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
    }
    
    @Test(expected = ArithmeticException.class)
    public void testGetFractionDoubleNaN() {
        Fraction.getFraction(Double.NaN);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testGetFractionDoubleTooLarge() {
        Fraction.getFraction(Double.MAX_VALUE);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testGetFractionDoubleOverflow() {
        Fraction.getFraction(100000000000000000.0);
    }
    
    @Test
    public void testGetFractionString() {
        Fraction f = Fraction.getFraction("1/2");
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
        
        Fraction f2 = Fraction.getFraction("1 1/2");
        assertEquals(3, f2.getNumerator());
        assertEquals(2, f2.getDenominator());
        
        Fraction f3 = Fraction.getFraction("3");
        assertEquals(3, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
        
        Fraction f4 = Fraction.getFraction("1.5");
        assertEquals(3, f4.getNumerator());
        assertEquals(2, f4.getDenominator());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFractionStringNull() {
        Fraction.getFraction((String) null);
    }
    
    @Test(expected = NumberFormatException.class)
    public void testGetFractionStringInvalid() {
        Fraction.getFraction("abc");
    }
    
    @Test(expected = NumberFormatException.class)
    public void testGetFractionStringInvalidFormat() {
        Fraction.getFraction("1 2");
    }
    
    @Test
    public void testGetNumerator() {
        Fraction f = Fraction.getFraction(3, 5);
        assertEquals(3, f.getNumerator());
    }
    
    @Test
    public void testGetDenominator() {
        Fraction f = Fraction.getFraction(3, 5);
        assertEquals(5, f.getDenominator());
    }
    
    @Test
    public void testGetProperNumerator() {
        Fraction f = Fraction.getFraction(3, 2);
        assertEquals(1, f.getProperNumerator());
        
        Fraction f2 = Fraction.getFraction(-3, 2);
        assertEquals(1, f2.getProperNumerator());
    }
    
    @Test
    public void testGetProperWhole() {
        Fraction f = Fraction.getFraction(3, 2);
        assertEquals(1, f.getProperWhole());
        
        Fraction f2 = Fraction.getFraction(-3, 2);
        assertEquals(-1, f2.getProperWhole());
        
        Fraction f3 = Fraction.getFraction(1, 2);
        assertEquals(0, f3.getProperWhole());
    }
    
    @Test
    public void testIntValue() {
        Fraction f = Fraction.getFraction(3, 2);
        assertEquals(1, f.intValue());
    }
    
    @Test
    public void testLongValue() {
        Fraction f = Fraction.getFraction(3, 2);
        assertEquals(1L, f.longValue());
    }
    
    @Test
    public void testFloatValue() {
        Fraction f = Fraction.getFraction(1, 2);
        assertEquals(0.5f, f.floatValue(), 0.0001);
    }
    
    @Test
    public void testDoubleValue() {
        Fraction f = Fraction.getFraction(1, 2);
        assertEquals(0.5, f.doubleValue(), 0.0001);
    }
    
    @Test
    public void testReduce() {
        Fraction f = Fraction.getFraction(2, 4);
        Fraction reduced = f.reduce();
        assertEquals(1, reduced.getNumerator());
        assertEquals(2, reduced.getDenominator());
        
        Fraction f2 = Fraction.getFraction(1, 2);
        assertSame(f2, f2.reduce());
    }
    
    @Test
    public void testInvert() throws Exception {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction inv = f.invert();
        assertEquals(3, inv.getNumerator());
        assertEquals(2, inv.getDenominator());
        
        Fraction f2 = Fraction.getFraction(-2, 3);
        Fraction inv2 = f2.invert();
        assertEquals(3, inv2.getNumerator());
        assertEquals(-2, inv2.getDenominator());
    }
    
    @Test(expected = ArithmeticException.class)
    public void testInvertZero() {
        Fraction.ZERO.invert();
    }
    
    @Test(expected = ArithmeticException.class)
    public void testInvertMinValue() {
        Fraction.getFraction(Integer.MIN_VALUE, 1).invert();
    }
    
    @Test
    public void testNegate() {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction neg = f.negate();
        assertEquals(-2, neg.getNumerator());
        
        Fraction f2 = Fraction.getFraction(-2, 3);
        Fraction neg2 = f2.negate();
        assertEquals(2, neg2.getNumerator());
    }
    
    @Test(expected = ArithmeticException.class)
    public void testNegateMinValue() {
        Fraction.getFraction(Integer.MIN_VALUE, 1).negate();
    }
    
    @Test
    public void testAbs() {
        Fraction f = Fraction.getFraction(-2, 3);
        assertEquals(2, f.abs().getNumerator());
        
        Fraction f2 = Fraction.getFraction(2, 3);
        assertSame(f2, f2.abs());
    }
    
    @Test
    public void testPow() {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction p2 = f.pow(2);
        assertEquals(4, p2.getNumerator());
        assertEquals(9, p2.getDenominator());
        
        Fraction p1 = f.pow(1);
        assertSame(f, p1);
        
        Fraction p0 = f.pow(0);
        assertSame(Fraction.ONE, p0);
        
        Fraction pneg = f.pow(-1);
        assertEquals(3, pneg.getNumerator());
        assertEquals(2, pneg.getDenominator());
    }
    
    @Test
    public void testAdd() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        Fraction sum = f1.add(f2);
        assertEquals(5, sum.getNumerator());
        assertEquals(6, sum.getDenominator());
        
        Fraction sumZero = f1.add(Fraction.ZERO);
        assertSame(f1, sumZero);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddNull() {
        Fraction.getFraction(1, 2).add((Fraction) null);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testAddOverflow() {
        Fraction.getFraction(Integer.MAX_VALUE, 1).add(Fraction.getFraction(Integer.MAX_VALUE, 1));
    }
    
    @Test
    public void testSubtract() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        Fraction diff = f1.subtract(f2);
        assertEquals(1, diff.getNumerator());
        assertEquals(6, diff.getDenominator());
        
        Fraction subZero = f1.subtract(Fraction.ZERO);
        assertSame(f1, subZero);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSubtractOverflow() {
        Fraction.getFraction(Integer.MIN_VALUE, 1).subtract(Fraction.getFraction(1, 1));
    }
    
    @Test
    public void testMultiplyBy() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(2, 3);
        Fraction prod = f1.multiplyBy(f2);
        assertEquals(1, prod.getNumerator());
        assertEquals(3, prod.getDenominator());
        
        Fraction mulZero = f1.multiplyBy(Fraction.ZERO);
        assertEquals(0, mulZero.getNumerator());
    }
    
    @Test(expected = ArithmeticException.class)
    public void testMultiplyByOverflow() {
        Fraction.getFraction(Integer.MAX_VALUE, 1).multiplyBy(Fraction.getFraction(Integer.MAX_VALUE, 1));
    }
    
    @Test
    public void testDivideBy() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(2, 3);
        Fraction quot = f1.divideBy(f2);
        assertEquals(3, quot.getNumerator());
        assertEquals(4, quot.getDenominator());
        
        Fraction divOne = f1.divideBy(Fraction.ONE);
        assertSame(f1, divOne);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Fraction.getFraction(1, 2).divideBy(Fraction.ZERO);
    }
    
    @Test
    public void testEquals() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 2);
        Fraction f3 = Fraction.getFraction(2, 4);
        
        assertTrue(f1.equals(f2));
        assertFalse(f1.equals(f3));
        assertFalse(f1.equals(null));
        assertFalse(f1.equals("string"));
        assertTrue(f1.equals(f1));
    }
    
    @Test
    public void testHashCode() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 2);
        assertEquals(f1.hashCode(), f2.hashCode());
        assertTrue(f1.hashCode() != 0);
    }
    
    @Test
    public void testCompareTo() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        Fraction f3 = Fraction.getFraction(1, 2);
        
        assertTrue(f1.compareTo(f2) > 0);
        assertTrue(f2.compareTo(f1) < 0);
        assertEquals(0, f1.compareTo(f3));
        assertEquals(0, f1.compareTo(f1));
        assertTrue(f1.compareTo(Fraction.getFraction(2, 4)) == 0);
    }
    
    @Test
    public void testToString() {
        Fraction f = Fraction.getFraction(1, 2);
        assertEquals("1/2", f.toString());
        
        Fraction f2 = Fraction.getFraction(-3, 4);
        assertEquals("-3/4", f2.toString());
        
        Fraction f3 = Fraction.getFraction(0, 2);
        assertEquals("0/2", f3.toString());
        
        String s1 = f.toString();
        String s2 = f.toString();
        assertSame(s1, s2);
    }
    
    @Test
    public void testToProperString() {
        Fraction f = Fraction.getFraction(1, 2);
        assertEquals("1/2", f.toProperString());
        
        Fraction f2 = Fraction.getFraction(3, 2);
        assertEquals("1 1/2", f2.toProperString());
        
        Fraction f3 = Fraction.getFraction(-3, 2);
        assertEquals("-1 1/2", f3.toProperString());
        
        Fraction zero = Fraction.ZERO;
        assertEquals("0", zero.toProperString());
        
        Fraction one = Fraction.ONE;
        assertEquals("1", one.toProperString());
        
        Fraction negOne = Fraction.getFraction(-1, 1);
        assertEquals("-1", negOne.toProperString());
        
        String sp1 = f.toProperString();
        String sp2 = f.toProperString();
        assertSame(sp1, sp2);
    }
    
    @Test
    public void testAddSameDenominator() {
        Fraction f1 = Fraction.getFraction(1, 6);
        Fraction f2 = Fraction.getFraction(2, 6);
        Fraction sum = f1.add(f2);
        assertEquals(1, sum.getNumerator());
        assertEquals(2, sum.getDenominator());
    }
    
    @Test
    public void testSubtractSameDenominator() {
        Fraction f1 = Fraction.getFraction(2, 6);
        Fraction f2 = Fraction.getFraction(1, 6);
        Fraction diff = f1.subtract(f2);
        assertEquals(1, diff.getNumerator());
        assertEquals(6, diff.getDenominator());
    }
    
    @Test
    public void testAddDifferentDenominatorWithGcd() {
        Fraction f1 = Fraction.getFraction(1, 6);
        Fraction f2 = Fraction.getFraction(1, 4);
        Fraction sum = f1.add(f2);
        assertEquals(5, sum.getNumerator());
        assertEquals(12, sum.getDenominator());
    }
    
    @Test
    public void testSubtractDifferentDenominatorWithGcd() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        Fraction diff = f1.subtract(f2);
        assertEquals(1, diff.getNumerator());
        assertEquals(6, diff.getDenominator());
    }
    
    @Test
    public void testToProperStringWholeNumber() {
        Fraction f = Fraction.getFraction(2, 1);
        assertEquals("2", f.toProperString());
    }
    
    @Test
    public void testToProperStringNegativeWholeNumber() {
        Fraction f = Fraction.getFraction(-2, 1);
        assertEquals("-2", f.toProperString());
    }
    
    @Test
    public void testMultiplyByReduce() {
        Fraction f1 = Fraction.getFraction(2, 3);
        Fraction f2 = Fraction.getFraction(3, 2);
        Fraction prod = f1.multiplyBy(f2);
        assertEquals(1, prod.getNumerator());
        assertEquals(1, prod.getDenominator());
    }
    
    @Test
    public void testDivideByReduce() {
        Fraction f1 = Fraction.getFraction(3, 4);
        Fraction f2 = Fraction.getFraction(3, 2);
        Fraction quot = f1.divideBy(f2);
        assertEquals(1, quot.getNumerator());
        assertEquals(2, quot.getDenominator());
    }
    
    @Test
    public void testGetProperNumeratorNegative() {
        Fraction f = Fraction.getFraction(-3, 2);
        assertEquals(1, f.getProperNumerator());
    }
    
    @Test
    public void testGetProperWholeNegative() {
        Fraction f = Fraction.getFraction(-3, 2);
        assertEquals(-1, f.getProperWhole());
    }
}