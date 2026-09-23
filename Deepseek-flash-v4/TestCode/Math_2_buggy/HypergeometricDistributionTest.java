package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HypergeometricDistributionTest {

    private static final double EPSILON = 1e-9;

    @Before
    public void setUp() {
        // No setup needed for this test class
    }

    @After
    public void tearDown() {
        // No teardown needed
    }

    // Test constructor with valid parameters
    @Test
    public void testConstructorValid() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        assertEquals(10, dist.getPopulationSize());
        assertEquals(5, dist.getNumberOfSuccesses());
        assertEquals(3, dist.getSampleSize());
    }

    // Test constructor with custom RandomGenerator
    @Test
    public void testConstructorWithRandomGenerator() {
        HypergeometricDistribution dist = new HypergeometricDistribution(
            new org.apache.commons.math3.random.Well19937c(), 10, 5, 3);
        assertNotNull(dist);
    }

    // Test constructor with zero population size
    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorZeroPopulationSize() {
        new HypergeometricDistribution(0, 0, 1);
    }

    // Test constructor with negative population size
    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorNegativePopulationSize() {
        new HypergeometricDistribution(-5, 2, 3);
    }

    // Test constructor with negative number of successes
    @Test(expected = NotPositiveException.class)
    public void testConstructorNegativeNumberOfSuccesses() {
        new HypergeometricDistribution(10, -1, 3);
    }

    // Test constructor with negative sample size
    @Test(expected = NotPositiveException.class)
    public void testConstructorNegativeSampleSize() {
        new HypergeometricDistribution(10, 5, -3);
    }

    // Test constructor with numberOfSuccesses > populationSize
    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorSuccessesExceedsPopulation() {
        new HypergeometricDistribution(5, 10, 3);
    }

    // Test constructor with sampleSize > populationSize
    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorSampleExceedsPopulation() {
        new HypergeometricDistribution(5, 3, 10);
    }

    // Test getNumericalMean
    @Test
    public void testGetNumericalMean() {
        // N=10, m=5, n=3 => mean = 3*5/10 = 1.5
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        assertEquals(1.5, dist.getNumericalMean(), EPSILON);
    }

    // Test getNumericalVariance
    @Test
    public void testGetNumericalVariance() {
        // N=10, m=5, n=3 => variance = [3*5*(10-3)*(10-5)] / [10^2 * (10-1)] = 105/90 = 1.166666...
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        assertEquals(105.0/90.0, dist.getNumericalVariance(), EPSILON);
    }

    // Test getNumericalVariance with bound = N - 1 where variance = 0
    @Test
    public void testGetNumericalVarianceZero() {
        // N=5, m=5, n=5 => variance = [5*5*(0)*(0)] / [25*4] = 0
        HypergeometricDistribution dist = new HypergeometricDistribution(5, 5, 5);
        assertEquals(0.0, dist.getNumericalVariance(), EPSILON);
    }

    // Test getSupportLowerBound
    @Test
    public void testGetSupportLowerBound() {
        // max(0, n + m - N) = max(0, 3+5-10) = max(0, -2) = 0
        HypergeometricDistribution dist1 = new HypergeometricDistribution(10, 5, 3);
        assertEquals(0, dist1.getSupportLowerBound());

        // max(0, 7+8-10) = max(0, 5) = 5
        HypergeometricDistribution dist2 = new HypergeometricDistribution(10, 8, 7);
        assertEquals(5, dist2.getSupportLowerBound());
    }

    // Test getSupportUpperBound
    @Test
    public void testGetSupportUpperBound() {
        // min(m, n) = min(5, 4) = 4
        HypergeometricDistribution dist1 = new HypergeometricDistribution(10, 5, 4);
        assertEquals(4, dist1.getSupportUpperBound());

        // min(3, 7) = 3
        HypergeometricDistribution dist2 = new HypergeometricDistribution(10, 3, 7);
        assertEquals(3, dist2.getSupportUpperBound());
    }

    // Test isSupportConnected
    @Test
    public void testIsSupportConnected() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        assertTrue(dist.isSupportConnected());
    }

    // Test cumulativeProbability with x < lower domain
    @Test
    public void testCumulativeProbabilityBelowDomain() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        // lower domain = max(0, 3+5-10) = 0, x < 0
        assertEquals(0.0, dist.cumulativeProbability(-1), EPSILON);
    }

    // Test cumulativeProbability with x >= upper domain
    @Test
    public void testCumulativeProbabilityAboveDomain() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        // upper domain = min(5, 3) = 3, x >= 3 => sum all probabilities = 1
        assertEquals(1.0, dist.cumulativeProbability(3), EPSILON);
        assertEquals(1.0, dist.cumulativeProbability(10), EPSILON);
    }

    // Test cumulativeProbability within domain (boundary values)
    @Test
    public void testCumulativeProbabilityWithinDomain() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        
        // Check P(X <= 0) = probability(0)
        double expected0 = dist.probability(0);
        assertEquals(expected0, dist.cumulativeProbability(0), EPSILON);

        // Check P(X <= 1) = probability(0) + probability(1)
        double expected1 = dist.probability(0) + dist.probability(1);
        assertEquals(expected1, dist.cumulativeProbability(1), EPSILON);
    }

    // Test upperCumulativeProbability
    @Test
    public void testUpperCumulativeProbability() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        
        // upper CDF at x < lower domain => 1.0
        assertEquals(1.0, dist.upperCumulativeProbability(-1), EPSILON);
        
        // upper CDF at x >= upper domain => 0.0
        assertEquals(0.0, dist.upperCumulativeProbability(4), EPSILON);
        assertEquals(0.0, dist.upperCumulativeProbability(100), EPSILON);
        
        // upper CDF at x = 1: sum probabilities from 1 to upper bound
        double expected = 0.0;
        for (int i = 1; i <= 3; i++) {
            expected += dist.probability(i);
        }
        assertEquals(expected, dist.upperCumulativeProbability(1), EPSILON);
    }

    // Test multiple runs with different parameters to verify sum of probabilities = 1
    @Test
    public void testSumProbabilitiesInDomain() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        double sum = 0.0;
        for (int x = dist.getSupportLowerBound(); x <= dist.getSupportUpperBound(); x++) {
            sum += dist.probability(x);
        }
        assertEquals(1.0, sum, EPSILON);
    }

    // Test that getNumericalMean matches direct formula for another case
    @Test
    public void testGetNumericalMeanAnotherCase() {
        HypergeometricDistribution dist = new HypergeometricDistribution(20, 8, 5);
        assertEquals((5 * 8) / 20.0, dist.getNumericalMean(), EPSILON);
    }

    // Test that getNumericalVariance matches direct formula
    @Test
    public void testGetNumericalVarianceAnotherCase() {
        HypergeometricDistribution dist = new HypergeometricDistribution(20, 8, 5);
        double N = 20, m = 8, n = 5;
        double expectedVariance = (n * m * (N - n) * (N - m)) / (N * N * (N - 1));
        assertEquals(expectedVariance, dist.getNumericalVariance(), EPSILON);
    }

    // Test cumulativeProbability edge cases in a loop (0, 1, many)
    @Test
    public void testCumulativeProbabilityLoop() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        // 0 iteration already covered by belowDomain tests
        // 1 iteration: x in domain
        assertEquals(1.0, dist.cumulativeProbability(3), EPSILON);
        // many: multiple x
        assertEquals(1.0, dist.cumulativeProbability(10), EPSILON);
    }

    // Test branch where x0 == x1 in innerCumulativeProbability
    @Test
    public void testInnerCumulativeProbabilityEqualValues() {
        // Cannot test directly private, but cumulativeProbability with x = domain[0]
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        // lower domain = 0
        assertEquals(dist.probability(0), dist.cumulativeProbability(0), EPSILON);
    }

    // Test branch where x0 < x1 in innerCumulativeProbability (loop)
    @Test
    public void testInnerCumulativeProbabilityMultipleValues() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        // Sum of probabilities 0+1
        double expected = dist.probability(0) + dist.probability(1);
        assertEquals(expected, dist.cumulativeProbability(1), EPSILON);
    }

    // Test branch where x0 > x1 (negative dx) in upperCumulativeProbability
    @Test
    public void testUpperCumulativeProbabilityReverseLoop() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        // x inside (domain[0], domain[1]] - tests reverse loop in innerCumulativeProbability
        double expected = 0.0;
        for (int i = 2; i <= 3; i++) {
            expected += dist.probability(i);
        }
        assertEquals(expected, dist.upperCumulativeProbability(2), EPSILON);
    }
}