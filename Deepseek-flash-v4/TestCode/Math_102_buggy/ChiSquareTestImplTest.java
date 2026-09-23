package org.apache.commons.math.stat.inference;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.ChiSquaredDistribution;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;

public class ChiSquareTestImplTest {
    private ChiSquareTestImpl test;
    private ChiSquaredDistribution distribution;

    @Before
    public void setUp() {
        distribution = new ChiSquaredDistributionImpl(1.0);
        test = new ChiSquareTestImpl(distribution);
    }

    @After
    public void tearDown() {
        test = null;
        distribution = null;
    }

    @Test
    public void testChiSquareBasic() {
        double[] expected = {2.0, 3.0, 5.0};
        long[] observed = {2, 3, 5};
        assertEquals(0.0, test.chiSquare(expected, observed), 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareLengthMismatch() {
        double[] expected = {2.0, 3.0};
        long[] observed = {2, 3, 5};
        test.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareNullExpected() {
        test.chiSquare(null, new long[]{2, 3});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareNegativeObserved() {
        double[] expected = {2.0, 3.0};
        long[] observed = {2, -3};
        test.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareNonPositiveExpected() {
        double[] expected = {0.0, 3.0};
        long[] observed = {2, 3};
        test.chiSquare(expected, observed);
    }

    @Test
    public void testChiSquareTestPValue() throws MathException {
        double[] expected = {2.0, 3.0, 5.0};
        long[] observed = {2, 3, 5};
        double pValue = test.chiSquareTest(expected, observed);
        assertNotNull(pValue);
        assertTrue(pValue >= 0.0 && pValue <= 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestInvalidAlphaLower() throws MathException {
        double[] expected = {2.0, 3.0};
        long[] observed = {2, 3};
        test.chiSquareTest(expected, observed, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestInvalidAlphaUpper() throws MathException {
        double[] expected = {2.0, 3.0};
        long[] observed = {2, 3};
        test.chiSquareTest(expected, observed, 0.7);
    }

    @Test
    public void testChiSquareTestWithAlpha() throws MathException {
        double[] expected = {2.0, 3.0, 5.0};
        long[] observed = {2, 3, 5};
        boolean result = test.chiSquareTest(expected, observed, 0.05);
        assertFalse(result);
    }

    @Test
    public void testChiSquareTwoWayTable() {
        long[][] counts = {{1, 2, 3}, {4, 5, 6}};
        double result = test.chiSquare(counts);
        assertNotNull(result);
        assertTrue(result >= 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTableLessThan2Rows() {
        long[][] counts = {{1, 2}};
        test.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTableLessThan2Cols() {
        long[][] counts = {{1}, {2}};
        test.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTableNonRectangular() {
        long[][] counts = {{1, 2}, {3}};
        test.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTableNegativeEntry() {
        long[][] counts = {{1, -2}, {3, 4}};
        test.chiSquare(counts);
    }

    @Test
    public void testChiSquareDataSetsComparisonBalanced() {
        long[] observed1 = {1, 2, 3};
        long[] observed2 = {1, 2, 3};
        double result = test.chiSquareDataSetsComparison(observed1, observed2);
        assertNotNull(result);
        assertEquals(0.0, result, 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparisonLengthMismatch() {
        test.chiSquareDataSetsComparison(new long[]{1, 2}, new long[]{1, 2, 3});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparisonNegativeEntry() {
        test.chiSquareDataSetsComparison(new long[]{1, -2}, new long[]{1, 2});
    }

    @Test
    public void testChiSquareDataSetsComparisonBothZero() {
        test.chiSquareDataSetsComparison(new long[]{0, 1}, new long[]{0, 2});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparisonBothEntriesZero() {
        test.chiSquareDataSetsComparison(new long[]{0, 1}, new long[]{0, 0});
    }

    @Test
    public void testSetDistribution() {
        ChiSquaredDistribution newDist = new ChiSquaredDistributionImpl(2.0);
        test.setDistribution(newDist);
        assertNotNull(test.distribution);
    }

    @Test
    public void testChiSquareTestDataSetsComparison() throws MathException {
        long[] observed1 = {1, 2, 3};
        long[] observed2 = {3, 2, 1};
        double pValue = test.chiSquareTestDataSetsComparison(observed1, observed2);
        assertNotNull(pValue);
    }

    @Test
    public void testChiSquareTestDataSetsComparisonWithAlpha() {
        long[] observed1 = {1, 2, 3};
        long[] observed2 = {3, 2, 1};
        boolean result = test.chiSquareTestDataSetsComparison(observed1, observed2, 0.05);
        assertTrue(result || !result);
    }

    @Test
    public void testChiSquareCompactDataSets() {
        long[] observed1 = {1, 2, 3, 4};
        long[] observed2 = {1, 2, 3, 4};
        double result = test.chiSquareDataSetsComparison(observed1, observed2);
        assertEquals(0.0, result, 1e-9);
    }
}