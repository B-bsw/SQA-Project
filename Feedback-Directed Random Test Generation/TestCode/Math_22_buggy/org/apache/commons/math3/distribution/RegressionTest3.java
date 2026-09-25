package org.apache.commons.math3.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) '4', (double) (byte) 1);
        double double3 = fDistribution2.getSupportUpperBound();
        double double4 = fDistribution2.getSupportLowerBound();
        double double5 = fDistribution2.getDenominatorDegreesOfFreedom();
        boolean boolean6 = fDistribution2.isSupportUpperBoundInclusive();
        double double7 = fDistribution2.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.9216351637618685d, 1.7517653400463083E31d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean7 = uniformRealDistribution2.isSupportConnected();
        double double8 = uniformRealDistribution2.getSupportLowerBound();
        boolean boolean9 = uniformRealDistribution2.isSupportConnected();
        double double11 = uniformRealDistribution2.density(0.2872598481744745d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6119517974962971d, 0.1130006476062561d, 0.6179218618063023d);
        double double4 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6553695282217037d, (double) 1, 0.6119517974962971d);
        double double5 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6119517974962971d + "'", double5 == 0.6119517974962971d);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.38257290567491475d, 0.7935238495963384d, 0.3601817692400129d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.8298516959768152d, 0.6391854256750903d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 4.298764107264319d, 0.39731286652410236d, 0.5554636502621801d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6851772303251921d, 97.0d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        boolean boolean4 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.getNumericalVariance();
        boolean boolean13 = fDistribution3.isSupportLowerBoundInclusive();
        double double15 = fDistribution3.inverseCumulativeProbability(0.04468234794388115d);
        boolean boolean16 = fDistribution3.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistribution3.cumulativeProbability(0.7807885334422537d, 0.7210443502558348d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.781) must be less than or equal to upper endpoint (0.721)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "1) test1511(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7974060779906064d + "'", double7 == 0.7974060779906064d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.4803791664765238d, 36.49420035927487d);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        boolean boolean6 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.cumulativeProbability(1.0E-9d);
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double11 = fDistribution3.probability(0.6023364681317416d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.181009226124227E-44d + "'", double8 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability(1.0210526315789474d, 3.537396594438314d);
        double double12 = fDistribution3.density(0.769221584666441d);
        double double13 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double14 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4311546417502141d + "'", double10 == 0.4311546417502141d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9388767853941155d + "'", double12 == 0.9388767853941155d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.getSupportLowerBound();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean13 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.getNumericalMean();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(4.711194252818312E-227d, 0.4999999999999701d, 8.746758854452454E-5d);
        fDistribution3.reseedRandomGenerator((long) '4');
        double double6 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double10 = fDistribution3.cumulativeProbability((double) (short) 0, 0.5d);
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        double[] doubleArray13 = fDistribution3.sample((int) '4');
        double double14 = fDistribution3.getNumericalVariance();
        double double15 = fDistribution3.getNumericalMean();
        double double16 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1137932949955843d + "'", double10 == 0.1137932949955843d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.23541417210258242d + "'", double14 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0210526315789474d + "'", double16 == 1.0210526315789474d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.23538825792940155d, 9.40574547001456E-4d, 0.41193179565374427d);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.23538825792940155d + "'", double4 == 0.23538825792940155d);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability((double) (byte) -1, (double) 100.0f);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 100.0d, Double.POSITIVE_INFINITY, (double) (byte) 1);
        boolean boolean5 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution4.cumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass8 = uniformRealDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 1, 0.5509385983974154d, 1.0d);
        double double5 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        boolean boolean4 = uniformRealDistribution3.isSupportConnected();
        double double5 = uniformRealDistribution3.getSupportUpperBound();
        double double8 = uniformRealDistribution3.cumulativeProbability(0.2566879201912793d, 3.1860869611686584d);
        double double9 = uniformRealDistribution3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = uniformRealDistribution3.probability(1.4335993113176713d, 6.56513546905019E-4d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1.434) must be less than or equal to upper endpoint (0.001)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.936120997106573d + "'", double5 == 1.936120997106573d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
// flaky "2) test1524(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.3472376315736836d + "'", double9 == 1.3472376315736836d);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.03202491175692046d, 36.49420035927487d, 0.7776240210062073d);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.7337858359739589d, 0.4795363571652773d, 0.5262274315002701d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.probability(0.6836071484595452d);
        double double11 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double7 = fDistribution3.density(0.7627482092423561d);
        boolean boolean8 = fDistribution3.isSupportLowerBoundInclusive();
        double double9 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9382068481430984d + "'", double7 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.0d, 0.5854616029128883d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        double double10 = uniformRealDistribution0.sample();
        double double11 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "3) test1530(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8694885145761948d + "'", double10 == 0.8694885145761948d);
// flaky "1) test1530(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31627115007446926d + "'", double11 == 0.31627115007446926d);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6277292056000368d, 0.4338807430773506d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.5898144316393826d, 0.3508832089431604d, 2.2293967067569245d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.59) must be strictly less than upper bound (0.351)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        java.lang.Class<?> wildcardClass10 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "4) test1533(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7674377636180676d + "'", double4 == 0.7674377636180676d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.0126043844632993d, 1.6131540547803525E-13d);
        double double3 = fDistribution2.calculateNumericalVariance();
        double double4 = fDistribution2.sample();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
// flaky "5) test1534(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2022.5075374184066d + "'", double4 == 2022.5075374184066d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double9 = fDistribution3.probability(0.5730940342700588d, 0.7052885375206825d);
        double double12 = fDistribution3.probability(0.003936480107844747d, 0.5872312916136835d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.11480653091901427d + "'", double9 == 0.11480653091901427d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.17914389424287006d + "'", double12 == 0.17914389424287006d);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.1623586333720101d, 0.49884479899047296d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "6) test1536(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4255098358785821d + "'", double4 == 0.4255098358785821d);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1L), 0.8112398469157531d);
        double double3 = uniformRealDistribution2.sample();
        double double4 = uniformRealDistribution2.getSupportLowerBound();
        double double5 = uniformRealDistribution2.getNumericalMean();
// flaky "7) test1537(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.7459867051669923d) + "'", double3 == (-0.7459867051669923d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.09438007654212344d) + "'", double5 == (-0.09438007654212344d));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        double double7 = fDistribution3.getNumericalVariance();
        double double8 = fDistribution3.getNumericalVariance();
        double double10 = fDistribution3.cumulativeProbability(0.6907167210019161d);
        double double12 = fDistribution3.probability(0.6712461511075261d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26920144669880425d + "'", double10 == 0.26920144669880425d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double6 = fDistribution4.cumulativeProbability(0.08333333333333333d);
        double double7 = fDistribution4.getNumericalMean();
        double double9 = fDistribution4.cumulativeProbability(0.7882516988592704d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2627195032633788d + "'", double9 == 0.2627195032633788d);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6766392398995167d, 0.6916856290446507d);
        double double3 = fDistribution2.calculateNumericalVariance();
        double double4 = fDistribution2.calculateNumericalVariance();
        double double6 = fDistribution2.density(0.7805153048133248d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1544311119954339d + "'", double6 == 0.1544311119954339d);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.sample();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "8) test1541(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
// flaky "2) test1541(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7250311149525168d + "'", double10 == 0.7250311149525168d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) 0, (double) (byte) 1, 0.2972162083012442d);
        uniformRealDistribution3.reseedRandomGenerator((long) 0);
        double double6 = uniformRealDistribution3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = uniformRealDistribution3.cumulativeProbability(1.7452794339647884d, 0.73078872710936d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1.745) must be less than or equal to upper endpoint (0.731)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7432416673360078d + "'", double6 == 0.7432416673360078d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 4.518267670586411E-4d, 0.6167685717416793d, 0.8811994355886743d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.41239623387983193d, 0.4404399589285899d, 1.9770579032799154d);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.49609971263019714d, 0.4790184838979459d, 0.0d);
        double double7 = fDistribution4.probability(0.9202888685958082d, 2.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.07191805704005189d + "'", double7 == 0.07191805704005189d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6039787332279838d, 2.4725239789609064d);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6155223357908637d, 0.7422678166643543d, 3.181009226124227E-44d);
        double double5 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution4.cumulativeProbability(0.7761431924971771d);
        double double8 = fDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7422678166643543d + "'", double5 == 0.7422678166643543d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.49848980032118245d + "'", double7 == 0.49848980032118245d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        boolean boolean7 = fDistribution4.isSupportLowerBoundInclusive();
        double double8 = fDistribution4.getSupportUpperBound();
        double double9 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double10 = fDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.004853457297448672d + "'", double9 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6923653189858991d, 0.5261349832949958d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.8447630313072814d, 0.09351912098798598d, 0.017365478252578725d);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution4.density(0.850103622586271d);
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double10 = fDistribution4.cumulativeProbability(0.8719310721377715d);
        boolean boolean11 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8447630313072814d + "'", double5 == 0.8447630313072814d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.04356160098273004d + "'", double7 == 0.04356160098273004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8447630313072814d + "'", double8 == 0.8447630313072814d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.16434538054434356d + "'", double10 == 0.16434538054434356d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(5.769699484291669d, 0.9250689230908029d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (5.77) must be strictly less than upper bound (0.925)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        uniformRealDistribution0.reseedRandomGenerator((long) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "9) test1552(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5551892552666533d + "'", double4 == 0.5551892552666533d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6007038962578557d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.3321070505100212d, (double) (short) 1, 0.9999999999758308d);
        double double5 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution4.inverseCumulativeProbability(0.3164687886038654d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getNumericalVariance();
        double double11 = fDistribution3.getSupportUpperBound();
        double double12 = fDistribution3.getNumericalVariance();
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double14 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky "10) test1555(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.8507755363285612d + "'", double9 == 1.8507755363285612d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
// flaky "3) test1555(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6519393948174274d + "'", double14 == 0.6519393948174274d);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double3 = uniformRealDistribution0.density(0.9736694951866904d);
        boolean boolean4 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        boolean boolean3 = fDistribution2.isSupportConnected();
        boolean boolean4 = fDistribution2.isSupportConnected();
        boolean boolean5 = fDistribution2.isSupportUpperBoundInclusive();
        double double6 = fDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.8527887362192998d, 3.0069389783345903E-22d, 0.541821992595481d);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.probability(0.8374705046232109d);
        double double13 = fDistribution3.probability(0.8131089854825838d, 2.5231573301479715d);
        double double14 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "11) test1559(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6345934975846905d + "'", double7 == 0.6345934975846905d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6070338022608908d + "'", double13 == 0.6070338022608908d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0210526315789474d + "'", double14 == 1.0210526315789474d);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSolverAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5190573322162404d + "'", double5 == 0.5190573322162404d);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.9002468344505423d, 0.933700404958179d, 0.5877437368948693d);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5415785819031833d, 0.7938684212191616d);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        uniformRealDistribution2.reseedRandomGenerator(1L);
        double double7 = uniformRealDistribution2.inverseCumulativeProbability(0.6362501486590566d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7020980296731439d + "'", double7 == 0.7020980296731439d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.5415785819031833d, (double) 100.0f, 7.847827245153567E-4d);
        double double5 = uniformRealDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5415785819031833d + "'", double5 == 0.5415785819031833d);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6240903316275141d, 0.6517073035395284d);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.density((double) '#');
        double double10 = fDistribution3.cumulativeProbability((double) (-1.0f));
        double double11 = fDistribution3.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = fDistribution3.sample((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.562099861400877E-28d + "'", double8 == 7.562099861400877E-28d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double13 = fDistribution3.density(2.3125942498560286d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.04893856709334523d + "'", double13 == 0.04893856709334523d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(2.713869027440155d, 0.24276031958094266d, 0.708557128981428d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.714) must be strictly less than upper bound (0.243)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double double4 = fDistribution2.getSolverAbsoluteAccuracy();
        double double6 = fDistribution2.cumulativeProbability(0.7510733953753329d);
        double double7 = fDistribution2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6725166456309648d + "'", double6 == 0.6725166456309648d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 1, 9.435082943715062E-15d, 0.7627482092423561d);
        double double6 = fDistribution4.cumulativeProbability(0.8774681461278796d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.5798473640415978E-13d + "'", double6 == 1.5798473640415978E-13d);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        boolean boolean6 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution2.sample();
        boolean boolean8 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.2292907461367717d, 0.4803791664765238d, 0.7931225666863344d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.cumulativeProbability(97.0d);
        double double9 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double10 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-9d + "'", double10 == 1.0E-9d);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08333333333333333d + "'", double8 == 0.08333333333333333d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.43887695931896076d, 0.4006919589520365d, 0.5677315412196444d);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double8 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        double double13 = fDistribution3.probability(0.5415785819031833d, 2.3125942498560286d);
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        double double15 = fDistribution3.getSupportLowerBound();
        double double16 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double18 = fDistribution3.probability((-0.9457891641483526d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8391478235503405d + "'", double13 == 0.8391478235503405d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0d, 0.12284558022029413d, 0.5483711411180848d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.10917347757783191d, 0.7165875787180795d, 0.933517426050187d);
        double double5 = fDistribution4.getSupportUpperBound();
        double double6 = fDistribution4.getSupportUpperBound();
        double double8 = fDistribution4.density(0.14955185260243375d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistribution4.inverseCumulativeProbability(1.7067073534736648d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 1.707 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.261731078842318d + "'", double8 == 0.261731078842318d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.inverseCumulativeProbability(0.7283674369075639d);
        double double11 = fDistribution3.density(0.7387842926428161d);
        double double12 = fDistribution3.getSupportLowerBound();
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "12) test1578(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.8155649719352942d + "'", double9 == 1.8155649719352942d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.933517426050187d + "'", double11 == 0.933517426050187d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = uniformRealDistribution0.sample((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "13) test1579(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9798094742623582d + "'", double3 == 0.9798094742623582d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6976067833842337d, 0.02741148573788177d, 0.12452611167231531d);
        double double4 = fDistribution3.calculateNumericalVariance();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.getSupportLowerBound();
        double double8 = fDistribution3.inverseCumulativeProbability(0.9195016681888635d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.034865821475621E14d + "'", double8 == 4.034865821475621E14d);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.cumulativeProbability(0.7881142296769237d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3598981139183654d + "'", double12 == 0.3598981139183654d);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7538686543859143d, 0.14955185260243375d, 0.49174310649001063d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.754) must be strictly less than upper bound (0.15)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.5415785819031833d, (double) 100.0f, 7.847827245153567E-4d);
        java.lang.Class<?> wildcardClass5 = uniformRealDistribution4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample(1);
        double double6 = uniformRealDistribution0.getNumericalMean();
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "14) test1584(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7031626546203409d + "'", double3 == 0.7031626546203409d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "4) test1584(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.7317689130403733d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.7431722960525575d, 0.3973197439265692d, 0.26813163661952144d);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.probability(0.8914241055526231d);
        double double13 = fDistribution3.getSupportLowerBound();
        double[] doubleArray15 = fDistribution3.sample((int) '#');
        double double16 = fDistribution3.getNumericalMean();
        double double17 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0210526315789474d + "'", double16 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.23541417210258242d + "'", double17 == 0.23541417210258242d);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        double double5 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution2.isSupportConnected();
        double double7 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.getSupportUpperBound();
        boolean boolean8 = fDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            fDistribution4.reseedRandomGenerator((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.7148009574548317d, 0.41166628889519163d);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistribution2.probability(0.45782637815355315d, 0.29568940059854176d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.458) must be less than or equal to upper endpoint (0.296)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7148009574548317d + "'", double3 == 0.7148009574548317d);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getNumericalMean();
        double double11 = fDistribution3.probability(0.3416260639338622d);
        double double13 = fDistribution3.probability((-0.9856604514919777d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.559025207971324d, 0.17954687407105752d, 0.46305340330512307d);
        double double4 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.density(0.27645850507952763d);
        double double10 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.20658800921437645d + "'", double9 == 0.20658800921437645d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.005304180251840177d, 0.6871922204502834d, 0.5d);
        double double7 = fDistribution4.probability(0.18150450592717873d, 6.895467423525113E15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.023624047963925365d + "'", double7 == 0.023624047963925365d);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6225037709667607d, 0.162363671352316d, 0.9368714123469783d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistribution4.probability(5.769699484291669d, 2.565072426559519d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (5.77) must be less than or equal to upper endpoint (2.565)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean9 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double10 = uniformRealDistribution2.getNumericalVariance();
        boolean boolean11 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.getSupportUpperBound();
        double double8 = uniformRealDistribution0.sample();
        double double9 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "15) test1596(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.37461696647879084d + "'", double3 == 0.37461696647879084d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
// flaky "5) test1596(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0917882207597025d + "'", double8 == 0.0917882207597025d);
// flaky "1) test1596(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.586383007609697d + "'", double9 == 0.586383007609697d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.cumulativeProbability(7.847827245153567E-4d);
        double double11 = fDistribution3.getSupportLowerBound();
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double double14 = fDistribution3.cumulativeProbability(9.435082943715062E-15d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistribution3.probability(0.9028380243284497d, 0.6712461511075261d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.903) must be less than or equal to upper endpoint (0.671)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.435082943715062E-15d + "'", double10 == 9.435082943715062E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.3784473527865325E-69d + "'", double14 == 2.3784473527865325E-69d);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.20269651260689064d, 0.39731286652410236d, 0.04139850930652053d);
        double double6 = uniformRealDistribution4.cumulativeProbability(0.6214426969109692d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = uniformRealDistribution4.sample((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.07261445470276517d, 0.5520447923229905d, 0.5261349832949958d);
        double double5 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        double double5 = fDistribution3.probability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.24594400506499925d, 10.0d, 0.3801629465009775d);
        double double4 = fDistribution3.getNumericalMean();
        double double5 = fDistribution3.getSupportUpperBound();
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistribution3.cumulativeProbability(0.8904061809109827d, 0.2901069942670711d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.89) must be less than or equal to upper endpoint (0.29)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.25d + "'", double4 == 1.25d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double7 = uniformRealDistribution0.sample();
        java.lang.Class<?> wildcardClass8 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "16) test1602(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1772519875898393d + "'", double3 == 0.1772519875898393d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "6) test1602(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.10964797237457624d + "'", double7 == 0.10964797237457624d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.913601350735804d, 0.679880178889932d, 0.6456794250754441d);
        double double5 = fDistribution4.calculateNumericalVariance();
        double double7 = fDistribution4.density(0.8904354075111562d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14946491011234958d + "'", double7 == 0.14946491011234958d);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double4 = uniformRealDistribution0.density(10.0d);
        double double5 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        double double10 = uniformRealDistribution0.cumulativeProbability(0.2782837625077381d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "17) test1604(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3547787970456404d + "'", double5 == 0.3547787970456404d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2782837625077381d + "'", double10 == 0.2782837625077381d);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        double double16 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "18) test1605(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8355368066512209d + "'", double9 == 0.8355368066512209d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double[] doubleArray6 = fDistribution3.sample((int) (short) 10);
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
// flaky "19) test1606(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.8794940501023698d, 0.7116273219630882d, 0.8451549056670213d, 2.010186335380339d, 0.7822693323329706d, 0.7347147374322943d, 3.4355875607955824d, 2.1299526914708844d, 0.0d, 0.851354097043254d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.probability(Double.POSITIVE_INFINITY);
        boolean boolean9 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 7.562099861400877E-28d, 0.9280868261112525d, 0.6089308656102914d);
        boolean boolean5 = fDistribution4.isSupportConnected();
        double double6 = fDistribution4.getSolverAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            fDistribution4.reseedRandomGenerator((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6089308656102914d + "'", double6 == 0.6089308656102914d);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.003936480107844747d, 0.44995658649045533d);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) 100.0f);
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "20) test1610(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02866935715429131d + "'", double4 == 0.02866935715429131d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double double13 = fDistribution3.getNumericalMean();
        double double14 = fDistribution3.getDenominatorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((long) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "21) test1611(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6165883168253368d + "'", double7 == 0.6165883168253368d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.sample();
        double[] doubleArray9 = uniformRealDistribution2.sample((int) (short) 100);
        double double10 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample(1);
        double double7 = uniformRealDistribution0.density((double) (-1));
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.getNumericalVariance();
        uniformRealDistribution0.reseedRandomGenerator((long) 'a');
        uniformRealDistribution0.reseedRandomGenerator(10L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "22) test1613(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6726433214224445d + "'", double3 == 0.6726433214224445d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "7) test1613(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.27976607899444983d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.87237982648441d, 0.6006834726043084d, 2.904342794084669d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.872) must be strictly less than upper bound (0.601)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.43896927012832443d, 0.5110297484389803d, 0.5554636502621801d);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.864751955633795d, 0.7817449964246759d, 0.2230048414171497d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6340720428499753d, 0.6155223357908637d, 0.7434773485342417d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.634) must be strictly less than upper bound (0.616)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5554636502621801d, 0.6313604496713228d, 0.37702791528334645d);
        double double5 = uniformRealDistribution3.density(0.4080551181879397d);
        double double6 = uniformRealDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6313604496713228d + "'", double6 == 0.6313604496713228d);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.density(0.9970061237457858d);
        boolean boolean10 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.probability(0.3036689686928481d);
        double[] doubleArray14 = fDistribution3.sample((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8376911837863257d + "'", double9 == 0.8376911837863257d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.6466820414283976d }, 1.0E-15);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "23) test1620(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9680309084448526d + "'", double4 == 0.9680309084448526d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.27637855986017645d, 0.15182552239276648d, 0.8316414377397279d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.276) must be strictly less than upper bound (0.152)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution0.getNumericalMean();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6155223357908637d, 0.7422678166643543d, 3.181009226124227E-44d);
        double double6 = fDistribution4.inverseCumulativeProbability(0.8914241055526231d);
        boolean boolean7 = fDistribution4.isSupportUpperBoundInclusive();
        double double8 = fDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 79.22498179657372d + "'", double6 == 79.22498179657372d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.181009226124227E-44d + "'", double8 == 3.181009226124227E-44d);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6975449779484513d, 0.1137932949955843d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double5 = fDistribution2.density(0.23125697402288498d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.17128760034657028d + "'", double5 == 0.17128760034657028d);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.12402951146545438d, 0.23538825792940155d, 7.562099861400877E-28d);
        double double4 = fDistribution3.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistribution3.probability(0.996930636286649d, 0.4485770812615808d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.997) must be less than or equal to upper endpoint (0.449)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.getSupportUpperBound();
        boolean boolean8 = fDistribution4.isSupportConnected();
        double double9 = fDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        boolean boolean15 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "24) test1627(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8057003437014381d + "'", double3 == 0.8057003437014381d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "8) test1627(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7749855885356518d + "'", double8 == 0.7749855885356518d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.048161091562381575d + "'", double13 == 0.048161091562381575d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08333333333333333d + "'", double14 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.getSupportLowerBound();
        double double5 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportLowerBoundInclusive();
        double[] doubleArray6 = fDistribution3.sample(10);
        double double7 = fDistribution3.getSupportLowerBound();
        boolean boolean8 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray6);
// flaky "25) test1629(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.7306117400179968d, 0.7242673627503624d, 2.785276540730348d, 0.8045338503743225d, 0.6646842973128038d, 2.5383466718064276d, 0.8326978733468317d, 2.7249585734172914d, 0.6258061140490788d, 1.7490584091221542d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.sample();
        boolean boolean10 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double12 = uniformRealDistribution0.density(0.6567073267783825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "26) test1630(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5136786842745509d + "'", double4 == 0.5136786842745509d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
// flaky "9) test1630(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14680101778005605d + "'", double9 == 0.14680101778005605d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double10 = fDistribution3.probability(0.7537287967617665d, 0.8447630313072814d);
        double double11 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08529529275031239d + "'", double10 == 0.08529529275031239d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 10);
        double double9 = fDistribution3.cumulativeProbability((double) (-1L));
        double double11 = fDistribution3.cumulativeProbability(0.8146244847519797d);
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double14 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "27) test1632(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.9000222612606517d, 1.796011492817109d, 0.6700827057811677d, 3.016092863303208d, 2.0349441524124336d, 0.7073997973682213d, 0.6029023719214988d, 1.7055610781612063d, 0.6728499840234533d, 3.0199788086901647d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3847773579137394d + "'", double11 == 0.3847773579137394d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        double double17 = fDistribution3.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = fDistribution3.cumulativeProbability(0.9250534915429347d, 0.3416860642950976d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.925) must be less than or equal to upper endpoint (0.342)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "28) test1633(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.2294162502233608d + "'", double9 == 2.2294162502233608d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0210526315789474d + "'", double17 == 1.0210526315789474d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3971061244175023d, 0.3665293048806375d, 0.6976067833842337d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.397) must be strictly less than upper bound (0.367)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6167715285164661d, 0.625504238759457d, 0.8951247373711049d);
        double double6 = uniformRealDistribution4.inverseCumulativeProbability(0.7411051220588685d);
        boolean boolean7 = uniformRealDistribution4.isSupportConnected();
        double double8 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6211378836379615d + "'", double6 == 0.6211378836379615d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8951247373711049d + "'", double8 == 0.8951247373711049d);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        double double17 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "29) test1636(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6539660747695583d + "'", double9 == 0.6539660747695583d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.181009226124227E-44d + "'", double15 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0210526315789474d + "'", double16 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.cumulativeProbability(97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution3.getNumericalVariance();
        double double9 = uniformRealDistribution3.probability(0.5881395489123649d, (double) (byte) 1);
        boolean boolean10 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double12 = uniformRealDistribution3.probability(0.9373298332230393d);
        double double13 = uniformRealDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05428794722368846d) + "'", double4 == (-0.05428794722368846d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2981237622554617d + "'", double6 == 0.2981237622554617d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1603471985737681d + "'", double9 == 0.1603471985737681d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        uniformRealDistribution0.reseedRandomGenerator((long) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "30) test1639(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7785699247910955d + "'", double4 == 0.7785699247910955d);
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
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6616676432857282d, 0.4116955788765788d);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8354713638140709d, 0.9966872852742321d, (double) 100.0f);
        boolean boolean5 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution4.probability(0.36060793522756507d, 0.6916856290446507d);
        double double9 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(2.245686793821953d, 0.4080551181879397d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.246) must be strictly less than upper bound (0.408)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0071463887681346705d, 0.08529529275031239d, 1.0204081632653061d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 7.562099861400877E-28d, 0.9280868261112525d, 0.6089308656102914d);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.562099861400877E-28d + "'", double5 == 7.562099861400877E-28d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.9773985332011879d, 0.3379957971411982d);
        double double4 = fDistribution2.cumulativeProbability(0.2972162083012442d);
        double double5 = fDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.22693576719907352d + "'", double4 == 0.22693576719907352d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(2.4725239789609064d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.800541962827582d, 0.43457616175995906d);
        double double3 = fDistribution2.sample();
// flaky "31) test1647(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 51.87386608461222d + "'", double3 == 51.87386608461222d);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.density(97.0d);
        double double10 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.density(0.7459227016817964d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.7171475092674E-46d + "'", double9 == 2.7171475092674E-46d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9352846366349739d + "'", double12 == 0.9352846366349739d);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double double4 = fDistribution2.getSolverAbsoluteAccuracy();
        boolean boolean5 = fDistribution2.isSupportUpperBoundInclusive();
        fDistribution2.reseedRandomGenerator(1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = fDistribution3.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean13 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.probability(0.8914241055526231d);
        double double13 = fDistribution3.getSupportLowerBound();
        boolean boolean14 = fDistribution3.isSupportUpperBoundInclusive();
        double double15 = fDistribution3.getNumericalMean();
        double double17 = fDistribution3.cumulativeProbability(0.37209005285684604d);
        double double19 = fDistribution3.inverseCumulativeProbability(0.6006834726043084d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.04407790089299341d + "'", double17 == 0.04407790089299341d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.808069841591432d + "'", double19 == 0.808069841591432d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        boolean boolean6 = fDistribution3.isSupportConnected();
        java.lang.Class<?> wildcardClass7 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6391854256750903d, 0.769221584666441d, 0.1623586333720101d);
        double double5 = fDistribution3.cumulativeProbability(0.7418114744879037d);
        double double6 = fDistribution3.getSupportLowerBound();
        double double8 = fDistribution3.probability(0.2439012222489887d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.49144275010114424d + "'", double5 == 0.49144275010114424d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double6 = uniformRealDistribution0.getNumericalMean();
        double double7 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "32) test1655(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2549508893176675d + "'", double3 == 0.2549508893176675d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(9.40574547001456E-4d, 2.112650704588985d);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double4 = uniformRealDistribution0.density(10.0d);
        double double5 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "33) test1657(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8972526735022719d + "'", double5 == 0.8972526735022719d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
// flaky "10) test1657(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4734133622588723d + "'", double7 == 0.4734133622588723d);
// flaky "2) test1657(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.44396597310750296d + "'", double8 == 0.44396597310750296d);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 0.6177180781591378d, 0.5190573322162404d);
        double double5 = fDistribution4.getSupportLowerBound();
        double double6 = fDistribution4.calculateNumericalVariance();
        double double9 = fDistribution4.cumulativeProbability(7.562099861400877E-28d, 0.8046902295859584d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = fDistribution4.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23939818322691342d + "'", double9 == 0.23939818322691342d);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5831064787455089d, 1.449868410599931E16d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution2.inverseCumulativeProbability(0.9375754745450884d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = uniformRealDistribution2.probability(0.7332274021713567d, 0.6274561739850819d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.733) must be less than or equal to upper endpoint (0.627)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.3593610630961634E16d + "'", double5 == 1.3593610630961634E16d);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator((-1L));
        double double15 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double17 = fDistribution3.density(0.0d);
        double double18 = fDistribution3.getNumericalMean();
        double double19 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double21 = fDistribution3.inverseCumulativeProbability(0.2782837625077381d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "34) test1660(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7504349380869012d + "'", double7 == 0.7504349380869012d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0210526315789474d + "'", double18 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6611686378697893d + "'", double21 == 0.6611686378697893d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        boolean boolean6 = fDistribution3.isSupportConnected();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportLowerBoundInclusive();
        double double10 = fDistribution3.cumulativeProbability(0.07983844188212808d);
        double double11 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.17238793229426E-5d + "'", double10 == 7.17238793229426E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability(0.17836413844857746d);
        double double11 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0025711558103546812d + "'", double10 == 0.0025711558103546812d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        // The following exception was thrown during execution in test generation
        try {
            double double14 = uniformRealDistribution0.probability(0.9316998175652447d, 0.2566879201912793d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.932) must be less than or equal to upper endpoint (0.257)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "35) test1663(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5823113395525268d + "'", double4 == 0.5823113395525268d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "11) test1663(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5826775537153266d + "'", double8 == 0.5826775537153266d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9028380243284497d + "'", double11 == 0.9028380243284497d);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        boolean boolean15 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 1);
        double double9 = fDistribution3.probability(0.6916856290446507d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "36) test1665(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.6260544459100877d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double11 = uniformRealDistribution0.probability(0.6883245528673383d, 0.8733958735639842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1850713206966459d + "'", double11 == 0.1850713206966459d);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 1, 9.435082943715062E-15d, 0.7627482092423561d);
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getNumericalMean();
        boolean boolean8 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean9 = uniformRealDistribution0.isSupportConnected();
        double double10 = uniformRealDistribution0.getNumericalVariance();
        double double11 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        boolean boolean6 = fDistribution3.isSupportConnected();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportLowerBoundInclusive();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        double double10 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.7283674369075639d, 0.5190573322162404d);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double double4 = fDistribution2.getSupportUpperBound();
        boolean boolean5 = fDistribution2.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getNumericalMean();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        double double14 = fDistribution3.cumulativeProbability(0.0d);
        boolean boolean15 = fDistribution3.isSupportLowerBoundInclusive();
        double double16 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6391854256750903d, 0.769221584666441d, 0.1623586333720101d);
        fDistribution3.reseedRandomGenerator((long) (byte) 1);
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0d, 6.006934970516585E-11d, 6.006934970516585E-11d);
        double double5 = uniformRealDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = uniformRealDistribution4.sample((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0069389783345903E-22d + "'", double5 == 3.0069389783345903E-22d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7796022749223823d, 0.7510733953753329d, 0.17743551193543627d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.78) must be strictly less than upper bound (0.751)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        double double13 = uniformRealDistribution0.density(0.5478965661789728d);
        boolean boolean14 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "37) test1675(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6819205762503122d + "'", double3 == 0.6819205762503122d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "12) test1675(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.10818011895020274d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08333333333333333d + "'", double11 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 10L, 0.7697294817344926d);
        boolean boolean3 = fDistribution2.isSupportConnected();
        fDistribution2.reseedRandomGenerator((long) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6360822263764419d, 0.4329268118812597d, 0.27979062919809317d);
        boolean boolean5 = fDistribution4.isSupportUpperBoundInclusive();
        double double7 = fDistribution4.cumulativeProbability(0.18492953837985415d);
        double double9 = fDistribution4.inverseCumulativeProbability(0.31063568532805386d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2813212004071636d + "'", double7 == 0.2813212004071636d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) (short) -1, 1.0E-6d, 0.7283674369075639d);
        double double6 = uniformRealDistribution4.probability(0.6089308656102914d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6391854256750903d, 0.769221584666441d, 0.1623586333720101d);
        double double4 = fDistribution3.sample();
        double[] doubleArray6 = fDistribution3.sample((int) (short) 10);
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportConnected();
// flaky "38) test1679(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.4437575770133724d + "'", double4 == 3.4437575770133724d);
        org.junit.Assert.assertNotNull(doubleArray6);
// flaky "13) test1679(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 4.664533811323376d, 6.671684068611947d, 0.0d, 1.24000782561716d, 0.8376413666279698d, 0.6623586333720201d, 1.7708322458091008d, 113.35721666875112d, 0.7941283318800526d, 0.33764136662797994d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6869899433890785d, 35.0d, 0.7817449964246759d);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8343322941611049d, 0.15757433201470894d, 0.8140391155712257d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.834) must be strictly less than upper bound (0.158)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6972835194614082d, 0.21257566979278825d, 0.05519010190337914d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.697) must be strictly less than upper bound (0.213)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.31114128550733433d, 0.9294871528690059d, 0.5383653599725673d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistribution3.probability(0.042293209129396825d, 3.4584854842796495E-9d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.042) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution0.getNumericalMean();
        double double8 = uniformRealDistribution0.getNumericalMean();
        double[] doubleArray10 = uniformRealDistribution0.sample((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray10);
// flaky "39) test1684(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.16605309726099815d, 0.8527986709091564d, 0.8847047342658765d, 0.06257147084891868d, 0.6894309326468289d, 0.06048660041677434d, 0.37066921456790647d, 0.8208112270013761d, 0.8434563249706581d, 0.8123998396606165d }, 1.0E-15);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.probability(0.8374705046232109d);
        double double13 = fDistribution3.probability(0.8131089854825838d, 2.5231573301479715d);
        boolean boolean14 = fDistribution3.isSupportLowerBoundInclusive();
        double double15 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "40) test1685(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7679129120401063d + "'", double7 == 0.7679129120401063d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6070338022608908d + "'", double13 == 0.6070338022608908d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0549983883465619d, 2.6749582739594557d, 0.6851772303251921d);
        double double6 = uniformRealDistribution4.probability(0.6155223357908637d);
        double double7 = uniformRealDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = uniformRealDistribution4.probability(0.5320479682924733d, 0.24311283302854653d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.532) must be less than or equal to upper endpoint (0.243)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5720158168517273d + "'", double7 == 0.5720158168517273d);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.49448191740329417d, 0.8914241055526231d, 0.3321070505100212d);
        fDistribution3.reseedRandomGenerator((long) (short) 1);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6466820414283976d + "'", double9 == 0.6466820414283976d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6883245528673383d, 0.6195653609603238d, 0.76794946575603d);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6391854256750903d, 0.769221584666441d, 0.1623586333720101d);
        fDistribution3.reseedRandomGenerator((long) (byte) 1);
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = fDistribution3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = uniformRealDistribution2.cumulativeProbability(0.5056500907439732d, 0.04356160098273004d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.506) must be less than or equal to upper endpoint (0.044)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.probability(7.847827245153567E-4d, 0.0012523652574455647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.67582532930208E-4d + "'", double9 == 4.67582532930208E-4d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.22693576719907352d, 0.3665293048806375d, 0.7882726291431603d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.getNumericalMean();
        boolean boolean10 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double8 = fDistribution3.cumulativeProbability(10.0d);
        double double9 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999758308d + "'", double8 == 0.9999999999758308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.2527658588258392d, 0.8316183742171073d, 0.4329268118812597d);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        double double6 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.cumulativeProbability(32.0d);
        double double10 = fDistribution3.cumulativeProbability(0.6567073267783825d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0210526315789474d + "'", double6 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23853394027826644d + "'", double10 == 0.23853394027826644d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.8115906487848945d, 0.19565248788630019d, 0.5545067584200759d);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6155223357908637d, 0.7422678166643543d, 3.181009226124227E-44d);
        double double6 = fDistribution4.inverseCumulativeProbability(0.8914241055526231d);
        double double8 = fDistribution4.cumulativeProbability(0.7387842926428161d);
        double double10 = fDistribution4.cumulativeProbability(0.5622919087669369d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 79.22498179657372d + "'", double6 == 79.22498179657372d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4926248524558115d + "'", double8 == 0.4926248524558115d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4604896453071853d + "'", double10 == 0.4604896453071853d);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(8.195023148148147d, 0.23939818322691342d);
        double double4 = fDistribution2.cumulativeProbability(0.6236324983268595d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1587842753197809d + "'", double4 == 0.1587842753197809d);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.calculateNumericalVariance();
        boolean boolean8 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "41) test1702(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2537658232915956d + "'", double3 == 0.2537658232915956d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.getSolverAbsoluteAccuracy();
        double double10 = fDistribution3.cumulativeProbability(0.9368714123469783d);
        java.lang.Class<?> wildcardClass11 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5509385983974154d + "'", double8 == 0.5509385983974154d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4896234655149419d + "'", double10 == 0.4896234655149419d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.probability(0.0d);
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.density(0.009802219278024715d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
// flaky "42) test1704(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.8018981910432499d + "'", double7 == 1.8018981910432499d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.3911207883006123E-6d + "'", double10 == 1.3911207883006123E-6d);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        double double15 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean16 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        double double17 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "43) test1706(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5894641303675237d + "'", double9 == 0.5894641303675237d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean9 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray11 = uniformRealDistribution2.sample((int) (byte) 100);
        double double13 = uniformRealDistribution2.density(0.9373298332230393d);
        java.lang.Class<?> wildcardClass14 = uniformRealDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator(100L);
        double double13 = fDistribution3.getNumericalMean();
        double double15 = fDistribution3.cumulativeProbability(0.15073071950739525d);
        double double17 = fDistribution3.density(0.6087045807136301d);
        boolean boolean18 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0012523652574455647d + "'", double15 == 0.0012523652574455647d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.8414531941129211d + "'", double17 == 0.8414531941129211d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.4999014899032976d, 0.7627482092423561d, 2.92890095325051d);
        double double5 = fDistribution4.getSolverAbsoluteAccuracy();
        boolean boolean6 = fDistribution4.isSupportLowerBoundInclusive();
        double double8 = fDistribution4.density((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.92890095325051d + "'", double5 == 2.92890095325051d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.11013737106815662d + "'", double8 == 0.11013737106815662d);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5831064787455089d, 1.449868410599931E16d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution2.probability(0.10917347757783191d);
        double double7 = uniformRealDistribution2.density(0.22615374216208872d);
        boolean boolean8 = uniformRealDistribution2.isSupportConnected();
        boolean boolean9 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.23125697402288498d, 0.6957245310498591d, 0.7938684212191616d);
        double double4 = uniformRealDistribution3.sample();
        double[] doubleArray6 = uniformRealDistribution3.sample((int) (short) 100);
// flaky "44) test1711(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6820382013139239d + "'", double4 == 0.6820382013139239d);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        double double8 = uniformRealDistribution0.cumulativeProbability(0.7728822076911962d);
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        double double11 = uniformRealDistribution0.cumulativeProbability(0.1757939476207693d);
        double double13 = uniformRealDistribution0.cumulativeProbability(0.9970061237457858d);
        boolean boolean14 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "45) test1712(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.627516857909753d + "'", double4 == 0.627516857909753d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7728822076911962d + "'", double8 == 0.7728822076911962d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9970061237457858d + "'", double13 == 0.9970061237457858d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.cumulativeProbability(7.847827245153567E-4d);
        double double11 = fDistribution3.getSupportLowerBound();
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double double14 = fDistribution3.cumulativeProbability(9.435082943715062E-15d);
        boolean boolean15 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean16 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.435082943715062E-15d + "'", double10 == 9.435082943715062E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.3784473527865325E-69d + "'", double14 == 2.3784473527865325E-69d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (short) 1, 1.8156551679246902d, 0.5895852348112629d);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.449868410599931E16d, 0.6155223357908637d);
        double double3 = fDistribution2.calculateNumericalVariance();
        double double6 = fDistribution2.probability(0.0d, 0.11659193530026048d);
        boolean boolean7 = fDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.8313024651998237E-7d + "'", double6 == 3.8313024651998237E-7d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6121227109766438d, 2.3125942498560286d);
        double double4 = fDistribution2.inverseCumulativeProbability(0.04519796485307248d);
        double double5 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double6 = fDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2563543472296406E-4d + "'", double4 == 1.2563543472296406E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3125942498560286d + "'", double5 == 2.3125942498560286d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.cumulativeProbability(100.0d);
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        double[] doubleArray10 = uniformRealDistribution0.sample((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "46) test1717(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.46030094667021926d + "'", double3 == 0.46030094667021926d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
// flaky "14) test1717(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.7460683992488275d }, 1.0E-15);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.getNumericalVariance();
        boolean boolean13 = fDistribution3.isSupportUpperBoundInclusive();
        double double14 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "47) test1718(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.1182739659470364d + "'", double7 == 2.1182739659470364d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double9 = uniformRealDistribution2.density(0.7674377636180676d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(4.7120415909255865E-4d, 0.6060113752531858d);
        double double3 = fDistribution2.getNumericalMean();
        double double4 = fDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) 100.0f, 1.9288831817318313E-7d, 0.08852542671178854d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (100) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        double double11 = fDistribution3.getSolverAbsoluteAccuracy();
        double double12 = fDistribution3.getSupportLowerBound();
        boolean boolean13 = fDistribution3.isSupportConnected();
        double[] doubleArray15 = fDistribution3.sample((int) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7751813324443158d, (double) 100L, (double) 'a');
        double double6 = uniformRealDistribution4.cumulativeProbability(0.6197701094066437d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.density(0.4116955788765788d);
        double double9 = fDistribution3.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistribution3.inverseCumulativeProbability(1.7411009838609295d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 1.741 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4943610685878218d + "'", double8 == 0.4943610685878218d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.60375024767613d, 0.6561820370518461d, 0.788251696884265d);
        double double4 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.788251696884265d + "'", double4 == 0.788251696884265d);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5190573322162404d, 0.7283674369075639d);
        double double3 = fDistribution2.getNumericalVariance();
        double double4 = fDistribution2.getNumericalMean();
        double double5 = fDistribution2.getSupportLowerBound();
        double double6 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5190573322162404d + "'", double6 == 0.5190573322162404d);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5261349832949958d, 0.586383007609697d);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3973197439265692d, 0.3601817692400129d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.397) must be strictly less than upper bound (0.36)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.449868410599898E16d, 0.0549983883465619d);
        double double3 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.04127273732944947d, 0.7148009574548317d);
        double double3 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-9d + "'", double3 == 1.0E-9d);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.sample();
        double[] doubleArray5 = uniformRealDistribution0.sample(1);
        double double7 = uniformRealDistribution0.density((double) (-1));
        double double8 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.getNumericalVariance();
        double double10 = uniformRealDistribution0.getNumericalMean();
        boolean boolean11 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "48) test1731(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7876427790577851d + "'", double3 == 0.7876427790577851d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "15) test1731(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.8290212397651038d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        double double17 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "49) test1732(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.9620727590735614d + "'", double9 == 2.9620727590735614d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.calculateNumericalVariance();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        double double11 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "50) test1733(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7410056902277217d + "'", double7 == 0.7410056902277217d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 0.7418114744879037d, 10.0d);
        double double6 = uniformRealDistribution3.probability(0.1757939476207693d, 0.6119517974962971d);
        double double7 = uniformRealDistribution3.sample();
        double double8 = uniformRealDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
// flaky "51) test1734(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6215638124487862d + "'", double7 == 0.6215638124487862d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7418114744879037d + "'", double8 == 0.7418114744879037d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double5 = uniformRealDistribution0.inverseCumulativeProbability(0.544127331049072d);
        double double6 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.8590663588185146d);
        uniformRealDistribution0.reseedRandomGenerator((long) 1);
        double double11 = uniformRealDistribution0.sample();
        boolean boolean12 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double14 = uniformRealDistribution0.cumulativeProbability(0.4407404276673048d);
        boolean boolean15 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.544127331049072d + "'", double5 == 0.544127331049072d);
// flaky "52) test1735(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7432319455531449d + "'", double6 == 0.7432319455531449d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8590663588185146d + "'", double8 == 0.8590663588185146d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.07277703352123166d + "'", double11 == 0.07277703352123166d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4407404276673048d + "'", double14 == 0.4407404276673048d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.36060793522756507d, 0.8460138802083401d, 0.7459227016817964d);
        java.lang.Class<?> wildcardClass5 = fDistribution4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) 100.0f);
        double double7 = uniformRealDistribution0.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = uniformRealDistribution0.probability(3.3472124071874476d, 0.07100266787412735d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (3.347) must be less than or equal to upper endpoint (0.071)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "53) test1737(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.46121743284505445d + "'", double4 == 0.46121743284505445d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        double double9 = uniformRealDistribution0.density(0.048161091562381575d);
        boolean boolean10 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution0.getNumericalVariance();
        double double10 = uniformRealDistribution0.probability(2.8978328604654715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08333333333333333d + "'", double8 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6167715285164661d, 0.625504238759457d, 0.8951247373711049d);
        double double6 = uniformRealDistribution4.inverseCumulativeProbability(0.7411051220588685d);
        boolean boolean7 = uniformRealDistribution4.isSupportConnected();
        double double8 = uniformRealDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6211378836379615d + "'", double6 == 0.6211378836379615d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.625504238759457d + "'", double8 == 0.625504238759457d);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.7148009574548317d, 0.41166628889519163d);
        fDistribution2.reseedRandomGenerator(10L);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double6 = uniformRealDistribution0.density((double) (-1L));
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.probability(0.817791036465404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6975449779484513d, (double) 100L, (double) (short) 0);
        double double6 = fDistribution4.probability(0.15183448434642405d);
        double double8 = fDistribution4.probability(0.20658800921437645d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double7 = uniformRealDistribution0.inverseCumulativeProbability(0.41974347346711904d);
        boolean boolean8 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.41974347346711904d + "'", double7 == 0.41974347346711904d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.5662656190788444d, 0.098126171830621d, 0.0d);
        double double6 = fDistribution4.density(0.8951247373711049d);
        boolean boolean7 = fDistribution4.isSupportConnected();
        boolean boolean8 = fDistribution4.isSupportConnected();
        double double11 = fDistribution4.cumulativeProbability(0.04356160098273004d, 0.48655445053255997d);
        double double12 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.04139850930652053d + "'", double6 == 0.04139850930652053d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.07870611855592978d + "'", double11 == 0.07870611855592978d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.704243793552324d, 36.22126828088923d, 0.6907167210019161d);
        double double5 = uniformRealDistribution3.cumulativeProbability(0.15183448434642405d);
        double double6 = uniformRealDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 36.22126828088923d + "'", double6 == 36.22126828088923d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, (double) (short) -1, 1.0E-6d, 0.7283674369075639d);
        boolean boolean5 = uniformRealDistribution4.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        java.lang.Class<?> wildcardClass7 = uniformRealDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        double double16 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "54) test1749(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.1593924225030103d + "'", double9 == 2.1593924225030103d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.181009226124227E-44d + "'", double15 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution2.sample();
        double double5 = uniformRealDistribution2.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.sample();
        uniformRealDistribution2.reseedRandomGenerator((long) (short) -1);
        boolean boolean10 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution2.probability(0.3904156731971007d);
        double double13 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        double double7 = fDistribution3.sample();
        fDistribution3.reseedRandomGenerator((long) (short) 100);
        double double10 = fDistribution3.getSupportLowerBound();
        double[] doubleArray12 = fDistribution3.sample((int) '4');
        double double13 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "55) test1751(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.8577024693026263d + "'", double7 == 1.8577024693026263d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.5012322892596646d + "'", double13 == 2.5012322892596646d);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5415785819031833d, 0.7938684212191616d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution2.density(0.31627115007446926d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) 0, (double) (byte) 1, 0.2972162083012442d);
        uniformRealDistribution3.reseedRandomGenerator((long) 0);
        boolean boolean6 = uniformRealDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.653180688712043d, 1.8963851205217543d, 0.7627482092423561d);
        double double6 = fDistribution4.density(0.7948236153171645d);
        double double8 = fDistribution4.cumulativeProbability(0.1245261116723153d);
        double double9 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.19312604306893894d + "'", double6 == 0.19312604306893894d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.34469863524271394d + "'", double8 == 0.34469863524271394d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.3462976124464914d, (double) 10, 1.0E-6d);
        double double4 = fDistribution3.calculateNumericalVariance();
        double double5 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 12.552873165287084d + "'", double4 == 12.552873165287084d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3462976124464914d + "'", double5 == 0.3462976124464914d);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.15729349752684074d, 0.7941015035099954d, 0.7830480717937186d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        uniformRealDistribution0.reseedRandomGenerator((-1L));
        boolean boolean3 = uniformRealDistribution0.isSupportConnected();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution3.probability(0.510045759465438d, 0.6881067642200009d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05428794722368846d) + "'", double4 == (-0.05428794722368846d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0941412368764003d + "'", double8 == 0.0941412368764003d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.getNumericalVariance();
        boolean boolean10 = uniformRealDistribution2.isSupportConnected();
        java.lang.Class<?> wildcardClass11 = uniformRealDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double5 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.probability((double) (byte) 0);
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution4.getSupportLowerBound();
        double double10 = fDistribution4.getNumericalVariance();
        double double12 = fDistribution4.cumulativeProbability(0.4338807430773506d);
        double double13 = fDistribution4.getSupportLowerBound();
        double double14 = fDistribution4.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1321317066213935d + "'", double12 == 0.1321317066213935d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        double double10 = fDistribution3.cumulativeProbability((double) (short) 0, 0.5d);
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        double double13 = fDistribution3.probability(8.168549840576869d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1137932949955843d + "'", double10 == 0.1137932949955843d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.getNumericalMean();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        boolean boolean5 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.density(0.8733954553258896d);
        double double8 = uniformRealDistribution2.getSupportLowerBound();
        double[] doubleArray10 = uniformRealDistribution2.sample(100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.sample();
        double double9 = fDistribution3.getSupportLowerBound();
        boolean boolean10 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23541417210258242d + "'", double6 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
// flaky "56) test1764(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.6162345548633814d + "'", double8 == 2.6162345548633814d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double6 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.cumulativeProbability(3.181009226124227E-44d);
        double double9 = uniformRealDistribution0.getNumericalMean();
        boolean boolean10 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double11 = uniformRealDistribution0.sample();
        double double12 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "57) test1766(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2920897647191516d + "'", double3 == 0.2920897647191516d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
// flaky "16) test1766(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4962206257206552d + "'", double6 == 0.4962206257206552d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.181009226124227E-44d + "'", double8 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "3) test1766(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2928106939541226d + "'", double11 == 0.2928106939541226d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.3108719420541892d, 0.27979062919809317d, (double) 10.0f);
        double double5 = fDistribution3.cumulativeProbability(4.088344667887812E-6d);
        double double6 = fDistribution3.sample();
        double double7 = fDistribution3.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.07208676541483997d + "'", double5 == 0.07208676541483997d);
// flaky "58) test1767(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8982674.244580086d + "'", double6 == 8982674.244580086d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3108719420541892d + "'", double7 == 0.3108719420541892d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double double6 = fDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        boolean boolean4 = uniformRealDistribution3.isSupportConnected();
        boolean boolean5 = uniformRealDistribution3.isSupportConnected();
        double double6 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1461186724330432d + "'", double7 == 0.1461186724330432d);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double5 = uniformRealDistribution0.inverseCumulativeProbability(0.544127331049072d);
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.sample();
        boolean boolean8 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.544127331049072d + "'", double5 == 0.544127331049072d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky "59) test1770(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8328072112116509d + "'", double7 == 0.8328072112116509d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(5.0144779134503885d, 0.5424750230411775d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (5.014) must be strictly less than upper bound (0.542)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        double double9 = fDistribution3.density(0.7627482092423561d);
        double double11 = fDistribution3.cumulativeProbability(0.4999014899032976d);
        java.lang.Class<?> wildcardClass12 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9382068481430984d + "'", double9 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.11372676532829251d + "'", double11 == 0.11372676532829251d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5916847253761635d, 0.35279541385226354d, 42.375350078399514d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.592) must be strictly less than upper bound (0.353)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 4.711194252818312E-227d, 0.3036689686928481d, 0.9216351637618685d);
        double double5 = uniformRealDistribution4.getSupportUpperBound();
        double double7 = uniformRealDistribution4.density(32.0d);
        double double9 = uniformRealDistribution4.cumulativeProbability(0.08529529275031239d);
        double double12 = uniformRealDistribution4.probability(0.7242271614443259d, 2.1182739659470364d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3036689686928481d + "'", double5 == 0.3036689686928481d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2808824790938253d + "'", double9 == 0.2808824790938253d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.10917347757783191d, 0.7165875787180795d, 0.933517426050187d);
        double double5 = fDistribution4.getSupportUpperBound();
        double double6 = fDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            fDistribution4.reseedRandomGenerator((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability(0.17836413844857746d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistribution3.cumulativeProbability(1.8283381690459866d, 0.4025923598565553d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1.828) must be less than or equal to upper endpoint (0.403)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0025711558103546812d + "'", double10 == 0.0025711558103546812d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.sample();
        double double10 = uniformRealDistribution2.cumulativeProbability(0.19963923310118198d);
        double double11 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6553695282217037d, (double) 1, 0.6119517974962971d);
        double double6 = uniformRealDistribution4.cumulativeProbability(1.9080987582593552d);
        double double7 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6119517974962971d + "'", double7 == 0.6119517974962971d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8276847641108518d + "'", double8 == 0.8276847641108518d);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "60) test1779(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7504350302856284d + "'", double9 == 0.7504350302856284d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6089308656102914d, 0.6391854256750903d);
        double double3 = fDistribution2.getNumericalMean();
        boolean boolean4 = fDistribution2.isSupportConnected();
        double double5 = fDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.0d);
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        double double11 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double14 = uniformRealDistribution0.probability(0.5545067584200759d, 0.9736694951866904d);
        double double15 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-9d + "'", double11 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.41916273676661453d + "'", double14 == 0.41916273676661453d);
// flaky "61) test1781(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6995369360585968d + "'", double15 == 0.6995369360585968d);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8354713638140709d, 0.9966872852742321d, (double) 100.0f);
        boolean boolean5 = uniformRealDistribution4.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution4.density(2.0611928590791497d);
        // The following exception was thrown during execution in test generation
        try {
            uniformRealDistribution4.reseedRandomGenerator((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.7087523712937718d, 0.16389079897053382d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double7 = fDistribution3.density(0.0d);
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7071737568021614d, 0.8904354075111562d);
        boolean boolean3 = uniformRealDistribution2.isSupportConnected();
        double double4 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "62) test1785(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8827072720351122d + "'", double4 == 0.8827072720351122d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double6 = uniformRealDistribution0.getNumericalMean();
        double double9 = uniformRealDistribution0.probability(0.6766392398995167d, 0.7697294817344926d);
        boolean boolean10 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double11 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "63) test1786(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6760986446075172d + "'", double3 == 0.6760986446075172d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.09309024183497594d + "'", double9 == 0.09309024183497594d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.9914737160738617d, 0.1762832947139219d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.991) must be strictly less than upper bound (0.176)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(4.034865821475621E14d, 0.5385802968476971d);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.3892650659576675d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.density(7.847827245153567E-4d);
        double double9 = uniformRealDistribution0.density(0.0d);
        double double10 = uniformRealDistribution0.getSupportLowerBound();
        uniformRealDistribution0.reseedRandomGenerator((long) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6976067833842337d, 0.02741148573788177d, 0.12452611167231531d);
        double double4 = fDistribution3.calculateNumericalVariance();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double7 = fDistribution3.density(1.9080987582593552d);
        boolean boolean8 = fDistribution3.isSupportConnected();
        fDistribution3.reseedRandomGenerator(100L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.00654590527825748d + "'", double7 == 0.00654590527825748d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.sample();
        double double9 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "64) test1792(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6951646102056814d + "'", double8 == 0.6951646102056814d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        boolean boolean6 = fDistribution3.isSupportLowerBoundInclusive();
        double double9 = fDistribution3.probability(0.5730940342700588d, 0.7052885375206825d);
        boolean boolean10 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.11480653091901427d + "'", double9 == 0.11480653091901427d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8870064948069971d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.887) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) '4', 1.936120997106573d);
        double double3 = fDistribution2.calculateNumericalVariance();
        double double4 = fDistribution2.getSupportUpperBound();
        boolean boolean5 = fDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.cumulativeProbability((double) ' ');
        double double6 = uniformRealDistribution0.probability(1.9750054205197466E-9d, 0.7882516988592704d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = uniformRealDistribution0.cumulativeProbability(0.12284558022029413d, 9.435082943715062E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.123) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.788251696884265d + "'", double6 == 0.788251696884265d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6121227109766438d, 2.3125942498560286d);
        double double3 = fDistribution2.getSupportLowerBound();
        double double5 = fDistribution2.cumulativeProbability(0.0d);
        double double6 = fDistribution2.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistribution2.probability(0.6851772303251921d, 0.39900144630124035d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.685) must be less than or equal to upper endpoint (0.399)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5831064787455089d, 0.8066773310096078d, 0.6371742875919058d);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8447630313072814d, 0.14502638075584673d, 0.7805153048133248d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.845) must be strictly less than upper bound (0.145)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        double double11 = fDistribution3.getNumericalVariance();
        double double12 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator((long) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(3.181009226124227E-44d, 0.8300851989496363d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        uniformRealDistribution0.reseedRandomGenerator((long) (byte) 1);
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.04713220481929081d, 0.9736694951866904d, 3.1860869611686584d);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        double double8 = uniformRealDistribution0.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "65) test1805(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5642441824552811d + "'", double4 == 0.5642441824552811d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6391854256750903d, 0.769221584666441d, 0.1623586333720101d);
        double double5 = fDistribution3.cumulativeProbability(0.7418114744879037d);
        double double6 = fDistribution3.getSupportLowerBound();
        fDistribution3.reseedRandomGenerator((long) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.49144275010114424d + "'", double5 == 0.49144275010114424d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.cumulativeProbability(7.847827245153567E-4d);
        double double12 = fDistribution3.density(0.8914241055526231d);
        boolean boolean13 = fDistribution3.isSupportUpperBoundInclusive();
        double double14 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double16 = fDistribution3.density(0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.435082943715062E-15d + "'", double10 == 9.435082943715062E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9101270685680378d + "'", double12 == 0.9101270685680378d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9382068481430984d + "'", double16 == 0.9382068481430984d);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalMean();
        boolean boolean3 = uniformRealDistribution0.isSupportConnected();
        double double4 = uniformRealDistribution0.getSupportLowerBound();
        double double5 = uniformRealDistribution0.sample();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5d + "'", double2 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "66) test1808(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.30933069620008014d + "'", double5 == 0.30933069620008014d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "67) test1809(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5886656324983182d + "'", double4 == 0.5886656324983182d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(3.181009226124227E-44d, 0.07983844188212808d, 0.19565248788630019d);
        boolean boolean4 = uniformRealDistribution3.isSupportConnected();
        double double5 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.19565248788630019d + "'", double5 == 0.19565248788630019d);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.913601350735804d, 0.679880178889932d, 0.6456794250754441d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = fDistribution4.sample((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "68) test1812(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7747245299695815d + "'", double3 == 0.7747245299695815d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "17) test1812(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6858352147254339d + "'", double6 == 0.6858352147254339d);
// flaky "4) test1812(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8603903577993257d + "'", double7 == 0.8603903577993257d);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double7 = uniformRealDistribution0.density(0.1757939476207693d);
        double double8 = uniformRealDistribution0.sample();
        double double9 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
// flaky "69) test1813(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7422250279577969d + "'", double8 == 0.7422250279577969d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 1.3593610630961634E16d, 0.04147695370094584d, 0.7869687102505685d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (13,593,610,630,961,634) must be strictly less than upper bound (0.041)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        double double3 = fDistribution2.getNumericalVariance();
        double double5 = fDistribution2.inverseCumulativeProbability(0.11659193530026048d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.463149570621243d + "'", double3 == 3.463149570621243d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.002174943973755278d + "'", double5 == 0.002174943973755278d);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        double double10 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator(100L);
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(2.6749582739594557d, 0.779340420746909d);
        double double4 = fDistribution2.cumulativeProbability(0.6163120664688175d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.28328985552646924d + "'", double4 == 0.28328985552646924d);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        boolean boolean13 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "70) test1818(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7888608336605138d + "'", double4 == 0.7888608336605138d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-9d + "'", double9 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 1.0f, 0.8419851292030001d, 0.0d);
        boolean boolean5 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.05519010190337914d, 0.64439990514539d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability((double) (byte) 10);
        double double8 = uniformRealDistribution0.probability(0.4999014899032976d);
        uniformRealDistribution0.reseedRandomGenerator((long) (short) 100);
        double double11 = uniformRealDistribution0.getNumericalMean();
        boolean boolean12 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "71) test1821(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.07114206433788639d + "'", double4 == 0.07114206433788639d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double[] doubleArray7 = fDistribution3.sample((int) ' ');
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean9 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "72) test1822(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7514977252944894d + "'", double10 == 1.7514977252944894d);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double5 = uniformRealDistribution3.inverseCumulativeProbability((double) 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        boolean boolean5 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double7 = uniformRealDistribution2.density(0.8733954553258896d);
        double double8 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 0.7418114744879037d, 10.0d);
        double double6 = uniformRealDistribution3.probability(0.1757939476207693d, 0.6119517974962971d);
        double double7 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution3.probability(0.2661149983532115d);
        double double11 = uniformRealDistribution3.density(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        double double17 = fDistribution3.cumulativeProbability(6.56513546905019E-4d);
        java.lang.Class<?> wildcardClass18 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "73) test1826(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.9806378470314243d + "'", double9 == 1.9806378470314243d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.8678801636980656E-15d + "'", double17 == 3.8678801636980656E-15d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.3108719420541892d, 0.27979062919809317d, (double) 10.0f);
        double double5 = fDistribution3.cumulativeProbability(4.088344667887812E-6d);
        double double6 = fDistribution3.sample();
        double double8 = fDistribution3.cumulativeProbability(0.8440247749668012d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.07208676541483997d + "'", double5 == 0.07208676541483997d);
// flaky "74) test1827(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4690473875451294d + "'", double8 == 0.4690473875451294d);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0d, 6.006934970516585E-11d, 6.006934970516585E-11d);
        double double5 = uniformRealDistribution4.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.006934970516585E-11d + "'", double5 == 6.006934970516585E-11d);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.density(7.847827245153567E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = uniformRealDistribution0.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = uniformRealDistribution0.probability(0.8303345768079637d, 0.10520636650800452d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.83) must be less than or equal to upper endpoint (0.105)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 1.717302933707143d, 2.202701305912483d);
        double double5 = fDistribution4.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.717302933707143d + "'", double5 == 1.717302933707143d);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.5733968575051716d, 0.8743111069910592d, 5.964322516717098E-6d);
        double double5 = fDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 4.5064983383801834E-4d, 0.6590940259223124d, 0.4311546417502141d);
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        double double8 = uniformRealDistribution0.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = uniformRealDistribution0.cumulativeProbability(0.6995065888297458d, 0.5726203078051284d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.7) must be less than or equal to upper endpoint (0.573)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "75) test1834(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6490318180360701d + "'", double4 == 0.6490318180360701d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.933700404958179d, 0.933517426050187d, 1.7354514364969038d);
        double double5 = fDistribution3.density(0.6480174446154539d);
        double double7 = fDistribution3.density(0.3417437038811675d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.22906287917093865d + "'", double5 == 0.22906287917093865d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.39037743876434505d + "'", double7 == 0.39037743876434505d);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        boolean boolean7 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.1757939476207693d);
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        double[] doubleArray12 = uniformRealDistribution0.sample((int) '#');
        double double15 = uniformRealDistribution0.probability(0.3494382387151369d, 0.8733958735639842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1757939476207693d + "'", double9 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5239576348488473d + "'", double15 == 0.5239576348488473d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSupportLowerBound();
        double double8 = uniformRealDistribution0.cumulativeProbability(0.07261445470276517d, 0.7938684212191616d);
        double double10 = uniformRealDistribution0.cumulativeProbability(0.8858457875824983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7212539665163964d + "'", double8 == 0.7212539665163964d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8858457875824983d + "'", double10 == 0.8858457875824983d);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.660577630906041d, 0.14955185260243375d, 0.6362501486590566d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistribution3.inverseCumulativeProbability(3.537396594438314d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 3.537 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        double double18 = fDistribution3.probability(0.005304180251840177d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "76) test1839(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.1936744923232383d + "'", double9 == 3.1936744923232383d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean7 = uniformRealDistribution2.isSupportConnected();
        double double8 = uniformRealDistribution2.sample();
        double double9 = uniformRealDistribution2.getSupportUpperBound();
        double double10 = uniformRealDistribution2.getSupportLowerBound();
        double double12 = uniformRealDistribution2.probability(0.5831064787455089d);
        double double13 = uniformRealDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getNumericalVariance();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
// flaky "77) test1841(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7587590117661915d + "'", double9 == 1.7587590117661915d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.cumulativeProbability((-1.0d), (double) ' ');
        double double10 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass11 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-9d + "'", double10 == 1.0E-9d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double9 = uniformRealDistribution0.cumulativeProbability(0.0d);
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        double double12 = uniformRealDistribution0.density(0.0d);
        double double14 = uniformRealDistribution0.inverseCumulativeProbability(0.49884479899047296d);
        boolean boolean15 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.49884479899047296d + "'", double14 == 0.49884479899047296d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getSupportLowerBound();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getSolverAbsoluteAccuracy();
        double double14 = fDistribution3.probability(0.7882726291431603d);
        double double15 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "78) test1844(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6561001120168929d + "'", double9 == 0.6561001120168929d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23541417210258242d + "'", double15 == 0.23541417210258242d);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.26279270621356643d, 0.22828480395843576d, 0.6615962937856623d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.263) must be strictly less than upper bound (0.228)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        java.lang.Class<?> wildcardClass8 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability((-1.0d), (double) 1L);
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.getNumericalVariance();
        double double10 = fDistribution3.inverseCumulativeProbability(0.6119517974962971d);
        double double11 = fDistribution3.getNumericalVariance();
        double double12 = fDistribution3.getSupportLowerBound();
        double double13 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5509385983974154d + "'", double6 == 0.5509385983974154d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8151769424272568d + "'", double10 == 0.8151769424272568d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        java.lang.Class<?> wildcardClass14 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
// flaky "79) test1848(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4719281199749503d + "'", double3 == 0.4719281199749503d);
        org.junit.Assert.assertNotNull(doubleArray5);
// flaky "18) test1848(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.9203354655889504d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08333333333333333d + "'", double11 == 0.08333333333333333d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean9 = fDistribution3.isSupportConnected();
        java.lang.Class<?> wildcardClass10 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6627930174442738d, 0.9388767853941155d, 0.3321070505100212d);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        double double12 = fDistribution3.density(0.8449754473618898d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "80) test1851(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.929524686522416d + "'", double12 == 0.929524686522416d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.cumulativeProbability(7.847827245153567E-4d);
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getSolverAbsoluteAccuracy();
        double double14 = fDistribution3.density(0.31114128550733433d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.435082943715062E-15d + "'", double10 == 9.435082943715062E-15d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2752841401107045d + "'", double14 == 0.2752841401107045d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.49884479899047296d, 0.6177180781591378d, 0.6167715285164661d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean6 = fDistribution3.isSupportConnected();
        double double9 = fDistribution3.cumulativeProbability(0.3792158414148983d, 0.4948852171227234d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6177180781591378d + "'", double4 == 0.6177180781591378d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.026171990764942643d + "'", double9 == 0.026171990764942643d);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.3379957971411982d, Double.NaN);
        double double3 = fDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "81) test1855(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.04862657509558477d + "'", double5 == 0.04862657509558477d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
// flaky "19) test1855(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4774891705076061d + "'", double7 == 0.4774891705076061d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        double double7 = fDistribution3.getNumericalVariance();
        double double9 = fDistribution3.density(0.0d);
        double double10 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23541417210258242d + "'", double7 == 0.23541417210258242d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        double double4 = uniformRealDistribution3.getNumericalMean();
        double double5 = uniformRealDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.274036397301435d + "'", double4 == 1.274036397301435d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6119517974962971d + "'", double5 == 0.6119517974962971d);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.16235863345578966d, 0.7685775863542659d, 0.3704040625963718d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.058309969785535314d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.058) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6225037709667607d, 0.162363671352316d, 0.9368714123469783d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistribution4.cumulativeProbability(0.6171932353255531d, 0.4427119674611329d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.617) must be less than or equal to upper endpoint (0.443)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double12 = fDistribution3.cumulativeProbability(0.0d);
        double double14 = fDistribution3.probability(0.7434773485342417d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "82) test1861(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.8303345768079637d, 0.3547787970456404d);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.getNumericalVariance();
        double double7 = uniformRealDistribution0.getSupportLowerBound();
        double double9 = uniformRealDistribution0.density(0.6360822263764419d);
        double double12 = uniformRealDistribution0.probability(0.010322138824075844d, 0.781611959383924d);
        double double13 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "83) test1863(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3631038005291183d + "'", double5 == 0.3631038005291183d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08333333333333333d + "'", double6 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7712898205598482d + "'", double12 == 0.7712898205598482d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution0.density(0.6971549552183045d);
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        boolean boolean5 = uniformRealDistribution2.isSupportConnected();
        double double6 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0d, 0.7935238495963384d);
        double double3 = uniformRealDistribution2.getNumericalVariance();
        boolean boolean4 = uniformRealDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.05247334165651602d + "'", double3 == 0.05247334165651602d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        double double14 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "84) test1867(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3183740885594053d + "'", double3 == 0.3183740885594053d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.8004681996499422d, 0.2851040863546159d, 0.8870064948069971d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        double double11 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double12 = fDistribution3.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "85) test1869(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6235297444168052d + "'", double9 == 0.6235297444168052d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.inverseCumulativeProbability(0.8733954553258896d);
        boolean boolean11 = fDistribution3.isSupportLowerBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistribution3.cumulativeProbability(0.7829735042683095d, 0.048161091562381575d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.783) must be less than or equal to upper endpoint (0.048)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.2954272647673424d + "'", double10 == 2.2954272647673424d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 100, 1.717302933707143d, 2.202701305912483d);
        double double7 = fDistribution4.cumulativeProbability(0.0d, 1.9317065604990125d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5699327254728336d + "'", double7 == 0.5699327254728336d);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        double double5 = uniformRealDistribution2.getSupportLowerBound();
        uniformRealDistribution2.reseedRandomGenerator((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 3.4443238954721584d, 0.2522324101367044d, 0.24952550835226206d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (3.444) must be strictly less than upper bound (0.252)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        boolean boolean13 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100, (double) 1, (double) (short) 1);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.24882272555718465d, 0.07191805704005189d, 0.6590940259223124d);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double11 = fDistribution3.density((double) (byte) 0);
        double double12 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "86) test1877(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.8213189406315786d + "'", double9 == 1.8213189406315786d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.density(0.4116955788765788d);
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getSupportUpperBound();
        double double11 = fDistribution3.getSupportLowerBound();
        boolean boolean12 = fDistribution3.isSupportLowerBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistribution3.probability(0.2737809697987744d, 4.67582532930208E-4d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.274) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4943610685878218d + "'", double8 == 0.4943610685878218d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.49884479899047296d, 0.6177180781591378d, 0.6167715285164661d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double6 = fDistribution3.probability(0.5881395489123649d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6177180781591378d + "'", double4 == 0.6177180781591378d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.getNumericalVariance();
        double double12 = uniformRealDistribution2.cumulativeProbability(0.0d, 0.1757939476207693d);
        double double13 = uniformRealDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6466820414283976d + "'", double10 == 0.6466820414283976d);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3032294630012422d, 0.9382068481430984d, 0.3728694875041465d);
        double double4 = uniformRealDistribution3.getSupportUpperBound();
        java.lang.Class<?> wildcardClass5 = uniformRealDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9382068481430984d + "'", double4 == 0.9382068481430984d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double4 = uniformRealDistribution0.density((double) 100.0f);
        double double5 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean6 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double[] doubleArray8 = uniformRealDistribution0.sample((int) 'a');
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.8743111069910592d, 0.4329268118812597d);
        double double3 = fDistribution2.getNumericalMean();
        double double4 = fDistribution2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4329268118812597d + "'", double4 == 0.4329268118812597d);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.14946491011234958d, 0.6971549552183045d, 2.038365424903863d);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 9.435082943715062E-15d, 0.058309969785535314d, 0.39722910930728617d);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.getSupportLowerBound();
        double double7 = uniformRealDistribution0.getNumericalVariance();
        uniformRealDistribution0.reseedRandomGenerator((long) ' ');
        double double10 = uniformRealDistribution0.sample();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = uniformRealDistribution0.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08333333333333333d + "'", double7 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7685775863542659d + "'", double10 == 0.7685775863542659d);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.getSolverAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass11 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 7.562099861400877E-28d, 0.9280868261112525d, 0.6089308656102914d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(4.088344667887812E-6d, 0.627388726153098d, 0.63920538782404d);
        boolean boolean4 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6766392398995167d, 0.6916856290446507d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        double double4 = fDistribution2.getSolverAbsoluteAccuracy();
        double double5 = fDistribution2.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistribution2.probability(0.918767923989805d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.919) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.24882272555718465d, 0.7551905000466074d, 2.007657447155151d);
        double double4 = fDistribution3.getNumericalMean();
        java.lang.Class<?> wildcardClass5 = fDistribution3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double3 = uniformRealDistribution0.density(0.23541417210258242d);
        boolean boolean4 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double6 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean7 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-9d + "'", double5 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double9 = fDistribution3.probability((double) 100.0f);
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getNumericalMean();
        double double13 = fDistribution3.density(0.7163545031354256d);
        double double15 = fDistribution3.density(0.5894641303675237d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9258528539967332d + "'", double13 == 0.9258528539967332d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8177860947390555d + "'", double15 == 0.8177860947390555d);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        boolean boolean12 = fDistribution3.isSupportUpperBoundInclusive();
        double double14 = fDistribution3.density(0.9256110242665174d);
        double double15 = fDistribution3.getSupportLowerBound();
        double double16 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "87) test1895(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7150065005108781d + "'", double7 == 0.7150065005108781d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.8904354075111562d + "'", double14 == 0.8904354075111562d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23541417210258242d + "'", double16 == 0.23541417210258242d);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.cumulativeProbability(7.847827245153567E-4d);
        double double11 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.435082943715062E-15d + "'", double10 == 9.435082943715062E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0210526315789474d + "'", double11 == 1.0210526315789474d);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(7.823831179151655E45d, (-0.596731289759838d), 0.9758739470785891d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-0.597)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalMean();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double6 = uniformRealDistribution0.density(0.6121227109766438d);
        double double8 = uniformRealDistribution0.cumulativeProbability(0.3728694875041465d);
        double double9 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean10 = uniformRealDistribution0.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5d + "'", double2 == 0.5d);
// flaky "88) test1898(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7134772228362012d + "'", double3 == 0.7134772228362012d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3728694875041465d + "'", double8 == 0.3728694875041465d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double11 = fDistribution3.calculateNumericalVariance();
        double double14 = fDistribution3.probability(Double.NaN, 0.7680367961973186d);
        double double15 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23541417210258242d + "'", double15 == 0.23541417210258242d);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        double double18 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double20 = fDistribution3.probability(0.03991922094106404d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "89) test1900(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8480979610536865d + "'", double7 == 0.8480979610536865d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.9028380243284497d, 0.6313604496713228d, 0.35800850305834553d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.5831064787455089d, 1.449868410599931E16d);
        boolean boolean3 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double5 = uniformRealDistribution2.probability(0.10917347757783191d);
        double double7 = uniformRealDistribution2.density(4.711194252818312E-227d);
        double double8 = uniformRealDistribution2.sample();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "90) test1903(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.1819200464893676E16d + "'", double8 == 1.1819200464893676E16d);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.6222024331761998d, 0.679880178889932d, 0.3108719420541892d);
        double double5 = uniformRealDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6222024331761998d + "'", double5 == 0.6222024331761998d);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        double double17 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "91) test1905(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.454813991639898d + "'", double9 == 3.454813991639898d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.23541417210258242d + "'", double17 == 0.23541417210258242d);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.8743111069910592d, 0.4329268118812597d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistribution2.cumulativeProbability(0.8101794604592276d, 0.2537658232915956d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.81) must be less than or equal to upper endpoint (0.254)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        fDistribution3.reseedRandomGenerator(1L);
        fDistribution3.reseedRandomGenerator((long) 100);
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7434773485342417d, 0.0024850493035607157d, 0.048161091562381575d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.743) must be strictly less than upper bound (0.002)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getSupportUpperBound();
        double double10 = fDistribution3.cumulativeProbability(0.17836413844857746d);
        double double11 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0025711558103546812d + "'", double10 == 0.0025711558103546812d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23541417210258242d + "'", double11 == 0.23541417210258242d);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6177180781591378d, (double) 100);
        boolean boolean3 = fDistribution2.isSupportConnected();
        double double4 = fDistribution2.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.463149570621243d + "'", double4 == 3.463149570621243d);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.3208712536686308d, 0.7518449529304427d, 0.6179657774208087d);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution4.getSupportLowerBound();
        double double10 = fDistribution4.cumulativeProbability((double) (short) -1, 0.9999999999758308d);
        boolean boolean11 = fDistribution4.isSupportUpperBoundInclusive();
        double double12 = fDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4999999999999701d + "'", double10 == 0.4999999999999701d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getSupportLowerBound();
        double double10 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23541417210258242d + "'", double10 == 0.23541417210258242d);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.density((double) '#');
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        double double11 = fDistribution3.density(0.8493872319532485d);
        double double12 = fDistribution3.getSolverAbsoluteAccuracy();
        double double13 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.562099861400877E-28d + "'", double8 == 7.562099861400877E-28d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9280868261112525d + "'", double11 == 0.9280868261112525d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.23541417210258242d + "'", double13 == 0.23541417210258242d);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.15182552239276648d, 0.2522324101367044d);
        boolean boolean3 = fDistribution2.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double3 = uniformRealDistribution2.getNumericalMean();
        boolean boolean4 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalVariance();
        double double4 = uniformRealDistribution0.density(10.0d);
        double double5 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.probability(0.1757939476207693d);
        double double8 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08333333333333333d + "'", double2 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "92) test1917(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4031798173762142d + "'", double5 == 0.4031798173762142d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "20) test1917(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6805842948303673d + "'", double8 == 0.6805842948303673d);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.sample();
        double double5 = uniformRealDistribution3.sample();
        double double7 = uniformRealDistribution3.cumulativeProbability(0.3032294630012422d);
        double double8 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        double double10 = uniformRealDistribution3.cumulativeProbability(0.644788466238158d);
// flaky "93) test1918(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9501156054602165d) + "'", double4 == (-0.9501156054602165d));
// flaky "21) test1918(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5727332148797339d + "'", double5 == 0.5727332148797339d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6890202251178742d + "'", double7 == 0.6890202251178742d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.869603206076088d + "'", double10 == 0.869603206076088d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.23125697402288498d, 0.6957245310498591d, 0.7938684212191616d);
        double double5 = uniformRealDistribution3.density(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.16434538054434356d, 0.43887695931896076d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistribution2.probability(0.769221584666441d, 0.6832887004995629d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.769) must be less than or equal to upper endpoint (0.683)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.058309969785535314d, 1.25d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        double double4 = fDistribution2.getNumeratorDegreesOfFreedom();
        boolean boolean5 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.058309969785535314d + "'", double4 == 0.058309969785535314d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7283674369075639d, (double) (byte) 1, 0.4999014899032976d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = uniformRealDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double5 = uniformRealDistribution0.sample();
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
// flaky "94) test1923(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4864267777197808d + "'", double5 == 0.4864267777197808d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08333333333333333d + "'", double8 == 0.08333333333333333d);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double7 = fDistribution3.density(0.0d);
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean9 = fDistribution3.isSupportUpperBoundInclusive();
        double double10 = fDistribution3.getSupportLowerBound();
        double double11 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.getNumericalMean();
        boolean boolean9 = fDistribution3.isSupportLowerBoundInclusive();
        double double10 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((-1L));
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.calculateNumericalVariance();
        double double10 = fDistribution3.getSupportUpperBound();
        fDistribution3.reseedRandomGenerator((long) (short) 0);
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution4.inverseCumulativeProbability(0.8460138802083401d);
        double double10 = fDistribution4.inverseCumulativeProbability(0.22929074613677172d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.449868410599931E16d + "'", double8 == 1.449868410599931E16d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.9900481482519627E-140d + "'", double10 == 2.9900481482519627E-140d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 2.62383133025968d, 0.22241661777455723d, 0.12885969453763435d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2.624) must be strictly less than upper bound (0.222)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.0d, 0.9787873837142649d, 0.7627482092423561d);
        double double6 = uniformRealDistribution4.inverseCumulativeProbability(0.8208457026197589d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = uniformRealDistribution4.probability(0.9594901573103976d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.959) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9787873837142649d + "'", double6 == 0.9787873837142649d);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        boolean boolean1 = uniformRealDistribution0.isSupportConnected();
        double double2 = uniformRealDistribution0.getNumericalMean();
        double double4 = uniformRealDistribution0.cumulativeProbability(0.6423460469744984d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5d + "'", double2 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6423460469744984d + "'", double4 == 0.6423460469744984d);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.sample();
        double double9 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.cumulativeProbability(0.6567073267783825d, 0.6852677852739119d);
        double double13 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "95) test1931(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7430767851160858d + "'", double8 == 0.7430767851160858d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.025701319694443586d + "'", double12 == 0.025701319694443586d);
// flaky "22) test1931(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.3675872428490314d + "'", double13 == 2.3675872428490314d);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.6121227109766438d, 0.02866935715429131d);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        double double12 = uniformRealDistribution0.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.847827245153567E-4d + "'", double6 == 7.847827245153567E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08333333333333333d + "'", double12 == 0.08333333333333333d);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.49884479899047296d, 0.6177180781591378d, 0.6167715285164661d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.getNumericalVariance();
        double double7 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6177180781591378d + "'", double4 == 0.6177180781591378d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.0794825972384381d, 0.7931225666863344d);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        double double6 = fDistribution3.probability(0.0d);
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.getNumericalMean();
        double double9 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
// flaky "96) test1936(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.8896070387843302d + "'", double7 == 2.8896070387843302d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0210526315789474d + "'", double8 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability((-1.0d), (double) 1L);
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.getNumericalVariance();
        double double10 = fDistribution3.inverseCumulativeProbability(0.6119517974962971d);
        double double11 = fDistribution3.getSupportLowerBound();
        double double14 = fDistribution3.cumulativeProbability(0.19426603166379958d, 3.0406501059933606d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5509385983974154d + "'", double6 == 0.5509385983974154d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.23541417210258242d + "'", double8 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8151769424272568d + "'", double10 == 0.8151769424272568d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9941597730832565d + "'", double14 == 0.9941597730832565d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.8146244847519797d, 0.18824562025567593d, 0.19963923310118198d);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(2.95229985235779d, 0.1757939476207693d, 0.009897513506510924d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.5190573322162404d, 0.7283674369075639d);
        double double3 = fDistribution2.getNumericalVariance();
        boolean boolean4 = fDistribution2.isSupportConnected();
        double double5 = fDistribution2.getSupportUpperBound();
        double double6 = fDistribution2.calculateNumericalVariance();
        double double8 = fDistribution2.density(0.02259898242653624d);
        boolean boolean9 = fDistribution2.isSupportUpperBoundInclusive();
        double double10 = fDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.532575379236659d + "'", double8 == 2.532575379236659d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7328000769732316d, 0.17743551193543627d, 0.6561001120168929d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.733) must be strictly less than upper bound (0.177)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalMean();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 1);
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0210526315789474d + "'", double5 == 1.0210526315789474d);
        org.junit.Assert.assertNotNull(doubleArray7);
// flaky "97) test1942(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.6103703167938527d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.density(0.23541417210258242d);
        double double9 = uniformRealDistribution0.density((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = uniformRealDistribution0.probability(1.7464806299478124d, 0.5320479682924733d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1.746) must be less than or equal to upper endpoint (0.532)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "98) test1943(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1634261974899327d + "'", double3 == 0.1634261974899327d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) (byte) 1, (double) (byte) 10);
        double double5 = fDistribution4.getSupportUpperBound();
        double double7 = fDistribution4.probability((double) (byte) 0);
        double double8 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double10 = fDistribution4.density(0.6536158793732554d);
        java.lang.Class<?> wildcardClass11 = fDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.34981193815125994d + "'", double10 == 0.34981193815125994d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.density(0.5509385983974154d);
        boolean boolean7 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean8 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double12 = fDistribution3.cumulativeProbability(1.0d, 3.5564389998236723d);
        double double14 = fDistribution3.probability(0.26077781512086595d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7627482092423561d + "'", double6 == 0.7627482092423561d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.4485770812615808d + "'", double12 == 0.4485770812615808d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6403077985814492d, 2.2548075713444913d, 0.0d);
        double double5 = fDistribution3.cumulativeProbability(0.7731402972800671d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6041804222939758d + "'", double5 == 0.6041804222939758d);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        double double10 = uniformRealDistribution0.sample();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "99) test1947(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2512555790734534d + "'", double7 == 0.2512555790734534d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
// flaky "23) test1947(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.13685506624477073d + "'", double10 == 0.13685506624477073d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.5711493800797895d, 3.0034674852582924E-11d, 3.746475778452671E-4d);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        java.lang.Class<?> wildcardClass12 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "100) test1949(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.85256419393551d + "'", double7 == 2.85256419393551d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        java.lang.Class<?> wildcardClass4 = fDistribution3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(1.7411009838609295d, 0.7757685011213045d, 0.7805153048133248d);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.getNumericalVariance();
        double double12 = uniformRealDistribution2.cumulativeProbability(0.0d, 0.1757939476207693d);
        double double13 = uniformRealDistribution2.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = uniformRealDistribution2.inverseCumulativeProbability(0.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [?, ?]");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(4.711194252818312E-227d, 0.4999999999999701d, 8.746758854452454E-5d);
        fDistribution3.reseedRandomGenerator((long) '4');
        double double6 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        double double20 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "101) test1954(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7043043121654887d + "'", double9 == 0.7043043121654887d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.181009226124227E-44d + "'", double15 == 3.181009226124227E-44d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0210526315789474d + "'", double16 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.005949830804446096d + "'", double19 == 0.005949830804446096d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + Double.POSITIVE_INFINITY + "'", double20 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        double double5 = uniformRealDistribution0.getNumericalMean();
        double double6 = uniformRealDistribution0.sample();
        double double7 = uniformRealDistribution0.sample();
        double double8 = uniformRealDistribution0.getNumericalVariance();
        double double9 = uniformRealDistribution0.getSupportUpperBound();
        double double10 = uniformRealDistribution0.sample();
        java.lang.Class<?> wildcardClass11 = uniformRealDistribution0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "102) test1955(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8421066660850904d + "'", double3 == 0.8421066660850904d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
// flaky "24) test1955(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.51253287801954d + "'", double6 == 0.51253287801954d);
// flaky "5) test1955(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9441357645782928d + "'", double7 == 0.9441357645782928d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08333333333333333d + "'", double8 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
// flaky "1) test1955(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.23835103675872893d + "'", double10 == 0.23835103675872893d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) '4', (double) (byte) 1);
        double double3 = fDistribution2.getSupportUpperBound();
        fDistribution2.reseedRandomGenerator((long) 10);
        double double7 = fDistribution2.inverseCumulativeProbability(0.5960130158119923d);
        double double8 = fDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.514432656164581d + "'", double7 == 3.514432656164581d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability((double) (byte) -1, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistribution3.cumulativeProbability(0.6167685717416793d, 0.3417437038811675d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.617) must be less than or equal to upper endpoint (0.342)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportLowerBoundInclusive();
        double double6 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        boolean boolean7 = uniformRealDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05428794722368846d) + "'", double4 == (-0.05428794722368846d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.008099227320025548d, 0.18585761085314045d, 0.7432319455531449d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.8914306597714141d, 0.0d, 0.026171990764942643d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.891) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        boolean boolean6 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution2.getSupportLowerBound();
        double double8 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution2.getSupportLowerBound();
        double double11 = uniformRealDistribution2.cumulativeProbability(0.8208457026197589d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-9d + "'", double8 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.sample();
        double double9 = fDistribution3.density(0.0d);
        double double11 = fDistribution3.cumulativeProbability(0.5831064787455089d);
        double double12 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator((-1L));
        double double15 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double17 = fDistribution3.density(0.0d);
        double double18 = fDistribution3.getNumericalMean();
        double double19 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double20 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
// flaky "103) test1962(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.712244462262529d + "'", double7 == 0.712244462262529d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1757939476207693d + "'", double11 == 0.1757939476207693d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.23541417210258242d + "'", double12 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0210526315789474d + "'", double18 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.23541417210258242d + "'", double20 == 0.23541417210258242d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.0126043844632993d, 1.6131540547803525E-13d);
        double double3 = fDistribution2.calculateNumericalVariance();
        double double5 = fDistribution2.density(0.7915692479106915d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0189595281992352E-13d + "'", double5 == 1.0189595281992352E-13d);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.07277703352123166d, 0.7484518501737258d);
        double double3 = fDistribution2.getNumericalMean();
        double double4 = fDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-9d + "'", double4 == 1.0E-9d);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 0.7418114744879037d, 10.0d);
        double double4 = uniformRealDistribution3.getNumericalMean();
        boolean boolean5 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6768816359921004d + "'", double4 == 0.6768816359921004d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getNumericalMean();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double9 = fDistribution3.sample();
        double double10 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double13 = fDistribution3.density(0.3792158414148983d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "104) test1966(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6860363459712534d + "'", double9 == 0.6860363459712534d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4227053253174185d + "'", double13 == 0.4227053253174185d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.density((double) '#');
        double double9 = fDistribution3.getSolverAbsoluteAccuracy();
        double double11 = fDistribution3.density(0.8493872319532485d);
        double double12 = fDistribution3.getSolverAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistribution3.inverseCumulativeProbability(48.8425886151626d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 48.843 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.562099861400877E-28d + "'", double8 == 7.562099861400877E-28d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9280868261112525d + "'", double11 == 0.9280868261112525d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        boolean boolean15 = fDistribution3.isSupportLowerBoundInclusive();
        double double16 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "105) test1968(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.721644780787326d + "'", double9 == 0.721644780787326d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6119517974962971d, 1.936120997106573d, (double) (short) 1);
        boolean boolean4 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = uniformRealDistribution3.isSupportConnected();
        double double7 = uniformRealDistribution3.density(1.7354514364969038d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7551905000466074d + "'", double7 == 0.7551905000466074d);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.7410056902277217d, 0.9195016681888635d, 0.5833175443847145d);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = uniformRealDistribution0.probability(0.6060113752531858d, 1.5406071591967148E-5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.606) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "106) test1971(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.902899225065557d + "'", double4 == 0.902899225065557d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
// flaky "25) test1971(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.04747422819272362d + "'", double9 == 0.04747422819272362d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.6375566323163637d, 0.8465099057706973d, 0.10917347757783191d);
        double double4 = uniformRealDistribution3.getSupportLowerBound();
        boolean boolean5 = uniformRealDistribution3.isSupportUpperBoundInclusive();
        double double6 = uniformRealDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6375566323163637d + "'", double4 == 0.6375566323163637d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8465099057706973d + "'", double6 == 0.8465099057706973d);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        boolean boolean3 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double[] doubleArray5 = uniformRealDistribution2.sample((int) '4');
        double double6 = uniformRealDistribution2.getSupportUpperBound();
        double double7 = uniformRealDistribution2.getSupportUpperBound();
        double double9 = uniformRealDistribution2.probability(0.5662656190788444d);
        boolean boolean10 = uniformRealDistribution2.isSupportUpperBoundInclusive();
        double double12 = uniformRealDistribution2.probability(1.936120997106573d);
        double double14 = uniformRealDistribution2.cumulativeProbability(0.7948236153171645d);
        double double15 = uniformRealDistribution2.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        boolean boolean2 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double3 = uniformRealDistribution0.getSupportUpperBound();
        double double4 = uniformRealDistribution0.sample();
        double double6 = uniformRealDistribution0.cumulativeProbability(1.25d);
        double double7 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        double double9 = uniformRealDistribution0.density(3.3472124071874476d);
        double double11 = uniformRealDistribution0.density(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "107) test1974(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.060399913881601375d + "'", double4 == 0.060399913881601375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportUpperBound();
        double double9 = fDistribution3.getNumericalVariance();
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        double double11 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23541417210258242d + "'", double9 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution4 = new org.apache.commons.math3.distribution.UniformRealDistribution(randomGenerator0, 0.8151769424272568d, 11.264722442646567d, 0.704243793552324d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = uniformRealDistribution4.sample((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double5 = fDistribution3.getNumericalVariance();
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.sample();
        double double8 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean9 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.probability(6.006934970516585E-11d, 0.6995065888297458d);
        java.lang.Class<?> wildcardClass13 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "108) test1977(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6081706888281555d + "'", double7 == 0.6081706888281555d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.27724879872690233d + "'", double12 == 0.27724879872690233d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getSupportLowerBound();
        double double6 = fDistribution3.density(0.08333333333333333d);
        boolean boolean7 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) '#', Double.POSITIVE_INFINITY);
        double double4 = uniformRealDistribution2.density(0.8460138802083401d);
        boolean boolean5 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        boolean boolean6 = uniformRealDistribution2.isSupportLowerBoundInclusive();
        double double8 = uniformRealDistribution2.density(0.8795956948503574d);
        double double9 = uniformRealDistribution2.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = uniformRealDistribution2.inverseCumulativeProbability(1.7587590117661915d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 1.759 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.004853457297448672d, 0.004853457297448672d, (double) (byte) 0);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution4.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution4.inverseCumulativeProbability(0.8460138802083401d);
        double double10 = fDistribution4.cumulativeProbability(0.9217691399069918d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistribution4.probability(8.168549840576869d, 0.6802760699747519d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (8.169) must be less than or equal to upper endpoint (0.68)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004853457297448672d + "'", double5 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.004853457297448672d + "'", double6 == 0.004853457297448672d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.449868410599931E16d + "'", double8 == 1.449868410599931E16d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4999014899032976d + "'", double10 == 0.4999014899032976d);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(2.2548075713444913d, 0.9382068481430984d, 0.6306205419803896d);
        double[] doubleArray5 = fDistribution3.sample((int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        boolean boolean6 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        double double7 = uniformRealDistribution0.getSupportUpperBound();
        double double8 = uniformRealDistribution0.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "109) test1982(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3094307785163206d + "'", double3 == 0.3094307785163206d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution((double) (-1.0f), 0.8914241055526231d, 97.0d);
        double double4 = uniformRealDistribution3.sample();
        double double5 = uniformRealDistribution3.sample();
        double double6 = uniformRealDistribution3.getSolverAbsoluteAccuracy();
        double double8 = uniformRealDistribution3.inverseCumulativeProbability(0.7282585856777408d);
// flaky "110) test1983(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11999870743249341d + "'", double4 == 0.11999870743249341d);
// flaky "26) test1983(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7591888835865396d + "'", double5 == 0.7591888835865396d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.05428794722368846d) + "'", double8 == (-0.05428794722368846d));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.density(1.449868410599931E16d);
        double double8 = uniformRealDistribution0.sample();
        boolean boolean9 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double10 = uniformRealDistribution0.getNumericalVariance();
        double double11 = uniformRealDistribution0.getSupportLowerBound();
        double double13 = uniformRealDistribution0.density(0.8719310721377715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "111) test1984(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.928562774838759d + "'", double3 == 0.928562774838759d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "27) test1984(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.695604531760929d + "'", double8 == 0.695604531760929d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08333333333333333d + "'", double10 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        boolean boolean3 = uniformRealDistribution0.isSupportLowerBoundInclusive();
        double double4 = uniformRealDistribution0.getNumericalVariance();
        double double5 = uniformRealDistribution0.getNumericalVariance();
        double double6 = uniformRealDistribution0.sample();
        boolean boolean7 = uniformRealDistribution0.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = uniformRealDistribution0.cumulativeProbability(0.4803791664765238d, 0.1587842753197809d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.48) must be less than or equal to upper endpoint (0.159)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08333333333333333d + "'", double4 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08333333333333333d + "'", double5 == 0.08333333333333333d);
// flaky "112) test1985(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8196455674377428d + "'", double6 == 0.8196455674377428d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getSupportUpperBound();
        double[] doubleArray7 = fDistribution3.sample((int) (byte) 100);
        double double9 = fDistribution3.probability((double) (-1L));
        boolean boolean10 = fDistribution3.isSupportConnected();
        double double12 = fDistribution3.probability(6.006934970516585E-11d);
        double double13 = fDistribution3.getSolverAbsoluteAccuracy();
        double double15 = fDistribution3.inverseCumulativeProbability(0.6845893808238659d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.735866921060695d + "'", double15 == 1.735866921060695d);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(2.7171475092674E-46d, (double) 100L, 0.6121227109766438d);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double6 = fDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.823831179151655E45d + "'", double6 == 7.823831179151655E45d);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        boolean boolean15 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky "113) test1988(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.958813462729023d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08333333333333333d + "'", double9 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
        double double15 = uniformRealDistribution2.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-9d + "'", double12 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-9d + "'", double15 == 1.0E-9d);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 1.0d, 0.5509385983974154d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double6 = fDistribution3.calculateNumericalVariance();
        double double7 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double8 = fDistribution3.getSolverAbsoluteAccuracy();
        double double10 = fDistribution3.cumulativeProbability(0.9368714123469783d);
        double double12 = fDistribution3.cumulativeProbability(0.6882388789316614d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5509385983974154d + "'", double8 == 0.5509385983974154d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4896234655149419d + "'", double10 == 0.4896234655149419d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.4408795125955778d + "'", double12 == 0.4408795125955778d);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution3 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7043043121654887d, 0.0d, 0.8325228158963686d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.704) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 2.038365424903863d, 0.0d, (-0.749061208741136d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double4 = uniformRealDistribution0.getSupportUpperBound();
        boolean boolean5 = uniformRealDistribution0.isSupportUpperBoundInclusive();
        boolean boolean6 = uniformRealDistribution0.isSupportConnected();
        double double8 = uniformRealDistribution0.inverseCumulativeProbability(0.4116955788765788d);
        double double9 = uniformRealDistribution0.getSupportLowerBound();
        double double10 = uniformRealDistribution0.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "114) test1993(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6189313417966753d + "'", double3 == 0.6189313417966753d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4116955788765788d + "'", double8 == 0.4116955788765788d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
        double double15 = fDistribution3.inverseCumulativeProbability(0.49144275010114424d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0210526315789474d + "'", double7 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
// flaky "115) test1994(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6351547230388791d + "'", double9 == 0.6351547230388791d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.7490068016138842d + "'", double15 == 0.7490068016138842d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
        double double1 = uniformRealDistribution0.getNumericalVariance();
        double double2 = uniformRealDistribution0.getSupportLowerBound();
        double double3 = uniformRealDistribution0.sample();
        double double5 = uniformRealDistribution0.density((double) (byte) 1);
        double double7 = uniformRealDistribution0.cumulativeProbability(100.0d);
        boolean boolean8 = uniformRealDistribution0.isSupportConnected();
        double double9 = uniformRealDistribution0.getNumericalMean();
        double double10 = uniformRealDistribution0.sample();
        double double11 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08333333333333333d + "'", double1 == 0.08333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky "116) test1995(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4765763225772661d + "'", double3 == 0.4765763225772661d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
// flaky "28) test1995(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9515946696933737d + "'", double10 == 0.9515946696933737d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-9d + "'", double11 == 1.0E-9d);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.8669478676573001d, 0.3807199377752173d, 0.7852621085053451d);
        boolean boolean5 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double6 = fDistribution3.cumulativeProbability(100.0d, (double) (byte) 100);
        double double7 = fDistribution3.getSolverAbsoluteAccuracy();
        double double8 = fDistribution3.getSupportLowerBound();
        double double9 = fDistribution3.getSupportUpperBound();
        boolean boolean10 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator((long) (-1));
        double double9 = fDistribution3.inverseCumulativeProbability(0.03991922094106404d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23541417210258242d + "'", double5 == 0.23541417210258242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.UniformRealDistribution uniformRealDistribution2 = new org.apache.commons.math3.distribution.UniformRealDistribution(0.7097471133298018d, 0.045269875861498d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.71) must be strictly less than upper bound (0.045)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 10, (double) 'a', (double) (byte) 10);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean5 = fDistribution3.isSupportUpperBoundInclusive();
        double double7 = fDistribution3.density(0.7627482092423561d);
        boolean boolean8 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean9 = fDistribution3.isSupportLowerBoundInclusive();
        boolean boolean10 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9382068481430984d + "'", double7 == 0.9382068481430984d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }
}
