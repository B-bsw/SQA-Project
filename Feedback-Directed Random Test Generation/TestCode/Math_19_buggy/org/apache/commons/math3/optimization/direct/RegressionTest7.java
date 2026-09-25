package org.apache.commons.math3.optimization.direct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        double[] doubleArray7 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer16.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer16.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker19 = cMAESOptimizer16.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator13, true, pointValuePairConvergenceChecker19);
        double[] doubleArray35 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray35);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray35);
        org.apache.commons.math3.random.RandomGenerator randomGenerator43 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray35, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator43, false);
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray53);
        org.apache.commons.math3.random.RandomGenerator randomGenerator60 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker64 = cMAESOptimizer63.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList65 = cMAESOptimizer63.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer63.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray53, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator60, true, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray35, (int) (short) 0, (double) (byte) -1, false, (int) '4', (int) (byte) 1, randomGenerator60, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7, (int) ' ', (double) (short) 100, false, (int) ' ', 100, randomGenerator60, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList73 = cMAESOptimizer72.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList74 = cMAESOptimizer72.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList75 = cMAESOptimizer72.getStatisticsMeanHistory();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray76 = cMAESOptimizer72.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(realMatrixList18);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator60);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker64);
        org.junit.Assert.assertNotNull(realMatrixList65);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker66);
        org.junit.Assert.assertNotNull(realMatrixList73);
        org.junit.Assert.assertNotNull(realMatrixList74);
        org.junit.Assert.assertNotNull(realMatrixList75);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer2.getStatisticsDHistory();
        int int5 = cMAESOptimizer2.getEvaluations();
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray13);
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker24 = cMAESOptimizer23.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList25 = cMAESOptimizer23.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker26 = cMAESOptimizer23.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray13, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator20, true, pointValuePairConvergenceChecker26);
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray35);
        double[] doubleArray50 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray50);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray50);
        org.apache.commons.math3.random.RandomGenerator randomGenerator58 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray50, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator58, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray35, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator58, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray13, (int) (byte) 0, (double) 1L, true, (int) (byte) 100, (int) '#', randomGenerator58, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair66 = cMAESOptimizer2.optimize((int) (short) 0, multivariateFunction7, goalType8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(realMatrixList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator20);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(realMatrixList25);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker26);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator58);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5);
        double[] doubleArray40 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator46 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray40, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator46, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray5, (int) '#', (double) 1L, true, (int) (byte) 1, (int) '#', randomGenerator46, true);
        org.apache.commons.math3.random.RandomGenerator randomGenerator56 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray5, (-1), (double) (short) -1, false, (int) (byte) 100, (int) '4', randomGenerator56, false);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer58.getConvergenceChecker();
        int int60 = cMAESOptimizer58.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray61 = cMAESOptimizer58.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator28);
        org.junit.Assert.assertNotNull(randomGenerator46);
        org.junit.Assert.assertNotNull(randomGenerator56);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int5 = cMAESOptimizer0.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer0.getStatisticsDHistory();
        int int7 = cMAESOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realMatrixList1);
        org.junit.Assert.assertNotNull(doubleList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realMatrixList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        double[] doubleArray43 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker53 = cMAESOptimizer52.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList54 = cMAESOptimizer52.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker55 = cMAESOptimizer52.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray43, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator49, true, pointValuePairConvergenceChecker55);
        org.apache.commons.math3.random.RandomGenerator randomGenerator62 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray43, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator62, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType68 = cMAESOptimizer67.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker69 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray4, (int) ' ', (-1.0d), false, 10, (int) (byte) 1, randomGenerator62, true, pointValuePairConvergenceChecker69);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray4);
        java.util.List<java.lang.Double> doubleList72 = cMAESOptimizer71.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList73 = cMAESOptimizer71.getStatisticsSigmaHistory();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray74 = cMAESOptimizer71.getUpperBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator27);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker53);
        org.junit.Assert.assertNotNull(realMatrixList54);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker55);
        org.junit.Assert.assertNotNull(randomGenerator62);
        org.junit.Assert.assertNull(goalType68);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker69);
        org.junit.Assert.assertNotNull(doubleList72);
        org.junit.Assert.assertNotNull(doubleList73);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        double[] doubleArray5 = new double[] { '4', (short) 10, 1.0d, (byte) 0 };
        double[] doubleArray17 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer26.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList28 = cMAESOptimizer26.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker29 = cMAESOptimizer26.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray17, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator23, true, pointValuePairConvergenceChecker29);
        double[] doubleArray45 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray45);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray45);
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray45, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator53, false);
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray63);
        org.apache.commons.math3.random.RandomGenerator randomGenerator70 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer73.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList75 = cMAESOptimizer73.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker76 = cMAESOptimizer73.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray63, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator70, true, pointValuePairConvergenceChecker76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray45, (int) (short) 0, (double) (byte) -1, false, (int) '4', (int) (byte) 1, randomGenerator70, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray17, (int) ' ', (double) (short) 100, false, (int) ' ', 100, randomGenerator70, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray5, 0, (double) (short) 1, false, (int) (short) 1, (-1), randomGenerator70, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker84 = cMAESOptimizer83.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType85 = cMAESOptimizer83.getGoalType();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker27);
        org.junit.Assert.assertNotNull(realMatrixList28);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker29);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator53);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator70);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker74);
        org.junit.Assert.assertNotNull(realMatrixList75);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker76);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker84);
        org.junit.Assert.assertNull(goalType85);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray5);
        double[] doubleArray48 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray48);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray48);
        double[] doubleArray64 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray64);
        org.apache.commons.math3.random.RandomGenerator randomGenerator72 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray64, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator72, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray48, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator72, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5, (-1), (double) '#', true, (int) (byte) -1, (int) (byte) 100, randomGenerator72, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList79 = cMAESOptimizer78.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker80 = cMAESOptimizer78.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList81 = cMAESOptimizer78.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator28);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator72);
        org.junit.Assert.assertNotNull(realMatrixList79);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker80);
        org.junit.Assert.assertNotNull(realMatrixList81);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker7 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        double[] doubleArray13 = new double[] {};
        double[] doubleArray25 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator31 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker35 = cMAESOptimizer34.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList36 = cMAESOptimizer34.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker37 = cMAESOptimizer34.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator31, true, pointValuePairConvergenceChecker37);
        org.apache.commons.math3.random.RandomGenerator randomGenerator44 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray25, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator44, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList50 = cMAESOptimizer49.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList51 = cMAESOptimizer49.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker52 = cMAESOptimizer49.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray13, (int) (short) 10, (double) (-1.0f), false, (int) (byte) 0, (int) (byte) 10, randomGenerator44, false, pointValuePairConvergenceChecker52);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair55 = cMAESOptimizer1.optimize((-1), multivariateFunction9, goalType10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker35);
        org.junit.Assert.assertNotNull(realMatrixList36);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker37);
        org.junit.Assert.assertNotNull(randomGenerator44);
        org.junit.Assert.assertNotNull(doubleList50);
        org.junit.Assert.assertNotNull(realMatrixList51);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker52);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        double[] doubleArray5 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator11, true, pointValuePairConvergenceChecker17);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer18.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType20 = cMAESOptimizer18.getGoalType();
        int int21 = cMAESOptimizer18.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList22 = cMAESOptimizer18.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList23 = cMAESOptimizer18.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker15);
        org.junit.Assert.assertNotNull(realMatrixList16);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(realMatrixList19);
        org.junit.Assert.assertNull(goalType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(doubleList22);
        org.junit.Assert.assertNotNull(doubleList23);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator25 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray18, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator25, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray40 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator46 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker50 = cMAESOptimizer49.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList51 = cMAESOptimizer49.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker52 = cMAESOptimizer49.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray40, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator46, true, pointValuePairConvergenceChecker52);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray18, 0, (double) 100.0f, true, 30000, (int) (byte) 0, randomGenerator33, true, pointValuePairConvergenceChecker52);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList58 = cMAESOptimizer57.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer57.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray3, (int) (short) 10, 10.0d, true, (int) (short) 1, (int) (byte) 0, randomGenerator33, true, pointValuePairConvergenceChecker59);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3);
        java.util.List<java.lang.Double> doubleList62 = cMAESOptimizer61.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList63 = cMAESOptimizer61.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator33);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker50);
        org.junit.Assert.assertNotNull(realMatrixList51);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker52);
        org.junit.Assert.assertNotNull(realMatrixList58);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker59);
        org.junit.Assert.assertNotNull(doubleList62);
        org.junit.Assert.assertNotNull(doubleList63);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(doubleList3);
        org.junit.Assert.assertNotNull(realMatrixList4);
        org.junit.Assert.assertNotNull(doubleList5);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double[] doubleArray5 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator11, true, pointValuePairConvergenceChecker17);
        java.util.List<java.lang.Double> doubleList19 = cMAESOptimizer18.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList20 = cMAESOptimizer18.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList21 = cMAESOptimizer18.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker15);
        org.junit.Assert.assertNotNull(realMatrixList16);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertNotNull(doubleList20);
        org.junit.Assert.assertNotNull(realMatrixList21);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker9);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        double[] doubleArray11 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker21 = cMAESOptimizer20.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList22 = cMAESOptimizer20.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker23 = cMAESOptimizer20.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator17, true, pointValuePairConvergenceChecker23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray11);
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray34);
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray44);
        double[] doubleArray59 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray59);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray59);
        org.apache.commons.math3.random.RandomGenerator randomGenerator67 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray59, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator67, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray44, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator67, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray34, (int) (byte) 10, (double) (short) 100, false, (int) (short) 0, (int) (short) 10, randomGenerator67, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray11, (int) (short) 1, (double) 'a', false, 0, 30000, randomGenerator67, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray11);
        java.lang.Class<?> wildcardClass80 = cMAESOptimizer79.getClass();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker21);
        org.junit.Assert.assertNotNull(realMatrixList22);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker23);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator67);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        double[] doubleArray9 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker19 = cMAESOptimizer18.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList20 = cMAESOptimizer18.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker21 = cMAESOptimizer18.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator15, true, pointValuePairConvergenceChecker21);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray9);
        double[] doubleArray38 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray38);
        org.apache.commons.math3.random.RandomGenerator randomGenerator46 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray38, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator46, false);
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray56);
        org.apache.commons.math3.random.RandomGenerator randomGenerator63 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker67 = cMAESOptimizer66.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList68 = cMAESOptimizer66.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker69 = cMAESOptimizer66.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray56, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator63, true, pointValuePairConvergenceChecker69);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray38, (int) (short) 0, (double) (byte) -1, false, (int) '4', (int) (byte) 1, randomGenerator63, true);
        double[] doubleArray79 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator85 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker89 = cMAESOptimizer88.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList90 = cMAESOptimizer88.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker91 = cMAESOptimizer88.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray79, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator85, true, pointValuePairConvergenceChecker91);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray9, 0, (double) (byte) 10, true, 0, 30000, randomGenerator63, true, pointValuePairConvergenceChecker91);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9);
        java.util.List<java.lang.Double> doubleList96 = cMAESOptimizer95.getStatisticsFitnessHistory();
        int int97 = cMAESOptimizer95.getEvaluations();
        int int98 = cMAESOptimizer95.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker99 = cMAESOptimizer95.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(realMatrixList20);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker21);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator46);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator63);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker67);
        org.junit.Assert.assertNotNull(realMatrixList68);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker69);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker89);
        org.junit.Assert.assertNotNull(realMatrixList90);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker91);
        org.junit.Assert.assertNotNull(doubleList96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker99);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        double[] doubleArray6 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer15.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer15.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer15.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator12, true, pointValuePairConvergenceChecker18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType21 = cMAESOptimizer20.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair22 = cMAESOptimizer20.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNull(goalType21);
    }
}

