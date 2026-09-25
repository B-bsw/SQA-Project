package org.apache.commons.math.optimization.direct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (byte) 10, (double) 0.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) '#', (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (byte) 1, 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, 0.0d, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        double[] doubleArray10 = new double[] { '4', 'a', (-1L), (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer1.optimize(100, multivariateFunction4, goalType5, doubleArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 52.0d, 97.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (byte) 100, 0.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize(0, multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray16 = new double[] { 100.0d, 2, 100L };
        double[] doubleArray19 = new double[] { 0.0d, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer1.optimize((int) 'a', multivariateFunction9, goalType10, doubleArray12, doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 2.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', 0.0d, (double) 0L);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { (-1.0f) };
        double[] doubleArray10 = new double[] { 100 };
        double[] doubleArray17 = new double[] { 10.0f, 0L, 1.0d, 1, 0.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize(100, multivariateFunction5, goalType6, doubleArray8, doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (100)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 1.0d, 1.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1));
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        double[] doubleArray8 = new double[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer1.optimize((int) (byte) 10, multivariateFunction4, goalType5, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) 100L, (double) (short) 100);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (short) 0, (double) (byte) 100);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) '4', 1.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) '#', (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 0.0d, 0.0d);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (short) 10, (double) 1);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 10.0d };
        double[] doubleArray9 = null;
        double[] doubleArray11 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize(1, multivariateFunction5, goalType6, doubleArray8, doubleArray9, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: 10 is larger than the maximum (1)");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, 1.0d, (double) (short) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) 1, (double) 2);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = realPointValuePairConvergenceChecker5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (short) 100, (double) 10);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) 0, (double) (-1L));
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = realPointValuePairConvergenceChecker4.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray9 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize(2, multivariateFunction6, goalType7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0, (double) 0.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) '#', (double) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 10, (double) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray15 = new double[] { '#', (byte) 100, 0, (-1), 0L, 1.0d };
        double[] doubleArray20 = new double[] { 1L, 0.0f, (byte) 0, 1.0d };
        double[] doubleArray22 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize((int) (byte) 1, multivariateFunction7, goalType8, doubleArray15, doubleArray20, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 35.0d, 100.0d, 0.0d, (-1.0d), 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, 0.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 'a', (double) (byte) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize((int) (short) 10, multivariateFunction6, goalType7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (short) 1, (double) (byte) 10);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 0.0f, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 1.0f, (double) (byte) -1);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 2, (double) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (byte) -1, (double) 1L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (-1.0f), (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { (byte) 1, 10, 1, (byte) -1, 1 };
        double[] doubleArray19 = new double[] { ' ', 1L, 2, 1, 10L };
        double[] doubleArray25 = new double[] { 0, 1.0f, (-1), 100L, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair26 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction6, goalType7, doubleArray13, doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (32)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 32.0d, 1.0d, 2.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d, 1.0d, (-1.0d), 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 100.0f, (double) (byte) 1);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 'a', (double) (-1));
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (short) -1, (double) 10);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10L, (double) ' ');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 0.0d, 0.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = null;
        double[] doubleArray14 = new double[] { 1.0E-8d, 100L, 1L, (-1L), 2, (byte) 10 };
        double[] doubleArray17 = new double[] { (byte) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize((int) '4', multivariateFunction5, goalType6, doubleArray7, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0E-8d, 100.0d, 1.0d, (-1.0d), 2.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray11 = new double[] { (short) 100, (-1.0f), (short) 10 };
        double[] doubleArray13 = new double[] { 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer1.optimize((int) '#', multivariateFunction5, goalType6, doubleArray7, doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) '4', (double) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray11 = new double[] { (byte) -1 };
        double[] doubleArray14 = new double[] { (byte) 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize(2, multivariateFunction7, goalType8, doubleArray9, doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 0, (double) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray13 = new double[] { 0.0f, ' ', 100.0d, (short) 10 };
        double[] doubleArray18 = new double[] { 0.0f, (short) 10, 10L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction6, goalType7, doubleArray8, doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 32.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ');
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass10 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (-1), 1.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (-1.0f), (double) '4');
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 100L, (double) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = goalType7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray13 = new double[] { 100, (short) 10, 100.0d, (short) 1 };
        double[] doubleArray19 = new double[] { 0.0f, 1L, 'a', 10.0f, 1.0E-8d };
        double[] doubleArray21 = new double[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer1.optimize((int) (short) 10, multivariateFunction7, goalType8, doubleArray13, doubleArray19, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 10.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 1.0d, 97.0d, 10.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 10, (double) 1L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0, (double) 0.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker10 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker10);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) '#', 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray13 = new double[] { (short) 100, (short) 1 };
        double[] doubleArray18 = new double[] { ' ', (-1.0d), 100L, 2 };
        double[] doubleArray20 = new double[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer1.optimize((int) (byte) 0, multivariateFunction9, goalType10, doubleArray13, doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 32.0d, (-1.0d), 100.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 0.0f, (double) 0);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (byte) 0, 100.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (-1L), (double) 100L);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 0, (double) (short) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = goalType7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, 1.0E-8d, (double) (byte) 100);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.optimize(2, multivariateFunction5, goalType6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, 1.0d, (double) '#');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 0.0f, (double) (short) -1);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray17 = new double[] { (-1), 0.0f, 100.0f, (-1.0f), (short) 0 };
        double[] doubleArray21 = new double[] { (byte) 100, 0L, 10 };
        double[] doubleArray27 = new double[] { (-1L), ' ', 100L, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair28 = bOBYQAOptimizer1.optimize(10, multivariateFunction10, goalType11, doubleArray17, doubleArray21, doubleArray27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 0.0d, 100.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { (-1.0d), 32.0d, 100.0d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (byte) 0, (double) '4');
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (-1L), (double) 1L);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) ' ', (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray11 = new double[] { 100L, (short) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize(2, multivariateFunction6, goalType7, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1L), (double) (-1.0f));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = realPointValuePairConvergenceChecker5.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100, 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = goalType4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100.0f, (double) ' ');
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.optimize((int) '#', multivariateFunction5, goalType6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray17 = new double[] { 1.0d, (short) 10, 0.0d, 100.0d, 10.0d, (short) -1 };
        double[] doubleArray19 = new double[] { (-1L) };
        double[] doubleArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer3.optimize((-1), multivariateFunction9, goalType10, doubleArray17, doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 10.0d, 0.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (byte) -1, 0.0d);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 1L, (double) 0L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray15 = new double[] { (byte) 1, (-1L), 100L, (byte) 100 };
        double[] doubleArray17 = new double[] { 0L };
        double[] doubleArray22 = new double[] { '#', 'a', (-1), 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer1.optimize((int) (short) 0, multivariateFunction9, goalType10, doubleArray15, doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 35.0d, 97.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer1.optimize((int) (short) 0, multivariateFunction7, goalType8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray16 = new double[] { 'a', (-1), '#', (byte) 10, 'a', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) (byte) 1, multivariateFunction8, goalType9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 97.0d, (-1.0d), 35.0d, 10.0d, 97.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (short) 1, (double) 100.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 0.0d, (double) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) 10L, (double) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100L, (double) '#');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (-1L), (double) 100);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { '#', 100L, 2, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize(2, multivariateFunction6, goalType7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 35.0d, 100.0d, 2.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (-1.0f), (double) (short) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) 1L, (double) 0.0f);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 1, (double) '4');
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray11 = new double[] { (byte) -1, (byte) -1, 0, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction5, goalType6, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (short) 1, (-1.0d));
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { (short) 100, 10, 100L, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize((int) '4', multivariateFunction6, goalType7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 10, 100.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (-1.0d), (double) 10.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = realPointValuePairConvergenceChecker6.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (byte) 10, (double) 0.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 10.0f, (double) (byte) 100);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (-1.0f), (double) (short) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a');
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction3 = null;
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        double[] doubleArray10 = new double[] { 10L, 1.0d, 10.0d, ' ', 1L };
        double[] doubleArray17 = new double[] { 100, (short) 10, (byte) 1, 'a', 0L, (-1L) };
        double[] doubleArray21 = new double[] { 'a', 100, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer1.optimize((int) '4', multivariateFunction3, goalType4, doubleArray10, doubleArray17, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 10.0d, 1.0d, 97.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 97.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (byte) 100, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = realPointValuePairConvergenceChecker8.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray9 = new double[] { (byte) 10, 10 };
        double[] doubleArray14 = new double[] { 0.0f, (-1L), 0, 10L };
        double[] doubleArray16 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer1.optimize(0, multivariateFunction5, goalType6, doubleArray9, doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (short) 1, 1.0E-8d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) '4', (double) (byte) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (-1), 1.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 10, (double) 100.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 1L, (double) 10);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 1L, (double) 0L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 0.0f, (double) (byte) 0);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (short) 1, (double) 10.0f);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 100L, (double) (byte) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) '#', (double) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray12 = new double[] { (short) 10, 100, (byte) 0 };
        double[] doubleArray17 = new double[] { (byte) -1, 100.0f, 0.0d, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize(0, multivariateFunction6, goalType7, doubleArray8, doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 100.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (-1.0f), (double) (short) 1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        int int10 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 1, (double) '4');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (byte) -1, 1.0d);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 1.0E-8d, (double) (byte) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 100L, (double) 100.0f);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) '#', (double) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 0L, 10.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (byte) 10, (double) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray15 = new double[] { (-1.0f), 1, 10L, (byte) 10, 2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize((int) '#', multivariateFunction8, goalType9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d, 10.0d, 10.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) ' ', 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (byte) 100, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 1.0E-8d, 1.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray14 = new double[] { '4', (byte) 10, ' ', 0, '#' };
        double[] doubleArray19 = new double[] { (-1), (-1.0d), 10.0d, (short) 1 };
        double[] doubleArray23 = new double[] { (-1.0f), (byte) 1, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer3.optimize((int) '4', multivariateFunction7, goalType8, doubleArray14, doubleArray19, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 52.0d, 10.0d, 32.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), (-1.0d), 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 1, (double) '#');
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (short) 1, (double) 'a');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize((int) (byte) 0, multivariateFunction7, goalType8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        int int10 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType11 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 0, (double) 1L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray13 = new double[] { 10.0d, ' ', (short) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((int) '4', multivariateFunction7, goalType8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 32.0d, 1.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 10, (-1.0d));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) (short) 1, multivariateFunction9, goalType10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 0, (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, 0.0d, 10.0d);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        double[] doubleArray6 = new double[] {};
        double[] doubleArray12 = new double[] { 10.0f, 10L, '4', (-1), (-1.0f) };
        double[] doubleArray17 = new double[] { (short) -1, 10, 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer1.optimize((int) (short) -1, multivariateFunction4, goalType5, doubleArray6, doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 10.0d, 52.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 10.0d, 97.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, 1.0d, (double) '#');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) 1L, (double) (-1));
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray10 = new double[] { (byte) 1, (byte) 1, (short) 1 };
        double[] doubleArray16 = new double[] { (byte) 1, 1.0E-8d, (byte) 100, 10.0d, (short) -1 };
        double[] doubleArray23 = new double[] { 'a', 'a', (-1.0d), 10L, 1L, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer3.optimize((int) '#', multivariateFunction5, goalType6, doubleArray10, doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 1.0E-8d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 97.0d, 97.0d, (-1.0d), 10.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 1L, (double) 0L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 1, (double) (short) 10);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), 100.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) 10.0f, (double) 100);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1L), (double) 10.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize(10, multivariateFunction7, goalType8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (byte) 1, (double) (byte) 10);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 0, (double) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 0.0d, (double) '4');
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) ' ', 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray15 = new double[] { (short) 0, (-1L), 1.0E-8d, 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize((int) (short) 1, multivariateFunction9, goalType10, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, (-1.0d), 1.0E-8d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (byte) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 100, (double) (-1L));
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { 100L, (-1.0f), (-1), (short) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer1.optimize((int) (short) 10, multivariateFunction6, goalType7, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, (-1.0d), (-1.0d), 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) (byte) -1, (double) 1.0f);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) '#', (double) (short) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray11 = new double[] { (short) 10, 0L };
        double[] doubleArray12 = new double[] {};
        double[] doubleArray14 = new double[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize((int) (short) 0, multivariateFunction7, goalType8, doubleArray11, doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (byte) 0, (double) 'a');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (byte) 1);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray13 = new double[] { 100.0d, 1L, 100.0f, (-1.0f), 100.0f, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((int) (short) -1, multivariateFunction5, goalType6, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 1.0d, 100.0d, (-1.0d), 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, 10.0d, (double) (byte) 1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 1, (double) 0);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (short) 10, (double) 1.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (short) 1, (double) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (-1L), (double) '4');
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (byte) 10, (double) (short) 1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray15 = new double[] { 0, 1, (short) 100, (-1.0d), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize((int) (short) 10, multivariateFunction8, goalType9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 1.0d, 100.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray10 = new double[] { '4', 0 };
        double[] doubleArray11 = null;
        double[] doubleArray15 = new double[] { '4', (-1.0f), 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize(10, multivariateFunction6, goalType7, doubleArray10, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 52.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 52.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, 0.0d, (double) 0L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray14 = new double[] { (byte) 10, (byte) 1, (short) 100, 0.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer1.optimize((int) (byte) 0, multivariateFunction7, goalType8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 1.0d, 100.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 1.0E-8d, 10.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray11 = new double[] { 10.0f, 1.0E-8d, (short) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction5, goalType6, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 1.0E-8d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10L, (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 0.0f, (double) (-1L));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        double[] doubleArray19 = new double[] { ' ', (byte) -1, ' ', 100.0f, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer1.optimize((int) '#', multivariateFunction12, goalType13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 32.0d, (-1.0d), 32.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 0, (double) (short) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray10 = null;
        double[] doubleArray12 = new double[] { (-1L) };
        double[] doubleArray15 = new double[] { (short) 0, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize(0, multivariateFunction8, goalType9, doubleArray10, doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, 1.0E-8d, (double) '#');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100L, (double) 2);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 0.0d, (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 10.0f, 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = goalType5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 0.0f, (double) 2);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 10.0f, (double) (short) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 1.0d, (double) 0L);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { (-1.0d) };
        double[] doubleArray14 = new double[] { (short) 10, ' ', 1.0E-8d, (-1.0d), 100L };
        double[] doubleArray18 = new double[] { (-1), (byte) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer3.optimize((-1), multivariateFunction5, goalType6, doubleArray8, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 32.0d, 1.0E-8d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d), 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 10, (double) (byte) 100);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 1.0f, (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 'a', (double) (short) 0);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1));
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray15 = new double[] { (byte) 1, (short) 0, (short) 1, 0.0d, ' ', 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize(10, multivariateFunction7, goalType8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 0.0d, 1.0d, 0.0d, 32.0d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (short) 10, (double) 100L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 100L, (-1.0d));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1));
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (short) 100, (double) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray14 = new double[] { 1.0E-8d, (byte) 1, (-1.0f), (byte) -1, 10, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction6, goalType7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0E-8d, 1.0d, (-1.0d), (-1.0d), 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = realPointValuePairConvergenceChecker8.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 100, (double) 1.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray14 = new double[] { 0.0f, 100, (-1.0d), ' ', 1.0d, 0.0d };
        double[] doubleArray21 = new double[] { (-1), (short) 100, '#', (byte) -1, (-1.0f), '4' };
        double[] doubleArray25 = new double[] { 1.0d, 2, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair26 = bOBYQAOptimizer3.optimize(2, multivariateFunction6, goalType7, doubleArray14, doubleArray21, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (35)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 100.0d, (-1.0d), 32.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d), 100.0d, 35.0d, (-1.0d), (-1.0d), 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, 2.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker10 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker11 = bOBYQAOptimizer1.getConvergenceChecker();
        int int12 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType13 = bOBYQAOptimizer1.getGoalType();
        int int14 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray15 = new double[] { (byte) 0, 10, (short) -1, 1, (byte) -1, 100.0d };
        double[] doubleArray16 = new double[] {};
        double[] doubleArray22 = new double[] { (short) 0, 10.0d, 0L, 0.0d, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer1.optimize((int) ' ', multivariateFunction7, goalType8, doubleArray15, doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 10.0d, (-1.0d), 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 10.0d, 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, 0.0d, (double) 0L);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (double) ' ');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray11 = new double[] { (-1.0d), 1.0f, 10.0f };
        double[] doubleArray18 = new double[] { (short) -1, (byte) -1, 0L, 1, (-1), 1.0E-8d };
        double[] doubleArray22 = new double[] { 1, (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize(1, multivariateFunction6, goalType7, doubleArray11, doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d), (-1.0d), 0.0d, 1.0d, (-1.0d), 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0, (double) 0.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 1.0d };
        double[] doubleArray15 = new double[] { 1.0d, 100, 0L, '4', 1.0f, 1.0E-8d };
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) (byte) 0, multivariateFunction5, goalType6, doubleArray8, doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 100.0d, 0.0d, 52.0d, 1.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        int int9 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer3.getGoalType();
        int int11 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass12 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (short) -1, (double) 1);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray9 = new double[] { (short) 10, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize(1, multivariateFunction5, goalType6, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (short) 100, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray12 = new double[] { '4', 2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize((int) (short) 10, multivariateFunction8, goalType9, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 52.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (short) 10, (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray13 = new double[] { (short) 10, (-1), (short) 0, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction7, goalType8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        java.lang.Class<?> wildcardClass3 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (-1L), (double) (byte) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0L, (double) '4');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray12 = new double[] { 0.0d, (short) -1, (byte) 100 };
        double[] doubleArray18 = new double[] { 2, (-1.0f), (short) 0, (short) 1, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer1.optimize((int) (short) 100, multivariateFunction6, goalType7, doubleArray8, doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 2.0d, (-1.0d), 0.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = goalType7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) '4', 1.0E-8d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100.0f, (double) 2);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = goalType5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (byte) 10, 1.0E-8d);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0, (double) 0.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 10L, (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { (byte) -1, (byte) 100, ' ', (byte) 10, 1.0d };
        double[] doubleArray19 = new double[] { 100L, 100, '4', 100.0f, 1.0d };
        double[] doubleArray25 = new double[] { (-1L), 100.0f, '#', (-1), 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair26 = bOBYQAOptimizer3.optimize((int) (byte) 0, multivariateFunction6, goalType7, doubleArray13, doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (100)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 100.0d, 32.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d, 52.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), 100.0d, 35.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) ' ', (double) (byte) 0);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 'a', (double) (byte) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 100.0f, (double) 0.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray12 = new double[] { 1.0E-8d, 10L, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize((int) (byte) 1, multivariateFunction7, goalType8, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-8d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = goalType4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, 1.0E-8d, (-1.0d));
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 1L, (double) 0L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) 'a', (double) (byte) 10);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) '4', 1.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 0.0f, (double) 1L);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray11 = new double[] { '#', 1L, 0.0f, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) (byte) 0, multivariateFunction5, goalType6, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 35.0d, 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) ' ', (double) 10.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), 100.0d);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) 2, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (byte) -1, (double) 'a');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (-1L), (double) '4');
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 10, (-1.0d));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 1, (double) 2);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 10.0f, 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 1L, (double) 0L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) 2);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 2, (double) 'a');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (-1.0d), (double) 10.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = goalType5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0L, (double) '4');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray10 = new double[] { '4', 1L };
        double[] doubleArray16 = new double[] { (short) 1, 100.0f, 2, 1L, 100.0d };
        double[] doubleArray18 = new double[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction6, goalType7, doubleArray10, doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 52.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 100.0d, 2.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1), (double) 100.0f);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1L), (double) (-1.0f));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (-1.0d), (-1.0d));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', 100.0d, (double) 100.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray10 = new double[] { 1.0d, 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer3.optimize((int) (short) -1, multivariateFunction5, goalType6, doubleArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        double[] doubleArray17 = new double[] { 'a', 0.0f, (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer1.optimize((int) (byte) 1, multivariateFunction11, goalType12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 97.0d, 0.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 0, (double) (short) 100);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (short) 0, (double) 1L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray15 = new double[] { 0, (byte) -1, (byte) 100, 10L, 100.0f, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize(10, multivariateFunction7, goalType8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, (-1.0d), 100.0d, 10.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = realPointValuePairConvergenceChecker5.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) 100.0f, 0.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray13 = new double[] { 1, ' ', (-1), 100.0d, 10L, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((int) (byte) 1, multivariateFunction5, goalType6, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 32.0d, (-1.0d), 100.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', 0.0d, (double) (-1L));
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (short) 1, (double) 10L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (byte) 1, 1.0E-8d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) (short) 1, (double) (short) 10);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray13 = new double[] { (byte) -1, 0, (-1L), (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((int) (byte) 1, multivariateFunction5, goalType6, doubleArray7, doubleArray8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 0.0f, (double) 100);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', 0.0d, (double) (-1L));
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray16 = new double[] { 0, (-1.0d), 1, 1.0E-8d, (-1) };
        double[] doubleArray18 = new double[] { 0L };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize((int) ' ', multivariateFunction9, goalType10, doubleArray16, doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, (-1.0d), 1.0d, 1.0E-8d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 'a' };
        double[] doubleArray9 = null;
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer1.optimize((int) '#', multivariateFunction5, goalType6, doubleArray8, doubleArray9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) (short) 100, (double) 1.0f);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (short) 1, (double) (short) 0);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray11 = new double[] { '4', (-1), 100L, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize(2, multivariateFunction5, goalType6, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 52.0d, (-1.0d), 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) '#', (double) 2);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) '#', 100.0d);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        double[] doubleArray18 = new double[] { 1.0d, 1.0f, 100, 100L, 0 };
        double[] doubleArray23 = new double[] { 1.0E-8d, (short) 1, 0, 'a' };
        double[] doubleArray28 = new double[] { 10L, (short) 0, ' ', 2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair29 = bOBYQAOptimizer1.optimize((int) (short) 0, multivariateFunction11, goalType12, doubleArray18, doubleArray23, doubleArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, 1.0d, 100.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0E-8d, 1.0d, 0.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 0.0d, 32.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (-1.0f), (double) 0.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray14 = new double[] { (short) 10, (short) -1, 0.0f, '#', 100.0f, 10.0f };
        double[] doubleArray15 = new double[] {};
        double[] doubleArray22 = new double[] { (byte) 0, ' ', (byte) 1, (byte) 0, (short) 10, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer1.optimize((-1), multivariateFunction6, goalType7, doubleArray14, doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, (-1.0d), 0.0d, 35.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 32.0d, 1.0d, 0.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 'a', (double) (-1.0f));
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray16 = new double[] { 0.0d, 10, 0, 1.0E-8d, (byte) 10, (-1.0f) };
        double[] doubleArray18 = new double[] { (byte) 1 };
        double[] doubleArray23 = new double[] { (-1.0d), (short) 1, (short) -1, 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer1.optimize((int) (byte) 10, multivariateFunction8, goalType9, doubleArray16, doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, 10.0d, 0.0d, 1.0E-8d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, (-1.0d), 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 0.0d, (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 0L, (-1.0d));
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) 1, (double) 0L);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray14 = new double[] { 10, (short) -1, (short) 10, 0, 1L, 100.0f };
        double[] doubleArray16 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) '4', multivariateFunction5, goalType6, doubleArray7, doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, (-1.0d), 10.0d, 0.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 1L, (double) (byte) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = realPointValuePairConvergenceChecker8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray15 = new double[] { (byte) 0, '#', 0.0f };
        double[] doubleArray21 = new double[] { (-1.0d), (short) 10, (short) 0, 1.0d, 2 };
        double[] doubleArray23 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer1.optimize((int) (byte) 1, multivariateFunction10, goalType11, doubleArray15, doubleArray21, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d), 10.0d, 0.0d, 1.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 35.0d }, 1.0E-15);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray16 = new double[] { (-1), (short) 1, (byte) 100, 100, 2, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) '#', multivariateFunction8, goalType9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 1.0d, 100.0d, 100.0d, 2.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (short) 1, (double) 100.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, 1.0d, (double) (byte) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray11 = new double[] { 1.0f, 0.0d, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer1.optimize(0, multivariateFunction6, goalType7, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        int int9 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, 1.0E-8d, 0.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, 10.0d, (double) (byte) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        int int10 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType11 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        int int11 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType12 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType13 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) 10.0f, (double) (short) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (byte) 100, (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (-1.0d));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (short) 1, (double) 100.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray13 = new double[] { (short) 10, 1.0E-8d, 10L, (-1.0f), 10.0d, '#' };
        double[] doubleArray14 = null;
        double[] doubleArray19 = new double[] { 100L, 1, (byte) 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction5, goalType6, doubleArray13, doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 1.0E-8d, 10.0d, (-1.0d), 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 1.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) ' ', (double) 1L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, 1.0d, (double) (short) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 0L, 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 10.0f, 100.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1.0f), 10.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray12 = new double[] { ' ', 100, 0.0f };
        double[] doubleArray16 = new double[] { 1.0f, 0L, 1 };
        double[] doubleArray22 = new double[] { 0.0d, (-1.0d), (short) 100, '4', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize((-1), multivariateFunction7, goalType8, doubleArray12, doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (1)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 32.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-1.0d), 100.0d, 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ');
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray10 = null;
        double[] doubleArray15 = new double[] { (-1.0d), 10, (short) 0, (-1.0f) };
        double[] doubleArray19 = new double[] { 1, 1.0E-8d, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer1.optimize((int) (short) -1, multivariateFunction8, goalType9, doubleArray10, doubleArray15, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, 1.0E-8d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (-1), (double) (-1));
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { 10, (short) 1 };
        double[] doubleArray17 = new double[] { (byte) -1, 1.0f, (byte) 100, (-1.0d), 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize((int) (byte) 0, multivariateFunction6, goalType7, doubleArray8, doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 1.0d, 100.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1), (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray13 = new double[] { (short) -1, 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((-1), multivariateFunction8, goalType9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (byte) 10, (double) (byte) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 1, (double) '4');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        int int9 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) 1L, (double) (-1));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray12 = new double[] { (-1.0d), (byte) 0, (short) 10 };
        double[] doubleArray18 = new double[] { (short) 1, 1L, 1.0E-8d, (byte) 100, (short) 0 };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer1.optimize((int) (byte) -1, multivariateFunction7, goalType8, doubleArray12, doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, 1.0d, 1.0E-8d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (-1), (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray15 = new double[] { (-1), 1.0d, '4', 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize((int) (byte) 1, multivariateFunction8, goalType9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d, 52.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 2, (double) 10.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { (short) 100, (-1.0f), (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize((int) (short) 10, multivariateFunction6, goalType7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, (-1.0d), 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray12 = new double[] {};
        double[] doubleArray15 = new double[] { (byte) 1, 100L };
        double[] doubleArray18 = new double[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer1.optimize(1, multivariateFunction10, goalType11, doubleArray12, doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 10.0d, (double) 1L);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray11 = new double[] { 10.0d, 10L, 'a', 10.0d };
        double[] doubleArray12 = new double[] {};
        double[] doubleArray17 = new double[] { '4', 1.0E-8d, (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize((int) (short) 0, multivariateFunction5, goalType6, doubleArray11, doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 10.0d, 97.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 52.0d, 1.0E-8d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 1, 10.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray13 = new double[] { (short) 1, 100, (short) -1, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction7, goalType8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 100.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray11 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction8, goalType9, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (byte) 10, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer1.optimize((int) '#', multivariateFunction8, goalType9, doubleArray10, doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (short) 1, (double) (-1.0f));
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize((int) (short) -1, multivariateFunction7, goalType8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) '4', 1.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray11 = new double[] { (-1), 0.0d, 10L };
        double[] doubleArray12 = new double[] {};
        double[] doubleArray18 = new double[] { (short) 0, (byte) 100, (short) 100, 1.0d, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer3.optimize((int) (byte) 1, multivariateFunction6, goalType7, doubleArray11, doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 100.0d, 100.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) '#', 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, 1.0E-8d, (double) (-1));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, 0.0d, (double) 0L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray13 = new double[] { 1.0E-8d, (short) 10, 1L };
        double[] doubleArray17 = new double[] { (-1.0d), (short) 1, (-1.0f) };
        double[] doubleArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer1.optimize(0, multivariateFunction8, goalType9, doubleArray13, doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0E-8d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (short) 1, (double) (short) 1);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray9 = new double[] { 0.0d, (short) -1 };
        double[] doubleArray15 = new double[] { (short) 1, (short) -1, (short) 1, (short) 0, 10.0d };
        double[] doubleArray18 = new double[] { 0.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer3.optimize((int) '4', multivariateFunction5, goalType6, doubleArray9, doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', 10.0d, (double) (short) 100);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray9 = new double[] { (short) -1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize(0, multivariateFunction5, goalType6, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { 10, (short) 100 };
        double[] doubleArray16 = new double[] { (-1.0f), (short) 0, (short) 10, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer1.optimize((int) (byte) -1, multivariateFunction6, goalType7, doubleArray8, doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 0.0d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 100.0f, (double) 10L);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (byte) -1, 100.0d);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { 0.0d, (byte) 0, 'a', (byte) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((int) '#', multivariateFunction6, goalType7, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 0.0d, 97.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (byte) 10);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) '4', (double) (-1.0f));
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer1.optimize((int) (byte) 100, multivariateFunction8, goalType9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (short) 1, (double) 100.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 100L, (double) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray14 = new double[] { 0.0d, (byte) 10, '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize(0, multivariateFunction8, goalType9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 10.0d, 35.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 1.0E-8d, (double) (byte) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (-1L), (double) (byte) 10);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray10 = new double[] { (short) -1, 1L, (byte) -1 };
        double[] doubleArray15 = new double[] { (short) -1, (-1.0f), ' ', ' ' };
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) ' ', multivariateFunction5, goalType6, doubleArray10, doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), (-1.0d), 32.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 0.0f, (double) 100);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 'a', (double) 1L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', 1.0d, (double) (short) 0);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) (-1), 10.0d);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 0.0d, 0.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray12 = new double[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize(0, multivariateFunction9, goalType10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray14 = new double[] { 1.0f, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer1.optimize((int) (byte) 10, multivariateFunction10, goalType11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) '4', (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', 1.0E-8d, (double) 2);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 1, (double) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray17 = new double[] { (byte) 1, 0.0f, 0.0f, '4', 0.0f, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize((int) '#', multivariateFunction9, goalType10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 0.0d, 0.0d, 52.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 10.0f, (double) (byte) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 1.0d, (double) 2);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) '#', (double) (byte) -1);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray16 = new double[] { (-1L), (byte) 10, (short) 10, (short) 10, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer1.optimize((int) (byte) -1, multivariateFunction9, goalType10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 10.0d, 10.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (short) 100, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 100L, (double) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction8, goalType9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1));
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer1.optimize((int) (byte) 0, multivariateFunction6, goalType7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) ' ', (double) (byte) 1);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 10, (-1.0d));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', 100.0d, (double) 10.0f);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 1, (double) ' ');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 1L, (double) (byte) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray10 = new double[] { 2, 100.0f };
        double[] doubleArray17 = new double[] { (-1L), (-1.0d), (byte) 1, 0.0f, (short) 1, (short) 0 };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer1.optimize(0, multivariateFunction6, goalType7, doubleArray10, doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 2.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), (-1.0d), 1.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1L, (double) 1L);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray13 = new double[] { 0L, 10.0f, 10, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction7, goalType8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (byte) 1, 0.0d);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray13 = new double[] { 2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer1.optimize(0, multivariateFunction10, goalType11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d }, 1.0E-15);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (byte) 100, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (-1.0d));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray10 = new double[] {};
        double[] doubleArray13 = new double[] { (short) 1, (byte) 1 };
        double[] doubleArray18 = new double[] { 0, (short) 0, (short) 0, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer3.optimize(100, multivariateFunction8, goalType9, doubleArray10, doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }
}

