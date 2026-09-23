package org.apache.commons.math3.fraction;

import org.junit.Assert;
import org.junit.Test;

public class FractionTest {

    private static final double DELTA = 0.00001d;

    // -----------------------------------------------------------------------
    // Constants
    // -----------------------------------------------------------------------
    @Test
    public void constants_givenPredefinedInstances_shouldMatchExpectedValues() {
        Assert.assertEquals(0, Fraction.ZERO.getNumerator());
        Assert.assertEquals(1, Fraction.ZERO.getDenominator());

        Assert.assertEquals(1, Fraction.ONE.getNumerator());
        Assert.assertEquals(1, Fraction.ONE.getDenominator());

        Assert.assertEquals(1, Fraction.ONE_HALF.getNumerator());
        Assert.assertEquals(2, Fraction.ONE_HALF.getDenominator());

        Assert.assertEquals(1, Fraction.ONE_THIRD.getNumerator());
        Assert.assertEquals(3, Fraction.ONE_THIRD.getDenominator());

        Assert.assertEquals(2, Fraction.TWO_THIRDS.getNumerator());
        Assert.assertEquals(3, Fraction.TWO_THIRDS.getDenominator());

        Assert.assertEquals(1, Fraction.ONE_QUARTER.getNumerator());
        Assert.assertEquals(4, Fraction.ONE_QUARTER.getDenominator());

        Assert.assertEquals(2, Fraction.TWO_QUARTERS.getNumerator());
        Assert.assertEquals(4, Fraction.TWO_QUARTERS.getDenominator());

        Assert.assertEquals(3, Fraction.THREE_QUARTERS.getNumerator());
        Assert.assertEquals(4, Fraction.THREE_QUARTERS.getDenominator());

        Assert.assertEquals(1, Fraction.ONE_FIFTH.getNumerator());
        Assert.assertEquals(5, Fraction.ONE_FIFTH.getDenominator());

        Assert.assertEquals(2, Fraction.TWO_FIFTHS.getNumerator());
        Assert.assertEquals(5, Fraction.TWO_FIFTHS.getDenominator());

        Assert.assertEquals(3, Fraction.THREE_FIFTHS.getNumerator());
        Assert.assertEquals(5, Fraction.THREE_FIFTHS.getDenominator());

        Assert.assertEquals(4, Fraction.FOUR_FIFTHS.getNumerator());
        Assert.assertEquals(5, Fraction.FOUR_FIFTHS.getDenominator());
    }

    // -----------------------------------------------------------------------
    // getFraction(int, int)
    // -----------------------------------------------------------------------
    @Test
    public void getFraction_givenValidNumeratorAndDenominator_shouldCreateFraction() {
        Fraction f = Fraction.getFraction(3, 4);
        Assert.assertEquals(3, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());
    }

    @Test
    public void getFraction_givenNegativeDenominator_shouldNormalizeSign() {
        Fraction f = Fraction.getFraction(3, -4);
        Assert.assertEquals(-3, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());

        Fraction f2 = Fraction.getFraction(-3, -4);
        Assert.assertEquals(3, f2.getNumerator());
        Assert.assertEquals(4, f2.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void getFraction_givenZeroDenominator_shouldThrowArithmeticException() {
        Fraction.getFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void getFraction_givenMinIntNumeratorAndNegativeDenominator_shouldThrowArithmeticException() {
        Fraction.getFraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void getFraction_givenMinIntDenominator_shouldThrowArithmeticException() {
        Fraction.getFraction(1, Integer.MIN_VALUE);
    }

    // -----------------------------------------------------------------------
    // getFraction(int, int, int)
    // -----------------------------------------------------------------------
    @Test
    public void getFraction_givenValidWholeAndFractionParts_shouldCreateFraction() {
        Fraction f = Fraction.getFraction(1, 2, 3);
        Assert.assertEquals(5, f.getNumerator());
        Assert.assertEquals(3, f.getDenominator());
    }

    @Test
    public void getFraction_givenNegativeWholePart_shouldComputeCorrectNegativeNumerator() {
        Fraction f = Fraction.getFraction(-1, 2, 3);
        Assert.assertEquals(-5, f.getNumerator());
        Assert.assertEquals(3, f.getDenominator());
    }

    @Test
    public void getFraction_givenZeroWholePart_shouldComputeNumerator() {
        Fraction f = Fraction.getFraction(0, 2, 3);
        Assert.assertEquals(2, f.getNumerator());
        Assert.assertEquals(3, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void getFraction_givenThreeArgsWithZeroDenominator_shouldThrowArithmeticException() {
        Fraction.getFraction(1, 1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void getFraction_givenThreeArgsWithNegativeDenominator_shouldThrowArithmeticException() {
        Fraction.getFraction(1, 1, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void getFraction_givenThreeArgsWithNegativeNumerator_shouldThrowArithmeticException() {
        Fraction.getFraction(1, -1, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void getFraction_givenThreeArgsWithPositiveOverflow_shouldThrowArithmeticException() {
        Fraction.getFraction(Integer.MAX_VALUE, 1, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void getFraction_givenThreeArgsWithNegativeOverflow_shouldThrowArithmeticException() {
        Fraction.getFraction(Integer.MIN_VALUE, 1, 2);
    }

    // -----------------------------------------------------------------------
    // getReducedFraction(int, int)
    // -----------------------------------------------------------------------
    @Test
    public void getReducedFraction_givenZeroNumerator_shouldReturnZeroConstant() {
        Fraction f = Fraction.getReducedFraction(0, 5);
        Assert.assertSame(Fraction.ZERO, f);
    }

    @Test
    public void getReducedFraction_givenValidNumbers_shouldReduceProperly() {
        Fraction f = Fraction.getReducedFraction(2, 4);
        Assert.assertEquals(1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());
    }

    @Test
    public void getReducedFraction_givenNegativeDenominator_shouldNegateProperly() {
        Fraction f = Fraction.getReducedFraction(2, -4);
        Assert.assertEquals(-1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());
    }

    @Test
    public void getReducedFraction_givenMinIntDenominatorAndEvenNumerator_shouldDivideByTwo() {
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        Assert.assertEquals(-1, f.getNumerator());
        Assert.assertEquals(1073741824, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void getReducedFraction_givenZeroDenominator_shouldThrowArithmeticException() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void getReducedFraction_givenMinIntNumeratorAndNegativeDenominator_shouldThrowArithmeticException() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void getReducedFraction_givenOddNumeratorAndMinIntDenominator_shouldThrowArithmeticException() {
        Fraction.getReducedFraction(1, Integer.MIN_VALUE);
    }

    // -----------------------------------------------------------------------
    // getFraction(double)
    // -----------------------------------------------------------------------
    @Test
    public void getFraction_givenDoubleValue_shouldConvertAccurately() {
        Fraction f = Fraction.getFraction(0.5d);
        Assert.assertEquals(1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());

        Fraction fNeg = Fraction.getFraction(-0.75d);
        Assert.assertEquals(-3, fNeg.getNumerator());
        Assert.assertEquals(4, fNeg.getDenominator());

        Fraction fWhole = Fraction.getFraction(2.0d);
        Assert.assertEquals(2, fWhole.getNumerator());
        Assert.assertEquals(1, fWhole.getDenominator());

        Fraction fMixed = Fraction.getFraction(2.25d);
        Assert.assertEquals(9, fMixed.getNumerator());
        Assert.assertEquals(4, fMixed.getDenominator());

        Fraction fZero = Fraction.getFraction(0.0d);
        Assert.assertEquals(0, fZero.getNumerator());
        Assert.assertEquals(1, fZero.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void getFraction_givenDoubleGreaterThanMaxInt_shouldThrowArithmeticException() {
        Fraction.getFraction((double) Integer.MAX_VALUE + 1000.0d);
    }

    @Test(expected = ArithmeticException.class)
    public void getFraction_givenDoubleNaN_shouldThrowArithmeticException() {
        Fraction.getFraction(Double.NaN);
    }

    // -----------------------------------------------------------------------
    // getFraction(String)
    // -----------------------------------------------------------------------
    @Test
    public void getFraction_givenDoubleString_shouldParseCorrectly() {
        Fraction f = Fraction.getFraction("0.5");
        Assert.assertEquals(1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());
    }

    @Test
    public void getFraction_givenWholeAndFractionString_shouldParseCorrectly() {
        Fraction f = Fraction.getFraction("1 2/3");
        Assert.assertEquals(5, f.getNumerator());
        Assert.assertEquals(3, f.getDenominator());
    }

    @Test
    public void getFraction_givenSimpleFractionString_shouldParseCorrectly() {
        Fraction f = Fraction.getFraction("3/4");
        Assert.assertEquals(3, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());
    }

    @Test
    public void getFraction_givenIntegerString_shouldParseAsFractionOverOne() {
        Fraction f = Fraction.getFraction("42");
        Assert.assertEquals(42, f.getNumerator());
        Assert.assertEquals(1, f.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFraction_givenNullString_shouldThrowIllegalArgumentException() {
        Fraction.getFraction((String) null);
    }

    @Test(expected = NumberFormatException.class)
    public void getFraction_givenSpaceStringWithoutSlash_shouldThrowNumberFormatException() {
        Fraction.getFraction("1 2");
    }

    // -----------------------------------------------------------------------
    // Accessors & Number implementations
    // -----------------------------------------------------------------------
    @Test
    public void accessors_givenFraction_shouldReturnCorrectValues() {
        Fraction f = Fraction.getFraction(7, 3);
        Assert.assertEquals(7, f.getNumerator());
        Assert.assertEquals(3, f.getDenominator());
        Assert.assertEquals(1, f.getProperNumerator());
        Assert.assertEquals(2, f.getProperWhole());

        Fraction fNeg = Fraction.getFraction(-7, 3);
        Assert.assertEquals(1, fNeg.getProperNumerator());
        Assert.assertEquals(-2, fNeg.getProperWhole());

        Assert.assertEquals(2, f.intValue());
        Assert.assertEquals(2L, f.longValue());
        Assert.assertEquals(7.0f / 3.0f, f.floatValue(), 0.0001f);
        Assert.assertEquals(7.0d / 3.0d, f.doubleValue(), DELTA);
    }

    // -----------------------------------------------------------------------
    // reduce()
    // -----------------------------------------------------------------------
    @Test
    public void reduce_givenVariousFractions_shouldReduceOrPreserve() {
        Fraction f1 = Fraction.getFraction(0, 2);
        Fraction red1 = f1.reduce();
        Assert.assertSame(Fraction.ZERO, red1);

        Fraction fZero = Fraction.ZERO;
        Assert.assertSame(Fraction.ZERO, fZero.reduce());

        Fraction f2 = Fraction.getFraction(2, 4);
        Fraction red2 = f2.reduce();
        Assert.assertEquals(1, red2.getNumerator());
        Assert.assertEquals(2, red2.getDenominator());

        Fraction f3 = Fraction.getFraction(3, 7);
        Assert.assertSame(f3, f3.reduce());
    }

    // -----------------------------------------------------------------------
    // invert()
    // -----------------------------------------------------------------------
    @Test
    public void invert_givenPositiveAndNegativeFractions_shouldInvertCorrectly() {
        Fraction f1 = Fraction.getFraction(3, 4).invert();
        Assert.assertEquals(4, f1.getNumerator());
        Assert.assertEquals(3, f1.getDenominator());

        Fraction f2 = Fraction.getFraction(-3, 4).invert();
        Assert.assertEquals(-4, f2.getNumerator());
        Assert.assertEquals(3, f2.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void invert_givenZeroNumerator_shouldThrowArithmeticException() {
        Fraction.ZERO.invert();
    }

    @Test(expected = ArithmeticException.class)
    public void invert_givenMinIntNumerator_shouldThrowArithmeticException() {
        Fraction.getFraction(Integer.MIN_VALUE, 1).invert();
    }

    // -----------------------------------------------------------------------
    // negate() & abs()
    // -----------------------------------------------------------------------
    @Test
    public void negate_givenValidFractions_shouldNegateValue() {
        Fraction f1 = Fraction.getFraction(3, 4).negate();
        Assert.assertEquals(-3, f1.getNumerator());
        Assert.assertEquals(4, f1.getDenominator());

        Fraction f2 = Fraction.getFraction(-3, 4).negate();
        Assert.assertEquals(3, f2.getNumerator());
        Assert.assertEquals(4, f2.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void negate_givenMinIntNumerator_shouldThrowArithmeticException() {
        Fraction.getFraction(Integer.MIN_VALUE, 1).negate();
    }

    @Test
    public void abs_givenPositiveAndNegativeFractions_shouldReturnPositive() {
        Fraction fPos = Fraction.getFraction(3, 4);
        Assert.assertSame(fPos, fPos.abs());

        Fraction fNeg = Fraction.getFraction(-3, 4);
        Fraction fAbs = fNeg.abs();
        Assert.assertEquals(3, fAbs.getNumerator());
        Assert.assertEquals(4, fAbs.getDenominator());
    }

    // -----------------------------------------------------------------------
    // pow(int)
    // -----------------------------------------------------------------------
    @Test
    public void pow_givenVariousPowers_shouldCalculateExpectedResult() {
        Fraction f = Fraction.getFraction(2, 3);

        Assert.assertSame(f, f.pow(1));
        Assert.assertSame(Fraction.ONE, f.pow(0));

        Fraction pow2 = f.pow(2);
        Assert.assertEquals(4, pow2.getNumerator());
        Assert.assertEquals(9, pow2.getDenominator());

        Fraction pow3 = f.pow(3);
        Assert.assertEquals(8, pow3.getNumerator());
        Assert.assertEquals(27, pow3.getDenominator());

        Fraction powNeg1 = f.pow(-1);
        Assert.assertEquals(3, powNeg1.getNumerator());
        Assert.assertEquals(2, powNeg1.getDenominator());

        Fraction powNeg2 = f.pow(-2);
        Assert.assertEquals(9, powNeg2.getNumerator());
        Assert.assertEquals(4, powNeg2.getDenominator());

        Fraction one = Fraction.ONE;
        Assert.assertEquals(1, one.pow(Integer.MIN_VALUE).getNumerator());
    }

    // -----------------------------------------------------------------------
    // add(Fraction) & subtract(Fraction)
    // -----------------------------------------------------------------------
    @Test
    public void add_givenVariousFractions_shouldComputeSum() {
        Fraction f1 = Fraction.getFraction(1, 3);
        Fraction f2 = Fraction.getFraction(1, 4);
        Fraction sum1 = f1.add(f2);
        Assert.assertEquals(7, sum1.getNumerator());
        Assert.assertEquals(12, sum1.getDenominator());

        // Same denominator (d1 > 1)
        Fraction f3 = Fraction.getFraction(1, 6);
        Fraction f4 = Fraction.getFraction(2, 6);
        Fraction sum2 = f3.add(f4);
        Assert.assertEquals(18, sum2.getNumerator());
        Assert.assertEquals(36, sum2.getDenominator());
        Assert.assertEquals(1, sum2.reduce().getNumerator());
        Assert.assertEquals(2, sum2.reduce().getDenominator());

        // Zero checks
        Assert.assertSame(f1, Fraction.ZERO.add(f1));
        Assert.assertSame(f1, f1.add(Fraction.ZERO));
    }

    @Test
    public void subtract_givenVariousFractions_shouldComputeDifference() {
        Fraction f1 = Fraction.getFraction(1, 3);
        Fraction f2 = Fraction.getFraction(1, 4);
        Fraction diff1 = f1.subtract(f2);
        Assert.assertEquals(1, diff1.getNumerator());
        Assert.assertEquals(12, diff1.getDenominator());

        // With common divisor
        Fraction f3 = Fraction.getFraction(5, 6);
        Fraction f4 = Fraction.getFraction(1, 6);
        Fraction diff2 = f3.subtract(f4);
        Assert.assertEquals(24, diff2.getNumerator());
        Assert.assertEquals(36, diff2.getDenominator());

        // Zero checks
        Fraction subFromZero = Fraction.ZERO.subtract(f1);
        Assert.assertEquals(-1, subFromZero.getNumerator());
        Assert.assertEquals(3, subFromZero.getDenominator());
        Assert.assertSame(f1, f1.subtract(Fraction.ZERO));
    }

    @Test(expected = IllegalArgumentException.class)
    public void add_givenNullFraction_shouldThrowIllegalArgumentException() {
        Fraction.ONE.add(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void subtract_givenNullFraction_shouldThrowIllegalArgumentException() {
        Fraction.ONE.subtract(null);
    }

    @Test(expected = ArithmeticException.class)
    public void add_givenOverflowingNumeratorWithGcd1_shouldThrowArithmeticException() {
        Fraction f1 = Fraction.getFraction(Integer.MAX_VALUE, 2);
        Fraction f2 = Fraction.getFraction(Integer.MAX_VALUE, 3);
        f1.add(f2);
    }

    @Test(expected = ArithmeticException.class)
    public void add_givenOverflowingDenominatorWithGcd1_shouldThrowArithmeticException() {
        Fraction f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
        Fraction f2 = Fraction.getFraction(1, Integer.MAX_VALUE - 1);
        f1.add(f2);
    }

    @Test(expected = ArithmeticException.class)
    public void add_givenLargeNumeratorResultInBigInt_shouldThrowArithmeticException() {
        Fraction f1 = Fraction.getFraction(Integer.MAX_VALUE - 1, 2);
        Fraction f2 = Fraction.getFraction(Integer.MAX_VALUE - 1, 2);
        f1.add(f2);
    }

    // -----------------------------------------------------------------------
    // multiplyBy(Fraction) & divideBy(Fraction)
    // -----------------------------------------------------------------------
    @Test
    public void multiplyBy_givenFractions_shouldMultiplyAndReduce() {
        Fraction f1 = Fraction.getFraction(2, 3);
        Fraction f2 = Fraction.getFraction(3, 4);
        Fraction res = f1.multiplyBy(f2);
        Assert.assertEquals(1, res.getNumerator());
        Assert.assertEquals(2, res.getDenominator());

        Assert.assertSame(Fraction.ZERO, f1.multiplyBy(Fraction.ZERO));
        Assert.assertSame(Fraction.ZERO, Fraction.ZERO.multiplyBy(f1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void multiplyBy_givenNull_shouldThrowIllegalArgumentException() {
        Fraction.ONE.multiplyBy(null);
    }

    @Test(expected = ArithmeticException.class)
    public void multiplyBy_givenOverflowResult_shouldThrowArithmeticException() {
        Fraction f1 = Fraction.getFraction(Integer.MAX_VALUE, 1);
        Fraction f2 = Fraction.getFraction(2, 1);
        f1.multiplyBy(f2);
    }

    @Test
    public void divideBy_givenValidFractions_shouldDivideCorrectly() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 4);
        Fraction res = f1.divideBy(f2);
        Assert.assertEquals(2, res.getNumerator());
        Assert.assertEquals(1, res.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideBy_givenNull_shouldThrowIllegalArgumentException() {
        Fraction.ONE.divideBy(null);
    }

    @Test(expected = ArithmeticException.class)
    public void divideBy_givenZeroFraction_shouldThrowArithmeticException() {
        Fraction.ONE.divideBy(Fraction.ZERO);
    }

    // -----------------------------------------------------------------------
    // equals(Object) & hashCode()
    // -----------------------------------------------------------------------
    @Test
    public void equalsAndHashCode_givenVariousObjects_shouldAdhereToContract() {
        Fraction f1 = Fraction.getFraction(2, 3);
        Fraction f2 = Fraction.getFraction(2, 3);
        Fraction f3 = Fraction.getFraction(4, 6);
        Fraction fDiffNumer = Fraction.getFraction(1, 3);
        Fraction fDiffDenom = Fraction.getFraction(2, 5);

        Assert.assertTrue(f1.equals(f1));
        Assert.assertTrue(f1.equals(f2));
        Assert.assertFalse(f1.equals(f3));
        Assert.assertFalse(f1.equals(fDiffNumer));
        Assert.assertFalse(f1.equals(fDiffDenom));
        Assert.assertFalse(f1.equals(null));
        Assert.assertFalse(f1.equals("2/3"));

        Assert.assertEquals(f1.hashCode(), f2.hashCode());
        Assert.assertEquals(f1.hashCode(), f1.hashCode());
    }

    // -----------------------------------------------------------------------
    // compareTo(Fraction)
    // -----------------------------------------------------------------------
    @Test
    public void compareTo_givenVariousFractions_shouldOrderProperly() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(2, 4);
        Fraction fSmaller = Fraction.getFraction(1, 3);
        Fraction fLarger = Fraction.getFraction(2, 3);

        Assert.assertEquals(0, f1.compareTo(f1));
        Assert.assertEquals(0, f1.compareTo(f2));
        Assert.assertTrue(f1.compareTo(fSmaller) > 0);
        Assert.assertTrue(f1.compareTo(fLarger) < 0);

        Fraction sameNumerDenom = Fraction.getFraction(1, 2);
        Assert.assertEquals(0, f1.compareTo(sameNumerDenom));
    }

    // -----------------------------------------------------------------------
    // toString() & toProperString()
    // -----------------------------------------------------------------------
    @Test
    public void toString_givenFraction_shouldCacheAndReturnSimpleRepresentation() {
        Fraction f = Fraction.getFraction(3, 5);
        Assert.assertEquals("3/5", f.toString());
        Assert.assertEquals("3/5", f.toString());
    }

    @Test
    public void toProperString_givenVariousFractions_shouldFormatCorrectly() {
        Assert.assertEquals("0", Fraction.ZERO.toProperString());

        Fraction one = Fraction.getFraction(5, 5);
        Assert.assertEquals("1", one.toProperString());

        Fraction negOne = Fraction.getFraction(-5, 5);
        Assert.assertEquals("-1", negOne.toProperString());

        Fraction properNegativeWhole = Fraction.getFraction(-4, 2);
        Assert.assertEquals("-2", properNegativeWhole.toProperString());

        Fraction mixedNegative = Fraction.getFraction(-7, 3);
        Assert.assertEquals("-2 1/3", mixedNegative.toProperString());

        Fraction properPositiveWhole = Fraction.getFraction(4, 2);
        Assert.assertEquals("2", properPositiveWhole.toProperString());

        Fraction mixedPositive = Fraction.getFraction(7, 3);
        Assert.assertEquals("2 1/3", mixedPositive.toProperString());
        Assert.assertEquals("2 1/3", mixedPositive.toProperString());

        Fraction normal = Fraction.getFraction(2, 3);
        Assert.assertEquals("2/3", normal.toProperString());

        Fraction normalNeg = Fraction.getFraction(-2, 3);
        Assert.assertEquals("-2/3", normalNeg.toProperString());
    }
}