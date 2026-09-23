package org.apache.commons.math.fraction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.ZeroException;
import org.junit.Test;

public class BigFractionTest {

    @Test
    public void testConstants() {
        assertEquals(BigInteger.ONE, BigFraction.ONE.getNumerator());
        assertEquals(BigInteger.ONE, BigFraction.ONE.getDenominator());
        assertEquals(BigInteger.ZERO, BigFraction.ZERO.getNumerator());
        assertEquals(BigInteger.ONE, BigFraction.ZERO.getDenominator());
        assertEquals(BigInteger.valueOf(-1), BigFraction.MINUS_ONE.getNumerator());
        assertEquals(BigInteger.valueOf(4), BigFraction.FOUR_FIFTHS.getNumerator());
        assertEquals(BigInteger.valueOf(5), BigFraction.FOUR_FIFTHS.getDenominator());
    }

    @Test
    public void testConstructorBigInteger() {
        BigFraction bf = new BigFraction(BigInteger.valueOf(5));
        assertEquals(BigInteger.valueOf(5), bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());

        bf = new BigFraction(BigInteger.ZERO);
        assertEquals(BigInteger.ZERO, bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());

        bf = new BigFraction(BigInteger.valueOf(-3));
        assertEquals(BigInteger.valueOf(-3), bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testConstructorBigIntegerBigInteger() {
        BigFraction bf = new BigFraction(BigInteger.valueOf(2), BigInteger.valueOf(4));
        assertEquals(BigInteger.valueOf(1), bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());

        bf = new BigFraction(BigInteger.valueOf(-2), BigInteger.valueOf(4));
        assertEquals(BigInteger.valueOf(-1), bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());

        bf = new BigFraction(BigInteger.valueOf(2), BigInteger.valueOf(-4));
        assertEquals(BigInteger.valueOf(-1), bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());

        bf = new BigFraction(BigInteger.valueOf(-2), BigInteger.valueOf(-4));
        assertEquals(BigInteger.valueOf(1), bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());

        bf = new BigFraction(BigInteger.ZERO, BigInteger.valueOf(5));
        assertEquals(BigInteger.ZERO, bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());

        bf = new BigFraction(BigInteger.valueOf(6), BigInteger.valueOf(6));
        assertEquals(BigInteger.ONE, bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testConstructorBigIntegerBigIntegerNull() {
        assertThrows(NullArgumentException.class, () -> new BigFraction(null, BigInteger.ONE));
        assertThrows(NullArgumentException.class, () -> new BigFraction(BigInteger.ONE, null));
    }

    @Test
    public void testConstructorBigIntegerBigIntegerZeroDen() {
        assertThrows(ZeroException.class, () -> new BigFraction(BigInteger.ONE, BigInteger.ZERO));
    }

    @Test
    public void testConstructorDouble() {
        BigFraction bf = new BigFraction(0.5);
        assertEquals(BigInteger.ONE, bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());

        bf = new BigFraction(-0.25);
        assertEquals(BigInteger.valueOf(-1), bf.getNumerator());
        assertEquals(BigInteger.valueOf(4), bf.getDenominator());

        bf = new BigFraction(2.0);
        assertEquals(BigInteger.valueOf(2), bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());

        bf = new BigFraction(0.0);
        assertEquals(BigInteger.ZERO, bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testConstructorDoubleNaN() {
        assertThrows(MathIllegalArgumentException.class, () -> new BigFraction(Double.NaN));
    }

    @Test
    public void testConstructorDoubleInfinite() {
        assertThrows(MathIllegalArgumentException.class, () -> new BigFraction(Double.POSITIVE_INFINITY));
        assertThrows(MathIllegalArgumentException.class, () -> new BigFraction(Double.NEGATIVE_INFINITY));
    }

    @Test
    public void testConstructorDoubleEpsilonMaxIterations() {
        BigFraction bf = new BigFraction(0.3333333333, 0.000001, 100);
        assertEquals(BigInteger.valueOf(1), bf.getNumerator());
        assertEquals(BigInteger.valueOf(3), bf.getDenominator());

        assertThrows(FractionConversionException.class, () -> new BigFraction(0.3333333333, 0.0, 2));
    }

    @Test
    public void testConstructorDoubleMaxDenominator() {
        BigFraction bf = new BigFraction(0.5, 10);
        assertEquals(BigInteger.ONE, bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());

        bf = new BigFraction(0.333333, 100);
        assertEquals(BigInteger.valueOf(1), bf.getNumerator());
        assertEquals(BigInteger.valueOf(3), bf.getDenominator());
    }

    @Test
    public void testConstructorInt() {
        BigFraction bf = new BigFraction(5);
        assertEquals(BigInteger.valueOf(5), bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testConstructorLong() {
        BigFraction bf = new BigFraction(5L);
        assertEquals(BigInteger.valueOf(5), bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testConstructorLongLong() {
        BigFraction bf = new BigFraction(2L, 4L);
        assertEquals(BigInteger.valueOf(1), bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());
    }

    @Test
    public void testGetReducedFraction() {
        BigFraction bf = BigFraction.getReducedFraction(2, 4);
        assertEquals(BigInteger.ONE, bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());

        bf = BigFraction.getReducedFraction(5, 1);
        assertEquals(BigInteger.valueOf(5), bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());

        bf = BigFraction.getReducedFraction(0, 5);
        assertEquals(BigInteger.ZERO, bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());

        bf = BigFraction.getReducedFraction(-2, 4);
        assertEquals(BigInteger.valueOf(-1), bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());

        bf = BigFraction.getReducedFraction(2, -4);
        assertEquals(BigInteger.valueOf(-1), bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());
    }

    @Test
    public void testAbs() {
        BigFraction bf = new BigFraction(-1, 2);
        BigFraction abs = bf.abs();
        assertEquals(BigInteger.ONE, abs.getNumerator());
        assertEquals(BigInteger.valueOf(2), abs.getDenominator());

        bf = new BigFraction(1, 2);
        assertTrue(bf == bf.abs());

        bf = new BigFraction(0, 2);
        assertTrue(bf == bf.abs());
    }

    @Test
    public void testAddBigInteger() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction result = bf.add(BigInteger.valueOf(2));
        assertEquals(BigInteger.valueOf(5), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());

        bf = new BigFraction(-1, 2);
        result = bf.add(BigInteger.valueOf(2));
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());

        bf = new BigFraction(1, 2);
        result = bf.add(BigInteger.valueOf(-2));
        assertEquals(BigInteger.valueOf(-3), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());

        bf = new BigFraction(1, 2);
        result = bf.add(BigInteger.ZERO);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    @Test
    public void testAddInt() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction result = bf.add(2);
        assertEquals(BigInteger.valueOf(5), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    @Test
    public void testAddLong() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction result = bf.add(2L);
        assertEquals(BigInteger.valueOf(5), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    @Test
    public void testAddBigFraction() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(1, 3);
        BigFraction result = bf1.add(bf2);
        assertEquals(BigInteger.valueOf(5), result.getNumerator());
        assertEquals(BigInteger.valueOf(6), result.getDenominator());

        bf1 = new BigFraction(1, 2);
        bf2 = new BigFraction(1, 2);
        result = bf1.add(bf2);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());

        bf1 = new BigFraction(1, 2);
        assertTrue(bf1.add(BigFraction.ZERO) == bf1);

        bf1 = new BigFraction(1, 2);
        bf2 = new BigFraction(-1, 2);
        result = bf1.add(bf2);
        assertEquals(BigInteger.ZERO, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());
    }

    @Test
    public void testAddBigFractionNull() {
        BigFraction bf = new BigFraction(1, 2);
        assertThrows(NullArgumentException.class, () -> bf.add((BigFraction) null));
    }

    @Test
    public void testBigDecimalValue() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigDecimal("0.5"), bf.bigDecimalValue());

        bf = new BigFraction(1, 3);
        assertEquals(new BigDecimal("0.3333333333333333333333333333333333"), bf.bigDecimalValue());

        bf = new BigFraction(2, 1);
        assertEquals(new BigDecimal("2"), bf.bigDecimalValue());
    }

    @Test
    public void testBigDecimalValueRoundingMode() {
        BigFraction bf = new BigFraction(1, 3);
        assertEquals(new BigDecimal("0.333"), bf.bigDecimalValue(BigDecimal.ROUND_DOWN));
    }

    @Test
    public void testBigDecimalValueScaleRoundingMode() {
        BigFraction bf = new BigFraction(1, 3);
        assertEquals(new BigDecimal("0.33"), bf.bigDecimalValue(2, BigDecimal.ROUND_DOWN));
    }

    @Test
    public void testCompareTo() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(1, 3);
        assertTrue(bf1.compareTo(bf2) > 0);
        assertTrue(bf2.compareTo(bf1) < 0);
        assertTrue(bf1.compareTo(new BigFraction(2, 4)) == 0);

        bf1 = new BigFraction(1, 2);
        bf2 = new BigFraction(-1, 2);
        assertTrue(bf1.compareTo(bf2) > 0);
        assertTrue(bf2.compareTo(bf1) < 0);

        bf1 = new BigFraction(1, 2);
        assertTrue(bf1.compareTo(new BigFraction(1, 2)) == 0);
    }

    @Test
    public void testDivideBigInteger() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction result = bf.divide(BigInteger.valueOf(2));
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(4), result.getDenominator());

        bf = new BigFraction(1, 2);
        result = bf.divide(BigInteger.valueOf(1));
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());

        bf = new BigFraction(1, 2);
        assertThrows(ZeroException.class, () -> bf.divide(BigInteger.ZERO));
    }

    @Test
    public void testDivideInt() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction result = bf.divide(2);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(4), result.getDenominator());
    }

    @Test
    public void testDivideLong() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction result = bf.divide(2L);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(4), result.getDenominator());
    }

    @Test
    public void testDivideBigFraction() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(3, 4);
        BigFraction result = bf1.divide(bf2);
        assertEquals(BigInteger.valueOf(2), result.getNumerator());
        assertEquals(BigInteger.valueOf(3), result.getDenominator());

        bf1 = new BigFraction(0, 2);
        bf2 = new BigFraction(3, 4);
        result = bf1.divide(bf2);
        assertEquals(BigInteger.ZERO, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());

        bf1 = new BigFraction(1, 2);
        bf2 = new BigFraction(0, 4);
        assertThrows(ZeroException.class, () -> bf1.divide(bf2));
    }

    @Test
    public void testDoubleValue() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(0.5, bf.doubleValue(), 0.0000001);

        bf = new BigFraction(3, 2);
        assertEquals(1.5, bf.doubleValue(), 0.0000001);

        bf = new BigFraction(0, 2);
        assertEquals(0.0, bf.doubleValue(), 0.0000001);
    }

    @Test
    public void testEquals() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(2, 4);
        BigFraction bf3 = new BigFraction(1, 3);

        assertTrue(bf1.equals(bf2));
        assertFalse(bf1.equals(bf3));
        assertFalse(bf1.equals(null));
        assertFalse(bf1.equals(new Object()));
        assertTrue(bf1.equals(bf1));

        bf1 = new BigFraction(0, 2);
        bf2 = new BigFraction(0, 3);
        assertTrue(bf1.equals(bf2));
    }

    @Test
    public void testFloatValue() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(0.5f, bf.floatValue(), 0.00001f);
    }

    @Test
    public void testGetDenominator() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());
    }

    @Test
    public void testGetDenominatorAsInt() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(2, bf.getDenominatorAsInt());
    }

    @Test
    public void testGetDenominatorAsLong() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(2L, bf.getDenominatorAsLong());
    }

    @Test
    public void testGetNumerator() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(BigInteger.ONE, bf.getNumerator());
    }

    @Test
    public void testGetNumeratorAsInt() {
        BigFraction bf = new BigFraction(3, 2);
        assertEquals(3, bf.getNumeratorAsInt());
    }

    @Test
    public void testGetNumeratorAsLong() {
        BigFraction bf = new BigFraction(3, 2);
        assertEquals(3L, bf.getNumeratorAsLong());
    }

    @Test
    public void testHashCode() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(2, 4);
        assertEquals(bf1.hashCode(), bf2.hashCode());

        bf1 = new BigFraction(1, 2);
        bf2 = new BigFraction(1, 3);
        assertTrue(bf1.hashCode() != bf2.hashCode());
    }

    @Test
    public void testIntValue() {
        BigFraction bf = new BigFraction(5, 2);
        assertEquals(2, bf.intValue());

        bf = new BigFraction(2, 1);
        assertEquals(2, bf.intValue());

        bf = new BigFraction(-5, 2);
        assertEquals(-2, bf.intValue());
    }

    @Test
    public void testLongValue() {
        BigFraction bf = new BigFraction(5, 2);
        assertEquals(2L, bf.longValue());

        bf = new BigFraction(2, 1);
        assertEquals(2L, bf.longValue());

        bf = new BigFraction(5L, 2L);
        assertEquals(2L, bf.longValue());

        bf = new BigFraction(0, 2);
        assertEquals(0L, bf.longValue());
    }

    @Test
    public void testMultiplyBigInteger() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction result = bf.multiply(BigInteger.valueOf(2));
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());

        bf = new BigFraction(1, 2);
        result = bf.multiply(BigInteger.ZERO);
        assertEquals(BigInteger.ZERO, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());

        bf = new BigFraction(1, 2);
        result = bf.multiply(BigInteger.valueOf(-2));
        assertEquals(BigInteger.valueOf(-1), result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());
    }

    @Test
    public void testMultiplyBigFraction() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(2, 3);
        BigFraction result = bf1.multiply(bf2);
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
        assertEquals(BigInteger.valueOf(3), result.getDenominator());

        bf1 = new BigFraction(0, 2);
        result = bf1.multiply(bf2);
        assertEquals(BigInteger.ZERO, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());
    }

    @Test
    public void testMultiplyInt() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction result = bf.multiply(2);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());
    }

    @Test
    public void testMultiplyLong() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction result = bf.multiply(2L);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());
    }

    @Test
    public void testNegate() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction negated = bf.negate();
        assertEquals(BigInteger.valueOf(-1), negated.getNumerator());
        assertEquals(BigInteger.valueOf(2), negated.getDenominator());

        bf = new BigFraction(-1, 2);
        negated = bf.negate();
        assertEquals(BigInteger.ONE, negated.getNumerator());
        assertEquals(BigInteger.valueOf(2), negated.getDenominator());

        bf = new BigFraction(0, 2);
        negated = bf.negate();
        assertEquals(BigInteger.ZERO, negated.getNumerator());
        assertEquals(BigInteger.ONE, negated.getDenominator());
    }

    @Test
    public void testPercentageValue() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(50.0, bf.percentageValue(), 0.00001);

        bf = new BigFraction(1, 4);
        assertEquals(25.0, bf.percentageValue(), 0.00001);
    }

    @Test
    public void testPowInt() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction result = bf.pow(2);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(4), result.getDenominator());

        bf = new BigFraction(2, 3);
        result = bf.pow(2);
        assertEquals(BigInteger.valueOf(4), result.getNumerator());
        assertEquals(BigInteger.valueOf(9), result.getDenominator());

        bf = new BigFraction(2, 3);
        result = bf.pow(-1);
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());

        bf = new BigFraction(2, 3);
        result = bf.pow(0);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());
    }

    @Test
    public void testPowLong() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction result = bf.pow(2L);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(4), result.getDenominator());

        bf = new BigFraction(2, 3);
        result = bf.pow(-1L);
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());

        bf = new BigFraction(2, 3);
        result = bf.pow(0L);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());
    }

    @Test
    public void testPowBigInteger() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction result = bf.pow(BigInteger.valueOf(2));
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(4), result.getDenominator());

        bf = new BigFraction(2, 3);
        result = bf.pow(BigInteger.valueOf(-1));
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());

        bf = new BigFraction(2, 3);
        result = bf.pow(BigInteger.ZERO);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());
    }

    @Test
    public void testPowDouble() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(Math.sqrt(0.5), bf.pow(0.5), 0.000001);

        bf = new BigFraction(4, 1);
        assertEquals(2.0, bf.pow(0.5), 0.000001);
    }

    @Test
    public void testReciprocal() {
        BigFraction bf = new BigFraction(1, 2);
        BigFraction rec = bf.reciprocal();
        assertEquals(BigInteger.valueOf(2), rec.getNumerator());
        assertEquals(BigInteger.ONE, rec.getDenominator());

        bf = new BigFraction(2, 3);
        rec = bf.reciprocal();
        assertEquals(BigInteger.valueOf(3), rec.getNumerator());
        assertEquals(BigInteger.valueOf(2), rec.getDenominator());
    }

    @Test
    public void testReduce() {
        BigFraction bf = new BigFraction(2, 4);
        BigFraction reduced = bf.reduce();
        assertEquals(BigInteger.ONE, reduced.getNumerator());
        assertEquals(BigInteger.valueOf(2), reduced.getDenominator());

        bf = new BigFraction(3, 5);
        reduced = bf.reduce();
        assertEquals(BigInteger.valueOf(3), reduced.getNumerator());
        assertEquals(BigInteger.valueOf(5), reduced.getDenominator());

        bf = new BigFraction(4, 6);
        reduced = bf.reduce();
        assertEquals(BigInteger.valueOf(2), reduced.getNumerator());
        assertEquals(BigInteger.valueOf(3), reduced.getDenominator());
    }

    @Test
    public void testSubtractBigInteger() {
        BigFraction bf = new BigFraction(3, 2);
        BigFraction result = bf.subtract(BigInteger.ONE);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());

        bf = new BigFraction(1, 2);
        result = bf.subtract(BigInteger.ONE);
        assertEquals(BigInteger.valueOf(-1), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());

        bf = new BigFraction(1, 2);
        result = bf.subtract(BigInteger.ZERO);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    @Test
    public void testSubtractInt() {
        BigFraction bf = new BigFraction(3, 2);
        BigFraction result = bf.subtract(1);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    @Test
    public void testSubtractLong() {
        BigFraction bf = new BigFraction(3, 2);
        BigFraction result = bf.subtract(1L);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    @Test
    public void testSubtractBigFraction() {
        BigFraction bf1 = new BigFraction(3, 4);
        BigFraction bf2 = new BigFraction(1, 4);
        BigFraction result = bf1.subtract(bf2);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());

        bf1 = new BigFraction(1, 2);
        bf2 = new BigFraction(1, 3);
        result = bf1.subtract(bf2);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.valueOf(6), result.getDenominator());

        bf1 = new BigFraction(1, 2);
        bf2 = new BigFraction(-1, 2);
        result = bf1.subtract(bf2);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());

        bf1 = new BigFraction(1, 2);
        bf2 = new BigFraction(1, 2);
        result = bf1.subtract(bf2);
        assertEquals(BigInteger.ZERO, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());
    }

    @Test
    public void testSubtractBigFractionNull() {
        BigFraction bf1 = new BigFraction(1, 2);
        assertThrows(NullArgumentException.class, () -> bf1.subtract((BigFraction) null));
    }

    @Test
    public void testToString() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals("1 / 2", bf.toString());

        bf = new BigFraction(2, 1);
        assertEquals("2", bf.toString());

        bf = new BigFraction(0, 2);
        assertEquals("0", bf.toString());
    }

    @Test
    public void testGetField() {
        BigFraction bf = new BigFraction(1, 2);
        assertNotNull(bf.getField());
    }
}