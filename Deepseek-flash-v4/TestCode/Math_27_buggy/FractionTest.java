package org.apache.commons.math3.fraction;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;

public class FractionTest {
    private Fraction fraction;
    private Fraction fraction2;
    private Fraction fraction3;
    private Fraction fraction4;
    private Fraction fraction5;
    private Fraction fraction6;
    private Fraction fraction7;
    private Fraction fraction8;
    private Fraction fraction9;
    private Fraction fraction10;
    private Fraction fraction11;
    private Fraction fraction12;
    private Fraction fraction13;
    private Fraction fraction14;
    private Fraction fraction15;
    private Fraction fraction16;
    private Fraction fraction17;
    private Fraction fraction18;
    private Fraction fraction19;
    private Fraction fraction20;
    private Fraction fraction21;
    private Fraction fraction22;
    private Fraction fraction23;
    private Fraction fraction24;
    private Fraction fraction25;
    private Fraction fraction26;
    private Fraction fraction27;
    private Fraction fraction28;
    private Fraction fraction29;
    private Fraction fraction30;
    private Fraction fraction31;
    private Fraction fraction32;
    private Fraction fraction33;
    private Fraction fraction34;
    private Fraction fraction35;
    private Fraction fraction36;
    private Fraction fraction37;
    private Fraction fraction38;
    private Fraction fraction39;
    private Fraction fraction40;
    private Fraction fraction41;
    private Fraction fraction42;
    private Fraction fraction43;
    private Fraction fraction44;
    private Fraction fraction45;
    private Fraction fraction46;
    private Fraction fraction47;
    private Fraction fraction48;
    private Fraction fraction49;
    private Fraction fraction50;

    @Before
    public void setUp() {
        fraction = new Fraction(1, 2);
        fraction2 = new Fraction(1, 3);
        fraction3 = new Fraction(2, 3);
        fraction4 = new Fraction(-1, 2);
        fraction5 = new Fraction(0, 1);
        fraction6 = new Fraction(1, 1);
        fraction7 = new Fraction(2, 1);
        fraction8 = new Fraction(3, 2);
        fraction9 = new Fraction(5, 3);
        fraction10 = new Fraction(4, 5);
        fraction11 = new Fraction(1, 5);
        fraction12 = new Fraction(3, 5);
        fraction13 = new Fraction(2, 5);
        fraction14 = new Fraction(1, 4);
        fraction15 = new Fraction(3, 4);
        fraction16 = new Fraction(1, 6);
        fraction17 = new Fraction(5, 6);
        fraction18 = new Fraction(1, 8);
        fraction19 = new Fraction(3, 8);
        fraction20 = new Fraction(5, 8);
        fraction21 = new Fraction(7, 8);
        fraction22 = new Fraction(1, 10);
        fraction23 = new Fraction(3, 10);
        fraction24 = new Fraction(7, 10);
        fraction25 = new Fraction(9, 10);
        fraction26 = new Fraction(2, 7);
        fraction27 = new Fraction(4, 7);
        fraction28 = new Fraction(6, 7);
        fraction29 = new Fraction(1, 9);
        fraction30 = new Fraction(4, 9);
        fraction31 = new Fraction(7, 9);
        fraction32 = new Fraction(8, 9);
        fraction33 = new Fraction(1, 12);
        fraction34 = new Fraction(5, 12);
        fraction35 = new Fraction(11, 12);
        fraction36 = new Fraction(Integer.MIN_VALUE, 1);
        fraction37 = new Fraction(1, Integer.MIN_VALUE);
        fraction38 = new Fraction(Integer.MIN_VALUE + 1, -1);
        fraction39 = new Fraction(0, -5);
        fraction40 = new Fraction(-2, -3);
        fraction41 = new Fraction(2147483647, 1);
        fraction42 = new Fraction(1, 2147483647);
        fraction43 = new Fraction(1, -2147483647);
        fraction44 = new Fraction(-2147483647, -1);
        fraction45 = new Fraction(2147483646, 2147483647);
        fraction46 = new Fraction(3, 3);
        fraction47 = new Fraction(-3, 3);
        fraction48 = new Fraction(3, -3);
        fraction49 = new Fraction(-3, -3);
        fraction50 = new Fraction(2, 4);
    }

    @After
    public void tearDown() {
        fraction = null;
        fraction2 = null;
        fraction3 = null;
        fraction4 = null;
        fraction5 = null;
        fraction6 = null;
        fraction7 = null;
        fraction8 = null;
        fraction9 = null;
        fraction10 = null;
        fraction11 = null;
        fraction12 = null;
        fraction13 = null;
        fraction14 = null;
        fraction15 = null;
        fraction16 = null;
        fraction17 = null;
        fraction18 = null;
        fraction19 = null;
        fraction20 = null;
        fraction21 = null;
        fraction22 = null;
        fraction23 = null;
        fraction24 = null;
        fraction25 = null;
        fraction26 = null;
        fraction27 = null;
        fraction28 = null;
        fraction29 = null;
        fraction30 = null;
        fraction31 = null;
        fraction32 = null;
        fraction33 = null;
        fraction34 = null;
        fraction35 = null;
        fraction36 = null;
        fraction37 = null;
        fraction38 = null;
        fraction39 = null;
        fraction40 = null;
        fraction41 = null;
        fraction42 = null;
        fraction43 = null;
        fraction44 = null;
        fraction45 = null;
        fraction46 = null;
        fraction47 = null;
        fraction48 = null;
        fraction49 = null;
        fraction50 = null;
    }

    @Test
    public void testConstructorDouble() throws FractionConversionException {
        Fraction f = new Fraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorDoubleWithEpsilon() throws FractionConversionException {
        Fraction f = new Fraction(0.5, 1.0e-10, 100);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorDoubleMaxDenominator() throws FractionConversionException {
        Fraction f = new Fraction(0.5, 5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleMaxIterations() throws FractionConversionException {
        new Fraction(3.14159, 1.0e-10, 3);
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
        }
    }

    @Test
    public void testConstructorIntIntNegativeNumerator() {
        Fraction f = new Fraction(-2, 3);
        assertEquals(-2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntNegativeDenominator() {
        Fraction f = new Fraction(2, -3);
        assertEquals(-2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntBothNegative() {
        Fraction f = new Fraction(-2, -3);
        assertEquals(2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntMinValue() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        assertEquals(Integer.MIN_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntDenominatorMinValue() {
        Fraction f = new Fraction(1, Integer.MIN_VALUE);
        assertEquals(1, f.getNumerator());
        assertEquals(Integer.MIN_VALUE, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntNumeratorMinValueDenominatorMinusOne() {
        Fraction f = new Fraction(Integer.MIN_VALUE, -1);
        assertEquals(Integer.MIN_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testAbs() {
        assertEquals(new Fraction(1, 2), fraction.abs());
        assertEquals(new Fraction(1, 2), fraction4.abs());
    }

    @Test
    public void testAbsMinValue() {
        assertEquals(new Fraction(2147483647L, 1), fraction36.abs());
    }

    @Test
    public void testCompareTo() {
        assertTrue(fraction.compareTo(fraction2) > 0);
        assertTrue(fraction2.compareTo(fraction) < 0);
        assertEquals(0, fraction.compareTo(new Fraction(1, 2)));
    }

    @Test
    public void testDoubleValue() {
        assertEquals(0.5, fraction.doubleValue(), 1e-10);
    }

    @Test
    public void testEqualsAndHashCode() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction(2, 3);
        Fraction f4 = new Fraction(1, 2);

        assertEquals(f1, f1);
        assertEquals(f1, f2);
        assertNotEquals(f1, f3);
        assertNotEquals(f1, null);
        assertNotEquals(f1, "1/2");
        assertEquals(f1.hashCode(), f2.hashCode());
        assertEquals(f1.hashCode(), f4.hashCode());
        assertNotEquals(f1.hashCode(), f3.hashCode());
    }

    @Test
    public void testFloatValue() {
        assertEquals(0.5f, fraction.floatValue(), 1e-10f);
    }

    @Test
    public void testGetDenominator() {
        assertEquals(2, fraction.getDenominator());
        assertEquals(3, fraction2.getDenominator());
    }

    @Test
    public void testGetNumerator() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction2.getNumerator());
    }

    @Test
    public void testIntValue() {
        assertEquals(0, fraction.intValue());
        assertEquals(1, fraction6.intValue());
        assertEquals(-1, fraction4.intValue());
    }

    @Test
    public void testLongValue() {
        assertEquals(0L, fraction.longValue());
        assertEquals(1L, fraction6.longValue());
        assertEquals(-1L, fraction4.longValue());
    }

    @Test
    public void testNegate() {
        assertEquals(new Fraction(-1, 2), fraction.negate());
        assertEquals(new Fraction(1, 2), fraction4.negate());
    }

    @Test
    public void testNegateMinValue() {
        try {
            fraction36.negate();
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
        }
    }

    @Test
    public void testReciprocal() {
        assertEquals(new Fraction(2, 1), fraction.reciprocal());
        assertEquals(new Fraction(3, 1), fraction2.reciprocal());
    }

    @Test
    public void testAdd() {
        assertEquals(new Fraction(5, 6), fraction.add(fraction2));
        assertEquals(new Fraction(2, 3), fraction.add(new Fraction(1, 6)));
        assertEquals(new Fraction(0), fraction.add(new Fraction(-1, 2)));
    }

    @Test
    public void testAddInt() {
        assertEquals(new Fraction(3, 2), fraction.add(1));
        assertEquals(new Fraction(-1, 2), fraction.add(-1));
    }

    @Test
    public void testAddNull() {
        try {
            fraction.add((Fraction) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
        }
    }

    @Test
    public void testAddOverflow() {
        try {
            fraction41.add(fraction41);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
        }
    }

    @Test
    public void testSubtract() {
        assertEquals(new Fraction(1, 6), fraction.subtract(fraction2));
        assertEquals(new Fraction(-1, 6), fraction2.subtract(fraction));
        assertEquals(new Fraction(0), fraction.subtract(fraction));
    }

    @Test
    public void testSubtractInt() {
        assertEquals(new Fraction(-1, 2), fraction.subtract(1));
        assertEquals(new Fraction(3, 2), fraction.subtract(-1));
    }

    @Test
    public void testSubtractNull() {
        try {
            fraction.subtract((Fraction) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
        }
    }

    @Test
    public void testMultiply() {
        assertEquals(new Fraction(1, 6), fraction.multiply(fraction2));
        assertEquals(new Fraction(1, 4), fraction.multiply(fraction));
        assertEquals(Fraction.ZERO, fraction.multiply(fraction5));
    }

    @Test
    public void testMultiplyInt() {
        assertEquals(new Fraction(5, 2), fraction.multiply(5));
        assertEquals(new Fraction(-5, 2), fraction.multiply(-5));
    }

    @Test
    public void testDivide() {
        assertEquals(new Fraction(3, 2), fraction.divide(fraction2));
        assertEquals(new Fraction(1), fraction.divide(fraction));
    }

    @Test
    public void testDivideInt() {
        assertEquals(new Fraction(1, 6), fraction.divide(3));
        assertEquals(new Fraction(-1, 6), fraction.divide(-3));
    }

    @Test
    public void testDivideByZero() {
        try {
            fraction.divide(Fraction.ZERO);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
        }
    }

    @Test
    public void testGetReducedFraction() {
        assertEquals(new Fraction(1, 2), Fraction.getReducedFraction(2, 4));
        assertEquals(new Fraction(0), Fraction.getReducedFraction(0, 5));
        assertEquals(new Fraction(1), Fraction.getReducedFraction(2, 2));
        assertEquals(new Fraction(-1, 2), Fraction.getReducedFraction(-2, 4));
    }

    @Test
    public void testGetReducedFractionZeroDenominator() {
        try {
            Fraction.getReducedFraction(1, 0);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
        }
    }

    @Test
    public void testGetReducedFractionMinValue() {
        Fraction f = Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
        assertEquals(Integer.MIN_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testPercentageValue() {
        assertEquals(50.0, fraction.percentageValue(), 1e-10);
        assertEquals(33.33333333333333, fraction2.percentageValue(), 1e-10);
    }

    @Test
    public void testToString() {
        assertEquals("1 / 2", fraction.toString());
        assertEquals("1", fraction6.toString());
        assertEquals("5", new Fraction(5).toString());
        assertEquals("-1 / 2", fraction4.toString());
        assertEquals("0", fraction5.toString());
    }

    @Test
    public void testGetField() {
        assertNotNull(fraction.getField());
        assertEquals(FractionField.getInstance(), fraction.getField());
    }

    @Test
    public void testSerializable() throws Exception {
        Fraction f1 = new Fraction(1, 3);
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(bos);
        oos.writeObject(f1);
        oos.flush();
        oos.close();
        java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(bos.toByteArray());
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bis);
        Fraction f2 = (Fraction) ois.readObject();
        assertEquals(f1, f2);
    }

    @Test
    public void testConstants() {
        assertEquals(new Fraction(2, 1), Fraction.TWO);
        assertEquals(new Fraction(1, 1), Fraction.ONE);
        assertEquals(new Fraction(0, 1), Fraction.ZERO);
        assertEquals(new Fraction(4, 5), Fraction.FOUR_FIFTHS);
        assertEquals(new Fraction(1, 5), Fraction.ONE_FIFTH);
        assertEquals(new Fraction(1, 2), Fraction.ONE_HALF);
        assertEquals(new Fraction(1, 4), Fraction.ONE_QUARTER);
        assertEquals(new Fraction(1, 3), Fraction.ONE_THIRD);
        assertEquals(new Fraction(3, 5), Fraction.THREE_FIFTHS);
        assertEquals(new Fraction(3, 4), Fraction.THREE_QUARTERS);
        assertEquals(new Fraction(2, 5), Fraction.TWO_FIFTHS);
        assertEquals(new Fraction(2, 4), Fraction.TWO_QUARTERS);
        assertEquals(new Fraction(2, 3), Fraction.TWO_THIRDS);
        assertEquals(new Fraction(-1, 1), Fraction.MINUS_ONE);
    }

    @Test
    public void testZeroDenominatorConstructor() {
        try {
            new Fraction(1, 0);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
        }
    }
}