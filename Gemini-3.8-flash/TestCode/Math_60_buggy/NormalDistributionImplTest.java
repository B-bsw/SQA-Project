package org.apache.commons.math.distribution;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.math.MathException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NormalDistributionImplTest {

    private static final double TOLERANCE = 1e-5;
    private NormalDistributionImpl defaultDistribution;
    private NormalDistributionImpl customDistribution;

    @Before
    public void setUp() {
        defaultDistribution = new NormalDistributionImpl();
        customDistribution = new NormalDistributionImpl(10.0, 2.5);
    }

    @Test
    public void defaultConstructor_givenNoArguments_shouldInitializeWithZeroMeanAndUnitVariance() {
        // Arrange & Act
        NormalDistributionImpl dist = new NormalDistributionImpl();

        // Assert
        Assert.assertEquals(0.0, dist.getMean(), TOLERANCE);
        Assert.assertEquals(1.0, dist.getStandardDeviation(), TOLERANCE);
    }

    @Test
    public void customConstructor_givenValidMeanAndStandardDeviation_shouldInitializeProperly() {
        // Arrange & Act
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 1.5);

        // Assert
        Assert.assertEquals(5.0, dist.getMean(), TOLERANCE);
        Assert.assertEquals(1.5, dist.getStandardDeviation(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void customConstructor_givenZeroStandardDeviation_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        new NormalDistributionImpl(0.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void customConstructor_givenNegativeStandardDeviation_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        new NormalDistributionImpl(0.0, -1.0);
    }

    @Test
    public void setMean_givenPositiveNegativeAndZero_shouldUpdateMeanCorrectly() {
        // Arrange
        NormalDistributionImpl dist = new NormalDistributionImpl();

        // Act & Assert - Positive
        dist.setMean(15.75);
        Assert.assertEquals(15.75, dist.getMean(), TOLERANCE);

        // Act & Assert - Negative
        dist.setMean(-22.5);
        Assert.assertEquals(-22.5, dist.getMean(), TOLERANCE);

        // Act & Assert - Zero
        dist.setMean(0.0);
        Assert.assertEquals(0.0, dist.getMean(), TOLERANCE);
    }

    @Test
    public void setStandardDeviation_givenPositiveValue_shouldUpdateStandardDeviation() {
        // Arrange
        NormalDistributionImpl dist = new NormalDistributionImpl();

        // Act
        dist.setStandardDeviation(3.14);

        // Assert
        Assert.assertEquals(3.14, dist.getStandardDeviation(), TOLERANCE);
    }

    @Test
    public void setStandardDeviation_givenZero_shouldThrowIllegalArgumentException() {
        // Arrange
        NormalDistributionImpl dist = new NormalDistributionImpl();

        // Act & Assert
        try {
            dist.setStandardDeviation(0.0);
            Assert.fail("Expected IllegalArgumentException for standard deviation of 0.0");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("Standard deviation must be positive.", ex.getMessage());
        }
    }

    @Test
    public void setStandardDeviation_givenNegativeValue_shouldThrowIllegalArgumentException() {
        // Arrange
        NormalDistributionImpl dist = new NormalDistributionImpl();

        // Act & Assert
        try {
            dist.setStandardDeviation(-0.0001);
            Assert.fail("Expected IllegalArgumentException for negative standard deviation");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("Standard deviation must be positive.", ex.getMessage());
        }
    }

    @Test
    public void cumulativeProbability_givenMeanValue_shouldReturnHalf() throws MathException {
        // Arrange & Act
        double resultDefault = defaultDistribution.cumulativeProbability(0.0);
        double resultCustom = customDistribution.cumulativeProbability(10.0);

        // Assert
        Assert.assertEquals(0.5, resultDefault, TOLERANCE);
        Assert.assertEquals(0.5, resultCustom, TOLERANCE);
    }

    @Test
    public void cumulativeProbability_givenKnownStandardDeviations_shouldMatchNormalDistributionTable() throws MathException {
        // Arrange
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);

        // Act & Assert
        // P(X < 1.96) ~ 0.975
        Assert.assertEquals(0.975, dist.cumulativeProbability(1.959963984540054), 1e-4);
        // P(X < -1.96) ~ 0.025
        Assert.assertEquals(0.025, dist.cumulativeProbability(-1.959963984540054), 1e-4);
        // P(X < 1.0) ~ 0.84134
        Assert.assertEquals(0.8413447, dist.cumulativeProbability(1.0), 1e-4);
        // P(X < -1.0) ~ 0.15866
        Assert.assertEquals(0.1586553, dist.cumulativeProbability(-1.0), 1e-4);
    }

    @Test
    public void cumulativeProbability_givenExtremeValues_shouldApproachZeroAndOne() throws MathException {
        // Arrange
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);

        // Act & Assert
        Assert.assertEquals(1.0, dist.cumulativeProbability(100.0), TOLERANCE);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-100.0), TOLERANCE);
    }

    @Test
    public void inverseCumulativeProbability_givenProbabilityZero_shouldReturnNegativeInfinity() throws MathException {
        // Arrange & Act
        double result = defaultDistribution.inverseCumulativeProbability(0.0);

        // Assert
        Assert.assertEquals(Double.NEGATIVE_INFINITY, result, 0.0);
    }

    @Test
    public void inverseCumulativeProbability_givenProbabilityOne_shouldReturnPositiveInfinity() throws MathException {
        // Arrange & Act
        double result = defaultDistribution.inverseCumulativeProbability(1.0);

        // Assert
        Assert.assertEquals(Double.POSITIVE_INFINITY, result, 0.0);
    }

    @Test
    public void inverseCumulativeProbability_givenProbabilityHalf_shouldReturnMean() throws MathException {
        // Arrange & Act
        double resultDefault = defaultDistribution.inverseCumulativeProbability(0.5);
        double resultCustom = customDistribution.inverseCumulativeProbability(0.5);

        // Assert
        Assert.assertEquals(0.0, resultDefault, TOLERANCE);
        Assert.assertEquals(10.0, resultCustom, TOLERANCE);
    }

    @Test
    public void inverseCumulativeProbability_givenStandardProbabilities_shouldReturnCorrectQuantiles() throws MathException {
        // Arrange
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);

        // Act & Assert
        Assert.assertEquals(1.95996, dist.inverseCumulativeProbability(0.975), 1e-3);
        Assert.assertEquals(-1.95996, dist.inverseCumulativeProbability(0.025), 1e-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void inverseCumulativeProbability_givenNegativeProbability_shouldThrowIllegalArgumentException() throws MathException {
        // Arrange, Act & Assert
        defaultDistribution.inverseCumulativeProbability(-0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void inverseCumulativeProbability_givenProbabilityGreaterThanOne_shouldThrowIllegalArgumentException() throws MathException {
        // Arrange, Act & Assert
        defaultDistribution.inverseCumulativeProbability(1.01);
    }

    @Test
    public void getDomainLowerBound_givenProbabilityLessThanHalf_shouldReturnNegativeDoubleMax() {
        // Arrange & Act
        double boundDefault = defaultDistribution.getDomainLowerBound(0.25);
        double boundZero = defaultDistribution.getDomainLowerBound(0.0);

        // Assert
        Assert.assertEquals(-Double.MAX_VALUE, boundDefault, 0.0);
        Assert.assertEquals(-Double.MAX_VALUE, boundZero, 0.0);
    }

    @Test
    public void getDomainLowerBound_givenProbabilityGreaterOrEqualToHalf_shouldReturnMean() {
        // Arrange & Act
        double boundHalfDefault = defaultDistribution.getDomainLowerBound(0.5);
        double boundAboveDefault = defaultDistribution.getDomainLowerBound(0.75);
        double boundHalfCustom = customDistribution.getDomainLowerBound(0.5);

        // Assert
        Assert.assertEquals(0.0, boundHalfDefault, TOLERANCE);
        Assert.assertEquals(0.0, boundAboveDefault, TOLERANCE);
        Assert.assertEquals(10.0, boundHalfCustom, TOLERANCE);
    }

    @Test
    public void getDomainUpperBound_givenProbabilityLessThanHalf_shouldReturnMean() {
        // Arrange & Act
        double boundDefault = defaultDistribution.getDomainUpperBound(0.25);
        double boundCustom = customDistribution.getDomainUpperBound(0.1);

        // Assert
        Assert.assertEquals(0.0, boundDefault, TOLERANCE);
        Assert.assertEquals(10.0, boundCustom, TOLERANCE);
    }

    @Test
    public void getDomainUpperBound_givenProbabilityGreaterOrEqualToHalf_shouldReturnDoubleMax() {
        // Arrange & Act
        double boundHalf = defaultDistribution.getDomainUpperBound(0.5);
        double boundAbove = defaultDistribution.getDomainUpperBound(0.85);

        // Assert
        Assert.assertEquals(Double.MAX_VALUE, boundHalf, 0.0);
        Assert.assertEquals(Double.MAX_VALUE, boundAbove, 0.0);
    }

    @Test
    public void getInitialDomain_givenProbabilityLessThanHalf_shouldReturnMeanMinusStandardDeviation() {
        // Arrange & Act
        double initialDefault = defaultDistribution.getInitialDomain(0.25);
        double initialCustom = customDistribution.getInitialDomain(0.1);

        // Assert
        Assert.assertEquals(-1.0, initialDefault, TOLERANCE);
        Assert.assertEquals(7.5, initialCustom, TOLERANCE);
    }

    @Test
    public void getInitialDomain_givenProbabilityGreaterThanHalf_shouldReturnMeanPlusStandardDeviation() {
        // Arrange & Act
        double initialDefault = defaultDistribution.getInitialDomain(0.75);
        double initialCustom = customDistribution.getInitialDomain(0.9);

        // Assert
        Assert.assertEquals(1.0, initialDefault, TOLERANCE);
        Assert.assertEquals(12.5, initialCustom, TOLERANCE);
    }

    @Test
    public void getInitialDomain_givenProbabilityEqualToHalf_shouldReturnMean() {
        // Arrange & Act
        double initialDefault = defaultDistribution.getInitialDomain(0.5);
        double initialCustom = customDistribution.getInitialDomain(0.5);

        // Assert
        Assert.assertEquals(0.0, initialDefault, TOLERANCE);
        Assert.assertEquals(10.0, initialCustom, TOLERANCE);
    }

    @Test