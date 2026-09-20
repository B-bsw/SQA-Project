package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Automated Unit Test Suite for {@link UniformRealDistribution}.
 * Target Compatibility: Java 7 / JUnit 4.
 */
public class UniformRealDistributionTest {

    private static final double EPSILON = 1e-12;

    /**
     * Deterministic implementation of RandomGenerator for reproducible unit testing.
     */
    private static class FixedValueRandomGenerator implements RandomGenerator {
        private double fixedDoubleValue;

        public FixedValueRandomGenerator(double fixedDoubleValue) {
            this.fixedDoubleValue = fixedDoubleValue;
        }

        public void setFixedDoubleValue(double fixedDoubleValue) {
            this.fixedDoubleValue = fixedDoubleValue;
        }

        public void setSeed(int seed) {}
        public void setSeed(int[] seed) {}
        public void setSeed(long seed) {}
        public void nextBytes(byte[] bytes) {}
        public int nextInt() { return 0; }
        public int nextInt(int n) { return 0; }
        public long nextLong() { return 0L; }
        public boolean nextBoolean() { return false; }
        public float nextFloat() { return 0.0f; }
        public double nextDouble() { return fixedDoubleValue; }
        public double nextGaussian() { return 0.0; }
    }

    // ==========================================
    // 1. Constructor Happy Path Tests
    // ==========================================

    @Test
    public void defaultConstructor_givenNoParameters_shouldInitializeStandardBounds() {
        // Arrange & Act
        UniformRealDistribution dist = new UniformRealDistribution();

        // Assert
        Assert.assertEquals(0.0, dist.getSupportLowerBound(), EPSILON);
        Assert.assertEquals(1.0, dist.getSupportUpperBound(), EPSILON);
        Assert.assertEquals(UniformRealDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY,
                dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    @Test
    public void twoArgConstructor_givenValidBounds_shouldInitializeProperly() {
        // Arrange & Act
        double lower = -2.5;
        double upper = 7.5;
        UniformRealDistribution dist = new UniformRealDistribution(lower, upper);

        // Assert
        Assert.assertEquals(lower, dist.getSupportLowerBound(), EPSILON);
        Assert.assertEquals(upper, dist.getSupportUpperBound(), EPSILON);
        Assert.assertEquals(UniformRealDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY,
                dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    @Test
    public void threeArgConstructor_givenCustomAccuracy_shouldInitializeProperly() {
        // Arrange & Act
        double lower = 10.0;
        double upper = 20.0;
        double accuracy = 1e-6;
        UniformRealDistribution dist = new UniformRealDistribution(lower, upper, accuracy);

        // Assert
        Assert.assertEquals(lower, dist.getSupportLowerBound(), EPSILON);
        Assert.assertEquals(upper, dist.getSupportUpperBound(), EPSILON);
        Assert.assertEquals(accuracy, dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    @Test
    public void fourArgConstructor_givenCustomRngAndAccuracy_shouldInitializeProperly() {
        // Arrange
        RandomGenerator rng = new FixedValueRandomGenerator(0.5);
        double lower = 1.0;
        double upper = 5.0;
        double accuracy = 1e-5;

        // Act
        UniformRealDistribution dist = new UniformRealDistribution(rng, lower, upper, accuracy);

        // Assert
        Assert.assertEquals(lower, dist.getSupportLowerBound(), EPSILON);
        Assert.assertEquals(upper, dist.getSupportUpperBound(), EPSILON);
        Assert.assertEquals(accuracy, dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    // ==========================================
    // 2. Constructor Exception & Error Branch Tests
    // ==========================================

    @Test(expected = NumberIsTooLargeException.class)
    public void twoArgConstructor_givenLowerEqualToUpper_shouldThrowException() {
        // Arrange & Act
        new UniformRealDistribution(2.0, 2.0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void twoArgConstructor_givenLowerGreaterThanUpper_shouldThrowException() {
        // Arrange & Act
        new UniformRealDistribution(5.0, 3.0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void threeArgConstructor_givenLowerEqualToUpper_shouldThrowException() {
        // Arrange & Act
        new UniformRealDistribution(1.0, 1.0, 1e-8);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void threeArgConstructor_givenLowerGreaterThanUpper_shouldThrowException() {
        // Arrange & Act
        new UniformRealDistribution(2.0, -1.0, 1e-8);
    }

    @Test
    public void fourArgConstructor_givenLowerGreaterThanUpper_shouldThrowExceptionWithCorrectDetails() {
        // Arrange
        RandomGenerator rng = new FixedValueRandomGenerator(0.0);
        double lower = 10.0;
        double upper = 5.0;

        // Act & Assert
        try {
            new UniformRealDistribution(rng, lower, upper, 1e-9);
            Assert.fail("Expected NumberIsTooLargeException was not thrown");
        } catch (NumberIsTooLargeException ex) {
            Assert.assertEquals(lower, ex.getArgument().doubleValue(), EPSILON);
            Assert.assertEquals(upper, ex.getMax().doubleValue(), EPSILON);
        }
    }

    @Test
    public void fourArgConstructor_givenLowerEqualToUpper_shouldThrowExceptionWithCorrectDetails() {
        // Arrange
        RandomGenerator rng = new FixedValueRandomGenerator(0.0);
        double bound = 4.0;

        // Act & Assert
        try {
            new UniformRealDistribution(rng, bound, bound, 1e-9);
            Assert.fail("Expected NumberIsTooLargeException was not thrown");
        } catch (NumberIsTooLargeException ex) {
            Assert.assertEquals(bound, ex.getArgument().doubleValue(), EPSILON);
            Assert.assertEquals(bound, ex.getMax().doubleValue(), EPSILON);
        }
    }

    // ==========================================
    // 3. Density Branch Tests
    // ==========================================

    @Test
    public void density_givenXLessThanLower_shouldReturnZero() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 6.0);

        // Act
        double result = dist.density(1.999999);

        // Assert
        Assert.assertEquals(0.0, result, EPSILON);
    }

    @Test
    public void density_givenXGreaterThanUpper_shouldReturnZero() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 6.0);

        // Act
        double result = dist.density(6.000001);

        // Assert
        Assert.assertEquals(0.0, result, EPSILON);
    }

    @Test
    public void density_givenXEqualToLower_shouldReturnReciprocalOfRange() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 6.0);

        // Act
        double result = dist.density(2.0);

        // Assert
        Assert.assertEquals(0.25, result, EPSILON);
    }

    @Test
    public void density_givenXEqualToUpper_shouldReturnReciprocalOfRange() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 6.0);

        // Act
        double result = dist.density(6.0);

        // Assert
        Assert.assertEquals(0.25, result, EPSILON);
    }

    @Test
    public void density_givenXWithinBounds_shouldReturnReciprocalOfRange() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 6.0);

        // Act
        double result = dist.density(4.0);

        // Assert
        Assert.assertEquals(0.25, result, EPSILON);
    }

    @Test
    public void density_givenExtremeNegativeAndPositiveValues_shouldHandleProperly() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(-100.0, 100.0);

        // Act & Assert
        Assert.assertEquals(0.0, dist.density(Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(0.0, dist.density(Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(0.0, dist.density(-100.1), EPSILON);
        Assert.assertEquals(0.005, dist.density(0.0), EPSILON);
        Assert.assertEquals(0.0, dist.density(100.1), EPSILON);
    }

    // ==========================================
    // 4. Cumulative Probability Branch Tests
    // ==========================================

    @Test
    public void cumulativeProbability_givenXLessThanLower_shouldReturnZero() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 10.0);

        // Act
        double result = dist.cumulativeProbability(1.5);

        // Assert
        Assert.assertEquals(0.0, result, EPSILON);
    }

    @Test
    public void cumulativeProbability_givenXEqualToLower_shouldReturnZero() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 10.0);

        // Act
        double result = dist.cumulativeProbability(2.0);

        // Assert
        Assert.assertEquals(0.0, result, EPSILON);
    }

    @Test
    public void cumulativeProbability_givenXEqualToUpper_shouldReturnOne() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 10.0);

        // Act
        double result = dist.cumulativeProbability(10.0);

        // Assert
        Assert.assertEquals(1.0, result, EPSILON);
    }

    @Test
    public void cumulativeProbability_givenXGreaterThanUpper_shouldReturnOne() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 10.0);

        // Act
        double result = dist.cumulativeProbability(15.0);

        // Assert
        Assert.assertEquals(1.0, result, EPSILON);
    }

    @Test
    public void cumulativeProbability_givenXBetweenLowerAndUpper_shouldReturnLinearRatio() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 10.0);

        // Act
        double resultAtQuarter = dist.cumulativeProbability(4.0);
        double resultAtHalf = dist.cumulativeProbability(6.0);
        double resultAtThreeQuarters = dist.cumulativeProbability(8.0);

        // Assert
        Assert.assertEquals(0.25, resultAtQuarter, EPSILON);
        Assert.assertEquals(0.5, resultAtHalf, EPSILON);
        Assert.assertEquals(0.75, resultAtThreeQuarters, EPSILON);
    }

    @Test
    public void cumulativeProbability_givenNegativeRange_shouldComputeAccurately() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(-8.0, -2.0);

        // Act & Assert
        Assert.assertEquals(0.0, dist.cumulativeProbability(-10.0), EPSILON);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-8.0), EPSILON);
        Assert.assertEquals(0.5, dist.cumulativeProbability(-5.0), EPSILON);
        Assert.assertEquals(1.0, dist.cumulativeProbability(-2.0), EPSILON);
        Assert.assertEquals(1.0, dist.cumulativeProbability(0.0), EPSILON);
    }

    // ==========================================
    // 5. Statistical Properties & Support Characteristics Tests
    // ==========================================

    @Test
    public void getNumericalMean_givenPositiveBounds_shouldReturnMidpoint() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(3.0, 7.0);

        // Act
        double mean = dist.getNumericalMean();

        // Assert
        Assert.assertEquals(5.0, mean, EPSILON);
    }

    @Test
    public void getNumericalMean_givenAsymmetricNegativeAndPositiveBounds_shouldReturnMidpoint() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(-10.0, 2.0);

        // Act
        double mean = dist.getNumericalMean();

        // Assert
        Assert.assertEquals(-4.0, mean, EPSILON);
    }

    @Test
    public void getNumericalVariance_givenBounds_shouldReturnCorrectVariance() {
        // Arrange: range = 6.0, (upper - lower)^2 / 12 = 36 / 12 = 3.0
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 8.0);

        // Act
        double variance = dist.getNumericalVariance();

        // Assert
        Assert.assertEquals(3.0, variance, EPSILON);
    }

    @Test
    public void getNumericalVariance_givenUnitInterval_shouldReturnOneTwelfth() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(0.0, 1.0);

        // Act
        double variance = dist.getNumericalVariance();

        // Assert
        Assert.assertEquals(1.0 / 12.0, variance, EPSILON);
    }

    @Test
    public void getSupportLowerBound_givenBounds_shouldReturnLower() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(-3.5, 4.5);

        // Act & Assert
        Assert.assertEquals(-3.5, dist.getSupportLowerBound(), EPSILON);
    }

    @Test
    public void getSupportUpperBound_givenBounds_shouldReturnUpper() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution(-3.5, 4.5);

        // Act & Assert
        Assert.assertEquals(4.5, dist.getSupportUpperBound(), EPSILON);
    }

    @Test
    public void isSupportLowerBoundInclusive_shouldAlwaysReturnTrue() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution();

        // Act & Assert
        Assert.assertTrue(dist.isSupportLowerBoundInclusive());
    }

    @Test
    public void isSupportUpperBoundInclusive_shouldAlwaysReturnFalse() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution();

        // Act & Assert
        Assert.assertFalse(dist.isSupportUpperBoundInclusive());
    }

    @Test
    public void isSupportConnected_shouldAlwaysReturnTrue() {
        // Arrange
        UniformRealDistribution dist = new UniformRealDistribution();

        // Act & Assert
        Assert.assertTrue(dist.isSupportConnected());
    }

    @Test
    public void getSolverAbsoluteAccuracy_givenCustomAccuracy_shouldReturnStoredAccuracy() {
        // Arrange
        double customAccuracy = 1e-4;
        UniformRealDistribution dist = new UniformRealDistribution(0.0, 1.0, customAccuracy);

        // Act
        double actualAccuracy = dist.getSolverAbsoluteAccuracy();

        // Assert
        Assert.assertEquals(customAccuracy, actualAccuracy, EPSILON);
    }

    // ==========================================
    // 6. Sampling Tests
    // ==========================================

    @Test
    public void sample_givenRandomZero_shouldReturnLowerBound() {
        // Arrange
        FixedValueRandomGenerator rng = new FixedValueRandomGenerator(0.0);
        UniformRealDistribution dist = new UniformRealDistribution(rng, 5.0, 15.0, 1e-9);

        // Act
        double sampledValue = dist.sample();

        // Assert
        Assert.assertEquals(5.0, sampledValue, EPSILON);
    }

    @Test
    public void sample_givenRandomOne_shouldReturnUpperBound() {
        // Arrange
        FixedValueRandomGenerator rng = new FixedValueRandomGenerator(1.0);
        UniformRealDistribution dist = new UniformRealDistribution(rng, 5.0, 15.0, 1e-9);

        // Act
        double sampledValue = dist.sample();

        // Assert
        Assert.assertEquals(15.0, sampledValue, EPSILON);
    }

    @Test
    public void sample_givenRandomHalf_shouldReturnMidpoint() {
        // Arrange
        FixedValueRandomGenerator rng = new FixedValueRandomGenerator(0.5);
        UniformRealDistribution dist = new UniformRealDistribution(rng, 10.0, 20.0, 1e-9);

        // Act
        double sampledValue = dist.sample();

        // Assert
        Assert.assertEquals(15.0, sampledValue, EPSILON);
    }

    @Test
    public void sample_givenRandomValueBetweenZeroAndOne_shouldInterpolateCorrectly() {
        // Arrange
        FixedValueRandomGenerator rng = new FixedValueRandomGenerator(0.25);
        UniformRealDistribution dist = new UniformRealDistribution(rng, -10.0, 10.0, 1e-9);

        // Act: 0.25 * 10 + 0.75 * (-10) = 2.5 - 7.5 = -5.0
        double sampledValue = dist.sample();

        // Assert
        Assert.assertEquals(-5.0, sampledValue, EPSILON);
    }
}