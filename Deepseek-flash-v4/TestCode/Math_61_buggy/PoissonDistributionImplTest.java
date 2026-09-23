package org.apache.commons.math.distribution;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.apache.commons.math.MathException;

public class PoissonDistributionImplTest {

    private PoissonDistributionImpl distribution;
    private static final double MEAN = 1.0;

    @Before
    public void setUp() {
        distribution = new PoissonDistributionImpl(MEAN);
    }

    @Test
    public void testConstructorValid() {
        PoissonDistributionImpl d = new PoissonDistributionImpl(2.0);
        assertEquals(2.0, d.getMean(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorMeanZero() {
        new PoissonDistributionImpl(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorMeanNegative() {
        new PoissonDistributionImpl(-1.0);
    }

    @Test
    public void testConstructorWithEpsilonAndMaxIterations() {
        PoissonDistributionImpl d = new PoissonDistributionImpl(3.0, 1e-8, 1000);
        assertEquals(3.0, d.getMean(), 0.0);
    }

    @Test
    public void testGetMean() {
        assertEquals(MEAN, distribution.getMean(), 0.0);
    }

    @Test
    public void testProbabilityNegative() {
        assertEquals(0.0, distribution.probability(-10), 0.0);
    }

    @Test
    public void testProbabilityZero() {
        double expected = Math.exp(-MEAN);
        assertEquals(expected, distribution.probability(0), 1e-15);
    }

    @Test
    public void testProbabilityPositive() {
        double p0 = distribution.probability(0);
        double p1 = distribution.probability(1);
        double p2 = distribution.probability(2);
        assertTrue(p1 > 0);
        assertTrue(p1 > p2);
        assertTrue(p0 + p1 + p2 <= 1.0);
    }

    @Test
    public void testProbabilityMaxInt() {
        assertEquals(0.0, distribution.probability(Integer.MAX_VALUE), 0.0);
    }

    @Test
    public void testCumulativeProbabilityNegative() throws MathException {
        assertEquals(0.0, distribution.cumulativeProbability(-5), 0.0);
    }

    @Test
    public void testCumulativeProbabilityMaxInt() throws MathException {
        assertEquals(1.0, distribution.cumulativeProbability(Integer.MAX_VALUE), 0.0);
    }

    @Test
    public void testCumulativeProbabilityZero() throws MathException {
        double expected = Math.exp(-1.0);
        assertEquals(expected, distribution.cumulativeProbability(0), 1e-12);
    }

    @Test
    public void testCumulativeProbabilityNormal() throws MathException {
        double expected = 0.9196986029286058;
        assertEquals(expected, distribution.cumulativeProbability(2), 1e-12);
    }

    @Test
    public void testNormalApproximateProbability() throws MathException {
        double prob = distribution.normalApproximateProbability(1);
        assertTrue(prob >= 0.0 && prob <= 1.0);
    }

    @Test
    public void testSample() throws MathException {
        int sample = distribution.sample();
        assertTrue(sample >= 0);
        assertTrue(sample <= 1000);
    }

    @Test
    public void testSampleSmallMean() throws MathException {
        PoissonDistributionImpl small = new PoissonDistributionImpl(0.5);
        int sample = small.sample();
        assertTrue(sample >= 0);
        assertTrue(sample <= 500);
    }

    @Test
    public void testSampleLargeMean() throws MathException {
        PoissonDistributionImpl large = new PoissonDistributionImpl(1000.0);
        int sample = large.sample();
        assertTrue(sample >= 0);
    }
}