package org.apache.commons.math3.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double7 = fDistribution3.probability(0.23125697402288498d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.9356642585400792d, 0.1093809887935191d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1.936) must be strictly less than upper bound (0.109)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.9155713525675118d, 0.6179657774208087d);
        boolean boolean3 = fDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double3 = uniformRealDistribution2.getNumericalVariance();
        double double5 = uniformRealDistribution2.cumulativeProbability(0.6901712953686285d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.6155223357908637d);
        double double9 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6155223357908637d + "'", double8 == 0.6155223357908637d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.24543468489254971d, 0.0d, 0.5963686339682281d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        double double16 = fDistribution3.inverseCumulativeProbability(2.554881495381541E-4d);
        boolean boolean17 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "1) test1007(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.9941381926271031d + "'", double9 == 1.9941381926271031d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.26813163661952144d, 0.64439990514539d, 0.38974700424453923d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = uniformRealDistribution3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double5 = fDistribution4.getSupportUpperBound();
        boolean boolean6 = fDistribution4.isSupportLowerBoundInclusive();
        double double7 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.4656187585388245d, 0.9294871528690059d, 0.6240903316275141d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        uniformRealDistribution0.reseedRandomGenerator((long) ' ');
        double double11 = uniformRealDistribution0.density(0.6758005342430309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.inverseCumulativeProbability(0.40425162944598975d);
        double double11 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103655534857197d + "'", double10 == 0.7103655534857197d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0210526315789474d + "'", double12 == 1.0210526315789474d);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7869391852410315d, 0.31526394849539074d, 0.913601350735804d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.787) must be strictly less than upper bound (0.315)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double4 = uniformRealDistribution0.density(10.0d);
        double double5 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        double double9 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "2) test1014(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5529915144010362d + "'", double5 == 0.5529915144010362d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportLowerBound();
        uniformRealDistribution0.reseedRandomGenerator((long) '#');
        java.lang.Class<?> wildcardClass7 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.getSupportUpperBound();
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution4.getSupportLowerBound();
        double double10 = fDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.004853457297448672d + "'", double8 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.cumulativeProbability((-1.0d), (double) ' ');
        double double10 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean11 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.41235519599966075d, 0.13464417360344205d, 0.2813212004071636d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.412) must be strictly less than upper bound (0.135)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double6 = uniformRealDistribution0.density(0.08333333333333333d);
        double double8 = uniformRealDistribution0.cumulativeProbability(0.5478965661789728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5478965661789728d + "'", double8 == 0.5478965661789728d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean10 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double11 = uniformRealDistribution0.getNumericalMean();
        double double12 = uniformRealDistribution0.getNumericalMean();
        double double13 = uniformRealDistribution0.sample();
        boolean boolean14 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
// flaky "3) test1020(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4564025689487865d + "'", double13 == 0.4564025689487865d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        double double18 = fDistribution3.getNumericalVariance();
        double double19 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "4) test1021(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6802760699747519d + "'", double7 == 0.6802760699747519d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
// flaky "1) test1021(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6823816601307267d + "'", double12 == 0.6823816601307267d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9217691399069918d + "'", double16 == 0.9217691399069918d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.23541417210258242d + "'", double18 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.23541417210258242d + "'", double19 == 0.23541417210258242d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        fDistribution3.reseedRandomGenerator((long) 10);
        double double9 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6155223357908637d, 0.7422678166643543d, 3.181009226124227E-44d);
        double double6 = fDistribution4.inverseCumulativeProbability(0.6140485448030906d);
        double double7 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double10 = fDistribution4.cumulativeProbability(0.49609971263019714d, 0.5677315412196444d);
        boolean boolean11 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0611928590791497d + "'", double6 == 2.0611928590791497d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6155223357908637d + "'", double7 == 0.6155223357908637d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.015619490434989225d + "'", double10 == 0.015619490434989225d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3958488533325002d, 0.31526394849539074d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.396) must be strictly less than upper bound (0.315)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) 0, (double) (byte) 1, 0.2972162083012442d);
        boolean boolean4 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8888523735799368d, 2.789332381109301E-5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.889) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        double double14 = uniformRealDistribution0.sample();
        java.lang.Class<?> wildcardClass15 = uniformRealDistribution0.getClass();
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
// flaky "5) test1027(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5305840308156626d + "'", double14 == 0.5305840308156626d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        double double18 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "6) test1028(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.2977130592784807d + "'", double9 == 2.2977130592784807d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.05519010190337914d, 0.1329742018031419d, 0.595906678664889d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator((-1L));
        fDistribution3.reseedRandomGenerator((long) '4');
        double double17 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "7) test1030(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6248486368855641d + "'", double7 == 0.6248486368855641d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0210526315789474d + "'", double17 == 1.0210526315789474d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        double double13 = fDistribution3.probability(0.5415785819031833d, 2.3125942498560286d);
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        fDistribution3.reseedRandomGenerator((long) 100);
        boolean boolean17 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6316235913295272d, 0.06788476306602909d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.632) must be strictly less than upper bound (0.068)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.0d, 0.864751955633795d, 12.552873165287084d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double6 = uniformRealDistribution0.density((double) (-1L));
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.6615962937856623d);
        uniformRealDistribution0.reseedRandomGenerator((-1L));
        double double12 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6615962937856623d + "'", double9 == 0.6615962937856623d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.779340420746909d, 0.6456794250754441d, 0.48323678369188483d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.779) must be strictly less than upper bound (0.646)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8374705046232109d, 0.04713220481929081d, 0.23975277882876944d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.837) must be strictly less than upper bound (0.047)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        double double17 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double18 = fDistribution3.calculateNumericalVariance();
        boolean boolean19 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6838714210807377d + "'", double13 == 0.6838714210807377d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.23541417210258242d + "'", double18 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(12.552873165287084d, 4.7120415909255865E-4d, 0.5677315412196444d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (12.553) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.867507128393655d, 0.7625534595104149d, 0.779340420746909d);
        // The following exception was thrown during execution in test generation
        try {
            fDistribution4.reseedRandomGenerator((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6360822263764419d, 0.4329268118812597d, 0.27979062919809317d);
        boolean boolean5 = fDistribution4.isSupportUpperBoundInclusive();
        double double7 = fDistribution4.density(0.0d);
        double double10 = fDistribution4.probability(0.06522897391139804d, 1.293829897898062E16d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7939555608321129d + "'", double10 == 0.7939555608321129d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.density(0.4116955788765788d);
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getSupportUpperBound();
        double double12 = fDistribution3.probability(0.39731286652410236d);
        double double14 = fDistribution3.probability(0.541821992595481d);
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
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double13 = fDistribution3.cumulativeProbability(0.7807885334422537d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35301580088889134d + "'", double13 == 0.35301580088889134d);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.7770475969029353d, 0.1211897904390418d, 0.29031912847631514d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1.777) must be strictly less than upper bound (0.121)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(2.2548075713444913d, 0.8039688536766415d, 0.0d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.cumulativeProbability(0.08333333333333333d);
        boolean boolean10 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.746758854452454E-5d + "'", double9 == 8.746758854452454E-5d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6414543161690349d, 0.8904354075111562d);
        double double3 = uniformRealDistribution2.getNumericalVariance();
        boolean boolean4 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0051659653204928135d + "'", double3 == 0.0051659653204928135d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.cumulativeProbability(0.08333333333333333d);
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.746758854452454E-5d + "'", double9 == 8.746758854452454E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0549983883465619d, 2.6749582739594557d, 0.6851772303251921d);
        double double6 = uniformRealDistribution4.probability(0.6155223357908637d);
        boolean boolean7 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6758005342430309d, 1.8465563866412276d);
        double double3 = fDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportLowerBound();
        uniformRealDistribution0.reseedRandomGenerator((long) '#');
        double double7 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.sample();
        double double11 = fDistribution3.getDenominatorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((long) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
// flaky "8) test1053(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.713869027440155d + "'", double10 == 2.713869027440155d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.2972162083012442d, 0.8726330497066486d, 0.6140485448030906d);
        double double6 = fDistribution4.density(0.7680367961973186d);
        double double7 = fDistribution4.calculateNumericalVariance();
        double double8 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11133083022476167d + "'", double6 == 0.11133083022476167d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        double double18 = fDistribution3.density(0.5720158168517273d);
        double double19 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "9) test1055(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6946451121537729d + "'", double9 == 0.6946451121537729d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.7941015035099954d + "'", double18 == 0.7941015035099954d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        boolean boolean15 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "10) test1056(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4948852171227234d + "'", double4 == 0.4948852171227234d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = fDistribution3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6916856290446507d, 0.9736694951866904d);
        double double3 = uniformRealDistribution2.getNumericalMean();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8326775621156706d + "'", double3 == 0.8326775621156706d);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.1623586333720101d, 0.26279270621356643d, 0.7071737568021614d);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        double double7 = uniformRealDistribution4.probability(0.16357138905357987d);
        double double8 = uniformRealDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.26279270621356643d + "'", double5 == 0.26279270621356643d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.26279270621356643d + "'", double8 == 0.26279270621356643d);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5261349832949958d, 2.565072426559519d, 0.6167685717416793d);
        double double5 = uniformRealDistribution3.cumulativeProbability(0.20217523289546602d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.7928067872931985d, 0.8679559444149998d, 0.6068101165270838d);
        java.lang.Class<?> wildcardClass5 = fDistribution4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8316183742171073d, 0.6541717467536889d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.832) must be strictly less than upper bound (0.654)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6851772303251921d, 0.6976067833842337d, 0.3164687886038654d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        double double5 = uniformRealDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6913920068547128d + "'", double4 == 0.6913920068547128d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6851772303251921d + "'", double5 == 0.6851772303251921d);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7387842926428161d, 0.9382068481430984d);
        double double3 = uniformRealDistribution2.getSupportUpperBound();
        double double5 = uniformRealDistribution2.density(0.7883955810914687d);
        double double6 = uniformRealDistribution2.sample();
        boolean boolean7 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9382068481430984d + "'", double3 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0144779134503885d + "'", double5 == 5.0144779134503885d);
// flaky "11) test1064(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.892686976533386d + "'", double6 == 0.892686976533386d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.1757939476207693d);
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        double double11 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1757939476207693d + "'", double9 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "12) test1065(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8143049096704447d + "'", double11 == 0.8143049096704447d);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        boolean boolean5 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution2.getSupportLowerBound();
        uniformRealDistribution2.reseedRandomGenerator((long) '#');
        double double9 = uniformRealDistribution2.sample();
        boolean boolean10 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double12 = uniformRealDistribution2.cumulativeProbability(0.9208612358974166d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.probability(0.5662656190788444d);
        boolean boolean10 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        boolean boolean11 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean12 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double7 = fDistribution4.cumulativeProbability((double) (short) -1, 0.0d);
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution4.getDenominatorDegreesOfFreedom();
        boolean boolean10 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.5662656190788444d, 0.098126171830621d, 0.0d);
        double double6 = fDistribution4.density(0.8951247373711049d);
        double double7 = fDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = fDistribution4.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.04139850930652053d + "'", double6 == 0.04139850930652053d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 86.61325929026391d, 0.627388726153098d, 1.8156551679246902d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (86.613) must be strictly less than upper bound (0.627)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double5 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.probability((double) (byte) 0);
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution4.getSupportLowerBound();
        double double10 = fDistribution4.getNumericalVariance();
        double double12 = fDistribution4.inverseCumulativeProbability(0.3416260639338622d);
        double double13 = fDistribution4.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.1321317066213935d, 0.0d, (-0.11983222114531328d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.132) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6177180781591378d, 48.8425886151626d, 0.08639864926419605d);
        java.lang.Class<?> wildcardClass4 = uniformRealDistribution3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        double double19 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "13) test1074(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6883245528673383d + "'", double9 == 0.6883245528673383d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
// flaky "2) test1074(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.9317065604990125d + "'", double16 == 1.9317065604990125d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6715292022072981d + "'", double18 == 0.6715292022072981d);
// flaky "1) test1074(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6824097636995283d + "'", double19 == 0.6824097636995283d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) (-1.0f), 0.6391854256750903d, 0.20172357187228318d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5881395489123649d, 0.8535187100169657d);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        double double4 = fDistribution3.getSolverAbsoluteAccuracy();
        double double6 = fDistribution3.inverseCumulativeProbability(0.5896041010294244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5509385983974154d + "'", double4 == 0.5509385983974154d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6155223357908637d, 0.7422678166643543d, 3.181009226124227E-44d);
        double double5 = fDistribution4.getSolverAbsoluteAccuracy();
        boolean boolean6 = fDistribution4.isSupportLowerBoundInclusive();
        boolean boolean7 = fDistribution4.isSupportConnected();
        double double9 = fDistribution4.density(0.0d);
        double double10 = fDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.181009226124227E-44d + "'", double5 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.sample();
        double double10 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double11 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "14) test1079(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7112482675157115d + "'", double4 == 0.7112482675157115d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
// flaky "3) test1079(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6069841742006401d + "'", double9 == 0.6069841742006401d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-9d + "'", double10 == 1.0E-9d);
// flaky "2) test1079(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9638914170000887d + "'", double11 == 0.9638914170000887d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.getSupportLowerBound();
        double double8 = fDistribution4.inverseCumulativeProbability(0.1623586333720101d);
        double double9 = fDistribution4.getNumericalMean();
        double double10 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6177180781591378d + "'", double10 == 0.6177180781591378d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.8460138802083401d, 0.5881395489123649d);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8460138802083401d + "'", double3 == 0.8460138802083401d);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        uniformRealDistribution0.reseedRandomGenerator((long) (short) -1);
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double11 = uniformRealDistribution0.cumulativeProbability(0.7840022961154538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "15) test1082(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.238295675771385d + "'", double4 == 0.238295675771385d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7840022961154538d + "'", double11 == 0.7840022961154538d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8354713638140709d, 0.9966872852742321d, (double) 100.0f);
        boolean boolean5 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.cumulativeProbability(0.09455665419110293d);
        double double6 = fDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1137932949955843d + "'", double3 == 0.1137932949955843d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1130006476062561d + "'", double5 == 0.1130006476062561d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double12 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "16) test1085(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.getNumericalMean();
        boolean boolean9 = fDistribution3.isSupportLowerBoundInclusive();
        double double12 = fDistribution3.cumulativeProbability(0.055462716269817136d, 0.8354713638140709d);
        double double13 = fDistribution3.getSupportLowerBound();
        boolean boolean14 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.40425162944598975d + "'", double12 == 0.40425162944598975d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.density(97.0d);
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.7171475092674E-46d + "'", double9 == 2.7171475092674E-46d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.probability(10.0d);
        double double12 = fDistribution3.getSupportUpperBound();
        double double14 = fDistribution3.density(0.08214286204237431d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.00461193290190975d + "'", double14 == 0.00461193290190975d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.8667136589177642d, 0.6311055222038046d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8354713638140709d, 0.9966872852742321d, (double) 100.0f);
        double double5 = uniformRealDistribution4.getNumericalVariance();
        double double6 = uniformRealDistribution4.getSupportLowerBound();
        double double7 = uniformRealDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.002165881111020738d + "'", double5 == 0.002165881111020738d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8354713638140709d + "'", double6 == 0.8354713638140709d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9160793245441515d + "'", double7 == 0.9160793245441515d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        double double17 = fDistribution3.density(0.04147695370094584d);
        java.lang.Class<?> wildcardClass18 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.746475778452671E-4d + "'", double17 == 3.746475778452671E-4d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.2439012222489887d, 0.8733954553258896d, 0.7418114744879037d);
        double double4 = uniformRealDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8733954553258896d + "'", double4 == 0.8733954553258896d);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double5 = fDistribution4.getSupportUpperBound();
        boolean boolean6 = fDistribution4.isSupportLowerBoundInclusive();
        boolean boolean7 = fDistribution4.isSupportConnected();
        boolean boolean8 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.559025207971324d, (double) '#');
        java.lang.Class<?> wildcardClass3 = fDistribution2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability(1.0210526315789474d, 3.537396594438314d);
        double double11 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double13 = fDistribution3.cumulativeProbability(2.6212776160383835d);
        double double14 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4311546417502141d + "'", double10 == 0.4311546417502141d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9927394322094806d + "'", double13 == 0.9927394322094806d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7283674369075639d, (double) (byte) 1, 0.4999014899032976d);
        double double7 = uniformRealDistribution4.cumulativeProbability(0.20729773794146564d, 0.5898146861101199d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6810634474143489d, 0.02741148573788177d, 2.876932025259756d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.681) must be strictly less than upper bound (0.027)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.probability(16.0d);
        double double10 = uniformRealDistribution0.cumulativeProbability(0.660577630906041d, 0.9193842879406898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "17) test1098(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1389586176437927d + "'", double3 == 0.1389586176437927d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2588066570346488d + "'", double10 == 0.2588066570346488d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.449868410599931E16d, 0.6155223357908637d);
        double double3 = fDistribution2.getNumericalVariance();
        boolean boolean4 = fDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) 0, (double) (byte) 1, 0.2972162083012442d);
        uniformRealDistribution3.reseedRandomGenerator((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = uniformRealDistribution3.cumulativeProbability(0.9334939150380321d, 0.20658800921437645d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.933) must be less than or equal to upper endpoint (0.207)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6360822263764419d, 0.4329268118812597d, 0.27979062919809317d);
        boolean boolean5 = fDistribution4.isSupportUpperBoundInclusive();
        java.lang.Class<?> wildcardClass6 = fDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.9941381926271031d, 0.3904156731971007d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1.994) must be strictly less than upper bound (0.39)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.5415785819031833d, (double) 100.0f, 7.847827245153567E-4d);
        boolean boolean5 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution4.cumulativeProbability(0.7074171203241886d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0016674157507875983d + "'", double7 == 0.0016674157507875983d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(2.3299766722229602d, 0.4404399589285899d, 0.6995065888297458d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.33) must be strictly less than upper bound (0.44)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.3598703032735273d, 0.8763253745579467d, 0.23125697402288498d);
        // The following exception was thrown during execution in test generation
        try {
            uniformRealDistribution4.reseedRandomGenerator((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.45929424874669533d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.459) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.9999999999758308d, 0.6214426969109692d, 0.7731402972800671d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1) must be strictly less than upper bound (0.621)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.2872598481744745d, 0.6852677852739119d, 0.3416860642950976d);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        double double14 = fDistribution3.calculateNumericalVariance();
        double double16 = fDistribution3.probability(0.844647373442273d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        double double3 = fDistribution2.getNumericalVariance();
        boolean boolean4 = fDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.463149570621243d + "'", double3 == 3.463149570621243d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.getSupportUpperBound();
        double double9 = fDistribution4.cumulativeProbability(0.6715292022072981d);
        double double11 = fDistribution4.density(0.6195653609603238d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4995184744492604d + "'", double9 == 0.4995184744492604d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.001951584814057065d + "'", double11 == 0.001951584814057065d);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6851772303251921d, 0.6976067833842337d, 0.3164687886038654d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        double double5 = uniformRealDistribution3.getNumericalVariance();
        double double6 = uniformRealDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6913920068547128d + "'", double4 == 0.6913920068547128d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2874482437294174E-5d + "'", double5 == 1.2874482437294174E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6976067833842337d + "'", double6 == 0.6976067833842337d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getNumericalVariance();
        double double11 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.09309024183497594d, 0.0d, 0.49609971263019714d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.093) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) 0.0f, 3.5564389998236723d);
        double double3 = uniformRealDistribution2.sample();
        double double4 = uniformRealDistribution2.getNumericalVariance();
// flaky "18) test1115(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9961442109473947d + "'", double3 == 0.9961442109473947d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0540215299555669d + "'", double4 == 1.0540215299555669d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.sample();
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double10 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
// flaky "19) test1116(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8081642699069973d + "'", double8 == 0.8081642699069973d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7387842926428161d, 0.9382068481430984d);
        double double3 = uniformRealDistribution2.getSupportUpperBound();
        double double5 = uniformRealDistribution2.density(0.7883955810914687d);
        double double7 = uniformRealDistribution2.cumulativeProbability(0.48939419185713245d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9382068481430984d + "'", double3 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0144779134503885d + "'", double5 == 5.0144779134503885d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double10 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.inverseCumulativeProbability(0.7283674369075639d);
        double double11 = fDistribution3.cumulativeProbability(0.3958488533325002d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "20) test1119(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.1467508108064894d + "'", double7 == 2.1467508108064894d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.8155649719352942d + "'", double9 == 1.8155649719352942d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.054370919153081655d + "'", double11 == 0.054370919153081655d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) '#', 0.5881395489123649d, 1.7080848333942735d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (35) must be strictly less than upper bound (0.588)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double8 = fDistribution3.cumulativeProbability(10.0d);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.density(0.048161091562381575d);
        double double12 = fDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistribution3.probability(0.7810395258119183d, 0.04127273732944947d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.781) must be less than or equal to upper endpoint (0.041)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999758308d + "'", double8 == 0.9999999999758308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.56513546905019E-4d + "'", double11 == 6.56513546905019E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.getNumericalMean();
        java.lang.Class<?> wildcardClass9 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "21) test1123(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.423940284801322d + "'", double7 == 2.423940284801322d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7807885334422537d, 0.4427119674611329d, 0.6316235913295272d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.781) must be strictly less than upper bound (0.443)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.8374705046232109d, (double) 100.0f, 0.5608032501170599d);
        double double4 = fDistribution3.sample();
        boolean boolean5 = fDistribution3.isSupportConnected();
// flaky "22) test1126(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8904354075111562d, 0.41166628889519163d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.89) must be strictly less than upper bound (0.412)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        uniformRealDistribution0.reseedRandomGenerator((long) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 1.7411009838609295d, 1.0540215299555669d, 2.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1.741) must be strictly less than upper bound (1.054)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.cumulativeProbability(0.0d);
        double double15 = fDistribution3.cumulativeProbability(0.6313604496713228d, 2.3502599751932776d);
        double double16 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "23) test1130(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7017242982249108d + "'", double9 == 0.7017242982249108d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.7680367961973186d + "'", double15 == 0.7680367961973186d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6848189829593176d, 0.9316998175652447d, 0.7346921611407997d);
        double double4 = uniformRealDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005079178874643258d + "'", double4 == 0.005079178874643258d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution3.getNumericalVariance();
        double double7 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution3.getSupportLowerBound();
        double double9 = uniformRealDistribution3.sample();
        double double10 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass11 = uniformRealDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05428794722368846d) + "'", double4 == (-0.05428794722368846d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2981237622554617d + "'", double6 == 0.2981237622554617d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
// flaky "24) test1132(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.9457891641483526d) + "'", double9 == (-0.9457891641483526d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double13 = fDistribution3.density(0.27274084207236093d);
        double double14 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.19963923310118198d + "'", double13 == 0.19963923310118198d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        fDistribution3.reseedRandomGenerator((long) (byte) 100);
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean14 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean7 = uniformRealDistribution2.isSupportConnected();
        double double8 = uniformRealDistribution2.sample();
        double double9 = uniformRealDistribution2.getSupportUpperBound();
        double double10 = uniformRealDistribution2.getSupportLowerBound();
        double double12 = uniformRealDistribution2.probability(0.5831064787455089d);
        boolean boolean13 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5190573322162404d, 0.7283674369075639d);
        double double3 = fDistribution2.getNumericalVariance();
        boolean boolean4 = fDistribution2.isSupportConnected();
        double double5 = fDistribution2.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = fDistribution2.sample((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100, 0.5881395489123649d, 0.0d);
        boolean boolean5 = fDistribution4.isSupportConnected();
        double double6 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double10 = fDistribution3.cumulativeProbability((double) (short) 0, 0.5d);
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        double[] doubleArray13 = fDistribution3.sample((int) '4');
        double double14 = fDistribution3.getNumericalVariance();
        double double15 = fDistribution3.getNumericalMean();
        java.lang.Class<?> wildcardClass16 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1137932949955843d + "'", double10 == 0.1137932949955843d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.49174310649001063d, 0.6197701094066437d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        double double15 = fDistribution3.cumulativeProbability(0.7807513818541891d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "25) test1140(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3529808983612997d + "'", double15 == 0.3529808983612997d);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.7142455852563852d, 0.20729773794146564d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = uniformRealDistribution0.cumulativeProbability(0.5896041010294244d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.59) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "26) test1142(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5037582315077356d + "'", double4 == 0.5037582315077356d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        double double13 = fDistribution3.cumulativeProbability(0.49979110665733484d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.11365223848413353d + "'", double13 == 0.11365223848413353d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.0018820678494252396d, 0.24952550835226206d);
        double double3 = fDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double9 = fDistribution3.probability(0.004853457297448672d, 0.5662656190788444d);
        double double10 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double13 = fDistribution3.inverseCumulativeProbability(0.7697131649614974d);
        double double15 = fDistribution3.probability(0.7781754925699749d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1623586333720101d + "'", double9 == 0.1623586333720101d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.9080987582593552d + "'", double13 == 1.9080987582593552d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.probability(0.2230878854254442d);
        double double8 = uniformRealDistribution0.density(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = uniformRealDistribution0.probability(0.9143504744746487d, 0.2439012222489887d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.914) must be less than or equal to upper endpoint (0.244)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getSupportLowerBound();
        double[] doubleArray5 = fDistribution2.sample((int) (byte) 1);
        double double6 = fDistribution2.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistribution2.cumulativeProbability(0.9638914170000887d, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.964) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "27) test1147(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 331.7477859889655d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution0.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = uniformRealDistribution0.inverseCumulativeProbability(12.552873165287084d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 12.553 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "28) test1148(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8830696860682918d + "'", double4 == 0.8830696860682918d);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistribution3.probability(0.6348707827563551d, 0.5782625573532836d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.635) must be less than or equal to upper endpoint (0.578)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "29) test1150(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.8408289035505028d + "'", double7 == 1.8408289035505028d);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6360822263764419d, 0.36915534168671216d, 79.22498179657372d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistribution3.cumulativeProbability(0.8679559444149998d, 0.1321317066213935d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.868) must be less than or equal to upper endpoint (0.132)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "30) test1152(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3081113430701268d + "'", double3 == 0.3081113430701268d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6021176062664009d, 3.252035620917269d, 0.5877437368948693d);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        double double17 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6838714210807377d + "'", double13 == 0.6838714210807377d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6712461511075261d, 0.45346617159979785d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.getSupportUpperBound();
        double double11 = uniformRealDistribution0.probability(0.0d, 0.11659193530026048d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = uniformRealDistribution0.sample((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "31) test1156(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.27174067786289413d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky "4) test1156(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14599337923281208d + "'", double7 == 0.14599337923281208d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.11659193530026048d + "'", double11 == 0.11659193530026048d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7283674369075639d, 0.6006834726043084d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.728) must be strictly less than upper bound (0.601)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        double double17 = fDistribution3.getSupportLowerBound();
        double double19 = fDistribution3.density(0.7254795549880363d);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.929362703527262d + "'", double19 == 0.929362703527262d);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getNumericalVariance();
        double double10 = fDistribution3.cumulativeProbability(2.4551515381057674d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9883417882660025d + "'", double10 == 0.9883417882660025d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double5 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.probability((double) (byte) 0);
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution4.getSupportUpperBound();
        double double10 = fDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6119517974962971d, 0.5d);
        double double3 = fDistribution2.getSolverAbsoluteAccuracy();
        double double6 = fDistribution2.cumulativeProbability(0.45346617159979785d, 3.6814437437668386d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-9d + "'", double3 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.20920884693843428d + "'", double6 == 0.20920884693843428d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double9 = fDistribution3.density(0.7627482092423561d);
        double double11 = fDistribution3.cumulativeProbability(0.4999014899032976d);
        double double12 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9382068481430984d + "'", double9 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.11372676532829251d + "'", double11 == 0.11372676532829251d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3801629465009775d, 0.7772124203157265d);
        double double4 = uniformRealDistribution2.cumulativeProbability(2.654819023133747d);
        double double6 = uniformRealDistribution2.cumulativeProbability(2.565072426559519d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.sample();
        boolean boolean5 = uniformRealDistribution3.isSupportLowerBoundInclusive();
// flaky "32) test1164(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5908324567516213d + "'", double4 == 0.5908324567516213d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 1, 9.435082943715062E-15d, 0.7627482092423561d);
        boolean boolean5 = fDistribution4.isSupportUpperBoundInclusive();
        double double7 = fDistribution4.cumulativeProbability(0.49609971263019714d);
        double double8 = fDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.538769112130467E-13d + "'", double7 == 1.538769112130467E-13d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7627482092423561d + "'", double8 == 0.7627482092423561d);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistribution3.probability(0.7625534595104149d, 0.35156858913302935d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.763) must be less than or equal to upper endpoint (0.352)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "33) test1166(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5942907296384194d + "'", double7 == 0.5942907296384194d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
// flaky "5) test1166(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6406551896835518d + "'", double12 == 0.6406551896835518d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9217691399069918d + "'", double16 == 0.9217691399069918d);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.getNumericalMean();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double11 = fDistribution3.density(0.7948236153171645d);
        double double12 = fDistribution3.getSupportUpperBound();
        boolean boolean13 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9391513127071319d + "'", double11 == 0.9391513127071319d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double13 = fDistribution3.inverseCumulativeProbability(0.3379957971411982d);
        double double14 = fDistribution3.getSupportLowerBound();
        double double15 = fDistribution3.getNumericalMean();
        double double16 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6838714210807377d + "'", double13 == 0.6838714210807377d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5190573322162404d, 0.7283674369075639d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        double double4 = fDistribution2.calculateNumericalVariance();
        double double5 = fDistribution2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7283674369075639d + "'", double5 == 0.7283674369075639d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.cumulativeProbability(1.0210526315789474d);
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = uniformRealDistribution0.probability(6.941941680452812d, 0.23415621080283774d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (6.942) must be less than or equal to upper endpoint (0.234)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.density(0.1757939476207693d);
        double double8 = uniformRealDistribution0.sample();
        double double9 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
// flaky "34) test1171(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8486769208711944d + "'", double8 == 0.8486769208711944d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double4 = fDistribution2.calculateNumericalVariance();
        boolean boolean5 = fDistribution2.isSupportLowerBoundInclusive();
        double double6 = fDistribution2.getSupportLowerBound();
        boolean boolean7 = fDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.cumulativeProbability(7.847827245153567E-4d);
        double double11 = fDistribution3.getSupportLowerBound();
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double double13 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.435082943715062E-15d + "'", double10 == 9.435082943715062E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.cumulativeProbability(0.44480373460545963d);
        double double12 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0794825972384381d + "'", double11 == 0.0794825972384381d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.627388726153098d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = fDistribution3.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "35) test1176(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.825730778003837d + "'", double8 == 0.825730778003837d);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.8733958735639842d, 1.7243389641593716d, 0.15729349752684074d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8288666534221298d, 0.25879486443701905d, 0.643622493856715d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.829) must be strictly less than upper bound (0.259)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution3.getNumericalVariance();
        double double9 = uniformRealDistribution3.probability(0.5881395489123649d, (double) (byte) 1);
        boolean boolean10 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double12 = uniformRealDistribution3.inverseCumulativeProbability(0.22693576719907352d);
        double double14 = uniformRealDistribution3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05428794722368846d) + "'", double4 == (-0.05428794722368846d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2981237622554617d + "'", double6 == 0.2981237622554617d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1603471985737681d + "'", double9 == 0.1603471985737681d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5287021546697624d + "'", double14 == 0.5287021546697624d);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6851772303251921d, 97.0d);
        double double3 = uniformRealDistribution2.getNumericalMean();
        double double5 = uniformRealDistribution2.cumulativeProbability(0.7757685011213045d);
        double double6 = uniformRealDistribution2.getNumericalMean();
        double double7 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 48.8425886151626d + "'", double3 == 48.8425886151626d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.40574547001456E-4d + "'", double5 == 9.40574547001456E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 48.8425886151626d + "'", double6 == 48.8425886151626d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 48.8425886151626d + "'", double7 == 48.8425886151626d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.24594400506499925d, 10.0d, 0.3801629465009775d);
        double double4 = fDistribution3.getNumericalMean();
        double double5 = fDistribution3.getSupportUpperBound();
        double double6 = fDistribution3.getSupportUpperBound();
        java.lang.Class<?> wildcardClass7 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.25d + "'", double4 == 1.25d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.9080987582593552d, 0.2734432380718119d, 0.8440247749668012d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1.908) must be strictly less than upper bound (0.273)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean9 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.sample();
        double double13 = fDistribution3.getSupportUpperBound();
        double double15 = fDistribution3.cumulativeProbability(1.7770475969029353d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "36) test1184(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6362501486590566d + "'", double7 == 0.6362501486590566d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
// flaky "6) test1184(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6247125608290222d + "'", double12 == 0.6247125608290222d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9250689230908029d + "'", double15 == 0.9250689230908029d);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7731402972800671d, 0.005079178874643258d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.773) must be strictly less than upper bound (0.005)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.8698200360851294d, 0.06180357785265267d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1.87) must be strictly less than upper bound (0.062)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        fDistribution3.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6976067833842337d, 0.02741148573788177d, 0.12452611167231531d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean5 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02741148573788177d + "'", double4 == 0.02741148573788177d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        boolean boolean4 = fDistribution2.isSupportConnected();
        double double6 = fDistribution2.cumulativeProbability(0.8173612375168122d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1137932949955843d + "'", double3 == 0.1137932949955843d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.19867162304173502d + "'", double6 == 0.19867162304173502d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.sample();
        double[] doubleArray12 = fDistribution3.sample((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "37) test1190(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.714871131159019d + "'", double7 == 2.714871131159019d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
// flaky "7) test1190(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7920480023859471d + "'", double10 == 0.7920480023859471d);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6155223357908637d, 0.7422678166643543d, 3.181009226124227E-44d);
        double double6 = fDistribution4.inverseCumulativeProbability(0.8914241055526231d);
        double double8 = fDistribution4.cumulativeProbability(0.7387842926428161d);
        double double10 = fDistribution4.density(0.5110297484389803d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 79.22498179657372d + "'", double6 == 79.22498179657372d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4926248524558115d + "'", double8 == 0.4926248524558115d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2257634547485477d + "'", double10 == 0.2257634547485477d);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.7935238495963384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7935238495963384d + "'", double9 == 0.7935238495963384d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.25879486443701905d, 2.5231573301479715d);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double5 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.5231573301479715d + "'", double5 == 2.5231573301479715d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        double double19 = uniformRealDistribution2.cumulativeProbability(0.0d, 0.7087523712937718d);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.449868410599899E16d, 0.0d, 1.8465563866412276d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double8 = uniformRealDistribution0.probability(2.554881495381541E-4d, 0.26637048650274964d);
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2661149983532115d + "'", double8 == 0.2661149983532115d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        boolean boolean7 = fDistribution3.isSupportConnected();
        double[] doubleArray9 = fDistribution3.sample((int) ' ');
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean11 = fDistribution3.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistribution3.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean9 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double11 = uniformRealDistribution2.probability((double) (short) 1);
        double double12 = uniformRealDistribution2.getSupportLowerBound();
        boolean boolean13 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(2.7171475092674E-46d, (double) 100L, 0.6121227109766438d);
        double double4 = fDistribution3.getSupportUpperBound();
        double double5 = fDistribution3.getNumericalMean();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0204081632653061d + "'", double5 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6155223357908637d, 0.7422678166643543d, 3.181009226124227E-44d);
        double double5 = fDistribution4.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistribution4.probability(0.97199803515683d, 0.7071737568021614d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.972) must be less than or equal to upper endpoint (0.707)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7422678166643543d + "'", double5 == 0.7422678166643543d);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6976067833842337d, 0.02741148573788177d, 0.12452611167231531d);
        double double5 = fDistribution3.density(0.24311283302854653d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.05042528486479626d + "'", double5 == 0.05042528486479626d);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.04127273732944947d, 0.6744716128097507d, 0.11659193530026048d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.35787217506960006d + "'", double4 == 0.35787217506960006d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(4.7120415909255865E-4d, 0.6060113752531858d);
        fDistribution2.reseedRandomGenerator((long) (byte) -1);
        double double5 = fDistribution2.getSupportLowerBound();
        double double6 = fDistribution2.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.19963923310118198d, 0.1093809887935191d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.2) must be strictly less than upper bound (0.109)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double8 = uniformRealDistribution0.density((double) 10.0f);
        double double10 = uniformRealDistribution0.cumulativeProbability(0.0065557735696384345d);
        boolean boolean11 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "38) test1205(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5161889038655243d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0065557735696384345d + "'", double10 == 0.0065557735696384345d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6177180781591378d + "'", double7 == 0.6177180781591378d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6069841742006401d, 0.3355483687840306d, 3.5564389998236723d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = uniformRealDistribution0.probability(0.9250689230908029d, 0.24757296507547633d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.925) must be less than or equal to upper endpoint (0.248)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.probability(0.7781754925699749d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution2.probability((double) 1L);
        double double9 = uniformRealDistribution2.getNumericalVariance();
        double double10 = uniformRealDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.8440247749668012d, 0.9250534915429347d, 0.0012523652574455647d);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6311055222038046d, 0.7661878357663297d);
        double double3 = uniformRealDistribution2.getNumericalMean();
        boolean boolean4 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6986466789850672d + "'", double3 == 0.6986466789850672d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (short) 0, 0.22157929090626016d, 0.6484267095499411d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        java.lang.Class<?> wildcardClass11 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "39) test1214(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.756481991206263d + "'", double9 == 0.756481991206263d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6957245310498591d, 0.3847773579137394d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.696) must be strictly less than upper bound (0.385)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.density(0.23541417210258242d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = uniformRealDistribution0.inverseCumulativeProbability(1.9137621789702195d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 1.914 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "40) test1216(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8753476696526026d + "'", double3 == 0.8753476696526026d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6715292022072981d, 0.4926248524558115d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.672) must be strictly less than upper bound (0.493)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        boolean boolean8 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "41) test1218(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9661374569753505d + "'", double4 == 0.9661374569753505d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.8733954553258896d, 0.098126171830621d);
        double double4 = uniformRealDistribution3.sample();
        boolean boolean5 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution3.cumulativeProbability((-0.9384008227635308d));
// flaky "42) test1220(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8131089854825838d + "'", double4 == 0.8131089854825838d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.sample();
        double double5 = uniformRealDistribution3.getSupportUpperBound();
// flaky "43) test1221(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.18961178633365128d + "'", double4 == 0.18961178633365128d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8914241055526231d + "'", double5 == 0.8914241055526231d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 100.0d, Double.POSITIVE_INFINITY, (double) (byte) 1);
        double double6 = uniformRealDistribution4.probability(2.3502599751932776d);
        double double7 = uniformRealDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double6 = fDistribution4.cumulativeProbability(0.08333333333333333d);
        double double7 = fDistribution4.getNumericalMean();
        double double8 = fDistribution4.getSupportUpperBound();
        double double9 = fDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(1.7517653400463083E31d, 6.006934970516585E-11d, 0.3164687886038654d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistribution3.cumulativeProbability(0.756481991206263d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: Continued fraction convergents failed to converge (in less than 2,147,483,647 iterations) for value 1");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.getNumericalVariance();
        boolean boolean10 = uniformRealDistribution2.isSupportConnected();
        double double11 = uniformRealDistribution2.sample();
        double double13 = uniformRealDistribution2.density(1.0E-6d);
        double double14 = uniformRealDistribution2.sample();
        boolean boolean15 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6057733616391782d, 16.0d);
        double double3 = uniformRealDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6057733616391782d + "'", double3 == 0.6057733616391782d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double5 = uniformRealDistribution0.getNumericalMean();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.9970061237457858d, 1.936120997106573d, 0.5110297484389803d);
        double double4 = fDistribution3.getNumericalMean();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.probability(0.0d);
        double double7 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.42837623120039037d, 2.565072426559519d, 0.0d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.getSupportUpperBound();
        java.lang.Class<?> wildcardClass5 = uniformRealDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) '4', (double) (byte) 1);
        double double3 = fDistribution2.getSupportUpperBound();
        double double4 = fDistribution2.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = uniformRealDistribution0.inverseCumulativeProbability(79.22498179657372d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 79.225 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "44) test1234(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2503479708342857d + "'", double3 == 0.2503479708342857d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        double double10 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        boolean boolean4 = uniformRealDistribution3.isSupportConnected();
        boolean boolean5 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getNumericalMean();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        uniformRealDistribution0.reseedRandomGenerator(0L);
        java.lang.Class<?> wildcardClass11 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getNumericalMean();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = uniformRealDistribution0.probability(2.0015015104803804d, 0.6121227109766438d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (2.002) must be less than or equal to upper endpoint (0.612)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability((-1.0d), (double) 1L);
        double double8 = fDistribution3.probability(1.0204081632653061d);
        double double10 = fDistribution3.probability(0.20210352455953284d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5509385983974154d + "'", double6 == 0.5509385983974154d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double12 = fDistribution3.density(0.6456794250754441d);
        double double14 = fDistribution3.cumulativeProbability(0.03787689908483127d);
        boolean boolean15 = fDistribution3.isSupportConnected();
        double double16 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8795956948503574d + "'", double12 == 0.8795956948503574d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.085190828896783E-6d + "'", double14 == 2.085190828896783E-6d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        boolean boolean18 = fDistribution3.isSupportLowerBoundInclusive();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5261349832949958d, 0.19272308027398632d, 88.41710856256726d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistribution3.cumulativeProbability(0.5730940342700588d, 0.4909797895169563d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.573) must be less than or equal to upper endpoint (0.491)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.19272308027398632d + "'", double4 == 0.19272308027398632d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6971549552183045d, 0.812268146222622d, 0.27747954593041024d);
        java.lang.Class<?> wildcardClass5 = uniformRealDistribution4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.density(0.1757939476207693d);
        java.lang.Class<?> wildcardClass8 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double13 = fDistribution3.inverseCumulativeProbability(0.3379957971411982d);
        double[] doubleArray15 = fDistribution3.sample((int) (short) 1);
        double double16 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6838714210807377d + "'", double13 == 0.6838714210807377d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(3.181009226124227E-44d, 0.07983844188212808d, 0.19565248788630019d);
        boolean boolean4 = uniformRealDistribution3.isSupportConnected();
        double double5 = uniformRealDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.311814001804952E-4d + "'", double5 == 5.311814001804952E-4d);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0549983883465619d, 2.6749582739594557d, 0.6851772303251921d);
        double double6 = uniformRealDistribution4.probability(0.6155223357908637d);
        double double7 = uniformRealDistribution4.getNumericalVariance();
        double double8 = uniformRealDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = uniformRealDistribution4.sample(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5720158168517273d + "'", double7 == 0.5720158168517273d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.6749582739594557d + "'", double8 == 2.6749582739594557d);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.17414656856247657d, 0.9155713525675118d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.9368714123469783d, 1.9770579032799154d, 3.5564389998236723d);
        double double5 = fDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean9 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double10 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getSupportLowerBound();
        double[] doubleArray12 = fDistribution3.sample((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        double double16 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "45) test1252(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.795720801316421d + "'", double4 == 0.795720801316421d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
// flaky "8) test1252(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.22452645101192847d + "'", double9 == 0.22452645101192847d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5796272011751153d + "'", double12 == 0.5796272011751153d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.7555588764194537d + "'", double15 == 0.7555588764194537d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-9d + "'", double16 == 1.0E-9d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(48.8425886151626d, 0.8343322941611049d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (48.843) must be strictly less than upper bound (0.834)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        double[] doubleArray19 = fDistribution3.sample((int) (short) 100);
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
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.0d, 0.11360916914773944d, 0.8679559444149998d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.4311546417502141d, 0.162363671352316d, 0.22693576719907352d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.431) must be strictly less than upper bound (0.162)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 2.565072426559519d, 0.6675243906670285d, 2.7171475092674E-46d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.565) must be strictly less than upper bound (0.668)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7756006906642181d, 0.9368714123469783d);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 11.264722442646567d, 0.7697131649614974d, 0.5852105805908725d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (11.265) must be strictly less than upper bound (0.77)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double12 = fDistribution3.cumulativeProbability(1.0d, 3.5564389998236723d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistribution3.probability(0.8679559444149998d, 0.571722443513744d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.868) must be less than or equal to upper endpoint (0.572)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.4485770812615808d + "'", double12 == 0.4485770812615808d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        double double5 = uniformRealDistribution3.sample();
        double double7 = uniformRealDistribution3.density(0.16828719233216982d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05428794722368846d) + "'", double4 == (-0.05428794722368846d));
// flaky "46) test1263(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.3641291805958689d) + "'", double5 == (-0.3641291805958689d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5287021546697624d + "'", double7 == 0.5287021546697624d);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double10 = fDistribution3.cumulativeProbability((double) (short) 0, 0.5d);
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        double[] doubleArray13 = fDistribution3.sample((int) '4');
        double double14 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistribution3.probability(0.49243638758254615d, 0.4401987088786399d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.492) must be less than or equal to upper endpoint (0.44)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1137932949955843d + "'", double10 == 0.1137932949955843d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double12 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double4 = uniformRealDistribution0.density(10.0d);
        double double5 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.sample();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "47) test1266(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.03202491175692046d + "'", double5 == 0.03202491175692046d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
// flaky "9) test1266(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2948898927251282d + "'", double7 == 0.2948898927251282d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.24594400506499925d, 0.559025207971324d, 0.7387842926428161d);
        double double5 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            uniformRealDistribution4.reseedRandomGenerator((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7387842926428161d + "'", double5 == 0.7387842926428161d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.559025207971324d + "'", double6 == 0.559025207971324d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double double4 = fDistribution2.getSolverAbsoluteAccuracy();
        double double5 = fDistribution2.getNumericalMean();
        double double6 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution2.density(0.5287021546697624d);
        double double10 = fDistribution2.calculateNumericalVariance();
        double double12 = fDistribution2.cumulativeProbability(0.5706868526619999d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0204081632653061d + "'", double5 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.31543641316713045d + "'", double9 == 0.31543641316713045d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.463149570621243d + "'", double10 == 3.463149570621243d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6254849662761371d + "'", double12 == 0.6254849662761371d);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.49979110665733484d, 50.38759066622216d, 0.2872598481744745d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        double[] doubleArray17 = uniformRealDistribution0.sample(100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "48) test1270(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6298895737356116d + "'", double4 == 0.6298895737356116d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) '4', (double) (byte) 1);
        double double3 = fDistribution2.getSupportUpperBound();
        double double4 = fDistribution2.getSupportLowerBound();
        double double5 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double6 = fDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0d, 0.6975449779484513d, 0.5415785819031833d);
        double double6 = uniformRealDistribution4.density(0.0705619273799758d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.4335993113176713d + "'", double6 == 1.4335993113176713d);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        double double8 = uniformRealDistribution0.sample();
        double double10 = uniformRealDistribution0.density(0.8149956987540343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
// flaky "49) test1273(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4328973947488999d + "'", double8 == 0.4328973947488999d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.5287021546697624d, 0.7242271614443259d, 0.6089308656102914d);
        double double5 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6089308656102914d + "'", double5 == 0.6089308656102914d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6344289629316082d, 0.3950265555381154d, 0.27645850507952763d);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double3 = uniformRealDistribution2.getNumericalVariance();
        double double5 = uniformRealDistribution2.density(0.9494026041150856d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6901712953686285d, 5.769699484291669d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        double double13 = uniformRealDistribution0.inverseCumulativeProbability(0.9668954331842876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "50) test1278(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6045677334166981d + "'", double4 == 0.6045677334166981d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "10) test1278(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2605951837511207d + "'", double8 == 0.2605951837511207d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9028380243284497d + "'", double11 == 0.9028380243284497d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9668954331842876d + "'", double13 == 0.9668954331842876d);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        boolean boolean5 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.cumulativeProbability(100.0d);
        double double8 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double10 = uniformRealDistribution2.density(0.704243793552324d);
        double double12 = uniformRealDistribution2.density((-0.9457891641483526d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.0E-6d, 0.9787873837142649d);
        double double3 = uniformRealDistribution2.getNumericalMean();
        double double4 = uniformRealDistribution2.sample();
        boolean boolean5 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = uniformRealDistribution2.cumulativeProbability(0.929362703527262d, 0.644788466238158d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.929) must be less than or equal to upper endpoint (0.645)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.48939419185713245d + "'", double3 == 0.48939419185713245d);
// flaky "51) test1280(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11160147235353078d + "'", double4 == 0.11160147235353078d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.density(0.1757939476207693d);
        double[] doubleArray9 = uniformRealDistribution0.sample(10);
        boolean boolean10 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution0.cumulativeProbability(100.0d);
        double double13 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
// flaky "52) test1282(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.04886566531922831d, 0.25066780058885696d, 0.4215519647804824d, 0.7342753458315274d, 0.11372629919052102d, 0.7288532216986792d, 0.7495829421571147d, 0.19294443754050428d, 0.49366532197858515d, 0.13283161662571175d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(2.7315794211831745d, 0.09093787185702049d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.732) must be strictly less than upper bound (0.091)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean10 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.8733954553258896d, 0.098126171830621d);
        double double4 = uniformRealDistribution3.sample();
        boolean boolean5 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution3.sample();
// flaky "53) test1285(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.480841375333061d + "'", double4 == 0.480841375333061d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "11) test1285(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.148287320873074d + "'", double6 == 0.148287320873074d);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.probability(0.3416260639338622d);
        double double12 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.0d, 0.5293332757484572d, 0.17603004168266123d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 100.0d, Double.POSITIVE_INFINITY, (double) (byte) 1);
        double double6 = uniformRealDistribution4.probability(2.3502599751932776d);
        boolean boolean7 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double9 = uniformRealDistribution4.cumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = uniformRealDistribution4.inverseCumulativeProbability(0.5326816606973473d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [?, ?]");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.49884479899047296d, 0.6177180781591378d, 0.6167715285164661d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.getNumericalVariance();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6177180781591378d + "'", double4 == 0.6177180781591378d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 10);
        fDistribution3.reseedRandomGenerator((long) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "54) test1290(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.6651538220005575d, 2.190092836728927d, 0.7880664512235416d, 0.712438911276696d, 0.85097785404463d, 3.412354392138869d, 1.7289945312725474d, 0.5915029632568809d, 1.7413310702672737d, 0.7465451713533335d }, 1.0E-15);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6423692454313521d, 0.09351912098798598d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.sample();
        double double9 = uniformRealDistribution2.probability(0.07983844188212808d);
        java.lang.Class<?> wildcardClass10 = uniformRealDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.cumulativeProbability(0.7938684212191616d);
        double double5 = uniformRealDistribution2.getSupportLowerBound();
        double double6 = uniformRealDistribution2.getNumericalMean();
        double double7 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution2.probability(0.6167715285164661d);
        double double10 = uniformRealDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 2.5231573301479715d, 0.7660596819940226d, 0.7685775863542659d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.523) must be strictly less than upper bound (0.766)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.calculateNumericalVariance();
        java.lang.Class<?> wildcardClass9 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double4 = uniformRealDistribution0.density(10.0d);
        double double5 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.sample();
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "55) test1296(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4080551181879397d + "'", double5 == 0.4080551181879397d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
// flaky "12) test1296(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5890408359381196d + "'", double7 == 0.5890408359381196d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getSolverAbsoluteAccuracy();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double12 = fDistribution3.getSupportLowerBound();
        boolean boolean13 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.9258528539967332d, 0.0705619273799758d, 3.4708697385508454d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.926) must be strictly less than upper bound (0.071)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        java.lang.Class<?> wildcardClass6 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        double double19 = fDistribution3.cumulativeProbability(0.1211897904390418d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "56) test1301(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7228915741942088d + "'", double7 == 0.7228915741942088d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.7999128984995706E-4d + "'", double19 == 4.7999128984995706E-4d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistribution3.cumulativeProbability(0.528938345987136d, 4.711194252818312E-227d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.529) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution4.getSupportLowerBound();
        double double10 = fDistribution4.cumulativeProbability((double) (short) -1, 0.9999999999758308d);
        double double11 = fDistribution4.calculateNumericalVariance();
        double double13 = fDistribution4.cumulativeProbability(0.27274084207236093d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4999999999999701d + "'", double10 == 0.4999999999999701d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.49842935128655824d + "'", double13 == 0.49842935128655824d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double7 = fDistribution4.cumulativeProbability((double) (short) -1, 0.0d);
        boolean boolean8 = fDistribution4.isSupportConnected();
        boolean boolean9 = fDistribution4.isSupportUpperBoundInclusive();
        double double11 = fDistribution4.density(0.3036689686928481d);
        double double12 = fDistribution4.calculateNumericalVariance();
        double double13 = fDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.46305340330512307d + "'", double11 == 0.46305340330512307d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        uniformRealDistribution0.reseedRandomGenerator(1L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        double double14 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9594901573103976d + "'", double12 == 0.9594901573103976d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6852677852739119d, 0.8394001527753516d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 1, 9.435082943715062E-15d, 0.7627482092423561d);
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6375566323163637d, 0.8465099057706973d, 0.10917347757783191d);
        double double5 = uniformRealDistribution3.density(1.25d);
        double double6 = uniformRealDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
// flaky "57) test1309(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8419851292030001d + "'", double6 == 0.8419851292030001d);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.1623586333720101d, 0.7928067872931985d, 0.44480373460545963d);
        double double5 = fDistribution4.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7928067872931985d + "'", double5 == 0.7928067872931985d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(9.435082943715062E-15d, (double) 100.0f);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        double[] doubleArray5 = fDistribution2.sample(100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.435082943715062E-15d + "'", double3 == 9.435082943715062E-15d);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.24594400506499925d, 0.559025207971324d, 0.7387842926428161d);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.559025207971324d + "'", double5 == 0.559025207971324d);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.probability(0.6541717467536889d);
        double double8 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.11133083022476167d, 0.11480653091901427d, 0.4260602491249563d);
        double double4 = uniformRealDistribution3.sample();
// flaky "58) test1314(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11339062235096337d + "'", double4 == 0.11339062235096337d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.getNumericalMean();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double11 = fDistribution3.density(0.7948236153171645d);
        double double12 = fDistribution3.getNumericalVariance();
        double double13 = fDistribution3.getNumericalVariance();
        boolean boolean14 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9391513127071319d + "'", double11 == 0.9391513127071319d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double10 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "59) test1317(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.4527553180663855d + "'", double7 == 3.4527553180663855d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7178690144889397d, 0.8354713638140709d);
        double double3 = uniformRealDistribution2.getSupportUpperBound();
        double double5 = uniformRealDistribution2.inverseCumulativeProbability(0.3904156731971007d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8354713638140709d + "'", double3 == 0.8354713638140709d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7637828148702714d + "'", double5 == 0.7637828148702714d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistribution3.cumulativeProbability(0.7883955810914687d, 0.004593672104456159d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.788) must be less than or equal to upper endpoint (0.005)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "60) test1319(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6451416502431065d + "'", double9 == 0.6451416502431065d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(6.941941680452812d, 0.9195016681888635d, 0.5885406925183827d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) 0, (double) (byte) 1, 0.2972162083012442d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        double double5 = uniformRealDistribution3.getSupportUpperBound();
        double double6 = uniformRealDistribution3.getSupportLowerBound();
        double[] doubleArray8 = uniformRealDistribution3.sample((int) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.density((double) '#');
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        double double11 = fDistribution3.density(0.8493872319532485d);
        double double12 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean13 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean14 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.562099861400877E-28d + "'", double8 == 7.562099861400877E-28d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9280868261112525d + "'", double11 == 0.9280868261112525d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 100.0d, Double.POSITIVE_INFINITY, (double) (byte) 1);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        double double6 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 97.0d, 0.6851772303251921d, 0.6814622736361124d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (97) must be strictly less than upper bound (0.685)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.1211897904390418d, 0.27979062919809317d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) 0, (double) (byte) 1, 0.2972162083012442d);
        boolean boolean4 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution3.cumulativeProbability(0.8316414377397279d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8316414377397279d + "'", double6 == 0.8316414377397279d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6391854256750903d, 0.769221584666441d, 0.1623586333720101d);
        double double4 = fDistribution3.sample();
        double[] doubleArray6 = fDistribution3.sample((int) (short) 10);
        double double9 = fDistribution3.probability(0.12402951146545438d, 0.6975449779484513d);
// flaky "61) test1327(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
// flaky "13) test1327(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.95483655658596d, 0.0d, 0.25d, 54.13211496494471d, 27.17651172918983d, 56.284466731766585d, 15.607004775821764d, 0.31999414294730516d, 1.4084519722098878d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1866673733811775d + "'", double9 == 0.1866673733811775d);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.018633179976316d, 0.05377779110409109d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1.019) must be strictly less than upper bound (0.054)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        java.lang.Class<?> wildcardClass13 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "62) test1329(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3880433638201779d + "'", double3 == 0.3880433638201779d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
// flaky "14) test1329(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.046729609392789806d + "'", double6 == 0.046729609392789806d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.181009226124227E-44d + "'", double8 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-9d + "'", double10 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.2527658588258392d, 0.6023625222226008d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double6 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.sample();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "63) test1331(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7354489884805859d + "'", double3 == 0.7354489884805859d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
// flaky "15) test1331(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7609283074774329d + "'", double6 == 0.7609283074774329d);
// flaky "3) test1331(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7128182621152339d + "'", double7 == 0.7128182621152339d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        double double5 = uniformRealDistribution3.getSupportUpperBound();
        double double7 = uniformRealDistribution3.probability(0.7167893764850413d);
        double double8 = uniformRealDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05428794722368846d) + "'", double4 == (-0.05428794722368846d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8914241055526231d + "'", double5 == 0.8914241055526231d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.05428794722368846d) + "'", double8 == (-0.05428794722368846d));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.density(0.9999999999758308d);
        double double10 = uniformRealDistribution0.density(0.7436286614640185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "64) test1333(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4646042977238032d + "'", double4 == 0.4646042977238032d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5388621902004562d, 0.3973197439265692d);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean7 = uniformRealDistribution2.isSupportConnected();
        double double8 = uniformRealDistribution2.sample();
        boolean boolean9 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6119517974962971d, 0.1130006476062561d, 0.6179218618063023d);
        double double4 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6179218618063023d + "'", double4 == 0.6179218618063023d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.9195016681888635d, 0.48609732521532956d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.92) must be strictly less than upper bound (0.486)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "65) test1338(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7542279577638068d + "'", double7 == 0.7542279577638068d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
// flaky "16) test1338(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7431722960525575d + "'", double10 == 0.7431722960525575d);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.getNumericalMean();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double11 = fDistribution3.density(0.7948236153171645d);
        double double12 = fDistribution3.getSupportUpperBound();
        double double13 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9391513127071319d + "'", double11 == 0.9391513127071319d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0d, 6.006934970516585E-11d, 6.006934970516585E-11d);
        double double5 = uniformRealDistribution4.getNumericalVariance();
        double double6 = uniformRealDistribution4.getNumericalMean();
        double double8 = uniformRealDistribution4.inverseCumulativeProbability(0.6871922204502834d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0069389783345903E-22d + "'", double5 == 3.0069389783345903E-22d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0034674852582924E-11d + "'", double6 == 3.0034674852582924E-11d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0034674852582924E-11d + "'", double8 == 3.0034674852582924E-11d);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double8 = uniformRealDistribution0.density((double) 10.0f);
        double double9 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean10 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double11 = uniformRealDistribution0.getNumericalVariance();
        double[] doubleArray13 = uniformRealDistribution0.sample((int) '#');
        boolean boolean14 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "66) test1341(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.008398308840969593d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08333333333333333d + "'", double11 == 0.08333333333333333d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.4909797895169563d, 0.5711493800797895d, 0.8772641729621682d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        double double6 = fDistribution3.getNumericalMean();
        double double7 = fDistribution3.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistribution3.cumulativeProbability(0.5733968575051716d, 0.4896234655149419d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.573) must be less than or equal to upper endpoint (0.49)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0210526315789474d + "'", double6 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        uniformRealDistribution0.reseedRandomGenerator(10L);
        double double5 = uniformRealDistribution0.density(0.6371742875919058d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(10.0d, 0.6391854256750903d);
        double double4 = fDistribution2.probability(0.5943978209556575d);
        double double6 = fDistribution2.density(0.1130006476062561d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3971061244175023d + "'", double6 == 0.3971061244175023d);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.16434538054434356d, 0.43887695931896076d);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.43887695931896076d + "'", double3 == 0.43887695931896076d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6121227109766438d, 2.3125942498560286d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double5 = fDistribution2.cumulativeProbability(0.0d);
        double double6 = fDistribution2.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
// flaky "67) test1347(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.5406071591967148E-5d + "'", double6 == 1.5406071591967148E-5d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.449868410599931E16d, 0.6155223357908637d);
        double double4 = fDistribution2.probability(0.6971549552183045d);
        boolean boolean5 = fDistribution2.isSupportLowerBoundInclusive();
        double double6 = fDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100L, 0.3321070505100212d, 0.08333333333333333d);
        double double5 = fDistribution4.calculateNumericalVariance();
        boolean boolean6 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean10 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double11 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double12 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-9d + "'", double11 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        double[] doubleArray4 = uniformRealDistribution0.sample((int) (byte) 1);
        double double6 = uniformRealDistribution0.density(1.0E-9d);
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "68) test1351(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.7945311621734041d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(2.7171475092674E-46d, 0.46610719236426323d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = uniformRealDistribution0.probability(0.9277715961927422d, 0.015619490434989225d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.928) must be less than or equal to upper endpoint (0.016)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "69) test1353(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03278275077529691d + "'", double4 == 0.03278275077529691d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        boolean boolean6 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double10 = uniformRealDistribution2.cumulativeProbability(0.8914306597714141d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator(100L);
        double double13 = fDistribution3.getNumericalMean();
        double double15 = fDistribution3.cumulativeProbability(0.15073071950739525d);
        boolean boolean16 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0012523652574455647d + "'", double15 == 0.0012523652574455647d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.36060793522756507d, 0.4896234655149419d, 1.7067073534736648d);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.sample();
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
// flaky "70) test1358(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6337093183317579d + "'", double11 == 0.6337093183317579d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.getSolverAbsoluteAccuracy();
        double double7 = fDistribution4.getSupportLowerBound();
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5190573322162404d + "'", double6 == 0.5190573322162404d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double[] doubleArray9 = fDistribution3.sample((int) '4');
        double double10 = fDistribution3.calculateNumericalVariance();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getNumericalVariance();
        double double13 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.probability(0.5662656190788444d);
        boolean boolean10 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution2.probability(1.936120997106573d);
        boolean boolean13 = uniformRealDistribution2.isSupportConnected();
        double double14 = uniformRealDistribution2.getNumericalMean();
        double double15 = uniformRealDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.4999014899032976d, 0.7627482092423561d, 2.92890095325051d);
        double double6 = fDistribution4.cumulativeProbability(36.22126828088923d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8690995197621648d + "'", double6 == 0.8690995197621648d);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5190573322162404d, 0.7283674369075639d);
        double double3 = fDistribution2.getNumericalVariance();
        boolean boolean4 = fDistribution2.isSupportConnected();
        double double5 = fDistribution2.getSupportUpperBound();
        boolean boolean6 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.653180688712043d, 1.8963851205217543d, 0.7627482092423561d);
        double double6 = fDistribution4.density(0.7948236153171645d);
        double double8 = fDistribution4.cumulativeProbability(0.1245261116723153d);
        double double9 = fDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.19312604306893894d + "'", double6 == 0.19312604306893894d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.34469863524271394d + "'", double8 == 0.34469863524271394d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.2222423768883306d, 0.24952550835226206d, 0.048161091562381575d);
        // The following exception was thrown during execution in test generation
        try {
            uniformRealDistribution4.reseedRandomGenerator((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double7 = fDistribution4.cumulativeProbability((double) (short) -1, 0.0d);
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        boolean boolean9 = fDistribution4.isSupportLowerBoundInclusive();
        double double10 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double12 = fDistribution3.getNumericalMean();
        double double14 = fDistribution3.cumulativeProbability(0.6391854256750903d);
        boolean boolean15 = fDistribution3.isSupportUpperBoundInclusive();
        double double17 = fDistribution3.density(2.8155024411648446d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0210526315789474d + "'", double12 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2230878854254442d + "'", double14 == 0.2230878854254442d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.011982925949185009d + "'", double17 == 0.011982925949185009d);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.22929074613677172d, 0.36915534168671216d, 0.9002468344505423d);
        double double4 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution3.getNumericalVariance();
        double double9 = uniformRealDistribution3.probability(0.5881395489123649d, (double) (byte) 1);
        boolean boolean10 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double12 = uniformRealDistribution3.inverseCumulativeProbability(0.22693576719907352d);
        double double13 = uniformRealDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05428794722368846d) + "'", double4 == (-0.05428794722368846d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2981237622554617d + "'", double6 == 0.2981237622554617d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1603471985737681d + "'", double9 == 0.1603471985737681d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
// flaky "71) test1369(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.749061208741136d) + "'", double13 == (-0.749061208741136d));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.sample();
        boolean boolean13 = fDistribution3.isSupportConnected();
        boolean boolean14 = fDistribution3.isSupportConnected();
        double double16 = fDistribution3.probability(0.7212539665163964d);
        double double17 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "72) test1370(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.729191416410976d + "'", double7 == 1.729191416410976d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
// flaky "17) test1370(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7769021335961291d + "'", double12 == 0.7769021335961291d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.23541417210258242d + "'", double17 == 0.23541417210258242d);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5261349832949958d, 0.19272308027398632d, 88.41710856256726d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 2.4231364910490942d, 0.5979749018514485d, 0.9694868433053876d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.423) must be strictly less than upper bound (0.598)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.0d, 2.554881495381541E-4d, 0.5622919087669369d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        double double17 = fDistribution3.getNumericalVariance();
        double double18 = fDistribution3.getNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.23541417210258242d + "'", double18 == 0.23541417210258242d);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.4305311550927289d, 0.4311546417502141d);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6360891376804074d, 0.880378177759152d);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        double double8 = uniformRealDistribution0.probability(0.4999014899032976d);
        boolean boolean9 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "73) test1377(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6360835192410275d + "'", double4 == 0.6360835192410275d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.probability((double) 100);
        double double9 = fDistribution3.cumulativeProbability(2.4980016587511606d, (double) 10L);
        double double11 = fDistribution3.density(0.9450739500126666d);
        double double12 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.010322138824075844d + "'", double9 == 0.010322138824075844d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8774681461278796d + "'", double11 == 0.8774681461278796d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.1757939476207693d, 2.92890095325051d, 0.0012889459524991036d);
        boolean boolean4 = uniformRealDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability((double) 10);
        double double13 = fDistribution3.inverseCumulativeProbability(0.3379957971411982d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistribution3.probability(0.6413832718094756d, 0.012344840083442792d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.641) must be less than or equal to upper endpoint (0.012)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6838714210807377d + "'", double13 == 0.6838714210807377d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        double double9 = uniformRealDistribution0.density(2.411134735694189d);
        boolean boolean10 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.density(7.847827245153567E-4d);
        double double9 = uniformRealDistribution0.density(0.0d);
        double double10 = uniformRealDistribution0.getSupportLowerBound();
        double double11 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6816887241831449d, 0.7751813324443158d, 1.0204081632653061d);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6553695282217037d, 0.7573235535633357d, 0.1882454026529332d);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6553695282217037d + "'", double4 == 0.6553695282217037d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7573235535633357d + "'", double6 == 0.7573235535633357d);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6697212440760503d, 0.7935238495963384d, 1.7243389641593716d);
        double double5 = uniformRealDistribution4.getNumericalMean();
        boolean boolean6 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7316225468361943d + "'", double5 == 0.7316225468361943d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.39900144630124035d, 0.5900933138947044d, 0.8261884996349109d);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double4 = fDistribution2.calculateNumericalVariance();
        double double5 = fDistribution2.calculateNumericalVariance();
        double double8 = fDistribution2.cumulativeProbability(0.17836413844857746d, 0.544127331049072d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.045272958052451656d + "'", double8 == 0.045272958052451656d);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(1.936120997106573d, 0.8146244847519797d, 0.0d);
        java.lang.Class<?> wildcardClass4 = fDistribution3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.2874482437294174E-5d, 17.462358968672483d);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        double double16 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "74) test1391(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6136784866000506d + "'", double7 == 0.6136784866000506d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.8155649719352942d + "'", double9 == 1.8155649719352942d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.933517426050187d + "'", double11 == 0.933517426050187d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8998695148900057d + "'", double15 == 0.8998695148900057d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.7080848333942735d, (double) (short) 1);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.density(1.449868410599931E16d);
        double double8 = uniformRealDistribution0.sample();
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double[] doubleArray11 = uniformRealDistribution0.sample((int) (byte) 100);
        double double13 = uniformRealDistribution0.cumulativeProbability(0.048161091562381575d);
        double double14 = uniformRealDistribution0.getNumericalVariance();
        double double16 = uniformRealDistribution0.inverseCumulativeProbability(0.571722443513744d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = uniformRealDistribution0.probability(0.6423460469744984d, 3.746475778452671E-4d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.642) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "75) test1393(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.26304325770198544d + "'", double3 == 0.26304325770198544d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "18) test1393(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7659332132301198d + "'", double8 == 0.7659332132301198d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.048161091562381575d + "'", double13 == 0.048161091562381575d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08333333333333333d + "'", double14 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.571722443513744d + "'", double16 == 0.571722443513744d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        boolean boolean6 = fDistribution4.isSupportLowerBoundInclusive();
        double double7 = fDistribution4.getSupportLowerBound();
        boolean boolean8 = fDistribution4.isSupportUpperBoundInclusive();
        double double9 = fDistribution4.getSupportLowerBound();
        boolean boolean10 = fDistribution4.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistribution4.cumulativeProbability(0.5833175443847145d, 1.0E-9d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.583) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.2522324101367044d, 0.7702065322674672d, 0.708557128981428d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.cumulativeProbability(0.6140485448030906d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "76) test1396(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4353682638209766d + "'", double3 == 0.4353682638209766d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6140485448030906d + "'", double5 == 0.6140485448030906d);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.0018820678494252396d, 42.375350078399514d, 0.3081113430701268d);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6274561739850819d, (double) (short) 100, 0.8465099057706973d);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        double double19 = fDistribution3.density((-0.11983222114531328d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9316998175652447d + "'", double16 == 0.9316998175652447d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        boolean boolean6 = fDistribution3.isSupportConnected();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
// flaky "77) test1400(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7446452407647994d + "'", double8 == 0.7446452407647994d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.0d, 0.544127331049072d, 0.0d);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution4.density(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        double double8 = uniformRealDistribution0.sample();
        double double10 = uniformRealDistribution0.density(0.003697202081757389d);
        double double12 = uniformRealDistribution0.probability(0.8143049096704447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "78) test1402(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23219095794011113d + "'", double8 == 0.23219095794011113d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.0d, 0.19075927645340612d, 1.7096837024533937d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        boolean boolean6 = fDistribution4.isSupportLowerBoundInclusive();
        double double7 = fDistribution4.getSupportLowerBound();
        double double8 = fDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7387842926428161d, 0.9382068481430984d);
        double double3 = uniformRealDistribution2.getSupportUpperBound();
        double double5 = uniformRealDistribution2.density(0.9736694951866904d);
        boolean boolean6 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9382068481430984d + "'", double3 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.cumulativeProbability((double) 1L, (double) 10L);
        double double10 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double11 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44906140157841534d + "'", double9 == 0.44906140157841534d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7071737568021614d, 0.7882516988592704d, 0.07277703352123166d);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7882516988592704d + "'", double5 == 0.7882516988592704d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.35787217506960006d, 0.03837388900144334d);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double7 = fDistribution3.density(0.1757939476207693d);
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        java.lang.Class<?> wildcardClass9 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6456794250754441d + "'", double7 == 0.6456794250754441d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution4.getSupportLowerBound();
        boolean boolean8 = fDistribution4.isSupportUpperBoundInclusive();
        double double9 = fDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalMean();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5d + "'", double2 == 0.5d);
// flaky "79) test1411(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6897400680476078d + "'", double3 == 0.6897400680476078d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.34981193815125994d, 1.891638138522826d);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        double double14 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "80) test1413(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5872312916136835d + "'", double3 == 0.5872312916136835d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "19) test1413(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5925225075039293d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.061737695248744506d + "'", double11 == 0.061737695248744506d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08333333333333333d + "'", double14 == 0.08333333333333333d);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(1.7411009838609295d, 0.22906287917093865d, 2.4112990379657004d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1.741) must be strictly less than upper bound (0.229)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.49884479899047296d, 1.0d, (double) 1.0f);
        java.lang.Class<?> wildcardClass5 = fDistribution4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.864751955633795d, (double) (short) 10, 0.864751955633795d);
        boolean boolean5 = fDistribution4.isSupportLowerBoundInclusive();
        double double6 = fDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.864751955633795d + "'", double6 == 0.864751955633795d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0012523652574455647d, 0.7941015035099954d, 1.7517653400463083E31d);
        double double6 = uniformRealDistribution4.inverseCumulativeProbability(0.7148009574548317d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3976769343837205d + "'", double6 == 0.3976769343837205d);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.density(1.449868410599931E16d);
        double double8 = uniformRealDistribution0.sample();
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double[] doubleArray11 = uniformRealDistribution0.sample((int) (byte) 100);
        double double12 = uniformRealDistribution0.getSupportLowerBound();
        double double13 = uniformRealDistribution0.sample();
        double double15 = uniformRealDistribution0.cumulativeProbability(0.24960909722112823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "81) test1418(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8115906487848945d + "'", double3 == 0.8115906487848945d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "20) test1418(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5916847253761635d + "'", double8 == 0.5916847253761635d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
// flaky "4) test1418(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6845893808238659d + "'", double13 == 0.6845893808238659d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.24960909722112823d + "'", double15 == 0.24960909722112823d);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution4.getSolverAbsoluteAccuracy();
        double double9 = fDistribution4.density(2.565072426559519d);
        // The following exception was thrown during execution in test generation
        try {
            fDistribution4.reseedRandomGenerator((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.7120415909255865E-4d + "'", double9 == 4.7120415909255865E-4d);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.density(0.27645850507952763d);
        double double11 = fDistribution3.cumulativeProbability(2.565072426559519d);
        java.lang.Class<?> wildcardClass12 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.20658800921437645d + "'", double9 == 0.20658800921437645d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9914737160738617d + "'", double11 == 0.9914737160738617d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6551287109680011d, 0.6852677852739119d, 0.22906287917093865d);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        boolean boolean12 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double13 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "82) test1422(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12653924838180908d + "'", double4 == 0.12653924838180908d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.inverseCumulativeProbability(0.11365223848413353d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(2.654819023133747d, 0.6627930174442738d, 0.4080551181879397d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.655) must be strictly less than upper bound (0.663)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8354713638140709d, 0.9966872852742321d, (double) 100.0f);
        boolean boolean5 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution4.density(0.0018820678494252396d);
        double double8 = uniformRealDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9966872852742321d + "'", double8 == 0.9966872852742321d);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.39731286652410236d, 0.4970347455175399d, 0.09547185972488115d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.38156436732833804d, 0.3576355601294874d, 3.514432656164581d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.382) must be strictly less than upper bound (0.358)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.cumulativeProbability((-1.0d), (double) ' ');
        double double10 = uniformRealDistribution0.sample();
        java.lang.Class<?> wildcardClass11 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
// flaky "83) test1428(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.47788018459274917d + "'", double10 == 0.47788018459274917d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.9754387177260426d, 0.9028380243284497d, 0.162363671352316d);
        double double5 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.density(0.2395389662180223d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5071904536155625d + "'", double7 == 0.5071904536155625d);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5608032501170599d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSupportLowerBound();
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getNumericalMean();
        double double8 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.7283674369075639d, 0.5190573322162404d);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double double4 = fDistribution2.getNumericalMean();
        double double5 = fDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.15022081309557334d, (double) 10.0f, 0.860553443468296d);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.0d, 0.7018267647389225d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "84) test1437(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5725836976550815d + "'", double3 == 0.5725836976550815d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(2.7171475092674E-46d, (double) 100L, 0.6121227109766438d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.cumulativeProbability(1.800541962827582d);
        java.lang.Class<?> wildcardClass8 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0d, 0.1130006476062561d, 0.0d);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution0.getNumericalMean();
        double double5 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
// flaky "85) test1440(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8938642001986159d + "'", double5 == 0.8938642001986159d);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.4646042977238032d, 0.7637828148702714d);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.1320725215067027d, 0.23975277882876944d, 0.7668626617388581d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7167893764850413d, 0.06241157345512549d, 0.44906140157841534d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.717) must be strictly less than upper bound (0.062)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.sample();
        double double10 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "86) test1444(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6923972148186575d + "'", double4 == 0.6923972148186575d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
// flaky "21) test1444(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9239517853648118d + "'", double9 == 0.9239517853648118d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.getNumericalVariance();
        double double14 = fDistribution3.inverseCumulativeProbability(0.5190573322162404d);
        double double15 = fDistribution3.getSupportUpperBound();
        double double16 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "87) test1446(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7625534595104149d + "'", double14 == 0.7625534595104149d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.9754387177260426d, 0.9028380243284497d, 0.162363671352316d);
        double double5 = fDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = fDistribution4.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportConnected();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.getNumericalVariance();
        double double11 = uniformRealDistribution0.cumulativeProbability(0.49174310649001063d);
        double double12 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "88) test1448(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3159316714788345d + "'", double3 == 0.3159316714788345d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
// flaky "22) test1448(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6531302541899682d + "'", double7 == 0.6531302541899682d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.49174310649001063d + "'", double11 == 0.49174310649001063d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 7.562099861400877E-28d, 0.9280868261112525d, 0.6089308656102914d);
        double double5 = fDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = fDistribution4.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.23125697402288498d, 0.6957245310498591d, 0.7938684212191616d);
        boolean boolean4 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0d, 0.649264037108904d, 0.6716735566035337d);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5190573322162404d, 0.7283674369075639d);
        double double3 = fDistribution2.getNumericalVariance();
        boolean boolean4 = fDistribution2.isSupportConnected();
        boolean boolean5 = fDistribution2.isSupportUpperBoundInclusive();
        double double6 = fDistribution2.calculateNumericalVariance();
        double double8 = fDistribution2.probability(0.33018303903031d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        double double8 = uniformRealDistribution0.density(0.4795363571652773d);
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "89) test1453(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6789674280174809d + "'", double4 == 0.6789674280174809d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        double double4 = fDistribution2.inverseCumulativeProbability(0.8733954553258896d);
        double double5 = fDistribution2.getNumericalMean();
        boolean boolean6 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.4725239789609064d + "'", double4 == 2.4725239789609064d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0204081632653061d + "'", double5 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8354713638140709d, 0.9966872852742321d, (double) 100.0f);
        boolean boolean5 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution4.probability(0.36060793522756507d, 0.6916856290446507d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = uniformRealDistribution4.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        double double8 = uniformRealDistribution0.density(0.19075927645340612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "90) test1456(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.858258863815418d + "'", double4 == 0.858258863815418d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistribution3.cumulativeProbability(0.6976067833842337d, 0.1142703865206316d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.698) must be less than or equal to upper endpoint (0.114)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7321452279378763d, 0.98707287595118d);
        double double3 = uniformRealDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.005415675476799573d + "'", double3 == 0.005415675476799573d);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        java.lang.Class<?> wildcardClass16 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5190573322162404d, 0.7283674369075639d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        boolean boolean4 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getNumericalMean();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        double double14 = fDistribution3.cumulativeProbability(0.0d);
        boolean boolean15 = fDistribution3.isSupportLowerBoundInclusive();
        double double16 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.5733968575051716d, 0.8743111069910592d, 5.964322516717098E-6d);
        double double5 = fDistribution4.calculateNumericalVariance();
        double double6 = fDistribution4.getNumericalVariance();
        boolean boolean7 = fDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6375566323163637d, 0.8465099057706973d, 0.10917347757783191d);
        double double4 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution3.isSupportConnected();
        double double7 = uniformRealDistribution3.density(0.3494382387151369d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.10917347757783191d + "'", double4 == 0.10917347757783191d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(2.6749582739594557d, 0.779340420746909d);
        double double4 = fDistribution2.density(0.933517426050187d);
        double double5 = fDistribution2.getSupportLowerBound();
        fDistribution2.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.19133137083299634d + "'", double4 == 0.19133137083299634d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6862175247701107d, 0.544127331049072d, 0.26899442886685554d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.686) must be strictly less than upper bound (0.544)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        boolean boolean4 = uniformRealDistribution3.isSupportConnected();
        double double5 = uniformRealDistribution3.getSupportUpperBound();
        double double8 = uniformRealDistribution3.cumulativeProbability(0.2566879201912793d, 3.1860869611686584d);
        java.lang.Class<?> wildcardClass9 = uniformRealDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.936120997106573d + "'", double5 == 1.936120997106573d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.704243793552324d, 0.7537287967617665d, 0.7459227016817964d);
        boolean boolean4 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution3.probability(0.08230110552505629d, 1.8698200360851294d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        uniformRealDistribution0.reseedRandomGenerator((long) (short) -1);
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double11 = uniformRealDistribution0.cumulativeProbability(0.01980405795464453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "91) test1468(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9614697965180772d + "'", double4 == 0.9614697965180772d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.01980405795464453d + "'", double11 == 0.01980405795464453d);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.getNumericalVariance();
        double double11 = uniformRealDistribution2.cumulativeProbability(0.9570752589003741d);
        boolean boolean12 = uniformRealDistribution2.isSupportConnected();
        double double13 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6121227109766438d, 2.3125942498560286d);
        double double4 = fDistribution2.inverseCumulativeProbability(0.04519796485307248d);
        boolean boolean5 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2563543472296406E-4d + "'", double4 == 1.2563543472296406E-4d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.0210526315789474d, 0.3416860642950976d);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.density(0.27645850507952763d);
        double double11 = fDistribution3.cumulativeProbability(2.565072426559519d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistribution3.inverseCumulativeProbability(4.9110474784094365d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 4.911 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.20658800921437645d + "'", double9 == 0.20658800921437645d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9914737160738617d + "'", double11 == 0.9914737160738617d);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportConnected();
        double double9 = fDistribution3.getNumericalVariance();
        double double10 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        double double17 = fDistribution3.cumulativeProbability((-0.2753519954185978d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "92) test1474(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.8978328604654715d + "'", double9 == 2.8978328604654715d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.1623586333720101d, 0.49884479899047296d);
        double double4 = uniformRealDistribution2.density(0.7829735042683095d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.49884479899047296d, 0.23541417210258242d);
        double double3 = fDistribution2.getSolverAbsoluteAccuracy();
        boolean boolean4 = fDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-9d + "'", double3 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.18492953837985415d, 0.43896927012832443d);
        double[] doubleArray4 = uniformRealDistribution2.sample((int) ' ');
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        boolean boolean6 = fDistribution3.isSupportConnected();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportLowerBoundInclusive();
        double double10 = fDistribution3.cumulativeProbability(0.07983844188212808d);
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.17238793229426E-5d + "'", double10 == 7.17238793229426E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double10 = uniformRealDistribution0.cumulativeProbability(0.04356160098273004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "93) test1479(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7532783235556055d + "'", double4 == 0.7532783235556055d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.04356160098273004d + "'", double10 == 0.04356160098273004d);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.8115906487848945d, 0.6360822263764419d, 0.6946451121537729d);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5190573322162404d, 0.7283674369075639d);
        double double3 = fDistribution2.getNumericalVariance();
        boolean boolean4 = fDistribution2.isSupportConnected();
        double double5 = fDistribution2.getSupportUpperBound();
        double double6 = fDistribution2.sample();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
// flaky "94) test1481(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.168549840576869d + "'", double6 == 8.168549840576869d);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        boolean boolean4 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution3.getSupportUpperBound();
        double double6 = uniformRealDistribution3.sample();
        double double7 = uniformRealDistribution3.getNumericalMean();
        boolean boolean8 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.936120997106573d + "'", double5 == 1.936120997106573d);
// flaky "95) test1482(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.1325272133788298d + "'", double6 == 1.1325272133788298d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.274036397301435d + "'", double7 == 1.274036397301435d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.3108719420541892d, 0.27979062919809317d, (double) 10.0f);
        double double5 = fDistribution3.cumulativeProbability(4.088344667887812E-6d);
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.07208676541483997d + "'", double5 == 0.07208676541483997d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.27979062919809317d + "'", double6 == 0.27979062919809317d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.27979062919809317d + "'", double7 == 0.27979062919809317d);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double12 = fDistribution3.cumulativeProbability(0.0d);
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "96) test1484(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6824396796012169d + "'", double9 == 0.6824396796012169d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(2.4168088434316246d, 0.3321070505100212d);
        double double3 = fDistribution2.calculateNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        double double12 = fDistribution3.density(0.005949830804446096d);
        double double14 = fDistribution3.density(0.7082685265949001d);
        double double15 = fDistribution3.getNumericalMean();
        boolean boolean16 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.9288831817318313E-7d + "'", double12 == 1.9288831817318313E-7d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9222854825093614d + "'", double14 == 0.9222854825093614d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, 0.7822785846661753d);
        fDistribution2.reseedRandomGenerator(10L);
        double double6 = fDistribution2.inverseCumulativeProbability(0.5481631600215288d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.7278602182652025d + "'", double6 == 3.7278602182652025d);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        double double5 = uniformRealDistribution2.getSupportLowerBound();
        boolean boolean6 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        double double12 = uniformRealDistribution0.cumulativeProbability(1.717302933707143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "97) test1489(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.48365461899110573d + "'", double7 == 0.48365461899110573d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.probability((double) 100);
        double double9 = fDistribution3.cumulativeProbability(2.4980016587511606d, (double) 10L);
        double double11 = fDistribution3.density(0.5796272011751153d);
        double double12 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.010322138824075844d + "'", double9 == 0.010322138824075844d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8046902295859584d + "'", double11 == 0.8046902295859584d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.getNumericalMean();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator(0L);
        double double15 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSupportUpperBound();
        double double11 = fDistribution3.density(0.045269875861498d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.207003368563859E-4d + "'", double11 == 5.207003368563859E-4d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.sample();
        double double11 = fDistribution3.calculateNumericalVariance();
        double double13 = fDistribution3.inverseCumulativeProbability(0.8278941283068497d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "98) test1493(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6972835194614082d + "'", double7 == 0.6972835194614082d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
// flaky "23) test1493(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7097471133298018d + "'", double10 == 0.7097471133298018d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.0852100076635782d + "'", double13 == 2.0852100076635782d);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7240821166920562d, 0.8897164866495739d, 0.9694868433053876d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.806899301670815d + "'", double4 == 0.806899301670815d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.calculateNumericalVariance();
        double double13 = fDistribution3.density(0.18824562025567593d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.07142374234517766d + "'", double13 == 0.07142374234517766d);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.density(1.449868410599931E16d);
        double double8 = uniformRealDistribution0.sample();
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double10 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "99) test1496(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3601817692400129d + "'", double3 == 0.3601817692400129d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "24) test1496(org.apache.commons.math3.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6523662432768975d + "'", double8 == 0.6523662432768975d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100L, 0.3321070505100212d, 0.08333333333333333d);
        double double7 = fDistribution4.cumulativeProbability((double) 'a', (double) 100);
        boolean boolean8 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0018820678494252396d + "'", double7 == 0.0018820678494252396d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double10 = uniformRealDistribution2.density((double) (short) 1);
        boolean boolean11 = uniformRealDistribution2.isSupportConnected();
        double double12 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.getNumericalVariance();
        double double10 = uniformRealDistribution2.sample();
        double double11 = uniformRealDistribution2.getSupportLowerBound();
        double double12 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean13 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean7 = uniformRealDistribution2.isSupportConnected();
        boolean boolean8 = uniformRealDistribution2.isSupportConnected();
        double double9 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }
}
