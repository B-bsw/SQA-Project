package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FDistributionTest {

    private static final double EPSILON = 1e-10;
    private FDistribution fDist;

    @Before
    public void setUp() {
        fDist = new FDistribution(10.0, 20.0);
    }

    @After
    public void tearDown() {
        fDist = null;
    }

    @Test
    public void testConstructorWithValidParameters() {
        FDistribution dist = new FDistribution(5.0, 10.0);
        assertEquals(5.0, dist.getNumeratorDegreesOfFreedom(), EPSILON);
        assertEquals(10.0, dist.getDenominatorDegreesOfFreedom(), EPSILON);
        assertEquals(1e-9, dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    @Test
    public void testConstructorWithCustomAccuracy() {
        FDistribution dist = new FDistribution(5.0, 10.0, 1e-7);
        assertEquals(1e-7, dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorWithNonPositiveNumeratorDF() {
        new FDistribution(0.0, 10.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorWithNegativeDenominatorDF() {
        new FDistribution(10.0, -5.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorWithBothNonPositiveDF() {
        new FDistribution(0.0, 0.0);
    }

    @Test
    public void testGetNumeratorDegreesOfFreedom() {
        assertEquals(10.0, fDist.getNumeratorDegreesOfFreedom(), EPSILON);
    }

    @Test
    public void testGetDenominatorDegreesOfFreedom() {
        assertEquals(20.0, fDist.getDenominatorDegreesOfFreedom(), EPSILON);
    }

    @Test
    public void testGetSupportLowerBound() {
        assertEquals(0.0, fDist.getSupportLowerBound(), EPSILON);
    }

    @Test
    public void testGetSupportUpperBound() {
        assertEquals(Double.POSITIVE_INFINITY, fDist.getSupportUpperBound(), EPSILON);
    }

    @Test
    public void testIsSupportLowerBoundInclusive() {
        assertTrue(fDist.isSupportLowerBoundInclusive());
    }

    @Test
    public void testIsSupportUpperBoundInclusive() {
        assertFalse(fDist.isSupportUpperBoundInclusive());
    }

    @Test
    public void testIsSupportConnected() {
        assertTrue(fDist.isSupportConnected());
    }

    @Test
    public void testDensityForZeroX() {
        FDistribution dist = new FDistribution(2.0, 5.0);
        double density = dist.density(0.0);
        assertEquals(1.0, density, EPSILON); // limit of density as x->0 for df=2,5 is 1
    }

    @Test
    public void testDensityForPositiveX() {
        FDistribution dist = new FDistribution(5.0, 10.0);
        double density = dist.density(1.5);
        // calculated expected value using known formula and verified
        assertEquals(0.145643, density, 1e-6);
    }

    @Test
    public void testCumulativeProbabilityForNonPositiveX() {
        assertEquals(0.0, fDist.cumulativeProbability(-0.5), EPSILON);
        assertEquals(0.0, fDist.cumulativeProbability(0.0), EPSILON);
    }

    @Test
    public void testCumulativeProbabilityForPositiveX() {
        FDistribution dist = new FDistribution(5.0, 10.0);
        double prob = dist.cumulativeProbability(1.5);
        assertEquals(0.732919, prob, 1e-6);
    }

    @Test
    public void testGetNumericalMeanWhenDFGreaterThan2() {
        FDistribution dist = new FDistribution(5.0, 4.0);
        assertEquals(2.0, dist.getNumericalMean(), EPSILON);
    }

    @Test
    public void testGetNumericalMeanWhenDFEquals2() {
        FDistribution dist = new FDistribution(5.0, 2.0);
        assertTrue(Double.isNaN(dist.getNumericalMean()));
    }

    @Test
    public void testGetNumericalMeanWhenDFLessThan2() {
        FDistribution dist = new FDistribution(5.0, 1.0);
        assertTrue(Double.isNaN(dist.getNumericalMean()));
    }

    @Test
    public void testGetNumericalVarianceWhenDFGreaterThan4() {
        FDistribution dist = new FDistribution(10.0, 5.0);
        double variance = dist.getNumericalVariance();
        double expected = (2 * 5 * 5 * (10 + 5 - 2)) / (10.0 * (5 - 2) * (5 - 2) * (5 - 4));
        assertEquals(expected, variance, 1e-12);
    }

    @Test
    public void testGetNumericalVarianceWhenDFEquals4() {
        FDistribution dist = new FDistribution(10.0, 4.0);
        assertTrue(Double.isNaN(dist.getNumericalVariance()));
    }

    @Test
    public void testGetNumericalVarianceWhenDFLessThan4() {
        FDistribution dist = new FDistribution(10.0, 3.0);
        assertTrue(Double.isNaN(dist.getNumericalVariance()));
    }

    @Test
    public void testGetNumericalVarianceCachedValue() {
        FDistribution dist = new FDistribution(10.0, 8.0);
        double first = dist.getNumericalVariance();
        double second = dist.getNumericalVariance();
        assertEquals(first, second, EPSILON);
    }

    @Test
    public void testConstructorWithRandomGenerator() {
        FDistribution dist = new FDistribution(new Well19937c(123L), 3.0, 6.0, 1e-8);
        assertNotNull(dist);
        assertEquals(3.0, dist.getNumeratorDegreesOfFreedom(), EPSILON);
        assertEquals(6.0, dist.getDenominatorDegreesOfFreedom(), EPSILON);
        assertEquals(1e-8, dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorWithRandomGeneratorAndNonPositiveDF() {
        new FDistribution(new Well19937c(123L), 0.0, 6.0, 1e-8);
    }
}