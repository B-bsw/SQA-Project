package org.apache.commons.math3.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double7 = uniformRealDistribution0.sample();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.90409522431247d);
        boolean boolean10 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double11 = uniformRealDistribution0.sample();
        double double12 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "1) test4501(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.31623623068677253d + "'", double7 == 0.31623623068677253d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.90409522431247d + "'", double9 == 0.90409522431247d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "1) test4501(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.261631408299591d + "'", double11 == 0.261631408299591d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5466283054149046d, 1.7080848333942735d);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        double double4 = fDistribution2.inverseCumulativeProbability(0.8733954553258896d);
        double double5 = fDistribution2.getNumericalMean();
        double double6 = fDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.4725239789609064d + "'", double4 == 2.4725239789609064d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0204081632653061d + "'", double5 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.463149570621243d + "'", double6 == 3.463149570621243d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100L, 0.3321070505100212d, 0.08333333333333333d);
        double double7 = fDistribution4.cumulativeProbability((double) 'a', (double) 100);
        double double9 = fDistribution4.inverseCumulativeProbability((double) 0);
        boolean boolean10 = fDistribution4.isSupportConnected();
        boolean boolean11 = fDistribution4.isSupportConnected();
        double double12 = fDistribution4.getSupportUpperBound();
        double double13 = fDistribution4.getNumericalVariance();
        double double14 = fDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0018820678494252396d + "'", double7 == 0.0018820678494252396d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (-0.5030625885122699d), 0.148287320873074d, 0.0d);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumericalMean();
        double double7 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getSupportUpperBound();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        double double11 = fDistribution3.getNumericalMean();
        double double13 = fDistribution3.density(0.7506986830966238d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9362899900535196d + "'", double13 == 0.9362899900535196d);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.cumulativeProbability((double) ' ');
        double double4 = uniformRealDistribution0.getNumericalMean();
        double double6 = uniformRealDistribution0.density(0.38156436732833804d);
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6923653189858991d, 0.933700404958179d, 0.08333333333333333d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double3 = uniformRealDistribution0.inverseCumulativeProbability(0.5642441824552811d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = uniformRealDistribution0.cumulativeProbability((double) 1L, 0.060399913881601375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1) must be less than or equal to upper endpoint (0.06)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5642441824552811d + "'", double3 == 0.5642441824552811d);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.density(0.9999999999758308d);
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean10 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean11 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean12 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "2) test4511(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9680525521218377d + "'", double4 == 0.9680525521218377d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.density(0.4116955788765788d);
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getSupportUpperBound();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4943610685878218d + "'", double8 == 0.4943610685878218d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double4 = uniformRealDistribution0.density(10.0d);
        double double5 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.inverseCumulativeProbability(0.8527887362192998d);
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        double double10 = uniformRealDistribution0.cumulativeProbability(0.22929074613677172d);
        boolean boolean11 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "3) test4513(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08628548268037961d + "'", double5 == 0.08628548268037961d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8527887362192998d + "'", double7 == 0.8527887362192998d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.22929074613677172d + "'", double10 == 0.22929074613677172d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        double double7 = fDistribution3.density(0.6995065888297458d);
        double[] doubleArray9 = fDistribution3.sample((int) 'a');
        boolean boolean10 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9179281015876793d + "'", double7 == 0.9179281015876793d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3032294630012422d, 0.9382068481430984d, 0.3728694875041465d);
        double double4 = uniformRealDistribution3.getSupportUpperBound();
        double double6 = uniformRealDistribution3.density(0.595906678664889d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9382068481430984d + "'", double4 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.5748592365641438d + "'", double6 == 1.5748592365641438d);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
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
        double double19 = fDistribution3.cumulativeProbability(0.740521227334296d);
        double double20 = fDistribution3.calculateNumericalVariance();
        double double23 = fDistribution3.cumulativeProbability(0.2851040863546159d, 0.660856016995253d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "4) test4516(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8069738670680353d + "'", double9 == 0.8069738670680353d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
// flaky "2) test4516(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6920970189652762d + "'", double16 == 0.6920970189652762d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0210526315789474d + "'", double17 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.31526394849539074d + "'", double19 == 0.31526394849539074d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.23541417210258242d + "'", double20 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.22537727742282923d + "'", double23 == 0.22537727742282923d);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        boolean boolean7 = fDistribution4.isSupportLowerBoundInclusive();
        boolean boolean8 = fDistribution4.isSupportConnected();
        boolean boolean9 = fDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.inverseCumulativeProbability(0.4485518432850313d);
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "5) test4519(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6066887292904645d + "'", double7 == 0.6066887292904645d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.729322772507545d + "'", double10 == 0.729322772507545d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        boolean boolean10 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "6) test4520(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8287422016176762d + "'", double7 == 0.8287422016176762d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.getNumericalVariance();
        boolean boolean12 = fDistribution3.isSupportConnected();
        double double13 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "7) test4521(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.9202638165847787d + "'", double9 == 2.9202638165847787d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "3) test4521(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7584382767919815d + "'", double13 == 0.7584382767919815d);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.49609971263019714d, 0.4790184838979459d, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
        double double15 = fDistribution3.calculateNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23541417210258242d + "'", double15 == 0.23541417210258242d);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double8 = fDistribution3.cumulativeProbability(10.0d);
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.sample();
        double double11 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999758308d + "'", double8 == 0.9999999999758308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
// flaky "8) test4524(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.6793854164582616d + "'", double10 == 2.6793854164582616d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0210526315789474d + "'", double12 == 1.0210526315789474d);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
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
        double double13 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "9) test4525(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9658644220198869d + "'", double4 == 0.9658644220198869d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability((double) (byte) -1, (double) 100.0f);
        double double7 = fDistribution3.calculateNumericalVariance();
        boolean boolean8 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        double double6 = fDistribution3.getNumericalMean();
        double double7 = fDistribution3.calculateNumericalVariance();
        boolean boolean8 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0210526315789474d + "'", double6 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6403077985814492d, 1.9582657562075956d, 0.13548588609137713d);
        boolean boolean5 = fDistribution4.isSupportLowerBoundInclusive();
        boolean boolean6 = fDistribution4.isSupportLowerBoundInclusive();
        double double7 = fDistribution4.getSupportLowerBound();
        java.lang.Class<?> wildcardClass8 = fDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getNumericalMean();
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.sample();
        double double13 = fDistribution3.cumulativeProbability(0.729322772507545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "10) test4529(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7264102652006016d + "'", double11 == 0.7264102652006016d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.30482257169124927d + "'", double13 == 0.30482257169124927d);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double12 = fDistribution3.cumulativeProbability(0.0d);
        double double15 = fDistribution3.probability(0.6760294307280899d, 1.261273994954467d);
        boolean boolean16 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "11) test4530(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6017255332760668d + "'", double9 == 0.6017255332760668d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.48098637849296316d + "'", double15 == 0.48098637849296316d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        double double7 = fDistribution3.sample();
        fDistribution3.reseedRandomGenerator((long) (short) 1);
        double double10 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "12) test4531(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6226014380373568d + "'", double7 == 0.6226014380373568d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
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
        double double20 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean21 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "13) test4532(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8447101498556263d + "'", double9 == 0.8447101498556263d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.181009226124227E-44d + "'", double15 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0210526315789474d + "'", double16 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5545067584200759d + "'", double19 == 0.5545067584200759d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double[] doubleArray7 = uniformRealDistribution0.sample(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "14) test4533(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.9792915692794897d }, 1.0E-15);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double[] doubleArray9 = fDistribution3.sample((int) '4');
        double double10 = fDistribution3.calculateNumericalVariance();
        boolean boolean11 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.08214286204237431d, 0.4864267777197808d, 0.031397993441797147d);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.sample();
        double double12 = fDistribution3.probability(0.0d);
        fDistribution3.reseedRandomGenerator((long) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "15) test4536(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8258741873283362d + "'", double7 == 0.8258741873283362d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
// flaky "4) test4536(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.9983131433793901d + "'", double10 == 1.9983131433793901d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.0d);
        double double10 = uniformRealDistribution0.getNumericalVariance();
        double double11 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double13 = uniformRealDistribution0.cumulativeProbability(0.8480979610536865d);
        double double15 = uniformRealDistribution0.cumulativeProbability(0.17034059620149794d);
        double[] doubleArray17 = uniformRealDistribution0.sample((int) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-9d + "'", double11 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8480979610536865d + "'", double13 == 0.8480979610536865d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.17034059620149794d + "'", double15 == 0.17034059620149794d);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        fDistribution3.reseedRandomGenerator(100L);
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean14 = fDistribution3.isSupportLowerBoundInclusive();
        double double16 = fDistribution3.cumulativeProbability(0.8827072720351122d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "16) test4538(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4479201693554527d + "'", double16 == 0.4479201693554527d);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalMean();
        boolean boolean3 = uniformRealDistribution0.isSupportConnected();
        double double4 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.cumulativeProbability(0.4897170705116274d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5d + "'", double2 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4897170705116274d + "'", double6 == 0.4897170705116274d);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = uniformRealDistribution2.sample((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double5 = uniformRealDistribution0.inverseCumulativeProbability(0.544127331049072d);
        double double6 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.8590663588185146d);
        double double9 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.544127331049072d + "'", double5 == 0.544127331049072d);
// flaky "17) test4542(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3425955939593668d + "'", double6 == 0.3425955939593668d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8590663588185146d + "'", double8 == 0.8590663588185146d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
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
        double double19 = fDistribution3.getSolverAbsoluteAccuracy();
        double double20 = fDistribution3.sample();
        double double21 = fDistribution3.getNumericalVariance();
        boolean boolean22 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "18) test4543(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.8229245622109715d + "'", double9 == 1.8229245622109715d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
// flaky "5) test4543(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.7821483035902713d + "'", double16 == 0.7821483035902713d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6715292022072981d + "'", double18 == 0.6715292022072981d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
// flaky "1) test4543(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.40517221279727d + "'", double20 == 4.40517221279727d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.23541417210258242d + "'", double21 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(3.463149570621243d, 0.2230878854254442d);
        boolean boolean3 = fDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getNumericalMean();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        double double14 = fDistribution3.cumulativeProbability(0.0d);
        double double15 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.3543451515484417d, 0.6586243249429897d, 0.4790184838979459d);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double4 = fDistribution2.calculateNumericalVariance();
        boolean boolean5 = fDistribution2.isSupportLowerBoundInclusive();
        boolean boolean6 = fDistribution2.isSupportUpperBoundInclusive();
        double double7 = fDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double10 = fDistribution3.cumulativeProbability((double) (short) 0, 0.5d);
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        double double13 = fDistribution3.density(7.847827245153567E-4d);
        double double14 = fDistribution3.calculateNumericalVariance();
        fDistribution3.reseedRandomGenerator((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1137932949955843d + "'", double10 == 0.1137932949955843d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 6.006934970516585E-11d + "'", double13 == 6.006934970516585E-11d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6484267095499411d, 0.2512555790734534d, 0.0d);
        double double4 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7830480717937186d, 0.7411051220588685d, 5.769699484291669d);
        double double4 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(343.281590416424d, 0.6041804222939758d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (343.282) must be strictly less than upper bound (0.604)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.1623586333720101d, 0.26279270621356643d, 0.7071737568021614d);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        double double6 = uniformRealDistribution4.getNumericalMean();
        boolean boolean7 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.26279270621356643d + "'", double5 == 0.26279270621356643d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.21257566979278825d + "'", double6 == 0.21257566979278825d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.405835822952538E-4d + "'", double8 == 8.405835822952538E-4d);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.inverseCumulativeProbability(0.40425162944598975d);
        double double11 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.getSupportUpperBound();
        double double13 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103655534857197d + "'", double10 == 0.7103655534857197d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        double double8 = uniformRealDistribution0.density(0.8904354075111562d);
        double double10 = uniformRealDistribution0.probability(16.0d);
        double double11 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "19) test4554(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.30964472381651875d + "'", double4 == 0.30964472381651875d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08333333333333333d + "'", double11 == 0.08333333333333333d);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (short) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.density(0.6143579362044078d);
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double8 = uniformRealDistribution0.density((double) 10.0f);
        double double9 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean10 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double11 = uniformRealDistribution0.getNumericalVariance();
        double double13 = uniformRealDistribution0.density(0.6684474749999711d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "20) test4557(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.029799840482293227d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08333333333333333d + "'", double11 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.41193179565374427d, 3.6814437437668386d, 0.0d);
        boolean boolean5 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.9211786769431907d, 0.9094588220760578d, 0.004137979191126807d);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 2.245686793821953d, 0.8188608846558519d, 0.21473789149465494d);
        double double5 = fDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21473789149465494d + "'", double5 == 0.21473789149465494d);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample((int) (short) 1);
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "21) test4561(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7112547319568303d + "'", double3 == 0.7112547319568303d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "6) test4561(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.7514472428865002d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        double double7 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.913601350735804d, 16.97758172302296d);
        double double4 = fDistribution2.inverseCumulativeProbability(0.87237982648441d);
        double double5 = fDistribution2.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution2.density(0.6848189829593176d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.5888780881751714d + "'", double4 == 2.5888780881751714d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.913601350735804d + "'", double5 == 0.913601350735804d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3157997691919083d + "'", double7 == 0.3157997691919083d);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        java.lang.Class<?> wildcardClass17 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
// flaky "22) test4564(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.5977682504508882d, 2.0042490225870755d, 2.1510613654843027d, 0.0d, 1.7839361676137457d, 0.6528296916453933d, 0.655682063897444d, 0.725085812830805d, 0.7855208931297661d, 0.5978288950966363d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.getSupportUpperBound();
        double double12 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportUpperBound();
        boolean boolean10 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.probability(0.04698093683516236d);
        boolean boolean13 = fDistribution3.isSupportUpperBoundInclusive();
        double double15 = fDistribution3.cumulativeProbability(0.9668954331842876d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5228455358164944d + "'", double15 == 0.5228455358164944d);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6391854256750903d, 0.769221584666441d, 0.1623586333720101d);
        double double4 = fDistribution3.sample();
        double[] doubleArray6 = fDistribution3.sample((int) (short) 10);
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double10 = fDistribution3.cumulativeProbability(0.7751065112528238d);
// flaky "23) test4567(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.33764136662797994d + "'", double4 == 0.33764136662797994d);
        org.junit.Assert.assertNotNull(doubleArray6);
// flaky "7) test4567(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 7.03786948555182d, 2.320927897168211d, 0.0d, 1945.3715496875407d, 0.33764136662797994d, 0.25d, 143.56400455416264d, 29.946294786023504d, 0.3200945584737034d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.769221584666441d + "'", double8 == 0.769221584666441d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4968064738559586d + "'", double10 == 0.4968064738559586d);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.23125697402288498d, 0.6957245310498591d, 0.7938684212191616d);
        boolean boolean4 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        double[] doubleArray6 = uniformRealDistribution3.sample(10);
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
// flaky "24) test4568(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5796104842841391d, 0.4457697626971543d, 0.5013620540334336d, 0.2325433948265945d, 0.5827381446535208d, 0.4530322665945723d, 0.6539317346143289d, 0.6326978788976956d, 0.3362786915281929d, 0.29840374569729017d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution2.probability((double) 1L);
        double double9 = uniformRealDistribution2.getNumericalVariance();
        boolean boolean10 = uniformRealDistribution2.isSupportConnected();
        double double12 = uniformRealDistribution2.density(0.7250311149525168d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.449868410599931E16d, 0.6155223357908637d);
        double double3 = fDistribution2.calculateNumericalVariance();
        double double6 = fDistribution2.probability(0.0d, 0.11659193530026048d);
        double double7 = fDistribution2.getNumeratorDegreesOfFreedom();
        double double10 = fDistribution2.cumulativeProbability(0.03991922094106404d, 0.3508832089431604d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.8313024651998237E-7d + "'", double6 == 3.8313024651998237E-7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.449868410599931E16d + "'", double7 == 1.449868410599931E16d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.259584520426435E-6d + "'", double10 == 1.259584520426435E-6d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(2.051786173508851d, 0.6837424731385963d);
        double double3 = fDistribution2.getNumericalVariance();
        boolean boolean4 = fDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double12 = fDistribution3.cumulativeProbability(0.0d);
        boolean boolean13 = fDistribution3.isSupportLowerBoundInclusive();
        double double16 = fDistribution3.cumulativeProbability(0.6023625222226008d, 0.7268751021003499d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "25) test4572(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7220493453998122d + "'", double9 == 1.7220493453998122d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.11092540120144215d + "'", double16 == 0.11092540120144215d);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.probability(0.5662656190788444d);
        boolean boolean10 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution2.probability(1.936120997106573d);
        double double14 = uniformRealDistribution2.cumulativeProbability(0.7948236153171645d);
        double double15 = uniformRealDistribution2.getNumericalMean();
        double double16 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double17 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double18 = uniformRealDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-9d + "'", double16 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-9d + "'", double17 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.POSITIVE_INFINITY + "'", double18 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5364804800353178d, 0.3321070505100212d, 0.7882516988592704d);
        double double4 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.getNumericalVariance();
        boolean boolean10 = uniformRealDistribution2.isSupportConnected();
        double double11 = uniformRealDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getSupportLowerBound();
        fDistribution3.reseedRandomGenerator((long) 10);
        double double10 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.cumulativeProbability(1.3236068215490236E16d);
        double double13 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.8523690445729604d, 3.4527553180663855d, 0.7910281382335782d);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(3.250757588165562E-108d, 50.38759066622216d, 0.7328000769732316d);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.calculateNumericalVariance();
        double double12 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double15 = fDistribution3.cumulativeProbability(0.9999999999758308d, Double.POSITIVE_INFINITY);
        double double17 = fDistribution3.density(0.0018820678494252396d);
        double double18 = fDistribution3.getNumericalVariance();
        double double19 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.9750054205197466E-9d + "'", double17 == 1.9750054205197466E-9d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.23541417210258242d + "'", double18 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0210526315789474d + "'", double19 == 1.0210526315789474d);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability(0.17836413844857746d);
        double double11 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0025711558103546812d + "'", double10 == 0.0025711558103546812d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getNumericalVariance();
        double[] doubleArray7 = uniformRealDistribution0.sample((int) (byte) 1);
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "26) test4581(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3990307899455259d + "'", double3 == 0.3990307899455259d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "8) test4581(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.40996870813124797d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.0E-6d, 0.9787873837142649d);
        double double3 = uniformRealDistribution2.getNumericalMean();
        boolean boolean4 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution2.sample();
        boolean boolean6 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.48939419185713245d + "'", double3 == 0.48939419185713245d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "27) test4582(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.32332045909002954d + "'", double5 == 0.32332045909002954d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        fDistribution3.reseedRandomGenerator((long) 10);
        double double9 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double11 = fDistribution3.density(0.6414543161690349d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.875727714191207d + "'", double11 == 0.875727714191207d);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6155223357908637d, 0.7422678166643543d, 3.181009226124227E-44d);
        double double6 = fDistribution4.inverseCumulativeProbability(0.6140485448030906d);
        double double7 = fDistribution4.getNumeratorDegreesOfFreedom();
        boolean boolean8 = fDistribution4.isSupportLowerBoundInclusive();
        double double9 = fDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0611928590791497d + "'", double6 == 2.0611928590791497d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6155223357908637d + "'", double7 == 0.6155223357908637d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability(1.0210526315789474d, 3.537396594438314d);
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double12 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4311546417502141d + "'", double10 == 0.4311546417502141d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.sample();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double double13 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "28) test4586(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7199513443339381d + "'", double7 == 0.7199513443339381d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
// flaky "9) test4586(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7595626291561461d + "'", double10 == 1.7595626291561461d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "2) test4586(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7409774396473576d + "'", double13 == 1.7409774396473576d);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability(1.0210526315789474d, 3.537396594438314d);
        double double12 = fDistribution3.density(0.769221584666441d);
        double double13 = fDistribution3.getNumeratorDegreesOfFreedom();
        double[] doubleArray15 = fDistribution3.sample((int) '#');
        double double16 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4311546417502141d + "'", double10 == 0.4311546417502141d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9388767853941155d + "'", double12 == 0.9388767853941155d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((-0.9559482487825964d), 2.3675872428490314d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-0.956)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5831064787455089d, 1.449868410599931E16d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution2.probability(0.10917347757783191d);
        double double7 = uniformRealDistribution2.density(0.22615374216208872d);
        double double8 = uniformRealDistribution2.getNumericalMean();
        double double10 = uniformRealDistribution2.density(0.5971598461150479d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.249342052999655E15d + "'", double8 == 7.249342052999655E15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.897177652047864E-17d + "'", double10 == 6.897177652047864E-17d);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        boolean boolean10 = fDistribution3.isSupportConnected();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getNumericalVariance();
        double double13 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.sample();
        boolean boolean9 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double11 = uniformRealDistribution0.cumulativeProbability(0.9028380243284497d);
        double double13 = uniformRealDistribution0.cumulativeProbability(1.25d);
        boolean boolean14 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "29) test4591(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03256682697047486d + "'", double4 == 0.03256682697047486d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "10) test4591(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4943328322400289d + "'", double8 == 0.4943328322400289d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9028380243284497d + "'", double11 == 0.9028380243284497d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.25278270158073224d, 0.41916273676661453d);
        double double4 = fDistribution2.cumulativeProbability(0.8376521170390314d);
        double double5 = fDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5829893962951649d + "'", double4 == 0.5829893962951649d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.7041246883932513d, 0.4656187585388245d, 0.31543641316713045d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistribution4.probability(0.08852542671178854d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.089) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.867507128393655d, 0.7625534595104149d, 0.779340420746909d);
        double double5 = fDistribution4.calculateNumericalVariance();
        boolean boolean6 = fDistribution4.isSupportConnected();
        double double7 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution4.density(0.8282908420374357d);
        boolean boolean10 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7625534595104149d + "'", double7 == 0.7625534595104149d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.20052467346483463d + "'", double9 == 0.20052467346483463d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double6 = uniformRealDistribution0.density((double) (-1L));
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double10 = uniformRealDistribution0.density(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8580789782954743d, 0.5504701701974037d, 824.3314659149784d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.858) must be strictly less than upper bound (0.55)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.24686993238587407d, 0.42727811467671545d, 0.8975366192170979d);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.7538686543859143d, 0.8197481832678619d);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double5 = uniformRealDistribution0.sample();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.inverseCumulativeProbability(0.6323311848542505d);
        uniformRealDistribution0.reseedRandomGenerator((-1L));
        boolean boolean12 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
// flaky "30) test4600(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7541856191212983d + "'", double5 == 0.7541856191212983d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6323311848542505d + "'", double9 == 0.6323311848542505d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double13 = fDistribution3.density(0.27274084207236093d);
        double double14 = fDistribution3.sample();
        double double15 = fDistribution3.getNumericalMean();
        double double16 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.19963923310118198d + "'", double13 == 0.19963923310118198d);
// flaky "31) test4601(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7673373934795333d + "'", double14 == 1.7673373934795333d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(9.435082943715062E-15d, (double) 100.0f);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        boolean boolean4 = fDistribution2.isSupportConnected();
        double double5 = fDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.435082943715062E-15d + "'", double3 == 9.435082943715062E-15d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double double4 = fDistribution2.getSolverAbsoluteAccuracy();
        double double5 = fDistribution2.getNumericalMean();
        double double6 = fDistribution2.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution2.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution2.isSupportLowerBoundInclusive();
        boolean boolean9 = fDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0204081632653061d + "'", double5 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6177180781591378d + "'", double6 == 0.6177180781591378d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        double double13 = fDistribution3.probability(0.5415785819031833d, 2.3125942498560286d);
        double double16 = fDistribution3.cumulativeProbability(0.2972162083012442d, Double.POSITIVE_INFINITY);
        double double17 = fDistribution3.getDenominatorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((long) '4');
        double double20 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double21 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.12402951146545438d, 4.088344667887812E-6d);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.08333333333333333d, (double) 10.0f, 0.8151769424272568d);
        uniformRealDistribution3.reseedRandomGenerator((long) (short) 10);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample(1);
        double double7 = uniformRealDistribution0.density((double) (-1));
        double double8 = uniformRealDistribution0.getNumericalMean();
        double[] doubleArray10 = uniformRealDistribution0.sample(1);
        double double12 = uniformRealDistribution0.probability(0.26234650519828207d);
        double double13 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "32) test4607(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4096750611711564d + "'", double3 == 0.4096750611711564d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "11) test4607(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.6356116221372541d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray10);
// flaky "3) test4607(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.16452318658308918d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double8 = uniformRealDistribution0.density((double) 10.0f);
        double double9 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean10 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution0.density(0.8726330497066486d);
        double double14 = uniformRealDistribution0.cumulativeProbability(0.16357138905357987d);
        double double16 = uniformRealDistribution0.inverseCumulativeProbability(0.7332274021713567d);
        double double17 = uniformRealDistribution0.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = uniformRealDistribution0.probability(2.030276566879456d, 0.6804253970853864d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (2.03) must be less than or equal to upper endpoint (0.68)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "33) test4608(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.7937436346487261d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.16357138905357987d + "'", double14 == 0.16357138905357987d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.7332274021713567d + "'", double16 == 0.7332274021713567d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100, (double) 1, (double) (short) 1);
        boolean boolean5 = fDistribution4.isSupportLowerBoundInclusive();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution4.density(0.9382068481430984d);
        double double9 = fDistribution4.getNumericalVariance();
        double double11 = fDistribution4.cumulativeProbability(0.8449754473618898d);
        boolean boolean12 = fDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0012889459524991036d + "'", double8 == 0.0012889459524991036d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.49979629720198526d + "'", double11 == 0.49979629720198526d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 1);
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "34) test4611(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.737772164407253d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean5 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        boolean boolean6 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6741693158769999d, 0.3976769343837205d, 0.18010390962937572d);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.cumulativeProbability(0.9277715961927422d);
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9277715961927422d + "'", double7 == 0.9277715961927422d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getNumericalMean();
        double double13 = fDistribution3.density(0.7163545031354256d);
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        double double15 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9258528539967332d + "'", double13 == 0.9258528539967332d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.8447630313072814d, 0.09351912098798598d, 0.017365478252578725d);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution4.density(0.850103622586271d);
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double10 = fDistribution4.cumulativeProbability(0.8719310721377715d);
        boolean boolean11 = fDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8447630313072814d + "'", double5 == 0.8447630313072814d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.04356160098273004d + "'", double7 == 0.04356160098273004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8447630313072814d + "'", double8 == 0.8447630313072814d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.16434538054434356d + "'", double10 == 0.16434538054434356d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        double double7 = fDistribution3.calculateNumericalVariance();
        double double9 = fDistribution3.density(0.8914241055526231d);
        double double10 = fDistribution3.getSupportUpperBound();
        boolean boolean11 = fDistribution3.isSupportConnected();
        double double13 = fDistribution3.cumulativeProbability(0.567806681835231d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistribution3.cumulativeProbability(0.7749855885356518d, 0.031397993441797147d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.775) must be less than or equal to upper endpoint (0.031)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9101270685680378d + "'", double9 == 0.9101270685680378d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.16357138905357987d + "'", double13 == 0.16357138905357987d);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double9 = fDistribution3.density(0.7627482092423561d);
        double double11 = fDistribution3.cumulativeProbability(0.4999014899032976d);
        fDistribution3.reseedRandomGenerator(1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9382068481430984d + "'", double9 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.11372676532829251d + "'", double11 == 0.11372676532829251d);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 1.717302933707143d, 2.202701305912483d);
        boolean boolean5 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.933700404958179d, 0.8201641987860412d, 4.5064983383801834E-4d);
        fDistribution3.reseedRandomGenerator((long) ' ');
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.29568940059854176d, 0.317235538240356d, 0.26813163661952144d);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
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
        boolean boolean11 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "35) test4622(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4504754053568385d + "'", double7 == 0.4504754053568385d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        fDistribution3.reseedRandomGenerator((long) (byte) 100);
        double double13 = fDistribution3.density(0.864751955633795d);
        double double15 = fDistribution3.cumulativeProbability(0.9717760990109692d);
        double double17 = fDistribution3.inverseCumulativeProbability(0.6915706027621946d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9223932492826935d + "'", double13 == 0.9223932492826935d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5270416517160003d + "'", double15 == 0.5270416517160003d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.747587867018101d + "'", double17 == 1.747587867018101d);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.probability(10.0d);
        double double12 = fDistribution3.getSupportUpperBound();
        double double14 = fDistribution3.density(0.67922773538667d);
        double double15 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9058466127983987d + "'", double14 == 0.9058466127983987d);
// flaky "36) test4625(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6190917938263175d + "'", double15 == 0.6190917938263175d);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.5662656190788444d, 0.098126171830621d, 0.0d);
        boolean boolean5 = fDistribution4.isSupportLowerBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistribution4.probability(0.4294486510735027d, 0.21315945289935945d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.429) must be less than or equal to upper endpoint (0.213)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 1.7514977252944894d, 0.6006834726043084d, 0.8284117095601193d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1.751) must be strictly less than upper bound (0.601)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 2.051786173508851d, 0.5305840308156626d, 0.11402577646229095d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.052) must be strictly less than upper bound (0.531)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.005304180251840177d, 0.6615962937856623d);
        double double4 = fDistribution2.density(0.8348204602083172d);
        double double5 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0031067283349942728d + "'", double4 == 0.0031067283349942728d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double double13 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "37) test4630(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.784266525312892d + "'", double9 == 0.784266525312892d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistribution3.probability(0.6423692454313521d, 0.3475093614966853d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.642) must be less than or equal to upper endpoint (0.348)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        double double13 = fDistribution3.probability(0.5415785819031833d, 2.3125942498560286d);
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        double double16 = fDistribution3.density(0.8376911837863257d);
        double double17 = fDistribution3.getNumericalMean();
        double double18 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9316998175652447d + "'", double16 == 0.9316998175652447d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0210526315789474d + "'", double17 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.9193842879406898d, 0.7148009574548317d, 0.6023625222226008d);
        double double5 = fDistribution3.inverseCumulativeProbability(0.7697131649614974d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 14.598766704548574d + "'", double5 == 14.598766704548574d);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        uniformRealDistribution0.reseedRandomGenerator((long) (byte) 1);
        boolean boolean5 = uniformRealDistribution0.isSupportConnected();
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6553695282217037d, 0.7573235535633357d, 0.1882454026529332d);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.sample();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6553695282217037d + "'", double4 == 0.6553695282217037d);
// flaky "38) test4635(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.035444348951398d + "'", double5 == 5.035444348951398d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6553695282217037d + "'", double6 == 0.6553695282217037d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.getNumericalVariance();
        double double10 = uniformRealDistribution2.sample();
        boolean boolean11 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.12403806786301086d, 100.0d, (-0.09438007654212344d));
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.27747954593041024d, 0.11438351473661013d, (-1.0d));
        double double6 = fDistribution3.cumulativeProbability(0.9754387177260426d, 1.9582657562075956d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.02529422210527521d + "'", double6 == 0.02529422210527521d);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double5 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.probability((double) (byte) 0);
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution4.getSupportLowerBound();
        double double10 = fDistribution4.getNumericalVariance();
        double double11 = fDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = fDistribution4.sample(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double5 = uniformRealDistribution0.inverseCumulativeProbability(0.544127331049072d);
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double10 = uniformRealDistribution0.density(2.68542505220513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.544127331049072d + "'", double5 == 0.544127331049072d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double double14 = fDistribution3.density(0.9256110242665174d);
        double double15 = fDistribution3.getSupportLowerBound();
        double double17 = fDistribution3.cumulativeProbability(0.09351912098798598d);
        double double18 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "39) test4641(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6164807927126991d + "'", double7 == 0.6164807927126991d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.8904354075111562d + "'", double14 == 0.8904354075111562d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.4870378141774938E-4d + "'", double17 == 1.4870378141774938E-4d);
// flaky "12) test4641(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6016337049776705d + "'", double18 == 0.6016337049776705d);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 10, 0.6167715285164661d);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        boolean boolean4 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.cumulativeProbability(7.562099861400877E-28d);
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.562099861400877E-28d + "'", double7 == 7.562099861400877E-28d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double7 = fDistribution3.density(0.0d);
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean9 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.1623586333720101d, 0.26279270621356643d, 0.7071737568021614d);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution4.isSupportConnected();
        boolean boolean7 = uniformRealDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.26279270621356643d + "'", double5 == 0.26279270621356643d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
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
        double double11 = uniformRealDistribution0.getNumericalMean();
        double double12 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "40) test4646(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6399363036772086d + "'", double7 == 0.6399363036772086d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7697131649614974d + "'", double10 == 0.7697131649614974d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.inverseCumulativeProbability(0.5881395489123649d);
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5881395489123649d + "'", double6 == 0.5881395489123649d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.004733781286558752d, 0.7854695086654921d, 2.051786173508851d);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double6 = uniformRealDistribution0.density((double) (-1L));
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.6615962937856623d);
        double double10 = uniformRealDistribution0.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = uniformRealDistribution0.cumulativeProbability(0.30402959040335653d, 0.17954687407105752d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.304) must be less than or equal to upper endpoint (0.18)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6615962937856623d + "'", double9 == 0.6615962937856623d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.653180688712043d, 2.95229985235779d, 4.518267670586411E-4d);
        double double6 = uniformRealDistribution4.cumulativeProbability(0.08868516731655281d);
        double double7 = uniformRealDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.95229985235779d + "'", double7 == 2.95229985235779d);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.73078872710936d, 0.2781495492044994d, 0.0d);
        boolean boolean4 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.1325272133788298d, 0.24543468489254971d, 0.955602722012254d);
        double double5 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
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
        double double19 = fDistribution3.cumulativeProbability(0.4909797895169563d, 0.4999014899032976d);
        double double20 = fDistribution3.getSupportLowerBound();
        double double22 = fDistribution3.inverseCumulativeProbability(0.8914241055526231d);
        double double23 = fDistribution3.getSolverAbsoluteAccuracy();
        double double24 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "41) test4653(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5921396429427187d + "'", double9 == 0.5921396429427187d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.181009226124227E-44d + "'", double15 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0210526315789474d + "'", double16 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.005949830804446096d + "'", double19 == 0.005949830804446096d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.4112990379657004d + "'", double22 == 2.4112990379657004d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.sample();
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((long) (short) 0);
        double double12 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
// flaky "42) test4654(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6166851111875437d + "'", double8 == 0.6166851111875437d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double double14 = fDistribution3.cumulativeProbability(0.9217691399069918d);
        double double15 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "43) test4655(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 6.0579173792656285d + "'", double9 == 6.0579173792656285d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.48323678369188483d + "'", double14 == 0.48323678369188483d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (short) 1, 1.0210526315789474d, 0.7283674369075639d);
        boolean boolean4 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution3.inverseCumulativeProbability(0.07100266787412735d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(2.592987061877676d, 0.6848189829593176d, 0.0d);
        boolean boolean4 = fDistribution3.isSupportLowerBoundInclusive();
        double double5 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
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
        boolean boolean14 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
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
        double double17 = fDistribution3.getNumericalVariance();
        double double18 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
// flaky "44) test4659(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.7642065492718131d, 0.7024128927754568d, 0.8509047658034498d, 0.6552197901584755d, 1.8819730227272622d, 0.8372563578350687d, 0.7592190126972918d, 0.7131540956153378d, 0.600814082539255d, 2.246738727285869d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.23541417210258242d + "'", double17 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0210526315789474d + "'", double18 == 1.0210526315789474d);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.0E-6d, 0.9787873837142649d);
        boolean boolean3 = uniformRealDistribution2.isSupportConnected();
        uniformRealDistribution2.reseedRandomGenerator((long) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.49884479899047296d, 0.6177180781591378d, 0.6167715285164661d);
        double double5 = fDistribution3.density(0.0d);
        java.lang.Class<?> wildcardClass6 = fDistribution3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getNumericalMean();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        uniformRealDistribution0.reseedRandomGenerator(0L);
        double double11 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double13 = uniformRealDistribution0.cumulativeProbability(0.14025751612291093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-9d + "'", double11 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14025751612291093d + "'", double13 == 0.14025751612291093d);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
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
        double double20 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double21 = fDistribution3.sample();
        double double22 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "45) test4663(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7072765118608695d + "'", double9 == 0.7072765118608695d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.181009226124227E-44d + "'", double15 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0210526315789474d + "'", double16 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5545067584200759d + "'", double19 == 0.5545067584200759d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6282061437518466d + "'", double21 == 0.6282061437518466d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.781611959383924d, 0.09455665419110293d, 0.6536158793732554d);
        double double5 = fDistribution3.cumulativeProbability(1.3236068215490236E16d);
        double double6 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.getNumericalVariance();
        double double14 = fDistribution3.inverseCumulativeProbability(0.5190573322162404d);
        double double15 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean16 = fDistribution3.isSupportConnected();
        boolean boolean17 = fDistribution3.isSupportLowerBoundInclusive();
        java.lang.Class<?> wildcardClass18 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "46) test4665(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7740479785232933d + "'", double7 == 0.7740479785232933d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7625534595104149d + "'", double14 == 0.7625534595104149d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(7.17238793229426E-5d, 2.0615579450022756d, 0.544127331049072d);
        double double4 = uniformRealDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0615579450022756d + "'", double4 == 2.0615579450022756d);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability((-1.0d), (double) 1L);
        double double7 = fDistribution3.getSupportUpperBound();
        double double8 = fDistribution3.getNumericalVariance();
        double double10 = fDistribution3.density(2.0015015104803804d);
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5509385983974154d + "'", double6 == 0.5509385983974154d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11176895247131485d + "'", double10 == 0.11176895247131485d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double11 = uniformRealDistribution0.probability(7.562099861400877E-28d, 0.6517073035395284d);
        double double12 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "47) test4668(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36893144298599134d + "'", double7 == 0.36893144298599134d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6517073035395284d + "'", double11 == 0.6517073035395284d);
// flaky "13) test4668(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5841433911375951d + "'", double12 == 0.5841433911375951d);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double5 = uniformRealDistribution0.probability(0.6119517974962971d);
        double double6 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
// flaky "48) test4669(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7947738245649854d + "'", double6 == 0.7947738245649854d);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) 0L, 0.02866935715429131d, 0.8201641987860412d);
        boolean boolean5 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "49) test4671(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.805025468872617d + "'", double9 == 0.805025468872617d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.9541838208338267d, 0.7020663693379212d, 0.6085679397026329d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7810395258119183d, 0.04127273732944947d, 0.2395389662180223d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.4346153236172976d, 1.7673373934795333d);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        double double3 = fDistribution2.sample();
        double double4 = fDistribution2.calculateNumericalVariance();
        double double5 = fDistribution2.getSupportLowerBound();
// flaky "50) test4676(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1247289275394851d + "'", double3 == 0.1247289275394851d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.463149570621243d + "'", double4 == 3.463149570621243d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean9 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "51) test4677(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8412849449750945d + "'", double7 == 0.8412849449750945d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6089308656102914d, 0.6391854256750903d);
        double double4 = fDistribution2.cumulativeProbability(0.2512555790734534d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.358563371078316d + "'", double4 == 0.358563371078316d);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double13 = fDistribution3.density(0.5388621902004562d);
        double double14 = fDistribution3.calculateNumericalVariance();
        double double15 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double17 = fDistribution3.density(0.7160992725649364d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "52) test4679(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8243968866204667d + "'", double7 == 0.8243968866204667d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7434773485342417d + "'", double13 == 0.7434773485342417d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9257468518776281d + "'", double17 == 0.9257468518776281d);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.probability(0.8914241055526231d);
        double double13 = fDistribution3.getSupportLowerBound();
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        double double15 = fDistribution3.getSupportLowerBound();
        boolean boolean16 = fDistribution3.isSupportConnected();
        double double17 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.23541417210258242d + "'", double17 == 0.23541417210258242d);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        boolean boolean6 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution2.sample();
        boolean boolean10 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double12 = uniformRealDistribution2.cumulativeProbability(0.933700404958179d);
        double double14 = uniformRealDistribution2.cumulativeProbability(0.9641167172570826d);
        double double15 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.density((double) (short) -1);
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "53) test4682(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.501232900876964d + "'", double5 == 0.501232900876964d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 1.0E-9d, 0.4485518432850313d, 0.12699717731672883d);
        boolean boolean5 = uniformRealDistribution4.isSupportConnected();
        double double6 = uniformRealDistribution4.getSupportUpperBound();
        boolean boolean7 = uniformRealDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4485518432850313d + "'", double6 == 0.4485518432850313d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.17723898358627965d, 0.559025207971324d);
        boolean boolean9 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "54) test4684(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04176092790684871d + "'", double3 == 0.04176092790684871d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3817862243850444d + "'", double8 == 0.3817862243850444d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
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
        double double14 = fDistribution3.probability(97.0d);
        double double16 = fDistribution3.probability(2.4725239789609064d);
        double double18 = fDistribution3.probability((double) (-1));
        double double20 = fDistribution3.density(0.48655445053255997d);
        double double21 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "55) test4685(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7051472118723248d + "'", double9 == 1.7051472118723248d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6499611204603694d + "'", double20 == 0.6499611204603694d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.8465099057706973d, 0.5961932727724581d, 0.19312604306893894d);
        double double5 = fDistribution4.calculateNumericalVariance();
        double double7 = fDistribution4.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.7470764243917949d, 0.9066735920498323d, 0.7087523712937718d);
        // The following exception was thrown during execution in test generation
        try {
            fDistribution4.reseedRandomGenerator(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.3911207883006123E-6d, 0.731504921717633d);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample((int) (short) 1);
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.cumulativeProbability((double) (-1));
        double double10 = uniformRealDistribution0.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "56) test4689(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.09839320716524114d + "'", double3 == 0.09839320716524114d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "14) test4689(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.2710452270526511d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.36060793522756507d, 0.8460138802083401d, 0.7459227016817964d);
        boolean boolean5 = fDistribution4.isSupportLowerBoundInclusive();
        double double6 = fDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7459227016817964d + "'", double6 == 0.7459227016817964d);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6697212440760503d, 0.7935238495963384d, 1.7243389641593716d);
        boolean boolean5 = uniformRealDistribution4.isSupportConnected();
        double double7 = uniformRealDistribution4.cumulativeProbability(0.35236822917322286d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.density((double) '#');
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        double double11 = fDistribution3.density(0.8493872319532485d);
        double double12 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean13 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.562099861400877E-28d + "'", double8 == 7.562099861400877E-28d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9280868261112525d + "'", double11 == 0.9280868261112525d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.cumulativeProbability(100.0d);
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        double double9 = uniformRealDistribution0.getNumericalMean();
        double double10 = uniformRealDistribution0.sample();
        java.lang.Class<?> wildcardClass11 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "57) test4693(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8015258722880418d + "'", double3 == 0.8015258722880418d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
// flaky "15) test4693(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6644875901234244d + "'", double10 == 0.6644875901234244d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.49448191740329417d, 3.215245670585209d, 0.9382068481430984d);
        double double4 = uniformRealDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.49448191740329417d + "'", double4 == 0.49448191740329417d);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.004086979412209781d, 0.4590295860592326d);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.27645850507952763d, 0.8550391988086474d, 0.9258528539967332d);
        double double5 = uniformRealDistribution3.density(0.7432319455531449d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7283673839075255d + "'", double5 == 1.7283673839075255d);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.density((double) (short) -1);
        double double8 = uniformRealDistribution0.getSupportUpperBound();
        double double10 = uniformRealDistribution0.density(0.6313604496713228d);
        double double12 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        double double15 = uniformRealDistribution0.cumulativeProbability(0.27274084207236093d, 0.562847836339432d);
        double double16 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "58) test4697(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3479361879640319d + "'", double5 == 0.3479361879640319d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2901069942670711d + "'", double15 == 0.2901069942670711d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.08333333333333333d + "'", double16 == 0.08333333333333333d);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6354014550264216d, 0.3830697792996798d, 0.6195653609603238d);
        double double5 = fDistribution4.getNumericalVariance();
        boolean boolean6 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        double double13 = fDistribution3.probability(0.5415785819031833d, 2.3125942498560286d);
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean15 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double7 = uniformRealDistribution0.sample();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.90409522431247d);
        double double11 = uniformRealDistribution0.cumulativeProbability(0.8082594002622812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "59) test4700(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8557565976234587d + "'", double7 == 0.8557565976234587d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.90409522431247d + "'", double9 == 0.90409522431247d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8082594002622812d + "'", double11 == 0.8082594002622812d);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (-0.749061208741136d), 0.3747994003540216d, 0.018092779179760755d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-0.749)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.933700404958179d, 0.933517426050187d, 1.7354514364969038d);
        double double5 = fDistribution3.density(0.6480174446154539d);
        double double7 = fDistribution3.inverseCumulativeProbability(0.3655833131120836d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.22906287917093865d + "'", double5 == 0.22906287917093865d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
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
        boolean boolean13 = uniformRealDistribution0.isSupportConnected();
        double double14 = uniformRealDistribution0.getSupportUpperBound();
        double double16 = uniformRealDistribution0.inverseCumulativeProbability(0.4389954116860826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "60) test4703(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.44169300486089313d + "'", double4 == 0.44169300486089313d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-9d + "'", double11 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4389954116860826d + "'", double16 == 0.4389954116860826d);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(4.711194252818312E-227d, 0.4999999999999701d, 8.746758854452454E-5d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4999999999999701d + "'", double4 == 0.4999999999999701d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.004853457297448672d);
        boolean boolean9 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double10 = uniformRealDistribution0.getSupportUpperBound();
        double double13 = uniformRealDistribution0.probability(0.7626872631933409d, 0.9192321619950927d);
        double double14 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "61) test4705(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5481079922702563d + "'", double4 == 0.5481079922702563d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.004853457297448672d + "'", double8 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.15654489880175182d + "'", double13 == 0.15654489880175182d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6851772303251921d, 0.6976067833842337d, 0.3164687886038654d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportConnected();
        double double7 = uniformRealDistribution3.cumulativeProbability(0.3017638491436605d);
        double double8 = uniformRealDistribution3.getSupportUpperBound();
        double double9 = uniformRealDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6913920068547128d + "'", double4 == 0.6913920068547128d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6976067833842337d + "'", double8 == 0.6976067833842337d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6851772303251921d + "'", double9 == 0.6851772303251921d);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        double double13 = fDistribution3.probability(0.5415785819031833d, 2.3125942498560286d);
        fDistribution3.reseedRandomGenerator((long) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double6 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.inverseCumulativeProbability(0.7074171203241886d);
        double double9 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean10 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "62) test4708(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6951117733961996d + "'", double3 == 0.6951117733961996d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
// flaky "16) test4708(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5582532816981218d + "'", double6 == 0.5582532816981218d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7074171203241886d + "'", double8 == 0.7074171203241886d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.0d, 0.544127331049072d, 0.0d);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        boolean boolean6 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((-0.3349049318106768d), 0.8904061809109827d);
        double double3 = uniformRealDistribution2.sample();
// flaky "63) test4710(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.32523940714201643d) + "'", double3 == (-0.32523940714201643d));
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.9441357645782928d, 7.847827245153567E-4d);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.04519796485307248d);
        double double3 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double4 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-9d + "'", double3 == 1.0E-9d);
// flaky "64) test4712(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.029279673234617644d + "'", double4 == 0.029279673234617644d);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.8465099057706973d);
        fDistribution3.reseedRandomGenerator((long) ' ');
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double double13 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "65) test4713(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7361190231832785d + "'", double7 == 0.7361190231832785d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9290347830720211d + "'", double9 == 0.9290347830720211d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.24594400506499925d, 10.0d, 0.3801629465009775d);
        double double4 = fDistribution3.getNumericalMean();
        double double6 = fDistribution3.cumulativeProbability(0.2972162083012442d);
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.calculateNumericalVariance();
        boolean boolean9 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.25d + "'", double4 == 1.25d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6957245310498591d + "'", double6 == 0.6957245310498591d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.25d + "'", double7 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 17.462358968672483d + "'", double8 == 17.462358968672483d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.0d);
        double double10 = uniformRealDistribution0.getNumericalVariance();
        double double12 = uniformRealDistribution0.inverseCumulativeProbability(0.025701319694443586d);
        double double13 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.025701319694443586d + "'", double12 == 0.025701319694443586d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.getSupportUpperBound();
        double double11 = uniformRealDistribution0.probability(0.0d, 0.11659193530026048d);
        double double12 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "66) test4716(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.14213377894839474d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky "17) test4716(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8639931465919157d + "'", double7 == 0.8639931465919157d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.11659193530026048d + "'", double11 == 0.11659193530026048d);
// flaky "4) test4716(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.18109707003966458d + "'", double12 == 0.18109707003966458d);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0d, 6.006934970516585E-11d, 6.006934970516585E-11d);
        boolean boolean5 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution4.probability(0.7418114744879037d, 0.9970061237457858d);
        boolean boolean9 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        boolean boolean10 = uniformRealDistribution4.isSupportConnected();
        boolean boolean11 = uniformRealDistribution4.isSupportConnected();
        boolean boolean12 = uniformRealDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double4 = fDistribution2.calculateNumericalVariance();
        boolean boolean5 = fDistribution2.isSupportConnected();
        double double7 = fDistribution2.cumulativeProbability(0.0d);
        double double8 = fDistribution2.getNumericalVariance();
        double double10 = fDistribution2.density(0.2151315484155807d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.18260946742704312d + "'", double10 == 0.18260946742704312d);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.653180688712043d, 1.8963851205217543d, 0.7627482092423561d);
        double double6 = fDistribution4.density(0.7948236153171645d);
        double double8 = fDistribution4.cumulativeProbability(0.1245261116723153d);
        double double10 = fDistribution4.probability(0.9594901573103976d);
        boolean boolean11 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.19312604306893894d + "'", double6 == 0.19312604306893894d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.34469863524271394d + "'", double8 == 0.34469863524271394d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.936120567607905d, 0.7178690144889397d, 0.11896051811574537d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1.936) must be strictly less than upper bound (0.718)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.cumulativeProbability((double) ' ');
        double double4 = uniformRealDistribution0.getNumericalMean();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        double double11 = uniformRealDistribution0.density(0.30894504984520216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 4.711194252818312E-227d, 0.3036689686928481d, 0.9216351637618685d);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        double double7 = uniformRealDistribution4.inverseCumulativeProbability(0.6163120664688175d);
        double double9 = uniformRealDistribution4.cumulativeProbability(0.712244462262529d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3036689686928481d + "'", double5 == 0.3036689686928481d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.15183448434642405d + "'", double7 == 0.15183448434642405d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7071737568021614d, 0.8904354075111562d);
        boolean boolean3 = uniformRealDistribution2.isSupportConnected();
        boolean boolean4 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution2.probability(0.19867162304173502d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.calculateNumericalVariance();
        boolean boolean9 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5388621902004562d, 0.5520447923229905d, 48.8425886151626d);
        double double4 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3551385866867541d, 0.04528980003851823d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.355) must be strictly less than upper bound (0.045)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7082685265949001d, 0.9256110242665174d, 0.9934442264303616d);
        double double6 = uniformRealDistribution4.cumulativeProbability(0.6700141599746916d);
        double double7 = uniformRealDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.003936480107844747d + "'", double7 == 0.003936480107844747d);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean9 = uniformRealDistribution0.isSupportConnected();
        double double10 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray12 = uniformRealDistribution0.sample((int) (byte) 100);
        double double13 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "67) test4728(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.784040248378832d + "'", double4 == 0.784040248378832d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
// flaky "18) test4728(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.04511992353904293d + "'", double13 == 0.04511992353904293d);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.cumulativeProbability(0.6209274159326524d);
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double[] doubleArray14 = fDistribution3.sample((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.20730267740569058d + "'", double11 == 0.20730267740569058d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean7 = uniformRealDistribution2.isSupportConnected();
        double double8 = uniformRealDistribution2.sample();
        double double9 = uniformRealDistribution2.getSupportLowerBound();
        double double11 = uniformRealDistribution2.density(0.8811994355886743d);
        double[] doubleArray13 = uniformRealDistribution2.sample((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY }, 1.0E-15);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.sample();
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double14 = fDistribution3.calculateNumericalVariance();
        double double15 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "68) test4731(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7180028927663122d + "'", double7 == 0.7180028927663122d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
// flaky "19) test4731(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7565643386442136d + "'", double12 == 1.7565643386442136d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.density(0.6338262572667233d);
        uniformRealDistribution0.reseedRandomGenerator((long) ' ');
        double double10 = uniformRealDistribution0.sample();
        uniformRealDistribution0.reseedRandomGenerator((long) 100);
        boolean boolean13 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7685775863542659d + "'", double10 == 0.7685775863542659d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(44.50346162433869d, 0.45340416255758065d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (44.503) must be strictly less than upper bound (0.453)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        boolean boolean5 = uniformRealDistribution2.isSupportConnected();
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean7 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8391478235503405d, 0.595906678664889d, 0.16690123248873373d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.839) must be strictly less than upper bound (0.596)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.getNumericalMean();
        double double9 = fDistribution3.calculateNumericalVariance();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.08333333333333333d, 0.7537287967617665d, 0.11480653091901427d);
        double double5 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
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
        double double16 = fDistribution3.density(0.10342889770265168d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "69) test4738(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.849197849720229d + "'", double9 == 1.849197849720229d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08489345457721978d + "'", double14 == 0.08489345457721978d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.010319701245619723d + "'", double16 == 0.010319701245619723d);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.getSupportLowerBound();
        boolean boolean11 = fDistribution3.isSupportConnected();
        double double13 = fDistribution3.density(0.5725836976550815d);
        double double15 = fDistribution3.probability(1.9099235499431497E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7949051344332468d + "'", double13 == 0.7949051344332468d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.inverseCumulativeProbability(0.6179218618063023d);
        double double11 = uniformRealDistribution0.cumulativeProbability(0.9966194581206131d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "70) test4740(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5456978146483784d + "'", double4 == 0.5456978146483784d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6179218618063023d + "'", double9 == 0.6179218618063023d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9966194581206131d + "'", double11 == 0.9966194581206131d);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        double double3 = fDistribution2.sample();
        double double4 = fDistribution2.calculateNumericalVariance();
        double double5 = fDistribution2.calculateNumericalVariance();
// flaky "71) test4741(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.646664487355363E-4d + "'", double3 == 6.646664487355363E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.463149570621243d + "'", double4 == 3.463149570621243d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.463149570621243d + "'", double5 == 3.463149570621243d);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6006834726043084d, 0.7920480023859471d, 0.6684474749999711d);
        boolean boolean5 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double[] doubleArray9 = fDistribution3.sample((int) '4');
        double double10 = fDistribution3.calculateNumericalVariance();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getNumericalVariance();
        double double13 = fDistribution3.getNumericalVariance();
        double double14 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double15 = fDistribution3.getNumericalVariance();
        double double16 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23541417210258242d + "'", double15 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution4.calculateNumericalVariance();
        double double8 = fDistribution4.getSupportUpperBound();
        double double9 = fDistribution4.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) '4', 1.936120997106573d);
        double double4 = fDistribution2.inverseCumulativeProbability(8.569150035256934E-4d);
        double double5 = fDistribution2.calculateNumericalVariance();
        double double6 = fDistribution2.getNumericalVariance();
        double double8 = fDistribution2.density(0.6323311848542505d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12088722293581897d + "'", double4 == 0.12088722293581897d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5004707231666432d + "'", double8 == 0.5004707231666432d);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double13 = fDistribution3.density(0.27274084207236093d);
        double double14 = fDistribution3.sample();
        double double16 = fDistribution3.inverseCumulativeProbability(0.6684474749999711d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.19963923310118198d + "'", double13 == 0.19963923310118198d);
// flaky "72) test4746(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7062590160854992d + "'", double14 == 0.7062590160854992d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7099805359139226d + "'", double16 == 1.7099805359139226d);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.0053780154422362276d, 0.5961932727724581d, 0.9787873837142649d);
        double double4 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
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
        double double11 = uniformRealDistribution0.getNumericalMean();
        double double14 = uniformRealDistribution0.cumulativeProbability(0.2453669224520192d, 0.44323633661249023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "73) test4748(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.15333386204821253d + "'", double7 == 0.15333386204821253d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7697131649614974d + "'", double10 == 0.7697131649614974d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.19786941416047105d + "'", double14 == 0.19786941416047105d);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.3462976124464914d, (double) 10, 1.0E-6d);
        double double4 = fDistribution3.calculateNumericalVariance();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 12.552873165287084d + "'", double4 == 12.552873165287084d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.004853457297448672d);
        boolean boolean9 = uniformRealDistribution0.isSupportConnected();
        double double10 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean11 = uniformRealDistribution0.isSupportConnected();
        boolean boolean12 = uniformRealDistribution0.isSupportConnected();
        double double13 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "74) test4750(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6726196387330436d + "'", double4 == 0.6726196387330436d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.004853457297448672d + "'", double8 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "20) test4750(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.25961123866885694d + "'", double13 == 0.25961123866885694d);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        double double13 = fDistribution3.probability(0.5415785819031833d, 2.3125942498560286d);
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        double double15 = fDistribution3.getSupportLowerBound();
        double double16 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean17 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.17743551193543627d, 0.7459227016817964d, 3.2350882803772087d);
        boolean boolean5 = uniformRealDistribution4.isSupportConnected();
        double double6 = uniformRealDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7459227016817964d + "'", double6 == 0.7459227016817964d);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6913920068547128d, 0.20052467346483463d, 0.9754387177260426d);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 2.7171475092674E-46d, 0.8951247373711049d, 0.8972526735022719d);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.27645850507952763d, 0.2782837625077381d, 0.8025566058551445d);
        boolean boolean5 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100L, 0.3321070505100212d, 0.08333333333333333d);
        double double7 = fDistribution4.cumulativeProbability((double) 'a', (double) 100);
        double double8 = fDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0018820678494252396d + "'", double7 == 0.0018820678494252396d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportUpperBound();
        boolean boolean5 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.getNumericalVariance();
        double double11 = uniformRealDistribution2.cumulativeProbability(0.9570752589003741d);
        boolean boolean12 = uniformRealDistribution2.isSupportConnected();
        double double13 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        boolean boolean14 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = uniformRealDistribution2.probability(0.9143504744746487d, 0.03837388900144334d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.914) must be less than or equal to upper endpoint (0.038)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-9d + "'", double13 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.sample();
        double double12 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
// flaky "75) test4759(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.684885492389404d + "'", double11 == 0.684885492389404d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.8447630313072814d, 0.09351912098798598d, 0.017365478252578725d);
        double double5 = fDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7751813324443158d, (double) 100L, (double) 'a');
        double double5 = uniformRealDistribution4.getNumericalMean();
        double double6 = uniformRealDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.38759066622216d + "'", double5 == 50.38759066622216d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 2.713869027440155d, 0.5081868679022634d);
        double double6 = uniformRealDistribution3.probability(0.323583325827407d, 0.33575915472719076d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.00448652045351966d + "'", double6 == 0.00448652045351966d);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.9155713525675118d, 0.6179657774208087d);
        double double4 = fDistribution2.probability(0.27747954593041024d);
        double double5 = fDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5698691107090974d, 0.00178043737201525d);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00178043737201525d + "'", double3 == 0.00178043737201525d);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double6 = uniformRealDistribution0.sample();
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "76) test4765(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.668736261764475d + "'", double3 == 0.668736261764475d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
// flaky "21) test4765(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.44597485805118997d + "'", double6 == 0.44597485805118997d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08333333333333333d + "'", double8 == 0.08333333333333333d);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
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
        uniformRealDistribution2.reseedRandomGenerator((-1L));
        double double17 = uniformRealDistribution2.cumulativeProbability(1.296411206760982E-7d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        boolean boolean6 = fDistribution4.isSupportLowerBoundInclusive();
        double double7 = fDistribution4.getSupportLowerBound();
        boolean boolean8 = fDistribution4.isSupportUpperBoundInclusive();
        double double9 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double10 = fDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.004853457297448672d + "'", double9 == 0.004853457297448672d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.density(0.9970061237457858d);
        double double11 = fDistribution3.cumulativeProbability(2.4725239789609064d);
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass13 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8376911837863257d + "'", double9 == 0.8376911837863257d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9889026997093298d + "'", double11 == 0.9889026997093298d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.getSupportUpperBound();
        double double10 = uniformRealDistribution0.density(0.4401987088786399d);
        double double11 = uniformRealDistribution0.sample();
        boolean boolean12 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "77) test4769(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.15094570921677386d + "'", double7 == 0.15094570921677386d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
// flaky "22) test4769(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08610230655985296d + "'", double11 == 0.08610230655985296d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double12 = fDistribution3.getSupportUpperBound();
        double double14 = fDistribution3.cumulativeProbability(0.8465099057706973d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistribution3.cumulativeProbability(0.9594901573103976d, 0.27518272348224815d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.959) must be less than or equal to upper endpoint (0.275)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.41453839708711177d + "'", double14 == 0.41453839708711177d);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSupportLowerBound();
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double6 = uniformRealDistribution0.sample();
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
// flaky "78) test4771(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.34888994152263875d + "'", double6 == 0.34888994152263875d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6533273338155337d, 0.4031798173762142d, 0.7882516988592704d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.653) must be strictly less than upper bound (0.403)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.12452611167231531d, 0.7697131649614974d);
        double double9 = uniformRealDistribution0.getNumericalMean();
        double double11 = uniformRealDistribution0.density((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "79) test4773(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.24243597796020744d + "'", double3 == 0.24243597796020744d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6451870532891821d + "'", double8 == 0.6451870532891821d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.04519796485307248d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution2.density(0.5921396429427187d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 100.0d, Double.POSITIVE_INFINITY, (double) (byte) 1);
        double double5 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution4.getNumericalMean();
        double double7 = uniformRealDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.getSupportLowerBound();
        double double8 = fDistribution4.density(0.8523690445729604d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.205059860420572d + "'", double8 == 0.205059860420572d);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getNumericalMean();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
// flaky "80) test4778(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3467772360946708d + "'", double9 == 0.3467772360946708d);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.11659193530026048d, 0.6984806104495952d, 0.6179657774208087d);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.30933069620008014d, 0.8963439166893825d, 0.5662656190788444d);
        double double4 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5662656190788444d + "'", double4 == 0.5662656190788444d);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double9 = fDistribution3.probability(0.004853457297448672d, 0.5662656190788444d);
        double double10 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double12 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1623586333720101d + "'", double9 == 0.1623586333720101d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5190573322162404d, 0.7283674369075639d);
        double double3 = fDistribution2.getNumericalVariance();
        boolean boolean4 = fDistribution2.isSupportConnected();
        boolean boolean5 = fDistribution2.isSupportUpperBoundInclusive();
        java.lang.Class<?> wildcardClass6 = fDistribution2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        boolean boolean8 = fDistribution3.isSupportLowerBoundInclusive();
        double double9 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5261349832949958d, 0.19272308027398632d, 88.41710856256726d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean5 = fDistribution3.isSupportConnected();
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.19272308027398632d + "'", double4 == 0.19272308027398632d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) '4', 1.936120997106573d);
        double double3 = fDistribution2.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistribution2.probability(1.7854060450133113d, 0.7541856191212983d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1.785) must be less than or equal to upper endpoint (0.754)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample(1);
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.probability(0.0d);
        double double9 = uniformRealDistribution0.sample();
        double double11 = uniformRealDistribution0.cumulativeProbability(0.7074903746245014d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "81) test4786(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9029372693188142d + "'", double3 == 0.9029372693188142d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "23) test4786(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.7677859566367247d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky "5) test4786(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.851682377969561d + "'", double9 == 0.851682377969561d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7074903746245014d + "'", double11 == 0.7074903746245014d);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.probability((double) 100);
        double double9 = fDistribution3.cumulativeProbability(2.4980016587511606d, (double) 10L);
        double double10 = fDistribution3.getNumericalVariance();
        double double11 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double12 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.010322138824075844d + "'", double9 == 0.010322138824075844d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.density(0.1757939476207693d);
        double[] doubleArray9 = uniformRealDistribution0.sample(10);
        double double12 = uniformRealDistribution0.cumulativeProbability(0.9934442264303616d, (double) 1);
        double double13 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
// flaky "82) test4788(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.24052133780087837d, 0.9963331570585581d, 0.2940998141389153d, 0.8940174433881503d, 0.7541223047247214d, 0.9145841243051149d, 0.5338888875106995d, 0.29829232381769755d, 0.4271780979067099d, 0.9261203676969052d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0065557735696384345d + "'", double12 == 0.0065557735696384345d);
// flaky "24) test4788(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.30936748086218d + "'", double13 == 0.30936748086218d);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.22459862688301188d, 0.7121379610434626d);
        double double3 = fDistribution2.calculateNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        double double9 = uniformRealDistribution0.density(2.4168088434316246d);
        double double10 = uniformRealDistribution0.getSupportUpperBound();
        double double12 = uniformRealDistribution0.cumulativeProbability(0.5872312916136835d);
        boolean boolean13 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "83) test4790(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8848030244582112d + "'", double4 == 0.8848030244582112d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5872312916136835d + "'", double12 == 0.5872312916136835d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5831064787455089d, 1.449868410599931E16d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution2.inverseCumulativeProbability(0.9375754745450884d);
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double8 = uniformRealDistribution2.probability(0.005613830405313154d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.3593610630961634E16d + "'", double5 == 1.3593610630961634E16d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.449868410599931E16d + "'", double6 == 1.449868410599931E16d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7071737568021614d, 0.8904354075111562d);
        boolean boolean3 = uniformRealDistribution2.isSupportConnected();
        boolean boolean4 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "84) test4792(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8254844533791657d + "'", double5 == 0.8254844533791657d);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0d, 6.006934970516585E-11d, 6.006934970516585E-11d);
        boolean boolean5 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution4.probability(0.7418114744879037d, 0.9970061237457858d);
        boolean boolean9 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double10 = uniformRealDistribution4.getSupportUpperBound();
        double double12 = uniformRealDistribution4.density(0.20729773794146564d);
        double double13 = uniformRealDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.006934970516585E-11d + "'", double10 == 6.006934970516585E-11d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.0034674852582924E-11d + "'", double13 == 3.0034674852582924E-11d);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability(1.0210526315789474d, 3.537396594438314d);
        double double11 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double12 = fDistribution3.getNumericalVariance();
        double double13 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4311546417502141d + "'", double10 == 0.4311546417502141d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.sample();
        double double9 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.sample();
        double double11 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "85) test4795(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7151232326520143d + "'", double8 == 1.7151232326520143d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
// flaky "25) test4795(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.8404633723770734d + "'", double10 == 1.8404633723770734d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean7 = uniformRealDistribution2.isSupportConnected();
        double double9 = uniformRealDistribution2.density(3.537396594438314d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = uniformRealDistribution2.sample((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5190573322162404d, 0.8298516959768152d, 0.6836071484595452d);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double4 = uniformRealDistribution0.density(10.0d);
        double double5 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.probability(0.1757939476207693d);
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double10 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean11 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = uniformRealDistribution0.probability(0.44175393622014125d, 0.3606827358808251d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.442) must be less than or equal to upper endpoint (0.361)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "86) test4798(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8247436123338372d + "'", double5 == 0.8247436123338372d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.probability(0.5662656190788444d);
        boolean boolean10 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution2.probability(1.936120997106573d);
        double double14 = uniformRealDistribution2.cumulativeProbability(0.7948236153171645d);
        boolean boolean15 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double16 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        boolean boolean17 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-9d + "'", double16 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.449868410599931E16d, 0.6155223357908637d);
        double double4 = fDistribution2.probability(0.6971549552183045d);
        boolean boolean5 = fDistribution2.isSupportLowerBoundInclusive();
        boolean boolean6 = fDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5831064787455089d, 0.9290347830720211d, 0.559025207971324d);
        double double4 = uniformRealDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5831064787455089d + "'", double4 == 0.5831064787455089d);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.49884479899047296d, 0.6177180781591378d, 0.6167715285164661d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.getNumericalVariance();
        double double7 = fDistribution3.getNumericalMean();
        double double9 = fDistribution3.probability(0.5397993639605845d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6177180781591378d + "'", double4 == 0.6177180781591378d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double12 = fDistribution3.getSupportLowerBound();
        double double13 = fDistribution3.getSupportUpperBound();
        double double15 = fDistribution3.cumulativeProbability(0.8440247749668012d);
        double double16 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.41222863913028895d + "'", double15 == 0.41222863913028895d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.0d, 0.2821061747203668d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double10 = uniformRealDistribution2.density((double) (short) 1);
        boolean boolean11 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = uniformRealDistribution2.inverseCumulativeProbability(0.7171149992460315d);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double7 = fDistribution3.density(0.7627482092423561d);
        boolean boolean8 = fDistribution3.isSupportLowerBoundInclusive();
        double double9 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9382068481430984d + "'", double7 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5415785819031833d, 3.0069389783345903E-22d);
        double double4 = fDistribution2.density(1.8269378627115378d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.229450600667112E-23d + "'", double4 == 8.229450600667112E-23d);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 1, 9.435082943715062E-15d, 0.7627482092423561d);
        double double6 = fDistribution4.cumulativeProbability(2.2293967067569245d);
        double double7 = fDistribution4.getNumericalMean();
        java.lang.Class<?> wildcardClass8 = fDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.6131540547803525E-13d + "'", double6 == 1.6131540547803525E-13d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7387842926428161d, 0.9382068481430984d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution2.probability(0.595906678664889d, 0.8300851989496363d);
        double double8 = uniformRealDistribution2.density(0.07720204573223416d);
        boolean boolean9 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.45782637815355315d + "'", double6 == 0.45782637815355315d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.22501915578549436d, 0.15048901990343566d, (double) 1);
        boolean boolean4 = fDistribution3.isSupportLowerBoundInclusive();
        double double5 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.15048901990343566d + "'", double5 == 0.15048901990343566d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double12 = fDistribution3.cumulativeProbability(1.0d, 3.5564389998236723d);
        double double13 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.4485770812615808d + "'", double12 == 0.4485770812615808d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
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
        double double15 = fDistribution3.density(0.17609896838097427d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.05841565914027615d + "'", double15 == 0.05841565914027615d);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double6 = fDistribution4.cumulativeProbability(0.08333333333333333d);
        double double7 = fDistribution4.calculateNumericalVariance();
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.cumulativeProbability(7.847827245153567E-4d);
        double[] doubleArray12 = fDistribution3.sample((int) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.435082943715062E-15d + "'", double10 == 9.435082943715062E-15d);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.8669478676573001d, 0.3807199377752173d, 0.7852621085053451d);
        boolean boolean5 = fDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.probability(0.8914241055526231d);
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double14 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution4.cumulativeProbability(3.0034674852582924E-11d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        fDistribution3.reseedRandomGenerator((long) 100);
        double double11 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double4 = fDistribution2.calculateNumericalVariance();
        boolean boolean5 = fDistribution2.isSupportConnected();
        double double7 = fDistribution2.cumulativeProbability(0.0d);
        fDistribution2.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.cumulativeProbability((-1.0d), (double) ' ');
        boolean boolean10 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double12 = uniformRealDistribution0.density(0.6484267095499411d);
        double double14 = uniformRealDistribution0.density(0.25609061457976084d);
        double double15 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
// flaky "87) test4820(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.4749200203973192d + "'", double15 == 0.4749200203973192d);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability(1.0210526315789474d, 3.537396594438314d);
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double12 = fDistribution3.getNumericalMean();
        double double15 = fDistribution3.probability(0.18585761085314045d, 0.8476015935700038d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4311546417502141d + "'", double10 == 0.4311546417502141d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0210526315789474d + "'", double12 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.41249648292458624d + "'", double15 == 0.41249648292458624d);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.sample();
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double14 = fDistribution3.calculateNumericalVariance();
        double double15 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "88) test4822(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8152741160876562d + "'", double7 == 0.8152741160876562d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
// flaky "26) test4822(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.1351889873800234d + "'", double12 == 2.1351889873800234d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23541417210258242d + "'", double15 == 0.23541417210258242d);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 4.711194252818312E-227d, 0.3036689686928481d, 0.9216351637618685d);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        double double7 = uniformRealDistribution4.density(32.0d);
        double double9 = uniformRealDistribution4.cumulativeProbability(0.08529529275031239d);
        double double11 = uniformRealDistribution4.probability(0.5227791371856922d);
        double double13 = uniformRealDistribution4.density(0.36787887984184d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3036689686928481d + "'", double5 == 0.3036689686928481d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2808824790938253d + "'", double9 == 0.2808824790938253d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
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
        double double17 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean18 = fDistribution3.isSupportUpperBoundInclusive();
        double double19 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double21 = fDistribution3.cumulativeProbability(0.8084906196345517d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.3790276991639211d + "'", double21 == 0.3790276991639211d);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.21387320010949318d, 0.6316235913295272d, 3.463149570621243d);
        double double4 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.463149570621243d + "'", double4 == 3.463149570621243d);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6121227109766438d, 2.3125942498560286d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double5 = fDistribution2.cumulativeProbability(0.0d);
        double double7 = fDistribution2.cumulativeProbability(0.23003674406207653d);
        java.lang.Class<?> wildcardClass8 = fDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.44149148790384235d + "'", double7 == 0.44149148790384235d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalMean();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.density(0.6121227109766438d);
        double double8 = uniformRealDistribution0.cumulativeProbability(0.3728694875041465d);
        double double10 = uniformRealDistribution0.inverseCumulativeProbability(0.2292907461367717d);
        double double11 = uniformRealDistribution0.getNumericalMean();
        boolean boolean12 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5d + "'", double2 == 0.5d);
// flaky "89) test4827(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9329343535743784d + "'", double3 == 0.9329343535743784d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3728694875041465d + "'", double8 == 0.3728694875041465d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.22929074613677172d + "'", double10 == 0.22929074613677172d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.inverseCumulativeProbability(0.7283674369075639d);
        double double11 = fDistribution3.density(0.7387842926428161d);
        double double12 = fDistribution3.getSupportLowerBound();
        double double13 = fDistribution3.getSupportUpperBound();
        double double15 = fDistribution3.density(0.9101270685680378d);
        double double16 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double17 = fDistribution3.getNumericalVariance();
        boolean boolean18 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "90) test4828(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7017900453730601d + "'", double7 == 0.7017900453730601d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.8155649719352942d + "'", double9 == 1.8155649719352942d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.933517426050187d + "'", double11 == 0.933517426050187d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8998695148900057d + "'", double15 == 0.8998695148900057d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.23541417210258242d + "'", double17 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(4.7120415909255865E-4d, 0.6060113752531858d);
        fDistribution2.reseedRandomGenerator((long) (byte) -1);
        double double5 = fDistribution2.getNumericalMean();
        boolean boolean6 = fDistribution2.isSupportUpperBoundInclusive();
        double double7 = fDistribution2.calculateNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) 10, 0.39037743876434505d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (10) must be strictly less than upper bound (0.39)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.cumulativeProbability((double) 1L, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = fDistribution3.sample((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44906140157841534d + "'", double9 == 0.44906140157841534d);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.18492953837985415d, 0.43896927012832443d);
        double double3 = uniformRealDistribution2.getNumericalVariance();
        double double6 = uniformRealDistribution2.probability(0.07983844188212808d, 0.6709045708448786d);
        boolean boolean7 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0053780154422362276d + "'", double3 == 0.0053780154422362276d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportConnected();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "91) test4833(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03376617543774363d + "'", double3 == 0.03376617543774363d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        uniformRealDistribution3.reseedRandomGenerator((long) (short) 1);
        double double6 = uniformRealDistribution3.sample();
        java.lang.Class<?> wildcardClass7 = uniformRealDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7083209037241167d + "'", double6 == 0.7083209037241167d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalMean();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.cumulativeProbability(3.8313024651998237E-7d);
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5d + "'", double2 == 0.5d);
// flaky "92) test4835(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.851606485801367d + "'", double3 == 0.851606485801367d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.8313024651998237E-7d + "'", double5 == 3.8313024651998237E-7d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7096782779951498d, 1.3236068215490236E16d, 0.8535187100169657d);
        fDistribution3.reseedRandomGenerator((long) (short) 100);
        double double6 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.818178408461404d + "'", double6 == 2.818178408461404d);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistribution3.inverseCumulativeProbability(2.245686793821953d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 2.246 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "93) test4837(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7527860395035385d + "'", double7 == 0.7527860395035385d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.cumulativeProbability((double) ' ');
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(0.0705619273799758d);
        double double8 = uniformRealDistribution0.cumulativeProbability(0.05247334165651602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0705619273799758d + "'", double6 == 0.0705619273799758d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.05247334165651602d + "'", double8 == 0.05247334165651602d);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
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
        double double14 = fDistribution3.inverseCumulativeProbability(0.4646042977238032d);
        fDistribution3.reseedRandomGenerator((long) (-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "94) test4839(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8242169393025639d + "'", double9 == 0.8242169393025639d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7365169690087957d + "'", double14 == 0.7365169690087957d);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(2.8155024411648446d, 0.7999500154789846d);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double11 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "95) test4841(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7330326158496075d + "'", double7 == 0.7330326158496075d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "27) test4841(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7227889983740416d + "'", double9 == 0.7227889983740416d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.17034059620149794d, 0.6692245595523327d, 3.2610035858143385d);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        uniformRealDistribution0.reseedRandomGenerator((-1L));
        boolean boolean3 = uniformRealDistribution0.isSupportConnected();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) 100.0f);
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "96) test4844(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25910628499798727d + "'", double4 == 0.25910628499798727d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "28) test4844(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014953114228289266d + "'", double8 == 0.014953114228289266d);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.20269651260689064d, 0.3479361879640319d, 0.0d);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6039787332279838d, 0.98707287595118d);
        double double5 = uniformRealDistribution2.cumulativeProbability(0.4803791664765238d, 36.22126828088923d);
        double double7 = uniformRealDistribution2.cumulativeProbability(0.7661254692996333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.423255586522523d + "'", double7 == 0.423255586522523d);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.14433062026450583d, 0.3306017161812415d, 0.6594006799513035d);
        double double6 = uniformRealDistribution3.cumulativeProbability((-0.9559482487825964d), 0.6119517974962971d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.inverseCumulativeProbability(0.1882454026529332d);
        double double9 = uniformRealDistribution0.sample();
        boolean boolean10 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.1882454026529332d + "'", double8 == 0.1882454026529332d);
// flaky "97) test4848(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.680281668843181d + "'", double9 == 0.680281668843181d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5831064787455089d, 1.449868410599931E16d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "98) test4849(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.8327620997282235E15d + "'", double4 == 2.8327620997282235E15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.getNumericalVariance();
        double double10 = uniformRealDistribution0.cumulativeProbability(0.9086942757105466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "99) test4851(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3452282716114632d + "'", double4 == 0.3452282716114632d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08333333333333333d + "'", double8 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9086942757105466d + "'", double10 == 0.9086942757105466d);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.0d);
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        double double11 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean12 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double13 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-9d + "'", double11 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "100) test4852(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7737547029660747d + "'", double13 == 0.7737547029660747d);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.97199803515683d, 0.5593412801291973d);
        double double3 = fDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5545133236549422d, 0.6681525979793006d, 1.8370221871625128d);
        double double4 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.8370221871625128d + "'", double4 == 1.8370221871625128d);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.544127331049072d, 0.6675243906670285d, 1.449868410599931E16d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6058258608580502d + "'", double4 == 0.6058258608580502d);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.98707287595118d, 0.6340633295359905d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.987) must be strictly less than upper bound (0.634)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.9241695232741018d, 0.0d, 0.09451747010652833d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution4.probability(0.4109542347735471d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.probability((double) (-1L));
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        double double10 = uniformRealDistribution0.density(0.3904156731971007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "101) test4859(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.38804419228385845d + "'", double4 == 0.38804419228385845d);
// flaky "29) test4859(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7992291774458116d + "'", double5 == 0.7992291774458116d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.45923716653028973d, 0.9373298332230393d, 0.15992513710768974d);
        double double5 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.2670190035956374d, 0.7947738245649854d, 0.27144544822026695d);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) 100.0f);
        double double7 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.probability(0.1320725215067027d);
        uniformRealDistribution0.reseedRandomGenerator((long) (short) 0);
        double double13 = uniformRealDistribution0.probability(0.15339489250959404d);
        double double15 = uniformRealDistribution0.cumulativeProbability(0.4729049568766539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "102) test4862(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6435998778409122d + "'", double4 == 0.6435998778409122d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.4729049568766539d + "'", double15 == 0.4729049568766539d);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6766392398995167d, 0.6916856290446507d);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        boolean boolean4 = fDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6766392398995167d + "'", double3 == 0.6766392398995167d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        double double13 = fDistribution3.probability(0.5415785819031833d, 2.3125942498560286d);
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        double double16 = fDistribution3.density(0.8376911837863257d);
        double double17 = fDistribution3.getNumericalMean();
        fDistribution3.reseedRandomGenerator((long) (short) 10);
        fDistribution3.reseedRandomGenerator((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9316998175652447d + "'", double16 == 0.9316998175652447d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0210526315789474d + "'", double17 == 1.0210526315789474d);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.cumulativeProbability(100.0d);
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        double double10 = uniformRealDistribution0.cumulativeProbability((double) (byte) 0);
        boolean boolean11 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double[] doubleArray13 = uniformRealDistribution0.sample((int) ' ');
        uniformRealDistribution0.reseedRandomGenerator(1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "103) test4865(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9839919254072127d + "'", double3 == 0.9839919254072127d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(4.7120415909255865E-4d, 0.6060113752531858d);
        double double3 = fDistribution2.getNumericalMean();
        double[] doubleArray5 = fDistribution2.sample((int) '#');
        boolean boolean6 = fDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray8 = fDistribution2.sample(1);
        double double10 = fDistribution2.density(0.4949530314361119d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.7474946294812537E-4d + "'", double10 == 4.7474946294812537E-4d);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean10 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean11 = uniformRealDistribution0.isSupportConnected();
        double double12 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "104) test4867(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.44293815439990825d + "'", double4 == 0.44293815439990825d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double double13 = fDistribution3.getNumeratorDegreesOfFreedom();
        double[] doubleArray15 = fDistribution3.sample(1);
        boolean boolean16 = fDistribution3.isSupportLowerBoundInclusive();
        double double18 = fDistribution3.probability(0.7496027112289443d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "105) test4868(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5993370739738937d + "'", double7 == 0.5993370739738937d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
// flaky "30) test4868(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.705653736441739d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7939555608321129d, 0.4294486510735027d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.794) must be strictly less than upper bound (0.429)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        boolean boolean4 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution3.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution3.isSupportConnected();
        boolean boolean7 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution3.sample();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6119517974962971d + "'", double5 == 0.6119517974962971d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "106) test4870(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.613492111695696d + "'", double8 == 1.613492111695696d);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
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
        boolean boolean11 = uniformRealDistribution0.isSupportConnected();
        boolean boolean12 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "107) test4871(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4358651249468277d + "'", double4 == 0.4358651249468277d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.15729349752684074d, 0.9966872852742321d, 0.5227791371856922d);
        double[] doubleArray5 = fDistribution3.sample((int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "108) test4872(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d, 0.0d, 0.5d, 2.0d, 0.0d, 0.0d, 0.5d, 0.5d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5261349832949958d, 0.19272308027398632d, 88.41710856256726d);
        double double5 = fDistribution3.inverseCumulativeProbability(0.9217691399069918d);
        double double6 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.178332390906387E9d + "'", double5 == 6.178332390906387E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        uniformRealDistribution0.reseedRandomGenerator((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        double double7 = fDistribution3.calculateNumericalVariance();
        double double9 = fDistribution3.density(0.8914241055526231d);
        double double10 = fDistribution3.getSupportUpperBound();
        boolean boolean11 = fDistribution3.isSupportConnected();
        boolean boolean12 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9101270685680378d + "'", double9 == 0.9101270685680378d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double11 = fDistribution3.cumulativeProbability(0.6957245310498591d);
        double double12 = fDistribution3.getSupportLowerBound();
        double double13 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2737809697987744d + "'", double11 == 0.2737809697987744d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.inverseCumulativeProbability(0.40425162944598975d);
        double double12 = fDistribution3.cumulativeProbability(0.7805153048133248d);
        double double14 = fDistribution3.cumulativeProbability(0.8151769424272568d);
        double double15 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103655534857197d + "'", double10 == 0.7103655534857197d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3527591133882273d + "'", double12 == 0.3527591133882273d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.3852949213208437d + "'", double14 == 0.3852949213208437d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.625504238759457d, 0.7697294817344926d);
        java.lang.Class<?> wildcardClass3 = fDistribution2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.48365461899110573d, 1.9941381926271031d);
        double double4 = fDistribution2.cumulativeProbability(0.045272958052451656d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.33464968633780273d + "'", double4 == 0.33464968633780273d);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.2781495492044994d, (double) 10, 0.679880178889932d);
        double[] doubleArray5 = uniformRealDistribution3.sample(1);
        double double7 = uniformRealDistribution3.probability(0.11483289970060134d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "109) test4880(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 9.709003171555779d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getNumericalMean();
        double[] doubleArray12 = fDistribution3.sample((int) '4');
        double[] doubleArray14 = fDistribution3.sample((int) 'a');
        double double16 = fDistribution3.probability(0.5551892552666533d);
        double double17 = fDistribution3.getSupportUpperBound();
        double double18 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "110) test4881(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6628594804604666d + "'", double9 == 0.6628594804604666d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
// flaky "31) test4881(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6331982380937713d + "'", double18 == 0.6331982380937713d);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(2.007657447155151d, 0.0053780154422362276d, 0.7513849866102175d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.008) must be strictly less than upper bound (0.005)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.8733954553258896d, 0.098126171830621d);
        boolean boolean4 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        boolean boolean5 = uniformRealDistribution3.isSupportConnected();
        double double6 = uniformRealDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4366977276629448d + "'", double6 == 0.4366977276629448d);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.9133965166070068d, 1.747587867018101d, 0.6371742875919058d);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6553695282217037d, (double) 1, 0.6119517974962971d);
        double double5 = uniformRealDistribution4.getNumericalVariance();
        double double6 = uniformRealDistribution4.getSupportLowerBound();
        double double7 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.009897513506510924d + "'", double5 == 0.009897513506510924d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6553695282217037d + "'", double6 == 0.6553695282217037d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6119517974962971d + "'", double7 == 0.6119517974962971d);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double7 = fDistribution3.calculateNumericalVariance();
        double double9 = fDistribution3.cumulativeProbability(0.869603206076088d);
        double double11 = fDistribution3.probability(0.6554069756983542d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4358975004783541d + "'", double9 == 0.4358975004783541d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        double double10 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double double4 = fDistribution2.getSolverAbsoluteAccuracy();
        double double5 = fDistribution2.getNumericalMean();
        double double6 = fDistribution2.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution2.getNumericalMean();
        double double8 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0204081632653061d + "'", double5 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6177180781591378d + "'", double6 == 0.6177180781591378d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0204081632653061d + "'", double7 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6177180781591378d + "'", double8 == 0.6177180781591378d);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.5662656190788444d, 0.098126171830621d, 0.0d);
        double double5 = fDistribution4.getNumericalMean();
        boolean boolean6 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.25879486443701905d, 2.5231573301479715d);
        double double4 = uniformRealDistribution2.cumulativeProbability(0.9179281015876793d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.29108998542939063d + "'", double4 == 0.29108998542939063d);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean3 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double4 = uniformRealDistribution0.getNumericalMean();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double12 = fDistribution3.sample();
        fDistribution3.reseedRandomGenerator((long) (byte) 10);
        double double15 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
// flaky "111) test4892(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.736385054267191d + "'", double12 == 1.736385054267191d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6976067833842337d, 0.02741148573788177d, 0.12452611167231531d);
        double double4 = fDistribution3.calculateNumericalVariance();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double7 = fDistribution3.density(1.9080987582593552d);
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.00654590527825748d + "'", double7 == 0.00654590527825748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.02741148573788177d + "'", double8 == 0.02741148573788177d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.12452611167231531d + "'", double9 == 0.12452611167231531d);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution3.getNumericalVariance();
        double double7 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution3.getSupportLowerBound();
        boolean boolean9 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double10 = uniformRealDistribution3.getNumericalVariance();
        double double11 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05428794722368846d) + "'", double4 == (-0.05428794722368846d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2981237622554617d + "'", double6 == 0.2981237622554617d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2981237622554617d + "'", double10 == 0.2981237622554617d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean9 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "112) test4895(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.649266894510786d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        fDistribution3.reseedRandomGenerator(100L);
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double16 = fDistribution3.probability(0.8897164866495739d, 1.261273994954467d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "113) test4896(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.144444513818433d + "'", double9 == 2.144444513818433d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.282526890260278d + "'", double16 == 0.282526890260278d);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability((-1.0d), (double) 1L);
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.getNumericalVariance();
        double double10 = fDistribution3.inverseCumulativeProbability(0.6119517974962971d);
        double double11 = fDistribution3.getNumericalVariance();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double14 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5509385983974154d + "'", double6 == 0.5509385983974154d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8151769424272568d + "'", double10 == 0.8151769424272568d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0210526315789474d + "'", double14 == 1.0210526315789474d);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = uniformRealDistribution0.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6851772303251921d, 97.0d);
        double double3 = uniformRealDistribution2.getNumericalMean();
        double double5 = uniformRealDistribution2.cumulativeProbability(0.7757685011213045d);
        double double6 = uniformRealDistribution2.getNumericalMean();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 48.8425886151626d + "'", double3 == 48.8425886151626d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.40574547001456E-4d + "'", double5 == 9.40574547001456E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 48.8425886151626d + "'", double6 == 48.8425886151626d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6851772303251921d + "'", double7 == 0.6851772303251921d);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.830426489857576d, 0.6195653609603238d, 0.07870611855592978d);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.probability(0.25879486443701905d);
        boolean boolean10 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double11 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
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
        java.lang.Class<?> wildcardClass13 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "114) test4902(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7317090889379679d + "'", double9 == 0.7317090889379679d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.sample();
        double double12 = fDistribution3.probability(0.0d, 0.33499450848006207d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
// flaky "115) test4903(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.611364787110536d + "'", double9 == 0.611364787110536d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03049638628362134d + "'", double12 == 0.03049638628362134d);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.51253287801954d, 0.7459227016817964d, 0.567806681835231d);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6316235913295272d, 0.7432416673360078d, 0.4717780628973267d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double6 = fDistribution3.cumulativeProbability(0.21387320010949318d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7432416673360078d + "'", double4 == 0.7432416673360078d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.34930466246143926d + "'", double6 == 0.34930466246143926d);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, 0.7822785846661753d);
        double double3 = fDistribution2.sample();
        double double4 = fDistribution2.sample();
// flaky "116) test4906(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.220595714911636d + "'", double3 == 3.220595714911636d);
// flaky "32) test4906(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 33.792104501663424d + "'", double4 == 33.792104501663424d);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7387842926428161d, 0.9382068481430984d);
        double double3 = uniformRealDistribution2.getSupportUpperBound();
        double double5 = uniformRealDistribution2.density(0.9736694951866904d);
        boolean boolean6 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9382068481430984d + "'", double3 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8354713638140709d, 0.9966872852742321d, (double) 100.0f);
        boolean boolean5 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution4.density(0.0018820678494252396d);
        double double8 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.40974236358211136d, 0.22452645101192847d);
        double double4 = fDistribution2.density(2.6738380593704005d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.022068301673100532d + "'", double4 == 0.022068301673100532d);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.density(0.6338262572667233d);
        uniformRealDistribution0.reseedRandomGenerator((long) ' ');
        double double10 = uniformRealDistribution0.sample();
        double double11 = uniformRealDistribution0.getNumericalVariance();
        double double13 = uniformRealDistribution0.cumulativeProbability(0.26688068384750907d);
        double double15 = uniformRealDistribution0.inverseCumulativeProbability(0.5894641303675237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7685775863542659d + "'", double10 == 0.7685775863542659d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08333333333333333d + "'", double11 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.26688068384750907d + "'", double13 == 0.26688068384750907d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5894641303675237d + "'", double15 == 0.5894641303675237d);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        double double8 = uniformRealDistribution0.cumulativeProbability(0.7728822076911962d);
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        double double11 = uniformRealDistribution0.inverseCumulativeProbability(6.56513546905019E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "117) test4911(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6199079021850071d + "'", double4 == 0.6199079021850071d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7728822076911962d + "'", double8 == 0.7728822076911962d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.56513546905019E-4d + "'", double11 == 6.56513546905019E-4d);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.getNumericalMean();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double[] doubleArray10 = uniformRealDistribution0.sample((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "118) test4912(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3997235458300543d + "'", double3 == 0.3997235458300543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertNotNull(doubleArray10);
// flaky "33) test4912(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.7212954651117682d, 0.8531912804475128d, 0.6863424105156755d, 0.5323843050303074d, 0.454797303219151d, 0.3704857273554534d, 0.669163448835357d, 0.5420487477998166d, 0.2903118653839898d, 0.269708770734447d }, 1.0E-15);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability((double) (short) 100);
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double14 = fDistribution3.density(0.026171990764942643d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.460642221262963E-5d + "'", double14 == 6.460642221262963E-5d);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        double double11 = fDistribution3.getNumericalMean();
        boolean boolean12 = fDistribution3.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistribution3.probability(0.6167715285164661d, 0.19426603166379958d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.617) must be less than or equal to upper endpoint (0.194)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        uniformRealDistribution0.reseedRandomGenerator((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "119) test4915(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7041463935694405d + "'", double3 == 0.7041463935694405d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double13 = fDistribution3.getSolverAbsoluteAccuracy();
        double double14 = fDistribution3.sample();
        double double16 = fDistribution3.density(8982674.244580086d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
// flaky "120) test4916(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.8178585874834925d + "'", double14 == 1.8178585874834925d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.31274049084715E-290d + "'", double16 == 6.31274049084715E-290d);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7484518501737258d, 0.5424750230411775d, 0.7076179863744267d);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.08333333333333333d, 0.7537287967617665d, 0.11480653091901427d);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.9195016681888635d, 0.4231308355418002d);
        double double5 = fDistribution2.cumulativeProbability(0.3992657694288475d, 0.44175393622014125d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.010133180972899059d + "'", double5 == 0.010133180972899059d);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5831064787455089d, 1.449868410599931E16d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        boolean boolean4 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean5 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.449868410599931E16d + "'", double6 == 1.449868410599931E16d);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double6 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.871619588939206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "121) test4921(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.20297768659092696d + "'", double3 == 0.20297768659092696d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
// flaky "34) test4921(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8915595183151022d + "'", double6 == 0.8915595183151022d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.871619588939206d + "'", double8 == 0.871619588939206d);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double6 = uniformRealDistribution0.density((double) (-1L));
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double8 = fDistribution3.cumulativeProbability(10.0d);
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.sample();
        double double12 = fDistribution3.density(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999758308d + "'", double8 == 0.9999999999758308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
// flaky "122) test4923(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7184922746056246d + "'", double10 == 0.7184922746056246d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.4665103600554352d, 0.8200814708461368d, 0.4958888225265914d);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "123) test4925(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.613598655010563d + "'", double3 == 0.613598655010563d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) 0.0f, 3.5564389998236723d);
        double double3 = uniformRealDistribution2.sample();
        double double4 = uniformRealDistribution2.sample();
// flaky "124) test4926(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1872961899047023d + "'", double3 == 1.1872961899047023d);
// flaky "35) test4926(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9416867069841346d + "'", double4 == 0.9416867069841346d);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.1111885052970214d, 0.5320479682924733d, 0.13027298212537403d);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 2.5012322892596646d, 0.2566879201912793d, 0.22693576719907352d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.501) must be strictly less than upper bound (0.257)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 4.711194252818312E-227d, 0.3036689686928481d, 0.9216351637618685d);
        double double5 = uniformRealDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.15183448434642405d + "'", double5 == 0.15183448434642405d);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7387842926428161d, 0.9382068481430984d);
        double double3 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean4 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9382068481430984d + "'", double3 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 2.654819023133747d, (-0.596731289759838d), 0.0015698807116598047d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.655) must be strictly less than upper bound (-0.597)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.probability(0.5662656190788444d);
        boolean boolean10 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution2.probability(1.936120997106573d);
        double double14 = uniformRealDistribution2.cumulativeProbability(0.7948236153171645d);
        double double15 = uniformRealDistribution2.getNumericalMean();
        double double16 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double18 = uniformRealDistribution2.density(1.0540215299555669d);
        double double19 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-9d + "'", double16 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6155223357908637d, 0.7422678166643543d, 3.181009226124227E-44d);
        double double5 = fDistribution4.getSolverAbsoluteAccuracy();
        boolean boolean6 = fDistribution4.isSupportLowerBoundInclusive();
        boolean boolean7 = fDistribution4.isSupportConnected();
        double double9 = fDistribution4.inverseCumulativeProbability(0.7259043114813952d);
        double double11 = fDistribution4.density(0.7573235535633357d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.181009226124227E-44d + "'", double5 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 6.002920579670327d + "'", double9 == 6.002920579670327d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1569899190346438d + "'", double11 == 0.1569899190346438d);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.449868410599931E16d, 0.6155223357908637d);
        double double3 = fDistribution2.calculateNumericalVariance();
        boolean boolean4 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6313604496713228d, 4.711194252818312E-227d, 0.8300851989496363d);
        double double5 = fDistribution4.getSupportUpperBound();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.711194252818312E-227d + "'", double6 == 4.711194252818312E-227d);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7071737568021614d, 0.6977307745193061d, 0.27724879872690233d);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability((-1.0d), (double) 1L);
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5509385983974154d + "'", double6 == 0.5509385983974154d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        boolean boolean4 = uniformRealDistribution3.isSupportConnected();
        boolean boolean5 = uniformRealDistribution3.isSupportConnected();
        double double6 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean7 = uniformRealDistribution3.isSupportConnected();
        double double8 = uniformRealDistribution3.sample();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "125) test4938(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.3985584372827913d + "'", double8 == 1.3985584372827913d);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.49448191740329417d, 0.8914241055526231d, 0.3321070505100212d);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.cumulativeProbability(0.45346617159979785d);
        double double7 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5004359771645597d + "'", double6 == 0.5004359771645597d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.7446310292910352d, 0.03787689908483127d, 0.6894837474353891d);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.39036485303606727d, 0.5130999206316609d);
        double double4 = fDistribution2.cumulativeProbability(0.918767923989805d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5403914077892351d + "'", double4 == 0.5403914077892351d);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportUpperBound();
        double double6 = fDistribution3.density(0.9250689230908029d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8907793524463303d + "'", double6 == 0.8907793524463303d);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        double double5 = fDistribution3.getNumericalVariance();
        double double7 = fDistribution3.cumulativeProbability(0.7606013005402217d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.45658314454179505d + "'", double7 == 0.45658314454179505d);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(5.0d, 1.449868410599931E16d);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double4 = uniformRealDistribution0.density(10.0d);
        double double5 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.inverseCumulativeProbability(0.8527887362192998d);
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double10 = uniformRealDistribution0.inverseCumulativeProbability(0.6337093183317579d);
        double double11 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "126) test4946(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.47250839256572186d + "'", double5 == 0.47250839256572186d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8527887362192998d + "'", double7 == 0.8527887362192998d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6337093183317579d + "'", double10 == 0.6337093183317579d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double6 = uniformRealDistribution0.density((double) (-1L));
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.6615962937856623d);
        uniformRealDistribution0.reseedRandomGenerator((-1L));
        double double12 = uniformRealDistribution0.sample();
        boolean boolean13 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double15 = uniformRealDistribution0.density(2.2637267699648125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6615962937856623d + "'", double9 == 0.6615962937856623d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2395389662180223d + "'", double12 == 0.2395389662180223d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
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
        boolean boolean17 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.density(0.4116955788765788d);
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getSupportUpperBound();
        double double11 = fDistribution3.getSupportLowerBound();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        java.lang.Class<?> wildcardClass13 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4943610685878218d + "'", double8 == 0.4943610685878218d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100L, 0.3321070505100212d, 0.08333333333333333d);
        java.lang.Class<?> wildcardClass5 = fDistribution4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.8325228158963686d, 0.33846618022769354d);
        boolean boolean3 = fDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.4999014899032976d, 0.7627482092423561d, 2.92890095325051d);
        double double5 = fDistribution4.getNumericalMean();
        double double7 = fDistribution4.cumulativeProbability(0.2522324101367044d);
        double double8 = fDistribution4.getNumericalMean();
        double double9 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.42094847247917705d + "'", double7 == 0.42094847247917705d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double12 = fDistribution3.probability(6.006934970516585E-11d);
        double double13 = fDistribution3.getNumericalMean();
        boolean boolean14 = fDistribution3.isSupportConnected();
        double double16 = fDistribution3.probability(0.22241661777455723d);
        boolean boolean17 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.8374705046232109d, (double) 100.0f, 0.5608032501170599d);
        double double4 = fDistribution3.sample();
        double double7 = fDistribution3.probability(0.0d, 2.1869001723032184d);
// flaky "127) test4954(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.2452940061631854d + "'", double4 == 3.2452940061631854d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.855226144930539d + "'", double7 == 0.855226144930539d);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample(1);
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.density(0.15654489880175182d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "128) test4955(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06769353295268199d + "'", double3 == 0.06769353295268199d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "36) test4955(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.022163347679609258d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalMean();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.sample();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.cumulativeProbability(0.22537727742282923d);
        double[] doubleArray9 = uniformRealDistribution0.sample((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5d + "'", double2 == 0.5d);
// flaky "129) test4956(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8807121820581763d + "'", double3 == 0.8807121820581763d);
// flaky "37) test4956(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0941843060512828d + "'", double4 == 0.0941843060512828d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.22537727742282923d + "'", double7 == 0.22537727742282923d);
        org.junit.Assert.assertNotNull(doubleArray9);
// flaky "6) test4956(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.13817063063959734d }, 1.0E-15);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        double double10 = uniformRealDistribution0.density(0.4999014899032976d);
        double double11 = uniformRealDistribution0.getSupportLowerBound();
        double double12 = uniformRealDistribution0.getNumericalVariance();
        double double13 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean14 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08333333333333333d + "'", double12 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7387842926428161d, 0.9382068481430984d);
        double double3 = uniformRealDistribution2.getSupportUpperBound();
        double double5 = uniformRealDistribution2.density(0.8904061809109827d);
        double double6 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        boolean boolean7 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9382068481430984d + "'", double3 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0144779134503885d + "'", double5 == 5.0144779134503885d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution4.getSupportLowerBound();
        double double10 = fDistribution4.cumulativeProbability((double) (short) -1, 0.9999999999758308d);
        double double11 = fDistribution4.calculateNumericalVariance();
        double double12 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4999999999999701d + "'", double10 == 0.4999999999999701d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.004593672104456159d, 0.3108719420541892d);
        double double3 = fDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5190573322162404d, 0.7283674369075639d);
        double double3 = fDistribution2.getNumericalVariance();
        boolean boolean4 = fDistribution2.isSupportConnected();
        boolean boolean5 = fDistribution2.isSupportUpperBoundInclusive();
        double double6 = fDistribution2.getSolverAbsoluteAccuracy();
        double double8 = fDistribution2.density(0.9934442264303616d);
        double double9 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.11123873724724875d + "'", double8 == 0.11123873724724875d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        boolean boolean6 = fDistribution3.isSupportConnected();
        double double7 = fDistribution3.calculateNumericalVariance();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.density(0.6143579362044078d);
        double double10 = uniformRealDistribution0.inverseCumulativeProbability(0.5733968575051716d);
        boolean boolean11 = uniformRealDistribution0.isSupportConnected();
        double double12 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5733968575051716d + "'", double10 == 0.5733968575051716d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0012523652574455647d, 0.7941015035099954d, 1.7517653400463083E31d);
        double double6 = uniformRealDistribution4.inverseCumulativeProbability(0.679880178889932d);
        double double7 = uniformRealDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3976769343837205d + "'", double6 == 0.3976769343837205d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.052384146335650916d + "'", double7 == 0.052384146335650916d);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalMean();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.density(0.6188888698210222d);
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double10 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5d + "'", double2 == 0.5d);
// flaky "130) test4965(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6164903282186232d + "'", double3 == 0.6164903282186232d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double12 = fDistribution3.probability(6.006934970516585E-11d);
        double double13 = fDistribution3.getNumericalMean();
        boolean boolean14 = fDistribution3.isSupportConnected();
        boolean boolean15 = fDistribution3.isSupportConnected();
        double double16 = fDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistribution3.probability(0.3728694875041465d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.373) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double7 = fDistribution4.cumulativeProbability((double) (short) -1, 0.0d);
        boolean boolean8 = fDistribution4.isSupportConnected();
        boolean boolean9 = fDistribution4.isSupportUpperBoundInclusive();
        double double11 = fDistribution4.density(0.09351912098798598d);
        double double12 = fDistribution4.getSupportLowerBound();
        double double13 = fDistribution4.getSupportLowerBound();
        double double15 = fDistribution4.density(0.9378272073734135d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08230110552505629d + "'", double11 == 0.08230110552505629d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2564600856044862d + "'", double15 == 0.2564600856044862d);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.density(0.6314408575573036d);
        double double10 = uniformRealDistribution0.density(0.44169300486089313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.probability(0.5662656190788444d);
        boolean boolean10 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution2.probability(1.936120997106573d);
        double double13 = uniformRealDistribution2.sample();
        double double14 = uniformRealDistribution2.getSupportUpperBound();
        double double16 = uniformRealDistribution2.probability(0.38156436732833804d);
        double double18 = uniformRealDistribution2.cumulativeProbability(0.4131158655680684d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample(1);
        double double7 = uniformRealDistribution0.density((double) (-1));
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.getNumericalVariance();
        double double10 = uniformRealDistribution0.getNumericalMean();
        double double11 = uniformRealDistribution0.getNumericalVariance();
        double[] doubleArray13 = uniformRealDistribution0.sample((int) '#');
        double double15 = uniformRealDistribution0.cumulativeProbability(0.298844302724239d);
        uniformRealDistribution0.reseedRandomGenerator(1L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "131) test4970(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7080221297236964d + "'", double3 == 0.7080221297236964d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "38) test4970(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.08633287391055999d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08333333333333333d + "'", double11 == 0.08333333333333333d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.298844302724239d + "'", double15 == 0.298844302724239d);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7697294817344926d, 0.33464968633780273d, 0.695604531760929d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.77) must be strictly less than upper bound (0.335)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        double double5 = uniformRealDistribution2.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.704243793552324d, 36.22126828088923d, 0.6907167210019161d);
        double double5 = uniformRealDistribution3.cumulativeProbability(0.6824690303451446d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        boolean boolean7 = fDistribution4.isSupportLowerBoundInclusive();
        double double8 = fDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            fDistribution4.reseedRandomGenerator((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
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
        boolean boolean11 = uniformRealDistribution0.isSupportConnected();
        double double13 = uniformRealDistribution0.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "132) test4975(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.20368767726344172d + "'", double4 == 0.20368767726344172d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
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
        double double15 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "133) test4976(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6803724441237796d + "'", double9 == 0.6803724441237796d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23541417210258242d + "'", double15 == 0.23541417210258242d);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 100.0d, Double.POSITIVE_INFINITY, (double) (byte) 1);
        double double6 = uniformRealDistribution4.probability(2.3502599751932776d);
        boolean boolean7 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        boolean boolean8 = uniformRealDistribution4.isSupportConnected();
        double double9 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        boolean boolean10 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double11 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double8 = fDistribution3.cumulativeProbability(10.0d);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double10 = fDistribution3.calculateNumericalVariance();
        double double12 = fDistribution3.inverseCumulativeProbability(0.5873390868216388d);
        double double14 = fDistribution3.density(0.8914306597714141d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999758308d + "'", double8 == 0.9999999999758308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7999500154789846d + "'", double12 == 0.7999500154789846d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9101237038028394d + "'", double14 == 0.9101237038028394d);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.22501915578549436d, 0.7332274021713567d, 0.038031971893021384d);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double4 = fDistribution2.calculateNumericalVariance();
        boolean boolean5 = fDistribution2.isSupportLowerBoundInclusive();
        boolean boolean6 = fDistribution2.isSupportUpperBoundInclusive();
        double double8 = fDistribution2.inverseCumulativeProbability(0.7212115526834327d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0061865076408227E8d + "'", double8 == 1.0061865076408227E8d);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6167715285164661d, 0.625504238759457d, 0.8951247373711049d);
        double double6 = uniformRealDistribution4.inverseCumulativeProbability(0.7411051220588685d);
        boolean boolean7 = uniformRealDistribution4.isSupportConnected();
        boolean boolean8 = uniformRealDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6211378836379615d + "'", double6 == 0.6211378836379615d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.9959156710339114d, 0.23538825792940155d);
        boolean boolean3 = fDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (short) 1, 1.0210526315789474d, 0.7283674369075639d);
        boolean boolean4 = uniformRealDistribution3.isSupportConnected();
        double double5 = uniformRealDistribution3.sample();
        boolean boolean6 = uniformRealDistribution3.isSupportConnected();
        double double7 = uniformRealDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "134) test4983(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0151940472721175d + "'", double5 == 1.0151940472721175d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.density(1.449868410599931E16d);
        double double8 = uniformRealDistribution0.sample();
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double[] doubleArray11 = uniformRealDistribution0.sample((int) (byte) 100);
        double[] doubleArray13 = uniformRealDistribution0.sample(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "135) test4984(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8552375076828114d + "'", double3 == 0.8552375076828114d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "39) test4984(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.302428211993077d + "'", double8 == 0.302428211993077d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
// flaky "7) test4984(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.880588666864355d }, 1.0E-15);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double10 = uniformRealDistribution2.density((double) (short) 1);
        double double11 = uniformRealDistribution2.getNumericalMean();
        double double12 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double14 = uniformRealDistribution2.cumulativeProbability(0.1137932949955843d);
        boolean boolean15 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        java.lang.Class<?> wildcardClass16 = uniformRealDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        boolean boolean8 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean9 = uniformRealDistribution0.isSupportConnected();
        double double11 = uniformRealDistribution0.density(0.4401987088786399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "136) test4986(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9058679639867724d + "'", double4 == 0.9058679639867724d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6039787332279838d, 8.746758854452454E-5d, 0.544127331049072d);
        double double4 = fDistribution3.getSolverAbsoluteAccuracy();
        double double5 = fDistribution3.getNumericalVariance();
        double double7 = fDistribution3.inverseCumulativeProbability(0.6340720428499753d);
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.544127331049072d + "'", double4 == 0.544127331049072d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.8204475874507078E12d + "'", double7 == 1.8204475874507078E12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.746758854452454E-5d + "'", double8 == 8.746758854452454E-5d);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.density(0.4116955788765788d);
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getSupportUpperBound();
        double double12 = fDistribution3.probability(0.39731286652410236d);
        double double14 = fDistribution3.inverseCumulativeProbability(0.0848840914065987d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4943610685878218d + "'", double8 == 0.4943610685878218d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6414543161690349d, 0.8904354075111562d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = uniformRealDistribution2.cumulativeProbability(0.7674377636180676d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.767) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.density(0.1757939476207693d);
        double[] doubleArray9 = uniformRealDistribution0.sample(10);
        double double10 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
// flaky "137) test4990(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.7541636082632959d, 0.388201705258324d, 0.5442496178099545d, 0.09091426525309942d, 0.8633488699974441d, 0.9991309610196235d, 0.047584698295682015d, 0.18546256087777202d, 0.4271284349070663d, 0.19710848932972347d }, 1.0E-15);
// flaky "40) test4990(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8267564585332166d + "'", double10 == 0.8267564585332166d);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6360822263764419d, 0.3321070505100212d, 0.7537287967617665d);
        double double4 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7537287967617665d + "'", double4 == 0.7537287967617665d);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.getNumericalMean();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double5 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
// flaky "138) test4993(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4610358797287277d + "'", double5 == 0.4610358797287277d);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.getSolverAbsoluteAccuracy();
        double double10 = fDistribution3.cumulativeProbability(0.3904156731971007d);
        double double12 = fDistribution3.density(0.7350812309335475d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5509385983974154d + "'", double8 == 0.5509385983974154d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3555386900915117d + "'", double10 == 0.3555386900915117d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2139748095366307d + "'", double12 == 0.2139748095366307d);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.058309969785535314d, 1.25d);
        double double3 = fDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-9d + "'", double3 == 1.0E-9d);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.getNumericalVariance();
        double double11 = fDistribution3.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = fDistribution3.sample((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double6 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.cumulativeProbability(3.181009226124227E-44d);
        double double9 = uniformRealDistribution0.getNumericalMean();
        double double10 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double12 = uniformRealDistribution0.cumulativeProbability(0.0d);
        boolean boolean13 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double15 = uniformRealDistribution0.cumulativeProbability(5.800708876800225E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "139) test4997(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.05546332180296076d + "'", double3 == 0.05546332180296076d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
// flaky "41) test4997(org.apache.commons.math3.distribution.RegressionTest9)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5877949178649338d + "'", double6 == 0.5877949178649338d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.181009226124227E-44d + "'", double8 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-9d + "'", double10 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.800708876800225E-11d + "'", double15 == 5.800708876800225E-11d);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6766392398995167d, 0.6916856290446507d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        double double4 = fDistribution2.getSolverAbsoluteAccuracy();
        double double5 = fDistribution2.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) '4', 0.013231871953106862d);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 4.711194252818312E-227d, 0.3036689686928481d, 0.9216351637618685d);
        boolean boolean5 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution4.getNumericalMean();
        double double7 = uniformRealDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.15183448434642405d + "'", double6 == 0.15183448434642405d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3036689686928481d + "'", double7 == 0.3036689686928481d);
    }
}
