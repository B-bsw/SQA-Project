package org.apache.commons.lang3.math;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class FractionTest {
    private Fraction fraction;

    @Before
    public void setUp() {
        fraction = new Fraction(3, 4);
    }

    @After
    public void tearDown() {
        fraction = null;
    }

    @Test
    public void testGetFractionIntInt_NormalCase() {
        Fraction f = Fraction.getFraction(2, 3);
        assertEquals(2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntInt_ZeroDenominator() {
        Fraction.getFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntInt_MinValueOverflow() {
        Fraction.getFraction(Integer.MIN_VALUE, -1);
    }

    @Test
    public void testGetFractionIntInt_NegativeDenominator() {
        Fraction f = Fraction.getFraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFractionThreeArg_NormalCase() {
        Fraction f = Fraction.getFraction(2, 1, 3);
        assertEquals(7, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionThreeArg_NegativeDenominator() {
        Fraction.getFraction(1, 1, -2);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionThreeArg_NegativeNumerator() {
        Fraction.getFraction(1, -1, 2);
    }

    @Test
    public void testGetReducedFraction_Zero() {
        assertSame(Fraction.ZERO, Fraction.getReducedFraction(0, 5));
    }

    @Test
    public void testGetReducedFraction_MinValueEven() {
        Fraction f = Fraction.getReducedFraction(Integer.MIN_VALUE, 2);
        assertEquals(-1073741824, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testGetFractionDouble_WholeNumber() {
        Fraction f = Fraction.getFraction(2.0);
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionDouble_TooLarge() {
        Fraction.getFraction((double) Integer.MAX_VALUE + 10);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionDouble_NaN() {
        Fraction.getFraction(Double.NaN);
    }

    @Test
    public void testGetFractionString_Null() {
        try {
            Fraction.getFraction((String) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testGetFractionString_Decimal() {
        Fraction f = Fraction.getFraction("1.5");
        assertEquals(3, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFractionString_WholeAndFraction() {
        Fraction f = Fraction.getFraction("2 1/3");
        assertEquals(7, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testGetFractionString_SimpleFraction() {
        Fraction f = Fraction.getFraction("3/4");
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFractionString_InvalidFormat() {
        Fraction.getFraction("1/0/2");
    }

    @Test
    public void testGetNumerator() {
        assertEquals(3, fraction.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    public void testGetProperNumerator() {
        Fraction f = new Fraction(7, 4);
        assertEquals(3, f.getProperNumerator());
    }

    @Test
    public void testGetProperWhole() {
        Fraction f = new Fraction(7, 4);
        assertEquals(1, f.getProperWhole());
    }

    @Test
    public void testIntValue() {
        Fraction f = new Fraction(7, 4);
        assertEquals(1, f.intValue());
    }

    @Test
    public void testLongValue() {
        Fraction f = new Fraction(7, 4);
        assertEquals(1L, f.longValue());
    }

    @Test
    public void testFloatValue() {
        Fraction f = new Fraction(1, 2);
        assertEquals(0.5f, f.floatValue(), 0.001);
    }

    @Test
    public void testDoubleValue() {
        Fraction f = new Fraction(1, 2);
        assertEquals(0.5, f.doubleValue(), 0.001);
    }

    @Test
    public void testReduce_AlreadyReduced() {
        Fraction f = new Fraction(3, 4);
        assertSame(f, f.reduce());
    }

    @Test
    public void testReduce_NeedsReduction() {
        Fraction f = new Fraction(2, 4);
        Fraction result = f.reduce();
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testInvert_Zero() {
        Fraction.ZERO.invert();
    }

    @Test
    public void testInvert_Normal() {
        Fraction f = new Fraction(3, 4);
        Fraction result = f.invert();
        assertEquals(4, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testInvert_MinValue() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        f.invert();
    }

    @Test
    public void testNegate_Normal() {
        Fraction f = new Fraction(3, 4);
        Fraction result = f.negate();
        assertEquals(-3, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test
    public void testAbs_Positive() {
        Fraction f = new Fraction(3, 4);
        assertSame(f, f.abs());
    }

    @Test
    public void testAbs_Negative() {
        Fraction f = new Fraction(-3, 4);
        Fraction result = f.abs();
        assertEquals(3, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test
    public void testPow_Zero() {
        assertEquals(Fraction.ONE, fraction.pow(0));
    }

    @Test
    public void testPow_One() {
        assertSame(fraction, fraction.pow(1));
    }

    @Test
    public void testPow_Positive() {
        Fraction f = new Fraction(2, 3);
        Fraction result = f.pow(2);
        assertEquals(4, result.getNumerator());
        assertEquals(9, result.getDenominator());
    }

    @Test
    public void testPow_Negative() {
        Fraction f = new Fraction(2, 3);
        Fraction result = f.pow(-1);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    public void testMultiplyBy_ZeroNumerator() {
        Fraction f = new Fraction(0, 4);
        Fraction result = fraction.multiplyBy(f);
        assertEquals(0, result.getNumerator());
    }

    @Test
    public void testMultiplyBy_Normal() {
        Fraction f = new Fraction(2, 3);
        Fraction result = fraction.multiplyBy(f);
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideBy_Zero() {
        fraction.divideBy(Fraction.ZERO);
    }

    @Test
    public void testDivideBy_Normal() {
        Fraction f = new Fraction(2, 3);
        Fraction result = fraction.divideBy(f);
        assertEquals(9, result.getNumerator());
        assertEquals(8, result.getDenominator());
    }

    @Test
    public void testEquals_SameObject() {
        assertTrue(fraction.equals(fraction));
    }

    @Test
    public void testEquals_Null() {
        assertFalse(fraction.equals(null));
    }

    @Test
    public void testEquals_NotFraction() {
        assertFalse(fraction.equals("test"));
    }

    @Test
    public void testEquals_Different() {
        Fraction other = new Fraction(3, 5);
        assertFalse(fraction.equals(other));
    }

    @Test
    public void testEquals_Same() {
        Fraction other = new Fraction(3, 4);
        assertTrue(fraction.equals(other));
    }

    @Test
    public void testHashCode_Consistent() {
        Fraction f = new Fraction(3, 4);
        assertEquals(f.hashCode(), fraction.hashCode());
    }

    @Test
    public void testCompareTo_Same() {
        Fraction other = new Fraction(3, 4);
        assertEquals(0, fraction.compareTo(other));
    }

    @Test
    public void testCompareTo_LessThan() {
        Fraction other = new Fraction(1, 2);
        assertEquals(1, fraction.compareTo(other));
    }

    @Test
    public void testCompareTo_GreaterThan() {
        Fraction other = new Fraction(1, 2);
        assertEquals(-1, new Fraction(1, 2).compareTo(fraction));
    }

    @Test
    public void testToString() {
        assertEquals("3/4", fraction.toString());
    }

    @Test
    public void testToProperString_Zero() {
        Fraction f = Fraction.ZERO;
        assertEquals("0", f.toProperString());
    }

    @Test
    public void testToProperString_One() {
        Fraction f = new Fraction(4, 4);
        assertEquals("1", f.toProperString());
    }

    @Test
    public void testToProperString_NegativeOne() {
        Fraction f = new Fraction(-4, 4);
        assertEquals("-1", f.toProperString());
    }

    @Test
    public void testToProperString_WholeNumber() {
        Fraction f = new Fraction(7, 4);
        assertEquals("1 3/4", f.toProperString());
    }

    @Test
    public void testToProperString_ProperFraction() {
        Fraction f = new Fraction(3, 4);
        assertEquals("3/4", f.toProperString());
    }

    @Test(expected = ArithmeticException.class)
    public void testAddSub_NullFraction() {
        fraction.add(null);
    }

    @Test
    public void testAdd_Zero() {
        assertEquals(fraction, fraction.add(Fraction.ZERO));
    }

    @Test
    public void testAdd_Normal() {
        Fraction f = new Fraction(1, 4);
        Fraction result = fraction.add(f);
        assertEquals(1, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @Test
    public void testSubtract_Normal() {
        Fraction f = new Fraction(1, 4);
        Fraction result = fraction.subtract(f);
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    public void testSubtract_Zero() {
        Fraction f = new Fraction(0, 1);
        Fraction result = fraction.subtract(f);
        assertEquals(3, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testAdd_Overflow() {
        Fraction f = new Fraction(Integer.MAX_VALUE, 1);
        f.add(f);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubtract_Overflow() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        f.subtract(new Fraction(1, 1));
    }
}