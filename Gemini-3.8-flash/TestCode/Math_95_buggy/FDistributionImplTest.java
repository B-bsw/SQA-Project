package org.apache.commons.math.distribution;

import org.apache.commons.math.MathException;
import org.junit.Assert;
import org.junit.Test;

public class FDistributionImplTest {

    private static final double TOLERANCE = 1e-5;

    @Test
    public void constructor_givenValidDegreesOfFreedom_shouldInitializeProperly() {
        // Arrange & Act
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Assert
        Assert.assertEquals(5.0, dist.getNumeratorDegreesOfFreedom(), TOLERANCE);
        Assert.assertEquals(10.0, dist.getDenominatorDegreesOfFreedom(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNonPositiveNumerator_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        new FDistributionImpl(0.0, 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNegativeNumerator_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        new FDistributionImpl(-1.0, 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNonPositiveDenominator_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        new FDistributionImpl(5.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNegativeDenominator_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        new FDistributionImpl(5.0, -2.0);
    }

    @Test
    public void setNumeratorDegreesOfFreedom_givenPositive_shouldUpdate() {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Act
        dist.setNumeratorDegreesOfFreedom(8.0);

        // Assert
        Assert.assertEquals(8.0, dist.getNumeratorDegreesOfFreedom(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNumeratorDegreesOfFreedom_givenZero_shouldThrowIllegalArgumentException() {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Act
        dist.setNumeratorDegreesOfFreedom(0.0);
    }

    @Test
    public void setDenominatorDegreesOfFreedom_givenPositive_shouldUpdate() {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Act
        dist.setDenominatorDegreesOfFreedom(12.0);

        // Assert
        Assert.assertEquals(12.0, dist.getDenominatorDegreesOfFreedom(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDenominatorDegreesOfFreedom_givenZero_shouldThrowIllegalArgumentException() {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Act
        dist.setDenominatorDegreesOfFreedom(0.0);
    }

    @Test
    public void cumulativeProbability_givenZeroOrNegativeX_shouldReturnZero() throws MathException {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Act & Assert
        Assert.assertEquals(0.0, dist.cumulativeProbability(0.0), TOLERANCE);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-5.0), TOLERANCE);
    }

    @Test
    public void cumulativeProbability_givenPositiveX_shouldReturnValidCumulativeProbability() throws MathException {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Act
        double prob = dist.cumulativeProbability(1.0);

        // Assert
        Assert.assertTrue(prob > 0.0 && prob < 1.0);
    }

    @Test
    public void inverseCumulativeProbability_givenZero_shouldReturnZero() throws MathException {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Act
        double x = dist.inverseCumulativeProbability(0.0);

        // Assert
        Assert.assertEquals(0.0, x, TOLERANCE);
    }

    @Test
    public void inverseCumulativeProbability_givenOne_shouldReturnPositiveInfinity() throws MathException {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Act
        double x = dist.inverseCumulativeProbability(1.0);

        // Assert
        Assert.assertEquals(Double.POSITIVE_INFINITY, x, TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void inverseCumulativeProbability_givenNegativeProbability_shouldThrowIllegalArgumentException() throws MathException {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Act
        dist.inverseCumulativeProbability(-0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void inverseCumulativeProbability_givenGreaterThanOneProbability_shouldThrowIllegalArgumentException() throws MathException {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Act
        dist.inverseCumulativeProbability(1.1);
    }

    @Test
    public void inverseCumulativeProbability_givenIntermediateProbability_shouldMatchCumulativeProbability() throws MathException {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);
        double p = 0.5;

        // Act
        double x = dist.inverseCumulativeProbability(p);
        double actualP = dist.cumulativeProbability(x);

        // Assert
        Assert.assertEquals(p, actualP, 1e-4);
    }

    @Test
    public void getDomainLowerBound_shouldReturnZero() {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Act & Assert
        Assert.assertEquals(0.0, dist.getDomainLowerBound(0.5), TOLERANCE);
    }

    @Test
    public void getDomainUpperBound_shouldReturnDoubleMaxValue() {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Act & Assert
        Assert.assertEquals(Double.MAX_VALUE, dist.getDomainUpperBound(0.5), TOLERANCE);
    }

    @Test
    public void getInitialDomain_givenDenominatorGreaterThanTwo_shouldReturnMean() {
        // Arrange
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        // Act
        double initial = dist.getInitialDomain(0.5);

        // Assert
        Assert.assertEquals(10.0 / (10.0 - 2.0), initial, TOLERANCE);
    }
}
