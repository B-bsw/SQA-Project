package org.apache.commons.math.distribution;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.apache.commons.math.MathException;

public class NormalDistributionImplTest {

    private static final double DELTA = 1e-10;
    private NormalDistributionImpl distribution;

    @Before
    public void setUp() {
        distribution = new NormalDistributionImpl();
    }

    @After
    public void tearDown() {
        distribution = null;
    }

    @Test
    public void testDefaultConstructor() {
        Assert.assertEquals(0.0, distribution.getMean(), DELTA);
        Assert.assertEquals(1.0, distribution.getStandardDeviation(), DELTA);
    }

    @Test
    public void testParameterizedConstructor() {
        distribution = new NormalDistributionImpl(2.0, 3.0);
        Assert.assertEquals(2.0, distribution.getMean(), DELTA);
        Assert.assertEquals(3.0, distribution.getStandardDeviation(), DELTA);
    }

    @Test
    public void testSetMean() {
        distribution.setMean(5.0);
        Assert.assertEquals(5.0, distribution.getMean(), DELTA);
    }

    @Test
    public void testSetStandardDeviation() {
        distribution.setStandardDeviation(2.0);
        Assert.assertEquals(2.0, distribution.getStandardDeviation(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStandardDeviationNonPositive() {
        distribution.setStandardDeviation(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStandardDeviationNegative() {
        distribution.setStandardDeviation(-1.5);
    }

    @Test
    public void testCumulativeProbabilityAtMean() throws MathException {
        Assert.assertEquals(0.5, distribution.cumulativeProbability(0.0), DELTA);
    }

    @Test
    public void testCumulativeProbabilityPositiveInfinity() throws MathException {
        Assert.assertEquals(1.0, distribution.cumulativeProbability(Double.POSITIVE_INFINITY), DELTA);
    }

    @Test
    public void testCumulativeProbabilityNegativeInfinity() throws MathException {
        Assert.assertEquals(0.0, distribution.cumulativeProbability(Double.NEGATIVE_INFINITY), DELTA);
    }

    @Test
    public void testCumulativeProbabilityNormal() throws MathException {
        // P(Z < 1.96) approx 0.975
        double result = distribution.cumulativeProbability(1.96);
        Assert.assertEquals(0.9750021048517795, result, 1e-9);
    }

    @Test
    public void testCumulativeProbabilityNonZeroMean() throws MathException {
        distribution.setMean(10.0);
        distribution.setStandardDeviation(2.0);
        // P(X < 12) where X~N(10,4) => P(Z < 1) = 0.84134...
        double result = distribution.cumulativeProbability(12.0);
        Assert.assertEquals(0.8413447460685429, result, 1e-9);
    }

    @Test
    public void testCumulativeProbabilityTailLeft() throws MathException {
        distribution.setMean(0.0);
        distribution.setStandardDeviation(1.0);
        // x = -3 very small probability
        double result = distribution.cumulativeProbability(-30.0);
        Assert.assertEquals(0.0, result, 1e-320);
    }

    @Test
    public void testInverseCumulativeProbabilityZero() throws MathException {
        Assert.assertEquals(Double.NEGATIVE_INFINITY, distribution.inverseCumulativeProbability(0.0), 0.0);
    }

    @Test
    public void testInverseCumulativeProbabilityOne() throws MathException {
        Assert.assertEquals(Double.POSITIVE_INFINITY, distribution.inverseCumulativeProbability(1.0), 0.0);
    }

    @Test
    public void testInverseCumulativeProbabilityHalf() throws MathException {
        // For p=0.5, should equal mean
        Assert.assertEquals(distribution.getMean(), distribution.inverseCumulativeProbability(0.5), DELTA);
    }

    @Test
    public void testInverseCumulativeProbabilityLessThanHalf() throws MathException {
        distribution.setMean(2.0);
        distribution.setStandardDeviation(3.0);
        // p < 0.5, result should be < mean
        double p = 0.2;
        double result = distribution.inverseCumulativeProbability(p);
        Assert.assertTrue(result < 2.0);
    }

    @Test
    public void testInverseCumulativeProbabilityGreaterThanHalf() throws MathException {
        distribution.setMean(-1.0);
        distribution.setStandardDeviation(2.0);
        // p > 0.5, result should be > mean
        double p = 0.8;
        double result = distribution.inverseCumulativeProbability(p);
        Assert.assertTrue(result > -1.0);
    }

    @Test
    public void testInverseCumulativeProbabilityP0AndP1Boundaries() throws MathException {
        Assert.assertEquals(Double.NEGATIVE_INFINITY, distribution.inverseCumulativeProbability(0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, distribution.inverseCumulativeProbability(1.0), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbabilityInvalidLower() throws MathException {
        distribution.inverseCumulativeProbability(-0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbabilityInvalidUpper() throws MathException {
        distribution.inverseCumulativeProbability(1.1);
    }

    @Test
    public void testGetDomainLowerBoundLessThanHalf() {
        // p < 0.5, lower bound is -Double.MAX_VALUE
        Assert.assertEquals(-Double.MAX_VALUE, distribution.getDomainLowerBound(0.25), 0.0);
    }

    @Test
    public void testGetDomainLowerBoundGreaterThanOrEqualToHalf() {
        distribution.setMean(5.0);
        // p >= 0.5, lower bound is mean
        Assert.assertEquals(5.0, distribution.getDomainLowerBound(0.5), 0.0);
        Assert.assertEquals(5.0, distribution.getDomainLowerBound(0.75), 0.0);
    }

    @Test
    public void testGetDomainLowerBoundExactlyHalf() {
        distribution.setMean(-2.0);
        Assert.assertEquals(-2.0, distribution.getDomainLowerBound(0.5), 0.0);
    }

    @Test
    public void testGetInitialDomainWithProbabilityLessThanHalf() {
        distribution.setMean(3.0);
        distribution.setStandardDeviation(4.0);
        // p < 0.5, initial domain = mean - sd
        Assert.assertEquals(-1.0, distribution.getInitialDomain(0.25), DELTA);
    }

    @Test
    public void testGetInitialDomainWithProbabilityGreaterThanHalf() {
        distribution.setMean(-1.0);
        distribution.setStandardDeviation(2.0);
        // p > 0.5, initial domain = mean + sd
        Assert.assertEquals(1.0, distribution.getInitialDomain(0.75), DELTA);
    }

    @Test
    public void testGetInitialDomainWithProbabilityHalf() {
        distribution.setMean(7.0);
        distribution.setStandardDeviation(1.5);
        // p = 0.5, initial domain = mean
        Assert.assertEquals(7.0, distribution.getInitialDomain(0.5), DELTA);
    }

    @Test
    public void testCumulativeProbabilityMoreThan20StdDev() throws MathException {
        // x = 21 standard deviations above mean, should return ~1.0
        double result = distribution.cumulativeProbability(21.0);
        Assert.assertEquals(1.0, result, 1e-20);
    }

    @Test
    public void testCumulativeProbabilityLessThan20StdDev() throws MathException {
        // x = -21 standard deviations below mean
        double result = distribution.cumulativeProbability(-21.0);
        Assert.assertEquals(0.0, result, 1e-20);
    }

    @Test
    public void testInverseCumulativeProbabilityPCloseToZero() throws MathException {
        distribution.setMean(10.0);
        distribution.setStandardDeviation(2.0);
        double result = distribution.inverseCumulativeProbability(1e-6);
        // Expect value around mean - 4.7*sd = 10-9.4 = 0.6
        Assert.assertTrue(result < 1.0);
        Assert.assertTrue(result > -3.0);
    }

    @Test
    public void testInverseCumulativeProbabilityPCloseToOne() throws MathException {
        distribution.setMean(10.0);
        distribution.setStandardDeviation(2.0);
        double result = distribution.inverseCumulativeProbability(1 - 1e-6);
        Assert.assertTrue(result > 15.0);
        Assert.assertTrue(result < 25.0);
    }

    @Test
    public void testMeanAndStandardDeviationEffectOnCumulative() throws MathException {
        distribution.setMean(5.0);
        distribution.setStandardDeviation(2.0);
        double result = distribution.cumulativeProbability(5.0);
        Assert.assertEquals(0.5, result, DELTA);
    }

    @Test
    public void testGettersWorkAfterSetters() {
        distribution.setMean(1.5);
        distribution.setStandardDeviation(2.5);
        Assert.assertEquals(1.5, distribution.getMean(), DELTA);
        Assert.assertEquals(2.5, distribution.getStandardDeviation(), DELTA);
    }

    @Test
    public void testExtremeProbabilityCumulative() throws MathException {
        distribution.setMean(0.7);
        distribution.setStandardDeviation(1.3);
        double atMean = distribution.cumulativeProbability(0.7);
        Assert.assertEquals(0.5, atMean, DELTA);
    }
}