package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.apache.commons.math.exception.NullArgumentException;

public class VarianceTest {
    private Variance variance;
    private static final double EPSILON = 1e-10;

    @Before
    public void setUp() {
        variance = new Variance();
    }

    @Test
    public void testDefaultConstructor() {
        assertTrue(variance.isBiasCorrected());
        assertEquals(0L, variance.getN());
        assertTrue(Double.isNaN(variance.getResult()));
        variance.increment(2.0);
        assertEquals(0.0, variance.getResult(), EPSILON);
    }

    @Test
    public void testIncrementAndGetResult() {
        variance.increment(1.0);
        variance.increment(2.0);
        variance.increment(3.0);
        assertEquals(3L, variance.getN());
        assertEquals(1.0, variance.getResult(), EPSILON);
    }

    @Test
    public void testIncrementOneValue() {
        variance.increment(5.0);
        assertEquals(0.0, variance.getResult(), EPSILON);
    }

    @Test
    public void testIncrementNoValues() {
        assertTrue(Double.isNaN(variance.getResult()));
    }

    @Test
    public void testEvaluateArray() {
        double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals(2.5, variance.evaluate(values), EPSILON);
    }

    @Test
    public void testEvaluateEmptyArray() {
        double[] values = {};
        assertTrue(Double.isNaN(variance.evaluate(values)));
    }

    @Test(expected = NullArgumentException.class)
    public void testEvaluateNullArray() {
        variance.evaluate(null);
    }

    @Test
    public void testEvaluateSingleValue() {
        double[] values = {5.0};
        assertEquals(0.0, variance.evaluate(values), EPSILON);
    }

    @Test
    public void testEvaluateSubarray() {
        double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals(1.0, variance.evaluate(values, 1, 3), EPSILON);
    }

    @Test
    public void testEvaluateWithMean() {
        double[] values = {2.0, 4.0, 6.0, 8.0, 10.0};
        assertEquals(10.0, variance.evaluate(values, 6.0), EPSILON);
    }

    @Test
    public void testEvaluateWithMeanSubarray() {
        double[] values = {2.0, 4.0, 6.0, 8.0, 10.0};
        assertEquals(4.0, variance.evaluate(values, 6.0, 1, 3), EPSILON);
    }

    @Test
    public void testEvaluateWeighted() {
        double[] values = {1.0, 2.0, 3.0, 4.0};
        double[] weights = {1.0, 1.0, 1.0, 1.0};
        assertEquals(1.6666666667, variance.evaluate(values, weights), 1e-9);
    }

    @Test
    public void testEvaluateWeightedWithMean() {
        double[] values = {1.0, 2.0, 3.0, 4.0};
        double[] weights = {1.0, 1.0, 1.0, 1.0};
        double weightedMean = 2.5;
        assertEquals(1.6666666667, variance.evaluate(values, weights, weightedMean), 1e-9);
    }

    @Test
    public void testEvaluateWeightedWithMeanSubarray() {
        double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] weights = {1.0, 1.0, 1.0, 1.0, 1.0};
        double weightedMean = 3.0;
        assertEquals(1.6666666667, variance.evaluate(values, weights, weightedMean, 1, 3), 1e-9);
    }

    @Test(expected = NullArgumentException.class)
    public void testEvaluateWeightedNullValues() {
        variance.evaluate(null, new double[]{1.0});
    }

    @Test(expected = NullArgumentException.class)
    public void testEvaluateWeightedNullWeights() {
        variance.evaluate(new double[]{1.0}, null);
    }

    @Test(expected = NullArgumentException.class)
    public void testEvaluateWeightedNullBoth() {
        variance.evaluate(null, null);
    }

    @Test
    public void testSetBiasCorrectedFalse() {
        variance.setBiasCorrected(false);
        assertFalse(variance.isBiasCorrected());
        variance.increment(1.0);
        variance.increment(2.0);
        variance.increment(3.0);
        assertEquals(0.6666666667, variance.getResult(), 1e-9);
    }

    @Test
    public void testClear() {
        variance.increment(1.0);
        variance.increment(2.0);
        variance.clear();
        assertEquals(0L, variance.getN());
        assertTrue(Double.isNaN(variance.getResult()));
    }

    @Test
    public void testCopyConstructor() {
        variance.increment(1.0);
        variance.increment(2.0);
        Variance copied = new Variance(variance);
        assertEquals(variance.getResult(), copied.getResult(), EPSILON);
        assertEquals(variance.getN(), copied.getN());
    }

    @Test
    public void testCopyStatic() {
        variance.increment(1.0);
        variance.increment(2.0);
        Variance dest = new Variance();
        Variance.copy(variance, dest);
        assertEquals(variance.getResult(), dest.getResult(), EPSILON);
        assertEquals(variance.getN(), dest.getN());
    }

    @Test
    public void testSecondMomentConstructor() {
        SecondMoment m2 = new SecondMoment();
        Variance v = new Variance(m2);
        v.increment(1.0);
        assertEquals(0L, v.getN()); // incMoment is false, so n remains 0
        m2.increment(1.0);
        m2.increment(2.0);
        m2.increment(3.0);
        assertEquals(1.0, v.getResult(), EPSILON);
    }

    @Test
    public void testBiasCorrectedConstructor() {
        Variance v = new Variance(false);
        assertFalse(v.isBiasCorrected());
        v.increment(1.0);
        v.increment(2.0);
        v.increment(3.0);
        assertEquals(0.6666666667, v.getResult(), 1e-9);
    }

    @Test
    public void testFullConstructor() {
        SecondMoment m2 = new SecondMoment();
        Variance v = new Variance(false, m2);
        assertFalse(v.isBiasCorrected());
        assertEquals(0L, v.getN());
    }

    @Test
    public void testEvaluateWithInvalidRange() {
        double[] values = {1.0, 2.0, 3.0};
        try {
            variance.evaluate(values, 0, 4);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testEvaluateWithNegativeBegin() {
        double[] values = {1.0, 2.0, 3.0};
        try {
            variance.evaluate(values, -1, 2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testEvaluateWithZeroLength() {
        double[] values = {};
        assertTrue(Double.isNaN(variance.evaluate(values, 0, 0)));
    }

    @Test
    public void testEvaluateWeightedZeroLength() {
        double[] values = {};
        double[] weights = {};
        assertTrue(Double.isNaN(variance.evaluate(values, weights)));
    }

    @Test
    public void testEvaluateWeightedWithMissingValues() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 0.0, 1.0};
        assertEquals(1.0, variance.evaluate(values, weights), EPSILON);
    }

    @Test
    public void evaluateWithNaNValues() {
        double[] values = {Double.NaN, 2.0, 3.0};
        assertTrue(Double.isNaN(variance.evaluate(values)));
    }

    @Test
    public void evaluateWithInfiniteValues() {
        double[] values = {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
        assertTrue(Double.isNaN(variance.evaluate(values)));
    }

    @Test
    public void testGetResultAfterClear() {
        variance.increment(1.0);
        variance.clear();
        assertTrue(Double.isNaN(variance.getResult()));
        assertEquals(0L, variance.getN());
    }

    @Test
    public void testMultipleIncrements() {
        for (int i = 1; i <= 10; i++) {
            variance.increment(i);
        }
        assertEquals(8.3333333333, variance.getResult(), 1e-9);
        assertEquals(10L, variance.getN());
    }

    @Test
    public void testPrivateBiasCorrectedField() {
        Variance v = new Variance();
        assertTrue(v.isBiasCorrected());
        v.setBiasCorrected(false);
        assertFalse(v.isBiasCorrected());
        v.setBiasCorrected(true);
        assertTrue(v.isBiasCorrected());
    }
}