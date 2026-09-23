package org.apache.commons.math.distribution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.commons.math.MathException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.junit.Test;

public class NormalDistributionImplTest {

    private static final double DELTA = 1e-12;

    @Test
    public void testDefaultConstructor() {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        assertEquals(0.0, dist.getMean(), DELTA);
        assertEquals(1.0, dist.getStandardDeviation(), DELTA);
    }

    @Test
    public void testParameterizedConstructorAndGetters() {
        NormalDistributionImpl dist = new NormalDistributionImpl(2.5, 1.25);
        assertEquals(2.5, dist.getMean(), DELTA);
        assertEquals(1.25, dist.getStandardDeviation(), DELTA);
    }

    @Test
    public void testAccuracyConstructorAndSolverAccuracy() {
        NormalDistributionImpl dist = new NormalDistributionImpl(1.0, 2.0, 0.25);
        assertEquals(0.25, dist.getSolverAbsoluteAccuracy(), DELTA);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorRejectsZeroStandardDeviation() {
        new NormalDistributionImpl(0.0, 0.0);
    }

    @Test
    public void testDensity() {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        assertEquals(0.3989422804014327, dist.density(0.0), DELTA);
        assertEquals(0.24197072451914336, dist.density(1.0), DELTA);
    }

    @Test
    public void testCumulativeProbability() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 2.0);
        assertEquals(0.5, dist.cumulativeProbability(5.0), DELTA);
        assertEquals(0.8413447460685429, new NormalDistributionImpl().cumulativeProbability(1.0), 1e-9);
    }

    @Test
    public void testCumulativeProbabilityExtremeValues() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        assertEquals(0.0, dist.cumulativeProbability(-1.0e10), 0.0);
        assertEquals(1.0, dist.cumulativeProbability(1.0e10), 0.0);
    }

    @Test
    public void testInverseCumulativeProbabilityAtZeroAndOne() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(1.0, 2.0);
        assertEquals(Double.NEGATIVE_INFINITY, dist.inverseCumulativeProbability(0.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, dist.inverseCumulativeProbability(1.0), 0.0);
    }

    @Test
    public void testInverseCumulativeProbabilityMiddle() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        double x = dist.inverseCumulativeProbability(0.4);
        assertEquals(-0.2533471031357997, x, 1e-8);
    }

    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbabilityRejectsOutOfRange() throws MathException {
        new NormalDistributionImpl().inverseCumulativeProbability(1.5);
    }

    @Test
    public void testSample() throws MathException {
        double sample = new NormalDistributionImpl().sample();
        assertFalse(Double.isNaN(sample));
        assertTrue(sample != Double.POSITIVE_INFINITY);
        assertTrue(sample != Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testDomainBounds() {
        NormalDistributionImpl dist = new NormalDistributionImpl(10.0, 2.0);
        assertEquals(-Double.MAX_VALUE, dist.getDomainLowerBound(0.25), 0.0);
        assertEquals(10.0, dist.getDomainLowerBound(0.5), 0.0);
        assertEquals(10.0, dist.getDomainUpperBound(0.25), 0.0);
        assertEquals(Double.MAX_VALUE, dist.getDomainUpperBound(0.5), 0.0);
    }

    @Test
    public void testInitialDomain() {
        NormalDistributionImpl dist = new NormalDistributionImpl(10.0, 2.0);
        assertEquals(8.0, dist.getInitialDomain(0.25), DELTA);
        assertEquals(10.0, dist.getInitialDomain(0.5), DELTA);
        assertEquals(12.0, dist.getInitialDomain(0.75), DELTA);
    }
}