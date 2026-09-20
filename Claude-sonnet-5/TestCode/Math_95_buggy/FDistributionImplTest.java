```java
package org.apache.commons.math.distribution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math.MathException;
import org.junit.Before;
import org.junit.Test;

public class FDistributionImplTest {

    private FDistributionImpl dist;
    private static final double TOLERANCE = 1e-9;

    @Before
    public void setUp() {
        dist = new FDistributionImpl(5.0, 6.0);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructorValid() {
        FDistributionImpl d = new FDistributionImpl(1.0, 1.0);
        assertEquals(1.0, d.getNumeratorDegreesOfFreedom(), TOLERANCE);
        assertEquals(1.0, d.getDenominatorDegreesOfFreedom(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidNumerator() {
        new FDistributionImpl(0.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidDenominator() {
        new FDistributionImpl(5.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeNumerator() {
        new FDistributionImpl(-1.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeDenominator() {
        new FDistributionImpl(5.0, -1.0);
    }

    // ---------- cumulativeProbability tests ----------

    @Test
    public void testCumulativeProbabilityAtZero() throws MathException {
        double result = dist.cumulativeProbability(0.0);
        assertEquals(0.0, result, TOLERANCE);
    }

    @Test
    public void testCumulativeProbabilityNegative() throws MathException {
        double result = dist.cumulativeProbability(-5.0);
        assertEquals(0.0, result, TOLERANCE);
    }

    @Test
    public void testCumulativeProbabilityPositive() throws MathException {
        double result = dist.cumulativeProbability(1.0);
        assertTrue(result > 0.0 && result < 1.0);
    }

    @Test
    public void testCumulativeProbabilityLarge() throws MathException {
        double result = dist.cumulativeProbability(1000.0);
        assertTrue(result > 0.9 && result <= 1.0);
    }

    @Test
    public void testCumulativeProbabilitySmallPositive() throws MathException {
        double result = dist.cumulativeProbability(0.0001);
        assertTrue(result >= 0.0 && result < 0.1);
    }

    // ---------- inverseCumulativeProbability tests ----------

    @Test
    public void testInverseCumulativeProbabilityZero() throws MathException {
        double result = dist.inverseCumulativeProbability(0.0);
        assertEquals(0.0, result, TOLERANCE);
    }

    @Test
    public void testInverseCumulativeProbabilityOne() throws MathException {
        double result = dist.inverseCumulativeProbability(1.0);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0);
    }

    @Test
    public void testInverseCumulativeProbabilityMid() throws MathException {
        double p = 0.5;
        double x = dist.inverseCumulativeProbability(p);
        assertTrue(x > 0.0);
        double cdf = dist.cumulativeProbability(x);
        assertEquals(p, cdf, 1e-4);
    }

    @Test
    public void testInverseCumulativeProbabilityHigh() throws MathException {
        double p = 0.95;
        double x = dist.inverseCumulativeProbability(p);
        assertTrue(x > 0.0);
        double cdf = dist.cumulativeProbability(x);
        assertEquals(p, cdf, 1e-4);
    }

    @Test
    public void testInverseCumulativeProbabilityLow() throws MathException {
        double p = 0.05;
        double x = dist.inverseCumulativeProbability(p);
        assertTrue(x >= 0.0);
        double cdf = dist.cumulativeProbability(x);
        assertEquals(p, cdf, 1e-4);
    }

    @Test(expected = MathException.class)
    public void testInverseCumulativeProbabilityInvalidNegative() throws MathException {
        dist.inverseCumulativeProbability(-0.5);
    }

    @Test(expected = MathException.class)
    public void testInverseCumulativeProbabilityInvalidGreaterThanOne() throws MathException {
        dist.inverseCumulativeProbability(1.5);
    }

    // ---------- setters/getters tests ----------

    @Test
    public void testSetNumeratorDegreesOfFreedomValid() {
        dist.setNumeratorDegreesOfFreedom(10.0);
        assertEquals(10.0, dist.getNumeratorDegreesOfFreedom(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNumeratorDegreesOfFreedomZero() {
        dist.setNumeratorDegreesOfFreedom(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNumeratorDegreesOfFreedomNegative() {
        dist.setNumeratorDegreesOfFreedom(-1.0);
    }

    @Test
    public void testSetDenominatorDegreesOfFreedomValid() {
        dist.setDenominatorDegreesOfFreedom(20.0);
        assertEquals(20.0, dist.getDenominatorDegreesOfFreedom(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDenominatorDegreesOfFreedomZero() {
        dist.setDenominatorDegreesOfFreedom(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDenominatorDegreesOfFreedomNegative() {
        dist.setDenominatorDegreesOfFreedom(-1.0);
    }

    @Test
    public void testGetNumeratorDegreesOfFreedom() {
        assertEquals(5.0, dist.getNumeratorDegreesOfFreedom(), TOLERANCE);
    }

    @Test
    public void testGetDenominatorDegreesOfFreedom() {
        assertEquals(6.0, dist.getDenominatorDegreesOfFreedom(), TOLERANCE);
    }

    // ---------- protected methods via reflection-like behavior (indirect tests) ----------

    @Test
    public void testGetDomainLowerBoundViaInverseCumulative() throws MathException {
        // Indirectly test getDomainLowerBound by calling inverseCumulativeProbability
        double result =