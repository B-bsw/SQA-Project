package org.apache.commons.math3.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.07261445470276517d, 0.7938684212191616d);
        double double9 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7212539665163964d + "'", double8 == 0.7212539665163964d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double6 = fDistribution4.cumulativeProbability(0.08333333333333333d);
        double double7 = fDistribution4.calculateNumericalVariance();
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        boolean boolean9 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.getNumericalVariance();
        double double10 = uniformRealDistribution2.sample();
        boolean boolean11 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean12 = uniformRealDistribution2.isSupportConnected();
        double double13 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.9280210045614945d, 0.7282585856777408d, 0.005949830804446096d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(4.7120415909255865E-4d, 0.6060113752531858d);
        double double3 = fDistribution2.getNumericalMean();
        double[] doubleArray5 = fDistribution2.sample((int) '#');
        boolean boolean6 = fDistribution2.isSupportLowerBoundInclusive();
        double double7 = fDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getNumericalMean();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        double double10 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator(0L);
        double double13 = fDistribution3.getSolverAbsoluteAccuracy();
        double[] doubleArray15 = fDistribution3.sample((int) (short) 10);
        double double16 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.8465563866412276d, 0.8026401292223855d, 0.6916229277738195d, 0.7667868781013677d, 2.159364581258534d, 0.6257575522066166d, 0.7766994943357106d, 0.7695660759061187d, 0.6240449236143368d, 0.6812113028135305d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7920004323755218d, 1.7243389641593716d, 0.3462976124464914d);
        boolean boolean4 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.358739754665903d, 0.0d, 0.6423460469744984d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.359) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.8151769424272568d, 0.869603206076088d);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double7 = fDistribution3.cumulativeProbability(2.7171475092674E-46d);
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistribution3.cumulativeProbability(0.8870064948069971d, 0.2845274559720097d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.887) must be less than or equal to upper endpoint (0.285)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.711194252818312E-227d + "'", double7 == 4.711194252818312E-227d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.cumulativeProbability(0.7938684212191616d);
        double double5 = uniformRealDistribution2.getSupportLowerBound();
        double double7 = uniformRealDistribution2.cumulativeProbability(0.0d);
        boolean boolean8 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean9 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double10 = uniformRealDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.73078872710936d, 0.2781495492044994d, 0.0d);
        double double4 = fDistribution3.calculateNumericalVariance();
        double double5 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double3 = uniformRealDistribution2.getNumericalMean();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution2.getNumericalMean();
        double double8 = uniformRealDistribution2.cumulativeProbability(0.87237982648441d);
        double double9 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.inverseCumulativeProbability(0.12452611167231531d);
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.sample();
        double double10 = uniformRealDistribution0.getSupportUpperBound();
        double double11 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double13 = uniformRealDistribution0.density(4.525062694438517E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "1) test3014(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.37040500917644015d + "'", double4 == 0.37040500917644015d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1245261116723153d + "'", double7 == 0.1245261116723153d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "1) test3014(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.04726269353868018d + "'", double9 == 0.04726269353868018d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-9d + "'", double11 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        fDistribution3.reseedRandomGenerator(100L);
        double double14 = fDistribution3.probability(0.12452611167231531d);
        double double16 = fDistribution3.density(0.43887695931896076d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "2) test3015(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8318935912036269d + "'", double9 == 0.8318935912036269d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5530147623666741d + "'", double16 == 0.5530147623666741d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.64439990514539d, 0.4790184838979459d);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.probability(10.0d);
        double double12 = fDistribution3.getSupportUpperBound();
        double double13 = fDistribution3.calculateNumericalVariance();
        double double14 = fDistribution3.getSolverAbsoluteAccuracy();
        double double15 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.getNumericalMean();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double13 = fDistribution3.getSupportUpperBound();
        double double15 = fDistribution3.density(0.16389079897053382d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.04682301031915883d + "'", double15 == 0.04682301031915883d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5388621902004562d, 0.5520447923229905d, 48.8425886151626d);
        double double4 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7071737568021614d, 0.8904354075111562d);
        double double3 = uniformRealDistribution2.sample();
// flaky "3) test3020(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8503155543116994d + "'", double3 == 0.8503155543116994d);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.13018714436235257d, 0.37209005285684604d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6766392398995167d, 0.6916856290446507d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        double double4 = fDistribution2.getSolverAbsoluteAccuracy();
        double double5 = fDistribution2.getSupportUpperBound();
        double double7 = fDistribution2.inverseCumulativeProbability(0.4999014899032976d);
        double double9 = fDistribution2.density(0.9296876899702973d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9717760990109692d + "'", double7 == 0.9717760990109692d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.13027298212537403d + "'", double9 == 0.13027298212537403d);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6907167210019161d, 3.0034674852582924E-11d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.005304180251840177d, 0.7446452407647994d, 0.502303753948945d);
        double double5 = fDistribution3.cumulativeProbability(0.0015698807116598047d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9645967736193747d + "'", double5 == 0.9645967736193747d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double5 = uniformRealDistribution0.sample();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.inverseCumulativeProbability(0.6323311848542505d);
        double double11 = uniformRealDistribution0.density(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
// flaky "4) test3025(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2986191849492241d + "'", double5 == 0.2986191849492241d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6323311848542505d + "'", double9 == 0.6323311848542505d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.probability(10.0d);
        double double12 = fDistribution3.getSupportUpperBound();
        double double13 = fDistribution3.calculateNumericalVariance();
        double double14 = fDistribution3.sample();
        fDistribution3.reseedRandomGenerator(0L);
        double double17 = fDistribution3.getNumericalMean();
        double double20 = fDistribution3.cumulativeProbability(0.8904354075111562d, 2.0369116369583304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
// flaky "5) test3026(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6146715185762833d + "'", double14 == 0.6146715185762833d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0210526315789474d + "'", double17 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5076172706194064d + "'", double20 == 0.5076172706194064d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.9404443230777908d, 0.8151769424272568d, 0.530583016756808d);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.cumulativeProbability(97.0d);
        double double10 = uniformRealDistribution0.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.7346921611407997d, 0.6163120664688175d, 0.83773673692955d);
        double double5 = fDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.83773673692955d + "'", double5 == 0.83773673692955d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double5 = uniformRealDistribution0.inverseCumulativeProbability(0.544127331049072d);
        double double6 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean8 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.544127331049072d + "'", double5 == 0.544127331049072d);
// flaky "6) test3030(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6403864171374258d + "'", double6 == 0.6403864171374258d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        uniformRealDistribution0.reseedRandomGenerator((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = uniformRealDistribution0.sample((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "7) test3031(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7356612540203309d + "'", double4 == 0.7356612540203309d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.8590663588185146d, 0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double10 = uniformRealDistribution2.density((double) (short) 1);
        boolean boolean11 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double13 = uniformRealDistribution2.cumulativeProbability(0.7279081739402236d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = uniformRealDistribution2.inverseCumulativeProbability(0.5637556770452763d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [?, ?]");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.density((double) '#');
        fDistribution3.reseedRandomGenerator((long) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.562099861400877E-28d + "'", double8 == 7.562099861400877E-28d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double13 = fDistribution3.inverseCumulativeProbability(0.3379957971411982d);
        double double14 = fDistribution3.getSupportLowerBound();
        double double15 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean16 = fDistribution3.isSupportConnected();
        double double19 = fDistribution3.cumulativeProbability(1.1884125086856197d, 2.110510360748271d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6838714210807377d + "'", double13 == 0.6838714210807377d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.27760224459400973d + "'", double19 == 0.27760224459400973d);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.getNumericalVariance();
        double double12 = fDistribution3.getNumericalVariance();
        double double13 = fDistribution3.getNumericalMean();
        fDistribution3.reseedRandomGenerator((long) ' ');
        double double16 = fDistribution3.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistribution3.probability(0.6783501954501896d, 0.4226077302684093d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.678) must be less than or equal to upper endpoint (0.423)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "8) test3036(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.679484697455562d + "'", double9 == 2.679484697455562d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        boolean boolean6 = fDistribution3.isSupportConnected();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportLowerBoundInclusive();
        double double9 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        double double7 = uniformRealDistribution0.getNumericalVariance();
        double double8 = uniformRealDistribution0.sample();
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
// flaky "9) test3038(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9546340580933452d + "'", double8 == 0.9546340580933452d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.34840059581983973d, 0.8253996392345899d, 0.4636386264809612d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8151769424272568d, 0.43958036910990383d, 0.22098387218859405d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.815) must be strictly less than upper bound (0.44)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.9101270685680378d, 0.25879486443701905d, 0.49884479899047296d);
        double double5 = fDistribution3.cumulativeProbability(0.8343322941611049d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.28900673762151086d + "'", double5 == 0.28900673762151086d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.40425162944598975d, 0.7396527059645088d);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.4408795125955778d, 0.7112482675157115d, 0.28328985552646924d);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.20172357187228318d, 0.48740239104815686d);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6917725062323477d, 0.4695863628816679d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.692) must be strictly less than upper bound (0.47)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double7 = uniformRealDistribution0.getNumericalMean();
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double11 = uniformRealDistribution0.density(0.8031296595609017d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "10) test3046(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.025922869364114254d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.49448191740329417d, 0.8914241055526231d, 0.3321070505100212d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistribution3.cumulativeProbability(0.576218947398812d, 0.05160956843031883d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.576) must be less than or equal to upper endpoint (0.052)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.cumulativeProbability(100.0d);
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        double double10 = uniformRealDistribution0.cumulativeProbability((double) (byte) 0);
        double double12 = uniformRealDistribution0.density(0.4485770812615808d);
        boolean boolean13 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "11) test3048(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4021958415545621d + "'", double3 == 0.4021958415545621d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.cumulativeProbability(0.37546273455104495d);
        double double13 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.04546292503294002d + "'", double12 == 0.04546292503294002d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 1);
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        fDistribution3.reseedRandomGenerator((long) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "12) test3050(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.7515093331036522d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(1.936120997106573d);
        double double10 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "13) test3051(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7521813860790199d + "'", double7 == 0.7521813860790199d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1320725215067027d + "'", double9 == 0.1320725215067027d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6039787332279838d, 2.4725239789609064d);
        double double4 = uniformRealDistribution2.inverseCumulativeProbability(0.6314408575573036d);
        double double5 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.783854545578203d + "'", double4 == 1.783854545578203d);
// flaky "14) test3052(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3088751559715632d + "'", double5 == 2.3088751559715632d);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.05815067890837344d, 0.5262274315002701d);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5831064787455089d, 1.449868410599931E16d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution2.probability(0.10917347757783191d);
        double double6 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass7 = uniformRealDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7751813324443158d, (double) 100L, (double) 'a');
        double double5 = uniformRealDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.38759066622216d + "'", double5 == 50.38759066622216d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        uniformRealDistribution0.reseedRandomGenerator((long) (short) 0);
        double double12 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double14 = uniformRealDistribution0.cumulativeProbability(0.8160555702123836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "15) test3056(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.2937068895874897d + "'", double4 == 0.2937068895874897d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.8160555702123836d + "'", double14 == 0.8160555702123836d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.3321070505100212d, (double) (short) 1, 0.9999999999758308d);
        double double5 = fDistribution4.getDenominatorDegreesOfFreedom();
        boolean boolean6 = fDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            fDistribution4.reseedRandomGenerator((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6923972148186575d, 0.18830550366880483d, 0.07277703352123166d);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5554636502621801d, 0.6313604496713228d, 0.37702791528334645d);
        double double5 = uniformRealDistribution3.density(0.4080551181879397d);
        double double7 = uniformRealDistribution3.cumulativeProbability(0.24311283302854653d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6309781408281055d, 0.6146624655606938d);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.09569794207595081d, 0.8505215495325973d, 0.3547787970456404d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportConnected();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "16) test3062(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9038143254896984d + "'", double3 == 0.9038143254896984d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double[] doubleArray9 = fDistribution3.sample((int) (byte) 10);
        double double10 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double12 = fDistribution3.cumulativeProbability((double) (short) 100);
        double double13 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean14 = fDistribution3.isSupportLowerBoundInclusive();
        double double15 = fDistribution3.getSupportLowerBound();
        double double16 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double18 = fDistribution3.density(3.7810499307004314E-28d);
        double double19 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
// flaky "17) test3063(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.6819524771963026d, 0.0d, 4.28874789064515d, 0.5865397188924116d, 3.33654435651646d, 0.8057980909129743d, 3.640372923606725d, 3.5280077565429306d, 1.9906956805053801d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.250757588165562E-108d + "'", double18 == 3.250757588165562E-108d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.23541417210258242d + "'", double19 == 0.23541417210258242d);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7941015035099954d, 1.7354514364969038d, 0.939467095627455d);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double7 = fDistribution3.density(0.1757939476207693d);
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.density(0.0d);
        double double12 = fDistribution3.inverseCumulativeProbability(0.47245807661821626d);
        fDistribution3.reseedRandomGenerator((long) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6456794250754441d + "'", double7 == 0.6456794250754441d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.density((double) '#');
        double double10 = fDistribution3.cumulativeProbability((double) (-1.0f));
        double double11 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double12 = fDistribution3.getNumericalMean();
        boolean boolean13 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean14 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.562099861400877E-28d + "'", double8 == 7.562099861400877E-28d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0210526315789474d + "'", double12 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double[] doubleArray9 = fDistribution3.sample((int) '4');
        double double10 = fDistribution3.calculateNumericalVariance();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double13 = fDistribution3.cumulativeProbability(1.3593610630961634E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability((-1.0d), (double) 1L);
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSupportLowerBound();
        boolean boolean10 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.inverseCumulativeProbability(0.643622493856715d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5509385983974154d + "'", double6 == 0.5509385983974154d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8365482135410648d + "'", double12 == 0.8365482135410648d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean9 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double11 = uniformRealDistribution2.probability((double) (short) 1);
        double double12 = uniformRealDistribution2.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = uniformRealDistribution2.cumulativeProbability(1.8934065309514083d, 0.5622919087669369d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1.893) must be less than or equal to upper endpoint (0.562)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean8 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double9 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double8 = uniformRealDistribution0.density((double) 10.0f);
        double double9 = uniformRealDistribution0.getNumericalVariance();
        double double10 = uniformRealDistribution0.sample();
        double double13 = uniformRealDistribution0.probability(0.8914306597714141d, 16.97758172302296d);
        double double14 = uniformRealDistribution0.getNumericalMean();
        uniformRealDistribution0.reseedRandomGenerator((-1L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "18) test3071(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0937951544052662d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
// flaky "2) test3071(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.536020689047952d + "'", double10 == 0.536020689047952d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.10856934022858589d + "'", double13 == 0.10856934022858589d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        double double13 = fDistribution3.probability(0.5415785819031833d, 2.3125942498560286d);
        double double14 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double15 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double6 = uniformRealDistribution0.density(0.6060113752531858d);
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double7 = fDistribution3.density(0.1757939476207693d);
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistribution3.inverseCumulativeProbability(3.536035465836704d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 3.536 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6456794250754441d + "'", double7 == 0.6456794250754441d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 10);
        double double9 = fDistribution3.cumulativeProbability((double) (-1L));
        double double11 = fDistribution3.cumulativeProbability(0.8146244847519797d);
        double double12 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "19) test3075(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.756243275653493d, 0.6422320135500372d, 0.6708899267681995d, 2.32558964380452d, 0.7300309265806484d, 0.0d, 2.2958349711622397d, 2.3501816991556392d, 1.8622159964785476d, 0.6669258005888155d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3847773579137394d + "'", double11 == 0.3847773579137394d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0210526315789474d + "'", double12 == 1.0210526315789474d);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.cumulativeProbability(0.9277715961927422d);
        double double8 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9277715961927422d + "'", double7 == 0.9277715961927422d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getNumericalMean();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        double double14 = fDistribution3.cumulativeProbability(0.0d);
        boolean boolean15 = fDistribution3.isSupportLowerBoundInclusive();
        java.lang.Class<?> wildcardClass16 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.16434538054434356d, 0.43887695931896076d);
        double double4 = fDistribution2.inverseCumulativeProbability(0.49842935128655824d);
        double double6 = fDistribution2.density(0.6286752687575519d);
        double double7 = fDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.01993241700083338d + "'", double4 == 0.01993241700083338d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0811806448061642d + "'", double6 == 0.0811806448061642d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution4.getSolverAbsoluteAccuracy();
        double double9 = fDistribution4.getSolverAbsoluteAccuracy();
        double double10 = fDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.004853457297448672d + "'", double7 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.8370221871625128d, 0.20729773794146564d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1.837) must be strictly less than upper bound (0.207)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5554636502621801d, 0.6313604496713228d, 0.37702791528334645d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5934120499667515d + "'", double4 == 0.5934120499667515d);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.13018714436235257d, 0.058309969785535314d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution3.getNumericalVariance();
        double double9 = uniformRealDistribution3.probability(0.5881395489123649d, (double) (byte) 1);
        boolean boolean10 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double12 = uniformRealDistribution3.probability(0.9373298332230393d);
        double double13 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass14 = uniformRealDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05428794722368846d) + "'", double4 == (-0.05428794722368846d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2981237622554617d + "'", double6 == 0.2981237622554617d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1603471985737681d + "'", double9 == 0.1603471985737681d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.8064012164024592d, 0.21163544171934578d, 0.812268146222622d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistribution3.cumulativeProbability(0.6081706888281555d, 0.5730940342700588d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.608) must be less than or equal to upper endpoint (0.573)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6553695282217037d, 0.7573235535633357d, 0.1882454026529332d);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.sample();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6553695282217037d + "'", double4 == 0.6553695282217037d);
// flaky "20) test3085(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.25d + "'", double5 == 0.25d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6553695282217037d + "'", double6 == 0.6553695282217037d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8550391988086474d, 0.4287243616774288d, 0.31526394849539074d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.855) must be strictly less than upper bound (0.429)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        boolean boolean5 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution2.getSupportLowerBound();
        uniformRealDistribution2.reseedRandomGenerator((long) '#');
        uniformRealDistribution2.reseedRandomGenerator(10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double10 = fDistribution3.cumulativeProbability((double) (short) 0, 0.5d);
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        double[] doubleArray13 = fDistribution3.sample((int) '4');
        double double14 = fDistribution3.getNumericalVariance();
        double double15 = fDistribution3.getNumericalMean();
        double double16 = fDistribution3.calculateNumericalVariance();
        double double17 = fDistribution3.calculateNumericalVariance();
        double double19 = fDistribution3.density(0.14697850102167753d);
        double double20 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1137932949955843d + "'", double10 == 0.1137932949955843d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.23541417210258242d + "'", double17 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.033199230956213494d + "'", double19 == 0.033199230956213494d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.23541417210258242d + "'", double20 == 0.23541417210258242d);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        boolean boolean8 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean9 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double10 = uniformRealDistribution0.getNumericalVariance();
        double double11 = uniformRealDistribution0.getSupportUpperBound();
        double double12 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "21) test3089(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.2151315484155807d + "'", double4 == 0.2151315484155807d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.2981237622554617d, 2.4980016587511606d, 0.3841380975274862d);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6039787332279838d, 2.4725239789609064d);
        double double4 = uniformRealDistribution2.cumulativeProbability(0.2439012222489887d);
        boolean boolean5 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "22) test3091(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.152348191996026d + "'", double6 == 2.152348191996026d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3520229098741905d, 0.004086979412209781d, 1.4870378141774938E-4d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.352) must be strictly less than upper bound (0.004)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.getNumericalMean();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.17520684935593644d, 0.012589580964827762d, 0.933700404958179d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.175) must be strictly less than upper bound (0.013)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.calculateNumericalVariance();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.cumulativeProbability(0.0d);
        double double14 = fDistribution3.cumulativeProbability((double) (short) 100);
        double double15 = fDistribution3.getNumericalMean();
        double double16 = fDistribution3.sample();
        double double17 = fDistribution3.getNumericalMean();
        double double20 = fDistribution3.probability(0.7243896393054874d, 0.8493872319532485d);
        double double21 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "23) test3096(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.5830317679687487d + "'", double9 == 3.5830317679687487d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
// flaky "3) test3096(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6586243249429897d + "'", double16 == 0.6586243249429897d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0210526315789474d + "'", double17 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.11697462494052852d + "'", double20 == 0.11697462494052852d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.sample();
        double double10 = uniformRealDistribution2.cumulativeProbability(0.19963923310118198d);
        double double12 = uniformRealDistribution2.density(0.13160684312953563d);
        double double13 = uniformRealDistribution2.getNumericalMean();
        double double14 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-9d + "'", double14 == 1.0E-9d);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.getNumericalVariance();
        java.lang.Class<?> wildcardClass12 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double4 = fDistribution2.calculateNumericalVariance();
        boolean boolean5 = fDistribution2.isSupportLowerBoundInclusive();
        fDistribution2.reseedRandomGenerator((long) '4');
        boolean boolean8 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(3.181009226124227E-44d, 0.07983844188212808d, 0.19565248788630019d);
        double double5 = uniformRealDistribution3.cumulativeProbability(0.4948852171227234d);
        boolean boolean6 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        boolean boolean7 = uniformRealDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.019386977657993354d, 6.941941680452812d, 2.2954272647673424d);
        double double4 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 343.281590416424d + "'", double4 == 343.281590416424d);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) (-1.0f), 0.0d, 0.6653792551523636d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.probability(0.8914241055526231d);
        double double13 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        boolean boolean5 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution2.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = uniformRealDistribution2.inverseCumulativeProbability(3.033643892548913d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 3.034 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.16235863345578966d, 1.7080848333942735d, 0.12479841845316075d);
        boolean boolean4 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.14502638075584673d, 0.4831171572366d);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.7685775863542659d, 0.021095169454586005d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        double double4 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100L, 0.3321070505100212d, 0.08333333333333333d);
        double double5 = fDistribution4.calculateNumericalVariance();
        boolean boolean6 = fDistribution4.isSupportConnected();
        double double7 = fDistribution4.calculateNumericalVariance();
        double double8 = fDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.0d, 0.17723898358627965d, 0.04468234794388115d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double11 = fDistribution3.density((double) (byte) 0);
        double double12 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double14 = fDistribution3.cumulativeProbability(0.45420776398839613d);
        double double15 = fDistribution3.getSupportLowerBound();
        double double16 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "24) test3110(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.964585912915802d + "'", double9 == 1.964585912915802d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08489345457721978d + "'", double14 == 0.08489345457721978d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6286752687575519d, 0.3852949213208437d, 0.0d);
        double double4 = fDistribution3.sample();
// flaky "25) test3111(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.01169910375012293d + "'", double4 == 0.01169910375012293d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double10 = fDistribution3.inverseCumulativeProbability(1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        boolean boolean7 = fDistribution3.isSupportConnected();
        boolean boolean8 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5415785819031833d, 3.0069389783345903E-22d);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0069389783345903E-22d + "'", double3 == 3.0069389783345903E-22d);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        double double7 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.density(1.449868410599898E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.148287320873074d, 0.8555432059633667d, 0.48029783022186145d);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6155223357908637d, 0.7422678166643543d, 3.181009226124227E-44d);
        double double6 = fDistribution4.inverseCumulativeProbability(0.6140485448030906d);
        double double7 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution4.getNumericalMean();
        boolean boolean9 = fDistribution4.isSupportConnected();
        double double12 = fDistribution4.probability(0.6975449779484513d, (double) '#');
        boolean boolean13 = fDistribution4.isSupportUpperBoundInclusive();
        double double14 = fDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0611928590791497d + "'", double6 == 2.0611928590791497d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6155223357908637d + "'", double7 == 0.6155223357908637d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.36766337145906025d + "'", double12 == 0.36766337145906025d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.181009226124227E-44d + "'", double14 == 3.181009226124227E-44d);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.sample();
        double double10 = uniformRealDistribution0.cumulativeProbability(2.110510360748271d);
        double double12 = uniformRealDistribution0.probability(0.5308453415901209d);
        double double13 = uniformRealDistribution0.sample();
        boolean boolean14 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "26) test3118(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9695786182554402d + "'", double8 == 0.9695786182554402d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
// flaky "4) test3118(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5102198776153877d + "'", double13 == 0.5102198776153877d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7387842926428161d, 0.9382068481430984d);
        double double4 = uniformRealDistribution2.density(1.7142455852563852d);
        double double5 = uniformRealDistribution2.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7387842926428161d + "'", double5 == 0.7387842926428161d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5509385983974154d + "'", double6 == 0.5509385983974154d);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7538686543859143d, 0.006628697802916972d, 0.6188888698210222d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.754) must be strictly less than upper bound (0.007)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.864751955633795d, (double) (short) 10, 0.864751955633795d);
        boolean boolean5 = fDistribution4.isSupportLowerBoundInclusive();
        double double6 = fDistribution4.getNumericalMean();
        boolean boolean7 = fDistribution4.isSupportConnected();
        double double9 = fDistribution4.density(0.5136786842745509d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3819330567015203d + "'", double9 == 0.3819330567015203d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(2.245686793821953d, 0.7551905000466074d);
        double double4 = fDistribution2.density(0.014492840063719415d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7578210315255025d + "'", double4 == 0.7578210315255025d);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.probability((double) (-1L));
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        double double10 = uniformRealDistribution0.density(0.0012523652574455647d);
        boolean boolean11 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double12 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "27) test3124(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9192321619950927d + "'", double4 == 0.9192321619950927d);
// flaky "5) test3124(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4992196144841854d + "'", double5 == 0.4992196144841854d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "1) test3124(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6235074241354226d + "'", double12 == 0.6235074241354226d);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 7.562099861400877E-28d, 0.9280868261112525d, 0.6089308656102914d);
        double double5 = fDistribution4.getNumericalMean();
        double double7 = fDistribution4.density((double) 1.0f);
        boolean boolean8 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.7810499307004314E-28d + "'", double7 == 3.7810499307004314E-28d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.4226077302684093d, 0.2615716343776677d, 0.00461193290190975d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.probability(0.8914241055526231d);
        double double13 = fDistribution3.getSupportLowerBound();
        double[] doubleArray15 = fDistribution3.sample((int) '#');
        boolean boolean16 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        uniformRealDistribution0.reseedRandomGenerator((long) ' ');
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double12 = fDistribution3.calculateNumericalVariance();
        fDistribution3.reseedRandomGenerator((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "28) test3130(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5904924947934853d + "'", double9 == 0.5904924947934853d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        double double9 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "29) test3131(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7329782082000769d + "'", double4 == 0.7329782082000769d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6882388789316614d, 0.7852621085053451d, 9.435082943715062E-15d);
        double double6 = fDistribution4.cumulativeProbability(0.22693576719907352d);
        double double8 = fDistribution4.cumulativeProbability(2.085190828896783E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3416860642950976d + "'", double6 == 0.3416860642950976d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0065388363509497295d + "'", double8 == 0.0065388363509497295d);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        double double8 = uniformRealDistribution0.density(0.4795363571652773d);
        double double10 = uniformRealDistribution0.inverseCumulativeProbability(0.625504238759457d);
        double double11 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "30) test3133(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6414546213036723d + "'", double4 == 0.6414546213036723d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.625504238759457d + "'", double10 == 0.625504238759457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8354713638140709d, 0.9966872852742321d, (double) 100.0f);
        double double6 = uniformRealDistribution4.density(0.6119517974962971d);
        double double8 = uniformRealDistribution4.density(0.29031912847631514d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = uniformRealDistribution4.cumulativeProbability(0.8034790906066183d, 0.16300445490510374d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.803) must be less than or equal to upper endpoint (0.163)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (byte) 0, 0.32855777055119706d);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.042293209129396825d, 0.17954687407105752d);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution2.isSupportConnected();
        boolean boolean5 = uniformRealDistribution2.isSupportConnected();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.calculateNumericalVariance();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.probability(0.5662656190788444d);
        boolean boolean10 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution2.density(0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 3.0034674852582924E-11d, 0.0065557735696384345d, 0.7052885375206825d);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = uniformRealDistribution4.sample(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0065557735696384345d + "'", double5 == 0.0065557735696384345d);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6901818102804299d, 0.08852542671178854d, 0.17603004168266123d);
        boolean boolean5 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.24882272555718465d, 0.7551905000466074d, 2.007657447155151d);
        double double4 = fDistribution3.getNumericalMean();
        double double5 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.24882272555718465d + "'", double5 == 0.24882272555718465d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.24882272555718465d + "'", double6 == 0.24882272555718465d);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.sample();
        double double10 = uniformRealDistribution2.cumulativeProbability(0.19963923310118198d);
        double double12 = uniformRealDistribution2.density(0.13160684312953563d);
        double double13 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double[] doubleArray9 = fDistribution3.sample((int) '4');
        double double10 = fDistribution3.calculateNumericalVariance();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.sample();
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double14 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "31) test3145(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6309785434018383d + "'", double7 == 0.6309785434018383d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
// flaky "6) test3145(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.9493343538413592d + "'", double12 == 1.9493343538413592d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7697131649614974d, 0.4485770812615808d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.77) must be strictly less than upper bound (0.449)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6851772303251921d, 0.6976067833842337d, 0.3164687886038654d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportConnected();
        double double7 = uniformRealDistribution3.cumulativeProbability(0.3017638491436605d);
        boolean boolean8 = uniformRealDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6913920068547128d + "'", double4 == 0.6913920068547128d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double5 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.probability((double) (byte) 0);
        double double8 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double4 = uniformRealDistribution0.density(10.0d);
        double double5 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double[] doubleArray10 = uniformRealDistribution0.sample((int) '#');
        uniformRealDistribution0.reseedRandomGenerator((-1L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "32) test3149(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1296517943566171d + "'", double5 == 0.1296517943566171d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
// flaky "7) test3149(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4087104034421374d + "'", double7 == 0.4087104034421374d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.04519796485307248d);
        double double3 = uniformRealDistribution2.getNumericalMean();
        boolean boolean4 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution2.inverseCumulativeProbability(0.8414531941129211d);
        double double7 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02259898242653624d + "'", double3 == 0.02259898242653624d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.038031971893021384d + "'", double6 == 0.038031971893021384d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.04519796485307248d + "'", double7 == 0.04519796485307248d);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(2.7171475092674E-46d, (double) 100L, 0.6121227109766438d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0204081632653061d + "'", double5 == 1.0204081632653061d);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.00461193290190975d, 0.22784864240342606d, 0.7928067872931985d);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 10L, 0.7697294817344926d);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double double4 = fDistribution2.calculateNumericalVariance();
        double double5 = fDistribution2.getSupportLowerBound();
        boolean boolean6 = fDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.probability(0.5662656190788444d);
        boolean boolean10 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        boolean boolean11 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean12 = uniformRealDistribution2.isSupportConnected();
        double double13 = uniformRealDistribution2.getNumericalMean();
        double double14 = uniformRealDistribution2.getNumericalMean();
        double double15 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 250.839785026644d, 1.2874482437294174E-5d, 0.9341015746828489d);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.9450739500126666d, 0.028114328822558377d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.945) must be strictly less than upper bound (0.028)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.864751955633795d, (double) (short) 10, 0.864751955633795d);
        double double6 = fDistribution4.probability(0.8870908559281685d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.cumulativeProbability(0.0d);
        double double14 = fDistribution3.cumulativeProbability((double) (short) 100);
        double[] doubleArray16 = fDistribution3.sample((int) (short) 100);
        double double17 = fDistribution3.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass18 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "33) test3158(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.101753491666164d + "'", double9 == 4.101753491666164d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double3 = uniformRealDistribution2.getNumericalMean();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution2.density(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution0.sample();
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean8 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "34) test3160(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9168221733770399d + "'", double4 == 0.9168221733770399d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "8) test3160(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.878527633598738d + "'", double6 == 0.878527633598738d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        boolean boolean7 = fDistribution3.isSupportConnected();
        double[] doubleArray9 = fDistribution3.sample((int) ' ');
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator(100L);
        double double13 = fDistribution3.sample();
        double double14 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6282061437518466d + "'", double13 == 0.6282061437518466d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.3236068215490236E16d, 0.7697131649614974d, 1.449868410599899E16d);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 2.245686793821953d, 0.8188608846558519d, 0.21473789149465494d);
        double double6 = fDistribution4.cumulativeProbability(0.47245807661821626d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.25764916416736167d + "'", double6 == 0.25764916416736167d);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        double[] doubleArray11 = fDistribution3.sample((int) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "35) test3164(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6919676610453276d + "'", double7 == 0.6919676610453276d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.15182552239276648d, 0.2522324101367044d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistribution2.cumulativeProbability(0.5873390868216388d, 0.274069955546397d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.587) must be less than or equal to upper endpoint (0.274)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.9952223101180306d);
        double double3 = uniformRealDistribution2.getNumericalMean();
        double double5 = uniformRealDistribution2.probability(0.7150065005108781d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4976111550590153d + "'", double3 == 0.4976111550590153d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean11 = fDistribution3.isSupportConnected();
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double double14 = fDistribution3.probability(12.552873165287084d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.435082943715062E-15d + "'", double10 == 9.435082943715062E-15d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (-0.9384008227635308d), 3.4443238954721584d, 0.9375754745450884d);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.41166628889519163d, 0.7924032762027111d, 0.83773673692955d);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double double4 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.calculateNumericalVariance();
        double double6 = fDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.463149570621243d + "'", double5 == 3.463149570621243d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample(1);
        double double7 = uniformRealDistribution0.density((double) (-1));
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.getNumericalVariance();
        double double12 = uniformRealDistribution0.probability(0.10917347757783191d, 0.8112398469157531d);
        double double13 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "36) test3171(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7808374060355694d + "'", double3 == 0.7808374060355694d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "9) test3171(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.9774815535038226d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7020663693379212d + "'", double12 == 0.7020663693379212d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5190573322162404d, 0.7283674369075639d);
        double double3 = fDistribution2.getNumericalVariance();
        boolean boolean4 = fDistribution2.isSupportConnected();
        double double5 = fDistribution2.getSupportUpperBound();
        double double6 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        double double9 = uniformRealDistribution0.density(0.048161091562381575d);
        java.lang.Class<?> wildcardClass10 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double10 = fDistribution3.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistribution3.inverseCumulativeProbability(2.2920557083601523d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 2.292 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double7 = fDistribution4.cumulativeProbability((double) (short) -1, 0.0d);
        boolean boolean8 = fDistribution4.isSupportConnected();
        boolean boolean9 = fDistribution4.isSupportUpperBoundInclusive();
        double double10 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.2972162083012442d, 0.7587933557019179d, 0.41168915463113165d);
        double double4 = fDistribution3.getSupportUpperBound();
        double double5 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7587933557019179d + "'", double5 == 0.7587933557019179d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.cumulativeProbability((-1.0d), (double) ' ');
        double double10 = uniformRealDistribution0.sample();
        double double12 = uniformRealDistribution0.density(0.6298895737356116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
// flaky "37) test3177(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2014279476648364d + "'", double10 == 0.2014279476648364d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution2.probability((double) 1L);
        double double9 = uniformRealDistribution2.getNumericalVariance();
        uniformRealDistribution2.reseedRandomGenerator(1L);
        java.lang.Class<?> wildcardClass12 = uniformRealDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(2.38352422163308d, 0.7959730993125327d, 0.7432319455531449d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.384) must be strictly less than upper bound (0.796)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.probability(0.6541717467536889d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = uniformRealDistribution0.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.getSupportUpperBound();
        double double9 = fDistribution4.cumulativeProbability(0.6715292022072981d);
        boolean boolean10 = fDistribution4.isSupportConnected();
        double double11 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4995184744492604d + "'", double9 == 0.4995184744492604d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.49884479899047296d, 1.0d, (double) 1.0f);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.49884479899047296d + "'", double5 == 0.49884479899047296d);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7808374060355694d, 0.43457616175995906d, 36.22126828088923d);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.sample();
        boolean boolean9 = uniformRealDistribution0.isSupportConnected();
        boolean boolean10 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double11 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "38) test3184(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26426621653078497d + "'", double4 == 0.26426621653078497d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "10) test3184(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.06568088379908477d + "'", double8 == 0.06568088379908477d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7387842926428161d, 0.9382068481430984d);
        double double3 = uniformRealDistribution2.getSupportUpperBound();
        double double5 = uniformRealDistribution2.density(0.7883955810914687d);
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9382068481430984d + "'", double3 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0144779134503885d + "'", double5 == 5.0144779134503885d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9382068481430984d + "'", double6 == 0.9382068481430984d);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.864751955633795d, (double) (short) 10, 0.864751955633795d);
        double double5 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.getNumericalVariance();
        double double14 = fDistribution3.inverseCumulativeProbability(0.5190573322162404d);
        double double15 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double16 = fDistribution3.getSupportUpperBound();
        double double17 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "39) test3187(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.9126677388534903d + "'", double7 == 1.9126677388534903d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7625534595104149d + "'", double14 == 0.7625534595104149d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.23541417210258242d + "'", double17 == 0.23541417210258242d);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(1.5406071591967148E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.5406071591967148E-5d + "'", double6 == 1.5406071591967148E-5d);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7444672660413132d, 0.8140391155712257d, 0.098126171830621d);
        double double6 = uniformRealDistribution3.cumulativeProbability(0.0d, 0.18824562025567593d);
        double double8 = uniformRealDistribution3.probability(1.9541838208338267d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = uniformRealDistribution3.cumulativeProbability(0.8942924960310608d, 0.695604531760929d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.894) must be less than or equal to upper endpoint (0.696)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double12 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.49884479899047296d, 0.23541417210258242d);
        double double4 = fDistribution2.density(0.021095169454586005d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7854060450133113d + "'", double4 == 1.7854060450133113d);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.9952223101180306d);
        double double3 = uniformRealDistribution2.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = uniformRealDistribution2.probability(0.8025566058551445d, 0.6675243906670285d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.803) must be less than or equal to upper endpoint (0.668)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4976111550590153d + "'", double3 == 0.4976111550590153d);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.821268839644571d, 0.43235712546971d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.821) must be strictly less than upper bound (0.432)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        boolean boolean4 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1461186724330432d + "'", double5 == 0.1461186724330432d);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double9 = fDistribution3.cumulativeProbability(0.7052885375206825d);
        double double10 = fDistribution3.getNumericalMean();
        double[] doubleArray12 = fDistribution3.sample(10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2825647997707858d + "'", double9 == 0.2825647997707858d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertNotNull(doubleArray12);
// flaky "40) test3195(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 3.242064865267389d, 2.3301937373050943d, 2.221548235926403d, 0.7703242418741709d, 0.5921531442604937d, 0.6648397878767264d, 0.6034327129021576d, 0.6142042822618871d, 0.819085453859149d, 0.7860848852206175d }, 1.0E-15);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8354713638140709d, 0.9966872852742321d, (double) 100.0f);
        double double6 = uniformRealDistribution4.density(0.6119517974962971d);
        double double7 = uniformRealDistribution4.getNumericalMean();
        boolean boolean8 = uniformRealDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9160793245441515d + "'", double7 == 0.9160793245441515d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.36060793522756507d, 0.8460138802083401d, 0.7459227016817964d);
        double double5 = fDistribution4.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8460138802083401d + "'", double5 == 0.8460138802083401d);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double10 = uniformRealDistribution2.density((double) (short) 1);
        double double11 = uniformRealDistribution2.getNumericalMean();
        double double12 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double13 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-9d + "'", double13 == 1.0E-9d);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double12 = fDistribution3.getSolverAbsoluteAccuracy();
        double double14 = fDistribution3.probability(0.48323678369188483d);
        double double16 = fDistribution3.density(0.6804787741269758d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9066735920498323d + "'", double16 == 0.9066735920498323d);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double7 = fDistribution3.density(0.0d);
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean9 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double11 = fDistribution3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistribution3.cumulativeProbability(0.7446310292910352d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.745) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
// flaky "41) test3200(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        double double8 = uniformRealDistribution0.sample();
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "42) test3201(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15290675837215417d + "'", double8 == 0.15290675837215417d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.9806378470314243d, 94.65924681974921d);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        double double5 = fDistribution3.density(0.01169910375012293d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.9088576301189435d + "'", double5 == 2.9088576301189435d);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.49884479899047296d, 0.23541417210258242d);
        double double3 = fDistribution2.getSolverAbsoluteAccuracy();
        double double4 = fDistribution2.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution2.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-9d + "'", double3 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.49884479899047296d + "'", double4 == 0.49884479899047296d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double8 = fDistribution3.cumulativeProbability(10.0d);
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.sample();
        double double11 = fDistribution3.getSupportLowerBound();
        java.lang.Class<?> wildcardClass12 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999758308d + "'", double8 == 0.9999999999758308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
// flaky "43) test3205(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.getNumericalMean();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double11 = fDistribution3.density(0.7948236153171645d);
        double double12 = fDistribution3.getNumericalVariance();
        double[] doubleArray14 = fDistribution3.sample((int) 'a');
        double double15 = fDistribution3.getSupportUpperBound();
        boolean boolean16 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9391513127071319d + "'", double11 == 0.9391513127071319d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.7852621085053451d, 0.44568866888716197d);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.3598703032735273d, 0.6006834726043084d);
        double double4 = fDistribution2.density(0.16300445490510374d);
        boolean boolean5 = fDistribution2.isSupportConnected();
        double double7 = fDistribution2.probability(0.6917725062323477d);
        double double8 = fDistribution2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4640670180703557d + "'", double4 == 0.4640670180703557d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "44) test3208(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.588316739313077d + "'", double8 == 5.588316739313077d);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.625504238759457d, 0.8811994355886743d);
        double double4 = fDistribution2.density(0.12064284307588324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7661254692996333d + "'", double4 == 0.7661254692996333d);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.2972162083012442d, 0.7587933557019179d, 0.41168915463113165d);
        double double4 = fDistribution3.getSupportUpperBound();
        double double5 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2972162083012442d + "'", double5 == 0.2972162083012442d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double11 = fDistribution3.cumulativeProbability(0.6957245310498591d);
        double double12 = fDistribution3.getSupportLowerBound();
        double double13 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2737809697987744d + "'", double11 == 0.2737809697987744d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.density(0.6338262572667233d);
        double double8 = uniformRealDistribution0.sample();
        double double9 = uniformRealDistribution0.getNumericalMean();
        double double10 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
// flaky "45) test3212(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7307555575203657d + "'", double8 == 0.7307555575203657d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.3551385866867541d, 0.7187458048539017d);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5831064787455089d, 1.449868410599931E16d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double4 = uniformRealDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7517653400463083E31d + "'", double4 == 1.7517653400463083E31d);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.calculateNumericalVariance();
        fDistribution3.reseedRandomGenerator((long) 0);
        double double14 = fDistribution3.getSupportLowerBound();
        fDistribution3.reseedRandomGenerator(100L);
        double double17 = fDistribution3.getSupportLowerBound();
        double[] doubleArray19 = fDistribution3.sample(1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.6282061437518466d }, 1.0E-15);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        double double12 = fDistribution3.density(0.005949830804446096d);
        boolean boolean13 = fDistribution3.isSupportConnected();
        boolean boolean14 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.9288831817318313E-7d + "'", double12 == 1.9288831817318313E-7d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.sample();
        double double10 = uniformRealDistribution0.getNumericalMean();
        double double12 = uniformRealDistribution0.inverseCumulativeProbability(0.5796272011751153d);
        double double15 = uniformRealDistribution0.probability(0.08230110552505629d, 0.8378599819445101d);
        double double16 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "46) test3217(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7918146619558353d + "'", double4 == 0.7918146619558353d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
// flaky "11) test3217(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.07932621252496475d + "'", double9 == 0.07932621252496475d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5796272011751153d + "'", double12 == 0.5796272011751153d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.7555588764194537d + "'", double15 == 0.7555588764194537d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.getNumericalVariance();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        double double13 = fDistribution3.getNumericalVariance();
        double double15 = fDistribution3.probability(0.10612643076709594d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "47) test3218(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7213400148251248d + "'", double9 == 0.7213400148251248d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6240903316275141d, 0.6470622058747345d);
        double double4 = fDistribution2.density(0.9966872852742321d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1150296948396696d + "'", double4 == 0.1150296948396696d);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator(100L);
        double double13 = fDistribution3.getNumericalMean();
        double double14 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.886181434554816d, 0.8208457026197589d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        double double7 = fDistribution3.getNumericalVariance();
        double double8 = fDistribution3.getNumericalVariance();
        double double10 = fDistribution3.cumulativeProbability(0.6907167210019161d);
        double double12 = fDistribution3.cumulativeProbability(1.9099235499431497E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26920144669880425d + "'", double10 == 0.26920144669880425d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.077251675858915E-18d + "'", double12 == 8.077251675858915E-18d);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.20172357187228318d, 0.7442989854965621d);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.9222854825093614d, 0.27747954593041024d, 0.2035572430781889d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.922) must be strictly less than upper bound (0.277)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.density(0.23541417210258242d);
        double double8 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "48) test3225(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7496090200566832d + "'", double3 == 0.7496090200566832d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double10 = fDistribution3.probability(0.7537287967617665d, 0.8447630313072814d);
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08529529275031239d + "'", double10 == 0.08529529275031239d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.5733968575051716d, 0.8743111069910592d, 5.964322516717098E-6d);
        boolean boolean5 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6006834726043084d, 0.7920480023859471d, 0.6684474749999711d);
        double double5 = fDistribution4.getSolverAbsoluteAccuracy();
        double double6 = fDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6684474749999711d + "'", double5 == 0.6684474749999711d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double4 = uniformRealDistribution0.density(10.0d);
        double double5 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.sample();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = uniformRealDistribution0.probability(1.25d, 0.15220410197765788d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1.25) must be less than or equal to upper endpoint (0.152)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "49) test3229(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8382309301047757d + "'", double5 == 0.8382309301047757d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
// flaky "12) test3229(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.017364463711658784d + "'", double7 == 0.017364463711658784d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.probability(0.8914241055526231d);
        fDistribution3.reseedRandomGenerator((long) ' ');
        double double15 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23541417210258242d + "'", double15 == 0.23541417210258242d);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double13 = fDistribution3.density(0.2972162083012442d);
        double double15 = fDistribution3.density(0.6836071484595452d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2469344302725767d + "'", double13 == 0.2469344302725767d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9086942757105466d + "'", double15 == 0.9086942757105466d);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.0d, 0.8421066660850904d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        uniformRealDistribution0.reseedRandomGenerator((long) (short) 0);
        double double13 = uniformRealDistribution0.density(6.895467423525113E15d);
        boolean boolean14 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double16 = uniformRealDistribution0.probability(0.46363601407876476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "50) test3233(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1438119797938493d + "'", double4 == 0.1438119797938493d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double10 = fDistribution3.getNumeratorDegreesOfFreedom();
        double[] doubleArray12 = fDistribution3.sample((int) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator((-1L));
        fDistribution3.reseedRandomGenerator((long) '4');
        double double17 = fDistribution3.getSupportUpperBound();
        double double19 = fDistribution3.density(0.6338262572667233d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "51) test3235(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8084906196345517d + "'", double7 == 0.8084906196345517d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.8684239790898115d + "'", double19 == 0.8684239790898115d);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.getNumericalVariance();
        double double10 = uniformRealDistribution2.sample();
        double double11 = uniformRealDistribution2.getSupportLowerBound();
        double double12 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        boolean boolean13 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6320283107957593d, 0.7810395258119183d, (double) (byte) 100);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6819205762503122d, 0.08333333333333333d, 0.3702234039813894d);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double8 = uniformRealDistribution0.probability(2.554881495381541E-4d, 0.26637048650274964d);
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        double double13 = uniformRealDistribution0.cumulativeProbability(0.7680367961973186d, 0.9441357645782928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2661149983532115d + "'", double8 == 0.2661149983532115d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.17609896838097427d + "'", double13 == 0.17609896838097427d);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean7 = uniformRealDistribution2.isSupportConnected();
        double double10 = uniformRealDistribution2.probability(0.7210443502558348d, 36.49420035927487d);
        double double11 = uniformRealDistribution2.getNumericalVariance();
        boolean boolean12 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8914306597714141d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.891) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getNumericalMean();
        boolean boolean8 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean9 = uniformRealDistribution0.isSupportConnected();
        double double10 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "52) test3242(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5677314958717403d + "'", double10 == 0.5677314958717403d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.625504238759457d, 0.7697294817344926d);
        double double3 = fDistribution2.calculateNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.17805249610135543d, 0.3494382387151369d);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.density(1.449868410599931E16d);
        double double8 = uniformRealDistribution0.sample();
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double[] doubleArray11 = uniformRealDistribution0.sample((int) (byte) 100);
        double double12 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "53) test3245(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.16779007981000138d + "'", double3 == 0.16779007981000138d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "13) test3245(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2729986678322034d + "'", double8 == 0.2729986678322034d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double12 = fDistribution3.getNumericalMean();
        double double14 = fDistribution3.cumulativeProbability(0.6391854256750903d);
        boolean boolean15 = fDistribution3.isSupportUpperBoundInclusive();
        double double17 = fDistribution3.inverseCumulativeProbability(0.24311283302854653d);
        fDistribution3.reseedRandomGenerator((long) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0210526315789474d + "'", double12 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2230878854254442d + "'", double14 == 0.2230878854254442d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6480174446154539d + "'", double17 == 0.6480174446154539d);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7167893764850413d, 0.3081113430701268d, 0.5123380143439111d);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportConnected();
        double[] doubleArray9 = fDistribution3.sample((int) 'a');
        double double10 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.density(7.847827245153567E-4d);
        double double9 = uniformRealDistribution0.density(0.0d);
        double double10 = uniformRealDistribution0.getSupportLowerBound();
        double double11 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08333333333333333d + "'", double11 == 0.08333333333333333d);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.6155223357908637d);
        double[] doubleArray10 = uniformRealDistribution0.sample((int) '4');
        double double12 = uniformRealDistribution0.cumulativeProbability(0.4590295860592326d);
        double double14 = uniformRealDistribution0.density(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6155223357908637d + "'", double8 == 0.6155223357908637d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.4590295860592326d + "'", double12 == 0.4590295860592326d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double5 = uniformRealDistribution0.inverseCumulativeProbability(0.544127331049072d);
        double double6 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.8590663588185146d);
        boolean boolean9 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean10 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution0.cumulativeProbability(0.6964182785325538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.544127331049072d + "'", double5 == 0.544127331049072d);
// flaky "54) test3251(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5945566472915949d + "'", double6 == 0.5945566472915949d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8590663588185146d + "'", double8 == 0.8590663588185146d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6964182785325538d + "'", double12 == 0.6964182785325538d);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5908324567516213d, 0.7776240210062073d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double double3 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
// flaky "55) test3253(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.12403806786301086d + "'", double3 == 0.12403806786301086d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.264723981131892d, 3.0372259052527317d, 0.5004359771645597d);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.15757433201470894d, 0.04086588737802615d, 0.6726028879594651d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.158) must be strictly less than upper bound (0.041)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (-0.05428794722368846d), 0.41166628889519163d, 5.0144779134503885d);
        double double5 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution4.density(0.9193842879406898d);
        boolean boolean8 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0144779134503885d + "'", double5 == 5.0144779134503885d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7941015035099954d, 5.311814001804952E-4d, 0.8690995197621648d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.794) must be strictly less than upper bound (0.001)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5862855486011069d, 1.891638138522826d, 32.0d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        boolean boolean6 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double12 = fDistribution3.probability(6.006934970516585E-11d);
        boolean boolean13 = fDistribution3.isSupportConnected();
        double double14 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0210526315789474d + "'", double14 == 1.0210526315789474d);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double8 = fDistribution3.cumulativeProbability(10.0d);
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.sample();
        double double11 = fDistribution3.getSupportLowerBound();
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double double13 = fDistribution3.getNumericalMean();
        double double14 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean15 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999758308d + "'", double8 == 0.9999999999758308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
// flaky "56) test3261(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.030276566879456d + "'", double10 == 2.030276566879456d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.39037743876434505d, 3.4708697385508454d, 0.7420332690435305d);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, (double) (short) 10);
        double double3 = uniformRealDistribution2.getNumericalMean();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.cumulativeProbability(0.6209274159326524d);
        double double12 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.20730267740569058d + "'", double11 == 0.20730267740569058d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        fDistribution3.reseedRandomGenerator(100L);
        double double14 = fDistribution3.inverseCumulativeProbability(0.07261445470276517d);
        double double16 = fDistribution3.inverseCumulativeProbability(0.05815067890837344d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "57) test3265(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7174578846982844d + "'", double9 == 0.7174578846982844d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.getSupportUpperBound();
        double double9 = uniformRealDistribution0.getSupportUpperBound();
        double double10 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean11 = uniformRealDistribution0.isSupportConnected();
        java.lang.Class<?> wildcardClass12 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "58) test3266(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8284117095601193d + "'", double7 == 0.8284117095601193d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSolverAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass6 = fDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5190573322162404d + "'", double5 == 0.5190573322162404d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double8 = uniformRealDistribution0.density(0.5578665771070024d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "59) test3268(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.2884263804806506d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5900933138947044d, 0.6007038962578557d);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.24882272555718465d, 0.7551905000466074d, 2.007657447155151d);
        boolean boolean4 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.49884479899047296d, 0.6177180781591378d, 0.6167715285164661d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution3.sample();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.cumulativeProbability(0.4810554119651589d);
        double double11 = fDistribution3.probability(0.6207181555721704d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6177180781591378d + "'", double4 == 0.6177180781591378d);
// flaky "60) test3271(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.46061517071057884d + "'", double9 == 0.46061517071057884d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double6 = uniformRealDistribution0.density((double) (-1L));
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.sample();
        double double9 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "61) test3272(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.10728140561758592d + "'", double8 == 0.10728140561758592d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double12 = fDistribution3.cumulativeProbability(0.0d);
        double double13 = fDistribution3.calculateNumericalVariance();
        double[] doubleArray15 = fDistribution3.sample(1);
        double double16 = fDistribution3.getSupportLowerBound();
        boolean boolean17 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "62) test3273(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray15);
// flaky "14) test3273(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.7518942129548526d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double5 = uniformRealDistribution0.inverseCumulativeProbability(0.544127331049072d);
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.544127331049072d + "'", double5 == 0.544127331049072d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        boolean boolean11 = fDistribution3.isSupportConnected();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        double double13 = fDistribution3.getNumericalVariance();
        double double14 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.2171226463385189d, 0.7959730993125327d, 0.09569794207595081d);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6553695282217037d, (double) 1, 0.6119517974962971d);
        double double6 = uniformRealDistribution4.cumulativeProbability(1.9080987582593552d);
        double double7 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6119517974962971d + "'", double7 == 0.6119517974962971d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6119517974962971d + "'", double8 == 0.6119517974962971d);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportConnected();
        double double9 = fDistribution3.getNumericalVariance();
        double double11 = fDistribution3.probability(0.41787496472956587d);
        double double12 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.544127331049072d, 0.6675243906670285d, 1.449868410599931E16d);
        double double4 = uniformRealDistribution3.getNumericalVariance();
        double double5 = uniformRealDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0012689028601964602d + "'", double4 == 0.0012689028601964602d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6058258608580502d + "'", double5 == 0.6058258608580502d);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.4978989679529988d, 0.3508832089431604d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.498) must be strictly less than upper bound (0.351)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.1794555400877822d, 0.5622678778631145d, 0.10532175426309509d);
        double double5 = fDistribution3.cumulativeProbability(0.7199644178463855d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6820601634879685d + "'", double5 == 0.6820601634879685d);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability((-1.0d), (double) 1L);
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getSupportUpperBound();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5509385983974154d + "'", double6 == 0.5509385983974154d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5415785819031833d, 0.7938684212191616d);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution2.density(1.7460710687361405d);
        boolean boolean6 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean13 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean14 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.0E-6d, 0.9787873837142649d);
        boolean boolean3 = uniformRealDistribution2.isSupportConnected();
        double double5 = uniformRealDistribution2.cumulativeProbability(6.947267157524843d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(1.449868410599931E16d, 0.4109542347735471d, 0.19963923310118198d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4109542347735471d + "'", double4 == 0.4109542347735471d);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.11824566512461154d, 0.6851772303251921d);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7915692479106915d, 0.06327517040544373d, 0.6146624655606938d);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double10 = uniformRealDistribution2.density((double) (short) 1);
        double double11 = uniformRealDistribution2.getNumericalMean();
        double double12 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double14 = uniformRealDistribution2.density(0.8826348588196709d);
        boolean boolean15 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double16 = uniformRealDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5960888007054935d, 1.9360565928776965d, 0.3183740885594053d);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 1, 9.435082943715062E-15d, 0.7627482092423561d);
        double double6 = fDistribution4.cumulativeProbability(2.2293967067569245d);
        double double7 = fDistribution4.getSolverAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.6131540547803525E-13d + "'", double6 == 1.6131540547803525E-13d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7627482092423561d + "'", double7 == 0.7627482092423561d);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.48365461899110573d, 1.9941381926271031d);
        double double3 = fDistribution2.calculateNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 100.0d, Double.POSITIVE_INFINITY, (double) (byte) 1);
        double double6 = uniformRealDistribution4.probability(2.3502599751932776d);
        boolean boolean7 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        boolean boolean8 = uniformRealDistribution4.isSupportConnected();
        double double9 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        boolean boolean10 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.5991741432213574d, 0.44175393622014125d, 1.7464806299478124d);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.35236822917322286d, 0.6215638124487862d, 0.47814664569296167d);
        double double4 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6391854256750903d, 0.3728694875041465d, 88.41710856256726d);
        double double5 = fDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 88.41710856256726d + "'", double5 == 88.41710856256726d);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(2.7171475092674E-46d, (double) 100L, 0.6121227109766438d);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.probability(5.0144779134503885d);
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.7171475092674E-46d + "'", double4 == 2.7171475092674E-46d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0204081632653061d + "'", double7 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.274036397301435d + "'", double4 == 1.274036397301435d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.getNumericalVariance();
        boolean boolean10 = uniformRealDistribution2.isSupportConnected();
        double double11 = uniformRealDistribution2.sample();
        double double12 = uniformRealDistribution2.sample();
        double double13 = uniformRealDistribution2.getNumericalVariance();
        double double14 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-9d + "'", double14 == 1.0E-9d);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.9773985332011879d, 0.5896041010294244d, 12.552873165287084d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.977) must be strictly less than upper bound (0.59)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean8 = fDistribution3.isSupportConnected();
        double double10 = fDistribution3.density(0.7756006906642181d);
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9392958670836069d + "'", double10 == 0.9392958670836069d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.042293209129396825d, 0.17954687407105752d);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution2.cumulativeProbability(0.544127331049072d);
        double double6 = uniformRealDistribution2.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = uniformRealDistribution2.cumulativeProbability(0.5622919087669369d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.562) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0015698807116598047d + "'", double6 == 0.0015698807116598047d);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.8082594002622812d, 0.7096782779951498d, 0.8232479275130409d);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double5 = uniformRealDistribution0.getNumericalMean();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double[] doubleArray8 = uniformRealDistribution0.sample((int) (byte) 10);
        double double10 = uniformRealDistribution0.cumulativeProbability(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray8);
// flaky "63) test3307(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.867009962247727d, 0.13409516150134593d, 0.2884363631429352d, 0.6773647595262966d, 0.44108619481502376d, 0.4852945199770742d, 0.8685376621244523d, 0.38338973279168087d, 0.007025250884794554d, 0.4779410678782947d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample(1);
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.probability(0.0d);
        double double9 = uniformRealDistribution0.sample();
        boolean boolean10 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "64) test3309(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14753569874723138d + "'", double3 == 0.14753569874723138d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "15) test3309(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.9905247977259606d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky "2) test3309(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23003674406207653d + "'", double9 == 0.23003674406207653d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0d, 0.03637004506874407d, 0.04407790089299341d);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        double double12 = fDistribution3.getNumericalVariance();
        double double14 = fDistribution3.cumulativeProbability(0.6195653609603238d);
        double double15 = fDistribution3.getNumericalVariance();
        double double17 = fDistribution3.probability(1.735866921060695d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "65) test3311(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.20613893856973478d + "'", double14 == 0.20613893856973478d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23541417210258242d + "'", double15 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6119517974962971d, 0.5d);
        double double3 = fDistribution2.getSolverAbsoluteAccuracy();
        double double5 = fDistribution2.cumulativeProbability(0.7167893764850413d);
        boolean boolean6 = fDistribution2.isSupportConnected();
        double double8 = fDistribution2.cumulativeProbability(0.3208712536686308d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-9d + "'", double3 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.432713140172196d + "'", double5 == 0.432713140172196d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3534387491807574d + "'", double8 == 0.3534387491807574d);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double7 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportLowerBoundInclusive();
        double double9 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, 0.7822785846661753d);
        double double4 = fDistribution2.cumulativeProbability(0.36766337145906025d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.109009110990686d + "'", double4 == 0.109009110990686d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6403077985814492d, 1.9582657562075956d, 0.13548588609137713d);
        boolean boolean5 = fDistribution4.isSupportLowerBoundInclusive();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6403077985814492d + "'", double6 == 0.6403077985814492d);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.getNumericalVariance();
        double double10 = uniformRealDistribution2.sample();
        double double11 = uniformRealDistribution2.getSupportLowerBound();
        double double12 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double13 = uniformRealDistribution2.getNumericalVariance();
        uniformRealDistribution2.reseedRandomGenerator((long) (byte) 0);
        boolean boolean16 = uniformRealDistribution2.isSupportConnected();
        boolean boolean17 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3551385866867541d, 0.1321317066213935d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.355) must be strictly less than upper bound (0.132)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "66) test3318(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4724482852487788d + "'", double4 == 0.4724482852487788d);
// flaky "16) test3318(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6057511751776232d + "'", double5 == 0.6057511751776232d);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double13 = fDistribution3.inverseCumulativeProbability(0.3379957971411982d);
        double double14 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean15 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6838714210807377d + "'", double13 == 0.6838714210807377d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.449868410599931E16d, 0.6155223357908637d);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double double4 = fDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution3.getNumericalVariance();
        double double7 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution3.getSupportLowerBound();
        double double9 = uniformRealDistribution3.sample();
        double double10 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        double double11 = uniformRealDistribution3.getNumericalVariance();
        double double12 = uniformRealDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05428794722368846d) + "'", double4 == (-0.05428794722368846d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2981237622554617d + "'", double6 == 0.2981237622554617d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
// flaky "67) test3321(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.41367171099981426d + "'", double9 == 0.41367171099981426d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2981237622554617d + "'", double11 == 0.2981237622554617d);
// flaky "17) test3321(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6070454144263213d + "'", double12 == 0.6070454144263213d);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6155223357908637d, 0.7422678166643543d, 3.181009226124227E-44d);
        double double5 = fDistribution4.getSolverAbsoluteAccuracy();
        boolean boolean6 = fDistribution4.isSupportLowerBoundInclusive();
        boolean boolean7 = fDistribution4.isSupportConnected();
        double double8 = fDistribution4.getSupportUpperBound();
        double double10 = fDistribution4.density(2.4231364910490942d);
        double double13 = fDistribution4.cumulativeProbability(0.8795956948503574d, 0.970044719762263d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.181009226124227E-44d + "'", double5 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.04624679214145761d + "'", double10 == 0.04624679214145761d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.01170517142100369d + "'", double13 == 0.01170517142100369d);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8450143223050801d, 0.05519010190337914d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.845) must be strictly less than upper bound (0.055)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.density(0.1757939476207693d);
        double[] doubleArray9 = uniformRealDistribution0.sample(10);
        double double10 = uniformRealDistribution0.getSupportUpperBound();
        double double11 = uniformRealDistribution0.sample();
        double double12 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean13 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
// flaky "68) test3324(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.16724869952391375d, 0.7561686189733567d, 0.23920353156389806d, 0.7761298571996678d, 0.9974756872583961d, 0.3334671589789755d, 0.4203093713175976d, 0.928278051393457d, 0.1734270527589914d, 0.6984263945525968d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
// flaky "18) test3324(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.18010390962937572d + "'", double11 == 0.18010390962937572d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7250311149525168d, 0.6977307745193061d, 3.537396594438314d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.725) must be strictly less than upper bound (0.698)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6736184756655483d, 0.5326816606973473d);
        double double3 = fDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-9d + "'", double3 == 1.0E-9d);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) (byte) -1, 0.625504238759457d, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double13 = fDistribution3.probability(0.09455665419110293d);
        double double14 = fDistribution3.getNumericalVariance();
        double double15 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "69) test3328(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6340633295359905d + "'", double9 == 0.6340633295359905d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23541417210258242d + "'", double15 == 0.23541417210258242d);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1L), 0.8112398469157531d);
        double double3 = uniformRealDistribution2.sample();
        double double4 = uniformRealDistribution2.getSupportLowerBound();
        boolean boolean5 = uniformRealDistribution2.isSupportUpperBoundInclusive();
// flaky "70) test3329(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.6527007820363109d) + "'", double3 == (-0.6527007820363109d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double10 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.cumulativeProbability(2.007657447155151d);
        double double13 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double14 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9594901573103976d + "'", double12 == 0.9594901573103976d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((-0.3349049318106768d), 0.8904061809109827d);
        double double4 = uniformRealDistribution2.cumulativeProbability(0.8669478676573001d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9808552187194506d + "'", double4 == 0.9808552187194506d);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7387842926428161d, 0.9382068481430984d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution2.probability(0.595906678664889d, 0.8300851989496363d);
        double double7 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.45782637815355315d + "'", double6 == 0.45782637815355315d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9382068481430984d + "'", double7 == 0.9382068481430984d);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double13 = fDistribution3.inverseCumulativeProbability(0.3379957971411982d);
        double double14 = fDistribution3.getNumericalMean();
        double double16 = fDistribution3.density(0.0d);
        double double17 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6838714210807377d + "'", double13 == 0.6838714210807377d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0210526315789474d + "'", double14 == 1.0210526315789474d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.23541417210258242d + "'", double17 == 0.23541417210258242d);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6553695282217037d, (double) 1, 0.6119517974962971d);
        double double6 = uniformRealDistribution4.cumulativeProbability(1.9080987582593552d);
        double double7 = uniformRealDistribution4.getSupportUpperBound();
        double double8 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6119517974962971d + "'", double8 == 0.6119517974962971d);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.density(0.390417015564424d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "71) test3335(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.697065140728379d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double7 = uniformRealDistribution0.getNumericalMean();
        boolean boolean8 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "72) test3336(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9568916084617392d + "'", double3 == 0.9568916084617392d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double12 = fDistribution3.probability(6.006934970516585E-11d);
        double double13 = fDistribution3.getSolverAbsoluteAccuracy();
        double double14 = fDistribution3.calculateNumericalVariance();
        double double15 = fDistribution3.getNumericalMean();
        double double16 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        boolean boolean5 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution2.density(0.8795956948503574d);
        double double9 = uniformRealDistribution2.getNumericalMean();
        double double10 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "73) test3339(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6533273338155337d + "'", double3 == 0.6533273338155337d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 10, 0.6167715285164661d);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        double double4 = fDistribution2.getSolverAbsoluteAccuracy();
        double double5 = fDistribution2.getSupportLowerBound();
        double double6 = fDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        double double13 = fDistribution3.probability(0.5415785819031833d, 2.3125942498560286d);
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        double double16 = fDistribution3.density(0.8376911837863257d);
        double double17 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double19 = fDistribution3.inverseCumulativeProbability(0.9941597730832565d);
        double double21 = fDistribution3.cumulativeProbability(0.46061517071057884d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9316998175652447d + "'", double16 == 0.9316998175652447d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.675714521178108d + "'", double19 == 3.675714521178108d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08868516731655281d + "'", double21 == 0.08868516731655281d);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double12 = fDistribution3.probability(6.006934970516585E-11d);
        double double13 = fDistribution3.getSolverAbsoluteAccuracy();
        double double14 = fDistribution3.calculateNumericalVariance();
        boolean boolean15 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.sample();
        java.lang.Class<?> wildcardClass10 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky "74) test3343(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double5 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.probability((double) (byte) 0);
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution4.getSupportLowerBound();
        double double10 = fDistribution4.getNumericalVariance();
        double double12 = fDistribution4.inverseCumulativeProbability(0.3416260639338622d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.864751955633795d, (double) (short) 10, 0.864751955633795d);
        boolean boolean5 = fDistribution4.isSupportLowerBoundInclusive();
        double double6 = fDistribution4.getNumericalMean();
        boolean boolean7 = fDistribution4.isSupportConnected();
        double double8 = fDistribution4.getSolverAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass9 = fDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.864751955633795d + "'", double8 == 0.864751955633795d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double13 = fDistribution3.inverseCumulativeProbability(0.3379957971411982d);
        boolean boolean14 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6838714210807377d + "'", double13 == 0.6838714210807377d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution4.inverseCumulativeProbability(0.8460138802083401d);
        double double10 = fDistribution4.density(50.38759066622216d);
        double double11 = fDistribution4.getSolverAbsoluteAccuracy();
        double double12 = fDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.449868410599931E16d + "'", double8 == 1.449868410599931E16d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.385060066786418E-5d + "'", double10 == 2.385060066786418E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        boolean boolean4 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution3.getNumericalVariance();
        uniformRealDistribution3.reseedRandomGenerator((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1461186724330432d + "'", double6 == 0.1461186724330432d);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        fDistribution3.reseedRandomGenerator(100L);
        double double14 = fDistribution3.inverseCumulativeProbability(0.07261445470276517d);
        boolean boolean15 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "75) test3349(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.395799329496988d + "'", double9 == 2.395799329496988d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.9155713525675118d, 1.903555703894209d, 0.04546292503294002d);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.46363601407876476d, 0.17954687407105752d);
        double double3 = fDistribution2.getNumericalMean();
        double double4 = fDistribution2.getSupportUpperBound();
        boolean boolean5 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double3 = uniformRealDistribution2.getNumericalMean();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution2.getNumericalMean();
        double double7 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability((double) (short) 100);
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double15 = fDistribution3.inverseCumulativeProbability((double) (short) 0);
        double double16 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean13 = fDistribution3.isSupportLowerBoundInclusive();
        double double15 = fDistribution3.probability(0.04127273732944947d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "76) test3354(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.122205805178261d + "'", double7 == 2.122205805178261d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        boolean boolean8 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution4.calculateNumericalVariance();
        double double8 = fDistribution4.getNumericalMean();
        boolean boolean9 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportLowerBound();
        double double9 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6976067833842337d, 0.02741148573788177d, 0.12452611167231531d);
        double double4 = fDistribution3.calculateNumericalVariance();
        boolean boolean5 = fDistribution3.isSupportLowerBoundInclusive();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12452611167231531d + "'", double6 == 0.12452611167231531d);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.41193179565374427d, 3.6814437437668386d, 0.0d);
        double double6 = uniformRealDistribution4.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.27645850507952763d, 0.2782837625077381d, 0.8025566058551445d);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2782837625077381d + "'", double5 == 0.2782837625077381d);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7165875787180795d, 0.7387842926428161d);
        double double3 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7387842926428161d + "'", double3 == 0.7387842926428161d);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.sample();
        double double9 = uniformRealDistribution0.probability(0.04862657509558477d, 0.7637828148702714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "77) test3362(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9900250733241451d + "'", double6 == 0.9900250733241451d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7151562397746867d + "'", double9 == 0.7151562397746867d);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5481631600215288d, 0.6338262572667233d, 0.4734133622588723d);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double5 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.inverseCumulativeProbability((double) 0);
        boolean boolean8 = fDistribution4.isSupportConnected();
        double double9 = fDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3801629465009775d, 0.7772124203157265d);
        double double4 = uniformRealDistribution2.cumulativeProbability(2.654819023133747d);
        double double6 = uniformRealDistribution2.inverseCumulativeProbability(0.43317774792102504d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5521559433812785d + "'", double6 == 0.5521559433812785d);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double6 = uniformRealDistribution0.getNumericalMean();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        boolean boolean11 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "78) test3367(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.16435044738564542d + "'", double3 == 0.16435044738564542d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.2972162083012442d, 0.8726330497066486d, 0.6140485448030906d);
        double double6 = fDistribution4.density(0.7680367961973186d);
        double double7 = fDistribution4.calculateNumericalVariance();
        boolean boolean8 = fDistribution4.isSupportUpperBoundInclusive();
        boolean boolean9 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11133083022476167d + "'", double6 == 0.11133083022476167d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double5 = uniformRealDistribution0.inverseCumulativeProbability(0.544127331049072d);
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.544127331049072d + "'", double5 == 0.544127331049072d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 10);
        double double9 = fDistribution3.cumulativeProbability((double) (-1L));
        double double11 = fDistribution3.cumulativeProbability(0.8146244847519797d);
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean13 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "79) test3370(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.6973716089142691d, 0.8210632085604537d, 0.7225278176013323d, 1.7067887266083617d, 0.6331157033588367d, 2.1042282879607876d, 1.7142082459926304d, 0.6201822512018785d, 0.7666267122270587d, 0.7036526419868411d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3847773579137394d + "'", double11 == 0.3847773579137394d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        fDistribution3.reseedRandomGenerator(100L);
        double double13 = fDistribution3.getSupportLowerBound();
        double double15 = fDistribution3.cumulativeProbability(1.0E-9d);
        double double16 = fDistribution3.getNumericalMean();
        boolean boolean17 = fDistribution3.isSupportLowerBoundInclusive();
        double double19 = fDistribution3.density(0.43958036910990383d);
        boolean boolean20 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean21 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "80) test3371(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7408381937759363d + "'", double9 == 1.7408381937759363d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.181009226124227E-44d + "'", double15 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0210526315789474d + "'", double16 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5545067584200759d + "'", double19 == 0.5545067584200759d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.density(0.567806681835231d);
        double double7 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean13 = fDistribution3.isSupportUpperBoundInclusive();
        double double14 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double16 = fDistribution3.density(0.8325228158963686d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9330897895151685d + "'", double16 == 0.9330897895151685d);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 2.477921645533131d, 0.7538686543859143d, 2.7325501425238556d);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution3.getNumericalVariance();
        boolean boolean7 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double9 = uniformRealDistribution3.cumulativeProbability(0.8505215495325973d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05428794722368846d) + "'", double4 == (-0.05428794722368846d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2981237622554617d + "'", double6 == 0.2981237622554617d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9783747305007117d + "'", double9 == 0.9783747305007117d);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0d, 6.006934970516585E-11d, 6.006934970516585E-11d);
        boolean boolean5 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution4.probability(0.7418114744879037d, 0.9970061237457858d);
        boolean boolean9 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double11 = uniformRealDistribution4.probability((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.density(0.9999999999758308d);
        double double9 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        boolean boolean11 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double13 = uniformRealDistribution0.cumulativeProbability(0.21163544171934578d);
        boolean boolean14 = uniformRealDistribution0.isSupportConnected();
        boolean boolean15 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "81) test3378(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8782087289900147d + "'", double4 == 0.8782087289900147d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.21163544171934578d + "'", double13 == 0.21163544171934578d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.calculateNumericalVariance();
        java.lang.Class<?> wildcardClass8 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((long) (short) -1);
        boolean boolean11 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6057733616391782d, 16.0d);
        double double3 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-9d + "'", double3 == 1.0E-9d);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.probability(0.25879486443701905d);
        boolean boolean10 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution0.probability(0.0d);
        double double13 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.9773985332011879d, 0.3379957971411982d);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        boolean boolean4 = fDistribution2.isSupportUpperBoundInclusive();
        double double5 = fDistribution2.getSupportUpperBound();
        boolean boolean6 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9773985332011879d + "'", double3 == 0.9773985332011879d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double9 = fDistribution3.probability(0.004853457297448672d, 0.5662656190788444d);
        double double10 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double13 = fDistribution3.inverseCumulativeProbability(0.9959156710339114d);
        double double14 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1623586333720101d + "'", double9 == 0.1623586333720101d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.298764107264319d + "'", double13 == 4.298764107264319d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0210526315789474d + "'", double14 == 1.0210526315789474d);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double7 = uniformRealDistribution0.sample();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = uniformRealDistribution0.sample((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "82) test3386(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7366160669287265d + "'", double7 == 0.7366160669287265d);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.inverseCumulativeProbability(0.7283674369075639d);
        double double11 = fDistribution3.density(0.7387842926428161d);
        double double12 = fDistribution3.getSupportLowerBound();
        double double13 = fDistribution3.getSupportUpperBound();
        boolean boolean14 = fDistribution3.isSupportLowerBoundInclusive();
        double double15 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "83) test3387(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7398657488193345d + "'", double7 == 0.7398657488193345d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.8155649719352942d + "'", double9 == 1.8155649719352942d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.933517426050187d + "'", double11 == 0.933517426050187d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.2439012222489887d, 0.8164209647035208d, 0.48323678369188483d);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution4.inverseCumulativeProbability(0.8460138802083401d);
        double double10 = fDistribution4.density(50.38759066622216d);
        boolean boolean11 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.449868410599931E16d + "'", double8 == 1.449868410599931E16d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.385060066786418E-5d + "'", double10 == 2.385060066786418E-5d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 1, 9.435082943715062E-15d, 0.7627482092423561d);
        double double6 = fDistribution4.cumulativeProbability(2.2293967067569245d);
        double double7 = fDistribution4.getSupportUpperBound();
        double double8 = fDistribution4.getNumericalMean();
        double double9 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.6131540547803525E-13d + "'", double6 == 1.6131540547803525E-13d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double5 = uniformRealDistribution0.inverseCumulativeProbability(0.544127331049072d);
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.getNumericalVariance();
        double double10 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.544127331049072d + "'", double5 == 0.544127331049072d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky "84) test3391(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3323725427879973d + "'", double7 == 0.3323725427879973d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.cumulativeProbability(0.0d);
        double double14 = fDistribution3.cumulativeProbability((double) (short) 100);
        double double15 = fDistribution3.getNumericalMean();
        double double16 = fDistribution3.sample();
        double double18 = fDistribution3.density(0.4978989679529988d);
        double double19 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "85) test3392(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6960168341869144d + "'", double9 == 0.6960168341869144d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
// flaky "19) test3392(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6715292022072981d + "'", double18 == 0.6715292022072981d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.4116955788765788d, 1.0210526315789474d);
        double double3 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) 100.0f);
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.sample();
        double double10 = uniformRealDistribution0.getNumericalMean();
        double double11 = uniformRealDistribution0.sample();
        boolean boolean12 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "86) test3394(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5857358155137977d + "'", double4 == 0.5857358155137977d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky "20) test3394(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05616817653750861d + "'", double9 == 0.05616817653750861d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
// flaky "3) test3394(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.19758226661824607d + "'", double11 == 0.19758226661824607d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getNumericalMean();
        fDistribution3.reseedRandomGenerator((long) (byte) 1);
        fDistribution3.reseedRandomGenerator((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistribution3.cumulativeProbability(0.7822785846661753d, 0.1623586333720101d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.782) must be less than or equal to upper endpoint (0.162)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.sample();
        uniformRealDistribution2.reseedRandomGenerator((long) (short) -1);
        boolean boolean10 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution2.probability(0.3904156731971007d);
        double double13 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-9d + "'", double13 == 1.0E-9d);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample(1);
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.probability(0.0d);
        double double11 = uniformRealDistribution0.cumulativeProbability(0.6456794250754441d, 0.7074171203241886d);
        double double12 = uniformRealDistribution0.getSupportUpperBound();
        double double13 = uniformRealDistribution0.getNumericalMean();
        double[] doubleArray15 = uniformRealDistribution0.sample(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "87) test3397(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6774956201407425d + "'", double3 == 0.6774956201407425d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "21) test3397(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.14524016776215798d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.061737695248744506d + "'", double11 == 0.061737695248744506d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray15);
// flaky "4) test3397(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.5885005371212653d, 0.4585325870440229d, 0.4369387077665918d, 0.3360227217607461d, 0.09154511979221103d, 0.6584450539049962d, 0.17888352024417564d, 0.9919582192095602d, 0.3274989219984221d, 0.6706107673980737d }, 1.0E-15);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.36766337145906025d, 0.7521813860790199d);
        double double3 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.55992237876904d + "'", double3 == 0.55992237876904d);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double8 = uniformRealDistribution0.density((double) 10.0f);
        double double9 = uniformRealDistribution0.getNumericalVariance();
        double double10 = uniformRealDistribution0.sample();
        double double11 = uniformRealDistribution0.getSupportUpperBound();
        double double13 = uniformRealDistribution0.cumulativeProbability(0.4656187585388245d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "88) test3399(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.7000177198596527d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
// flaky "22) test3399(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3205506722236853d + "'", double10 == 0.3205506722236853d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4656187585388245d + "'", double13 == 0.4656187585388245d);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.7283674369075639d, 0.5190573322162404d);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double double4 = fDistribution2.getSupportUpperBound();
        boolean boolean5 = fDistribution2.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution2.isSupportLowerBoundInclusive();
        double double7 = fDistribution2.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(9.435082943715062E-15d, (double) 100.0f);
        double double3 = fDistribution2.getNumericalVariance();
        double double5 = fDistribution2.density(0.3973197439265692d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.253133706208842E14d + "'", double3 == 2.253133706208842E14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.1873413148903133E-14d + "'", double5 == 1.1873413148903133E-14d);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.933517426050187d, 0.6179657774208087d, 0.7827999548078398d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = fDistribution3.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.density(0.9999999999758308d);
        double double9 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        boolean boolean11 = uniformRealDistribution0.isSupportConnected();
        double double12 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double13 = uniformRealDistribution0.getSupportUpperBound();
        double double14 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "89) test3403(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.24179691727996988d + "'", double4 == 0.24179691727996988d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-9d + "'", double14 == 1.0E-9d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        boolean boolean8 = fDistribution3.isSupportConnected();
        double double9 = fDistribution3.getSupportLowerBound();
        boolean boolean10 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        double double11 = fDistribution3.cumulativeProbability(0.004507980450955351d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.800708876800225E-11d + "'", double11 == 5.800708876800225E-11d);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.probability(Double.POSITIVE_INFINITY);
        java.lang.Class<?> wildcardClass9 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6975449779484513d, (double) 100L, (double) (short) 0);
        double double5 = fDistribution4.getSupportUpperBound();
        double double6 = fDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0204081632653061d + "'", double6 == 1.0204081632653061d);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.22501915578549436d, 2.1593924225030103d, 0.15597272346645852d);
        double double4 = fDistribution3.getSupportLowerBound();
        boolean boolean5 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.getSupportLowerBound();
        double double8 = fDistribution4.cumulativeProbability(0.8354713638140709d);
        double double11 = fDistribution4.cumulativeProbability(7.562099861400877E-28d, 0.6852677852739119d);
        double double12 = fDistribution4.getSolverAbsoluteAccuracy();
        boolean boolean13 = fDistribution4.isSupportUpperBoundInclusive();
        double double14 = fDistribution4.getNumeratorDegreesOfFreedom();
        boolean boolean15 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.24594400506499925d + "'", double8 == 0.24594400506499925d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.21163544171934578d + "'", double11 == 0.21163544171934578d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5190573322162404d + "'", double12 == 0.5190573322162404d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double10 = uniformRealDistribution0.getNumericalVariance();
        double double11 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean12 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        uniformRealDistribution0.reseedRandomGenerator(100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "90) test3410(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6027888473505982d + "'", double4 == 0.6027888473505982d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-9d + "'", double11 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double double4 = fDistribution2.getSolverAbsoluteAccuracy();
        boolean boolean5 = fDistribution2.isSupportUpperBoundInclusive();
        double double7 = fDistribution2.cumulativeProbability(0.07843488217347239d);
        double double8 = fDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3508832089431604d + "'", double7 == 0.3508832089431604d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.7685775863542659d, 0.021095169454586005d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        double double4 = fDistribution2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.021095169454586005d + "'", double4 == 0.021095169454586005d);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(2.4551515381057674d, 0.6068101165270838d);
        double double4 = fDistribution2.cumulativeProbability(0.6923653189858991d);
        double double6 = fDistribution2.density(0.9927394322094806d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.28658728927843224d + "'", double4 == 0.28658728927843224d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.15486178474907153d + "'", double6 == 0.15486178474907153d);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.sample();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
// flaky "91) test3414(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        boolean boolean8 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean9 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double10 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean11 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "92) test3415(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.07889258099513108d + "'", double4 == 0.07889258099513108d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        uniformRealDistribution0.reseedRandomGenerator((-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double4 = uniformRealDistribution0.inverseCumulativeProbability(97.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 97 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.449868410599931E16d, 0.6155223357908637d);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double[] doubleArray5 = fDistribution2.sample((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "93) test3417(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.6212425339243943d }, 1.0E-15);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.sample();
        boolean boolean13 = fDistribution3.isSupportConnected();
        boolean boolean14 = fDistribution3.isSupportConnected();
        double double16 = fDistribution3.density(0.7071737568021614d);
        double double17 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double18 = fDistribution3.getNumericalMean();
        double double20 = fDistribution3.cumulativeProbability(1.729129769013542d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "94) test3418(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6908958433553282d + "'", double7 == 0.6908958433553282d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
// flaky "23) test3418(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.8198745300420915d + "'", double12 == 2.8198745300420915d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9217691399069918d + "'", double16 == 0.9217691399069918d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0210526315789474d + "'", double18 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9151291818142353d + "'", double20 == 0.9151291818142353d);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.3892650659576675d, 0.7087523712937718d, 0.7020980296731439d);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.cumulativeProbability((-1.0d), (double) ' ');
        double double10 = uniformRealDistribution0.getNumericalVariance();
        double double11 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.getNumericalMean();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double13 = fDistribution3.getSupportUpperBound();
        double double14 = fDistribution3.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistribution3.probability(8982674.244580086d, 0.6474367531021342d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (8,982,674.245) must be less than or equal to upper endpoint (0.647)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double3 = uniformRealDistribution2.getNumericalVariance();
        double double4 = uniformRealDistribution2.sample();
        boolean boolean5 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(2.532575379236659d, 0.49842935128655824d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        double double4 = fDistribution2.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.22929074613677172d, 0.26077781512086595d, 0.4329268118812597d);
        double double4 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(3.181009226124227E-44d, 0.07983844188212808d, 0.19565248788630019d);
        double double4 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        double double5 = uniformRealDistribution3.getNumericalMean();
        double double6 = uniformRealDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.19565248788630019d + "'", double4 == 0.19565248788630019d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.03991922094106404d + "'", double5 == 0.03991922094106404d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.181009226124227E-44d + "'", double6 == 3.181009226124227E-44d);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.inverseCumulativeProbability(0.4116955788765788d);
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        double double11 = uniformRealDistribution0.density(4.0505371816172255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "95) test3426(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7190912354445238d + "'", double3 == 0.7190912354445238d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4116955788765788d + "'", double8 == 0.4116955788765788d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean15 = fDistribution3.isSupportConnected();
        double double17 = fDistribution3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "96) test3427(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.9240668731578607d + "'", double7 == 1.9240668731578607d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.cumulativeProbability(0.0d);
        double double14 = fDistribution3.cumulativeProbability((double) (short) 100);
        double[] doubleArray16 = fDistribution3.sample((int) (short) 100);
        double double17 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "97) test3428(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.8578549581301957d + "'", double9 == 1.8578549581301957d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.7935238495963384d);
        double double3 = uniformRealDistribution2.getNumericalVariance();
        double double4 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.05247334165651602d + "'", double3 == 0.05247334165651602d);
// flaky "98) test3429(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7912282071037153d + "'", double4 == 0.7912282071037153d);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(4.0d, 2.554881495381541E-4d, 0.059723962911940175d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (4) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution4.inverseCumulativeProbability(0.8460138802083401d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = fDistribution4.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.449868410599931E16d + "'", double8 == 1.449868410599931E16d);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.5733968575051716d, 0.8743111069910592d, 5.964322516717098E-6d);
        double double5 = fDistribution4.calculateNumericalVariance();
        double double6 = fDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.964322516717098E-6d + "'", double6 == 5.964322516717098E-6d);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability((double) (short) 100);
        double double12 = fDistribution3.inverseCumulativeProbability(0.6345934975846905d);
        double double13 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8302287769432766d + "'", double12 == 0.8302287769432766d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.9404443230777908d, 2.38352422163308d);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1L), 0.8112398469157531d);
        double double3 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        boolean boolean4 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-9d + "'", double3 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 100.0d, Double.POSITIVE_INFINITY, (double) (byte) 1);
        double double6 = uniformRealDistribution4.probability(2.3502599751932776d);
        boolean boolean7 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        boolean boolean8 = uniformRealDistribution4.isSupportConnected();
        boolean boolean9 = uniformRealDistribution4.isSupportConnected();
        boolean boolean10 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double12 = uniformRealDistribution4.cumulativeProbability(0.8458261650438247d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        double double7 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.density(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "99) test3437(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.698522374410635d + "'", double4 == 0.698522374410635d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double13 = fDistribution3.getNumericalVariance();
        double double14 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "100) test3438(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.6416510501987487d + "'", double7 == 2.6416510501987487d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.sample();
        double double5 = uniformRealDistribution3.sample();
        double double7 = uniformRealDistribution3.cumulativeProbability(0.3032294630012422d);
        double double8 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution3.getSupportLowerBound();
// flaky "101) test3439(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.27144544822026695d + "'", double4 == 0.27144544822026695d);
// flaky "24) test3439(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5264475828635885d + "'", double5 == 0.5264475828635885d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6890202251178742d + "'", double7 == 0.6890202251178742d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        boolean boolean6 = fDistribution3.isSupportConnected();
        double double7 = fDistribution3.getSupportUpperBound();
        boolean boolean8 = fDistribution3.isSupportLowerBoundInclusive();
        double[] doubleArray10 = fDistribution3.sample((int) (byte) 1);
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double14 = fDistribution3.probability(0.0024850493035607157d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
// flaky "102) test3440(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 2.179847789223857d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportUpperBound();
        boolean boolean9 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.0d);
        double double9 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.8376911837863257d, 0.7018267647389225d, 0.6836071484595452d);
        double double5 = fDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        uniformRealDistribution0.reseedRandomGenerator((long) (short) 0);
        boolean boolean12 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double14 = uniformRealDistribution0.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "103) test3444(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5464001224524899d + "'", double4 == 0.5464001224524899d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.49884479899047296d, 0.8300851989496363d);
        java.lang.Class<?> wildcardClass3 = fDistribution2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(2.7171475092674E-46d, (double) 100L, 0.6121227109766438d);
        double double4 = fDistribution3.getSupportUpperBound();
        fDistribution3.reseedRandomGenerator((long) (short) 1);
        double double7 = fDistribution3.getSupportUpperBound();
        double double8 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7071737568021614d, 0.834516685115664d, 0.8914241055526231d);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.density(0.9970061237457858d);
        double double11 = fDistribution3.cumulativeProbability(2.4725239789609064d);
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean13 = fDistribution3.isSupportConnected();
        double double14 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8376911837863257d + "'", double9 == 0.8376911837863257d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9889026997093298d + "'", double11 == 0.9889026997093298d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6466820414283976d + "'", double14 == 0.6466820414283976d);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100L, 0.3321070505100212d, 0.08333333333333333d);
        double double7 = fDistribution4.cumulativeProbability((double) 'a', (double) 100);
        double double9 = fDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = fDistribution4.getSolverAbsoluteAccuracy();
        double double11 = fDistribution4.getNumericalMean();
        double double12 = fDistribution4.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0018820678494252396d + "'", double7 == 0.0018820678494252396d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3321070505100212d + "'", double12 == 0.3321070505100212d);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 1.8119707625632482d, 0.0d, 2.8896070387843302d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1.812) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        boolean boolean5 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.density(0.8733954553258896d);
        double double8 = uniformRealDistribution2.getSupportLowerBound();
        double double9 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) (short) -1, 1.0E-6d, 0.7283674369075639d);
        double double6 = uniformRealDistribution4.probability(0.10082734793776749d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 10);
        double double8 = fDistribution3.calculateNumericalVariance();
        double double9 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "104) test3455(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.6149410950836783d, 0.6358802202510101d, 0.6496975308691912d, 3.08832186912073d, 0.6474967316246854d, 2.608225015025386d, 1.864064851762148d, 0.708826348428627d, 0.7871135959170759d, 0.8015113074743581d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.042293209129396825d, 0.17954687407105752d);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution2.isSupportConnected();
        boolean boolean5 = uniformRealDistribution2.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = uniformRealDistribution2.probability(3.5564389998236723d, 0.17603004168266123d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (3.556) must be less than or equal to upper endpoint (0.176)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double10 = uniformRealDistribution0.cumulativeProbability(0.7697131649614974d);
        double double11 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "105) test3457(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6340987991435247d + "'", double7 == 0.6340987991435247d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7697131649614974d + "'", double10 == 0.7697131649614974d);
// flaky "25) test3457(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5504701701974037d + "'", double11 == 0.5504701701974037d);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.3108719420541892d, 0.27979062919809317d, (double) 10.0f);
        double double5 = fDistribution3.density(0.9645967736193747d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0640859823350443d + "'", double5 == 0.0640859823350443d);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.08376118434665039d, 1.8269378627115378d, 0.7772124203157265d);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.48050135620469914d, (double) (byte) 100, 1.261273994954467d);
        boolean boolean4 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getSupportUpperBound();
        double double11 = fDistribution3.cumulativeProbability(0.49174310649001063d);
        fDistribution3.reseedRandomGenerator((long) (byte) -1);
        double double15 = fDistribution3.probability(1.8577024693026263d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.10828009778838572d + "'", double11 == 0.10828009778838572d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.04519796485307248d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        double double6 = uniformRealDistribution2.inverseCumulativeProbability(0.38999733776662926d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "106) test3462(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.011267969955900022d + "'", double4 == 0.011267969955900022d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.017627085965167946d + "'", double6 == 0.017627085965167946d);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 10);
        double double9 = fDistribution3.cumulativeProbability((double) (-1L));
        double double11 = fDistribution3.cumulativeProbability(0.8146244847519797d);
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((long) 1);
        double double16 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "107) test3464(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.8448494017679085d, 0.7543282862622086d, 1.7589300979071978d, 0.7096369035125755d, 0.778649855340127d, 0.7385855075274151d, 1.9617348732257307d, 0.7052224774326836d, 1.9693115943155188d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3847773579137394d + "'", double11 == 0.3847773579137394d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.31114128550733433d, 0.9294871528690059d, 0.5383653599725673d);
        double double5 = fDistribution3.cumulativeProbability(1.8824258113202146d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7256841588916874d + "'", double5 == 0.7256841588916874d);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.cumulativeProbability((-1.0d), (double) ' ');
        double double10 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean11 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean12 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-9d + "'", double10 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.4116955788765788d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.412) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getNumericalVariance();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double10 = fDistribution3.getNumericalVariance();
        double double11 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double10 = fDistribution3.cumulativeProbability(2.92890095325051d);
        double double12 = fDistribution3.cumulativeProbability(0.04102163902992584d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9970061237457858d + "'", double10 == 0.9970061237457858d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0627822897899333E-6d + "'", double12 == 3.0627822897899333E-6d);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) 0, (double) (byte) 1, 0.2972162083012442d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        double double5 = uniformRealDistribution3.sample();
        double double7 = uniformRealDistribution3.inverseCumulativeProbability(0.11271195029930126d);
        boolean boolean8 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
// flaky "108) test3471(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5622691290262836d + "'", double5 == 0.5622691290262836d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        boolean boolean6 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution2.sample();
        boolean boolean10 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double12 = uniformRealDistribution2.cumulativeProbability(0.933700404958179d);
        double double13 = uniformRealDistribution2.getNumericalMean();
        double double14 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(2.7171475092674E-46d, (double) 100L, 0.6121227109766438d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.cumulativeProbability(1.800541962827582d);
        double double9 = fDistribution3.cumulativeProbability(0.0016455940827991278d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.23330384346491728d, 48.8425886151626d, 0.04356160098273004d);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) (byte) -1, 0.625504238759457d, 1.0d);
        boolean boolean5 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        boolean boolean6 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double5 = uniformRealDistribution0.getNumericalVariance();
        double double6 = uniformRealDistribution0.sample();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.005613830405313154d, 0.7018267647389225d);
        double double10 = uniformRealDistribution0.sample();
        boolean boolean11 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
// flaky "109) test3476(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9792916330841068d + "'", double6 == 0.9792916330841068d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6962129343336093d + "'", double9 == 0.6962129343336093d);
// flaky "26) test3476(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5135062881910957d + "'", double10 == 0.5135062881910957d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.cumulativeProbability((-1.0d), (double) ' ');
        boolean boolean10 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean11 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        double double7 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        double double11 = fDistribution3.density(0.5539596657714614d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7674223440433171d + "'", double11 == 0.7674223440433171d);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        boolean boolean5 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        boolean boolean6 = uniformRealDistribution2.isSupportConnected();
        double double8 = uniformRealDistribution2.cumulativeProbability(8.746758854452454E-5d);
        double double9 = uniformRealDistribution2.getNumericalMean();
        double double10 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        fDistribution3.reseedRandomGenerator(100L);
        double double13 = fDistribution3.getSupportLowerBound();
        double double15 = fDistribution3.density(0.7538686543859143d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "110) test3480(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6177154593036198d + "'", double9 == 0.6177154593036198d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9368797784369253d + "'", double15 == 0.9368797784369253d);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 100.0d, Double.POSITIVE_INFINITY, (double) (byte) 1);
        double double6 = uniformRealDistribution4.probability(2.3502599751932776d);
        boolean boolean7 = uniformRealDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        double double13 = fDistribution3.probability(0.5415785819031833d, 2.3125942498560286d);
        double[] doubleArray15 = fDistribution3.sample((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
        org.junit.Assert.assertNotNull(doubleArray15);
// flaky "111) test3482(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 2.0710921324774803d, 0.6290516208501982d, 0.7564846727327071d, 2.923739540746846d, 0.6474862604789287d, 2.3274407197276235d, 0.8344237965835914d, 0.6087607792001635d, 0.7694214157984194d, 0.6353062596324577d }, 1.0E-15);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.26637048650274964d, 1.7784344332746946d);
        boolean boolean3 = fDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 100.0d, Double.POSITIVE_INFINITY, (double) (byte) 1);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        double double6 = uniformRealDistribution4.getSupportUpperBound();
        double double8 = uniformRealDistribution4.cumulativeProbability(0.6816739523979198d);
        double double10 = uniformRealDistribution4.probability(0.8298516959768152d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        boolean boolean4 = uniformRealDistribution3.isSupportConnected();
        boolean boolean5 = uniformRealDistribution3.isSupportConnected();
        double double7 = uniformRealDistribution3.probability(0.6309781408281055d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) 10.0f, (double) 100L, 0.6913920068547128d);
        double double5 = uniformRealDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            uniformRealDistribution4.reseedRandomGenerator(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.24594400506499925d, 0.559025207971324d, 0.7387842926428161d);
        double double6 = uniformRealDistribution4.cumulativeProbability(3.537396594438314d);
        boolean boolean7 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double9 = uniformRealDistribution4.density(0.6215638124487862d);
        // The following exception was thrown during execution in test generation
        try {
            uniformRealDistribution4.reseedRandomGenerator((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.9970061237457858d, 1.936120997106573d, 0.5110297484389803d);
        double double4 = fDistribution3.getNumericalMean();
        double double6 = fDistribution3.cumulativeProbability(0.46363601407876476d);
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.43235712546971d + "'", double6 == 0.43235712546971d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double13 = fDistribution3.inverseCumulativeProbability(0.3379957971411982d);
        double double14 = fDistribution3.getSupportLowerBound();
        double double15 = fDistribution3.getNumericalVariance();
        double double16 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6838714210807377d + "'", double13 == 0.6838714210807377d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23541417210258242d + "'", double15 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6850492331572604d, 0.9002468344505423d, 0.7587933557019179d);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7387842926428161d, 0.9382068481430984d);
        double double4 = uniformRealDistribution2.density(1.7142455852563852d);
        double double5 = uniformRealDistribution2.getSupportLowerBound();
        double double6 = uniformRealDistribution2.sample();
        double double8 = uniformRealDistribution2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7387842926428161d + "'", double5 == 0.7387842926428161d);
// flaky "112) test3491(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9032521481502107d + "'", double6 == 0.9032521481502107d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double5 = uniformRealDistribution0.inverseCumulativeProbability(0.769221584666441d);
        double[] doubleArray7 = uniformRealDistribution0.sample((int) (byte) 1);
        double[] doubleArray9 = uniformRealDistribution0.sample((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.769221584666441d + "'", double5 == 0.769221584666441d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "113) test3492(org.apache.commons.math3.distribution.RegressionTest6)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5730647230104475d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6916856290446507d, 0.9736694951866904d);
        double double3 = uniformRealDistribution2.getNumericalMean();
        double double5 = uniformRealDistribution2.probability(0.9961442109473947d);
        double double7 = uniformRealDistribution2.inverseCumulativeProbability(0.6519393948174274d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8326775621156706d + "'", double3 == 0.8326775621156706d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8755220200855706d + "'", double7 == 0.8755220200855706d);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.0E-6d, 0.9787873837142649d);
        double double3 = uniformRealDistribution2.getNumericalMean();
        boolean boolean4 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.48939419185713245d + "'", double3 == 0.48939419185713245d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9787873837142649d + "'", double6 == 0.9787873837142649d);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double9 = fDistribution3.probability(0.004853457297448672d, 0.5662656190788444d);
        double double10 = fDistribution3.getSolverAbsoluteAccuracy();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double13 = fDistribution3.density(0.6136784866000506d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1623586333720101d + "'", double9 == 0.1623586333720101d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8471480433931251d + "'", double13 == 0.8471480433931251d);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.probability(10.0d);
        double double12 = fDistribution3.getSupportUpperBound();
        boolean boolean13 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(44.50346162433869d, 1.6131540547803525E-13d, 0.4727623583671783d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (44.503) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double8 = fDistribution3.cumulativeProbability(10.0d);
        double double9 = fDistribution3.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistribution3.cumulativeProbability(1.7071342555877083d, 0.6611686378697893d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1.707) must be less than or equal to upper endpoint (0.661)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999758308d + "'", double8 == 0.9999999999758308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.37209005285684604d, 1.3593610630961634E16d, 0.41166628889519163d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistribution3.inverseCumulativeProbability(4.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 4 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double12 = fDistribution3.cumulativeProbability(1.0d, 3.5564389998236723d);
        double double13 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.4485770812615808d + "'", double12 == 0.4485770812615808d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
    }
}
