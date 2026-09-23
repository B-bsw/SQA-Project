package org.apache.commons.math3.fraction;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigInteger;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.ZeroException;

public class BigFractionTest {
    @Test
    public void testConstructorInt() {
        BigFraction f = new BigFraction(2);
        assertEquals(new BigInteger("2"), f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructorIntInt() {
        BigFraction f = new BigFraction(2, 4);
        assertEquals(new BigInteger("2"), f.getNumerator());
        assertEquals(new BigInteger("4"), f.getDenominator());
    }

    @Test(expected = ZeroException.class)
    public void testConstructorDenomZero() {
        new BigFraction(2, 0);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructorNullNum() {
        new BigFraction((BigInteger) null);
    }

    @Test
    public void testConstructorDouble() {
        BigFraction f = new BigFraction(0.5);
        assertEquals(new BigInteger("1"), f.getNumerator());
        assertEquals(new BigInteger("2"), f.getDenominator());
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoubleNaN() {
        new BigFraction(Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoubleInfinite() {
        new BigFraction(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testConstructorDoubleEpsMaxIter() {
        BigFraction f = new BigFraction(0.3333333333333333, 1e-10, 100);
        assertTrue(f.compareTo(new BigFraction(1, 3)) == 0);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleMaxIterExceeded() {
        new BigFraction(0.123456789, 1e-20, 5);
    }

    @Test
    public void testConstructorDoubleValues() {
        BigFraction f1 = new BigFraction(1.0);
        assertEquals(BigInteger.ONE, f1.getNumerator());
        assertEquals(BigInteger.ONE, f1.getDenominator());

        BigFraction f2 = new BigFraction(-2.5);
        assertEquals(new BigInteger("-5"), f2.getNumerator());
        assertEquals(new BigInteger("2"), f2.getDenominator());

        BigFraction f3 = new BigFraction(0.0);
        assertEquals(BigInteger.ZERO, f3.getNumerator());
        assertEquals(BigInteger.ONE, f3.getDenominator());
    }

    @Test
    public void testConstructorDoubleWithMaxDenominator() {
        BigFraction f = new BigFraction(3.141592653589793, 10);
        assertEquals(new BigInteger("22"), f.getNumerator());
        assertEquals(new BigInteger("7"), f.getDenominator());
    }

    @Test
    public void testGetReducedFraction() {
        BigFraction f1 = BigFraction.getReducedFraction(2, 4);
        assertEquals(1, f1.getNumeratorAsInt());
        assertEquals(2, f1.getDenominatorAsInt());

        BigFraction f2 = BigFraction.getReducedFraction(0, 5);
        assertSame(BigFraction.ZERO, f2);

        BigFraction f3 = BigFraction.getReducedFraction(-2, 4);
        assertEquals(-1, f3.getNumeratorAsInt());
        assertEquals(2, f3.getDenominatorAsInt());
    }

    @Test
    public void testAddSimpleFraction() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 3);
        BigFraction result = f1.add(f2);
        assertEquals(5, result.getNumeratorAsInt());
        assertEquals(6, result.getDenominatorAsInt());
    }

    @Test
    public void testAddSameDenominator() {
        BigFraction f1 = new BigFraction(1, 4);
        BigFraction f2 = new BigFraction(2, 4);
        BigFraction result = f1.add(f2);
        assertEquals(3, result.getNumeratorAsInt());
        assertEquals(4, result.getDenominatorAsInt());
    }

    @Test
    public void testAddZeroFraction() {
        BigFraction f1 = new BigFraction(3, 4);
        assertSame(f1, f1.add(BigFraction.ZERO));
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNullFraction() {
        new BigFraction(1, 2).add((BigFraction) null);
    }

    @Test
    public void testAddInt() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.add(1);
        assertEquals(3, result.getNumeratorAsInt());
        assertEquals(2, result.getDenominatorAsInt());
    }

    @Test
    public void testAddLong() {
        BigFraction f = new BigFraction(1, 3);
        BigFraction result = f.add(5L);
        assertEquals(16, result.getNumeratorAsInt());
        assertEquals(3, result.getDenominatorAsInt());
    }

    @Test
    public void testAddBigInteger() {
        BigFraction f = new BigFraction(1, 4);
        BigFraction result = f.add(BigInteger.valueOf(3));
        assertEquals(13, result.getNumeratorAsInt());
        assertEquals(4, result.getDenominatorAsInt());
    }

    @Test
    public void testSubtract() {
        BigFraction f1 = new BigFraction(3, 4);
        BigFraction f2 = new BigFraction(1, 4);
        BigFraction result = f1.subtract(f2);
        assertEquals(1, result.getNumeratorAsInt());
        assertEquals(2, result.getDenominatorAsInt());
    }

    @Test
    public void testSubtractInt() {
        BigFraction f = new BigFraction(3, 2);
        BigFraction result = f.subtract(1);
        assertEquals(1, result.getNumeratorAsInt());
        assertEquals(2, result.getDenominatorAsInt());
    }

    @Test
    public void testSubtractLong() {
        BigFraction f = new BigFraction(5, 2);
        BigFraction result = f.subtract(2L);
        assertEquals(1, result.getNumeratorAsInt());
        assertEquals(2, result.getDenominatorAsInt());
    }

    @Test
    public void testMultiply() {
        BigFraction f1 = new BigFraction(2, 3);
        BigFraction f2 = new BigFraction(3, 4);
        BigFraction result = f1.multiply(f2);
        assertEquals(1, result.getNumeratorAsInt());
        assertEquals(2, result.getDenominatorAsInt());
    }

    @Test
    public void testMultiplyByZero() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.multiply(BigFraction.ZERO);
        assertEquals(BigInteger.ZERO, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());
    }

    @Test
    public void testMultiplyByInt() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.multiply(3);
        assertEquals(3, result.getNumeratorAsInt());
        assertEquals(2, result.getDenominatorAsInt());
    }

    @Test
    public void testDivide() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(3, 4);
        BigFraction result = f1.divide(f2);
        assertEquals(2, result.getNumeratorAsInt());
        assertEquals(3, result.getDenominatorAsInt());
    }

    @Test
    public void testDivideByInt() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.divide(2);
        assertEquals(1, result.getNumeratorAsInt());
        assertEquals(3, result.getDenominatorAsInt());
    }

    @Test
    public void testDivideByLong() {
        BigFraction f = new BigFraction(4, 5);
        BigFraction result = f.divide(4L);
        assertEquals(1, result.getNumeratorAsInt());
        assertEquals(5, result.getDenominatorAsInt());
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideByZero() {
        new BigFraction(1, 2).divide(BigInteger.ZERO);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideByZeroFraction() {
        new BigFraction(1, 2).divide(BigFraction.ZERO);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideByNullFraction() {
        new BigFraction(1, 2).divide((BigFraction) null);
    }

    @Test
    public void testReciprocal() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.reciprocal();
        assertEquals(3, result.getNumeratorAsInt());
        assertEquals(2, result.getDenominatorAsInt());
    }

    @Test
    public void testPowNegativeExpUsingInt() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.pow(-2);
        assertEquals(9, result.getNumeratorAsInt());
        assertEquals(4, result.getDenominatorAsInt());
    }

    @Test
    public void testPowZeroExp() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.pow(0);
        assertEquals(1, result.getNumeratorAsInt());
        assertEquals(1, result.getDenominatorAsInt());
    }

    @Test
    public void testPowPositiveExp() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.pow(2);
        assertEquals(4, result.getNumeratorAsInt());
        assertEquals(9, result.getDenominatorAsInt());
    }

    @Test
    public void testPowLongExponent() {
        BigFraction f = new BigFraction(2);
        BigFraction result = f.pow(2L);
        assertEquals(new BigInteger("4"), result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());
    }

    @Test
    public void testPowBigIntegerExponent() {
        BigFraction f = new BigFraction(2);
        BigFraction result = f.pow(BigInteger.valueOf(3));
        assertEquals(new BigInteger("8"), result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());
    }

    @Test
    public void testPowDoubleExponent() {
        BigFraction f = new BigFraction(2);
        double result = f.pow(2.0);
        assertEquals(4.0, result, 1e-10);
    }

    @Test
    public void testNegate() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction negated = f.negate();
        assertEquals(-2, negated.getNumeratorAsInt());
        assertEquals(3, negated.getDenominatorAsInt());
    }

    @Test
    public void testAbsPositive() {
        BigFraction f = new BigFraction(2, 3);
        assertSame(f, f.abs());
    }

    @Test
    public void testAbsNegative() {
        BigFraction f = new BigFraction(-2, 3);
        BigFraction absF = f.abs();
        assertEquals(2, absF.getNumeratorAsInt());
        assertEquals(3, absF.getDenominatorAsInt());
    }

    @Test
    public void testCompareTo() {
        BigFraction f1 = new BigFraction(1, 3);
        BigFraction f2 = new BigFraction(1, 2);
        assertTrue(f1.compareTo(f2) < 0);
        assertTrue(f2.compareTo(f1) > 0);
        assertEquals(0, f1.compareTo(new BigFraction(2, 6)));
    }

    @Test
    public void testEqualsAndHashCode() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 4);
        assertTrue(f1.equals(f2));
        assertEquals(f1.hashCode(), f2.hashCode());
        assertFalse(f1.equals(null));
        assertFalse(f1.equals("1/2"));
        assertTrue(f1.equals(f1));
        BigFraction f3 = new BigFraction(1, 3);
        assertFalse(f1.equals(f3));
    }

    @Test
    public void testDoubleValue() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(0.5, f.doubleValue(), 1e-10);
    }

    @Test
    public void testFloatValue() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(0.5f, f.floatValue(), 1e-5f);
    }

    @Test
    public void testIntValue() {
        BigFraction f = new BigFraction(7, 2);
        assertEquals(3, f.intValue());
    }

    @Test
    public void testLongValue() {
        BigFraction f = new BigFraction(9, 2);
        assertEquals(4L, f.longValue());
    }

    @Test
    public void testBigDecimalValue() {
        BigFraction f = new BigFraction(1, 4);
        assertEquals(new java.math.BigDecimal("0.25"), f.bigDecimalValue());
    }

    @Test
    public void testBigDecimalValueRoundingMode() {
        BigFraction f = new BigFraction(1, 3);
        assertEquals(new java.math.BigDecimal("0.3"), f.bigDecimalValue(java.math.BigDecimal.ROUND_HALF_UP));
    }

    @Test
    public void testBigDecimalValueScaleRoundingMode() {
        BigFraction f = new BigFraction(1, 3);
        assertEquals(new java.math.BigDecimal("0.333"), f.bigDecimalValue(3, java.math.BigDecimal.ROUND_HALF_UP));
    }

    @Test
    public void testStringValue() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals("1 / 2", f.toString());
    }

    @Test
    public void testStringValueIntegerDenominator() {
        BigFraction f = new BigFraction(3);
        assertEquals("3", f.toString());
    }

    @Test
    public void testStringValueZeroNumerator() {
        BigFraction f = new BigFraction(0);
        assertEquals("0", f.toString());
    }

    @Test
    public void testGetters() {
        BigFraction f = new BigFraction(5, 7);
        assertEquals(BigInteger.valueOf(5), f.getNumerator());
        assertEquals(BigInteger.valueOf(7), f.getDenominator());
        assertEquals(5, f.getNumeratorAsInt());
        assertEquals(7, f.getDenominatorAsInt());
        assertEquals(5L, f.getNumeratorAsLong());
        assertEquals(7L, f.getDenominatorAsLong());
    }

    @Test
    public void testPercentageValue() {
        BigFraction f = new BigFraction(1, 4);
        assertEquals(25.0, f.percentageValue(), 1e-10);
    }

    @Test
    public void testGetField() {
        assertNotNull(BigFractionField.getInstance());
    }
}