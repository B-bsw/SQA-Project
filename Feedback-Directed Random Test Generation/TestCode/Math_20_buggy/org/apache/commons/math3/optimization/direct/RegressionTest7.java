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
        double[] doubleArray1 = null;
        double[] doubleArray8 = null;
        double[] doubleArray20 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker30 = cMAESOptimizer29.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList31 = cMAESOptimizer29.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker32 = cMAESOptimizer29.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator26, true, pointValuePairConvergenceChecker32);
        double[] doubleArray48 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray48);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray48);
        org.apache.commons.math3.random.RandomGenerator randomGenerator56 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray48, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator56, false);
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray66);
        org.apache.commons.math3.random.RandomGenerator randomGenerator73 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker77 = cMAESOptimizer76.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList78 = cMAESOptimizer76.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker79 = cMAESOptimizer76.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray66, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator73, true, pointValuePairConvergenceChecker79);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray48, (int) (short) 0, (double) (byte) -1, false, (int) '4', (int) (byte) 1, randomGenerator73, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray20, (int) ' ', (double) (short) 100, false, (int) ' ', 100, randomGenerator73, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray8, 0, 1.0d, false, (int) (byte) 100, (int) (byte) 10, randomGenerator73, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray1, (int) (short) 100, (double) 1.0f, false, (int) '#', (int) (byte) 10, randomGenerator73, false);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker89 = cMAESOptimizer88.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker30);
        org.junit.Assert.assertNotNull(realMatrixList31);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker32);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator56);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator73);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker77);
        org.junit.Assert.assertNotNull(realMatrixList78);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker79);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker89);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        double[] doubleArray6 = new double[] { ' ', 0.0f };
        double[] doubleArray13 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator19 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray13, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator19, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray6, (int) (short) 100, (double) 1L, true, (int) (byte) 100, (int) (byte) 1, randomGenerator19, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray6);
        double[] doubleArray33 = new double[] { ' ', 0.0f };
        double[] doubleArray40 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator46 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray40, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator46, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray33, (int) (short) 100, (double) 1L, true, (int) (byte) 100, (int) (byte) 1, randomGenerator46, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray6, 30000, (double) (-1), true, (int) (byte) 100, (int) (short) 0, randomGenerator46, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator19);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator46);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        double[] doubleArray24 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator41 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker45 = cMAESOptimizer44.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList46 = cMAESOptimizer44.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker47 = cMAESOptimizer44.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray34, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator41, true, pointValuePairConvergenceChecker47);
        double[] doubleArray51 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray51);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker53 = cMAESOptimizer52.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray24, (int) '#', (double) 1.0f, false, (int) (short) 0, (-1), randomGenerator41, false, pointValuePairConvergenceChecker53);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray8, (int) (byte) 100, (-1.0d), true, 30000, (int) (byte) 0, randomGenerator41, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker57 = cMAESOptimizer56.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList58 = cMAESOptimizer56.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator41);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker45);
        org.junit.Assert.assertNotNull(realMatrixList46);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker47);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker53);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker57);
        org.junit.Assert.assertNotNull(doubleList58);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        int int8 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        double[] doubleArray12 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray12);
        org.apache.commons.math3.random.RandomGenerator randomGenerator19 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray12, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator19, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        java.util.List<java.lang.Double> doubleList27 = cMAESOptimizer26.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList27);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        double[] doubleArray1 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray1, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator7, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer9.getConvergenceChecker();
        int int11 = cMAESOptimizer9.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer9.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer9.getStatisticsFitnessHistory();
        int int15 = cMAESOptimizer9.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer9.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(realMatrixList12);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(realMatrixList16);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray8, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator15, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        int int19 = cMAESOptimizer18.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList20 = cMAESOptimizer18.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList21 = cMAESOptimizer18.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList22 = cMAESOptimizer18.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(realMatrixList20);
        org.junit.Assert.assertNotNull(doubleList21);
        org.junit.Assert.assertNotNull(realMatrixList22);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray4);
        int int72 = cMAESOptimizer71.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList73 = cMAESOptimizer71.getStatisticsDHistory();
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(realMatrixList73);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        double[] doubleArray1 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = cMAESOptimizer2.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray8);
        double[] doubleArray23 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.random.RandomGenerator randomGenerator31 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray23, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator31, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray8, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator31, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator42 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray8, 1, (double) (byte) 100, true, (int) '#', 30000, randomGenerator42, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator31);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double[] doubleArray7 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer16.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer16.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker19 = cMAESOptimizer16.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator13, true, pointValuePairConvergenceChecker19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray7, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator26, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList30 = cMAESOptimizer29.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType31 = cMAESOptimizer29.getGoalType();
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer29.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(realMatrixList18);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(randomGenerator26);
        org.junit.Assert.assertNotNull(realMatrixList30);
        org.junit.Assert.assertNull(goalType31);
        org.junit.Assert.assertNotNull(doubleList32);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray4);
        double[] doubleArray46 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray46);
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray46, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator53, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator61 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray46, 1, (double) '4', true, (int) (short) -1, 10, randomGenerator61, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray4, 1, (double) (byte) -1, true, (int) (byte) 100, (int) (short) -1, randomGenerator61, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList66 = cMAESOptimizer65.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker67 = cMAESOptimizer65.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray68 = cMAESOptimizer65.getUpperBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator27);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator61);
        org.junit.Assert.assertNotNull(realMatrixList66);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker67);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer38.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList40 = cMAESOptimizer38.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker41 = cMAESOptimizer38.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray28, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator35, true, pointValuePairConvergenceChecker41);
        double[] doubleArray45 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray45);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker47 = cMAESOptimizer46.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray18, (int) '#', (double) 1.0f, false, (int) (short) 0, (-1), randomGenerator35, false, pointValuePairConvergenceChecker47);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray55);
        org.apache.commons.math3.random.RandomGenerator randomGenerator62 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer65.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList67 = cMAESOptimizer65.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray55, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator62, true, pointValuePairConvergenceChecker68);
        double[] doubleArray77 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray77);
        org.apache.commons.math3.random.RandomGenerator randomGenerator84 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker88 = cMAESOptimizer87.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList89 = cMAESOptimizer87.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker90 = cMAESOptimizer87.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray77, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator84, true, pointValuePairConvergenceChecker90);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray55, 100, (-1.0d), true, 1, (int) (byte) 10, randomGenerator84, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray55);
        double[] doubleArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair97 = cMAESOptimizer1.optimize((int) (byte) 0, multivariateFunction7, goalType8, doubleArray18, doubleArray55, doubleArray96);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 0 != 5");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(doubleList3);
        org.junit.Assert.assertNotNull(doubleList4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator35);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker39);
        org.junit.Assert.assertNotNull(realMatrixList40);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker41);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker47);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator62);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker66);
        org.junit.Assert.assertNotNull(realMatrixList67);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker68);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator84);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker88);
        org.junit.Assert.assertNotNull(realMatrixList89);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker90);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray7);
        double[] doubleArray22 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray22);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray22);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray22, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        double[] doubleArray51 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray51);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray51);
        double[] doubleArray67 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray67);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray67);
        org.apache.commons.math3.random.RandomGenerator randomGenerator75 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray67, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator75, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray51, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator75, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList83 = cMAESOptimizer82.getStatisticsSigmaHistory();
        int int84 = cMAESOptimizer82.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker85 = cMAESOptimizer82.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7, (int) (short) 0, (double) (byte) 1, false, 10, (int) 'a', randomGenerator75, true, pointValuePairConvergenceChecker85);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator30);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator75);
        org.junit.Assert.assertNotNull(doubleList83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker85);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray4);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList72 = cMAESOptimizer71.getStatisticsMeanHistory();
        int int73 = cMAESOptimizer71.getEvaluations();
        java.util.List<java.lang.Double> doubleList74 = cMAESOptimizer71.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList75 = cMAESOptimizer71.getStatisticsSigmaHistory();
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
        org.junit.Assert.assertNotNull(realMatrixList72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(doubleList74);
        org.junit.Assert.assertNotNull(doubleList75);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        double[] doubleArray6 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer15.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer15.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer15.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator12, true, pointValuePairConvergenceChecker18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList21 = cMAESOptimizer20.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType22 = cMAESOptimizer20.getGoalType();
        java.util.List<java.lang.Double> doubleList23 = cMAESOptimizer20.getStatisticsSigmaHistory();
        int int24 = cMAESOptimizer20.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair25 = cMAESOptimizer20.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(doubleList21);
        org.junit.Assert.assertNull(goalType22);
        org.junit.Assert.assertNotNull(doubleList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        double[] doubleArray1 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray1, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator7, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer9.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer9.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer9.getGoalType();
        int int13 = cMAESOptimizer9.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = cMAESOptimizer9.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator38 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray4, 1, (double) (byte) 100, true, (int) '#', 30000, randomGenerator38, false);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList41 = cMAESOptimizer40.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList42 = cMAESOptimizer40.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType43 = cMAESOptimizer40.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList44 = cMAESOptimizer40.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator27);
        org.junit.Assert.assertNotNull(realMatrixList41);
        org.junit.Assert.assertNotNull(doubleList42);
        org.junit.Assert.assertNull(goalType43);
        org.junit.Assert.assertNotNull(realMatrixList44);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double[] doubleArray6 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer15.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer15.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer15.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator12, true, pointValuePairConvergenceChecker18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList21 = cMAESOptimizer20.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker22 = cMAESOptimizer20.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList23 = cMAESOptimizer20.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList24 = cMAESOptimizer20.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(realMatrixList21);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker22);
        org.junit.Assert.assertNotNull(realMatrixList23);
        org.junit.Assert.assertNotNull(realMatrixList24);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray6);
        double[] doubleArray21 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray21);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray21);
        org.apache.commons.math3.random.RandomGenerator randomGenerator29 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray21, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator29, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray6, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator29, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray6);
        double[] doubleArray41 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator47 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray41, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator47, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray6, (int) '#', (double) 1L, true, (int) (byte) 1, (int) '#', randomGenerator47, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList54 = cMAESOptimizer53.getStatisticsDHistory();
        int int55 = cMAESOptimizer53.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator29);
        org.junit.Assert.assertNotNull(randomGenerator47);
        org.junit.Assert.assertNotNull(realMatrixList54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        double[] doubleArray6 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer15.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer15.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer15.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator12, true, pointValuePairConvergenceChecker18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList21 = cMAESOptimizer20.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker22 = cMAESOptimizer20.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList23 = cMAESOptimizer20.getStatisticsFitnessHistory();
        int int24 = cMAESOptimizer20.getEvaluations();
        int int25 = cMAESOptimizer20.getEvaluations();
        java.util.List<java.lang.Double> doubleList26 = cMAESOptimizer20.getStatisticsSigmaHistory();
        int int27 = cMAESOptimizer20.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(realMatrixList21);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker22);
        org.junit.Assert.assertNotNull(doubleList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(doubleList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.lang.Class<?> wildcardClass14 = doubleList13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray7);
        double[] doubleArray22 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray22);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray22);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray22, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7);
        double[] doubleArray42 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator48 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray42, (int) '#', (double) '#', false, (int) (short) -1, (int) (byte) -1, randomGenerator48, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList54 = cMAESOptimizer53.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker55 = cMAESOptimizer53.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray7, (int) (short) -1, (double) 100L, true, (int) '#', 1, randomGenerator48, true, pointValuePairConvergenceChecker55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray60 = cMAESOptimizer59.getLowerBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator30);
        org.junit.Assert.assertNotNull(randomGenerator48);
        org.junit.Assert.assertNotNull(realMatrixList54);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker55);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        double[] doubleArray17 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray17);
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray17, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator24, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray39 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator45 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker49 = cMAESOptimizer48.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList50 = cMAESOptimizer48.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker51 = cMAESOptimizer48.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray39, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator45, true, pointValuePairConvergenceChecker51);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray17, 0, (double) 100.0f, true, 30000, (int) (byte) 0, randomGenerator32, true, pointValuePairConvergenceChecker51);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList57 = cMAESOptimizer56.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker58 = cMAESOptimizer56.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray2, (int) (short) 10, 10.0d, true, (int) (short) 1, (int) (byte) 0, randomGenerator32, true, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        int int61 = cMAESOptimizer59.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair62 = cMAESOptimizer59.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator32);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker49);
        org.junit.Assert.assertNotNull(realMatrixList50);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker51);
        org.junit.Assert.assertNotNull(realMatrixList57);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker58);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray10, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator18, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList23 = cMAESOptimizer22.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertNotNull(realMatrixList23);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realMatrixList2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray10, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator18, false);
        double[] doubleArray32 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator38 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer41.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList43 = cMAESOptimizer41.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer41.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray32, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator38, true, pointValuePairConvergenceChecker44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray32, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator51, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray10, (int) '#', (double) (short) 100, true, (int) (byte) 0, (int) (short) -1, randomGenerator51, true);
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray63);
        org.apache.commons.math3.random.RandomGenerator randomGenerator70 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer73.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList75 = cMAESOptimizer73.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker76 = cMAESOptimizer73.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray63, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator70, true, pointValuePairConvergenceChecker76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList81 = cMAESOptimizer80.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker82 = cMAESOptimizer80.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10, (int) '#', (double) (short) -1, true, (int) (short) 100, (int) (byte) 10, randomGenerator70, true, pointValuePairConvergenceChecker82);
        int int84 = cMAESOptimizer83.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker42);
        org.junit.Assert.assertNotNull(realMatrixList43);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(randomGenerator51);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator70);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker74);
        org.junit.Assert.assertNotNull(realMatrixList75);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker76);
        org.junit.Assert.assertNotNull(realMatrixList81);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double[] doubleArray8 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer17.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer17.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker20 = cMAESOptimizer17.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator14, true, pointValuePairConvergenceChecker20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray8, (int) (short) 0, (double) 0, false, (int) (short) 0, (int) '#', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker32 = cMAESOptimizer31.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker33 = cMAESOptimizer31.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = cMAESOptimizer31.getLowerBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(realMatrixList19);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker20);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker32);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker33);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray9, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator16, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        double[] doubleArray33 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        double[] doubleArray43 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator50 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker54 = cMAESOptimizer53.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList55 = cMAESOptimizer53.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker56 = cMAESOptimizer53.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray43, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator50, true, pointValuePairConvergenceChecker56);
        double[] doubleArray60 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray60);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker62 = cMAESOptimizer61.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray33, (int) '#', (double) 1.0f, false, (int) (short) 0, (-1), randomGenerator50, false, pointValuePairConvergenceChecker62);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9, 1, 100.0d, false, (int) (byte) -1, (int) (byte) 10, randomGenerator50, false);
        java.util.List<java.lang.Double> doubleList66 = cMAESOptimizer65.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType67 = cMAESOptimizer65.getGoalType();
        java.util.List<java.lang.Double> doubleList68 = cMAESOptimizer65.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator50);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker54);
        org.junit.Assert.assertNotNull(realMatrixList55);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker56);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker62);
        org.junit.Assert.assertNotNull(doubleList66);
        org.junit.Assert.assertNull(goalType67);
        org.junit.Assert.assertNotNull(doubleList68);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        double[] doubleArray7 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer16.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer16.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker19 = cMAESOptimizer16.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator13, true, pointValuePairConvergenceChecker19);
        double[] doubleArray32 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator38 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer41.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList43 = cMAESOptimizer41.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer41.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray32, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator38, true, pointValuePairConvergenceChecker44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray32, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator51, true);
        double[] doubleArray57 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray57);
        org.apache.commons.math3.random.RandomGenerator randomGenerator64 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList69 = cMAESOptimizer67.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray57, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator64, true, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7, (int) (byte) 10, (-1.0d), false, (int) (byte) -1, (int) (short) 1, randomGenerator51, false, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList74 = cMAESOptimizer73.getStatisticsMeanHistory();
        int int75 = cMAESOptimizer73.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList76 = cMAESOptimizer73.getStatisticsMeanHistory();
        int int77 = cMAESOptimizer73.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker78 = cMAESOptimizer73.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(realMatrixList18);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker42);
        org.junit.Assert.assertNotNull(realMatrixList43);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(randomGenerator51);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator64);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker68);
        org.junit.Assert.assertNotNull(realMatrixList69);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker70);
        org.junit.Assert.assertNotNull(realMatrixList74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(realMatrixList76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker78);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        int int7 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer1.getConvergenceChecker();
        int int10 = cMAESOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realMatrixList5);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(doubleList3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realMatrixList6);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray3);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray4);
        int int9 = cMAESOptimizer8.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray8, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator15, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray8, 1, (double) '4', true, (int) (short) -1, 10, randomGenerator23, false);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList26 = cMAESOptimizer25.getStatisticsMeanHistory();
        int int27 = cMAESOptimizer25.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList28 = cMAESOptimizer25.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator23);
        org.junit.Assert.assertNotNull(realMatrixList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(realMatrixList28);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        double[] doubleArray1 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray1, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator7, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer9.getConvergenceChecker();
        int int11 = cMAESOptimizer9.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer9.getStatisticsFitnessHistory();
        java.lang.Class<?> wildcardClass14 = doubleList13.getClass();
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(realMatrixList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray9, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator16, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray9, 1, (double) '4', true, (int) (short) -1, 10, randomGenerator24, false);
        double[] doubleArray39 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray39);
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray48);
        double[] doubleArray63 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.random.RandomGenerator randomGenerator71 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray63, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator71, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray48, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator71, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray39, (int) (byte) 100, (-1.0d), false, (int) '4', (int) (byte) 1, randomGenerator71, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray9, (int) (short) 0, (double) ' ', false, 0, 30000, randomGenerator71, false);
        java.util.List<java.lang.Double> doubleList80 = cMAESOptimizer79.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType81 = cMAESOptimizer79.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList82 = cMAESOptimizer79.getStatisticsMeanHistory();
        java.lang.Class<?> wildcardClass83 = cMAESOptimizer79.getClass();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator24);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator71);
        org.junit.Assert.assertNotNull(doubleList80);
        org.junit.Assert.assertNull(goalType81);
        org.junit.Assert.assertNotNull(realMatrixList82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList32 = cMAESOptimizer31.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList33 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int34 = cMAESOptimizer31.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator26);
        org.junit.Assert.assertNotNull(realMatrixList32);
        org.junit.Assert.assertNotNull(doubleList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(doubleList2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray13 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator19 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker23 = cMAESOptimizer22.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList24 = cMAESOptimizer22.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer22.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator19, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray13, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator32, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList38 = cMAESOptimizer37.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList39 = cMAESOptimizer37.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker40 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1, (int) (short) 10, (double) (-1.0f), false, (int) (byte) 0, (int) (byte) 10, randomGenerator32, false, pointValuePairConvergenceChecker40);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList42 = cMAESOptimizer41.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType43 = cMAESOptimizer41.getGoalType();
        int int44 = cMAESOptimizer41.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList45 = cMAESOptimizer41.getStatisticsMeanHistory();
        int int46 = cMAESOptimizer41.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList47 = cMAESOptimizer41.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList48 = cMAESOptimizer41.getStatisticsFitnessHistory();
        int int49 = cMAESOptimizer41.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker23);
        org.junit.Assert.assertNotNull(realMatrixList24);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker25);
        org.junit.Assert.assertNotNull(randomGenerator32);
        org.junit.Assert.assertNotNull(doubleList38);
        org.junit.Assert.assertNotNull(realMatrixList39);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker40);
        org.junit.Assert.assertNotNull(realMatrixList42);
        org.junit.Assert.assertNull(goalType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(realMatrixList45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(realMatrixList47);
        org.junit.Assert.assertNotNull(doubleList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        double[] doubleArray12 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray12);
        org.apache.commons.math3.random.RandomGenerator randomGenerator19 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray12, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator19, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray12);
        double[] doubleArray38 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray38);
        org.apache.commons.math3.random.RandomGenerator randomGenerator45 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray38, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator45, false);
        double[] doubleArray61 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray61);
        org.apache.commons.math3.random.RandomGenerator randomGenerator68 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray61, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator68, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator76 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray61, 1, (double) '4', true, (int) (short) -1, 10, randomGenerator76, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList82 = cMAESOptimizer81.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker83 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray38, (int) (byte) 0, (double) 30000, false, (int) (short) -1, (int) '#', randomGenerator76, false, pointValuePairConvergenceChecker83);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray12, (int) '#', (double) 1, false, (int) 'a', (int) '4', randomGenerator76, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator76);
        org.junit.Assert.assertNotNull(doubleList82);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker83);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        double[] doubleArray39 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator45 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray39, (int) '#', (double) '#', false, (int) (short) -1, (int) (byte) -1, randomGenerator45, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray4, (int) (short) 1, (double) 30000, false, (int) (short) 100, 30000, randomGenerator45, true);
        java.util.List<java.lang.Double> doubleList50 = cMAESOptimizer49.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator27);
        org.junit.Assert.assertNotNull(randomGenerator45);
        org.junit.Assert.assertNotNull(doubleList50);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray8, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator16, false);
        java.lang.Class<?> wildcardClass19 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray2);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer4.getStatisticsMeanHistory();
        int int6 = cMAESOptimizer4.getEvaluations();
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        double[] doubleArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer4.optimize(1, multivariateFunction8, goalType9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(doubleList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleList5);
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray7, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator14, false);
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer16.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer16.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer16.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType20 = cMAESOptimizer16.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList21 = cMAESOptimizer16.getStatisticsMeanHistory();
        java.lang.Class<?> wildcardClass22 = realMatrixList21.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(realMatrixList19);
        org.junit.Assert.assertNull(goalType20);
        org.junit.Assert.assertNotNull(realMatrixList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.lang.Class<?> wildcardClass8 = doubleList7.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(doubleList3);
        org.junit.Assert.assertNotNull(doubleList4);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray21);
        double[] doubleArray36 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray36);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray36);
        org.apache.commons.math3.random.RandomGenerator randomGenerator44 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray36, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator44, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray21, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator44, false);
        double[] doubleArray60 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator66 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer69.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList71 = cMAESOptimizer69.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker72 = cMAESOptimizer69.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray60, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator66, true, pointValuePairConvergenceChecker72);
        org.apache.commons.math3.random.RandomGenerator randomGenerator79 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray60, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator79, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType85 = cMAESOptimizer84.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker86 = cMAESOptimizer84.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray21, (int) ' ', (-1.0d), false, 10, (int) (byte) 1, randomGenerator79, true, pointValuePairConvergenceChecker86);
        double[] doubleArray90 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray90);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker92 = cMAESOptimizer91.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray10, 30000, 10.0d, false, (int) (byte) -1, (int) 'a', randomGenerator79, true, pointValuePairConvergenceChecker92);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList96 = cMAESOptimizer95.getStatisticsDHistory();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray97 = cMAESOptimizer95.getLowerBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator44);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker70);
        org.junit.Assert.assertNotNull(realMatrixList71);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker72);
        org.junit.Assert.assertNotNull(randomGenerator79);
        org.junit.Assert.assertNull(goalType85);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker86);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker92);
        org.junit.Assert.assertNotNull(realMatrixList96);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator25 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray18, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator25, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        double[] doubleArray42 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray42);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray42);
        double[] doubleArray52 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray52);
        org.apache.commons.math3.random.RandomGenerator randomGenerator59 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker63 = cMAESOptimizer62.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList64 = cMAESOptimizer62.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker65 = cMAESOptimizer62.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray52, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator59, true, pointValuePairConvergenceChecker65);
        double[] doubleArray69 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray69);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker71 = cMAESOptimizer70.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray42, (int) '#', (double) 1.0f, false, (int) (short) 0, (-1), randomGenerator59, false, pointValuePairConvergenceChecker71);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray18, 1, 100.0d, false, (int) (byte) -1, (int) (byte) 10, randomGenerator59, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray2, 10, (double) (byte) 10, true, 1, (int) (byte) 100, randomGenerator59, false);
        org.apache.commons.math3.optimization.GoalType goalType77 = cMAESOptimizer76.getGoalType();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator59);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker63);
        org.junit.Assert.assertNotNull(realMatrixList64);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker65);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker71);
        org.junit.Assert.assertNull(goalType77);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        org.junit.Assert.assertNotNull(doubleList2);
        org.junit.Assert.assertNotNull(doubleList3);
        org.junit.Assert.assertNotNull(realMatrixList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer13.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer13.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer13.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator10, true, pointValuePairConvergenceChecker16);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray3);
        int int19 = cMAESOptimizer18.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList20 = cMAESOptimizer18.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList21 = cMAESOptimizer18.getStatisticsMeanHistory();
        java.lang.Class<?> wildcardClass22 = cMAESOptimizer18.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator10);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(realMatrixList20);
        org.junit.Assert.assertNotNull(realMatrixList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        double[] doubleArray11 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        double[] doubleArray14 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray14);
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray14, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator21, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray14);
        double[] doubleArray36 = null;
        double[] doubleArray50 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray50);
        org.apache.commons.math3.random.RandomGenerator randomGenerator57 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray50, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator57, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator65 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray72 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator78 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker82 = cMAESOptimizer81.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList83 = cMAESOptimizer81.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker84 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray72, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator78, true, pointValuePairConvergenceChecker84);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray50, 0, (double) 100.0f, true, 30000, (int) (byte) 0, randomGenerator65, true, pointValuePairConvergenceChecker84);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray36, (int) (short) 100, (double) 10L, false, (int) (byte) -1, (int) (byte) 0, randomGenerator65, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray14, 0, (double) '#', false, (-1), (int) (short) 1, randomGenerator65, true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator65);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker82);
        org.junit.Assert.assertNotNull(realMatrixList83);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker84);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer7.getGoalType();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray16);
        double[] doubleArray31 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.random.RandomGenerator randomGenerator39 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray31, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator39, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray16, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator39, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray16);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray16);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray16);
        double[] doubleArray60 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray60);
        double[] doubleArray76 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.random.RandomGenerator randomGenerator84 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray76, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator84, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray60, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator84, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList92 = cMAESOptimizer91.getStatisticsSigmaHistory();
        int int93 = cMAESOptimizer91.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker94 = cMAESOptimizer91.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray16, (int) (short) 0, (double) (byte) 1, false, 10, (int) 'a', randomGenerator84, true, pointValuePairConvergenceChecker94);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair97 = cMAESOptimizer1.optimize((int) (short) 1, multivariateFunction7, goalType8, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(doubleList3);
        org.junit.Assert.assertNotNull(doubleList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator39);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator84);
        org.junit.Assert.assertNotNull(doubleList92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker94);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int14 = cMAESOptimizer7.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(realMatrixList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int8 = cMAESOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realMatrixList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        double[] doubleArray11 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator18, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        int int25 = cMAESOptimizer24.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        double[] doubleArray42 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator48 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker52 = cMAESOptimizer51.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList53 = cMAESOptimizer51.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker54 = cMAESOptimizer51.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray42, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator48, true, pointValuePairConvergenceChecker54);
        org.apache.commons.math3.random.RandomGenerator randomGenerator61 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray42, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator61, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType67 = cMAESOptimizer66.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer66.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray3, (int) ' ', (-1.0d), false, 10, (int) (byte) 1, randomGenerator61, true, pointValuePairConvergenceChecker68);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray70 = cMAESOptimizer69.getUpperBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator26);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker52);
        org.junit.Assert.assertNotNull(realMatrixList53);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker54);
        org.junit.Assert.assertNotNull(randomGenerator61);
        org.junit.Assert.assertNull(goalType67);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker68);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer0.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer0.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsSigmaHistory();
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        double[] doubleArray17 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer26.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList28 = cMAESOptimizer26.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker29 = cMAESOptimizer26.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray17, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator23, true, pointValuePairConvergenceChecker29);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray17);
        org.apache.commons.math3.random.RandomGenerator randomGenerator37 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray17, (int) (short) 0, (double) 0, false, (int) (short) 0, (int) '#', randomGenerator37, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray17);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair42 = cMAESOptimizer0.optimize((int) ' ', multivariateFunction6, goalType7, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixList1);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(doubleList4);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker27);
        org.junit.Assert.assertNotNull(realMatrixList28);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker29);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray7);
        double[] doubleArray22 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray22);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray22);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray22, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator41 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray7, 1, (double) (byte) 100, true, (int) '#', 30000, randomGenerator41, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        double[] doubleArray52 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator58 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray52, (int) '#', (double) '#', false, (int) (short) -1, (int) (byte) -1, randomGenerator58, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray7, (int) (byte) 1, 1.0d, false, (int) '#', 0, randomGenerator58, false);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker63 = cMAESOptimizer62.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker64 = cMAESOptimizer62.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator30);
        org.junit.Assert.assertNotNull(randomGenerator58);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker63);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker64);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        double[] doubleArray1 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray1, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator7, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer9.getConvergenceChecker();
        int int11 = cMAESOptimizer9.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer9.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer9.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer9.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer9.getStatisticsDHistory();
        int int16 = cMAESOptimizer9.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer9.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer9.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker19 = cMAESOptimizer9.getConvergenceChecker();
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(realMatrixList12);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker13);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker19);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        double[] doubleArray13 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray13);
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray13, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator20, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray13, 1, (double) '4', true, (int) (short) -1, 10, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray13);
        double[] doubleArray43 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator50 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker54 = cMAESOptimizer53.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList55 = cMAESOptimizer53.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker56 = cMAESOptimizer53.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray43, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator50, true, pointValuePairConvergenceChecker56);
        double[] doubleArray65 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray65);
        org.apache.commons.math3.random.RandomGenerator randomGenerator72 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker76 = cMAESOptimizer75.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList77 = cMAESOptimizer75.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker78 = cMAESOptimizer75.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray65, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator72, true, pointValuePairConvergenceChecker78);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray43, 100, (-1.0d), true, 1, (int) (byte) 10, randomGenerator72, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        java.util.List<java.lang.Double> doubleList85 = cMAESOptimizer84.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList86 = cMAESOptimizer84.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker87 = cMAESOptimizer84.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray13, (int) 'a', (double) (byte) 100, true, 100, (int) (short) 100, randomGenerator72, false, pointValuePairConvergenceChecker87);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator28);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator50);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker54);
        org.junit.Assert.assertNotNull(realMatrixList55);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker56);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator72);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker76);
        org.junit.Assert.assertNotNull(realMatrixList77);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker78);
        org.junit.Assert.assertNotNull(doubleList85);
        org.junit.Assert.assertNotNull(realMatrixList86);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker87);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        int int7 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realMatrixList5);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        double[] doubleArray9 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker19 = cMAESOptimizer18.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList20 = cMAESOptimizer18.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker21 = cMAESOptimizer18.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator15, true, pointValuePairConvergenceChecker21);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair27 = cMAESOptimizer26.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(realMatrixList20);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker21);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        int int7 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int9 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.lang.Class<?> wildcardClass11 = doubleList10.getClass();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realMatrixList5);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realMatrixList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        double[] doubleArray6 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer15.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer15.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer15.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator12, true, pointValuePairConvergenceChecker18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList21 = cMAESOptimizer20.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType22 = cMAESOptimizer20.getGoalType();
        java.util.List<java.lang.Double> doubleList23 = cMAESOptimizer20.getStatisticsSigmaHistory();
        int int24 = cMAESOptimizer20.getEvaluations();
        java.util.List<java.lang.Double> doubleList25 = cMAESOptimizer20.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList26 = cMAESOptimizer20.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(doubleList21);
        org.junit.Assert.assertNull(goalType22);
        org.junit.Assert.assertNotNull(doubleList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(doubleList25);
        org.junit.Assert.assertNotNull(doubleList26);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray11);
        double[] doubleArray26 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray26, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator34, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray11, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator34, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray11);
        double[] doubleArray46 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator52 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray46, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator52, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray11, (int) '#', (double) 1L, true, (int) (byte) 1, (int) '#', randomGenerator52, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator64 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray11, (int) '#', (double) (byte) 0, false, (int) (short) -1, (-1), randomGenerator64, true);
        org.apache.commons.math3.random.RandomGenerator randomGenerator72 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray11, 1, (double) (short) 0, true, (int) 'a', (int) ' ', randomGenerator72, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator34);
        org.junit.Assert.assertNotNull(randomGenerator52);
        org.junit.Assert.assertNotNull(randomGenerator72);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray5);
        org.apache.commons.math3.random.RandomGenerator randomGenerator39 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray5, 1, (double) (byte) 100, true, (int) '#', 30000, randomGenerator39, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray5);
        java.util.List<java.lang.Double> doubleList43 = cMAESOptimizer42.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList44 = cMAESOptimizer42.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator28);
        org.junit.Assert.assertNotNull(doubleList43);
        org.junit.Assert.assertNotNull(realMatrixList44);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer2.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer2.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer2.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer2.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer2.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(doubleList4);
        org.junit.Assert.assertNotNull(doubleList5);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleList7);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = cMAESOptimizer1.getClass();
        org.junit.Assert.assertNotNull(realMatrixList2);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray9, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator17, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray9);
        org.apache.commons.math3.optimization.GoalType goalType21 = cMAESOptimizer20.getGoalType();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertNull(goalType21);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray6);
        double[] doubleArray21 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray21);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray21);
        org.apache.commons.math3.random.RandomGenerator randomGenerator29 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray21, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator29, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray6, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator29, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator40 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray6, 1, (double) (byte) 100, true, (int) '#', 30000, randomGenerator40, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType45 = cMAESOptimizer44.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList46 = cMAESOptimizer44.getStatisticsDHistory();
        int int47 = cMAESOptimizer44.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = cMAESOptimizer44.getLowerBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator29);
        org.junit.Assert.assertNull(goalType45);
        org.junit.Assert.assertNotNull(realMatrixList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray6);
        double[] doubleArray21 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray21);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray21);
        org.apache.commons.math3.random.RandomGenerator randomGenerator29 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray21, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator29, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray6, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator29, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray6);
        double[] doubleArray41 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator47 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray41, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator47, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray6, (int) '#', (double) 1L, true, (int) (byte) 1, (int) '#', randomGenerator47, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray6);
        double[] doubleArray66 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray66);
        org.apache.commons.math3.random.RandomGenerator randomGenerator73 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray66, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator73, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator81 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray66, 1, (double) '4', true, (int) (short) -1, 10, randomGenerator81, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray6, (int) (byte) 1, (double) (byte) 10, false, (int) (short) 10, 100, randomGenerator81, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList86 = cMAESOptimizer85.getStatisticsDHistory();
        int int87 = cMAESOptimizer85.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList88 = cMAESOptimizer85.getStatisticsMeanHistory();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray89 = cMAESOptimizer85.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator29);
        org.junit.Assert.assertNotNull(randomGenerator47);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator81);
        org.junit.Assert.assertNotNull(realMatrixList86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(realMatrixList88);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = goalType7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixList2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realMatrixList5);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(doubleList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realMatrixList7);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        double[] doubleArray25 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray25, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator33, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray10, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator33, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray10);
        double[] doubleArray45 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray45, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator51, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray10, (int) '#', (double) 1L, true, (int) (byte) 1, (int) '#', randomGenerator51, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator63 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray10, (int) (byte) 10, 10.0d, false, (int) (short) 0, (-1), randomGenerator63, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator33);
        org.junit.Assert.assertNotNull(randomGenerator51);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray10, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator18, false);
        double[] doubleArray32 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator38 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer41.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList43 = cMAESOptimizer41.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer41.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray32, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator38, true, pointValuePairConvergenceChecker44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray32, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator51, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray10, (int) '#', (double) (short) 100, true, (int) (byte) 0, (int) (short) -1, randomGenerator51, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList57 = cMAESOptimizer56.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList58 = cMAESOptimizer56.getStatisticsSigmaHistory();
        int int59 = cMAESOptimizer56.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList60 = cMAESOptimizer56.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker42);
        org.junit.Assert.assertNotNull(realMatrixList43);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(randomGenerator51);
        org.junit.Assert.assertNotNull(realMatrixList57);
        org.junit.Assert.assertNotNull(doubleList58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(realMatrixList60);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        org.junit.Assert.assertNotNull(doubleList2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realMatrixList5);
        org.junit.Assert.assertNotNull(realMatrixList6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        double[] doubleArray1 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray1, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator7, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer9.getConvergenceChecker();
        int int11 = cMAESOptimizer9.getMaxEvaluations();
        int int12 = cMAESOptimizer9.getMaxEvaluations();
        int int13 = cMAESOptimizer9.getMaxEvaluations();
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        double[] doubleArray25 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray25, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator33, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray9, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator33, false);
        double[] doubleArray51 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray51);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray51);
        double[] doubleArray67 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray67);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray67);
        org.apache.commons.math3.random.RandomGenerator randomGenerator75 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray67, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator75, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray51, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator75, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int83 = cMAESOptimizer82.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType84 = cMAESOptimizer82.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType85 = cMAESOptimizer82.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker86 = cMAESOptimizer82.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray9, 10, (double) (short) 0, false, 100, (int) ' ', randomGenerator75, false, pointValuePairConvergenceChecker86);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList88 = cMAESOptimizer87.getStatisticsMeanHistory();
        int int89 = cMAESOptimizer87.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator33);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator75);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNull(goalType84);
        org.junit.Assert.assertNull(goalType85);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker86);
        org.junit.Assert.assertNotNull(realMatrixList88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        int int6 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer1.getGoalType();
        org.junit.Assert.assertNotNull(realMatrixList2);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realMatrixList4);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realMatrixList7);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        double[] doubleArray7 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer16.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer16.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker19 = cMAESOptimizer16.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator13, true, pointValuePairConvergenceChecker19);
        double[] doubleArray32 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator38 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer41.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList43 = cMAESOptimizer41.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer41.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray32, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator38, true, pointValuePairConvergenceChecker44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray32, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator51, true);
        double[] doubleArray57 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray57);
        org.apache.commons.math3.random.RandomGenerator randomGenerator64 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList69 = cMAESOptimizer67.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray57, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator64, true, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7, (int) (byte) 10, (-1.0d), false, (int) (byte) -1, (int) (short) 1, randomGenerator51, false, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        java.util.List<java.lang.Double> doubleList74 = cMAESOptimizer73.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList75 = cMAESOptimizer73.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList76 = cMAESOptimizer73.getStatisticsDHistory();
        java.lang.Class<?> wildcardClass77 = cMAESOptimizer73.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(realMatrixList18);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker42);
        org.junit.Assert.assertNotNull(realMatrixList43);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(randomGenerator51);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator64);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker68);
        org.junit.Assert.assertNotNull(realMatrixList69);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker70);
        org.junit.Assert.assertNotNull(doubleList74);
        org.junit.Assert.assertNotNull(doubleList75);
        org.junit.Assert.assertNotNull(realMatrixList76);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        double[] doubleArray35 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray35);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray35);
        org.apache.commons.math3.random.RandomGenerator randomGenerator43 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray35, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator43, false);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker47 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray19, (int) '#', (double) 100, true, (int) (short) 1, 0, randomGenerator43, false, pointValuePairConvergenceChecker47);
        double[] doubleArray51 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator57 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray51, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator57, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        int int61 = cMAESOptimizer59.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList62 = cMAESOptimizer59.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker63 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray4, (int) (short) -1, (double) 10, false, (int) 'a', (int) '#', randomGenerator43, false, pointValuePairConvergenceChecker63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        java.util.List<java.lang.Double> doubleList67 = cMAESOptimizer66.getStatisticsFitnessHistory();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray68 = cMAESOptimizer66.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator43);
        org.junit.Assert.assertNotNull(randomGenerator57);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(realMatrixList62);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker63);
        org.junit.Assert.assertNotNull(doubleList67);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray17);
        double[] doubleArray32 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray32);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray32);
        org.apache.commons.math3.random.RandomGenerator randomGenerator40 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray32, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator40, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray17, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator40, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair46 = cMAESOptimizer10.optimize((int) (short) -1, multivariateFunction12, goalType13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator40);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray10, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator17, false);
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList39 = cMAESOptimizer37.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker40 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray27, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator34, true, pointValuePairConvergenceChecker40);
        double[] doubleArray51 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray51);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray51);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray51);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker55 = cMAESOptimizer54.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10, 0, (double) 1.0f, true, 100, (int) (short) -1, randomGenerator34, false, pointValuePairConvergenceChecker55);
        double[] doubleArray68 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator74 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker78 = cMAESOptimizer77.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList79 = cMAESOptimizer77.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker80 = cMAESOptimizer77.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray68, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator74, true, pointValuePairConvergenceChecker80);
        org.apache.commons.math3.random.RandomGenerator randomGenerator87 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray68, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator87, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList93 = cMAESOptimizer92.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList94 = cMAESOptimizer92.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker95 = cMAESOptimizer92.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray10, (int) (byte) 10, (double) 0, true, (int) (short) 1, 10, randomGenerator87, true, pointValuePairConvergenceChecker95);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer97 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList98 = cMAESOptimizer97.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator34);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker38);
        org.junit.Assert.assertNotNull(realMatrixList39);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker40);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker55);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker78);
        org.junit.Assert.assertNotNull(realMatrixList79);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker80);
        org.junit.Assert.assertNotNull(randomGenerator87);
        org.junit.Assert.assertNotNull(doubleList93);
        org.junit.Assert.assertNotNull(realMatrixList94);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker95);
        org.junit.Assert.assertNotNull(realMatrixList98);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        double[] doubleArray11 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator18, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray33 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator39 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker43 = cMAESOptimizer42.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList44 = cMAESOptimizer42.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker45 = cMAESOptimizer42.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator39, true, pointValuePairConvergenceChecker45);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray11, 0, (double) 100.0f, true, 30000, (int) (byte) 0, randomGenerator26, true, pointValuePairConvergenceChecker45);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray11);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList51 = cMAESOptimizer50.getStatisticsDHistory();
        int int52 = cMAESOptimizer50.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator26);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker43);
        org.junit.Assert.assertNotNull(realMatrixList44);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker45);
        org.junit.Assert.assertNotNull(realMatrixList51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        double[] doubleArray1 = null;
        double[] doubleArray15 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray15);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray15, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator23, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray1, (int) (short) 100, (double) (-1.0f), false, (int) (short) 0, 1, randomGenerator23, true);
        int int28 = cMAESOptimizer27.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        double[] doubleArray26 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray26, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator34, false);
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray39);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker41 = cMAESOptimizer40.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray10, (int) (byte) 10, (double) 10, false, (-1), (int) (byte) 10, randomGenerator34, true, pointValuePairConvergenceChecker41);
        double[] doubleArray49 = null;
        double[] doubleArray56 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator62 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray56, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator62, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray49, (int) (byte) -1, (double) (-1), false, (int) ' ', (int) '#', randomGenerator62, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10, (int) (short) 10, (double) 0L, false, (int) (short) -1, (int) (byte) 0, randomGenerator62, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator34);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker41);
        org.junit.Assert.assertNotNull(randomGenerator62);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray5);
        org.apache.commons.math3.random.RandomGenerator randomGenerator39 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray5, 1, (double) (byte) 100, true, (int) '#', 30000, randomGenerator39, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray5);
        int int43 = cMAESOptimizer42.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList44 = cMAESOptimizer42.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList45 = cMAESOptimizer42.getStatisticsDHistory();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair46 = cMAESOptimizer42.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator28);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(realMatrixList44);
        org.junit.Assert.assertNotNull(realMatrixList45);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray9, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator16, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray9, 1, (double) '4', true, (int) (short) -1, 10, randomGenerator24, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray9);
        int int28 = cMAESOptimizer27.getMaxEvaluations();
        int int29 = cMAESOptimizer27.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList30 = cMAESOptimizer27.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList31 = cMAESOptimizer27.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList32 = cMAESOptimizer27.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(doubleList30);
        org.junit.Assert.assertNotNull(realMatrixList31);
        org.junit.Assert.assertNotNull(realMatrixList32);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(doubleList3);
        org.junit.Assert.assertNotNull(realMatrixList4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        double[] doubleArray11 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator19 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray11, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator19, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator29 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11, (int) (byte) 1, (double) (-1.0f), true, 0, (int) (short) 0, randomGenerator29, true);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator19);
        org.junit.Assert.assertNotNull(doubleList32);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray9);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray21);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray21);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray31);
        double[] doubleArray46 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray46);
        org.apache.commons.math3.random.RandomGenerator randomGenerator54 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray46, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator54, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray31, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator54, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray21, (int) (byte) 10, (double) (short) 100, false, (int) (short) 0, (int) (short) 10, randomGenerator54, false);
        double[] doubleArray69 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray69);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray69);
        java.util.List<java.lang.Double> doubleList72 = cMAESOptimizer71.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList73 = cMAESOptimizer71.getStatisticsMeanHistory();
        int int74 = cMAESOptimizer71.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList75 = cMAESOptimizer71.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList76 = cMAESOptimizer71.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList77 = cMAESOptimizer71.getStatisticsFitnessHistory();
        int int78 = cMAESOptimizer71.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker79 = cMAESOptimizer71.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray9, (int) (short) 10, (double) (byte) 1, false, 1, (int) (short) 10, randomGenerator54, false, pointValuePairConvergenceChecker79);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator54);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList72);
        org.junit.Assert.assertNotNull(realMatrixList73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(doubleList75);
        org.junit.Assert.assertNotNull(realMatrixList76);
        org.junit.Assert.assertNotNull(doubleList77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker79);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.junit.Assert.assertNotNull(realMatrixList2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        double[] doubleArray11 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker21 = cMAESOptimizer20.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList22 = cMAESOptimizer20.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker23 = cMAESOptimizer20.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator17, true, pointValuePairConvergenceChecker23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray11);
        double[] doubleArray39 = new double[] { ' ', 0.0f };
        double[] doubleArray46 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator52 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray46, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator52, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray39, (int) (short) 100, (double) 1L, true, (int) (byte) 100, (int) (byte) 1, randomGenerator52, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray39);
        double[] doubleArray64 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator70 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType74 = cMAESOptimizer73.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker75 = cMAESOptimizer73.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray64, (int) (short) -1, (double) 0L, false, (int) (short) 100, (int) (byte) 100, randomGenerator70, true, pointValuePairConvergenceChecker75);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray39, (int) (short) 1, (double) ' ', false, (int) (short) 100, (int) (byte) 0, randomGenerator70, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11, (int) (short) 10, (double) 0, false, (int) '4', (int) (byte) 1, randomGenerator70, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker21);
        org.junit.Assert.assertNotNull(realMatrixList22);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker23);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator52);
        org.junit.Assert.assertNotNull(randomGenerator70);
        org.junit.Assert.assertNull(goalType74);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker75);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray7, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator14, false);
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer16.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer16.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer16.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList20 = cMAESOptimizer16.getStatisticsDHistory();
        int int21 = cMAESOptimizer16.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(realMatrixList19);
        org.junit.Assert.assertNotNull(realMatrixList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker30 = cMAESOptimizer29.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList31 = cMAESOptimizer29.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker32 = cMAESOptimizer29.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray19, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator26, true, pointValuePairConvergenceChecker32);
        double[] doubleArray36 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray36);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9, (int) '#', (double) 1.0f, false, (int) (short) 0, (-1), randomGenerator26, false, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray9);
        java.util.List<java.lang.Double> doubleList41 = cMAESOptimizer40.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator26);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker30);
        org.junit.Assert.assertNotNull(realMatrixList31);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker32);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker38);
        org.junit.Assert.assertNotNull(doubleList41);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer0.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer0.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = cMAESOptimizer0.getClass();
        org.junit.Assert.assertNotNull(realMatrixList1);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(doubleList4);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getEvaluations();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsFitnessHistory();
        java.lang.Class<?> wildcardClass35 = cMAESOptimizer31.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator26);
        org.junit.Assert.assertNotNull(doubleList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(doubleList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray40, (int) '#', (double) '#', false, (int) (short) -1, (int) (byte) -1, randomGenerator46, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList52 = cMAESOptimizer51.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker53 = cMAESOptimizer51.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5, (int) (short) -1, (double) 100L, true, (int) '#', 1, randomGenerator46, true, pointValuePairConvergenceChecker53);
        org.apache.commons.math3.random.RandomGenerator randomGenerator60 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5, (int) (short) 100, (double) 10, false, 100, 30000, randomGenerator60, false);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker63 = cMAESOptimizer62.getConvergenceChecker();
        int int64 = cMAESOptimizer62.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator28);
        org.junit.Assert.assertNotNull(randomGenerator46);
        org.junit.Assert.assertNotNull(realMatrixList52);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker53);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray10, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator17, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray10);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray31);
        double[] doubleArray46 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray46);
        org.apache.commons.math3.random.RandomGenerator randomGenerator54 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray46, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator54, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray31, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator54, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray31);
        double[] doubleArray66 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator72 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray66, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator72, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray31, (int) '#', (double) 1L, true, (int) (byte) 1, (int) '#', randomGenerator72, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10, (int) (byte) -1, (double) 10L, true, (int) 'a', 0, randomGenerator72, false);
        java.util.List<java.lang.Double> doubleList79 = cMAESOptimizer78.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator54);
        org.junit.Assert.assertNotNull(randomGenerator72);
        org.junit.Assert.assertNotNull(doubleList79);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray7);
        double[] doubleArray22 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray22);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray22);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray22, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        double[] doubleArray49 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray49);
        org.apache.commons.math3.random.RandomGenerator randomGenerator56 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray49, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator56, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator64 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray49, 1, (double) '4', true, (int) (short) -1, 10, randomGenerator64, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray7, 1, (double) (byte) -1, true, (int) (byte) 100, (int) (short) -1, randomGenerator64, true);
        org.apache.commons.math3.random.RandomGenerator randomGenerator74 = null;
        double[] doubleArray77 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator83 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77, (int) '#', (double) '#', false, (int) (short) -1, (int) (byte) -1, randomGenerator83, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker86 = cMAESOptimizer85.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray7, (int) (byte) 1, (double) 100L, false, (int) (byte) 10, (int) (short) 10, randomGenerator74, true, pointValuePairConvergenceChecker86);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator94 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray7, 30000, 0.0d, false, (int) (byte) 10, (int) ' ', randomGenerator94, true);
        java.util.List<java.lang.Double> doubleList97 = cMAESOptimizer96.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList98 = cMAESOptimizer96.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator30);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator64);
        org.junit.Assert.assertNotNull(randomGenerator83);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker86);
        org.junit.Assert.assertNotNull(doubleList97);
        org.junit.Assert.assertNotNull(doubleList98);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        double[] doubleArray12 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray12);
        double[] doubleArray28 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList39 = cMAESOptimizer37.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker40 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator34, true, pointValuePairConvergenceChecker40);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray28);
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray51);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray51);
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray61);
        double[] doubleArray76 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.random.RandomGenerator randomGenerator84 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray76, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator84, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray61, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator84, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray51, (int) (byte) 10, (double) (short) 100, false, (int) (short) 0, (int) (short) 10, randomGenerator84, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray28, (int) (short) 1, (double) 'a', false, 0, 30000, randomGenerator84, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray12, (int) (short) 1, (double) 100L, true, 30000, (int) ' ', randomGenerator84, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer97 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker38);
        org.junit.Assert.assertNotNull(realMatrixList39);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker40);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator84);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer11.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer11.getGoalType();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer11.getStatisticsFitnessHistory();
        java.lang.Class<?> wildcardClass15 = cMAESOptimizer11.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList12);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        double[] doubleArray24 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator41 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker45 = cMAESOptimizer44.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList46 = cMAESOptimizer44.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker47 = cMAESOptimizer44.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray34, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator41, true, pointValuePairConvergenceChecker47);
        double[] doubleArray51 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray51);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker53 = cMAESOptimizer52.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray24, (int) '#', (double) 1.0f, false, (int) (short) 0, (-1), randomGenerator41, false, pointValuePairConvergenceChecker53);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray8, (int) (byte) 100, (-1.0d), true, 30000, (int) (byte) 0, randomGenerator41, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList57 = cMAESOptimizer56.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList58 = cMAESOptimizer56.getStatisticsDHistory();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray59 = cMAESOptimizer56.getUpperBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator41);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker45);
        org.junit.Assert.assertNotNull(realMatrixList46);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker47);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker53);
        org.junit.Assert.assertNotNull(realMatrixList57);
        org.junit.Assert.assertNotNull(realMatrixList58);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(realMatrixList4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        double[] doubleArray5 = new double[] { ' ', 0.0f };
        double[] doubleArray12 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray12, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator18, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray5, (int) (short) 100, (double) 1L, true, (int) (byte) 100, (int) (byte) 1, randomGenerator18, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray5);
        double[] doubleArray30 = null;
        double[] doubleArray37 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator43 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray37, (int) '#', (double) '#', false, (int) (short) -1, (int) (byte) -1, randomGenerator43, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray30, 30000, (double) 1L, true, 30000, (int) (short) 0, randomGenerator43, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5, (int) (short) 10, (double) 0.0f, false, (int) (byte) -1, 10, randomGenerator43, false);
        int int50 = cMAESOptimizer49.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker51 = cMAESOptimizer49.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertNotNull(randomGenerator43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker51);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray39);
        org.apache.commons.math3.random.RandomGenerator randomGenerator46 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker50 = cMAESOptimizer49.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList51 = cMAESOptimizer49.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker52 = cMAESOptimizer49.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray39, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator46, true, pointValuePairConvergenceChecker52);
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray61);
        double[] doubleArray76 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.random.RandomGenerator randomGenerator84 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray76, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator84, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray61, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator84, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray39, (int) (byte) 0, (double) 1L, true, (int) (byte) 100, (int) '#', randomGenerator84, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList94 = cMAESOptimizer93.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType95 = cMAESOptimizer93.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker96 = cMAESOptimizer93.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer97 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray3, (int) (byte) 100, 0.0d, false, 30000, (int) (short) 100, randomGenerator84, false, pointValuePairConvergenceChecker96);
        int int98 = cMAESOptimizer97.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator26);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator46);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker50);
        org.junit.Assert.assertNotNull(realMatrixList51);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker52);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator84);
        org.junit.Assert.assertNotNull(realMatrixList94);
        org.junit.Assert.assertNull(goalType95);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker96);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer2.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer2.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList3);
        org.junit.Assert.assertNotNull(realMatrixList4);
        org.junit.Assert.assertNotNull(realMatrixList5);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray10, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator18, false);
        double[] doubleArray32 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator38 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer41.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList43 = cMAESOptimizer41.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer41.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray32, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator38, true, pointValuePairConvergenceChecker44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray32, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator51, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray10, (int) '#', (double) (short) 100, true, (int) (byte) 0, (int) (short) -1, randomGenerator51, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray57 = cMAESOptimizer56.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker42);
        org.junit.Assert.assertNotNull(realMatrixList43);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(randomGenerator51);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        double[] doubleArray4 = new double[] { ' ', 0.0f };
        double[] doubleArray11 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray11, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator17, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray4, (int) (short) 100, (double) 1L, true, (int) (byte) 100, (int) (byte) 1, randomGenerator17, true);
        double[] doubleArray35 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray35);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray35);
        double[] doubleArray51 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray51);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray51);
        org.apache.commons.math3.random.RandomGenerator randomGenerator59 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray51, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator59, false);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker63 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray35, (int) '#', (double) 100, true, (int) (short) 1, 0, randomGenerator59, false, pointValuePairConvergenceChecker63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray4, 10, (double) ' ', true, 30000, (int) (byte) 100, randomGenerator59, false);
        int int67 = cMAESOptimizer66.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer66.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator59);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker68);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double[] doubleArray3 = new double[] { ' ', 0.0f };
        double[] doubleArray10 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator16, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray3, (int) (short) 100, (double) 1L, true, (int) (byte) 100, (int) (byte) 1, randomGenerator16, true);
        int int21 = cMAESOptimizer20.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList22 = cMAESOptimizer20.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType23 = cMAESOptimizer20.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType24 = cMAESOptimizer20.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType25 = cMAESOptimizer20.getGoalType();
        int int26 = cMAESOptimizer20.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(doubleList22);
        org.junit.Assert.assertNull(goalType23);
        org.junit.Assert.assertNull(goalType24);
        org.junit.Assert.assertNull(goalType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int11 = cMAESOptimizer9.getMaxEvaluations();
        int int12 = cMAESOptimizer9.getMaxEvaluations();
        int int13 = cMAESOptimizer9.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray7);
        double[] doubleArray22 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray22);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray22);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray22, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator41 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray7, 1, (double) (byte) 100, true, (int) '#', 30000, randomGenerator41, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        double[] doubleArray52 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator58 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray52, (int) '#', (double) '#', false, (int) (short) -1, (int) (byte) -1, randomGenerator58, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray7, (int) (byte) 1, 1.0d, false, (int) '#', 0, randomGenerator58, false);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList63 = cMAESOptimizer62.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList64 = cMAESOptimizer62.getStatisticsMeanHistory();
        int int65 = cMAESOptimizer62.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator30);
        org.junit.Assert.assertNotNull(randomGenerator58);
        org.junit.Assert.assertNotNull(realMatrixList63);
        org.junit.Assert.assertNotNull(realMatrixList64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        double[] doubleArray23 = new double[] { ' ', 0.0f };
        double[] doubleArray30 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray30, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator36, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray23, (int) (short) 100, (double) 1L, true, (int) (byte) 100, (int) (byte) 1, randomGenerator36, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray23);
        double[] doubleArray48 = null;
        double[] doubleArray55 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator61 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray55, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator61, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray48, (int) (byte) -1, (double) (-1), false, (int) ' ', (int) '#', randomGenerator61, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker69 = cMAESOptimizer68.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray23, (int) (short) 1, (double) 10, false, 30000, (int) (short) -1, randomGenerator61, false, pointValuePairConvergenceChecker69);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9, (int) (byte) 100, (double) (-1), false, (int) (short) -1, (int) (byte) 100, randomGenerator61, false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator36);
        org.junit.Assert.assertNotNull(randomGenerator61);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker69);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        double[] doubleArray11 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator18, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray11, 1, (double) '4', true, (int) (short) -1, 10, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList40 = cMAESOptimizer39.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList41 = cMAESOptimizer39.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer39.getConvergenceChecker();
        int int43 = cMAESOptimizer39.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer39.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11, 0, (double) (short) -1, false, 0, (int) (short) 10, randomGenerator36, false, pointValuePairConvergenceChecker44);
        java.util.List<java.lang.Double> doubleList46 = cMAESOptimizer45.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator26);
        org.junit.Assert.assertNotNull(realMatrixList40);
        org.junit.Assert.assertNotNull(realMatrixList41);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(doubleList46);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray17);
        double[] doubleArray32 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray32);
        org.apache.commons.math3.random.RandomGenerator randomGenerator39 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray32, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator39, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator47 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray54 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator60 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker64 = cMAESOptimizer63.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList65 = cMAESOptimizer63.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer63.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator60, true, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray32, 0, (double) 100.0f, true, 30000, (int) (byte) 0, randomGenerator47, true, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList72 = cMAESOptimizer71.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker73 = cMAESOptimizer71.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray17, (int) (short) 10, 10.0d, true, (int) (short) 1, (int) (byte) 0, randomGenerator47, true, pointValuePairConvergenceChecker73);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray17);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair77 = cMAESOptimizer1.optimize((int) ' ', multivariateFunction11, goalType12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator47);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker64);
        org.junit.Assert.assertNotNull(realMatrixList65);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker66);
        org.junit.Assert.assertNotNull(realMatrixList72);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker73);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        double[] doubleArray25 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray25, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator32, false);
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker53 = cMAESOptimizer52.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList54 = cMAESOptimizer52.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker55 = cMAESOptimizer52.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray42, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator49, true, pointValuePairConvergenceChecker55);
        double[] doubleArray66 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray66);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer69.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray25, 0, (double) 1.0f, true, 100, (int) (short) -1, randomGenerator49, false, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray9, 0, (double) 1L, false, 10, (int) ' ', randomGenerator49, true);
        org.apache.commons.math3.random.RandomGenerator randomGenerator79 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray9, (int) (short) 0, (double) 1L, true, 0, (int) (byte) 100, randomGenerator79, false);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker82 = cMAESOptimizer81.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator49);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker53);
        org.junit.Assert.assertNotNull(realMatrixList54);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker55);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker70);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker82);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray13);
        double[] doubleArray28 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray28, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator36, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray13, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator36, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray3, (int) (byte) 10, (double) (short) 100, false, (int) (short) 0, (int) (short) 10, randomGenerator36, false);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList43 = cMAESOptimizer42.getStatisticsDHistory();
        int int44 = cMAESOptimizer42.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator36);
        org.junit.Assert.assertNotNull(realMatrixList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.lang.Class<?> wildcardClass13 = doubleList12.getClass();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(realMatrixList8);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray6);
        double[] doubleArray21 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray21);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray21);
        org.apache.commons.math3.random.RandomGenerator randomGenerator29 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray21, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator29, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray6, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator29, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray6);
        double[] doubleArray41 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator47 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray41, 10, (double) 1, true, (int) (byte) 100, (int) (short) 1, randomGenerator47, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray6, (int) '#', (double) 1L, true, (int) (byte) 1, (int) '#', randomGenerator47, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray6);
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction55 = null;
        org.apache.commons.math3.optimization.GoalType goalType56 = null;
        double[] doubleArray64 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator70 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer73.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList75 = cMAESOptimizer73.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker76 = cMAESOptimizer73.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray64, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator70, true, pointValuePairConvergenceChecker76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray64);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair80 = cMAESOptimizer53.optimize((int) ' ', multivariateFunction55, goalType56, doubleArray64);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator29);
        org.junit.Assert.assertNotNull(randomGenerator47);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker74);
        org.junit.Assert.assertNotNull(realMatrixList75);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker76);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        double[] doubleArray6 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer15.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer15.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer15.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator12, true, pointValuePairConvergenceChecker18);
        double[] doubleArray31 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator37 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker41 = cMAESOptimizer40.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList42 = cMAESOptimizer40.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker43 = cMAESOptimizer40.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator37, true, pointValuePairConvergenceChecker43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator50 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray31, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator50, true);
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray56);
        org.apache.commons.math3.random.RandomGenerator randomGenerator63 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker67 = cMAESOptimizer66.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList68 = cMAESOptimizer66.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker69 = cMAESOptimizer66.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray56, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator63, true, pointValuePairConvergenceChecker69);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6, (int) (byte) 10, (-1.0d), false, (int) (byte) -1, (int) (short) 1, randomGenerator50, false, pointValuePairConvergenceChecker69);
        java.util.List<java.lang.Double> doubleList72 = cMAESOptimizer71.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList73 = cMAESOptimizer71.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer71.getConvergenceChecker();
        int int75 = cMAESOptimizer71.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker41);
        org.junit.Assert.assertNotNull(realMatrixList42);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker43);
        org.junit.Assert.assertNotNull(randomGenerator50);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator63);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker67);
        org.junit.Assert.assertNotNull(realMatrixList68);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker69);
        org.junit.Assert.assertNotNull(doubleList72);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray8, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator15, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray8, 1, (double) '4', true, (int) (short) -1, 10, randomGenerator23, false);
        java.util.List<java.lang.Double> doubleList26 = cMAESOptimizer25.getStatisticsFitnessHistory();
        int int27 = cMAESOptimizer25.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList28 = cMAESOptimizer25.getStatisticsSigmaHistory();
        int int29 = cMAESOptimizer25.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList30 = cMAESOptimizer25.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList31 = cMAESOptimizer25.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker32 = cMAESOptimizer25.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator23);
        org.junit.Assert.assertNotNull(doubleList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(doubleList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(doubleList30);
        org.junit.Assert.assertNotNull(doubleList31);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker32);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer16.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer16.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker19 = cMAESOptimizer16.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray6, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator13, true, pointValuePairConvergenceChecker19);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer38.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList40 = cMAESOptimizer38.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker41 = cMAESOptimizer38.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray28, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator35, true, pointValuePairConvergenceChecker41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray6, 100, (-1.0d), true, 1, (int) (byte) 10, randomGenerator35, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator52 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6, (int) '#', (double) 0, true, (int) (byte) 100, (int) (byte) -1, randomGenerator52, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair55 = cMAESOptimizer54.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator13);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(realMatrixList18);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator35);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker39);
        org.junit.Assert.assertNotNull(realMatrixList40);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker41);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        double[] doubleArray8 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer17.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer17.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker20 = cMAESOptimizer17.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator14, true, pointValuePairConvergenceChecker20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray8);
        double[] doubleArray37 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray37);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray37);
        org.apache.commons.math3.random.RandomGenerator randomGenerator45 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray37, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator45, false);
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray55);
        org.apache.commons.math3.random.RandomGenerator randomGenerator62 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer65.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList67 = cMAESOptimizer65.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray55, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator62, true, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray37, (int) (short) 0, (double) (byte) -1, false, (int) '4', (int) (byte) 1, randomGenerator62, true);
        double[] doubleArray78 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator84 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker88 = cMAESOptimizer87.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList89 = cMAESOptimizer87.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker90 = cMAESOptimizer87.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray78, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator84, true, pointValuePairConvergenceChecker90);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray8, 0, (double) (byte) 10, true, 0, 30000, randomGenerator62, true, pointValuePairConvergenceChecker90);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList94 = cMAESOptimizer93.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(realMatrixList19);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker20);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator45);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator62);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker66);
        org.junit.Assert.assertNotNull(realMatrixList67);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker68);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker88);
        org.junit.Assert.assertNotNull(realMatrixList89);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker90);
        org.junit.Assert.assertNotNull(realMatrixList94);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray7, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator14, false);
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer16.getStatisticsFitnessHistory();
        int int18 = cMAESOptimizer16.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer16.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList20 = cMAESOptimizer16.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList21 = cMAESOptimizer16.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList22 = cMAESOptimizer16.getStatisticsMeanHistory();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair23 = cMAESOptimizer16.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(realMatrixList19);
        org.junit.Assert.assertNotNull(realMatrixList20);
        org.junit.Assert.assertNotNull(doubleList21);
        org.junit.Assert.assertNotNull(realMatrixList22);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer1.getGoalType();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        org.apache.commons.math3.optimization.GoalType goalType23 = cMAESOptimizer18.getGoalType();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker15);
        org.junit.Assert.assertNotNull(realMatrixList16);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(realMatrixList19);
        org.junit.Assert.assertNull(goalType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(doubleList22);
        org.junit.Assert.assertNull(goalType23);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray9, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator16, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray9, 1, (double) '4', true, (int) (short) -1, 10, randomGenerator24, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray9);
        int int28 = cMAESOptimizer27.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList29 = cMAESOptimizer27.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType30 = cMAESOptimizer27.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList31 = cMAESOptimizer27.getStatisticsMeanHistory();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = cMAESOptimizer27.getUpperBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(realMatrixList29);
        org.junit.Assert.assertNull(goalType30);
        org.junit.Assert.assertNotNull(realMatrixList31);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        double[] doubleArray1 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray1);
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer2.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = cMAESOptimizer2.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray3);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList62 = cMAESOptimizer61.getStatisticsMeanHistory();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray63 = cMAESOptimizer61.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(realMatrixList62);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer0.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer0.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(realMatrixList1);
        org.junit.Assert.assertNotNull(doubleList2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realMatrixList5);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double[] doubleArray7 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer16.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer16.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker19 = cMAESOptimizer16.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator13, true, pointValuePairConvergenceChecker19);
        double[] doubleArray32 = new double[] { 0L, (byte) -1, (-1), 1 };
        org.apache.commons.math3.random.RandomGenerator randomGenerator38 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer41.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList43 = cMAESOptimizer41.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer41.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray32, (int) (short) -1, 1.0d, false, 100, (int) ' ', randomGenerator38, true, pointValuePairConvergenceChecker44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray32, (int) '4', (double) (byte) 100, false, (int) (byte) 0, (int) (byte) 100, randomGenerator51, true);
        double[] doubleArray57 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray57);
        org.apache.commons.math3.random.RandomGenerator randomGenerator64 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList69 = cMAESOptimizer67.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray57, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator64, true, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7, (int) (byte) 10, (-1.0d), false, (int) (byte) -1, (int) (short) 1, randomGenerator51, false, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer73.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType75 = cMAESOptimizer73.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray76 = cMAESOptimizer73.getUpperBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(realMatrixList18);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker42);
        org.junit.Assert.assertNotNull(realMatrixList43);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(randomGenerator51);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator64);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker68);
        org.junit.Assert.assertNotNull(realMatrixList69);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker70);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker74);
        org.junit.Assert.assertNull(goalType75);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        java.lang.Class<?> wildcardClass12 = cMAESOptimizer11.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer0.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(realMatrixList1);
        org.junit.Assert.assertNotNull(doubleList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realMatrixList4);
        org.junit.Assert.assertNotNull(doubleList5);
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer11.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer11.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer11.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer11.getGoalType();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer11.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer11.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType18 = cMAESOptimizer11.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType19 = cMAESOptimizer11.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType20 = cMAESOptimizer11.getGoalType();
        int int21 = cMAESOptimizer11.getMaxEvaluations();
        int int22 = cMAESOptimizer11.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNull(goalType18);
        org.junit.Assert.assertNull(goalType19);
        org.junit.Assert.assertNull(goalType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray5);
        double[] doubleArray47 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray47);
        org.apache.commons.math3.random.RandomGenerator randomGenerator54 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray47, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator54, false);
        double[] doubleArray70 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray70);
        org.apache.commons.math3.random.RandomGenerator randomGenerator77 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray70, 0, (double) (-1.0f), false, (int) (short) 10, (int) (short) -1, randomGenerator77, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator85 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray70, 1, (double) '4', true, (int) (short) -1, 10, randomGenerator85, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList91 = cMAESOptimizer90.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker92 = cMAESOptimizer90.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray47, (int) (byte) 0, (double) 30000, false, (int) (short) -1, (int) '#', randomGenerator85, false, pointValuePairConvergenceChecker92);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray5, (int) ' ', (double) (byte) 10, false, 30000, 0, randomGenerator85, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray5);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList97 = cMAESOptimizer96.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator28);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 32.0d, 35.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator85);
        org.junit.Assert.assertNotNull(doubleList91);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker92);
        org.junit.Assert.assertNotNull(realMatrixList97);
    }
}

