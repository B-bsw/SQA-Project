package org.apache.commons.math3.util;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;

public class MathArraysTest {
    private static final double EPSILON = 1e-10;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testScale() {
        double[] arr = {1.0, 2.0, 3.0};
        double[] result = MathArrays.scale(2.0, arr);
        Assert.assertArrayEquals(new double[]{2.0, 4.0, 6.0}, result, EPSILON);
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 3.0}, arr, EPSILON);
    }

    @Test
    public void testScaleZeroLength() {
        double[] arr = {};
        double[] result = MathArrays.scale(2.0, arr);
        Assert.assertArrayEquals(new double[]{}, result, EPSILON);
    }

    @Test
    public void testScaleInPlace() {
        double[] arr = {1.0, 2.0, 3.0};
        MathArrays.scaleInPlace(2.0, arr);
        Assert.assertArrayEquals(new double[]{2.0, 4.0, 6.0}, arr, EPSILON);
    }

    @Test
    public void testScaleInPlaceZeroLength() {
        double[] arr = {};
        MathArrays.scaleInPlace(2.0, arr);
        Assert.assertArrayEquals(new double[]{}, arr, EPSILON);
    }

    @Test
    public void testEbeAdd() throws DimensionMismatchException {
        double[] a = {1.0, 2.0, 3.0};
        double[] b = {4.0, 5.0, 6.0};
        double[] result = MathArrays.ebeAdd(a, b);
        Assert.assertArrayEquals(new double[]{5.0, 7.0, 9.0}, result, EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeAddDimensionMismatch() throws DimensionMismatchException {
        double[] a = {1.0, 2.0};
        double[] b = {1.0};
        MathArrays.ebeAdd(a, b);
    }

    @Test
    public void testEbeSubtract() throws DimensionMismatchException {
        double[] a = {4.0, 5.0, 6.0};
        double[] b = {1.0, 2.0, 3.0};
        double[] result = MathArrays.ebeSubtract(a, b);
        Assert.assertArrayEquals(new double[]{3.0, 3.0, 3.0}, result, EPSILON);
    }

    @Test
    public void testEbeMultiply() throws DimensionMismatchException {
        double[] a = {1.0, 2.0, 3.0};
        double[] b = {2.0, 3.0, 4.0};
        double[] result = MathArrays.ebeMultiply(a, b);
        Assert.assertArrayEquals(new double[]{2.0, 6.0, 12.0}, result, EPSILON);
    }

    @Test
    public void testEbeDivide() throws DimensionMismatchException {
        double[] a = {4.0, 9.0, 16.0};
        double[] b = {2.0, 3.0, 4.0};
        double[] result = MathArrays.ebeDivide(a, b);
        Assert.assertArrayEquals(new double[]{2.0, 3.0, 4.0}, result, EPSILON);
    }

    @Test
    public void testDistance1Double() {
        double[] p1 = {1.0, 2.0, 3.0};
        double[] p2 = {4.0, 5.0, 6.0};
        Assert.assertEquals(9.0, MathArrays.distance1(p1, p2), EPSILON);
    }

    @Test
    public void testDistance1Int() {
        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5, 6};
        Assert.assertEquals(9, MathArrays.distance1(p1, p2));
    }

    @Test
    public void testDistanceDouble() {
        double[] p1 = {1.0, 2.0, 3.0};
        double[] p2 = {4.0, 5.0, 6.0};
        double expected = Math.sqrt(27.0);
        Assert.assertEquals(expected, MathArrays.distance(p1, p2), EPSILON);
    }

    @Test
    public void testDistanceInt() {
        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5, 6};
        double expected = Math.sqrt(27.0);
        Assert.assertEquals(expected, MathArrays.distance(p1, p2), EPSILON);
    }

    @Test
    public void testDistanceInfDouble() {
        double[] p1 = {1.0, 2.0, 10.0};
        double[] p2 = {4.0, 5.0, 6.0};
        Assert.assertEquals(4.0, MathArrays.distanceInf(p1, p2), EPSILON);
    }

    @Test
    public void testDistanceInfInt() {
        int[] p1 = {1, 2, 10};
        int[] p2 = {4, 5, 6};
        Assert.assertEquals(4, MathArrays.distanceInf(p1, p2));
    }

    @Test
    public void testIsMonotonicIncreasingStrict() {
        Integer[] val = {1, 2, 3, 4};
        Assert.assertTrue(MathArrays.isMonotonic(val, MathArrays.OrderDirection.INCREASING, true));
    }

    @Test
    public void testIsMonotonicIncreasingNotStrictWithEqual() {
        Integer[] val = {1, 2, 2, 3};
        Assert.assertTrue(MathArrays.isMonotonic(val, MathArrays.OrderDirection.INCREASING, false));
        Assert.assertFalse(MathArrays.isMonotonic(val, MathArrays.OrderDirection.INCREASING, true));
    }

    @Test
    public void testIsMonotonicDecreasingStrict() {
        Integer[] val = {4, 3, 2, 1};
        Assert.assertTrue(MathArrays.isMonotonic(val, MathArrays.OrderDirection.DECREASING, true));
    }

    @Test
    public void testIsMonotonicDecreasingNotStrictWithEqual() {
        Integer[] val = {3, 2, 2, 1};
        Assert.assertTrue(MathArrays.isMonotonic(val, MathArrays.OrderDirection.DECREASING, false));
        Assert.assertFalse(MathArrays.isMonotonic(val, MathArrays.OrderDirection.DECREASING, true));
    }

    @Test
    public void testCheckOrderIncreasingStrict() throws NonMonotonicSequenceException {
        double[] val = {1.0, 2.0, 3.0};
        MathArrays.checkOrder(val, MathArrays.OrderDirection.INCREASING, true);
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderIncreasingStrictViolation() throws NonMonotonicSequenceException {
        double[] val = {1.0, 2.0, 2.0};
        MathArrays.checkOrder(val, MathArrays.OrderDirection.INCREASING, true);
    }

    @Test
    public void testCheckOrderIncreasingNotStrictWithEqual() throws NonMonotonicSequenceException {
        double[] val = {1.0, 2.0, 2.0};
        MathArrays.checkOrder(val, MathArrays.OrderDirection.INCREASING, false);
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderIncreasingNotStrictViolation() throws NonMonotonicSequenceException {
        double[] val = {1.0, 2.0, 1.0};
        MathArrays.checkOrder(val, MathArrays.OrderDirection.INCREASING, false);
    }

    @Test
    public void testCheckOrderDecreasingStrict() throws NonMonotonicSequenceException {
        double[] val = {3.0, 2.0, 1.0};
        MathArrays.checkOrder(val, MathArrays.OrderDirection.DECREASING, true);
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderDecreasingStrictViolation() throws NonMonotonicSequenceException {
        double[] val = {3.0, 2.0, 2.0};
        MathArrays.checkOrder(val, MathArrays.OrderDirection.DECREASING, true);
    }

    @Test
    public void testCheckOrderAbortTrue() {
        double[] val = {1.0, 2.0, 3.0};
        try {
            MathArrays.checkOrder(val, MathArrays.OrderDirection.INCREASING, true, true);
        } catch (NonMonotonicSequenceException e) {
            Assert.fail("Unexpected exception");
        }
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderAbortTrueViolation() throws NonMonotonicSequenceException {
        double[] val = {1.0, 2.0, 1.0};
        MathArrays.checkOrder(val, MathArrays.OrderDirection.INCREASING, true, true);
    }

    @Test
    public void testCheckRectangularValid() throws NullArgumentException, DimensionMismatchException {
        long[][] in = {{1, 2}, {3, 4}};
        MathArrays.checkRectangular(in);
    }

    @Test(expected = NullArgumentException.class)
    public void testCheckRectangularNull() throws NullArgumentException, DimensionMismatchException {
        MathArrays.checkRectangular(null);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckRectangularDimensionMismatch() throws NullArgumentException, DimensionMismatchException {
        long[][] in = {{1, 2}, {3}};
        MathArrays.checkRectangular(in);
    }

    @Test
    public void testCheckPositiveValid() throws NotStrictlyPositiveException {
        double[] in = {1.0, 2.0, 3.0};
        MathArrays.checkPositive(in);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositiveZero() throws NotStrictlyPositiveException {
        double[] in = {1.0, 0.0};
        MathArrays.checkPositive(in);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositiveNegative() throws NotStrictlyPositiveException {
        double[] in = {-1.0};
        MathArrays.checkPositive(in);
    }

    @Test
    public void testCheckNonNegativeLongArrayValid() throws NotPositiveException {
        long[] in = {1, 2, 3};
        MathArrays.checkNonNegative(in);
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegativeLongArrayNegative() throws NotPositiveException {
        long[] in = {-1};
        MathArrays.checkNonNegative(in);
    }

    @Test
    public void testCheckNonNegativeLong2DArrayValid() throws NotPositiveException {
        long[][] in = {{1, 2}, {3, 4}};
        MathArrays.checkNonNegative(in);
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegativeLong2DArrayNegative() throws NotPositiveException {
        long[][] in = {{1, 2}, {-3, 4}};
        MathArrays.checkNonNegative(in);
    }

    @Test
    public void testSafeNorm() {
        double[] v = {1.0, 2.0, 3.0};
        double expected = Math.sqrt(14.0);
        Assert.assertEquals(expected, MathArrays.safeNorm(v), EPSILON);
    }

    @Test
    public void testSafeNormLargeValues() {
        double[] v = {Double.MAX_VALUE, Double.MAX_VALUE};
        Assert.assertEquals(Double.POSITIVE_INFINITY, MathArrays.safeNorm(v), EPSILON);
    }

    @Test
    public void testSafeNormSmallValues() {
        double[] v = {Double.MIN_VALUE, Double.MIN_VALUE};
        Assert.assertEquals(2.0 * Double.MIN_VALUE, MathArrays.safeNorm(v), EPSILON);
    }

    @Test
    public void testSortInPlaceIncreasing() throws DimensionMismatchException, NullArgumentException {
        double[] x = {3.0, 1.0, 2.0};
        double[] y1 = {30.0, 10.0, 20.0};
        double[] y2 = {300.0, 100.0, 200.0};
        MathArrays.sortInPlace(x, MathArrays.OrderDirection.INCREASING, y1, y2);
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 3.0}, x, EPSILON);
        Assert.assertArrayEquals(new double[]{10.0, 20.0, 30.0}, y1, EPSILON);
        Assert.assertArrayEquals(new double[]{100.0, 200.0, 300.0}, y2, EPSILON);
    }

    @Test
    public void testSortInPlaceDecreasing() throws DimensionMismatchException, NullArgumentException {
        double[] x = {3.0, 1.0, 2.0};
        double[] y1 = {30.0, 10.0, 20.0};
        MathArrays.sortInPlace(x, MathArrays.OrderDirection.DECREASING, y1);
        Assert.assertArrayEquals(new double[]{3.0, 2.0, 1.0}, x, EPSILON);
        Assert.assertArrayEquals(new double[]{30.0, 20.0, 10.0}, y1, EPSILON);
    }

    @Test(expected = NullArgumentException.class)
    public void testSortInPlaceNullX() throws DimensionMismatchException, NullArgumentException {
        MathArrays.sortInPlace(null, MathArrays.OrderDirection.INCREASING);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSortInPlaceDimensionMismatch() throws DimensionMismatchException, NullArgumentException {
        double[] x = {1.0, 2.0};
        double[] y = {1.0};
        MathArrays.sortInPlace(x, MathArrays.OrderDirection.INCREASING, y);
    }

    @Test
    public void testCopyOfInt() {
        int[] source = {1, 2, 3};
        int[] result = MathArrays.copyOf(source);
        Assert.assertArrayEquals(source, result);
        for (int i = 0; i < source.length; i++) {
            Assert.assertEquals(source[i], result[i]);
        }
    }

    @Test
    public void testCopyOfDouble() {
        double[] source = {1.0, 2.0, 3.0};
        double[] result = MathArrays.copyOf(source);
        Assert.assertArrayEquals(source, result, EPSILON);
    }

    @Test
    public void testCopyOfIntLen() {
        int[] source = {1, 2, 3, 4};
        int[] result = MathArrays.copyOf(source, 2);
        Assert.assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void testCopyOfDoubleLenLonger() {
        double[] source = {1.0, 2.0};
        double[] result = MathArrays.copyOf(source, 4);
        Assert.assertEquals(4, result.length);
        Assert.assertEquals(1.0, result[0], EPSILON);
        Assert.assertEquals(2.0, result[1], EPSILON);
        Assert.assertEquals(0.0, result[2], EPSILON);
    }

    @Test
    public void testLinearCombinationValid() {
        double[] a = {1.0, 2.0, 3.0};
        double[] b = {4.0, 5.0, 6.0};
        double expected = 4.0 + 10.0 + 18.0;
        Assert.assertEquals(expected, MathArrays.linearCombination(a, b), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testLinearCombinationDimensionMismatch() {
        double[] a = {1.0, 2.0};
        double[] b = {1.0};
        MathArrays.linearCombination(a, b);
    }

    @Test
    public void testLinearCombinationLargeValues() {
        double[] a = {Double.MAX_VALUE, Double.MAX_VALUE};
        double[] b = {Double.MAX_VALUE, Double.MAX_VALUE};
        Assert.assertEquals(Double.POSITIVE_INFINITY, MathArrays.linearCombination(a, b), EPSILON);
    }

    @Test
    public void testEqualsFloatArrayNullBoth() {
        Assert.assertTrue(MathArrays.equals((float[]) null, (float[]) null));
    }

    @Test
    public void testEqualsFloatArrayFirstNull() {
        float[] y = {1.0f};
        Assert.assertFalse(MathArrays.equals((float[]) null, y));
    }

    @Test
    public void testEqualsFloatArraySecondNull() {
        float[] x = {1.0f};
        Assert.assertFalse(MathArrays.equals(x, (float[]) null));
    }

    @Test
    public void testEqualsFloatArrayLengthMismatch() {
        float[] x = {1.0f};
        float[] y = {1.0f, 2.0f};
        Assert.assertFalse(MathArrays.equals(x, y));
    }

    @Test
    public void testEqualsFloatArrayEqual() {
        float[] x = {1.0f, 2.0f, 3.0f};
        float[] y = {1.0f, 2.0f, 3.0f};
        Assert.assertTrue(MathArrays.equals(x, y));
    }

    @Test
    public void testEqualsFloatArrayNotEqual() {
        float[] x = {1.0f, 2.0f, 3.0f};
        float[] y = {1.0f, 2.0f, 4.0f};
        Assert.assertFalse(MathArrays.equals(x, y));
    }

    @Test
    public void testEqualsIncludingNaNFloatArrayBothNaN() {
        float[] x = {Float.NaN};
        float[] y = {Float.NaN};
        Assert.assertTrue(MathArrays.equalsIncludingNaN(x, y));
    }

    @Test
    public void testEqualsIncludingNaNFloatArrayNotNaN() {
        float[] x = {1.0f};
        float[] y = {1.0f};
        Assert.assertTrue(MathArrays.equalsIncludingNaN(x, y));
    }

    @Test
    public void testEqualsIncludingNaNFloatArrayFirstNaN() {
        float[] x = {Float.NaN};
        float[] y = {1.0f};
        Assert.assertFalse(MathArrays.equalsIncludingNaN(x, y));
    }

    @Test
    public void testEqualsDoubleArrayNullBoth() {
        Assert.assertTrue(MathArrays.equals((double[]) null, (double[]) null));
    }

    @Test
    public void testEqualsDoubleArrayFirstNull() {
        double[] y = {1.0};
        Assert.assertFalse(MathArrays.equals((double[]) null, y));
    }

    @Test
    public void testEqualsDoubleArraySecondNull() {
        double[] x = {1.0};
        Assert.assertFalse(MathArrays.equals(x, (double[]) null));
    }

    @Test
    public void testEqualsDoubleArrayLengthMismatch() {
        double[] x = {1.0};
        double[] y = {1.0, 2.0};
        Assert.assertFalse(MathArrays.equals(x, y));
    }

    @Test
    public void testEqualsDoubleArrayEqual() {
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {1.0, 2.0, 3.0};
        Assert.assertTrue(MathArrays.equals(x, y));
    }

    @Test
    public void testEqualsIncludingNaNDoubleArrayBothNaN() {
        double[] x = {Double.NaN};
        double[] y = {Double.NaN};
        Assert.assertTrue(MathArrays.equalsIncludingNaN(x, y));
    }

    @Test
    public void testNormalizeArrayValid() {
        double[] values = {3.0, 4.0, 3.0};
        double[] result = MathArrays.normalizeArray(values, 10.0);
        Assert.assertEquals(10.0, result[0] + result[1] + result[2], EPSILON);
        Assert.assertEquals(3.0, result[0], EPSILON);
        Assert.assertEquals(4.0, result[1], EPSILON);
        Assert.assertEquals(3.0, result[2], EPSILON);
    }

    @Test
    public void testNormalizeArrayAllNaN() {
        double[] values = {Double.NaN, Double.NaN};
        double[] result = MathArrays.normalizeArray(values, 5.0);
        Assert.assertEquals(5.0, result[0] + result[1], EPSILON);
    }

    @Test
    public void testNormalizeArrayInfiniteTarget() {
        double[] values = {1.0, 2.0};
        try {
            MathArrays.normalizeArray(values, Double.POSITIVE_INFINITY);
            Assert.fail("Expected MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
        }
    }

    @Test
    public void testBuildArray() {
        org.apache.commons.math3.Field<Double> field = null;
        try {
            MathArrays.buildArray(field, 5);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testBuildArray2D() {
        org.apache.commons.math3.Field<Double> field = null;
        try {
            MathArrays.buildArray(field, 2, 3);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testConvolveValid() {
        double[] x = {1.0, 2.0};
        double[] h = {3.0, 4.0};
        double[] result = MathArrays.convolve(x, h);
        Assert.assertEquals(3, result.length);
        Assert.assertEquals(3.0, result[0], EPSILON);
        Assert.assertEquals(10.0, result[1], EPSILON);
        Assert.assertEquals(8.0, result[2], EPSILON);
    }

    @Test
    public void testConvolveZeroLengthX() {
        double[] x = {};
        double[] h = {1.0};
        double[] result = MathArrays.convolve(x, h);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void testConvolveZeroLengthH() {
        double[] x = {1.0};
        double[] h = {};
        double[] result = MathArrays.convolve(x, h);
        Assert.assertEquals(0, result.length);
    }
}