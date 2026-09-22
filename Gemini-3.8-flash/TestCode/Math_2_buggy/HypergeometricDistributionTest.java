package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;

/**
 * Comprehensive Unit Tests for {@link HypergeometricDistribution}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class HypergeometricDistributionTest {

    @Test
    public void parameters_shouldBeRetained() {
        // Arrange & Act
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 20, 10);

        // Assert
        assertEquals(100, dist.getPopulationSize());
        assertEquals(20, dist.getNumberOfSuccesses());
        assertEquals(10, dist.getSampleSize());
        assertEquals(2.0, dist.getNumericalMean(), 0.0001);
        assertEquals(0, dist.getSupportLowerBound());
        assertEquals(10, dist.getSupportUpperBound());
        assertTrue(dist.isSupportConnected());
    }

    @Test
    public void probabilityAndCumulative_shouldComputeCorrectProbabilities() {
        // Arrange: N=10, K=5, n=5
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);

        // Act & Assert
        double p0 = dist.probability(0);
        double p1 = dist.probability(1);
        double p2 = dist.probability(2);

        assertTrue(p0 > 0);
        assertTrue(p1 > p0);
        assertTrue(p2 > p1);

        assertEquals(0.0, dist.cumulativeProbability(-1), 0.0001);
        assertEquals(1.0, dist.cumulativeProbability(5), 0.0001);
        assertTrue(dist.cumulativeProbability(2) >= p0 + p1 + p2 - 0.0001);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void constructor_givenInvalidPopulationSize_shouldThrowException() {
        // Arrange & Act
        new HypergeometricDistribution(0, 5, 2);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void constructor_givenSampleSizeLargerThanPopulation_shouldThrowException() {
        // Arrange & Act
        new HypergeometricDistribution(10, 5, 15);
    }
}
