package org.apache.commons.math3.distribution;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.random.Well19937c;

public class UniformRealDistributionTest {

    private static final double EPSILON = 1e-9;
    private UniformRealDistribution distribution;
    private UniformRealDistribution standardDistribution;

    @Before
    public void setUp() {
        distribution = new UniformRealDistribution(-2.0, 4.0);
        standardDistribution = new UniformRealDistribution(0.0, 1.0);
    }

    @Test
    public void testDefaultConstructor() {
        UniformRealDistribution d = new UniformRealDistribution();
        assertEquals(0.0, d.getSupportLowerBound(), 0.0);
        assertEquals(1.0, d.getSupportUpperBound(), 0.0);
        assertEquals(0.5, d.getNumericalMean(), EPSILON);
    }

    @Test
    public void testConstructorWithBounds() {
        assertEquals(-2.0, distribution.getSupportLowerBound(), 0.0);
        assertEquals(4.0, distribution.getSupportUpperBound(), 0.0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorLowerEqualToUpperThrowsException() {
        new UniformRealDistribution(2.0, 2.0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorLowerGreaterThanUpperThrowsException() {
        new UniformRealDistribution(5.0, 1.0);
    }

    @Test
    public void testDensityAtLowerBoundary() {
        assertEquals(1.0 / (4.0 - (-2.0)), distribution.density(-2.0), EPSILON);
    }

    @Test
    public void testDensityAtUpperBoundary() {
        assertEquals(1.0 / 6.0, distribution.density(4.0), EPSILON);
    }

    @Test
    public void testDensityAboveUpperBoundary() {
        assertEquals(0.0, distribution.density(4.1), 0.0);
    }

    @Test
    public void testDensityBelowLowerBoundary() {
        assertEquals(0.0, distribution.density(-2.1), 0.0);
    }

    @Test
    public void testDensityInsideRange() {
        assertEquals(1.0 / 6.0, distribution.density(1.0), EPSILON);
    }

    @Test
    public void testDensityExactMiddle() {
        assertEquals(1.0 / 6.0, distribution.density(1.0), EPSILON);
    }

    @Test
    public void testCumulativeProbabilityBelowLower() {
        assertEquals(0.0, distribution.cumulativeProbability(-2.5), 0.0);
    }

    @Test
    public void testCumulativeProbabilityAtLowerBoundary() {
        assertEquals(0.0, distribution.cumulativeProbability(-2.0), 0.0);
    }

    @Test
    public void testCumulativeProbabilityInside() {
        assertEquals(0.5, distribution.cumulativeProbability(1.0), EPSILON);
    }

    @Test
    public void testCumulativeProbabilityAtUpperBoundary() {
        assertEquals(1.0, distribution.cumulativeProbability(4.0), 0.0);
    }

    @Test
    public void testCumulativeProbabilityAboveUpper() {
        assertEquals(1.0, distribution.cumulativeProbability(4.5), 0.0);
    }

    @Test
    public void testGetNumericalMean() {
        assertEquals(1.0, distribution.getNumericalMean(), EPSILON);
    }

    @Test
    public void testGetNumericalMeanStandard() {
        assertEquals(0.5, standardDistribution.getNumericalMean(), EPSILON);
    }

    @Test
    public void testGetNumericalVariance() {
        assertEquals((6.0 * 6.0) / 12.0, distribution.getNumericalVariance(), EPSILON);
    }

    @Test
    public void testGetNumericalVarianceStandard() {
        assertEquals(1.0 / 12.0, standardDistribution.getNumericalVariance(), EPSILON);
    }

    @Test
    public void testSupportLowerBoundInclusive() {
        assertTrue(distribution.isSupportLowerBoundInclusive());
    }

    @Test
    public void testSupportUpperBoundInclusive() {
        assertFalse(distribution.isSupportUpperBoundInclusive());
    }

    @Test
    public void testSupportConnected() {
        assertTrue(distribution.isSupportConnected());
    }

    @Test
    public void testSampleStandardDistribution() {
        double sample = standardDistribution.sample();
        assertTrue(sample >= 0.0 && sample < 1.0);
    }

    @Test
    public void testSampleBoundaryRange() {
        double sample = distribution.sample();
        assertTrue(sample >= -2.0 && sample < 4.0);
    }

    @Test
    public void testSampleWithCustomRandomGenerator() {
        UniformRealDistribution d = new UniformRealDistribution(
                new Well19937c(1234), 0.0, 10.0, 1e-9);
        double sample = d.sample();
        assertTrue(sample >= 0.0 && sample < 10.0);
    }

    @Test
    public void testGetSolverAbsoluteAccuracyDefault() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 1.0);
        assertEquals(UniformRealDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY,
                d.getSolverAbsoluteAccuracy(), 0.0);
    }

    @Test
    public void testGetSolverAbsoluteAccuracyCustom() {
        UniformRealDistribution d = new UniformRealDistribution(
                0.0, 1.0, 1e-7);
        assertEquals(1e-7, d.getSolverAbsoluteAccuracy(), 0.0);
    }

    @Test
    public void testDensityWithEmptySupportRange() {
        UniformRealDistribution d = new UniformRealDistribution(-1.0, 0.0);
        assertEquals(1.0, d.density(-0.5), EPSILON);
        assertEquals(1.0, d.density(0.0), EPSILON);
    }

    @Test
    public void testCumulativeProbabilityWithEmptyRange() {
        UniformRealDistribution d = new UniformRealDistribution(2.0, 2.0);
        assertEquals(1.0, d.cumulativeProbability(2.0), 0.0);
    }

    @Test
    public void testSampleWithZeroWidthDistribution() {
        UniformRealDistribution d = new UniformRealDistribution(5.0, 5.0);
        assertEquals(5.0, d.sample(), 0.0);
    }
}