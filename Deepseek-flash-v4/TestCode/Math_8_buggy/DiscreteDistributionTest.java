package org.apache.commons.math3.distribution;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.Pair;

import org.junit.Assert;
import org.junit.Test;

public class DiscreteDistributionTest {

    @Test
    public void testConstructorNormal() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 0.5));
        samples.add(new Pair<String, Double>("B", 0.3));
        samples.add(new Pair<String, Double>("C", 0.2));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
        Assert.assertNotNull(dist);
        List<Pair<String, Double>> retrieved = dist.getSamples();
        Assert.assertEquals(3, retrieved.size());
        Assert.assertEquals("A", retrieved.get(0).getKey());
        Assert.assertEquals(0.5, retrieved.get(0).getValue(), 1e-12);
        Assert.assertEquals("B", retrieved.get(1).getKey());
        Assert.assertEquals(0.3, retrieved.get(1).getValue(), 1e-12);
        Assert.assertEquals("C", retrieved.get(2).getKey());
        Assert.assertEquals(0.2, retrieved.get(2).getValue(), 1e-12);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorNegativeProbability() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", -0.1));
        new DiscreteDistribution<String>(samples);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorSumZero() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 0.0));
        samples.add(new Pair<String, Double>("B", 0.0));
        new DiscreteDistribution<String>(samples);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorInfiniteProbability() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", Double.POSITIVE_INFINITY));
        new DiscreteDistribution<String>(samples);
    }

    @Test
    public void testProbability() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 0.6));
        samples.add(new Pair<String, Double>("B", 0.4));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
        Assert.assertEquals(0.6, dist.probability("A"), 1e-12);
        Assert.assertEquals(0.4, dist.probability("B"), 1e-12);
        Assert.assertEquals(0.0, dist.probability("C"), 1e-12);
    }

    @Test
    public void testProbabilityWithNullKey() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>(null, 0.3));
        samples.add(new Pair<String, Double>("B", 0.7));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
        Assert.assertEquals(0.3, dist.probability(null), 1e-12);
        Assert.assertEquals(0.7, dist.probability("B"), 1e-12);
        Assert.assertEquals(0.0, dist.probability("A"), 1e-12);
    }

    @Test
    public void testGetSamplesReturnsCopy() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("X", 1.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
        List<Pair<String, Double>> result = dist.getSamples();
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("X", result.get(0).getKey());
        Assert.assertEquals(1.0, result.get(0).getValue(), 1e-12);
    }

    @Test
    public void testSampleDeterministic() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 0.2));
        samples.add(new Pair<String, Double>("B", 0.8));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
        dist.reseedRandomGenerator(12345L);
        // First sample should be deterministic with this seed
        String s1 = dist.sample();
        Assert.assertNotNull(s1);
        Assert.assertTrue(s1.equals("A") || s1.equals("B"));
        // Reseed to same seed and verify first sample is identical
        dist.reseedRandomGenerator(12345L);
        String s2 = dist.sample();
        Assert.assertEquals(s1, s2);
    }

    @Test
    public void testSampleWithMultipleCalls() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("X", 1.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
        dist.reseedRandomGenerator(42L);
        String result = dist.sample();
        Assert.assertEquals("X", result);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testSampleWithNegativeSize() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
        dist.sample(-1);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testSampleWithZeroSize() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
        dist.sample(0);
    }

    @Test
    public void testSampleWithPositiveSize() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 0.5));
        samples.add(new Pair<String, Double>("B", 0.5));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
        dist.reseedRandomGenerator(999L);
        String[] sampleArray = dist.sample(5);
        Assert.assertNotNull(sampleArray);
        Assert.assertEquals(5, sampleArray.length);
        for (String value : sampleArray) {
            Assert.assertTrue(value.equals("A") || value.equals("B"));
        }
    }

    @Test
    public void testReseedRandomGenerator() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 0.5));
        samples.add(new Pair<String, Double>("B", 0.5));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
        dist.reseedRandomGenerator(0L);
        String firstAfterReseed = dist.sample();
        dist.reseedRandomGenerator(0L);
        String secondAfterReseed = dist.sample();
        Assert.assertEquals(firstAfterReseed, secondAfterReseed);
    }
}