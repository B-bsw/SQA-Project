package org.apache.commons.math3.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        uniformRealDistribution0.reseedRandomGenerator((-1L));
        boolean boolean3 = uniformRealDistribution0.isSupportConnected();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.3108719420541892d, 0.20658800921437645d, 0.0d);
        boolean boolean4 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0d, 6.006934970516585E-11d, 6.006934970516585E-11d);
        boolean boolean5 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution4.probability(0.7418114744879037d, 0.9970061237457858d);
        boolean boolean9 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        boolean boolean10 = uniformRealDistribution4.isSupportConnected();
        double double11 = uniformRealDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.006934970516585E-11d + "'", double11 == 6.006934970516585E-11d);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(3.181009226124227E-44d, 0.07983844188212808d, 0.19565248788630019d);
        double double5 = uniformRealDistribution3.cumulativeProbability(0.8972526735022719d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.getSupportUpperBound();
        double double11 = fDistribution3.getNumericalVariance();
        double double12 = fDistribution3.sample();
        double double14 = fDistribution3.cumulativeProbability(0.01702895275902644d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
// flaky "1) test5005(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.7724379730220146d + "'", double12 == 2.7724379730220146d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.212855615109787E-8d + "'", double14 == 4.212855615109787E-8d);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, 0.7822785846661753d);
        fDistribution2.reseedRandomGenerator(10L);
        boolean boolean5 = fDistribution2.isSupportUpperBoundInclusive();
        double double6 = fDistribution2.sample();
        double double8 = fDistribution2.density(1.0210526315789474d);
        double double9 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double10 = fDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.72382496619487d + "'", double6 == 1.72382496619487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.20133437662577036d + "'", double8 == 0.20133437662577036d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7822785846661753d + "'", double9 == 0.7822785846661753d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.getSupportLowerBound();
        double double8 = fDistribution4.cumulativeProbability(0.8354713638140709d);
        double double11 = fDistribution4.cumulativeProbability(7.562099861400877E-28d, 0.6852677852739119d);
        double double12 = fDistribution4.getSolverAbsoluteAccuracy();
        double double14 = fDistribution4.cumulativeProbability((-0.3641291805958689d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.24594400506499925d + "'", double8 == 0.24594400506499925d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.21163544171934578d + "'", double11 == 0.21163544171934578d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5190573322162404d + "'", double12 == 0.5190573322162404d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double7 = fDistribution3.density(0.0d);
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean9 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator(10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.913601350735804d, 0.679880178889932d, 0.6456794250754441d);
        boolean boolean5 = fDistribution4.isSupportConnected();
        double double6 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.density(0.6407303729641209d);
        double double10 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.inverseCumulativeProbability(0.12452611167231531d);
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.getNumericalVariance();
        double[] doubleArray11 = uniformRealDistribution0.sample((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "2) test5011(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09431398528590407d + "'", double4 == 0.09431398528590407d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1245261116723153d + "'", double7 == 0.1245261116723153d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.41166628889519163d, 0.7411051220588685d, 0.0012889459524991036d);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.inverseCumulativeProbability(0.7244691810882917d);
        double double7 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.900644413604923d + "'", double6 == 3.900644413604923d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8354713638140709d, 0.9966872852742321d, (double) 100.0f);
        double double5 = uniformRealDistribution4.getNumericalMean();
        boolean boolean6 = uniformRealDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9160793245441515d + "'", double5 == 0.9160793245441515d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "3) test5014(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9597530092882545d + "'", double3 == 0.9597530092882545d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getNumericalMean();
        fDistribution3.reseedRandomGenerator((long) (byte) 1);
        fDistribution3.reseedRandomGenerator((long) (short) 1);
        java.lang.Class<?> wildcardClass14 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.7600449030773759d, 0.7087523712937718d, 0.627388726153098d);
        double double5 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.43958036910990383d, 0.913601350735804d, 0.4485518432850313d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
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
        double double18 = uniformRealDistribution2.cumulativeProbability(0.3841371098739632d);
        boolean boolean19 = uniformRealDistribution2.isSupportLowerBoundInclusive();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8254844533791657d, 0.5875468513897504d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.825) must be strictly less than upper bound (0.588)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
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
        double double18 = fDistribution3.calculateNumericalVariance();
        double double19 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0210526315789474d + "'", double12 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2230878854254442d + "'", double14 == 0.2230878854254442d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6480174446154539d + "'", double17 == 0.6480174446154539d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.23541417210258242d + "'", double18 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample(1);
        double double7 = uniformRealDistribution0.density((double) (-1));
        double double9 = uniformRealDistribution0.probability(0.1130006476062561d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "4) test5021(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4068063961797843d + "'", double3 == 0.4068063961797843d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "1) test5021(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.1654103562758431d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportLowerBound();
        double double5 = uniformRealDistribution0.getNumericalVariance();
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
// flaky "5) test5022(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5632981860444455d + "'", double8 == 0.5632981860444455d);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5551892552666533d, 0.08639864926419605d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.555) must be strictly less than upper bound (0.086)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
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
        double double14 = uniformRealDistribution0.density(0.946295937516457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "6) test5024(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.20097064516132535d + "'", double4 == 0.20097064516132535d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5872312916136835d + "'", double12 == 0.5872312916136835d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double8 = uniformRealDistribution0.density((double) 10.0f);
        double double9 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean10 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution0.density(0.8726330497066486d);
        boolean boolean13 = uniformRealDistribution0.isSupportConnected();
        double double14 = uniformRealDistribution0.getSupportLowerBound();
        double double15 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "7) test5025(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.9944199725755662d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.2781495492044994d, (double) 10, 0.679880178889932d);
        double[] doubleArray5 = uniformRealDistribution3.sample(1);
        boolean boolean6 = uniformRealDistribution3.isSupportConnected();
        double double7 = uniformRealDistribution3.getSupportLowerBound();
        double double10 = uniformRealDistribution3.cumulativeProbability(0.4869150344777853d, 0.7263227767959755d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "8) test5026(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 9.936860200642979d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2781495492044994d + "'", double7 == 0.2781495492044994d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.024625738024863404d + "'", double10 == 0.024625738024863404d);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.getSupportUpperBound();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 4.711194252818312E-227d, 0.3036689686928481d, 0.9216351637618685d);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        double double7 = uniformRealDistribution4.density(32.0d);
        double double9 = uniformRealDistribution4.cumulativeProbability(0.08529529275031239d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3036689686928481d + "'", double5 == 0.3036689686928481d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2808824790938253d + "'", double9 == 0.2808824790938253d);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        boolean boolean11 = fDistribution3.isSupportConnected();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        double double13 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7283674369075639d, (double) (byte) 1, 0.4999014899032976d);
        double double6 = uniformRealDistribution4.density(0.9736694951866904d);
        double double8 = uniformRealDistribution4.density(0.09093787185702049d);
        double double9 = uniformRealDistribution4.getNumericalMean();
        double double11 = uniformRealDistribution4.cumulativeProbability(0.4999999999999701d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.6814437437668386d + "'", double6 == 3.6814437437668386d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.864183718453782d + "'", double9 == 0.864183718453782d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
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
        double double15 = uniformRealDistribution0.density(0.3904156731971007d);
        double double16 = uniformRealDistribution0.getNumericalVariance();
        double double17 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "9) test5031(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.48804933031210673d + "'", double4 == 0.48804933031210673d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.08333333333333333d + "'", double16 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.0d, 0.643622493856715d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8848030244582112d, 2.411134735694189d, 0.4338807430773506d);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        double double11 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.getNumericalVariance();
        double double13 = fDistribution3.getNumericalVariance();
        boolean boolean14 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getNumericalMean();
        boolean boolean8 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double9 = uniformRealDistribution0.getNumericalVariance();
        uniformRealDistribution0.reseedRandomGenerator((long) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.8025566058551445d, 1.32902298689074125E18d, (double) (byte) 10);
        double double5 = fDistribution3.cumulativeProbability(0.4588294612046733d);
        double double7 = fDistribution3.cumulativeProbability(0.0d);
        double double9 = fDistribution3.cumulativeProbability(0.7020663693379212d);
        boolean boolean10 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0175369113648364E-7d + "'", double5 == 1.0175369113648364E-7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.296411206760982E-7d + "'", double9 == 1.296411206760982E-7d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
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
        fDistribution3.reseedRandomGenerator((long) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "10) test5037(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6443312514309298d + "'", double9 == 0.6443312514309298d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.181009226124227E-44d + "'", double15 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0210526315789474d + "'", double16 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5545067584200759d + "'", double19 == 0.5545067584200759d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6282061437518466d + "'", double21 == 0.6282061437518466d);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.48050135620469914d, 0.8303345768079637d);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7830480717937186d, 0.7411051220588685d, 5.769699484291669d);
        double double4 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.19565248788630019d, 0.43958036910990383d, 0.8374705046232109d);
        double double5 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double13 = fDistribution3.inverseCumulativeProbability(0.3379957971411982d);
        boolean boolean14 = fDistribution3.isSupportConnected();
        double double16 = fDistribution3.density(0.8300851989496363d);
        boolean boolean17 = fDistribution3.isSupportUpperBoundInclusive();
        double double18 = fDistribution3.calculateNumericalVariance();
        double[] doubleArray20 = fDistribution3.sample(1);
        double double22 = fDistribution3.density(0.8733954553258896d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6838714210807377d + "'", double13 == 0.6838714210807377d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.933700404958179d + "'", double16 == 0.933700404958179d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.23541417210258242d + "'", double18 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9187386512324918d + "'", double22 == 0.9187386512324918d);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.45346617159979785d, 0.1389594704450019d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.453) must be strictly less than upper bound (0.139)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double13 = fDistribution3.inverseCumulativeProbability(0.3379957971411982d);
        double double14 = fDistribution3.getNumericalMean();
        double double16 = fDistribution3.density(0.0d);
        double double17 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6838714210807377d + "'", double13 == 0.6838714210807377d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0210526315789474d + "'", double14 == 1.0210526315789474d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.cumulativeProbability(97.0d);
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double10 = uniformRealDistribution0.getSupportLowerBound();
        double double11 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
// flaky "11) test5044(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4886222482220597d + "'", double11 == 0.4886222482220597d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5698691107090974d, 0.00178043737201525d);
        double[] doubleArray4 = fDistribution2.sample((int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "12) test5045(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 3.08705731084905E13d }, 1.0E-15);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = uniformRealDistribution2.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.25879486443701905d, 0.2901069942670711d);
        double double3 = uniformRealDistribution2.sample();
        double double4 = uniformRealDistribution2.getSupportUpperBound();
// flaky "13) test5047(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.25890303125696446d + "'", double3 == 0.25890303125696446d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.2901069942670711d + "'", double4 == 0.2901069942670711d);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.390417015564424d, 0.8975366192170979d);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.042293209129396825d, 0.17954687407105752d);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.getSupportUpperBound();
        double double5 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.17954687407105752d + "'", double4 == 0.17954687407105752d);
// flaky "14) test5049(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14322374199363275d + "'", double5 == 0.14322374199363275d);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
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
        double double10 = uniformRealDistribution0.getNumericalMean();
        double double12 = uniformRealDistribution0.cumulativeProbability(0.1218622173844961d);
        double double13 = uniformRealDistribution0.getNumericalVariance();
        double double14 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "15) test5050(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8034787917680808d + "'", double4 == 0.8034787917680808d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1218622173844961d + "'", double12 == 0.1218622173844961d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.08333333333333333d + "'", double13 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
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
        double double17 = fDistribution3.getSupportUpperBound();
        double double18 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.23541417210258242d + "'", double18 == 0.23541417210258242d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.49884479899047296d, 0.6177180781591378d, 0.6167715285164661d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution3.sample();
        double double6 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6177180781591378d + "'", double4 == 0.6177180781591378d);
// flaky "16) test5052(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100L, 0.3321070505100212d, 0.08333333333333333d);
        double double7 = fDistribution4.cumulativeProbability((double) 'a', (double) 100);
        double double9 = fDistribution4.inverseCumulativeProbability((double) 0);
        boolean boolean10 = fDistribution4.isSupportConnected();
        double double12 = fDistribution4.probability(0.23125697402288498d);
        double double14 = fDistribution4.probability(2.3299766722229602d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0018820678494252396d + "'", double7 == 0.0018820678494252396d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.4116955788765788d, 1.0210526315789474d);
        boolean boolean3 = fDistribution2.isSupportLowerBoundInclusive();
        double double4 = fDistribution2.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double11 = fDistribution3.density(0.2844673552235235d);
        double double12 = fDistribution3.getSupportLowerBound();
        double double13 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.22185551807782616d + "'", double11 == 0.22185551807782616d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.sample();
        double double9 = uniformRealDistribution2.probability(0.07983844188212808d);
        double double10 = uniformRealDistribution2.sample();
        double double11 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.04147695370094584d, 0.6553695282217037d, 0.006628697802916972d);
        double double5 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getSupportLowerBound();
        double[] doubleArray5 = fDistribution2.sample((int) (byte) 1);
        double double6 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "17) test5058(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.857226372837664d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6975449779484513d + "'", double6 == 0.6975449779484513d);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.probability(0.6709045708448786d);
        double double7 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double10 = fDistribution3.density(0.648542752973224d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8821451630409058d + "'", double10 == 0.8821451630409058d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.449868410599931E16d, 0.6155223357908637d);
        double double3 = fDistribution2.calculateNumericalVariance();
        double double4 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double6 = fDistribution2.density(0.25516287436250606d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6155223357908637d + "'", double4 == 0.6155223357908637d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.617071349209947E-5d + "'", double6 == 1.617071349209947E-5d);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.41166628889519163d, 0.7411051220588685d, 0.0012889459524991036d);
        double double4 = fDistribution3.getSupportUpperBound();
        double double6 = fDistribution3.probability(4.034865821475621E14d);
        double double7 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.41166628889519163d + "'", double7 == 0.41166628889519163d);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.012944883901461868d, 0.6697212440760503d, 0.812268146222622d);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.012944883901461868d + "'", double4 == 0.012944883901461868d);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.getSupportUpperBound();
        fDistribution3.reseedRandomGenerator((long) (short) 0);
        boolean boolean13 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
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
        double double14 = uniformRealDistribution0.inverseCumulativeProbability(0.4774891705076061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "18) test5065(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4412592370122528d + "'", double3 == 0.4412592370122528d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
// flaky "2) test5065(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7258704374921634d + "'", double6 == 0.7258704374921634d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.181009226124227E-44d + "'", double8 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-9d + "'", double10 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4774891705076061d + "'", double14 == 0.4774891705076061d);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.39037743876434505d, 0.4231308355418002d);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
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
        double double22 = fDistribution3.probability(0.20920884693843428d, 0.4172486823910584d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = fDistribution3.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "19) test5067(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0885253569866924d + "'", double9 == 2.0885253569866924d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
// flaky "3) test5067(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.7081053866981287d + "'", double16 == 0.7081053866981287d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6715292022072981d + "'", double18 == 0.6715292022072981d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.059723962911940175d + "'", double22 == 0.059723962911940175d);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(2.051786173508851d, 0.6837424731385963d);
        double double3 = fDistribution2.getNumericalVariance();
        double double6 = fDistribution2.cumulativeProbability(0.6027888473505982d, 0.7288917033989706d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.029738831865848248d + "'", double6 == 0.029738831865848248d);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportConnected();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "20) test5069(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.852856382654199d + "'", double3 == 0.852856382654199d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
// flaky "4) test5069(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7976961576896846d + "'", double7 == 0.7976961576896846d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.cumulativeProbability((double) ' ');
        double double4 = uniformRealDistribution0.getNumericalMean();
        double double6 = uniformRealDistribution0.density(0.38156436732833804d);
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getNumericalMean();
        double double9 = fDistribution3.density((double) (-1.0f));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.cumulativeProbability((double) ' ');
        double double6 = uniformRealDistribution0.probability(1.9750054205197466E-9d, 0.7882516988592704d);
        double double7 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.788251696884265d + "'", double6 == 0.788251696884265d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        boolean boolean5 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.cumulativeProbability(100.0d);
        double double8 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double10 = uniformRealDistribution2.density(0.704243793552324d);
        boolean boolean11 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        boolean boolean12 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double13 = uniformRealDistribution2.getSupportLowerBound();
        boolean boolean14 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double16 = uniformRealDistribution2.probability(0.5325974572914092d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        double double9 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "21) test5075(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.44486825468200375d + "'", double4 == 0.44486825468200375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "5) test5075(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6184517891420671d + "'", double9 == 0.6184517891420671d);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double4 = uniformRealDistribution0.density(10.0d);
        double double6 = uniformRealDistribution0.density(0.10532175426309509d);
        double double7 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3981977572581923d, 0.595906678664889d, (double) 0);
        double double6 = uniformRealDistribution3.probability(0.002286228709268653d, 4.9110474784094365d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8465099057706973d, (double) 'a', 16.97758172302296d);
        double double5 = uniformRealDistribution4.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8465099057706973d + "'", double5 == 0.8465099057706973d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability((-1.0d), (double) 1L);
        double double8 = fDistribution3.probability(1.0204081632653061d);
        double double9 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5509385983974154d + "'", double6 == 0.5509385983974154d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.getNumericalMean();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double13 = fDistribution3.density(0.4311546417502141d);
        double double14 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.536539194973792d + "'", double13 == 0.536539194973792d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0210526315789474d + "'", double14 == 1.0210526315789474d);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.60375024767613d, 0.19712348400404045d);
        double double4 = uniformRealDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.030376196797415687d + "'", double4 == 0.030376196797415687d);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
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
        double[] doubleArray13 = uniformRealDistribution0.sample((int) (byte) 1);
        double double14 = uniformRealDistribution0.getNumericalVariance();
        double double16 = uniformRealDistribution0.density(0.8816817792661849d);
        boolean boolean17 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "22) test5082(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9686027834200939d + "'", double4 == 0.9686027834200939d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "6) test5082(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.25688715927364547d + "'", double8 == 0.25688715927364547d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9028380243284497d + "'", double11 == 0.9028380243284497d);
        org.junit.Assert.assertNotNull(doubleArray13);
// flaky "1) test5082(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.5911116974708608d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08333333333333333d + "'", double14 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.2901069942670711d, 0.5593412801291973d, 0.7459534932505263d);
        boolean boolean5 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.cumulativeProbability(0.6589704682272606d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.24054818510738393d + "'", double9 == 0.24054818510738393d);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        double double10 = uniformRealDistribution0.probability(0.913601350735804d, 97.0d);
        double double12 = uniformRealDistribution0.density(0.544127331049072d);
        double[] doubleArray14 = uniformRealDistribution0.sample((int) (short) 10);
        double double17 = uniformRealDistribution0.cumulativeProbability(0.6770685405632006d, 0.7227889983740416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08639864926419605d + "'", double10 == 0.08639864926419605d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
// flaky "23) test5085(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.11753644857235601d, 0.1472874089064704d, 0.24520350329724105d, 0.2986869992793588d, 0.711372396798378d, 0.6990818856842309d, 0.8709454755828085d, 0.5070105521398043d, 0.39184799544810645d, 0.30008822259805923d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.045720457810841d + "'", double17 == 0.045720457810841d);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        double double3 = fDistribution2.getSupportLowerBound();
        double double5 = fDistribution2.cumulativeProbability(0.933517426050187d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.710489449764736d + "'", double5 == 0.710489449764736d);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double3 = uniformRealDistribution2.getNumericalMean();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution2.probability(0.13626796513381678d, 0.48029783022186145d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5190573322162404d, 0.7283674369075639d);
        double double3 = fDistribution2.getNumericalVariance();
        boolean boolean4 = fDistribution2.isSupportConnected();
        boolean boolean5 = fDistribution2.isSupportUpperBoundInclusive();
        double double6 = fDistribution2.calculateNumericalVariance();
        boolean boolean7 = fDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6816887241831449d, 0.3345405209207237d);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.inverseCumulativeProbability(0.4116955788765788d);
        double double9 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "24) test5090(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.42850285000008315d + "'", double3 == 0.42850285000008315d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4116955788765788d + "'", double8 == 0.4116955788765788d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
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
        double double14 = fDistribution3.getSupportLowerBound();
        boolean boolean15 = fDistribution3.isSupportUpperBoundInclusive();
        double double16 = fDistribution3.calculateNumericalVariance();
        double double17 = fDistribution3.getNumericalMean();
        double double19 = fDistribution3.cumulativeProbability(0.7947738245649854d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "25) test5091(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.890312416208282d + "'", double9 == 1.890312416208282d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0210526315789474d + "'", double17 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.366153581584458d + "'", double19 == 0.366153581584458d);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.cumulativeProbability((double) ' ');
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.probability(7.562099861400877E-28d);
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7810395258119183d, 0.04127273732944947d, 0.2395389662180223d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.04127273732944947d + "'", double4 == 0.04127273732944947d);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.2498084177968785d, 250.839785026644d, 3.4437575770133724d);
        double double4 = uniformRealDistribution3.sample();
// flaky "26) test5094(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 189.8626891389199d + "'", double4 == 189.8626891389199d);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
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
        double double18 = fDistribution3.cumulativeProbability(0.6281795029389632d);
        double double19 = fDistribution3.getSolverAbsoluteAccuracy();
        double double22 = fDistribution3.probability(0.0d, 3.5830317679687487d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
// flaky "27) test5095(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6288743925592781d + "'", double14 == 0.6288743925592781d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.21353203124858727d + "'", double18 == 0.21353203124858727d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9995516635095809d + "'", double22 == 0.9995516635095809d);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8904061809109827d, (double) (-1L), 0.877193613464953d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.89) must be strictly less than upper bound (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.sample();
        double double9 = uniformRealDistribution0.getNumericalVariance();
        double double11 = uniformRealDistribution0.density(0.43958036910990383d);
        boolean boolean12 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "28) test5097(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5093454577414087d + "'", double4 == 0.5093454577414087d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "7) test5097(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.055756793948354755d + "'", double8 == 0.055756793948354755d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.14946491011234958d, 5.4938856867525854E-11d);
        double double3 = fDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.39063183347997144d, 0.1762832947139219d, 0.7829735042683095d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.391) must be strictly less than upper bound (0.176)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double12 = fDistribution3.probability(6.006934970516585E-11d);
        double double13 = fDistribution3.getNumericalMean();
        boolean boolean14 = fDistribution3.isSupportConnected();
        double double15 = fDistribution3.getSolverAbsoluteAccuracy();
        double double16 = fDistribution3.getSupportUpperBound();
        boolean boolean17 = fDistribution3.isSupportLowerBoundInclusive();
        double double18 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        double double8 = uniformRealDistribution0.sample();
        double double10 = uniformRealDistribution0.density(0.317235538240356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "29) test5101(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.33527080493630357d + "'", double8 == 0.33527080493630357d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double11 = fDistribution3.density(0.8414531941129211d);
        double double12 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "30) test5102(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6834670467487184d + "'", double7 == 0.6834670467487184d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9306076905011386d + "'", double11 == 0.9306076905011386d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.933517426050187d, 0.6179657774208087d, 0.7827999548078398d);
        double double6 = fDistribution3.probability(0.010322138824075844d, 0.21317729653381168d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1885882597715951d + "'", double6 == 0.1885882597715951d);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.7411051220588685d, 0.40380672722754185d);
        double double3 = fDistribution2.getNumericalVariance();
        double double4 = fDistribution2.getSupportUpperBound();
        java.lang.Class<?> wildcardClass5 = fDistribution2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.3527591133882273d, 2.0611928590791497d, 0.8177860947390555d);
        double double4 = fDistribution3.calculateNumericalVariance();
        double double7 = fDistribution3.probability(0.6007038962578557d, 0.7212539665163964d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.019441104103289253d + "'", double7 == 0.019441104103289253d);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 7.562099861400877E-28d, 0.9280868261112525d, 0.6089308656102914d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double7 = fDistribution4.density(0.6254849662761371d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.044989303597743E-28d + "'", double7 == 6.044989303597743E-28d);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.density(97.0d);
        double double10 = fDistribution3.getSupportLowerBound();
        fDistribution3.reseedRandomGenerator((long) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.7171475092674E-46d + "'", double9 == 2.7171475092674E-46d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        boolean boolean6 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.cumulativeProbability(1.0E-9d);
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        fDistribution3.reseedRandomGenerator((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.181009226124227E-44d + "'", double8 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7490068016138842d, 0.6449277568530984d, 0.26637048650274964d);
        double double6 = fDistribution3.cumulativeProbability(0.24882272555718465d, 0.6865266055049353d);
        double double7 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11545891732278457d + "'", double6 == 0.11545891732278457d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.getSupportLowerBound();
        double double8 = fDistribution4.cumulativeProbability(0.8354713638140709d);
        // The following exception was thrown during execution in test generation
        try {
            fDistribution4.reseedRandomGenerator((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.24594400506499925d + "'", double8 == 0.24594400506499925d);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.913601350735804d, 0.7883955810914687d, 0.5190573322162404d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.density(0.625504238759457d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.22098387218859405d + "'", double6 == 0.22098387218859405d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5190573322162404d + "'", double7 == 0.5190573322162404d);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 1, 0.5509385983974154d, 1.0d);
        double double6 = fDistribution4.probability(0.6832887004995629d);
        double double7 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean7 = uniformRealDistribution2.isSupportConnected();
        double double8 = uniformRealDistribution2.sample();
        double double9 = uniformRealDistribution2.getSupportLowerBound();
        double double11 = uniformRealDistribution2.density(0.6081706888281555d);
        double double12 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.probability(0.19565248788630019d);
        double double9 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky "31) test5114(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7190394909098787d + "'", double9 == 0.7190394909098787d);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double5 = uniformRealDistribution0.inverseCumulativeProbability(0.544127331049072d);
        double double6 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.8590663588185146d);
        uniformRealDistribution0.reseedRandomGenerator((long) 1);
        double double11 = uniformRealDistribution0.sample();
        double double12 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.544127331049072d + "'", double5 == 0.544127331049072d);
// flaky "32) test5116(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9915280982544108d + "'", double6 == 0.9915280982544108d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8590663588185146d + "'", double8 == 0.8590663588185146d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.07277703352123166d + "'", double11 == 0.07277703352123166d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.33499450848006207d + "'", double12 == 0.33499450848006207d);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.2035572430781889d, 0.562847836339432d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "33) test5117(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5617424465734508d + "'", double4 == 0.5617424465734508d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.2737809697987744d, 0.0d, 0.011568649007604792d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6121227109766438d, 2.3125942498560286d);
        double[] doubleArray4 = fDistribution2.sample((int) ' ');
        double double5 = fDistribution2.getSupportLowerBound();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        boolean boolean6 = fDistribution3.isSupportConnected();
        double double7 = fDistribution3.getSupportUpperBound();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.cumulativeProbability(0.7807513818541891d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3529808983612997d + "'", double11 == 0.3529808983612997d);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3032294630012422d, 0.9382068481430984d, 0.3728694875041465d);
        double double4 = uniformRealDistribution3.getSupportUpperBound();
        double double6 = uniformRealDistribution3.cumulativeProbability(0.0d);
        boolean boolean7 = uniformRealDistribution3.isSupportConnected();
        double double8 = uniformRealDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9382068481430984d + "'", double4 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "34) test5121(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.34732282855540936d + "'", double8 == 0.34732282855540936d);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6188888698210222d, 0.480841375333061d);
        double double3 = fDistribution2.sample();
// flaky "35) test5122(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0062421417428672205d + "'", double3 == 0.0062421417428672205d);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.0E-9d, 0.04893856709334523d, 0.33846618022769354d);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double4 = fDistribution2.calculateNumericalVariance();
        boolean boolean5 = fDistribution2.isSupportLowerBoundInclusive();
        boolean boolean6 = fDistribution2.isSupportLowerBoundInclusive();
        boolean boolean7 = fDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.probability(0.6541717467536889d);
        double double8 = uniformRealDistribution0.getNumericalVariance();
        double double9 = uniformRealDistribution0.getNumericalMean();
        double double11 = uniformRealDistribution0.cumulativeProbability(1.8213189406315786d);
        double double13 = uniformRealDistribution0.cumulativeProbability(0.0d);
        double double14 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08333333333333333d + "'", double8 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample(1);
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "36) test5126(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3735802363925025d + "'", double3 == 0.3735802363925025d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "8) test5126(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.9218957366437119d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "2) test5126(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.124977092732238d + "'", double7 == 0.124977092732238d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.cumulativeProbability((double) 1L, (double) 10L);
        double double10 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator(100L);
        double double14 = fDistribution3.density(0.5699327254728336d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44906140157841534d + "'", double9 == 0.44906140157841534d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.791134943014311d + "'", double14 == 0.791134943014311d);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.calculateNumericalVariance();
        fDistribution3.reseedRandomGenerator((long) 0);
        double double14 = fDistribution3.getSupportLowerBound();
        boolean boolean15 = fDistribution3.isSupportLowerBoundInclusive();
        double double17 = fDistribution3.inverseCumulativeProbability(0.812268146222622d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.0302986131939678d + "'", double17 == 2.0302986131939678d);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3479361879640319d, 0.11418533370616912d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.348) must be strictly less than upper bound (0.114)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.1882454026529332d, 0.048774300295801876d, 0.15450293306333454d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.188) must be strictly less than upper bound (0.049)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.23002546693928694d, 0.2058158643035921d, 0.6209274159326524d);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        uniformRealDistribution0.reseedRandomGenerator((long) (byte) 1);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.probability(10.0d);
        double double12 = fDistribution3.getSupportUpperBound();
        double double13 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double15 = fDistribution3.density(0.6311055222038046d);
        double double18 = fDistribution3.probability(0.3225830759745576d, 1.8283381690459866d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8657190518917495d + "'", double15 == 0.8657190518917495d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9078909266808725d + "'", double18 == 0.9078909266808725d);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.5936282416095029d, 0.03837388900144334d, 6.646664487355363E-4d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.594) must be strictly less than upper bound (0.038)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.24594400506499925d, 10.0d, 0.3801629465009775d);
        double double4 = fDistribution3.getNumericalMean();
        double double5 = fDistribution3.getSupportUpperBound();
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.density(0.6706598233490622d);
        double double9 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.25d + "'", double4 == 1.25d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.13018714436235257d + "'", double8 == 0.13018714436235257d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 17.462358968672483d + "'", double9 == 17.462358968672483d);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.21115975458905756d, 0.2469344302725767d);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.7810395258119183d, 0.04127273732944947d, 0.2395389662180223d);
        double double5 = fDistribution3.cumulativeProbability(0.15073071950739525d);
        double double6 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.06332530305023709d + "'", double5 == 0.06332530305023709d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        double double6 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.cumulativeProbability(32.0d);
        double double9 = fDistribution3.sample();
        double double11 = fDistribution3.probability(0.36915534168671216d);
        double double14 = fDistribution3.probability(0.7170454493956306d, 0.9252881559833075d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0210526315789474d + "'", double6 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
// flaky "37) test5138(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7422394405283628d + "'", double9 == 0.7422394405283628d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.19295166550570558d + "'", double14 == 0.19295166550570558d);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double8 = uniformRealDistribution0.density((double) 10.0f);
        double double10 = uniformRealDistribution0.density(0.7805153048133248d);
        double double12 = uniformRealDistribution0.density(0.47814664569296167d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "38) test5139(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.06644293345256402d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean9 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray11 = uniformRealDistribution2.sample((int) (byte) 100);
        double double12 = uniformRealDistribution2.sample();
        java.lang.Class<?> wildcardClass13 = uniformRealDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.cumulativeProbability(0.08333333333333333d);
        fDistribution3.reseedRandomGenerator((long) (short) 0);
        double double12 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.746758854452454E-5d + "'", double9 == 8.746758854452454E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0210526315789474d + "'", double12 == 1.0210526315789474d);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.05815067890837344d, 0.6140485448030906d, 0.17805249610135543d);
        boolean boolean5 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean7 = uniformRealDistribution2.isSupportConnected();
        double double8 = uniformRealDistribution2.getSupportLowerBound();
        boolean boolean9 = uniformRealDistribution2.isSupportConnected();
        double double10 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
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
        boolean boolean11 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "39) test5144(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8111412092559056d + "'", double4 == 0.8111412092559056d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
// flaky "9) test5144(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.17319698582137022d + "'", double9 == 0.17319698582137022d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportLowerBoundInclusive();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getSupportLowerBound();
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) 10.0f, (double) 100L, 0.6913920068547128d);
        double double5 = uniformRealDistribution4.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.13018714436235257d, 0.058309969785535314d);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.13018714436235257d + "'", double3 == 0.13018714436235257d);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5077136282506678d, 0.9145142661439758d, 3.1936744923232383d);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability(0.26279270621356643d);
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.012344840083442792d + "'", double10 == 0.012344840083442792d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.49979629720198526d, 0.7432416673360078d, 0.258160235749888d);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 41.786828736262095d, 0.4590295860592326d, 0.1882454026529332d);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6360822263764419d, 0.4329268118812597d, 0.27979062919809317d);
        boolean boolean5 = fDistribution4.isSupportUpperBoundInclusive();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution4.density(3.4437575770133724d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6360822263764419d + "'", double6 == 0.6360822263764419d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025955333213943745d + "'", double8 == 0.025955333213943745d);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6165883168253368d, 0.6816887241831449d, 0.7632418667352883d);
        double double5 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean3 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution4.density(0.9382068481430984d);
        double double9 = fDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0012889459524991036d + "'", double8 == 0.0012889459524991036d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double[] doubleArray9 = fDistribution3.sample((int) '4');
        double double10 = fDistribution3.calculateNumericalVariance();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getNumericalVariance();
        double double13 = fDistribution3.sample();
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
// flaky "40) test5156(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7045618640153075d + "'", double13 == 0.7045618640153075d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.7411051220588685d, 0.40380672722754185d);
        double double3 = fDistribution2.getNumericalVariance();
        double double4 = fDistribution2.getSupportUpperBound();
        double double5 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7411051220588685d + "'", double5 == 0.7411051220588685d);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(4.711194252818312E-227d, 2.1467508108064894d, 0.7087523712937718d);
        boolean boolean4 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6684474749999711d, 0.7248894904591263d);
        double double4 = uniformRealDistribution2.density(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.2874496152496877d, 0.323583325827407d, 0.6553695282217037d);
        double double6 = uniformRealDistribution4.density(0.8034787917680808d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(4.711194252818312E-227d, 2.1467508108064894d, 0.7087523712937718d);
        double double5 = uniformRealDistribution3.density(0.0d);
        double double6 = uniformRealDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0733754054032447d + "'", double6 == 1.0733754054032447d);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.5397993639605845d);
        double double11 = uniformRealDistribution0.cumulativeProbability(1.449868410599931E16d);
        double double12 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "41) test5162(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.28989962560395055d + "'", double4 == 0.28989962560395055d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5397993639605845d + "'", double9 == 0.5397993639605845d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
// flaky "10) test5162(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.20612257718029725d + "'", double12 == 0.20612257718029725d);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double8 = uniformRealDistribution0.density((double) 10.0f);
        double double9 = uniformRealDistribution0.getNumericalVariance();
        double double11 = uniformRealDistribution0.inverseCumulativeProbability(0.6313604496713228d);
        double double12 = uniformRealDistribution0.sample();
        double double13 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "42) test5163(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.7786692982570769d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6313604496713228d + "'", double11 == 0.6313604496713228d);
// flaky "11) test5163(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5584062788601734d + "'", double12 == 0.5584062788601734d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.08333333333333333d + "'", double13 == 0.08333333333333333d);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6820382013139239d, 0.11545891732278457d);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.18492953837985415d, 3.536035465836704d, 0.3787216382916044d);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.0d, 0.544127331049072d, 0.0d);
        double double6 = fDistribution4.cumulativeProbability(0.25d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2496427834706462d + "'", double6 == 0.2496427834706462d);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.density(0.9999999999758308d);
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double10 = uniformRealDistribution0.getNumericalMean();
        uniformRealDistribution0.reseedRandomGenerator((long) (short) 10);
        double double13 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "43) test5167(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8052731461754421d + "'", double4 == 0.8052731461754421d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.9983131433793901d, 0.4719281199749503d);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.probability(0.2230878854254442d);
        double double8 = uniformRealDistribution0.density(0.0d);
        double double9 = uniformRealDistribution0.sample();
        uniformRealDistribution0.reseedRandomGenerator(1L);
        double double12 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double14 = uniformRealDistribution0.cumulativeProbability(0.7504349380869012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
// flaky "44) test5169(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6431410214435767d + "'", double9 == 0.6431410214435767d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7504349380869012d + "'", double14 == 0.7504349380869012d);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double11 = fDistribution3.cumulativeProbability(0.6957245310498591d);
        double double12 = fDistribution3.getSupportLowerBound();
        double double14 = fDistribution3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2737809697987744d + "'", double11 == 0.2737809697987744d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution0.sample();
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "45) test5171(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08139590207074354d + "'", double4 == 0.08139590207074354d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "12) test5171(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4694854584999355d + "'", double6 == 0.4694854584999355d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.49884479899047296d, 0.6177180781591378d, 0.6167715285164661d);
        double double4 = fDistribution3.getSupportUpperBound();
        double[] doubleArray6 = fDistribution3.sample(1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray6);
// flaky "46) test5172(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 448.69598497501926d }, 1.0E-15);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.sample();
        double double9 = uniformRealDistribution2.getSupportUpperBound();
        double double10 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getNumericalVariance();
        double double8 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.41166628889519163d, 0.7411051220588685d, 0.0012889459524991036d);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.41166628889519163d + "'", double4 == 0.41166628889519163d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7411051220588685d + "'", double5 == 0.7411051220588685d);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(12.52529453764116d, 0.8164209647035208d, 0.17723898358627965d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (12.525) must be strictly less than upper bound (0.816)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        boolean boolean10 = fDistribution3.isSupportUpperBoundInclusive();
        double double11 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.8733954553258896d, 0.098126171830621d);
        boolean boolean4 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution3.getSupportLowerBound();
        double double6 = uniformRealDistribution3.getNumericalMean();
        double double7 = uniformRealDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4366977276629448d + "'", double6 == 0.4366977276629448d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4366977276629448d + "'", double7 == 0.4366977276629448d);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator(100L);
        double double14 = fDistribution3.probability(0.10082734793776749d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean13 = fDistribution3.isSupportConnected();
        double double14 = fDistribution3.calculateNumericalVariance();
        fDistribution3.reseedRandomGenerator((long) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "47) test5180(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6054975514438892d + "'", double9 == 0.6054975514438892d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.6971549552183045d, 0.9754387177260426d);
        double double12 = uniformRealDistribution0.probability(0.29031912847631514d, 1.9941381926271031d);
        boolean boolean13 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2782837625077381d + "'", double9 == 0.2782837625077381d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7096808715236849d + "'", double12 == 0.7096808715236849d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        boolean boolean6 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.cumulativeProbability(1.0E-9d);
        double double9 = fDistribution3.getSupportLowerBound();
        java.lang.Class<?> wildcardClass10 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.181009226124227E-44d + "'", double8 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double9 = fDistribution3.probability(0.004853457297448672d, 0.5662656190788444d);
        double double10 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double13 = fDistribution3.cumulativeProbability(0.0d);
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        double double16 = fDistribution3.density(3.746475778452671E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1623586333720101d + "'", double9 == 0.1623586333720101d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.127009944433622E-12d + "'", double16 == 3.127009944433622E-12d);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution4.inverseCumulativeProbability(0.8460138802083401d);
        double double10 = fDistribution4.density(3.900644413604923d);
        double double12 = fDistribution4.cumulativeProbability(0.2540859158139531d);
        double double13 = fDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.449868410599931E16d + "'", double8 == 1.449868410599931E16d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.097016117026311E-4d + "'", double10 == 3.097016117026311E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.49834375922711294d + "'", double12 == 0.49834375922711294d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.8733954553258896d, 0.098126171830621d);
        boolean boolean4 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution3.getSupportLowerBound();
        double double7 = uniformRealDistribution3.probability(1.8917609619429339d);
        double double8 = uniformRealDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "48) test5186(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.928044241087024d + "'", double3 == 0.928044241087024d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
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
        double double15 = uniformRealDistribution2.getSupportUpperBound();
        double double16 = uniformRealDistribution2.getNumericalMean();
        double double17 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-9d + "'", double17 == 1.0E-9d);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getNumericalVariance();
        double double10 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.22157929090626016d, 0.13626796513381678d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.222) must be strictly less than upper bound (0.136)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.0d);
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        double double11 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean12 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double13 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double14 = uniformRealDistribution0.getSupportUpperBound();
        double double15 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08333333333333333d + "'", double11 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-9d + "'", double13 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.sample();
        double double9 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.sample();
        double double12 = fDistribution3.inverseCumulativeProbability(0.04726269353868018d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "49) test5191(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6001765270355408d + "'", double8 == 0.6001765270355408d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
// flaky "13) test5191(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.3265800454339196d + "'", double10 == 3.3265800454339196d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) 10.0f, (double) 100L, 0.6913920068547128d);
        double double5 = uniformRealDistribution4.getSupportLowerBound();
        double double7 = uniformRealDistribution4.inverseCumulativeProbability(0.9546340580933452d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 95.91706522840107d + "'", double7 == 95.91706522840107d);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        boolean boolean6 = fDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        double double12 = fDistribution3.density(0.005949830804446096d);
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.9288831817318313E-7d + "'", double12 == 1.9288831817318313E-7d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportConnected();
        double[] doubleArray9 = fDistribution3.sample((int) 'a');
        double double10 = fDistribution3.getSolverAbsoluteAccuracy();
        double double12 = fDistribution3.probability(0.559025207971324d);
        boolean boolean13 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability((double) (short) 100);
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean13 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        double double12 = fDistribution3.density(0.005949830804446096d);
        double double14 = fDistribution3.density(0.7082685265949001d);
        double double15 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.9288831817318313E-7d + "'", double12 == 1.9288831817318313E-7d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9222854825093614d + "'", double14 == 0.9222854825093614d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        boolean boolean5 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double4 = fDistribution2.calculateNumericalVariance();
        boolean boolean5 = fDistribution2.isSupportLowerBoundInclusive();
        double double6 = fDistribution2.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "50) test5200(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.5002753397693785E13d + "'", double6 == 1.5002753397693785E13d);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.4485770812615808d, 0.6917725062323477d, 0.0d);
        double double5 = uniformRealDistribution3.inverseCumulativeProbability(0.4068063961797843d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5475105356613496d + "'", double5 == 0.5475105356613496d);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.31063568532805386d, 0.033199230956213494d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.311) must be strictly less than upper bound (0.033)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.0574082983787807d, 0.3529808983612997d, 0.8341171509493481d);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean3 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "51) test5205(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7531793935509496d + "'", double3 == 0.7531793935509496d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.14955185260243375d, 0.6664152020234054d, 36.22126828088923d);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.17723898358627965d);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.11176895247131485d, 1.8525180209923628d, 0.0d);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 2.713869027440155d, 0.5081868679022634d);
        double double4 = uniformRealDistribution3.sample();
        double double5 = uniformRealDistribution3.getNumericalMean();
// flaky "52) test5209(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.2638210540826423d + "'", double4 == 0.2638210540826423d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.3569345137200775d + "'", double5 == 1.3569345137200775d);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.7938684212191616d, 0.5325974572914092d, (-1.0d));
        double double5 = fDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.14670950794053475d, 0.7769021335961291d);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 2.713869027440155d, 0.5081868679022634d);
        double double4 = uniformRealDistribution3.sample();
        double double5 = uniformRealDistribution3.getSupportUpperBound();
// flaky "53) test5212(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.9168178307051107d + "'", double4 == 1.9168178307051107d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.713869027440155d + "'", double5 == 2.713869027440155d);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double11 = fDistribution3.cumulativeProbability(0.6957245310498591d);
        double double12 = fDistribution3.getSupportLowerBound();
        double double13 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2737809697987744d + "'", double11 == 0.2737809697987744d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.cumulativeProbability(0.8300851989496363d);
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8300851989496363d + "'", double7 == 0.8300851989496363d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double6 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "54) test5215(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7573681406299826d + "'", double3 == 0.7573681406299826d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
// flaky "14) test5215(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7066415460114104d + "'", double6 == 0.7066415460114104d);
// flaky "3) test5215(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5036096117682898d + "'", double7 == 0.5036096117682898d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double13 = fDistribution3.probability(0.3702234039813894d);
        double double15 = fDistribution3.cumulativeProbability(0.7882516988592704d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3600272574332486d + "'", double15 == 0.3600272574332486d);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double[] doubleArray9 = fDistribution3.sample((int) (byte) 10);
        double double10 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double12 = fDistribution3.cumulativeProbability((double) (short) 100);
        double double13 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean14 = fDistribution3.isSupportLowerBoundInclusive();
        double double16 = fDistribution3.density(0.5898144316393826d);
        double double18 = fDistribution3.cumulativeProbability(0.7163545031354256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
// flaky "55) test5217(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.5926834729674603d, 0.7772805200071944d, 1.8973548226706347d, 2.4147818852778102d, 0.6965635625948686d, 0.8298145389250031d, 2.4950936944539297d, 0.6015794926406148d, 0.0d, 0.6747782903666651d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.8182401073087973d + "'", double16 == 0.8182401073087973d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2927833862469428d + "'", double18 == 0.2927833862469428d);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        uniformRealDistribution0.reseedRandomGenerator((long) ' ');
        double double7 = uniformRealDistribution0.getNumericalVariance();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.06327517040544373d);
        double double10 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.06327517040544373d + "'", double9 == 0.06327517040544373d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double6 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.probability(0.6766392398995167d, 0.7697294817344926d);
        double double10 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "56) test5219(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9656112484606119d + "'", double3 == 0.9656112484606119d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.09309024183497594d + "'", double9 == 0.09309024183497594d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-9d + "'", double10 == 1.0E-9d);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6039787332279838d, 2.4725239789609064d);
        boolean boolean3 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.22459862688301188d, 0.7121379610434626d);
        double double3 = fDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        boolean boolean3 = fDistribution2.isSupportConnected();
        boolean boolean4 = fDistribution2.isSupportConnected();
        double double6 = fDistribution2.density(7.562099861400877E-28d);
        double double7 = fDistribution2.getSupportLowerBound();
        double double8 = fDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.32902298689074125E18d + "'", double6 == 1.32902298689074125E18d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.2781495492044994d, (double) 10, 0.679880178889932d);
        double[] doubleArray5 = uniformRealDistribution3.sample(1);
        double double6 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "57) test5223(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 4.710192294924669d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.679880178889932d + "'", double6 == 0.679880178889932d);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
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
        double double12 = uniformRealDistribution0.cumulativeProbability(0.009897513506510924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "58) test5224(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5716290567895164d + "'", double4 == 0.5716290567895164d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "15) test5224(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6347675918961038d + "'", double8 == 0.6347675918961038d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.009897513506510924d + "'", double12 == 0.009897513506510924d);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6121227109766438d, 2.3125942498560286d);
        double double4 = fDistribution2.inverseCumulativeProbability(0.04519796485307248d);
        double double5 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double6 = fDistribution2.getNumericalVariance();
        double double7 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2563543472296406E-4d + "'", double4 == 1.2563543472296406E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3125942498560286d + "'", double5 == 2.3125942498560286d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6121227109766438d + "'", double7 == 0.6121227109766438d);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6214426969109692d, 0.08230110552505629d);
        double double3 = fDistribution2.getSupportLowerBound();
        java.lang.Class<?> wildcardClass4 = fDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        boolean boolean5 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution2.getSupportLowerBound();
        uniformRealDistribution2.reseedRandomGenerator((long) '#');
        boolean boolean9 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double10 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.9079939717163934d, 1.5748592365641438d, 0.860553443468296d);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability(1.25d);
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.density(3.3472124071874476d);
        boolean boolean10 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "59) test5229(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9554257604039609d + "'", double4 == 0.9554257604039609d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.09093787185702049d, 2.367108182567842d, 0.4948852171227234d);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.6971549552183045d, 0.9754387177260426d);
        double double11 = uniformRealDistribution0.density(0.4407404276673048d);
        boolean boolean12 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2782837625077381d + "'", double9 == 0.2782837625077381d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        boolean boolean5 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        boolean boolean6 = uniformRealDistribution2.isSupportConnected();
        double double8 = uniformRealDistribution2.cumulativeProbability(8.746758854452454E-5d);
        double double9 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5261349832949958d, 0.19272308027398632d, 88.41710856256726d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double6 = fDistribution3.getNumericalVariance();
        double double7 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.19272308027398632d + "'", double4 == 0.19272308027398632d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double7 = fDistribution4.cumulativeProbability((double) (short) -1, 0.0d);
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution4.calculateNumericalVariance();
        double double10 = fDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6486131260836605d, 0.029738831865848248d, 0.09790599182923954d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.649) must be strictly less than upper bound (0.03)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution4.getSupportLowerBound();
        boolean boolean8 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
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
        double double17 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6838714210807377d + "'", double13 == 0.6838714210807377d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.23541417210258242d + "'", double17 == 0.23541417210258242d);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6673502636309796d, 0.4258177225503885d, 0.8888523735799368d);
        double double6 = fDistribution4.density(0.5424750230411775d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.17638172548164305d + "'", double6 == 0.17638172548164305d);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double12 = fDistribution3.cumulativeProbability(0.0d);
        double double14 = fDistribution3.probability(0.7165875787180795d);
        double double16 = fDistribution3.density(0.43140969555702946d);
        double double17 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "60) test5239(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6375365722005093d + "'", double9 == 0.6375365722005093d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5370860373682091d + "'", double16 == 0.5370860373682091d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double4 = fDistribution2.calculateNumericalVariance();
        double double5 = fDistribution2.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution2.getNumericalMean();
        double double7 = fDistribution2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6975449779484513d + "'", double5 == 0.6975449779484513d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1137932949955843d + "'", double7 == 0.1137932949955843d);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.0d);
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        double double11 = uniformRealDistribution0.getNumericalVariance();
        double double12 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean13 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08333333333333333d + "'", double11 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.9757565066606518d, 0.5993370739738937d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.976) must be strictly less than upper bound (0.599)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        double double13 = fDistribution3.probability(0.5415785819031833d, 2.3125942498560286d);
        double double14 = fDistribution3.getNumeratorDegreesOfFreedom();
        double[] doubleArray16 = fDistribution3.sample((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
// flaky "61) test5243(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.7194855765411473d }, 1.0E-15);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        fDistribution3.reseedRandomGenerator((long) (byte) 100);
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        double double13 = fDistribution3.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = fDistribution3.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.probability(0.5662656190788444d);
        boolean boolean10 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution2.probability(1.936120997106573d);
        double double13 = uniformRealDistribution2.getSupportLowerBound();
        boolean boolean14 = uniformRealDistribution2.isSupportConnected();
        double double15 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double4 = uniformRealDistribution0.density(10.0d);
        double double5 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.probability(0.1757939476207693d);
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.sample();
        double double10 = uniformRealDistribution0.getNumericalMean();
        boolean boolean11 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "62) test5246(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8277417699772083d + "'", double5 == 0.8277417699772083d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
// flaky "16) test5246(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9709480914033157d + "'", double9 == 0.9709480914033157d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double[] doubleArray9 = fDistribution3.sample((int) '4');
        double double10 = fDistribution3.calculateNumericalVariance();
        double double11 = fDistribution3.getSupportUpperBound();
        double double12 = fDistribution3.calculateNumericalVariance();
        double double14 = fDistribution3.density(0.06769353295268199d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.002302173806976674d + "'", double14 == 0.002302173806976674d);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0643050780024903d, 0.8421066660850904d);
        double double3 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-9d + "'", double3 == 1.0E-9d);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5898146861101199d, 88.41710856256726d);
        boolean boolean3 = uniformRealDistribution2.isSupportConnected();
        double double6 = uniformRealDistribution2.cumulativeProbability(0.001951584814057065d, 0.808069841591432d);
        boolean boolean7 = uniformRealDistribution2.isSupportConnected();
        boolean boolean8 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0024850493035607157d + "'", double6 == 0.0024850493035607157d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        double double11 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "63) test5251(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8001523330979607d + "'", double11 == 0.8001523330979607d);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        double double13 = fDistribution3.probability(0.5415785819031833d, 2.3125942498560286d);
        double double14 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) 0L, 0.02866935715429131d, 0.8201641987860412d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.38148571584628227d, 0.644788466238158d, 0.6845893808238659d);
        double double5 = uniformRealDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.38148571584628227d + "'", double5 == 0.38148571584628227d);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double12 = fDistribution3.getNumericalMean();
        double double14 = fDistribution3.cumulativeProbability(0.6391854256750903d);
        double double15 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean16 = fDistribution3.isSupportLowerBoundInclusive();
        java.lang.Class<?> wildcardClass17 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0210526315789474d + "'", double12 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2230878854254442d + "'", double14 == 0.2230878854254442d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean13 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "64) test5256(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6889096993464516d + "'", double9 == 0.6889096993464516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.33499450848006207d, 0.6793260832980672d, 0.8039688536766415d);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 0L, 0.3904156731971007d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8377264881841594d, 0.7410056902277217d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.838) must be strictly less than upper bound (0.741)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 1.293829897898062E16d, 1.7208793616675928d, 0.7387842926428161d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (12,938,298,978,980,620) must be strictly less than upper bound (1.721)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
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
        double double12 = uniformRealDistribution0.getSupportUpperBound();
        double double15 = uniformRealDistribution0.cumulativeProbability(6.849433663669284E-5d, 0.00924175992046461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.009173265583827916d + "'", double15 == 0.009173265583827916d);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double12 = fDistribution3.probability(6.006934970516585E-11d);
        boolean boolean13 = fDistribution3.isSupportConnected();
        double double14 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportUpperBound();
        boolean boolean10 = fDistribution3.isSupportUpperBoundInclusive();
        double[] doubleArray12 = fDistribution3.sample((int) (short) 10);
        boolean boolean13 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
// flaky "65) test5263(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 2.409854497911592d, 0.6584116689094676d, 0.8362201376169196d, 0.7253786450086327d, 0.7639998578885754d, 0.7303491880295386d, 0.7489983219174509d, 0.7380806669521351d, 0.7138229787222129d, 0.5992269564221495d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6155223357908637d, 0.7422678166643543d, 3.181009226124227E-44d);
        double double6 = fDistribution4.inverseCumulativeProbability(0.8914241055526231d);
        double double7 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double10 = fDistribution4.cumulativeProbability(0.6443312514309298d, 1.8269378627115378d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 79.22498179657372d + "'", double6 == 79.22498179657372d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6155223357908637d + "'", double7 == 0.6155223357908637d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12369526431377048d + "'", double10 == 0.12369526431377048d);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.3108719420541892d, 0.27979062919809317d, (double) 10.0f);
        double double4 = fDistribution3.getNumericalMean();
        double double6 = fDistribution3.density(0.6277292056000368d);
        boolean boolean7 = fDistribution3.isSupportConnected();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0976997698570935d + "'", double6 == 0.0976997698570935d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.20327979039873623d, 0.9195016681888635d);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0549983883465619d, 0.6814694733513209d, 0.001991308474390552d);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.calculateNumericalVariance();
        double double9 = fDistribution4.cumulativeProbability(7.562099861400877E-28d, 0.8046902295859584d);
        double double10 = fDistribution4.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23939818322691342d + "'", double9 == 0.23939818322691342d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
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
        double double14 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean15 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean16 = fDistribution3.isSupportConnected();
        double double17 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "66) test5269(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7172604772387444d + "'", double9 == 0.7172604772387444d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.density(97.0d);
        double double10 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.7171475092674E-46d + "'", double9 == 2.7171475092674E-46d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.19075927645340612d, 0.2540111815978645d);
        double double3 = uniformRealDistribution2.sample();
// flaky "67) test5271(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.22745125300219193d + "'", double3 == 0.22745125300219193d);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.sample();
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "68) test5272(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6055433359727088d + "'", double10 == 0.6055433359727088d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.004853457297448672d);
        boolean boolean9 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double10 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "69) test5273(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8523921170527002d + "'", double4 == 0.8523921170527002d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.004853457297448672d + "'", double8 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.42850285000008315d, 3.4527553180663855d);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.3108719420541892d, 0.27979062919809317d, (double) 10.0f);
        double double5 = fDistribution3.cumulativeProbability(4.088344667887812E-6d);
        double double7 = fDistribution3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.07208676541483997d + "'", double5 == 0.07208676541483997d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.4204560896774636d, 3.3472124071874476d, 0.44568866888716197d);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.probability(16.0d);
        double double10 = uniformRealDistribution0.probability(0.0d, 3.033643892548913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "70) test5277(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.08618615093227144d + "'", double3 == 0.08618615093227144d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 88.41710856256726d, 0.042293209129396825d, (double) 100L);
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getNumericalMean();
        double double7 = fDistribution4.getNumericalVariance();
        boolean boolean8 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double7 = uniformRealDistribution0.density(0.38257290567491475d);
        double double8 = uniformRealDistribution0.sample();
        java.lang.Class<?> wildcardClass9 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
// flaky "71) test5279(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8008556892127281d + "'", double8 == 0.8008556892127281d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.4025923598565553d, 0.38156436732833804d, 0.48939419185713245d);
        double double5 = fDistribution4.getNumericalVariance();
        double double6 = fDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.22929074613677172d, 0.26077781512086595d, 0.4329268118812597d);
        double double5 = fDistribution3.cumulativeProbability(0.03378893399797511d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.36281903643507796d + "'", double5 == 0.36281903643507796d);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.cumulativeProbability(0.7938684212191616d);
        double double7 = uniformRealDistribution2.cumulativeProbability(0.0d, 3.4708697385508454d);
        double double10 = uniformRealDistribution2.probability(0.3973197439265692d, 0.6837424731385963d);
        double double11 = uniformRealDistribution2.getNumericalMean();
        boolean boolean12 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5554636502621801d, 0.6553695282217037d, 0.9287246872266735d);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.695604531760929d, 0.7163545031354256d);
        double double3 = fDistribution2.sample();
// flaky "72) test5284(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13.889913400377521d + "'", double3 == 13.889913400377521d);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.cumulativeProbability(0.8300851989496363d);
        double double8 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8300851989496363d + "'", double7 == 0.8300851989496363d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08333333333333333d + "'", double8 == 0.08333333333333333d);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.017365478252578725d, 0.9614697965180772d, 0.7045037731818228d);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 3.0034674852582924E-11d, 0.0065557735696384345d, 0.7052885375206825d);
        double double5 = uniformRealDistribution4.getSupportLowerBound();
        double double7 = uniformRealDistribution4.density(1.876000390194258d);
        double double8 = uniformRealDistribution4.getSupportUpperBound();
        double double10 = uniformRealDistribution4.cumulativeProbability(0.9086942757105466d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0034674852582924E-11d + "'", double5 == 3.0034674852582924E-11d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0065557735696384345d + "'", double8 == 0.0065557735696384345d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getNumericalVariance();
        double[] doubleArray7 = uniformRealDistribution0.sample((int) (byte) 1);
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "73) test5288(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8655514898393029d + "'", double3 == 0.8655514898393029d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "17) test5288(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.12012200859598621d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.2972162083012442d, 0.7587933557019179d, 0.41168915463113165d);
        double double4 = fDistribution3.getSupportUpperBound();
        double[] doubleArray6 = fDistribution3.sample((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.2776281707775413d, 0.08852542671178854d, 0.0d);
        double double5 = fDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.913601350735804d, 0.7883955810914687d, 0.5190573322162404d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        double double5 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.calculateNumericalVariance();
        double double12 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double13 = fDistribution3.sample();
        double double14 = fDistribution3.getSolverAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass15 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
// flaky "74) test5292(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6117183551711814d + "'", double13 == 0.6117183551711814d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        double double5 = uniformRealDistribution3.getSupportUpperBound();
        double double7 = uniformRealDistribution3.probability(0.7167893764850413d);
        double double8 = uniformRealDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05428794722368846d) + "'", double4 == (-0.05428794722368846d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8914241055526231d + "'", double5 == 0.8914241055526231d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getNumericalMean();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double[] doubleArray10 = uniformRealDistribution0.sample((int) (byte) 1);
        double double11 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertNotNull(doubleArray10);
// flaky "75) test5294(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.4312269409415077d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.9758739470785891d, 1.0170861338685362d);
        uniformRealDistribution2.reseedRandomGenerator((long) (byte) 10);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6317191335965313d, 0.6236324983268595d);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        boolean boolean5 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution2.sample();
        double double8 = uniformRealDistribution2.cumulativeProbability(0.3225830759745576d);
        double double10 = uniformRealDistribution2.density(2.051786173508851d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.5415785819031833d, (double) 100.0f, 7.847827245153567E-4d);
        double double6 = uniformRealDistribution4.inverseCumulativeProbability(0.358739754665903d);
        double double7 = uniformRealDistribution4.getNumericalVariance();
        double double8 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 36.22126828088923d + "'", double6 == 36.22126828088923d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 824.3314659149784d + "'", double7 == 824.3314659149784d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.847827245153567E-4d + "'", double8 == 7.847827245153567E-4d);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean7 = uniformRealDistribution2.isSupportConnected();
        double double8 = uniformRealDistribution2.getSupportLowerBound();
        double double9 = uniformRealDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportUpperBound();
        boolean boolean10 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean11 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double7 = uniformRealDistribution0.getNumericalMean();
        double double8 = uniformRealDistribution0.getNumericalMean();
        boolean boolean9 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "76) test5301(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.8396433933202896d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double5 = uniformRealDistribution0.inverseCumulativeProbability(0.544127331049072d);
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.6996242418178735d);
        double[] doubleArray11 = uniformRealDistribution0.sample((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.544127331049072d + "'", double5 == 0.544127331049072d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6996242418178735d + "'", double9 == 0.6996242418178735d);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.23541417210258242d, 1.8917609619429339d, 0.31526394849539074d);
        double double5 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.13548588609137713d, 2.2920557083601523d, 0.8659636859096502d);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getNumericalMean();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        uniformRealDistribution0.reseedRandomGenerator(0L);
        double double12 = uniformRealDistribution0.density(0.35513531883707633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution0.sample();
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "77) test5306(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9956192667547983d + "'", double3 == 0.9956192667547983d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "18) test5306(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.245412482671576d + "'", double6 == 0.245412482671576d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double5 = uniformRealDistribution0.getNumericalVariance();
        double double6 = uniformRealDistribution0.sample();
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
// flaky "78) test5307(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.264227100953901d + "'", double6 == 0.264227100953901d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.inverseCumulativeProbability((double) (short) 1);
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        double double12 = fDistribution3.density(0.8590663588185146d);
        double double13 = fDistribution3.getNumericalMean();
        double double15 = fDistribution3.density(0.6610524929163929d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9246221413226698d + "'", double12 == 0.9246221413226698d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8926048627222798d + "'", double15 == 0.8926048627222798d);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.1245261116723153d, 0.627388726153098d, 0.15022081309557334d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.getNumericalMean();
        boolean boolean7 = fDistribution4.isSupportUpperBoundInclusive();
        double double8 = fDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution4.density(0.9382068481430984d);
        double double10 = fDistribution4.inverseCumulativeProbability(0.6976067833842337d);
        double double11 = fDistribution4.getSolverAbsoluteAccuracy();
        double double13 = fDistribution4.cumulativeProbability(0.0018820678494252396d);
        double double14 = fDistribution4.calculateNumericalVariance();
        boolean boolean15 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0012889459524991036d + "'", double8 == 0.0012889459524991036d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.449868410599898E16d + "'", double10 == 1.449868410599898E16d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4924481000950606d + "'", double13 == 0.4924481000950606d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.getNumericalMean();
        double double10 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "79) test5311(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5660230232614367d + "'", double4 == 0.5660230232614367d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) 0, (double) (byte) 1, 0.2972162083012442d);
        uniformRealDistribution3.reseedRandomGenerator((long) 0);
        boolean boolean6 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double13 = fDistribution3.getSupportUpperBound();
        double double14 = fDistribution3.getNumericalMean();
        boolean boolean15 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "80) test5313(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0273823502037356d + "'", double9 == 2.0273823502037356d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0210526315789474d + "'", double14 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double3 = uniformRealDistribution2.getNumericalMean();
        double double4 = uniformRealDistribution2.getSupportUpperBound();
        double double5 = uniformRealDistribution2.sample();
        double double6 = uniformRealDistribution2.sample();
        double double7 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.probability(0.11483289970060134d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
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
        double double13 = uniformRealDistribution0.probability(5.0144779134503885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "81) test5315(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.402357573223314d + "'", double4 == 0.402357573223314d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.004853457297448672d + "'", double8 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
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
        boolean boolean17 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "82) test5316(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.878757568347843d + "'", double7 == 2.878757568347843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.8155649719352942d + "'", double9 == 1.8155649719352942d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.933517426050187d + "'", double11 == 0.933517426050187d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8998695148900057d + "'", double15 == 0.8998695148900057d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.calculateNumericalVariance();
        double double8 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator((long) 0);
        double double12 = fDistribution3.density(0.9866084085725269d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8461893320994837d + "'", double12 == 0.8461893320994837d);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6039787332279838d, 8.746758854452454E-5d, 0.544127331049072d);
        double double4 = fDistribution3.getSolverAbsoluteAccuracy();
        double double5 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator(100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.544127331049072d + "'", double4 == 0.544127331049072d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6105765309973351d, 0.04556886176255951d, 5.035444348951398d);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double3 = uniformRealDistribution2.getNumericalMean();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getNumericalVariance();
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double8 = uniformRealDistribution2.cumulativeProbability(0.9388767853941155d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.probability(10.0d);
        double double12 = fDistribution3.getSupportUpperBound();
        double double13 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double15 = fDistribution3.cumulativeProbability(0.6814622736361124d);
        double double17 = fDistribution3.cumulativeProbability(0.39731286652410236d);
        double double18 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.26077781512086595d + "'", double15 == 0.26077781512086595d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.05504601913724995d + "'", double17 == 0.05504601913724995d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.23541417210258242d + "'", double18 == 0.23541417210258242d);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.sample();
        uniformRealDistribution2.reseedRandomGenerator((long) '#');
        double double10 = uniformRealDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        double double8 = uniformRealDistribution0.density(0.19133137083299634d);
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        double double11 = uniformRealDistribution0.probability(0.07983844188212808d);
        double double12 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double13 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
// flaky "83) test5323(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.323278678929138d + "'", double13 == 0.323278678929138d);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.019328280780811495d, 0.9334939150380321d, 0.21564265376823544d);
        boolean boolean5 = fDistribution4.isSupportLowerBoundInclusive();
        double double7 = fDistribution4.density(0.7087523712937718d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.01280752654336989d + "'", double7 == 0.01280752654336989d);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3981977572581923d, 0.595906678664889d, (double) 0);
        double double4 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
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
        double double14 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "84) test5326(org.apache.commons.math3.distribution.RegressionTest10)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3223095274053078d + "'", double4 == 0.3223095274053078d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-9d + "'", double11 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08333333333333333d + "'", double14 == 0.08333333333333333d);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6541717467536889d, 0.0d, 0.3702234039813894d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 100.0d, Double.POSITIVE_INFINITY, (double) (byte) 1);
        double double6 = uniformRealDistribution4.probability(2.3502599751932776d);
        double double7 = uniformRealDistribution4.getSupportLowerBound();
        boolean boolean8 = uniformRealDistribution4.isSupportConnected();
        double double9 = uniformRealDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.density(97.0d);
        double double11 = fDistribution3.probability((double) 10L);
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean13 = fDistribution3.isSupportConnected();
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.7171475092674E-46d + "'", double9 == 2.7171475092674E-46d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability(1.0210526315789474d, 3.537396594438314d);
        double double12 = fDistribution3.density(0.769221584666441d);
        double double14 = fDistribution3.probability(0.850103622586271d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4311546417502141d + "'", double10 == 0.4311546417502141d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9388767853941155d + "'", double12 == 0.9388767853941155d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double8 = fDistribution3.getSupportLowerBound();
        boolean boolean9 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean10 = fDistribution3.isSupportUpperBoundInclusive();
        double double11 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.09455665419110293d, 0.3321070505100212d, 0.24952550835226206d);
        boolean boolean4 = fDistribution3.isSupportConnected();
        double double6 = fDistribution3.cumulativeProbability(0.26658291088175734d);
        java.lang.Class<?> wildcardClass7 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6963148480301199d + "'", double6 == 0.6963148480301199d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.0811806448061642d, 0.7796022749223823d, 0.7817449964246759d);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.density(0.6314408575573036d);
        double double10 = uniformRealDistribution0.probability(0.7102975073045114d);
        boolean boolean11 = uniformRealDistribution0.isSupportConnected();
        uniformRealDistribution0.reseedRandomGenerator((long) (short) 1);
        double double15 = uniformRealDistribution0.cumulativeProbability(0.20999832855670175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.20999832855670175d + "'", double15 == 0.20999832855670175d);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(8.405835822952538E-4d, 0.0d, 0.8394001527753516d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.001) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean13 = fDistribution3.isSupportUpperBoundInclusive();
        double double14 = fDistribution3.calculateNumericalVariance();
        double double15 = fDistribution3.getNumericalVariance();
        double double16 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23541417210258242d + "'", double15 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getSupportLowerBound();
        fDistribution3.reseedRandomGenerator((long) 10);
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0210526315789474d + "'", double12 == 1.0210526315789474d);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6553695282217037d, (double) 1, 0.6119517974962971d);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        double double6 = uniformRealDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8276847641108518d + "'", double6 == 0.8276847641108518d);
    }
}
