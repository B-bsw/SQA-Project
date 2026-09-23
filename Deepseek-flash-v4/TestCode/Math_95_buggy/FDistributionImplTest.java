package org.apache.commons.math.distribution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math.MathException;
import org.junit.Test;

public class FDistributionImplTest {

    @Test
    public void testConstructorAndAccessors() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);
        assertEquals(5.0, dist.getNumeratorDegreesOfFreedom(), 0.0);
        assertEquals(10.0, dist.getDenominatorDegreesOfFreedom(), 0.0);

        dist.setNumeratorDegreesOfFreedom(7.0);
        dist.setDenominatorDegreesOfFreedom(14.0);
        assertEquals(7.0, dist.getNumeratorDegreesOfFreedom(), 0.0);
        assertEquals(14.0, dist.getDenominatorDegreesOfFreedom(), 0.0);
    }

    @Test
    public void testConstructorRejectsNonPositiveDegreesOfFreedom() {
        try {
            new FDistributionImpl(0.0, 1.0);
            fail("Expected IllegalArgumentException for zero numerator df");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            new FDistributionImpl(1.0, -1.0);
            fail("Expected IllegalArgumentException for negative denominator df");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSettersRejectNonPositiveDegreesOfFreedom() {
        FDistributionImpl dist = new FDistributionImpl(1.0, 1.0);

        try {
            dist.setNumeratorDegreesOfFreedom(-2.0);
            fail("Expected IllegalArgumentException for negative numerator df");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            dist.setDenominatorDegreesOfFreedom(0.0);
            fail("Expected IllegalArgumentException for zero denominator df");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCumulativeProbabilityBoundaryAndKnownValue() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(1.0, 1.0);

        assertEquals(0.0, dist.cumulativeProbability(0.0), 0.0);
        assertEquals(0.0, dist.cumulativeProbability(-1.0), 0.0);
        assertEquals(0.5, dist.cumulativeProbability(1.0), 1e-9);
    }

    @Test
    public void testInverseCumulativeProbabilityBoundaries() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        assertEquals(0.0, dist.inverseCumulativeProbability(0.0), 0.0);

        double positiveInfinity = dist.inverseCumulativeProbability(1.0);
        assertTrue(Double.isInfinite(positiveInfinity));
        assertTrue(positiveInfinity > 0.0);
    }

    @Test
    public void testInverseCumulativeProbabilityRoundTrip() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);

        double x = dist.inverseCumulativeProbability(0.5);
        assertEquals(0.5, dist.cumulativeProbability(x), 1e-6);
    }

    @Test
    public void testInverseCumulativeProbabilityRejectsInvalidP() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(1.0, 1.0);

        try {
            dist.inverseCumulativeProbability(-0.1);
            fail("Expected IllegalArgumentException for p < 0");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            dist.inverseCumulativeProbability(1.1);
            fail("Expected IllegalArgumentException for p > 1");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}